package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zztv extends zzaku<zztv, zza> implements zzama {
    private static final zztv zzc;
    private static volatile zzaml<zztv> zzd;
    private int zze;
    private zzaje zzf = zzaje.f10066b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zztv, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zztv.zzc);
        }
    }

    static {
        zztv zztvVar = new zztv();
        zzc = zztvVar;
        zzaku.n(zztv.class, zztvVar);
    }

    private zztv() {
    }

    public static zzaml B() {
        return (zzaml) zzc.l(7);
    }

    public static zztv w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zztv) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zztv zztvVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zztvVar.zzf = zzajeVar;
    }

    public static zza y() {
        return (zza) zzc.q();
    }

    public final zzaje A() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zztu.f10961a[i11 - 1]) {
            case 1:
                return new zztv();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaml<zztv> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zztv.class) {
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
        return this.zze;
    }
}
