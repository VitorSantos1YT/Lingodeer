package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzta extends zzaku<zzta, zza> implements zzama {
    private static final zzta zzc;
    private static volatile zzaml<zzta> zzd;
    private int zze;
    private zztd zzf;
    private int zzg;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzta, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzta.zzc);
        }
    }

    static {
        zzta zztaVar = new zzta();
        zzc = zztaVar;
        zzaku.n(zzta.class, zztaVar);
    }

    private zzta() {
    }

    public static zzta A() {
        return zzc;
    }

    public static /* synthetic */ void x(zzta zztaVar, zztd zztdVar) {
        zztaVar.zzf = zztdVar;
        zztaVar.zze |= 1;
    }

    public static zza y() {
        return (zza) zzc.q();
    }

    public final zztd B() {
        zztd zztdVar = this.zzf;
        return zztdVar == null ? zztd.z() : zztdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzsz.f10951a[i11 - 1]) {
            case 1:
                return new zzta();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzta> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzta.class) {
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
        return this.zzg;
    }
}
