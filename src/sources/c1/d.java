package c1;

import j3.u0;
import j3.x;
import j3.y0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements v3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0 f6423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f6424b;

    public d(e eVar) {
        this.f6424b = eVar;
    }

    @Override // v3.c
    public final float Z() {
        v3.c cVar = this.f6424b.f6435k;
        kotlin.jvm.internal.m.c(cVar);
        return cVar.Z();
    }

    public final u0 a(long j11, long j12) {
        long jH;
        e eVar = this.f6424b;
        y0 y0Var = eVar.f6436l;
        long jA = v3.o.d(j12) ? f.a(eVar.f6436l.f35827a.f35755b, j12) : j12;
        if (!v3.o.a(jA, eVar.f6436l.f35827a.f35755b)) {
            eVar.f(y0.a(eVar.f6436l, 0L, jA, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213));
        }
        if (eVar.f6430f > 1) {
            v3.m mVar = eVar.f6437n;
            kotlin.jvm.internal.m.c(mVar);
            jH = eVar.h(j11, mVar);
        } else {
            jH = j11;
        }
        v3.m mVar2 = eVar.f6437n;
        kotlin.jvm.internal.m.c(mVar2);
        x xVarB = eVar.b(jH, mVar2);
        v3.m mVar3 = eVar.f6437n;
        kotlin.jvm.internal.m.c(mVar3);
        u0 u0VarG = eVar.g(mVar3, jH, xVarB);
        this.f6423a = u0VarG;
        eVar.f(y0Var);
        return u0VarG;
    }

    @Override // v3.c
    public final float getDensity() {
        v3.c cVar = this.f6424b.f6435k;
        kotlin.jvm.internal.m.c(cVar);
        return cVar.getDensity();
    }

    @Override // v3.c
    public final float y0(long j11) {
        if (!v3.o.d(j11)) {
            return getDensity() * w(j11);
        }
        e eVar = this.f6424b;
        if (v3.o.d(eVar.f6436l.f35827a.f35755b)) {
            throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
        }
        long j12 = eVar.f6436l.f35827a.f35755b;
        v3.p[] pVarArr = v3.o.f53500b;
        if (v3.o.a(j12, v3.o.f53501c)) {
            throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
        }
        return v3.o.c(j11) * y0(eVar.f6436l.f35827a.f35755b);
    }
}
