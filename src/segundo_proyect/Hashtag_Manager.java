/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_proyect;

/**
 *
 * @author Cristina Sabillon
 */
public class Hashtag_Manager {
    
    private Tweet_Manager tweetManager;

    public Hashtag_Manager(Tweet_Manager tweetManager) {
        this.tweetManager = tweetManager;
    }

    public String getTweetsByHashtag(String hashtag) {
        String result = "";
        String lowerCaseHashtag = hashtag.toLowerCase(); 
        for (int index = 0; index < tweetManager.getTweetCount(); index++) {
            Tweets tweet = tweetManager.getTweet(index);
            if (tweet != null && tweet.containsHashtag(hashtag)) {
                result += tweet.publicarTweet() + "\n";
            }
        }
        return result;
    }
}