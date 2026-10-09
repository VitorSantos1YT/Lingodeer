package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import rz.e0;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j11, d dVar) {
        return zzcv.zzh(zza(application), str, j11, null, null, null, dVar, 28, null);
    }

    public static final Task zzc(Application application, String str, long j11) {
        return zzas.zza(e0.f(zza(application).zzd().zza(), null, null, new zzco(application, str, j11, null), 3));
    }

    public static final Object zzd(Application application, String str, d dVar) {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, dVar, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzas.zza(e0.f(zza(application).zzd().zza(), null, null, new zzcp(application, str, null), 3));
    }
}
