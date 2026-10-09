package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzuh extends zzaku<zzuh, zza> implements zzama {
    private static final zzuh zzc;
    private static volatile zzaml<zzuh> zzd;
    private int zze;
    private zzaje zzf = zzaje.f10066b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzuh, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzuh.zzc);
        }
    }

    static {
        zzuh zzuhVar = new zzuh();
        zzc = zzuhVar;
        zzaku.n(zzuh.class, zzuhVar);
    }

    private zzuh() {
    }

    public static zzaml B() {
        return (zzaml) zzc.l(7);
    }

    public static zzuh w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzuh) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zzuh zzuhVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzuhVar.zzf = zzajeVar;
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
        switch (zzug.f10965a[i11 - 1]) {
            case 1:
                return new zzuh();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzuh> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzuh.class) {
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
