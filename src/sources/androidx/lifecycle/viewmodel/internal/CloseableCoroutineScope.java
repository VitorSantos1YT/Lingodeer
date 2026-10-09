package androidx.lifecycle.viewmodel.internal;

import kotlin.jvm.internal.m;
import rz.b0;
import rz.e0;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CloseableCoroutineScope implements AutoCloseable, b0 {
    private final i coroutineContext;

    public CloseableCoroutineScope(i coroutineContext) {
        m.f(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        e0.j(getCoroutineContext(), null);
    }

    @Override // rz.b0
    public i getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(b0 coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        m.f(coroutineScope, "coroutineScope");
    }
}
