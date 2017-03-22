package com.vajapravin.yifi.util;

import com.loopj.android.http.RequestParams;

/**
 * Created by pvaja on 3/22/2017.
 */
public interface YifiAPIRequest {
    public void runGet(RequestParams params);
    public void runPost(RequestParams params);
}
