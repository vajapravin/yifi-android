/**
 * (c) 2017 Vajapravin.com
 * All rights reserved
 *
 * Please see the accompanying LICENSE file for licensing information
 */

package com.vajapravin.yifi.response;

import com.loopj.android.http.RequestParams;
import com.vajapravin.yifi.util.APIConfiguration;
import com.vajapravin.yifi.util.ApiResponseHandler;
import com.vajapravin.yifi.util.RestClient;
import com.vajapravin.yifi.util.YifiAPIRequest;

import org.json.JSONObject;

/**
 * Server API representation of the MovieSuggestion object
 * @author vajapravin
 *
 */

public class MovieSuggestion implements YifiAPIRequest {
    private RestClient restClient;

    public MovieSuggestion(){
        restClient = new RestClient();
    }

    @Override
    public void runGet(RequestParams params) {
        restClient.executeGet(APIConfiguration.movieSuggestions, params, new ApiResponseHandler() {
            @Override
            public void onSuccess(JSONObject jsonObject) {

            }

            @Override
            public void onFailure(JSONObject jsonObject, Throwable e) {

            }

            @Override
            public void onRetry() {

            }
        });
    }

    @Override
    public void runPost(RequestParams params) {

    }
}
