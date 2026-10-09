package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzuv extends zzaku<zzuv, zza> implements zzama {
    private static final zzuv zzc;
    private static volatile zzaml<zzuv> zzd;
    private int zze;
    private int zzf;
    private zzuy zzg;
    private zzaje zzh = zzaje.f10066b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzuv, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzuv.zzc);
        }
    }

    static {
        zzuv zzuvVar = new zzuv();
        zzc = zzuvVar;
        zzaku.n(zzuv.class, zzuvVar);
    }

    private zzuv() {
    }

    public static zza A() {
        return (zza) zzc.q();
    }

    public static zzaml E() {
        return (zzaml) zzc.l(7);
    }

    public static zzuv w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzuv) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void y(zzuv zzuvVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzuvVar.zzh = zzajeVar;
    }

    public static /* synthetic */ void z(zzuv zzuvVar, zzuy zzuyVar) {
        zzuvVar.zzg = zzuyVar;
        zzuvVar.zze |= 1;
    }

    public final zzuy C() {
        zzuy zzuyVar = this.zzg;
        return zzuyVar == null ? zzuy.E() : zzuyVar;
    }

    public final zzaje D() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzux.f10970a[i11 - 1]) {
            case 1:
                return new zzuv();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzuv> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzuv.class) {
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
