package com.google.common.collect;

import com.google.common.base.Objects;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class CompactHashing {
    private CompactHashing() {
    }

    public static Object a(int i11) {
        if (i11 < 2 || i11 > 1073741824 || Integer.highestOneBit(i11) != i11) {
            throw new IllegalArgumentException(p.j(i11, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i11 <= 256) {
            return new byte[i11];
        }
        return i11 <= 65536 ? new short[i11] : new int[i11];
    }

    public static int b(int i11, int i12, int i13) {
        return (i11 & (~i13)) | (i12 & i13);
    }

    public static int c(int i11) {
        return (i11 + 1) * (i11 < 32 ? 4 : 2);
    }

    public static int d(Object obj, Object obj2, int i11, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iC = Hashing.c(obj);
        int i12 = iC & i11;
        int iE = e(i12, obj3);
        if (iE != 0) {
            int i13 = ~i11;
            int i14 = iC & i13;
            int i15 = -1;
            while (true) {
                int i16 = iE - 1;
                int i17 = iArr[i16];
                if ((i17 & i13) == i14 && Objects.a(obj, objArr[i16]) && (objArr2 == null || Objects.a(obj2, objArr2[i16]))) {
                    int i18 = i17 & i11;
                    if (i15 == -1) {
                        f(i12, i18, obj3);
                        return i16;
                    }
                    iArr[i15] = b(iArr[i15], i18, i11);
                    return i16;
                }
                int i19 = i17 & i11;
                if (i19 == 0) {
                    break;
                }
                i15 = i16;
                iE = i19;
            }
        }
        return -1;
    }

    public static int e(int i11, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i11] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i11] & 65535 : ((int[]) obj)[i11];
    }

    public static void f(int i11, int i12, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i11] = (byte) i12;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i11] = (short) i12;
        } else {
            ((int[]) obj)[i11] = i12;
        }
    }
}
