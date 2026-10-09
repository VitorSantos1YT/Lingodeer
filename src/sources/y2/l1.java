package y2;

import androidx.compose.ui.platform.AndroidComposeView;
import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y.d0 f56959a;

    static {
        y.d0 d0Var = y.n0.f56743a;
        f56959a = new y.d0();
    }

    public static final void a(z1.q qVar, int i11, int i12) {
        if (!(qVar instanceof n)) {
            b(qVar, i11 & qVar.f58484c, i12);
            return;
        }
        n nVar = (n) qVar;
        int i13 = nVar.Q;
        b(qVar, i13 & i11, i12);
        int i14 = (~i13) & i11;
        for (z1.q qVar2 = nVar.R; qVar2 != null; qVar2 = qVar2.f58487f) {
            a(qVar2, i14, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(z1.q qVar, int i11, int i12) {
        if (i12 != 0 || qVar.I0()) {
            if ((i11 & 2) != 0 && (qVar instanceof z)) {
                f.n((z) qVar);
                if (i12 == 2) {
                    f.v(qVar, 2).o1();
                }
            }
            if ((i11 & 128) != 0 && i12 != 2) {
                f.x(qVar).F();
            }
            if ((4194304 & i11) != 0 && i12 != 2) {
                f.x(qVar).X(false);
            }
            if ((i11 & 256) != 0 && (qVar instanceof r)) {
                if (i12 == 1) {
                    i0 i0VarX = f.x(qVar);
                    i0VarX.d0(i0VarX.f56902s0 + 1);
                } else if (i12 == 2) {
                    i0 i0VarX2 = f.x(qVar);
                    i0VarX2.d0(i0VarX2.f56902s0 - 1);
                }
                if (i12 != 2) {
                    i0 i0VarX3 = f.x(qVar);
                    if (i0VarX3.f56902s0 != 0 && !i0VarX3.q() && !i0VarX3.s() && !i0VarX3.f56901r0) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) l0.a(i0VarX3);
                        qp.r rVar = androidComposeView.f1197y0.f57044e;
                        rVar.getClass();
                        if (i0VarX3.f56902s0 > 0) {
                            ((n1.e) rVar.f48145b).c(i0VarX3);
                            i0VarX3.f56901r0 = true;
                        }
                        androidComposeView.E(null);
                    }
                }
            }
            if ((i11 & 4) != 0 && (qVar instanceof q)) {
                f.m((q) qVar);
            }
            if ((i11 & 8) != 0 && (qVar instanceof b2)) {
                f.x(qVar).U = true;
            }
            if ((i11 & 64) != 0 && (qVar instanceof w1)) {
                m0 m0Var = f.x((w1) qVar).f56893j0;
                m0Var.f56974p.S = true;
                v0 v0Var = m0Var.f56975q;
                if (v0Var != null) {
                    v0Var.Y = true;
                }
            }
            if ((i11 & 2048) != 0 && (qVar instanceof e2.u)) {
                e2.u uVar = (e2.u) qVar;
                g.f56863b = null;
                uVar.a0(g.f56862a);
                if (g.f56863b != null) {
                    z1.q qVar2 = (z1.q) uVar;
                    if (!qVar2.f58482a.P) {
                        v2.a.b("visitChildren called on an unattached node");
                    }
                    n1.e eVar = new n1.e(new z1.q[16]);
                    z1.q qVar3 = qVar2.f58482a;
                    z1.q qVar4 = qVar3.f58487f;
                    if (qVar4 == null) {
                        f.b(eVar, qVar3);
                    } else {
                        eVar.c(qVar4);
                    }
                    while (true) {
                        int i13 = eVar.f43114c;
                        if (i13 == 0) {
                            break;
                        }
                        z1.q qVarF = (z1.q) eVar.l(i13 - 1);
                        if ((qVarF.f58485d & 1024) == 0) {
                            f.b(eVar, qVarF);
                        } else {
                            while (qVarF != null) {
                                if ((qVarF.f58484c & 1024) != 0) {
                                    n1.e eVar2 = null;
                                    while (qVarF != null) {
                                        if (qVarF instanceof e2.e0) {
                                            e2.e0 e0Var = (e2.e0) qVarF;
                                            e2.i iVar = ((e2.p) f.y(e0Var).getFocusOwner()).f24739d;
                                            if (iVar.f24720c.a(e0Var)) {
                                                iVar.a();
                                            }
                                        } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof n)) {
                                            int i14 = 0;
                                            for (z1.q qVar5 = ((n) qVarF).R; qVar5 != null; qVar5 = qVar5.f58487f) {
                                                if ((qVar5.f58484c & 1024) != 0) {
                                                    i14++;
                                                    if (i14 == 1) {
                                                        qVarF = qVar5;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new n1.e(new z1.q[16]);
                                                        }
                                                        if (qVarF != null) {
                                                            eVar2.c(qVarF);
                                                            qVarF = null;
                                                        }
                                                        eVar2.c(qVar5);
                                                    }
                                                }
                                            }
                                            if (i14 == 1) {
                                            }
                                        }
                                        qVarF = f.f(eVar2);
                                    }
                                    break;
                                }
                                qVarF = qVarF.f58487f;
                            }
                        }
                    }
                }
            }
            if ((i11 & 4096) == 0 || !(qVar instanceof e2.g)) {
                return;
            }
            e2.g gVar = (e2.g) qVar;
            e2.i iVar2 = ((e2.p) f.y(gVar).getFocusOwner()).f24739d;
            if (iVar2.f24721d.a(gVar)) {
                iVar2.a();
            }
        }
    }

    public static final void c(z1.q qVar) {
        if (!qVar.P) {
            v2.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(qVar, -1, 0);
    }

    public static final int d(z1.p pVar) {
        int i11 = pVar instanceof w2.c0 ? 3 : 1;
        if (pVar instanceof d0.d1) {
            i11 |= 4;
        }
        if (pVar instanceof g3.q) {
            i11 |= 8;
        }
        if (pVar instanceof s2.z) {
            i11 |= 16;
        }
        if ((pVar instanceof x2.c) || (pVar instanceof x2.f)) {
            i11 |= 32;
        }
        if (pVar instanceof n0.d) {
            i11 |= 256;
        }
        if (pVar instanceof w2.d1) {
            i11 |= 64;
        }
        return pVar instanceof d3.a ? 524288 | i11 : i11;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0056  */
    /* JADX WARN: Code duplicated, block: B:43:0x005c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0062  */
    /* JADX WARN: Code duplicated, block: B:49:0x0068  */
    /* JADX WARN: Code duplicated, block: B:52:0x006e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0074  */
    /* JADX WARN: Code duplicated, block: B:58:0x007a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0082  */
    /* JADX WARN: Code duplicated, block: B:64:0x0089  */
    public static final int e(z1.q qVar) {
        int i11;
        int i12 = qVar.f58484c;
        if (i12 != 0) {
            return i12;
        }
        Class<?> cls = qVar.getClass();
        y.d0 d0Var = f56959a;
        int iD = d0Var.d(cls);
        if (iD >= 0) {
            return d0Var.f56679c[iD];
        }
        int i13 = qVar instanceof z ? 3 : 1;
        if (qVar instanceof q) {
            i13 |= 4;
        }
        if (qVar instanceof b2) {
            i13 |= 8;
        }
        if (qVar instanceof y1) {
            i13 |= 16;
        }
        if (qVar instanceof x2.e) {
            i13 |= 32;
        }
        if (qVar instanceof w1) {
            i13 |= 64;
        }
        if (!(qVar instanceof w2.a1)) {
            if (qVar instanceof w2.c1) {
                i13 |= 128;
            } else {
                i11 = qVar instanceof y ? 4194432 : 4194304;
            }
            if (qVar instanceof r) {
                i13 |= 256;
            }
            if (qVar instanceof e2.e0) {
                i13 |= 1024;
            }
            if (qVar instanceof e2.u) {
                i13 |= 2048;
            }
            if (qVar instanceof e2.g) {
                i13 |= 4096;
            }
            if (qVar instanceof q2.e) {
                i13 |= OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            if (qVar instanceof z2.j) {
                i13 |= 16384;
            }
            if (qVar instanceof l) {
                i13 |= 32768;
            }
            if (qVar instanceof g2) {
                i13 |= 262144;
            }
            if (qVar instanceof d3.a) {
                i13 |= 524288;
            }
            d0Var.g(i13, cls);
            return i13;
        }
        i13 |= i11;
        if (qVar instanceof r) {
            i13 |= 256;
        }
        if (qVar instanceof e2.e0) {
            i13 |= 1024;
        }
        if (qVar instanceof e2.u) {
            i13 |= 2048;
        }
        if (qVar instanceof e2.g) {
            i13 |= 4096;
        }
        if (qVar instanceof q2.e) {
            i13 |= OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (qVar instanceof z2.j) {
            i13 |= 16384;
        }
        if (qVar instanceof l) {
            i13 |= 32768;
        }
        if (qVar instanceof g2) {
            i13 |= 262144;
        }
        if (qVar instanceof d3.a) {
            i13 |= 524288;
        }
        d0Var.g(i13, cls);
        return i13;
    }

    public static final int f(z1.q qVar) {
        if (!(qVar instanceof n)) {
            return e(qVar);
        }
        n nVar = (n) qVar;
        int iF = nVar.Q;
        for (z1.q qVar2 = nVar.R; qVar2 != null; qVar2 = qVar2.f58487f) {
            iF |= f(qVar2);
        }
        return iF;
    }

    public static final boolean g(int i11) {
        return ((i11 & 128) != 0) | ((i11 & 4194304) != 0);
    }
}
