package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsu extends zzaku<zzsu, zza> implements zzama {
    private static final zzsu zzc;
    private static volatile zzaml<zzsu> zzd;
    private int zze;
    private zzta zzf;
    private zzvm zzg;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzsu, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzsu.zzc);
        }
    }

    static {
        zzsu zzsuVar = new zzsu();
        zzc = zzsuVar;
        zzaku.n(zzsu.class, zzsuVar);
    }

    private zzsu() {
    }

    public static zza v() {
        return (zza) zzc.q();
    }

    public static zzsu w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzsu) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void x(zzsu zzsuVar, zzta zztaVar) {
        zzsuVar.zzf = zztaVar;
        zzsuVar.zze |= 1;
    }

    public static /* synthetic */ void y(zzsu zzsuVar, zzvm zzvmVar) {
        zzsuVar.zzg = zzvmVar;
        zzsuVar.zze |= 2;
    }

    public final zzta A() {
        zzta zztaVar = this.zzf;
        return zztaVar == null ? zzta.A() : zztaVar;
    }

    public final zzvm B() {
        zzvm zzvmVar = this.zzg;
        return zzvmVar == null ? zzvm.C() : zzvmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzst.f10949a[i11 - 1]) {
            case 1:
                return new zzsu();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzsu> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzsu.class) {
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
