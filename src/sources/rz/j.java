package rz;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f50916b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f50915a = i11;
        this.f50916b = obj;
    }

    @Override // rz.k
    public final void a(Throwable th2) {
        switch (this.f50915a) {
            case 0:
                ((ScheduledFuture) this.f50916b).cancel(false);
                break;
            case 1:
                ((fz.c) this.f50916b).invoke(th2);
                break;
            default:
                ((q0) this.f50916b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f50915a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f50916b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((fz.c) this.f50916b).getClass().getSimpleName() + '@' + e0.r(this) + ']';
            default:
                return "DisposeOnCancel[" + ((q0) this.f50916b) + ']';
        }
    }
}
