package z2;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ae.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f58515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3.j f58516f = u3.j.Rtl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u3.j f58517t = u3.j.Ltr;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j3.u0 f58518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g3.t f58519d;

    @Override // ae.d
    public final int[] f(int i11) {
        int iE;
        if (k().length() <= 0 || i11 >= k().length()) {
            return null;
        }
        try {
            g3.t tVar = this.f58519d;
            if (tVar == null) {
                kotlin.jvm.internal.m.n("node");
                throw null;
            }
            f2.c cVarG = tVar.g();
            int iRound = Math.round(cVarG.f26575d - cVarG.f26573b);
            if (i11 <= 0) {
                i11 = 0;
            }
            j3.u0 u0Var = this.f58518c;
            if (u0Var == null) {
                kotlin.jvm.internal.m.n("layoutResult");
                throw null;
            }
            int iD = u0Var.f35798b.d(i11);
            j3.u0 u0Var2 = this.f58518c;
            if (u0Var2 == null) {
                kotlin.jvm.internal.m.n("layoutResult");
                throw null;
            }
            float f5 = u0Var2.f35798b.f(iD) + iRound;
            j3.u0 u0Var3 = this.f58518c;
            if (u0Var3 == null) {
                kotlin.jvm.internal.m.n("layoutResult");
                throw null;
            }
            if (u0Var3 == null) {
                kotlin.jvm.internal.m.n("layoutResult");
                throw null;
            }
            j3.x xVar = u0Var3.f35798b;
            if (f5 < xVar.f(xVar.f35818f - 1)) {
                j3.u0 u0Var4 = this.f58518c;
                if (u0Var4 == null) {
                    kotlin.jvm.internal.m.n("layoutResult");
                    throw null;
                }
                iE = u0Var4.f35798b.e(f5);
            } else {
                j3.u0 u0Var5 = this.f58518c;
                if (u0Var5 == null) {
                    kotlin.jvm.internal.m.n("layoutResult");
                    throw null;
                }
                iE = u0Var5.f35798b.f35818f;
            }
            return j(i11, o(iE - 1, f58517t) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // ae.d
    public final int[] m(int i11) {
        int iE;
        if (k().length() <= 0 || i11 <= 0) {
            return null;
        }
        try {
            g3.t tVar = this.f58519d;
            if (tVar == null) {
                kotlin.jvm.internal.m.n("node");
                throw null;
            }
            f2.c cVarG = tVar.g();
            int iRound = Math.round(cVarG.f26575d - cVarG.f26573b);
            int length = k().length();
            if (length <= i11) {
                i11 = length;
            }
            j3.u0 u0Var = this.f58518c;
            if (u0Var == null) {
                kotlin.jvm.internal.m.n("layoutResult");
                throw null;
            }
            int iD = u0Var.f35798b.d(i11);
            j3.u0 u0Var2 = this.f58518c;
            if (u0Var2 == null) {
                kotlin.jvm.internal.m.n("layoutResult");
                throw null;
            }
            float f5 = u0Var2.f35798b.f(iD) - iRound;
            if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
                j3.u0 u0Var3 = this.f58518c;
                if (u0Var3 == null) {
                    kotlin.jvm.internal.m.n("layoutResult");
                    throw null;
                }
                iE = u0Var3.f35798b.e(f5);
            } else {
                iE = 0;
            }
            if (i11 == k().length() && iE < iD) {
                iE++;
            }
            return j(o(iE, f58516f), i11);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int o(int i11, u3.j jVar) {
        j3.u0 u0Var = this.f58518c;
        if (u0Var == null) {
            kotlin.jvm.internal.m.n("layoutResult");
            throw null;
        }
        int iG = u0Var.g(i11);
        j3.u0 u0Var2 = this.f58518c;
        if (u0Var2 == null) {
            kotlin.jvm.internal.m.n("layoutResult");
            throw null;
        }
        if (jVar != u0Var2.h(iG)) {
            j3.u0 u0Var3 = this.f58518c;
            if (u0Var3 != null) {
                return u0Var3.g(i11);
            }
            kotlin.jvm.internal.m.n("layoutResult");
            throw null;
        }
        j3.u0 u0Var4 = this.f58518c;
        if (u0Var4 != null) {
            return u0Var4.f35798b.c(i11, false) - 1;
        }
        kotlin.jvm.internal.m.n("layoutResult");
        throw null;
    }
}
