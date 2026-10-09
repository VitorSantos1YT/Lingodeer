package xb;

import m00.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.e f56003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m00.k f56005c;

    public q(m00.k kVar, com.bumptech.glide.e eVar) {
        this.f56003a = eVar;
        this.f56005c = kVar;
    }

    @Override // xb.o
    public final com.bumptech.glide.e a() {
        return this.f56003a;
    }

    @Override // xb.o
    public final synchronized m00.k b() {
        m00.k kVar;
        try {
            if (this.f56004b) {
                throw new IllegalStateException("closed");
            }
            kVar = this.f56005c;
            if (kVar == null) {
                x xVar = m00.o.f40737a;
                kotlin.jvm.internal.m.c(null);
                xVar.y(null);
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return kVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f56004b = true;
        m00.k kVar = this.f56005c;
        if (kVar != null) {
            kc.h.a(kVar);
        }
    }
}
