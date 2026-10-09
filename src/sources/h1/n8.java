package h1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n8 implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f30742b;

    public /* synthetic */ n8(Object obj, int i11) {
        this.f30741a = i11;
        this.f30742b = obj;
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        w2.g1 g1VarB;
        switch (this.f30741a) {
            case 0:
                p8 p8Var = (p8) this.f30742b;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    w2.p0 p0Var = (w2.p0) list.get(i11);
                    if (w2.a0.i(p0Var) == h8.THUMB) {
                        w2.g1 g1VarB2 = p0Var.B(j11);
                        int size2 = list.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            w2.p0 p0Var2 = (w2.p0) list.get(i12);
                            if (w2.a0.i(p0Var2) == h8.TRACK) {
                                w2.g1 g1VarB3 = p0Var2.B(v3.a.a(0, 0, 0, 0, 11, v3.b.j(-g1VarB2.f54501a, 0, 2, j11)));
                                int i13 = g1VarB2.f54501a + g1VarB3.f54501a;
                                int iMax = Math.max(g1VarB3.f54502b, g1VarB2.f54502b);
                                p8Var.f30860i.m(g1VarB3.f54502b);
                                p8Var.f30858g.m(i13);
                                int i14 = g1VarB2.f54501a / 2;
                                float f5 = g1VarB3.f54501a;
                                lz.d dVar = p8Var.f30854c;
                                float f11 = dVar.f40530a;
                                float f12 = dVar.f40531b;
                                float fK = hz.b.k(p8Var.f30855d.l(), f11, f12);
                                float f13 = f12 - f11;
                                return s0Var.q0(i13, iMax, ry.s.f50855a, new m8(g1VarB3, i14, (iMax - g1VarB3.f54502b) / 2, g1VarB2, hz.b.Q(hz.b.k(f13 == CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : (fK - f11) / f13, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * f5), (iMax - g1VarB2.f54502b) / 2));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 1:
                if (((fz.e) this.f30742b) != null) {
                    int size3 = list.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size3) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        w2.p0 p0Var3 = (w2.p0) list.get(i15);
                        if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var3), "text")) {
                            g1VarB = p0Var3.B(v3.a.a(0, 0, 0, 0, 11, j11));
                        } else {
                            i15++;
                        }
                    }
                } else {
                    g1VarB = null;
                }
                int iMax2 = Math.max(g1VarB != null ? g1VarB.f54501a : 0, 0);
                int iMax3 = Math.max(s0Var.n0(x9.f31317a), s0Var.k0(x9.f31321e) + 0 + (g1VarB != null ? g1VarB.f54502b : 0));
                return s0Var.q0(iMax2, iMax3, ry.s.f50855a, new u9(g1VarB, null, s0Var, iMax2, iMax3, g1VarB != null ? Integer.valueOf(g1VarB.X(w2.c.f54475a)) : null, g1VarB != null ? Integer.valueOf(g1VarB.X(w2.c.f54476b)) : null));
            default:
                return s0Var.q0(v3.a.h(j11), v3.a.g(j11), ry.s.f50855a, new qp.n2(13, list, this));
        }
    }
}
