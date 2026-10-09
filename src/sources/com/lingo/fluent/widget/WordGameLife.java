package com.lingo.fluent.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.lingodeer.R;
import fr.j3;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WordGameLife extends LinearLayout {
    public static final int $stable = 8;
    private int activeRes;
    private int greRes;
    private int index;
    private int life;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordGameLife(Context context) {
        super(context);
        m.f(context, "context");
        this.greRes = R.drawable.ic_game_word_listen_life_grey;
        this.activeRes = R.drawable.ic_game_word_listen_life;
        init();
    }

    private final void setTotalLife(int i11) {
        removeAllViews();
        for (int i12 = 0; i12 < i11; i12++) {
            ImageView imageView = new ImageView(getContext());
            imageView.setBackgroundResource(this.greRes);
            imageView.setImageResource(this.activeRes);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i12 > 0) {
                Context context = getContext();
                m.e(context, "getContext(...)");
                layoutParams.setMargins((int) j3.Z(6, context), 0, 0, 0);
            }
            imageView.setLayoutParams(layoutParams);
            addView(imageView);
        }
        this.life = getChildCount();
    }

    public final int getLife() {
        return this.life;
    }

    public final void init() {
        this.index = 0;
        setTotalLife(3);
    }

    public final void removeOneLife() {
        if (this.index < getChildCount()) {
            View childAt = getChildAt(this.index);
            m.d(childAt, "null cannot be cast to non-null type android.widget.ImageView");
            this.life = getChildCount() - this.index;
            ((ImageView) childAt).setImageResource(0);
            this.index++;
        }
    }

    public final void setActiveRes(int i11) {
        this.activeRes = i11;
    }

    public final void setGreyRes(int i11) {
        this.greRes = i11;
    }

    public final void setLife(int i11) {
        this.life = i11;
    }

    public final void init(int i11) {
        this.index = 0;
        setTotalLife(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordGameLife(Context context, AttributeSet attrs) {
        super(context, attrs);
        m.f(context, "context");
        m.f(attrs, "attrs");
        this.greRes = R.drawable.ic_game_word_listen_life_grey;
        this.activeRes = R.drawable.ic_game_word_listen_life;
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordGameLife(Context context, AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        m.f(context, "context");
        m.f(attrs, "attrs");
        this.greRes = R.drawable.ic_game_word_listen_life_grey;
        this.activeRes = R.drawable.ic_game_word_listen_life;
        init();
    }
}
