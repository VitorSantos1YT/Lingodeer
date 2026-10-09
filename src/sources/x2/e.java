package x2;

import rt.mc;
import y2.d2;
import y2.i0;
import y2.m;
import y2.n;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface e extends g, m {
    default ve.i X() {
        return b.f55753d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [x2.e, y2.m] */
    @Override // x2.g
    default Object a(h hVar) {
        mc mcVar;
        q qVar = (q) this;
        if (!qVar.f58482a.P) {
            v2.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!qVar.f58482a.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        q qVar2 = qVar.f58482a.f58486e;
        i0 i0VarX = y2.f.x(this);
        while (i0VarX != null) {
            if ((((q) i0VarX.f56892i0.f50089g).f58485d & 32) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.f58484c & 32) != 0) {
                        ?? F = qVar2;
                        ?? eVar = 0;
                        while (F != 0) {
                            if (F instanceof e) {
                                e eVar2 = (e) F;
                                if (eVar2.X().n(hVar)) {
                                    return eVar2.X().q(hVar);
                                }
                            } else if ((F.f58484c & 32) != 0 && (F instanceof n)) {
                                q qVar3 = ((n) F).R;
                                int i11 = 0;
                                F = F;
                                eVar = eVar;
                                while (qVar3 != null) {
                                    if ((qVar3.f58484c & 32) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            eVar = eVar;
                                            F = qVar3;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new n1.e(new q[16]);
                                            }
                                            if (F != 0) {
                                                eVar.c(F);
                                                F = 0;
                                            }
                                            eVar.c(qVar3);
                                        }
                                    }
                                    qVar3 = qVar3.f58487f;
                                    F = F;
                                    eVar = eVar;
                                }
                                if (i11 == 1) {
                                }
                            }
                            F = y2.f.f(eVar);
                        }
                    }
                    qVar2 = qVar2.f58486e;
                }
            }
            i0VarX = i0VarX.w();
            qVar2 = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
        }
        return hVar.f55760a.invoke();
    }
}
