package d1;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import s0.o1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.h f22957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j3.u0 f22959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o3.p f22960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f1 f22961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j3.h f22963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o3.w f22964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o1 f22965i;

    public p0(o3.w wVar, o3.p pVar, o1 o1Var, f1 f1Var) {
        j3.h hVar = wVar.f44704a;
        long j11 = wVar.f44705b;
        j3.u0 u0Var = o1Var != null ? o1Var.f51124a : null;
        this.f22957a = hVar;
        this.f22958b = j11;
        this.f22959c = u0Var;
        this.f22960d = pVar;
        this.f22961e = f1Var;
        this.f22962f = j11;
        this.f22963g = hVar;
        this.f22964h = wVar;
        this.f22965i = o1Var;
    }

    public final List a(fz.c cVar) {
        if (!j3.x0.c(this.f22962f)) {
            return ns.o.L(new o3.a(BuildConfig.VERSION_NAME, 0), new o3.v(j3.x0.f(this.f22962f), j3.x0.f(this.f22962f)));
        }
        o3.g gVar = (o3.g) cVar.invoke(this);
        if (gVar != null) {
            return ns.o.K(gVar);
        }
        return null;
    }

    public final Integer b() {
        j3.u0 u0Var = this.f22959c;
        if (u0Var == null) {
            return null;
        }
        j3.x xVar = u0Var.f35798b;
        int iE = j3.x0.e(this.f22962f);
        o3.p pVar = this.f22960d;
        return Integer.valueOf(pVar.f(xVar.c(xVar.d(pVar.s(iE)), true)));
    }

    public final Integer c() {
        j3.u0 u0Var = this.f22959c;
        if (u0Var == null) {
            return null;
        }
        int iF = j3.x0.f(this.f22962f);
        o3.p pVar = this.f22960d;
        return Integer.valueOf(pVar.f(u0Var.g(u0Var.f35798b.d(pVar.s(iF)))));
    }

    public final Integer d() {
        int length;
        j3.u0 u0Var = this.f22959c;
        if (u0Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            j3.h hVar = this.f22957a;
            if (iR < hVar.f35700b.length()) {
                int length2 = this.f22963g.f35700b.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long j11 = u0Var.j(length2);
                int i11 = j3.x0.f35822c;
                int i12 = (int) (j11 & 4294967295L);
                if (i12 > iR) {
                    length = this.f22960d.f(i12);
                    break;
                }
                iR++;
            } else {
                length = hVar.f35700b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iF;
        j3.u0 u0Var = this.f22959c;
        if (u0Var == null) {
            return null;
        }
        for (int iR = r(); iR > 0; iR--) {
            int length = this.f22963g.f35700b.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long j11 = u0Var.j(length);
            int i11 = j3.x0.f35822c;
            int i12 = (int) (j11 >> 32);
            if (i12 < iR) {
                iF = this.f22960d.f(i12);
                return Integer.valueOf(iF);
            }
        }
        iF = 0;
        return Integer.valueOf(iF);
    }

    public final boolean f() {
        j3.u0 u0Var = this.f22959c;
        return (u0Var != null ? u0Var.h(r()) : null) != u3.j.Rtl;
    }

    public final int g(j3.u0 u0Var, int i11) {
        int iR = r();
        f1 f1Var = this.f22961e;
        if (f1Var.f22905a == null) {
            f1Var.f22905a = Float.valueOf(u0Var.c(iR).f26572a);
        }
        j3.x xVar = u0Var.f35798b;
        int iD = xVar.d(iR) + i11;
        if (iD < 0) {
            return 0;
        }
        if (iD >= xVar.f35818f) {
            return this.f22963g.f35700b.length();
        }
        float fB = xVar.b(iD) - 1;
        Float f5 = f1Var.f22905a;
        kotlin.jvm.internal.m.c(f5);
        float fFloatValue = f5.floatValue();
        if ((f() && fFloatValue >= u0Var.f(iD)) || (!f() && fFloatValue <= u0Var.e(iD))) {
            return xVar.c(iD, true);
        }
        return this.f22960d.f(xVar.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f5.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(o1 o1Var, int i11) {
        f2.c cVarE;
        w2.x xVar = o1Var.f51125b;
        j3.u0 u0Var = o1Var.f51124a;
        if (xVar == null) {
            cVarE = f2.c.f26571e;
        } else {
            w2.x xVar2 = o1Var.f51126c;
            cVarE = xVar2 != null ? xVar2.E(xVar, true) : null;
            if (cVarE == null) {
                cVarE = f2.c.f26571e;
            }
        }
        long j11 = this.f22964h.f44705b;
        int i12 = j3.x0.f35822c;
        int i13 = (int) (j11 & 4294967295L);
        o3.p pVar = this.f22960d;
        f2.c cVarC = u0Var.c(pVar.s(i13));
        float f5 = cVarC.f26572a;
        return pVar.f(u0Var.f35798b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (cVarE.c() & 4294967295L)) * i11) + cVarC.f26573b)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32)));
    }

    public final void i() {
        f1 f1Var = this.f22961e;
        f1Var.f22905a = null;
        j3.h hVar = this.f22963g;
        if (hVar.f35700b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            f1Var.f22905a = null;
            if (hVar.f35700b.length() > 0) {
                String str = hVar.f35700b;
                long j11 = this.f22962f;
                int i11 = j3.x0.f35822c;
                int iR = s0.o0.r((int) (j11 & 4294967295L), str);
                if (iR != -1) {
                    q(iR, iR);
                }
            }
        }
    }

    public final void j() {
        this.f22961e.f22905a = null;
        j3.h hVar = this.f22963g;
        String str = hVar.f35700b;
        String str2 = hVar.f35700b;
        if (str.length() > 0) {
            int iS = s0.o0.s(str2, j3.x0.e(this.f22962f));
            if (iS == j3.x0.e(this.f22962f) && iS != str2.length()) {
                iS = s0.o0.s(str2, iS + 1);
            }
            q(iS, iS);
        }
    }

    public final void k() {
        this.f22961e.f22905a = null;
        j3.h hVar = this.f22963g;
        if (hVar.f35700b.length() > 0) {
            String str = hVar.f35700b;
            long j11 = this.f22962f;
            int i11 = j3.x0.f35822c;
            int iU = s0.o0.u((int) (j11 & 4294967295L), str);
            if (iU != -1) {
                q(iU, iU);
            }
        }
    }

    public final void l() {
        this.f22961e.f22905a = null;
        j3.h hVar = this.f22963g;
        String str = hVar.f35700b;
        String str2 = hVar.f35700b;
        if (str.length() > 0) {
            int iT = s0.o0.t(str2, j3.x0.f(this.f22962f));
            if (iT == j3.x0.f(this.f22962f) && iT != 0) {
                iT = s0.o0.t(str2, iT - 1);
            }
            q(iT, iT);
        }
    }

    public final void m() {
        f1 f1Var = this.f22961e;
        f1Var.f22905a = null;
        j3.h hVar = this.f22963g;
        if (hVar.f35700b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            f1Var.f22905a = null;
            if (hVar.f35700b.length() > 0) {
                String str = hVar.f35700b;
                long j11 = this.f22962f;
                int i11 = j3.x0.f35822c;
                int iR = s0.o0.r((int) (j11 & 4294967295L), str);
                if (iR != -1) {
                    q(iR, iR);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.f22961e.f22905a = null;
        if (this.f22963g.f35700b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.f22961e.f22905a = null;
        if (this.f22963g.f35700b.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.f22963g.f35700b.length() > 0) {
            int i11 = j3.x0.f35822c;
            this.f22962f = j3.t.b((int) (this.f22958b >> 32), (int) (this.f22962f & 4294967295L));
        }
    }

    public final void q(int i11, int i12) {
        this.f22962f = j3.t.b(i11, i12);
    }

    public final int r() {
        long j11 = this.f22962f;
        int i11 = j3.x0.f35822c;
        return this.f22960d.s((int) (j11 & 4294967295L));
    }
}
