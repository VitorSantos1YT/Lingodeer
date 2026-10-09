package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpz {
    static {
        zzmj zzmjVarZzi = zzml.zzi();
        zzmjVarZzi.zzf(-315576000000L);
        zzmjVarZzi.zze(-999999999);
        zzmj zzmjVarZzi2 = zzml.zzi();
        zzmjVarZzi2.zzf(315576000000L);
        zzmjVarZzi2.zze(999999999);
        zzmj zzmjVarZzi3 = zzml.zzi();
        zzmjVarZzi3.zzf(0L);
        zzmjVarZzi3.zze(0);
    }

    public static zzml zza(long j11) {
        int i11 = (int) (j11 % 1000000000);
        long jZza = j11 / 1000000000;
        if (i11 <= -1000000000 || i11 >= 1000000000) {
            jZza = zzkk.zza(jZza, i11 / 1000000000);
            i11 %= 1000000000;
        }
        if (jZza > 0 && i11 < 0) {
            i11 += 1000000000;
            jZza--;
        }
        if (jZza < 0 && i11 > 0) {
            i11 -= 1000000000;
            jZza++;
        }
        zzmj zzmjVarZzi = zzml.zzi();
        zzmjVarZzi.zzf(jZza);
        zzmjVarZzi.zze(i11);
        zzml zzmlVar = (zzml) zzmjVarZzi.zzk();
        long jZzg = zzmlVar.zzg();
        int iZzf = zzmlVar.zzf();
        if (jZzg >= -315576000000L && jZzg <= 315576000000L && iZzf >= -999999999 && iZzf < 1000000000 && ((jZzg >= 0 && iZzf >= 0) || (jZzg <= 0 && iZzf <= 0))) {
            return zzmlVar;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + jZzg + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + iZzf + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
