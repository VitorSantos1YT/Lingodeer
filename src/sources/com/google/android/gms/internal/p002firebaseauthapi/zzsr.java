package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsr extends zzaku<zzsr, zza> implements zzama {
    private static final zzsr zzc;
    private static volatile zzaml<zzsr> zzd;
    private int zze;
    private int zzf;
    private zzsx zzg;
    private zzvj zzh;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzsr, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzsr.zzc);
        }
    }

    static {
        zzsr zzsrVar = new zzsr();
        zzc = zzsrVar;
        zzaku.n(zzsr.class, zzsrVar);
    }

    private zzsr() {
    }

    public static zzaml D() {
        return (zzaml) zzc.l(7);
    }

    public static zzsr w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzsr) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zzsr zzsrVar, zzsx zzsxVar) {
        zzsrVar.zzg = zzsxVar;
        zzsrVar.zze |= 1;
    }

    public static /* synthetic */ void y(zzsr zzsrVar, zzvj zzvjVar) {
        zzsrVar.zzh = zzvjVar;
        zzsrVar.zze |= 2;
    }

    public static zza z() {
        return (zza) zzc.q();
    }

    public final zzsx B() {
        zzsx zzsxVar = this.zzg;
        return zzsxVar == null ? zzsx.A() : zzsxVar;
    }

    public final zzvj C() {
        zzvj zzvjVar = this.zzh;
        return zzvjVar == null ? zzvj.B() : zzvjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzsq.f10948a[i11 - 1]) {
            case 1:
                return new zzsr();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzsr> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzsr.class) {
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
