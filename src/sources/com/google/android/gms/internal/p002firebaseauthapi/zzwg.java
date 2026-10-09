package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwg extends zzaku<zzwg, zza> implements zzama {
    private static final zzwg zzc;
    private static volatile zzaml<zzwg> zzd;
    private int zze;
    private int zzf;
    private zzwa zzg;
    private zzaje zzh = zzaje.f10066b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzwg, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzwg.zzc);
        }
    }

    static {
        zzwg zzwgVar = new zzwg();
        zzc = zzwgVar;
        zzaku.n(zzwg.class, zzwgVar);
    }

    private zzwg() {
    }

    public static zza B() {
        return (zza) zzc.q();
    }

    public static zzwg D() {
        return zzc;
    }

    public static zzaml F() {
        return (zzaml) zzc.l(7);
    }

    public static zzwg w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzwg) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void y(zzwg zzwgVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzwgVar.zzh = zzajeVar;
    }

    public static /* synthetic */ void z(zzwg zzwgVar, zzwa zzwaVar) {
        zzwgVar.zzg = zzwaVar;
        zzwgVar.zze |= 1;
    }

    public final zzwa A() {
        zzwa zzwaVar = this.zzg;
        return zzwaVar == null ? zzwa.D() : zzwaVar;
    }

    public final zzaje E() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzwf.f10982a[i11 - 1]) {
            case 1:
                return new zzwg();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzwg> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzwg.class) {
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
