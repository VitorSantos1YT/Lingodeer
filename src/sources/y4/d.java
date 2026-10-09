package y4;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b4.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f57090c;

    public d(int i11) {
        super(i11);
        this.f57090c = new Object();
    }

    @Override // b4.d, y4.c
    public final Object acquire() {
        Object objAcquire;
        synchronized (this.f57090c) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }

    @Override // b4.d, y4.c
    public final boolean c(Object instance) {
        boolean zC;
        m.f(instance, "instance");
        synchronized (this.f57090c) {
            zC = super.c(instance);
        }
        return zC;
    }
}
