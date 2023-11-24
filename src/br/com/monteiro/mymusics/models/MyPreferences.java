package br.com.monteiro.mymusics.models;

public class MyPreferences {

    public void included(Audio audio) {
        if (audio.getReview() >= 9 ) {
            System.out.println(audio.getTitle() + "Its consider a success by everyone ");
        }else {
            System.out.println(audio.getTitle() + "Excellent option for listen later ");
        }
    }
}
