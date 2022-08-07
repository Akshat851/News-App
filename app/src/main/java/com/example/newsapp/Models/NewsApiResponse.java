package com.example.newsapp.Models;

import java.io.Serializable;
import java.util.List;

public class NewsApiResponse implements Serializable {
    String status;
    int totalResults;
    List<com.example.newsapp.Models.NewsHeadline> articles;

    public String getStatus() {
        return status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public List<com.example.newsapp.Models.NewsHeadline> getArticles() {
        return articles;
    }
}
