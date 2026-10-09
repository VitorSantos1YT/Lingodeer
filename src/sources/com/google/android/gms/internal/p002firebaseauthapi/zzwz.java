package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwz extends zzaku<zzwz, zza> implements zzama {
    private static final zzwz zzc;
    private static volatile zzaml<zzwz> zzd;
    private int zze;
    private int zzf;
    private zzxc zzg;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzwz, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzwz.zzc);
        }
    }

    static {
        zzwz zzwzVar = new zzwz();
        zzc = zzwzVar;
        zzaku.n(zzwz.class, zzwzVar);
    }

    private zzwz() {
    }

    public static zzaml B() {
        return (zzaml) zzc.l(7);
    }

    public static zzwz w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzwz) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zzwz zzwzVar, zzxc zzxcVar) {
        zzwzVar.zzg = zzxcVar;
        zzwzVar.zze |= 1;
    }

    public static zza y() {
        return (zza) zzc.q();
    }

    public final zzxc A() {
        zzxc zzxcVar = this.zzg;
        return zzxcVar == null ? zzxc.z() : zzxcVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzwy.f10988a[i11 - 1]) {
            case 1:
                return new zzwz();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzwz> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzwz.class) {
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

    public final int v() {
        return this.zzf;
    }
}
