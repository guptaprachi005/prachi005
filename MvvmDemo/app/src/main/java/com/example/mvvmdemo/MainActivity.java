package com.example.mvvmdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mvvmdemo.adapter.NewsAdapter;
import com.example.mvvmdemo.databinding.ActivityMainBinding;
import com.example.mvvmdemo.viewmodel.NewsModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private NewsModel newsModel;
    private ArrayList<NewsModel> newsModelArrayList;
    private NewsAdapter newsAdapter;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        newsModel = new NewsModel();
        newsModelArrayList = newsModel.getArrayListNews();
        newsAdapter = new NewsAdapter(this, newsModelArrayList);
        activityMainBinding.listview.setAdapter(newsAdapter);

    }
}

