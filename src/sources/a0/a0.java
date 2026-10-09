package a0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f12a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13b;

    public a0(l0 l0Var) {
        this.f12a = l0Var;
    }

    @Override // w2.q0
    public final int a(w2.s sVar, List list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iB = ((w2.p0) list.get(0)).b(i11);
        int iA = ns.o.A(list);
        int i12 = 1;
        if (1 <= iA) {
            while (true) {
                int iB2 = ((w2.p0) list.get(i12)).b(i11);
                if (iB2 > iB) {
                    iB = iB2;
                }
                if (i12 == iA) {
                    break;
                }
                i12++;
            }
        }
        return iB;
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            w2.g1 g1VarB = ((w2.p0) list.get(i11)).B(j11);
            iMax = Math.max(iMax, g1VarB.f54501a);
            iMax2 = Math.max(iMax2, g1VarB.f54502b);
            arrayList.add(g1VarB);
        }
        boolean zC0 = s0Var.c0();
        l0 l0Var = this.f12a;
        if (zC0) {
            this.f13b = true;
            l0Var.f130a.setValue(new v3.l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f13b) {
            l0Var.f130a.setValue(new v3.l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return s0Var.q0(iMax, iMax2, ry.s.f50855a, new z(0, arrayList));
    }

    @Override // w2.q0
    public final int f(w2.s sVar, List list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iP = ((w2.p0) list.get(0)).p(i11);
        int iA = ns.o.A(list);
        int i12 = 1;
        if (1 <= iA) {
            while (true) {
                int iP2 = ((w2.p0) list.get(i12)).p(i11);
                if (iP2 > iP) {
                    iP = iP2;
                }
                if (i12 == iA) {
                    break;
                }
                i12++;
            }
        }
        return iP;
    }

    @Override // w2.q0
    public final int h(w2.s sVar, List list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iT = ((w2.p0) list.get(0)).t(i11);
        int iA = ns.o.A(list);
        int i12 = 1;
        if (1 <= iA) {
            while (true) {
                int iT2 = ((w2.p0) list.get(i12)).t(i11);
                if (iT2 > iT) {
                    iT = iT2;
                }
                if (i12 == iA) {
                    break;
                }
                i12++;
            }
        }
        return iT;
    }

    @Override // w2.q0
    public final int i(w2.s sVar, List list, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iW = ((w2.p0) list.get(0)).W(i11);
        int iA = ns.o.A(list);
        int i12 = 1;
        if (1 <= iA) {
            while (true) {
                int iW2 = ((w2.p0) list.get(i12)).W(i11);
                if (iW2 > iW) {
                    iW = iW2;
                }
                if (i12 == iA) {
                    break;
                }
                i12++;
            }
        }
        return iW;
    }
}
