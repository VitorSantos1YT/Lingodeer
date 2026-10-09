package com.google.android.gms.internal.p002firebaseauthapi;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwn extends zzaku<zzwn, zza> implements zzama {
    private static final zzwn zzc;
    private static volatile zzaml<zzwn> zzd;
    private String zze = BuildConfig.VERSION_NAME;
    private zzaje zzf = zzaje.f10066b;
    private int zzg;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzwn, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        public final void k(zzxl zzxlVar) {
            i();
            zzwn.y((zzwn) this.f10131b, zzxlVar);
        }

        public final void l(String str) {
            i();
            zzwn.z((zzwn) this.f10131b, str);
        }

        public final void m(zzaje zzajeVar) {
            i();
            zzwn.x((zzwn) this.f10131b, zzajeVar);
        }

        private zza() {
            super(zzwn.zzc);
        }
    }

    static {
        zzwn zzwnVar = new zzwn();
        zzc = zzwnVar;
        zzaku.n(zzwn.class, zzwnVar);
    }

    private zzwn() {
    }

    public static zzwn B() {
        return zzc;
    }

    public static zza v() {
        return (zza) zzc.q();
    }

    public static zzwn w(byte[] bArr, zzakj zzakjVar) {
        return (zzwn) zzaku.j(zzc, bArr, zzakjVar);
    }

    public static /* synthetic */ void x(zzwn zzwnVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzwnVar.zzf = zzajeVar;
    }

    public static /* synthetic */ void y(zzwn zzwnVar, zzxl zzxlVar) {
        zzwnVar.zzg = zzxlVar.zza();
    }

    public static /* synthetic */ void z(zzwn zzwnVar, String str) {
        str.getClass();
        zzwnVar.zze = str;
    }

    public final zzxl C() {
        zzxl zzxlVarA = zzxl.a(this.zzg);
        return zzxlVarA == null ? zzxl.UNRECOGNIZED : zzxlVarA;
    }

    public final zzaje D() {
        return this.zzf;
    }

    public final String E() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzwm.f10984a[i11 - 1]) {
            case 1:
                return new zzwn();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzwn> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzwn.class) {
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
