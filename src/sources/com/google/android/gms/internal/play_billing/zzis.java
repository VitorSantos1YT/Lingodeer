package com.google.android.gms.internal.play_billing;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzis extends zzfi implements zzgm {
    private static final zzis zzb;
    private int zzd;
    private String zze = BuildConfig.VERSION_NAME;
    private String zzf = BuildConfig.VERSION_NAME;
    private String zzg = BuildConfig.VERSION_NAME;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;

    static {
        zzis zzisVar = new zzis();
        zzb = zzisVar;
        zzfi.m(zzis.class, zzisVar);
    }

    private zzis() {
    }

    public static /* synthetic */ void p(zzis zzisVar, int i11) {
        zzisVar.zzd |= 128;
        zzisVar.zzl = i11;
    }

    public static /* synthetic */ void q(zzis zzisVar, int i11) {
        zzisVar.zzd |= 256;
        zzisVar.zzm = i11;
    }

    public static /* synthetic */ void r(zzis zzisVar, int i11) {
        zzisVar.zzd |= 8;
        zzisVar.zzh = i11;
    }

    public static /* synthetic */ void s(zzis zzisVar, long j11) {
        zzisVar.zzd |= 16;
        zzisVar.zzi = j11;
    }

    public static /* synthetic */ void t(zzis zzisVar, long j11) {
        zzisVar.zzd |= 32;
        zzisVar.zzj = j11;
    }

    public static /* synthetic */ void u(zzis zzisVar) {
        zzisVar.zzd |= 512;
        zzisVar.zzn = 772604006L;
    }

    public static /* synthetic */ void v(zzis zzisVar, String str) {
        str.getClass();
        zzisVar.zzd |= 4;
        zzisVar.zzg = str;
    }

    public static /* synthetic */ void w(zzis zzisVar) {
        zzisVar.zzd |= 64;
        zzisVar.zzk = false;
    }

    public static /* synthetic */ void x(zzis zzisVar) {
        zzisVar.zzd |= 1;
        zzisVar.zze = "8.0.0";
    }

    public static /* synthetic */ void y(zzis zzisVar, String str) {
        zzisVar.zzd |= 2;
        zzisVar.zzf = str;
    }

    public static zziq z() {
        return (zziq) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i12 == 3) {
            return new zzis();
        }
        if (i12 == 4) {
            return new zziq(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
