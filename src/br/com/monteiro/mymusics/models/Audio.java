package br.com.monteiro.mymusics.models;

public class Audio {
    private String title;
    private int totalReproductions;
    private int totalLikes;
    private int review;


    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getTotalReproductions() {
        return totalReproductions;
    }

    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int likes) {
        this.totalLikes = likes;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    // Methods

    public void like () {
        this.totalLikes++;
    }

    public void reproduce () {
        this.totalReproductions++;
    }
}
