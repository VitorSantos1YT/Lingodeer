package j0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f35277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f35278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f35279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r2 f35280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r2 f35281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r2 f35282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r2 f35283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r2 f35284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r2 f35285i;

    static {
        b0 b0Var = b0.Horizontal;
        f35277a = new d0(b0Var, 1.0f);
        b0 b0Var2 = b0.Vertical;
        f35278b = new d0(b0Var2, 1.0f);
        b0 b0Var3 = b0.Both;
        f35279c = new d0(b0Var3, 1.0f);
        z1.h hVar = z1.c.P;
        int i11 = 13;
        f35280d = new r2(b0Var, new ch.b0(hVar, i11), hVar);
        z1.h hVar2 = z1.c.O;
        f35281e = new r2(b0Var, new ch.b0(hVar2, i11), hVar2);
        z1.i iVar = z1.c.M;
        int i12 = 14;
        f35282f = new r2(b0Var2, new ch.b0(iVar, i12), iVar);
        z1.i iVar2 = z1.c.L;
        f35283g = new r2(b0Var2, new ch.b0(iVar2, i12), iVar2);
        z1.j jVar = z1.c.f58467e;
        int i13 = 15;
        f35284h = new r2(b0Var3, new ch.b0(jVar, i13), jVar);
        z1.j jVar2 = z1.c.f58463a;
        f35285i = new r2(b0Var3, new ch.b0(jVar2, i13), jVar2);
    }

    public static final z1.r a(z1.r rVar, float f5, float f11) {
        return rVar.i(new i2(f5, f11));
    }

    public static /* synthetic */ z1.r b(z1.r rVar, float f5, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f5 = Float.NaN;
        }
        if ((i11 & 2) != 0) {
            f11 = Float.NaN;
        }
        return a(rVar, f5, f11);
    }

    public static final z1.r c(z1.r rVar, float f5) {
        return rVar.i(f5 == 1.0f ? f35278b : new d0(b0.Vertical, f5));
    }

    public static final z1.r d(z1.r rVar, float f5) {
        return rVar.i(f5 == 1.0f ? f35279c : new d0(b0.Both, f5));
    }

    public static final z1.r e(z1.r rVar, float f5) {
        return rVar.i(f5 == 1.0f ? f35277a : new d0(b0.Horizontal, f5));
    }

    public static final z1.r g(z1.r rVar, float f5) {
        return rVar.i(new d2(CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, true, 5));
    }

    public static final z1.r h(z1.r rVar, float f5, float f11) {
        return rVar.i(new d2(CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, f11, true, 5));
    }

    public static /* synthetic */ z1.r i(z1.r rVar, float f5, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f5 = Float.NaN;
        }
        if ((i11 & 2) != 0) {
            f11 = Float.NaN;
        }
        return h(rVar, f5, f11);
    }

    public static final z1.r j(float f5) {
        return new d2(CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, false, 5);
    }

    public static final z1.r k(z1.r rVar, float f5) {
        return rVar.i(new d2(f5, f5, f5, f5, false));
    }

    public static final z1.r l(z1.r rVar, float f5, float f11) {
        return rVar.i(new d2(f5, f11, f5, f11, false));
    }

    public static z1.r m(z1.r rVar, float f5, float f11, float f12, float f13, int i11) {
        return rVar.i(new d2(f5, (i11 & 2) != 0 ? Float.NaN : f11, (i11 & 4) != 0 ? Float.NaN : f12, (i11 & 8) != 0 ? Float.NaN : f13, false));
    }

    public static final z1.r n(z1.r rVar, float f5) {
        return rVar.i(new d2(f5, f5, f5, f5, true));
    }

    public static final z1.r o(long j11, z1.r rVar) {
        return p(rVar, v3.h.b(j11), v3.h.a(j11));
    }

    public static final z1.r p(z1.r rVar, float f5, float f11) {
        return rVar.i(new d2(f5, f11, f5, f11, true));
    }

    public static final z1.r q(z1.r rVar, float f5, float f11, float f12, float f13) {
        return rVar.i(new d2(f5, f11, f12, f13, true));
    }

    public static /* synthetic */ z1.r r(z1.r rVar, float f5, float f11, float f12, int i11) {
        if ((i11 & 2) != 0) {
            f11 = Float.NaN;
        }
        if ((i11 & 4) != 0) {
            f12 = Float.NaN;
        }
        return q(rVar, f5, f11, f12, Float.NaN);
    }

    public static final z1.r s(z1.r rVar, float f5) {
        return rVar.i(new d2(f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, true, 10));
    }

    public static final z1.r t(z1.r rVar, float f5, float f11) {
        return rVar.i(new d2(f5, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, true, 10));
    }

    public static /* synthetic */ z1.r u(z1.r rVar, float f5, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f5 = Float.NaN;
        }
        if ((i11 & 2) != 0) {
            f11 = Float.NaN;
        }
        return t(rVar, f5, f11);
    }

    public static z1.r v(z1.r rVar) {
        r2 r2Var;
        z1.i iVar = z1.c.M;
        if (kotlin.jvm.internal.m.a(iVar, iVar)) {
            r2Var = f35282f;
        } else {
            r2Var = kotlin.jvm.internal.m.a(iVar, z1.c.L) ? f35283g : new r2(b0.Vertical, new ch.b0(iVar, 14), iVar);
        }
        return rVar.i(r2Var);
    }

    public static z1.r w(z1.r rVar, z1.j jVar, int i11) {
        r2 r2Var;
        z1.j jVar2 = z1.c.f58467e;
        if ((i11 & 1) != 0) {
            jVar = jVar2;
        }
        if (jVar.equals(jVar2)) {
            r2Var = f35284h;
        } else {
            r2Var = jVar.equals(z1.c.f58463a) ? f35285i : new r2(b0.Both, new ch.b0(jVar, 15), jVar);
        }
        return rVar.i(r2Var);
    }

    public static z1.r x(z1.r rVar, int i11) {
        r2 r2Var;
        Object obj = z1.c.O;
        z1.h hVar = z1.c.P;
        z1.h hVar2 = (i11 & 1) != 0 ? hVar : obj;
        if (hVar2.equals(hVar)) {
            r2Var = f35280d;
        } else {
            r2Var = hVar2.equals(obj) ? f35281e : new r2(b0.Horizontal, new ch.b0(hVar2, 13), hVar2);
        }
        return rVar.i(r2Var);
    }
}
