/**
 * (c) 2017 Vajapravin.com
 * All rights reserved
 *
 * Please see the accompanying LICENSE file for licensing information
 */

package com.vajapravin.yifi.data;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Data representation of the Movie object
 * @author vajapravin
 *
 */

public class Movie {

    public Movie(JSONObject movie){
        id = movie.optInt("id");
        url = movie.optString("url");
        imdb_code = movie.optString("imdb_code");
        title = movie.optString("title");
        title_english = movie.optString("title_english");
        title_long = movie.optString("title_long");
        slug = movie.optString("slug");
        year = movie.optInt("year");
        rating = movie.optInt("rating");
        runtime = movie.optInt("runtime");
        setGenres(movie.optJSONArray("genres"));
        setTorrents(movie.optJSONArray("torrents"));
        summary = movie.optString("summary");
        description_full = movie.optString("description_full");
        synopsis = movie.optString("synopsis");
        yt_trailer_code = movie.optString("yt_trailer_code");
        language = movie.optString("language");
        mpa_rating = movie.optString("mpa_rating");
        background_image = movie.optString("background_image");
        background_image_original = movie.optString("background_image_original");
        small_cover_image = movie.optString("small_cover_image");
        medium_cover_image = movie.optString("medium_cover_image");
        large_cover_image = movie.optString("large_cover_image");
        state = movie.optString("state");
        date_uploaded = movie.optString("date_uploaded");
        date_uploaded_unix = movie.optString("date_uploaded_unix");
    }
    /**
     * Movie ID
     */
    private Integer id;

    /**
     * Movie Encoded URL
     */
    private String url;

    /**
     * IMDB Code
     */
    private String imdb_code;

    /**
     * Movie Title
     */
    private String title;

    /**
     * Movie Title English
     */
    private String title_english;

    /**
     * Movie Title Long
     */
    private String title_long;

    /**
     * Movie slug content
     */
    private String slug;

    /**
     * Movie release year
     */
    private Integer year;

    /**
     * Movie Rating
     */
    private Integer rating;

    /**
     * Movie runtime
     */
    private Integer runtime;

    /**
     * Movie Genres
     */
    private List<String> genres;

    /**
     * Movie Torrents
     */
    private List<Torrent> torrents;

    /**
     * Movie Summary
     */
    private String summary;

    /**
     * Movie Full Description
     */
    private String description_full;

    /**
     * Movie Synopsis
     */
    private String synopsis;

    /**
     * Youtube Trailer Code
     */
    private String yt_trailer_code;

    /**
     * Movie Language
     */
    private String language;

    /**
     * Motion Pictures Association Ratings
     */
    private String mpa_rating;

    /**
     * Movie Background Image
     */
    private String background_image;

    /**
     * Movie Background Image Original
     */
    private String background_image_original;

    /**
     * Movie Cover Image
     */
    private String small_cover_image;

    /**
     * Movie Medium Cover Image
     */
    private String medium_cover_image;

    /**
     * Movie Large Cover Image
     */
    private String large_cover_image;

    /**
     * Movie State
     */
    private String state;

    /**
     * Movie Uploaded Date
     */
    private String date_uploaded;

    /**
     * Movie Uploaded Timestamp
     */
    private String date_uploaded_unix;

    /**
     * Return Movie ID
     * @return the id
     */
    public Integer getId(){
        return id;
    }

    /**
     * Set Movie ID
     * @param id
     */
    public void setId(Integer id){
        this.id = id;
    }


    /**
     * Return Movie Encoded URL
     * @return the url
     */
    public String getUrl(){
        return url;
    }

    /**
     * Set Movie Encoded URL
     * @param url
     */
    public void setUrl(String url){
        this.url = url;
    }

    /**
     * Return IMDB Code
     * @return the imdb_code
     */
    public String getImdbCode(){
        return imdb_code;
    }

    /**
     * Set IMDB Code
     * @param imdb_code
     */
    public void setImdbCode(String imdb_code){
        this.imdb_code = imdb_code;
    }

    /**
     * Return Movie Title
     * @return the title
     */
    public String getTitle(){
        return title;
    }


    /**
     * Set Movie Title
     * @param title
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Return Movie Title English
     * @return the title_english
     */
    public String getTitleEnglish(){
        return title_english;
    }

    /**
     * Set Movie Title English
     * @param title_english
     */
    public void setTitleEnglish(String title_english){
        this.title_english = title_english;
    }

    /**
     * Return Movie Title Long
     * @return the title_long
     */
    public String getTitleLong(){
        return title_long;
    }

    /**
     * Set Movie Title Long
     * @param title_long
     */
    public void setTitleLong(String title_long){
        this.title_long = title_long;
    }

    /**
     * Return Movie Slug
     * @return the slug
     */
    public String getSlug(){
        return slug;
    }

    /**
     * Set Movie Slug
     * @param slug
     */
    public void setSlug(String slug){
        this.slug = slug;
    }

    /**
     * Return Movie Year
     * @return the year
     */
    public Integer getYear(){
        return year;
    }

    /**
     * Set Movie Year
     * @param year
     */
    public void setYear(Integer year){
        this.year = year;
    }

    /**
     * Return Movie Rating
     * @return the rating
     */
    public Integer getRating(){
        return rating;
    }

    /**
     * Set Movie Rating
     * @param rating
     */
    public void setRating(Integer rating){
        this.rating = rating;
    }

