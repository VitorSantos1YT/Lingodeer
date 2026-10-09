package hx;

import com.google.firebase.inappmessaging.internal.v;
import fb.g0;
import uw.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements k, bx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f33833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ww.b f33834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bx.b f33835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f33837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f33838f;

    public c(k kVar, Object obj, int i11) {
        this.f33837e = i11;
        this.f33833a = kVar;
        this.f33838f = obj;
    }

    @Override // uw.k
    public final void b(ww.b bVar) {
        if (zw.a.g(this.f33834b, bVar)) {
            this.f33834b = bVar;
            if (bVar instanceof bx.b) {
                this.f33835c = (bx.b) bVar;
            }
            this.f33833a.b(this);
        }
    }

    @Override // bx.g
    public final void clear() {
        this.f33835c.clear();
    }

    @Override // ww.b
    public final void dispose() {
        this.f33834b.dispose();
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return this.f33835c.isEmpty();
    }

    @Override // bx.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // uw.k
    public final void onComplete() {
        if (this.f33836d) {
            return;
        }
        this.f33836d = true;
        this.f33833a.onComplete();
    }

    @Override // uw.k
    public final void onError(Throwable th2) {
        if (this.f33836d) {
            qx.b.B(th2);
        } else {
            this.f33836d = true;
            this.f33833a.onError(th2);
        }
    }

    @Override // uw.k
    public final void onNext(Object obj) {
        switch (this.f33837e) {
            case 0:
                try {
                    if (((v) this.f33838f).test(obj)) {
                        this.f33833a.onNext(obj);
                    }
                } catch (Throwable th2) {
                    g0.D(th2);
                    this.f33834b.dispose();
                    onError(th2);
                    return;
                }
                break;
            default:
                if (!this.f33836d) {
                    try {
                        Object objApply = ((yw.c) this.f33838f).apply(obj);
                        ax.d.a(objApply, "The mapper function returned a null value.");
                        this.f33833a.onNext(objApply);
                    } catch (Throwable th3) {
                        g0.D(th3);
                        this.f33834b.dispose();
                        onError(th3);
                    }
                    break;
                }
                break;
        }
    }

    @Override // bx.g
    public final Object poll() {
        Object objPoll;
        switch (this.f33837e) {
            case 0:
                break;
            default:
                Object objPoll2 = this.f33835c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((yw.c) this.f33838f).apply(objPoll2);
                ax.d.a(objApply, "The mapper function returned a null value.");
                return objApply;
        }
        do {
            objPoll = this.f33835c.poll();
            if (objPoll != null) {
            }
            return objPoll;
        } while (!((v) this.f33838f).test(objPoll));
        return objPoll;
    }
}
