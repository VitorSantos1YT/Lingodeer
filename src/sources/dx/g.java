package dx;

import com.google.firebase.inappmessaging.internal.k;
import fb.g0;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends AtomicReference implements uw.c, ww.b {
    private static final long serialVersionUID = 5018523762564524046L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.c f24549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f24550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24551c;

    public g(uw.c cVar, k kVar) {
        this.f24549a = cVar;
        this.f24550b = kVar;
    }

    @Override // uw.c, uw.p
    public final void b(ww.b bVar) {
        zw.a.c(this, bVar);
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.c
    public final void onComplete() {
        this.f24549a.onComplete();
    }

    @Override // uw.c, uw.p
    public final void onError(Throwable th2) {
        boolean z11 = this.f24551c;
        uw.c cVar = this.f24549a;
        if (z11) {
            cVar.onError(th2);
            return;
        }
        this.f24551c = true;
        try {
            this.f24550b.getClass();
            try {
                b(zw.b.INSTANCE);
                onComplete();
            } catch (NullPointerException e8) {
                throw e8;
            } catch (Throwable th3) {
                g0.D(th3);
                qx.b.B(th3);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(th3);
                throw nullPointerException;
            }
        } catch (Throwable th4) {
            g0.D(th4);
            cVar.onError(new CompositeException(th2, th4));
        }
    }
}
