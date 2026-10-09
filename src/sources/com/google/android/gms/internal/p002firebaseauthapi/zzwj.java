package com.google.android.gms.internal.p002firebaseauthapi;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwj extends zzaku<zzwj, zzb> implements zzama {
    private static final zzwj zzc;
    private static volatile zzaml<zzwj> zzd;
    private String zze = BuildConfig.VERSION_NAME;
    private zzaje zzf = zzaje.f10066b;
    private int zzg;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum zza implements zzakz {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private final int zzh;

        zza(int i11) {
            this.zzh = i11;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(zza.class.getName());
            sb2.append('@');
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb2.append(" number=");
                sb2.append(zza());
            }
            sb2.append(" name=");
            sb2.append(name());
            sb2.append('>');
            return sb2.toString();
        }

        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzh;
            }
            zzakw.c();
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb extends zzaku.zzb<zzwj, zzb> implements zzama {
        public /* synthetic */ zzb(int i11) {
            this();
        }

        private zzb() {
            super(zzwj.zzc);
        }
    }

    static {
        zzwj zzwjVar = new zzwj();
        zzc = zzwjVar;
        zzaku.n(zzwj.class, zzwjVar);
    }

    private zzwj() {
    }

    public static zzwj B() {
        return zzc;
    }

    public static zzb v() {
        return (zzb) zzc.q();
    }

    public static /* synthetic */ void w(zzwj zzwjVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzwjVar.zzf = zzajeVar;
    }

    public static /* synthetic */ void y(zzwj zzwjVar, String str) {
        str.getClass();
        zzwjVar.zze = str;
    }

    public final zzaje C() {
        return this.zzf;
    }

    public final String D() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzwi.f10983a[i11 - 1]) {
            case 1:
                return new zzwj();
            case 2:
                return new zzb(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzwj> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzwj.class) {
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

    public final zza z() {
        zza zzaVar;
        int i11 = this.zzg;
        if (i11 == 0) {
            zzaVar = zza.UNKNOWN_KEYMATERIAL;
        } else if (i11 == 1) {
            zzaVar = zza.SYMMETRIC;
        } else if (i11 == 2) {
            zzaVar = zza.ASYMMETRIC_PRIVATE;
        } else if (i11 != 3) {
            zzaVar = i11 != 4 ? null : zza.REMOTE;
        } else {
            zzaVar = zza.ASYMMETRIC_PUBLIC;
        }
        return zzaVar == null ? zza.UNRECOGNIZED : zzaVar;
    }
}
