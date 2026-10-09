package com.google.android.recaptcha.internal;

import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzte extends zznd implements zzoj {
    private static final zzte zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zztc zzj;
    private int zzk;
    private zztl zzl;

    static {
        zzte zzteVar = new zzte();
        zzb = zzteVar;
        zznd.zzI(zzte.class, zzteVar);
    }

    private zzte() {
    }

    public static /* synthetic */ void zzM(zzte zzteVar, int i11) {
        if (i11 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzteVar.zzh = i11 - 2;
    }

    public static /* synthetic */ void zzN(zzte zzteVar, int i11) {
        if (i11 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzteVar.zzf = i11 - 2;
    }

    public static zztd zzf() {
        return (zztd) zzb.zzq();
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i11, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004\f\u0005ဉ\u0000\u0006\u000b\u0007ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i12 == 3) {
            return new zzte();
        }
        zztj zztjVar = null;
        if (i12 == 4) {
            return new zztd(zztjVar);
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
        synchronized (zzte.class) {
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

    public final int zzk() {
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
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                i11 = 43;
                break;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                i11 = 44;
                break;
            case 43:
                i11 = 45;
                break;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                i11 = 46;
                break;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                i11 = 47;
                break;
            case 46:
                i11 = 48;
                break;
            case 47:
                i11 = 49;
                break;
            case 48:
                i11 = 50;
                break;
            case 49:
                i11 = 51;
                break;
            case 50:
                i11 = 52;
                break;
            case 51:
                i11 = 53;
                break;
            case 52:
                i11 = 54;
                break;
            case 53:
                i11 = 55;
                break;
            case 54:
                i11 = 56;
                break;
            case 55:
                i11 = 57;
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

    public final int zzl() {
        int i11;
        switch (this.zzf) {
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
            default:
                i11 = 0;
                break;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
