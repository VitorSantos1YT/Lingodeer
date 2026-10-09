package kx;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends a implements Callable {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = a.f38873c;
        this.f38876b = Thread.currentThread();
        try {
            this.f38875a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f38876b = null;
        }
    }
}
