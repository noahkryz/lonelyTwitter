/*
 * Copyright 2017 Team Me, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact nkryzano@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a mood
 *
 * @author noahkryzanowski
 * @version 1.5
 * @see Tweet
 * @since 1.0
 *
 */
public abstract class Mood {
    private Date date;

    /**
     * Creates a Tweet mood
     *
     */
    public Mood() {
        date = new Date();
    }

    /**
     * Creates a Tweet mood
     *
     * @param date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * Gets a date for the Mood
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date for the Mood
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Creates a Mood
     *
     * @return
     */
    public abstract String isGoodMood();
}
