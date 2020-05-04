package com.example.mvvmdemo.viewmodel;

import com.example.mvvmdemo.Model.News;

import java.util.ArrayList;

public class NewsModel {

    public String header;


    public NewsModel(News news) {
        this.header = news.header;

    }

    public NewsModel() {
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }


    public ArrayList<NewsModel> getArrayListNews() {
        ArrayList<NewsModel> newsModelArrayList = new ArrayList<>();

        NewsModel newsModel1 = new NewsModel(new News("Mercury"));
        NewsModel newsModel2 = new NewsModel(new News("Earth"));
        NewsModel newsModel3 = new NewsModel(new News("Mars"));
        NewsModel newsModel4 = new NewsModel(new News("Jupiter"));
        NewsModel newsModel5 = new NewsModel(new News("Saturn"));
        NewsModel newsModel6 = new NewsModel(new News("Uranus"));
        NewsModel newsModel7 = new NewsModel(new News("Neptune"));
        NewsModel newsModel8 = new NewsModel(new News("Venus"));
        NewsModel newsModel9 = new NewsModel(new News("Stars"));
        NewsModel newsModel10 = new NewsModel(new News("Moon"));

        newsModelArrayList.add(newsModel1);
        newsModelArrayList.add(newsModel2);
        newsModelArrayList.add(newsModel3);
        newsModelArrayList.add(newsModel4);
        newsModelArrayList.add(newsModel5);
        newsModelArrayList.add(newsModel6);
        newsModelArrayList.add(newsModel7);
        newsModelArrayList.add(newsModel8);
        newsModelArrayList.add(newsModel9);
        newsModelArrayList.add(newsModel10);

        return newsModelArrayList;
    }
}
