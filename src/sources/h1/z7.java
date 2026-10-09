package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z7 implements r2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e8 f31415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f31416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0.h1 f31417c;

    public z7(e8 e8Var, fz.c cVar, f0.h1 h1Var) {
        this.f31415a = e8Var;
        this.f31416b = cVar;
        this.f31417c = h1Var;
    }

    @Override // r2.a
    public final Object D(long j11, long j12, vy.d dVar) {
        this.f31416b.invoke(new Float(this.f31417c == f0.h1.Horizontal ? v3.q.b(j12) : v3.q.c(j12)));
        return new v3.q(j12);
    }

    @Override // r2.a
    public final long M(int i11, long j11) {
        f0.h1 h1Var = f0.h1.Horizontal;
        f0.h1 h1Var2 = this.f31417c;
        float fE = h1Var2 == h1Var ? f2.b.e(j11) : f2.b.f(j11);
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (fE >= CropImageView.DEFAULT_ASPECT_RATIO || i11 != 1) {
            return 0L;
        }
        ob.s sVar = this.f31415a.f30211b;
        float fQ = sVar.q(fE);
        l1.g1 g1Var = (l1.g1) sVar.f44884j;
        float fL = Float.isNaN(g1Var.l()) ? 0.0f : g1Var.l();
        g1Var.m(fQ);
        float f11 = fQ - fL;
        float f12 = h1Var2 == h1Var ? f11 : 0.0f;
        if (h1Var2 == f0.h1.Vertical) {
            f5 = f11;
        }
        return com.bumptech.glide.d.c(f12, f5);
    }

    @Override // r2.a
    public final Object W(long j11, vy.d dVar) {
        float fB = this.f31417c == f0.h1.Horizontal ? v3.q.b(j11) : v3.q.c(j11);
        e8 e8Var = this.f31415a;
        float fR = e8Var.f30211b.r();
        float fC = e8Var.f30211b.h().c();
        if (fB >= CropImageView.DEFAULT_ASPECT_RATIO || fR <= fC) {
            j11 = 0;
        } else {
            this.f31416b.invoke(new Float(fB));
        }
        return new v3.q(j11);
    }

    @Override // r2.a
    public final long x(long j11, int i11, long j12) {
        if (i11 != 1) {
            return 0L;
        }
        ob.s sVar = this.f31415a.f30211b;
        f0.h1 h1Var = f0.h1.Horizontal;
        f0.h1 h1Var2 = this.f31417c;
        float fQ = sVar.q(h1Var2 == h1Var ? f2.b.e(j12) : f2.b.f(j12));
        l1.g1 g1Var = (l1.g1) sVar.f44884j;
        boolean zIsNaN = Float.isNaN(g1Var.l());
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        float fL = zIsNaN ? 0.0f : g1Var.l();
        g1Var.m(fQ);
        float f11 = fQ - fL;
        float f12 = h1Var2 == h1Var ? f11 : 0.0f;
        if (h1Var2 == f0.h1.Vertical) {
            f5 = f11;
        }
        return com.bumptech.glide.d.c(f12, f5);
    }
}
