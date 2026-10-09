package androidx.glance.appwidget.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f1934b = new g(b0.f1913b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f1935c;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1936a;

    static {
        f1935c = c.a() ? new d(1) : new d(0);
    }

    public static int d(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(hh.p0.h(i11, "Beginning index: ", " < 0"));
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(nv.p.p("Beginning index larger than ending index: ", i11, i12, ", "));
        }
        throw new IndexOutOfBoundsException(nv.p.p("End index: ", i12, i13, " >= "));
    }

    public static g e(byte[] bArr, int i11, int i12) {
        byte[] bArrCopyOfRange;
        d(i11, i11 + i12, bArr.length);
        switch (f1935c.f1917a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i11, i12 + i11);
                break;
            default:
                bArrCopyOfRange = new byte[i12];
                System.arraycopy(bArr, i11, bArrCopyOfRange, 0, i12);
                break;
        }
        return new g(bArrCopyOfRange);
    }

    public abstract byte b(int i11);

    public abstract byte f(int i11);

    public final int hashCode() {
        int i11 = this.f1936a;
        if (i11 != 0) {
            return i11;
        }
        int size = size();
        g gVar = (g) this;
        int iG = gVar.g();
        int i12 = size;
        for (int i13 = iG; i13 < iG + size; i13++) {
            i12 = (i12 * 31) + gVar.f1931d[i13];
        }
        if (i12 == 0) {
            i12 = 1;
        }
        this.f1936a = i12;
        return i12;
    }

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = qx.b.m(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            g gVar = (g) this;
            int iD = d(0, 47, gVar.size());
            sb2.append(qx.b.m(iD == 0 ? f1934b : new e(gVar.f1931d, gVar.g(), iD)));
            sb2.append("...");
            string = sb2.toString();
        }
        return ep.a.k(defpackage.e.q(size, "<ByteString@", hexString, " size=", " contents=\""), string, "\">");
    }
}
