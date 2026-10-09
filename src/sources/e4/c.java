package e4;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f24788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24789l;

    public c(d4.g gVar, int i11) {
        d4.g gVar2;
        super(gVar);
        ArrayList arrayList = new ArrayList();
        this.f24788k = arrayList;
        this.f24831f = i11;
        d4.g gVar3 = this.f24827b;
        d4.g gVarN = gVar3.n(i11);
        while (true) {
            gVar2 = gVar3;
            gVar3 = gVarN;
            if (gVar3 == null) {
                break;
            } else {
                gVarN = gVar3.n(this.f24831f);
            }
        }
        this.f24827b = gVar2;
        int i12 = this.f24831f;
        arrayList.add(i12 == 0 ? gVar2.f23122d : i12 == 1 ? gVar2.f23124e : null);
        d4.g gVarM = gVar2.m(this.f24831f);
        while (gVarM != null) {
            int i13 = this.f24831f;
            arrayList.add(i13 == 0 ? gVarM.f23122d : i13 == 1 ? gVarM.f23124e : null);
            gVarM = gVarM.m(this.f24831f);
        }
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            t tVar = (t) obj;
            int i15 = this.f24831f;
            if (i15 == 0) {
                tVar.f24827b.f23118b = this;
            } else if (i15 == 1) {
                tVar.f24827b.f23120c = this;
            }
        }
        if (this.f24831f == 0 && ((d4.h) this.f24827b.V).f23166z0 && arrayList.size() > 1) {
            this.f24827b = ((t) nv.p.f(1, arrayList)).f24827b;
        }
        this.f24789l = this.f24831f == 0 ? this.f24827b.f23139l0 : this.f24827b.f23140m0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00ea A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00de  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2 A[ADDED_TO_REGION] */
    @Override // e4.d
    public final void a(d dVar) {
        int i11;
        int i12;
        boolean z11;
        float f5;
        float f11;
        int i13;
        int i14;
        int i15;
        int i16;
        float f12;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        float f13;
        g gVar = this.f24833h;
        if (gVar.f24808j) {
            g gVar2 = this.f24834i;
            if (gVar2.f24808j) {
                d4.g gVar3 = this.f24827b.V;
                boolean z12 = gVar3 instanceof d4.h ? ((d4.h) gVar3).f23166z0 : false;
                int i23 = gVar2.f24805g - gVar.f24805g;
                ArrayList arrayList = this.f24788k;
                int size = arrayList.size();
                int i24 = 0;
                while (true) {
                    i11 = -1;
                    i12 = 8;
                    if (i24 >= size) {
                        i24 = -1;
                        break;
                    } else if (((t) arrayList.get(i24)).f24827b.f23133i0 != 8) {
                        break;
                    } else {
                        i24++;
                    }
                }
                int i25 = size - 1;
                for (int i26 = i25; i26 >= 0; i26--) {
                    if (((t) arrayList.get(i26)).f24827b.f23133i0 != 8) {
                        i11 = i26;
                        break;
                    }
                }
                int i27 = 0;
                while (true) {
                    if (i27 >= 2) {
                        z11 = z12;
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        f11 = 0.0f;
                        i13 = 0;
                        i14 = 0;
                        i15 = 0;
                        break;
                    }
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    i14 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                    while (i28 < size) {
                        t tVar = (t) arrayList.get(i28);
                        d4.g gVar4 = tVar.f24827b;
                        boolean z13 = z12;
                        if (gVar4.f23133i0 != i12) {
                            i30++;
                            if (i28 > 0 && i28 >= i24) {
                                i14 += tVar.f24833h.f24804f;
                            }
                            h hVar = tVar.f24830e;
                            int i31 = hVar.f24805g;
                            int i32 = i14;
                            boolean z14 = tVar.f24829d != d4.f.MATCH_CONSTRAINT;
                            if (z14) {
                                int i33 = this.f24831f;
                                if (i33 == 0 && !gVar4.f23122d.f24830e.f24808j) {
                                    return;
                                }
                                if (i33 == 1 && !gVar4.f23124e.f24830e.f24808j) {
                                    return;
                                }
                            } else {
                                if (tVar.f24826a == 1 && i27 == 0) {
                                    i22 = hVar.m;
                                    i29++;
                                } else {
                                    if (hVar.f24808j) {
                                        i22 = i31;
                                    }
                                    if (z14) {
                                        i14 = i32 + i22;
                                    } else {
                                        i29++;
                                        f13 = gVar4.f23142n0[this.f24831f];
                                        if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                                            f11 += f13;
                                        }
                                        i14 = i32;
                                    }
                                    if (i28 >= i25 && i28 < i11) {
                                        i14 += -tVar.f24834i.f24804f;
                                    }
                                }
                                z14 = true;
                                if (z14) {
                                    i29++;
                                    f13 = gVar4.f23142n0[this.f24831f];
                                    if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                                        f11 += f13;
                                    }
                                    i14 = i32;
                                } else {
                                    i14 = i32 + i22;
                                }
                                if (i28 >= i25) {
                                }
                            }
                            i22 = i31;
                            if (z14) {
                                i29++;
                                f13 = gVar4.f23142n0[this.f24831f];
                                if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                                    f11 += f13;
                                }
                                i14 = i32;
                            } else {
                                i14 = i32 + i22;
                            }
                            if (i28 >= i25) {
                            }
                        }
                        i28++;
                        z12 = z13;
                        i12 = 8;
                    }
                    z11 = z12;
                    if (i14 < i23 || i29 == 0) {
                        i13 = i29;
                        i15 = i30;
                        break;
                    } else {
                        i27++;
                        z12 = z11;
                        i12 = 8;
                    }
                }
                int i34 = gVar.f24805g;
                if (z11) {
                    i34 = gVar2.f24805g;
                }
                float f14 = 0.5f;
                if (i14 > i23) {
                    i34 = z11 ? i34 + ((int) (((i14 - i23) / 2.0f) + 0.5f)) : i34 - ((int) (((i14 - i23) / 2.0f) + 0.5f));
                }
                if (i13 > 0) {
                    float f15 = i23 - i14;
                    int i35 = (int) ((f15 / i13) + 0.5f);
                    int i36 = 0;
                    int i37 = 0;
                    while (i36 < size) {
                        float f16 = f14;
                        t tVar2 = (t) arrayList.get(i36);
                        int i38 = i34;
                        d4.g gVar5 = tVar2.f24827b;
                        int i39 = i13;
                        h hVar2 = tVar2.f24830e;
                        int i40 = i14;
                        float f17 = f15;
                        if (gVar5.f23133i0 != 8 && tVar2.f24829d == d4.f.MATCH_CONSTRAINT && !hVar2.f24808j) {
                            int i41 = f11 > f5 ? (int) (((gVar5.f23142n0[this.f24831f] * f17) / f11) + f16) : i35;
                            if (this.f24831f == 0) {
                                i19 = gVar5.f23156v;
                                i21 = gVar5.f23155u;
                            } else {
                                i19 = gVar5.f23159y;
                                i21 = gVar5.f23158x;
                            }
                            int iMax = Math.max(i21, tVar2.f24826a == 1 ? Math.min(i41, hVar2.m) : i41);
                            if (i19 > 0) {
                                iMax = Math.min(i19, iMax);
                            }
                            if (iMax != i41) {
                                i37++;
                                i41 = iMax;
                            }
                            hVar2.d(i41);
                        }
                        i36++;
                        i34 = i38;
                        f14 = f16;
                        i13 = i39;
                        i14 = i40;
                        f15 = f17;
                        i35 = i35;
                    }
                    i16 = i34;
                    f12 = f14;
                    int i42 = i13;
                    int i43 = i14;
                    if (i37 > 0) {
                        i13 = i42 - i37;
                        i14 = 0;
                        for (int i44 = 0; i44 < size; i44++) {
                            t tVar3 = (t) arrayList.get(i44);
                            if (tVar3.f24827b.f23133i0 != 8) {
                                if (i44 > 0 && i44 >= i24) {
                                    i14 += tVar3.f24833h.f24804f;
                                }
                                i14 += tVar3.f24830e.f24805g;
                                if (i44 < i25 && i44 < i11) {
                                    i14 += -tVar3.f24834i.f24804f;
                                }
                            }
                        }
                    } else {
                        i13 = i42;
                        i14 = i43;
                    }
                    i18 = 2;
                    if (this.f24789l == 2 && i37 == 0) {
                        i17 = 0;
                        this.f24789l = 0;
                    } else {
                        i17 = 0;
                    }
                } else {
                    i16 = i34;
                    f12 = 0.5f;
                    i17 = 0;
                    i18 = 2;
                }
                if (i14 > i23) {
                    this.f24789l = i18;
                }
                if (i15 > 0 && i13 == 0 && i24 == i11) {
                    this.f24789l = i18;
                }
                int i45 = this.f24789l;
                if (i45 == 1) {
                    int i46 = i15 > 1 ? (i23 - i14) / (i15 - 1) : i15 == 1 ? (i23 - i14) / 2 : i17;
                    if (i13 > 0) {
                        i46 = i17;
                    }
                    int i47 = i16;
                    for (int i48 = i17; i48 < size; i48++) {
                        t tVar4 = (t) arrayList.get(z11 ? size - (i48 + 1) : i48);
                        d4.g gVar6 = tVar4.f24827b;
                        g gVar7 = tVar4.f24834i;
                        g gVar8 = tVar4.f24833h;
                        if (gVar6.f23133i0 == 8) {
                            gVar8.d(i47);
                            gVar7.d(i47);
                        } else {
                            if (i48 > 0) {
                                i47 = z11 ? i47 - i46 : i47 + i46;
                            }
                            if (i48 > 0 && i48 >= i24) {
                                i47 = z11 ? i47 - gVar8.f24804f : i47 + gVar8.f24804f;
                            }
                            if (z11) {
                                gVar7.d(i47);
                            } else {
                                gVar8.d(i47);
                            }
                            h hVar3 = tVar4.f24830e;
                            int i49 = hVar3.f24805g;
                            if (tVar4.f24829d == d4.f.MATCH_CONSTRAINT && tVar4.f24826a == 1) {
                                i49 = hVar3.m;
                            }
                            i47 = z11 ? i47 - i49 : i47 + i49;
                            if (z11) {
                                gVar8.d(i47);
                            } else {
                                gVar7.d(i47);
                            }
                            tVar4.f24832g = true;
                            if (i48 < i25 && i48 < i11) {
                                i47 = z11 ? i47 - (-gVar7.f24804f) : i47 + (-gVar7.f24804f);
                            }
                        }
                    }
                    return;
                }
                if (i45 == 0) {
                    int i50 = (i23 - i14) / (i15 + 1);
                    if (i13 > 0) {
                        i50 = i17;
                    }
                    int i51 = i16;
                    for (int i52 = i17; i52 < size; i52++) {
                        t tVar5 = (t) arrayList.get(z11 ? size - (i52 + 1) : i52);
                        d4.g gVar9 = tVar5.f24827b;
                        g gVar10 = tVar5.f24834i;
                        g gVar11 = tVar5.f24833h;
                        if (gVar9.f23133i0 == 8) {
                            gVar11.d(i51);
                            gVar10.d(i51);
                        } else {
                            int i53 = z11 ? i51 - i50 : i51 + i50;
                            if (i52 > 0 && i52 >= i24) {
                                i53 = z11 ? i53 - gVar11.f24804f : i53 + gVar11.f24804f;
                            }
                            if (z11) {
                                gVar10.d(i53);
                            } else {
                                gVar11.d(i53);
                            }
                            h hVar4 = tVar5.f24830e;
                            int iMin = hVar4.f24805g;
                            if (tVar5.f24829d == d4.f.MATCH_CONSTRAINT && tVar5.f24826a == 1) {
                                iMin = Math.min(iMin, hVar4.m);
                            }
                            i51 = z11 ? i53 - iMin : i53 + iMin;
                            if (z11) {
                                gVar11.d(i51);
                            } else {
                                gVar10.d(i51);
                            }
                            if (i52 < i25 && i52 < i11) {
                                i51 = z11 ? i51 - (-gVar10.f24804f) : i51 + (-gVar10.f24804f);
                            }
                        }
                    }
                    return;
                }
                if (i45 == 2) {
                    float f18 = this.f24831f == 0 ? this.f24827b.f23127f0 : this.f24827b.f23129g0;
                    if (z11) {
                        f18 = 1.0f - f18;
                    }
                    int i54 = (int) (((i23 - i14) * f18) + f12);
                    if (i54 < 0 || i13 > 0) {
                        i54 = i17;
                    }
                    int i55 = z11 ? i16 - i54 : i16 + i54;
                    for (int i56 = i17; i56 < size; i56++) {
                        t tVar6 = (t) arrayList.get(z11 ? size - (i56 + 1) : i56);
                        d4.g gVar12 = tVar6.f24827b;
                        g gVar13 = tVar6.f24834i;
                        g gVar14 = tVar6.f24833h;
                        if (gVar12.f23133i0 == 8) {
                            gVar14.d(i55);
                            gVar13.d(i55);
                        } else {
                            if (i56 > 0 && i56 >= i24) {
                                i55 = z11 ? i55 - gVar14.f24804f : i55 + gVar14.f24804f;
                            }
                            if (z11) {
                                gVar13.d(i55);
                            } else {
                                gVar14.d(i55);
                            }
                            h hVar5 = tVar6.f24830e;
                            int i57 = hVar5.f24805g;
                            if (tVar6.f24829d == d4.f.MATCH_CONSTRAINT && tVar6.f24826a == 1) {
                                i57 = hVar5.m;
                            }
                            i55 = z11 ? i55 - i57 : i55 + i57;
                            if (z11) {
                                gVar14.d(i55);
                            } else {
                                gVar13.d(i55);
                            }
                            if (i56 < i25 && i56 < i11) {
                                i55 = z11 ? i55 - (-gVar13.f24804f) : i55 + (-gVar13.f24804f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // e4.t
    public final void d() {
        ArrayList arrayList = this.f24788k;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((t) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        d4.g gVar = ((t) arrayList.get(0)).f24827b;
        d4.g gVar2 = ((t) arrayList.get(size2 - 1)).f24827b;
        int i12 = this.f24831f;
        g gVar3 = this.f24834i;
        g gVar4 = this.f24833h;
        if (i12 == 0) {
            d4.d dVar = gVar.J;
            d4.d dVar2 = gVar2.L;
            g gVarI = t.i(dVar, 0);
            int iE = dVar.e();
            d4.g gVarM = m();
            if (gVarM != null) {
                iE = gVarM.J.e();
            }
            if (gVarI != null) {
                t.b(gVar4, gVarI, iE);
            }
            g gVarI2 = t.i(dVar2, 0);
            int iE2 = dVar2.e();
            d4.g gVarN = n();
            if (gVarN != null) {
                iE2 = gVarN.L.e();
            }
            if (gVarI2 != null) {
                t.b(gVar3, gVarI2, -iE2);
            }
        } else {
            d4.d dVar3 = gVar.K;
            d4.d dVar4 = gVar2.M;
            g gVarI3 = t.i(dVar3, 1);
            int iE3 = dVar3.e();
            d4.g gVarM2 = m();
            if (gVarM2 != null) {
                iE3 = gVarM2.K.e();
            }
            if (gVarI3 != null) {
                t.b(gVar4, gVarI3, iE3);
            }
            g gVarI4 = t.i(dVar4, 1);
            int iE4 = dVar4.e();
            d4.g gVarN2 = n();
            if (gVarN2 != null) {
                iE4 = gVarN2.M.e();
            }
            if (gVarI4 != null) {
                t.b(gVar3, gVarI4, -iE4);
            }
        }
        gVar4.f24799a = this;
        gVar3.f24799a = this;
    }

    @Override // e4.t
    public final void e() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f24788k;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i11)).e();
            i11++;
        }
    }

    @Override // e4.t
    public final void f() {
        this.f24828c = null;
        ArrayList arrayList = this.f24788k;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((t) obj).f();
        }
    }

    @Override // e4.t
    public final long j() {
        ArrayList arrayList = this.f24788k;
        int size = arrayList.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            t tVar = (t) arrayList.get(i11);
            j11 = ((long) tVar.f24834i.f24804f) + tVar.j() + j11 + ((long) tVar.f24833h.f24804f);
        }
        return j11;
    }

    @Override // e4.t
    public final boolean k() {
        ArrayList arrayList = this.f24788k;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!((t) arrayList.get(i11)).k()) {
                return false;
            }
        }
        return true;
    }

    public final d4.g m() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f24788k;
            if (i11 >= arrayList.size()) {
                return null;
            }
            d4.g gVar = ((t) arrayList.get(i11)).f24827b;
            if (gVar.f23133i0 != 8) {
                return gVar;
            }
            i11++;
        }
    }

    public final d4.g n() {
        ArrayList arrayList = this.f24788k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d4.g gVar = ((t) arrayList.get(size)).f24827b;
            if (gVar.f23133i0 != 8) {
                return gVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f24831f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f24788k;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            sb2.append("<");
            sb2.append((t) obj);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
