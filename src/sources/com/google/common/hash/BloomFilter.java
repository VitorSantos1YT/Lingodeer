package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class BloomFilter<T> implements Predicate<T>, Serializable {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BloomFilterStrategies.LockFreeBitArray f17344a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f17345a;

        public SerialForm(BloomFilter bloomFilter) {
            this.f17345a = BloomFilterStrategies.LockFreeBitArray.a(bloomFilter.f17344a.f17346a);
        }

        public Object readResolve() {
            new BloomFilter(new BloomFilterStrategies.LockFreeBitArray(this.f17345a));
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Strategy extends Serializable {
    }

    public BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray) {
        Preconditions.b(0, "numHashFunctions (%s) must be > 0", false);
        this.f17344a = lockFreeBitArray;
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        throw null;
    }

    @Override // com.google.common.base.Predicate
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BloomFilter) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, null, null, this.f17344a});
    }
}
