package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class Hashing {
    private Hashing() {
    }

    public static int a(int i11, double d5) {
        int iMax = Math.max(i11, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d5 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i12 = iHighestOneBit << 1;
        if (i12 > 0) {
            return i12;
        }
        return 1073741824;
    }

    public static int b(int i11) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i11) * (-862048943)), 15)) * 461845907);
    }

    public static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
