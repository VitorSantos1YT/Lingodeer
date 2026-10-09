package j0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements w2.q0, x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f35420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1.d f35421b;

    public u(h hVar, z1.d dVar) {
        this.f35420a = hVar;
        this.f35421b = dVar;
    }

    @Override // w2.q0
    public final int a(w2.s sVar, List list, int i11) {
        int iN0 = sVar.n0(this.f35420a.a());
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
            int iB = p0Var.b(i11);
            if (fP == CropImageView.DEFAULT_ASPECT_RATIO) {
                i12 += iB;
            } else if (fP > CropImageView.DEFAULT_ASPECT_RATIO) {
                f5 += fP;
                iMax = Math.max(iMax, Math.round(iB / fP));
            }
        }
        return ((list.size() - 1) * iN0) + Math.round(iMax * f5) + i12;
    }

    @Override // j0.x1
    public final int b(w2.g1 g1Var) {
        return g1Var.f54501a;
    }

    @Override // j0.x1
    public final long c(int i11, int i12, int i13, boolean z11) {
        return !z11 ? v3.b.a(0, i13, i11, i12) : com.bumptech.glide.f.p(0, i13, i11, i12);
    }

    @Override // j0.x1
    public final int d(w2.g1 g1Var) {
        return g1Var.f54502b;
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        return c.t(this, v3.a.i(j11), v3.a.j(j11), v3.a.g(j11), v3.a.h(j11), s0Var.n0(this.f35420a.a()), s0Var, list, new w2.g1[list.size()], 0, list.size(), null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.f35420a, uVar.f35420a) && kotlin.jvm.internal.m.a(this.f35421b, uVar.f35421b);
    }

    @Override // w2.q0
    public final int f(w2.s sVar, List list, int i11) {
        int iN0 = sVar.n0(this.f35420a.a());
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
                int iMin2 = Math.min(p0Var.b(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.p(iMin2));
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
                iMax = Math.max(iMax, p0Var2.p(iRound != Integer.MAX_VALUE ? Math.round(iRound * fP2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // j0.x1
    public final w2.r0 g(w2.g1[] g1VarArr, w2.s0 s0Var, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return s0Var.q0(i12, i11, ry.s.f50855a, new gs.r(g1VarArr, this, i12, s0Var, iArr));
    }

    @Override // w2.q0
    public final int h(w2.s sVar, List list, int i11) {
        int iN0 = sVar.n0(this.f35420a.a());
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
                int iMin2 = Math.min(p0Var.b(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.t(iMin2));
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
                iMax = Math.max(iMax, p0Var2.t(iRound != Integer.MAX_VALUE ? Math.round(iRound * fP2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return this.f35421b.hashCode() + (this.f35420a.hashCode() * 31);
    }

    @Override // w2.q0
    public final int i(w2.s sVar, List list, int i11) {
        int iN0 = sVar.n0(this.f35420a.a());
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
            int iW = p0Var.W(i11);
            if (fP == CropImageView.DEFAULT_ASPECT_RATIO) {
                i12 += iW;
            } else if (fP > CropImageView.DEFAULT_ASPECT_RATIO) {
                f5 += fP;
                iMax = Math.max(iMax, Math.round(iW / fP));
            }
        }
        return ((list.size() - 1) * iN0) + Math.round(iMax * f5) + i12;
    }

    @Override // j0.x1
    public final void j(int i11, int[] iArr, int[] iArr2, w2.s0 s0Var) {
        this.f35420a.c(s0Var, i11, iArr, iArr2);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f35420a + ", horizontalAlignment=" + this.f35421b + ')';
    }
}
