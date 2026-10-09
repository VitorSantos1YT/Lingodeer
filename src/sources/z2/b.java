package z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ae.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f58504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3.j f58505e = u3.j.Rtl;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3.j f58506f = u3.j.Ltr;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j3.u0 f58507c;

    @Override // ae.d
    public final int[] f(int i11) {
        int iD;
        if (k().length() <= 0 || i11 >= k().length()) {
            return null;
        }
        u3.j jVar = f58505e;
        if (i11 < 0) {
            j3.u0 u0Var = this.f58507c;
            if (u0Var == null) {
                kotlin.jvm.internal.m.n("layoutResult");
                throw null;
            }
            iD = u0Var.f35798b.d(0);
        } else {
            j3.u0 u0Var2 = this.f58507c;
            if (u0Var2 == null) {
                kotlin.jvm.internal.m.n("layoutResult");
                throw null;
            }
            int iD2 = u0Var2.f35798b.d(i11);
            iD = o(iD2, jVar) == i11 ? iD2 : iD2 + 1;
        }
        j3.u0 u0Var3 = this.f58507c;
        if (u0Var3 == null) {
            kotlin.jvm.internal.m.n("layoutResult");
            throw null;
        }
        if (iD >= u0Var3.f35798b.f35818f) {
            return null;
        }
        return j(o(iD, jVar), o(iD, f58506f) + 1);
    }

    @Override // ae.d
    public final int[] m(int i11) {
        int iD;
        if (k().length() <= 0 || i11 <= 0) {
            return null;
        }
        int length = k().length();
        u3.j jVar = f58506f;
        if (i11 > length) {
            j3.u0 u0Var = this.f58507c;
            if (u0Var == null) {
                kotlin.jvm.internal.m.n("layoutResult");
                throw null;
            }
            iD = u0Var.f35798b.d(k().length());
        } else {
            j3.u0 u0Var2 = this.f58507c;
            if (u0Var2 == null) {
                kotlin.jvm.internal.m.n("layoutResult");
                throw null;
            }
            int iD2 = u0Var2.f35798b.d(i11);
            iD = o(iD2, jVar) + 1 == i11 ? iD2 : iD2 - 1;
        }
        if (iD < 0) {
            return null;
        }
        return j(o(iD, f58505e), o(iD, jVar) + 1);
    }

    public final int o(int i11, u3.j jVar) {
        j3.u0 u0Var = this.f58507c;
        if (u0Var == null) {
            kotlin.jvm.internal.m.n("layoutResult");
            throw null;
        }
        int iG = u0Var.g(i11);
        j3.u0 u0Var2 = this.f58507c;
        if (u0Var2 == null) {
            kotlin.jvm.internal.m.n("layoutResult");
            throw null;
        }
        if (jVar != u0Var2.h(iG)) {
            j3.u0 u0Var3 = this.f58507c;
            if (u0Var3 != null) {
                return u0Var3.g(i11);
            }
            kotlin.jvm.internal.m.n("layoutResult");
            throw null;
        }
        j3.u0 u0Var4 = this.f58507c;
        if (u0Var4 != null) {
            return u0Var4.f35798b.c(i11, false) - 1;
        }
        kotlin.jvm.internal.m.n("layoutResult");
        throw null;
    }
}
