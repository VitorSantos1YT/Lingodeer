package dy;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24602c;

    public n(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f24600a + '-' + incrementAndGet();
        Thread mVar = this.f24602c ? new m(runnable, str, 0) : new Thread(runnable, str);
        mVar.setPriority(this.f24601b);
        mVar.setDaemon(true);
        return mVar;
    }

    public n(String str, int i11, boolean z11) {
        this.f24600a = str;
        this.f24601b = i11;
        this.f24602c = z11;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return ep.a.k(new StringBuilder(PQgum.GphK), this.f24600a, "]");
    }
}
