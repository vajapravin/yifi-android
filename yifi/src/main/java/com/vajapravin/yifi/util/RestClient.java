package com.vajapravin.yifi.util;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestHandle;
import com.loopj.android.http.RequestParams;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import cz.msebera.android.httpclient.Header;

/**
 * Created by pvaja on 3/21/2017.
 */
public class RestClient {
    public static HashMap<String,String> authHeaders;

    private static AsyncHttpClient client = new AsyncHttpClient();
    private static AsyncHttpResponseHandler asyncHttpResponseHandler;
    private static RequestHandle handle;
    final static int DEFAULT_TIMEOUT = 60 * 1000;

    public static void executeGet(String url, RequestParams params, final ApiResponseHandler responseHandler) {
        asyncHttpResponseHandler = new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] response) {
                fillAuthHeaders(headers);
                JSONObject jsonObject=null;
                try {
                    jsonObject =new JSONObject(new String(response));
                } catch (JSONException ex) {
                    ex.printStackTrace();
                }
                responseHandler.onSuccess(jsonObject);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
                JSONObject jsonObject=null;
                try {
                    jsonObject =new JSONObject(new String(errorResponse));
                } catch (JSONException ex) {
                    ex.printStackTrace();
                }
                responseHandler.onFailure(jsonObject,e);
            }

            @Override
            public void onRetry(int retryNo) {
                handle.cancel(true);
                responseHandler.onRetry();
            }
        };

        handle = client.get(url, params, asyncHttpResponseHandler);

    }

    public static void executePost(String url, RequestParams params, final ApiResponseHandler responseHandler) {
        client.setTimeout(RestClient.DEFAULT_TIMEOUT);
        injectHeaders();

        asyncHttpResponseHandler = new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] response) {
                fillAuthHeaders(headers);
                JSONObject jsonObject=null;
                try {
                    jsonObject =new JSONObject(new String(response));
                } catch (JSONException ex) {
                    ex.printStackTrace();
                }
                responseHandler.onSuccess(jsonObject);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
                JSONObject jsonObject=null;
                try {
                    jsonObject =new JSONObject(new String(errorResponse));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                responseHandler.onFailure(jsonObject,e);
            }

            @Override
            public void onRetry(int retryNo) {
                handle.cancel(true);
                responseHandler.onRetry();
            }

        };

        handle = client.post(getAbsoluteUrl(url), params, asyncHttpResponseHandler);
    }

    private static void fillAuthHeaders(Header[] headers){
        authHeaders = new HashMap<>();
        for (Header header : headers) {
            String headerName=header.getName().toLowerCase();
            if (headerName.equals("uid") || headerName.equals("access-token") || headerName.equals("client")) {
                authHeaders.put(header.getName(), header.getValue());
            }
        }
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return APIConfiguration.getBaseURL() + relativeUrl;
    }

    private static void injectHeaders(){
        if(authHeaders!=null){
            for(Map.Entry<String, String> entry : authHeaders.entrySet()) {
                String headerName = entry.getKey();
                String headerValue = entry.getValue();
                client.addHeader(headerName, headerValue);
            }
        }
    }
}
