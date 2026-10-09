package ex;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends c {
    private static final long serialVersionUID = -2945777694260521066L;
    public final n20.b O;
    public final boolean P;

    public d(n20.b bVar, com.google.firebase.inappmessaging.internal.m mVar, int i11, boolean z11) {
        super(mVar, i11);
        this.O = bVar;
        this.P = z11;
    }

    @Override // ex.g
    public final void a(Object obj) {
        this.O.onNext(obj);
    }

    @Override // ex.g
    public final void b(Throwable th2) {
        nx.b bVar = this.L;
        bVar.getClass();
        if (!nx.e.a(bVar, th2)) {
            qx.b.B(th2);
            return;
        }
        if (!this.P) {
            this.f25973e.cancel();
            this.H = true;
        }
        this.M = false;
        e();
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
        Object objCall;
        if (getAndIncrement() == 0) {
            while (!this.K) {
                if (!this.M) {
                    boolean z11 = this.H;
                    if (z11 && !this.P && ((Throwable) this.L.get()) != null) {
                        n20.b bVar = this.O;
                        nx.b bVar2 = this.L;
                        bVar2.getClass();
                        bVar.onError(nx.e.b(bVar2));
                        return;
                    }
                    try {
                        Object objPoll = this.f25975t.poll();
                        boolean z12 = objPoll == null;
                        if (z11 && z12) {
                            nx.b bVar3 = this.L;
                            bVar3.getClass();
                            Throwable thB = nx.e.b(bVar3);
                            if (thB != null) {
                                this.O.onError(thB);
                                return;
                            } else {
                                this.O.onComplete();
                                return;
                            }
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
                                        objCall = ((Callable) aVar).call();
                                    } catch (Throwable th2) {
                                        fb.g0.D(th2);
                                        nx.b bVar4 = this.L;
                                        bVar4.getClass();
                                        nx.e.a(bVar4, th2);
                                        if (!this.P) {
                                            this.f25973e.cancel();
                                            n20.b bVar5 = this.O;
                                            nx.b bVar6 = this.L;
                                            bVar6.getClass();
                                            bVar5.onError(nx.e.b(bVar6));
                                            return;
                                        }
                                        objCall = null;
                                    }
                                    if (objCall == null) {
                                        continue;
                                    } else if (this.f25969a.f42889t) {
                                        this.O.onNext(objCall);
                                    } else {
                                        this.M = true;
                                        this.f25969a.f(new h(objCall, this.f25969a));
                                    }
                                } else {
                                    this.M = true;
                                    aVar.a(this.f25969a);
                                }
                            } catch (Throwable th3) {
                                fb.g0.D(th3);
                                this.f25973e.cancel();
                                nx.b bVar7 = this.L;
                                bVar7.getClass();
                                nx.e.a(bVar7, th3);
                                n20.b bVar8 = this.O;
                                nx.b bVar9 = this.L;
                                bVar9.getClass();
                                bVar8.onError(nx.e.b(bVar9));
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        fb.g0.D(th4);
                        this.f25973e.cancel();
                        nx.b bVar10 = this.L;
                        bVar10.getClass();
                        nx.e.a(bVar10, th4);
                        n20.b bVar11 = this.O;
                        nx.b bVar12 = this.L;
                        bVar12.getClass();
                        bVar11.onError(nx.e.b(bVar12));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
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
        } else {
            this.H = true;
            e();
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        this.f25969a.request(j11);
    }
}
