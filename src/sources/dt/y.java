package dt;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24383a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f24385c;

    public y(fz.a aVar, l1.b1 b1Var) {
        this.f24385c = aVar;
        this.f24384b = b1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s2.w wVar, vy.d dVar) {
        switch (this.f24383a) {
            case 0:
                Object objD = f0.s2.d(wVar, null, new x(this.f24385c, this.f24384b, (vy.d) null), null, dVar, 11);
                return objD == wy.a.COROUTINE_SUSPENDED ? objD : qy.b0.f48488a;
            default:
                Object objD2 = f0.s2.d(wVar, null, new e6.g0(this.f24384b, (vy.d) null, 3), new bp.r0(7, this.f24385c), dVar, 3);
                return objD2 == wy.a.COROUTINE_SUSPENDED ? objD2 : qy.b0.f48488a;
        }
    }

    public y(l1.b1 b1Var, fz.a aVar) {
        this.f24384b = b1Var;
        this.f24385c = aVar;
    }
}
