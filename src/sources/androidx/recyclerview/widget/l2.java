package androidx.recyclerview.widget;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f2520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2521g;

    public l2(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2521g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2515a = -1;
        this.f2516b = Integer.MIN_VALUE;
        this.f2517c = false;
        this.f2518d = false;
        this.f2519e = false;
        int[] iArr = this.f2520f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
