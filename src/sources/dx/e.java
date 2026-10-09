package dx;

import fb.g0;
import fx.s;
import io.reactivex.exceptions.CompositeException;
import uw.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements uw.c, ww.b, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ww.b f24543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f24545d;

    public /* synthetic */ e(i iVar, Object obj, int i11) {
        this.f24542a = i11;
        this.f24544c = iVar;
        this.f24545d = obj;
    }

    public void a() {
        try {
            ((s) this.f24545d).getClass();
        } catch (Throwable th2) {
            g0.D(th2);
            qx.b.B(th2);
        }
    }

    @Override // uw.c, uw.p
    public final void b(ww.b bVar) {
        switch (this.f24542a) {
            case 0:
                uw.c cVar = (uw.c) this.f24544c;
                if (zw.a.g(this.f24543b, bVar)) {
                    this.f24543b = bVar;
                    cVar.b(this);
                }
                break;
            case 1:
                if (zw.a.g(this.f24543b, bVar)) {
                    this.f24543b = bVar;
                    ((i) this.f24544c).b(this);
                }
                break;
            default:
                i iVar = (i) this.f24544c;
                if (zw.a.g(this.f24543b, bVar)) {
                    this.f24543b = bVar;
                    iVar.b(this);
                }
                break;
        }
    }

    public void c(Throwable th2) {
        try {
            ((s) this.f24545d).f28266c.accept(th2);
        } catch (Throwable th3) {
            g0.D(th3);
            th2 = new CompositeException(th2, th3);
        }
        this.f24543b = zw.a.DISPOSED;
        ((i) this.f24544c).onError(th2);
        a();
    }

    @Override // ww.b
    public final void dispose() {
        switch (this.f24542a) {
            case 0:
                this.f24543b.dispose();
                break;
            case 1:
                ww.b bVar = this.f24543b;
                this.f24543b = zw.a.DISPOSED;
                bVar.dispose();
                break;
            default:
                try {
                    ((s) this.f24545d).getClass();
                } catch (Throwable th2) {
                    g0.D(th2);
                    qx.b.B(th2);
                }
                this.f24543b.dispose();
                this.f24543b = zw.a.DISPOSED;
                break;
        }
    }

    @Override // uw.c
    public final void onComplete() {
        switch (this.f24542a) {
            case 0:
                uw.c cVar = (uw.c) this.f24544c;
                f fVar = (f) this.f24545d;
                if (this.f24543b != zw.a.DISPOSED) {
                    try {
                        fVar.f24548c.run();
                        cVar.onComplete();
                    } catch (Throwable th2) {
                        g0.D(th2);
                        cVar.onError(th2);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                ((i) this.f24544c).onComplete();
                break;
            default:
                ww.b bVar = this.f24543b;
                zw.a aVar = zw.a.DISPOSED;
                if (bVar != aVar) {
                    try {
                        ((s) this.f24545d).getClass();
                        this.f24543b = aVar;
                        ((i) this.f24544c).onComplete();
                        a();
                    } catch (Throwable th3) {
                        g0.D(th3);
                        c(th3);
                    }
                    break;
                }
                break;
        }
    }

    @Override // uw.c, uw.p
    public final void onError(Throwable th2) {
        switch (this.f24542a) {
            case 0:
                f fVar = (f) this.f24545d;
                if (this.f24543b != zw.a.DISPOSED) {
                    try {
                        fVar.f24547b.accept(th2);
                    } catch (Throwable th3) {
                        g0.D(th3);
                        th2 = new CompositeException(th2, th3);
                    }
                    ((uw.c) this.f24544c).onError(th2);
                } else {
                    qx.b.B(th2);
                }
                break;
            case 1:
                ((i) this.f24544c).onError(th2);
                break;
            default:
                if (this.f24543b != zw.a.DISPOSED) {
                    c(th2);
                } else {
                    qx.b.B(th2);
                }
                break;
        }
    }

    @Override // uw.i
    public void onSuccess(Object obj) {
        switch (this.f24542a) {
            case 1:
                i iVar = (i) this.f24544c;
                try {
                    Object objApply = ((yw.c) this.f24545d).apply(obj);
                    ax.d.a(objApply, "The mapper returned a null item");
                    iVar.onSuccess(objApply);
                } catch (Throwable th2) {
                    g0.D(th2);
                    iVar.onError(th2);
                    return;
                }
                break;
            default:
                ww.b bVar = this.f24543b;
                zw.a aVar = zw.a.DISPOSED;
                if (bVar != aVar) {
                    try {
                        ((s) this.f24545d).f28265b.accept(obj);
                        this.f24543b = aVar;
                        ((i) this.f24544c).onSuccess(obj);
                        a();
                    } catch (Throwable th3) {
                        g0.D(th3);
                        c(th3);
                    }
                    break;
                }
                break;
        }
    }

    public e(f fVar, uw.c cVar) {
        this.f24542a = 0;
        this.f24545d = fVar;
        this.f24544c = cVar;
    }
}
