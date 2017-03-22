/**
 * (c) 2017 Vajapravin.com
 * All rights reserved
 *
 * Please see the accompanying LICENSE file for licensing information
 */

package com.vajapravin.yifi.response;

import com.loopj.android.http.RequestParams;
import com.vajapravin.yifi.util.RestClient;
import com.vajapravin.yifi.util.YifiAPIRequest;

import org.json.JSONObject;

/**
 * Server API representation of the ParentalGuide object
 * @author vajapravin
 *
 */

public class ParentalGuide implements YifiAPIRequest {
    private RestClient restClient;

    public String type;
    public String parental_guide_text;

    public ParentalGuide(JSONObject parentalGuideJSONObject){
        restClient = new RestClient();
        type = parentalGuideJSONObject.optString("type");
        parental_guide_text = parentalGuideJSONObject.optString("parental_guide_text");
    }

    @Override
    public void runGet(RequestParams params) {

    }

    @Override
    public void runPost(RequestParams params) {

    }
}
