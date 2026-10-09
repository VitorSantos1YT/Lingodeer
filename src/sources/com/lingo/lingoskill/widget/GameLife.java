package com.lingo.lingoskill.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.lingodeer.R;
import ff.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class GameLife extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22099b;

    public GameLife(Context context) {
        super(context);
        this.f22099b = 0;
        setTotalLife(4);
    }

    public final void a() {
        if (this.f22099b < getChildCount()) {
            ImageView imageView = (ImageView) getChildAt(this.f22099b);
            this.f22098a = getChildCount() - this.f22099b;
            imageView.setImageResource(0);
            this.f22099b++;
        }
    }

    public int getLife() {
        return this.f22098a;
    }

    public void setTotalLife(int i11) {
        removeAllViews();
        for (int i12 = 0; i12 < i11; i12++) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.ic_game_life);
            imageView.setBackgroundResource(R.drawable.ic_game_life_grey);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i12 > 0) {
                layoutParams.setMargins(h.l(2.0f), 0, 0, 0);
            }
            imageView.setLayoutParams(layoutParams);
            addView(imageView);
        }
        this.f22098a = getChildCount();
    }

    public GameLife(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22099b = 0;
        setTotalLife(4);
    }

    public GameLife(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f22099b = 0;
        setTotalLife(4);
    }
}
