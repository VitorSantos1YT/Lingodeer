package b4;

import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f3890d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f3887a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3888b = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3889c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3891e = false;

    public b(xq.c cVar) {
        this.f3890d = new a(this, cVar);
    }

    public final void a(c cVar, int i11) {
        this.f3890d.g(cVar.j(i11), 1.0f);
        this.f3890d.g(cVar.j(i11), -1.0f);
    }

    public final void b(h hVar, h hVar2, h hVar3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f3888b = i11;
        }
        if (z11) {
            this.f3890d.g(hVar, 1.0f);
            this.f3890d.g(hVar2, -1.0f);
            this.f3890d.g(hVar3, -1.0f);
        } else {
            this.f3890d.g(hVar, -1.0f);
            this.f3890d.g(hVar2, 1.0f);
            this.f3890d.g(hVar3, 1.0f);
        }
    }

    public final void c(h hVar, h hVar2, h hVar3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f3888b = i11;
        }
        if (z11) {
            this.f3890d.g(hVar, 1.0f);
            this.f3890d.g(hVar2, -1.0f);
            this.f3890d.g(hVar3, 1.0f);
        } else {
            this.f3890d.g(hVar, -1.0f);
            this.f3890d.g(hVar2, 1.0f);
            this.f3890d.g(hVar3, -1.0f);
        }
    }

    public h d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3887a == null && this.f3888b == CropImageView.DEFAULT_ASPECT_RATIO && this.f3890d.d() == 0;
    }

    public final h f(boolean[] zArr, h hVar) {
        g gVar;
        int iD = this.f3890d.d();
        h hVar2 = null;
        float f5 = 0.0f;
        for (int i11 = 0; i11 < iD; i11++) {
            float f11 = this.f3890d.f(i11);
            if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                h hVarE = this.f3890d.e(i11);
                if ((zArr == null || !zArr[hVarE.f3916b]) && hVarE != hVar && (((gVar = hVarE.K) == g.SLACK || gVar == g.ERROR) && f11 < f5)) {
                    f5 = f11;
                    hVar2 = hVarE;
                }
            }
        }
        return hVar2;
    }

    public final void g(h hVar) {
        h hVar2 = this.f3887a;
        if (hVar2 != null) {
            this.f3890d.g(hVar2, -1.0f);
            this.f3887a.f3917c = -1;
            this.f3887a = null;
        }
        float fH = this.f3890d.h(hVar, true) * (-1.0f);
        this.f3887a = hVar;
        if (fH == 1.0f) {
            return;
        }
        this.f3888b /= fH;
        a aVar = this.f3890d;
        int i11 = aVar.f3884h;
        for (int i12 = 0; i11 != -1 && i12 < aVar.f3877a; i12++) {
            float[] fArr = aVar.f3883g;
            fArr[i11] = fArr[i11] / fH;
            i11 = aVar.f3882f[i11];
        }
    }

    public final void h(c cVar, h hVar, boolean z11) {
        if (hVar.f3920f) {
            float fC = this.f3890d.c(hVar);
            this.f3888b = (hVar.f3919e * fC) + this.f3888b;
            this.f3890d.h(hVar, z11);
            if (z11) {
                hVar.b(this);
            }
            if (this.f3890d.d() == 0) {
                this.f3891e = true;
                cVar.f3894b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z11) {
        a aVar = this.f3890d;
        aVar.getClass();
        float fC = aVar.c(bVar.f3887a);
        aVar.h(bVar.f3887a, z11);
        a aVar2 = bVar.f3890d;
        int iD = aVar2.d();
        for (int i11 = 0; i11 < iD; i11++) {
            h hVarE = aVar2.e(i11);
            aVar.a(hVarE, aVar2.c(hVarE) * fC, z11);
        }
        this.f3888b = (bVar.f3888b * fC) + this.f3888b;
        if (z11) {
            bVar.f3887a.b(this);
        }
        if (this.f3887a == null || this.f3890d.d() != 0) {
            return;
        }
        this.f3891e = true;
        cVar.f3894b = true;
    }

    public String toString() {
        boolean z11;
        String strM = defpackage.e.m(this.f3887a == null ? "0" : BuildConfig.VERSION_NAME + this.f3887a, " = ");
        if (this.f3888b != CropImageView.DEFAULT_ASPECT_RATIO) {
            StringBuilder sbN = ep.a.n(strM);
            sbN.append(this.f3888b);
            strM = sbN.toString();
            z11 = true;
        } else {
            z11 = false;
        }
        int iD = this.f3890d.d();
        for (int i11 = 0; i11 < iD; i11++) {
            h hVarE = this.f3890d.e(i11);
            if (hVarE != null) {
                float f5 = this.f3890d.f(i11);
                if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
                    String string = hVarE.toString();
                    if (z11) {
                        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            strM = defpackage.e.m(strM, " + ");
                        } else {
                            strM = defpackage.e.m(strM, " - ");
                            f5 *= -1.0f;
                        }
                    } else if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        strM = defpackage.e.m(strM, "- ");
                        f5 *= -1.0f;
                    }
                    strM = f5 == 1.0f ? defpackage.e.m(strM, string) : strM + f5 + " " + string;
                    z11 = true;
                }
            }
        }
        return !z11 ? defpackage.e.m(strM, "0.0") : strM;
    }
}
