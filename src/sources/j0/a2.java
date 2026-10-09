package j0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements w2.q0, x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f35247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1.i f35248b;

    public a2(f fVar, z1.i iVar) {
        this.f35247a = fVar;
        this.f35248b = iVar;
    }

    @Override // w2.q0
    public final int a(w2.s sVar, List list, int i11) {
        int iN0 = sVar.n0(this.f35247a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iN0, i11);
        int size = list.size();
        int iMax = 0;
        float f5 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            w2.p0 p0Var = (w2.p0) list.get(i12);
            float fP = c.p(c.o(p0Var));
            if (fP == CropImageView.DEFAULT_ASPECT_RATIO) {
                int iMin2 = Math.min(p0Var.t(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.b(iMin2));
            } else if (fP > CropImageView.DEFAULT_ASPECT_RATIO) {
                f5 += fP;
            }
        }
        int iRound = f5 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i11 - iMin, 0) / f5);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            w2.p0 p0Var2 = (w2.p0) list.get(i13);
            float fP2 = c.p(c.o(p0Var2));
            if (fP2 > CropImageView.DEFAULT_ASPECT_RATIO) {
                iMax = Math.max(iMax, p0Var2.b(iRound != Integer.MAX_VALUE ? Math.round(iRound * fP2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // j0.x1
    public final int b(w2.g1 g1Var) {
        return g1Var.f54502b;
    }

    @Override // j0.x1
    public final long c(int i11, int i12, int i13, boolean z11) {
        return !z11 ? v3.b.a(i11, i12, 0, i13) : com.bumptech.glide.f.q(i11, i12, 0, i13);
    }

    @Override // j0.x1
    public final int d(w2.g1 g1Var) {
        return g1Var.f54501a;
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        return c.t(this, v3.a.j(j11), v3.a.i(j11), v3.a.h(j11), v3.a.g(j11), s0Var.n0(this.f35247a.a()), s0Var, list, new w2.g1[list.size()], 0, list.size(), null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return kotlin.jvm.internal.m.a(this.f35247a, a2Var.f35247a) && kotlin.jvm.internal.m.a(this.f35248b, a2Var.f35248b);
    }

    @Override // w2.q0
    public final int f(w2.s sVar, List list, int i11) {
        int iN0 = sVar.n0(this.f35247a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f5 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            w2.p0 p0Var = (w2.p0) list.get(i13);
            float fP = c.p(c.o(p0Var));
            int iP = p0Var.p(i11);
            if (fP == CropImageView.DEFAULT_ASPECT_RATIO) {
                i12 += iP;
            } else if (fP > CropImageView.DEFAULT_ASPECT_RATIO) {
                f5 += fP;
                iMax = Math.max(iMax, Math.round(iP / fP));
            }
        }
        return ((list.size() - 1) * iN0) + Math.round(iMax * f5) + i12;
    }

    @Override // j0.x1
    public final w2.r0 g(w2.g1[] g1VarArr, w2.s0 s0Var, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return s0Var.q0(i11, i12, ry.s.f50855a, new au.a1(g1VarArr, this, i12, iArr, 1));
    }

    @Override // w2.q0
    public final int h(w2.s sVar, List list, int i11) {
        int iN0 = sVar.n0(this.f35247a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f5 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            w2.p0 p0Var = (w2.p0) list.get(i13);
            float fP = c.p(c.o(p0Var));
            int iT = p0Var.t(i11);
            if (fP == CropImageView.DEFAULT_ASPECT_RATIO) {
                i12 += iT;
            } else if (fP > CropImageView.DEFAULT_ASPECT_RATIO) {
                f5 += fP;
                iMax = Math.max(iMax, Math.round(iT / fP));
            }
        }
        return ((list.size() - 1) * iN0) + Math.round(iMax * f5) + i12;
    }

    public final int hashCode() {
        return this.f35248b.hashCode() + (this.f35247a.hashCode() * 31);
    }

    @Override // w2.q0
    public final int i(w2.s sVar, List list, int i11) {
        int iN0 = sVar.n0(this.f35247a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iN0, i11);
        int size = list.size();
        int iMax = 0;
        float f5 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            w2.p0 p0Var = (w2.p0) list.get(i12);
            float fP = c.p(c.o(p0Var));
            if (fP == CropImageView.DEFAULT_ASPECT_RATIO) {
                int iMin2 = Math.min(p0Var.t(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.W(iMin2));
            } else if (fP > CropImageView.DEFAULT_ASPECT_RATIO) {
                f5 += fP;
            }
        }
        int iRound = f5 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i11 - iMin, 0) / f5);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            w2.p0 p0Var2 = (w2.p0) list.get(i13);
            float fP2 = c.p(c.o(p0Var2));
            if (fP2 > CropImageView.DEFAULT_ASPECT_RATIO) {
                iMax = Math.max(iMax, p0Var2.W(iRound != Integer.MAX_VALUE ? Math.round(iRound * fP2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // j0.x1
    public final void j(int i11, int[] iArr, int[] iArr2, w2.s0 s0Var) {
        this.f35247a.b(s0Var, i11, iArr, s0Var.getLayoutDirection(), iArr2);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f35247a + ", verticalAlignment=" + this.f35248b + ')';
    }
}
