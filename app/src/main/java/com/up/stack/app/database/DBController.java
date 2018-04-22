package com.up.stack.app.database;

import android.app.Activity;
import android.app.Application;

import com.up.stack.app.AppApplication;

import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;
import io.objectbox.query.Query;


public class DBController {

    private static DBController instance;
    private Box<GiphyOBox> giphyBox;
    private Query<GiphyOBox> notesQuery;

    public DBController(Application application) {
        BoxStore boxStore = AppApplication.getInstance().getBoxStore();
        giphyBox = boxStore.boxFor(GiphyOBox.class);
        notesQuery = giphyBox.query().build();
    }


    public static DBController with(Activity activity) {

        if (instance == null) {
            instance = new DBController(activity.getApplication());
        }
        return instance;
    }


    public static DBController getInstance() {
        return instance;
    }


    public List<GiphyOBox> getAlldata() {
        return notesQuery.find();
    }

    public void save(GiphyOBox giphyOBox) {
        giphyBox.put(giphyOBox);
    }

    public void update(GiphyOBox giphyOBox) {
        giphyBox.put(giphyOBox);
    }

}