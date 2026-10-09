package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzln extends zzkw {
    private static final Logger zzb = Logger.getLogger(zzln.class.getName());
    private static final boolean zzc = zzps.zzx();
    zzlo zza;

    private zzln() {
        throw null;
    }

    public static int zzA(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int zzB(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i11, zzoi zzoiVar, zzow zzowVar) {
        int iZzA = zzA(i11 << 3);
        return ((zzko) zzoiVar).zza(zzowVar) + iZzA + iZzA;
    }

    public static int zzx(zzoi zzoiVar) {
        int iZzo = zzoiVar.zzo();
        return zzA(iZzo) + iZzo;
    }

    public static int zzy(zzoi zzoiVar, zzow zzowVar) {
        int iZza = ((zzko) zzoiVar).zza(zzowVar);
        return zzA(iZza) + iZza;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzpv.zzc(str);
        } catch (zzpu unused) {
            length = str.getBytes(zznl.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzC() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzD(String str, zzpu zzpuVar) throws zzll {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzpuVar);
        byte[] bytes = str.getBytes(zznl.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzll(e8);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b3);

    public abstract void zzd(int i11, boolean z11);

    public abstract void zze(int i11, zzle zzleVar);

    public abstract void zzf(int i11, int i12);

    public abstract void zzg(int i11);

    public abstract void zzh(int i11, long j11);

    public abstract void zzi(long j11);

    public abstract void zzj(int i11, int i12);

    public abstract void zzk(int i11);

    public abstract void zzl(byte[] bArr, int i11, int i12);

    public abstract void zzm(int i11, zzoi zzoiVar, zzow zzowVar);

    public abstract void zzn(int i11, zzoi zzoiVar);

    public abstract void zzo(int i11, zzle zzleVar);

    public abstract void zzp(int i11, String str);

    public abstract void zzr(int i11, int i12);

    public abstract void zzs(int i11, int i12);

    public abstract void zzt(int i11);

    public abstract void zzu(int i11, long j11);

    public abstract void zzv(long j11);

    public /* synthetic */ zzln(zzlm zzlmVar) {
    }
}
