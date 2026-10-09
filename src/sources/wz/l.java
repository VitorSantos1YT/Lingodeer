package wz;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55529e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f55530f = AtomicLongFieldUpdater.newUpdater(l.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.android.billingclient.api.a f55531g = new com.android.billingclient.api.a("REMOVE_FROZEN", 2);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f55535d;

    public l(int i11, boolean z11) {
        this.f55532a = i11;
        this.f55533b = z11;
        int i12 = i11 - 1;
        this.f55534c = i12;
        this.f55535d = new AtomicReferenceArray(i11);
        if (i12 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i11 & i12) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f55530f;
            long j11 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j11) != 0) {
                return (2305843009213693952L & j11) != 0 ? 2 : 1;
            }
            int i11 = (int) (1073741823 & j11);
            int i12 = (int) ((1152921503533105152L & j11) >> 30);
            int i13 = this.f55534c;
            if (((i12 + 2) & i13) == (i11 & i13)) {
                return 1;
            }
            boolean z11 = this.f55533b;
            AtomicReferenceArray atomicReferenceArray = this.f55535d;
            if (z11 || atomicReferenceArray.get(i12 & i13) == null) {
                if (f55530f.compareAndSet(this, j11, ((-1152921503533105153L) & j11) | (((long) ((i12 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i12 & i13, obj);
                    l lVarC = this;
                    while ((atomicLongFieldUpdater.get(lVarC) & 1152921504606846976L) != 0) {
                        lVarC = lVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = lVarC.f55535d;
                        int i14 = lVarC.f55534c & i12;
                        Object obj2 = atomicReferenceArray2.get(i14);
                        if ((obj2 instanceof k) && ((k) obj2).f55528a == i12) {
                            atomicReferenceArray2.set(i14, obj);
                        } else {
                            lVarC = null;
                        }
                        if (lVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i15 = this.f55532a;
                if (i15 < 1024 || ((i12 - i11) & 1073741823) > (i15 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        do {
            atomicLongFieldUpdater = f55530f;
            j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j11) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, 2305843009213693952L | j11));
        return true;
    }

    public final l c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        l lVar;
        while (true) {
            atomicLongFieldUpdater = f55530f;
            j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 1152921504606846976L) != 0) {
                lVar = this;
                break;
            }
            long j12 = 1152921504606846976L | j11;
            lVar = this;
            if (atomicLongFieldUpdater.compareAndSet(lVar, j11, j12)) {
                j11 = j12;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55529e;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar2 != null) {
                return lVar2;
            }
            l lVar3 = new l(lVar.f55532a * 2, lVar.f55533b);
            int i11 = (int) (1073741823 & j11);
            int i12 = (int) ((1152921503533105152L & j11) >> 30);
            while (true) {
                int i13 = lVar.f55534c;
                int i14 = i11 & i13;
                if (i14 == (i13 & i12)) {
                    break;
                }
                Object kVar = lVar.f55535d.get(i14);
                if (kVar == null) {
                    kVar = new k(i11);
                }
                lVar3.f55535d.set(lVar3.f55534c & i11, kVar);
                i11++;
            }
            atomicLongFieldUpdater.set(lVar3, (-1152921504606846977L) & j11);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        l lVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f55530f;
            long j11 = atomicLongFieldUpdater.get(lVarC);
            if ((j11 & 1152921504606846976L) != 0) {
                return f55531g;
            }
            int i11 = (int) (j11 & 1073741823);
            int i12 = lVarC.f55534c;
            int i13 = i11 & i12;
            if ((((int) ((1152921503533105152L & j11) >> 30)) & i12) != i13) {
                AtomicReferenceArray atomicReferenceArray = lVarC.f55535d;
                Object obj = atomicReferenceArray.get(i13);
                boolean z11 = lVarC.f55533b;
                if (obj == null) {
                    if (z11) {
                    }
                } else if (!(obj instanceof k)) {
                    long j12 = (i11 + 1) & 1073741823;
                    if (f55530f.compareAndSet(lVarC, j11, (j11 & (-1073741824)) | j12)) {
                        atomicReferenceArray.set(i13, null);
                        return obj;
                    }
                    lVarC = this;
                    if (z11) {
                        while (true) {
                            long j13 = atomicLongFieldUpdater.get(lVarC);
                            int i14 = (int) (j13 & 1073741823);
                            if ((j13 & 1152921504606846976L) != 0) {
                                lVarC = lVarC.c();
                            } else {
                                l lVar = lVarC;
                                if (f55530f.compareAndSet(lVar, j13, (j13 & (-1073741824)) | j12)) {
                                    lVar.f55535d.set(i14 & lVar.f55534c, null);
                                    lVarC = null;
                                } else {
                                    lVarC = lVar;
                                }
                            }
                            if (lVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
