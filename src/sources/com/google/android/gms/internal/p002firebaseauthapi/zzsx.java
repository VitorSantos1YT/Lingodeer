package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsx extends zzaku<zzsx, zza> implements zzama {
    private static final zzsx zzc;
    private static volatile zzaml<zzsx> zzd;
    private int zze;
    private int zzf;
    private zztd zzg;
    private zzaje zzh = zzaje.f10066b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzsx, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzsx.zzc);
        }
    }

    static {
        zzsx zzsxVar = new zzsx();
        zzc = zzsxVar;
        zzaku.n(zzsx.class, zzsxVar);
    }

    private zzsx() {
    }

    public static zzsx A() {
        return zzc;
    }

    public static /* synthetic */ void w(zzsx zzsxVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzsxVar.zzh = zzajeVar;
    }

    public static /* synthetic */ void x(zzsx zzsxVar, zztd zztdVar) {
        zzsxVar.zzg = zztdVar;
        zzsxVar.zze |= 1;
    }

    public static zza y() {
        return (zza) zzc.q();
    }

    public final zztd B() {
        zztd zztdVar = this.zzg;
        return zztdVar == null ? zztd.z() : zztdVar;
    }

    public final zzaje C() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzsw.f10950a[i11 - 1]) {
            case 1:
                return new zzsx();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzsx> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzsx.class) {
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
