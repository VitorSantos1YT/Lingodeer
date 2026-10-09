package j9;

import java.util.ArrayList;
import java.util.Iterator;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class s extends q implements Iterable, gz.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f36250t = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a.a f36251f;

    public s(u uVar) {
        super(uVar);
        this.f36251f = new a.a(this);
    }

    @Override // j9.q
    public final p e(ob.m mVar) {
        p pVarE = super.e(mVar);
        a.a aVar = this.f36251f;
        aVar.getClass();
        return aVar.G(pVarE, mVar, false, (s) aVar.f6c);
    }

    @Override // j9.q
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s) || !super.equals(obj)) {
            return false;
        }
        a.a aVar = this.f36251f;
        int iH = ((u0) aVar.f7d).h();
        a.a aVar2 = ((s) obj).f36251f;
        if (iH != ((u0) aVar2.f7d).h() || aVar.f5b != aVar2.f5b) {
            return false;
        }
        u0 u0Var = (u0) aVar.f7d;
        kotlin.jvm.internal.m.f(u0Var, "<this>");
        for (q qVar : (nz.a) nz.n.P(new e00.i(u0Var, 7))) {
            if (!qVar.equals(((u0) aVar2.f7d).d(qVar.f36242b.f3958a))) {
                return false;
            }
        }
        return true;
    }

    public final p f(ob.m mVar, q qVar) {
        return this.f36251f.G(super.e(mVar), mVar, true, qVar);
    }

    public final p g(String route, boolean z11, q qVar) {
        p pVarG;
        kotlin.jvm.internal.m.f(route, "route");
        a.a aVar = this.f36251f;
        aVar.getClass();
        s sVar = (s) aVar.f6c;
        p pVarC = sVar.f36242b.c(route);
        ArrayList arrayList = new ArrayList();
        Iterator it = sVar.iterator();
        while (true) {
            m9.i iVar = (m9.i) it;
            pVarG = null;
            if (!iVar.hasNext()) {
                break;
            }
            q qVar2 = (q) iVar.next();
            if (!kotlin.jvm.internal.m.a(qVar2, qVar)) {
                if (qVar2 instanceof s) {
                    pVarG = ((s) qVar2).g(route, false, sVar);
                } else {
                    qVar2.getClass();
                    pVarG = qVar2.f36242b.c(route);
                }
            }
            if (pVarG != null) {
                arrayList.add(pVarG);
            }
        }
        p pVar = (p) ry.m.B0(arrayList);
        s sVar2 = sVar.f36243c;
        if (sVar2 != null && z11 && !sVar2.equals(qVar)) {
            pVarG = sVar2.g(route, true, sVar);
        }
        return (p) ry.m.B0(ry.l.T(new p[]{pVarC, pVar, pVarG}));
    }

    @Override // j9.q
    public final int hashCode() {
        a.a aVar = this.f36251f;
        int iF = aVar.f5b;
        u0 u0Var = (u0) aVar.f7d;
        int iH = u0Var.h();
        for (int i11 = 0; i11 < iH; i11++) {
            iF = (((iF * 31) + u0Var.f(i11)) * 31) + ((q) u0Var.i(i11)).hashCode();
        }
        return iF;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        a.a aVar = this.f36251f;
        aVar.getClass();
        return new m9.i(aVar);
    }

    @Override // j9.q
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        a.a aVar = this.f36251f;
        String str = (String) aVar.f9f;
        aVar.getClass();
        q qVarW = (str == null || oz.q.K0(str)) ? null : aVar.w(str, true);
        if (qVarW == null) {
            qVarW = aVar.v(aVar.f5b);
        }
        sb2.append(" startDestination=");
        if (qVarW == null) {
            String str2 = (String) aVar.f9f;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = (String) aVar.f8e;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(aVar.f5b));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(qVarW.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }
}
