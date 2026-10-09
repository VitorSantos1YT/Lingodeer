package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zztj extends zzaku<zztj, zza> implements zzama {
    private static final zztj zzc;
    private static volatile zzaml<zztj> zzd;
    private int zze;
    private zztm zzf;
    private int zzg;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zztj, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zztj.zzc);
        }
    }

    static {
        zztj zztjVar = new zztj();
        zzc = zztjVar;
        zzaku.n(zztj.class, zztjVar);
    }

    private zztj() {
    }

    public static zztj w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zztj) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void y(zztj zztjVar, zztm zztmVar) {
        zztjVar.zzf = zztmVar;
        zztjVar.zze |= 1;
    }

    public static zza z() {
        return (zza) zzc.q();
    }

    public final zztm B() {
        zztm zztmVar = this.zzf;
        return zztmVar == null ? zztm.z() : zztmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzti.f10957a[i11 - 1]) {
            case 1:
                return new zztj();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zztj> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zztj.class) {
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
        return this.zzg;
    }
}
