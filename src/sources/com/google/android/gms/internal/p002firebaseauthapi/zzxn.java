package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxn extends zzaku<zzxn, zza> implements zzama {
    private static final zzxn zzc;
    private static volatile zzaml<zzxn> zzd;
    private int zze;
    private int zzf;
    private zzxt zzg;
    private zzaje zzh = zzaje.f10066b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzxn, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzxn.zzc);
        }
    }

    static {
        zzxn zzxnVar = new zzxn();
        zzc = zzxnVar;
        zzaku.n(zzxn.class, zzxnVar);
    }

    private zzxn() {
    }

    public static zzxn w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzxn) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zzxn zzxnVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzxnVar.zzh = zzajeVar;
    }

    public static /* synthetic */ void y(zzxn zzxnVar, zzxt zzxtVar) {
        zzxnVar.zzg = zzxtVar;
        zzxnVar.zze |= 1;
    }

    public static zza z() {
        return (zza) zzc.q();
    }

    public final zzxt B() {
        zzxt zzxtVar = this.zzg;
        return zzxtVar == null ? zzxt.z() : zzxtVar;
    }

    public final zzaje C() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzxp.f10995a[i11 - 1]) {
            case 1:
                return new zzxn();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzxn> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzxn.class) {
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
