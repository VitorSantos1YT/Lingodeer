package v4;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import rz.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f53509a;

    public c(m mVar) {
        super(false);
        this.f53509a = mVar;
    }

    public final void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            this.f53509a.resumeWith(com.bumptech.glide.e.l(th2));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f53509a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
