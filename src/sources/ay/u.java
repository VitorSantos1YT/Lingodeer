package ay;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends AtomicInteger implements rx.b, qx.k {
    public static final t[] Q = new t[0];
    public static final t[] R = new t[0];
    private static final long serialVersionUID = -2117620485640801370L;
    public volatile boolean H;
    public final AtomicReference K;
    public rx.b L;
    public long M;
    public int N;
    public final ArrayDeque O;
    public int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx.d f3387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile iy.e f3390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f3391f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gy.c f3392t = new gy.c();

    public u(qx.k kVar, tx.d dVar, int i11, int i12) {
        this.f3386a = kVar;
        this.f3387b = dVar;
        this.f3388c = i11;
        this.f3389d = i12;
        if (i11 != Integer.MAX_VALUE) {
            this.O = new ArrayDeque(i11);
        }
        this.K = new AtomicReference(Q);
    }

    public final boolean a() {
        if (this.H) {
            return true;
        }
        if (((Throwable) this.f3392t.get()) == null) {
            return false;
        }
        d();
        this.f3392t.d(this.f3386a);
        return true;
    }

    @Override // rx.b
    public final boolean b() {
        return this.H;
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (ux.b.f(this.L, bVar)) {
            this.L = bVar;
            this.f3386a.c(this);
        }
    }

    public final boolean d() {
        this.L.dispose();
        AtomicReference atomicReference = this.K;
        t[] tVarArr = R;
        t[] tVarArr2 = (t[]) atomicReference.getAndSet(tVarArr);
        if (tVarArr2 == tVarArr) {
            return false;
        }
        for (t tVar : tVarArr2) {
            tVar.getClass();
            ux.b.a(tVar);
        }
        return true;
    }

    @Override // rx.b
    public final void dispose() {
        Throwable thA;
        this.H = true;
        if (!d() || (thA = this.f3392t.a()) == null || thA == gy.f.f29893a) {
            return;
        }
        qx.p.u(thA);
    }

    public final void e() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[PHI: r4
      0x00c6: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00ac, B:66:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    public final void f() {
        int size;
        boolean z11;
        qx.k kVar = this.f3386a;
        int iAddAndGet = 1;
        while (!a()) {
            iy.e eVar = this.f3390e;
            int i11 = 0;
            if (eVar != null) {
                while (!a()) {
                    Object objPoll = eVar.poll();
                    if (objPoll != null) {
                        kVar.onNext(objPoll);
                        i11++;
                    }
                }
                return;
            }
            if (i11 == 0) {
                boolean z12 = this.f3391f;
                iy.e eVar2 = this.f3390e;
                t[] tVarArr = (t[]) this.K.get();
                int length = tVarArr.length;
                if (this.f3388c != Integer.MAX_VALUE) {
                    synchronized (this) {
                        size = this.O.size();
                    }
                } else {
                    size = 0;
                }
                if (z12 && ((eVar2 == null || eVar2.isEmpty()) && length == 0 && size == 0)) {
                    this.f3392t.d(this.f3386a);
                    return;
                }
                if (length != 0) {
                    int iMin = Math.min(length - 1, this.N);
                    for (int i12 = 0; i12 < length; i12++) {
                        if (a()) {
                            return;
                        }
                        t tVar = tVarArr[iMin];
                        iy.f fVar = tVar.f3384c;
                        if (fVar != null) {
                            do {
                                try {
                                    Object objPoll2 = fVar.poll();
                                    if (objPoll2 == null) {
                                        z11 = tVar.f3383b;
                                        iy.f fVar2 = tVar.f3384c;
                                        if (z11 && (fVar2 == null || fVar2.isEmpty())) {
                                            g(tVar);
                                            i11++;
                                        }
                                        iMin++;
                                        if (iMin == length) {
                                            iMin = 0;
                                        }
                                    } else {
                                        kVar.onNext(objPoll2);
                                    }
                                } catch (Throwable th2) {
                                    ef.e.E(th2);
                                    ux.b.a(tVar);
                                    this.f3392t.b(th2);
                                    if (a()) {
                                        return;
                                    }
                                    g(tVar);
                                    i11++;
                                    iMin++;
                                    if (iMin == length) {
                                    }
                                }
                            } while (!a());
                            return;
                        }
                        z11 = tVar.f3383b;
                        iy.f fVar3 = tVar.f3384c;
                        if (z11) {
                            g(tVar);
                            i11++;
                        }
                        iMin++;
                        if (iMin == length) {
                            iMin = 0;
                        }
                    }
                    this.N = iMin;
                }
                if (i11 == 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (this.f3388c != Integer.MAX_VALUE) {
                    i(i11);
                }
            } else if (this.f3388c != Integer.MAX_VALUE) {
                i(i11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(t tVar) {
        t[] tVarArr;
        while (true) {
            AtomicReference atomicReference = this.K;
            t[] tVarArr2 = (t[]) atomicReference.get();
            int length = tVarArr2.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (tVarArr2[i11] == tVar) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                tVarArr = Q;
            } else {
                t[] tVarArr3 = new t[length - 1];
                System.arraycopy(tVarArr2, 0, tVarArr3, 0, i11);
                System.arraycopy(tVarArr2, i11 + 1, tVarArr3, i11, (length - i11) - 1);
                tVarArr = tVarArr3;
            }
            while (!atomicReference.compareAndSet(tVarArr2, tVarArr)) {
                if (atomicReference.get() != tVarArr2) {
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(qx.i iVar) {
        boolean z11;
        do {
            z11 = false;
            if (iVar instanceof tx.f) {
                try {
                    Object obj = ((tx.f) iVar).get();
                    if (obj != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.f3386a.onNext(obj);
                            if (decrementAndGet() != 0) {
                            }
                        } else {
                            iy.e hVar = this.f3390e;
                            if (hVar == null) {
                                hVar = this.f3388c == Integer.MAX_VALUE ? new iy.h(this.f3389d) : new iy.g(this.f3388c);
                                this.f3390e = hVar;
                            }
                            hVar.offer(obj);
                            if (getAndIncrement() != 0) {
                                return;
                            }
                        }
                        f();
                    }
                } catch (Throwable th2) {
                    ef.e.E(th2);
                    this.f3392t.b(th2);
                    e();
                }
                if (this.f3388c == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        iVar = (qx.i) this.O.poll();
                        if (iVar == null) {
                            this.P--;
                            z11 = true;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else {
                this.M++;
                t tVar = new t(this);
                AtomicReference atomicReference = this.K;
                while (true) {
                    t[] tVarArr = (t[]) atomicReference.get();
                    if (tVarArr == R) {
                        ux.b.a(tVar);
                        return;
                    }
                    int length = tVarArr.length;
                    t[] tVarArr2 = new t[length + 1];
                    System.arraycopy(tVarArr, 0, tVarArr2, 0, length);
                    tVarArr2[length] = tVar;
                    do {
                        if (atomicReference.compareAndSet(tVarArr, tVarArr2)) {
                            ((qx.h) iVar).i(tVar);
                            return;
                        }
                    } while (atomicReference.get() == tVarArr);
                }
            }
        } while (!z11);
        e();
    }

    public final void i(int i11) {
        while (true) {
            int i12 = i11 - 1;
            if (i11 == 0) {
                return;
            }
            synchronized (this) {
                try {
                    qx.i iVar = (qx.i) this.O.poll();
                    if (iVar == null) {
                        this.P--;
                    } else {
                        h(iVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i12;
        }
    }

    @Override // qx.k
    public final void onComplete() {
        if (this.f3391f) {
            return;
        }
        this.f3391f = true;
        e();
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        if (this.f3391f) {
            qx.p.u(th2);
        } else if (this.f3392t.b(th2)) {
            this.f3391f = true;
            e();
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        if (this.f3391f) {
            return;
        }
        try {
            Object objApply = this.f3387b.apply(obj);
            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
            qx.i iVar = (qx.i) objApply;
            if (this.f3388c != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i11 = this.P;
                        if (i11 == this.f3388c) {
                            this.O.offer(iVar);
                            return;
                        }
                        this.P = i11 + 1;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            h(iVar);
        } catch (Throwable th3) {
            ef.e.E(th3);
            this.L.dispose();
            onError(th3);
        }
    }
}
