package androidx.fragment.app;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f1840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f1841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f1842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1 f1843d;

    public u0(p0 p0Var) {
        Handler handler = new Handler();
        this.f1840a = p0Var;
        this.f1841b = p0Var;
        this.f1842c = handler;
        this.f1843d = new l1();
    }
}
