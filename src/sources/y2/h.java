package y2;

import l1.c3;
import rt.mc;
import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f56864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f56865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f56866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f56867e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56868a;

    static {
        int i11 = 2;
        f56864b = new h(i11, 0);
        f56865c = new h(i11, 1);
        f56866d = new h(i11, 2);
        f56867e = new h(i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i11, int i12) {
        super(i11);
        this.f56868a = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56868a) {
            case 0:
                ((Number) obj2).intValue();
                ((k) obj).getClass();
                break;
            case 1:
                ((i0) ((k) obj)).f0((w2.q0) obj2);
                break;
            case 2:
                ((i0) ((k) obj)).g0((z1.r) obj2);
                break;
            default:
                l1.b0 b0Var = (l1.b0) obj2;
                i0 i0Var = (i0) ((k) obj);
                i0Var.f56887e0 = b0Var;
                mc mcVar = i0Var.f56892i0;
                c3 c3Var = z2.g1.f58547h;
                t1.i iVar = (t1.i) b0Var;
                iVar.getClass();
                i0Var.c0((v3.c) l1.t.E(iVar, c3Var));
                v3.m mVar = (v3.m) l1.t.E(iVar, z2.g1.f58552n);
                if (i0Var.f56883c0 != mVar) {
                    i0Var.f56883c0 = mVar;
                    i0Var.F();
                    i0 i0VarW = i0Var.w();
                    if (i0VarW != null) {
                        i0VarW.D();
                    }
                    i0Var.E();
                    for (z1.q qVar = (z1.q) mcVar.f50089g; qVar != null; qVar = qVar.f58487f) {
                        qVar.S();
                    }
                }
                i0Var.h0((p2) l1.t.E(iVar, z2.g1.f58557s));
                z1.q qVar2 = (z1.q) mcVar.f50089g;
                if ((qVar2.f58485d & 32768) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.f58484c & 32768) != 0) {
                            ?? F = qVar2;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof l) {
                                    z1.q qVar3 = ((z1.q) ((l) F)).f58482a;
                                    if (qVar3.P) {
                                        l1.c(qVar3);
                                    } else {
                                        qVar3.L = true;
                                    }
                                } else if ((F.f58484c & 32768) != 0 && (F instanceof n)) {
                                    z1.q qVar4 = ((n) F).R;
                                    int i11 = 0;
                                    while (qVar4 != null) {
                                        if ((qVar4.f58484c & 32768) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                F = F;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F = qVar4;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new n1.e(new z1.q[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.c(F);
                                                    F = 0;
                                                }
                                                eVar.c(qVar4);
                                            }
                                        } else {
                                            F = F;
                                            eVar = eVar;
                                        }
                                        qVar4 = qVar4.f58487f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                        F = F;
                                        eVar = eVar;
                                    } else {
                                        F = F;
                                        eVar = eVar;
                                    }
                                }
                                F = f.f(eVar);
                            }
                        }
                        if ((qVar2.f58485d & 32768) != 0) {
                            qVar2 = qVar2.f58487f;
                        }
                    }
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
