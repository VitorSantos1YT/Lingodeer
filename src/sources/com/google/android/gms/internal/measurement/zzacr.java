package com.google.android.gms.internal.measurement;

import defpackage.e;
import ep.a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzacr implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzacr f11213b = new zzacq(zzaed.f11274a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11214a = 0;

    static {
        int i11 = zzacf.f11197a;
    }

    public static zzacr k(byte[] bArr, int i11, int i12) {
        try {
            return l(bArr, i11, i12);
        } catch (zzaeh e8) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e8);
        }
    }

    public static zzacr l(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return f11213b;
        }
        n(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new zzacq(bArr2);
    }

    public static int n(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i11);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < i11) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 44 + String.valueOf(i12).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i12).length() + 15 + String.valueOf(i13).length());
        sb4.append("End index: ");
        sb4.append(i12);
        sb4.append(" >= ");
        sb4.append(i13);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public static /* synthetic */ boolean o(int i11, int i12, int i13, byte[] bArr, byte[] bArr2) {
        int i14 = i11 + i13;
        n(i11, i14, bArr.length);
        n(i12, i13 + i12, bArr2.length);
        while (i11 < i14) {
            if (bArr[i11] != bArr2[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    public abstract byte b(int i11);

    public abstract int d();

    public abstract zzacr e(int i11, int i12);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacr)) {
            return false;
        }
        zzacr zzacrVar = (zzacr) obj;
        int iD = d();
        if (iD != zzacrVar.d()) {
            return false;
        }
        if (iD == 0) {
            return true;
        }
        int i11 = this.f11214a;
        int i12 = zzacrVar.f11214a;
        if (i11 == 0 || i12 == 0 || i11 == i12) {
            return h(zzacrVar);
        }
        return false;
    }

    public abstract void f(byte[] bArr, int i11);

    public abstract void g(zzada zzadaVar);

    public abstract boolean h(zzacr zzacrVar);

    public final int hashCode() {
        int iJ = this.f11214a;
        if (iJ == 0) {
            int iD = d();
            iJ = j(iD, iD);
            if (iJ == 0) {
                iJ = 1;
            }
            this.f11214a = iJ;
        }
        return iJ;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzack(this);
    }

    public abstract int j(int i11, int i12);

    public final byte[] m() {
        int iD = d();
        if (iD == 0) {
            return zzaed.f11274a;
        }
        byte[] bArr = new byte[iD];
        f(bArr, iD);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.k(e.q(d(), "<ByteString@", hexString, " size=", " contents=\""), d() <= 50 ? zzafx.a(m()) : zzafx.a(e(0, 47).m()).concat("..."), "\">");
    }
}
