package br.com.monteiro.mymusics.main;

import br.com.monteiro.mymusics.models.Music;
import br.com.monteiro.mymusics.models.MyPreferences;
import br.com.monteiro.mymusics.models.Podcast;

public class Main {
    public static void main(String[] args) {

        Music myMusic = new Music();
        myMusic.setTitle("Day in the life music: ");
        myMusic.setArtist("Central Cee ");

        for (int i = 0; i < 1000 ; i++) {
            myMusic.reproduce();

        }
        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }


        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Bolha Dev Podcast: ");
        myPodcast.setHost("Mano Deyvin ");

        for (int i = 0; i < 5000; i++) {
            myPodcast.reproduce();
        }
        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyPreferences myPreferences = new MyPreferences();
        myPreferences.included(myPodcast);
        myPreferences.included(myMusic);
    }
}