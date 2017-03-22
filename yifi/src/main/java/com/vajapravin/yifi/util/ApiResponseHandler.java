package com.vajapravin.yifi.util;

import org.json.JSONObject;

/**
 * Created by finayev on 6/12/15.
 */
public abstract class ApiResponseHandler {
    public abstract void onSuccess(JSONObject jsonObject);
    public abstract void onFailure(JSONObject jsonObject, Throwable e);
    public abstract void onRetry();
}
