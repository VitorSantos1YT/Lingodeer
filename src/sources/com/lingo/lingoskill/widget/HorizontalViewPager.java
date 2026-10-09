package com.lingo.lingoskill.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class HorizontalViewPager extends ViewPager {
    public int K0;
    public int L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalViewPager(Context context) {
        super(context);
        m.f(context, "context");
        this.K0 = -1;
        this.L0 = -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev2) {
        m.f(ev2, "ev");
        int rawX = (int) ev2.getRawX();
        int rawY = (int) ev2.getRawY();
        int action = ev2.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            int iAbs = Math.abs(rawX - this.K0);
            int iAbs2 = Math.abs(rawY - this.L0);
            this.K0 = rawX;
            this.L0 = rawY;
            if (iAbs >= iAbs2) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(ev2);
    }

    public final int getLastX() {
        return this.K0;
    }

    public final int getLastY() {
        return this.L0;
    }

    public final void setLastX(int i11) {
        this.K0 = i11;
    }

    public final void setLastY(int i11) {
        this.L0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        this.K0 = -1;
        this.L0 = -1;
    }
}
