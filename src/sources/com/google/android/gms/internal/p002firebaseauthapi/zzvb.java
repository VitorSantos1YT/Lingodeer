package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvb extends zzaku<zzvb, zza> implements zzama {
    private static final zzvb zzc;
    private static volatile zzaml<zzvb> zzd;
    private int zze;
    private int zzf;
    private zzaje zzg = zzaje.f10066b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzvb, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzvb.zzc);
        }
    }

    static {
        zzvb zzvbVar = new zzvb();
        zzc = zzvbVar;
        zzaku.n(zzvb.class, zzvbVar);
    }

    private zzvb() {
    }

    public static zzvb A() {
        return zzc;
    }

    public static zza v() {
        return (zza) zzc.q();
    }

    public static /* synthetic */ void w(zzvb zzvbVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzvbVar.zzg = zzajeVar;
    }

    public final zzve B() {
        zzve zzveVarA = zzve.a(this.zze);
        return zzveVarA == null ? zzve.UNRECOGNIZED : zzveVarA;
    }

    public final zzvk C() {
        zzvk zzvkVarA = zzvk.a(this.zzf);
        return zzvkVarA == null ? zzvk.UNRECOGNIZED : zzvkVarA;
    }

    public final zzaje D() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzvd.f10973a[i11 - 1]) {
            case 1:
                return new zzvb();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzvb> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzvb.class) {
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
