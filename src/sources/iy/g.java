package iy;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends AtomicReferenceArray implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f34894f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f34896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f34897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f34898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34899e;

    public g(int i11) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i11 - 1)));
        this.f34895a = length() - 1;
        this.f34896b = new AtomicLong();
        this.f34898d = new AtomicLong();
        this.f34899e = Math.min(i11 / 4, f34894f.intValue());
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
        return this.f34896b.get() == this.f34898d.get();
    }

    @Override // iy.f
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f34896b;
        long j11 = atomicLong.get();
        int i11 = this.f34895a;
        int i12 = ((int) j11) & i11;
        if (j11 >= this.f34897c) {
            long j12 = ((long) this.f34899e) + j11;
            if (get(i11 & ((int) j12)) == null) {
                this.f34897c = j12;
            } else if (get(i12) != null) {
                return false;
            }
        }
        lazySet(i12, obj);
        atomicLong.lazySet(j11 + 1);
        return true;
    }

    @Override // iy.f
    public final Object poll() {
        AtomicLong atomicLong = this.f34898d;
        long j11 = atomicLong.get();
        int i11 = ((int) j11) & this.f34895a;
        Object obj = get(i11);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j11 + 1);
        lazySet(i11, null);
        return obj;
    }
}
