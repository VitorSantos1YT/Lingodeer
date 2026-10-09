package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxf extends zzaku<zzxf, zza> implements zzama {
    private static final zzxf zzc;
    private static volatile zzaml<zzxf> zzd;
    private int zze;
    private int zzf;
    private zzxi zzg;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzxf, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzxf.zzc);
        }
    }

    static {
        zzxf zzxfVar = new zzxf();
        zzc = zzxfVar;
        zzaku.n(zzxf.class, zzxfVar);
    }

    private zzxf() {
    }

    public static zzaml B() {
        return (zzaml) zzc.l(7);
    }

    public static zzxf w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzxf) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zzxf zzxfVar, zzxi zzxiVar) {
        zzxfVar.zzg = zzxiVar;
        zzxfVar.zze |= 1;
    }

    public static zza y() {
        return (zza) zzc.q();
    }

    public final zzxi A() {
        zzxi zzxiVar = this.zzg;
        return zzxiVar == null ? zzxi.B() : zzxiVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzxe.f10991a[i11 - 1]) {
            case 1:
                return new zzxf();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzxf> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzxf.class) {
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
