package com.google.android.recaptcha.internal;

import defpackage.e;
import ep.a;
import hh.p0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import lt.AJC.PQgum;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzle implements Iterable, Serializable {
    public static final zzle zzb = new zzlc(zznl.zzb);
    private int zza = 0;

    static {
        int i11 = zzks.zza;
    }

    public static zzle zzk(byte[] bArr, int i11, int i12) {
        zzi(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new zzlc(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzf = this.zza;
        if (iZzf == 0) {
            int iZzd = zzd();
            iZzf = zzf(iZzd, 0, iZzd);
            if (iZzf == 0) {
                iZzf = 1;
            }
            this.zza = iZzf;
        }
        return iZzf;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkx(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.k(e.q(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzpg.zza(this) : zzpg.zza(zzg(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i11);

    public abstract byte zzb(int i11);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i11, int i12, int i13);

    public abstract int zzf(int i11, int i12, int i13);

    public abstract zzle zzg(int i11, int i12);

    public abstract void zzh(zzkw zzkwVar);

    public final int zzj() {
        return this.zza;
    }

    public final byte[] zzl() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zznl.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    public static int zzi(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(p0.h(i11, "Beginning index: ", PQgum.uWG));
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(p.p("Beginning index larger than ending index: ", i11, i12, ", "));
        }
        throw new IndexOutOfBoundsException(p.p("End index: ", i12, i13, " >= "));
    }
}
