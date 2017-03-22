/**
 * (c) 2017 Vajapravin.com
 * All rights reserved
 *
 * Please see the accompanying LICENSE file for licensing information
 */

package com.vajapravin.yifi.data;

import org.json.JSONObject;

/**
 * Data representation of the Meta object
 * @author vajapravin
 *
 */

public class Meta {

    public Meta(JSONObject metaJSONObject){
        server_time = metaJSONObject.optString("server_time");
        server_timezone = metaJSONObject.optString("server_timezone");
        api_version = metaJSONObject.optInt("api_version");
        execution_time = metaJSONObject.optString("execution_time");
    }

    /**
     * Meta server_time
     */
    private String server_time;

    /**
     * Meta server_timezone
     */
    private String server_timezone;

    /**
     * Meta api_version
     */
    private Integer api_version;

    /**
     * Meta execution_time
     */
    private String execution_time;
}
