package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzno extends zzadu implements zzafd {
    private static final zzno zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzni zze;
    private zznk zzf;

    static {
        zzno zznoVar = new zzno();
        zzg = zznoVar;
        zzadu.t(zzno.class, zznoVar);
    }

    private zzno() {
    }

    public static zzno A(byte[] bArr, zzadf zzadfVar) {
        return (zzno) zzadu.k(zzg, bArr, zzadfVar);
    }

    public static zznn B() {
        return (zznn) zzg.p();
    }

    public final /* synthetic */ void C(zzni zzniVar) {
        this.zze = zzniVar;
        this.zzb |= 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzno();
        }
        if (i12 == 4) {
            return new zznn(zzg);
        }
        if (i12 == 5) {
            return zzg;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzh;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzno.class) {
            try {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }

    public final zzni y() {
        zzni zzniVar = this.zze;
        return zzniVar == null ? zzni.M() : zzniVar;
    }

    public final zznk z() {
        zznk zznkVar = this.zzf;
        return zznkVar == null ? zznk.y() : zznkVar;
    }
}
