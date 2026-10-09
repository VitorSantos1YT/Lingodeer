package j3;

import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y0 f35826d = new y0(0, 0, null, null, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f35827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f35828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f35829c;

    public y0(p0 p0Var, c0 c0Var, h0 h0Var) {
        this.f35827a = p0Var;
        this.f35828b = c0Var;
        this.f35829c = h0Var;
    }

    public static y0 a(y0 y0Var, long j11, long j12, n3.s sVar, n3.o oVar, n3.i iVar, long j13, q3.b bVar, u3.l lVar, int i11, int i12, long j14, u3.i iVar2, int i13) {
        u3.o cVar;
        long jB = (i13 & 1) != 0 ? y0Var.f35827a.f35754a.b() : j11;
        long j15 = (i13 & 2) != 0 ? y0Var.f35827a.f35755b : j12;
        n3.s sVar2 = (i13 & 4) != 0 ? y0Var.f35827a.f35756c : sVar;
        n3.o oVar2 = (i13 & 8) != 0 ? y0Var.f35827a.f35757d : oVar;
        p0 p0Var = y0Var.f35827a;
        n3.p pVar = p0Var.f35758e;
        n3.i iVar3 = (i13 & 32) != 0 ? p0Var.f35759f : iVar;
        String str = p0Var.f35760g;
        long j16 = (i13 & 128) != 0 ? p0Var.f35761h : j13;
        u3.a aVar = p0Var.f35762i;
        u3.p pVar2 = p0Var.f35763j;
        q3.b bVar2 = (i13 & 1024) != 0 ? p0Var.f35764k : bVar;
        long j17 = p0Var.f35765l;
        u3.l lVar2 = (i13 & 4096) != 0 ? p0Var.m : lVar;
        g2.v0 v0Var = p0Var.f35766n;
        i2.e eVar = p0Var.f35768p;
        int i14 = (i13 & 32768) != 0 ? y0Var.f35828b.f35668a : i11;
        int i15 = (i13 & 65536) != 0 ? y0Var.f35828b.f35669b : i12;
        long j18 = (i13 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? y0Var.f35828b.f35670c : j14;
        c0 c0Var = y0Var.f35828b;
        u3.q qVar = c0Var.f35671d;
        h0 h0Var = (i13 & 524288) != 0 ? y0Var.f35829c : i1.p.f34056a;
        u3.i iVar4 = (i13 & 1048576) != 0 ? c0Var.f35673f : iVar2;
        int i16 = c0Var.f35674g;
        int i17 = c0Var.f35675h;
        u3.s sVar3 = c0Var.f35676i;
        if (g2.x.d(jB, p0Var.f35754a.b())) {
            cVar = p0Var.f35754a;
        } else {
            cVar = jB != 16 ? new u3.c(jB) : u3.n.f52756a;
        }
        return new y0(new p0(cVar, j15, sVar2, oVar2, pVar, iVar3, str, j16, aVar, pVar2, bVar2, j17, lVar2, v0Var, h0Var != null ? h0Var.f35703a : null, eVar), new c0(i14, i15, j18, qVar, h0Var != null ? h0Var.f35704b : null, iVar4, i16, i17, sVar3), h0Var);
    }

    public static y0 e(y0 y0Var, long j11, long j12, n3.s sVar, n3.o oVar, n3.i iVar, long j13, int i11, long j14, int i12) {
        long j15 = (i12 & 2) != 0 ? v3.o.f53501c : j12;
        n3.s sVar2 = (i12 & 4) != 0 ? null : sVar;
        n3.o oVar2 = (i12 & 8) != 0 ? null : oVar;
        n3.i iVar2 = (i12 & 32) != 0 ? null : iVar;
        long j16 = (i12 & 128) != 0 ? v3.o.f53501c : j13;
        long j17 = g2.x.f28622i;
        int i13 = (32768 & i12) != 0 ? 0 : i11;
        long j18 = (i12 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? v3.o.f53501c : j14;
        p0 p0VarA = q0.a(y0Var.f35827a, j11, null, Float.NaN, j15, sVar2, oVar2, null, iVar2, null, j16, null, null, null, j17, null, null, null, null);
        c0 c0VarA = d0.a(y0Var.f35828b, i13, 0, j18, null, null, null, 0, 0, null);
        return (y0Var.f35827a == p0VarA && y0Var.f35828b == c0VarA) ? y0Var : new y0(p0VarA, c0VarA);
    }

    public final long b() {
        return this.f35827a.f35754a.b();
    }

    public final boolean c(y0 y0Var) {
        if (this != y0Var) {
            return kotlin.jvm.internal.m.a(this.f35828b, y0Var.f35828b) && this.f35827a.a(y0Var.f35827a);
        }
        return true;
    }

    public final y0 d(y0 y0Var) {
        return (y0Var == null || y0Var.equals(f35826d)) ? this : new y0(this.f35827a.c(y0Var.f35827a), this.f35828b.a(y0Var.f35828b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return kotlin.jvm.internal.m.a(this.f35827a, y0Var.f35827a) && kotlin.jvm.internal.m.a(this.f35828b, y0Var.f35828b) && kotlin.jvm.internal.m.a(this.f35829c, y0Var.f35829c);
    }

    public final int hashCode() {
        int iHashCode = (this.f35828b.hashCode() + (this.f35827a.hashCode() * 31)) * 31;
        h0 h0Var = this.f35829c;
        return iHashCode + (h0Var != null ? h0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) g2.x.j(b()));
        sb2.append(", brush=");
        p0 p0Var = this.f35827a;
        sb2.append(p0Var.f35754a.c());
        sb2.append(", alpha=");
        sb2.append(p0Var.f35754a.a());
        sb2.append(", fontSize=");
        sb2.append((Object) v3.o.f(p0Var.f35755b));
        sb2.append(", fontWeight=");
        sb2.append(p0Var.f35756c);
        sb2.append(", fontStyle=");
        sb2.append(p0Var.f35757d);
        sb2.append(", fontSynthesis=");
        sb2.append(p0Var.f35758e);
        sb2.append(", fontFamily=");
        sb2.append(p0Var.f35759f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(p0Var.f35760g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) v3.o.f(p0Var.f35761h));
        sb2.append(", baselineShift=");
        sb2.append(p0Var.f35762i);
        sb2.append(", textGeometricTransform=");
        sb2.append(p0Var.f35763j);
        sb2.append(", localeList=");
        sb2.append(p0Var.f35764k);
        sb2.append(", background=");
        com.google.android.material.datepicker.d.t(p0Var.f35765l, ", textDecoration=", sb2);
        sb2.append(p0Var.m);
        sb2.append(", shadow=");
        sb2.append(p0Var.f35766n);
        sb2.append(", drawStyle=");
        sb2.append(p0Var.f35768p);
        sb2.append(", textAlign=");
        c0 c0Var = this.f35828b;
        sb2.append((Object) u3.k.a(c0Var.f35668a));
        sb2.append(", textDirection=");
        sb2.append((Object) u3.m.a(c0Var.f35669b));
        sb2.append(", lineHeight=");
        sb2.append((Object) v3.o.f(c0Var.f35670c));
        sb2.append(", textIndent=");
        sb2.append(c0Var.f35671d);
        sb2.append(", platformStyle=");
        sb2.append(this.f35829c);
        sb2.append(", lineHeightStyle=");
        sb2.append(c0Var.f35673f);
        sb2.append(", lineBreak=");
        sb2.append((Object) u3.e.a(c0Var.f35674g));
        sb2.append(", hyphens=");
        sb2.append((Object) u3.d.a(c0Var.f35675h));
        sb2.append(", textMotion=");
        sb2.append(c0Var.f35676i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y0(p0 p0Var, c0 c0Var) {
        g0 g0Var = p0Var.f35767o;
        f0 f0Var = c0Var.f35672e;
        this(p0Var, c0Var, (g0Var == null && f0Var == null) ? null : new h0(g0Var, f0Var));
    }

    public y0(long j11, long j12, n3.s sVar, n3.o oVar, long j13, int i11, long j14, int i12) {
        this(new p0((i12 & 1) != 0 ? g2.x.f28622i : j11, (i12 & 2) != 0 ? v3.o.f53501c : j12, (i12 & 4) != 0 ? null : sVar, (i12 & 8) != 0 ? null : oVar, (n3.p) null, (i12 & 32) != 0 ? null : n3.i.f43156d, (String) null, (i12 & 128) != 0 ? v3.o.f53501c : j13, (u3.a) null, (u3.p) null, (q3.b) null, g2.x.f28622i, (u3.l) null, (g2.v0) null, (g0) null), new c0((32768 & i12) != 0 ? 0 : i11, 0, (i12 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? v3.o.f53501c : j14, null, null, null, 0, 0, null), null);
    }
}
