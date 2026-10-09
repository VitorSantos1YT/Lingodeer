package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f35727a;

    public o(t0 t0Var) {
        this.f35727a = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        t0 t0Var = this.f35727a;
        h hVar = t0Var.f35784a;
        t0 t0Var2 = ((o) obj).f35727a;
        return kotlin.jvm.internal.m.a(hVar, t0Var2.f35784a) && t0Var.f35785b.c(t0Var2.f35785b) && kotlin.jvm.internal.m.a(t0Var.f35786c, t0Var2.f35786c) && t0Var.f35787d == t0Var2.f35787d && t0Var.f35788e == t0Var2.f35788e && t0Var.f35789f == t0Var2.f35789f && kotlin.jvm.internal.m.a(t0Var.f35790g, t0Var2.f35790g) && t0Var.f35791h == t0Var2.f35791h && t0Var.f35792i == t0Var2.f35792i && v3.a.b(t0Var.f35793j, t0Var2.f35793j);
    }

    public final int hashCode() {
        t0 t0Var = this.f35727a;
        int iHashCode = t0Var.f35784a.hashCode() * 31;
        y0 y0Var = t0Var.f35785b;
        p0 p0Var = y0Var.f35827a;
        long j11 = p0Var.f35755b;
        v3.p[] pVarArr = v3.o.f53500b;
        int iHashCode2 = Long.hashCode(j11) * 31;
        n3.s sVar = p0Var.f35756c;
        int i11 = (iHashCode2 + (sVar != null ? sVar.f43179a : 0)) * 31;
        n3.o oVar = p0Var.f35757d;
        int iHashCode3 = (i11 + (oVar != null ? Integer.hashCode(oVar.f43170a) : 0)) * 31;
        n3.p pVar = p0Var.f35758e;
        int iHashCode4 = (iHashCode3 + (pVar != null ? Integer.hashCode(pVar.f43171a) : 0)) * 31;
        n3.i iVar = p0Var.f35759f;
        int iHashCode5 = (iHashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str = p0Var.f35760g;
        int iF = defpackage.e.f(p0Var.f35761h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        u3.a aVar = p0Var.f35762i;
        int iHashCode6 = (iF + (aVar != null ? Float.hashCode(aVar.f52733a) : 0)) * 31;
        u3.p pVar2 = p0Var.f35763j;
        int iHashCode7 = (iHashCode6 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        q3.b bVar = p0Var.f35764k;
        int iHashCode8 = (iHashCode7 + (bVar != null ? bVar.f47419a.hashCode() : 0)) * 31;
        long j12 = p0Var.f35765l;
        int i12 = g2.x.f28623j;
        int iF2 = defpackage.e.f(j12, iHashCode8, 31);
        g0 g0Var = p0Var.f35767o;
        int iHashCode9 = (y0Var.f35828b.hashCode() + ((iF2 + (g0Var != null ? g0Var.hashCode() : 0)) * 31)) * 31;
        h0 h0Var = y0Var.f35829c;
        return Long.hashCode(t0Var.f35793j) + ((t0Var.f35792i.hashCode() + ((t0Var.f35791h.hashCode() + ((t0Var.f35790g.hashCode() + defpackage.e.b(t0Var.f35789f, defpackage.e.e((hh.p0.b((iHashCode9 + (h0Var != null ? h0Var.hashCode() : 0) + iHashCode) * 31, 31, t0Var.f35786c) + t0Var.f35787d) * 31, 31, t0Var.f35788e), 31)) * 31)) * 31)) * 31);
    }
}
