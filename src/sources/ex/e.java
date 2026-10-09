package ex;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends c {
    private static final long serialVersionUID = 7898995095634264146L;
    public final n20.b O;
    public final AtomicInteger P;

    public e(n20.b bVar, com.google.firebase.inappmessaging.internal.m mVar, int i11) {
        super(mVar, i11);
        this.O = bVar;
        this.P = new AtomicInteger();
    }

    @Override // ex.g
    public final void a(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            n20.b bVar = this.O;
            bVar.onNext(obj);
            if (compareAndSet(1, 0)) {
                return;
            }
            nx.b bVar2 = this.L;
            bVar2.getClass();
            bVar.onError(nx.e.b(bVar2));
        }
    }

    @Override // ex.g
    public final void b(Throwable th2) {
        nx.b bVar = this.L;
        bVar.getClass();
        if (!nx.e.a(bVar, th2)) {
            qx.b.B(th2);
            return;
        }
        this.f25973e.cancel();
        if (getAndIncrement() == 0) {
            this.O.onError(nx.e.b(bVar));
        }
    }

    @Override // n20.c
    public final void cancel() {
        if (this.K) {
            return;
        }
        this.K = true;
        this.f25969a.cancel();
        this.f25973e.cancel();
    }

    @Override // ex.c
    public final void e() {
        if (this.P.getAndIncrement() == 0) {
            while (!this.K) {
                if (!this.M) {
                    boolean z11 = this.H;
                    try {
                        Object objPoll = this.f25975t.poll();
                        boolean z12 = objPoll == null;
                        if (z11 && z12) {
                            this.O.onComplete();
                            return;
                        }
                        if (!z12) {
                            try {
                                Object objApply = this.f25970b.apply(objPoll);
                                ax.d.a(objApply, "The mapper returned a null Publisher");
                                n20.a aVar = (n20.a) objApply;
                                if (this.N != 1) {
                                    int i11 = this.f25974f + 1;
                                    if (i11 == this.f25972d) {
                                        this.f25974f = 0;
                                        this.f25973e.request(i11);
                                    } else {
                                        this.f25974f = i11;
                                    }
                                }
                                if (aVar instanceof Callable) {
                                    try {
                                        Object objCall = ((Callable) aVar).call();
                                        if (objCall == null) {
                                            continue;
                                        } else if (!this.f25969a.f42889t) {
                                            this.M = true;
                                            this.f25969a.f(new h(objCall, this.f25969a));
                                        } else if (get() == 0 && compareAndSet(0, 1)) {
                                            this.O.onNext(objCall);
                                            if (!compareAndSet(1, 0)) {
                                                n20.b bVar = this.O;
                                                nx.b bVar2 = this.L;
                                                bVar2.getClass();
                                                bVar.onError(nx.e.b(bVar2));
                                                return;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        fb.g0.D(th2);
                                        this.f25973e.cancel();
                                        nx.b bVar3 = this.L;
                                        bVar3.getClass();
                                        nx.e.a(bVar3, th2);
                                        n20.b bVar4 = this.O;
                                        nx.b bVar5 = this.L;
                                        bVar5.getClass();
                                        bVar4.onError(nx.e.b(bVar5));
                                        return;
                                    }
                                } else {
                                    this.M = true;
                                    aVar.a(this.f25969a);
                                }
                            } catch (Throwable th3) {
                                fb.g0.D(th3);
                                this.f25973e.cancel();
                                nx.b bVar6 = this.L;
                                bVar6.getClass();
                                nx.e.a(bVar6, th3);
                                n20.b bVar7 = this.O;
                                nx.b bVar8 = this.L;
                                bVar8.getClass();
                                bVar7.onError(nx.e.b(bVar8));
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        fb.g0.D(th4);
                        this.f25973e.cancel();
                        nx.b bVar9 = this.L;
                        bVar9.getClass();
                        nx.e.a(bVar9, th4);
                        n20.b bVar10 = this.O;
                        nx.b bVar11 = this.L;
                        bVar11.getClass();
                        bVar10.onError(nx.e.b(bVar11));
                        return;
                    }
                }
                if (this.P.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // ex.c
    public final void f() {
        this.O.c(this);
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        nx.b bVar = this.L;
        bVar.getClass();
        if (!nx.e.a(bVar, th2)) {
            qx.b.B(th2);
            return;
        }
        this.f25969a.cancel();
        if (getAndIncrement() == 0) {
            bVar.getClass();
            this.O.onError(nx.e.b(bVar));
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        this.f25969a.request(j11);
    }
}
