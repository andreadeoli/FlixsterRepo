package com.example.andreadeoli.flixster.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

/**
 * Created by andreadeoli on 6/22/17.
 */

@Parcel
public class Movie {
    //Values from API
    String title;
    String overview;
    String posterpath; //Not full URL
    String backdropPath;
    Double voteAverage;

    public Movie() {} //Required for Parceler

    //Initialize from JSON data
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterpath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterpath() {
        return posterpath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }
}
