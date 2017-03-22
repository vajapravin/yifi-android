/**
 * (c) 2017 Vajapravin.com
 * All rights reserved
 *
 * Please see the accompanying LICENSE file for licensing information
 */

package com.vajapravin.yifi;

import android.content.Context;

import com.loopj.android.http.RequestParams;
import com.vajapravin.yifi.data.Movie;
import com.vajapravin.yifi.response.AddMovieBookmark;
import com.vajapravin.yifi.response.DeleteComment;
import com.vajapravin.yifi.response.DeleteMovieBookmark;
import com.vajapravin.yifi.response.GetMovieBookmark;
import com.vajapravin.yifi.response.LikeComment;
import com.vajapravin.yifi.response.LikeMovie;
import com.vajapravin.yifi.response.ListMovie;
import com.vajapravin.yifi.response.ListUpcoming;
import com.vajapravin.yifi.response.MakeComment;
import com.vajapravin.yifi.response.MovieComment;
import com.vajapravin.yifi.response.MovieDetail;
import com.vajapravin.yifi.response.MovieParentalGuide;
import com.vajapravin.yifi.response.MovieRequest;
import com.vajapravin.yifi.response.MovieReview;
import com.vajapravin.yifi.response.MovieSuggestion;
import com.vajapravin.yifi.response.RegisterUser;
import com.vajapravin.yifi.response.ReportComment;
import com.vajapravin.yifi.response.UserDetail;
import com.vajapravin.yifi.response.UserEditSetting;
import com.vajapravin.yifi.response.UserForgotPassword;
import com.vajapravin.yifi.response.UserKey;
import com.vajapravin.yifi.response.UserProfile;
import com.vajapravin.yifi.response.UserResetPassword;

import java.util.List;

/**
 * API Configuration constants
 * @author vajapravin
 *
 */

public class Yifi {
    private Context context;
    public List<Movie> movies;

    private AddMovieBookmark addMovieBookmark;
    private DeleteComment deleteComment;
    private DeleteMovieBookmark deleteMovieBookmark;
    private GetMovieBookmark getMovieBookmark;
    private LikeComment likeComment;
    private LikeMovie likeMovie;
    private ListMovie listMovie;
    private ListUpcoming listUpcoming;
    private MakeComment makeComment;
    private MovieComment movieComment;
    private MovieDetail movieDetail;
    private MovieParentalGuide movieParentalGuide;
    private MovieRequest movieRequest;
    private MovieReview movieReview;
    private MovieSuggestion movieSuggestion;
    private RegisterUser registerUser;
    private ReportComment reportComment;
    private UserDetail userDetail;
    private UserEditSetting userEditSetting;
    private UserForgotPassword userForgotPassword;
    private UserKey userKey;
    private UserProfile userProfile;
    private UserResetPassword userResetPassword;

    public Yifi(Context context){
        this.context = context;

        addMovieBookmark = new AddMovieBookmark();
        deleteComment = new DeleteComment();
        deleteMovieBookmark = new DeleteMovieBookmark();
        getMovieBookmark = new GetMovieBookmark();
        likeComment = new LikeComment();
        likeMovie = new LikeMovie();
        listMovie = new ListMovie();
        listUpcoming = new ListUpcoming();
        makeComment = new MakeComment();
        movieComment = new MovieComment();
        movieDetail = new MovieDetail();
        movieParentalGuide = new MovieParentalGuide();
        movieRequest = new MovieRequest();
        movieReview = new MovieReview();
        movieSuggestion = new MovieSuggestion();
        registerUser = new RegisterUser();
        reportComment = new ReportComment();
        userDetail = new UserDetail();
        userEditSetting = new UserEditSetting();
        userForgotPassword = new UserForgotPassword();
        userKey = new UserKey();
        userProfile = new UserProfile();
        userResetPassword = new UserResetPassword();
    }

    public AddMovieBookmark addMovieBookmark(RequestParams params){
        addMovieBookmark.runGet(params);
        return addMovieBookmark;
    }

    public DeleteComment deleteComment(RequestParams params){
        deleteComment.runGet(params);
        return deleteComment;
    }

    public DeleteMovieBookmark deleteMovieBookmark(RequestParams params){
        deleteMovieBookmark.runGet(params);
        return deleteMovieBookmark;
    }

    public GetMovieBookmark getMovieBookmarks(RequestParams params){
        getMovieBookmark.runGet(params);
        return getMovieBookmark;
    }

    public LikeComment likeComment(RequestParams params){
        likeComment.runGet(params);
        return likeComment;
    }

    public LikeMovie likeMovie(RequestParams params){
        likeMovie.runGet(params);
        return likeMovie;
    }

    public ListUpcoming listUpcoming(RequestParams params){
        listUpcoming.runGet(params);
        return listUpcoming;
    }

    public MakeComment makeComment(RequestParams params){
        makeComment.runGet(params);
        return makeComment;
    }

    public MovieComment movieComments(RequestParams params){
        movieComment.runGet(params);
        return movieComment;
    }

    public MovieDetail movieDetails(RequestParams params){
        movieDetail.runGet(params);
        return movieDetail;
    }

    public MovieParentalGuide movieParentalGuide(RequestParams params){
        movieParentalGuide.runGet(params);
        return movieParentalGuide;
    }

    public MovieRequest movieRequest(RequestParams params){
        movieRequest.runGet(params);
        return movieRequest;
    }

    public MovieReview movieReview(RequestParams params){
        movieReview.runGet(params);
        return movieReview;
    }

    public MovieSuggestion movieSuggestions(RequestParams params){
        movieSuggestion.runGet(params);
        return movieSuggestion;
    }

    public MovieParentalGuide movieParentalGuides(RequestParams params){
        movieParentalGuide.runGet(params);
        return movieParentalGuide;
    }

    public RegisterUser registerUser(RequestParams params){
        registerUser.runGet(params);
        return registerUser;
    }

    public ReportComment reportComment(RequestParams params){
        reportComment.runGet(params);
        return reportComment;
    }

    public UserDetail userDetail(RequestParams params){
        userDetail.runGet(params);
        return userDetail;
    }

    public UserEditSetting userEditSetting(RequestParams params){
        userEditSetting.runGet(params);
        return userEditSetting;
    }

    public UserForgotPassword userForgotPassword(RequestParams params){
        userForgotPassword.runGet(params);
        return userForgotPassword;
    }

    public UserKey userKey(RequestParams params){
        userKey.runGet(params);
        return userKey;
    }

    public UserProfile userProfile(RequestParams params){
        userProfile.runGet(params);
        return userProfile;
    }

    public UserResetPassword userResetPassword(RequestParams params){
        userResetPassword.runGet(params);
        return userResetPassword;
    }
}