package com.swb.ssm.service.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class HttpClientUtil {

    private static final String ENCODING = "UTF-8";

    public static JSONObject doGet(String url) throws Exception {
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // 创建http GET请求
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            // 执行请求
            response = httpclient.execute(httpGet);
            // 获取返回结果
            if (response != null && response.getStatusLine() != null) {
                StringBuffer content = new StringBuffer();
                if (response.getEntity() != null) {
                    content.append(EntityUtils.toString(response.getEntity(), ENCODING));
                }
                return JSON.parseObject(content.toString());
            }
        } finally {
            if (response != null) {
                response.close();
            }
            if (httpclient != null) {
                httpclient.close();
            }

        }
        return null;
    }

}

