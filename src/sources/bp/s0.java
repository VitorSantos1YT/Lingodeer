package bp;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import bt.g7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4802c;

    public /* synthetic */ s0(int i11, Object obj, Object obj2) {
        this.f4800a = i11;
        this.f4801b = obj;
        this.f4802c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s2.w wVar, vy.d dVar) {
        switch (this.f4800a) {
            case 0:
                Object objD = f0.s2.d(wVar, new r0(0, (fz.a) this.f4801b), null, new r0(1, (fz.a) this.f4802c), dVar, 5);
                return objD == wy.a.COROUTINE_SUSPENDED ? objD : qy.b0.f48488a;
            case 1:
                s2.m0 m0Var = (s2.m0) wVar;
                m0Var.getClass();
                Object objC = f0.t2.c(wVar, new a1.c((ie.o) this.f4801b, new ij.d(y2.f.x(m0Var).f56885d0), (s0.a1) this.f4802c, null), dVar);
                return objC == wy.a.COROUTINE_SUSPENDED ? objC : qy.b0.f48488a;
            case 2:
                Object objD2 = f0.s2.d(wVar, null, null, new qp.n2(12, (l1.b1) this.f4801b, (g7) this.f4802c), dVar, 7);
                return objD2 == wy.a.COROUTINE_SUSPENDED ? objD2 : qy.b0.f48488a;
            case 3:
                Object objL = rz.e0.l(new ad.x(wVar, (s0.a1) this.f4801b, (d1.z0) this.f4802c, null, 27), dVar);
                return objL == wy.a.COROUTINE_SUSPENDED ? objL : qy.b0.f48488a;
            default:
                Object objD3 = f0.s2.d(wVar, null, null, new qp.n2(26, (z2.i2) this.f4801b, (l1.b1) this.f4802c), dVar, 7);
                return objD3 == wy.a.COROUTINE_SUSPENDED ? objD3 : qy.b0.f48488a;
        }
    }
}
