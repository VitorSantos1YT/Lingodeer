package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzaem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile zzafc f11280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zzacr f11281b;

    public final int a() {
        if (this.f11281b != null) {
            return this.f11281b.d();
        }
        if (this.f11280a != null) {
            return this.f11280a.h();
        }
        return 0;
    }

    public final zzacr b() {
        if (this.f11281b != null) {
            return this.f11281b;
        }
        synchronized (this) {
            try {
                if (this.f11281b != null) {
                    return this.f11281b;
                }
                if (this.f11280a == null) {
                    this.f11281b = zzacr.f11213b;
                } else {
                    this.f11281b = this.f11280a.c();
                }
                return this.f11281b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(zzafc zzafcVar) {
        if (this.f11280a != null) {
            return;
        }
        synchronized (this) {
            if (this.f11280a != null) {
                return;
            }
            try {
                this.f11280a = zzafcVar;
                this.f11281b = zzacr.f11213b;
            } catch (zzaeh unused) {
                this.f11280a = zzafcVar;
                this.f11281b = zzacr.f11213b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaem)) {
            return false;
        }
        zzaem zzaemVar = (zzaem) obj;
        zzafc zzafcVar = this.f11280a;
        zzafc zzafcVar2 = zzaemVar.f11280a;
        if (zzafcVar == null && zzafcVar2 == null) {
            return b().equals(zzaemVar.b());
        }
        if (zzafcVar != null && zzafcVar2 != null) {
            return zzafcVar.equals(zzafcVar2);
        }
        if (zzafcVar != null) {
            zzaemVar.c(zzafcVar.a());
            return zzafcVar.equals(zzaemVar.f11280a);
        }
        c(zzafcVar2.a());
        return this.f11280a.equals(zzafcVar2);
    }

    public int hashCode() {
        return 1;
    }
}
