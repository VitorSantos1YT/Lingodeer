package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p8 implements f0.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fz.a f30853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lz.d f30854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.g1 f30855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fz.c f30856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f30857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.h1 f30858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.g1 f30860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l1.g1 f30861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l1.k1 f30862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0.c0 f30863l;
    public final l1.g1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l1.g1 f30864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f0.j f30865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0.o1 f30866p;

    public p8(float f5, int i11, fz.a aVar, lz.d dVar) {
        float[] fArr;
        this.f30852a = i11;
        this.f30853b = aVar;
        this.f30854c = dVar;
        this.f30855d = new l1.g1(f5);
        if (i11 == 0) {
            fArr = new float[0];
        } else {
            int i12 = i11 + 2;
            float[] fArr2 = new float[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                fArr2[i13] = i13 / (i11 + 1);
            }
            fArr = fArr2;
        }
        this.f30857f = fArr;
        this.f30858g = new l1.h1(0);
        this.f30860i = new l1.g1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f30861j = new l1.g1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f30862k = l1.t.B(Boolean.FALSE);
        this.f30863l = new a0.c0(this, 9);
        lz.d dVar2 = this.f30854c;
        float f11 = dVar2.f40530a;
        float f12 = dVar2.f40531b - f11;
        this.m = new l1.g1(android.support.v4.media.session.a.A(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, hz.b.k(f12 == CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : (f5 - f11) / f12, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)));
        this.f30864n = new l1.g1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f30865o = new f0.j(this, 1);
        this.f30866p = new d0.o1();
    }

    @Override // f0.s0
    public final Object a(d0.l1 l1Var, a0.e0 e0Var, f0.m0 m0Var) {
        Object objL = rz.e0.l(new fr.c(this, l1Var, e0Var, (vy.d) null, 13), m0Var);
        return objL == wy.a.COROUTINE_SUSPENDED ? objL : qy.b0.f48488a;
    }

    public final void b(float f5) {
        float fL = this.f30858g.l();
        l1.g1 g1Var = this.f30861j;
        float f11 = 2;
        float fMax = Math.max(fL - (g1Var.l() / f11), CropImageView.DEFAULT_ASPECT_RATIO);
        float fMin = Math.min(g1Var.l() / f11, fMax);
        l1.g1 g1Var2 = this.m;
        float fL2 = g1Var2.l() + f5;
        l1.g1 g1Var3 = this.f30864n;
        g1Var2.m(g1Var3.l() + fL2);
        g1Var3.m(CropImageView.DEFAULT_ASPECT_RATIO);
        float fD = o8.d(g1Var2.l(), fMin, fMax, this.f30857f);
        lz.d dVar = this.f30854c;
        float f12 = fMax - fMin;
        float fA = android.support.v4.media.session.a.A(dVar.f40530a, dVar.f40531b, hz.b.k(f12 == CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : (fD - fMin) / f12, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
        if (fA == this.f30855d.l()) {
            return;
        }
        fz.c cVar = this.f30856e;
        if (cVar != null) {
            cVar.invoke(Float.valueOf(fA));
        } else {
            c(fA);
        }
    }

    public final void c(float f5) {
        lz.d dVar = this.f30854c;
        float f11 = dVar.f40530a;
        float f12 = dVar.f40531b;
        this.f30855d.m(o8.d(hz.b.k(f5, f11, f12), f11, f12, this.f30857f));
    }
}
