package com.behappy.hchen.androidlearningpath.reactiveandroid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.behappy.hchen.androidlearningpath.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Hang Chen on 7/13/2017.
 */

public class StockUpdateViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.stock_item_symbol)
    TextView stockSymbol;

    public StockUpdateViewHolder(View v) {
        super(v);
        ButterKnife.bind(this, v);
    }

}
