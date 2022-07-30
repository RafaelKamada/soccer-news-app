package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        news = new MutableLiveData<>();

        // TODO remover mocks de notícias;
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária Tem Desfalque Importante","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.."));
        news.add(new News("Ferroviária Joga no Sábado","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.."));
        news.add(new News("Copa do Mundo Feminina Está Terminando","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.."));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}