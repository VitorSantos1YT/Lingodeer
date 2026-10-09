package a0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f168a;

    public q(y yVar) {
        this.f168a = yVar;
    }

    @Override // w2.q0
    public final int a(w2.s sVar, List list, int i11) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((w2.p0) list.get(0)).b(i11));
            int iA = ns.o.A(list);
            int i12 = 1;
            if (1 <= iA) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((w2.p0) list.get(i12)).b(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == iA) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        w2.g1 g1Var;
        int i11;
        w2.g1 g1Var2;
        int i12;
        int i13;
        int size = list.size();
        w2.g1[] g1VarArr = new w2.g1[size];
        int size2 = list.size();
        long j12 = 0;
        int i14 = 0;
        while (true) {
            g1Var = null;
            i11 = 1;
            if (i14 >= size2) {
                break;
            }
            w2.p0 p0Var = (w2.p0) list.get(i14);
            Object objG = p0Var.G();
            s sVar = objG instanceof s ? (s) objG : null;
            if (sVar != null && ((Boolean) sVar.f179a.getValue()).booleanValue()) {
                w2.g1 g1VarB = p0Var.B(j11);
                long j13 = (((long) g1VarB.f54502b) & 4294967295L) | (((long) g1VarB.f54501a) << 32);
                g1VarArr[i14] = g1VarB;
                j12 = j13;
            }
            i14++;
        }
        int size3 = list.size();
        for (int i15 = 0; i15 < size3; i15++) {
            w2.p0 p0Var2 = (w2.p0) list.get(i15);
            if (g1VarArr[i15] == null) {
                g1VarArr[i15] = p0Var2.B(j11);
            }
        }
        if (s0Var.c0()) {
            i12 = (int) (j12 >> 32);
        } else {
            if (size != 0) {
                g1Var2 = g1VarArr[0];
                int i16 = size - 1;
                if (i16 != 0) {
                    int i17 = g1Var2 != null ? g1Var2.f54501a : 0;
                    if (1 <= i16) {
                        int i18 = 1;
                        while (true) {
                            w2.g1 g1Var3 = g1VarArr[i18];
                            int i19 = g1Var3 != null ? g1Var3.f54501a : 0;
                            if (i17 < i19) {
                                g1Var2 = g1Var3;
                                i17 = i19;
                            }
                            if (i18 == i16) {
                                break;
                            }
                            i18++;
                        }
                    }
                }
            } else {
                g1Var2 = null;
            }
            i12 = g1Var2 != null ? g1Var2.f54501a : 0;
        }
        if (s0Var.c0()) {
            i13 = (int) (j12 & 4294967295L);
        } else {
            if (size != 0) {
                g1Var = g1VarArr[0];
                int i21 = size - 1;
                if (i21 != 0) {
                    int i22 = g1Var != null ? g1Var.f54502b : 0;
                    if (1 <= i21) {
                        while (true) {
                            w2.g1 g1Var4 = g1VarArr[i11];
                            int i23 = g1Var4 != null ? g1Var4.f54502b : 0;
                            if (i22 < i23) {
                                g1Var = g1Var4;
                                i22 = i23;
                            }
                            if (i11 == i21) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
            i13 = g1Var != null ? g1Var.f54502b : 0;
        }
        if (!s0Var.c0()) {
            this.f168a.f236c.setValue(new v3.l((((long) i12) << 32) | (((long) i13) & 4294967295L)));
        }
        return s0Var.q0(i12, i13, ry.s.f50855a, new p(g1VarArr, this, i12, i13));
    }

    @Override // w2.q0
    public final int f(w2.s sVar, List list, int i11) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((w2.p0) list.get(0)).p(i11));
            int iA = ns.o.A(list);
            int i12 = 1;
            if (1 <= iA) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((w2.p0) list.get(i12)).p(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == iA) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // w2.q0
    public final int h(w2.s sVar, List list, int i11) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((w2.p0) list.get(0)).t(i11));
            int iA = ns.o.A(list);
            int i12 = 1;
            if (1 <= iA) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((w2.p0) list.get(i12)).t(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == iA) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // w2.q0
    public final int i(w2.s sVar, List list, int i11) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((w2.p0) list.get(0)).W(i11));
            int iA = ns.o.A(list);
            int i12 = 1;
            if (1 <= iA) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((w2.p0) list.get(i12)).W(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == iA) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
