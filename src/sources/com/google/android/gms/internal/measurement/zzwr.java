package com.google.android.gms.internal.measurement;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzwr {
    public static void a(zzws zzwsVar) {
        if (zzwsVar.zza() == Thread.currentThread() && zzwsVar.zzb() != null) {
            a(zzwsVar.zzb());
            c(zzwsVar);
        } else {
            Trace.beginSection(zzwsVar.zzd());
            c(zzwsVar);
        }
    }

    public static void b(zzws zzwsVar) {
        if (zzwsVar.zza() == Thread.currentThread() && zzwsVar.zzb() != null) {
            Trace.endSection();
            b(zzwsVar.zzb());
        } else {
            Trace.endSection();
            Trace.endSection();
        }
    }

    public static void c(zzws zzwsVar) {
        String strZze = zzwsVar.zze();
        AtomicReference atomicReference = zzvy.f12092a;
        if (strZze.length() > 127) {
            strZze = strZze.substring(0, 127);
        }
        Trace.beginSection(strZze);
    }
}
