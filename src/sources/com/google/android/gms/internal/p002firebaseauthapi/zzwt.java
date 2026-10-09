package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwt extends zzaku<zzwt, zzb> implements zzama {
    private static final zzwt zzc;
    private static volatile zzaml<zzwt> zzd;
    private int zze;
    private zzalb<zza> zzf = zzamm.f10184e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku<zza, C0014zza> implements zzama {
        private static final zza zzc;
        private static volatile zzaml<zza> zzd;
        private int zze;
        private zzwj zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* JADX INFO: renamed from: com.google.android.gms.internal.firebase-auth-api.zzwt$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class C0014zza extends zzaku.zzb<zza, C0014zza> implements zzama {
            public /* synthetic */ C0014zza(int i11) {
                this();
            }

            private C0014zza() {
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

        public static C0014zza C() {
            return (C0014zza) zzc.q();
        }

        public static /* synthetic */ void x(zza zzaVar, zzwj zzwjVar) {
            zzwjVar.getClass();
            zzaVar.zzf = zzwjVar;
            zzaVar.zze |= 1;
        }

        public final zzwj A() {
            zzwj zzwjVar = this.zzf;
            return zzwjVar == null ? zzwj.B() : zzwjVar;
        }

        public final zzwk B() {
            zzwk zzwkVar;
            int i11 = this.zzg;
            if (i11 == 0) {
                zzwkVar = zzwk.UNKNOWN_STATUS;
            } else if (i11 == 1) {
                zzwkVar = zzwk.ENABLED;
            } else if (i11 != 2) {
                zzwkVar = i11 != 3 ? null : zzwk.DESTROYED;
            } else {
                zzwkVar = zzwk.DISABLED;
            }
            return zzwkVar == null ? zzwk.UNRECOGNIZED : zzwkVar;
        }

        public final zzxl E() {
            zzxl zzxlVarA = zzxl.a(this.zzi);
            return zzxlVarA == null ? zzxl.UNRECOGNIZED : zzxlVarA;
        }

        public final boolean F() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
        public final Object l(int i11) {
            zzaml zzaVar;
            switch (zzws.f10986a[i11 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0014zza(0);
                case 3:
                    return new zzamp(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public final int v() {
            return this.zzh;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb extends zzaku.zzb<zzwt, zzb> implements zzama {
        public /* synthetic */ zzb(int i11) {
            this();
        }

        private zzb() {
            super(zzwt.zzc);
        }
    }

    static {
        zzwt zzwtVar = new zzwt();
        zzc = zzwtVar;
        zzaku.n(zzwt.class, zzwtVar);
    }

    private zzwt() {
    }

    public static void A(zzwt zzwtVar, zza zzaVar) {
        zzalb<zza> zzalbVar = zzwtVar.zzf;
        if (!zzalbVar.zzc()) {
            zzwtVar.zzf = zzalbVar.zza(zzalbVar.size() << 1);
        }
        zzwtVar.zzf.add(zzaVar);
    }

    public static zzb C() {
        return (zzb) zzc.q();
    }

    public static zzwt x(ByteArrayInputStream byteArrayInputStream, zzakj zzakjVar) throws zzale {
        zzaku zzakuVarI = zzaku.i(zzc, new zzajx(byteArrayInputStream), zzakjVar);
        zzaku.o(zzakuVarI);
        return (zzwt) zzakuVarI;
    }

    public static zzwt y(byte[] bArr, zzakj zzakjVar) {
        return (zzwt) zzaku.j(zzc, bArr, zzakjVar);
    }

    public final int B() {
        return this.zze;
    }

    public final zzalb E() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzws.f10986a[i11 - 1]) {
            case 1:
                return new zzwt();
            case 2:
                return new zzb(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzaml<zzwt> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzwt.class) {
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
        return this.zzf.size();
    }

    public final zza w(int i11) {
        return this.zzf.get(i11);
    }
}
