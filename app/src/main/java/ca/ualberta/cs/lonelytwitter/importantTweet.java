/*
 * Copyright 2017 Team Me, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact nkryzano@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import android.text.BoringLayout;

import java.util.Date;

/**
 * Represents a normal tweet
 *
 * @author noahkryzanowski
 * @version 1.5
 * @see Tweet
 * @since 1.0
 *
 */
public class importantTweet extends Tweet {
    /**
     * Creates an important tweet
     *
     * @param message
     */
    public importantTweet(String message){
        super(message);
    }

    /**
     * Creates an important tweet
     *
     * @param message
     * @param date
     */
    public importantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Creates whether it is important or not
     *
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
