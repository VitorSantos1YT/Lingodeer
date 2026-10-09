package wz;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {
    private volatile AtomicReferenceArray<Object> array;

    public p(int i11) {
        this.array = new AtomicReferenceArray<>(i11);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i11) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i11 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i11);
        }
        return null;
    }

    public final void c(int i11, yz.b bVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i11 < length) {
            atomicReferenceArray.set(i11, bVar);
            return;
        }
        int i12 = i11 + 1;
        int i13 = length * 2;
        if (i12 < i13) {
            i12 = i13;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i12);
        for (int i14 = 0; i14 < length; i14++) {
            atomicReferenceArray2.set(i14, atomicReferenceArray.get(i14));
        }
        atomicReferenceArray2.set(i11, bVar);
        this.array = atomicReferenceArray2;
    }
}
