package com.up.stack.app.main;

import com.up.stack.app.AppApplication;
import com.up.stack.app.database.GiphyOBox;
import com.up.stack.app.model.response.GetGiphy;
import com.up.stack.app.retrofit.ApiClient;
import com.up.stack.app.retrofit.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FindItemsInteractorImpl implements FindItemsInteractor {
    @Override
    public void findItems(final OnFinishedListener listener, String tofind) {


        if (!AppApplication.networkConnectivity.isNetworkAvailable())
            listener.onFail("Please Connect Internet");
        ApiClient.getClient().create(ApiInterface.class).getGiphy(tofind, "2R9DJPARIpK8MixQ3kI2UVjjQf3WsqBR").enqueue(new Callback<GetGiphy>() {
            @Override
            public void onResponse(Call<GetGiphy> call, Response<GetGiphy> response) {

                if (response.isSuccessful()) {
                    GetGiphy getGiphy = response.body();
                    if (getGiphy != null) {
                        if (getGiphy.getData().size() > 0) {
                            List<GiphyOBox> data = new ArrayList<>();
                            for (int i = 0; i < getGiphy.getData().size(); i++) {

                                String id = getGiphy.getData().get(i).getId();
                                String videoURl = getGiphy.getData().get(i).getImages().getFixedHeight().getMp4();
                                String thumbs = getGiphy.getData().get(i).getImages().get480wStill().getUrl();
                                String gifurl = getGiphy.getData().get(i).getImages().getFixedHeightStill().getUrl();

                                data.add(new GiphyOBox(id, gifurl, videoURl, thumbs));
                            }
                            listener.onFinished(data);
                        }
                    }
                } else {
                    listener.onFail("Something went wrong,Please contact admin");
                }
            }

            @Override
            public void onFailure(Call<GetGiphy> call, Throwable t) {
                listener.onFail(t.getMessage());
            }
        });
    }


}
