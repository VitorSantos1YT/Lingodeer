package com.google.android.gms.internal.play_billing;

import defpackage.e;
import hh.p0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzei implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzei f12350b = new zzeg(zzfo.f12384b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12351a = 0;

    static {
        int i11 = zzdv.f12333a;
    }

    public static int j(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(p0.h(i11, "Beginning index: ", " < 0"));
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(p.p("Beginning index larger than ending index: ", i11, i12, ", "));
        }
        throw new IndexOutOfBoundsException(p.p("End index: ", i12, i13, " >= "));
    }

    public static zzei k(byte[] bArr, int i11, int i12) {
        j(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new zzeg(bArr2);
    }

    public abstract byte b(int i11);

    public abstract byte d(int i11);

    public abstract int e();

    public abstract boolean equals(Object obj);

    public abstract int f(int i11, int i12);

    public abstract zzei g();

    public abstract void h(zzdz zzdzVar);

    public final int hashCode() {
        int iF = this.f12351a;
        if (iF == 0) {
            int iE = e();
            iF = f(iE, iE);
            if (iF == 0) {
                iF = 1;
            }
            this.f12351a = iF;
        }
        return iF;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzea(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return ep.a.k(e.q(e(), "<ByteString@", hexString, " size=", " contents=\""), e() <= 50 ? zzhf.a(this) : zzhf.a(g()).concat("..."), "\">");
    }
}
