package ex;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26025c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f26027e;

    public i0(c0 c0Var, int i11) {
        super(c0Var);
        this.f26027e = ax.d.f3260a;
        this.f26026d = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uw.d
    public final void e(n20.b bVar) {
        switch (this.f26025c) {
            case 0:
                this.f25954b.d(new h0(bVar, (yw.c) this.f26027e, this.f26026d));
                break;
            case 1:
                p20.c cVar = (p20.c) this.f26027e;
                uw.d dVar = this.f25954b;
                if (!(dVar instanceof Callable)) {
                    dVar.d(new j0(bVar, cVar, this.f26026d));
                } else {
                    try {
                        Object objCall = ((Callable) dVar).call();
                        if (objCall == null) {
                            mx.d.b(bVar);
                        } else {
                            try {
                                cVar.getClass();
                                n0.f(bVar, ((Iterable) objCall).iterator());
                            } catch (Throwable th2) {
                                fb.g0.D(th2);
                                mx.d.c(th2, bVar);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        fb.g0.D(th3);
                        mx.d.c(th3, bVar);
                        return;
                    }
                }
                break;
            default:
                uw.m mVarA = ((uw.n) this.f26027e).a();
                boolean z11 = bVar instanceof bx.a;
                int i11 = this.f26026d;
                uw.d dVar2 = this.f25954b;
                if (!z11) {
                    dVar2.d(new w0(bVar, mVarA, i11));
                } else {
                    dVar2.d(new v0((bx.a) bVar, mVarA, i11));
                }
                break;
        }
    }

    public i0(uw.d dVar, uw.n nVar, int i11) {
        super(dVar);
        this.f26027e = nVar;
        this.f26026d = i11;
    }

    public i0(uw.d dVar, yw.c cVar) {
        super(dVar);
        this.f26027e = cVar;
        this.f26026d = Integer.MAX_VALUE;
    }
}
