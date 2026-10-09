package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzde f12330a;

    @Override // java.lang.Runnable
    public final void run() {
        zzcz zzczVar;
        zzcj.zzc zzcVar;
        zzde zzdeVar = this.f12330a;
        if (zzdeVar == null || (zzczVar = zzdeVar.H) == null) {
            return;
        }
        this.f12330a = null;
        if (zzczVar.isDone()) {
            Object obj = zzdeVar.f12306a;
            if (obj == null) {
                if (zzczVar.isDone()) {
                    if (zzck.f12305t.f(zzdeVar, null, zzcj.g(zzczVar))) {
                        zzcj.i(zzdeVar);
                        return;
                    }
                    return;
                }
                zzcj.zzb zzbVar = new zzcj.zzb(zzdeVar, zzczVar);
                if (zzck.f12305t.f(zzdeVar, null, zzbVar)) {
                    try {
                        zzczVar.h0(zzbVar, zzcp.zza);
                        return;
                    } catch (Throwable th2) {
                        try {
                            zzcVar = new zzcj.zzc(th2);
                        } catch (Error | Exception unused) {
                            zzcVar = zzcj.zzc.f12295b;
                        }
                        zzck.f12305t.f(zzdeVar, zzbVar, zzcVar);
                        return;
                    }
                }
                obj = zzdeVar.f12306a;
            }
            if (obj instanceof zzcj.zza) {
                zzczVar.cancel(((zzcj.zza) obj).f12291a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzdeVar.K;
            zzdeVar.K = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th3) {
                    if (zzck.f12305t.f(zzdeVar, null, new zzcj.zzc(new zzdc(str)))) {
                        zzcj.i(zzdeVar);
                    }
                    throw th3;
                }
            }
            if (zzck.f12305t.f(zzdeVar, null, new zzcj.zzc(new zzdc(str + ": " + zzczVar.toString())))) {
                zzcj.i(zzdeVar);
            }
            zzczVar.cancel(true);
        } catch (Throwable th4) {
            zzczVar.cancel(true);
            throw th4;
        }
    }
}
