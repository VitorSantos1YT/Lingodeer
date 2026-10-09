package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zztg extends zzaku<zztg, zza> implements zzama {
    private static final zztg zzc;
    private static volatile zzaml<zztg> zzd;
    private int zze;
    private int zzf;
    private zztm zzg;
    private zzaje zzh = zzaje.f10066b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zztg, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zztg.zzc);
        }
    }

    static {
        zztg zztgVar = new zztg();
        zzc = zztgVar;
        zzaku.n(zztg.class, zztgVar);
    }

    private zztg() {
    }

    public static zzaml D() {
        return (zzaml) zzc.l(7);
    }

    public static zztg w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zztg) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zztg zztgVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zztgVar.zzh = zzajeVar;
    }

    public static /* synthetic */ void y(zztg zztgVar, zztm zztmVar) {
        zztgVar.zzg = zztmVar;
        zztgVar.zze |= 1;
    }

    public static zza z() {
        return (zza) zzc.q();
    }

    public final zztm B() {
        zztm zztmVar = this.zzg;
        return zztmVar == null ? zztm.z() : zztmVar;
    }

    public final zzaje C() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zztf.f10956a[i11 - 1]) {
            case 1:
                return new zztg();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaml<zztg> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zztg.class) {
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
