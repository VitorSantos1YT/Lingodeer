package vx;

import java.util.concurrent.Callable;
import tx.d;
import tx.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Callable, f, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f54311a;

    public a(StringBuilder sb2) {
        this.f54311a = sb2;
    }

    @Override // tx.d
    public final Object apply(Object obj) {
        return this.f54311a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f54311a;
    }

    @Override // tx.f
    public final Object get() {
        return this.f54311a;
    }
}
