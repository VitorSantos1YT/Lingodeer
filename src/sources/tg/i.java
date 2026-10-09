package tg;

import b0.t1;
import d1.e1;
import fr.j3;
import l1.x1;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j3.y0 f52288a = new j3.y0(0, 0, null, null, 0, 0, 0, 16777183);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f52289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z1.r f52290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f52291d;

    static {
        long jC = g2.x.c(g2.x.f28617d, 0.5f);
        f52289b = jC;
        f52290c = d0.n.h(z1.o.f58481a, jC, g2.f0.f28556b);
        f52291d = j3.A(16);
    }

    public static final void a(i0 i0Var, String text, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1183188838);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(text) ? 32 : 16;
        }
        int i13 = i12 | 384;
        if ((i13 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            b(i0Var, t1.e.d(1557188131, new e1(text, 6), sVar), sVar, ((i13 >> 3) & 112) | (i13 & 14) | 384);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(i0Var, i11, 24, text);
        }
    }

    public static final void b(i0 i0Var, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1957181635);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(null) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            j jVar = k0.c(k0.b(i0Var, sVar)).f52303e;
            kotlin.jvm.internal.m.c(jVar);
            j3.y0 y0VarD = h0.d(i0Var, sVar).d(jVar.f52294a);
            z1.r rVar = jVar.f52295b;
            kotlin.jvm.internal.m.c(rVar);
            v3.c cVar = (v3.c) sVar.j(g1.f58547h);
            v3.o oVar = jVar.f52296c;
            kotlin.jvm.internal.m.c(oVar);
            float fW = cVar.w(oVar.f53502a);
            Boolean bool = jVar.f52297d;
            kotlin.jvm.internal.m.c(bool);
            v.b(i0Var, bool.booleanValue(), t1.e.d(1968694299, new h(rVar, fW, y0VarD, dVar), sVar), sVar, (i12 & 14) | 384);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(i0Var, dVar, i11, 1);
        }
    }
}
