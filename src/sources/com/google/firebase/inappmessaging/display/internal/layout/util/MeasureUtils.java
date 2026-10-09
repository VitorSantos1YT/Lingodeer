package com.google.firebase.inappmessaging.display.internal.layout.util;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MeasureUtils {
    public static void a(View view, int i11, int i12, int i13, int i14) {
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        if (view.getVisibility() == 8) {
            i11 = 0;
            i12 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, i13), View.MeasureSpec.makeMeasureSpec(i12, i14));
        view.getMeasuredWidth();
        view.getMeasuredHeight();
    }

    public static void b(View view, int i11, int i12) {
        a(view, i11, i12, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
