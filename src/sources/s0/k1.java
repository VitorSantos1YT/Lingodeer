package s0;

import com.yalantis.ucrop.view.CropImageView;
import f0.c2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f51083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.g0 f51084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.g0 f51085c;

    public k1(c2 c2Var, final m1 m1Var) {
        this.f51083a = c2Var;
        final int i11 = 0;
        this.f51084b = l1.t.s(new fz.a() { // from class: s0.j1
            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        m1 m1Var2 = m1Var;
                        return Boolean.valueOf(m1Var2.f51099a.l() < m1Var2.f51100b.l());
                    default:
                        return Boolean.valueOf(m1Var.f51099a.l() > CropImageView.DEFAULT_ASPECT_RATIO);
                }
            }
        });
        final int i12 = 1;
        this.f51085c = l1.t.s(new fz.a() { // from class: s0.j1
            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        m1 m1Var2 = m1Var;
                        return Boolean.valueOf(m1Var2.f51099a.l() < m1Var2.f51100b.l());
                    default:
                        return Boolean.valueOf(m1Var.f51099a.l() > CropImageView.DEFAULT_ASPECT_RATIO);
                }
            }
        });
    }

    @Override // f0.c2
    public final Object a(d0.l1 l1Var, fz.e eVar, xy.c cVar) {
        return this.f51083a.a(l1Var, eVar, cVar);
    }

    @Override // f0.c2
    public final boolean b() {
        return this.f51083a.b();
    }

    @Override // f0.c2
    public final boolean c() {
        return ((Boolean) this.f51085c.getValue()).booleanValue();
    }

    @Override // f0.c2
    public final boolean d() {
        return ((Boolean) this.f51084b.getValue()).booleanValue();
    }

    @Override // f0.c2
    public final float e(float f5) {
        return this.f51083a.e(f5);
    }
}
