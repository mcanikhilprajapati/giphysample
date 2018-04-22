package com.up.stack.app.main;

import com.up.stack.app.database.GiphyOBox;

import java.util.List;

public interface FindItemsInteractor {

    void findItems(OnFinishedListener listener,String tofind);

    interface OnFinishedListener {
        void onFinished(List<GiphyOBox> data);
        void onFail(String errorMessage);
    }

}
