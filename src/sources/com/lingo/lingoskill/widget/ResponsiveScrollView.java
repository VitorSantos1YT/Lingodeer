package com.lingo.lingoskill.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import py.b;
import vq.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ResponsiveScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f22127k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f22128l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final b f22129m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public m f22130n0;

    public ResponsiveScrollView(Context context) {
        this(context, null, 0);
        this.f22129m0 = new b(this, 10);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        if (this.f22130n0 != null) {
            if (this.f22127k0 == -1) {
                postDelayed(this.f22129m0, this.f22128l0);
            }
            this.f22127k0 = System.currentTimeMillis();
        }
    }

    public void setOnScrollChangedListener(m mVar) {
        this.f22130n0 = mVar;
    }

    public void setScrollTaskInterval(int i11) {
        this.f22128l0 = i11;
    }

    public ResponsiveScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f22129m0 = new b(this, 10);
    }

    public ResponsiveScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f22127k0 = -1L;
        this.f22128l0 = 100;
        this.f22129m0 = new b(this, 10);
    }
}
