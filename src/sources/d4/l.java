package d4;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends g {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f23189u0 = -1.0f;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f23190v0 = -1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f23191w0 = -1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public d f23192x0 = this.K;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f23193y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f23194z0;

    public l() {
        this.S.clear();
        this.S.add(this.f23192x0);
        int length = this.R.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.R[i11] = this.f23192x0;
        }
    }

    @Override // d4.g
    public final boolean B() {
        return this.f23194z0;
    }

    @Override // d4.g
    public final boolean C() {
        return this.f23194z0;
    }

    @Override // d4.g
    public final void R(b4.c cVar, boolean z11) {
        if (this.V == null) {
            return;
        }
        d dVar = this.f23192x0;
        cVar.getClass();
        int iN = b4.c.n(dVar);
        if (this.f23193y0 == 1) {
            this.f23117a0 = iN;
            this.f23119b0 = 0;
            M(this.V.l());
            P(0);
            return;
        }
        this.f23117a0 = 0;
        this.f23119b0 = iN;
        P(this.V.r());
        M(0);
    }

    public final void S(int i11) {
        this.f23192x0.l(i11);
        this.f23194z0 = true;
    }

    public final void T(int i11) {
        if (this.f23193y0 == i11) {
            return;
        }
        this.f23193y0 = i11;
        ArrayList arrayList = this.S;
        arrayList.clear();
        if (this.f23193y0 == 1) {
            this.f23192x0 = this.J;
        } else {
            this.f23192x0 = this.K;
        }
        arrayList.add(this.f23192x0);
        d[] dVarArr = this.R;
        int length = dVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            dVarArr[i12] = this.f23192x0;
        }
    }

    @Override // d4.g
    public final void b(b4.c cVar, boolean z11) {
        h hVar = (h) this.V;
        if (hVar == null) {
            return;
        }
        Object objJ = hVar.j(c.LEFT);
        Object objJ2 = hVar.j(c.RIGHT);
        g gVar = this.V;
        boolean z12 = gVar != null && gVar.U[0] == f.WRAP_CONTENT;
        if (this.f23193y0 == 0) {
            objJ = hVar.j(c.TOP);
            objJ2 = hVar.j(c.BOTTOM);
            g gVar2 = this.V;
            z12 = gVar2 != null && gVar2.U[1] == f.WRAP_CONTENT;
        }
        if (this.f23194z0) {
            d dVar = this.f23192x0;
            if (dVar.f23108c) {
                b4.h hVarK = cVar.k(dVar);
                cVar.d(hVarK, this.f23192x0.d());
                if (this.f23190v0 != -1) {
                    if (z12) {
                        cVar.f(cVar.k(objJ2), hVarK, 0, 5);
                    }
                } else if (this.f23191w0 != -1 && z12) {
                    b4.h hVarK2 = cVar.k(objJ2);
                    cVar.f(hVarK, cVar.k(objJ), 0, 5);
                    cVar.f(hVarK2, hVarK, 0, 5);
                }
                this.f23194z0 = false;
                return;
            }
        }
        if (this.f23190v0 != -1) {
            b4.h hVarK3 = cVar.k(this.f23192x0);
            cVar.e(hVarK3, cVar.k(objJ), this.f23190v0, 8);
            if (z12) {
                cVar.f(cVar.k(objJ2), hVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f23191w0 != -1) {
            b4.h hVarK4 = cVar.k(this.f23192x0);
            b4.h hVarK5 = cVar.k(objJ2);
            cVar.e(hVarK4, hVarK5, -this.f23191w0, 8);
            if (z12) {
                cVar.f(hVarK4, cVar.k(objJ), 0, 5);
                cVar.f(hVarK5, hVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f23189u0 != -1.0f) {
            b4.h hVarK6 = cVar.k(this.f23192x0);
            b4.h hVarK7 = cVar.k(objJ2);
            float f5 = this.f23189u0;
            b4.b bVarL = cVar.l();
            bVarL.f3890d.g(hVarK6, -1.0f);
            bVarL.f3890d.g(hVarK7, f5);
            cVar.c(bVarL);
        }
    }

    @Override // d4.g
    public final boolean c() {
        return true;
    }

    @Override // d4.g
    public final void g(g gVar, HashMap map) {
        super.g(gVar, map);
        l lVar = (l) gVar;
        this.f23189u0 = lVar.f23189u0;
        this.f23190v0 = lVar.f23190v0;
        this.f23191w0 = lVar.f23191w0;
        T(lVar.f23193y0);
    }

    @Override // d4.g
    public final d j(c cVar) {
        int i11 = k.f23188a[cVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (this.f23193y0 == 1) {
                return this.f23192x0;
            }
            return null;
        }
        if ((i11 == 3 || i11 == 4) && this.f23193y0 == 0) {
            return this.f23192x0;
        }
        return null;
    }
}
