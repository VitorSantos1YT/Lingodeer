package com.google.common.util.concurrent;

import com.google.common.primitives.ImmutableLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient AtomicLongArray f17616a;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i11 = objectInputStream.readInt();
        ImmutableLongArray.Builder builder = new ImmutableLongArray.Builder();
        builder.f17513b = 0;
        builder.f17512a = new long[10];
        for (int i12 = 0; i12 < i11; i12++) {
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(objectInputStream.readDouble());
            int i13 = builder.f17513b;
            int i14 = i13 + 1;
            long[] jArr = builder.f17512a;
            if (i14 > jArr.length) {
                int length = jArr.length;
                if (i14 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int iHighestOneBit = length + (length >> 1) + 1;
                if (iHighestOneBit < i14) {
                    iHighestOneBit = Integer.highestOneBit(i13) << 1;
                }
                if (iHighestOneBit < 0) {
                    iHighestOneBit = Integer.MAX_VALUE;
                }
                builder.f17512a = Arrays.copyOf(jArr, iHighestOneBit);
            }
            long[] jArr2 = builder.f17512a;
            int i15 = builder.f17513b;
            jArr2[i15] = jDoubleToRawLongBits;
            builder.f17513b = i15 + 1;
        }
        int i16 = builder.f17513b;
        ImmutableLongArray immutableLongArray = i16 == 0 ? ImmutableLongArray.f17507d : new ImmutableLongArray(builder.f17512a, 0, i16);
        this.f17616a = new AtomicLongArray(Arrays.copyOfRange(immutableLongArray.f17508a, immutableLongArray.f17509b, immutableLongArray.f17510c));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = this.f17616a.length();
        objectOutputStream.writeInt(length);
        for (int i11 = 0; i11 < length; i11++) {
            objectOutputStream.writeDouble(Double.longBitsToDouble(this.f17616a.get(i11)));
        }
    }

    public final String toString() {
        int length = this.f17616a.length();
        int i11 = length - 1;
        if (i11 == -1) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(length * 19);
        sb2.append('[');
        int i12 = 0;
        while (true) {
            sb2.append(Double.longBitsToDouble(this.f17616a.get(i12)));
            if (i12 == i11) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            i12++;
        }
    }
}
