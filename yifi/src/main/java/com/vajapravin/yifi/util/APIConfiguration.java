/**
 * (c) 2017 Vajapravin.com
 * All rights reserved
 *
 * Please see the accompanying LICENSE file for licensing information
 */

package com.vajapravin.yifi.util;

/**
 * API Configuration constants
 * @author vajapravin
 *
 */
public class APIConfiguration {
    private static String appKey;
    private static String baseURL = "https://yts.ag/api/v2";

    // Used to list and search through out all the available movies. Can sort, filter, search and order the results
    public static String listMovies = "/list_movies.json";
    // Returns the information about a specific movie
    public static String movieDetails = "/movie_details.json";
    // Returns 4 related movies as suggestions for the user
    public static String movieSuggestions = "/movie_suggestions.json";
    // Returns all the comments for the specified movie
    public static String movieComments = "/movie_comments.json";
    // Returns all the comments for the specified movie
    public static String movieReviews = "/movie_reviews.json";
    // Returns all the parental guide ratings for the specified movie
    public static String movieParentalGuides = "/movie_parental_guides.json";
    // Returns the 4 latest upcoming movies
    public static String movieUpcoming = "/list_upcoming.json";
    // Get the user details
    public static String userDetails = "/user_details.json";
    // The same as logging in, if successful the returned data will include the user_key for later use of the API as a means of authentication
    public static String userGetKey = "/user_get_key.json";
    // This endpoint will return the full information about an authenticated user
    public static String userProfile = "/user_profile.json";
    // Endpoint is used to edit an authenticated user's profile settings
    public static String userEditSettings = "/user_edit_settings.json";
    // Endpoint is used register a new user
    public static String userRegister = "/user_register.json";
    // Endpoint is used to get a password reset code sent to their email to in case the user forgot their password
    public static String userForgotPassword = "/user_forgot_password.json";
    // Endpoint is used to reset the user's password using the password reset code
    public static String userResetPassword = "/user_reset_password.json";
    // Endpoint is used to send a like (heart) for a specific movie
    public static String likeMovie = "/like_movie.json";
    // Endpoint is used to get all the current movies which have been bookmarked for a given user
    public static String getBookmark = "/get_movie_bookmark.json";
    // Endpoint is used to add any specific movie to the user's bookmarks
    public static String addBookmark = "/add_movie_bookmark.json";
    // Endpoint is used remove movies from the user's bookmarks
    public static String deleteBookmark = "/delete_movie_bookmark.json";
    // Endpoint is used allow a user to post a comment on a specific movie
    public static String makeComment = "/make_comment.json";
    // Endpoint is used allow a user like (heart) a comment
    public static String likeComment = "/like_comment.json";
    // Endpoint is used allow a user to report a comment
    public static String reportComment = "/report_comment.json";
    // Endpoint is used allow a user to delete a comment (assuming its their own)
    public static String deleteComment = "/delete_comment.json";
    // Endpoint is used allow a user to delete a comment (assuming its their own)
    public static String makeRequest = "/make_request.json";

    /**
     * Set the app key
     * @param newAppKey
     */
    public static void setApiKey(String newAppKey) {
        appKey = newAppKey;
    }

    /**
     * Get the API key, after having stored it via setApiKey.
     * @return apiKey  The EVDB API key.
     * @throws YifiRuntimeException
     */
    public static String getApiKey() throws YifiRuntimeException {
        if (appKey == null) throw new YifiRuntimeException("API Key not set");
        return appKey;
    }

    /**
     * Base URL
     * @return the base URL
     */
    public static String getBaseURL() {
        return baseURL;
    }

    /**
     * Base URL
     * @return the base URL
     */
    public static String setBaseURL(String baseURL) {
        return APIConfiguration.baseURL = baseURL;
    }
}
