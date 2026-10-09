package wz;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import rz.c2;
import rz.e0;
import rz.m0;
import rz.y;
import rz.y0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends m0 implements xy.d, vy.d {
    public static final /* synthetic */ AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f55512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vy.d f55513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f55514f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f55515t;

    public f(y yVar, vy.d dVar) {
        super(-1);
        this.f55512d = yVar;
        this.f55513e = dVar;
        this.f55514f = b.f55502b;
        this.f55515t = b.m(dVar.getContext());
    }

    @Override // xy.d
    public final xy.d getCallerFrame() {
        vy.d dVar = this.f55513e;
        if (dVar instanceof xy.d) {
            return (xy.d) dVar;
        }
        return null;
    }

    @Override // vy.d
    public final vy.i getContext() {
        return this.f55513e.getContext();
    }

    @Override // rz.m0
    public final Object i() {
        Object obj = this.f55514f;
        this.f55514f = b.f55502b;
        return obj;
    }

    @Override // vy.d
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thA = qy.o.a(obj);
        Object vVar = thA == null ? obj : new rz.v(thA, false);
        vy.d dVar = this.f55513e;
        vy.i context = dVar.getContext();
        y yVar = this.f55512d;
        if (b.j(yVar, context)) {
            this.f55514f = vVar;
            this.f50932c = 0;
            b.i(yVar, dVar.getContext(), this);
            return;
        }
        y0 y0VarA = c2.a();
        if (y0VarA.f50974a >= 4294967296L) {
            this.f55514f = vVar;
            this.f50932c = 0;
            y0VarA.f(this);
            return;
        }
        y0VarA.i(true);
        try {
            vy.i context2 = dVar.getContext();
            Object objN = b.n(context2, this.f55515t);
            try {
                dVar.resumeWith(obj);
                b.g(context2, objN);
                while (y0VarA.v()) {
                }
            } catch (Throwable th2) {
                b.g(context2, objN);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                g(th3);
            } finally {
                y0VarA.d(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f55512d + ", " + e0.I(this.f55513e) + ']';
    }

    @Override // rz.m0
    public final vy.d d() {
        return this;
    }
}
