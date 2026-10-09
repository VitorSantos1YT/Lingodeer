package l0;

import com.yalantis.ucrop.view.CropImageView;
import f0.h1;
import j0.t1;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import l1.b1;
import n0.c0;
import n0.d0;
import n0.f0;
import rz.b0;
import w2.q1;
import w2.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f39132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f39133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f39134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f39135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.h f39136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0.f f39137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f39138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0 f39139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z1.d f39140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z1.i f39141j;

    public m(w wVar, boolean z11, t1 t1Var, mz.g gVar, j0.h hVar, j0.f fVar, b0 b0Var, g2.c0 c0Var, f0 f0Var, z1.d dVar, z1.i iVar) {
        this.f39132a = wVar;
        this.f39133b = z11;
        this.f39134c = t1Var;
        this.f39135d = gVar;
        this.f39136e = hVar;
        this.f39137f = fVar;
        this.f39138g = b0Var;
        this.f39139h = f0Var;
        this.f39140i = dVar;
        this.f39141j = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:270:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:375:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:389:0x082b  */
    /* JADX WARN: Code duplicated, block: B:398:0x084f  */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // n0.c0
    public final r0 a(d0 d0Var, long j11) {
        float fA;
        long j12;
        int i11;
        int i12;
        int i13;
        int i14;
        p pVar;
        float f5;
        List arrayList;
        int i15;
        float f11;
        ArrayList arrayList2;
        List list;
        List arrayList3;
        p pVar2;
        ArrayList arrayList4;
        int i16;
        Integer numValueOf;
        Integer numValueOf2;
        o oVar;
        q1 q1Var;
        int[] iArr;
        ArrayList arrayList5;
        p pVar3;
        float f12;
        p pVar4;
        Object obj;
        int i17;
        Object obj2;
        int i18;
        int iMin;
        p pVar5;
        Object obj3;
        boolean zA = v3.l.a(0L, 0L);
        q1 q1Var2 = d0Var.f42933b;
        w wVar = this.f39132a;
        wVar.f39219s.getValue();
        boolean z11 = wVar.f39203b || q1Var2.c0();
        boolean z12 = this.f39133b;
        d0.n.l(j11, z12 ? h1.Vertical : h1.Horizontal);
        t1 t1Var = this.f39134c;
        int iN0 = z12 ? q1Var2.n0(t1Var.b(q1Var2.getLayoutDirection())) : q1Var2.n0(j0.c.l(t1Var, q1Var2.getLayoutDirection()));
        int iN1 = z12 ? q1Var2.n0(t1Var.d(q1Var2.getLayoutDirection())) : q1Var2.n0(j0.c.k(t1Var, q1Var2.getLayoutDirection()));
        int iN2 = q1Var2.n0(t1Var.c());
        int iN3 = q1Var2.n0(t1Var.a()) + iN2;
        int i19 = iN0 + iN1;
        int i21 = z12 ? iN3 : i19;
        int i22 = z12 ? iN2 : !z12 ? iN0 : iN1;
        int i23 = i21 - i22;
        long jI = v3.b.i(j11, -i19, -iN3);
        j jVar = (j) this.f39135d.invoke();
        c cVar = jVar.f39118c;
        int iH = v3.a.h(jI);
        int iG = v3.a.g(jI);
        cVar.f39101a.m(iH);
        cVar.f39102b.m(iG);
        j0.f fVar = this.f39137f;
        j0.h hVar = this.f39136e;
        if (z12) {
            if (hVar == null) {
                i0.a.b("null verticalArrangement when isVertical == true");
                throw new KotlinNothingValueException();
            }
            fA = hVar.a();
        } else {
            if (fVar == null) {
                i0.a.b("null horizontalAlignment when isVertical == false");
                throw new KotlinNothingValueException();
            }
            fA = fVar.a();
        }
        int iN4 = q1Var2.n0(fA);
        int i24 = jVar.f39117b.k().f34421b;
        int iG2 = z12 ? v3.a.g(j11) - iN3 : v3.a.h(j11) - i19;
        int i25 = i22;
        l lVar = new l(jI, this.f39133b, jVar, d0Var, i24, iN4, this.f39140i, this.f39141j, i25, i23, (((long) iN0) << 32) | (((long) iN2) & 4294967295L), this.f39132a);
        long j13 = jI;
        x1.f fVarN = re.q.n();
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        x1.f fVarR = re.q.r(fVarN);
        try {
            r rVar = wVar.f39206e;
            int iL = rVar.f39181b.l();
            int i26 = n0.l.i(iL, rVar.f39184e, jVar);
            if (iL != i26) {
                rVar.f39181b.m(i26);
                rVar.f39185f.b(iL);
            }
            int iL2 = rVar.f39182c.l();
            re.q.t(fVarN, fVarR, cVarE);
            List listG = n0.l.g(jVar, wVar.f39218r, wVar.f39215o);
            float fFloatValue = (q1Var2.c0() || !z11) ? wVar.f39209h : ((Number) ((b0.n) wVar.f39223w.f44805c).f3614b.getValue()).floatValue();
            n0.w wVar2 = wVar.f39214n;
            boolean zC0 = q1Var2.c0();
            o oVar2 = wVar.f39204c;
            b1 b1Var = wVar.f39222v;
            if (i25 < 0) {
                i0.a.a("invalid beforeContentPadding");
            }
            if (i23 < 0) {
                i0.a.a("invalid afterContentPadding");
            }
            ry.s sVar = ry.s.f50855a;
            j jVar2 = lVar.f39127c;
            b0 b0Var = this.f39138g;
            ry.r rVar2 = ry.r.f50854a;
            if (i24 <= 0) {
                int iJ = v3.a.j(j13);
                int i27 = v3.a.i(j13);
                wVar2.c(iJ, i27, new ArrayList(), jVar2.f39119d, lVar, zC0, 1, z11, 0, 0);
                if (!zC0) {
                    wVar2.b();
                    if (!zA) {
                        iJ = v3.b.g((int) 0, j13);
                        i27 = v3.b.f((int) 0, j13);
                    }
                }
                q1Var = q1Var2;
                oVar = new o(null, 0, false, CropImageView.DEFAULT_ASPECT_RATIO, q1Var2.q0(v3.b.g(iJ + i19, j11), v3.b.f(i27 + iN3, j11), sVar, new com.lingo.lingoskill.object.a(27)), CropImageView.DEFAULT_ASPECT_RATIO, false, b0Var, d0Var, lVar.f39129e, rVar2, -i25, iG2 + i23, 0, z12 ? h1.Vertical : h1.Horizontal, i23, iN4);
            } else {
                int i28 = iL2;
                if (i26 >= i24) {
                    i26 = i24 - 1;
                    i28 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i29 = i28 - iRound;
                if (i26 == 0 && i29 < 0) {
                    iRound += i29;
                    i29 = 0;
                }
                ry.k kVar = new ry.k();
                int i30 = -i25;
                float f13 = fFloatValue;
                int i31 = i30 + (r2 < 0 ? r2 : 0);
                int i32 = i29 + i31;
                int i33 = i26;
                int iMax = 0;
                while (true) {
                    j12 = lVar.f39129e;
                    if (i32 >= 0 || i33 <= 0) {
                        break;
                    }
                    int i34 = i30;
                    int i35 = i33 - 1;
                    p pVarS0 = lVar.s0(i35, j12);
                    kVar.add(0, pVarS0);
                    iMax = Math.max(iMax, pVarS0.f39175o);
                    i32 += pVarS0.f39174n;
                    i33 = i35;
                    i30 = i34;
                }
                int i36 = i30;
                if (i32 < i31) {
                    iRound -= i31 - i32;
                    i32 = i31;
                }
                int i37 = iRound;
                int i38 = i32 - i31;
                int i39 = iG2 + i23;
                int i40 = iMax;
                int i41 = i39 < 0 ? 0 : i39;
                int i42 = i38;
                int i43 = -i38;
                int i44 = i33;
                int i45 = 0;
                boolean z13 = false;
                while (i45 < kVar.f50852c) {
                    if (i43 >= i41) {
                        kVar.d(i45);
                        z13 = true;
                    } else {
                        i44++;
                        i43 += ((p) kVar.get(i45)).f39174n;
                        i45++;
                    }
                }
                int iMax2 = i40;
                boolean z14 = z13;
                int i46 = i44;
                while (i46 < i24 && (i43 < i41 || i43 <= 0 || kVar.isEmpty())) {
                    int i47 = i41;
                    p pVarS1 = lVar.s0(i46, j12);
                    long j14 = j13;
                    int i48 = pVarS1.f39174n;
                    i43 += i48;
                    if (i43 > i31 || i46 == i24 - 1) {
                        iMax2 = Math.max(iMax2, pVarS1.f39175o);
                        kVar.addLast(pVarS1);
                    } else {
                        i42 -= i48;
                        i33 = i46 + 1;
                        z14 = true;
                    }
                    i46++;
                    i41 = i47;
                    j13 = j14;
                }
                long j15 = j13;
                if (i43 < iG2) {
                    int i49 = iG2 - i43;
                    int i50 = i43 + i49;
                    int i51 = i42 - i49;
                    while (i51 < i25 && i33 > 0) {
                        int i52 = i33 - 1;
                        int i53 = i49;
                        p pVarS2 = lVar.s0(i52, j12);
                        kVar.add(0, pVarS2);
                        iMax2 = Math.max(iMax2, pVarS2.f39175o);
                        i51 += pVarS2.f39174n;
                        i33 = i52;
                        i49 = i53;
                        i50 = i50;
                    }
                    int i54 = i50;
                    i12 = i37 + i49;
                    if (i51 < 0) {
                        i12 += i51;
                        i11 = i54 + i51;
                        i13 = i33;
                        i14 = 0;
                    } else {
                        i14 = i51;
                        i13 = i33;
                        i11 = i54;
                    }
                } else {
                    i11 = i43;
                    i12 = i37;
                    i13 = i33;
                    i14 = i42;
                }
                int i55 = iMax2;
                float f14 = (Integer.signum(Math.round(f13)) != Integer.signum(i12) || Math.abs(Math.round(f13)) < Math.abs(i12)) ? f13 : i12;
                float f15 = f13 - f14;
                float f16 = (!zC0 || i12 <= i37 || f15 > CropImageView.DEFAULT_ASPECT_RATIO) ? 0.0f : (i12 - i37) + f15;
                if (i14 < 0) {
                    i0.a.a("negative currentFirstItemScrollOffset");
                }
                int i56 = -i14;
                p pVar6 = (p) kVar.first();
                if (i25 > 0 || r2 < 0) {
                    int iB = kVar.b();
                    p pVar7 = pVar6;
                    int i57 = 0;
                    while (i57 < iB) {
                        int i58 = iB;
                        int i59 = ((p) kVar.get(i57)).f39174n;
                        if (i14 == 0 || i59 > i14 || i57 == ns.o.A(kVar)) {
                            break;
                        }
                        i14 -= i59;
                        i57++;
                        pVar7 = (p) kVar.get(i57);
                        iB = i58;
                    }
                    pVar = pVar7;
                } else {
                    pVar = pVar6;
                }
                int i60 = i14;
                int iMax3 = Math.max(0, i13);
                int i61 = i13 - 1;
                if (iMax3 <= i61) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        f5 = f14;
                        arrayList.add(lVar.s0(i61, j12));
                        if (i61 == iMax3) {
                            break;
                        }
                        i61--;
                        f14 = f5;
                    }
                } else {
                    f5 = f14;
                    arrayList = null;
                }
                int size = listG.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i62 = size - 1;
                        int iIntValue = ((Number) listG.get(size)).intValue();
                        if (iIntValue < iMax3) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(lVar.s0(iIntValue, j12));
                        }
                        if (i62 < 0) {
                            break;
                        }
                        size = i62;
                    }
                }
                if (arrayList == null) {
                    arrayList = rVar2;
                }
                int iMax4 = i55;
                int i63 = 0;
                for (int size2 = arrayList.size(); i63 < size2; size2 = size2) {
                    iMax4 = Math.max(iMax4, ((p) arrayList.get(i63)).f39175o);
                    i63++;
                }
                int i64 = i24 - 1;
                int iMin2 = Math.min(((p) ry.m.z0(kVar)).f39162a, i64);
                int i65 = iMax4;
                int i66 = ((p) ry.m.z0(kVar)).f39162a + 1;
                if (i66 <= iMin2) {
                    ArrayList arrayList6 = null;
                    while (true) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        i15 = i46;
                        f11 = f16;
                        arrayList2 = arrayList6;
                        arrayList2.add(lVar.s0(i66, j12));
                        if (i66 == iMin2) {
                            break;
                        }
                        i66++;
                        arrayList6 = arrayList2;
                        i46 = i15;
                        f16 = f11;
                    }
                } else {
                    i15 = i46;
                    f11 = f16;
                    arrayList2 = null;
                }
                if (!zC0 || oVar2 == null) {
                    list = arrayList;
                    i11 = i11;
                    arrayList3 = arrayList2;
                } else {
                    ?? r11 = oVar2.f39156k;
                    if (r11.isEmpty()) {
                        list = arrayList;
                        i11 = i11;
                        arrayList3 = arrayList2;
                    } else {
                        int size3 = r11.size() - 1;
                        ArrayList arrayList7 = arrayList2;
                        while (true) {
                            if (-1 >= size3) {
                                pVar3 = null;
                                break;
                            }
                            if (((p) r11.get(size3)).f39162a > iMin2 && (size3 == 0 || ((p) r11.get(size3 - 1)).f39162a <= iMin2)) {
                                pVar3 = (p) r11.get(size3);
                                break;
                            }
                            size3--;
                        }
                        p pVar8 = (p) ry.m.z0(r11);
                        if (pVar3 != null && (i18 = pVar3.f39162a) <= (iMin = Math.min(pVar8.f39162a, i64))) {
                            arrayList3 = arrayList7;
                            while (true) {
                                list = arrayList;
                                if (arrayList3 != null) {
                                    int size4 = arrayList3.size();
                                    int i67 = 0;
                                    while (true) {
                                        if (i67 >= size4) {
                                            obj3 = null;
                                            break;
                                        }
                                        obj3 = arrayList3.get(i67);
                                        int i68 = size4;
                                        if (((p) obj3).f39162a == i18) {
                                            break;
                                        }
                                        i67++;
                                        size4 = i68;
                                    }
                                    pVar5 = (p) obj3;
                                } else {
                                    pVar5 = null;
                                }
                                if (pVar5 == null) {
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(lVar.s0(i18, j12));
                                }
                                if (i18 == iMin) {
                                    break;
                                }
                                i18++;
                                arrayList = list;
                                i11 = i11;
                            }
                        } else {
                            list = arrayList;
                            i11 = i11;
                            arrayList3 = arrayList7;
                        }
                        float f17 = ((oVar2.m - pVar8.f39173l) - pVar8.m) - f5;
                        if (f17 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            int i69 = pVar8.f39162a + 1;
                            int i70 = 0;
                            while (i69 < i24 && i70 < f17) {
                                if (i69 <= iMin2) {
                                    int iB2 = kVar.b();
                                    int i71 = 0;
                                    while (true) {
                                        if (i71 >= iB2) {
                                            f12 = f17;
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = kVar.get(i71);
                                        f12 = f17;
                                        if (((p) obj2).f39162a == i69) {
                                            break;
                                        }
                                        i71++;
                                        f17 = f12;
                                    }
                                    pVar4 = (p) obj2;
                                } else {
                                    f12 = f17;
                                    if (arrayList3 != null) {
                                        int size5 = arrayList3.size();
                                        int i72 = 0;
                                        while (true) {
                                            if (i72 >= size5) {
                                                obj = null;
                                                break;
                                            }
                                            obj = arrayList3.get(i72);
                                            if (((p) obj).f39162a == i69) {
                                                break;
                                            }
                                            i72++;
                                        }
                                        pVar4 = (p) obj;
                                    } else {
                                        pVar4 = null;
                                    }
                                }
                                if (pVar4 != null) {
                                    i69++;
                                    i17 = pVar4.f39174n;
                                } else {
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(lVar.s0(i69, j12));
                                    i69++;
                                    i17 = ((p) ry.m.z0(arrayList3)).f39174n;
                                }
                                i70 += i17;
                                f17 = f12;
                            }
                        }
                    }
                }
                if (arrayList3 != null && ((p) ry.m.z0(arrayList3)).f39162a > iMin2) {
                    iMin2 = ((p) ry.m.z0(arrayList3)).f39162a;
                }
                int size6 = listG.size();
                for (int i73 = 0; i73 < size6; i73++) {
                    int iIntValue2 = ((Number) listG.get(i73)).intValue();
                    if (iIntValue2 > iMin2) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(lVar.s0(iIntValue2, j12));
                    }
                }
                if (arrayList3 == null) {
                    arrayList3 = rVar2;
                }
                int size7 = arrayList3.size();
                int iMax5 = i65;
                for (int i74 = 0; i74 < size7; i74++) {
                    iMax5 = Math.max(iMax5, ((p) arrayList3.get(i74)).f39175o);
                }
                boolean z15 = kotlin.jvm.internal.m.a(pVar, kVar.first()) && list.isEmpty() && arrayList3.isEmpty();
                int iG3 = v3.b.g(z12 ? iMax5 : i11, j15);
                if (z12) {
                    iMax5 = i11;
                }
                int iF = v3.b.f(iMax5, j15);
                int i75 = z12 ? iF : iG3;
                int i76 = i11;
                boolean z16 = i76 < Math.min(i75, iG2);
                if (z16 && i56 != 0) {
                    i0.a.c("non-zero itemsScrollOffset");
                }
                ArrayList arrayList8 = new ArrayList(arrayList3.size() + list.size() + kVar.b());
                if (z16) {
                    if (!list.isEmpty() || !arrayList3.isEmpty()) {
                        i0.a.a("no extra items");
                    }
                    int iB3 = kVar.b();
                    int[] iArr2 = new int[iB3];
                    int i77 = 0;
                    while (i77 < iB3) {
                        iArr2[i77] = ((p) kVar.get(i77)).m;
                        i77++;
                        pVar = pVar;
                    }
                    pVar2 = pVar;
                    int[] iArr3 = new int[iB3];
                    if (z12) {
                        if (hVar == null) {
                            i0.a.b("null verticalArrangement when isVertical == true");
                            throw new KotlinNothingValueException();
                        }
                        hVar.c(d0Var, i75, iArr2, iArr3);
                        iArr = iArr3;
                        arrayList5 = arrayList8;
                    } else {
                        if (fVar == null) {
                            i0.a.b("null horizontalArrangement when isVertical == false");
                            throw new KotlinNothingValueException();
                        }
                        iArr = iArr3;
                        arrayList5 = arrayList8;
                        fVar.b(d0Var, i75, iArr2, v3.m.Ltr, iArr);
                    }
                    lz.g gVarV = ry.l.V(iArr);
                    int i78 = gVarV.f40532a;
                    int i79 = gVarV.f40533b;
                    int i80 = gVarV.f40534c;
                    if ((i80 > 0 && i78 <= i79) || (i80 < 0 && i79 <= i78)) {
                        while (true) {
                            int i81 = iArr[i78];
                            p pVar9 = (p) kVar.get(i78);
                            pVar9.k(i81, iG3, iF);
                            arrayList5.add(pVar9);
                            if (i78 == i79) {
                                break;
                            }
                            i78 += i80;
                        }
                    }
                    arrayList4 = arrayList5;
                } else {
                    pVar2 = pVar;
                    lVar = lVar;
                    arrayList4 = arrayList8;
                    int i82 = i56;
                    int i83 = 0;
                    for (int size8 = list.size(); i83 < size8; size8 = size8) {
                        p pVar10 = (p) list.get(i83);
                        i82 -= pVar10.f39174n;
                        pVar10.k(i82, iG3, iF);
                        arrayList4.add(pVar10);
                        i83++;
                    }
                    int iB4 = kVar.b();
                    int i84 = i56;
                    for (int i85 = 0; i85 < iB4; i85++) {
                        p pVar11 = (p) kVar.get(i85);
                        pVar11.k(i84, iG3, iF);
                        arrayList4.add(pVar11);
                        i84 += pVar11.f39174n;
                    }
                    int size9 = arrayList3.size();
                    for (int i86 = 0; i86 < size9; i86++) {
                        p pVar12 = (p) arrayList3.get(i86);
                        pVar12.k(i84, iG3, iF);
                        arrayList4.add(pVar12);
                        i84 += pVar12.f39174n;
                    }
                }
                ArrayList arrayList9 = arrayList4;
                wVar2.c(iG3, iF, arrayList9, jVar2.f39119d, lVar, zC0, 1, z11, i60, i76);
                l lVar2 = lVar;
                if (zC0) {
                    i16 = iF;
                } else {
                    wVar2.b();
                    if (zA) {
                        i16 = iF;
                    } else {
                        int i87 = z12 ? iF : iG3;
                        iG3 = v3.b.g(Math.max(iG3, (int) 0), j15);
                        int iF2 = v3.b.f(Math.max(iF, (int) 0), j15);
                        int i88 = z12 ? iF2 : iG3;
                        if (i88 != i87) {
                            int size10 = arrayList9.size();
                            for (int i89 = 0; i89 < size10; i89++) {
                                ((p) arrayList9.get(i89)).f39177q = i88;
                            }
                        }
                        i16 = iF2;
                    }
                }
                int i90 = iG3;
                p pVar13 = (p) kVar.g();
                int i91 = pVar13 != null ? pVar13.f39162a : 0;
                p pVar14 = (p) kVar.j();
                int i92 = pVar14 != null ? pVar14.f39162a : 0;
                jVar2.f39117b.getClass();
                List listF = n0.l.f(this.f39139h, i91, i92, arrayList9, y.l.f56733a, i25, i90, i16, new kp.j(lVar2, 2));
                if (z15 != 0) {
                    p pVar15 = (p) ry.m.s0(arrayList9);
                    if (pVar15 != null) {
                        numValueOf = Integer.valueOf(pVar15.f39162a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    p pVar16 = (p) kVar.g();
                    if (pVar16 != null) {
                        numValueOf = Integer.valueOf(pVar16.f39162a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z15) {
                    p pVar17 = (p) ry.m.A0(arrayList9);
                    if (pVar17 != null) {
                        numValueOf2 = Integer.valueOf(pVar17.f39162a);
                    } else {
                        numValueOf2 = null;
                    }
                } else {
                    p pVar18 = (p) kVar.j();
                    if (pVar18 != null) {
                        numValueOf2 = Integer.valueOf(pVar18.f39162a);
                    } else {
                        numValueOf2 = null;
                    }
                }
                q1Var = q1Var2;
                oVar = new o(pVar2, i60, i15 < i24 || i76 > iG2, f5, q1Var2.q0(v3.b.g(i90 + i19, j11), v3.b.f(i16 + iN3, j11), sVar, new n(b1Var, arrayList9, listF, zC0, 0)), f11, z14, b0Var, d0Var, lVar2.f39129e, n0.l.o(numValueOf != null ? numValueOf.intValue() : 0, numValueOf2 != null ? numValueOf2.intValue() : 0, arrayList9, listF), i36, i39, i24, z12 ? h1.Vertical : h1.Horizontal, i23, r2);
            }
            wVar.g(oVar, q1Var.c0(), false);
            return oVar;
        } catch (Throwable th2) {
            re.q.t(fVarN, fVarR, cVarE);
            throw th2;
        }
    }
}
