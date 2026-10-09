package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzus extends zzaku<zzus, zza> implements zzama {
    private static final zzus zzc;
    private static volatile zzaml<zzus> zzd;
    private int zze;
    private zzvb zzf;
    private zzum zzg;
    private int zzh;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzus, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzus.zzc);
        }
    }

    static {
        zzus zzusVar = new zzus();
        zzc = zzusVar;
        zzaku.n(zzus.class, zzusVar);
    }

    private zzus() {
    }

    public static zza A() {
        return (zza) zzc.q();
    }

    public static zzus C() {
        return zzc;
    }

    public static /* synthetic */ void w(zzus zzusVar, zzum zzumVar) {
        zzusVar.zzg = zzumVar;
        zzusVar.zze |= 2;
    }

    public static /* synthetic */ void y(zzus zzusVar, zzvb zzvbVar) {
        zzusVar.zzf = zzvbVar;
        zzusVar.zze |= 1;
    }

    public final zzvb D() {
        zzvb zzvbVar = this.zzf;
        return zzvbVar == null ? zzvb.A() : zzvbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzuu.f10969a[i11 - 1]) {
            case 1:
                return new zzus();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzus> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzus.class) {
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

    public final zzun v() {
        zzun zzunVarA = zzun.a(this.zzh);
        return zzunVarA == null ? zzun.UNRECOGNIZED : zzunVarA;
    }

    public final zzum z() {
        zzum zzumVar = this.zzg;
        return zzumVar == null ? zzum.y() : zzumVar;
    }
}
