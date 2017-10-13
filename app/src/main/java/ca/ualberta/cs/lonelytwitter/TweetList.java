package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by noahkryzanowski on 2017-10-11.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){};

    public void addTweet(Tweet tweet) throws IllegalArgumentException{
        if(tweets.contains(tweet)) {
            throw new IllegalArgumentException("Duplicate tweet already there");
        }
        else {
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet) {
        int tweetSize = tweets.size();
        for(int i = 0; i < tweetSize; i++) {
            if(tweet == tweets.get(i)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
        //return tweets.contains(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public int getCount(ArrayList<Tweet> tweets) {
        return tweets.size();
    }
}
