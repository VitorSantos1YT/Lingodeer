package androidx.fragment.app;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1741b;

    public boolean a() {
        return this instanceof i;
    }

    public abstract void b(ViewGroup viewGroup);

    public abstract void c(ViewGroup viewGroup);

    public void d(f.a backEvent, ViewGroup container) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        kotlin.jvm.internal.m.f(container, "container");
    }

    public void e(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
    }
}
