package com.lingo.lingoskill.chineseskill.ui.pinyin.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableHorizonalScrollView extends HorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f21748a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableHorizonalScrollView(Context context) {
        super(context);
        m.f(context, "context");
    }

    @Override // android.view.View
    public final void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        View view = this.f21748a;
        if (view != null) {
            m.c(view);
            view.scrollTo(i11, i12);
        }
    }

    public final void setScrollView(View view) {
        m.f(view, "view");
        this.f21748a = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableHorizonalScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        m.f(context, "context");
        m.f(attrs, "attrs");
    }
}
