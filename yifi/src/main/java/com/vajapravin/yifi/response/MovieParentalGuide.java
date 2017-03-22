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
import com.vajapravin.yifi.util.ApiResponseHandler;
import com.vajapravin.yifi.util.RestClient;
import com.vajapravin.yifi.util.YifiAPIRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

/**
 * Server API representation of the MovieParentalGuide object
 * @author vajapravin
 *
 */

public class MovieParentalGuide implements YifiAPIRequest {
    private RestClient restClient;

    public String status;
    public String status_message;
    public Integer parental_guide_count;
    public List<ParentalGuide> parental_guides;
    public Meta meta;

    public MovieParentalGuide(){
        restClient = new RestClient();
    }

    public void setParentalGuides(JSONArray parentalGuides){
        for(int i=0; i<=parentalGuides.length(); i++){
            parental_guides.add(new ParentalGuide(parentalGuides.optJSONObject(i)));
        }
    }

    @Override
    public void runGet(RequestParams params) {
        restClient.executeGet(APIConfiguration.movieParentalGuides, params, new ApiResponseHandler() {
            @Override
            public void onSuccess(JSONObject jsonObject) {
                status = jsonObject.optString("status");
                status_message = jsonObject.optString("status_message");
                if(jsonObject.optString("data") != null){
                    parental_guide_count = jsonObject.optInt("parental_guide_count");
                    setParentalGuides(jsonObject.optJSONArray("parental_guides"));
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
}
