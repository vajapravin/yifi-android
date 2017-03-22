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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Server API representation of the ListMovie object
 * @author vajapravin
 *
 */

public class ListMovie implements YifiAPIRequest{
    private RestClient restClient;

    public String status;
    public String status_message;
    public Integer movie_count;
    public Integer limit;
    public Integer page_number;
    public List<Movie> movies;
    public Meta meta;

    public ListMovie(){
        restClient = new RestClient();
    }

    @Override
    public void runGet(RequestParams params) {
        restClient.executeGet(APIConfiguration.listMovies, params, new ApiResponseHandler() {
            @Override
            public void onSuccess(JSONObject jsonObject) {
                status = jsonObject.optString("status");
                status_message = jsonObject.optString("status_message");
                if(jsonObject.optString("data") != null){
                    movie_count = jsonObject.optInt("movie_count");
                    limit = jsonObject.optInt("limit");
                    page_number = jsonObject.optInt("page_number");
                    setMovies(jsonObject.optJSONObject("data"));
                    movies = movies;
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

    private void setMovies(JSONObject jsonObject){
        try {
            if(jsonObject.has("movies")) {
                JSONArray moviesArray = jsonObject.getJSONArray("movies");
                for (int i = 0; i < moviesArray.length(); i++) {
                    movies.add(new Movie(moviesArray.getJSONObject(i)));
                }
            } else if (jsonObject.has("movie")) {
                movies.add(new Movie(jsonObject.getJSONObject("movie")));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
