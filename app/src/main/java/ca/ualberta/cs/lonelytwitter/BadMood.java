/*
 * Copyright 2017 Team Me, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact nkryzano@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Bad Mood
 *
 * @author noahkryzanowski
 * @version 1.5
 * @see Mood
 * @since 1.0
 */
public class BadMood extends Mood{
    /**
     * Creates a bad mood
     *
     */
    public BadMood(){
        super();
    }

    /**
     * Creates a bad mood
     *
     * @param date
     */
    public BadMood(Date date){
        super(date);
    }

    /**
     * Returns a bad mood
     *
     * @return
     */
    @Override
    public String isGoodMood(){
        return "Bad";
    }
}
