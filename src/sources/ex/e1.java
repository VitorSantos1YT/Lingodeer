package ex;

import io.reactivex.exceptions.MissingBackpressureException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e1 extends AtomicInteger implements uw.g, ww.b {
    public static final d1[] K = new d1[0];
    public static final d1[] L = new d1[0];
    private static final long serialVersionUID = -202316842419149694L;
    public volatile bx.g H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f25997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25998b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Serializable f26002f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f26003t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f26001e = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f25999c = new AtomicReference(K);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f26000d = new AtomicBoolean();

    public e1(AtomicReference atomicReference, int i11) {
        this.f25997a = atomicReference;
        this.f25998b = i11;
    }

    public final boolean a(Object obj, boolean z11) {
        int i11 = 0;
        if (obj != null) {
            nx.g gVar = nx.g.COMPLETE;
            d1[] d1VarArr = L;
            AtomicReference atomicReference = this.f25999c;
            AtomicReference atomicReference2 = this.f25997a;
            if (obj != gVar) {
                Throwable th2 = ((nx.f) obj).f44290a;
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                d1[] d1VarArr2 = (d1[]) atomicReference.getAndSet(d1VarArr);
                if (d1VarArr2.length != 0) {
                    int length = d1VarArr2.length;
                    while (i11 < length) {
                        d1VarArr2[i11].f25987a.onError(th2);
                        i11++;
                    }
                } else {
                    qx.b.B(th2);
                }
                return true;
            }
            if (z11) {
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                d1[] d1VarArr3 = (d1[]) atomicReference.getAndSet(d1VarArr);
                int length2 = d1VarArr3.length;
                while (i11 < length2) {
                    d1VarArr3[i11].f25987a.onComplete();
                    i11++;
                }
                return true;
            }
        }
        return false;
    }

    public final void b() {
        boolean z11;
        Object objPoll;
        d1[] d1VarArr;
        Object objPoll2;
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f25999c;
        boolean z12 = true;
        d1[] d1VarArr2 = (d1[]) atomicReference.get();
        int iAddAndGet = 1;
        while (true) {
            Object obj = this.f26002f;
            bx.g gVar = this.H;
            boolean z13 = (gVar == null || gVar.isEmpty()) ? z12 : false;
            if (a(obj, z13)) {
                return;
            }
            if (z13) {
                z11 = z12;
            } else {
                int length = d1VarArr2.length;
                int i11 = 0;
                long jMin = Long.MAX_VALUE;
                for (d1 d1Var : d1VarArr2) {
                    long j11 = d1Var.get();
                    if (j11 != Long.MIN_VALUE) {
                        jMin = Math.min(jMin, j11 - d1Var.f25989c);
                    } else {
                        i11++;
                    }
                }
                long j12 = 1;
                if (length == i11) {
                    Object obj2 = this.f26002f;
                    try {
                        objPoll = gVar.poll();
                    } catch (Throwable th2) {
                        fb.g0.D(th2);
                        ((n20.c) this.f26001e.get()).cancel();
                        nx.f fVar = new nx.f(th2);
                        this.f26002f = fVar;
                        obj2 = fVar;
                        objPoll = null;
                    }
                    if (a(obj2, objPoll == null ? z12 : false)) {
                        return;
                    }
                    if (this.f26003t != z12) {
                        ((n20.c) this.f26001e.get()).request(1L);
                    }
                    z11 = z12;
                    d1VarArr = d1VarArr2;
                } else {
                    int i12 = 0;
                    while (true) {
                        long j13 = i12;
                        if (j13 < jMin) {
                            Object obj3 = this.f26002f;
                            try {
                                objPoll2 = gVar.poll();
                            } catch (Throwable th3) {
                                fb.g0.D(th3);
                                ((n20.c) this.f26001e.get()).cancel();
                                nx.f fVar2 = new nx.f(th3);
                                this.f26002f = fVar2;
                                obj3 = fVar2;
                                objPoll2 = null;
                            }
                            boolean z14 = objPoll2 == null ? z12 : false;
                            if (a(obj3, z14)) {
                                return;
                            }
                            if (z14) {
                                z13 = z14;
                            } else {
                                int length2 = d1VarArr2.length;
                                int i13 = 0;
                                boolean z15 = false;
                                while (i13 < length2) {
                                    long j14 = j12;
                                    d1 d1Var2 = d1VarArr2[i13];
                                    long j15 = d1Var2.get();
                                    if (j15 != Long.MIN_VALUE) {
                                        if (j15 != Long.MAX_VALUE) {
                                            d1Var2.f25989c += j14;
                                        }
                                        d1Var2.f25987a.onNext(objPoll2);
                                    } else {
                                        z15 = true;
                                    }
                                    i13++;
                                    d1VarArr2 = d1VarArr2;
                                    j12 = j14;
                                }
                                d1[] d1VarArr3 = d1VarArr2;
                                long j16 = j12;
                                i12++;
                                d1[] d1VarArr4 = (d1[]) atomicReference.get();
                                if (z15 || d1VarArr4 != d1VarArr3) {
                                    if (i12 != 0 && this.f26003t != 1) {
                                        ((n20.c) this.f26001e.get()).request(i12);
                                    }
                                    d1VarArr2 = d1VarArr4;
                                    z12 = true;
                                } else {
                                    d1VarArr2 = d1VarArr3;
                                    z13 = z14;
                                    j12 = j16;
                                    z12 = true;
                                }
                            }
                        }
                        d1VarArr = d1VarArr2;
                        if (i12 != 0) {
                            z11 = true;
                            if (this.f26003t != 1) {
                                ((n20.c) this.f26001e.get()).request(j13);
                            }
                        } else {
                            z11 = true;
                        }
                        if (jMin == 0 || z13) {
                        }
                        z12 = z11;
                    }
                }
                d1VarArr2 = d1VarArr;
                z12 = z11;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            d1VarArr2 = (d1[]) atomicReference.get();
            z12 = z11;
        }
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.b(this.f26001e, cVar)) {
            if (cVar instanceof bx.d) {
                bx.d dVar = (bx.d) cVar;
                int iA = dVar.a(7);
                if (iA == 1) {
                    this.f26003t = iA;
                    this.H = dVar;
                    this.f26002f = nx.g.COMPLETE;
                    b();
                    return;
                }
                if (iA == 2) {
                    this.f26003t = iA;
                    this.H = dVar;
                    cVar.request(this.f25998b);
                    return;
                }
            }
            this.H = new jx.a(this.f25998b);
            cVar.request(this.f25998b);
        }
    }

    @Override // ww.b
    public final void dispose() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f25999c;
        Object obj = atomicReference2.get();
        Object obj2 = L;
        if (obj == obj2 || ((d1[]) atomicReference2.getAndSet(obj2)) == obj2) {
            return;
        }
        do {
            atomicReference = this.f25997a;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        mx.g.a(this.f26001e);
    }

    public final boolean e() {
        return this.f25999c.get() == L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(d1 d1Var) {
        d1[] d1VarArr;
        while (true) {
            AtomicReference atomicReference = this.f25999c;
            d1[] d1VarArr2 = (d1[]) atomicReference.get();
            int length = d1VarArr2.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (d1VarArr2[i11].equals(d1Var)) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                d1VarArr = K;
            } else {
                d1[] d1VarArr3 = new d1[length - 1];
                System.arraycopy(d1VarArr2, 0, d1VarArr3, 0, i11);
                System.arraycopy(d1VarArr2, i11 + 1, d1VarArr3, i11, (length - i11) - 1);
                d1VarArr = d1VarArr3;
            }
            while (!atomicReference.compareAndSet(d1VarArr2, d1VarArr)) {
                if (atomicReference.get() != d1VarArr2) {
                }
            }
            return;
        }
    }

    @Override // n20.b
    public final void onComplete() {
        if (this.f26002f == null) {
            this.f26002f = nx.g.COMPLETE;
            b();
        }
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        if (this.f26002f != null) {
            qx.b.B(th2);
        } else {
            this.f26002f = new nx.f(th2);
            b();
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f26003t != 0 || this.H.offer(obj)) {
            b();
        } else {
            onError(new MissingBackpressureException("Prefetch queue is full?!"));
        }
    }
}
