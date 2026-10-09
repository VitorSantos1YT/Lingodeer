package gs;

import com.yalantis.ucrop.view.CropImageView;
import j0.u;
import j0.y1;
import qy.b0;
import w2.f1;
import w2.g1;
import w2.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29828a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29833f;

    public /* synthetic */ r(int i11, bs.f fVar, fz.a aVar, fz.c cVar, String str) {
        this.f29830c = fVar;
        this.f29831d = str;
        this.f29832e = cVar;
        this.f29829b = i11;
        this.f29833f = aVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f29828a) {
            case 0:
                bs.f fVar = (bs.f) this.f29830c;
                String str = (String) this.f29831d;
                fz.c cVar = (fz.c) this.f29832e;
                fz.a aVar = (fz.a) this.f29833f;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                l0.h.p(LazyColumn, null, new t1.d(new g(fVar, 5), true, 874847186), 3);
                l0.h.p(LazyColumn, null, new t1.d(new h(fVar, str, cVar, 10), true, -1564071301), 3);
                l0.h.p(LazyColumn, null, new t1.d(new s(this.f29829b, aVar, 0), true, 1086947226), 3);
                break;
            default:
                g1[] g1VarArr = (g1[]) this.f29830c;
                u uVar = (u) this.f29831d;
                s0 s0Var = (s0) this.f29832e;
                int[] iArr = (int[]) this.f29833f;
                f1 f1Var = (f1) obj;
                int length = g1VarArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    g1 g1Var = g1VarArr[i11];
                    int i13 = i12 + 1;
                    kotlin.jvm.internal.m.c(g1Var);
                    Object objG = g1Var.G();
                    y1 y1Var = objG instanceof y1 ? (y1) objG : null;
                    v3.m layoutDirection = s0Var.getLayoutDirection();
                    j0.c cVar2 = y1Var != null ? y1Var.f35443c : null;
                    int i14 = this.f29829b;
                    f1Var.f(g1Var, cVar2 != null ? cVar2.i(i14 - g1Var.f54501a, layoutDirection) : uVar.f35421b.a(0, i14 - g1Var.f54501a, layoutDirection), iArr[i12], CropImageView.DEFAULT_ASPECT_RATIO);
                    i11++;
                    i12 = i13;
                }
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ r(g1[] g1VarArr, u uVar, int i11, s0 s0Var, int[] iArr) {
        this.f29830c = g1VarArr;
        this.f29831d = uVar;
        this.f29829b = i11;
        this.f29832e = s0Var;
        this.f29833f = iArr;
    }
}
