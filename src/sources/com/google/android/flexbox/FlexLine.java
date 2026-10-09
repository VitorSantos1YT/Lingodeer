package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class FlexLine {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f8247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f8248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8249l;
    public int m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8254r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8238a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8239b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8240c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8241d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f8250n = new ArrayList();

    public final int a() {
        return this.f8245h - this.f8246i;
    }

    public final void b(View view, int i11, int i12, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f8238a = Math.min(this.f8238a, (view.getLeft() - flexItem.j0()) - i11);
        this.f8239b = Math.min(this.f8239b, (view.getTop() - flexItem.w0()) - i12);
        this.f8240c = Math.max(this.f8240c, view.getRight() + flexItem.Y0() + i13);
        this.f8241d = Math.max(this.f8241d, view.getBottom() + flexItem.h0() + i14);
    }
}
