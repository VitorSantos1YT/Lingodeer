package com.google.android.gms.internal.measurement;

import a.ar.MFeWs;
import androidx.drawerlayout.widget.ktFt.FpIL;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzni extends zzadu implements zzafd {
    private static final zzaec zzl = new zzng();
    private static final zzni zzq;
    private static volatile zzafj zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private zzaef zzi;
    private zzaef zzj;
    private zzaeb zzk;
    private zznm zzm;
    private boolean zzn;
    private boolean zzo;
    private zznf zzp;
    private zzacr zze = zzacr.f11213b;
    private String zzg = BuildConfig.VERSION_NAME;

    static {
        zzni zzniVar = new zzni();
        zzq = zzniVar;
        zzadu.t(zzni.class, zzniVar);
    }

    private zzni() {
        zzafm zzafmVar = zzafm.f11321e;
        this.zzi = zzafmVar;
        this.zzj = zzafmVar;
        this.zzk = zzadv.f11269e;
    }

    public static zznh L() {
        return (zznh) zzq.p();
    }

    public static zzni M() {
        return zzq;
    }

    public final boolean A() {
        return this.zzf;
    }

    public final String B() {
        return this.zzg;
    }

    public final long C() {
        return this.zzh;
    }

    public final zzaef D() {
        return this.zzi;
    }

    public final zzaef E() {
        return this.zzj;
    }

    public final List F() {
        return new zzaed.zza(this.zzk, zzl);
    }

    public final boolean G() {
        return (this.zzb & 16) != 0;
    }

    public final zznm H() {
        zznm zznmVar = this.zzm;
        return zznmVar == null ? zznm.A() : zznmVar;
    }

    public final boolean I() {
        return this.zzn;
    }

    public final boolean J() {
        return this.zzo;
    }

    public final zznf K() {
        zznf zznfVar = this.zzp;
        return zznfVar == null ? zznf.z() : zznfVar;
    }

    public final /* synthetic */ void N(long j11) {
        this.zzb |= 8;
        this.zzh = j11;
    }

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final zzacr z() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", MFeWs.dSt, "zzk", zzaby.f11193a, "zzm", "zzn", FpIL.NfHOKZMVLEF, "zzp"});
        }
        if (i12 == 3) {
            return new zzni();
        }
        if (i12 == 4) {
            return new zznh(zzq);
        }
        if (i12 == 5) {
            return zzq;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzr;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzni.class) {
            try {
                zzadqVar = zzr;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzq);
                    zzr = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }
}
