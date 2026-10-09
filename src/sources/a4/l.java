package a4;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements ListenableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f352b = new k(this);

    public l(i iVar) {
        this.f351a = new WeakReference(iVar);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void N(Runnable runnable, Executor executor) {
        this.f352b.N(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        i iVar = (i) this.f351a.get();
        boolean zCancel = this.f352b.cancel(z11);
        if (zCancel && iVar != null) {
            iVar.f347a = null;
            iVar.f348b = null;
            iVar.f349c.k(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f352b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f352b.f344a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f352b.isDone();
    }

    public final String toString() {
        return this.f352b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        return this.f352b.get(j11, timeUnit);
    }
}
