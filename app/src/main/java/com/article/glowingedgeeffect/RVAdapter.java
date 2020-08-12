package com.article.glowingedgeeffect;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {

    private final static int MOCK_ADAPTER_SIZE = 1;

    @Override
    public RVAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_text_view, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return MOCK_ADAPTER_SIZE;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ViewHolder(TextView v) {
            super(v);
            applyGlowing(v);
            textView = v;
        }
    }

    private static void applyGlowing(TextView tv) {
        float radius = tv.getTextSize() * 0.5f;
        tv.setShadowLayer(radius, 0, 0, Color.RED);
    }
}
