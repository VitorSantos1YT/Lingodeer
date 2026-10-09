package jx;

import bx.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReferenceArray implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f37382f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f37384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f37385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f37386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37387e;

    public a(int i11) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i11 - 1)));
        this.f37383a = length() - 1;
        this.f37384b = new AtomicLong();
        this.f37386d = new AtomicLong();
        this.f37387e = Math.min(i11 / 4, f37382f.intValue());
    }

    @Override // bx.g
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return this.f37384b.get() == this.f37386d.get();
    }

    @Override // bx.g
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f37384b;
        long j11 = atomicLong.get();
        int i11 = this.f37383a;
        int i12 = ((int) j11) & i11;
        if (j11 >= this.f37385c) {
            long j12 = ((long) this.f37387e) + j11;
            if (get(i11 & ((int) j12)) == null) {
                this.f37385c = j12;
            } else if (get(i12) != null) {
                return false;
            }
        }
        lazySet(i12, obj);
        atomicLong.lazySet(j11 + 1);
        return true;
    }

    @Override // bx.g
    public final Object poll() {
        AtomicLong atomicLong = this.f37386d;
        long j11 = atomicLong.get();
        int i11 = ((int) j11) & this.f37383a;
        Object obj = get(i11);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j11 + 1);
        lazySet(i11, null);
        return obj;
    }
}
