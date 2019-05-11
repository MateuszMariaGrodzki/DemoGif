package com.ak.demoGif.Model;

public class Gif {

    private String name;
    private String userName;
    private Boolean isFavorite;

    public Gif(String name , String userName , Boolean isFavorite){
        this.name = name;
        this.userName = userName;
        this.isFavorite = isFavorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
