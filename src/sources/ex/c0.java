package ex;

import a0.b2;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends a implements yw.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f25977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(uw.d dVar, Object obj, int i11) {
        super(dVar);
        this.f25976c = i11;
        this.f25977d = obj;
    }

    @Override // uw.d
    public final void e(n20.b bVar) {
        switch (this.f25976c) {
            case 0:
                yw.d dVar = (yw.d) this.f25977d;
                boolean z11 = bVar instanceof bx.a;
                uw.d dVar2 = this.f25954b;
                if (!z11) {
                    dVar2.d(new b0(bVar, dVar));
                } else {
                    dVar2.d(new a0((bx.a) bVar, dVar, 0));
                }
                break;
            case 1:
                b2 b2Var = (b2) this.f25977d;
                boolean z12 = bVar instanceof bx.a;
                uw.d dVar3 = this.f25954b;
                if (!z12) {
                    dVar3.d(new t0(bVar, b2Var));
                } else {
                    dVar3.d(new a0((bx.a) bVar, b2Var, 1));
                }
                break;
            case 2:
                this.f25954b.d(new z0(bVar, (c0) this.f25977d));
                break;
            default:
                try {
                    Object objCall = ((Callable) this.f25977d).call();
                    ax.d.a(objCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    Collection collection = (Collection) objCall;
                    g1 g1Var = new g1(bVar);
                    g1Var.f42880b = collection;
                    this.f25954b.d(g1Var);
                } catch (Throwable th2) {
                    fb.g0.D(th2);
                    mx.d.c(th2, bVar);
                    return;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(n0 n0Var) {
        super(n0Var);
        this.f25976c = 2;
        this.f25977d = this;
    }

    @Override // yw.b
    public void accept(Object obj) {
    }
}
