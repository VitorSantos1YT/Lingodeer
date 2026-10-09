package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f1484b = new h(e0.f1464b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f1485c;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1486a;

    static {
        f1485c = c.a() ? new e(1) : new e(0);
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

    public static h e(byte[] bArr, int i11, int i12) {
        byte[] bArrCopyOfRange;
        d(i11, i11 + i12, bArr.length);
        switch (f1485c.f1462a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i11, i12 + i11);
                break;
            default:
                bArrCopyOfRange = new byte[i12];
                System.arraycopy(bArr, i11, bArrCopyOfRange, 0, i12);
                break;
        }
        return new h(bArrCopyOfRange);
    }

    public abstract byte b(int i11);

    public abstract void f(byte[] bArr, int i11);

    public abstract byte g(int i11);

    public final int hashCode() {
        int i11 = this.f1486a;
        if (i11 != 0) {
            return i11;
        }
        int size = size();
        h hVar = (h) this;
        int iH = hVar.h();
        int i12 = size;
        for (int i13 = iH; i13 < iH + size; i13++) {
            i12 = (i12 * 31) + hVar.f1479d[i13];
        }
        if (i12 == 0) {
            i12 = 1;
        }
        this.f1486a = i12;
        return i12;
    }

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = jh.h.h(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            h hVar = (h) this;
            int iD = d(0, 47, hVar.size());
            sb2.append(jh.h.h(iD == 0 ? f1484b : new f(hVar.f1479d, hVar.h(), iD)));
            sb2.append("...");
            string = sb2.toString();
        }
        return ep.a.k(defpackage.e.q(size, "<ByteString@", hexString, " size=", " contents=\""), string, "\">");
    }
}
