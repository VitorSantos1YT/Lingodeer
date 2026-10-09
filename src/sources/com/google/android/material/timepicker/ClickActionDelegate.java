package com.google.android.material.timepicker;

import a5.g;
import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class ClickActionDelegate extends z4.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a5.c f15754d;

    public ClickActionDelegate(Context context, int i11) {
        this.f15754d = new a5.c(16, context.getString(i11));
    }

    @Override // z4.b
    public void d(View view, g gVar) {
        this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
        gVar.b(this.f15754d);
    }
}
