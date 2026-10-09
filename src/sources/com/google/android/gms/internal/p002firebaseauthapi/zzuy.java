package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzuy extends zzaku<zzuy, zza> implements zzama {
    private static final zzuy zzc;
    private static volatile zzaml<zzuy> zzd;
    private int zze;
    private int zzf;
    private zzus zzg;
    private zzaje zzh;
    private zzaje zzi;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzuy, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzuy.zzc);
        }
    }

    static {
        zzuy zzuyVar = new zzuy();
        zzc = zzuyVar;
        zzaku.n(zzuy.class, zzuyVar);
    }

    private zzuy() {
        zzaje zzajeVar = zzaje.f10066b;
        this.zzh = zzajeVar;
        this.zzi = zzajeVar;
    }

    public static /* synthetic */ void B(zzuy zzuyVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzuyVar.zzi = zzajeVar;
    }

    public static zza C() {
        return (zza) zzc.q();
    }

    public static zzuy E() {
        return zzc;
    }

    public static zzaml H() {
        return (zzaml) zzc.l(7);
    }

    public static zzuy w(zzaje zzajeVar, zzakj zzakjVar) {
        return (zzuy) zzaku.h(zzc, zzajeVar, zzakjVar);
    }

    public static /* synthetic */ void y(zzuy zzuyVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzuyVar.zzh = zzajeVar;
    }

    public static /* synthetic */ void z(zzuy zzuyVar, zzus zzusVar) {
        zzuyVar.zzg = zzusVar;
        zzuyVar.zze |= 1;
    }

    public final zzus A() {
        zzus zzusVar = this.zzg;
        return zzusVar == null ? zzus.C() : zzusVar;
    }

    public final zzaje F() {
        return this.zzh;
    }

    public final zzaje G() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzva.f10972a[i11 - 1]) {
            case 1:
                return new zzuy();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzuy> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzuy.class) {
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
