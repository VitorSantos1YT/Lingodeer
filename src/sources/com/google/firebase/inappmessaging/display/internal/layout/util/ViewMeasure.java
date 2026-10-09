package com.google.firebase.inappmessaging.display.internal.layout.util;

import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ViewMeasure {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f19945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19947c;

    public final int a() {
        View view = this.f19945a;
        if (view.getVisibility() == 8) {
            return 0;
        }
        if (!(view instanceof ScrollView)) {
            return view.getMeasuredHeight();
        }
        ScrollView scrollView = (ScrollView) view;
        return scrollView.getChildAt(0).getMeasuredHeight() + scrollView.getPaddingTop() + scrollView.getPaddingBottom();
    }
}
