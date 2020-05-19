package com.example.myapplication;

        import com.google.firebase.database.IgnoreExtraProperties;

public class user {
    private String userId;
    private String userName;
    private String borrow;

    public user(){
        //this constructor is required
    }

    public user(String artistId, String artistName, String artistGenre) {
        this.userId = userId;
        this.userName = userName;
        this.borrow = borrow;
    }

    public String getArtistId() {
        return userId;
    }

    public String getArtistName() {
        return userName;
    }

    public String getArtistGenre() {
        return borrow;
    }
}