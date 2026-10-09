package kx;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends uw.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f38909b = new l("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f38910a = f38909b;

    @Override // uw.n
    public final uw.m a() {
        return new k(this.f38910a);
    }
}
