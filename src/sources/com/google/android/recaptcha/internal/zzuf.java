package com.google.android.recaptcha.internal;

import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzuf extends zznd implements zzoj {
    private static final zzuf zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private zznk zzg = zznd.zzB();

    static {
        zzuf zzufVar = new zzuf();
        zzb = zzufVar;
        zznd.zzI(zzuf.class, zzufVar);
        zzls zzlsVarZzg = zzls.zzg();
        zzpw zzpwVar = zzpw.zzi;
        zznd.zzs(zzlsVarZzg, BuildConfig.VERSION_NAME, null, null, 490775251, zzpwVar, String.class);
        zznd.zzs(zzls.zzg(), BuildConfig.VERSION_NAME, null, null, 490775252, zzpwVar, String.class);
    }

    private zzuf() {
    }

    public final int zzf() {
        return this.zze;
    }

    public final int zzg() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i11, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zznd.zzF(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003\u001b", new Object[]{"zze", "zzf", "zzg", zzue.class});
        }
        if (i12 == 3) {
            return new zzuf();
        }
        zzug zzugVar = null;
        if (i12 == 4) {
            return new zzuc(zzugVar);
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
        synchronized (zzuf.class) {
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

    public final List zzj() {
        return this.zzg;
    }

    public final int zzk() {
        int i11;
        switch (this.zze) {
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
