/*
 * Copyright 2017 Team Me, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact nkryzano@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Good mood
 *
 * @author noahkryzanowski
 * @version 1.5
 * @see NormalTweet
 * @see importantTweet
 * @since 1.0
 *
 */
public class GoodMood extends Mood {
    /**
     * Creates a good mood
     *
     */
    public GoodMood(){
        super();
    }

    /**
     * Creates a good mood
     *
     * @param date
     */
    public GoodMood(Date date){
        super(date);
    }

    /**
     * Returns a good mood
     *
     * @return
     */
    @Override
    public String isGoodMood(){
        return "Good";
    }
}
