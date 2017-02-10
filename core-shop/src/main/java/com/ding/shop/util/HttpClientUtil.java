package com.ding.shop.util;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import javax.annotation.Resource;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by hzdzf on 2017/2/8.
 */
public class HttpClientUtil {

    public static String download(String getUrl, String fileName){
        String savePath = Class.class.getClass().getResource("/").getPath();
        try {
            URL url = new URL(getUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(3000);
            connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            InputStream inputStream = connection.getInputStream();
            byte [] data = readInputStream(inputStream);
            File saveDir = new File(savePath);
            if (saveDir==null){
                saveDir.mkdir();
            }
            fileName = saveDir+File.separator+fileName;
            File file = new File(fileName);
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            //关闭流
            inputStream.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileName;
    }

    private static byte[] readInputStream(InputStream inputStream) {
        byte[] buffer = new byte[1024];
        int hasRead = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            while((hasRead = inputStream.read(buffer))!=-1){
                bos.write(buffer,0,hasRead);
            }
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bos.toByteArray();
    }

    public static String sendGet(String url,String content){
        String getUrl;
        if (url.endsWith("?")){
            getUrl = url+content;
        }else {
            getUrl = url+"?"+content;
        }
        return sendGet(getUrl);
    }

    private static String sendGet(String getUrl) {
        Request.Builder builder = new Request.Builder();
        builder.url(getUrl);
        Map<String,String> headerMap = new HashMap<>();
        headerMap.put("accept","*/*");
        headerMap.put("connection","Keep-Alive");
        headerMap.put("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
        buildHeader(builder,headerMap);
        Request request = builder.build();
        OkHttpClient okHttpClient = new OkHttpClient();
        return doExcute(request,okHttpClient);
    }

    private static String doExcute(Request request, OkHttpClient okHttpClient) {
        String result = "";
        try {
            Response response = okHttpClient.newCall(request).execute();
            if (isSuccesful(response)){
                result =response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static boolean isSuccesful(Response response) {
        if (response==null){
            return false;
        }
        return response.isSuccessful();
    }

    /**
     * 组装发送请求头
     * @param builder
     * @param headerMap
     */
    private static void buildHeader(Request.Builder builder, Map<String, String> headerMap) {
        Iterator<Map.Entry<String,String>> iter = headerMap.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String,String> entry = iter.next();
            builder.header(entry.getKey(),entry.getValue());
        }
    }
}
