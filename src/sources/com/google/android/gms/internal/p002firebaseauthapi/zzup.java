package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzup extends zzaku<zzup, zza> implements zzama {
    private static final zzup zzc;
    private static volatile zzaml<zzup> zzd;
    private int zze;
    private zzus zzf;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzup, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzup.zzc);
        }
    }

    static {
        zzup zzupVar = new zzup();
        zzc = zzupVar;
        zzaku.n(zzup.class, zzupVar);
    }

    private zzup() {
    }

    public static zza v() {
        return (zza) zzc.q();
    }

    public static zzup w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzup) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zzup zzupVar, zzus zzusVar) {
        zzupVar.zzf = zzusVar;
        zzupVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzur.f10968a[i11 - 1]) {
            case 1:
                return new zzup();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzup> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzup.class) {
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

    public final zzus z() {
        zzus zzusVar = this.zzf;
        return zzusVar == null ? zzus.C() : zzusVar;
    }
}
