package kx;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38915c;

    public l(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f38913a + '-' + incrementAndGet();
        Thread mVar = this.f38915c ? new dy.m(runnable, str, 1) : new Thread(runnable, str);
        mVar.setPriority(this.f38914b);
        mVar.setDaemon(true);
        return mVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return ep.a.k(new StringBuilder("RxThreadFactory["), this.f38913a, "]");
    }

    public l(String str, int i11, boolean z11) {
        this.f38913a = str;
        this.f38914b = i11;
        this.f38915c = z11;
    }
}
