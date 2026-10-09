package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvh extends zzaku<zzvh, zza> implements zzama {
    private static final zzvh zzc;
    private static volatile zzaml<zzvh> zzd;
    private int zze;
    private zzaje zzf = zzaje.f10066b;
    private zzww zzg;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzaku.zzb<zzvh, zza> implements zzama {
        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            super(zzvh.zzc);
        }
    }

    static {
        zzvh zzvhVar = new zzvh();
        zzc = zzvhVar;
        zzaku.n(zzvh.class, zzvhVar);
    }

    private zzvh() {
    }

    public static zzvh v(ByteArrayInputStream byteArrayInputStream, zzakj zzakjVar) throws zzale {
        zzaku zzakuVarI = zzaku.i(zzc, new zzajx(byteArrayInputStream), zzakjVar);
        zzaku.o(zzakuVarI);
        return (zzvh) zzakuVarI;
    }

    public static /* synthetic */ void w(zzvh zzvhVar, zzaje zzajeVar) {
        zzajeVar.getClass();
        zzvhVar.zzf = zzajeVar;
    }

    public static /* synthetic */ void x(zzvh zzvhVar, zzww zzwwVar) {
        zzvhVar.zzg = zzwwVar;
        zzvhVar.zze |= 1;
    }

    public static zza y() {
        return (zza) zzc.q();
    }

    public final zzaje A() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaku
    public final Object l(int i11) {
        zzaml zzaVar;
        switch (zzvg.f10974a[i11 - 1]) {
            case 1:
                return new zzvh();
            case 2:
                return new zza(0);
            case 3:
                return new zzamp(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaml<zzvh> zzamlVar = zzd;
                if (zzamlVar != null) {
                    return zzamlVar;
                }
                synchronized (zzvh.class) {
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
