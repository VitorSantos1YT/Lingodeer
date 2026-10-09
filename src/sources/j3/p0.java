package j3;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3.o f35754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n3.s f35756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n3.o f35757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n3.p f35758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n3.i f35759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f35760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f35761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u3.a f35762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u3.p f35763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q3.b f35764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f35765l;
    public final u3.l m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g2.v0 f35766n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g0 f35767o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i2.e f35768p;

    public p0(long j11, long j12, n3.s sVar, n3.o oVar, n3.p pVar, n3.i iVar, String str, long j13, u3.a aVar, u3.p pVar2, q3.b bVar, long j14, u3.l lVar, g2.v0 v0Var, g0 g0Var) {
        this(j11 != 16 ? new u3.c(j11) : u3.n.f52756a, j12, sVar, oVar, pVar, iVar, str, j13, aVar, pVar2, bVar, j14, lVar, v0Var, g0Var, null);
    }

    public final boolean a(p0 p0Var) {
        if (this == p0Var) {
            return true;
        }
        return v3.o.a(this.f35755b, p0Var.f35755b) && kotlin.jvm.internal.m.a(this.f35756c, p0Var.f35756c) && kotlin.jvm.internal.m.a(this.f35757d, p0Var.f35757d) && kotlin.jvm.internal.m.a(this.f35758e, p0Var.f35758e) && kotlin.jvm.internal.m.a(this.f35759f, p0Var.f35759f) && kotlin.jvm.internal.m.a(this.f35760g, p0Var.f35760g) && v3.o.a(this.f35761h, p0Var.f35761h) && kotlin.jvm.internal.m.a(this.f35762i, p0Var.f35762i) && kotlin.jvm.internal.m.a(this.f35763j, p0Var.f35763j) && kotlin.jvm.internal.m.a(this.f35764k, p0Var.f35764k) && g2.x.d(this.f35765l, p0Var.f35765l) && kotlin.jvm.internal.m.a(this.f35767o, p0Var.f35767o);
    }

    public final boolean b(p0 p0Var) {
        return kotlin.jvm.internal.m.a(this.f35754a, p0Var.f35754a) && kotlin.jvm.internal.m.a(this.m, p0Var.m) && kotlin.jvm.internal.m.a(this.f35766n, p0Var.f35766n) && kotlin.jvm.internal.m.a(this.f35768p, p0Var.f35768p);
    }

    public final p0 c(p0 p0Var) {
        if (p0Var == null) {
            return this;
        }
        u3.o oVar = p0Var.f35754a;
        return q0.a(this, oVar.b(), oVar.c(), oVar.a(), p0Var.f35755b, p0Var.f35756c, p0Var.f35757d, p0Var.f35758e, p0Var.f35759f, p0Var.f35760g, p0Var.f35761h, p0Var.f35762i, p0Var.f35763j, p0Var.f35764k, p0Var.f35765l, p0Var.m, p0Var.f35766n, p0Var.f35767o, p0Var.f35768p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return a(p0Var) && b(p0Var);
    }

    public final int hashCode() {
        u3.o oVar = this.f35754a;
        long jB = oVar.b();
        int i11 = g2.x.f28623j;
        int iHashCode = Long.hashCode(jB) * 31;
        g2.t tVarC = oVar.c();
        int iHashCode2 = (Float.hashCode(oVar.a()) + ((iHashCode + (tVarC != null ? tVarC.hashCode() : 0)) * 31)) * 31;
        v3.p[] pVarArr = v3.o.f53500b;
        int iF = defpackage.e.f(this.f35755b, iHashCode2, 31);
        n3.s sVar = this.f35756c;
        int i12 = (iF + (sVar != null ? sVar.f43179a : 0)) * 31;
        n3.o oVar2 = this.f35757d;
        int iHashCode3 = (i12 + (oVar2 != null ? Integer.hashCode(oVar2.f43170a) : 0)) * 31;
        n3.p pVar = this.f35758e;
        int iHashCode4 = (iHashCode3 + (pVar != null ? Integer.hashCode(pVar.f43171a) : 0)) * 31;
        n3.i iVar = this.f35759f;
        int iHashCode5 = (iHashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str = this.f35760g;
        int iF2 = defpackage.e.f(this.f35761h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        u3.a aVar = this.f35762i;
        int iHashCode6 = (iF2 + (aVar != null ? Float.hashCode(aVar.f52733a) : 0)) * 31;
        u3.p pVar2 = this.f35763j;
        int iHashCode7 = (iHashCode6 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        q3.b bVar = this.f35764k;
        int iF3 = defpackage.e.f(this.f35765l, (iHashCode7 + (bVar != null ? bVar.f47419a.hashCode() : 0)) * 31, 31);
        u3.l lVar = this.m;
        int i13 = (iF3 + (lVar != null ? lVar.f52754a : 0)) * 31;
        g2.v0 v0Var = this.f35766n;
        int iHashCode8 = (i13 + (v0Var != null ? v0Var.hashCode() : 0)) * 31;
        g0 g0Var = this.f35767o;
        int iHashCode9 = (iHashCode8 + (g0Var != null ? g0Var.hashCode() : 0)) * 31;
        i2.e eVar = this.f35768p;
        return iHashCode9 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        u3.o oVar = this.f35754a;
        sb2.append((Object) g2.x.j(oVar.b()));
        sb2.append(", brush=");
        sb2.append(oVar.c());
        sb2.append(", alpha=");
        sb2.append(oVar.a());
        sb2.append(", fontSize=");
        sb2.append((Object) v3.o.f(this.f35755b));
        sb2.append(", fontWeight=");
        sb2.append(this.f35756c);
        sb2.append(", fontStyle=");
        sb2.append(this.f35757d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f35758e);
        sb2.append(", fontFamily=");
        sb2.append(this.f35759f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f35760g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) v3.o.f(this.f35761h));
        sb2.append(", baselineShift=");
        sb2.append(this.f35762i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.f35763j);
        sb2.append(HOBXIlHxIkMBEA.BkAfYMNejjZ);
        sb2.append(this.f35764k);
        sb2.append(", background=");
        com.google.android.material.datepicker.d.t(this.f35765l, ", textDecoration=", sb2);
        sb2.append(this.m);
        sb2.append(", shadow=");
        sb2.append(this.f35766n);
        sb2.append(", platformStyle=");
        sb2.append(this.f35767o);
        sb2.append(", drawStyle=");
        sb2.append(this.f35768p);
        sb2.append(')');
        return sb2.toString();
    }

    public p0(u3.o oVar, long j11, n3.s sVar, n3.o oVar2, n3.p pVar, n3.i iVar, String str, long j12, u3.a aVar, u3.p pVar2, q3.b bVar, long j13, u3.l lVar, g2.v0 v0Var, g0 g0Var, i2.e eVar) {
        this.f35754a = oVar;
        this.f35755b = j11;
        this.f35756c = sVar;
        this.f35757d = oVar2;
        this.f35758e = pVar;
        this.f35759f = iVar;
        this.f35760g = str;
        this.f35761h = j12;
        this.f35762i = aVar;
        this.f35763j = pVar2;
        this.f35764k = bVar;
        this.f35765l = j13;
        this.m = lVar;
        this.f35766n = v0Var;
        this.f35767o = g0Var;
        this.f35768p = eVar;
    }

    public p0(long j11, long j12, n3.s sVar, n3.o oVar, n3.p pVar, n3.i iVar, String str, long j13, u3.a aVar, u3.p pVar2, q3.b bVar, long j14, u3.l lVar, g2.v0 v0Var, int i11) {
        this((i11 & 1) != 0 ? g2.x.f28622i : j11, (i11 & 2) != 0 ? v3.o.f53501c : j12, (i11 & 4) != 0 ? null : sVar, (i11 & 8) != 0 ? null : oVar, (i11 & 16) != 0 ? null : pVar, (i11 & 32) != 0 ? null : iVar, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? v3.o.f53501c : j13, (i11 & 256) != 0 ? null : aVar, (i11 & 512) != 0 ? null : pVar2, (i11 & 1024) != 0 ? null : bVar, (i11 & 2048) != 0 ? g2.x.f28622i : j14, (i11 & 4096) != 0 ? null : lVar, (i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? null : v0Var, (g0) null);
    }
}
