

package com.up.stack.app.main;

import com.up.stack.app.database.GiphyOBox;

import java.util.List;

public interface MainView {

    void showProgress();

    void hideProgress();

    void setItems(List<GiphyOBox> items);

    void showMessage(String message);
}
