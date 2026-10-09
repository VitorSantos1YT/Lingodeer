package com.google.android.gms.internal.p002firebaseauthapi;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxi extends zzaku<zzxi, zza> implements zzama {
    private static final zzxi zzc;
    private static volatile zzaml<zzxi> zzd;
    private int zze;
    private String zzf = BuildConfig.VERSION_NAME;
    private zzwn zzg;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzxi, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzxi.zzc);
        }
    }

    static {
        zzxi zzxiVar = new zzxi();
        zzc = zzxiVar;
        zzaku.n(zzxi.class, zzxiVar);
    }

    private zzxi() {
    }

    public static zzxi B() {
        return zzc;
    }

    public static zzxi w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzxi) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zzxi zzxiVar, zzwn zzwnVar) {
        zzwnVar.getClass();
        zzxiVar.zzg = zzwnVar;
        zzxiVar.zze |= 1;
    }

    public static /* synthetic */ void y(zzxi zzxiVar, String str) {
        str.getClass();
        zzxiVar.zzf = str;
    }

    public static zza z() {
        return (zza) zzc.q();
    }

    public final String C() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzxh.f10992a[i11 - 1]) {
            case 1:
                return new zzxi();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzxi> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzxi.class) {
                    try {
                        zzaVar = zzd;
                        if (zzaVar == null) {
                            zzaVar = new zzaku.zza();
                            zzd = zzaVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return zzaVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final zzwn v() {
        zzwn zzwnVar = this.zzg;
        return zzwnVar == null ? zzwn.B() : zzwnVar;
    }
}
