package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxz extends zzaku<zzxz, zza> implements zzama {
    private static final zzxz zzc;
    private static volatile zzaml<zzxz> zzd;
    private int zze;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzxz, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzxz.zzc);
        }
    }

    static {
        zzxz zzxzVar = new zzxz();
        zzc = zzxzVar;
        zzaku.n(zzxz.class, zzxzVar);
    }

    private zzxz() {
    }

    public static zzxz w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzxz) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static zzxz y() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzyb.f11000a[i11 - 1]) {
            case 1:
                return new zzxz();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzxz> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzxz.class) {
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
