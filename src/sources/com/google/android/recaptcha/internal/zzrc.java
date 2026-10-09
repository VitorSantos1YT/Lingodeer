package com.google.android.recaptcha.internal;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrc extends zznd implements zzoj {
    private static final zzrc zzb;
    private static volatile zzoq zzd;
    private int zze;
    private Object zzg;
    private int zzh;
    private int zzi;
    private long zzn;
    private zzml zzo;
    private int zzp;
    private zzqq zzq;
    private zzro zzr;
    private zzpj zzt;
    private zzml zzu;
    private int zzw;
    private int zzf = 0;
    private String zzj = BuildConfig.VERSION_NAME;
    private String zzk = BuildConfig.VERSION_NAME;
    private String zzl = BuildConfig.VERSION_NAME;
    private String zzm = BuildConfig.VERSION_NAME;
    private String zzs = BuildConfig.VERSION_NAME;
    private zzni zzv = zznd.zzy();

    static {
        zzrc zzrcVar = new zzrc();
        zzb = zzrcVar;
        zznd.zzI(zzrc.class, zzrcVar);
    }

    private zzrc() {
    }

    public static /* synthetic */ void zzO(zzrc zzrcVar, int i11) {
        zzni zzniVar = zzrcVar.zzv;
        if (!zzniVar.zzc()) {
            zzrcVar.zzv = zznd.zzz(zzniVar);
        }
        zzrcVar.zzv.zzh(0);
    }

    public static /* synthetic */ void zzP(zzrc zzrcVar, String str) {
        str.getClass();
        zzrcVar.zzj = str;
    }

    public static /* synthetic */ void zzR(zzrc zzrcVar, zzqq zzqqVar) {
        zzrcVar.zzq = zzqqVar;
        zzrcVar.zze |= 2;
    }

    public static /* synthetic */ void zzS(zzrc zzrcVar, String str) {
        str.getClass();
        zzrcVar.zzk = str;
    }

    public static /* synthetic */ void zzT(zzrc zzrcVar, zzro zzroVar) {
        zzroVar.getClass();
        zzrcVar.zzr = zzroVar;
        zzrcVar.zze |= 4;
    }

    public static /* synthetic */ void zzU(zzrc zzrcVar, int i11) {
        zzrcVar.zze |= 32;
        zzrcVar.zzw = i11;
    }

    public static /* synthetic */ void zzab(zzrc zzrcVar, int i11) {
        if (i11 == 1) {
            throw new IllegalArgumentException(scqhIrGXy.LCoNuOvhDmj);
        }
        zzrcVar.zzi = i11 - 2;
    }

    public static zzra zzi() {
        return (zzra) zzb.zzq();
    }

    public static zzrc zzk() {
        return zzb;
    }

    public static zzrc zzl(byte[] bArr) {
        return (zzrc) zznd.zzx(zzb, bArr);
    }

    public final String zzM() {
        return this.zzk;
    }

    public final String zzN() {
        return this.zzl;
    }

    public final boolean zzX() {
        return (this.zze & 2) != 0;
    }

    public final int zzY() {
        int i11;
        switch (this.zzh) {
            case 0:
                i11 = 2;
                break;
            case 1:
                i11 = 3;
                break;
            case 2:
                i11 = 4;
                break;
            case 3:
                i11 = 5;
                break;
            case 4:
                i11 = 6;
                break;
            case 5:
                i11 = 7;
                break;
            case 6:
                i11 = 8;
                break;
            case 7:
                i11 = 9;
                break;
            case 8:
                i11 = 10;
                break;
            case 9:
                i11 = 11;
                break;
            case 10:
                i11 = 12;
                break;
            case 11:
                i11 = 13;
                break;
            case 12:
                i11 = 14;
                break;
            case 13:
                i11 = 15;
                break;
            case 14:
                i11 = 16;
                break;
            case 15:
                i11 = 17;
                break;
            case 16:
                i11 = 18;
                break;
            case 17:
                i11 = 19;
                break;
            case 18:
                i11 = 20;
                break;
            case 19:
                i11 = 21;
                break;
            case 20:
                i11 = 22;
                break;
            case 21:
                i11 = 23;
                break;
            case 22:
                i11 = 24;
                break;
            case 23:
                i11 = 25;
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                i11 = 26;
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                i11 = 27;
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                i11 = 28;
                break;
            case 27:
                i11 = 29;
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                i11 = 30;
                break;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                i11 = 31;
                break;
            case 30:
                i11 = 32;
                break;
            case 31:
                i11 = 33;
                break;
            case Consts.SP /* 32 */:
                i11 = 34;
                break;
            case 33:
                i11 = 35;
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                i11 = 36;
                break;
            case 35:
                i11 = 37;
                break;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                i11 = 38;
                break;
            case 37:
                i11 = 39;
                break;
            case 38:
                i11 = 40;
                break;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                i11 = 41;
                break;
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                i11 = 42;
                break;
            default:
                i11 = 0;
                break;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzZ() {
        int i11 = this.zzp;
        int i12 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                i12 = i11 != 2 ? 0 : 4;
            } else {
                i12 = 3;
            }
        }
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    @Deprecated
    public final long zzf() {
        return this.zzn;
    }

    public final zzqq zzg() {
        zzqq zzqqVar = this.zzq;
        return zzqqVar == null ? zzqq.zzj() : zzqqVar;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i11, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zznd.zzF(zzb, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f", new Object[]{"zzg", "zzf", "zze", "zzh", "zzk", "zzn", "zzp", "zzq", "zzr", "zzs", "zzl", "zzm", "zzo", "zzt", "zzu", "zzj", zzqg.class, "zzv", "zzw", "zzi"});
        }
        if (i12 == 3) {
            return new zzrc();
        }
        zzrb zzrbVar = null;
        if (i12 == 4) {
            return new zzra(zzrbVar);
        }
        if (i12 == 5) {
            return zzb;
        }
        if (i12 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar != null) {
            return zzoqVar;
        }
        synchronized (zzrc.class) {
            try {
                zzmyVar = zzd;
                if (zzmyVar == null) {
                    zzmyVar = new zzmy(zzb);
                    zzd = zzmyVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzmyVar;
    }
}
