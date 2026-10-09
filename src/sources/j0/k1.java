package j0;

import ko.Zea.ealNNtLp;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f35330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35331b;

    public k1(n2 n2Var, int i11) {
        this.f35330a = n2Var;
        this.f35331b = i11;
    }

    @Override // j0.n2
    public final int a(v3.c cVar) {
        if ((this.f35331b & 16) != 0) {
            return this.f35330a.a(cVar);
        }
        return 0;
    }

    @Override // j0.n2
    public final int b(v3.c cVar, v3.m mVar) {
        if (((mVar == v3.m.Ltr ? 4 : 1) & this.f35331b) != 0) {
            return this.f35330a.b(cVar, mVar);
        }
        return 0;
    }

    @Override // j0.n2
    public final int c(v3.c cVar, v3.m mVar) {
        if (((mVar == v3.m.Ltr ? 8 : 2) & this.f35331b) != 0) {
            return this.f35330a.c(cVar, mVar);
        }
        return 0;
    }

    @Override // j0.n2
    public final int d(v3.c cVar) {
        if ((this.f35331b & 32) != 0) {
            return this.f35330a.d(cVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return kotlin.jvm.internal.m.a(this.f35330a, k1Var.f35330a) && this.f35331b == k1Var.f35331b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35331b) + (this.f35330a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(PQgum.ZnSIZEmSUmjLvo);
        sb2.append(this.f35330a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i11 = c.f35258e;
        int i12 = this.f35331b;
        if ((i12 & i11) == i11) {
            c.I(sb4, "Start");
        }
        int i13 = c.f35260g;
        if ((i12 & i13) == i13) {
            c.I(sb4, "Left");
        }
        if ((i12 & 16) == 16) {
            c.I(sb4, "Top");
        }
        int i14 = c.f35259f;
        if ((i12 & i14) == i14) {
            c.I(sb4, "End");
        }
        int i15 = c.f35261h;
        if ((i12 & i15) == i15) {
            c.I(sb4, "Right");
        }
        if ((i12 & 32) == 32) {
            c.I(sb4, ealNNtLp.LKZ);
        }
        String string = sb4.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        sb3.append(string);
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
