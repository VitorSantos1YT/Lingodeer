package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvm extends zzaku<zzvm, zza> implements zzama {
    private static final zzvm zzc;
    private static volatile zzaml<zzvm> zzd;
    private int zze;
    private zzvp zzf;
    private int zzg;
    private int zzh;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzvm, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzvm.zzc);
        }
    }

    static {
        zzvm zzvmVar = new zzvm();
        zzc = zzvmVar;
        zzaku.n(zzvm.class, zzvmVar);
    }

    private zzvm() {
    }

    public static zza A() {
        return (zza) zzc.q();
    }

    public static zzvm C() {
        return zzc;
    }

    public static zzvm w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzvm) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void y(zzvm zzvmVar, zzvp zzvpVar) {
        zzvmVar.zzf = zzvpVar;
        zzvmVar.zze |= 1;
    }

    public final zzvp D() {
        zzvp zzvpVar = this.zzf;
        return zzvpVar == null ? zzvp.B() : zzvpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzvo.f10976a[i11 - 1]) {
            case 1:
                return new zzvm();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzvm> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzvm.class) {
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

    public final int z() {
        return this.zzh;
    }
}
