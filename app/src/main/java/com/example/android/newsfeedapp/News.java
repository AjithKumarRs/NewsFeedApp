package com.example.android.newsfeedapp;

/**
 * Created by serka on 7.04.2018.
 */

public class News {

    private String mSectionName;
    private String mWebPublicationDate;
    private String mWebTitle;
    private String mWebUrl;
    private String mAuthorName;

    public News(String sectionName, String webPublicationDate, String webTitle, String webUrl, String authorName) {
        mSectionName = sectionName;
        mWebPublicationDate = webPublicationDate;
        mWebTitle = webTitle;
        mWebUrl = webUrl;
        mAuthorName = authorName;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    public String getWebTitle() {
        return mWebTitle;
    }

    public String getWebUrl() {
        return mWebUrl;
    }

    public String getAuthorName() {
        return mAuthorName;
    }
}
