package ex;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends AtomicInteger implements uw.g, n20.c {
    public static final d0[] S = new d0[0];
    public static final d0[] T = new d0[0];
    private static final long serialVersionUID = -2117620485640801370L;
    public volatile boolean H;
    public final AtomicReference K;
    public final AtomicLong L;
    public n20.c M;
    public long N;
    public long O;
    public int P;
    public int Q;
    public final int R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f25990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw.c f25991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile bx.f f25994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f25995f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nx.b f25996t = new nx.b();

    public e0(n20.b bVar, p20.c cVar, int i11, int i12) {
        AtomicReference atomicReference = new AtomicReference();
        this.K = atomicReference;
        this.L = new AtomicLong();
        this.f25990a = bVar;
        this.f25991b = cVar;
        this.f25992c = i11;
        this.f25993d = i12;
        this.R = Math.max(1, i11 >> 1);
        atomicReference.lazySet(S);
    }

    public final boolean a() {
        if (this.H) {
            bx.f fVar = this.f25994e;
            if (fVar != null) {
                fVar.clear();
                return true;
            }
        } else {
            if (this.f25996t.get() == null) {
                return false;
            }
            bx.f fVar2 = this.f25994e;
            if (fVar2 != null) {
                fVar2.clear();
            }
            nx.b bVar = this.f25996t;
            bVar.getClass();
            Throwable thB = nx.e.b(bVar);
            if (thB != nx.e.f44289a) {
                this.f25990a.onError(thB);
            }
        }
        return true;
    }

    public final void b() {
        if (getAndIncrement() == 0) {
            e();
        }
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.M, cVar)) {
            this.M = cVar;
            this.f25990a.c(this);
            if (this.H) {
                return;
            }
            int i11 = this.f25992c;
            if (i11 == Integer.MAX_VALUE) {
                cVar.request(Long.MAX_VALUE);
            } else {
                cVar.request(i11);
            }
        }
    }

    @Override // n20.c
    public final void cancel() {
        bx.f fVar;
        d0[] d0VarArr;
        if (this.H) {
            return;
        }
        this.H = true;
        this.M.cancel();
        AtomicReference atomicReference = this.K;
        d0[] d0VarArr2 = (d0[]) atomicReference.get();
        d0[] d0VarArr3 = T;
        if (d0VarArr2 != d0VarArr3 && (d0VarArr = (d0[]) atomicReference.getAndSet(d0VarArr3)) != d0VarArr3) {
            for (d0 d0Var : d0VarArr) {
                d0Var.getClass();
                mx.g.a(d0Var);
            }
            nx.b bVar = this.f25996t;
            bVar.getClass();
            Throwable thB = nx.e.b(bVar);
            if (thB != null && thB != nx.e.f44289a) {
                qx.b.B(thB);
            }
        }
        if (getAndIncrement() != 0 || (fVar = this.f25994e) == null) {
            return;
        }
        fVar.clear();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0179  */
    /* JADX WARN: Code duplicated, block: B:115:0x0183  */
    /* JADX WARN: Code duplicated, block: B:117:0x0187  */
    /* JADX WARN: Code duplicated, block: B:133:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0181 A[EDGE_INSN: B:153:0x0181->B:114:0x0181 BREAK  A[LOOP:3: B:65:0x00dc->B:118:0x0188], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x013c A[EDGE_INSN: B:160:0x013c->B:91:0x013c BREAK  A[LOOP:5: B:77:0x00fc->B:85:0x0112], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00de  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0107  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112 A[LOOP:5: B:77:0x00fc->B:85:0x0112, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0142  */
    /* JADX WARN: Code duplicated, block: B:95:0x014b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0155  */
    public final void e() {
        boolean z11;
        long j11;
        long j12;
        boolean z12;
        long j13;
        int i11;
        boolean z13;
        int i12;
        d0 d0Var;
        Object objPoll;
        bx.g gVar;
        boolean z14;
        Object obj;
        n20.b bVar = this.f25990a;
        int iAddAndGet = 1;
        while (!a()) {
            bx.f fVar = this.f25994e;
            long jAddAndGet = this.L.get();
            boolean z15 = jAddAndGet == Long.MAX_VALUE;
            long j14 = 0;
            if (fVar != null) {
                j11 = 0;
                do {
                    long j15 = 0;
                    obj = null;
                    while (true) {
                        if (jAddAndGet == 0) {
                            z11 = true;
                            break;
                        }
                        z11 = true;
                        Object objPoll2 = fVar.poll();
                        if (a()) {
                            return;
                        }
                        if (objPoll2 == null) {
                            obj = objPoll2;
                            break;
                        }
                        bVar.onNext(objPoll2);
                        j11++;
                        j15++;
                        jAddAndGet--;
                        obj = objPoll2;
                    }
                    if (j15 != 0) {
                        jAddAndGet = z15 ? Long.MAX_VALUE : this.L.addAndGet(-j15);
                    }
                    if (jAddAndGet == 0) {
                        break;
                    }
                } while (obj != null);
            } else {
                z11 = true;
                j11 = 0;
            }
            boolean z16 = this.f25995f;
            bx.f fVar2 = this.f25994e;
            d0[] d0VarArr = (d0[]) this.K.get();
            int length = d0VarArr.length;
            if (z16 && ((fVar2 == null || fVar2.isEmpty()) && length == 0)) {
                nx.b bVar2 = this.f25996t;
                bVar2.getClass();
                Throwable thB = nx.e.b(bVar2);
                if (thB != nx.e.f44289a) {
                    if (thB == null) {
                        bVar.onComplete();
                        return;
                    } else {
                        bVar.onError(thB);
                        return;
                    }
                }
                return;
            }
            if (length != 0) {
                long j16 = this.O;
                int i13 = this.P;
                if (length > i13) {
                    j13 = 1;
                    if (d0VarArr[i13].f25980a != j16) {
                    }
                    i11 = i13;
                    z13 = false;
                    i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            d0VarArr = d0VarArr;
                            j12 = j14;
                            break;
                        }
                        if (a()) {
                            return;
                        }
                        d0Var = d0VarArr[i11];
                        objPoll = null;
                        while (!a()) {
                            gVar = d0Var.f25985f;
                            if (gVar == null) {
                                d0VarArr = d0VarArr;
                                j12 = j14;
                            } else {
                                j12 = j14;
                                while (jAddAndGet != j12) {
                                    try {
                                        objPoll = gVar.poll();
                                        if (objPoll == null) {
                                            break;
                                        }
                                        bVar.onNext(objPoll);
                                        if (a()) {
                                            return;
                                        }
                                        jAddAndGet -= j13;
                                        j14 += j13;
                                    } catch (Throwable th2) {
                                        fb.g0.D(th2);
                                        mx.g.a(d0Var);
                                        nx.b bVar3 = this.f25996t;
                                        bVar3.getClass();
                                        nx.e.a(bVar3, th2);
                                        this.M.cancel();
                                        if (a()) {
                                            return;
                                        }
                                        g(d0Var);
                                        i12++;
                                        d0VarArr = d0VarArr;
                                        z13 = z11;
                                    }
                                }
                                if (j14 != j12) {
                                    if (z15) {
                                        jAddAndGet = Long.MAX_VALUE;
                                    } else {
                                        jAddAndGet = this.L.addAndGet(-j14);
                                    }
                                    d0Var.a(j14);
                                } else {
                                    d0VarArr = d0VarArr;
                                }
                                if (jAddAndGet == j12 && objPoll != null) {
                                    d0VarArr = d0VarArr;
                                    j14 = j12;
                                }
                            }
                            z14 = d0Var.f25984e;
                            bx.g gVar2 = d0Var.f25985f;
                            if (z14 && (gVar2 == null || gVar2.isEmpty())) {
                                g(d0Var);
                                if (a()) {
                                    return;
                                }
                                j11 += j13;
                                z13 = z11;
                            }
                            if (jAddAndGet == j12) {
                                break;
                            }
                            i11++;
                            if (i11 == length) {
                                i11 = 0;
                            }
                            i12++;
                            d0VarArr = d0VarArr;
                            j14 = j12;
                        }
                        return;
                    }
                    z12 = z13;
                    this.P = i11;
                    this.O = d0VarArr[i11].f25980a;
                } else {
                    j13 = 1;
                }
                if (length <= i13) {
                    i13 = 0;
                }
                for (int i14 = 0; i14 < length && d0VarArr[i13].f25980a != j16; i14++) {
                    i13++;
                    if (i13 == length) {
                        i13 = 0;
                    }
                }
                this.P = i13;
                this.O = d0VarArr[i13].f25980a;
                i11 = i13;
                z13 = false;
                i12 = 0;
                while (true) {
                    if (i12 < length) {
                        d0VarArr = d0VarArr;
                        j12 = j14;
                        break;
                    }
                    if (a()) {
                        return;
                    }
                    d0Var = d0VarArr[i11];
                    objPoll = null;
                    while (!a()) {
                        gVar = d0Var.f25985f;
                        if (gVar == null) {
                            d0VarArr = d0VarArr;
                            j12 = j14;
                        } else {
                            j12 = j14;
                            while (jAddAndGet != j12) {
                                objPoll = gVar.poll();
                                if (objPoll == null) {
                                    break;
                                    break;
                                }
                                bVar.onNext(objPoll);
                                if (a()) {
                                    return;
                                }
                                jAddAndGet -= j13;
                                j14 += j13;
                            }
                            if (j14 != j12) {
                                if (z15) {
                                    jAddAndGet = this.L.addAndGet(-j14);
                                } else {
                                    jAddAndGet = Long.MAX_VALUE;
                                }
                                d0Var.a(j14);
                            } else {
                                d0VarArr = d0VarArr;
                            }
                            if (jAddAndGet == j12) {
                            }
                        }
                        z14 = d0Var.f25984e;
                        bx.g gVar3 = d0Var.f25985f;
                        if (z14) {
                            g(d0Var);
                            if (a()) {
                                return;
                            }
                            j11 += j13;
                            z13 = z11;
                        }
                        if (jAddAndGet == j12) {
                            break;
                            break;
                        }
                        i11++;
                        if (i11 == length) {
                            i11 = 0;
                        }
                        i12++;
                        d0VarArr = d0VarArr;
                        j14 = j12;
                    }
                    return;
                }
                z12 = z13;
                this.P = i11;
                this.O = d0VarArr[i11].f25980a;
            } else {
                j12 = 0;
                z12 = false;
            }
            long j17 = j11;
            if (j17 != j12 && !this.H) {
                this.M.request(j17);
            }
            if (!z12 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                return;
            }
        }
    }

    public final bx.f f() {
        bx.f bVar = this.f25994e;
        if (bVar == null) {
            bVar = this.f25992c == Integer.MAX_VALUE ? new jx.b(this.f25993d) : new jx.a(this.f25992c);
            this.f25994e = bVar;
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(d0 d0Var) {
        d0[] d0VarArr;
        while (true) {
            AtomicReference atomicReference = this.K;
            d0[] d0VarArr2 = (d0[]) atomicReference.get();
            int length = d0VarArr2.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (d0VarArr2[i11] == d0Var) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                d0VarArr = S;
            } else {
                d0[] d0VarArr3 = new d0[length - 1];
                System.arraycopy(d0VarArr2, 0, d0VarArr3, 0, i11);
                System.arraycopy(d0VarArr2, i11 + 1, d0VarArr3, i11, (length - i11) - 1);
                d0VarArr = d0VarArr3;
            }
            while (!atomicReference.compareAndSet(d0VarArr2, d0VarArr)) {
                if (atomicReference.get() != d0VarArr2) {
                }
            }
            return;
        }
    }

    @Override // n20.b
    public final void onComplete() {
        if (this.f25995f) {
            return;
        }
        this.f25995f = true;
        b();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        if (this.f25995f) {
            qx.b.B(th2);
            return;
        }
        nx.b bVar = this.f25996t;
        bVar.getClass();
        if (!nx.e.a(bVar, th2)) {
            qx.b.B(th2);
            return;
        }
        this.f25995f = true;
        for (d0 d0Var : (d0[]) this.K.getAndSet(T)) {
            d0Var.getClass();
            mx.g.a(d0Var);
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f25995f) {
            return;
        }
        try {
            Object objApply = this.f25991b.apply(obj);
            ax.d.a(objApply, "The mapper returned a null Publisher");
            n20.a aVar = (n20.a) objApply;
            if (aVar instanceof Callable) {
                try {
                    Object objCall = ((Callable) aVar).call();
                    if (objCall == null) {
                        if (this.f25992c == Integer.MAX_VALUE || this.H) {
                            return;
                        }
                        int i11 = this.Q + 1;
                        this.Q = i11;
                        int i12 = this.R;
                        if (i11 == i12) {
                            this.Q = 0;
                            this.M.request(i12);
                            return;
                        }
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        long j11 = this.L.get();
                        bx.f fVarF = this.f25994e;
                        if (j11 == 0 || !(fVarF == null || fVarF.isEmpty())) {
                            if (fVarF == null) {
                                fVarF = f();
                            }
                            if (!fVarF.offer(objCall)) {
                                onError(new IllegalStateException("Scalar queue full?!"));
                                return;
                            }
                        } else {
                            this.f25990a.onNext(objCall);
                            if (j11 != Long.MAX_VALUE) {
                                this.L.decrementAndGet();
                            }
                            if (this.f25992c != Integer.MAX_VALUE && !this.H) {
                                int i13 = this.Q + 1;
                                this.Q = i13;
                                int i14 = this.R;
                                if (i13 == i14) {
                                    this.Q = 0;
                                    this.M.request(i14);
                                }
                            }
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else if (!f().offer(objCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                    e();
                    return;
                } catch (Throwable th2) {
                    fb.g0.D(th2);
                    nx.b bVar = this.f25996t;
                    bVar.getClass();
                    nx.e.a(bVar, th2);
                    b();
                    return;
                }
            }
            long j12 = this.N;
            this.N = 1 + j12;
            d0 d0Var = new d0(this, j12);
            AtomicReference atomicReference = this.K;
            while (true) {
                d0[] d0VarArr = (d0[]) atomicReference.get();
                if (d0VarArr == T) {
                    mx.g.a(d0Var);
                    return;
                }
                int length = d0VarArr.length;
                d0[] d0VarArr2 = new d0[length + 1];
                System.arraycopy(d0VarArr, 0, d0VarArr2, 0, length);
                d0VarArr2[length] = d0Var;
                do {
                    if (atomicReference.compareAndSet(d0VarArr, d0VarArr2)) {
                        aVar.a(d0Var);
                        return;
                    }
                } while (atomicReference.get() == d0VarArr);
            }
        } catch (Throwable th3) {
            fb.g0.D(th3);
            this.M.cancel();
            onError(th3);
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        if (mx.g.c(j11)) {
            ue.f.i(this.L, j11);
            b();
        }
    }
}
