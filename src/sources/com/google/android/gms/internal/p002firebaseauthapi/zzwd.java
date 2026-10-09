package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwd extends zzaku<zzwd, zza> implements zzama {
    private static final zzwd zzc;
    private static volatile zzaml<zzwd> zzd;
    private int zze;
    private int zzf;
    private zzwg zzg;
    private zzaje zzh = zzaje.f10066b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzwd, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzwd.zzc);
        }
    }

    static {
        zzwd zzwdVar = new zzwd();
        zzc = zzwdVar;
        zzaku.n(zzwd.class, zzwdVar);
    }

    private zzwd() {
    }

    public static zza A() {
        return (zza) zzc.q();
    }

    public static zzaml E() {
        return (zzaml) zzc.l(7);
    }

    public static zzwd w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzwd) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void y(zzwd zzwdVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzwdVar.zzh = zzajeVar;
    }

    public static /* synthetic */ void z(zzwd zzwdVar, zzwg zzwgVar) {
        zzwdVar.zzg = zzwgVar;
        zzwdVar.zze |= 1;
    }

    public final zzwg C() {
        zzwg zzwgVar = this.zzg;
        return zzwgVar == null ? zzwg.D() : zzwgVar;
    }

    public final zzaje D() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzwc.f10981a[i11 - 1]) {
            case 1:
                return new zzwd();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzwd> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzwd.class) {
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
