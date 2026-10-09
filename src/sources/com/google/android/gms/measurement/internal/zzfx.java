package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfx {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f12830f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbo f12832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12834d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f12835e = null;

    public /* synthetic */ zzfx(String str, Object obj, zzbo zzboVar) {
        this.f12831a = str;
        this.f12833c = obj;
        this.f12832b = zzboVar;
    }

    public final Object a(Object obj) {
        synchronized (this.f12834d) {
        }
        if (obj != null) {
            return obj;
        }
        if (zzfr.f12824a == null) {
            return this.f12833c;
        }
        synchronized (f12830f) {
            try {
                if (zzae.a()) {
                    return this.f12835e == null ? this.f12833c : this.f12835e;
                }
                try {
                    for (zzfx zzfxVar : zzfy.f12836a) {
                        if (zzae.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            zzbo zzboVar = zzfxVar.f12832b;
                            if (zzboVar != null) {
                                objZza = zzboVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f12830f) {
                            zzfxVar.f12835e = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                zzbo zzboVar2 = this.f12832b;
                if (zzboVar2 != null) {
                    try {
                        return zzboVar2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f12833c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
