package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzty extends zzaku<zzty, zza> implements zzama {
    private static final zzty zzc;
    private static volatile zzaml<zzty> zzd;
    private int zze;
    private int zzf;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzty, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzty.zzc);
        }
    }

    static {
        zzty zztyVar = new zzty();
        zzc = zztyVar;
        zzaku.n(zzty.class, zztyVar);
    }

    private zzty() {
    }

    public static zzty w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzty) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static zza z() {
        return (zza) zzc.q();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zztx.f10962a[i11 - 1]) {
            case 1:
                return new zzty();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzty> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzty.class) {
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

    public final int y() {
        return this.zzf;
    }
}
