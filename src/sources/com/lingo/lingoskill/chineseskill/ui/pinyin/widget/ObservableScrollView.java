package com.lingo.lingoskill.chineseskill.ui.pinyin.widget;

import aj.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import hj.t4;
import kotlin.jvm.internal.m;
import ta.a;
import ui.m0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f21749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f21750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableScrollView(Context context) {
        super(context);
        m.f(context, DytezVyM.AwYiojECP);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        g gVar = this.f21750b;
        if (gVar != null) {
            m.c(gVar);
            m0 m0Var = (m0) gVar;
            a aVar = m0Var.f36400f;
            m.c(aVar);
            if (equals(((t4) aVar).f33345f)) {
                a aVar2 = m0Var.f36400f;
                m.c(aVar2);
                ObservableScrollView observableScrollView = ((t4) aVar2).f33347h;
                m.c(observableScrollView);
                observableScrollView.scrollTo(i11, i12);
            }
        }
        View view = this.f21749a;
        if (view != null) {
            m.c(view);
            view.scrollTo(i11, i12);
        }
    }

    public final void setScrollView(View view) {
        m.f(view, "view");
        this.f21749a = view;
    }

    public final void setScrollViewListener(g scrollViewListener) {
        m.f(scrollViewListener, "scrollViewListener");
        this.f21750b = scrollViewListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableScrollView(Context context, AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        m.f(context, "context");
        m.f(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        m.f(context, "context");
        m.f(attrs, "attrs");
    }
}