    /**
     * Return Movie Runtime
     * @return the runtime
     */
    public Integer getRuntime(){
        return runtime;
    }

    /**
     * Set Movie Runtime
     * @param runtime
     */
    public void setRuntime(Integer runtime){
        this.runtime = runtime;
    }

    /**
     * Return Movie Summary
     * @return the summary
     */
    public String getSummary(){
        return summary;
    }

    /**
     * Set Movie Summary
     * @param summary
     */
    public void setSummary(String summary){
        this.summary = summary;
    }

    /**
     * Return Movie Description Full
     * @return the description_full
     */
    public String getDescriptionFull(){
        return description_full;
    }


    /**
     * Set Movie Description Full
     * @param description_full
     */
    public void setDescriptionFull(String description_full){
        this.description_full = description_full;
    }

    /**
     * Return Movie Synopsis
     * @return the synopsis
     */
    public String getSynopsis(){
        return synopsis;
    }

    /**
     * Set Movie Synopsis
     * @param synopsis
     */
    public void setSynopsis(String synopsis){
        this.synopsis = synopsis;
    }

    /**
     * Return Movie Youtube Trailer Code
     * @return the yt_trailer_code
     */
    public String getYtTrailerCode(){
        return yt_trailer_code;
    }

    /**
     * Set Movie Youtube Trailer Code
     * @param yt_trailer_code
     */
    public void setYtTrailerCode(String yt_trailer_code){
        this.yt_trailer_code = yt_trailer_code;
    }

    /**
     * Return Movie Language
     * @return the language
     */
    public String getLanguage(){
        return language;
    }

    /**
     * Set Movie Language
     * @param language
     */
    public void setLanguage(String language){
        this.language = language;
    }

    /**
     * Return Motion Pictures Association Ratings
     * @return the mpa_rating
     */
    public String getMpaRating(){
        return mpa_rating;
    }

    /**
     * Set Motion Pictures Association Ratings
     * @param mpa_rating
     */
    public void setMpaRating(String mpa_rating){
        this.mpa_rating = mpa_rating;
    }

    /**
     * Return Movie Background Image
     * @return the id
     */
    public String getBackgroundImage(){
        return background_image;
    }

    /**
     * Set Movie Background Image
     * @param background_image
     */
    public void setBackgroundImage(String background_image){
        this.background_image = background_image;
    }

    /**
     * Return Movie Background Original Image
     * @return the background_image_original
     */
    public String getBackgroundImageOriginal(){
        return background_image_original;
    }

    /**
     * Set Movie Background Original Image
     * @param background_image_original
     */
    public void setBackgroundImageOriginal(String background_image_original){
        this.background_image_original = background_image_original;
    }

    /**
     * Return Movie Small Cover Image
     * @return the small_cover_image
     */
    public String getSmallCoverImage(){
        return small_cover_image;
    }

    /**
     * Set Movie Small Cover Image
     * @param small_cover_image
     */
    public void setSmallCoverImage(String small_cover_image){
        this.small_cover_image = small_cover_image;
    }

    /**
     * Return Movie Medium Cover Image
     * @return the medium_cover_image
     */
    public String getMediumCoverImage(){
        return medium_cover_image;
    }

    /**
     * Set Movie Medium Cover Image
     * @param medium_cover_image
     */
    public void setMedium_cover_image(String medium_cover_image){
        this.medium_cover_image = medium_cover_image;
    }

    /**
     * Return Movie Large Cover Image
     * @return the large_cover_image
     */
    public String getLargeCoverImage(){
        return large_cover_image;
    }

    /**
     * Set Movie Large Cover Image
     * @param large_cover_image
     */
    public void setLargeCoverImage(String large_cover_image){
        this.large_cover_image = large_cover_image;
    }

    /**
     * Return Movie State
     * @return the state
     */
    public String getState(){
        return state;
    }

    /**
     * Set Movie State
     * @param state
     */
    public void setState(String state){
        this.state = state;
    }

    /**
     * Return Movie Date Uploaded
     * @return the id
     */
    public String getDateUploaded(){
        return date_uploaded;
    }

    /**
     * Set Movie Date Uploaded
     * @param date_uploaded
     */
    public void setDateUploaded(String date_uploaded){
        this.date_uploaded = date_uploaded;
    }

    /**
     * Return Movie Date Uploaded Timestamp
     * @return the date_uploaded_unix
     */
    public String getDateUploadedUnix(){
        return date_uploaded_unix;
    }

    /**
     * Set Movie Date Uploaded Timestamp
     * @param date_uploaded_unix
     */
    public void setDateUploadedUnix(String date_uploaded_unix){
        this.date_uploaded_unix = date_uploaded_unix;
    }

    /**
     * Get the Movie genres
     * @return the genres
     */
    public List<String> getGenres() {
        return genres;
    }

    /**
     * Set the Movie genres
     * @param genresArray
     */
    public void setGenres(JSONArray genresArray){
        if(genresArray != null){
            for(int i=0; i<=genresArray.length(); i++){
                try {
                    genres.add(genresArray.getString(i));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Get the Movie torrents
     * @return torrents
     */
    public List<Torrent> getTorrents() {
        return torrents;
    }

    /**
     * Set the Movie torrents
     * @param torrentsArray
     */
    public void setTorrents(JSONArray torrentsArray){
        if(torrentsArray != null){
            for(int i=0; i<=torrentsArray.length(); i++){
                try {
                    torrents.add(new Torrent(torrentsArray.getJSONObject(i)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
