package com.google.android.material.appbar;

import android.view.View;
import java.util.WeakHashMap;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class ViewOffsetHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f13861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13864d;

    public ViewOffsetHelper(View view) {
        this.f13861a = view;
    }

    public final void a() {
        int i11 = this.f13864d;
        View view = this.f13861a;
        int top = i11 - (view.getTop() - this.f13862b);
        WeakHashMap weakHashMap = s0.f58893a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f13863c));
    }

    public final boolean b(int i11) {
        if (this.f13864d == i11) {
            return false;
        }
        this.f13864d = i11;
        a();
        return true;
    }
}
