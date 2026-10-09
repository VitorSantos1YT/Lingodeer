package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzts extends zzaku<zzts, zza> implements zzama {
    private static final zzts zzc;
    private static volatile zzaml<zzts> zzd;
    private int zze;
    private int zzf;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzts, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzts.zzc);
        }
    }

    static {
        zzts zztsVar = new zzts();
        zzc = zztsVar;
        zzaku.n(zzts.class, zztsVar);
    }

    private zzts() {
    }

    public static zzts w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzts) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static zza z() {
        return (zza) zzc.q();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zztr.f10960a[i11 - 1]) {
            case 1:
                return new zzts();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzts> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzts.class) {
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
