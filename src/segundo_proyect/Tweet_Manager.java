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

//    private static Tweet_Manager instance;
//    private Tweets[] timeline;
//    private int tweetCount;
//
//    public Tweet_Manager(int size) {
//        timeline = new Tweets[size];
//        tweetCount = 0;
//    }
//
//    public static Tweet_Manager getInstance(int size) {
//        if (instance == null) {
//            instance = new Tweet_Manager(size);
//        }
//        return instance;
//    }
//
//    public void postTweet(String contenido, users user) {
//        if (tweetCount < timeline.length) {
//            Tweets newTweet = new Tweets(contenido, user);
//            timeline[tweetCount] = newTweet;
//            tweetCount++;
//        }
//    }
//
//    public String getTweetsByHashtag(String hashtag) {
//        String result = "";
//        for (int index = 0; index < tweetCount; index++) {
//            if (timeline[index] != null && timeline[index].containsHashtag(hashtag)) {
//                result += timeline[index].post() + "\n";
//            }
//        }
//        return result;
//    }
//
//    public String getTimeline() {
//        String timelineString = "";
//
//        if (true) {
//            for (int index = tweetCount - 1; index >= 0; index--) {
//                timelineString += timeline[index].post() + "\n";
//            }
//        }
//        return timelineString;
//    }
//
//    public String getMentioningUser(users currentUser) {
//        String mentions = "";
//        for (int index = tweetCount - 1; index >= 0; index--) {
//            if (timeline[index].interracion(currentUser)) {
//                mentions += timeline[index].post() + "\n";
//            }
//        }
//        return mentions;
//    }
//
//    public String TimelineUser(users currentUser) {
//        String contenido = "";
//        String usuario = currentUser.getUsernameInSession();
//
//        if (usuario != null) {
//            for (int index = tweetCount - 1; index >= 0; index--) {
//                if (timeline[index] != null && timeline[index].getCreador().equals(usuario)) {
//                    contenido += timeline[index].post() + "\n";
//                }
//            }
//            return contenido;
//        }
//        return null;
//    }
//
}
