package com.behappy.hchen.androidlearningpath.reactiveandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.behappy.hchen.androidlearningpath.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class ReactiveMain extends Activity {

    public static final String TAG = "ReactiveMain";

    @BindView(R.id.hello_world_salute)
    TextView helloText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reactive_main);

        ButterKnife.bind(this);
        Log.d(TAG, "onCreate: just before Observable");
        Observable.just("Hello! Please use this app")
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        helloText.setText(s);
                    }
                });

    }

}
