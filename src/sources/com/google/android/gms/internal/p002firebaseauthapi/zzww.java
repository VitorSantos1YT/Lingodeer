package com.google.android.gms.internal.p002firebaseauthapi;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzww extends zzaku<zzww, zzb> implements zzama {
    private static final zzww zzc;
    private static volatile zzaml<zzww> zzd;
    private int zze;
    private zzalb<zza> zzf = zzamm.f10184e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku<zza, C0015zza> implements zzama {
        private static final zza zzc;
        private static volatile zzaml<zza> zzd;
        private String zze = BuildConfig.VERSION_NAME;
        private int zzf;
        private int zzg;
        private int zzh;

        /* JADX INFO: renamed from: com.google.android.gms.internal.firebase-auth-api.zzww$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class C0015zza extends zzaku.zzb<zza, C0015zza> implements zzama {
            public /* synthetic */ C0015zza(int i11) {
                this();
            }

            private C0015zza() {
                super(zza.zzc);
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzaku.n(zza.class, zzaVar);
        }

        private zza() {
        }

        public static /* synthetic */ void y(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze = str;
        }

        public static C0015zza z() {
            return (C0015zza) zzc.q();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
        public final Object l(int i11) {
            zzaml zzaVar;
            switch (zzwv.f10987a[i11 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0015zza(0);
                case 3:
                    return new zzamp(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzaml<zza> zzamlVar = zzd;
                    if (zzamlVar != null) {
                        return zzamlVar;
                    }
                    synchronized (zza.class) {
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

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb extends zzaku.zzb<zzww, zzb> implements zzama {
        public /* synthetic */ zzb(int i11) {
            this();
        }

        private zzb() {
            super(zzww.zzc);
        }
    }

    static {
        zzww zzwwVar = new zzww();
        zzc = zzwwVar;
        zzaku.n(zzww.class, zzwwVar);
    }

    private zzww() {
    }

    public static void w(zzww zzwwVar, zza zzaVar) {
        zzalb<zza> zzalbVar = zzwwVar.zzf;
        if (!zzalbVar.zzc()) {
            zzwwVar.zzf = zzalbVar.zza(zzalbVar.size() << 1);
        }
        zzwwVar.zzf.add(zzaVar);
    }

    public static zzb x() {
        return (zzb) zzc.q();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzwv.f10987a[i11 - 1]) {
            case 1:
                return new zzww();
            case 2:
                return new zzb(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzaml<zzww> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzww.class) {
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
