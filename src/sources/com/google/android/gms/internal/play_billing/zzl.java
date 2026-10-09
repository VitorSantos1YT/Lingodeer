package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzl extends zzd {
    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void a(zzm zzmVar, zzm zzmVar2) {
        zzmVar.f12478b = zzmVar2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void b(zzm zzmVar, Thread thread) {
        zzmVar.f12477a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean c(zzo zzoVar, zzh zzhVar, zzh zzhVar2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.f12484b != zzhVar) {
                    return false;
                }
                zzoVar.f12484b = zzhVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean d(zzo zzoVar, Object obj, Object obj2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.f12483a != obj) {
                    return false;
                }
                zzoVar.f12483a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean e(zzo zzoVar, zzm zzmVar, zzm zzmVar2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.f12485c != zzmVar) {
                    return false;
                }
                zzoVar.f12485c = zzmVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
