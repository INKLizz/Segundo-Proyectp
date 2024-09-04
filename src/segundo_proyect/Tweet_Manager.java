/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_proyect;

/**
 *
 * @author Laura Sabillon
 */
public class Tweet_Manager {
    private static Tweet_Manager instance;
    private Tweets[] timeline;
    private int tweetCount;

    private Tweet_Manager(int size) {
        timeline = new Tweets[size];
        tweetCount = 0;
    }
    
    public int getTweetCount() {
        return tweetCount;
    }        

    public static Tweet_Manager getInstance(int size) {
        if (instance == null) {
            instance = new Tweet_Manager(size);
        }
        return instance;
    }

    public void postTweet(String contenido, users user) {
        if (tweetCount < timeline.length) {
            Tweets newTweet = new Tweets(contenido, user);
            timeline[tweetCount] = newTweet;
            tweetCount++;
        }
    }
    
    public Tweets getTweet(int index) {
        if (index >= 0 && index < tweetCount) {
            return timeline[index];
        }
        return null;
    }    

    public String getTimeline() {
        String timelineString = "";
        for (int index = 0; index < tweetCount; index++) {
            timelineString += timeline[index].publicarTweet() + "\n";
        }
        return timelineString;
    }
    
    public String getMentioningUser(users currentUser) {
        String mentions = "";
        for (int index = 0; index < tweetCount; index++) {
            if (timeline[index].containsMention(currentUser)) {
                mentions += timeline[index].publicarTweet() + "\n";
            }
        }
        return mentions;
    }
    
    public void printTimeline() {
        System.out.println("Timeline Contenido:");
        for (int index = 0; index < tweetCount; index++) {
            System.out.println("Tweet " + (index + 1) + ": " + timeline[index].publicarTweet());
        }
    }    
}