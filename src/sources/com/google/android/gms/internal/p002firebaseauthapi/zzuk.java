package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzuk extends zzaku<zzuk, zza> implements zzama {
    private static final zzuk zzc;
    private static volatile zzaml<zzuk> zzd;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzuk, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzuk.zzc);
        }
    }

    static {
        zzuk zzukVar = new zzuk();
        zzc = zzukVar;
        zzaku.n(zzuk.class, zzukVar);
    }

    private zzuk() {
    }

    public static void w(zzaje zzajeVar, zzakj zzakjVar) {
    }

    public static zzuk x() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzuj.f10966a[i11 - 1]) {
            case 1:
                return new zzuk();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0000", null);
            case 4:
                return zzc;
            case 5:
                zzaml<zzuk> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzuk.class) {
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
}
