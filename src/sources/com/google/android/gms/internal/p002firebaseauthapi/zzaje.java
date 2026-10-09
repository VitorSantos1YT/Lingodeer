package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e;
import ep.a;
import hh.p0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzaje implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzaje f10066b = new zzajp(zzakw.f10134a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzajo f10067c = new zzajo(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10068a = 0;

    static {
        new zzajg();
    }

    public static int e(int i11, int i12, int i13) {
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

    public static zzaje g(byte[] bArr, int i11, int i12) {
        try {
            return m(bArr, i11, i12);
        } catch (zzale e8) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e8);
        }
    }

    public static /* synthetic */ boolean k(int i11, int i12, int i13, byte[] bArr, byte[] bArr2) {
        int i14 = i11 + i13;
        e(i11, i14, bArr.length);
        e(i12, i13 + i12, bArr2.length);
        while (i11 < i14) {
            if (bArr[i11] != bArr2[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    public static zzaje m(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return f10066b;
        }
        e(i11, i11 + i12, bArr.length);
        f10067c.getClass();
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new zzajp(bArr2);
    }

    public abstract byte b(int i11);

    public abstract int d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaje)) {
            return false;
        }
        zzaje zzajeVar = (zzaje) obj;
        int iD = d();
        if (iD != zzajeVar.d()) {
            return false;
        }
        if (iD == 0) {
            return true;
        }
        int i11 = this.f10068a;
        int i12 = zzajeVar.f10068a;
        if (i11 == 0 || i12 == 0 || i11 == i12) {
            return l(zzajeVar);
        }
        return false;
    }

    public abstract zzaje f(int i11, int i12);

    public abstract void h(zzakb zzakbVar);

    public final int hashCode() {
        int iN = this.f10068a;
        if (iN == 0) {
            int iD = d();
            iN = n(iD, iD);
            if (iN == 0) {
                iN = 1;
            }
            this.f10068a = iN;
        }
        return iN;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzajh(this);
    }

    public abstract void j(byte[] bArr, int i11);

    public abstract boolean l(zzaje zzajeVar);

    public abstract int n(int i11, int i12);

    public abstract zzajq o();

    public final byte[] r() {
        int iD = d();
        if (iD == 0) {
            return zzakw.f10134a;
        }
        byte[] bArr = new byte[iD];
        j(bArr, iD);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.k(e.q(d(), "<ByteString@", hexString, " size=", " contents=\""), d() <= 50 ? zzana.a(r()) : e.m(zzana.a(f(0, 47).r()), "..."), "\">");
    }
}
