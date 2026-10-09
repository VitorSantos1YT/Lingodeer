package j0;

import bt.g7;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.e f35374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35375b;

    public p(z1.e eVar, boolean z11) {
        this.f35374a = eVar;
        this.f35375b = z11;
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        int iJ;
        int i11;
        w2.g1 g1VarB;
        boolean zIsEmpty = list.isEmpty();
        ry.s sVar = ry.s.f50855a;
        if (zIsEmpty) {
            return s0Var.q0(v3.a.j(j11), v3.a.i(j11), sVar, new com.lingo.lingoskill.object.a(27));
        }
        long j12 = this.f35375b ? j11 : j11 & (-8589934589L);
        if (list.size() == 1) {
            w2.p0 p0Var = (w2.p0) list.get(0);
            Object objG = p0Var.G();
            m mVar = objG instanceof m ? (m) objG : null;
            if (mVar != null ? mVar.R : false) {
                iJ = v3.a.j(j11);
                i11 = v3.a.i(j11);
                int iJ2 = v3.a.j(j11);
                int i12 = v3.a.i(j11);
                if (!((i12 >= 0) & (iJ2 >= 0))) {
                    v3.i.a("width and height must be >= 0");
                }
                g1VarB = p0Var.B(v3.b.h(iJ2, iJ2, i12, i12));
            } else {
                g1VarB = p0Var.B(j12);
                iJ = Math.max(v3.a.j(j11), g1VarB.f54501a);
                i11 = Math.max(v3.a.i(j11), g1VarB.f54502b);
            }
            int i13 = i11;
            int i14 = iJ;
            return s0Var.q0(i14, i13, sVar, new au.b1(g1VarB, p0Var, s0Var, i14, i13, this));
        }
        w2.g1[] g1VarArr = new w2.g1[list.size()];
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        wVar.f38359a = v3.a.j(j11);
        kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
        wVar2.f38359a = v3.a.i(j11);
        int size = list.size();
        boolean z11 = false;
        for (int i15 = 0; i15 < size; i15++) {
            w2.p0 p0Var2 = (w2.p0) list.get(i15);
            Object objG2 = p0Var2.G();
            m mVar2 = objG2 instanceof m ? (m) objG2 : null;
            if (mVar2 != null ? mVar2.R : false) {
                z11 = true;
            } else {
                w2.g1 g1VarB2 = p0Var2.B(j12);
                g1VarArr[i15] = g1VarB2;
                wVar.f38359a = Math.max(wVar.f38359a, g1VarB2.f54501a);
                wVar2.f38359a = Math.max(wVar2.f38359a, g1VarB2.f54502b);
            }
        }
        if (z11) {
            int i16 = wVar.f38359a;
            int i17 = i16 != Integer.MAX_VALUE ? i16 : 0;
            int i18 = wVar2.f38359a;
            long jA = v3.b.a(i17, i16, i18 != Integer.MAX_VALUE ? i18 : 0, i18);
            int size2 = list.size();
            for (int i19 = 0; i19 < size2; i19++) {
                w2.p0 p0Var3 = (w2.p0) list.get(i19);
                Object objG3 = p0Var3.G();
                m mVar3 = objG3 instanceof m ? (m) objG3 : null;
                if (mVar3 != null ? mVar3.R : false) {
                    g1VarArr[i19] = p0Var3.B(jA);
                }
            }
        }
        return s0Var.q0(wVar.f38359a, wVar2.f38359a, sVar, new g7(g1VarArr, list, s0Var, wVar, wVar2, this, 8));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f35374a, pVar.f35374a) && this.f35375b == pVar.f35375b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35375b) + (this.f35374a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f35374a);
        sb2.append(", propagateMinConstraints=");
        return ep.a.l(sb2, this.f35375b, ')');
    }
}
