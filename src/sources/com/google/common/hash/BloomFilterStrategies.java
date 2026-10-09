package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
    };

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LockFreeBitArray {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicLongArray f17346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LongAddable f17347b;

        public LockFreeBitArray(long[] jArr) {
            Preconditions.e("data length is zero!", jArr.length > 0);
            this.f17346a = new AtomicLongArray(jArr);
            this.f17347b = (LongAddable) LongAddables.f17369a.get();
            long jBitCount = 0;
            for (long j11 : jArr) {
                jBitCount += (long) Long.bitCount(j11);
            }
            this.f17347b.add(jBitCount);
        }

        public static long[] a(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                jArr[i11] = atomicLongArray.get(i11);
            }
            return jArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof LockFreeBitArray) {
                return Arrays.equals(a(this.f17346a), a(((LockFreeBitArray) obj).f17346a));
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(a(this.f17346a));
        }
    }
}
