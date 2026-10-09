package iy;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements e {
    public static final int K = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object L = new Object();
    public final AtomicLong H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f34900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f34902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray f34904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34905f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AtomicReferenceArray f34906t;

    public h(int i11) {
        AtomicLong atomicLong = new AtomicLong();
        this.f34900a = atomicLong;
        this.H = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i11) - 1));
        int i12 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.f34904e = atomicReferenceArray;
        this.f34903d = i12;
        this.f34901b = Math.min(iNumberOfLeadingZeros / 4, K);
        this.f34906t = atomicReferenceArray;
        this.f34905f = i12;
        this.f34902c = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // iy.f
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // iy.f
    public final boolean isEmpty() {
        return this.f34900a.get() == this.H.get();
    }

    @Override // iy.f
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f34904e;
        AtomicLong atomicLong = this.f34900a;
        long j11 = atomicLong.get();
        int i11 = this.f34903d;
        int i12 = ((int) j11) & i11;
        if (j11 < this.f34902c) {
            atomicReferenceArray.lazySet(i12, obj);
            atomicLong.lazySet(j11 + 1);
            return true;
        }
        long j12 = ((long) this.f34901b) + j11;
        if (atomicReferenceArray.get(((int) j12) & i11) == null) {
            this.f34902c = j12 - 1;
            atomicReferenceArray.lazySet(i12, obj);
            atomicLong.lazySet(j11 + 1);
            return true;
        }
        long j13 = j11 + 1;
        if (atomicReferenceArray.get(((int) j13) & i11) == null) {
            atomicReferenceArray.lazySet(i12, obj);
            atomicLong.lazySet(j13);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f34904e = atomicReferenceArray2;
        this.f34902c = (j11 + ((long) i11)) - 1;
        atomicReferenceArray2.lazySet(i12, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i12, L);
        atomicLong.lazySet(j13);
        return true;
    }

    @Override // iy.f
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f34906t;
        AtomicLong atomicLong = this.H;
        long j11 = atomicLong.get();
        int i11 = this.f34905f;
        int i12 = ((int) j11) & i11;
        Object obj = atomicReferenceArray.get(i12);
        boolean z11 = obj == L;
        if (obj != null && !z11) {
            atomicReferenceArray.lazySet(i12, null);
            atomicLong.lazySet(j11 + 1);
            return obj;
        }
        if (!z11) {
            return null;
        }
        int i13 = i11 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i13);
        atomicReferenceArray.lazySet(i13, null);
        this.f34906t = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i12);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i12, null);
            atomicLong.lazySet(j11 + 1);
        }
        return obj2;
    }
}
