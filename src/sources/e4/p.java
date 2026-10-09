package e4;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f24817k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f24818l;

    @Override // e4.d
    public final void a(d dVar) {
        float f5;
        float f11;
        float f12;
        int i11;
        if (o.f24816a[this.f24835j.ordinal()] == 3) {
            d4.g gVar = this.f24827b;
            l(gVar.K, gVar.M, 1);
            return;
        }
        h hVar = this.f24830e;
        if (hVar.f24801c && !hVar.f24808j && this.f24829d == d4.f.MATCH_CONSTRAINT) {
            d4.g gVar2 = this.f24827b;
            int i12 = gVar2.f23151s;
            if (i12 == 2) {
                d4.g gVar3 = gVar2.V;
                if (gVar3 != null) {
                    h hVar2 = gVar3.f23124e.f24830e;
                    if (hVar2.f24808j) {
                        hVar.d((int) ((hVar2.f24805g * gVar2.f23160z) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                h hVar3 = gVar2.f23122d.f24830e;
                if (hVar3.f24808j) {
                    int i13 = gVar2.Z;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f12 = hVar3.f24805g * gVar2.Y;
                            i11 = (int) (f12 + 0.5f);
                        } else if (i13 != 1) {
                            i11 = 0;
                        } else {
                            f5 = hVar3.f24805g;
                            f11 = gVar2.Y;
                        }
                        hVar.d(i11);
                    } else {
                        f5 = hVar3.f24805g;
                        f11 = gVar2.Y;
                    }
                    f12 = f5 / f11;
                    i11 = (int) (f12 + 0.5f);
                    hVar.d(i11);
                }
            }
        }
        g gVar4 = this.f24833h;
        boolean z11 = gVar4.f24801c;
        ArrayList arrayList = gVar4.f24810l;
        if (z11) {
            g gVar5 = this.f24834i;
            boolean z12 = gVar5.f24801c;
            ArrayList arrayList2 = gVar5.f24810l;
            if (z12) {
                if (gVar4.f24808j && gVar5.f24808j && hVar.f24808j) {
                    return;
                }
                if (!hVar.f24808j && this.f24829d == d4.f.MATCH_CONSTRAINT) {
                    d4.g gVar6 = this.f24827b;
                    if (gVar6.f23149r == 0 && !gVar6.z()) {
                        g gVar7 = (g) arrayList.get(0);
                        g gVar8 = (g) arrayList2.get(0);
                        int i14 = gVar7.f24805g + gVar4.f24804f;
                        int i15 = gVar8.f24805g + gVar5.f24804f;
                        gVar4.d(i14);
                        gVar5.d(i15);
                        hVar.d(i15 - i14);
                        return;
                    }
                }
                if (!hVar.f24808j && this.f24829d == d4.f.MATCH_CONSTRAINT && this.f24826a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    g gVar9 = (g) arrayList.get(0);
                    int i16 = (((g) arrayList2.get(0)).f24805g + gVar5.f24804f) - (gVar9.f24805g + gVar4.f24804f);
                    int i17 = hVar.m;
                    if (i16 < i17) {
                        hVar.d(i16);
                    } else {
                        hVar.d(i17);
                    }
                }
                if (hVar.f24808j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    g gVar10 = (g) arrayList.get(0);
                    g gVar11 = (g) arrayList2.get(0);
                    int i18 = gVar10.f24805g;
                    int i19 = gVar4.f24804f + i18;
                    int i21 = gVar11.f24805g;
                    int i22 = gVar5.f24804f + i21;
                    float f13 = this.f24827b.f23129g0;
                    if (gVar10 == gVar11) {
                        f13 = 0.5f;
                    } else {
                        i18 = i19;
                        i21 = i22;
                    }
                    gVar4.d((int) ((((i21 - i18) - hVar.f24805g) * f13) + i18 + 0.5f));
                    gVar5.d(gVar4.f24805g + hVar.f24805g);
                }
            }
        }
    }

    @Override // e4.t
    public final void d() {
        d4.g gVar;
        d4.g gVar2;
        d4.g gVar3;
        d4.g gVar4;
        g gVar5 = this.f24817k;
        d4.g gVar6 = this.f24827b;
        boolean z11 = gVar6.f23116a;
        h hVar = this.f24830e;
        if (z11) {
            hVar.d(gVar6.l());
        }
        boolean z12 = hVar.f24808j;
        ArrayList arrayList = hVar.f24809k;
        ArrayList arrayList2 = hVar.f24810l;
        g gVar7 = this.f24834i;
        g gVar8 = this.f24833h;
        if (!z12) {
            d4.g gVar9 = this.f24827b;
            this.f24829d = gVar9.U[1];
            if (gVar9.E) {
                this.f24818l = new a(this);
            }
            d4.f fVar = this.f24829d;
            if (fVar != d4.f.MATCH_CONSTRAINT) {
                if (fVar == d4.f.MATCH_PARENT && (gVar4 = this.f24827b.V) != null && gVar4.U[1] == d4.f.FIXED) {
                    int iL = (gVar4.l() - this.f24827b.K.e()) - this.f24827b.M.e();
                    t.b(gVar8, gVar4.f23124e.f24833h, this.f24827b.K.e());
                    t.b(gVar7, gVar4.f23124e.f24834i, -this.f24827b.M.e());
                    hVar.d(iL);
                    return;
                }
                if (fVar == d4.f.FIXED) {
                    hVar.d(this.f24827b.l());
                }
            }
        } else if (this.f24829d == d4.f.MATCH_PARENT && (gVar2 = (gVar = this.f24827b).V) != null && gVar2.U[1] == d4.f.FIXED) {
            t.b(gVar8, gVar2.f23124e.f24833h, gVar.K.e());
            t.b(gVar7, gVar2.f23124e.f24834i, -this.f24827b.M.e());
            return;
        }
        boolean z13 = hVar.f24808j;
        if (z13) {
            d4.g gVar10 = this.f24827b;
            if (gVar10.f23116a) {
                d4.d[] dVarArr = gVar10.R;
                d4.d dVar = dVarArr[2];
                d4.d dVar2 = dVar.f23111f;
                if (dVar2 != null && dVarArr[3].f23111f != null) {
                    if (gVar10.z()) {
                        gVar8.f24804f = this.f24827b.R[2].e();
                        gVar7.f24804f = -this.f24827b.R[3].e();
                    } else {
                        g gVarH = t.h(this.f24827b.R[2]);
                        if (gVarH != null) {
                            t.b(gVar8, gVarH, this.f24827b.R[2].e());
                        }
                        g gVarH2 = t.h(this.f24827b.R[3]);
                        if (gVarH2 != null) {
                            t.b(gVar7, gVarH2, -this.f24827b.R[3].e());
                        }
                        gVar8.f24800b = true;
                        gVar7.f24800b = true;
                    }
                    d4.g gVar11 = this.f24827b;
                    if (gVar11.E) {
                        t.b(gVar5, gVar8, gVar11.f23121c0);
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    g gVarH3 = t.h(dVar);
                    if (gVarH3 != null) {
                        t.b(gVar8, gVarH3, this.f24827b.R[2].e());
                        t.b(gVar7, gVar8, hVar.f24805g);
                        d4.g gVar12 = this.f24827b;
                        if (gVar12.E) {
                            t.b(gVar5, gVar8, gVar12.f23121c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                d4.d dVar3 = dVarArr[3];
                if (dVar3.f23111f != null) {
                    g gVarH4 = t.h(dVar3);
                    if (gVarH4 != null) {
                        t.b(gVar7, gVarH4, -this.f24827b.R[3].e());
                        t.b(gVar8, gVar7, -hVar.f24805g);
                    }
                    d4.g gVar13 = this.f24827b;
                    if (gVar13.E) {
                        t.b(gVar5, gVar8, gVar13.f23121c0);
                        return;
                    }
                    return;
                }
                d4.d dVar4 = dVarArr[4];
                if (dVar4.f23111f != null) {
                    g gVarH5 = t.h(dVar4);
                    if (gVarH5 != null) {
                        t.b(gVar5, gVarH5, 0);
                        t.b(gVar8, gVar5, -this.f24827b.f23121c0);
                        t.b(gVar7, gVar8, hVar.f24805g);
                        return;
                    }
                    return;
                }
                if ((gVar10 instanceof d4.m) || gVar10.V == null || gVar10.j(d4.c.CENTER).f23111f != null) {
                    return;
                }
                d4.g gVar14 = this.f24827b;
                t.b(gVar8, gVar14.V.f23124e.f24833h, gVar14.t());
                t.b(gVar7, gVar8, hVar.f24805g);
                d4.g gVar15 = this.f24827b;
                if (gVar15.E) {
                    t.b(gVar5, gVar8, gVar15.f23121c0);
                    return;
                }
                return;
            }
        }
        if (z13 || this.f24829d != d4.f.MATCH_CONSTRAINT) {
            hVar.b(this);
        } else {
            d4.g gVar16 = this.f24827b;
            int i11 = gVar16.f23151s;
            if (i11 == 2) {
                d4.g gVar17 = gVar16.V;
                if (gVar17 != null) {
                    h hVar2 = gVar17.f23124e.f24830e;
                    arrayList2.add(hVar2);
                    hVar2.f24809k.add(hVar);
                    hVar.f24800b = true;
                    arrayList.add(gVar8);
                    arrayList.add(gVar7);
                }
            } else if (i11 == 3 && !gVar16.z()) {
                d4.g gVar18 = this.f24827b;
                if (gVar18.f23149r != 3) {
                    h hVar3 = gVar18.f23122d.f24830e;
                    arrayList2.add(hVar3);
                    hVar3.f24809k.add(hVar);
                    hVar.f24800b = true;
                    arrayList.add(gVar8);
                    arrayList.add(gVar7);
                }
            }
        }
        d4.g gVar19 = this.f24827b;
        d4.d[] dVarArr2 = gVar19.R;
        d4.d dVar5 = dVarArr2[2];
        d4.d dVar6 = dVar5.f23111f;
        if (dVar6 != null && dVarArr2[3].f23111f != null) {
            if (gVar19.z()) {
                gVar8.f24804f = this.f24827b.R[2].e();
                gVar7.f24804f = -this.f24827b.R[3].e();
            } else {
                g gVarH6 = t.h(this.f24827b.R[2]);
                g gVarH7 = t.h(this.f24827b.R[3]);
                if (gVarH6 != null) {
                    gVarH6.b(this);
                }
                if (gVarH7 != null) {
                    gVarH7.b(this);
                }
                this.f24835j = s.CENTER;
            }
            if (this.f24827b.E) {
                c(gVar5, gVar8, 1, this.f24818l);
            }
        } else if (dVar6 != null) {
            g gVarH8 = t.h(dVar5);
            if (gVarH8 != null) {
                t.b(gVar8, gVarH8, this.f24827b.R[2].e());
                c(gVar7, gVar8, 1, hVar);
                if (this.f24827b.E) {
                    c(gVar5, gVar8, 1, this.f24818l);
                }
                d4.f fVar2 = this.f24829d;
                d4.f fVar3 = d4.f.MATCH_CONSTRAINT;
                if (fVar2 == fVar3) {
                    d4.g gVar20 = this.f24827b;
                    if (gVar20.Y > CropImageView.DEFAULT_ASPECT_RATIO) {
                        m mVar = gVar20.f23122d;
                        if (mVar.f24829d == fVar3) {
                            mVar.f24830e.f24809k.add(hVar);
                            arrayList2.add(this.f24827b.f23122d.f24830e);
                            hVar.f24799a = this;
                        }
                    }
                }
            }
        } else {
            d4.d dVar7 = dVarArr2[3];
            if (dVar7.f23111f != null) {
                g gVarH9 = t.h(dVar7);
                if (gVarH9 != null) {
                    t.b(gVar7, gVarH9, -this.f24827b.R[3].e());
                    c(gVar8, gVar7, -1, hVar);
                    if (this.f24827b.E) {
                        c(gVar5, gVar8, 1, this.f24818l);
                    }
                }
            } else {
                d4.d dVar8 = dVarArr2[4];
                if (dVar8.f23111f != null) {
                    g gVarH10 = t.h(dVar8);
                    if (gVarH10 != null) {
                        t.b(gVar5, gVarH10, 0);
                        c(gVar8, gVar5, -1, this.f24818l);
                        c(gVar7, gVar8, 1, hVar);
                    }
                } else if (!(gVar19 instanceof d4.m) && (gVar3 = gVar19.V) != null) {
                    t.b(gVar8, gVar3.f23124e.f24833h, gVar19.t());
                    c(gVar7, gVar8, 1, hVar);
                    if (this.f24827b.E) {
                        c(gVar5, gVar8, 1, this.f24818l);
                    }
                    d4.f fVar4 = this.f24829d;
                    d4.f fVar5 = d4.f.MATCH_CONSTRAINT;
                    if (fVar4 == fVar5) {
                        d4.g gVar21 = this.f24827b;
                        if (gVar21.Y > CropImageView.DEFAULT_ASPECT_RATIO) {
                            m mVar2 = gVar21.f23122d;
                            if (mVar2.f24829d == fVar5) {
                                mVar2.f24830e.f24809k.add(hVar);
                                arrayList2.add(this.f24827b.f23122d.f24830e);
                                hVar.f24799a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            hVar.f24801c = true;
        }
    }

    @Override // e4.t
    public final void e() {
        g gVar = this.f24833h;
        if (gVar.f24808j) {
            this.f24827b.f23119b0 = gVar.f24805g;
        }
    }

    @Override // e4.t
    public final void f() {
        this.f24828c = null;
        this.f24833h.c();
        this.f24834i.c();
        this.f24817k.c();
        this.f24830e.c();
        this.f24832g = false;
    }

    @Override // e4.t
    public final boolean k() {
        return this.f24829d != d4.f.MATCH_CONSTRAINT || this.f24827b.f23151s == 0;
    }

    public final void m() {
        this.f24832g = false;
        g gVar = this.f24833h;
        gVar.c();
        gVar.f24808j = false;
        g gVar2 = this.f24834i;
        gVar2.c();
        gVar2.f24808j = false;
        g gVar3 = this.f24817k;
        gVar3.c();
        gVar3.f24808j = false;
        this.f24830e.f24808j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f24827b.f23137k0;
    }
}
