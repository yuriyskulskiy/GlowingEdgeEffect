package com.article.glowingedgeeffect.custom;

import android.content.Context;
import android.widget.EdgeEffect;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GlowingEdgeEffectFactory extends RecyclerView.EdgeEffectFactory {

    public final GlowingEdgeEffect edgeEffect;

    public GlowingEdgeEffectFactory(Context context) {
        edgeEffect = new GlowingEdgeEffect(context);
    }

    @NonNull
    @Override
    protected EdgeEffect createEdgeEffect(@NonNull RecyclerView view, int direction) {
        return edgeEffect;
    }
}
