/**
 * (c) 2017 Vajapravin.com
 * All rights reserved
 *
 * Please see the accompanying LICENSE file for licensing information
 */

package com.vajapravin.yifi.response;

import com.loopj.android.http.RequestParams;
import com.vajapravin.yifi.util.APIConfiguration;
import com.vajapravin.yifi.data.Meta;
import com.vajapravin.yifi.data.Movie;
import com.vajapravin.yifi.util.ApiResponseHandler;
import com.vajapravin.yifi.util.RestClient;
import com.vajapravin.yifi.util.YifiAPIRequest;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Server API representation of the MovieDetail object
 * @author vajapravin
 *
 */

public class MovieDetail implements YifiAPIRequest{
    private RestClient restClient;

    public String status;
    public String status_message;
    public Movie movie;
    public Meta meta;

    public MovieDetail(){
        restClient = new RestClient();
    }

    @Override
    public void runGet(RequestParams params) {
        restClient.executeGet(APIConfiguration.movieDetails, params, new ApiResponseHandler() {
            @Override
            public void onSuccess(JSONObject jsonObject) {
                status = jsonObject.optString("status");
                status_message = jsonObject.optString("status_message");
                if(jsonObject.optString("data") != null){
                    setMovie(jsonObject.optJSONObject("data"));
                }
                if(jsonObject.optString("data") != null){
                    meta = new Meta(jsonObject.optJSONObject("@meta"));
                }
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

    private void setMovie(JSONObject jsonObject){
        try {
            if (jsonObject.has("movie")) {
                movie = new Movie(jsonObject.getJSONObject("movie"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
