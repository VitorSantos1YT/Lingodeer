package xy;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends a {
    private final vy.i _context;
    private transient vy.d<Object> intercepted;

    public c(vy.d dVar, vy.i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // vy.d
    public vy.i getContext() {
        vy.i iVar = this._context;
        m.c(iVar);
        return iVar;
    }

    public final vy.d<Object> intercepted() {
        vy.d dVarInterceptContinuation = this.intercepted;
        if (dVarInterceptContinuation == null) {
            vy.f fVar = (vy.f) getContext().get(vy.e.f54320a);
            if (fVar == null || (dVarInterceptContinuation = fVar.interceptContinuation(this)) == null) {
                dVarInterceptContinuation = this;
            }
            this.intercepted = dVarInterceptContinuation;
        }
        return dVarInterceptContinuation;
    }

    @Override // xy.a
    public void releaseIntercepted() {
        vy.d<Object> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            vy.g gVar = getContext().get(vy.e.f54320a);
            m.c(gVar);
            ((vy.f) gVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = b.f56646a;
    }

    public c(vy.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
