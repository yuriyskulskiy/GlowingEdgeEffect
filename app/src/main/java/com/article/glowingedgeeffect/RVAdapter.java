package com.article.glowingedgeeffect;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {

    private final static int MOCK_ADAPTER_SIZE = 1;

    // Create new views (invoked by the layout manager)
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
        // each data item is just a string in this case
        public TextView textView;

        public ViewHolder(TextView v) {
            super(v);
            applyBlurMaskFilter(v, BlurMaskFilter.Blur.NORMAL);
            textView = v;
        }
    }

    private static void applyBlurMaskFilter(TextView tv, BlurMaskFilter.Blur style) {
//        tv.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        float radius = tv.getTextSize() * 0.5f;
//        float radius = 5;
        BlurMaskFilter filter = new BlurMaskFilter(radius, style);
        tv.setShadowLayer(radius, 0, 0, Color.RED);
//        tv.getPaint().setMaskFilter(filter);
    }
}
