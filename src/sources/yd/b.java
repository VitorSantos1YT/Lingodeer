package yd;

import aw.t;
import dy.m;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f57734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57735b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f57737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f57738e = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f57736c = c.f57739a;

    public b(a aVar, String str, boolean z11) {
        this.f57734a = aVar;
        this.f57735b = str;
        this.f57737d = z11;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        t tVar = new t(26, this, runnable);
        this.f57734a.getClass();
        m mVar = new m(tVar);
        mVar.setName("glide-" + this.f57735b + "-thread-" + this.f57738e.getAndIncrement());
        return mVar;
    }
}
