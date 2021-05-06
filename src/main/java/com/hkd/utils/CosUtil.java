package com.hkd.utils;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.exception.CosClientException;
import com.qcloud.cos.exception.CosServiceException;
import com.qcloud.cos.http.HttpMethodName;
import com.qcloud.cos.http.HttpProtocol;
import com.qcloud.cos.model.*;
import com.qcloud.cos.region.Region;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.List;

public class CosUtil {
    // 1 初始化用户身份信息（secretId, secretKey）。
    private final String secretId = "AKIDPindNryj7ICsRBpw750hARQAtrbvLvb0";
    private final String secretKey = "Qh15i6D5h4DTV2LOCk35B0uYxIMCnBKw";
    //存储桶名称，格式：BucketName-APPID
    private final String bucketName = "apff-1301701929";
    //单例模式
    private static CosUtil INSTANCE =new CosUtil();

    public final COSClient cosClient;

    private CosUtil(){
        COSCredentials cred = new BasicCOSCredentials(secretId, secretKey);
        // 2 设置 bucket 的地域, COS 地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
        // clientConfig 中包含了设置 region, https(默认 http), 超时, 代理等 set 方法, 使用可参见源码或者常见问题 Java SDK 部分。
        Region region = new Region("ap-shanghai");
        ClientConfig clientConfig = new ClientConfig(region);
        // 设置最大重试次数为 4 次默认值为 3，可以通过 clientConfig.setMaxErrorRetry() 进行设置，
        //如果设置为 0，则所有类型的错误请求都不进行重试。
        //重试的错误类型：客户端异常中所有的报 IOException 的错误。服务端异常中状态码为 500, 502, 503 504 的错误。
        //clientConfig.setMaxErrorRetry(4);
        // 这里建议设置使用 https 协议
        clientConfig.setHttpProtocol(HttpProtocol.https);
        // 3 生成 cos 客户端。
        cosClient = new COSClient(cred, clientConfig);
    }

    /**
     * 获取单例对象
     * @return
     */
    public static CosUtil getInstance(){
        return INSTANCE;
    }

