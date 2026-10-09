package w6;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import wc.a0;
import wc.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends FutureTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54657a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f54658b;

    public /* synthetic */ b(Callable callable) {
        super(callable);
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.f54657a) {
            case 0:
                a aVar = (a) this.f54658b;
                AtomicBoolean atomicBoolean = aVar.f54655d;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    aVar.b(obj);
                    return;
                } catch (InterruptedException unused) {
                    return;
                } catch (CancellationException unused2) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    aVar.b(null);
                    return;
                } catch (ExecutionException e8) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e8.getCause());
                } catch (Throwable th2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th2);
                }
            default:
                try {
                    if (!isCancelled()) {
                        try {
                            ((b0) this.f54658b).d((a0) get());
                        } catch (InterruptedException | ExecutionException e10) {
                            ((b0) this.f54658b).d(new a0(e10));
                        }
                        break;
                    }
                    return;
                } finally {
                    this.f54658b = null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ax.c cVar) {
        super(cVar);
        this.f54658b = aVar;
    }
}
