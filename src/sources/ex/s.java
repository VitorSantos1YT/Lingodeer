package ex;

import fr.p3;
import io.reactivex.exceptions.CompositeException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends lx.a {
    public final yw.a H;
    public final yw.a K;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yw.b f26064f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yw.b f26065t;

    public s(bx.a aVar, com.google.firebase.inappmessaging.internal.k kVar, p3 p3Var, ay.k0 k0Var, ay.k0 k0Var2) {
        super(aVar);
        this.f26064f = kVar;
        this.f26065t = p3Var;
        this.H = k0Var;
        this.K = k0Var2;
    }

    @Override // bx.a
    public final boolean d(Object obj) {
        if (this.f40500d) {
            return false;
        }
        try {
            this.f26064f.accept(obj);
            return this.f40497a.d(obj);
        } catch (Throwable th2) {
            b(th2);
            return false;
        }
    }

    @Override // lx.a, n20.b
    public final void onComplete() {
        if (this.f40500d) {
            return;
        }
        try {
            this.H.run();
            this.f40500d = true;
            this.f40497a.onComplete();
            try {
                this.K.run();
            } catch (Throwable th2) {
                fb.g0.D(th2);
                qx.b.B(th2);
            }
        } catch (Throwable th3) {
            b(th3);
        }
    }

    @Override // lx.a, n20.b
    public final void onError(Throwable th2) {
        bx.a aVar = this.f40497a;
        if (this.f40500d) {
            qx.b.B(th2);
            return;
        }
        this.f40500d = true;
        try {
            this.f26065t.accept(th2);
            aVar.onError(th2);
        } catch (Throwable th3) {
            fb.g0.D(th3);
            aVar.onError(new CompositeException(th2, th3));
        }
        try {
            this.K.run();
        } catch (Throwable th4) {
            fb.g0.D(th4);
            qx.b.B(th4);
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f40500d) {
            return;
        }
        int i11 = this.f40501e;
        bx.a aVar = this.f40497a;
        if (i11 != 0) {
            aVar.onNext(null);
            return;
        }
        try {
            this.f26064f.accept(obj);
            aVar.onNext(obj);
        } catch (Throwable th2) {
            b(th2);
        }
    }

    @Override // bx.g
    public final Object poll() throws Exception {
        yw.b bVar = this.f26065t;
        try {
            Object objPoll = this.f40499c.poll();
            yw.a aVar = this.K;
            if (objPoll == null) {
                if (this.f40501e == 1) {
                    this.H.run();
                    aVar.run();
                }
                return objPoll;
            }
            try {
                this.f26064f.accept(objPoll);
                aVar.run();
                return objPoll;
            } catch (Throwable th2) {
                try {
                    fb.g0.D(th2);
                    try {
                        bVar.accept(th2);
                        nx.d dVar = nx.e.f44289a;
                        if (th2 instanceof Exception) {
                            throw th2;
                        }
                        throw th2;
                    } catch (Throwable th3) {
                        throw new CompositeException(th2, th3);
                    }
                } catch (Throwable th4) {
                    aVar.run();
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            fb.g0.D(th5);
            try {
                bVar.accept(th5);
                nx.d dVar2 = nx.e.f44289a;
                if (th5 instanceof Exception) {
                    throw th5;
                }
                throw th5;
            } catch (Throwable th6) {
                throw new CompositeException(th5, th6);
            }
        }
    }
}
