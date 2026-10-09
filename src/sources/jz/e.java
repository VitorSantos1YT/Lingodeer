package jz;

import se.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f37397a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37398b;

    static {
        Integer num = bz.a.f6397a;
        f37398b = (num == null || num.intValue() >= 34) ? new kz.a() : new b();
    }

    public abstract int a(int i11);

    public abstract double b();

    public abstract int c();

    public abstract int d(int i11);

    public int e(int i11, int i12) {
        int iC;
        int i13;
        int iA;
        if (i12 <= i11) {
            throw new IllegalArgumentException(i.f(Integer.valueOf(i11), Integer.valueOf(i12)).toString());
        }
        int i14 = i12 - i11;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                iA = a(31 - Integer.numberOfLeadingZeros(i14));
            } else {
                do {
                    iC = c() >>> 1;
                    i13 = iC % i14;
                } while ((i14 - 1) + (iC - i13) < 0);
                iA = i13;
            }
            return i11 + iA;
        }
        while (true) {
            int iC2 = c();
            if (i11 <= iC2 && iC2 < i12) {
                return iC2;
            }
        }
    }
}
