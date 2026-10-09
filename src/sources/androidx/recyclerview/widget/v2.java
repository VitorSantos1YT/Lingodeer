package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.t0 f2641a = new y.t0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.r f2642b = new y.r((Object) null);

    public final void a(g2 g2Var, h1 h1Var) {
        y.t0 t0Var = this.f2641a;
        t2 t2VarA = (t2) t0Var.get(g2Var);
        if (t2VarA == null) {
            t2VarA = t2.a();
            t0Var.put(g2Var, t2VarA);
        }
        t2VarA.f2624c = h1Var;
        t2VarA.f2622a |= 8;
    }

    public final h1 b(g2 g2Var, int i11) {
        t2 t2Var;
        h1 h1Var;
        y.t0 t0Var = this.f2641a;
        int iD = t0Var.d(g2Var);
        if (iD >= 0 && (t2Var = (t2) t0Var.j(iD)) != null) {
            int i12 = t2Var.f2622a;
            if ((i12 & i11) != 0) {
                int i13 = i12 & (~i11);
                t2Var.f2622a = i13;
                if (i11 == 4) {
                    h1Var = t2Var.f2623b;
                } else {
                    if (i11 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    h1Var = t2Var.f2624c;
                }
                if ((i13 & 12) == 0) {
                    t0Var.h(iD);
                    t2Var.f2622a = 0;
                    t2Var.f2623b = null;
                    t2Var.f2624c = null;
                    t2.f2621d.c(t2Var);
                }
                return h1Var;
            }
        }
        return null;
    }

    public final void c(g2 g2Var) {
        t2 t2Var = (t2) this.f2641a.get(g2Var);
        if (t2Var == null) {
            return;
        }
        t2Var.f2622a &= -2;
    }

    public final void d(g2 g2Var) {
        y.r rVar = this.f2642b;
        for (int iJ = rVar.j() - 1; iJ >= 0; iJ--) {
            if (g2Var == rVar.k(iJ)) {
                Object[] objArr = rVar.f56754c;
                Object obj = objArr[iJ];
                Object obj2 = y.s.f56757a;
                if (obj == obj2) {
                    break;
                }
                objArr[iJ] = obj2;
                rVar.f56752a = true;
                break;
            }
        }
        t2 t2Var = (t2) this.f2641a.remove(g2Var);
        if (t2Var != null) {
            t2Var.f2622a = 0;
            t2Var.f2623b = null;
            t2Var.f2624c = null;
            t2.f2621d.c(t2Var);
        }
    }
}
