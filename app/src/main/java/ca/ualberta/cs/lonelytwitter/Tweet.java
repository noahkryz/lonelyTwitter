/*
 * Tweet
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 * Copyright 2017 Team Me, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact nkryzano@ualberta.ca
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author noahkryzanowski
 * @version 1.5
 * @see NormalTweet
 * @see importantTweet
 * @since 1.0
 */
public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<Mood> moodList = new ArrayList<Mood>();

    /**
     * Constructs a Tweet object
     *
     * @param message tweet message
     */
    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    /**
     * Constructs a Tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    /**
     * Constructs a Mood object
     *
     * @param mood mood linked with tweet
     */
    public void addMood(Mood mood){
        moodList.add(mood);
    }

    /**
     * Gets a message and returns it
     *
     * @return message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets the tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets the Tweet date
     *
     * @return tweet date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Converts Tweet into a string format
     *
     * @return
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

    public abstract Boolean isImportant();
}
