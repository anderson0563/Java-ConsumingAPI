package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

public class NewsMCU {

    private int days_until;
    private Following_production following_production;
    private String overview;
    private String poster_url;
    private Date release_date;
    private String title;
    private String type;

    public NewsMCU() {
    }

    public NewsMCU(int days_until, Following_production following_production, String overview, String poster_url, Date release_date, String title, String type) {
        this.days_until = days_until;
        this.following_production = following_production;
        this.overview = overview;
        this.poster_url = poster_url;
        this.release_date = release_date;
        this.title = title;
        this.type = type;
    }

    public int getDays_until() {
        return days_until;
    }

    public void setDays_until(int days_until) {
        this.days_until = days_until;
    }

    public Following_production getFollowing_production() {
        return following_production;
    }

    public void setFollowing_production(Following_production following_production) {
        this.following_production = following_production;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster_url() {
        return poster_url;
    }

    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return this.overview;
    }
}
