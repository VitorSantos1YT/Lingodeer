package dt;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f5 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f23824b;

    public /* synthetic */ f5(int i11, l1.b1 b1Var) {
        this.f23823a = i11;
        this.f23824b = b1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s2.w wVar, vy.d dVar) {
        switch (this.f23823a) {
            case 0:
                l1.b1 b1Var = this.f23824b;
                Object objD = f0.s2.d(wVar, new bp.h0(18, b1Var), null, new bp.h0(19, b1Var), dVar, 5);
                return objD == wy.a.COROUTINE_SUSPENDED ? objD : qy.b0.f48488a;
            case 1:
                Object objD2 = f0.s2.d(wVar, null, null, new mt.p(25, this.f23824b), dVar, 7);
                return objD2 == wy.a.COROUTINE_SUSPENDED ? objD2 : qy.b0.f48488a;
            default:
                l1.b1 b1Var2 = this.f23824b;
                Object objD3 = f0.s2.d(wVar, new xu.v(13, b1Var2), null, new xu.v(14, b1Var2), dVar, 5);
                return objD3 == wy.a.COROUTINE_SUSPENDED ? objD3 : qy.b0.f48488a;
        }
    }
}
