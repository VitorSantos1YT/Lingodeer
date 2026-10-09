package b4;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Arrays;
import ob.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f3892q = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f3896d;
    public final xq.c m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f3907p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3893a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3894b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3895c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3897e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3898f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3900h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean[] f3901i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3902j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3903k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3904l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h[] f3905n = new h[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3906o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b[] f3899g = new b[32];

    public c() {
        s();
        xq.c cVar = new xq.c(1);
        cVar.f56174b = new d();
        cVar.f56175c = new d();
        cVar.f56176d = new h[32];
        this.m = cVar;
        f fVar = new f(cVar);
        fVar.f3911f = new h[128];
        fVar.f3912g = new h[128];
        fVar.f3913h = 0;
        fVar.f3914i = new l(fVar);
        this.f3896d = fVar;
        this.f3907p = new b(cVar);
    }

    public static int n(Object obj) {
        h hVar = ((d4.d) obj).f23114i;
        if (hVar != null) {
            return (int) (hVar.f3919e + 0.5f);
        }
        return 0;
    }

    public final h a(g gVar) {
        d dVar = (d) this.m.f56175c;
        int i11 = dVar.f3909b;
        Object obj = null;
        if (i11 > 0) {
            int i12 = i11 - 1;
            Object[] objArr = dVar.f3908a;
            Object obj2 = objArr[i12];
            objArr[i12] = null;
            dVar.f3909b = i12;
            obj = obj2;
        }
        h hVar = (h) obj;
        if (hVar == null) {
            hVar = new h(gVar);
            hVar.K = gVar;
        } else {
            hVar.c();
            hVar.K = gVar;
        }
        int i13 = this.f3906o;
        int i14 = this.f3893a;
        if (i13 >= i14) {
            int i15 = i14 * 2;
            this.f3893a = i15;
            this.f3905n = (h[]) Arrays.copyOf(this.f3905n, i15);
        }
        h[] hVarArr = this.f3905n;
        int i16 = this.f3906o;
        this.f3906o = i16 + 1;
        hVarArr[i16] = hVar;
        return hVar;
    }

    public final void b(h hVar, h hVar2, int i11, float f5, h hVar3, h hVar4, int i12, int i13) {
        b bVarL = l();
        if (hVar2 == hVar3) {
            bVarL.f3890d.g(hVar, 1.0f);
            bVarL.f3890d.g(hVar4, 1.0f);
            bVarL.f3890d.g(hVar2, -2.0f);
        } else if (f5 == 0.5f) {
            bVarL.f3890d.g(hVar, 1.0f);
            bVarL.f3890d.g(hVar2, -1.0f);
            bVarL.f3890d.g(hVar3, -1.0f);
            bVarL.f3890d.g(hVar4, 1.0f);
            if (i11 > 0 || i12 > 0) {
                bVarL.f3888b = (-i11) + i12;
            }
        } else if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            bVarL.f3890d.g(hVar, -1.0f);
            bVarL.f3890d.g(hVar2, 1.0f);
            bVarL.f3888b = i11;
        } else if (f5 >= 1.0f) {
            bVarL.f3890d.g(hVar4, -1.0f);
            bVarL.f3890d.g(hVar3, 1.0f);
            bVarL.f3888b = -i12;
        } else {
            float f11 = 1.0f - f5;
            bVarL.f3890d.g(hVar, f11 * 1.0f);
            bVarL.f3890d.g(hVar2, f11 * (-1.0f));
            bVarL.f3890d.g(hVar3, (-1.0f) * f5);
            bVarL.f3890d.g(hVar4, 1.0f * f5);
            if (i11 > 0 || i12 > 0) {
                bVarL.f3888b = (i12 * f5) + ((-i11) * f11);
            }
        }
        if (i13 != 8) {
            bVarL.a(this, i13);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    public final void c(b bVar) {
        boolean z11;
        boolean z12;
        h hVarF;
        boolean z13 = true;
        if (this.f3903k + 1 >= this.f3904l || this.f3902j + 1 >= this.f3898f) {
            o();
        }
        if (bVar.f3891e) {
            z11 = false;
        } else {
            ArrayList arrayList = bVar.f3889c;
            if (this.f3899g.length != 0) {
                boolean z14 = false;
                while (!z14) {
                    int iD = bVar.f3890d.d();
                    for (int i11 = 0; i11 < iD; i11++) {
                        h hVarE = bVar.f3890d.e(i11);
                        if (hVarE.f3917c != -1 || hVarE.f3920f) {
                            arrayList.add(hVarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i12 = 0; i12 < size; i12++) {
                            h hVar = (h) arrayList.get(i12);
                            if (hVar.f3920f) {
                                bVar.h(this, hVar, true);
                            } else {
                                bVar.i(this, this.f3899g[hVar.f3917c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z14 = true;
                    }
                }
                if (bVar.f3887a != null && bVar.f3890d.d() == 0) {
                    bVar.f3891e = true;
                    this.f3894b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f5 = bVar.f3888b;
            float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                bVar.f3888b = f5 * (-1.0f);
                a aVar = bVar.f3890d;
                int i13 = aVar.f3884h;
                for (int i14 = 0; i13 != -1 && i14 < aVar.f3877a; i14++) {
                    float[] fArr = aVar.f3883g;
                    fArr[i13] = fArr[i13] * (-1.0f);
                    i13 = aVar.f3882f[i13];
                }
            }
            int iD2 = bVar.f3890d.d();
            float f12 = 0.0f;
            float f13 = 0.0f;
            h hVar2 = null;
            h hVar3 = null;
            int i15 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i15 < iD2) {
                float f14 = bVar.f3890d.f(i15);
                h hVarE2 = bVar.f3890d.e(i15);
                float f15 = f11;
                if (hVarE2.K == g.UNRESTRICTED) {
                    if (hVar2 == null) {
                        if (hVarE2.N <= 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        hVar2 = hVarE2;
                        f12 = f14;
                    } else {
                        if (f12 > f14) {
                            if (hVarE2.N > 1) {
                                z15 = false;
                            }
                            hVar2 = hVarE2;
                            f12 = f14;
                        } else if (z15 || hVarE2.N > 1) {
                        }
                        z15 = true;
                        hVar2 = hVarE2;
                        f12 = f14;
                    }
                } else if (hVar2 == null && f14 < f15) {
                    if (hVar3 == null) {
                        if (hVarE2.N <= 1) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        hVar3 = hVarE2;
                        f13 = f14;
                    } else {
                        if (f13 > f14) {
                            if (hVarE2.N > 1) {
                                z16 = false;
                            }
                            hVar3 = hVarE2;
                            f13 = f14;
                        } else if (z16 || hVarE2.N > 1) {
                        }
                        z16 = true;
                        hVar3 = hVarE2;
                        f13 = f14;
                    }
                }
                i15++;
                f11 = f15;
            }
            float f16 = f11;
            if (hVar2 == null) {
                hVar2 = hVar3;
            }
            if (hVar2 == null) {
                z12 = true;
            } else {
                bVar.g(hVar2);
                z12 = false;
            }
            if (bVar.f3890d.d() == 0) {
                bVar.f3891e = true;
            }
            if (z12) {
                if (this.f3902j + 1 >= this.f3898f) {
                    o();
                }
                h hVarA = a(g.SLACK);
                int i16 = this.f3895c + 1;
                this.f3895c = i16;
                this.f3902j++;
                hVarA.f3916b = i16;
                xq.c cVar = this.m;
                ((h[]) cVar.f56176d)[i16] = hVarA;
                bVar.f3887a = hVarA;
                int i17 = this.f3903k;
                h(bVar);
                if (this.f3903k == i17 + 1) {
                    b bVar2 = this.f3907p;
                    bVar2.f3887a = null;
                    bVar2.f3890d.b();
                    for (int i18 = 0; i18 < bVar.f3890d.d(); i18++) {
                        bVar2.f3890d.a(bVar.f3890d.e(i18), bVar.f3890d.f(i18), true);
                    }
                    r(this.f3907p);
                    if (hVarA.f3917c == -1) {
                        if (bVar.f3887a == hVarA && (hVarF = bVar.f(null, hVarA)) != null) {
                            bVar.g(hVarF);
                        }
                        if (!bVar.f3891e) {
                            bVar.f3887a.f(this, bVar);
                        }
                        ((d) cVar.f56174b).a(bVar);
                        this.f3903k--;
                    }
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            h hVar4 = bVar.f3887a;
            if (hVar4 == null) {
                return;
            }
            if (hVar4.K != g.UNRESTRICTED && bVar.f3888b < f16) {
                return;
            } else {
                z11 = z13;
            }
        }
        if (z11) {
            return;
        }
        h(bVar);
    }

    public final void d(h hVar, int i11) {
        int i12 = hVar.f3917c;
        if (i12 == -1) {
            hVar.e(this, i11);
            for (int i13 = 0; i13 < this.f3895c + 1; i13++) {
                h hVar2 = ((h[]) this.m.f56176d)[i13];
            }
            return;
        }
        if (i12 == -1) {
            b bVarL = l();
            bVarL.f3887a = hVar;
            float f5 = i11;
            hVar.f3919e = f5;
            bVarL.f3888b = f5;
            bVarL.f3891e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f3899g[i12];
        if (bVar.f3891e) {
            bVar.f3888b = i11;
            return;
        }
        if (bVar.f3890d.d() == 0) {
            bVar.f3891e = true;
            bVar.f3888b = i11;
            return;
        }
        b bVarL2 = l();
        if (i11 < 0) {
            bVarL2.f3888b = i11 * (-1);
            bVarL2.f3890d.g(hVar, 1.0f);
        } else {
            bVarL2.f3888b = i11;
            bVarL2.f3890d.g(hVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(h hVar, h hVar2, int i11, int i12) {
        if (i12 == 8 && hVar2.f3920f && hVar.f3917c == -1) {
            hVar.e(this, hVar2.f3919e + i11);
            return;
        }
        b bVarL = l();
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            bVarL.f3888b = i11;
        }
        if (z11) {
            bVarL.f3890d.g(hVar, 1.0f);
            bVarL.f3890d.g(hVar2, -1.0f);
        } else {
            bVarL.f3890d.g(hVar, -1.0f);
            bVarL.f3890d.g(hVar2, 1.0f);
        }
        if (i12 != 8) {
            bVarL.a(this, i12);
        }
        c(bVarL);
    }

    public final void f(h hVar, h hVar2, int i11, int i12) {
        b bVarL = l();
        h hVarM = m();
        hVarM.f3918d = 0;
        bVarL.b(hVar, hVar2, hVarM, i11);
        if (i12 != 8) {
            bVarL.f3890d.g(j(i12), (int) (bVarL.f3890d.c(hVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(h hVar, h hVar2, int i11, int i12) {
        b bVarL = l();
        h hVarM = m();
        hVarM.f3918d = 0;
        bVarL.c(hVar, hVar2, hVarM, i11);
        if (i12 != 8) {
            bVarL.f3890d.g(j(i12), (int) (bVarL.f3890d.c(hVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i11;
        if (bVar.f3891e) {
            bVar.f3887a.e(this, bVar.f3888b);
        } else {
            b[] bVarArr = this.f3899g;
            int i12 = this.f3903k;
            bVarArr[i12] = bVar;
            h hVar = bVar.f3887a;
            hVar.f3917c = i12;
            this.f3903k = i12 + 1;
            hVar.f(this, bVar);
        }
        if (this.f3894b) {
            int i13 = 0;
            while (i13 < this.f3903k) {
                if (this.f3899g[i13] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f3899g[i13];
                if (bVar2 != null && bVar2.f3891e) {
                    bVar2.f3887a.e(this, bVar2.f3888b);
                    ((d) this.m.f56174b).a(bVar2);
                    this.f3899g[i13] = null;
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        i11 = this.f3903k;
                        if (i14 >= i11) {
                            break;
                        }
                        b[] bVarArr2 = this.f3899g;
                        int i16 = i14 - 1;
                        b bVar3 = bVarArr2[i14];
                        bVarArr2[i16] = bVar3;
                        h hVar2 = bVar3.f3887a;
                        if (hVar2.f3917c == i14) {
                            hVar2.f3917c = i16;
                        }
                        i15 = i14;
                        i14++;
                    }
                    if (i15 < i11) {
                        this.f3899g[i15] = null;
                    }
                    this.f3903k = i11 - 1;
                    i13--;
                }
                i13++;
            }
            this.f3894b = false;
        }
    }

    public final void i() {
        for (int i11 = 0; i11 < this.f3903k; i11++) {
            b bVar = this.f3899g[i11];
            bVar.f3887a.f3919e = bVar.f3888b;
        }
    }

    public final h j(int i11) {
        if (this.f3902j + 1 >= this.f3898f) {
            o();
        }
        h hVarA = a(g.ERROR);
        float[] fArr = hVarA.H;
        int i12 = this.f3895c + 1;
        this.f3895c = i12;
        this.f3902j++;
        hVarA.f3916b = i12;
        hVarA.f3918d = i11;
        ((h[]) this.m.f56176d)[i12] = hVarA;
        f fVar = this.f3896d;
        fVar.f3914i.f44822b = hVarA;
        Arrays.fill(fArr, CropImageView.DEFAULT_ASPECT_RATIO);
        fArr[hVarA.f3918d] = 1.0f;
        fVar.j(hVarA);
        return hVarA;
    }

    public final h k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f3902j + 1 >= this.f3898f) {
            o();
        }
        if (!(obj instanceof d4.d)) {
            return null;
        }
        d4.d dVar = (d4.d) obj;
        h hVar = dVar.f23114i;
        if (hVar == null) {
            dVar.k();
            hVar = dVar.f23114i;
        }
        int i11 = hVar.f3916b;
        xq.c cVar = this.m;
        if (i11 != -1 && i11 <= this.f3895c && ((h[]) cVar.f56176d)[i11] != null) {
            return hVar;
        }
        if (i11 != -1) {
            hVar.c();
        }
        int i12 = this.f3895c + 1;
        this.f3895c = i12;
        this.f3902j++;
        hVar.f3916b = i12;
        hVar.K = g.UNRESTRICTED;
        ((h[]) cVar.f56176d)[i12] = hVar;
        return hVar;
    }

    public final b l() {
        Object obj;
        xq.c cVar = this.m;
        d dVar = (d) cVar.f56174b;
        int i11 = dVar.f3909b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            Object[] objArr = dVar.f3908a;
            obj = objArr[i12];
            objArr[i12] = null;
            dVar.f3909b = i12;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(cVar);
        }
        bVar.f3887a = null;
        bVar.f3890d.b();
        bVar.f3888b = CropImageView.DEFAULT_ASPECT_RATIO;
        bVar.f3891e = false;
        return bVar;
    }

    public final h m() {
        if (this.f3902j + 1 >= this.f3898f) {
            o();
        }
        h hVarA = a(g.SLACK);
        int i11 = this.f3895c + 1;
        this.f3895c = i11;
        this.f3902j++;
        hVarA.f3916b = i11;
        ((h[]) this.m.f56176d)[i11] = hVarA;
        return hVarA;
    }

    public final void o() {
        int i11 = this.f3897e * 2;
        this.f3897e = i11;
        this.f3899g = (b[]) Arrays.copyOf(this.f3899g, i11);
        xq.c cVar = this.m;
        cVar.f56176d = (h[]) Arrays.copyOf((h[]) cVar.f56176d, this.f3897e);
        int i12 = this.f3897e;
        this.f3901i = new boolean[i12];
        this.f3898f = i12;
        this.f3904l = i12;
    }

    public final void p() {
        f fVar = this.f3896d;
        if (fVar.e()) {
            i();
            return;
        }
        if (!this.f3900h) {
            q(fVar);
            return;
        }
        for (int i11 = 0; i11 < this.f3903k; i11++) {
            if (!this.f3899g[i11].f3891e) {
                q(fVar);
                return;
            }
        }
        i();
    }

    public final void q(f fVar) {
        for (int i11 = 0; i11 < this.f3903k; i11++) {
            b bVar = this.f3899g[i11];
            if (bVar.f3887a.K != g.UNRESTRICTED) {
                float f5 = bVar.f3888b;
                float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    boolean z11 = false;
                    int i12 = 0;
                    while (!z11) {
                        i12++;
                        float f12 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < this.f3903k) {
                            b bVar2 = this.f3899g[i15];
                            if (bVar2.f3887a.K != g.UNRESTRICTED && !bVar2.f3891e && bVar2.f3888b < f11) {
                                int iD = bVar2.f3890d.d();
                                int i17 = 0;
                                while (i17 < iD) {
                                    h hVarE = bVar2.f3890d.e(i17);
                                    float fC = bVar2.f3890d.c(hVarE);
                                    if (fC > f11) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f13 = hVarE.f3921t[i18] / fC;
                                            if ((f13 < f12 && i18 == i16) || i18 > i16) {
                                                i16 = i18;
                                                i14 = hVarE.f3916b;
                                                i13 = i15;
                                                f12 = f13;
                                            }
                                        }
                                    }
                                    i17++;
                                    f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                                }
                            }
                            i15++;
                            f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                        }
                        if (i13 != -1) {
                            b bVar3 = this.f3899g[i13];
                            bVar3.f3887a.f3917c = -1;
                            bVar3.g(((h[]) this.m.f56176d)[i14]);
                            h hVar = bVar3.f3887a;
                            hVar.f3917c = i13;
                            hVar.f(this, bVar3);
                        } else {
                            z11 = true;
                        }
                        if (i12 > this.f3902j / 2) {
                            z11 = true;
                        }
                        f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    break;
                }
            }
        }
        r(fVar);
        i();
    }

    public final void r(b bVar) {
        boolean z11;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f3902j; i12++) {
            this.f3901i[i12] = false;
        }
        boolean z12 = false;
        int i13 = 0;
        while (!z12) {
            i13++;
            if (i13 >= this.f3902j * 2) {
                return;
            }
            h hVar = bVar.f3887a;
            if (hVar != null) {
                this.f3901i[hVar.f3916b] = true;
            }
            h hVarD = bVar.d(this.f3901i);
            if (hVarD != null) {
                boolean[] zArr = this.f3901i;
                int i14 = hVarD.f3916b;
                if (zArr[i14]) {
                    return;
                } else {
                    zArr[i14] = true;
                }
            }
            if (hVarD != null) {
                float f5 = Float.MAX_VALUE;
                int i15 = -1;
                for (int i16 = i11; i16 < this.f3903k; i16++) {
                    b bVar2 = this.f3899g[i16];
                    if (bVar2.f3887a.K != g.UNRESTRICTED && !bVar2.f3891e) {
                        a aVar = bVar2.f3890d;
                        int i17 = aVar.f3884h;
                        if (i17 == -1) {
                            z11 = false;
                            break;
                        }
                        int i18 = 0;
                        while (true) {
                            if (i17 == -1 || i18 >= aVar.f3877a) {
                                z11 = false;
                                break;
                            } else if (aVar.f3881e[i17] == hVarD.f3916b) {
                                z11 = true;
                                break;
                            } else {
                                i17 = aVar.f3882f[i17];
                                i18++;
                            }
                        }
                        if (z11) {
                            float fC = bVar2.f3890d.c(hVarD);
                            if (fC < CropImageView.DEFAULT_ASPECT_RATIO) {
                                float f11 = (-bVar2.f3888b) / fC;
                                if (f11 < f5) {
                                    i15 = i16;
                                    f5 = f11;
                                }
                            }
                        }
                    }
                }
                if (i15 > -1) {
                    b bVar3 = this.f3899g[i15];
                    bVar3.f3887a.f3917c = -1;
                    bVar3.g(hVarD);
                    h hVar2 = bVar3.f3887a;
                    hVar2.f3917c = i15;
                    hVar2.f(this, bVar3);
                }
            } else {
                z12 = true;
            }
            i11 = 0;
        }
    }

    public final void s() {
        for (int i11 = 0; i11 < this.f3903k; i11++) {
            b bVar = this.f3899g[i11];
            if (bVar != null) {
                ((d) this.m.f56174b).a(bVar);
            }
            this.f3899g[i11] = null;
        }
    }

    public final void t() {
        xq.c cVar;
        int i11 = 0;
        while (true) {
            cVar = this.m;
            h[] hVarArr = (h[]) cVar.f56176d;
            if (i11 >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[i11];
            if (hVar != null) {
                hVar.c();
            }
            i11++;
        }
        d dVar = (d) cVar.f56175c;
        h[] hVarArr2 = this.f3905n;
        int length = this.f3906o;
        dVar.getClass();
        if (length > hVarArr2.length) {
            length = hVarArr2.length;
        }
        for (int i12 = 0; i12 < length; i12++) {
            h hVar2 = hVarArr2[i12];
            int i13 = dVar.f3909b;
            Object[] objArr = dVar.f3908a;
            if (i13 < objArr.length) {
                objArr[i13] = hVar2;
                dVar.f3909b = i13 + 1;
            }
        }
        this.f3906o = 0;
        Arrays.fill((h[]) cVar.f56176d, (Object) null);
        this.f3895c = 0;
        f fVar = this.f3896d;
        fVar.f3913h = 0;
        fVar.f3888b = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f3902j = 1;
        for (int i14 = 0; i14 < this.f3903k; i14++) {
            b bVar = this.f3899g[i14];
        }
        s();
        this.f3903k = 0;
        this.f3907p = new b(cVar);
    }
}
