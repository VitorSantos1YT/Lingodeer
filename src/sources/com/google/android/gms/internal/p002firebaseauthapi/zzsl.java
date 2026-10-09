package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsl extends zzaku<zzsl, zza> implements zzama {
    private static final zzsl zzc;
    private static volatile zzaml<zzsl> zzd;
    private int zze;
    private int zzf;
    private zzso zzg;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzsl, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzsl.zzc);
        }
    }

    static {
        zzsl zzslVar = new zzsl();
        zzc = zzslVar;
        zzaku.n(zzsl.class, zzslVar);
    }

    private zzsl() {
    }

    public static zzsl w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzsl) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void y(zzsl zzslVar, zzso zzsoVar) {
        zzslVar.zzg = zzsoVar;
        zzslVar.zze |= 1;
    }

    public static zza z() {
        return (zza) zzc.q();
    }

    public final zzso B() {
        zzso zzsoVar = this.zzg;
        return zzsoVar == null ? zzso.z() : zzsoVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzsk.f10946a[i11 - 1]) {
            case 1:
                return new zzsl();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzsl> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzsl.class) {
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