    /**
     * 上传对象
     * 将本地文件或者已知长度的输入流内容上传到 COS，适用于20M以下图片类小文件上传，最大支持上传不超过5GB文件。5GB以上的文件必须使用分块上传或高级 API 接口上传。
     * 若本地文件大部分在20M以上，建议您参考使用高级 API 接口进行上传。
     * 若 COS 上已存在同样 Key 的对象，上传时则会覆盖旧的对象。
     * 若要创建目录对象，请参见 SDK 如何创建目录。
     * 对象键（Key）是对象在存储桶中的唯一标识。例如，在对象的访问域名 examplebucket-1250000000.cos.ap-guangzhou.myqcloud.com/images/picture.jpg 中，对象键为 images/picture.jpg，详情请参见 对象键 的说明。
     * @param key 指定文件上传到 COS 上的路径，即对象键。例如对象键为folder/picture.jpg，则表示将文件 picture.jpg 上传到 folder 路径下
     * @param localFile 指定要上传的文件
     * @return
     */
    public String put(String key, File localFile) {
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, localFile);
        // 设置存储类型, 默认是标准(Standard), 低频(standard_ia),一般为标准的
        //putObjectRequest.setStorageClass(StorageClass.Standard);
        PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
        // putobjectResult会返回文件的etag
        String etag = putObjectResult.getETag();
        cosClient.shutdown();// 关闭客户端(关闭后台线程)
        return etag;
    }

    /**
     * 下载对象
     * @param key
     * @return
     */
    public String get(String key) {
        String outputFilePath = "下载路径";
        File downFile = new File(outputFilePath);
        GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, key);
        ObjectMetadata downObjectMeta = cosClient.getObject(getObjectRequest, downFile);
        cosClient.shutdown();
        String etag=downObjectMeta.getETag();
        return etag;
    }

    /**
     * 删除对象
     * @param key
     */
    public void delete(String key){
        cosClient.deleteObject(bucketName, key);
        cosClient.shutdown();
    }

    /**
     * 获取对象URL
     * @param key
     * @return
     */
    public URL getURL(String key){
        GeneratePresignedUrlRequest req =new GeneratePresignedUrlRequest(bucketName, key, HttpMethodName.GET);
        // 设置签名过期时间(可选), 若未进行设置, 则默认使用 ClientConfig 中的签名过期时间(1小时)
        // 这里设置签名在半个小时后过期
        Date expirationDate = new Date(System.currentTimeMillis() + 30L * 60L * 1000L);
        req.setExpiration(expirationDate);
        URL url = cosClient.generatePresignedUrl(req);
        //System.out.println(url.toString());
        cosClient.shutdown();
        return url;
    }
    /**
     * 获取带权限的下载链接
     */
    public URL getSourceUrl(String key) {
        GeneratePresignedUrlRequest req =
                new GeneratePresignedUrlRequest(bucketName, key, HttpMethodName.GET);
        // 设置签名过期时间(可选), 若未进行设置, 则默认使用 ClientConfig 中的签名过期时间(1小时)
        // 这里设置签名在半个小时后过期
        Date expirationDate = new Date(System.currentTimeMillis() + 30L * 60L * 1000L);
        req.setExpiration(expirationDate);
        return cosClient.generatePresignedUrl(req);
    }
    /**
     * 删除已上传的资源
     */
    public void deleteSource(String key) {
        cosClient.deleteObject(bucketName, key);
    }

    /**
     * 创建桶(删除桶、判断桶是否存在、查看桶文件、查询一个桶所在的地区)
     * @return
     */
    public Bucket createBucket(){
        String bucket = "examplebucket-1250000000"; //存储桶名称，格式：BucketName-APPID
        CreateBucketRequest createBucketRequest = new CreateBucketRequest(bucket);
        // 设置 bucket 的权限为 Private(私有读写)、其他可选有 PublicRead（公有读私有写）、PublicReadWrite（公有读写）
        createBucketRequest.setCannedAcl(CannedAccessControlList.Private);
        try{
            Bucket bucketResult = cosClient.createBucket(createBucketRequest);
        } catch (CosServiceException serverException) {
            serverException.printStackTrace();
        } catch (CosClientException clientException) {
            clientException.printStackTrace();
        }
        return null;
    }

    /**
     * 查询对象列表
     */
    public void findObjectList(){
        // Bucket的命名格式为 BucketName-APPID ，此处填写的存储桶名称必须为此格式
        String bucketName = "examplebucket-1250000000";
        ListObjectsRequest listObjectsRequest = new ListObjectsRequest();
        // 设置bucket名称
        listObjectsRequest.setBucketName(bucketName);
        // prefix表示列出的object的key以prefix开始
        listObjectsRequest.setPrefix("images/");
        // deliter表示分隔符, 设置为/表示列出当前目录下的object, 设置为空表示列出所有的object
        listObjectsRequest.setDelimiter("/");
        // 设置最大遍历出多少个对象, 一次listobject最大支持1000
        listObjectsRequest.setMaxKeys(1000);
        ObjectListing objectListing = null;
        do {
            try {
                objectListing = cosClient.listObjects(listObjectsRequest);
            } catch (CosServiceException e) {
                e.printStackTrace();
                return;
            } catch (CosClientException e) {
                e.printStackTrace();
                return;
            }
            // common prefix表示表示被delimiter截断的路径, 如delimter设置为/, common prefix则表示所有子目录的路径
            List<String> commonPrefixs = objectListing.getCommonPrefixes();
            // object summary表示所有列出的object列表
            List<COSObjectSummary> cosObjectSummaries = objectListing.getObjectSummaries();
            for (COSObjectSummary cosObjectSummary : cosObjectSummaries) {
                // 文件的路径key
                String key = cosObjectSummary.getKey();
                // 文件的etag
                String etag = cosObjectSummary.getETag();
                // 文件的长度
                long fileSize = cosObjectSummary.getSize();
                // 文件的存储类型
                String storageClasses = cosObjectSummary.getStorageClass();
            }
            String nextMarker = objectListing.getNextMarker();
            listObjectsRequest.setMarker(nextMarker);
        } while (objectListing.isTruncated());
    }

    /**
     * 下载对象
     * 上传对象后，您可以用同样的 key，调用 GetObject 接口将对象下载到本地，也可以生成预签名链接（下载请指定 method 为 GET，详情请参见 预签名 URL），分享到其他终端来进行下载。但如果您的文件设置了私有读权限，那么请注意预签名链接的有效期。
     */
    public void downLoadObject() throws IOException {
        // Bucket的命名格式为 BucketName-APPID ，此处填写的存储桶名称必须为此格式
        String bucketName = "examplebucket-1250000000";
        // 指定文件在 COS 上的路径，即对象键。例如对象键为folder/picture.jpg，则表示下载的文件 picture.jpg 在 folder 路径下
        String key = "exampleobject";
        // 方法1 获取下载输入流
        GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, key);
        COSObject cosObject = cosClient.getObject(getObjectRequest);
        COSObjectInputStream cosObjectInput = cosObject.getObjectContent();
        // 下载对象的 CRC64
        String crc64Ecma = cosObject.getObjectMetadata().getCrc64Ecma();
        // 关闭输入流
        cosObjectInput.close();
        // 方法2 下载文件到本地的路径，例如 D 盘的某个目录
        String outputFilePath = "exampleobject";
        File downFile = new File(outputFilePath);
        getObjectRequest = new GetObjectRequest(bucketName, key);
        ObjectMetadata downObjectMeta = cosClient.getObject(getObjectRequest, downFile);
    }

    /**
     * 删除对象
     * 删除 COS 上指定路径的对象
     */
    public void deleteObject(){
        // Bucket的命名格式为 BucketName-APPID ，此处填写的存储桶名称必须为此格式
        String bucketName = "examplebucket-1250000000";
        // 指定被删除的文件在 COS 上的路径，即对象键。例如对象键为folder/picture.jpg，则表示删除位于 folder 路径下的文件 picture.jpg
        String key = "exampleobject";
        cosClient.deleteObject(bucketName, key);
    }
    /**
     * 查询桶列表
     */
    public void findBucketList(){
        List<Bucket> buckets = cosClient.listBuckets();
        for (Bucket bucketElement : buckets) {
            String bucketName = bucketElement.getName();
            String bucketLocation = bucketElement.getLocation();
        }
    }

    public static void main(String[] args) {
        //5b0a1ed84533da09ad87df38552d9a27---etag
        /*File file=new File("D:\\新建文件夹\\test.jpg");
        String etag=CosUtil.getInstance().put("shopImg/test.jpg",file);
        System.out.println(etag+"---etag");*/
        URL url=CosUtil.getInstance().getURL("zero.jpg");
        System.out.println("url:"+url);
    }

}
