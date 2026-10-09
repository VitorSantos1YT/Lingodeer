package s0;

import com.yalantis.ucrop.view.CropImageView;
import qp.o2;
import rt.v7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o2 f51098g = w1.j.b(new rz.w(1), new v7(23));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.g1 f51099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.g1 f51100b = new l1.g1(CropImageView.DEFAULT_ASPECT_RATIO);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.h1 f51101c = new l1.h1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f2.c f51102d = f2.c.f26571e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f51103e = j3.x0.f35821b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.k1 f51104f;

    public m1(f0.h1 h1Var, float f5) {
        this.f51099a = new l1.g1(f5);
        this.f51104f = new l1.k1(h1Var, l1.g.f39303t);
    }

    public final void a(f0.h1 h1Var, f2.c cVar, int i11, int i12) {
        float f5;
        float f11 = i12 - i11;
        this.f51100b.m(f11);
        float f12 = cVar.f26572a;
        float f13 = cVar.f26573b;
        f2.c cVar2 = this.f51102d;
        float f14 = cVar2.f26572a;
        l1.g1 g1Var = this.f51099a;
        if (f12 != f14 || f13 != cVar2.f26573b) {
            boolean z11 = h1Var == f0.h1.Vertical;
            if (z11) {
                f12 = f13;
            }
            float f15 = z11 ? cVar.f26575d : cVar.f26574c;
            float fL = g1Var.l();
            float f16 = i11;
            float f17 = fL + f16;
            if (f15 <= f17 && (f12 >= fL || f15 - f12 <= f16)) {
                f5 = (f12 >= fL || f15 - f12 > f16) ? 0.0f : f12 - fL;
            } else {
                f5 = f15 - f17;
            }
            g1Var.m(g1Var.l() + f5);
            this.f51102d = cVar;
        }
        g1Var.m(hz.b.k(g1Var.l(), CropImageView.DEFAULT_ASPECT_RATIO, f11));
        this.f51101c.m(i11);
    }
}
