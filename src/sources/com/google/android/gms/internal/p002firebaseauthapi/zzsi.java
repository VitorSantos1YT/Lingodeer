package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsi extends zzaku<zzsi, zza> implements zzama {
    private static final zzsi zzc;
    private static volatile zzaml<zzsi> zzd;
    private int zze;
    private int zzf;
    private zzaje zzg = zzaje.f10066b;
    private zzso zzh;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzsi, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzsi.zzc);
        }
    }

    static {
        zzsi zzsiVar = new zzsi();
        zzc = zzsiVar;
        zzaku.n(zzsi.class, zzsiVar);
    }

    private zzsi() {
    }

    public static zzaml D() {
        return (zzaml) zzc.l(7);
    }

    public static zzsi w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzsi) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zzsi zzsiVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzsiVar.zzg = zzajeVar;
    }

    public static /* synthetic */ void y(zzsi zzsiVar, zzso zzsoVar) {
        zzsiVar.zzh = zzsoVar;
        zzsiVar.zze |= 1;
    }

    public static zza z() {
        return (zza) zzc.q();
    }

    public final zzso B() {
        zzso zzsoVar = this.zzh;
        return zzsoVar == null ? zzso.z() : zzsoVar;
    }

    public final zzaje C() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzsh.f10945a[i11 - 1]) {
            case 1:
                return new zzsi();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzsi> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzsi.class) {
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
