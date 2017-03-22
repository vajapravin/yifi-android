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
 * Server API representation of the ReportComment object
 * @author vajapravin
 *
 */

public class ReportComment implements YifiAPIRequest {
    private RestClient restClient;

    public ReportComment(){
        restClient = new RestClient();
    }

    @Override
    public void runGet(RequestParams params) {

    }

    @Override
    public void runPost(RequestParams params) {

    }
}
