/**
 * (c) 2017 Vajapravin.com
 * All rights reserved
 *
 * Please see the accompanying LICENSE file for licensing information
 */

package com.vajapravin.yifi.util;

import com.vajapravin.yifi.Yifi;

/**
 * Created by pvaja on 3/21/2017.
 */
public class YifiRuntimeException extends Exception {

    public YifiRuntimeException(String msg) {
        super(msg);
    }

    public YifiRuntimeException(String string, Exception e) {
        super(string, e);
    }
}
