package y0;

import ch.z;
import d1.q0;
import d1.r0;
import d1.s0;
import mt.c4;
import y.e0;
import y2.m;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final r a(r rVar, z zVar) {
        return rVar.i(new b(zVar));
    }

    public static final v0.c b(m mVar) {
        v0.f fVar;
        u0.a aVar = new u0.a();
        y2.f.A(mVar, d.f56793a, new s0.a(29, new s0.a(aVar, 28), new c4(1, aVar, u0.a.class, "addFilter", "addFilter$foundation_release(Lkotlin/jvm/functions/Function1;)V", 0, 21)));
        e0 e0Var = new e0();
        e0 e0Var2 = aVar.f52716a;
        Object[] objArr = e0Var2.f56686a;
        int i11 = e0Var2.f56687b;
        int i12 = 0;
        boolean z11 = true;
        v0.b bVar = null;
        while (true) {
            fVar = v0.f.f53462b;
            if (i12 >= i11) {
                break;
            }
            v0.b bVar2 = (v0.b) objArr[i12];
            if (!z11 || bVar2 != fVar) {
                if (bVar2 == fVar && bVar == fVar) {
                    z11 = false;
                } else {
                    if (bVar2 != fVar) {
                        e0 e0Var3 = aVar.f52717b;
                        Object[] objArr2 = e0Var3.f56686a;
                        int i13 = e0Var3.f56687b;
                        int i14 = 0;
                        while (true) {
                            if (i14 < i13) {
                                if (((Boolean) ((fz.c) objArr2[i14]).invoke(bVar2)).booleanValue()) {
                                    i14++;
                                } else {
                                    z11 = false;
                                }
                            }
                        }
                    }
                    e0Var.a(bVar2);
                    z11 = false;
                    bVar = bVar2;
                }
            }
            i12++;
        }
        if (((v0.b) (e0Var.h() ? null : e0Var.f56686a[e0Var.f56687b - 1])) == fVar) {
            e0Var.k(e0Var.f56687b - 1);
        }
        n1.b bVar3 = e0Var.f56688c;
        if (bVar3 == null) {
            bVar3 = new n1.b(e0Var, 1);
            e0Var.f56688c = bVar3;
        }
        return new v0.c(bVar3);
    }

    public static final r c(r0 r0Var) {
        return new e(r0Var);
    }

    public static final r d(r rVar, o20.i iVar, r0 r0Var, s0 s0Var, q0 q0Var) {
        return rVar.i(new i(iVar, r0Var, s0Var, q0Var));
    }
}
