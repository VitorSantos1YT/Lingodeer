package p20;

import io.reactivex.rxjava3.exceptions.CompositeException;
import o20.e;
import o20.h;
import o20.t0;
import qx.k;
import qx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements rx.b, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f46287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f46288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f46289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46290d = false;

    public b(e eVar, k kVar) {
        this.f46287a = eVar;
        this.f46288b = kVar;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f46289c;
    }

    @Override // rx.b
    public final void dispose() {
        this.f46289c = true;
        this.f46287a.cancel();
    }

    @Override // o20.h
    public final void k(e eVar, t0 t0Var) {
        if (this.f46289c) {
            return;
        }
        try {
            this.f46288b.onNext(t0Var);
            if (this.f46289c) {
                return;
            }
            this.f46290d = true;
            this.f46288b.onComplete();
        } catch (Throwable th2) {
            ef.e.E(th2);
            if (this.f46290d) {
                p.u(th2);
                return;
            }
            if (this.f46289c) {
                return;
            }
            try {
                this.f46288b.onError(th2);
            } catch (Throwable th3) {
                ef.e.E(th3);
                p.u(new CompositeException(th2, th3));
            }
        }
    }

    @Override // o20.h
    public final void y(e eVar, Throwable th2) {
        if (eVar.b()) {
            return;
        }
        try {
            this.f46288b.onError(th2);
        } catch (Throwable th3) {
            ef.e.E(th3);
            p.u(new CompositeException(th2, th3));
        }
    }
}
