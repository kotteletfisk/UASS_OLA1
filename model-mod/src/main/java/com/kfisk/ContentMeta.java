package com.kfisk;

/**
 *
 * @author kotteletfisk
 */
public class ContentMeta {
    public int id;
    public String title;
    public String yop;
    public String genre;
    public int rating;

    public ContentMeta(int id, String title, String yop, String genre, int rating){
        this.id = id;
        this.title = title;
        this.yop = yop;
        this.genre = genre;
        this.rating = rating;
    }
}
