package ca.ualberta.cs.lonelytwitter;

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
public class NormalTweet extends Tweet  {
    /**
     * Creates a normal tweet
     *
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Creates a normal tweet
     *
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Creates whether it is important or not
     *
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
