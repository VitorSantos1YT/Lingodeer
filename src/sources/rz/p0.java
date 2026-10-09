package rz;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f50942a;

    public p0(ScheduledFuture scheduledFuture) {
        this.f50942a = scheduledFuture;
    }

    @Override // rz.q0
    public final void dispose() {
        this.f50942a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f50942a + ']';
    }
}
