package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile zzgl f12387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zzei f12388b;

    public final int a() {
        if (this.f12388b != null) {
            return ((zzeg) this.f12388b).f12349c.length;
        }
        if (this.f12387a != null) {
            return this.f12387a.zzj();
        }
        return 0;
    }

    public final zzei b() {
        if (this.f12388b != null) {
            return this.f12388b;
        }
        synchronized (this) {
            try {
                if (this.f12388b != null) {
                    return this.f12388b;
                }
                if (this.f12387a == null) {
                    this.f12388b = zzei.f12350b;
                } else {
                    this.f12388b = this.f12387a.zzf();
                }
                return this.f12388b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(zzgl zzglVar) {
        if (this.f12387a != null) {
            return;
        }
        synchronized (this) {
            if (this.f12387a != null) {
                return;
            }
            try {
                this.f12387a = zzglVar;
                this.f12388b = zzei.f12350b;
            } catch (zzfq unused) {
                this.f12387a = zzglVar;
                this.f12388b = zzei.f12350b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfw)) {
            return false;
        }
        zzfw zzfwVar = (zzfw) obj;
        zzgl zzglVar = this.f12387a;
        zzgl zzglVar2 = zzfwVar.f12387a;
        if (zzglVar == null && zzglVar2 == null) {
            return b().equals(zzfwVar.b());
        }
        if (zzglVar != null && zzglVar2 != null) {
            return zzglVar.equals(zzglVar2);
        }
        if (zzglVar != null) {
            zzfwVar.c(zzglVar.zzh());
            return zzglVar.equals(zzfwVar.f12387a);
        }
        c(zzglVar2.zzh());
        return this.f12387a.equals(zzglVar2);
    }

    public int hashCode() {
        return 1;
    }
}
