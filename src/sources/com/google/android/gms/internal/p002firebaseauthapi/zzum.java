package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzum extends zzaku<zzum, zza> implements zzama {
    private static final zzum zzc;
    private static volatile zzaml<zzum> zzd;
    private int zze;
    private zzwn zzf;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzum, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzum.zzc);
        }
    }

    static {
        zzum zzumVar = new zzum();
        zzc = zzumVar;
        zzaku.n(zzum.class, zzumVar);
    }

    private zzum() {
    }

    public static zza v() {
        return (zza) zzc.q();
    }

    public static /* synthetic */ void w(zzum zzumVar, zzwn zzwnVar) {
        zzwnVar.getClass();
        zzumVar.zzf = zzwnVar;
        zzumVar.zze |= 1;
    }

    public static zzum y() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzuo.f10967a[i11 - 1]) {
            case 1:
                return new zzum();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzum> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzum.class) {
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

    public final zzwn z() {
        zzwn zzwnVar = this.zzf;
        return zzwnVar == null ? zzwn.B() : zzwnVar;
    }
}
