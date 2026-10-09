package e4;

import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import m00.a0;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24790a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f24793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f24794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Serializable f24795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f24796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f24797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f24798i;

    public /* synthetic */ e() {
    }

    public void a(g gVar, int i11, ArrayList arrayList, n nVar) {
        t tVar = gVar.f24802d;
        n nVar2 = tVar.f24828c;
        g gVar2 = tVar.f24834i;
        g gVar3 = tVar.f24833h;
        if (nVar2 == null) {
            d4.h hVar = (d4.h) this.f24793d;
            if (tVar == hVar.f23122d || tVar == hVar.f23124e) {
                return;
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f24814a = null;
                nVar.f24815b = new ArrayList();
                nVar.f24814a = tVar;
                arrayList.add(nVar);
            }
            tVar.f24828c = nVar;
            nVar.f24815b.add(tVar);
            ArrayList arrayList2 = gVar3.f24809k;
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                d dVar = (d) obj;
                if (dVar instanceof g) {
                    a((g) dVar, i11, arrayList, nVar);
                }
            }
            ArrayList arrayList3 = gVar2.f24809k;
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList3.get(i14);
                i14++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof g) {
                    a((g) dVar2, i11, arrayList, nVar);
                }
            }
            if (i11 == 1 && (tVar instanceof p)) {
                ArrayList arrayList4 = ((p) tVar).f24817k.f24809k;
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = arrayList4.get(i15);
                    i15++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof g) {
                        a((g) dVar3, i11, arrayList, nVar);
                    }
                }
            }
            ArrayList arrayList5 = gVar3.f24810l;
            int size4 = arrayList5.size();
            int i16 = 0;
            while (i16 < size4) {
                Object obj4 = arrayList5.get(i16);
                i16++;
                a((g) obj4, i11, arrayList, nVar);
            }
            ArrayList arrayList6 = gVar2.f24810l;
            int size5 = arrayList6.size();
            int i17 = 0;
            while (i17 < size5) {
                Object obj5 = arrayList6.get(i17);
                i17++;
                a((g) obj5, i11, arrayList, nVar);
            }
            if (i11 == 1 && (tVar instanceof p)) {
                ArrayList arrayList7 = ((p) tVar).f24817k.f24810l;
                int size6 = arrayList7.size();
                while (i12 < size6) {
                    Object obj6 = arrayList7.get(i12);
                    i12++;
                    a((g) obj6, i11, arrayList, nVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    public void b(d4.h hVar) {
        float f5;
        ArrayList arrayList;
        d4.f fVar;
        d4.f fVar2;
        d4.f fVar3;
        d4.f fVar4;
        ArrayList arrayList2 = hVar.f23161u0;
        int size = arrayList2.size();
        char c11 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            d4.g gVar = (d4.g) obj;
            d4.f[] fVarArr = gVar.U;
            d4.d[] dVarArr = gVar.R;
            d4.d dVar = gVar.M;
            d4.d dVar2 = gVar.K;
            d4.d dVar3 = gVar.L;
            d4.d dVar4 = gVar.J;
            d4.f fVar5 = fVarArr[c11];
            d4.f fVar6 = fVarArr[1];
            if (gVar.f23133i0 == 8) {
                gVar.f23116a = true;
            } else {
                float f11 = gVar.f23157w;
                char c12 = c11;
                if (f11 < 1.0f) {
                    f5 = 1.0f;
                    if (fVar5 == d4.f.MATCH_CONSTRAINT) {
                        gVar.f23149r = 2;
                    }
                } else {
                    f5 = 1.0f;
                }
                float f12 = gVar.f23160z;
                if (f12 < f5 && fVar6 == d4.f.MATCH_CONSTRAINT) {
                    gVar.f23151s = 2;
                }
                if (gVar.Y > CropImageView.DEFAULT_ASPECT_RATIO) {
                    d4.f fVar7 = d4.f.MATCH_CONSTRAINT;
                    if (fVar5 == fVar7 && (fVar6 == d4.f.WRAP_CONTENT || fVar6 == d4.f.FIXED)) {
                        gVar.f23149r = 3;
                    } else {
                        int i12 = 3;
                        if (fVar6 != fVar7) {
                            if (fVar5 == fVar7 && fVar6 == fVar7) {
                                if (gVar.f23149r == 0) {
                                    gVar.f23149r = i12;
                                }
                                if (gVar.f23151s == 0) {
                                    gVar.f23151s = i12;
                                }
                            }
                        } else if (fVar5 == d4.f.WRAP_CONTENT || fVar5 == d4.f.FIXED) {
                            gVar.f23151s = 3;
                        } else {
                            i12 = 3;
                            if (fVar5 == fVar7) {
                                if (gVar.f23149r == 0) {
                                    gVar.f23149r = i12;
                                }
                                if (gVar.f23151s == 0) {
                                    gVar.f23151s = i12;
                                }
                            }
                        }
                    }
                }
                d4.f fVar8 = d4.f.MATCH_CONSTRAINT;
                if (fVar5 == fVar8) {
                    arrayList = arrayList2;
                    if (gVar.f23149r == 1 && (dVar4.f23111f == null || dVar3.f23111f == null)) {
                        fVar5 = d4.f.WRAP_CONTENT;
                    }
                } else {
                    arrayList = arrayList2;
                }
                if (fVar6 == fVar8 && gVar.f23151s == 1 && (dVar2.f23111f == null || dVar.f23111f == null)) {
                    fVar6 = d4.f.WRAP_CONTENT;
                }
                m mVar = gVar.f23122d;
                mVar.f24829d = fVar5;
                int i13 = gVar.f23149r;
                mVar.f24826a = i13;
                p pVar = gVar.f23124e;
                pVar.f24829d = fVar6;
                int i14 = size;
                int i15 = gVar.f23151s;
                pVar.f24826a = i15;
                d4.f fVar9 = d4.f.MATCH_PARENT;
                if ((fVar5 == fVar9 || fVar5 == d4.f.FIXED || fVar5 == d4.f.WRAP_CONTENT) && (fVar6 == fVar9 || fVar6 == d4.f.FIXED || fVar6 == d4.f.WRAP_CONTENT)) {
                    int iR = gVar.r();
                    if (fVar5 == fVar9) {
                        iR = (hVar.r() - dVar4.f23112g) - dVar3.f23112g;
                        fVar5 = d4.f.FIXED;
                    }
                    int iL = gVar.l();
                    if (fVar6 == fVar9) {
                        iL = (hVar.l() - dVar2.f23112g) - dVar.f23112g;
                        fVar6 = d4.f.FIXED;
                    }
                    f(gVar, fVar5, iR, fVar6, iL);
                    gVar.f23122d.f24830e.d(gVar.r());
                    gVar.f23124e.f24830e.d(gVar.l());
                    gVar.f23116a = true;
                } else {
                    if (fVar5 != fVar8 || (fVar6 != (fVar4 = d4.f.WRAP_CONTENT) && fVar6 != d4.f.FIXED)) {
                        fVar = fVar6;
                    } else if (i13 == 3) {
                        if (fVar6 == fVar4) {
                            f(gVar, fVar4, 0, fVar4, 0);
                        }
                        int iL2 = gVar.l();
                        int i16 = (int) ((iL2 * gVar.Y) + 0.5f);
                        d4.f fVar10 = d4.f.FIXED;
                        f(gVar, fVar10, i16, fVar10, iL2);
                        gVar.f23122d.f24830e.d(gVar.r());
                        gVar.f23124e.f24830e.d(gVar.l());
                        gVar.f23116a = true;
                    } else if (i13 == 1) {
                        f(gVar, fVar4, 0, fVar6, 0);
                        gVar.f23122d.f24830e.m = gVar.r();
                    } else {
                        fVar = fVar6;
                        if (i13 == 2) {
                            d4.f fVar11 = hVar.U[c12];
                            d4.f fVar12 = d4.f.FIXED;
                            if (fVar11 == fVar12 || fVar11 == fVar9) {
                                f(gVar, fVar12, (int) ((f11 * hVar.r()) + 0.5f), fVar, gVar.l());
                                gVar.f23122d.f24830e.d(gVar.r());
                                gVar.f23124e.f24830e.d(gVar.l());
                                gVar.f23116a = true;
                            }
                        } else if (dVarArr[c12].f23111f == null || dVarArr[1].f23111f == null) {
                            f(gVar, fVar4, 0, fVar, 0);
                            gVar.f23122d.f24830e.d(gVar.r());
                            gVar.f23124e.f24830e.d(gVar.l());
                            gVar.f23116a = true;
                        }
                    }
                    if (fVar != fVar8 || (fVar5 != (fVar3 = d4.f.WRAP_CONTENT) && fVar5 != d4.f.FIXED)) {
                        fVar2 = fVar;
                    } else if (i15 == 3) {
                        if (fVar5 == fVar3) {
                            f(gVar, fVar3, 0, fVar3, 0);
                        }
                        int iR2 = gVar.r();
                        float f13 = gVar.Y;
                        if (gVar.Z == -1) {
                            f13 = f5 / f13;
                        }
                        d4.f fVar13 = d4.f.FIXED;
                        f(gVar, fVar13, iR2, fVar13, (int) ((iR2 * f13) + 0.5f));
                        gVar.f23122d.f24830e.d(gVar.r());
                        gVar.f23124e.f24830e.d(gVar.l());
                        gVar.f23116a = true;
                    } else if (i15 == 1) {
                        f(gVar, fVar5, 0, fVar3, 0);
                        gVar.f23124e.f24830e.m = gVar.l();
                    } else {
                        d4.f fVar14 = fVar5;
                        if (i15 == 2) {
                            d4.f fVar15 = hVar.U[1];
                            fVar2 = fVar;
                            d4.f fVar16 = d4.f.FIXED;
                            if (fVar15 == fVar16 || fVar15 == fVar9) {
                                f(gVar, fVar14, gVar.r(), fVar16, (int) ((f12 * hVar.l()) + 0.5f));
                                gVar.f23122d.f24830e.d(gVar.r());
                                gVar.f23124e.f24830e.d(gVar.l());
                                gVar.f23116a = true;
                            } else {
                                fVar5 = fVar14;
                            }
                        } else {
                            fVar5 = fVar14;
                            fVar2 = fVar;
                            if (dVarArr[2].f23111f == null || dVarArr[3].f23111f == null) {
                                f(gVar, fVar3, 0, fVar2, 0);
                                gVar.f23122d.f24830e.d(gVar.r());
                                gVar.f23124e.f24830e.d(gVar.l());
                                gVar.f23116a = true;
                            }
                        }
                    }
                    if (fVar5 == fVar8 && fVar2 == fVar8) {
                        if (i13 == 1 || i15 == 1) {
                            d4.f fVar17 = d4.f.WRAP_CONTENT;
                            f(gVar, fVar17, 0, fVar17, 0);
                            gVar.f23122d.f24830e.m = gVar.r();
                            gVar.f23124e.f24830e.m = gVar.l();
                        } else if (i15 == 2 && i13 == 2) {
                            d4.f[] fVarArr2 = hVar.U;
                            d4.f fVar18 = fVarArr2[c12];
                            d4.f fVar19 = d4.f.FIXED;
                            if (fVar18 == fVar19 && fVarArr2[1] == fVar19) {
                                f(gVar, fVar19, (int) ((f11 * hVar.r()) + 0.5f), fVar19, (int) ((f12 * hVar.l()) + 0.5f));
                                gVar.f23122d.f24830e.d(gVar.r());
                                gVar.f23124e.f24830e.d(gVar.l());
                                gVar.f23116a = true;
                            }
                        }
                    }
                }
                c11 = c12;
                arrayList2 = arrayList;
                size = i14;
                i11 = i11;
            }
        }
    }

    public void c() {
        d4.h hVar = (d4.h) this.f24793d;
        ArrayList arrayList = (ArrayList) this.f24796g;
        ArrayList arrayList2 = (ArrayList) this.f24795f;
        arrayList2.clear();
        d4.h hVar2 = (d4.h) this.f24794e;
        hVar2.f23122d.f();
        hVar2.f23124e.f();
        arrayList2.add(hVar2.f23122d);
        arrayList2.add(hVar2.f23124e);
        ArrayList arrayList3 = hVar2.f23161u0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList3.get(i11);
            i11++;
            d4.g gVar = (d4.g) obj;
            if (gVar instanceof d4.l) {
                j jVar = new j(gVar);
                gVar.f23122d.f();
                gVar.f23124e.f();
                jVar.f24831f = ((d4.l) gVar).f23193y0;
                arrayList2.add(jVar);
            } else {
                if (gVar.y()) {
                    if (gVar.f23118b == null) {
                        gVar.f23118b = new c(gVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gVar.f23118b);
                } else {
                    arrayList2.add(gVar.f23122d);
                }
                if (gVar.z()) {
                    if (gVar.f23120c == null) {
                        gVar.f23120c = new c(gVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gVar.f23120c);
                } else {
                    arrayList2.add(gVar.f23124e);
                }
                if (gVar instanceof d4.m) {
                    arrayList2.add(new k(gVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            ((t) obj2).f();
        }
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList2.get(i13);
            i13++;
            t tVar = (t) obj3;
            if (tVar.f24827b != hVar2) {
                tVar.d();
            }
        }
        arrayList.clear();
        e(hVar.f23122d, 0, arrayList);
        e(hVar.f23124e, 1, arrayList);
        this.f24791b = false;
    }

    public int d(d4.h hVar, int i11) {
        ArrayList arrayList;
        int i12;
        long j11;
        float f5;
        long j12;
        ArrayList arrayList2 = (ArrayList) this.f24796g;
        int size = arrayList2.size();
        long j13 = 0;
        int i13 = 0;
        long jMax = 0;
        while (i13 < size) {
            t tVar = ((n) arrayList2.get(i13)).f24814a;
            if (!(tVar instanceof c) ? !(i11 != 0 ? (tVar instanceof p) : (tVar instanceof m)) : ((c) tVar).f24831f != i11) {
                g gVar = (i11 == 0 ? hVar.f23122d : hVar.f23124e).f24833h;
                g gVar2 = (i11 == 0 ? hVar.f23122d : hVar.f23124e).f24834i;
                g gVar3 = tVar.f24833h;
                g gVar4 = tVar.f24834i;
                boolean zContains = gVar3.f24810l.contains(gVar);
                boolean zContains2 = gVar4.f24810l.contains(gVar2);
                long j14 = tVar.j();
                if (zContains && zContains2) {
                    long jB = n.b(gVar3, j13);
                    long jA = n.a(gVar4, j13);
                    long j15 = jB - j14;
                    int i14 = gVar4.f24804f;
                    arrayList = arrayList2;
                    i12 = size;
                    if (j15 >= (-i14)) {
                        j15 += (long) i14;
                    }
                    long j16 = gVar3.f24804f;
                    long j17 = ((-jA) - j14) - j16;
                    if (j17 >= j16) {
                        j17 -= j16;
                    }
                    d4.g gVar5 = tVar.f24827b;
                    if (i11 == 0) {
                        f5 = gVar5.f23127f0;
                    } else if (i11 == 1) {
                        f5 = gVar5.f23129g0;
                    } else {
                        gVar5.getClass();
                        f5 = -1.0f;
                    }
                    if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        j12 = (long) ((j15 / (1.0f - f5)) + (j17 / f5));
                    } else {
                        j12 = 0;
                    }
                    float f11 = j12;
                    j11 = (((long) gVar3.f24804f) + ((((long) ((f11 * f5) + 0.5f)) + j14) + ((long) p0.a(1.0f, f5, f11, 0.5f)))) - ((long) gVar4.f24804f);
                } else {
                    arrayList = arrayList2;
                    i12 = size;
                    if (zContains) {
                        j11 = Math.max(n.b(gVar3, gVar3.f24804f), ((long) gVar3.f24804f) + j14);
                    } else if (zContains2) {
                        j11 = Math.max(-n.a(gVar4, gVar4.f24804f), ((long) (-gVar4.f24804f)) + j14);
                    } else {
                        j11 = (tVar.j() + ((long) gVar3.f24804f)) - ((long) gVar4.f24804f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i12 = size;
                j11 = j13;
            }
            jMax = Math.max(jMax, j11);
            i13++;
            arrayList2 = arrayList;
            size = i12;
            j13 = 0;
        }
        return (int) jMax;
    }

    public void e(t tVar, int i11, ArrayList arrayList) {
        g gVar = tVar.f24833h;
        g gVar2 = tVar.f24834i;
        ArrayList arrayList2 = gVar.f24809k;
        int size = arrayList2.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            d dVar = (d) obj;
            if (dVar instanceof g) {
                a((g) dVar, i11, arrayList, null);
            } else if (dVar instanceof t) {
                a(((t) dVar).f24833h, i11, arrayList, null);
            }
        }
        ArrayList arrayList3 = gVar2.f24809k;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList3.get(i14);
            i14++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof g) {
                a((g) dVar2, i11, arrayList, null);
            } else if (dVar2 instanceof t) {
                a(((t) dVar2).f24834i, i11, arrayList, null);
            }
        }
        if (i11 == 1) {
            ArrayList arrayList4 = ((p) tVar).f24817k.f24809k;
            int size3 = arrayList4.size();
            while (i12 < size3) {
                Object obj3 = arrayList4.get(i12);
                i12++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof g) {
                    a((g) dVar3, i11, arrayList, null);
                }
            }
        }
    }

    public void f(d4.g gVar, d4.f fVar, int i11, d4.f fVar2, int i12) {
        b bVar = (b) this.f24798i;
        bVar.f24778a = fVar;
        bVar.f24779b = fVar2;
        bVar.f24780c = i11;
        bVar.f24781d = i12;
        ((j4.f) this.f24797h).b(gVar, bVar);
        gVar.P(bVar.f24782e);
        gVar.M(bVar.f24783f);
        gVar.E = bVar.f24785h;
        gVar.J(bVar.f24784g);
    }

    public void g() {
        a aVar;
        ArrayList arrayList = ((d4.h) this.f24793d).f23161u0;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            d4.g gVar = (d4.g) obj;
            if (!gVar.f23116a) {
                d4.f[] fVarArr = gVar.U;
                d4.f fVar = fVarArr[0];
                d4.f fVar2 = fVarArr[1];
                int i12 = gVar.f23149r;
                int i13 = gVar.f23151s;
                d4.f fVar3 = d4.f.WRAP_CONTENT;
                boolean z11 = fVar == fVar3 || (fVar == d4.f.MATCH_CONSTRAINT && i12 == 1);
                boolean z12 = fVar2 == fVar3 || (fVar2 == d4.f.MATCH_CONSTRAINT && i13 == 1);
                h hVar = gVar.f23122d.f24830e;
                boolean z13 = hVar.f24808j;
                h hVar2 = gVar.f23124e.f24830e;
                boolean z14 = hVar2.f24808j;
                if (z13 && z14) {
                    d4.f fVar4 = d4.f.FIXED;
                    f(gVar, fVar4, hVar.f24805g, fVar4, hVar2.f24805g);
                    gVar.f23116a = true;
                } else if (z13 && z12) {
                    f(gVar, d4.f.FIXED, hVar.f24805g, fVar3, hVar2.f24805g);
                    if (fVar2 == d4.f.MATCH_CONSTRAINT) {
                        gVar.f23124e.f24830e.m = gVar.l();
                    } else {
                        gVar.f23124e.f24830e.d(gVar.l());
                        gVar.f23116a = true;
                    }
                } else if (z14 && z11) {
                    f(gVar, fVar3, hVar.f24805g, d4.f.FIXED, hVar2.f24805g);
                    if (fVar == d4.f.MATCH_CONSTRAINT) {
                        gVar.f23122d.f24830e.m = gVar.r();
                    } else {
                        gVar.f23122d.f24830e.d(gVar.r());
                        gVar.f23116a = true;
                    }
                }
                if (gVar.f23116a && (aVar = gVar.f23124e.f24818l) != null) {
                    aVar.d(gVar.f23121c0);
                }
            }
        }
    }

    public String toString() {
        switch (this.f24790a) {
            case 1:
                Map map = (Map) this.f24798i;
                Long l9 = (Long) this.f24797h;
                Long l11 = (Long) this.f24796g;
                Long l12 = (Long) this.f24795f;
                Long l13 = (Long) this.f24794e;
                ArrayList arrayList = new ArrayList();
                if (this.f24791b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f24792c) {
                    arrayList.add("isDirectory");
                }
                if (l13 != null) {
                    arrayList.add("byteCount=" + l13);
                }
                if (l12 != null) {
                    arrayList.add("createdAt=" + l12);
                }
                if (l11 != null) {
                    arrayList.add("lastModifiedAt=" + l11);
                }
                if (l9 != null) {
                    arrayList.add("lastAccessedAt=" + l9);
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return ry.m.y0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public e(boolean z11, boolean z12, a0 a0Var, Long l9, Long l11, Long l12, Long l13, Map extras) {
        kotlin.jvm.internal.m.f(extras, "extras");
        this.f24791b = z11;
        this.f24792c = z12;
        this.f24793d = a0Var;
        this.f24794e = l9;
        this.f24795f = l11;
        this.f24796g = l12;
        this.f24797h = l13;
        this.f24798i = x.h0(extras);
    }

    public /* synthetic */ e(boolean z11, boolean z12, a0 a0Var, Long l9, Long l11, Long l12, Long l13) {
        this(z11, z12, a0Var, l9, l11, l12, l13, ry.s.f50855a);
    }
}
