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

/**
 * Server API representation of the MovieComment object
 * @author vajapravin
 *
 */

public class MovieComment implements YifiAPIRequest {
    private RestClient restClient;

    public MovieComment(){
        restClient = new RestClient();
    }

    @Override
    public void runGet(RequestParams params) {

    }

    @Override
    public void runPost(RequestParams params) {

    }
}
