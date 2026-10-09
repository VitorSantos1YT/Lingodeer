package ex;

import fr.p3;
import io.reactivex.exceptions.CompositeException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends lx.b {
    public final yw.a H;
    public final yw.a K;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yw.b f26066f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yw.b f26067t;

    public t(n20.b bVar, com.google.firebase.inappmessaging.internal.k kVar, p3 p3Var, ay.k0 k0Var, ay.k0 k0Var2) {
        super(bVar);
        this.f26066f = kVar;
        this.f26067t = p3Var;
        this.H = k0Var;
        this.K = k0Var2;
    }

    @Override // lx.b, n20.b
    public final void onComplete() {
        if (this.f40505d) {
            return;
        }
        try {
            this.H.run();
            this.f40505d = true;
            this.f40502a.onComplete();
            try {
                this.K.run();
            } catch (Throwable th2) {
                fb.g0.D(th2);
                qx.b.B(th2);
            }
        } catch (Throwable th3) {
            fb.g0.D(th3);
            this.f40503b.cancel();
            onError(th3);
        }
    }

    @Override // lx.b, n20.b
    public final void onError(Throwable th2) {
        n20.b bVar = this.f40502a;
        if (this.f40505d) {
            qx.b.B(th2);
            return;
        }
        this.f40505d = true;
        try {
            this.f26067t.accept(th2);
            bVar.onError(th2);
        } catch (Throwable th3) {
            fb.g0.D(th3);
            bVar.onError(new CompositeException(th2, th3));
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
        if (this.f40505d) {
            return;
        }
        int i11 = this.f40506e;
        n20.b bVar = this.f40502a;
        if (i11 != 0) {
            bVar.onNext(null);
            return;
        }
        try {
            this.f26066f.accept(obj);
            bVar.onNext(obj);
        } catch (Throwable th2) {
            fb.g0.D(th2);
            this.f40503b.cancel();
            onError(th2);
        }
    }

    @Override // bx.g
    public final Object poll() throws Exception {
        yw.b bVar = this.f26067t;
        try {
            Object objPoll = this.f40504c.poll();
            yw.a aVar = this.K;
            if (objPoll == null) {
                if (this.f40506e == 1) {
                    this.H.run();
                    aVar.run();
                }
                return objPoll;
            }
            try {
                this.f26066f.accept(objPoll);
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
