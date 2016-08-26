package com.example.ultrapc.prophetsstories;

/**
 * Created by Ultrapc on 25/08/2016.
 */
public class Story {

    private String StroyTitle;
    private String Stroy;

    public Story() {
    }

    public Story(String stroyTitle, String stroy) {
        StroyTitle = stroyTitle;
        Stroy = stroy;
    }

    public String getStroyTitle() {
        return StroyTitle;
    }

    public void setStroyTitle(String stroyTitle) {
        StroyTitle = stroyTitle;
    }

    public String getStroy() {
        return Stroy;
    }

    public void setStroy(String stroy) {
        Stroy = stroy;
    }
}
