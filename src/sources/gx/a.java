package gx;

import com.bumptech.glide.d;
import fb.g0;
import java.util.concurrent.atomic.AtomicReference;
import uw.i;
import uw.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReference implements k, i, ww.b {
    private static final long serialVersionUID = -8948264376121066672L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f29886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.firebase.inappmessaging.internal.k f29887b;

    public a(k kVar, com.google.firebase.inappmessaging.internal.k kVar2) {
        this.f29886a = kVar;
        this.f29887b = kVar2;
    }

    @Override // uw.k
    public final void b(ww.b bVar) {
        zw.a.c(this, bVar);
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.k
    public final void onComplete() {
        this.f29886a.onComplete();
    }

    @Override // uw.k
    public final void onError(Throwable th2) {
        this.f29886a.onError(th2);
    }

    @Override // uw.k
    public final void onNext(Object obj) {
        this.f29886a.onNext(obj);
    }

    @Override // uw.i
    public final void onSuccess(Object obj) {
        try {
            ((d) this.f29887b.apply(obj)).J(this);
        } catch (Throwable th2) {
            g0.D(th2);
            this.f29886a.onError(th2);
        }
    }
}
