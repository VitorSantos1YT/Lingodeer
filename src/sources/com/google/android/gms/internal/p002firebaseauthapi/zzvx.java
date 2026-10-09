package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvx extends zzaku<zzvx, zza> implements zzama {
    private static final zzvx zzc;
    private static volatile zzaml<zzvx> zzd;
    private int zze;
    private zzwa zzf;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzvx, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzvx.zzc);
        }
    }

    static {
        zzvx zzvxVar = new zzvx();
        zzc = zzvxVar;
        zzaku.n(zzvx.class, zzvxVar);
    }

    private zzvx() {
    }

    public static zzvx v(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzvx) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void w(zzvx zzvxVar, zzwa zzwaVar) {
        zzvxVar.zzf = zzwaVar;
        zzvxVar.zze |= 1;
    }

    public static zza x() {
        return (zza) zzc.q();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzvw.f10978a[i11 - 1]) {
            case 1:
                return new zzvx();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzvx> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzvx.class) {
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

    public final zzwa z() {
        zzwa zzwaVar = this.zzf;
        return zzwaVar == null ? zzwa.D() : zzwaVar;
    }
}
