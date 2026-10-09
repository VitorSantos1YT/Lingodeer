package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvj extends zzaku<zzvj, zza> implements zzama {
    private static final zzvj zzc;
    private static volatile zzaml<zzvj> zzd;
    private int zze;
    private int zzf;
    private zzvp zzg;
    private zzaje zzh = zzaje.f10066b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzvj, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzvj.zzc);
        }
    }

    static {
        zzvj zzvjVar = new zzvj();
        zzc = zzvjVar;
        zzaku.n(zzvj.class, zzvjVar);
    }

    private zzvj() {
    }

    public static zzvj B() {
        return zzc;
    }

    public static zzaml E() {
        return (zzaml) zzc.l(7);
    }

    public static zzvj w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzvj) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zzvj zzvjVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzvjVar.zzh = zzajeVar;
    }

    public static /* synthetic */ void y(zzvj zzvjVar, zzvp zzvpVar) {
        zzvjVar.zzg = zzvpVar;
        zzvjVar.zze |= 1;
    }

    public static zza z() {
        return (zza) zzc.q();
    }

    public final zzvp C() {
        zzvp zzvpVar = this.zzg;
        return zzvpVar == null ? zzvp.B() : zzvpVar;
    }

    public final zzaje D() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzvl.f10975a[i11 - 1]) {
            case 1:
                return new zzvj();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzvj> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzvj.class) {
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
