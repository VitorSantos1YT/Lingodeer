package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzand extends zzaku<zzand, zza> implements zzama {
    private static final zzand zzc;
    private static volatile zzaml<zzand> zzd;
    private long zze;
    private int zzf;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzand, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        public final void k(int i11) {
            if (!this.f10131b.u()) {
                j();
            }
            ((zzand) this.f10131b).zzf = i11;
        }

        public final void l(long j11) {
            if (!this.f10131b.u()) {
                j();
            }
            ((zzand) this.f10131b).zze = j11;
        }

        private zza() {
            super(zzand.zzc);
        }
    }

    static {
        zzand zzandVar = new zzand();
        zzc = zzandVar;
        zzaku.n(zzand.class, zzandVar);
    }

    private zzand() {
    }

    public static zza z() {
        return (zza) zzc.q();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzanc.f10216a[i11 - 1]) {
            case 1:
                return new zzand();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzand> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzand.class) {
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

    public final long y() {
        return this.zze;
    }
}
