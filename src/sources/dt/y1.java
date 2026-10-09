package dt;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y1 implements PointerInputEventHandler {
    public final /* synthetic */ float H;
    public final /* synthetic */ l1.b1 K;
    public final /* synthetic */ l1.b1 L;
    public final /* synthetic */ l1.g1 M;
    public final /* synthetic */ l1.i1 N;
    public final /* synthetic */ l1.b1 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f24394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f24396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f24397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f24398f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f24399t;

    public y1(float f5, float f11, float f12, float f13, float f14, float f15, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.g1 g1Var, l1.i1 i1Var) {
        this.f24393a = b1Var;
        this.f24394b = f5;
        this.f24395c = b1Var2;
        this.f24396d = f11;
        this.f24397e = f12;
        this.f24398f = f13;
        this.f24399t = f14;
        this.H = f15;
        this.K = b1Var3;
        this.L = b1Var4;
        this.M = g1Var;
        this.N = i1Var;
        this.O = b1Var5;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s2.w wVar, vy.d dVar) {
        final l1.b1 b1Var = this.f24393a;
        bp.h0 h0Var = new bp.h0(13, b1Var);
        final float f5 = this.f24394b;
        final float f11 = this.f24396d;
        final float f12 = this.f24397e;
        final float f13 = this.f24398f;
        final float f14 = this.f24399t;
        final float f15 = this.H;
        final l1.b1 b1Var2 = this.f24395c;
        final l1.b1 b1Var3 = this.K;
        final l1.b1 b1Var4 = this.L;
        final l1.b1 b1Var5 = this.O;
        final l1.g1 g1Var = this.M;
        final l1.i1 i1Var = this.N;
        Object objE = f0.g0.e(wVar, h0Var, new fz.a() { // from class: dt.x1
            @Override // fz.a
            public final Object invoke() {
                Boolean bool = Boolean.FALSE;
                b1Var.setValue(bool);
                l1.b1 b1Var6 = b1Var2;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (e.w(b1Var6) >> 32));
                float f16 = f5;
                float f17 = f11;
                float f18 = f12;
                float f19 = f13;
                float f21 = f14;
                float f22 = f15;
                l1.b1 b1Var7 = b1Var3;
                l1.b1 b1Var8 = b1Var4;
                if (fIntBitsToFloat > f16) {
                    long jV = e.v(f17, f18, f19, f21, f22, b1Var7, ((f2.b) b1Var6.getValue()).f26570a);
                    e.y(jV, b1Var8);
                    g1Var.m(e.u(f19, f17, f21, f22, b1Var7, Float.intBitsToFloat((int) (jV & 4294967295L))));
                    l1.i1 i1Var2 = i1Var;
                    i1Var2.n(i1Var2.l() + 1);
                    b1Var5.setValue(bool);
                } else {
                    long jV2 = e.v(f17, f18, f19, f21, f22, b1Var7, ((f2.b) b1Var6.getValue()).f26570a);
                    e.x(jV2, b1Var6);
                    e.y(jV2, b1Var8);
                }
                return qy.b0.f48488a;
            }
        }, new q1(b1Var, b1Var2, f11, f12, f13, f14, f15, b1Var3, b1Var4), new bp.s(b1Var2, 2, (byte) 0), dVar);
        return objE == wy.a.COROUTINE_SUSPENDED ? objE : qy.b0.f48488a;
    }
}
