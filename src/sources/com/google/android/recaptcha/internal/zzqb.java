package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqb {
    private static final ThreadLocal zza;

    static {
        zzph zzphVarZzi = zzpj.zzi();
        zzphVarZzi.zzf(-62135596800L);
        zzphVarZzi.zze(0);
        zzph zzphVarZzi2 = zzpj.zzi();
        zzphVarZzi2.zzf(253402300799L);
        zzphVarZzi2.zze(999999999);
        zzph zzphVarZzi3 = zzpj.zzi();
        zzphVarZzi3.zzf(0L);
        zzphVarZzi3.zze(0);
        zza = new zzqa();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzpj zza(zzpj zzpjVar) {
        long jZzg = zzpjVar.zzg();
        boolean zZze = zze(jZzg);
        int iZzf = zzpjVar.zzf();
        if (zZze && iZzf >= 0 && iZzf < 1000000000) {
            return zzpjVar;
        }
        throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + jZzg + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + iZzf + ") must be in range [0, +999,999,999].");
    }

    public static zzpj zzb(long j11) {
        long jZza = j11 / 1000;
        if (!zze(jZza)) {
            throw new IllegalArgumentException(p.m(jZza, "Timestamp is not valid. Input seconds is too large. Seconds (", ") must be in range [-62,135,596,800, +253,402,300,799]. "));
        }
        int i11 = (int) ((j11 % 1000) * 1000000);
        if (i11 <= -1000000000 || i11 >= 1000000000) {
            jZza = zzkk.zza(jZza, i11 / 1000000000);
            i11 %= 1000000000;
        }
        if (i11 < 0) {
            i11 += 1000000000;
            jZza = zzkk.zzb(jZza, 1L);
        }
        zzph zzphVarZzi = zzpj.zzi();
        zzphVarZzi.zzf(jZza);
        zzphVarZzi.zze(i11);
        zzpj zzpjVar = (zzpj) zzphVarZzi.zzk();
        zza(zzpjVar);
        return zzpjVar;
    }

    public static String zzc(zzpj zzpjVar) {
        String str;
        zza(zzpjVar);
        long jZzg = zzpjVar.zzg();
        int iZzf = zzpjVar.zzf();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((SimpleDateFormat) zza.get()).format(new Date(jZzg * 1000)));
        if (iZzf != 0) {
            sb2.append(".");
            if (iZzf % 1000000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iZzf / 1000000));
            } else {
                str = iZzf % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iZzf / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iZzf));
            }
            sb2.append(str);
        }
        sb2.append("Z");
        return sb2.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j11) {
        return j11 >= -62135596800L && j11 <= 253402300799L;
    }
}
