package w2;

import androidx.compose.ui.platform.AndroidComposeView;
import rt.mc;
import y2.f2;
import y2.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.y f54536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f54537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54538c;

    public l0(m0 m0Var, Object obj) {
        this.f54537b = m0Var;
        this.f54538c = obj;
        int[] iArr = y.o.f56744a;
        this.f54536a = new y.y();
    }

    @Override // w2.n1
    public final int a() {
        y2.i0 i0Var = (y2.i0) this.f54537b.L.g(this.f54538c);
        if (i0Var != null) {
            return ((n1.e) ((n1.b) i0Var.o()).f43104b).f43114c;
        }
        return 0;
    }

    @Override // w2.n1
    public final long b(int i11) {
        y2.i0 i0Var = (y2.i0) this.f54537b.L.g(this.f54538c);
        if (i0Var == null || !i0Var.I()) {
            return 0L;
        }
        int i12 = ((n1.e) ((n1.b) i0Var.o()).f43104b).f43114c;
        if (i11 < 0 || i11 >= i12) {
            v2.a.d("Index (" + i11 + ") is out of bound of [0, " + i12 + ')');
        }
        if (!this.f54536a.b(i11)) {
            return 0L;
        }
        return (((long) ((y2.i0) ((n1.b) i0Var.o()).get(i11)).f56893j0.f56974p.f54501a) << 32) | (((long) ((y2.i0) ((n1.b) i0Var.o()).get(i11)).f56893j0.f56974p.f54502b) & 4294967295L);
    }

    @Override // w2.n1
    public final void c(int i11, long j11) {
        m0 m0Var = this.f54537b;
        y2.i0 i0Var = (y2.i0) m0Var.L.g(this.f54538c);
        if (i0Var == null || !i0Var.I()) {
            return;
        }
        int i12 = ((n1.e) ((n1.b) i0Var.o()).f43104b).f43114c;
        if (i11 < 0 || i11 >= i12) {
            v2.a.d("Index (" + i11 + ") is out of bound of [0, " + i12 + ')');
        }
        if (i0Var.J()) {
            v2.a.a("Pre-measure called on node that is not placed");
        }
        y2.i0 i0Var2 = m0Var.f54542a;
        i0Var2.T = true;
        ((AndroidComposeView) y2.l0.a(i0Var)).t((y2.i0) ((n1.b) i0Var.o()).get(i11), j11);
        i0Var2.T = false;
        this.f54536a.a(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [fr.e] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // w2.n1
    public final void d(fr.e eVar) {
        mc mcVar;
        z1.q qVar;
        y2.i0 i0Var = (y2.i0) this.f54537b.L.g(this.f54538c);
        if (i0Var == null || (mcVar = i0Var.f56892i0) == null || (qVar = (z1.q) mcVar.f50089g) == null) {
            return;
        }
        if (!qVar.f58482a.P) {
            v2.a.b("visitSubtreeIf called on an unattached node");
        }
        n1.e eVar2 = new n1.e(new z1.q[16]);
        z1.q qVar2 = qVar.f58482a;
        z1.q qVar3 = qVar2.f58487f;
        if (qVar3 == null) {
            y2.f.b(eVar2, qVar2);
        } else {
            eVar2.c(qVar3);
        }
        while (true) {
            int i11 = eVar2.f43114c;
            if (i11 == 0) {
                return;
            }
            z1.q qVar4 = (z1.q) eVar2.l(i11 - 1);
            if ((qVar4.f58485d & 262144) != 0) {
                z1.q qVar5 = qVar4;
                while (true) {
                    if (qVar5 != null && qVar5.P) {
                        if ((qVar5.f58484c & 262144) != 0) {
                            ?? F = qVar5;
                            ?? eVar3 = 0;
                            while (F != 0) {
                                if (F instanceof g2) {
                                    g2 g2Var = (g2) F;
                                    f2 f2Var = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(g2Var.h()) ? (f2) eVar.invoke(g2Var) : f2.ContinueTraversal;
                                    if (f2Var != f2.CancelTraversal) {
                                        if (f2Var == f2.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((F.f58484c & 262144) != 0 && (F instanceof y2.n)) {
                                    z1.q qVar6 = ((y2.n) F).R;
                                    int i12 = 0;
                                    F = F;
                                    eVar3 = eVar3;
                                    while (qVar6 != null) {
                                        if ((qVar6.f58484c & 262144) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                eVar3 = eVar3;
                                                F = qVar6;
                                            } else {
                                                if (eVar3 == 0) {
                                                    eVar3 = new n1.e(new z1.q[16]);
                                                }
                                                if (F != 0) {
                                                    eVar3.c(F);
                                                    F = 0;
                                                }
                                                eVar3.c(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.f58487f;
                                        F = F;
                                        eVar3 = eVar3;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                F = y2.f.f(eVar3);
                            }
                        }
                        qVar5 = qVar5.f58487f;
                    }
                }
            }
            y2.f.b(eVar2, qVar4);
        }
    }

    @Override // w2.n1
    public final void dispose() {
        m0 m0Var = this.f54537b;
        y2.i0 i0Var = m0Var.f54542a;
        m0Var.g();
        y.i0 i0Var2 = m0Var.L;
        Object obj = this.f54538c;
        y2.i0 i0Var3 = (y2.i0) i0Var2.k(obj);
        if (i0Var3 != null) {
            if (m0Var.Q <= 0) {
                v2.a.b("No pre-composed items to dispose");
            }
            int iJ = ((n1.e) ((n1.b) i0Var.p()).f43104b).j(i0Var3);
            if (iJ < ((n1.e) ((n1.b) i0Var.p()).f43104b).f43114c - m0Var.Q) {
                v2.a.b("Item is not in pre-composed item range");
            }
            m0Var.P++;
            m0Var.Q--;
            f0 f0Var = (f0) m0Var.f54547f.g(i0Var3);
            if (f0Var != null) {
                m0.d(f0Var);
            }
            int i11 = (((n1.e) ((n1.b) i0Var.p()).f43104b).f43114c - m0Var.Q) - m0Var.P;
            m0Var.i(iJ, i11);
            m0Var.f(i11);
        }
        if (m0Var.O.i(obj)) {
            y2.i0.Y(i0Var, true, 6);
        }
    }
}
