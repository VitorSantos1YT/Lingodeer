package l1;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o2 {
    public static final int a(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i11, int i12) {
        int iE = e(arrayList, i11, i12);
        return iE >= 0 ? iE : -(iE + 1);
    }

    public static final int c(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return Integer.bitCount(iArr[i12 + 1] >> 28) + iArr[i12 + 4];
    }

    public static final void d(int i11, int i12, int[] iArr) {
        if (i12 >= 0) {
        }
        int i13 = (i11 * 5) + 1;
        iArr[i13] = i12 | (iArr[i13] & (-67108864));
    }

    public static final int e(ArrayList arrayList, int i11, int i12) {
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            int i15 = ((b) arrayList.get(i14)).f39235a;
            if (i15 < 0) {
                i15 += i12;
            }
            int iH = kotlin.jvm.internal.m.h(i15, i11);
            if (iH < 0) {
                i13 = i14 + 1;
            } else {
                if (iH <= 0) {
                    return i14;
                }
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
