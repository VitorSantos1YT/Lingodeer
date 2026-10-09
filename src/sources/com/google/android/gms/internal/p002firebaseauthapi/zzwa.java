package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwa extends zzaku<zzwa, zza> implements zzama {
    private static final zzwa zzc;
    private static volatile zzaml<zzwa> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzwa, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzwa.zzc);
        }
    }

    static {
        zzwa zzwaVar = new zzwa();
        zzc = zzwaVar;
        zzaku.n(zzwa.class, zzwaVar);
    }

    private zzwa() {
    }

    public static zza B() {
        return (zza) zzc.q();
    }

    public static zzwa D() {
        return zzc;
    }

    public final zzvu A() {
        zzvu zzvuVarA = zzvu.a(this.zze);
        return zzvuVarA == null ? zzvu.UNRECOGNIZED : zzvuVarA;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzvz.f10979a[i11 - 1]) {
            case 1:
                return new zzwa();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzwa> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzwa.class) {
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

    public final zzvs v() {
        zzvs zzvsVarA = zzvs.a(this.zzg);
        return zzvsVarA == null ? zzvs.UNRECOGNIZED : zzvsVarA;
    }

    public final zzvv z() {
        zzvv zzvvVarA = zzvv.a(this.zzf);
        return zzvvVarA == null ? zzvv.UNRECOGNIZED : zzvvVarA;
    }
}
