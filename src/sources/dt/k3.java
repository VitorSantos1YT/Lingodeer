package dt;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bt.w6;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.c3 f23943a = new l1.c3(new cr.m(14));

    public static final void a(int i11, int i12, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-185347367);
        int i13 = (sVar.f(rVar) ? 4 : 2) | i12 | (sVar.d(i11) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            ad.p pVarL = gb.r.L(new ad.r(i11), sVar);
            ad.i iVarE = ff.h.e((wc.h) pVarL.getValue(), false, CropImageView.DEFAULT_ASPECT_RATIO, sVar, 1022);
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            boolean zH = sVar.h(context);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new g3(context, null, 0);
                sVar.o0(objQ);
            }
            l1.t.f((fz.e) objQ, qy.b0.f48488a, sVar);
            wc.h hVar = (wc.h) pVarL.getValue();
            z1.j jVar = z1.c.f58464b;
            boolean zF = sVar.f(iVarE);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = new w6(iVarE, 2);
                sVar.o0(objQ2);
            }
            rVar2 = rVar;
            fr.j3.a(hVar, (fz.a) objQ2, rVar2, null, jVar, w2.i.f54517d, sVar, (i13 << 6) & 896, 54, 127992);
        } else {
            rVar2 = rVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c3(rVar2, i11, i12, 0);
        }
    }

    public static final void b(final String str, final boolean z11, final boolean z12, final boolean z13, final float f5, final float f11, final boolean z14, final boolean z15, final d0.d2 d2Var, final d0.d2 d2Var2, final z1.r rVar, final t1.d dVar, final t1.d dVar2, final t1.d dVar3, final fz.e eVar, final fz.a aVar, final fz.a aVar2, final fz.c cVar, final fz.c cVar2, final fz.c cVar3, final fz.c cVar4, final fz.a aVar3, l1.n nVar, final int i11, final int i12, final int i13) {
        int i14;
        boolean z16;
        boolean z17;
        boolean z18;
        float f12;
        int i15;
        int i16;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1609339588);
        if ((i11 & 6) == 0) {
            i14 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            z16 = z11;
            i14 |= sVar.g(z16) ? 32 : 16;
        } else {
            z16 = z11;
        }
        if ((i11 & 384) == 0) {
            z17 = z12;
            i14 |= sVar.g(z17) ? 256 : 128;
        } else {
            z17 = z12;
        }
        if ((i11 & 3072) == 0) {
            z18 = z13;
            i14 |= sVar.g(z18) ? 2048 : 1024;
        } else {
            z18 = z13;
        }
        int i17 = i11 & 24576;
        int i18 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i17 == 0) {
            f12 = f5;
            i14 |= sVar.c(f12) ? 16384 : 8192;
        } else {
            f12 = f5;
        }
        if ((i11 & 196608) == 0) {
            i14 |= sVar.c(f11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= sVar.g(z14) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= sVar.g(z15) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= sVar.f(d2Var) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i14 |= sVar.f(d2Var2) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i15 = i12 | (sVar.f(rVar) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= sVar.h(dVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i15 |= sVar.h(dVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i15 |= sVar.h(dVar3) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            if (sVar.h(eVar)) {
                i18 = 16384;
            }
            i15 |= i18;
        }
        if ((i12 & 196608) == 0) {
            i15 |= sVar.h(aVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i15 |= sVar.h(aVar2) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i15 |= sVar.h(cVar) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i15 |= sVar.h(cVar2) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i15 |= sVar.h(cVar3) ? 536870912 : 268435456;
        }
        int i19 = i15;
        if ((i13 & 6) == 0) {
            i16 = i13 | (sVar.h(cVar4) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= sVar.h(aVar3) ? 32 : 16;
        }
        if (sVar.T(i14 & 1, ((i14 & 306783379) == 306783378 && (i19 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true)) {
            boolean z19 = ((i14 & 57344) == 16384) | ((i14 & 458752) == 131072) | ((i19 & 112) == 32) | ((i14 & 14) == 4) | ((i14 & 29360128) == 8388608) | ((i14 & 7168) == 2048) | ((i19 & 458752) == 131072) | ((i19 & 57344) == 16384) | ((i14 & 3670016) == 1048576) | ((i19 & 234881024) == 67108864) | ((i14 & 896) == 256) | ((i14 & 234881024) == 67108864) | ((i19 & 3670016) == 1048576) | ((i19 & 29360128) == 8388608) | ((i19 & 896) == 256) | ((i14 & 112) == 32) | ((i14 & 1879048192) == 536870912) | ((i19 & 1879048192) == 536870912) | ((i16 & 14) == 4) | ((i19 & 7168) == 2048) | ((i16 & 112) == 32);
            Object objQ = sVar.Q();
            if (z19 || objQ == l1.m.f39353a) {
                final boolean z20 = z16;
                final boolean z21 = z17;
                final boolean z22 = z18;
                final float f13 = f12;
                fz.e eVar2 = new fz.e() { // from class: dt.z2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r10v6 */
                    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Iterable] */
                    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r8v7 */
                    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Iterable] */
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ?? arrayList;
                        ?? arrayList2;
                        Integer numValueOf;
                        int i21;
                        w2.q1 SubcomposeLayout = (w2.q1) obj;
                        final v3.a aVar4 = (v3.a) obj2;
                        kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                        long j11 = aVar4.f53483a;
                        long jA = v3.a.a(0, 0, 0, 0, 10, j11);
                        float f14 = f13;
                        float f15 = f11;
                        float f16 = f14 + f15;
                        Float fValueOf = Float.valueOf(f16);
                        if (f16 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                            fValueOf = null;
                        }
                        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                        List listC = SubcomposeLayout.C(a2.Top, new t1.d(new br.m(dVar, 3), true, 949109764));
                        final ArrayList arrayList3 = new ArrayList(ry.n.W(listC, 10));
                        Iterator it = listC.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((w2.p0) it.next()).B(jA));
                        }
                        int size = arrayList3.size();
                        int i22 = 0;
                        int i23 = 0;
                        while (i22 < size) {
                            Object obj3 = arrayList3.get(i22);
                            i22++;
                            i23 += ((w2.g1) obj3).f54502b;
                        }
                        String str2 = str;
                        int iN0 = str2.length() > 0 ? SubcomposeLayout.n0(4) : 0;
                        int iN1 = str2.length() > 0 ? SubcomposeLayout.n0(12) : 0;
                        int length = str2.length();
                        boolean z23 = z15;
                        final int i24 = (length <= 0 || z23) ? 0 : iN0;
                        final int i25 = (str2.length() <= 0 || z23) ? 0 : iN1;
                        int length2 = str2.length();
                        ry.r rVar2 = ry.r.f50854a;
                        if (length2 > 0) {
                            List listC2 = SubcomposeLayout.C(a2.Translation, new t1.d(new bp.e0(str2, 5), true, -1544163475));
                            arrayList = new ArrayList(ry.n.W(listC2, 10));
                            Iterator it2 = listC2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((w2.p0) it2.next()).B(jA));
                            }
                        } else {
                            arrayList = rVar2;
                        }
                        Iterator it3 = arrayList.iterator();
                        int i26 = 0;
                        while (it3.hasNext()) {
                            i26 += ((w2.g1) it3.next()).f54502b;
                        }
                        int i27 = i26 + i24 + i25;
                        int i28 = i26 + iN0 + iN1;
                        if (z22) {
                            List listC3 = SubcomposeLayout.C(a2.Skip, new t1.d(new at.o(10, aVar), true, 342423515));
                            arrayList2 = new ArrayList(ry.n.W(listC3, 10));
                            Iterator it4 = listC3.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(((w2.p0) it4.next()).B(jA));
                            }
                        } else {
                            arrayList2 = rVar2;
                        }
                        Iterator it5 = arrayList2.iterator();
                        final ?? r11 = arrayList2;
                        final int i29 = 0;
                        while (it5.hasNext()) {
                            i29 += ((w2.g1) it5.next()).f54502b;
                        }
                        int iG = ((v3.a.g(r4) - i23) - i27) - i29;
                        if (iG < 0) {
                            iG = 0;
                        }
                        int iG2 = ((v3.a.g(r4) - i23) - i28) - i29;
                        if (iG2 < 0) {
                            iG2 = 0;
                        }
                        float f17 = f15 / fFloatValue;
                        int iMin = (int) (iG * f17);
                        if (iMin < 0) {
                            iMin = 0;
                        }
                        int iMin2 = (int) (iG2 * f17);
                        if (iMin2 < 0) {
                            iMin2 = 0;
                        }
                        fz.e eVar3 = eVar;
                        if (eVar3 != null) {
                            List listC4 = SubcomposeLayout.C(a2.OptionNatural, new t1.d(new e1(1, eVar3), true, -52162068));
                            ArrayList arrayList4 = new ArrayList(ry.n.W(listC4, 10));
                            Iterator it6 = listC4.iterator();
                            while (it6.hasNext()) {
                                arrayList4.add(((w2.p0) it6.next()).B(v3.a.a(0, 0, 0, Integer.MAX_VALUE, 7, jA)));
                            }
                            int size2 = arrayList4.size();
                            int i30 = 0;
                            int i31 = 0;
                            while (i31 < size2) {
                                Object obj4 = arrayList4.get(i31);
                                i31++;
                                i30 += ((w2.g1) obj4).f54502b;
                            }
                            numValueOf = Integer.valueOf(i30);
                        } else {
                            numValueOf = null;
                        }
                        boolean z24 = z14;
                        if (numValueOf != null) {
                            iMin = Math.min(numValueOf.intValue(), iMin);
                        } else if (z24) {
                            iMin = 0;
                        }
                        if (numValueOf != null) {
                            iMin2 = Math.min(numValueOf.intValue(), iMin2);
                        } else if (z24) {
                            iMin2 = 0;
                        }
                        int iG3 = (((v3.a.g(r4) - i23) - i27) - iMin) - i29;
                        int i32 = iG3 < 0 ? 0 : iG3;
                        int iG4 = (((v3.a.g(r4) - i23) - i28) - iMin2) - i29;
                        if (iG4 < 0) {
                            iG4 = 0;
                        }
                        cVar2.invoke(Integer.valueOf(iG4));
                        List listC5 = SubcomposeLayout.C(a2.Title, new t1.d(new d3(z21, d2Var, aVar2, cVar, dVar2), true, 1437603809));
                        final ArrayList arrayList5 = new ArrayList(ry.n.W(listC5, 10));
                        Iterator it7 = listC5.iterator();
                        while (it7.hasNext()) {
                            arrayList5.add(((w2.p0) it7.next()).B(v3.a.a(0, 0, 0, i32, 7, jA)));
                        }
                        int size3 = arrayList5.size();
                        int i33 = 0;
                        int i34 = 0;
                        while (i34 < size3) {
                            Object obj5 = arrayList5.get(i34);
                            i34++;
                            i33 += ((w2.g1) obj5).f54502b;
                        }
                        if (z24) {
                            i21 = 0;
                        } else {
                            int iG5 = (((v3.a.g(r4) - i23) - i33) - i27) - i29;
                            i21 = iG5 < 0 ? 0 : iG5;
                        }
                        List listC6 = SubcomposeLayout.C(a2.OptionLayout, new t1.d(new e3(z20, d2Var2, i21, cVar3, cVar4, dVar3, aVar3), true, -2106863094));
                        final ?? r9 = arrayList;
                        final ArrayList arrayList6 = new ArrayList(ry.n.W(listC6, 10));
                        Iterator it8 = listC6.iterator();
                        while (it8.hasNext()) {
                            arrayList6.add(((w2.p0) it8.next()).B(v3.a.a(0, 0, i21, i21, 3, jA)));
                        }
                        return SubcomposeLayout.q0(v3.a.h(r4), v3.a.g(j11), ry.s.f50855a, new fz.c() { // from class: dt.f3
                            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Iterable, java.lang.Object] */
                            @Override // fz.c
                            public final Object invoke(Object obj6) {
                                w2.f1 layout = (w2.f1) obj6;
                                kotlin.jvm.internal.m.f(layout, "$this$layout");
                                ArrayList arrayList7 = arrayList3;
                                int size4 = arrayList7.size();
                                int i35 = 0;
                                int i36 = 0;
                                while (i36 < size4) {
                                    Object obj7 = arrayList7.get(i36);
                                    i36++;
                                    w2.g1 g1Var = (w2.g1) obj7;
                                    w2.f1.k(layout, g1Var, 0, i35);
                                    i35 += g1Var.f54502b;
                                }
                                ArrayList arrayList8 = arrayList5;
                                int size5 = arrayList8.size();
                                int i37 = 0;
                                while (i37 < size5) {
                                    Object obj8 = arrayList8.get(i37);
                                    i37++;
                                    w2.g1 g1Var2 = (w2.g1) obj8;
                                    w2.f1.k(layout, g1Var2, 0, i35);
                                    i35 += g1Var2.f54502b;
                                }
                                int i38 = i35 + i24;
                                for (w2.g1 g1Var3 : r9) {
                                    w2.f1.k(layout, g1Var3, 0, i38);
                                    i38 += g1Var3.f54502b;
                                }
                                int i39 = i38 + i25;
                                ArrayList arrayList9 = arrayList6;
                                int size6 = arrayList9.size();
                                int i40 = 0;
                                while (i40 < size6) {
                                    Object obj9 = arrayList9.get(i40);
                                    i40++;
                                    w2.f1.k(layout, (w2.g1) obj9, 0, i39);
                                }
                                int iG6 = v3.a.g(aVar4.f53483a) - i29;
                                if (iG6 < 0) {
                                    iG6 = 0;
                                }
                                Iterator it9 = r11.iterator();
                                while (it9.hasNext()) {
                                    w2.f1.k(layout, (w2.g1) it9.next(), 0, iG6);
                                }
                                return qy.b0.f48488a;
                            }
                        });
                    }
                };
                sVar.o0(eVar2);
                objQ = eVar2;
            }
            w2.a0.b(rVar, (fz.e) objQ, sVar, i19 & 14, 0);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.a3
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i11 | 1);
                    int iM2 = l1.t.M(i12);
                    int iM3 = l1.t.M(i13);
                    k3.b(str, z11, z12, z13, f5, f11, z14, z15, d2Var, d2Var2, rVar, dVar, dVar2, dVar3, eVar, aVar, aVar2, cVar, cVar2, cVar3, cVar4, aVar3, (l1.n) obj, iM, iM2, iM3);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void c(fz.e eVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(686697756);
        int i12 = (sVar.h(eVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.r rVarE = j0.e2.e(z1.o.f58481a, 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            ep.a.w(i12 & 14, eVar, sVar, true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e1(i11, 2, eVar);
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v1 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void d(boolean r22, d0.d2 r23, int r24, fz.c r25, fz.c r26, t1.d r27, fz.a r28, l1.n r29, int r30) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt.k3.d(boolean, d0.d2, int, fz.c, fz.c, t1.d, fz.a, l1.n, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0189  */
    /* JADX WARN: Code duplicated, block: B:102:0x018e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0196  */
    /* JADX WARN: Code duplicated, block: B:105:0x0199  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:117:0x01be  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01de  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:140:0x0202  */
    /* JADX WARN: Code duplicated, block: B:141:0x0205  */
    /* JADX WARN: Code duplicated, block: B:145:0x020e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0217  */
    /* JADX WARN: Code duplicated, block: B:148:0x021b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0225  */
    /* JADX WARN: Code duplicated, block: B:151:0x0228  */
    /* JADX WARN: Code duplicated, block: B:153:0x022d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0239  */
    /* JADX WARN: Code duplicated, block: B:158:0x023e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0244  */
    /* JADX WARN: Code duplicated, block: B:162:0x024a  */
    /* JADX WARN: Code duplicated, block: B:163:0x024d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0256  */
    /* JADX WARN: Code duplicated, block: B:168:0x0259  */
    /* JADX WARN: Code duplicated, block: B:170:0x025f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0267  */
    /* JADX WARN: Code duplicated, block: B:173:0x026a  */
    /* JADX WARN: Code duplicated, block: B:176:0x0271  */
    /* JADX WARN: Code duplicated, block: B:179:0x0278  */
    /* JADX WARN: Code duplicated, block: B:180:0x027b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0281  */
    /* JADX WARN: Code duplicated, block: B:184:0x0289  */
    /* JADX WARN: Code duplicated, block: B:185:0x028c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0293  */
    /* JADX WARN: Code duplicated, block: B:191:0x029c  */
    /* JADX WARN: Code duplicated, block: B:192:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:194:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:197:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:199:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:202:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:203:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:207:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:211:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:212:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:214:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:216:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:220:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:222:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:226:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:228:0x0305  */
    /* JADX WARN: Code duplicated, block: B:232:0x030d  */
    /* JADX WARN: Code duplicated, block: B:234:0x0313  */
    /* JADX WARN: Code duplicated, block: B:235:0x0316  */
    /* JADX WARN: Code duplicated, block: B:239:0x0320  */
    /* JADX WARN: Code duplicated, block: B:241:0x0326  */
    /* JADX WARN: Code duplicated, block: B:242:0x0329  */
    /* JADX WARN: Code duplicated, block: B:244:0x032e  */
    /* JADX WARN: Code duplicated, block: B:247:0x0334  */
    /* JADX WARN: Code duplicated, block: B:249:0x0339  */
    /* JADX WARN: Code duplicated, block: B:251:0x033d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x033f  */
    /* JADX WARN: Code duplicated, block: B:254:0x0344  */
    /* JADX WARN: Code duplicated, block: B:257:0x034f  */
    /* JADX WARN: Code duplicated, block: B:258:0x0352  */
    /* JADX WARN: Code duplicated, block: B:262:0x035b  */
    /* JADX WARN: Code duplicated, block: B:264:0x0362  */
    /* JADX WARN: Code duplicated, block: B:266:0x0368  */
    /* JADX WARN: Code duplicated, block: B:268:0x0370  */
    /* JADX WARN: Code duplicated, block: B:272:0x037a  */
    /* JADX WARN: Code duplicated, block: B:274:0x0380  */
    /* JADX WARN: Code duplicated, block: B:278:0x0390  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:289:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:291:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:298:0x03f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:299:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:301:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:303:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:304:0x0400  */
    /* JADX WARN: Code duplicated, block: B:306:0x0404  */
    /* JADX WARN: Code duplicated, block: B:307:0x0406  */
    /* JADX WARN: Code duplicated, block: B:309:0x040a  */
    /* JADX WARN: Code duplicated, block: B:310:0x040d  */
    /* JADX WARN: Code duplicated, block: B:312:0x0411  */
    /* JADX WARN: Code duplicated, block: B:313:0x0414  */
    /* JADX WARN: Code duplicated, block: B:315:0x0418  */
    /* JADX WARN: Code duplicated, block: B:316:0x041b  */
    /* JADX WARN: Code duplicated, block: B:318:0x041f  */
    /* JADX WARN: Code duplicated, block: B:319:0x0422  */
    /* JADX WARN: Code duplicated, block: B:321:0x0426  */
    /* JADX WARN: Code duplicated, block: B:322:0x0429  */
    /* JADX WARN: Code duplicated, block: B:325:0x042f  */
    /* JADX WARN: Code duplicated, block: B:326:0x0439  */
    /* JADX WARN: Code duplicated, block: B:329:0x043f  */
    /* JADX WARN: Code duplicated, block: B:330:0x0442  */
    /* JADX WARN: Code duplicated, block: B:332:0x0446  */
    /* JADX WARN: Code duplicated, block: B:333:0x0449  */
    /* JADX WARN: Code duplicated, block: B:336:0x044e  */
    /* JADX WARN: Code duplicated, block: B:338:0x0452  */
    /* JADX WARN: Code duplicated, block: B:340:0x0458  */
    /* JADX WARN: Code duplicated, block: B:341:0x0465  */
    /* JADX WARN: Code duplicated, block: B:343:0x046c  */
    /* JADX WARN: Code duplicated, block: B:345:0x0474  */
    /* JADX WARN: Code duplicated, block: B:347:0x047a  */
    /* JADX WARN: Code duplicated, block: B:348:0x0487  */
    /* JADX WARN: Code duplicated, block: B:350:0x048c  */
    /* JADX WARN: Code duplicated, block: B:352:0x0492  */
    /* JADX WARN: Code duplicated, block: B:354:0x0498  */
    /* JADX WARN: Code duplicated, block: B:355:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:357:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:359:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:361:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:362:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:364:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:366:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:368:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:369:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:371:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:373:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:375:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:377:0x0504  */
    /* JADX WARN: Code duplicated, block: B:379:0x0507  */
    /* JADX WARN: Code duplicated, block: B:380:0x050a  */
    /* JADX WARN: Code duplicated, block: B:383:0x0510  */
    /* JADX WARN: Code duplicated, block: B:385:0x0516  */
    /* JADX WARN: Code duplicated, block: B:386:0x0523  */
    /* JADX WARN: Code duplicated, block: B:389:0x0554  */
    /* JADX WARN: Code duplicated, block: B:392:0x0589  */
    /* JADX WARN: Code duplicated, block: B:395:0x059d  */
    /* JADX WARN: Code duplicated, block: B:398:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:399:0x0601  */
    /* JADX WARN: Code duplicated, block: B:402:0x0616  */
    /* JADX WARN: Code duplicated, block: B:404:0x0624  */
    /* JADX WARN: Code duplicated, block: B:407:0x0658  */
    /* JADX WARN: Code duplicated, block: B:408:0x065c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:411:0x0669  */
    /* JADX WARN: Code duplicated, block: B:413:0x0677  */
    /* JADX WARN: Code duplicated, block: B:417:0x0690  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:420:0x06b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:421:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:424:0x06d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:425:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:428:0x074e  */
    /* JADX WARN: Code duplicated, block: B:430:0x076f  */
    /* JADX WARN: Code duplicated, block: B:432:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:434:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:435:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:438:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:440:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:444:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:447:0x080e  */
    /* JADX WARN: Code duplicated, block: B:448:0x0810  */
    /* JADX WARN: Code duplicated, block: B:451:0x0817 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:452:0x0819  */
    /* JADX WARN: Code duplicated, block: B:455:0x0853  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:469:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:473:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:474:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:477:0x0937  */
    /* JADX WARN: Code duplicated, block: B:478:0x093b  */
    /* JADX WARN: Code duplicated, block: B:481:0x0948  */
    /* JADX WARN: Code duplicated, block: B:483:0x0956  */
    /* JADX WARN: Code duplicated, block: B:486:0x0960  */
    /* JADX WARN: Code duplicated, block: B:487:0x0962  */
    /* JADX WARN: Code duplicated, block: B:490:0x0969  */
    /* JADX WARN: Code duplicated, block: B:493:0x0980  */
    /* JADX WARN: Code duplicated, block: B:496:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:499:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:502:0x0a46 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:506:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:519:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:522:0x0af6  */
    /* JADX WARN: Code duplicated, block: B:524:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x0101  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x0123  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0138  */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0149  */
    /* JADX WARN: Code duplicated, block: B:83:0x0150  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    /* JADX WARN: Code duplicated, block: B:87:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:92:0x016d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0172  */
    /* JADX WARN: Code duplicated, block: B:95:0x017a  */
    /* JADX WARN: Code duplicated, block: B:96:0x017d  */
    public static final void e(String str, final ht.q courseTestState, final ht.l audioPlayingState, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, float f5, float f11, boolean z16, boolean z17, String str2, final t1.d dVar, final t1.d dVar2, final t1.d dVar3, fz.e eVar, fz.f fVar, final t1.d dVar4, ns.z zVar, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, fz.a aVar, fz.a aVar2, final fz.a onClickPlayAudio, final fz.c cVar5, final fz.a getComboCount, final fz.a onClickChecked, ns.s sVar, fz.a aVar3, final fz.a onClickContinue, l1.n nVar, final int i11, final int i12, final int i13, final int i14, final int i15, final int i16) {
        String str3;
        int i17;
        boolean z18;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        fz.a aVar4;
        int i67;
        int i68;
        int i69;
        int iOrdinal;
        int i70;
        int i71;
        int i72;
        int i73;
        boolean z19;
        final boolean z20;
        final boolean z21;
        final boolean z22;
        final float f12;
        final float f13;
        final boolean z23;
        final String str4;
        final fz.e eVar2;
        final fz.f fVar2;
        final ns.z zVar2;
        final fz.c cVar6;
        final fz.c cVar7;
        final fz.c cVar8;
        final fz.c cVar9;
        final fz.a aVar5;
        final ns.s sVar2;
        final fz.a aVar6;
        final fz.a aVar7;
        l1.s sVar3;
        final boolean z24;
        final boolean z25;
        final boolean z26;
        final String str5;
        l1.x1 x1VarT;
        int i74;
        l1.g gVar;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        float f14;
        boolean z31;
        boolean z32;
        String strE0;
        fz.e eVar3;
        fz.f fVar3;
        ns.z zVar3;
        fz.c cVar10;
        fz.c cVar11;
        fz.c cVar12;
        fz.c cVar13;
        int i75;
        fz.a aVar8;
        fz.a aVar9;
        ns.s sVar4;
        fz.a aVar10;
        fz.a aVar11;
        int i76;
        fz.a aVar12;
        boolean z33;
        String str6;
        boolean z34;
        float f15;
        Object objQ;
        Object objQ2;
        Object objQ3;
        Object objQ4;
        Object objQ5;
        Object objQ6;
        Object objQ7;
        Object objQ8;
        final rz.b0 b0Var;
        kotlin.jvm.internal.u uVar;
        Object objQ9;
        final d0.d2 d2VarU;
        final d0.d2 d2VarU2;
        int iHashCode;
        z1.o oVar;
        y2.i iVar;
        fz.f fVar4;
        y2.h hVar;
        y2.h hVar2;
        y2.h hVar3;
        y2.h hVar4;
        int iHashCode2;
        double d5;
        float f16;
        boolean zH;
        Object objQ10;
        boolean zH2;
        Object objQ11;
        int iHashCode3;
        boolean z35;
        Object objQ12;
        boolean z36;
        boolean z37;
        fz.a aVar13;
        j0.r rVar;
        fz.f fVar5;
        int iHashCode4;
        boolean z38;
        Object objQ13;
        Object objQ14;
        Object objQ15;
        Object objQ16;
        boolean z39;
        Object objQ17;
        int i77;
        int i78;
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(cVar5, MzwEyWCkjXL.ikdUtySseOL);
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        l1.s sVar5 = (l1.s) nVar;
        sVar5.f0(906020778);
        int i79 = i15 & 1;
        if (i79 != 0) {
            i17 = i11 | 6;
            str3 = str;
        } else if ((i11 & 6) == 0) {
            str3 = str;
            i17 = i11 | (sVar5.f(str3) ? 4 : 2);
        } else {
            str3 = str;
            i17 = i11;
        }
        if ((i11 & 48) == 0) {
            i17 |= sVar5.d(courseTestState.ordinal()) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i17 |= sVar5.h(audioPlayingState) ? 256 : 128;
        }
        int i80 = i17;
        int i81 = i15 & 8;
        if (i81 == 0) {
            if ((i11 & 3072) == 0) {
                z18 = z11;
                i80 |= sVar5.g(z18) ? 2048 : 1024;
            }
            if ((i15 & 16) != 0) {
                i80 |= 24576;
                i18 = i79;
            } else {
                i18 = i79;
                if ((i11 & 24576) == 0) {
                    if (sVar5.g(false)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i80 |= i19;
                }
            }
            i21 = i15 & 32;
            if (i21 != 0) {
                i80 |= 196608;
                i23 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i22 = i11 & 196608;
                i23 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                if (i22 == 0) {
                    if (sVar5.g(z12)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i80 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i80 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (sVar5.g(z13)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i80 |= i26;
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                if ((i11 & 12582912) == 0) {
                    if (sVar5.g(z14)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i80 |= i28;
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (sVar5.g(z15)) {
                            i30 = 67108864;
                        } else {
                            i30 = 33554432;
                        }
                        i80 |= i30;
                    }
                    i31 = i80 | 805306368;
                    i32 = i15 & 1024;
                    if (i32 != 0) {
                        i34 = i12 | 6;
                    } else {
                        if (sVar5.c(f11)) {
                            i33 = 4;
                        } else {
                            i33 = 2;
                        }
                        i34 = i12 | i33;
                    }
                    i35 = i15 & 2048;
                    if (i35 != 0) {
                        i37 = i34 | 48;
                    } else {
                        if (sVar5.g(z16)) {
                            i36 = 32;
                        } else {
                            i36 = 16;
                        }
                        i37 = i34 | i36;
                    }
                    i38 = i37;
                    i39 = i15 & 4096;
                    if (i39 != 0) {
                        i41 = i38 | 384;
                    } else {
                        if (sVar5.g(z17)) {
                            i40 = 256;
                        } else {
                            i40 = 128;
                        }
                        i41 = i38 | i40;
                    }
                    i42 = i41 | (((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0 || !sVar5.f(str2)) ? 1024 : 2048);
                    i43 = i15 & i23;
                    if (i43 != 0) {
                        i42 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (sVar5.h(eVar)) {
                            i44 = 8388608;
                        } else {
                            i44 = 4194304;
                        }
                        i42 |= i44;
                    }
                    i45 = i15 & 262144;
                    if (i45 != 0) {
                        i42 |= 100663296;
                    } else if ((i12 & 100663296) == 0) {
                        if (sVar5.h(fVar)) {
                            i46 = 67108864;
                        } else {
                            i46 = 33554432;
                        }
                        i42 |= i46;
                    }
                    i47 = i42;
                    i48 = i15 & 1048576;
                    if (i48 != 0) {
                        i49 = i13 | 6;
                    } else if ((i13 & 6) == 0) {
                        if (sVar5.f(zVar)) {
                            i50 = 4;
                        } else {
                            i50 = 2;
                        }
                        i49 = i13 | i50;
                    } else {
                        i49 = i13;
                    }
                    i51 = i15 & 2097152;
                    if (i51 != 0) {
                        i49 |= 48;
                    } else if ((i13 & 48) == 0) {
                        if (sVar5.h(cVar)) {
                            i52 = 32;
                        } else {
                            i52 = 16;
                        }
                        i49 |= i52;
                    }
                    i53 = i49;
                    i54 = i15 & 4194304;
                    if (i54 != 0) {
                        i56 = i53 | 384;
                    } else {
                        i55 = i53;
                        if ((i13 & 384) != 0) {
                            if (sVar5.h(cVar2)) {
                                i57 = 256;
                            } else {
                                i57 = 128;
                            }
                            i55 |= i57;
                        }
                        i56 = i55;
                    }
                    i58 = i15 & 8388608;
                    if (i58 != 0) {
                        i60 = i56 | 3072;
                    } else {
                        i59 = i56;
                        if ((i13 & 3072) != 0) {
                            if (sVar5.h(cVar3)) {
                                i61 = 2048;
                            } else {
                                i61 = 1024;
                            }
                            i59 |= i61;
                        }
                        i60 = i59;
                    }
                    i62 = i15 & 16777216;
                    if (i62 != 0) {
                        i64 = i60 | 24576;
                    } else {
                        i63 = i60;
                        if ((i13 & 24576) == 0) {
                            i64 = i63 | (sVar5.h(cVar4) ? 16384 : 8192);
                        } else {
                            i64 = i63;
                        }
                    }
                    i65 = i15 & 33554432;
                    if (i65 != 0) {
                        i64 |= 196608;
                    } else if ((i13 & 196608) == 0) {
                        i64 |= sVar5.h(aVar) ? i23 : 65536;
                    }
                    i66 = i15 & 67108864;
                    if (i66 != 0) {
                        i64 |= 1572864;
                        aVar4 = aVar2;
                    } else {
                        aVar4 = aVar2;
                        if ((i13 & 1572864) == 0) {
                            i64 |= sVar5.h(aVar4) ? 1048576 : 524288;
                        }
                    }
                    if ((i13 & 12582912) == 0) {
                        i64 |= sVar5.h(onClickPlayAudio) ? 8388608 : 4194304;
                    }
                    if ((i13 & 100663296) == 0) {
                        i64 |= sVar5.h(cVar5) ? 67108864 : 33554432;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (sVar5.h(getComboCount)) {
                            i78 = 536870912;
                        } else {
                            i78 = 268435456;
                        }
                        i64 |= i78;
                    }
                    i67 = i64;
                    if ((i14 & 6) == 0) {
                        if (sVar5.h(onClickChecked)) {
                            i77 = 4;
                        } else {
                            i77 = 2;
                        }
                        i68 = i14 | i77;
                    } else {
                        i68 = i14;
                    }
                    i69 = i16 & 1;
                    if (i69 != 0) {
                        i68 |= 48;
                    } else if ((i14 & 48) == 0) {
                        if (sVar == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = sVar.ordinal();
                        }
                        if (sVar5.d(iOrdinal)) {
                            i70 = 32;
                        } else {
                            i70 = 16;
                        }
                        i68 |= i70;
                    }
                    i71 = i68;
                    i72 = i16 & 2;
                    if (i72 != 0) {
                        i73 = i71;
                        if ((i14 & 384) == 0) {
                            i73 |= sVar5.h(aVar3) ? 256 : 128;
                        }
                        if ((i14 & 3072) == 0) {
                            i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
                        }
                        int i82 = i73;
                        if ((i31 & 306783379) != 306783378 && (i47 & 306783379) == 306783378 && (i67 & 306783379) == 306783378 && (i82 & 1171) == 1170) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        if (sVar5.T(i31 & 1, z19)) {
                            sVar5.Y();
                            i74 = i11 & 1;
                            gVar = l1.m.f39353a;
                            if (i74 != 0 || sVar5.C()) {
                                if (i18 != 0) {
                                    str3 = BuildConfig.VERSION_NAME;
                                }
                                if (i81 != 0) {
                                    z18 = true;
                                }
                                if (i21 != 0) {
                                    z27 = true;
                                } else {
                                    z27 = z12;
                                }
                                if (i25 != 0) {
                                    z28 = true;
                                } else {
                                    z28 = z13;
                                }
                                if (i27 != 0) {
                                    z29 = false;
                                } else {
                                    z29 = z14;
                                }
                                if (i29 != 0) {
                                    z30 = false;
                                } else {
                                    z30 = z15;
                                }
                                if (i32 != 0) {
                                    f14 = 1.0f;
                                } else {
                                    f14 = f11;
                                }
                                if (i35 != 0) {
                                    z31 = false;
                                } else {
                                    z31 = z16;
                                }
                                if (i39 != 0) {
                                    z32 = false;
                                } else {
                                    z32 = z17;
                                }
                                if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                    strE0 = ub.a.e0(sVar5, R.string.test_check);
                                    i47 &= -7169;
                                } else {
                                    strE0 = str2;
                                }
                                if (i43 != 0) {
                                    eVar3 = null;
                                } else {
                                    eVar3 = eVar;
                                }
                                if (i45 != 0) {
                                    fVar3 = null;
                                } else {
                                    fVar3 = fVar;
                                }
                                zVar3 = i48 == 0 ? zVar : null;
                                if (i51 != 0) {
                                    objQ7 = sVar5.Q();
                                    if (objQ7 == gVar) {
                                        objQ7 = new d0.y1(19);
                                        sVar5.o0(objQ7);
                                    }
                                    cVar10 = (fz.c) objQ7;
                                } else {
                                    z27 = z27;
                                    cVar10 = cVar;
                                }
                                if (i54 != 0) {
                                    objQ6 = sVar5.Q();
                                    if (objQ6 == gVar) {
                                        objQ6 = new d0.y1(19);
                                        sVar5.o0(objQ6);
                                    }
                                    cVar11 = (fz.c) objQ6;
                                } else {
                                    cVar10 = cVar10;
                                    cVar11 = cVar2;
                                }
                                if (i58 != 0) {
                                    objQ5 = sVar5.Q();
                                    if (objQ5 == gVar) {
                                        objQ5 = new d0.y1(18);
                                        sVar5.o0(objQ5);
                                    }
                                    cVar12 = (fz.c) objQ5;
                                } else {
                                    cVar11 = cVar11;
                                    cVar12 = cVar3;
                                }
                                if (i62 != 0) {
                                    objQ4 = sVar5.Q();
                                    if (objQ4 == gVar) {
                                        objQ4 = new d0.y1(19);
                                        sVar5.o0(objQ4);
                                    }
                                    cVar13 = (fz.c) objQ4;
                                } else {
                                    cVar12 = cVar12;
                                    cVar13 = cVar4;
                                }
                                if (i65 != 0) {
                                    objQ3 = sVar5.Q();
                                    if (objQ3 == gVar) {
                                        i75 = 15;
                                        objQ3 = new cr.m(15);
                                        sVar5.o0(objQ3);
                                    } else {
                                        i75 = 15;
                                    }
                                    aVar8 = (fz.a) objQ3;
                                } else {
                                    cVar13 = cVar13;
                                    i75 = 15;
                                    aVar8 = aVar;
                                }
                                if (i66 != 0) {
                                    objQ2 = sVar5.Q();
                                    if (objQ2 == gVar) {
                                        objQ2 = new cr.m(i75);
                                        sVar5.o0(objQ2);
                                    }
                                    aVar9 = (fz.a) objQ2;
                                } else {
                                    aVar9 = aVar4;
                                }
                                if (i69 != 0) {
                                    sVar4 = ns.s.OTHER_LOCAL;
                                } else {
                                    sVar4 = sVar;
                                }
                                aVar10 = aVar9;
                                if (i72 != 0) {
                                    objQ = sVar5.Q();
                                    if (objQ == gVar) {
                                        objQ = new cr.m(15);
                                        sVar5.o0(objQ);
                                    }
                                    i76 = 16;
                                    aVar12 = (fz.a) objQ;
                                    aVar11 = aVar8;
                                } else {
                                    aVar11 = aVar8;
                                    i76 = 16;
                                    aVar12 = aVar3;
                                }
                                z33 = z28;
                                str6 = str3;
                                z34 = z29;
                                f15 = 1.0f;
                            } else {
                                sVar5.W();
                                if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                    i47 &= -7169;
                                }
                                z27 = z12;
                                f15 = f5;
                                f14 = f11;
                                z31 = z16;
                                z32 = z17;
                                eVar3 = eVar;
                                cVar10 = cVar;
                                cVar11 = cVar2;
                                cVar12 = cVar3;
                                cVar13 = cVar4;
                                aVar11 = aVar;
                                sVar4 = sVar;
                                aVar12 = aVar3;
                                i47 = i47;
                                aVar10 = aVar4;
                                z18 = z18;
                                str6 = str3;
                                i76 = 16;
                                z33 = z13;
                                z34 = z14;
                                z30 = z15;
                                fVar3 = fVar;
                                zVar3 = zVar;
                                strE0 = str2;
                            }
                            sVar5.q();
                            ns.z zVar4 = zVar3;
                            objQ8 = sVar5.Q();
                            if (objQ8 == gVar) {
                                objQ8 = l1.t.q(sVar5);
                                sVar5.o0(objQ8);
                            }
                            b0Var = (rz.b0) objQ8;
                            uVar = new kotlin.jvm.internal.u();
                            objQ9 = sVar5.Q();
                            if (objQ9 == gVar) {
                                objQ9 = Boolean.FALSE;
                                sVar5.o0(objQ9);
                            }
                            uVar.f38357a = ((Boolean) objQ9).booleanValue();
                            d2VarU = d0.n.u(sVar5);
                            d2VarU2 = d0.n.u(sVar5);
                            String str7 = str6;
                            Context context = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                            boolean zBooleanValue = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                            z1.j jVar = z1.c.f58463a;
                            boolean z40 = z27;
                            boolean z41 = z33;
                            w2.q0 q0VarD = j0.o.d(jVar, false);
                            iHashCode = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL = sVar5.l();
                            ns.s sVar6 = sVar4;
                            oVar = z1.o.f58481a;
                            boolean z42 = z34;
                            z1.r rVarC = z1.a.c(sVar5, oVar);
                            y2.k.J.getClass();
                            fz.a aVar14 = aVar12;
                            iVar = y2.j.f56913b;
                            sVar5.h0();
                            fVar4 = fVar3;
                            if (sVar5.S) {
                                sVar5.k(iVar);
                            } else {
                                sVar5.r0();
                            }
                            hVar = y2.j.f56917f;
                            l1.t.J(hVar, q0VarD, sVar5);
                            hVar2 = y2.j.f56916e;
                            l1.t.J(hVar2, q1VarL, sVar5);
                            hVar3 = y2.j.f56918g;
                            fz.a aVar15 = aVar11;
                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                            }
                            hVar4 = y2.j.f56915d;
                            l1.t.J(hVar4, rVarC, sVar5);
                            z1.r rVarR = j0.c.r(j0.e2.d(oVar, 1.0f));
                            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                            iHashCode2 = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL2 = sVar5.l();
                            z1.r rVarC2 = z1.a.c(sVar5, rVarR);
                            sVar5.h0();
                            if (sVar5.S) {
                                sVar5.k(iVar);
                            } else {
                                sVar5.r0();
                            }
                            l1.t.J(hVar, uVarA, sVar5);
                            l1.t.J(hVar2, q1VarL2, sVar5);
                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode2))) {
                                defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                            }
                            l1.t.J(hVar4, rVarC2, sVar5);
                            z1.r rVarE = j0.e2.e(oVar, 1.0f);
                            d5 = 1.0f;
                            if (d5 <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            f16 = i76;
                            z1.r rVarC3 = j0.c.C(w4.c.p(1.0f, true, rVarE), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                            objQ10 = sVar5.Q();
                            if (zH || objQ10 == gVar) {
                                final int i83 = 0;
                                objQ10 = new fz.a() { // from class: dt.y2
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i83) {
                                            case 0:
                                                rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                                break;
                                            default:
                                                rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar5.o0(objQ10);
                            }
                            fz.a aVar16 = (fz.a) objQ10;
                            zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                            objQ11 = sVar5.Q();
                            if (zH2 || objQ11 == gVar) {
                                final int i84 = 1;
                                objQ11 = new fz.a() { // from class: dt.y2
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i84) {
                                            case 0:
                                                rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                                break;
                                            default:
                                                rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar5.o0(objQ11);
                            }
                            int i85 = i31 >> 12;
                            int i86 = (i31 & 14) | (i85 & 112) | (i85 & 896) | (i85 & 7168) | ((i31 >> 15) & 57344);
                            int i87 = i47 << 15;
                            int i88 = i67 << 18;
                            b(str7, z40, z41, z42, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC3, dVar, dVar2, dVar3, eVar3, aVar10, aVar16, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i86 | (i87 & 458752) | (3670016 & i87) | (i87 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i88) | (234881024 & i88) | (i88 & 1879048192), (i67 >> 12) & 14);
                            boolean z43 = z31;
                            float f17 = f14;
                            float f18 = f15;
                            str3 = str7;
                            if (courseTestState == ht.q.CHECKING) {
                                sVar5.d0(1774820302);
                                z1.r rVarG = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                                objQ17 = sVar5.Q();
                                if (objQ17 == gVar) {
                                    objQ17 = new cr.m(15);
                                    sVar5.o0(objQ17);
                                }
                                iu.k.e((fz.a) objQ17, rVarG, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                                z36 = false;
                                sVar5.p(false);
                                z37 = true;
                            } else {
                                sVar5.d0(1775330221);
                                j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                                iHashCode3 = Long.hashCode(sVar5.T);
                                l1.q1 q1VarL3 = sVar5.l();
                                z1.r rVarC4 = z1.a.c(sVar5, oVar);
                                sVar5.h0();
                                if (sVar5.S) {
                                    sVar5.k(iVar);
                                } else {
                                    sVar5.r0();
                                }
                                l1.t.J(hVar, a2VarA, sVar5);
                                l1.t.J(hVar2, q1VarL3, sVar5);
                                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                                    defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                                }
                                l1.t.J(hVar4, rVarC4, sVar5);
                                if (d5 <= 0.0d) {
                                    k0.a.a("invalid weight; must be greater than zero");
                                }
                                j0.i1 i1Var = new j0.i1(1.0f, true);
                                if ((i31 & 112) == 32) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                objQ12 = sVar5.Q();
                                if (z35 || objQ12 == gVar) {
                                    objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                                    sVar5.o0(objQ12);
                                }
                                String str8 = strE0;
                                a0.g(courseTestState, g2.f0.q(i1Var, (fz.c) objQ12), str8, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                                strE0 = str8;
                                if (z30 || courseTestState != ht.q.DEFAULT) {
                                    z36 = false;
                                    sVar5.d0(393996308);
                                } else {
                                    sVar5.d0(404014361);
                                    boolean z44 = (i67 & 458752) == i23;
                                    Object objQ18 = sVar5.Q();
                                    if (z44 || objQ18 == gVar) {
                                        aVar13 = aVar15;
                                        objQ18 = new ch.o0(19, aVar13);
                                        sVar5.o0(objQ18);
                                    } else {
                                        aVar13 = aVar15;
                                    }
                                    aVar15 = aVar13;
                                    z1.r rVarY = j0.c.y(j0.c.v(oVar), -8, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    j0.v1 v1Var = h1.j0.f30447a;
                                    k7.m((fz.a) objQ18, rVarY, false, null, h1.j0.g(0L, ((h1.s1) sVar5.j(h1.v1.f31180a)).f31036s, sVar5, 13), null, e.f23764k, sVar5, 805306368, 492);
                                    z36 = false;
                                }
                                sVar5.p(z36);
                                z37 = true;
                                sVar5.p(true);
                                sVar5.p(z36);
                            }
                            sVar5.p(z37);
                            rVar = j0.r.f35391a;
                            if (fVar4 == null) {
                                sVar5.d0(1152060677);
                                sVar5.p(z36);
                                fVar5 = fVar4;
                            } else {
                                sVar5.d0(452805244);
                                fVar5 = fVar4;
                                fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                                sVar5.p(z36);
                            }
                            z1.r rVarA = rVar.a(oVar, z1.c.H);
                            w2.q0 q0VarD2 = j0.o.d(jVar, z36);
                            fz.f fVar6 = fVar5;
                            iHashCode4 = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL4 = sVar5.l();
                            z1.r rVarC5 = z1.a.c(sVar5, rVarA);
                            sVar5.h0();
                            if (sVar5.S) {
                                sVar5.k(iVar);
                            } else {
                                sVar5.r0();
                            }
                            l1.t.J(hVar, q0VarD2, sVar5);
                            l1.t.J(hVar2, q1VarL4, sVar5);
                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                                defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                            }
                            l1.t.J(hVar4, rVarC5, sVar5);
                            if (courseTestState == ht.q.REVISING) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            objQ13 = sVar5.Q();
                            if (objQ13 == gVar) {
                                objQ13 = new d0.y1(20);
                                sVar5.o0(objQ13);
                            }
                            a0.l1 l1VarC = a0.f1.c((fz.c) objQ13, 7);
                            objQ14 = sVar5.Q();
                            if (objQ14 == gVar) {
                                objQ14 = new d0.y1(21);
                                sVar5.o0(objQ14);
                            }
                            a0.j0.d(z38, null, l1VarC, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar6, aVar14), sVar5), sVar5, 200064, 18);
                            ht.q qVar = ht.q.CORRECT;
                            boolean zD = ry.l.D(new ht.q[]{qVar, ht.q.WRONG}, courseTestState);
                            objQ15 = sVar5.Q();
                            if (objQ15 == gVar) {
                                objQ15 = new d0.y1(22);
                                sVar5.o0(objQ15);
                            }
                            a0.l1 l1VarC2 = a0.f1.c((fz.c) objQ15, 7);
                            objQ16 = sVar5.Q();
                            if (objQ16 == gVar) {
                                objQ16 = new d0.y1(23);
                                sVar5.o0(objQ16);
                            }
                            a0.j0.d(zD, null, l1VarC2, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context, getComboCount, audioPlayingState, zVar4, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                            sVar5.p(true);
                            int iIntValue = ((Number) getComboCount.invoke()).intValue();
                            if (z18 || !((iIntValue == 5 || iIntValue == 10) && courseTestState == qVar && zBooleanValue)) {
                                z39 = false;
                                sVar5.d0(1141210802);
                            } else {
                                sVar5.d0(1155786909);
                                z39 = false;
                                a(iIntValue == 5 ? R.raw.course_combo_5 : R.raw.course_combo_10, 0, sVar5, rVar.a(j0.c.j(j0.e2.e(j0.c.C(oVar, 24, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 0.6059524f), z1.c.f58464b));
                            }
                            sVar5.p(z39);
                            sVar5.p(true);
                            z24 = z18;
                            z22 = z30;
                            str4 = strE0;
                            z20 = z40;
                            z21 = z41;
                            sVar3 = sVar5;
                            z25 = z42;
                            z26 = z32;
                            z23 = z43;
                            zVar2 = zVar4;
                            cVar6 = cVar10;
                            cVar7 = cVar11;
                            cVar8 = cVar12;
                            cVar9 = cVar13;
                            aVar5 = aVar15;
                            sVar2 = sVar6;
                            aVar6 = aVar14;
                            f12 = f18;
                            f13 = f17;
                            eVar2 = eVar3;
                            aVar7 = aVar10;
                            fVar2 = fVar6;
                        } else {
                            sVar5.W();
                            z20 = z12;
                            z21 = z13;
                            z22 = z15;
                            f12 = f5;
                            f13 = f11;
                            z23 = z16;
                            str4 = str2;
                            eVar2 = eVar;
                            fVar2 = fVar;
                            zVar2 = zVar;
                            cVar6 = cVar;
                            cVar7 = cVar2;
                            cVar8 = cVar3;
                            cVar9 = cVar4;
                            aVar5 = aVar;
                            sVar2 = sVar;
                            aVar6 = aVar3;
                            aVar7 = aVar4;
                            sVar3 = sVar5;
                            z24 = z18;
                            z25 = z14;
                            z26 = z17;
                        }
                        str5 = str3;
                        x1VarT = sVar3.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new fz.e() { // from class: dt.x2
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iM = l1.t.M(i11 | 1);
                                    int iM2 = l1.t.M(i12);
                                    int iM3 = l1.t.M(i13);
                                    int iM4 = l1.t.M(i14);
                                    k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i73 = i71 | 384;
                    if ((i14 & 3072) == 0) {
                        i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
                    }
                    int i89 = i73;
                    if ((i31 & 306783379) != 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (sVar5.T(i31 & 1, z19)) {
                        sVar5.Y();
                        i74 = i11 & 1;
                        gVar = l1.m.f39353a;
                        if (i74 != 0) {
                            if (i18 != 0) {
                                str3 = BuildConfig.VERSION_NAME;
                            }
                            if (i81 != 0) {
                                z18 = true;
                            }
                            if (i21 != 0) {
                                z27 = true;
                            } else {
                                z27 = z12;
                            }
                            if (i25 != 0) {
                                z28 = true;
                            } else {
                                z28 = z13;
                            }
                            if (i27 != 0) {
                                z29 = false;
                            } else {
                                z29 = z14;
                            }
                            if (i29 != 0) {
                                z30 = false;
                            } else {
                                z30 = z15;
                            }
                            if (i32 != 0) {
                                f14 = 1.0f;
                            } else {
                                f14 = f11;
                            }
                            if (i35 != 0) {
                                z31 = false;
                            } else {
                                z31 = z16;
                            }
                            if (i39 != 0) {
                                z32 = false;
                            } else {
                                z32 = z17;
                            }
                            if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                strE0 = ub.a.e0(sVar5, R.string.test_check);
                                i47 &= -7169;
                            } else {
                                strE0 = str2;
                            }
                            if (i43 != 0) {
                                eVar3 = null;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i45 != 0) {
                                fVar3 = null;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i48 == 0) {
                            }
                            if (i51 != 0) {
                                objQ7 = sVar5.Q();
                                if (objQ7 == gVar) {
                                    objQ7 = new d0.y1(19);
                                    sVar5.o0(objQ7);
                                }
                                cVar10 = (fz.c) objQ7;
                            } else {
                                z27 = z27;
                                cVar10 = cVar;
                            }
                            if (i54 != 0) {
                                objQ6 = sVar5.Q();
                                if (objQ6 == gVar) {
                                    objQ6 = new d0.y1(19);
                                    sVar5.o0(objQ6);
                                }
                                cVar11 = (fz.c) objQ6;
                            } else {
                                cVar10 = cVar10;
                                cVar11 = cVar2;
                            }
                            if (i58 != 0) {
                                objQ5 = sVar5.Q();
                                if (objQ5 == gVar) {
                                    objQ5 = new d0.y1(18);
                                    sVar5.o0(objQ5);
                                }
                                cVar12 = (fz.c) objQ5;
                            } else {
                                cVar11 = cVar11;
                                cVar12 = cVar3;
                            }
                            if (i62 != 0) {
                                objQ4 = sVar5.Q();
                                if (objQ4 == gVar) {
                                    objQ4 = new d0.y1(19);
                                    sVar5.o0(objQ4);
                                }
                                cVar13 = (fz.c) objQ4;
                            } else {
                                cVar12 = cVar12;
                                cVar13 = cVar4;
                            }
                            if (i65 != 0) {
                                objQ3 = sVar5.Q();
                                if (objQ3 == gVar) {
                                    i75 = 15;
                                    objQ3 = new cr.m(15);
                                    sVar5.o0(objQ3);
                                } else {
                                    i75 = 15;
                                }
                                aVar8 = (fz.a) objQ3;
                            } else {
                                cVar13 = cVar13;
                                i75 = 15;
                                aVar8 = aVar;
                            }
                            if (i66 != 0) {
                                objQ2 = sVar5.Q();
                                if (objQ2 == gVar) {
                                    objQ2 = new cr.m(i75);
                                    sVar5.o0(objQ2);
                                }
                                aVar9 = (fz.a) objQ2;
                            } else {
                                aVar9 = aVar4;
                            }
                            if (i69 != 0) {
                                sVar4 = ns.s.OTHER_LOCAL;
                            } else {
                                sVar4 = sVar;
                            }
                            aVar10 = aVar9;
                            if (i72 != 0) {
                                objQ = sVar5.Q();
                                if (objQ == gVar) {
                                    objQ = new cr.m(15);
                                    sVar5.o0(objQ);
                                }
                                i76 = 16;
                                aVar12 = (fz.a) objQ;
                                aVar11 = aVar8;
                            } else {
                                aVar11 = aVar8;
                                i76 = 16;
                                aVar12 = aVar3;
                            }
                            z33 = z28;
                            str6 = str3;
                            z34 = z29;
                            f15 = 1.0f;
                        } else {
                            if (i18 != 0) {
                                str3 = BuildConfig.VERSION_NAME;
                            }
                            if (i81 != 0) {
                                z18 = true;
                            }
                            if (i21 != 0) {
                                z27 = true;
                            } else {
                                z27 = z12;
                            }
                            if (i25 != 0) {
                                z28 = true;
                            } else {
                                z28 = z13;
                            }
                            if (i27 != 0) {
                                z29 = false;
                            } else {
                                z29 = z14;
                            }
                            if (i29 != 0) {
                                z30 = false;
                            } else {
                                z30 = z15;
                            }
                            if (i32 != 0) {
                                f14 = 1.0f;
                            } else {
                                f14 = f11;
                            }
                            if (i35 != 0) {
                                z31 = false;
                            } else {
                                z31 = z16;
                            }
                            if (i39 != 0) {
                                z32 = false;
                            } else {
                                z32 = z17;
                            }
                            if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                strE0 = ub.a.e0(sVar5, R.string.test_check);
                                i47 &= -7169;
                            } else {
                                strE0 = str2;
                            }
                            if (i43 != 0) {
                                eVar3 = null;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i45 != 0) {
                                fVar3 = null;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i48 == 0) {
                            }
                            if (i51 != 0) {
                                objQ7 = sVar5.Q();
                                if (objQ7 == gVar) {
                                    objQ7 = new d0.y1(19);
                                    sVar5.o0(objQ7);
                                }
                                cVar10 = (fz.c) objQ7;
                            } else {
                                z27 = z27;
                                cVar10 = cVar;
                            }
                            if (i54 != 0) {
                                objQ6 = sVar5.Q();
                                if (objQ6 == gVar) {
                                    objQ6 = new d0.y1(19);
                                    sVar5.o0(objQ6);
                                }
                                cVar11 = (fz.c) objQ6;
                            } else {
                                cVar10 = cVar10;
                                cVar11 = cVar2;
                            }
                            if (i58 != 0) {
                                objQ5 = sVar5.Q();
                                if (objQ5 == gVar) {
                                    objQ5 = new d0.y1(18);
                                    sVar5.o0(objQ5);
                                }
                                cVar12 = (fz.c) objQ5;
                            } else {
                                cVar11 = cVar11;
                                cVar12 = cVar3;
                            }
                            if (i62 != 0) {
                                objQ4 = sVar5.Q();
                                if (objQ4 == gVar) {
                                    objQ4 = new d0.y1(19);
                                    sVar5.o0(objQ4);
                                }
                                cVar13 = (fz.c) objQ4;
                            } else {
                                cVar12 = cVar12;
                                cVar13 = cVar4;
                            }
                            if (i65 != 0) {
                                objQ3 = sVar5.Q();
                                if (objQ3 == gVar) {
                                    i75 = 15;
                                    objQ3 = new cr.m(15);
                                    sVar5.o0(objQ3);
                                } else {
                                    i75 = 15;
                                }
                                aVar8 = (fz.a) objQ3;
                            } else {
                                cVar13 = cVar13;
                                i75 = 15;
                                aVar8 = aVar;
                            }
                            if (i66 != 0) {
                                objQ2 = sVar5.Q();
                                if (objQ2 == gVar) {
                                    objQ2 = new cr.m(i75);
                                    sVar5.o0(objQ2);
                                }
                                aVar9 = (fz.a) objQ2;
                            } else {
                                aVar9 = aVar4;
                            }
                            if (i69 != 0) {
                                sVar4 = ns.s.OTHER_LOCAL;
                            } else {
                                sVar4 = sVar;
                            }
                            aVar10 = aVar9;
                            if (i72 != 0) {
                                objQ = sVar5.Q();
                                if (objQ == gVar) {
                                    objQ = new cr.m(15);
                                    sVar5.o0(objQ);
                                }
                                i76 = 16;
                                aVar12 = (fz.a) objQ;
                                aVar11 = aVar8;
                            } else {
                                aVar11 = aVar8;
                                i76 = 16;
                                aVar12 = aVar3;
                            }
                            z33 = z28;
                            str6 = str3;
                            z34 = z29;
                            f15 = 1.0f;
                        }
                        sVar5.q();
                        ns.z zVar5 = zVar3;
                        objQ8 = sVar5.Q();
                        if (objQ8 == gVar) {
                            objQ8 = l1.t.q(sVar5);
                            sVar5.o0(objQ8);
                        }
                        b0Var = (rz.b0) objQ8;
                        uVar = new kotlin.jvm.internal.u();
                        objQ9 = sVar5.Q();
                        if (objQ9 == gVar) {
                            objQ9 = Boolean.FALSE;
                            sVar5.o0(objQ9);
                        }
                        uVar.f38357a = ((Boolean) objQ9).booleanValue();
                        d2VarU = d0.n.u(sVar5);
                        d2VarU2 = d0.n.u(sVar5);
                        String str9 = str6;
                        Context context2 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                        boolean zBooleanValue2 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                        z1.j jVar2 = z1.c.f58463a;
                        boolean z45 = z27;
                        boolean z46 = z33;
                        w2.q0 q0VarD3 = j0.o.d(jVar2, false);
                        iHashCode = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL5 = sVar5.l();
                        ns.s sVar7 = sVar4;
                        oVar = z1.o.f58481a;
                        boolean z47 = z34;
                        z1.r rVarC6 = z1.a.c(sVar5, oVar);
                        y2.k.J.getClass();
                        fz.a aVar17 = aVar12;
                        iVar = y2.j.f56913b;
                        sVar5.h0();
                        fVar4 = fVar3;
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        hVar = y2.j.f56917f;
                        l1.t.J(hVar, q0VarD3, sVar5);
                        hVar2 = y2.j.f56916e;
                        l1.t.J(hVar2, q1VarL5, sVar5);
                        hVar3 = y2.j.f56918g;
                        fz.a aVar18 = aVar11;
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                        } else {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                        }
                        hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC6, sVar5);
                        z1.r rVarR2 = j0.c.r(j0.e2.d(oVar, 1.0f));
                        j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                        iHashCode2 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL6 = sVar5.l();
                        z1.r rVarC7 = z1.a.c(sVar5, rVarR2);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, uVarA2, sVar5);
                        l1.t.J(hVar2, q1VarL6, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                        } else {
                            defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                        }
                        l1.t.J(hVar4, rVarC7, sVar5);
                        z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
                        d5 = 1.0f;
                        if (d5 <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        f16 = i76;
                        z1.r rVarC8 = j0.c.C(w4.c.p(1.0f, true, rVarE2), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                        objQ10 = sVar5.Q();
                        if (zH) {
                            final int i810 = 0;
                            objQ10 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i810) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ10);
                        } else {
                            final int i811 = 0;
                            objQ10 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i811) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ10);
                        }
                        fz.a aVar19 = (fz.a) objQ10;
                        zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                        objQ11 = sVar5.Q();
                        if (zH2) {
                            final int i812 = 1;
                            objQ11 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i812) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ11);
                        } else {
                            final int i813 = 1;
                            objQ11 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i813) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ11);
                        }
                        int i814 = i31 >> 12;
                        int i815 = (i31 & 14) | (i814 & 112) | (i814 & 896) | (i814 & 7168) | ((i31 >> 15) & 57344);
                        int i816 = i47 << 15;
                        int i817 = i67 << 18;
                        b(str9, z45, z46, z47, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC8, dVar, dVar2, dVar3, eVar3, aVar10, aVar19, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i815 | (i816 & 458752) | (3670016 & i816) | (i816 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i817) | (234881024 & i817) | (i817 & 1879048192), (i67 >> 12) & 14);
                        boolean z48 = z31;
                        float f19 = f14;
                        float f110 = f15;
                        str3 = str9;
                        if (courseTestState == ht.q.CHECKING) {
                            sVar5.d0(1774820302);
                            z1.r rVarG2 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                            objQ17 = sVar5.Q();
                            if (objQ17 == gVar) {
                                objQ17 = new cr.m(15);
                                sVar5.o0(objQ17);
                            }
                            iu.k.e((fz.a) objQ17, rVarG2, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                            z36 = false;
                            sVar5.p(false);
                            z37 = true;
                        } else {
                            sVar5.d0(1775330221);
                            j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                            iHashCode3 = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL7 = sVar5.l();
                            z1.r rVarC9 = z1.a.c(sVar5, oVar);
                            sVar5.h0();
                            if (sVar5.S) {
                                sVar5.k(iVar);
                            } else {
                                sVar5.r0();
                            }
                            l1.t.J(hVar, a2VarA2, sVar5);
                            l1.t.J(hVar2, q1VarL7, sVar5);
                            if (sVar5.S) {
                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                            } else {
                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                            }
                            l1.t.J(hVar4, rVarC9, sVar5);
                            if (d5 <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            j0.i1 i1Var2 = new j0.i1(1.0f, true);
                            if ((i31 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            objQ12 = sVar5.Q();
                            if (z35) {
                                objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                                sVar5.o0(objQ12);
                            } else {
                                objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                                sVar5.o0(objQ12);
                            }
                            String str10 = strE0;
                            a0.g(courseTestState, g2.f0.q(i1Var2, (fz.c) objQ12), str10, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                            strE0 = str10;
                            if (z30) {
                                z36 = false;
                                sVar5.d0(393996308);
                            } else {
                                z36 = false;
                                sVar5.d0(393996308);
                            }
                            sVar5.p(z36);
                            z37 = true;
                            sVar5.p(true);
                            sVar5.p(z36);
                        }
                        sVar5.p(z37);
                        rVar = j0.r.f35391a;
                        if (fVar4 == null) {
                            sVar5.d0(1152060677);
                            sVar5.p(z36);
                            fVar5 = fVar4;
                        } else {
                            sVar5.d0(452805244);
                            fVar5 = fVar4;
                            fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                            sVar5.p(z36);
                        }
                        z1.r rVarA2 = rVar.a(oVar, z1.c.H);
                        w2.q0 q0VarD4 = j0.o.d(jVar2, z36);
                        fz.f fVar7 = fVar5;
                        iHashCode4 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL8 = sVar5.l();
                        z1.r rVarC10 = z1.a.c(sVar5, rVarA2);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, q0VarD4, sVar5);
                        l1.t.J(hVar2, q1VarL8, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                        } else {
                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                        }
                        l1.t.J(hVar4, rVarC10, sVar5);
                        if (courseTestState == ht.q.REVISING) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objQ13 = sVar5.Q();
                        if (objQ13 == gVar) {
                            objQ13 = new d0.y1(20);
                            sVar5.o0(objQ13);
                        }
                        a0.l1 l1VarC3 = a0.f1.c((fz.c) objQ13, 7);
                        objQ14 = sVar5.Q();
                        if (objQ14 == gVar) {
                            objQ14 = new d0.y1(21);
                            sVar5.o0(objQ14);
                        }
                        a0.j0.d(z38, null, l1VarC3, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar7, aVar17), sVar5), sVar5, 200064, 18);
                        ht.q qVar2 = ht.q.CORRECT;
                        boolean zD2 = ry.l.D(new ht.q[]{qVar2, ht.q.WRONG}, courseTestState);
                        objQ15 = sVar5.Q();
                        if (objQ15 == gVar) {
                            objQ15 = new d0.y1(22);
                            sVar5.o0(objQ15);
                        }
                        a0.l1 l1VarC4 = a0.f1.c((fz.c) objQ15, 7);
                        objQ16 = sVar5.Q();
                        if (objQ16 == gVar) {
                            objQ16 = new d0.y1(23);
                            sVar5.o0(objQ16);
                        }
                        a0.j0.d(zD2, null, l1VarC4, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context2, getComboCount, audioPlayingState, zVar5, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                        sVar5.p(true);
                        int iIntValue2 = ((Number) getComboCount.invoke()).intValue();
                        if (z18) {
                            z39 = false;
                            sVar5.d0(1141210802);
                        } else {
                            z39 = false;
                            sVar5.d0(1141210802);
                        }
                        sVar5.p(z39);
                        sVar5.p(true);
                        z24 = z18;
                        z22 = z30;
                        str4 = strE0;
                        z20 = z45;
                        z21 = z46;
                        sVar3 = sVar5;
                        z25 = z47;
                        z26 = z32;
                        z23 = z48;
                        zVar2 = zVar5;
                        cVar6 = cVar10;
                        cVar7 = cVar11;
                        cVar8 = cVar12;
                        cVar9 = cVar13;
                        aVar5 = aVar18;
                        sVar2 = sVar7;
                        aVar6 = aVar17;
                        f12 = f110;
                        f13 = f19;
                        eVar2 = eVar3;
                        aVar7 = aVar10;
                        fVar2 = fVar7;
                    } else {
                        sVar5.W();
                        z20 = z12;
                        z21 = z13;
                        z22 = z15;
                        f12 = f5;
                        f13 = f11;
                        z23 = z16;
                        str4 = str2;
                        eVar2 = eVar;
                        fVar2 = fVar;
                        zVar2 = zVar;
                        cVar6 = cVar;
                        cVar7 = cVar2;
                        cVar8 = cVar3;
                        cVar9 = cVar4;
                        aVar5 = aVar;
                        sVar2 = sVar;
                        aVar6 = aVar3;
                        aVar7 = aVar4;
                        sVar3 = sVar5;
                        z24 = z18;
                        z25 = z14;
                        z26 = z17;
                    }
                    str5 = str3;
                    x1VarT = sVar3.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.x2
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM = l1.t.M(i11 | 1);
                                int iM2 = l1.t.M(i12);
                                int iM3 = l1.t.M(i13);
                                int iM4 = l1.t.M(i14);
                                k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i80 |= 100663296;
                i31 = i80 | 805306368;
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i34 = i12 | 6;
                } else {
                    if (sVar5.c(f11)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i34 = i12 | i33;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i37 = i34 | 48;
                } else {
                    if (sVar5.g(z16)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i37 = i34 | i36;
                }
                i38 = i37;
                i39 = i15 & 4096;
                if (i39 != 0) {
                    i41 = i38 | 384;
                } else {
                    if (sVar5.g(z17)) {
                        i40 = 256;
                    } else {
                        i40 = 128;
                    }
                    i41 = i38 | i40;
                }
                i42 = i41 | (((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0 || !sVar5.f(str2)) ? 1024 : 2048);
                i43 = i15 & i23;
                if (i43 != 0) {
                    i42 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (sVar5.h(eVar)) {
                        i44 = 8388608;
                    } else {
                        i44 = 4194304;
                    }
                    i42 |= i44;
                }
                i45 = i15 & 262144;
                if (i45 != 0) {
                    i42 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (sVar5.h(fVar)) {
                        i46 = 67108864;
                    } else {
                        i46 = 33554432;
                    }
                    i42 |= i46;
                }
                i47 = i42;
                i48 = i15 & 1048576;
                if (i48 != 0) {
                    i49 = i13 | 6;
                } else if ((i13 & 6) == 0) {
                    if (sVar5.f(zVar)) {
                        i50 = 4;
                    } else {
                        i50 = 2;
                    }
                    i49 = i13 | i50;
                } else {
                    i49 = i13;
                }
                i51 = i15 & 2097152;
                if (i51 != 0) {
                    i49 |= 48;
                } else if ((i13 & 48) == 0) {
                    if (sVar5.h(cVar)) {
                        i52 = 32;
                    } else {
                        i52 = 16;
                    }
                    i49 |= i52;
                }
                i53 = i49;
                i54 = i15 & 4194304;
                if (i54 != 0) {
                    i56 = i53 | 384;
                } else {
                    i55 = i53;
                    if ((i13 & 384) != 0) {
                        if (sVar5.h(cVar2)) {
                            i57 = 256;
                        } else {
                            i57 = 128;
                        }
                        i55 |= i57;
                    }
                    i56 = i55;
                }
                i58 = i15 & 8388608;
                if (i58 != 0) {
                    i60 = i56 | 3072;
                } else {
                    i59 = i56;
                    if ((i13 & 3072) != 0) {
                        if (sVar5.h(cVar3)) {
                            i61 = 2048;
                        } else {
                            i61 = 1024;
                        }
                        i59 |= i61;
                    }
                    i60 = i59;
                }
                i62 = i15 & 16777216;
                if (i62 != 0) {
                    i64 = i60 | 24576;
                } else {
                    i63 = i60;
                    if ((i13 & 24576) == 0) {
                        i64 = i63 | (sVar5.h(cVar4) ? 16384 : 8192);
                    } else {
                        i64 = i63;
                    }
                }
                i65 = i15 & 33554432;
                if (i65 != 0) {
                    i64 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    i64 |= sVar5.h(aVar) ? i23 : 65536;
                }
                i66 = i15 & 67108864;
                if (i66 != 0) {
                    i64 |= 1572864;
                    aVar4 = aVar2;
                } else {
                    aVar4 = aVar2;
                    if ((i13 & 1572864) == 0) {
                        i64 |= sVar5.h(aVar4) ? 1048576 : 524288;
                    }
                }
                if ((i13 & 12582912) == 0) {
                    i64 |= sVar5.h(onClickPlayAudio) ? 8388608 : 4194304;
                }
                if ((i13 & 100663296) == 0) {
                    i64 |= sVar5.h(cVar5) ? 67108864 : 33554432;
                }
                if ((i13 & 805306368) == 0) {
                    if (sVar5.h(getComboCount)) {
                        i78 = 536870912;
                    } else {
                        i78 = 268435456;
                    }
                    i64 |= i78;
                }
                i67 = i64;
                if ((i14 & 6) == 0) {
                    if (sVar5.h(onClickChecked)) {
                        i77 = 4;
                    } else {
                        i77 = 2;
                    }
                    i68 = i14 | i77;
                } else {
                    i68 = i14;
                }
                i69 = i16 & 1;
                if (i69 != 0) {
                    i68 |= 48;
                } else if ((i14 & 48) == 0) {
                    if (sVar == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = sVar.ordinal();
                    }
                    if (sVar5.d(iOrdinal)) {
                        i70 = 32;
                    } else {
                        i70 = 16;
                    }
                    i68 |= i70;
                }
                i71 = i68;
                i72 = i16 & 2;
                if (i72 != 0) {
                    i73 = i71;
                    if ((i14 & 384) == 0) {
                        i73 |= sVar5.h(aVar3) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
                    }
                    int i818 = i73;
                    if ((i31 & 306783379) != 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (sVar5.T(i31 & 1, z19)) {
                        sVar5.Y();
                        i74 = i11 & 1;
                        gVar = l1.m.f39353a;
                        if (i74 != 0) {
                            if (i18 != 0) {
                                str3 = BuildConfig.VERSION_NAME;
                            }
                            if (i81 != 0) {
                                z18 = true;
                            }
                            if (i21 != 0) {
                                z27 = true;
                            } else {
                                z27 = z12;
                            }
                            if (i25 != 0) {
                                z28 = true;
                            } else {
                                z28 = z13;
                            }
                            if (i27 != 0) {
                                z29 = false;
                            } else {
                                z29 = z14;
                            }
                            if (i29 != 0) {
                                z30 = false;
                            } else {
                                z30 = z15;
                            }
                            if (i32 != 0) {
                                f14 = 1.0f;
                            } else {
                                f14 = f11;
                            }
                            if (i35 != 0) {
                                z31 = false;
                            } else {
                                z31 = z16;
                            }
                            if (i39 != 0) {
                                z32 = false;
                            } else {
                                z32 = z17;
                            }
                            if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                strE0 = ub.a.e0(sVar5, R.string.test_check);
                                i47 &= -7169;
                            } else {
                                strE0 = str2;
                            }
                            if (i43 != 0) {
                                eVar3 = null;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i45 != 0) {
                                fVar3 = null;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i48 == 0) {
                            }
                            if (i51 != 0) {
                                objQ7 = sVar5.Q();
                                if (objQ7 == gVar) {
                                    objQ7 = new d0.y1(19);
                                    sVar5.o0(objQ7);
                                }
                                cVar10 = (fz.c) objQ7;
                            } else {
                                z27 = z27;
                                cVar10 = cVar;
                            }
                            if (i54 != 0) {
                                objQ6 = sVar5.Q();
                                if (objQ6 == gVar) {
                                    objQ6 = new d0.y1(19);
                                    sVar5.o0(objQ6);
                                }
                                cVar11 = (fz.c) objQ6;
                            } else {
                                cVar10 = cVar10;
                                cVar11 = cVar2;
                            }
                            if (i58 != 0) {
                                objQ5 = sVar5.Q();
                                if (objQ5 == gVar) {
                                    objQ5 = new d0.y1(18);
                                    sVar5.o0(objQ5);
                                }
                                cVar12 = (fz.c) objQ5;
                            } else {
                                cVar11 = cVar11;
                                cVar12 = cVar3;
                            }
                            if (i62 != 0) {
                                objQ4 = sVar5.Q();
                                if (objQ4 == gVar) {
                                    objQ4 = new d0.y1(19);
                                    sVar5.o0(objQ4);
                                }
                                cVar13 = (fz.c) objQ4;
                            } else {
                                cVar12 = cVar12;
                                cVar13 = cVar4;
                            }
                            if (i65 != 0) {
                                objQ3 = sVar5.Q();
                                if (objQ3 == gVar) {
                                    i75 = 15;
                                    objQ3 = new cr.m(15);
                                    sVar5.o0(objQ3);
                                } else {
                                    i75 = 15;
                                }
                                aVar8 = (fz.a) objQ3;
                            } else {
                                cVar13 = cVar13;
                                i75 = 15;
                                aVar8 = aVar;
                            }
                            if (i66 != 0) {
                                objQ2 = sVar5.Q();
                                if (objQ2 == gVar) {
                                    objQ2 = new cr.m(i75);
                                    sVar5.o0(objQ2);
                                }
                                aVar9 = (fz.a) objQ2;
                            } else {
                                aVar9 = aVar4;
                            }
                            if (i69 != 0) {
                                sVar4 = ns.s.OTHER_LOCAL;
                            } else {
                                sVar4 = sVar;
                            }
                            aVar10 = aVar9;
                            if (i72 != 0) {
                                objQ = sVar5.Q();
                                if (objQ == gVar) {
                                    objQ = new cr.m(15);
                                    sVar5.o0(objQ);
                                }
                                i76 = 16;
                                aVar12 = (fz.a) objQ;
                                aVar11 = aVar8;
                            } else {
                                aVar11 = aVar8;
                                i76 = 16;
                                aVar12 = aVar3;
                            }
                            z33 = z28;
                            str6 = str3;
                            z34 = z29;
                            f15 = 1.0f;
                        } else {
                            if (i18 != 0) {
                                str3 = BuildConfig.VERSION_NAME;
                            }
                            if (i81 != 0) {
                                z18 = true;
                            }
                            if (i21 != 0) {
                                z27 = true;
                            } else {
                                z27 = z12;
                            }
                            if (i25 != 0) {
                                z28 = true;
                            } else {
                                z28 = z13;
                            }
                            if (i27 != 0) {
                                z29 = false;
                            } else {
                                z29 = z14;
                            }
                            if (i29 != 0) {
                                z30 = false;
                            } else {
                                z30 = z15;
                            }
                            if (i32 != 0) {
                                f14 = 1.0f;
                            } else {
                                f14 = f11;
                            }
                            if (i35 != 0) {
                                z31 = false;
                            } else {
                                z31 = z16;
                            }
                            if (i39 != 0) {
                                z32 = false;
                            } else {
                                z32 = z17;
                            }
                            if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                strE0 = ub.a.e0(sVar5, R.string.test_check);
                                i47 &= -7169;
                            } else {
                                strE0 = str2;
                            }
                            if (i43 != 0) {
                                eVar3 = null;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i45 != 0) {
                                fVar3 = null;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i48 == 0) {
                            }
                            if (i51 != 0) {
                                objQ7 = sVar5.Q();
                                if (objQ7 == gVar) {
                                    objQ7 = new d0.y1(19);
                                    sVar5.o0(objQ7);
                                }
                                cVar10 = (fz.c) objQ7;
                            } else {
                                z27 = z27;
                                cVar10 = cVar;
                            }
                            if (i54 != 0) {
                                objQ6 = sVar5.Q();
                                if (objQ6 == gVar) {
                                    objQ6 = new d0.y1(19);
                                    sVar5.o0(objQ6);
                                }
                                cVar11 = (fz.c) objQ6;
                            } else {
                                cVar10 = cVar10;
                                cVar11 = cVar2;
                            }
                            if (i58 != 0) {
                                objQ5 = sVar5.Q();
                                if (objQ5 == gVar) {
                                    objQ5 = new d0.y1(18);
                                    sVar5.o0(objQ5);
                                }
                                cVar12 = (fz.c) objQ5;
                            } else {
                                cVar11 = cVar11;
                                cVar12 = cVar3;
                            }
                            if (i62 != 0) {
                                objQ4 = sVar5.Q();
                                if (objQ4 == gVar) {
                                    objQ4 = new d0.y1(19);
                                    sVar5.o0(objQ4);
                                }
                                cVar13 = (fz.c) objQ4;
                            } else {
                                cVar12 = cVar12;
                                cVar13 = cVar4;
                            }
                            if (i65 != 0) {
                                objQ3 = sVar5.Q();
                                if (objQ3 == gVar) {
                                    i75 = 15;
                                    objQ3 = new cr.m(15);
                                    sVar5.o0(objQ3);
                                } else {
                                    i75 = 15;
                                }
                                aVar8 = (fz.a) objQ3;
                            } else {
                                cVar13 = cVar13;
                                i75 = 15;
                                aVar8 = aVar;
                            }
                            if (i66 != 0) {
                                objQ2 = sVar5.Q();
                                if (objQ2 == gVar) {
                                    objQ2 = new cr.m(i75);
                                    sVar5.o0(objQ2);
                                }
                                aVar9 = (fz.a) objQ2;
                            } else {
                                aVar9 = aVar4;
                            }
                            if (i69 != 0) {
                                sVar4 = ns.s.OTHER_LOCAL;
                            } else {
                                sVar4 = sVar;
                            }
                            aVar10 = aVar9;
                            if (i72 != 0) {
                                objQ = sVar5.Q();
                                if (objQ == gVar) {
                                    objQ = new cr.m(15);
                                    sVar5.o0(objQ);
                                }
                                i76 = 16;
                                aVar12 = (fz.a) objQ;
                                aVar11 = aVar8;
                            } else {
                                aVar11 = aVar8;
                                i76 = 16;
                                aVar12 = aVar3;
                            }
                            z33 = z28;
                            str6 = str3;
                            z34 = z29;
                            f15 = 1.0f;
                        }
                        sVar5.q();
                        ns.z zVar6 = zVar3;
                        objQ8 = sVar5.Q();
                        if (objQ8 == gVar) {
                            objQ8 = l1.t.q(sVar5);
                            sVar5.o0(objQ8);
                        }
                        b0Var = (rz.b0) objQ8;
                        uVar = new kotlin.jvm.internal.u();
                        objQ9 = sVar5.Q();
                        if (objQ9 == gVar) {
                            objQ9 = Boolean.FALSE;
                            sVar5.o0(objQ9);
                        }
                        uVar.f38357a = ((Boolean) objQ9).booleanValue();
                        d2VarU = d0.n.u(sVar5);
                        d2VarU2 = d0.n.u(sVar5);
                        String str11 = str6;
                        Context context3 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                        boolean zBooleanValue3 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                        z1.j jVar3 = z1.c.f58463a;
                        boolean z49 = z27;
                        boolean z410 = z33;
                        w2.q0 q0VarD5 = j0.o.d(jVar3, false);
                        iHashCode = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL9 = sVar5.l();
                        ns.s sVar8 = sVar4;
                        oVar = z1.o.f58481a;
                        boolean z411 = z34;
                        z1.r rVarC11 = z1.a.c(sVar5, oVar);
                        y2.k.J.getClass();
                        fz.a aVar110 = aVar12;
                        iVar = y2.j.f56913b;
                        sVar5.h0();
                        fVar4 = fVar3;
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        hVar = y2.j.f56917f;
                        l1.t.J(hVar, q0VarD5, sVar5);
                        hVar2 = y2.j.f56916e;
                        l1.t.J(hVar2, q1VarL9, sVar5);
                        hVar3 = y2.j.f56918g;
                        fz.a aVar111 = aVar11;
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                        } else {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                        }
                        hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC11, sVar5);
                        z1.r rVarR3 = j0.c.r(j0.e2.d(oVar, 1.0f));
                        j0.u uVarA3 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                        iHashCode2 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL10 = sVar5.l();
                        z1.r rVarC12 = z1.a.c(sVar5, rVarR3);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, uVarA3, sVar5);
                        l1.t.J(hVar2, q1VarL10, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                        } else {
                            defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                        }
                        l1.t.J(hVar4, rVarC12, sVar5);
                        z1.r rVarE3 = j0.e2.e(oVar, 1.0f);
                        d5 = 1.0f;
                        if (d5 <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        f16 = i76;
                        z1.r rVarC13 = j0.c.C(w4.c.p(1.0f, true, rVarE3), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                        objQ10 = sVar5.Q();
                        if (zH) {
                            final int i819 = 0;
                            objQ10 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i819) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ10);
                        } else {
                            final int i8110 = 0;
                            objQ10 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i8110) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ10);
                        }
                        fz.a aVar112 = (fz.a) objQ10;
                        zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                        objQ11 = sVar5.Q();
                        if (zH2) {
                            final int i8111 = 1;
                            objQ11 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i8111) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ11);
                        } else {
                            final int i8112 = 1;
                            objQ11 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i8112) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ11);
                        }
                        int i8113 = i31 >> 12;
                        int i8114 = (i31 & 14) | (i8113 & 112) | (i8113 & 896) | (i8113 & 7168) | ((i31 >> 15) & 57344);
                        int i8115 = i47 << 15;
                        int i8116 = i67 << 18;
                        b(str11, z49, z410, z411, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC13, dVar, dVar2, dVar3, eVar3, aVar10, aVar112, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i8114 | (i8115 & 458752) | (3670016 & i8115) | (i8115 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i8116) | (234881024 & i8116) | (i8116 & 1879048192), (i67 >> 12) & 14);
                        boolean z412 = z31;
                        float f111 = f14;
                        float f112 = f15;
                        str3 = str11;
                        if (courseTestState == ht.q.CHECKING) {
                            sVar5.d0(1774820302);
                            z1.r rVarG3 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                            objQ17 = sVar5.Q();
                            if (objQ17 == gVar) {
                                objQ17 = new cr.m(15);
                                sVar5.o0(objQ17);
                            }
                            iu.k.e((fz.a) objQ17, rVarG3, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                            z36 = false;
                            sVar5.p(false);
                            z37 = true;
                        } else {
                            sVar5.d0(1775330221);
                            j0.a2 a2VarA3 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                            iHashCode3 = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL11 = sVar5.l();
                            z1.r rVarC14 = z1.a.c(sVar5, oVar);
                            sVar5.h0();
                            if (sVar5.S) {
                                sVar5.k(iVar);
                            } else {
                                sVar5.r0();
                            }
                            l1.t.J(hVar, a2VarA3, sVar5);
                            l1.t.J(hVar2, q1VarL11, sVar5);
                            if (sVar5.S) {
                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                            } else {
                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                            }
                            l1.t.J(hVar4, rVarC14, sVar5);
                            if (d5 <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            j0.i1 i1Var3 = new j0.i1(1.0f, true);
                            if ((i31 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            objQ12 = sVar5.Q();
                            if (z35) {
                                objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                                sVar5.o0(objQ12);
                            } else {
                                objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                                sVar5.o0(objQ12);
                            }
                            String str12 = strE0;
                            a0.g(courseTestState, g2.f0.q(i1Var3, (fz.c) objQ12), str12, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                            strE0 = str12;
                            if (z30) {
                                z36 = false;
                                sVar5.d0(393996308);
                            } else {
                                z36 = false;
                                sVar5.d0(393996308);
                            }
                            sVar5.p(z36);
                            z37 = true;
                            sVar5.p(true);
                            sVar5.p(z36);
                        }
                        sVar5.p(z37);
                        rVar = j0.r.f35391a;
                        if (fVar4 == null) {
                            sVar5.d0(1152060677);
                            sVar5.p(z36);
                            fVar5 = fVar4;
                        } else {
                            sVar5.d0(452805244);
                            fVar5 = fVar4;
                            fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                            sVar5.p(z36);
                        }
                        z1.r rVarA3 = rVar.a(oVar, z1.c.H);
                        w2.q0 q0VarD6 = j0.o.d(jVar3, z36);
                        fz.f fVar8 = fVar5;
                        iHashCode4 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL12 = sVar5.l();
                        z1.r rVarC15 = z1.a.c(sVar5, rVarA3);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, q0VarD6, sVar5);
                        l1.t.J(hVar2, q1VarL12, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                        } else {
                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                        }
                        l1.t.J(hVar4, rVarC15, sVar5);
                        if (courseTestState == ht.q.REVISING) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objQ13 = sVar5.Q();
                        if (objQ13 == gVar) {
                            objQ13 = new d0.y1(20);
                            sVar5.o0(objQ13);
                        }
                        a0.l1 l1VarC5 = a0.f1.c((fz.c) objQ13, 7);
                        objQ14 = sVar5.Q();
                        if (objQ14 == gVar) {
                            objQ14 = new d0.y1(21);
                            sVar5.o0(objQ14);
                        }
                        a0.j0.d(z38, null, l1VarC5, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar8, aVar110), sVar5), sVar5, 200064, 18);
                        ht.q qVar3 = ht.q.CORRECT;
                        boolean zD3 = ry.l.D(new ht.q[]{qVar3, ht.q.WRONG}, courseTestState);
                        objQ15 = sVar5.Q();
                        if (objQ15 == gVar) {
                            objQ15 = new d0.y1(22);
                            sVar5.o0(objQ15);
                        }
                        a0.l1 l1VarC6 = a0.f1.c((fz.c) objQ15, 7);
                        objQ16 = sVar5.Q();
                        if (objQ16 == gVar) {
                            objQ16 = new d0.y1(23);
                            sVar5.o0(objQ16);
                        }
                        a0.j0.d(zD3, null, l1VarC6, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context3, getComboCount, audioPlayingState, zVar6, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                        sVar5.p(true);
                        int iIntValue3 = ((Number) getComboCount.invoke()).intValue();
                        if (z18) {
                            z39 = false;
                            sVar5.d0(1141210802);
                        } else {
                            z39 = false;
                            sVar5.d0(1141210802);
                        }
                        sVar5.p(z39);
                        sVar5.p(true);
                        z24 = z18;
                        z22 = z30;
                        str4 = strE0;
                        z20 = z49;
                        z21 = z410;
                        sVar3 = sVar5;
                        z25 = z411;
                        z26 = z32;
                        z23 = z412;
                        zVar2 = zVar6;
                        cVar6 = cVar10;
                        cVar7 = cVar11;
                        cVar8 = cVar12;
                        cVar9 = cVar13;
                        aVar5 = aVar111;
                        sVar2 = sVar8;
                        aVar6 = aVar110;
                        f12 = f112;
                        f13 = f111;
                        eVar2 = eVar3;
                        aVar7 = aVar10;
                        fVar2 = fVar8;
                    } else {
                        sVar5.W();
                        z20 = z12;
                        z21 = z13;
                        z22 = z15;
                        f12 = f5;
                        f13 = f11;
                        z23 = z16;
                        str4 = str2;
                        eVar2 = eVar;
                        fVar2 = fVar;
                        zVar2 = zVar;
                        cVar6 = cVar;
                        cVar7 = cVar2;
                        cVar8 = cVar3;
                        cVar9 = cVar4;
                        aVar5 = aVar;
                        sVar2 = sVar;
                        aVar6 = aVar3;
                        aVar7 = aVar4;
                        sVar3 = sVar5;
                        z24 = z18;
                        z25 = z14;
                        z26 = z17;
                    }
                    str5 = str3;
                    x1VarT = sVar3.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.x2
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM = l1.t.M(i11 | 1);
                                int iM2 = l1.t.M(i12);
                                int iM3 = l1.t.M(i13);
                                int iM4 = l1.t.M(i14);
                                k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i73 = i71 | 384;
                if ((i14 & 3072) == 0) {
                    i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
                }
                int i8117 = i73;
                if ((i31 & 306783379) != 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (sVar5.T(i31 & 1, z19)) {
                    sVar5.Y();
                    i74 = i11 & 1;
                    gVar = l1.m.f39353a;
                    if (i74 != 0) {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    } else {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    }
                    sVar5.q();
                    ns.z zVar7 = zVar3;
                    objQ8 = sVar5.Q();
                    if (objQ8 == gVar) {
                        objQ8 = l1.t.q(sVar5);
                        sVar5.o0(objQ8);
                    }
                    b0Var = (rz.b0) objQ8;
                    uVar = new kotlin.jvm.internal.u();
                    objQ9 = sVar5.Q();
                    if (objQ9 == gVar) {
                        objQ9 = Boolean.FALSE;
                        sVar5.o0(objQ9);
                    }
                    uVar.f38357a = ((Boolean) objQ9).booleanValue();
                    d2VarU = d0.n.u(sVar5);
                    d2VarU2 = d0.n.u(sVar5);
                    String str13 = str6;
                    Context context4 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                    boolean zBooleanValue4 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                    z1.j jVar4 = z1.c.f58463a;
                    boolean z413 = z27;
                    boolean z414 = z33;
                    w2.q0 q0VarD7 = j0.o.d(jVar4, false);
                    iHashCode = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL13 = sVar5.l();
                    ns.s sVar9 = sVar4;
                    oVar = z1.o.f58481a;
                    boolean z415 = z34;
                    z1.r rVarC16 = z1.a.c(sVar5, oVar);
                    y2.k.J.getClass();
                    fz.a aVar113 = aVar12;
                    iVar = y2.j.f56913b;
                    sVar5.h0();
                    fVar4 = fVar3;
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD7, sVar5);
                    hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL13, sVar5);
                    hVar3 = y2.j.f56918g;
                    fz.a aVar114 = aVar11;
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    } else {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    }
                    hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC16, sVar5);
                    z1.r rVarR4 = j0.c.r(j0.e2.d(oVar, 1.0f));
                    j0.u uVarA4 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                    iHashCode2 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL14 = sVar5.l();
                    z1.r rVarC17 = z1.a.c(sVar5, rVarR4);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, uVarA4, sVar5);
                    l1.t.J(hVar2, q1VarL14, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    } else {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC17, sVar5);
                    z1.r rVarE4 = j0.e2.e(oVar, 1.0f);
                    d5 = 1.0f;
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    f16 = i76;
                    z1.r rVarC18 = j0.c.C(w4.c.p(1.0f, true, rVarE4), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                    objQ10 = sVar5.Q();
                    if (zH) {
                        final int i8118 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8118) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    } else {
                        final int i8119 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8119) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    }
                    fz.a aVar115 = (fz.a) objQ10;
                    zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                    objQ11 = sVar5.Q();
                    if (zH2) {
                        final int i81110 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i81110) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    } else {
                        final int i81111 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i81111) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    }
                    int i81112 = i31 >> 12;
                    int i81113 = (i31 & 14) | (i81112 & 112) | (i81112 & 896) | (i81112 & 7168) | ((i31 >> 15) & 57344);
                    int i81114 = i47 << 15;
                    int i81115 = i67 << 18;
                    b(str13, z413, z414, z415, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC18, dVar, dVar2, dVar3, eVar3, aVar10, aVar115, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i81113 | (i81114 & 458752) | (3670016 & i81114) | (i81114 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i81115) | (234881024 & i81115) | (i81115 & 1879048192), (i67 >> 12) & 14);
                    boolean z416 = z31;
                    float f113 = f14;
                    float f114 = f15;
                    str3 = str13;
                    if (courseTestState == ht.q.CHECKING) {
                        sVar5.d0(1774820302);
                        z1.r rVarG4 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                        objQ17 = sVar5.Q();
                        if (objQ17 == gVar) {
                            objQ17 = new cr.m(15);
                            sVar5.o0(objQ17);
                        }
                        iu.k.e((fz.a) objQ17, rVarG4, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                        z36 = false;
                        sVar5.p(false);
                        z37 = true;
                    } else {
                        sVar5.d0(1775330221);
                        j0.a2 a2VarA4 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                        iHashCode3 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL15 = sVar5.l();
                        z1.r rVarC19 = z1.a.c(sVar5, oVar);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, a2VarA4, sVar5);
                        l1.t.J(hVar2, q1VarL15, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC19, sVar5);
                        if (d5 <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var4 = new j0.i1(1.0f, true);
                        if ((i31 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objQ12 = sVar5.Q();
                        if (z35) {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        } else {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        }
                        String str14 = strE0;
                        a0.g(courseTestState, g2.f0.q(i1Var4, (fz.c) objQ12), str14, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                        strE0 = str14;
                        if (z30) {
                            z36 = false;
                            sVar5.d0(393996308);
                        } else {
                            z36 = false;
                            sVar5.d0(393996308);
                        }
                        sVar5.p(z36);
                        z37 = true;
                        sVar5.p(true);
                        sVar5.p(z36);
                    }
                    sVar5.p(z37);
                    rVar = j0.r.f35391a;
                    if (fVar4 == null) {
                        sVar5.d0(1152060677);
                        sVar5.p(z36);
                        fVar5 = fVar4;
                    } else {
                        sVar5.d0(452805244);
                        fVar5 = fVar4;
                        fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                        sVar5.p(z36);
                    }
                    z1.r rVarA4 = rVar.a(oVar, z1.c.H);
                    w2.q0 q0VarD8 = j0.o.d(jVar4, z36);
                    fz.f fVar9 = fVar5;
                    iHashCode4 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL16 = sVar5.l();
                    z1.r rVarC110 = z1.a.c(sVar5, rVarA4);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, q0VarD8, sVar5);
                    l1.t.J(hVar2, q1VarL16, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    } else {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    }
                    l1.t.J(hVar4, rVarC110, sVar5);
                    if (courseTestState == ht.q.REVISING) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objQ13 = sVar5.Q();
                    if (objQ13 == gVar) {
                        objQ13 = new d0.y1(20);
                        sVar5.o0(objQ13);
                    }
                    a0.l1 l1VarC7 = a0.f1.c((fz.c) objQ13, 7);
                    objQ14 = sVar5.Q();
                    if (objQ14 == gVar) {
                        objQ14 = new d0.y1(21);
                        sVar5.o0(objQ14);
                    }
                    a0.j0.d(z38, null, l1VarC7, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar9, aVar113), sVar5), sVar5, 200064, 18);
                    ht.q qVar4 = ht.q.CORRECT;
                    boolean zD4 = ry.l.D(new ht.q[]{qVar4, ht.q.WRONG}, courseTestState);
                    objQ15 = sVar5.Q();
                    if (objQ15 == gVar) {
                        objQ15 = new d0.y1(22);
                        sVar5.o0(objQ15);
                    }
                    a0.l1 l1VarC8 = a0.f1.c((fz.c) objQ15, 7);
                    objQ16 = sVar5.Q();
                    if (objQ16 == gVar) {
                        objQ16 = new d0.y1(23);
                        sVar5.o0(objQ16);
                    }
                    a0.j0.d(zD4, null, l1VarC8, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context4, getComboCount, audioPlayingState, zVar7, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                    sVar5.p(true);
                    int iIntValue4 = ((Number) getComboCount.invoke()).intValue();
                    if (z18) {
                        z39 = false;
                        sVar5.d0(1141210802);
                    } else {
                        z39 = false;
                        sVar5.d0(1141210802);
                    }
                    sVar5.p(z39);
                    sVar5.p(true);
                    z24 = z18;
                    z22 = z30;
                    str4 = strE0;
                    z20 = z413;
                    z21 = z414;
                    sVar3 = sVar5;
                    z25 = z415;
                    z26 = z32;
                    z23 = z416;
                    zVar2 = zVar7;
                    cVar6 = cVar10;
                    cVar7 = cVar11;
                    cVar8 = cVar12;
                    cVar9 = cVar13;
                    aVar5 = aVar114;
                    sVar2 = sVar9;
                    aVar6 = aVar113;
                    f12 = f114;
                    f13 = f113;
                    eVar2 = eVar3;
                    aVar7 = aVar10;
                    fVar2 = fVar9;
                } else {
                    sVar5.W();
                    z20 = z12;
                    z21 = z13;
                    z22 = z15;
                    f12 = f5;
                    f13 = f11;
                    z23 = z16;
                    str4 = str2;
                    eVar2 = eVar;
                    fVar2 = fVar;
                    zVar2 = zVar;
                    cVar6 = cVar;
                    cVar7 = cVar2;
                    cVar8 = cVar3;
                    cVar9 = cVar4;
                    aVar5 = aVar;
                    sVar2 = sVar;
                    aVar6 = aVar3;
                    aVar7 = aVar4;
                    sVar3 = sVar5;
                    z24 = z18;
                    z25 = z14;
                    z26 = z17;
                }
                str5 = str3;
                x1VarT = sVar3.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.x2
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i11 | 1);
                            int iM2 = l1.t.M(i12);
                            int iM3 = l1.t.M(i13);
                            int iM4 = l1.t.M(i14);
                            k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i80 |= 12582912;
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (sVar5.g(z15)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i80 |= i30;
                }
                i31 = i80 | 805306368;
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i34 = i12 | 6;
                } else {
                    if (sVar5.c(f11)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i34 = i12 | i33;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i37 = i34 | 48;
                } else {
                    if (sVar5.g(z16)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i37 = i34 | i36;
                }
                i38 = i37;
                i39 = i15 & 4096;
                if (i39 != 0) {
                    i41 = i38 | 384;
                } else {
                    if (sVar5.g(z17)) {
                        i40 = 256;
                    } else {
                        i40 = 128;
                    }
                    i41 = i38 | i40;
                }
                i42 = i41 | (((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0 || !sVar5.f(str2)) ? 1024 : 2048);
                i43 = i15 & i23;
                if (i43 != 0) {
                    i42 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (sVar5.h(eVar)) {
                        i44 = 8388608;
                    } else {
                        i44 = 4194304;
                    }
                    i42 |= i44;
                }
                i45 = i15 & 262144;
                if (i45 != 0) {
                    i42 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (sVar5.h(fVar)) {
                        i46 = 67108864;
                    } else {
                        i46 = 33554432;
                    }
                    i42 |= i46;
                }
                i47 = i42;
                i48 = i15 & 1048576;
                if (i48 != 0) {
                    i49 = i13 | 6;
                } else if ((i13 & 6) == 0) {
                    if (sVar5.f(zVar)) {
                        i50 = 4;
                    } else {
                        i50 = 2;
                    }
                    i49 = i13 | i50;
                } else {
                    i49 = i13;
                }
                i51 = i15 & 2097152;
                if (i51 != 0) {
                    i49 |= 48;
                } else if ((i13 & 48) == 0) {
                    if (sVar5.h(cVar)) {
                        i52 = 32;
                    } else {
                        i52 = 16;
                    }
                    i49 |= i52;
                }
                i53 = i49;
                i54 = i15 & 4194304;
                if (i54 != 0) {
                    i56 = i53 | 384;
                } else {
                    i55 = i53;
                    if ((i13 & 384) != 0) {
                        if (sVar5.h(cVar2)) {
                            i57 = 256;
                        } else {
                            i57 = 128;
                        }
                        i55 |= i57;
                    }
                    i56 = i55;
                }
                i58 = i15 & 8388608;
                if (i58 != 0) {
                    i60 = i56 | 3072;
                } else {
                    i59 = i56;
                    if ((i13 & 3072) != 0) {
                        if (sVar5.h(cVar3)) {
                            i61 = 2048;
                        } else {
                            i61 = 1024;
                        }
                        i59 |= i61;
                    }
                    i60 = i59;
                }
                i62 = i15 & 16777216;
                if (i62 != 0) {
                    i64 = i60 | 24576;
                } else {
                    i63 = i60;
                    if ((i13 & 24576) == 0) {
                        i64 = i63 | (sVar5.h(cVar4) ? 16384 : 8192);
                    } else {
                        i64 = i63;
                    }
                }
                i65 = i15 & 33554432;
                if (i65 != 0) {
                    i64 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    i64 |= sVar5.h(aVar) ? i23 : 65536;
                }
                i66 = i15 & 67108864;
                if (i66 != 0) {
                    i64 |= 1572864;
                    aVar4 = aVar2;
                } else {
                    aVar4 = aVar2;
                    if ((i13 & 1572864) == 0) {
                        i64 |= sVar5.h(aVar4) ? 1048576 : 524288;
                    }
                }
                if ((i13 & 12582912) == 0) {
                    i64 |= sVar5.h(onClickPlayAudio) ? 8388608 : 4194304;
                }
                if ((i13 & 100663296) == 0) {
                    i64 |= sVar5.h(cVar5) ? 67108864 : 33554432;
                }
                if ((i13 & 805306368) == 0) {
                    if (sVar5.h(getComboCount)) {
                        i78 = 536870912;
                    } else {
                        i78 = 268435456;
                    }
                    i64 |= i78;
                }
                i67 = i64;
                if ((i14 & 6) == 0) {
                    if (sVar5.h(onClickChecked)) {
                        i77 = 4;
                    } else {
                        i77 = 2;
                    }
                    i68 = i14 | i77;
                } else {
                    i68 = i14;
                }
                i69 = i16 & 1;
                if (i69 != 0) {
                    i68 |= 48;
                } else if ((i14 & 48) == 0) {
                    if (sVar == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = sVar.ordinal();
                    }
                    if (sVar5.d(iOrdinal)) {
                        i70 = 32;
                    } else {
                        i70 = 16;
                    }
                    i68 |= i70;
                }
                i71 = i68;
                i72 = i16 & 2;
                if (i72 != 0) {
                    i73 = i71;
                    if ((i14 & 384) == 0) {
                        i73 |= sVar5.h(aVar3) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
                    }
                    int i81116 = i73;
                    if ((i31 & 306783379) != 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (sVar5.T(i31 & 1, z19)) {
                        sVar5.Y();
                        i74 = i11 & 1;
                        gVar = l1.m.f39353a;
                        if (i74 != 0) {
                            if (i18 != 0) {
                                str3 = BuildConfig.VERSION_NAME;
                            }
                            if (i81 != 0) {
                                z18 = true;
                            }
                            if (i21 != 0) {
                                z27 = true;
                            } else {
                                z27 = z12;
                            }
                            if (i25 != 0) {
                                z28 = true;
                            } else {
                                z28 = z13;
                            }
                            if (i27 != 0) {
                                z29 = false;
                            } else {
                                z29 = z14;
                            }
                            if (i29 != 0) {
                                z30 = false;
                            } else {
                                z30 = z15;
                            }
                            if (i32 != 0) {
                                f14 = 1.0f;
                            } else {
                                f14 = f11;
                            }
                            if (i35 != 0) {
                                z31 = false;
                            } else {
                                z31 = z16;
                            }
                            if (i39 != 0) {
                                z32 = false;
                            } else {
                                z32 = z17;
                            }
                            if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                strE0 = ub.a.e0(sVar5, R.string.test_check);
                                i47 &= -7169;
                            } else {
                                strE0 = str2;
                            }
                            if (i43 != 0) {
                                eVar3 = null;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i45 != 0) {
                                fVar3 = null;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i48 == 0) {
                            }
                            if (i51 != 0) {
                                objQ7 = sVar5.Q();
                                if (objQ7 == gVar) {
                                    objQ7 = new d0.y1(19);
                                    sVar5.o0(objQ7);
                                }
                                cVar10 = (fz.c) objQ7;
                            } else {
                                z27 = z27;
                                cVar10 = cVar;
                            }
                            if (i54 != 0) {
                                objQ6 = sVar5.Q();
                                if (objQ6 == gVar) {
                                    objQ6 = new d0.y1(19);
                                    sVar5.o0(objQ6);
                                }
                                cVar11 = (fz.c) objQ6;
                            } else {
                                cVar10 = cVar10;
                                cVar11 = cVar2;
                            }
                            if (i58 != 0) {
                                objQ5 = sVar5.Q();
                                if (objQ5 == gVar) {
                                    objQ5 = new d0.y1(18);
                                    sVar5.o0(objQ5);
                                }
                                cVar12 = (fz.c) objQ5;
                            } else {
                                cVar11 = cVar11;
                                cVar12 = cVar3;
                            }
                            if (i62 != 0) {
                                objQ4 = sVar5.Q();
                                if (objQ4 == gVar) {
                                    objQ4 = new d0.y1(19);
                                    sVar5.o0(objQ4);
                                }
                                cVar13 = (fz.c) objQ4;
                            } else {
                                cVar12 = cVar12;
                                cVar13 = cVar4;
                            }
                            if (i65 != 0) {
                                objQ3 = sVar5.Q();
                                if (objQ3 == gVar) {
                                    i75 = 15;
                                    objQ3 = new cr.m(15);
                                    sVar5.o0(objQ3);
                                } else {
                                    i75 = 15;
                                }
                                aVar8 = (fz.a) objQ3;
                            } else {
                                cVar13 = cVar13;
                                i75 = 15;
                                aVar8 = aVar;
                            }
                            if (i66 != 0) {
                                objQ2 = sVar5.Q();
                                if (objQ2 == gVar) {
                                    objQ2 = new cr.m(i75);
                                    sVar5.o0(objQ2);
                                }
                                aVar9 = (fz.a) objQ2;
                            } else {
                                aVar9 = aVar4;
                            }
                            if (i69 != 0) {
                                sVar4 = ns.s.OTHER_LOCAL;
                            } else {
                                sVar4 = sVar;
                            }
                            aVar10 = aVar9;
                            if (i72 != 0) {
                                objQ = sVar5.Q();
                                if (objQ == gVar) {
                                    objQ = new cr.m(15);
                                    sVar5.o0(objQ);
                                }
                                i76 = 16;
                                aVar12 = (fz.a) objQ;
                                aVar11 = aVar8;
                            } else {
                                aVar11 = aVar8;
                                i76 = 16;
                                aVar12 = aVar3;
                            }
                            z33 = z28;
                            str6 = str3;
                            z34 = z29;
                            f15 = 1.0f;
                        } else {
                            if (i18 != 0) {
                                str3 = BuildConfig.VERSION_NAME;
                            }
                            if (i81 != 0) {
                                z18 = true;
                            }
                            if (i21 != 0) {
                                z27 = true;
                            } else {
                                z27 = z12;
                            }
                            if (i25 != 0) {
                                z28 = true;
                            } else {
                                z28 = z13;
                            }
                            if (i27 != 0) {
                                z29 = false;
                            } else {
                                z29 = z14;
                            }
                            if (i29 != 0) {
                                z30 = false;
                            } else {
                                z30 = z15;
                            }
                            if (i32 != 0) {
                                f14 = 1.0f;
                            } else {
                                f14 = f11;
                            }
                            if (i35 != 0) {
                                z31 = false;
                            } else {
                                z31 = z16;
                            }
                            if (i39 != 0) {
                                z32 = false;
                            } else {
                                z32 = z17;
                            }
                            if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                strE0 = ub.a.e0(sVar5, R.string.test_check);
                                i47 &= -7169;
                            } else {
                                strE0 = str2;
                            }
                            if (i43 != 0) {
                                eVar3 = null;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i45 != 0) {
                                fVar3 = null;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i48 == 0) {
                            }
                            if (i51 != 0) {
                                objQ7 = sVar5.Q();
                                if (objQ7 == gVar) {
                                    objQ7 = new d0.y1(19);
                                    sVar5.o0(objQ7);
                                }
                                cVar10 = (fz.c) objQ7;
                            } else {
                                z27 = z27;
                                cVar10 = cVar;
                            }
                            if (i54 != 0) {
                                objQ6 = sVar5.Q();
                                if (objQ6 == gVar) {
                                    objQ6 = new d0.y1(19);
                                    sVar5.o0(objQ6);
                                }
                                cVar11 = (fz.c) objQ6;
                            } else {
                                cVar10 = cVar10;
                                cVar11 = cVar2;
                            }
                            if (i58 != 0) {
                                objQ5 = sVar5.Q();
                                if (objQ5 == gVar) {
                                    objQ5 = new d0.y1(18);
                                    sVar5.o0(objQ5);
                                }
                                cVar12 = (fz.c) objQ5;
                            } else {
                                cVar11 = cVar11;
                                cVar12 = cVar3;
                            }
                            if (i62 != 0) {
                                objQ4 = sVar5.Q();
                                if (objQ4 == gVar) {
                                    objQ4 = new d0.y1(19);
                                    sVar5.o0(objQ4);
                                }
                                cVar13 = (fz.c) objQ4;
                            } else {
                                cVar12 = cVar12;
                                cVar13 = cVar4;
                            }
                            if (i65 != 0) {
                                objQ3 = sVar5.Q();
                                if (objQ3 == gVar) {
                                    i75 = 15;
                                    objQ3 = new cr.m(15);
                                    sVar5.o0(objQ3);
                                } else {
                                    i75 = 15;
                                }
                                aVar8 = (fz.a) objQ3;
                            } else {
                                cVar13 = cVar13;
                                i75 = 15;
                                aVar8 = aVar;
                            }
                            if (i66 != 0) {
                                objQ2 = sVar5.Q();
                                if (objQ2 == gVar) {
                                    objQ2 = new cr.m(i75);
                                    sVar5.o0(objQ2);
                                }
                                aVar9 = (fz.a) objQ2;
                            } else {
                                aVar9 = aVar4;
                            }
                            if (i69 != 0) {
                                sVar4 = ns.s.OTHER_LOCAL;
                            } else {
                                sVar4 = sVar;
                            }
                            aVar10 = aVar9;
                            if (i72 != 0) {
                                objQ = sVar5.Q();
                                if (objQ == gVar) {
                                    objQ = new cr.m(15);
                                    sVar5.o0(objQ);
                                }
                                i76 = 16;
                                aVar12 = (fz.a) objQ;
                                aVar11 = aVar8;
                            } else {
                                aVar11 = aVar8;
                                i76 = 16;
                                aVar12 = aVar3;
                            }
                            z33 = z28;
                            str6 = str3;
                            z34 = z29;
                            f15 = 1.0f;
                        }
                        sVar5.q();
                        ns.z zVar8 = zVar3;
                        objQ8 = sVar5.Q();
                        if (objQ8 == gVar) {
                            objQ8 = l1.t.q(sVar5);
                            sVar5.o0(objQ8);
                        }
                        b0Var = (rz.b0) objQ8;
                        uVar = new kotlin.jvm.internal.u();
                        objQ9 = sVar5.Q();
                        if (objQ9 == gVar) {
                            objQ9 = Boolean.FALSE;
                            sVar5.o0(objQ9);
                        }
                        uVar.f38357a = ((Boolean) objQ9).booleanValue();
                        d2VarU = d0.n.u(sVar5);
                        d2VarU2 = d0.n.u(sVar5);
                        String str15 = str6;
                        Context context5 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                        boolean zBooleanValue5 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                        z1.j jVar5 = z1.c.f58463a;
                        boolean z417 = z27;
                        boolean z418 = z33;
                        w2.q0 q0VarD9 = j0.o.d(jVar5, false);
                        iHashCode = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL17 = sVar5.l();
                        ns.s sVar10 = sVar4;
                        oVar = z1.o.f58481a;
                        boolean z419 = z34;
                        z1.r rVarC111 = z1.a.c(sVar5, oVar);
                        y2.k.J.getClass();
                        fz.a aVar116 = aVar12;
                        iVar = y2.j.f56913b;
                        sVar5.h0();
                        fVar4 = fVar3;
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        hVar = y2.j.f56917f;
                        l1.t.J(hVar, q0VarD9, sVar5);
                        hVar2 = y2.j.f56916e;
                        l1.t.J(hVar2, q1VarL17, sVar5);
                        hVar3 = y2.j.f56918g;
                        fz.a aVar117 = aVar11;
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                        } else {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                        }
                        hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC111, sVar5);
                        z1.r rVarR5 = j0.c.r(j0.e2.d(oVar, 1.0f));
                        j0.u uVarA5 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                        iHashCode2 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL18 = sVar5.l();
                        z1.r rVarC112 = z1.a.c(sVar5, rVarR5);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, uVarA5, sVar5);
                        l1.t.J(hVar2, q1VarL18, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                        } else {
                            defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                        }
                        l1.t.J(hVar4, rVarC112, sVar5);
                        z1.r rVarE5 = j0.e2.e(oVar, 1.0f);
                        d5 = 1.0f;
                        if (d5 <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        f16 = i76;
                        z1.r rVarC113 = j0.c.C(w4.c.p(1.0f, true, rVarE5), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                        objQ10 = sVar5.Q();
                        if (zH) {
                            final int i81117 = 0;
                            objQ10 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i81117) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ10);
                        } else {
                            final int i81118 = 0;
                            objQ10 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i81118) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ10);
                        }
                        fz.a aVar118 = (fz.a) objQ10;
                        zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                        objQ11 = sVar5.Q();
                        if (zH2) {
                            final int i81119 = 1;
                            objQ11 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i81119) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ11);
                        } else {
                            final int i811110 = 1;
                            objQ11 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i811110) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ11);
                        }
                        int i811111 = i31 >> 12;
                        int i811112 = (i31 & 14) | (i811111 & 112) | (i811111 & 896) | (i811111 & 7168) | ((i31 >> 15) & 57344);
                        int i811113 = i47 << 15;
                        int i811114 = i67 << 18;
                        b(str15, z417, z418, z419, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC113, dVar, dVar2, dVar3, eVar3, aVar10, aVar118, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i811112 | (i811113 & 458752) | (3670016 & i811113) | (i811113 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i811114) | (234881024 & i811114) | (i811114 & 1879048192), (i67 >> 12) & 14);
                        boolean z4110 = z31;
                        float f115 = f14;
                        float f116 = f15;
                        str3 = str15;
                        if (courseTestState == ht.q.CHECKING) {
                            sVar5.d0(1774820302);
                            z1.r rVarG5 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                            objQ17 = sVar5.Q();
                            if (objQ17 == gVar) {
                                objQ17 = new cr.m(15);
                                sVar5.o0(objQ17);
                            }
                            iu.k.e((fz.a) objQ17, rVarG5, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                            z36 = false;
                            sVar5.p(false);
                            z37 = true;
                        } else {
                            sVar5.d0(1775330221);
                            j0.a2 a2VarA5 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                            iHashCode3 = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL19 = sVar5.l();
                            z1.r rVarC114 = z1.a.c(sVar5, oVar);
                            sVar5.h0();
                            if (sVar5.S) {
                                sVar5.k(iVar);
                            } else {
                                sVar5.r0();
                            }
                            l1.t.J(hVar, a2VarA5, sVar5);
                            l1.t.J(hVar2, q1VarL19, sVar5);
                            if (sVar5.S) {
                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                            } else {
                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                            }
                            l1.t.J(hVar4, rVarC114, sVar5);
                            if (d5 <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            j0.i1 i1Var5 = new j0.i1(1.0f, true);
                            if ((i31 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            objQ12 = sVar5.Q();
                            if (z35) {
                                objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                                sVar5.o0(objQ12);
                            } else {
                                objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                                sVar5.o0(objQ12);
                            }
                            String str16 = strE0;
                            a0.g(courseTestState, g2.f0.q(i1Var5, (fz.c) objQ12), str16, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                            strE0 = str16;
                            if (z30) {
                                z36 = false;
                                sVar5.d0(393996308);
                            } else {
                                z36 = false;
                                sVar5.d0(393996308);
                            }
                            sVar5.p(z36);
                            z37 = true;
                            sVar5.p(true);
                            sVar5.p(z36);
                        }
                        sVar5.p(z37);
                        rVar = j0.r.f35391a;
                        if (fVar4 == null) {
                            sVar5.d0(1152060677);
                            sVar5.p(z36);
                            fVar5 = fVar4;
                        } else {
                            sVar5.d0(452805244);
                            fVar5 = fVar4;
                            fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                            sVar5.p(z36);
                        }
                        z1.r rVarA5 = rVar.a(oVar, z1.c.H);
                        w2.q0 q0VarD10 = j0.o.d(jVar5, z36);
                        fz.f fVar10 = fVar5;
                        iHashCode4 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL110 = sVar5.l();
                        z1.r rVarC115 = z1.a.c(sVar5, rVarA5);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, q0VarD10, sVar5);
                        l1.t.J(hVar2, q1VarL110, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                        } else {
                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                        }
                        l1.t.J(hVar4, rVarC115, sVar5);
                        if (courseTestState == ht.q.REVISING) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objQ13 = sVar5.Q();
                        if (objQ13 == gVar) {
                            objQ13 = new d0.y1(20);
                            sVar5.o0(objQ13);
                        }
                        a0.l1 l1VarC9 = a0.f1.c((fz.c) objQ13, 7);
                        objQ14 = sVar5.Q();
                        if (objQ14 == gVar) {
                            objQ14 = new d0.y1(21);
                            sVar5.o0(objQ14);
                        }
                        a0.j0.d(z38, null, l1VarC9, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar10, aVar116), sVar5), sVar5, 200064, 18);
                        ht.q qVar5 = ht.q.CORRECT;
                        boolean zD5 = ry.l.D(new ht.q[]{qVar5, ht.q.WRONG}, courseTestState);
                        objQ15 = sVar5.Q();
                        if (objQ15 == gVar) {
                            objQ15 = new d0.y1(22);
                            sVar5.o0(objQ15);
                        }
                        a0.l1 l1VarC10 = a0.f1.c((fz.c) objQ15, 7);
                        objQ16 = sVar5.Q();
                        if (objQ16 == gVar) {
                            objQ16 = new d0.y1(23);
                            sVar5.o0(objQ16);
                        }
                        a0.j0.d(zD5, null, l1VarC10, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context5, getComboCount, audioPlayingState, zVar8, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                        sVar5.p(true);
                        int iIntValue5 = ((Number) getComboCount.invoke()).intValue();
                        if (z18) {
                            z39 = false;
                            sVar5.d0(1141210802);
                        } else {
                            z39 = false;
                            sVar5.d0(1141210802);
                        }
                        sVar5.p(z39);
                        sVar5.p(true);
                        z24 = z18;
                        z22 = z30;
                        str4 = strE0;
                        z20 = z417;
                        z21 = z418;
                        sVar3 = sVar5;
                        z25 = z419;
                        z26 = z32;
                        z23 = z4110;
                        zVar2 = zVar8;
                        cVar6 = cVar10;
                        cVar7 = cVar11;
                        cVar8 = cVar12;
                        cVar9 = cVar13;
                        aVar5 = aVar117;
                        sVar2 = sVar10;
                        aVar6 = aVar116;
                        f12 = f116;
                        f13 = f115;
                        eVar2 = eVar3;
                        aVar7 = aVar10;
                        fVar2 = fVar10;
                    } else {
                        sVar5.W();
                        z20 = z12;
                        z21 = z13;
                        z22 = z15;
                        f12 = f5;
                        f13 = f11;
                        z23 = z16;
                        str4 = str2;
                        eVar2 = eVar;
                        fVar2 = fVar;
                        zVar2 = zVar;
                        cVar6 = cVar;
                        cVar7 = cVar2;
                        cVar8 = cVar3;
                        cVar9 = cVar4;
                        aVar5 = aVar;
                        sVar2 = sVar;
                        aVar6 = aVar3;
                        aVar7 = aVar4;
                        sVar3 = sVar5;
                        z24 = z18;
                        z25 = z14;
                        z26 = z17;
                    }
                    str5 = str3;
                    x1VarT = sVar3.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.x2
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM = l1.t.M(i11 | 1);
                                int iM2 = l1.t.M(i12);
                                int iM3 = l1.t.M(i13);
                                int iM4 = l1.t.M(i14);
                                k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i73 = i71 | 384;
                if ((i14 & 3072) == 0) {
                    i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
                }
                int i811115 = i73;
                if ((i31 & 306783379) != 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (sVar5.T(i31 & 1, z19)) {
                    sVar5.Y();
                    i74 = i11 & 1;
                    gVar = l1.m.f39353a;
                    if (i74 != 0) {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    } else {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    }
                    sVar5.q();
                    ns.z zVar9 = zVar3;
                    objQ8 = sVar5.Q();
                    if (objQ8 == gVar) {
                        objQ8 = l1.t.q(sVar5);
                        sVar5.o0(objQ8);
                    }
                    b0Var = (rz.b0) objQ8;
                    uVar = new kotlin.jvm.internal.u();
                    objQ9 = sVar5.Q();
                    if (objQ9 == gVar) {
                        objQ9 = Boolean.FALSE;
                        sVar5.o0(objQ9);
                    }
                    uVar.f38357a = ((Boolean) objQ9).booleanValue();
                    d2VarU = d0.n.u(sVar5);
                    d2VarU2 = d0.n.u(sVar5);
                    String str17 = str6;
                    Context context6 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                    boolean zBooleanValue6 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                    z1.j jVar6 = z1.c.f58463a;
                    boolean z4111 = z27;
                    boolean z4112 = z33;
                    w2.q0 q0VarD11 = j0.o.d(jVar6, false);
                    iHashCode = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL111 = sVar5.l();
                    ns.s sVar11 = sVar4;
                    oVar = z1.o.f58481a;
                    boolean z4113 = z34;
                    z1.r rVarC116 = z1.a.c(sVar5, oVar);
                    y2.k.J.getClass();
                    fz.a aVar119 = aVar12;
                    iVar = y2.j.f56913b;
                    sVar5.h0();
                    fVar4 = fVar3;
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD11, sVar5);
                    hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL111, sVar5);
                    hVar3 = y2.j.f56918g;
                    fz.a aVar1110 = aVar11;
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    } else {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    }
                    hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC116, sVar5);
                    z1.r rVarR6 = j0.c.r(j0.e2.d(oVar, 1.0f));
                    j0.u uVarA6 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                    iHashCode2 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL112 = sVar5.l();
                    z1.r rVarC117 = z1.a.c(sVar5, rVarR6);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, uVarA6, sVar5);
                    l1.t.J(hVar2, q1VarL112, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    } else {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC117, sVar5);
                    z1.r rVarE6 = j0.e2.e(oVar, 1.0f);
                    d5 = 1.0f;
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    f16 = i76;
                    z1.r rVarC118 = j0.c.C(w4.c.p(1.0f, true, rVarE6), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                    objQ10 = sVar5.Q();
                    if (zH) {
                        final int i811116 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i811116) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    } else {
                        final int i811117 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i811117) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    }
                    fz.a aVar1111 = (fz.a) objQ10;
                    zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                    objQ11 = sVar5.Q();
                    if (zH2) {
                        final int i811118 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i811118) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    } else {
                        final int i811119 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i811119) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    }
                    int i8111110 = i31 >> 12;
                    int i8111111 = (i31 & 14) | (i8111110 & 112) | (i8111110 & 896) | (i8111110 & 7168) | ((i31 >> 15) & 57344);
                    int i8111112 = i47 << 15;
                    int i8111113 = i67 << 18;
                    b(str17, z4111, z4112, z4113, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC118, dVar, dVar2, dVar3, eVar3, aVar10, aVar1111, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i8111111 | (i8111112 & 458752) | (3670016 & i8111112) | (i8111112 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i8111113) | (234881024 & i8111113) | (i8111113 & 1879048192), (i67 >> 12) & 14);
                    boolean z4114 = z31;
                    float f117 = f14;
                    float f118 = f15;
                    str3 = str17;
                    if (courseTestState == ht.q.CHECKING) {
                        sVar5.d0(1774820302);
                        z1.r rVarG6 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                        objQ17 = sVar5.Q();
                        if (objQ17 == gVar) {
                            objQ17 = new cr.m(15);
                            sVar5.o0(objQ17);
                        }
                        iu.k.e((fz.a) objQ17, rVarG6, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                        z36 = false;
                        sVar5.p(false);
                        z37 = true;
                    } else {
                        sVar5.d0(1775330221);
                        j0.a2 a2VarA6 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                        iHashCode3 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL113 = sVar5.l();
                        z1.r rVarC119 = z1.a.c(sVar5, oVar);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, a2VarA6, sVar5);
                        l1.t.J(hVar2, q1VarL113, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC119, sVar5);
                        if (d5 <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var6 = new j0.i1(1.0f, true);
                        if ((i31 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objQ12 = sVar5.Q();
                        if (z35) {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        } else {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        }
                        String str18 = strE0;
                        a0.g(courseTestState, g2.f0.q(i1Var6, (fz.c) objQ12), str18, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                        strE0 = str18;
                        if (z30) {
                            z36 = false;
                            sVar5.d0(393996308);
                        } else {
                            z36 = false;
                            sVar5.d0(393996308);
                        }
                        sVar5.p(z36);
                        z37 = true;
                        sVar5.p(true);
                        sVar5.p(z36);
                    }
                    sVar5.p(z37);
                    rVar = j0.r.f35391a;
                    if (fVar4 == null) {
                        sVar5.d0(1152060677);
                        sVar5.p(z36);
                        fVar5 = fVar4;
                    } else {
                        sVar5.d0(452805244);
                        fVar5 = fVar4;
                        fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                        sVar5.p(z36);
                    }
                    z1.r rVarA6 = rVar.a(oVar, z1.c.H);
                    w2.q0 q0VarD12 = j0.o.d(jVar6, z36);
                    fz.f fVar11 = fVar5;
                    iHashCode4 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL114 = sVar5.l();
                    z1.r rVarC1110 = z1.a.c(sVar5, rVarA6);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, q0VarD12, sVar5);
                    l1.t.J(hVar2, q1VarL114, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    } else {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    }
                    l1.t.J(hVar4, rVarC1110, sVar5);
                    if (courseTestState == ht.q.REVISING) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objQ13 = sVar5.Q();
                    if (objQ13 == gVar) {
                        objQ13 = new d0.y1(20);
                        sVar5.o0(objQ13);
                    }
                    a0.l1 l1VarC11 = a0.f1.c((fz.c) objQ13, 7);
                    objQ14 = sVar5.Q();
                    if (objQ14 == gVar) {
                        objQ14 = new d0.y1(21);
                        sVar5.o0(objQ14);
                    }
                    a0.j0.d(z38, null, l1VarC11, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar11, aVar119), sVar5), sVar5, 200064, 18);
                    ht.q qVar6 = ht.q.CORRECT;
                    boolean zD6 = ry.l.D(new ht.q[]{qVar6, ht.q.WRONG}, courseTestState);
                    objQ15 = sVar5.Q();
                    if (objQ15 == gVar) {
                        objQ15 = new d0.y1(22);
                        sVar5.o0(objQ15);
                    }
                    a0.l1 l1VarC12 = a0.f1.c((fz.c) objQ15, 7);
                    objQ16 = sVar5.Q();
                    if (objQ16 == gVar) {
                        objQ16 = new d0.y1(23);
                        sVar5.o0(objQ16);
                    }
                    a0.j0.d(zD6, null, l1VarC12, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context6, getComboCount, audioPlayingState, zVar9, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                    sVar5.p(true);
                    int iIntValue6 = ((Number) getComboCount.invoke()).intValue();
                    if (z18) {
                        z39 = false;
                        sVar5.d0(1141210802);
                    } else {
                        z39 = false;
                        sVar5.d0(1141210802);
                    }
                    sVar5.p(z39);
                    sVar5.p(true);
                    z24 = z18;
                    z22 = z30;
                    str4 = strE0;
                    z20 = z4111;
                    z21 = z4112;
                    sVar3 = sVar5;
                    z25 = z4113;
                    z26 = z32;
                    z23 = z4114;
                    zVar2 = zVar9;
                    cVar6 = cVar10;
                    cVar7 = cVar11;
                    cVar8 = cVar12;
                    cVar9 = cVar13;
                    aVar5 = aVar1110;
                    sVar2 = sVar11;
                    aVar6 = aVar119;
                    f12 = f118;
                    f13 = f117;
                    eVar2 = eVar3;
                    aVar7 = aVar10;
                    fVar2 = fVar11;
                } else {
                    sVar5.W();
                    z20 = z12;
                    z21 = z13;
                    z22 = z15;
                    f12 = f5;
                    f13 = f11;
                    z23 = z16;
                    str4 = str2;
                    eVar2 = eVar;
                    fVar2 = fVar;
                    zVar2 = zVar;
                    cVar6 = cVar;
                    cVar7 = cVar2;
                    cVar8 = cVar3;
                    cVar9 = cVar4;
                    aVar5 = aVar;
                    sVar2 = sVar;
                    aVar6 = aVar3;
                    aVar7 = aVar4;
                    sVar3 = sVar5;
                    z24 = z18;
                    z25 = z14;
                    z26 = z17;
                }
                str5 = str3;
                x1VarT = sVar3.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.x2
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i11 | 1);
                            int iM2 = l1.t.M(i12);
                            int iM3 = l1.t.M(i13);
                            int iM4 = l1.t.M(i14);
                            k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i80 |= 100663296;
            i31 = i80 | 805306368;
            i32 = i15 & 1024;
            if (i32 != 0) {
                i34 = i12 | 6;
            } else {
                if (sVar5.c(f11)) {
                    i33 = 4;
                } else {
                    i33 = 2;
                }
                i34 = i12 | i33;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i37 = i34 | 48;
            } else {
                if (sVar5.g(z16)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i37 = i34 | i36;
            }
            i38 = i37;
            i39 = i15 & 4096;
            if (i39 != 0) {
                i41 = i38 | 384;
            } else {
                if (sVar5.g(z17)) {
                    i40 = 256;
                } else {
                    i40 = 128;
                }
                i41 = i38 | i40;
            }
            i42 = i41 | (((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0 || !sVar5.f(str2)) ? 1024 : 2048);
            i43 = i15 & i23;
            if (i43 != 0) {
                i42 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (sVar5.h(eVar)) {
                    i44 = 8388608;
                } else {
                    i44 = 4194304;
                }
                i42 |= i44;
            }
            i45 = i15 & 262144;
            if (i45 != 0) {
                i42 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (sVar5.h(fVar)) {
                    i46 = 67108864;
                } else {
                    i46 = 33554432;
                }
                i42 |= i46;
            }
            i47 = i42;
            i48 = i15 & 1048576;
            if (i48 != 0) {
                i49 = i13 | 6;
            } else if ((i13 & 6) == 0) {
                if (sVar5.f(zVar)) {
                    i50 = 4;
                } else {
                    i50 = 2;
                }
                i49 = i13 | i50;
            } else {
                i49 = i13;
            }
            i51 = i15 & 2097152;
            if (i51 != 0) {
                i49 |= 48;
            } else if ((i13 & 48) == 0) {
                if (sVar5.h(cVar)) {
                    i52 = 32;
                } else {
                    i52 = 16;
                }
                i49 |= i52;
            }
            i53 = i49;
            i54 = i15 & 4194304;
            if (i54 != 0) {
                i56 = i53 | 384;
            } else {
                i55 = i53;
                if ((i13 & 384) != 0) {
                    if (sVar5.h(cVar2)) {
                        i57 = 256;
                    } else {
                        i57 = 128;
                    }
                    i55 |= i57;
                }
                i56 = i55;
            }
            i58 = i15 & 8388608;
            if (i58 != 0) {
                i60 = i56 | 3072;
            } else {
                i59 = i56;
                if ((i13 & 3072) != 0) {
                    if (sVar5.h(cVar3)) {
                        i61 = 2048;
                    } else {
                        i61 = 1024;
                    }
                    i59 |= i61;
                }
                i60 = i59;
            }
            i62 = i15 & 16777216;
            if (i62 != 0) {
                i64 = i60 | 24576;
            } else {
                i63 = i60;
                if ((i13 & 24576) == 0) {
                    i64 = i63 | (sVar5.h(cVar4) ? 16384 : 8192);
                } else {
                    i64 = i63;
                }
            }
            i65 = i15 & 33554432;
            if (i65 != 0) {
                i64 |= 196608;
            } else if ((i13 & 196608) == 0) {
                i64 |= sVar5.h(aVar) ? i23 : 65536;
            }
            i66 = i15 & 67108864;
            if (i66 != 0) {
                i64 |= 1572864;
                aVar4 = aVar2;
            } else {
                aVar4 = aVar2;
                if ((i13 & 1572864) == 0) {
                    i64 |= sVar5.h(aVar4) ? 1048576 : 524288;
                }
            }
            if ((i13 & 12582912) == 0) {
                i64 |= sVar5.h(onClickPlayAudio) ? 8388608 : 4194304;
            }
            if ((i13 & 100663296) == 0) {
                i64 |= sVar5.h(cVar5) ? 67108864 : 33554432;
            }
            if ((i13 & 805306368) == 0) {
                if (sVar5.h(getComboCount)) {
                    i78 = 536870912;
                } else {
                    i78 = 268435456;
                }
                i64 |= i78;
            }
            i67 = i64;
            if ((i14 & 6) == 0) {
                if (sVar5.h(onClickChecked)) {
                    i77 = 4;
                } else {
                    i77 = 2;
                }
                i68 = i14 | i77;
            } else {
                i68 = i14;
            }
            i69 = i16 & 1;
            if (i69 != 0) {
                i68 |= 48;
            } else if ((i14 & 48) == 0) {
                if (sVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = sVar.ordinal();
                }
                if (sVar5.d(iOrdinal)) {
                    i70 = 32;
                } else {
                    i70 = 16;
                }
                i68 |= i70;
            }
            i71 = i68;
            i72 = i16 & 2;
            if (i72 != 0) {
                i73 = i71;
                if ((i14 & 384) == 0) {
                    i73 |= sVar5.h(aVar3) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
                }
                int i8111114 = i73;
                if ((i31 & 306783379) != 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (sVar5.T(i31 & 1, z19)) {
                    sVar5.Y();
                    i74 = i11 & 1;
                    gVar = l1.m.f39353a;
                    if (i74 != 0) {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    } else {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    }
                    sVar5.q();
                    ns.z zVar10 = zVar3;
                    objQ8 = sVar5.Q();
                    if (objQ8 == gVar) {
                        objQ8 = l1.t.q(sVar5);
                        sVar5.o0(objQ8);
                    }
                    b0Var = (rz.b0) objQ8;
                    uVar = new kotlin.jvm.internal.u();
                    objQ9 = sVar5.Q();
                    if (objQ9 == gVar) {
                        objQ9 = Boolean.FALSE;
                        sVar5.o0(objQ9);
                    }
                    uVar.f38357a = ((Boolean) objQ9).booleanValue();
                    d2VarU = d0.n.u(sVar5);
                    d2VarU2 = d0.n.u(sVar5);
                    String str19 = str6;
                    Context context7 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                    boolean zBooleanValue7 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                    z1.j jVar7 = z1.c.f58463a;
                    boolean z4115 = z27;
                    boolean z4116 = z33;
                    w2.q0 q0VarD13 = j0.o.d(jVar7, false);
                    iHashCode = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL115 = sVar5.l();
                    ns.s sVar12 = sVar4;
                    oVar = z1.o.f58481a;
                    boolean z4117 = z34;
                    z1.r rVarC1111 = z1.a.c(sVar5, oVar);
                    y2.k.J.getClass();
                    fz.a aVar1112 = aVar12;
                    iVar = y2.j.f56913b;
                    sVar5.h0();
                    fVar4 = fVar3;
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD13, sVar5);
                    hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL115, sVar5);
                    hVar3 = y2.j.f56918g;
                    fz.a aVar1113 = aVar11;
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    } else {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    }
                    hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC1111, sVar5);
                    z1.r rVarR7 = j0.c.r(j0.e2.d(oVar, 1.0f));
                    j0.u uVarA7 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                    iHashCode2 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL116 = sVar5.l();
                    z1.r rVarC1112 = z1.a.c(sVar5, rVarR7);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, uVarA7, sVar5);
                    l1.t.J(hVar2, q1VarL116, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    } else {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC1112, sVar5);
                    z1.r rVarE7 = j0.e2.e(oVar, 1.0f);
                    d5 = 1.0f;
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    f16 = i76;
                    z1.r rVarC1113 = j0.c.C(w4.c.p(1.0f, true, rVarE7), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                    objQ10 = sVar5.Q();
                    if (zH) {
                        final int i8111115 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8111115) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    } else {
                        final int i8111116 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8111116) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    }
                    fz.a aVar1114 = (fz.a) objQ10;
                    zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                    objQ11 = sVar5.Q();
                    if (zH2) {
                        final int i8111117 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8111117) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    } else {
                        final int i8111118 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8111118) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    }
                    int i8111119 = i31 >> 12;
                    int i81111110 = (i31 & 14) | (i8111119 & 112) | (i8111119 & 896) | (i8111119 & 7168) | ((i31 >> 15) & 57344);
                    int i81111111 = i47 << 15;
                    int i81111112 = i67 << 18;
                    b(str19, z4115, z4116, z4117, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC1113, dVar, dVar2, dVar3, eVar3, aVar10, aVar1114, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i81111110 | (i81111111 & 458752) | (3670016 & i81111111) | (i81111111 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i81111112) | (234881024 & i81111112) | (i81111112 & 1879048192), (i67 >> 12) & 14);
                    boolean z4118 = z31;
                    float f119 = f14;
                    float f1110 = f15;
                    str3 = str19;
                    if (courseTestState == ht.q.CHECKING) {
                        sVar5.d0(1774820302);
                        z1.r rVarG7 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                        objQ17 = sVar5.Q();
                        if (objQ17 == gVar) {
                            objQ17 = new cr.m(15);
                            sVar5.o0(objQ17);
                        }
                        iu.k.e((fz.a) objQ17, rVarG7, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                        z36 = false;
                        sVar5.p(false);
                        z37 = true;
                    } else {
                        sVar5.d0(1775330221);
                        j0.a2 a2VarA7 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                        iHashCode3 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL117 = sVar5.l();
                        z1.r rVarC1114 = z1.a.c(sVar5, oVar);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, a2VarA7, sVar5);
                        l1.t.J(hVar2, q1VarL117, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC1114, sVar5);
                        if (d5 <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var7 = new j0.i1(1.0f, true);
                        if ((i31 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objQ12 = sVar5.Q();
                        if (z35) {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        } else {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        }
                        String str110 = strE0;
                        a0.g(courseTestState, g2.f0.q(i1Var7, (fz.c) objQ12), str110, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                        strE0 = str110;
                        if (z30) {
                            z36 = false;
                            sVar5.d0(393996308);
                        } else {
                            z36 = false;
                            sVar5.d0(393996308);
                        }
                        sVar5.p(z36);
                        z37 = true;
                        sVar5.p(true);
                        sVar5.p(z36);
                    }
                    sVar5.p(z37);
                    rVar = j0.r.f35391a;
                    if (fVar4 == null) {
                        sVar5.d0(1152060677);
                        sVar5.p(z36);
                        fVar5 = fVar4;
                    } else {
                        sVar5.d0(452805244);
                        fVar5 = fVar4;
                        fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                        sVar5.p(z36);
                    }
                    z1.r rVarA7 = rVar.a(oVar, z1.c.H);
                    w2.q0 q0VarD14 = j0.o.d(jVar7, z36);
                    fz.f fVar12 = fVar5;
                    iHashCode4 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL118 = sVar5.l();
                    z1.r rVarC1115 = z1.a.c(sVar5, rVarA7);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, q0VarD14, sVar5);
                    l1.t.J(hVar2, q1VarL118, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    } else {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    }
                    l1.t.J(hVar4, rVarC1115, sVar5);
                    if (courseTestState == ht.q.REVISING) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objQ13 = sVar5.Q();
                    if (objQ13 == gVar) {
                        objQ13 = new d0.y1(20);
                        sVar5.o0(objQ13);
                    }
                    a0.l1 l1VarC13 = a0.f1.c((fz.c) objQ13, 7);
                    objQ14 = sVar5.Q();
                    if (objQ14 == gVar) {
                        objQ14 = new d0.y1(21);
                        sVar5.o0(objQ14);
                    }
                    a0.j0.d(z38, null, l1VarC13, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar12, aVar1112), sVar5), sVar5, 200064, 18);
                    ht.q qVar7 = ht.q.CORRECT;
                    boolean zD7 = ry.l.D(new ht.q[]{qVar7, ht.q.WRONG}, courseTestState);
                    objQ15 = sVar5.Q();
                    if (objQ15 == gVar) {
                        objQ15 = new d0.y1(22);
                        sVar5.o0(objQ15);
                    }
                    a0.l1 l1VarC14 = a0.f1.c((fz.c) objQ15, 7);
                    objQ16 = sVar5.Q();
                    if (objQ16 == gVar) {
                        objQ16 = new d0.y1(23);
                        sVar5.o0(objQ16);
                    }
                    a0.j0.d(zD7, null, l1VarC14, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context7, getComboCount, audioPlayingState, zVar10, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                    sVar5.p(true);
                    int iIntValue7 = ((Number) getComboCount.invoke()).intValue();
                    if (z18) {
                        z39 = false;
                        sVar5.d0(1141210802);
                    } else {
                        z39 = false;
                        sVar5.d0(1141210802);
                    }
                    sVar5.p(z39);
                    sVar5.p(true);
                    z24 = z18;
                    z22 = z30;
                    str4 = strE0;
                    z20 = z4115;
                    z21 = z4116;
                    sVar3 = sVar5;
                    z25 = z4117;
                    z26 = z32;
                    z23 = z4118;
                    zVar2 = zVar10;
                    cVar6 = cVar10;
                    cVar7 = cVar11;
                    cVar8 = cVar12;
                    cVar9 = cVar13;
                    aVar5 = aVar1113;
                    sVar2 = sVar12;
                    aVar6 = aVar1112;
                    f12 = f1110;
                    f13 = f119;
                    eVar2 = eVar3;
                    aVar7 = aVar10;
                    fVar2 = fVar12;
                } else {
                    sVar5.W();
                    z20 = z12;
                    z21 = z13;
                    z22 = z15;
                    f12 = f5;
                    f13 = f11;
                    z23 = z16;
                    str4 = str2;
                    eVar2 = eVar;
                    fVar2 = fVar;
                    zVar2 = zVar;
                    cVar6 = cVar;
                    cVar7 = cVar2;
                    cVar8 = cVar3;
                    cVar9 = cVar4;
                    aVar5 = aVar;
                    sVar2 = sVar;
                    aVar6 = aVar3;
                    aVar7 = aVar4;
                    sVar3 = sVar5;
                    z24 = z18;
                    z25 = z14;
                    z26 = z17;
                }
                str5 = str3;
                x1VarT = sVar3.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.x2
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i11 | 1);
                            int iM2 = l1.t.M(i12);
                            int iM3 = l1.t.M(i13);
                            int iM4 = l1.t.M(i14);
                            k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i73 = i71 | 384;
            if ((i14 & 3072) == 0) {
                i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
            }
            int i81111113 = i73;
            if ((i31 & 306783379) != 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (sVar5.T(i31 & 1, z19)) {
                sVar5.Y();
                i74 = i11 & 1;
                gVar = l1.m.f39353a;
                if (i74 != 0) {
                    if (i18 != 0) {
                        str3 = BuildConfig.VERSION_NAME;
                    }
                    if (i81 != 0) {
                        z18 = true;
                    }
                    if (i21 != 0) {
                        z27 = true;
                    } else {
                        z27 = z12;
                    }
                    if (i25 != 0) {
                        z28 = true;
                    } else {
                        z28 = z13;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z14;
                    }
                    if (i29 != 0) {
                        z30 = false;
                    } else {
                        z30 = z15;
                    }
                    if (i32 != 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = f11;
                    }
                    if (i35 != 0) {
                        z31 = false;
                    } else {
                        z31 = z16;
                    }
                    if (i39 != 0) {
                        z32 = false;
                    } else {
                        z32 = z17;
                    }
                    if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                        strE0 = ub.a.e0(sVar5, R.string.test_check);
                        i47 &= -7169;
                    } else {
                        strE0 = str2;
                    }
                    if (i43 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i45 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i48 == 0) {
                    }
                    if (i51 != 0) {
                        objQ7 = sVar5.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new d0.y1(19);
                            sVar5.o0(objQ7);
                        }
                        cVar10 = (fz.c) objQ7;
                    } else {
                        z27 = z27;
                        cVar10 = cVar;
                    }
                    if (i54 != 0) {
                        objQ6 = sVar5.Q();
                        if (objQ6 == gVar) {
                            objQ6 = new d0.y1(19);
                            sVar5.o0(objQ6);
                        }
                        cVar11 = (fz.c) objQ6;
                    } else {
                        cVar10 = cVar10;
                        cVar11 = cVar2;
                    }
                    if (i58 != 0) {
                        objQ5 = sVar5.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new d0.y1(18);
                            sVar5.o0(objQ5);
                        }
                        cVar12 = (fz.c) objQ5;
                    } else {
                        cVar11 = cVar11;
                        cVar12 = cVar3;
                    }
                    if (i62 != 0) {
                        objQ4 = sVar5.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new d0.y1(19);
                            sVar5.o0(objQ4);
                        }
                        cVar13 = (fz.c) objQ4;
                    } else {
                        cVar12 = cVar12;
                        cVar13 = cVar4;
                    }
                    if (i65 != 0) {
                        objQ3 = sVar5.Q();
                        if (objQ3 == gVar) {
                            i75 = 15;
                            objQ3 = new cr.m(15);
                            sVar5.o0(objQ3);
                        } else {
                            i75 = 15;
                        }
                        aVar8 = (fz.a) objQ3;
                    } else {
                        cVar13 = cVar13;
                        i75 = 15;
                        aVar8 = aVar;
                    }
                    if (i66 != 0) {
                        objQ2 = sVar5.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new cr.m(i75);
                            sVar5.o0(objQ2);
                        }
                        aVar9 = (fz.a) objQ2;
                    } else {
                        aVar9 = aVar4;
                    }
                    if (i69 != 0) {
                        sVar4 = ns.s.OTHER_LOCAL;
                    } else {
                        sVar4 = sVar;
                    }
                    aVar10 = aVar9;
                    if (i72 != 0) {
                        objQ = sVar5.Q();
                        if (objQ == gVar) {
                            objQ = new cr.m(15);
                            sVar5.o0(objQ);
                        }
                        i76 = 16;
                        aVar12 = (fz.a) objQ;
                        aVar11 = aVar8;
                    } else {
                        aVar11 = aVar8;
                        i76 = 16;
                        aVar12 = aVar3;
                    }
                    z33 = z28;
                    str6 = str3;
                    z34 = z29;
                    f15 = 1.0f;
                } else {
                    if (i18 != 0) {
                        str3 = BuildConfig.VERSION_NAME;
                    }
                    if (i81 != 0) {
                        z18 = true;
                    }
                    if (i21 != 0) {
                        z27 = true;
                    } else {
                        z27 = z12;
                    }
                    if (i25 != 0) {
                        z28 = true;
                    } else {
                        z28 = z13;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z14;
                    }
                    if (i29 != 0) {
                        z30 = false;
                    } else {
                        z30 = z15;
                    }
                    if (i32 != 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = f11;
                    }
                    if (i35 != 0) {
                        z31 = false;
                    } else {
                        z31 = z16;
                    }
                    if (i39 != 0) {
                        z32 = false;
                    } else {
                        z32 = z17;
                    }
                    if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                        strE0 = ub.a.e0(sVar5, R.string.test_check);
                        i47 &= -7169;
                    } else {
                        strE0 = str2;
                    }
                    if (i43 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i45 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i48 == 0) {
                    }
                    if (i51 != 0) {
                        objQ7 = sVar5.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new d0.y1(19);
                            sVar5.o0(objQ7);
                        }
                        cVar10 = (fz.c) objQ7;
                    } else {
                        z27 = z27;
                        cVar10 = cVar;
                    }
                    if (i54 != 0) {
                        objQ6 = sVar5.Q();
                        if (objQ6 == gVar) {
                            objQ6 = new d0.y1(19);
                            sVar5.o0(objQ6);
                        }
                        cVar11 = (fz.c) objQ6;
                    } else {
                        cVar10 = cVar10;
                        cVar11 = cVar2;
                    }
                    if (i58 != 0) {
                        objQ5 = sVar5.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new d0.y1(18);
                            sVar5.o0(objQ5);
                        }
                        cVar12 = (fz.c) objQ5;
                    } else {
                        cVar11 = cVar11;
                        cVar12 = cVar3;
                    }
                    if (i62 != 0) {
                        objQ4 = sVar5.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new d0.y1(19);
                            sVar5.o0(objQ4);
                        }
                        cVar13 = (fz.c) objQ4;
                    } else {
                        cVar12 = cVar12;
                        cVar13 = cVar4;
                    }
                    if (i65 != 0) {
                        objQ3 = sVar5.Q();
                        if (objQ3 == gVar) {
                            i75 = 15;
                            objQ3 = new cr.m(15);
                            sVar5.o0(objQ3);
                        } else {
                            i75 = 15;
                        }
                        aVar8 = (fz.a) objQ3;
                    } else {
                        cVar13 = cVar13;
                        i75 = 15;
                        aVar8 = aVar;
                    }
                    if (i66 != 0) {
                        objQ2 = sVar5.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new cr.m(i75);
                            sVar5.o0(objQ2);
                        }
                        aVar9 = (fz.a) objQ2;
                    } else {
                        aVar9 = aVar4;
                    }
                    if (i69 != 0) {
                        sVar4 = ns.s.OTHER_LOCAL;
                    } else {
                        sVar4 = sVar;
                    }
                    aVar10 = aVar9;
                    if (i72 != 0) {
                        objQ = sVar5.Q();
                        if (objQ == gVar) {
                            objQ = new cr.m(15);
                            sVar5.o0(objQ);
                        }
                        i76 = 16;
                        aVar12 = (fz.a) objQ;
                        aVar11 = aVar8;
                    } else {
                        aVar11 = aVar8;
                        i76 = 16;
                        aVar12 = aVar3;
                    }
                    z33 = z28;
                    str6 = str3;
                    z34 = z29;
                    f15 = 1.0f;
                }
                sVar5.q();
                ns.z zVar11 = zVar3;
                objQ8 = sVar5.Q();
                if (objQ8 == gVar) {
                    objQ8 = l1.t.q(sVar5);
                    sVar5.o0(objQ8);
                }
                b0Var = (rz.b0) objQ8;
                uVar = new kotlin.jvm.internal.u();
                objQ9 = sVar5.Q();
                if (objQ9 == gVar) {
                    objQ9 = Boolean.FALSE;
                    sVar5.o0(objQ9);
                }
                uVar.f38357a = ((Boolean) objQ9).booleanValue();
                d2VarU = d0.n.u(sVar5);
                d2VarU2 = d0.n.u(sVar5);
                String str111 = str6;
                Context context8 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                boolean zBooleanValue8 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                z1.j jVar8 = z1.c.f58463a;
                boolean z4119 = z27;
                boolean z41110 = z33;
                w2.q0 q0VarD15 = j0.o.d(jVar8, false);
                iHashCode = Long.hashCode(sVar5.T);
                l1.q1 q1VarL119 = sVar5.l();
                ns.s sVar13 = sVar4;
                oVar = z1.o.f58481a;
                boolean z41111 = z34;
                z1.r rVarC1116 = z1.a.c(sVar5, oVar);
                y2.k.J.getClass();
                fz.a aVar1115 = aVar12;
                iVar = y2.j.f56913b;
                sVar5.h0();
                fVar4 = fVar3;
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                hVar = y2.j.f56917f;
                l1.t.J(hVar, q0VarD15, sVar5);
                hVar2 = y2.j.f56916e;
                l1.t.J(hVar2, q1VarL119, sVar5);
                hVar3 = y2.j.f56918g;
                fz.a aVar1116 = aVar11;
                if (sVar5.S) {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                } else {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                }
                hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC1116, sVar5);
                z1.r rVarR8 = j0.c.r(j0.e2.d(oVar, 1.0f));
                j0.u uVarA8 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                iHashCode2 = Long.hashCode(sVar5.T);
                l1.q1 q1VarL1110 = sVar5.l();
                z1.r rVarC1117 = z1.a.c(sVar5, rVarR8);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar, uVarA8, sVar5);
                l1.t.J(hVar2, q1VarL1110, sVar5);
                if (sVar5.S) {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                } else {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC1117, sVar5);
                z1.r rVarE8 = j0.e2.e(oVar, 1.0f);
                d5 = 1.0f;
                if (d5 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                f16 = i76;
                z1.r rVarC1118 = j0.c.C(w4.c.p(1.0f, true, rVarE8), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                objQ10 = sVar5.Q();
                if (zH) {
                    final int i81111114 = 0;
                    objQ10 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i81111114) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ10);
                } else {
                    final int i81111115 = 0;
                    objQ10 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i81111115) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ10);
                }
                fz.a aVar1117 = (fz.a) objQ10;
                zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                objQ11 = sVar5.Q();
                if (zH2) {
                    final int i81111116 = 1;
                    objQ11 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i81111116) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ11);
                } else {
                    final int i81111117 = 1;
                    objQ11 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i81111117) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ11);
                }
                int i81111118 = i31 >> 12;
                int i81111119 = (i31 & 14) | (i81111118 & 112) | (i81111118 & 896) | (i81111118 & 7168) | ((i31 >> 15) & 57344);
                int i811111110 = i47 << 15;
                int i811111111 = i67 << 18;
                b(str111, z4119, z41110, z41111, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC1118, dVar, dVar2, dVar3, eVar3, aVar10, aVar1117, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i81111119 | (i811111110 & 458752) | (3670016 & i811111110) | (i811111110 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i811111111) | (234881024 & i811111111) | (i811111111 & 1879048192), (i67 >> 12) & 14);
                boolean z41112 = z31;
                float f1111 = f14;
                float f1112 = f15;
                str3 = str111;
                if (courseTestState == ht.q.CHECKING) {
                    sVar5.d0(1774820302);
                    z1.r rVarG8 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                    objQ17 = sVar5.Q();
                    if (objQ17 == gVar) {
                        objQ17 = new cr.m(15);
                        sVar5.o0(objQ17);
                    }
                    iu.k.e((fz.a) objQ17, rVarG8, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                    z36 = false;
                    sVar5.p(false);
                    z37 = true;
                } else {
                    sVar5.d0(1775330221);
                    j0.a2 a2VarA8 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                    iHashCode3 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL1111 = sVar5.l();
                    z1.r rVarC1119 = z1.a.c(sVar5, oVar);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, a2VarA8, sVar5);
                    l1.t.J(hVar2, q1VarL1111, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                    } else {
                        defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC1119, sVar5);
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var8 = new j0.i1(1.0f, true);
                    if ((i31 & 112) == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objQ12 = sVar5.Q();
                    if (z35) {
                        objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                        sVar5.o0(objQ12);
                    } else {
                        objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                        sVar5.o0(objQ12);
                    }
                    String str112 = strE0;
                    a0.g(courseTestState, g2.f0.q(i1Var8, (fz.c) objQ12), str112, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                    strE0 = str112;
                    if (z30) {
                        z36 = false;
                        sVar5.d0(393996308);
                    } else {
                        z36 = false;
                        sVar5.d0(393996308);
                    }
                    sVar5.p(z36);
                    z37 = true;
                    sVar5.p(true);
                    sVar5.p(z36);
                }
                sVar5.p(z37);
                rVar = j0.r.f35391a;
                if (fVar4 == null) {
                    sVar5.d0(1152060677);
                    sVar5.p(z36);
                    fVar5 = fVar4;
                } else {
                    sVar5.d0(452805244);
                    fVar5 = fVar4;
                    fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                    sVar5.p(z36);
                }
                z1.r rVarA8 = rVar.a(oVar, z1.c.H);
                w2.q0 q0VarD16 = j0.o.d(jVar8, z36);
                fz.f fVar13 = fVar5;
                iHashCode4 = Long.hashCode(sVar5.T);
                l1.q1 q1VarL1112 = sVar5.l();
                z1.r rVarC11110 = z1.a.c(sVar5, rVarA8);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar, q0VarD16, sVar5);
                l1.t.J(hVar2, q1VarL1112, sVar5);
                if (sVar5.S) {
                    defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                } else {
                    defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                }
                l1.t.J(hVar4, rVarC11110, sVar5);
                if (courseTestState == ht.q.REVISING) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                objQ13 = sVar5.Q();
                if (objQ13 == gVar) {
                    objQ13 = new d0.y1(20);
                    sVar5.o0(objQ13);
                }
                a0.l1 l1VarC15 = a0.f1.c((fz.c) objQ13, 7);
                objQ14 = sVar5.Q();
                if (objQ14 == gVar) {
                    objQ14 = new d0.y1(21);
                    sVar5.o0(objQ14);
                }
                a0.j0.d(z38, null, l1VarC15, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar13, aVar1115), sVar5), sVar5, 200064, 18);
                ht.q qVar8 = ht.q.CORRECT;
                boolean zD8 = ry.l.D(new ht.q[]{qVar8, ht.q.WRONG}, courseTestState);
                objQ15 = sVar5.Q();
                if (objQ15 == gVar) {
                    objQ15 = new d0.y1(22);
                    sVar5.o0(objQ15);
                }
                a0.l1 l1VarC16 = a0.f1.c((fz.c) objQ15, 7);
                objQ16 = sVar5.Q();
                if (objQ16 == gVar) {
                    objQ16 = new d0.y1(23);
                    sVar5.o0(objQ16);
                }
                a0.j0.d(zD8, null, l1VarC16, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context8, getComboCount, audioPlayingState, zVar11, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                sVar5.p(true);
                int iIntValue8 = ((Number) getComboCount.invoke()).intValue();
                if (z18) {
                    z39 = false;
                    sVar5.d0(1141210802);
                } else {
                    z39 = false;
                    sVar5.d0(1141210802);
                }
                sVar5.p(z39);
                sVar5.p(true);
                z24 = z18;
                z22 = z30;
                str4 = strE0;
                z20 = z4119;
                z21 = z41110;
                sVar3 = sVar5;
                z25 = z41111;
                z26 = z32;
                z23 = z41112;
                zVar2 = zVar11;
                cVar6 = cVar10;
                cVar7 = cVar11;
                cVar8 = cVar12;
                cVar9 = cVar13;
                aVar5 = aVar1116;
                sVar2 = sVar13;
                aVar6 = aVar1115;
                f12 = f1112;
                f13 = f1111;
                eVar2 = eVar3;
                aVar7 = aVar10;
                fVar2 = fVar13;
            } else {
                sVar5.W();
                z20 = z12;
                z21 = z13;
                z22 = z15;
                f12 = f5;
                f13 = f11;
                z23 = z16;
                str4 = str2;
                eVar2 = eVar;
                fVar2 = fVar;
                zVar2 = zVar;
                cVar6 = cVar;
                cVar7 = cVar2;
                cVar8 = cVar3;
                cVar9 = cVar4;
                aVar5 = aVar;
                sVar2 = sVar;
                aVar6 = aVar3;
                aVar7 = aVar4;
                sVar3 = sVar5;
                z24 = z18;
                z25 = z14;
                z26 = z17;
            }
            str5 = str3;
            x1VarT = sVar3.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.x2
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i11 | 1);
                        int iM2 = l1.t.M(i12);
                        int iM3 = l1.t.M(i13);
                        int iM4 = l1.t.M(i14);
                        k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i80 |= 3072;
        z18 = z11;
        if ((i15 & 16) != 0) {
            i80 |= 24576;
            i18 = i79;
        } else {
            i18 = i79;
            if ((i11 & 24576) == 0) {
                if (sVar5.g(false)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i80 |= i19;
            }
        }
        i21 = i15 & 32;
        if (i21 != 0) {
            i80 |= 196608;
            i23 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
        } else {
            i22 = i11 & 196608;
            i23 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            if (i22 == 0) {
                if (sVar5.g(z12)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i80 |= i24;
            }
        }
        i25 = i15 & 64;
        if (i25 != 0) {
            i80 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (sVar5.g(z13)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i80 |= i26;
        }
        i27 = i15 & 128;
        if (i27 != 0) {
            if ((i11 & 12582912) == 0) {
                if (sVar5.g(z14)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i80 |= i28;
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (sVar5.g(z15)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i80 |= i30;
                }
                i31 = i80 | 805306368;
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i34 = i12 | 6;
                } else {
                    if (sVar5.c(f11)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i34 = i12 | i33;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i37 = i34 | 48;
                } else {
                    if (sVar5.g(z16)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i37 = i34 | i36;
                }
                i38 = i37;
                i39 = i15 & 4096;
                if (i39 != 0) {
                    i41 = i38 | 384;
                } else {
                    if (sVar5.g(z17)) {
                        i40 = 256;
                    } else {
                        i40 = 128;
                    }
                    i41 = i38 | i40;
                }
                i42 = i41 | (((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0 || !sVar5.f(str2)) ? 1024 : 2048);
                i43 = i15 & i23;
                if (i43 != 0) {
                    i42 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (sVar5.h(eVar)) {
                        i44 = 8388608;
                    } else {
                        i44 = 4194304;
                    }
                    i42 |= i44;
                }
                i45 = i15 & 262144;
                if (i45 != 0) {
                    i42 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (sVar5.h(fVar)) {
                        i46 = 67108864;
                    } else {
                        i46 = 33554432;
                    }
                    i42 |= i46;
                }
                i47 = i42;
                i48 = i15 & 1048576;
                if (i48 != 0) {
                    i49 = i13 | 6;
                } else if ((i13 & 6) == 0) {
                    if (sVar5.f(zVar)) {
                        i50 = 4;
                    } else {
                        i50 = 2;
                    }
                    i49 = i13 | i50;
                } else {
                    i49 = i13;
                }
                i51 = i15 & 2097152;
                if (i51 != 0) {
                    i49 |= 48;
                } else if ((i13 & 48) == 0) {
                    if (sVar5.h(cVar)) {
                        i52 = 32;
                    } else {
                        i52 = 16;
                    }
                    i49 |= i52;
                }
                i53 = i49;
                i54 = i15 & 4194304;
                if (i54 != 0) {
                    i56 = i53 | 384;
                } else {
                    i55 = i53;
                    if ((i13 & 384) != 0) {
                        if (sVar5.h(cVar2)) {
                            i57 = 256;
                        } else {
                            i57 = 128;
                        }
                        i55 |= i57;
                    }
                    i56 = i55;
                }
                i58 = i15 & 8388608;
                if (i58 != 0) {
                    i60 = i56 | 3072;
                } else {
                    i59 = i56;
                    if ((i13 & 3072) != 0) {
                        if (sVar5.h(cVar3)) {
                            i61 = 2048;
                        } else {
                            i61 = 1024;
                        }
                        i59 |= i61;
                    }
                    i60 = i59;
                }
                i62 = i15 & 16777216;
                if (i62 != 0) {
                    i64 = i60 | 24576;
                } else {
                    i63 = i60;
                    if ((i13 & 24576) == 0) {
                        i64 = i63 | (sVar5.h(cVar4) ? 16384 : 8192);
                    } else {
                        i64 = i63;
                    }
                }
                i65 = i15 & 33554432;
                if (i65 != 0) {
                    i64 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    i64 |= sVar5.h(aVar) ? i23 : 65536;
                }
                i66 = i15 & 67108864;
                if (i66 != 0) {
                    i64 |= 1572864;
                    aVar4 = aVar2;
                } else {
                    aVar4 = aVar2;
                    if ((i13 & 1572864) == 0) {
                        i64 |= sVar5.h(aVar4) ? 1048576 : 524288;
                    }
                }
                if ((i13 & 12582912) == 0) {
                    i64 |= sVar5.h(onClickPlayAudio) ? 8388608 : 4194304;
                }
                if ((i13 & 100663296) == 0) {
                    i64 |= sVar5.h(cVar5) ? 67108864 : 33554432;
                }
                if ((i13 & 805306368) == 0) {
                    if (sVar5.h(getComboCount)) {
                        i78 = 536870912;
                    } else {
                        i78 = 268435456;
                    }
                    i64 |= i78;
                }
                i67 = i64;
                if ((i14 & 6) == 0) {
                    if (sVar5.h(onClickChecked)) {
                        i77 = 4;
                    } else {
                        i77 = 2;
                    }
                    i68 = i14 | i77;
                } else {
                    i68 = i14;
                }
                i69 = i16 & 1;
                if (i69 != 0) {
                    i68 |= 48;
                } else if ((i14 & 48) == 0) {
                    if (sVar == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = sVar.ordinal();
                    }
                    if (sVar5.d(iOrdinal)) {
                        i70 = 32;
                    } else {
                        i70 = 16;
                    }
                    i68 |= i70;
                }
                i71 = i68;
                i72 = i16 & 2;
                if (i72 != 0) {
                    i73 = i71;
                    if ((i14 & 384) == 0) {
                        i73 |= sVar5.h(aVar3) ? 256 : 128;
                    }
                    if ((i14 & 3072) == 0) {
                        i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
                    }
                    int i811111112 = i73;
                    if ((i31 & 306783379) != 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (sVar5.T(i31 & 1, z19)) {
                        sVar5.Y();
                        i74 = i11 & 1;
                        gVar = l1.m.f39353a;
                        if (i74 != 0) {
                            if (i18 != 0) {
                                str3 = BuildConfig.VERSION_NAME;
                            }
                            if (i81 != 0) {
                                z18 = true;
                            }
                            if (i21 != 0) {
                                z27 = true;
                            } else {
                                z27 = z12;
                            }
                            if (i25 != 0) {
                                z28 = true;
                            } else {
                                z28 = z13;
                            }
                            if (i27 != 0) {
                                z29 = false;
                            } else {
                                z29 = z14;
                            }
                            if (i29 != 0) {
                                z30 = false;
                            } else {
                                z30 = z15;
                            }
                            if (i32 != 0) {
                                f14 = 1.0f;
                            } else {
                                f14 = f11;
                            }
                            if (i35 != 0) {
                                z31 = false;
                            } else {
                                z31 = z16;
                            }
                            if (i39 != 0) {
                                z32 = false;
                            } else {
                                z32 = z17;
                            }
                            if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                strE0 = ub.a.e0(sVar5, R.string.test_check);
                                i47 &= -7169;
                            } else {
                                strE0 = str2;
                            }
                            if (i43 != 0) {
                                eVar3 = null;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i45 != 0) {
                                fVar3 = null;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i48 == 0) {
                            }
                            if (i51 != 0) {
                                objQ7 = sVar5.Q();
                                if (objQ7 == gVar) {
                                    objQ7 = new d0.y1(19);
                                    sVar5.o0(objQ7);
                                }
                                cVar10 = (fz.c) objQ7;
                            } else {
                                z27 = z27;
                                cVar10 = cVar;
                            }
                            if (i54 != 0) {
                                objQ6 = sVar5.Q();
                                if (objQ6 == gVar) {
                                    objQ6 = new d0.y1(19);
                                    sVar5.o0(objQ6);
                                }
                                cVar11 = (fz.c) objQ6;
                            } else {
                                cVar10 = cVar10;
                                cVar11 = cVar2;
                            }
                            if (i58 != 0) {
                                objQ5 = sVar5.Q();
                                if (objQ5 == gVar) {
                                    objQ5 = new d0.y1(18);
                                    sVar5.o0(objQ5);
                                }
                                cVar12 = (fz.c) objQ5;
                            } else {
                                cVar11 = cVar11;
                                cVar12 = cVar3;
                            }
                            if (i62 != 0) {
                                objQ4 = sVar5.Q();
                                if (objQ4 == gVar) {
                                    objQ4 = new d0.y1(19);
                                    sVar5.o0(objQ4);
                                }
                                cVar13 = (fz.c) objQ4;
                            } else {
                                cVar12 = cVar12;
                                cVar13 = cVar4;
                            }
                            if (i65 != 0) {
                                objQ3 = sVar5.Q();
                                if (objQ3 == gVar) {
                                    i75 = 15;
                                    objQ3 = new cr.m(15);
                                    sVar5.o0(objQ3);
                                } else {
                                    i75 = 15;
                                }
                                aVar8 = (fz.a) objQ3;
                            } else {
                                cVar13 = cVar13;
                                i75 = 15;
                                aVar8 = aVar;
                            }
                            if (i66 != 0) {
                                objQ2 = sVar5.Q();
                                if (objQ2 == gVar) {
                                    objQ2 = new cr.m(i75);
                                    sVar5.o0(objQ2);
                                }
                                aVar9 = (fz.a) objQ2;
                            } else {
                                aVar9 = aVar4;
                            }
                            if (i69 != 0) {
                                sVar4 = ns.s.OTHER_LOCAL;
                            } else {
                                sVar4 = sVar;
                            }
                            aVar10 = aVar9;
                            if (i72 != 0) {
                                objQ = sVar5.Q();
                                if (objQ == gVar) {
                                    objQ = new cr.m(15);
                                    sVar5.o0(objQ);
                                }
                                i76 = 16;
                                aVar12 = (fz.a) objQ;
                                aVar11 = aVar8;
                            } else {
                                aVar11 = aVar8;
                                i76 = 16;
                                aVar12 = aVar3;
                            }
                            z33 = z28;
                            str6 = str3;
                            z34 = z29;
                            f15 = 1.0f;
                        } else {
                            if (i18 != 0) {
                                str3 = BuildConfig.VERSION_NAME;
                            }
                            if (i81 != 0) {
                                z18 = true;
                            }
                            if (i21 != 0) {
                                z27 = true;
                            } else {
                                z27 = z12;
                            }
                            if (i25 != 0) {
                                z28 = true;
                            } else {
                                z28 = z13;
                            }
                            if (i27 != 0) {
                                z29 = false;
                            } else {
                                z29 = z14;
                            }
                            if (i29 != 0) {
                                z30 = false;
                            } else {
                                z30 = z15;
                            }
                            if (i32 != 0) {
                                f14 = 1.0f;
                            } else {
                                f14 = f11;
                            }
                            if (i35 != 0) {
                                z31 = false;
                            } else {
                                z31 = z16;
                            }
                            if (i39 != 0) {
                                z32 = false;
                            } else {
                                z32 = z17;
                            }
                            if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                strE0 = ub.a.e0(sVar5, R.string.test_check);
                                i47 &= -7169;
                            } else {
                                strE0 = str2;
                            }
                            if (i43 != 0) {
                                eVar3 = null;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i45 != 0) {
                                fVar3 = null;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i48 == 0) {
                            }
                            if (i51 != 0) {
                                objQ7 = sVar5.Q();
                                if (objQ7 == gVar) {
                                    objQ7 = new d0.y1(19);
                                    sVar5.o0(objQ7);
                                }
                                cVar10 = (fz.c) objQ7;
                            } else {
                                z27 = z27;
                                cVar10 = cVar;
                            }
                            if (i54 != 0) {
                                objQ6 = sVar5.Q();
                                if (objQ6 == gVar) {
                                    objQ6 = new d0.y1(19);
                                    sVar5.o0(objQ6);
                                }
                                cVar11 = (fz.c) objQ6;
                            } else {
                                cVar10 = cVar10;
                                cVar11 = cVar2;
                            }
                            if (i58 != 0) {
                                objQ5 = sVar5.Q();
                                if (objQ5 == gVar) {
                                    objQ5 = new d0.y1(18);
                                    sVar5.o0(objQ5);
                                }
                                cVar12 = (fz.c) objQ5;
                            } else {
                                cVar11 = cVar11;
                                cVar12 = cVar3;
                            }
                            if (i62 != 0) {
                                objQ4 = sVar5.Q();
                                if (objQ4 == gVar) {
                                    objQ4 = new d0.y1(19);
                                    sVar5.o0(objQ4);
                                }
                                cVar13 = (fz.c) objQ4;
                            } else {
                                cVar12 = cVar12;
                                cVar13 = cVar4;
                            }
                            if (i65 != 0) {
                                objQ3 = sVar5.Q();
                                if (objQ3 == gVar) {
                                    i75 = 15;
                                    objQ3 = new cr.m(15);
                                    sVar5.o0(objQ3);
                                } else {
                                    i75 = 15;
                                }
                                aVar8 = (fz.a) objQ3;
                            } else {
                                cVar13 = cVar13;
                                i75 = 15;
                                aVar8 = aVar;
                            }
                            if (i66 != 0) {
                                objQ2 = sVar5.Q();
                                if (objQ2 == gVar) {
                                    objQ2 = new cr.m(i75);
                                    sVar5.o0(objQ2);
                                }
                                aVar9 = (fz.a) objQ2;
                            } else {
                                aVar9 = aVar4;
                            }
                            if (i69 != 0) {
                                sVar4 = ns.s.OTHER_LOCAL;
                            } else {
                                sVar4 = sVar;
                            }
                            aVar10 = aVar9;
                            if (i72 != 0) {
                                objQ = sVar5.Q();
                                if (objQ == gVar) {
                                    objQ = new cr.m(15);
                                    sVar5.o0(objQ);
                                }
                                i76 = 16;
                                aVar12 = (fz.a) objQ;
                                aVar11 = aVar8;
                            } else {
                                aVar11 = aVar8;
                                i76 = 16;
                                aVar12 = aVar3;
                            }
                            z33 = z28;
                            str6 = str3;
                            z34 = z29;
                            f15 = 1.0f;
                        }
                        sVar5.q();
                        ns.z zVar12 = zVar3;
                        objQ8 = sVar5.Q();
                        if (objQ8 == gVar) {
                            objQ8 = l1.t.q(sVar5);
                            sVar5.o0(objQ8);
                        }
                        b0Var = (rz.b0) objQ8;
                        uVar = new kotlin.jvm.internal.u();
                        objQ9 = sVar5.Q();
                        if (objQ9 == gVar) {
                            objQ9 = Boolean.FALSE;
                            sVar5.o0(objQ9);
                        }
                        uVar.f38357a = ((Boolean) objQ9).booleanValue();
                        d2VarU = d0.n.u(sVar5);
                        d2VarU2 = d0.n.u(sVar5);
                        String str113 = str6;
                        Context context9 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                        boolean zBooleanValue9 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                        z1.j jVar9 = z1.c.f58463a;
                        boolean z41113 = z27;
                        boolean z41114 = z33;
                        w2.q0 q0VarD17 = j0.o.d(jVar9, false);
                        iHashCode = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL1113 = sVar5.l();
                        ns.s sVar14 = sVar4;
                        oVar = z1.o.f58481a;
                        boolean z41115 = z34;
                        z1.r rVarC11111 = z1.a.c(sVar5, oVar);
                        y2.k.J.getClass();
                        fz.a aVar1118 = aVar12;
                        iVar = y2.j.f56913b;
                        sVar5.h0();
                        fVar4 = fVar3;
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        hVar = y2.j.f56917f;
                        l1.t.J(hVar, q0VarD17, sVar5);
                        hVar2 = y2.j.f56916e;
                        l1.t.J(hVar2, q1VarL1113, sVar5);
                        hVar3 = y2.j.f56918g;
                        fz.a aVar1119 = aVar11;
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                        } else {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                        }
                        hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC11111, sVar5);
                        z1.r rVarR9 = j0.c.r(j0.e2.d(oVar, 1.0f));
                        j0.u uVarA9 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                        iHashCode2 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL1114 = sVar5.l();
                        z1.r rVarC11112 = z1.a.c(sVar5, rVarR9);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, uVarA9, sVar5);
                        l1.t.J(hVar2, q1VarL1114, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                        } else {
                            defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                        }
                        l1.t.J(hVar4, rVarC11112, sVar5);
                        z1.r rVarE9 = j0.e2.e(oVar, 1.0f);
                        d5 = 1.0f;
                        if (d5 <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        f16 = i76;
                        z1.r rVarC11113 = j0.c.C(w4.c.p(1.0f, true, rVarE9), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                        objQ10 = sVar5.Q();
                        if (zH) {
                            final int i811111113 = 0;
                            objQ10 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i811111113) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ10);
                        } else {
                            final int i811111114 = 0;
                            objQ10 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i811111114) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ10);
                        }
                        fz.a aVar11110 = (fz.a) objQ10;
                        zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                        objQ11 = sVar5.Q();
                        if (zH2) {
                            final int i811111115 = 1;
                            objQ11 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i811111115) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ11);
                        } else {
                            final int i811111116 = 1;
                            objQ11 = new fz.a() { // from class: dt.y2
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i811111116) {
                                        case 0:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                            break;
                                        default:
                                            rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar5.o0(objQ11);
                        }
                        int i811111117 = i31 >> 12;
                        int i811111118 = (i31 & 14) | (i811111117 & 112) | (i811111117 & 896) | (i811111117 & 7168) | ((i31 >> 15) & 57344);
                        int i811111119 = i47 << 15;
                        int i8111111110 = i67 << 18;
                        b(str113, z41113, z41114, z41115, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC11113, dVar, dVar2, dVar3, eVar3, aVar10, aVar11110, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i811111118 | (i811111119 & 458752) | (3670016 & i811111119) | (i811111119 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i8111111110) | (234881024 & i8111111110) | (i8111111110 & 1879048192), (i67 >> 12) & 14);
                        boolean z41116 = z31;
                        float f1113 = f14;
                        float f1114 = f15;
                        str3 = str113;
                        if (courseTestState == ht.q.CHECKING) {
                            sVar5.d0(1774820302);
                            z1.r rVarG9 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                            objQ17 = sVar5.Q();
                            if (objQ17 == gVar) {
                                objQ17 = new cr.m(15);
                                sVar5.o0(objQ17);
                            }
                            iu.k.e((fz.a) objQ17, rVarG9, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                            z36 = false;
                            sVar5.p(false);
                            z37 = true;
                        } else {
                            sVar5.d0(1775330221);
                            j0.a2 a2VarA9 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                            iHashCode3 = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL1115 = sVar5.l();
                            z1.r rVarC11114 = z1.a.c(sVar5, oVar);
                            sVar5.h0();
                            if (sVar5.S) {
                                sVar5.k(iVar);
                            } else {
                                sVar5.r0();
                            }
                            l1.t.J(hVar, a2VarA9, sVar5);
                            l1.t.J(hVar2, q1VarL1115, sVar5);
                            if (sVar5.S) {
                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                            } else {
                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                            }
                            l1.t.J(hVar4, rVarC11114, sVar5);
                            if (d5 <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            j0.i1 i1Var9 = new j0.i1(1.0f, true);
                            if ((i31 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            objQ12 = sVar5.Q();
                            if (z35) {
                                objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                                sVar5.o0(objQ12);
                            } else {
                                objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                                sVar5.o0(objQ12);
                            }
                            String str114 = strE0;
                            a0.g(courseTestState, g2.f0.q(i1Var9, (fz.c) objQ12), str114, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                            strE0 = str114;
                            if (z30) {
                                z36 = false;
                                sVar5.d0(393996308);
                            } else {
                                z36 = false;
                                sVar5.d0(393996308);
                            }
                            sVar5.p(z36);
                            z37 = true;
                            sVar5.p(true);
                            sVar5.p(z36);
                        }
                        sVar5.p(z37);
                        rVar = j0.r.f35391a;
                        if (fVar4 == null) {
                            sVar5.d0(1152060677);
                            sVar5.p(z36);
                            fVar5 = fVar4;
                        } else {
                            sVar5.d0(452805244);
                            fVar5 = fVar4;
                            fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                            sVar5.p(z36);
                        }
                        z1.r rVarA9 = rVar.a(oVar, z1.c.H);
                        w2.q0 q0VarD18 = j0.o.d(jVar9, z36);
                        fz.f fVar14 = fVar5;
                        iHashCode4 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL1116 = sVar5.l();
                        z1.r rVarC11115 = z1.a.c(sVar5, rVarA9);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, q0VarD18, sVar5);
                        l1.t.J(hVar2, q1VarL1116, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                        } else {
                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                        }
                        l1.t.J(hVar4, rVarC11115, sVar5);
                        if (courseTestState == ht.q.REVISING) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objQ13 = sVar5.Q();
                        if (objQ13 == gVar) {
                            objQ13 = new d0.y1(20);
                            sVar5.o0(objQ13);
                        }
                        a0.l1 l1VarC17 = a0.f1.c((fz.c) objQ13, 7);
                        objQ14 = sVar5.Q();
                        if (objQ14 == gVar) {
                            objQ14 = new d0.y1(21);
                            sVar5.o0(objQ14);
                        }
                        a0.j0.d(z38, null, l1VarC17, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar14, aVar1118), sVar5), sVar5, 200064, 18);
                        ht.q qVar9 = ht.q.CORRECT;
                        boolean zD9 = ry.l.D(new ht.q[]{qVar9, ht.q.WRONG}, courseTestState);
                        objQ15 = sVar5.Q();
                        if (objQ15 == gVar) {
                            objQ15 = new d0.y1(22);
                            sVar5.o0(objQ15);
                        }
                        a0.l1 l1VarC18 = a0.f1.c((fz.c) objQ15, 7);
                        objQ16 = sVar5.Q();
                        if (objQ16 == gVar) {
                            objQ16 = new d0.y1(23);
                            sVar5.o0(objQ16);
                        }
                        a0.j0.d(zD9, null, l1VarC18, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context9, getComboCount, audioPlayingState, zVar12, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                        sVar5.p(true);
                        int iIntValue9 = ((Number) getComboCount.invoke()).intValue();
                        if (z18) {
                            z39 = false;
                            sVar5.d0(1141210802);
                        } else {
                            z39 = false;
                            sVar5.d0(1141210802);
                        }
                        sVar5.p(z39);
                        sVar5.p(true);
                        z24 = z18;
                        z22 = z30;
                        str4 = strE0;
                        z20 = z41113;
                        z21 = z41114;
                        sVar3 = sVar5;
                        z25 = z41115;
                        z26 = z32;
                        z23 = z41116;
                        zVar2 = zVar12;
                        cVar6 = cVar10;
                        cVar7 = cVar11;
                        cVar8 = cVar12;
                        cVar9 = cVar13;
                        aVar5 = aVar1119;
                        sVar2 = sVar14;
                        aVar6 = aVar1118;
                        f12 = f1114;
                        f13 = f1113;
                        eVar2 = eVar3;
                        aVar7 = aVar10;
                        fVar2 = fVar14;
                    } else {
                        sVar5.W();
                        z20 = z12;
                        z21 = z13;
                        z22 = z15;
                        f12 = f5;
                        f13 = f11;
                        z23 = z16;
                        str4 = str2;
                        eVar2 = eVar;
                        fVar2 = fVar;
                        zVar2 = zVar;
                        cVar6 = cVar;
                        cVar7 = cVar2;
                        cVar8 = cVar3;
                        cVar9 = cVar4;
                        aVar5 = aVar;
                        sVar2 = sVar;
                        aVar6 = aVar3;
                        aVar7 = aVar4;
                        sVar3 = sVar5;
                        z24 = z18;
                        z25 = z14;
                        z26 = z17;
                    }
                    str5 = str3;
                    x1VarT = sVar3.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.x2
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM = l1.t.M(i11 | 1);
                                int iM2 = l1.t.M(i12);
                                int iM3 = l1.t.M(i13);
                                int iM4 = l1.t.M(i14);
                                k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i73 = i71 | 384;
                if ((i14 & 3072) == 0) {
                    i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
                }
                int i8111111111 = i73;
                if ((i31 & 306783379) != 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (sVar5.T(i31 & 1, z19)) {
                    sVar5.Y();
                    i74 = i11 & 1;
                    gVar = l1.m.f39353a;
                    if (i74 != 0) {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    } else {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    }
                    sVar5.q();
                    ns.z zVar13 = zVar3;
                    objQ8 = sVar5.Q();
                    if (objQ8 == gVar) {
                        objQ8 = l1.t.q(sVar5);
                        sVar5.o0(objQ8);
                    }
                    b0Var = (rz.b0) objQ8;
                    uVar = new kotlin.jvm.internal.u();
                    objQ9 = sVar5.Q();
                    if (objQ9 == gVar) {
                        objQ9 = Boolean.FALSE;
                        sVar5.o0(objQ9);
                    }
                    uVar.f38357a = ((Boolean) objQ9).booleanValue();
                    d2VarU = d0.n.u(sVar5);
                    d2VarU2 = d0.n.u(sVar5);
                    String str115 = str6;
                    Context context10 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                    boolean zBooleanValue10 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                    z1.j jVar10 = z1.c.f58463a;
                    boolean z41117 = z27;
                    boolean z41118 = z33;
                    w2.q0 q0VarD19 = j0.o.d(jVar10, false);
                    iHashCode = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL1117 = sVar5.l();
                    ns.s sVar15 = sVar4;
                    oVar = z1.o.f58481a;
                    boolean z41119 = z34;
                    z1.r rVarC11116 = z1.a.c(sVar5, oVar);
                    y2.k.J.getClass();
                    fz.a aVar11111 = aVar12;
                    iVar = y2.j.f56913b;
                    sVar5.h0();
                    fVar4 = fVar3;
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD19, sVar5);
                    hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL1117, sVar5);
                    hVar3 = y2.j.f56918g;
                    fz.a aVar11112 = aVar11;
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    } else {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    }
                    hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC11116, sVar5);
                    z1.r rVarR10 = j0.c.r(j0.e2.d(oVar, 1.0f));
                    j0.u uVarA10 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                    iHashCode2 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL1118 = sVar5.l();
                    z1.r rVarC11117 = z1.a.c(sVar5, rVarR10);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, uVarA10, sVar5);
                    l1.t.J(hVar2, q1VarL1118, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    } else {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC11117, sVar5);
                    z1.r rVarE10 = j0.e2.e(oVar, 1.0f);
                    d5 = 1.0f;
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    f16 = i76;
                    z1.r rVarC11118 = j0.c.C(w4.c.p(1.0f, true, rVarE10), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                    objQ10 = sVar5.Q();
                    if (zH) {
                        final int i8111111112 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8111111112) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    } else {
                        final int i8111111113 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8111111113) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    }
                    fz.a aVar11113 = (fz.a) objQ10;
                    zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                    objQ11 = sVar5.Q();
                    if (zH2) {
                        final int i8111111114 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8111111114) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    } else {
                        final int i8111111115 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8111111115) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    }
                    int i8111111116 = i31 >> 12;
                    int i8111111117 = (i31 & 14) | (i8111111116 & 112) | (i8111111116 & 896) | (i8111111116 & 7168) | ((i31 >> 15) & 57344);
                    int i8111111118 = i47 << 15;
                    int i8111111119 = i67 << 18;
                    b(str115, z41117, z41118, z41119, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC11118, dVar, dVar2, dVar3, eVar3, aVar10, aVar11113, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i8111111117 | (i8111111118 & 458752) | (3670016 & i8111111118) | (i8111111118 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i8111111119) | (234881024 & i8111111119) | (i8111111119 & 1879048192), (i67 >> 12) & 14);
                    boolean z411110 = z31;
                    float f1115 = f14;
                    float f1116 = f15;
                    str3 = str115;
                    if (courseTestState == ht.q.CHECKING) {
                        sVar5.d0(1774820302);
                        z1.r rVarG10 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                        objQ17 = sVar5.Q();
                        if (objQ17 == gVar) {
                            objQ17 = new cr.m(15);
                            sVar5.o0(objQ17);
                        }
                        iu.k.e((fz.a) objQ17, rVarG10, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                        z36 = false;
                        sVar5.p(false);
                        z37 = true;
                    } else {
                        sVar5.d0(1775330221);
                        j0.a2 a2VarA10 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                        iHashCode3 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL1119 = sVar5.l();
                        z1.r rVarC11119 = z1.a.c(sVar5, oVar);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, a2VarA10, sVar5);
                        l1.t.J(hVar2, q1VarL1119, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC11119, sVar5);
                        if (d5 <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var10 = new j0.i1(1.0f, true);
                        if ((i31 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objQ12 = sVar5.Q();
                        if (z35) {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        } else {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        }
                        String str116 = strE0;
                        a0.g(courseTestState, g2.f0.q(i1Var10, (fz.c) objQ12), str116, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                        strE0 = str116;
                        if (z30) {
                            z36 = false;
                            sVar5.d0(393996308);
                        } else {
                            z36 = false;
                            sVar5.d0(393996308);
                        }
                        sVar5.p(z36);
                        z37 = true;
                        sVar5.p(true);
                        sVar5.p(z36);
                    }
                    sVar5.p(z37);
                    rVar = j0.r.f35391a;
                    if (fVar4 == null) {
                        sVar5.d0(1152060677);
                        sVar5.p(z36);
                        fVar5 = fVar4;
                    } else {
                        sVar5.d0(452805244);
                        fVar5 = fVar4;
                        fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                        sVar5.p(z36);
                    }
                    z1.r rVarA10 = rVar.a(oVar, z1.c.H);
                    w2.q0 q0VarD110 = j0.o.d(jVar10, z36);
                    fz.f fVar15 = fVar5;
                    iHashCode4 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL11110 = sVar5.l();
                    z1.r rVarC111110 = z1.a.c(sVar5, rVarA10);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, q0VarD110, sVar5);
                    l1.t.J(hVar2, q1VarL11110, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    } else {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    }
                    l1.t.J(hVar4, rVarC111110, sVar5);
                    if (courseTestState == ht.q.REVISING) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objQ13 = sVar5.Q();
                    if (objQ13 == gVar) {
                        objQ13 = new d0.y1(20);
                        sVar5.o0(objQ13);
                    }
                    a0.l1 l1VarC19 = a0.f1.c((fz.c) objQ13, 7);
                    objQ14 = sVar5.Q();
                    if (objQ14 == gVar) {
                        objQ14 = new d0.y1(21);
                        sVar5.o0(objQ14);
                    }
                    a0.j0.d(z38, null, l1VarC19, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar15, aVar11111), sVar5), sVar5, 200064, 18);
                    ht.q qVar10 = ht.q.CORRECT;
                    boolean zD10 = ry.l.D(new ht.q[]{qVar10, ht.q.WRONG}, courseTestState);
                    objQ15 = sVar5.Q();
                    if (objQ15 == gVar) {
                        objQ15 = new d0.y1(22);
                        sVar5.o0(objQ15);
                    }
                    a0.l1 l1VarC110 = a0.f1.c((fz.c) objQ15, 7);
                    objQ16 = sVar5.Q();
                    if (objQ16 == gVar) {
                        objQ16 = new d0.y1(23);
                        sVar5.o0(objQ16);
                    }
                    a0.j0.d(zD10, null, l1VarC110, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context10, getComboCount, audioPlayingState, zVar13, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                    sVar5.p(true);
                    int iIntValue10 = ((Number) getComboCount.invoke()).intValue();
                    if (z18) {
                        z39 = false;
                        sVar5.d0(1141210802);
                    } else {
                        z39 = false;
                        sVar5.d0(1141210802);
                    }
                    sVar5.p(z39);
                    sVar5.p(true);
                    z24 = z18;
                    z22 = z30;
                    str4 = strE0;
                    z20 = z41117;
                    z21 = z41118;
                    sVar3 = sVar5;
                    z25 = z41119;
                    z26 = z32;
                    z23 = z411110;
                    zVar2 = zVar13;
                    cVar6 = cVar10;
                    cVar7 = cVar11;
                    cVar8 = cVar12;
                    cVar9 = cVar13;
                    aVar5 = aVar11112;
                    sVar2 = sVar15;
                    aVar6 = aVar11111;
                    f12 = f1116;
                    f13 = f1115;
                    eVar2 = eVar3;
                    aVar7 = aVar10;
                    fVar2 = fVar15;
                } else {
                    sVar5.W();
                    z20 = z12;
                    z21 = z13;
                    z22 = z15;
                    f12 = f5;
                    f13 = f11;
                    z23 = z16;
                    str4 = str2;
                    eVar2 = eVar;
                    fVar2 = fVar;
                    zVar2 = zVar;
                    cVar6 = cVar;
                    cVar7 = cVar2;
                    cVar8 = cVar3;
                    cVar9 = cVar4;
                    aVar5 = aVar;
                    sVar2 = sVar;
                    aVar6 = aVar3;
                    aVar7 = aVar4;
                    sVar3 = sVar5;
                    z24 = z18;
                    z25 = z14;
                    z26 = z17;
                }
                str5 = str3;
                x1VarT = sVar3.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.x2
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i11 | 1);
                            int iM2 = l1.t.M(i12);
                            int iM3 = l1.t.M(i13);
                            int iM4 = l1.t.M(i14);
                            k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i80 |= 100663296;
            i31 = i80 | 805306368;
            i32 = i15 & 1024;
            if (i32 != 0) {
                i34 = i12 | 6;
            } else {
                if (sVar5.c(f11)) {
                    i33 = 4;
                } else {
                    i33 = 2;
                }
                i34 = i12 | i33;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i37 = i34 | 48;
            } else {
                if (sVar5.g(z16)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i37 = i34 | i36;
            }
            i38 = i37;
            i39 = i15 & 4096;
            if (i39 != 0) {
                i41 = i38 | 384;
            } else {
                if (sVar5.g(z17)) {
                    i40 = 256;
                } else {
                    i40 = 128;
                }
                i41 = i38 | i40;
            }
            i42 = i41 | (((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0 || !sVar5.f(str2)) ? 1024 : 2048);
            i43 = i15 & i23;
            if (i43 != 0) {
                i42 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (sVar5.h(eVar)) {
                    i44 = 8388608;
                } else {
                    i44 = 4194304;
                }
                i42 |= i44;
            }
            i45 = i15 & 262144;
            if (i45 != 0) {
                i42 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (sVar5.h(fVar)) {
                    i46 = 67108864;
                } else {
                    i46 = 33554432;
                }
                i42 |= i46;
            }
            i47 = i42;
            i48 = i15 & 1048576;
            if (i48 != 0) {
                i49 = i13 | 6;
            } else if ((i13 & 6) == 0) {
                if (sVar5.f(zVar)) {
                    i50 = 4;
                } else {
                    i50 = 2;
                }
                i49 = i13 | i50;
            } else {
                i49 = i13;
            }
            i51 = i15 & 2097152;
            if (i51 != 0) {
                i49 |= 48;
            } else if ((i13 & 48) == 0) {
                if (sVar5.h(cVar)) {
                    i52 = 32;
                } else {
                    i52 = 16;
                }
                i49 |= i52;
            }
            i53 = i49;
            i54 = i15 & 4194304;
            if (i54 != 0) {
                i56 = i53 | 384;
            } else {
                i55 = i53;
                if ((i13 & 384) != 0) {
                    if (sVar5.h(cVar2)) {
                        i57 = 256;
                    } else {
                        i57 = 128;
                    }
                    i55 |= i57;
                }
                i56 = i55;
            }
            i58 = i15 & 8388608;
            if (i58 != 0) {
                i60 = i56 | 3072;
            } else {
                i59 = i56;
                if ((i13 & 3072) != 0) {
                    if (sVar5.h(cVar3)) {
                        i61 = 2048;
                    } else {
                        i61 = 1024;
                    }
                    i59 |= i61;
                }
                i60 = i59;
            }
            i62 = i15 & 16777216;
            if (i62 != 0) {
                i64 = i60 | 24576;
            } else {
                i63 = i60;
                if ((i13 & 24576) == 0) {
                    i64 = i63 | (sVar5.h(cVar4) ? 16384 : 8192);
                } else {
                    i64 = i63;
                }
            }
            i65 = i15 & 33554432;
            if (i65 != 0) {
                i64 |= 196608;
            } else if ((i13 & 196608) == 0) {
                i64 |= sVar5.h(aVar) ? i23 : 65536;
            }
            i66 = i15 & 67108864;
            if (i66 != 0) {
                i64 |= 1572864;
                aVar4 = aVar2;
            } else {
                aVar4 = aVar2;
                if ((i13 & 1572864) == 0) {
                    i64 |= sVar5.h(aVar4) ? 1048576 : 524288;
                }
            }
            if ((i13 & 12582912) == 0) {
                i64 |= sVar5.h(onClickPlayAudio) ? 8388608 : 4194304;
            }
            if ((i13 & 100663296) == 0) {
                i64 |= sVar5.h(cVar5) ? 67108864 : 33554432;
            }
            if ((i13 & 805306368) == 0) {
                if (sVar5.h(getComboCount)) {
                    i78 = 536870912;
                } else {
                    i78 = 268435456;
                }
                i64 |= i78;
            }
            i67 = i64;
            if ((i14 & 6) == 0) {
                if (sVar5.h(onClickChecked)) {
                    i77 = 4;
                } else {
                    i77 = 2;
                }
                i68 = i14 | i77;
            } else {
                i68 = i14;
            }
            i69 = i16 & 1;
            if (i69 != 0) {
                i68 |= 48;
            } else if ((i14 & 48) == 0) {
                if (sVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = sVar.ordinal();
                }
                if (sVar5.d(iOrdinal)) {
                    i70 = 32;
                } else {
                    i70 = 16;
                }
                i68 |= i70;
            }
            i71 = i68;
            i72 = i16 & 2;
            if (i72 != 0) {
                i73 = i71;
                if ((i14 & 384) == 0) {
                    i73 |= sVar5.h(aVar3) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
                }
                int i81111111110 = i73;
                if ((i31 & 306783379) != 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (sVar5.T(i31 & 1, z19)) {
                    sVar5.Y();
                    i74 = i11 & 1;
                    gVar = l1.m.f39353a;
                    if (i74 != 0) {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    } else {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    }
                    sVar5.q();
                    ns.z zVar14 = zVar3;
                    objQ8 = sVar5.Q();
                    if (objQ8 == gVar) {
                        objQ8 = l1.t.q(sVar5);
                        sVar5.o0(objQ8);
                    }
                    b0Var = (rz.b0) objQ8;
                    uVar = new kotlin.jvm.internal.u();
                    objQ9 = sVar5.Q();
                    if (objQ9 == gVar) {
                        objQ9 = Boolean.FALSE;
                        sVar5.o0(objQ9);
                    }
                    uVar.f38357a = ((Boolean) objQ9).booleanValue();
                    d2VarU = d0.n.u(sVar5);
                    d2VarU2 = d0.n.u(sVar5);
                    String str117 = str6;
                    Context context11 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                    boolean zBooleanValue11 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                    z1.j jVar11 = z1.c.f58463a;
                    boolean z411111 = z27;
                    boolean z411112 = z33;
                    w2.q0 q0VarD111 = j0.o.d(jVar11, false);
                    iHashCode = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL11111 = sVar5.l();
                    ns.s sVar16 = sVar4;
                    oVar = z1.o.f58481a;
                    boolean z411113 = z34;
                    z1.r rVarC111111 = z1.a.c(sVar5, oVar);
                    y2.k.J.getClass();
                    fz.a aVar11114 = aVar12;
                    iVar = y2.j.f56913b;
                    sVar5.h0();
                    fVar4 = fVar3;
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD111, sVar5);
                    hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL11111, sVar5);
                    hVar3 = y2.j.f56918g;
                    fz.a aVar11115 = aVar11;
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    } else {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    }
                    hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC111111, sVar5);
                    z1.r rVarR11 = j0.c.r(j0.e2.d(oVar, 1.0f));
                    j0.u uVarA11 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                    iHashCode2 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL11112 = sVar5.l();
                    z1.r rVarC111112 = z1.a.c(sVar5, rVarR11);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, uVarA11, sVar5);
                    l1.t.J(hVar2, q1VarL11112, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    } else {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC111112, sVar5);
                    z1.r rVarE11 = j0.e2.e(oVar, 1.0f);
                    d5 = 1.0f;
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    f16 = i76;
                    z1.r rVarC111113 = j0.c.C(w4.c.p(1.0f, true, rVarE11), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                    objQ10 = sVar5.Q();
                    if (zH) {
                        final int i81111111111 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i81111111111) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    } else {
                        final int i81111111112 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i81111111112) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    }
                    fz.a aVar11116 = (fz.a) objQ10;
                    zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                    objQ11 = sVar5.Q();
                    if (zH2) {
                        final int i81111111113 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i81111111113) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    } else {
                        final int i81111111114 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i81111111114) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    }
                    int i81111111115 = i31 >> 12;
                    int i81111111116 = (i31 & 14) | (i81111111115 & 112) | (i81111111115 & 896) | (i81111111115 & 7168) | ((i31 >> 15) & 57344);
                    int i81111111117 = i47 << 15;
                    int i81111111118 = i67 << 18;
                    b(str117, z411111, z411112, z411113, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC111113, dVar, dVar2, dVar3, eVar3, aVar10, aVar11116, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i81111111116 | (i81111111117 & 458752) | (3670016 & i81111111117) | (i81111111117 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i81111111118) | (234881024 & i81111111118) | (i81111111118 & 1879048192), (i67 >> 12) & 14);
                    boolean z411114 = z31;
                    float f1117 = f14;
                    float f1118 = f15;
                    str3 = str117;
                    if (courseTestState == ht.q.CHECKING) {
                        sVar5.d0(1774820302);
                        z1.r rVarG11 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                        objQ17 = sVar5.Q();
                        if (objQ17 == gVar) {
                            objQ17 = new cr.m(15);
                            sVar5.o0(objQ17);
                        }
                        iu.k.e((fz.a) objQ17, rVarG11, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                        z36 = false;
                        sVar5.p(false);
                        z37 = true;
                    } else {
                        sVar5.d0(1775330221);
                        j0.a2 a2VarA11 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                        iHashCode3 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL11113 = sVar5.l();
                        z1.r rVarC111114 = z1.a.c(sVar5, oVar);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, a2VarA11, sVar5);
                        l1.t.J(hVar2, q1VarL11113, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC111114, sVar5);
                        if (d5 <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var11 = new j0.i1(1.0f, true);
                        if ((i31 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objQ12 = sVar5.Q();
                        if (z35) {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        } else {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        }
                        String str118 = strE0;
                        a0.g(courseTestState, g2.f0.q(i1Var11, (fz.c) objQ12), str118, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                        strE0 = str118;
                        if (z30) {
                            z36 = false;
                            sVar5.d0(393996308);
                        } else {
                            z36 = false;
                            sVar5.d0(393996308);
                        }
                        sVar5.p(z36);
                        z37 = true;
                        sVar5.p(true);
                        sVar5.p(z36);
                    }
                    sVar5.p(z37);
                    rVar = j0.r.f35391a;
                    if (fVar4 == null) {
                        sVar5.d0(1152060677);
                        sVar5.p(z36);
                        fVar5 = fVar4;
                    } else {
                        sVar5.d0(452805244);
                        fVar5 = fVar4;
                        fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                        sVar5.p(z36);
                    }
                    z1.r rVarA11 = rVar.a(oVar, z1.c.H);
                    w2.q0 q0VarD112 = j0.o.d(jVar11, z36);
                    fz.f fVar16 = fVar5;
                    iHashCode4 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL11114 = sVar5.l();
                    z1.r rVarC111115 = z1.a.c(sVar5, rVarA11);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, q0VarD112, sVar5);
                    l1.t.J(hVar2, q1VarL11114, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    } else {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    }
                    l1.t.J(hVar4, rVarC111115, sVar5);
                    if (courseTestState == ht.q.REVISING) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objQ13 = sVar5.Q();
                    if (objQ13 == gVar) {
                        objQ13 = new d0.y1(20);
                        sVar5.o0(objQ13);
                    }
                    a0.l1 l1VarC111 = a0.f1.c((fz.c) objQ13, 7);
                    objQ14 = sVar5.Q();
                    if (objQ14 == gVar) {
                        objQ14 = new d0.y1(21);
                        sVar5.o0(objQ14);
                    }
                    a0.j0.d(z38, null, l1VarC111, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar16, aVar11114), sVar5), sVar5, 200064, 18);
                    ht.q qVar11 = ht.q.CORRECT;
                    boolean zD11 = ry.l.D(new ht.q[]{qVar11, ht.q.WRONG}, courseTestState);
                    objQ15 = sVar5.Q();
                    if (objQ15 == gVar) {
                        objQ15 = new d0.y1(22);
                        sVar5.o0(objQ15);
                    }
                    a0.l1 l1VarC112 = a0.f1.c((fz.c) objQ15, 7);
                    objQ16 = sVar5.Q();
                    if (objQ16 == gVar) {
                        objQ16 = new d0.y1(23);
                        sVar5.o0(objQ16);
                    }
                    a0.j0.d(zD11, null, l1VarC112, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context11, getComboCount, audioPlayingState, zVar14, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                    sVar5.p(true);
                    int iIntValue11 = ((Number) getComboCount.invoke()).intValue();
                    if (z18) {
                        z39 = false;
                        sVar5.d0(1141210802);
                    } else {
                        z39 = false;
                        sVar5.d0(1141210802);
                    }
                    sVar5.p(z39);
                    sVar5.p(true);
                    z24 = z18;
                    z22 = z30;
                    str4 = strE0;
                    z20 = z411111;
                    z21 = z411112;
                    sVar3 = sVar5;
                    z25 = z411113;
                    z26 = z32;
                    z23 = z411114;
                    zVar2 = zVar14;
                    cVar6 = cVar10;
                    cVar7 = cVar11;
                    cVar8 = cVar12;
                    cVar9 = cVar13;
                    aVar5 = aVar11115;
                    sVar2 = sVar16;
                    aVar6 = aVar11114;
                    f12 = f1118;
                    f13 = f1117;
                    eVar2 = eVar3;
                    aVar7 = aVar10;
                    fVar2 = fVar16;
                } else {
                    sVar5.W();
                    z20 = z12;
                    z21 = z13;
                    z22 = z15;
                    f12 = f5;
                    f13 = f11;
                    z23 = z16;
                    str4 = str2;
                    eVar2 = eVar;
                    fVar2 = fVar;
                    zVar2 = zVar;
                    cVar6 = cVar;
                    cVar7 = cVar2;
                    cVar8 = cVar3;
                    cVar9 = cVar4;
                    aVar5 = aVar;
                    sVar2 = sVar;
                    aVar6 = aVar3;
                    aVar7 = aVar4;
                    sVar3 = sVar5;
                    z24 = z18;
                    z25 = z14;
                    z26 = z17;
                }
                str5 = str3;
                x1VarT = sVar3.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.x2
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i11 | 1);
                            int iM2 = l1.t.M(i12);
                            int iM3 = l1.t.M(i13);
                            int iM4 = l1.t.M(i14);
                            k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i73 = i71 | 384;
            if ((i14 & 3072) == 0) {
                i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
            }
            int i81111111119 = i73;
            if ((i31 & 306783379) != 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (sVar5.T(i31 & 1, z19)) {
                sVar5.Y();
                i74 = i11 & 1;
                gVar = l1.m.f39353a;
                if (i74 != 0) {
                    if (i18 != 0) {
                        str3 = BuildConfig.VERSION_NAME;
                    }
                    if (i81 != 0) {
                        z18 = true;
                    }
                    if (i21 != 0) {
                        z27 = true;
                    } else {
                        z27 = z12;
                    }
                    if (i25 != 0) {
                        z28 = true;
                    } else {
                        z28 = z13;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z14;
                    }
                    if (i29 != 0) {
                        z30 = false;
                    } else {
                        z30 = z15;
                    }
                    if (i32 != 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = f11;
                    }
                    if (i35 != 0) {
                        z31 = false;
                    } else {
                        z31 = z16;
                    }
                    if (i39 != 0) {
                        z32 = false;
                    } else {
                        z32 = z17;
                    }
                    if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                        strE0 = ub.a.e0(sVar5, R.string.test_check);
                        i47 &= -7169;
                    } else {
                        strE0 = str2;
                    }
                    if (i43 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i45 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i48 == 0) {
                    }
                    if (i51 != 0) {
                        objQ7 = sVar5.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new d0.y1(19);
                            sVar5.o0(objQ7);
                        }
                        cVar10 = (fz.c) objQ7;
                    } else {
                        z27 = z27;
                        cVar10 = cVar;
                    }
                    if (i54 != 0) {
                        objQ6 = sVar5.Q();
                        if (objQ6 == gVar) {
                            objQ6 = new d0.y1(19);
                            sVar5.o0(objQ6);
                        }
                        cVar11 = (fz.c) objQ6;
                    } else {
                        cVar10 = cVar10;
                        cVar11 = cVar2;
                    }
                    if (i58 != 0) {
                        objQ5 = sVar5.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new d0.y1(18);
                            sVar5.o0(objQ5);
                        }
                        cVar12 = (fz.c) objQ5;
                    } else {
                        cVar11 = cVar11;
                        cVar12 = cVar3;
                    }
                    if (i62 != 0) {
                        objQ4 = sVar5.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new d0.y1(19);
                            sVar5.o0(objQ4);
                        }
                        cVar13 = (fz.c) objQ4;
                    } else {
                        cVar12 = cVar12;
                        cVar13 = cVar4;
                    }
                    if (i65 != 0) {
                        objQ3 = sVar5.Q();
                        if (objQ3 == gVar) {
                            i75 = 15;
                            objQ3 = new cr.m(15);
                            sVar5.o0(objQ3);
                        } else {
                            i75 = 15;
                        }
                        aVar8 = (fz.a) objQ3;
                    } else {
                        cVar13 = cVar13;
                        i75 = 15;
                        aVar8 = aVar;
                    }
                    if (i66 != 0) {
                        objQ2 = sVar5.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new cr.m(i75);
                            sVar5.o0(objQ2);
                        }
                        aVar9 = (fz.a) objQ2;
                    } else {
                        aVar9 = aVar4;
                    }
                    if (i69 != 0) {
                        sVar4 = ns.s.OTHER_LOCAL;
                    } else {
                        sVar4 = sVar;
                    }
                    aVar10 = aVar9;
                    if (i72 != 0) {
                        objQ = sVar5.Q();
                        if (objQ == gVar) {
                            objQ = new cr.m(15);
                            sVar5.o0(objQ);
                        }
                        i76 = 16;
                        aVar12 = (fz.a) objQ;
                        aVar11 = aVar8;
                    } else {
                        aVar11 = aVar8;
                        i76 = 16;
                        aVar12 = aVar3;
                    }
                    z33 = z28;
                    str6 = str3;
                    z34 = z29;
                    f15 = 1.0f;
                } else {
                    if (i18 != 0) {
                        str3 = BuildConfig.VERSION_NAME;
                    }
                    if (i81 != 0) {
                        z18 = true;
                    }
                    if (i21 != 0) {
                        z27 = true;
                    } else {
                        z27 = z12;
                    }
                    if (i25 != 0) {
                        z28 = true;
                    } else {
                        z28 = z13;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z14;
                    }
                    if (i29 != 0) {
                        z30 = false;
                    } else {
                        z30 = z15;
                    }
                    if (i32 != 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = f11;
                    }
                    if (i35 != 0) {
                        z31 = false;
                    } else {
                        z31 = z16;
                    }
                    if (i39 != 0) {
                        z32 = false;
                    } else {
                        z32 = z17;
                    }
                    if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                        strE0 = ub.a.e0(sVar5, R.string.test_check);
                        i47 &= -7169;
                    } else {
                        strE0 = str2;
                    }
                    if (i43 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i45 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i48 == 0) {
                    }
                    if (i51 != 0) {
                        objQ7 = sVar5.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new d0.y1(19);
                            sVar5.o0(objQ7);
                        }
                        cVar10 = (fz.c) objQ7;
                    } else {
                        z27 = z27;
                        cVar10 = cVar;
                    }
                    if (i54 != 0) {
                        objQ6 = sVar5.Q();
                        if (objQ6 == gVar) {
                            objQ6 = new d0.y1(19);
                            sVar5.o0(objQ6);
                        }
                        cVar11 = (fz.c) objQ6;
                    } else {
                        cVar10 = cVar10;
                        cVar11 = cVar2;
                    }
                    if (i58 != 0) {
                        objQ5 = sVar5.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new d0.y1(18);
                            sVar5.o0(objQ5);
                        }
                        cVar12 = (fz.c) objQ5;
                    } else {
                        cVar11 = cVar11;
                        cVar12 = cVar3;
                    }
                    if (i62 != 0) {
                        objQ4 = sVar5.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new d0.y1(19);
                            sVar5.o0(objQ4);
                        }
                        cVar13 = (fz.c) objQ4;
                    } else {
                        cVar12 = cVar12;
                        cVar13 = cVar4;
                    }
                    if (i65 != 0) {
                        objQ3 = sVar5.Q();
                        if (objQ3 == gVar) {
                            i75 = 15;
                            objQ3 = new cr.m(15);
                            sVar5.o0(objQ3);
                        } else {
                            i75 = 15;
                        }
                        aVar8 = (fz.a) objQ3;
                    } else {
                        cVar13 = cVar13;
                        i75 = 15;
                        aVar8 = aVar;
                    }
                    if (i66 != 0) {
                        objQ2 = sVar5.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new cr.m(i75);
                            sVar5.o0(objQ2);
                        }
                        aVar9 = (fz.a) objQ2;
                    } else {
                        aVar9 = aVar4;
                    }
                    if (i69 != 0) {
                        sVar4 = ns.s.OTHER_LOCAL;
                    } else {
                        sVar4 = sVar;
                    }
                    aVar10 = aVar9;
                    if (i72 != 0) {
                        objQ = sVar5.Q();
                        if (objQ == gVar) {
                            objQ = new cr.m(15);
                            sVar5.o0(objQ);
                        }
                        i76 = 16;
                        aVar12 = (fz.a) objQ;
                        aVar11 = aVar8;
                    } else {
                        aVar11 = aVar8;
                        i76 = 16;
                        aVar12 = aVar3;
                    }
                    z33 = z28;
                    str6 = str3;
                    z34 = z29;
                    f15 = 1.0f;
                }
                sVar5.q();
                ns.z zVar15 = zVar3;
                objQ8 = sVar5.Q();
                if (objQ8 == gVar) {
                    objQ8 = l1.t.q(sVar5);
                    sVar5.o0(objQ8);
                }
                b0Var = (rz.b0) objQ8;
                uVar = new kotlin.jvm.internal.u();
                objQ9 = sVar5.Q();
                if (objQ9 == gVar) {
                    objQ9 = Boolean.FALSE;
                    sVar5.o0(objQ9);
                }
                uVar.f38357a = ((Boolean) objQ9).booleanValue();
                d2VarU = d0.n.u(sVar5);
                d2VarU2 = d0.n.u(sVar5);
                String str119 = str6;
                Context context12 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                boolean zBooleanValue12 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                z1.j jVar12 = z1.c.f58463a;
                boolean z411115 = z27;
                boolean z411116 = z33;
                w2.q0 q0VarD113 = j0.o.d(jVar12, false);
                iHashCode = Long.hashCode(sVar5.T);
                l1.q1 q1VarL11115 = sVar5.l();
                ns.s sVar17 = sVar4;
                oVar = z1.o.f58481a;
                boolean z411117 = z34;
                z1.r rVarC111116 = z1.a.c(sVar5, oVar);
                y2.k.J.getClass();
                fz.a aVar11117 = aVar12;
                iVar = y2.j.f56913b;
                sVar5.h0();
                fVar4 = fVar3;
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                hVar = y2.j.f56917f;
                l1.t.J(hVar, q0VarD113, sVar5);
                hVar2 = y2.j.f56916e;
                l1.t.J(hVar2, q1VarL11115, sVar5);
                hVar3 = y2.j.f56918g;
                fz.a aVar11118 = aVar11;
                if (sVar5.S) {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                } else {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                }
                hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC111116, sVar5);
                z1.r rVarR12 = j0.c.r(j0.e2.d(oVar, 1.0f));
                j0.u uVarA12 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                iHashCode2 = Long.hashCode(sVar5.T);
                l1.q1 q1VarL11116 = sVar5.l();
                z1.r rVarC111117 = z1.a.c(sVar5, rVarR12);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar, uVarA12, sVar5);
                l1.t.J(hVar2, q1VarL11116, sVar5);
                if (sVar5.S) {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                } else {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC111117, sVar5);
                z1.r rVarE12 = j0.e2.e(oVar, 1.0f);
                d5 = 1.0f;
                if (d5 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                f16 = i76;
                z1.r rVarC111118 = j0.c.C(w4.c.p(1.0f, true, rVarE12), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                objQ10 = sVar5.Q();
                if (zH) {
                    final int i811111111110 = 0;
                    objQ10 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i811111111110) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ10);
                } else {
                    final int i811111111111 = 0;
                    objQ10 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i811111111111) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ10);
                }
                fz.a aVar11119 = (fz.a) objQ10;
                zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                objQ11 = sVar5.Q();
                if (zH2) {
                    final int i811111111112 = 1;
                    objQ11 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i811111111112) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ11);
                } else {
                    final int i811111111113 = 1;
                    objQ11 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i811111111113) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ11);
                }
                int i811111111114 = i31 >> 12;
                int i811111111115 = (i31 & 14) | (i811111111114 & 112) | (i811111111114 & 896) | (i811111111114 & 7168) | ((i31 >> 15) & 57344);
                int i811111111116 = i47 << 15;
                int i811111111117 = i67 << 18;
                b(str119, z411115, z411116, z411117, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC111118, dVar, dVar2, dVar3, eVar3, aVar10, aVar11119, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i811111111115 | (i811111111116 & 458752) | (3670016 & i811111111116) | (i811111111116 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i811111111117) | (234881024 & i811111111117) | (i811111111117 & 1879048192), (i67 >> 12) & 14);
                boolean z411118 = z31;
                float f1119 = f14;
                float f11110 = f15;
                str3 = str119;
                if (courseTestState == ht.q.CHECKING) {
                    sVar5.d0(1774820302);
                    z1.r rVarG12 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                    objQ17 = sVar5.Q();
                    if (objQ17 == gVar) {
                        objQ17 = new cr.m(15);
                        sVar5.o0(objQ17);
                    }
                    iu.k.e((fz.a) objQ17, rVarG12, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                    z36 = false;
                    sVar5.p(false);
                    z37 = true;
                } else {
                    sVar5.d0(1775330221);
                    j0.a2 a2VarA12 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                    iHashCode3 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL11117 = sVar5.l();
                    z1.r rVarC111119 = z1.a.c(sVar5, oVar);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, a2VarA12, sVar5);
                    l1.t.J(hVar2, q1VarL11117, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                    } else {
                        defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC111119, sVar5);
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var12 = new j0.i1(1.0f, true);
                    if ((i31 & 112) == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objQ12 = sVar5.Q();
                    if (z35) {
                        objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                        sVar5.o0(objQ12);
                    } else {
                        objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                        sVar5.o0(objQ12);
                    }
                    String str1110 = strE0;
                    a0.g(courseTestState, g2.f0.q(i1Var12, (fz.c) objQ12), str1110, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                    strE0 = str1110;
                    if (z30) {
                        z36 = false;
                        sVar5.d0(393996308);
                    } else {
                        z36 = false;
                        sVar5.d0(393996308);
                    }
                    sVar5.p(z36);
                    z37 = true;
                    sVar5.p(true);
                    sVar5.p(z36);
                }
                sVar5.p(z37);
                rVar = j0.r.f35391a;
                if (fVar4 == null) {
                    sVar5.d0(1152060677);
                    sVar5.p(z36);
                    fVar5 = fVar4;
                } else {
                    sVar5.d0(452805244);
                    fVar5 = fVar4;
                    fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                    sVar5.p(z36);
                }
                z1.r rVarA12 = rVar.a(oVar, z1.c.H);
                w2.q0 q0VarD114 = j0.o.d(jVar12, z36);
                fz.f fVar17 = fVar5;
                iHashCode4 = Long.hashCode(sVar5.T);
                l1.q1 q1VarL11118 = sVar5.l();
                z1.r rVarC1111110 = z1.a.c(sVar5, rVarA12);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar, q0VarD114, sVar5);
                l1.t.J(hVar2, q1VarL11118, sVar5);
                if (sVar5.S) {
                    defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                } else {
                    defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                }
                l1.t.J(hVar4, rVarC1111110, sVar5);
                if (courseTestState == ht.q.REVISING) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                objQ13 = sVar5.Q();
                if (objQ13 == gVar) {
                    objQ13 = new d0.y1(20);
                    sVar5.o0(objQ13);
                }
                a0.l1 l1VarC113 = a0.f1.c((fz.c) objQ13, 7);
                objQ14 = sVar5.Q();
                if (objQ14 == gVar) {
                    objQ14 = new d0.y1(21);
                    sVar5.o0(objQ14);
                }
                a0.j0.d(z38, null, l1VarC113, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar17, aVar11117), sVar5), sVar5, 200064, 18);
                ht.q qVar12 = ht.q.CORRECT;
                boolean zD12 = ry.l.D(new ht.q[]{qVar12, ht.q.WRONG}, courseTestState);
                objQ15 = sVar5.Q();
                if (objQ15 == gVar) {
                    objQ15 = new d0.y1(22);
                    sVar5.o0(objQ15);
                }
                a0.l1 l1VarC114 = a0.f1.c((fz.c) objQ15, 7);
                objQ16 = sVar5.Q();
                if (objQ16 == gVar) {
                    objQ16 = new d0.y1(23);
                    sVar5.o0(objQ16);
                }
                a0.j0.d(zD12, null, l1VarC114, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context12, getComboCount, audioPlayingState, zVar15, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                sVar5.p(true);
                int iIntValue12 = ((Number) getComboCount.invoke()).intValue();
                if (z18) {
                    z39 = false;
                    sVar5.d0(1141210802);
                } else {
                    z39 = false;
                    sVar5.d0(1141210802);
                }
                sVar5.p(z39);
                sVar5.p(true);
                z24 = z18;
                z22 = z30;
                str4 = strE0;
                z20 = z411115;
                z21 = z411116;
                sVar3 = sVar5;
                z25 = z411117;
                z26 = z32;
                z23 = z411118;
                zVar2 = zVar15;
                cVar6 = cVar10;
                cVar7 = cVar11;
                cVar8 = cVar12;
                cVar9 = cVar13;
                aVar5 = aVar11118;
                sVar2 = sVar17;
                aVar6 = aVar11117;
                f12 = f11110;
                f13 = f1119;
                eVar2 = eVar3;
                aVar7 = aVar10;
                fVar2 = fVar17;
            } else {
                sVar5.W();
                z20 = z12;
                z21 = z13;
                z22 = z15;
                f12 = f5;
                f13 = f11;
                z23 = z16;
                str4 = str2;
                eVar2 = eVar;
                fVar2 = fVar;
                zVar2 = zVar;
                cVar6 = cVar;
                cVar7 = cVar2;
                cVar8 = cVar3;
                cVar9 = cVar4;
                aVar5 = aVar;
                sVar2 = sVar;
                aVar6 = aVar3;
                aVar7 = aVar4;
                sVar3 = sVar5;
                z24 = z18;
                z25 = z14;
                z26 = z17;
            }
            str5 = str3;
            x1VarT = sVar3.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.x2
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i11 | 1);
                        int iM2 = l1.t.M(i12);
                        int iM3 = l1.t.M(i13);
                        int iM4 = l1.t.M(i14);
                        k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i80 |= 12582912;
        i29 = i15 & 256;
        if (i29 != 0) {
            if ((i11 & 100663296) == 0) {
                if (sVar5.g(z15)) {
                    i30 = 67108864;
                } else {
                    i30 = 33554432;
                }
                i80 |= i30;
            }
            i31 = i80 | 805306368;
            i32 = i15 & 1024;
            if (i32 != 0) {
                i34 = i12 | 6;
            } else {
                if (sVar5.c(f11)) {
                    i33 = 4;
                } else {
                    i33 = 2;
                }
                i34 = i12 | i33;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i37 = i34 | 48;
            } else {
                if (sVar5.g(z16)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i37 = i34 | i36;
            }
            i38 = i37;
            i39 = i15 & 4096;
            if (i39 != 0) {
                i41 = i38 | 384;
            } else {
                if (sVar5.g(z17)) {
                    i40 = 256;
                } else {
                    i40 = 128;
                }
                i41 = i38 | i40;
            }
            i42 = i41 | (((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0 || !sVar5.f(str2)) ? 1024 : 2048);
            i43 = i15 & i23;
            if (i43 != 0) {
                i42 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (sVar5.h(eVar)) {
                    i44 = 8388608;
                } else {
                    i44 = 4194304;
                }
                i42 |= i44;
            }
            i45 = i15 & 262144;
            if (i45 != 0) {
                i42 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (sVar5.h(fVar)) {
                    i46 = 67108864;
                } else {
                    i46 = 33554432;
                }
                i42 |= i46;
            }
            i47 = i42;
            i48 = i15 & 1048576;
            if (i48 != 0) {
                i49 = i13 | 6;
            } else if ((i13 & 6) == 0) {
                if (sVar5.f(zVar)) {
                    i50 = 4;
                } else {
                    i50 = 2;
                }
                i49 = i13 | i50;
            } else {
                i49 = i13;
            }
            i51 = i15 & 2097152;
            if (i51 != 0) {
                i49 |= 48;
            } else if ((i13 & 48) == 0) {
                if (sVar5.h(cVar)) {
                    i52 = 32;
                } else {
                    i52 = 16;
                }
                i49 |= i52;
            }
            i53 = i49;
            i54 = i15 & 4194304;
            if (i54 != 0) {
                i56 = i53 | 384;
            } else {
                i55 = i53;
                if ((i13 & 384) != 0) {
                    if (sVar5.h(cVar2)) {
                        i57 = 256;
                    } else {
                        i57 = 128;
                    }
                    i55 |= i57;
                }
                i56 = i55;
            }
            i58 = i15 & 8388608;
            if (i58 != 0) {
                i60 = i56 | 3072;
            } else {
                i59 = i56;
                if ((i13 & 3072) != 0) {
                    if (sVar5.h(cVar3)) {
                        i61 = 2048;
                    } else {
                        i61 = 1024;
                    }
                    i59 |= i61;
                }
                i60 = i59;
            }
            i62 = i15 & 16777216;
            if (i62 != 0) {
                i64 = i60 | 24576;
            } else {
                i63 = i60;
                if ((i13 & 24576) == 0) {
                    i64 = i63 | (sVar5.h(cVar4) ? 16384 : 8192);
                } else {
                    i64 = i63;
                }
            }
            i65 = i15 & 33554432;
            if (i65 != 0) {
                i64 |= 196608;
            } else if ((i13 & 196608) == 0) {
                i64 |= sVar5.h(aVar) ? i23 : 65536;
            }
            i66 = i15 & 67108864;
            if (i66 != 0) {
                i64 |= 1572864;
                aVar4 = aVar2;
            } else {
                aVar4 = aVar2;
                if ((i13 & 1572864) == 0) {
                    i64 |= sVar5.h(aVar4) ? 1048576 : 524288;
                }
            }
            if ((i13 & 12582912) == 0) {
                i64 |= sVar5.h(onClickPlayAudio) ? 8388608 : 4194304;
            }
            if ((i13 & 100663296) == 0) {
                i64 |= sVar5.h(cVar5) ? 67108864 : 33554432;
            }
            if ((i13 & 805306368) == 0) {
                if (sVar5.h(getComboCount)) {
                    i78 = 536870912;
                } else {
                    i78 = 268435456;
                }
                i64 |= i78;
            }
            i67 = i64;
            if ((i14 & 6) == 0) {
                if (sVar5.h(onClickChecked)) {
                    i77 = 4;
                } else {
                    i77 = 2;
                }
                i68 = i14 | i77;
            } else {
                i68 = i14;
            }
            i69 = i16 & 1;
            if (i69 != 0) {
                i68 |= 48;
            } else if ((i14 & 48) == 0) {
                if (sVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = sVar.ordinal();
                }
                if (sVar5.d(iOrdinal)) {
                    i70 = 32;
                } else {
                    i70 = 16;
                }
                i68 |= i70;
            }
            i71 = i68;
            i72 = i16 & 2;
            if (i72 != 0) {
                i73 = i71;
                if ((i14 & 384) == 0) {
                    i73 |= sVar5.h(aVar3) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
                }
                int i811111111118 = i73;
                if ((i31 & 306783379) != 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (sVar5.T(i31 & 1, z19)) {
                    sVar5.Y();
                    i74 = i11 & 1;
                    gVar = l1.m.f39353a;
                    if (i74 != 0) {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    } else {
                        if (i18 != 0) {
                            str3 = BuildConfig.VERSION_NAME;
                        }
                        if (i81 != 0) {
                            z18 = true;
                        }
                        if (i21 != 0) {
                            z27 = true;
                        } else {
                            z27 = z12;
                        }
                        if (i25 != 0) {
                            z28 = true;
                        } else {
                            z28 = z13;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z14;
                        }
                        if (i29 != 0) {
                            z30 = false;
                        } else {
                            z30 = z15;
                        }
                        if (i32 != 0) {
                            f14 = 1.0f;
                        } else {
                            f14 = f11;
                        }
                        if (i35 != 0) {
                            z31 = false;
                        } else {
                            z31 = z16;
                        }
                        if (i39 != 0) {
                            z32 = false;
                        } else {
                            z32 = z17;
                        }
                        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            strE0 = ub.a.e0(sVar5, R.string.test_check);
                            i47 &= -7169;
                        } else {
                            strE0 = str2;
                        }
                        if (i43 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i45 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i48 == 0) {
                        }
                        if (i51 != 0) {
                            objQ7 = sVar5.Q();
                            if (objQ7 == gVar) {
                                objQ7 = new d0.y1(19);
                                sVar5.o0(objQ7);
                            }
                            cVar10 = (fz.c) objQ7;
                        } else {
                            z27 = z27;
                            cVar10 = cVar;
                        }
                        if (i54 != 0) {
                            objQ6 = sVar5.Q();
                            if (objQ6 == gVar) {
                                objQ6 = new d0.y1(19);
                                sVar5.o0(objQ6);
                            }
                            cVar11 = (fz.c) objQ6;
                        } else {
                            cVar10 = cVar10;
                            cVar11 = cVar2;
                        }
                        if (i58 != 0) {
                            objQ5 = sVar5.Q();
                            if (objQ5 == gVar) {
                                objQ5 = new d0.y1(18);
                                sVar5.o0(objQ5);
                            }
                            cVar12 = (fz.c) objQ5;
                        } else {
                            cVar11 = cVar11;
                            cVar12 = cVar3;
                        }
                        if (i62 != 0) {
                            objQ4 = sVar5.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new d0.y1(19);
                                sVar5.o0(objQ4);
                            }
                            cVar13 = (fz.c) objQ4;
                        } else {
                            cVar12 = cVar12;
                            cVar13 = cVar4;
                        }
                        if (i65 != 0) {
                            objQ3 = sVar5.Q();
                            if (objQ3 == gVar) {
                                i75 = 15;
                                objQ3 = new cr.m(15);
                                sVar5.o0(objQ3);
                            } else {
                                i75 = 15;
                            }
                            aVar8 = (fz.a) objQ3;
                        } else {
                            cVar13 = cVar13;
                            i75 = 15;
                            aVar8 = aVar;
                        }
                        if (i66 != 0) {
                            objQ2 = sVar5.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new cr.m(i75);
                                sVar5.o0(objQ2);
                            }
                            aVar9 = (fz.a) objQ2;
                        } else {
                            aVar9 = aVar4;
                        }
                        if (i69 != 0) {
                            sVar4 = ns.s.OTHER_LOCAL;
                        } else {
                            sVar4 = sVar;
                        }
                        aVar10 = aVar9;
                        if (i72 != 0) {
                            objQ = sVar5.Q();
                            if (objQ == gVar) {
                                objQ = new cr.m(15);
                                sVar5.o0(objQ);
                            }
                            i76 = 16;
                            aVar12 = (fz.a) objQ;
                            aVar11 = aVar8;
                        } else {
                            aVar11 = aVar8;
                            i76 = 16;
                            aVar12 = aVar3;
                        }
                        z33 = z28;
                        str6 = str3;
                        z34 = z29;
                        f15 = 1.0f;
                    }
                    sVar5.q();
                    ns.z zVar16 = zVar3;
                    objQ8 = sVar5.Q();
                    if (objQ8 == gVar) {
                        objQ8 = l1.t.q(sVar5);
                        sVar5.o0(objQ8);
                    }
                    b0Var = (rz.b0) objQ8;
                    uVar = new kotlin.jvm.internal.u();
                    objQ9 = sVar5.Q();
                    if (objQ9 == gVar) {
                        objQ9 = Boolean.FALSE;
                        sVar5.o0(objQ9);
                    }
                    uVar.f38357a = ((Boolean) objQ9).booleanValue();
                    d2VarU = d0.n.u(sVar5);
                    d2VarU2 = d0.n.u(sVar5);
                    String str1111 = str6;
                    Context context13 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                    boolean zBooleanValue13 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                    z1.j jVar13 = z1.c.f58463a;
                    boolean z411119 = z27;
                    boolean z4111110 = z33;
                    w2.q0 q0VarD115 = j0.o.d(jVar13, false);
                    iHashCode = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL11119 = sVar5.l();
                    ns.s sVar18 = sVar4;
                    oVar = z1.o.f58481a;
                    boolean z4111111 = z34;
                    z1.r rVarC1111111 = z1.a.c(sVar5, oVar);
                    y2.k.J.getClass();
                    fz.a aVar111110 = aVar12;
                    iVar = y2.j.f56913b;
                    sVar5.h0();
                    fVar4 = fVar3;
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD115, sVar5);
                    hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL11119, sVar5);
                    hVar3 = y2.j.f56918g;
                    fz.a aVar111111 = aVar11;
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    } else {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    }
                    hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC1111111, sVar5);
                    z1.r rVarR13 = j0.c.r(j0.e2.d(oVar, 1.0f));
                    j0.u uVarA13 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                    iHashCode2 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL111110 = sVar5.l();
                    z1.r rVarC1111112 = z1.a.c(sVar5, rVarR13);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, uVarA13, sVar5);
                    l1.t.J(hVar2, q1VarL111110, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    } else {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC1111112, sVar5);
                    z1.r rVarE13 = j0.e2.e(oVar, 1.0f);
                    d5 = 1.0f;
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    f16 = i76;
                    z1.r rVarC1111113 = j0.c.C(w4.c.p(1.0f, true, rVarE13), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                    objQ10 = sVar5.Q();
                    if (zH) {
                        final int i811111111119 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i811111111119) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    } else {
                        final int i8111111111110 = 0;
                        objQ10 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8111111111110) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ10);
                    }
                    fz.a aVar111112 = (fz.a) objQ10;
                    zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                    objQ11 = sVar5.Q();
                    if (zH2) {
                        final int i8111111111111 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8111111111111) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    } else {
                        final int i8111111111112 = 1;
                        objQ11 = new fz.a() { // from class: dt.y2
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i8111111111112) {
                                    case 0:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                        break;
                                    default:
                                        rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ11);
                    }
                    int i8111111111113 = i31 >> 12;
                    int i8111111111114 = (i31 & 14) | (i8111111111113 & 112) | (i8111111111113 & 896) | (i8111111111113 & 7168) | ((i31 >> 15) & 57344);
                    int i8111111111115 = i47 << 15;
                    int i8111111111116 = i67 << 18;
                    b(str1111, z411119, z4111110, z4111111, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC1111113, dVar, dVar2, dVar3, eVar3, aVar10, aVar111112, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i8111111111114 | (i8111111111115 & 458752) | (3670016 & i8111111111115) | (i8111111111115 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i8111111111116) | (234881024 & i8111111111116) | (i8111111111116 & 1879048192), (i67 >> 12) & 14);
                    boolean z4111112 = z31;
                    float f11111 = f14;
                    float f11112 = f15;
                    str3 = str1111;
                    if (courseTestState == ht.q.CHECKING) {
                        sVar5.d0(1774820302);
                        z1.r rVarG13 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                        objQ17 = sVar5.Q();
                        if (objQ17 == gVar) {
                            objQ17 = new cr.m(15);
                            sVar5.o0(objQ17);
                        }
                        iu.k.e((fz.a) objQ17, rVarG13, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                        z36 = false;
                        sVar5.p(false);
                        z37 = true;
                    } else {
                        sVar5.d0(1775330221);
                        j0.a2 a2VarA13 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                        iHashCode3 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL111111 = sVar5.l();
                        z1.r rVarC1111114 = z1.a.c(sVar5, oVar);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar, a2VarA13, sVar5);
                        l1.t.J(hVar2, q1VarL111111, sVar5);
                        if (sVar5.S) {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC1111114, sVar5);
                        if (d5 <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var13 = new j0.i1(1.0f, true);
                        if ((i31 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objQ12 = sVar5.Q();
                        if (z35) {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        } else {
                            objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                            sVar5.o0(objQ12);
                        }
                        String str1112 = strE0;
                        a0.g(courseTestState, g2.f0.q(i1Var13, (fz.c) objQ12), str1112, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                        strE0 = str1112;
                        if (z30) {
                            z36 = false;
                            sVar5.d0(393996308);
                        } else {
                            z36 = false;
                            sVar5.d0(393996308);
                        }
                        sVar5.p(z36);
                        z37 = true;
                        sVar5.p(true);
                        sVar5.p(z36);
                    }
                    sVar5.p(z37);
                    rVar = j0.r.f35391a;
                    if (fVar4 == null) {
                        sVar5.d0(1152060677);
                        sVar5.p(z36);
                        fVar5 = fVar4;
                    } else {
                        sVar5.d0(452805244);
                        fVar5 = fVar4;
                        fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                        sVar5.p(z36);
                    }
                    z1.r rVarA13 = rVar.a(oVar, z1.c.H);
                    w2.q0 q0VarD116 = j0.o.d(jVar13, z36);
                    fz.f fVar18 = fVar5;
                    iHashCode4 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL111112 = sVar5.l();
                    z1.r rVarC1111115 = z1.a.c(sVar5, rVarA13);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, q0VarD116, sVar5);
                    l1.t.J(hVar2, q1VarL111112, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    } else {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                    }
                    l1.t.J(hVar4, rVarC1111115, sVar5);
                    if (courseTestState == ht.q.REVISING) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objQ13 = sVar5.Q();
                    if (objQ13 == gVar) {
                        objQ13 = new d0.y1(20);
                        sVar5.o0(objQ13);
                    }
                    a0.l1 l1VarC115 = a0.f1.c((fz.c) objQ13, 7);
                    objQ14 = sVar5.Q();
                    if (objQ14 == gVar) {
                        objQ14 = new d0.y1(21);
                        sVar5.o0(objQ14);
                    }
                    a0.j0.d(z38, null, l1VarC115, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar18, aVar111110), sVar5), sVar5, 200064, 18);
                    ht.q qVar13 = ht.q.CORRECT;
                    boolean zD13 = ry.l.D(new ht.q[]{qVar13, ht.q.WRONG}, courseTestState);
                    objQ15 = sVar5.Q();
                    if (objQ15 == gVar) {
                        objQ15 = new d0.y1(22);
                        sVar5.o0(objQ15);
                    }
                    a0.l1 l1VarC116 = a0.f1.c((fz.c) objQ15, 7);
                    objQ16 = sVar5.Q();
                    if (objQ16 == gVar) {
                        objQ16 = new d0.y1(23);
                        sVar5.o0(objQ16);
                    }
                    a0.j0.d(zD13, null, l1VarC116, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context13, getComboCount, audioPlayingState, zVar16, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                    sVar5.p(true);
                    int iIntValue13 = ((Number) getComboCount.invoke()).intValue();
                    if (z18) {
                        z39 = false;
                        sVar5.d0(1141210802);
                    } else {
                        z39 = false;
                        sVar5.d0(1141210802);
                    }
                    sVar5.p(z39);
                    sVar5.p(true);
                    z24 = z18;
                    z22 = z30;
                    str4 = strE0;
                    z20 = z411119;
                    z21 = z4111110;
                    sVar3 = sVar5;
                    z25 = z4111111;
                    z26 = z32;
                    z23 = z4111112;
                    zVar2 = zVar16;
                    cVar6 = cVar10;
                    cVar7 = cVar11;
                    cVar8 = cVar12;
                    cVar9 = cVar13;
                    aVar5 = aVar111111;
                    sVar2 = sVar18;
                    aVar6 = aVar111110;
                    f12 = f11112;
                    f13 = f11111;
                    eVar2 = eVar3;
                    aVar7 = aVar10;
                    fVar2 = fVar18;
                } else {
                    sVar5.W();
                    z20 = z12;
                    z21 = z13;
                    z22 = z15;
                    f12 = f5;
                    f13 = f11;
                    z23 = z16;
                    str4 = str2;
                    eVar2 = eVar;
                    fVar2 = fVar;
                    zVar2 = zVar;
                    cVar6 = cVar;
                    cVar7 = cVar2;
                    cVar8 = cVar3;
                    cVar9 = cVar4;
                    aVar5 = aVar;
                    sVar2 = sVar;
                    aVar6 = aVar3;
                    aVar7 = aVar4;
                    sVar3 = sVar5;
                    z24 = z18;
                    z25 = z14;
                    z26 = z17;
                }
                str5 = str3;
                x1VarT = sVar3.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.x2
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i11 | 1);
                            int iM2 = l1.t.M(i12);
                            int iM3 = l1.t.M(i13);
                            int iM4 = l1.t.M(i14);
                            k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i73 = i71 | 384;
            if ((i14 & 3072) == 0) {
                i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
            }
            int i8111111111117 = i73;
            if ((i31 & 306783379) != 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (sVar5.T(i31 & 1, z19)) {
                sVar5.Y();
                i74 = i11 & 1;
                gVar = l1.m.f39353a;
                if (i74 != 0) {
                    if (i18 != 0) {
                        str3 = BuildConfig.VERSION_NAME;
                    }
                    if (i81 != 0) {
                        z18 = true;
                    }
                    if (i21 != 0) {
                        z27 = true;
                    } else {
                        z27 = z12;
                    }
                    if (i25 != 0) {
                        z28 = true;
                    } else {
                        z28 = z13;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z14;
                    }
                    if (i29 != 0) {
                        z30 = false;
                    } else {
                        z30 = z15;
                    }
                    if (i32 != 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = f11;
                    }
                    if (i35 != 0) {
                        z31 = false;
                    } else {
                        z31 = z16;
                    }
                    if (i39 != 0) {
                        z32 = false;
                    } else {
                        z32 = z17;
                    }
                    if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                        strE0 = ub.a.e0(sVar5, R.string.test_check);
                        i47 &= -7169;
                    } else {
                        strE0 = str2;
                    }
                    if (i43 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i45 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i48 == 0) {
                    }
                    if (i51 != 0) {
                        objQ7 = sVar5.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new d0.y1(19);
                            sVar5.o0(objQ7);
                        }
                        cVar10 = (fz.c) objQ7;
                    } else {
                        z27 = z27;
                        cVar10 = cVar;
                    }
                    if (i54 != 0) {
                        objQ6 = sVar5.Q();
                        if (objQ6 == gVar) {
                            objQ6 = new d0.y1(19);
                            sVar5.o0(objQ6);
                        }
                        cVar11 = (fz.c) objQ6;
                    } else {
                        cVar10 = cVar10;
                        cVar11 = cVar2;
                    }
                    if (i58 != 0) {
                        objQ5 = sVar5.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new d0.y1(18);
                            sVar5.o0(objQ5);
                        }
                        cVar12 = (fz.c) objQ5;
                    } else {
                        cVar11 = cVar11;
                        cVar12 = cVar3;
                    }
                    if (i62 != 0) {
                        objQ4 = sVar5.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new d0.y1(19);
                            sVar5.o0(objQ4);
                        }
                        cVar13 = (fz.c) objQ4;
                    } else {
                        cVar12 = cVar12;
                        cVar13 = cVar4;
                    }
                    if (i65 != 0) {
                        objQ3 = sVar5.Q();
                        if (objQ3 == gVar) {
                            i75 = 15;
                            objQ3 = new cr.m(15);
                            sVar5.o0(objQ3);
                        } else {
                            i75 = 15;
                        }
                        aVar8 = (fz.a) objQ3;
                    } else {
                        cVar13 = cVar13;
                        i75 = 15;
                        aVar8 = aVar;
                    }
                    if (i66 != 0) {
                        objQ2 = sVar5.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new cr.m(i75);
                            sVar5.o0(objQ2);
                        }
                        aVar9 = (fz.a) objQ2;
                    } else {
                        aVar9 = aVar4;
                    }
                    if (i69 != 0) {
                        sVar4 = ns.s.OTHER_LOCAL;
                    } else {
                        sVar4 = sVar;
                    }
                    aVar10 = aVar9;
                    if (i72 != 0) {
                        objQ = sVar5.Q();
                        if (objQ == gVar) {
                            objQ = new cr.m(15);
                            sVar5.o0(objQ);
                        }
                        i76 = 16;
                        aVar12 = (fz.a) objQ;
                        aVar11 = aVar8;
                    } else {
                        aVar11 = aVar8;
                        i76 = 16;
                        aVar12 = aVar3;
                    }
                    z33 = z28;
                    str6 = str3;
                    z34 = z29;
                    f15 = 1.0f;
                } else {
                    if (i18 != 0) {
                        str3 = BuildConfig.VERSION_NAME;
                    }
                    if (i81 != 0) {
                        z18 = true;
                    }
                    if (i21 != 0) {
                        z27 = true;
                    } else {
                        z27 = z12;
                    }
                    if (i25 != 0) {
                        z28 = true;
                    } else {
                        z28 = z13;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z14;
                    }
                    if (i29 != 0) {
                        z30 = false;
                    } else {
                        z30 = z15;
                    }
                    if (i32 != 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = f11;
                    }
                    if (i35 != 0) {
                        z31 = false;
                    } else {
                        z31 = z16;
                    }
                    if (i39 != 0) {
                        z32 = false;
                    } else {
                        z32 = z17;
                    }
                    if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                        strE0 = ub.a.e0(sVar5, R.string.test_check);
                        i47 &= -7169;
                    } else {
                        strE0 = str2;
                    }
                    if (i43 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i45 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i48 == 0) {
                    }
                    if (i51 != 0) {
                        objQ7 = sVar5.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new d0.y1(19);
                            sVar5.o0(objQ7);
                        }
                        cVar10 = (fz.c) objQ7;
                    } else {
                        z27 = z27;
                        cVar10 = cVar;
                    }
                    if (i54 != 0) {
                        objQ6 = sVar5.Q();
                        if (objQ6 == gVar) {
                            objQ6 = new d0.y1(19);
                            sVar5.o0(objQ6);
                        }
                        cVar11 = (fz.c) objQ6;
                    } else {
                        cVar10 = cVar10;
                        cVar11 = cVar2;
                    }
                    if (i58 != 0) {
                        objQ5 = sVar5.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new d0.y1(18);
                            sVar5.o0(objQ5);
                        }
                        cVar12 = (fz.c) objQ5;
                    } else {
                        cVar11 = cVar11;
                        cVar12 = cVar3;
                    }
                    if (i62 != 0) {
                        objQ4 = sVar5.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new d0.y1(19);
                            sVar5.o0(objQ4);
                        }
                        cVar13 = (fz.c) objQ4;
                    } else {
                        cVar12 = cVar12;
                        cVar13 = cVar4;
                    }
                    if (i65 != 0) {
                        objQ3 = sVar5.Q();
                        if (objQ3 == gVar) {
                            i75 = 15;
                            objQ3 = new cr.m(15);
                            sVar5.o0(objQ3);
                        } else {
                            i75 = 15;
                        }
                        aVar8 = (fz.a) objQ3;
                    } else {
                        cVar13 = cVar13;
                        i75 = 15;
                        aVar8 = aVar;
                    }
                    if (i66 != 0) {
                        objQ2 = sVar5.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new cr.m(i75);
                            sVar5.o0(objQ2);
                        }
                        aVar9 = (fz.a) objQ2;
                    } else {
                        aVar9 = aVar4;
                    }
                    if (i69 != 0) {
                        sVar4 = ns.s.OTHER_LOCAL;
                    } else {
                        sVar4 = sVar;
                    }
                    aVar10 = aVar9;
                    if (i72 != 0) {
                        objQ = sVar5.Q();
                        if (objQ == gVar) {
                            objQ = new cr.m(15);
                            sVar5.o0(objQ);
                        }
                        i76 = 16;
                        aVar12 = (fz.a) objQ;
                        aVar11 = aVar8;
                    } else {
                        aVar11 = aVar8;
                        i76 = 16;
                        aVar12 = aVar3;
                    }
                    z33 = z28;
                    str6 = str3;
                    z34 = z29;
                    f15 = 1.0f;
                }
                sVar5.q();
                ns.z zVar17 = zVar3;
                objQ8 = sVar5.Q();
                if (objQ8 == gVar) {
                    objQ8 = l1.t.q(sVar5);
                    sVar5.o0(objQ8);
                }
                b0Var = (rz.b0) objQ8;
                uVar = new kotlin.jvm.internal.u();
                objQ9 = sVar5.Q();
                if (objQ9 == gVar) {
                    objQ9 = Boolean.FALSE;
                    sVar5.o0(objQ9);
                }
                uVar.f38357a = ((Boolean) objQ9).booleanValue();
                d2VarU = d0.n.u(sVar5);
                d2VarU2 = d0.n.u(sVar5);
                String str1113 = str6;
                Context context14 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                boolean zBooleanValue14 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                z1.j jVar14 = z1.c.f58463a;
                boolean z4111113 = z27;
                boolean z4111114 = z33;
                w2.q0 q0VarD117 = j0.o.d(jVar14, false);
                iHashCode = Long.hashCode(sVar5.T);
                l1.q1 q1VarL111113 = sVar5.l();
                ns.s sVar19 = sVar4;
                oVar = z1.o.f58481a;
                boolean z4111115 = z34;
                z1.r rVarC1111116 = z1.a.c(sVar5, oVar);
                y2.k.J.getClass();
                fz.a aVar111113 = aVar12;
                iVar = y2.j.f56913b;
                sVar5.h0();
                fVar4 = fVar3;
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                hVar = y2.j.f56917f;
                l1.t.J(hVar, q0VarD117, sVar5);
                hVar2 = y2.j.f56916e;
                l1.t.J(hVar2, q1VarL111113, sVar5);
                hVar3 = y2.j.f56918g;
                fz.a aVar111114 = aVar11;
                if (sVar5.S) {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                } else {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                }
                hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC1111116, sVar5);
                z1.r rVarR14 = j0.c.r(j0.e2.d(oVar, 1.0f));
                j0.u uVarA14 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                iHashCode2 = Long.hashCode(sVar5.T);
                l1.q1 q1VarL111114 = sVar5.l();
                z1.r rVarC1111117 = z1.a.c(sVar5, rVarR14);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar, uVarA14, sVar5);
                l1.t.J(hVar2, q1VarL111114, sVar5);
                if (sVar5.S) {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                } else {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC1111117, sVar5);
                z1.r rVarE14 = j0.e2.e(oVar, 1.0f);
                d5 = 1.0f;
                if (d5 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                f16 = i76;
                z1.r rVarC1111118 = j0.c.C(w4.c.p(1.0f, true, rVarE14), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                objQ10 = sVar5.Q();
                if (zH) {
                    final int i8111111111118 = 0;
                    objQ10 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i8111111111118) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ10);
                } else {
                    final int i8111111111119 = 0;
                    objQ10 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i8111111111119) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ10);
                }
                fz.a aVar111115 = (fz.a) objQ10;
                zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                objQ11 = sVar5.Q();
                if (zH2) {
                    final int i81111111111110 = 1;
                    objQ11 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i81111111111110) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ11);
                } else {
                    final int i81111111111111 = 1;
                    objQ11 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i81111111111111) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ11);
                }
                int i81111111111112 = i31 >> 12;
                int i81111111111113 = (i31 & 14) | (i81111111111112 & 112) | (i81111111111112 & 896) | (i81111111111112 & 7168) | ((i31 >> 15) & 57344);
                int i81111111111114 = i47 << 15;
                int i81111111111115 = i67 << 18;
                b(str1113, z4111113, z4111114, z4111115, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC1111118, dVar, dVar2, dVar3, eVar3, aVar10, aVar111115, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i81111111111113 | (i81111111111114 & 458752) | (3670016 & i81111111111114) | (i81111111111114 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i81111111111115) | (234881024 & i81111111111115) | (i81111111111115 & 1879048192), (i67 >> 12) & 14);
                boolean z4111116 = z31;
                float f11113 = f14;
                float f11114 = f15;
                str3 = str1113;
                if (courseTestState == ht.q.CHECKING) {
                    sVar5.d0(1774820302);
                    z1.r rVarG14 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                    objQ17 = sVar5.Q();
                    if (objQ17 == gVar) {
                        objQ17 = new cr.m(15);
                        sVar5.o0(objQ17);
                    }
                    iu.k.e((fz.a) objQ17, rVarG14, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                    z36 = false;
                    sVar5.p(false);
                    z37 = true;
                } else {
                    sVar5.d0(1775330221);
                    j0.a2 a2VarA14 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                    iHashCode3 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL111115 = sVar5.l();
                    z1.r rVarC1111119 = z1.a.c(sVar5, oVar);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, a2VarA14, sVar5);
                    l1.t.J(hVar2, q1VarL111115, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                    } else {
                        defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC1111119, sVar5);
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var14 = new j0.i1(1.0f, true);
                    if ((i31 & 112) == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objQ12 = sVar5.Q();
                    if (z35) {
                        objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                        sVar5.o0(objQ12);
                    } else {
                        objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                        sVar5.o0(objQ12);
                    }
                    String str1114 = strE0;
                    a0.g(courseTestState, g2.f0.q(i1Var14, (fz.c) objQ12), str1114, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                    strE0 = str1114;
                    if (z30) {
                        z36 = false;
                        sVar5.d0(393996308);
                    } else {
                        z36 = false;
                        sVar5.d0(393996308);
                    }
                    sVar5.p(z36);
                    z37 = true;
                    sVar5.p(true);
                    sVar5.p(z36);
                }
                sVar5.p(z37);
                rVar = j0.r.f35391a;
                if (fVar4 == null) {
                    sVar5.d0(1152060677);
                    sVar5.p(z36);
                    fVar5 = fVar4;
                } else {
                    sVar5.d0(452805244);
                    fVar5 = fVar4;
                    fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                    sVar5.p(z36);
                }
                z1.r rVarA14 = rVar.a(oVar, z1.c.H);
                w2.q0 q0VarD118 = j0.o.d(jVar14, z36);
                fz.f fVar19 = fVar5;
                iHashCode4 = Long.hashCode(sVar5.T);
                l1.q1 q1VarL111116 = sVar5.l();
                z1.r rVarC11111110 = z1.a.c(sVar5, rVarA14);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar, q0VarD118, sVar5);
                l1.t.J(hVar2, q1VarL111116, sVar5);
                if (sVar5.S) {
                    defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                } else {
                    defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                }
                l1.t.J(hVar4, rVarC11111110, sVar5);
                if (courseTestState == ht.q.REVISING) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                objQ13 = sVar5.Q();
                if (objQ13 == gVar) {
                    objQ13 = new d0.y1(20);
                    sVar5.o0(objQ13);
                }
                a0.l1 l1VarC117 = a0.f1.c((fz.c) objQ13, 7);
                objQ14 = sVar5.Q();
                if (objQ14 == gVar) {
                    objQ14 = new d0.y1(21);
                    sVar5.o0(objQ14);
                }
                a0.j0.d(z38, null, l1VarC117, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar19, aVar111113), sVar5), sVar5, 200064, 18);
                ht.q qVar14 = ht.q.CORRECT;
                boolean zD14 = ry.l.D(new ht.q[]{qVar14, ht.q.WRONG}, courseTestState);
                objQ15 = sVar5.Q();
                if (objQ15 == gVar) {
                    objQ15 = new d0.y1(22);
                    sVar5.o0(objQ15);
                }
                a0.l1 l1VarC118 = a0.f1.c((fz.c) objQ15, 7);
                objQ16 = sVar5.Q();
                if (objQ16 == gVar) {
                    objQ16 = new d0.y1(23);
                    sVar5.o0(objQ16);
                }
                a0.j0.d(zD14, null, l1VarC118, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context14, getComboCount, audioPlayingState, zVar17, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                sVar5.p(true);
                int iIntValue14 = ((Number) getComboCount.invoke()).intValue();
                if (z18) {
                    z39 = false;
                    sVar5.d0(1141210802);
                } else {
                    z39 = false;
                    sVar5.d0(1141210802);
                }
                sVar5.p(z39);
                sVar5.p(true);
                z24 = z18;
                z22 = z30;
                str4 = strE0;
                z20 = z4111113;
                z21 = z4111114;
                sVar3 = sVar5;
                z25 = z4111115;
                z26 = z32;
                z23 = z4111116;
                zVar2 = zVar17;
                cVar6 = cVar10;
                cVar7 = cVar11;
                cVar8 = cVar12;
                cVar9 = cVar13;
                aVar5 = aVar111114;
                sVar2 = sVar19;
                aVar6 = aVar111113;
                f12 = f11114;
                f13 = f11113;
                eVar2 = eVar3;
                aVar7 = aVar10;
                fVar2 = fVar19;
            } else {
                sVar5.W();
                z20 = z12;
                z21 = z13;
                z22 = z15;
                f12 = f5;
                f13 = f11;
                z23 = z16;
                str4 = str2;
                eVar2 = eVar;
                fVar2 = fVar;
                zVar2 = zVar;
                cVar6 = cVar;
                cVar7 = cVar2;
                cVar8 = cVar3;
                cVar9 = cVar4;
                aVar5 = aVar;
                sVar2 = sVar;
                aVar6 = aVar3;
                aVar7 = aVar4;
                sVar3 = sVar5;
                z24 = z18;
                z25 = z14;
                z26 = z17;
            }
            str5 = str3;
            x1VarT = sVar3.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.x2
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i11 | 1);
                        int iM2 = l1.t.M(i12);
                        int iM3 = l1.t.M(i13);
                        int iM4 = l1.t.M(i14);
                        k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i80 |= 100663296;
        i31 = i80 | 805306368;
        i32 = i15 & 1024;
        if (i32 != 0) {
            i34 = i12 | 6;
        } else {
            if (sVar5.c(f11)) {
                i33 = 4;
            } else {
                i33 = 2;
            }
            i34 = i12 | i33;
        }
        i35 = i15 & 2048;
        if (i35 != 0) {
            i37 = i34 | 48;
        } else {
            if (sVar5.g(z16)) {
                i36 = 32;
            } else {
                i36 = 16;
            }
            i37 = i34 | i36;
        }
        i38 = i37;
        i39 = i15 & 4096;
        if (i39 != 0) {
            i41 = i38 | 384;
        } else {
            if (sVar5.g(z17)) {
                i40 = 256;
            } else {
                i40 = 128;
            }
            i41 = i38 | i40;
        }
        i42 = i41 | (((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0 || !sVar5.f(str2)) ? 1024 : 2048);
        i43 = i15 & i23;
        if (i43 != 0) {
            i42 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            if (sVar5.h(eVar)) {
                i44 = 8388608;
            } else {
                i44 = 4194304;
            }
            i42 |= i44;
        }
        i45 = i15 & 262144;
        if (i45 != 0) {
            i42 |= 100663296;
        } else if ((i12 & 100663296) == 0) {
            if (sVar5.h(fVar)) {
                i46 = 67108864;
            } else {
                i46 = 33554432;
            }
            i42 |= i46;
        }
        i47 = i42;
        i48 = i15 & 1048576;
        if (i48 != 0) {
            i49 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            if (sVar5.f(zVar)) {
                i50 = 4;
            } else {
                i50 = 2;
            }
            i49 = i13 | i50;
        } else {
            i49 = i13;
        }
        i51 = i15 & 2097152;
        if (i51 != 0) {
            i49 |= 48;
        } else if ((i13 & 48) == 0) {
            if (sVar5.h(cVar)) {
                i52 = 32;
            } else {
                i52 = 16;
            }
            i49 |= i52;
        }
        i53 = i49;
        i54 = i15 & 4194304;
        if (i54 != 0) {
            i56 = i53 | 384;
        } else {
            i55 = i53;
            if ((i13 & 384) != 0) {
                if (sVar5.h(cVar2)) {
                    i57 = 256;
                } else {
                    i57 = 128;
                }
                i55 |= i57;
            }
            i56 = i55;
        }
        i58 = i15 & 8388608;
        if (i58 != 0) {
            i60 = i56 | 3072;
        } else {
            i59 = i56;
            if ((i13 & 3072) != 0) {
                if (sVar5.h(cVar3)) {
                    i61 = 2048;
                } else {
                    i61 = 1024;
                }
                i59 |= i61;
            }
            i60 = i59;
        }
        i62 = i15 & 16777216;
        if (i62 != 0) {
            i64 = i60 | 24576;
        } else {
            i63 = i60;
            if ((i13 & 24576) == 0) {
                i64 = i63 | (sVar5.h(cVar4) ? 16384 : 8192);
            } else {
                i64 = i63;
            }
        }
        i65 = i15 & 33554432;
        if (i65 != 0) {
            i64 |= 196608;
        } else if ((i13 & 196608) == 0) {
            i64 |= sVar5.h(aVar) ? i23 : 65536;
        }
        i66 = i15 & 67108864;
        if (i66 != 0) {
            i64 |= 1572864;
            aVar4 = aVar2;
        } else {
            aVar4 = aVar2;
            if ((i13 & 1572864) == 0) {
                i64 |= sVar5.h(aVar4) ? 1048576 : 524288;
            }
        }
        if ((i13 & 12582912) == 0) {
            i64 |= sVar5.h(onClickPlayAudio) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i64 |= sVar5.h(cVar5) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            if (sVar5.h(getComboCount)) {
                i78 = 536870912;
            } else {
                i78 = 268435456;
            }
            i64 |= i78;
        }
        i67 = i64;
        if ((i14 & 6) == 0) {
            if (sVar5.h(onClickChecked)) {
                i77 = 4;
            } else {
                i77 = 2;
            }
            i68 = i14 | i77;
        } else {
            i68 = i14;
        }
        i69 = i16 & 1;
        if (i69 != 0) {
            i68 |= 48;
        } else if ((i14 & 48) == 0) {
            if (sVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = sVar.ordinal();
            }
            if (sVar5.d(iOrdinal)) {
                i70 = 32;
            } else {
                i70 = 16;
            }
            i68 |= i70;
        }
        i71 = i68;
        i72 = i16 & 2;
        if (i72 != 0) {
            i73 = i71;
            if ((i14 & 384) == 0) {
                i73 |= sVar5.h(aVar3) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
            }
            int i81111111111116 = i73;
            if ((i31 & 306783379) != 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (sVar5.T(i31 & 1, z19)) {
                sVar5.Y();
                i74 = i11 & 1;
                gVar = l1.m.f39353a;
                if (i74 != 0) {
                    if (i18 != 0) {
                        str3 = BuildConfig.VERSION_NAME;
                    }
                    if (i81 != 0) {
                        z18 = true;
                    }
                    if (i21 != 0) {
                        z27 = true;
                    } else {
                        z27 = z12;
                    }
                    if (i25 != 0) {
                        z28 = true;
                    } else {
                        z28 = z13;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z14;
                    }
                    if (i29 != 0) {
                        z30 = false;
                    } else {
                        z30 = z15;
                    }
                    if (i32 != 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = f11;
                    }
                    if (i35 != 0) {
                        z31 = false;
                    } else {
                        z31 = z16;
                    }
                    if (i39 != 0) {
                        z32 = false;
                    } else {
                        z32 = z17;
                    }
                    if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                        strE0 = ub.a.e0(sVar5, R.string.test_check);
                        i47 &= -7169;
                    } else {
                        strE0 = str2;
                    }
                    if (i43 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i45 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i48 == 0) {
                    }
                    if (i51 != 0) {
                        objQ7 = sVar5.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new d0.y1(19);
                            sVar5.o0(objQ7);
                        }
                        cVar10 = (fz.c) objQ7;
                    } else {
                        z27 = z27;
                        cVar10 = cVar;
                    }
                    if (i54 != 0) {
                        objQ6 = sVar5.Q();
                        if (objQ6 == gVar) {
                            objQ6 = new d0.y1(19);
                            sVar5.o0(objQ6);
                        }
                        cVar11 = (fz.c) objQ6;
                    } else {
                        cVar10 = cVar10;
                        cVar11 = cVar2;
                    }
                    if (i58 != 0) {
                        objQ5 = sVar5.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new d0.y1(18);
                            sVar5.o0(objQ5);
                        }
                        cVar12 = (fz.c) objQ5;
                    } else {
                        cVar11 = cVar11;
                        cVar12 = cVar3;
                    }
                    if (i62 != 0) {
                        objQ4 = sVar5.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new d0.y1(19);
                            sVar5.o0(objQ4);
                        }
                        cVar13 = (fz.c) objQ4;
                    } else {
                        cVar12 = cVar12;
                        cVar13 = cVar4;
                    }
                    if (i65 != 0) {
                        objQ3 = sVar5.Q();
                        if (objQ3 == gVar) {
                            i75 = 15;
                            objQ3 = new cr.m(15);
                            sVar5.o0(objQ3);
                        } else {
                            i75 = 15;
                        }
                        aVar8 = (fz.a) objQ3;
                    } else {
                        cVar13 = cVar13;
                        i75 = 15;
                        aVar8 = aVar;
                    }
                    if (i66 != 0) {
                        objQ2 = sVar5.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new cr.m(i75);
                            sVar5.o0(objQ2);
                        }
                        aVar9 = (fz.a) objQ2;
                    } else {
                        aVar9 = aVar4;
                    }
                    if (i69 != 0) {
                        sVar4 = ns.s.OTHER_LOCAL;
                    } else {
                        sVar4 = sVar;
                    }
                    aVar10 = aVar9;
                    if (i72 != 0) {
                        objQ = sVar5.Q();
                        if (objQ == gVar) {
                            objQ = new cr.m(15);
                            sVar5.o0(objQ);
                        }
                        i76 = 16;
                        aVar12 = (fz.a) objQ;
                        aVar11 = aVar8;
                    } else {
                        aVar11 = aVar8;
                        i76 = 16;
                        aVar12 = aVar3;
                    }
                    z33 = z28;
                    str6 = str3;
                    z34 = z29;
                    f15 = 1.0f;
                } else {
                    if (i18 != 0) {
                        str3 = BuildConfig.VERSION_NAME;
                    }
                    if (i81 != 0) {
                        z18 = true;
                    }
                    if (i21 != 0) {
                        z27 = true;
                    } else {
                        z27 = z12;
                    }
                    if (i25 != 0) {
                        z28 = true;
                    } else {
                        z28 = z13;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z14;
                    }
                    if (i29 != 0) {
                        z30 = false;
                    } else {
                        z30 = z15;
                    }
                    if (i32 != 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = f11;
                    }
                    if (i35 != 0) {
                        z31 = false;
                    } else {
                        z31 = z16;
                    }
                    if (i39 != 0) {
                        z32 = false;
                    } else {
                        z32 = z17;
                    }
                    if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                        strE0 = ub.a.e0(sVar5, R.string.test_check);
                        i47 &= -7169;
                    } else {
                        strE0 = str2;
                    }
                    if (i43 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i45 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i48 == 0) {
                    }
                    if (i51 != 0) {
                        objQ7 = sVar5.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new d0.y1(19);
                            sVar5.o0(objQ7);
                        }
                        cVar10 = (fz.c) objQ7;
                    } else {
                        z27 = z27;
                        cVar10 = cVar;
                    }
                    if (i54 != 0) {
                        objQ6 = sVar5.Q();
                        if (objQ6 == gVar) {
                            objQ6 = new d0.y1(19);
                            sVar5.o0(objQ6);
                        }
                        cVar11 = (fz.c) objQ6;
                    } else {
                        cVar10 = cVar10;
                        cVar11 = cVar2;
                    }
                    if (i58 != 0) {
                        objQ5 = sVar5.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new d0.y1(18);
                            sVar5.o0(objQ5);
                        }
                        cVar12 = (fz.c) objQ5;
                    } else {
                        cVar11 = cVar11;
                        cVar12 = cVar3;
                    }
                    if (i62 != 0) {
                        objQ4 = sVar5.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new d0.y1(19);
                            sVar5.o0(objQ4);
                        }
                        cVar13 = (fz.c) objQ4;
                    } else {
                        cVar12 = cVar12;
                        cVar13 = cVar4;
                    }
                    if (i65 != 0) {
                        objQ3 = sVar5.Q();
                        if (objQ3 == gVar) {
                            i75 = 15;
                            objQ3 = new cr.m(15);
                            sVar5.o0(objQ3);
                        } else {
                            i75 = 15;
                        }
                        aVar8 = (fz.a) objQ3;
                    } else {
                        cVar13 = cVar13;
                        i75 = 15;
                        aVar8 = aVar;
                    }
                    if (i66 != 0) {
                        objQ2 = sVar5.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new cr.m(i75);
                            sVar5.o0(objQ2);
                        }
                        aVar9 = (fz.a) objQ2;
                    } else {
                        aVar9 = aVar4;
                    }
                    if (i69 != 0) {
                        sVar4 = ns.s.OTHER_LOCAL;
                    } else {
                        sVar4 = sVar;
                    }
                    aVar10 = aVar9;
                    if (i72 != 0) {
                        objQ = sVar5.Q();
                        if (objQ == gVar) {
                            objQ = new cr.m(15);
                            sVar5.o0(objQ);
                        }
                        i76 = 16;
                        aVar12 = (fz.a) objQ;
                        aVar11 = aVar8;
                    } else {
                        aVar11 = aVar8;
                        i76 = 16;
                        aVar12 = aVar3;
                    }
                    z33 = z28;
                    str6 = str3;
                    z34 = z29;
                    f15 = 1.0f;
                }
                sVar5.q();
                ns.z zVar18 = zVar3;
                objQ8 = sVar5.Q();
                if (objQ8 == gVar) {
                    objQ8 = l1.t.q(sVar5);
                    sVar5.o0(objQ8);
                }
                b0Var = (rz.b0) objQ8;
                uVar = new kotlin.jvm.internal.u();
                objQ9 = sVar5.Q();
                if (objQ9 == gVar) {
                    objQ9 = Boolean.FALSE;
                    sVar5.o0(objQ9);
                }
                uVar.f38357a = ((Boolean) objQ9).booleanValue();
                d2VarU = d0.n.u(sVar5);
                d2VarU2 = d0.n.u(sVar5);
                String str1115 = str6;
                Context context15 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                boolean zBooleanValue15 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
                z1.j jVar15 = z1.c.f58463a;
                boolean z4111117 = z27;
                boolean z4111118 = z33;
                w2.q0 q0VarD119 = j0.o.d(jVar15, false);
                iHashCode = Long.hashCode(sVar5.T);
                l1.q1 q1VarL111117 = sVar5.l();
                ns.s sVar110 = sVar4;
                oVar = z1.o.f58481a;
                boolean z4111119 = z34;
                z1.r rVarC11111111 = z1.a.c(sVar5, oVar);
                y2.k.J.getClass();
                fz.a aVar111116 = aVar12;
                iVar = y2.j.f56913b;
                sVar5.h0();
                fVar4 = fVar3;
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                hVar = y2.j.f56917f;
                l1.t.J(hVar, q0VarD119, sVar5);
                hVar2 = y2.j.f56916e;
                l1.t.J(hVar2, q1VarL111117, sVar5);
                hVar3 = y2.j.f56918g;
                fz.a aVar111117 = aVar11;
                if (sVar5.S) {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                } else {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                }
                hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC11111111, sVar5);
                z1.r rVarR15 = j0.c.r(j0.e2.d(oVar, 1.0f));
                j0.u uVarA15 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                iHashCode2 = Long.hashCode(sVar5.T);
                l1.q1 q1VarL111118 = sVar5.l();
                z1.r rVarC11111112 = z1.a.c(sVar5, rVarR15);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar, uVarA15, sVar5);
                l1.t.J(hVar2, q1VarL111118, sVar5);
                if (sVar5.S) {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                } else {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC11111112, sVar5);
                z1.r rVarE15 = j0.e2.e(oVar, 1.0f);
                d5 = 1.0f;
                if (d5 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                f16 = i76;
                z1.r rVarC11111113 = j0.c.C(w4.c.p(1.0f, true, rVarE15), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
                objQ10 = sVar5.Q();
                if (zH) {
                    final int i81111111111117 = 0;
                    objQ10 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i81111111111117) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ10);
                } else {
                    final int i81111111111118 = 0;
                    objQ10 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i81111111111118) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ10);
                }
                fz.a aVar111118 = (fz.a) objQ10;
                zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
                objQ11 = sVar5.Q();
                if (zH2) {
                    final int i81111111111119 = 1;
                    objQ11 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i81111111111119) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ11);
                } else {
                    final int i811111111111110 = 1;
                    objQ11 = new fz.a() { // from class: dt.y2
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i811111111111110) {
                                case 0:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                    break;
                                default:
                                    rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar5.o0(objQ11);
                }
                int i811111111111111 = i31 >> 12;
                int i811111111111112 = (i31 & 14) | (i811111111111111 & 112) | (i811111111111111 & 896) | (i811111111111111 & 7168) | ((i31 >> 15) & 57344);
                int i811111111111113 = i47 << 15;
                int i811111111111114 = i67 << 18;
                b(str1115, z4111117, z4111118, z4111119, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC11111113, dVar, dVar2, dVar3, eVar3, aVar10, aVar111118, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i811111111111112 | (i811111111111113 & 458752) | (3670016 & i811111111111113) | (i811111111111113 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i811111111111114) | (234881024 & i811111111111114) | (i811111111111114 & 1879048192), (i67 >> 12) & 14);
                boolean z41111110 = z31;
                float f11115 = f14;
                float f11116 = f15;
                str3 = str1115;
                if (courseTestState == ht.q.CHECKING) {
                    sVar5.d0(1774820302);
                    z1.r rVarG15 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                    objQ17 = sVar5.Q();
                    if (objQ17 == gVar) {
                        objQ17 = new cr.m(15);
                        sVar5.o0(objQ17);
                    }
                    iu.k.e((fz.a) objQ17, rVarG15, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                    z36 = false;
                    sVar5.p(false);
                    z37 = true;
                } else {
                    sVar5.d0(1775330221);
                    j0.a2 a2VarA15 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                    iHashCode3 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL111119 = sVar5.l();
                    z1.r rVarC11111114 = z1.a.c(sVar5, oVar);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, a2VarA15, sVar5);
                    l1.t.J(hVar2, q1VarL111119, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                    } else {
                        defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC11111114, sVar5);
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var15 = new j0.i1(1.0f, true);
                    if ((i31 & 112) == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objQ12 = sVar5.Q();
                    if (z35) {
                        objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                        sVar5.o0(objQ12);
                    } else {
                        objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                        sVar5.o0(objQ12);
                    }
                    String str1116 = strE0;
                    a0.g(courseTestState, g2.f0.q(i1Var15, (fz.c) objQ12), str1116, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                    strE0 = str1116;
                    if (z30) {
                        z36 = false;
                        sVar5.d0(393996308);
                    } else {
                        z36 = false;
                        sVar5.d0(393996308);
                    }
                    sVar5.p(z36);
                    z37 = true;
                    sVar5.p(true);
                    sVar5.p(z36);
                }
                sVar5.p(z37);
                rVar = j0.r.f35391a;
                if (fVar4 == null) {
                    sVar5.d0(1152060677);
                    sVar5.p(z36);
                    fVar5 = fVar4;
                } else {
                    sVar5.d0(452805244);
                    fVar5 = fVar4;
                    fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                    sVar5.p(z36);
                }
                z1.r rVarA15 = rVar.a(oVar, z1.c.H);
                w2.q0 q0VarD1110 = j0.o.d(jVar15, z36);
                fz.f fVar110 = fVar5;
                iHashCode4 = Long.hashCode(sVar5.T);
                l1.q1 q1VarL1111110 = sVar5.l();
                z1.r rVarC11111115 = z1.a.c(sVar5, rVarA15);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar, q0VarD1110, sVar5);
                l1.t.J(hVar2, q1VarL1111110, sVar5);
                if (sVar5.S) {
                    defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                } else {
                    defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
                }
                l1.t.J(hVar4, rVarC11111115, sVar5);
                if (courseTestState == ht.q.REVISING) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                objQ13 = sVar5.Q();
                if (objQ13 == gVar) {
                    objQ13 = new d0.y1(20);
                    sVar5.o0(objQ13);
                }
                a0.l1 l1VarC119 = a0.f1.c((fz.c) objQ13, 7);
                objQ14 = sVar5.Q();
                if (objQ14 == gVar) {
                    objQ14 = new d0.y1(21);
                    sVar5.o0(objQ14);
                }
                a0.j0.d(z38, null, l1VarC119, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar110, aVar111116), sVar5), sVar5, 200064, 18);
                ht.q qVar15 = ht.q.CORRECT;
                boolean zD15 = ry.l.D(new ht.q[]{qVar15, ht.q.WRONG}, courseTestState);
                objQ15 = sVar5.Q();
                if (objQ15 == gVar) {
                    objQ15 = new d0.y1(22);
                    sVar5.o0(objQ15);
                }
                a0.l1 l1VarC1110 = a0.f1.c((fz.c) objQ15, 7);
                objQ16 = sVar5.Q();
                if (objQ16 == gVar) {
                    objQ16 = new d0.y1(23);
                    sVar5.o0(objQ16);
                }
                a0.j0.d(zD15, null, l1VarC1110, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context15, getComboCount, audioPlayingState, zVar18, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
                sVar5.p(true);
                int iIntValue15 = ((Number) getComboCount.invoke()).intValue();
                if (z18) {
                    z39 = false;
                    sVar5.d0(1141210802);
                } else {
                    z39 = false;
                    sVar5.d0(1141210802);
                }
                sVar5.p(z39);
                sVar5.p(true);
                z24 = z18;
                z22 = z30;
                str4 = strE0;
                z20 = z4111117;
                z21 = z4111118;
                sVar3 = sVar5;
                z25 = z4111119;
                z26 = z32;
                z23 = z41111110;
                zVar2 = zVar18;
                cVar6 = cVar10;
                cVar7 = cVar11;
                cVar8 = cVar12;
                cVar9 = cVar13;
                aVar5 = aVar111117;
                sVar2 = sVar110;
                aVar6 = aVar111116;
                f12 = f11116;
                f13 = f11115;
                eVar2 = eVar3;
                aVar7 = aVar10;
                fVar2 = fVar110;
            } else {
                sVar5.W();
                z20 = z12;
                z21 = z13;
                z22 = z15;
                f12 = f5;
                f13 = f11;
                z23 = z16;
                str4 = str2;
                eVar2 = eVar;
                fVar2 = fVar;
                zVar2 = zVar;
                cVar6 = cVar;
                cVar7 = cVar2;
                cVar8 = cVar3;
                cVar9 = cVar4;
                aVar5 = aVar;
                sVar2 = sVar;
                aVar6 = aVar3;
                aVar7 = aVar4;
                sVar3 = sVar5;
                z24 = z18;
                z25 = z14;
                z26 = z17;
            }
            str5 = str3;
            x1VarT = sVar3.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.x2
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i11 | 1);
                        int iM2 = l1.t.M(i12);
                        int iM3 = l1.t.M(i13);
                        int iM4 = l1.t.M(i14);
                        k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i73 = i71 | 384;
        if ((i14 & 3072) == 0) {
            i73 |= sVar5.h(onClickContinue) ? 2048 : 1024;
        }
        int i811111111111115 = i73;
        if ((i31 & 306783379) != 306783378) {
            z19 = true;
        } else {
            z19 = true;
        }
        if (sVar5.T(i31 & 1, z19)) {
            sVar5.Y();
            i74 = i11 & 1;
            gVar = l1.m.f39353a;
            if (i74 != 0) {
                if (i18 != 0) {
                    str3 = BuildConfig.VERSION_NAME;
                }
                if (i81 != 0) {
                    z18 = true;
                }
                if (i21 != 0) {
                    z27 = true;
                } else {
                    z27 = z12;
                }
                if (i25 != 0) {
                    z28 = true;
                } else {
                    z28 = z13;
                }
                if (i27 != 0) {
                    z29 = false;
                } else {
                    z29 = z14;
                }
                if (i29 != 0) {
                    z30 = false;
                } else {
                    z30 = z15;
                }
                if (i32 != 0) {
                    f14 = 1.0f;
                } else {
                    f14 = f11;
                }
                if (i35 != 0) {
                    z31 = false;
                } else {
                    z31 = z16;
                }
                if (i39 != 0) {
                    z32 = false;
                } else {
                    z32 = z17;
                }
                if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                    strE0 = ub.a.e0(sVar5, R.string.test_check);
                    i47 &= -7169;
                } else {
                    strE0 = str2;
                }
                if (i43 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
                if (i45 != 0) {
                    fVar3 = null;
                } else {
                    fVar3 = fVar;
                }
                if (i48 == 0) {
                }
                if (i51 != 0) {
                    objQ7 = sVar5.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new d0.y1(19);
                        sVar5.o0(objQ7);
                    }
                    cVar10 = (fz.c) objQ7;
                } else {
                    z27 = z27;
                    cVar10 = cVar;
                }
                if (i54 != 0) {
                    objQ6 = sVar5.Q();
                    if (objQ6 == gVar) {
                        objQ6 = new d0.y1(19);
                        sVar5.o0(objQ6);
                    }
                    cVar11 = (fz.c) objQ6;
                } else {
                    cVar10 = cVar10;
                    cVar11 = cVar2;
                }
                if (i58 != 0) {
                    objQ5 = sVar5.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new d0.y1(18);
                        sVar5.o0(objQ5);
                    }
                    cVar12 = (fz.c) objQ5;
                } else {
                    cVar11 = cVar11;
                    cVar12 = cVar3;
                }
                if (i62 != 0) {
                    objQ4 = sVar5.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new d0.y1(19);
                        sVar5.o0(objQ4);
                    }
                    cVar13 = (fz.c) objQ4;
                } else {
                    cVar12 = cVar12;
                    cVar13 = cVar4;
                }
                if (i65 != 0) {
                    objQ3 = sVar5.Q();
                    if (objQ3 == gVar) {
                        i75 = 15;
                        objQ3 = new cr.m(15);
                        sVar5.o0(objQ3);
                    } else {
                        i75 = 15;
                    }
                    aVar8 = (fz.a) objQ3;
                } else {
                    cVar13 = cVar13;
                    i75 = 15;
                    aVar8 = aVar;
                }
                if (i66 != 0) {
                    objQ2 = sVar5.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new cr.m(i75);
                        sVar5.o0(objQ2);
                    }
                    aVar9 = (fz.a) objQ2;
                } else {
                    aVar9 = aVar4;
                }
                if (i69 != 0) {
                    sVar4 = ns.s.OTHER_LOCAL;
                } else {
                    sVar4 = sVar;
                }
                aVar10 = aVar9;
                if (i72 != 0) {
                    objQ = sVar5.Q();
                    if (objQ == gVar) {
                        objQ = new cr.m(15);
                        sVar5.o0(objQ);
                    }
                    i76 = 16;
                    aVar12 = (fz.a) objQ;
                    aVar11 = aVar8;
                } else {
                    aVar11 = aVar8;
                    i76 = 16;
                    aVar12 = aVar3;
                }
                z33 = z28;
                str6 = str3;
                z34 = z29;
                f15 = 1.0f;
            } else {
                if (i18 != 0) {
                    str3 = BuildConfig.VERSION_NAME;
                }
                if (i81 != 0) {
                    z18 = true;
                }
                if (i21 != 0) {
                    z27 = true;
                } else {
                    z27 = z12;
                }
                if (i25 != 0) {
                    z28 = true;
                } else {
                    z28 = z13;
                }
                if (i27 != 0) {
                    z29 = false;
                } else {
                    z29 = z14;
                }
                if (i29 != 0) {
                    z30 = false;
                } else {
                    z30 = z15;
                }
                if (i32 != 0) {
                    f14 = 1.0f;
                } else {
                    f14 = f11;
                }
                if (i35 != 0) {
                    z31 = false;
                } else {
                    z31 = z16;
                }
                if (i39 != 0) {
                    z32 = false;
                } else {
                    z32 = z17;
                }
                if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                    strE0 = ub.a.e0(sVar5, R.string.test_check);
                    i47 &= -7169;
                } else {
                    strE0 = str2;
                }
                if (i43 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
                if (i45 != 0) {
                    fVar3 = null;
                } else {
                    fVar3 = fVar;
                }
                if (i48 == 0) {
                }
                if (i51 != 0) {
                    objQ7 = sVar5.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new d0.y1(19);
                        sVar5.o0(objQ7);
                    }
                    cVar10 = (fz.c) objQ7;
                } else {
                    z27 = z27;
                    cVar10 = cVar;
                }
                if (i54 != 0) {
                    objQ6 = sVar5.Q();
                    if (objQ6 == gVar) {
                        objQ6 = new d0.y1(19);
                        sVar5.o0(objQ6);
                    }
                    cVar11 = (fz.c) objQ6;
                } else {
                    cVar10 = cVar10;
                    cVar11 = cVar2;
                }
                if (i58 != 0) {
                    objQ5 = sVar5.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new d0.y1(18);
                        sVar5.o0(objQ5);
                    }
                    cVar12 = (fz.c) objQ5;
                } else {
                    cVar11 = cVar11;
                    cVar12 = cVar3;
                }
                if (i62 != 0) {
                    objQ4 = sVar5.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new d0.y1(19);
                        sVar5.o0(objQ4);
                    }
                    cVar13 = (fz.c) objQ4;
                } else {
                    cVar12 = cVar12;
                    cVar13 = cVar4;
                }
                if (i65 != 0) {
                    objQ3 = sVar5.Q();
                    if (objQ3 == gVar) {
                        i75 = 15;
                        objQ3 = new cr.m(15);
                        sVar5.o0(objQ3);
                    } else {
                        i75 = 15;
                    }
                    aVar8 = (fz.a) objQ3;
                } else {
                    cVar13 = cVar13;
                    i75 = 15;
                    aVar8 = aVar;
                }
                if (i66 != 0) {
                    objQ2 = sVar5.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new cr.m(i75);
                        sVar5.o0(objQ2);
                    }
                    aVar9 = (fz.a) objQ2;
                } else {
                    aVar9 = aVar4;
                }
                if (i69 != 0) {
                    sVar4 = ns.s.OTHER_LOCAL;
                } else {
                    sVar4 = sVar;
                }
                aVar10 = aVar9;
                if (i72 != 0) {
                    objQ = sVar5.Q();
                    if (objQ == gVar) {
                        objQ = new cr.m(15);
                        sVar5.o0(objQ);
                    }
                    i76 = 16;
                    aVar12 = (fz.a) objQ;
                    aVar11 = aVar8;
                } else {
                    aVar11 = aVar8;
                    i76 = 16;
                    aVar12 = aVar3;
                }
                z33 = z28;
                str6 = str3;
                z34 = z29;
                f15 = 1.0f;
            }
            sVar5.q();
            ns.z zVar19 = zVar3;
            objQ8 = sVar5.Q();
            if (objQ8 == gVar) {
                objQ8 = l1.t.q(sVar5);
                sVar5.o0(objQ8);
            }
            b0Var = (rz.b0) objQ8;
            uVar = new kotlin.jvm.internal.u();
            objQ9 = sVar5.Q();
            if (objQ9 == gVar) {
                objQ9 = Boolean.FALSE;
                sVar5.o0(objQ9);
            }
            uVar.f38357a = ((Boolean) objQ9).booleanValue();
            d2VarU = d0.n.u(sVar5);
            d2VarU2 = d0.n.u(sVar5);
            String str1117 = str6;
            Context context16 = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
            boolean zBooleanValue16 = ((Boolean) sVar5.j(ju.f.f37373g)).booleanValue();
            z1.j jVar16 = z1.c.f58463a;
            boolean z41111111 = z27;
            boolean z41111112 = z33;
            w2.q0 q0VarD1111 = j0.o.d(jVar16, false);
            iHashCode = Long.hashCode(sVar5.T);
            l1.q1 q1VarL1111111 = sVar5.l();
            ns.s sVar111 = sVar4;
            oVar = z1.o.f58481a;
            boolean z41111113 = z34;
            z1.r rVarC11111116 = z1.a.c(sVar5, oVar);
            y2.k.J.getClass();
            fz.a aVar111119 = aVar12;
            iVar = y2.j.f56913b;
            sVar5.h0();
            fVar4 = fVar3;
            if (sVar5.S) {
                sVar5.k(iVar);
            } else {
                sVar5.r0();
            }
            hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD1111, sVar5);
            hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL1111111, sVar5);
            hVar3 = y2.j.f56918g;
            fz.a aVar1111110 = aVar11;
            if (sVar5.S) {
                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
            }
            hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC11111116, sVar5);
            z1.r rVarR16 = j0.c.r(j0.e2.d(oVar, 1.0f));
            j0.u uVarA16 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
            iHashCode2 = Long.hashCode(sVar5.T);
            l1.q1 q1VarL1111112 = sVar5.l();
            z1.r rVarC11111117 = z1.a.c(sVar5, rVarR16);
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar);
            } else {
                sVar5.r0();
            }
            l1.t.J(hVar, uVarA16, sVar5);
            l1.t.J(hVar2, q1VarL1111112, sVar5);
            if (sVar5.S) {
                defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
            } else {
                defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC11111117, sVar5);
            z1.r rVarE16 = j0.e2.e(oVar, 1.0f);
            d5 = 1.0f;
            if (d5 <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            f16 = i76;
            z1.r rVarC11111118 = j0.c.C(w4.c.p(1.0f, true, rVarE16), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            zH = sVar5.h(b0Var) | sVar5.f(d2VarU);
            objQ10 = sVar5.Q();
            if (zH) {
                final int i811111111111116 = 0;
                objQ10 = new fz.a() { // from class: dt.y2
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i811111111111116) {
                            case 0:
                                rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                break;
                            default:
                                rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar5.o0(objQ10);
            } else {
                final int i811111111111117 = 0;
                objQ10 = new fz.a() { // from class: dt.y2
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i811111111111117) {
                            case 0:
                                rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 0), 3);
                                break;
                            default:
                                rz.e0.B(b0Var, null, null, new i3(d2VarU, null, 1), 3);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar5.o0(objQ10);
            }
            fz.a aVar1111111 = (fz.a) objQ10;
            zH2 = sVar5.h(b0Var) | sVar5.f(d2VarU2);
            objQ11 = sVar5.Q();
            if (zH2) {
                final int i811111111111118 = 1;
                objQ11 = new fz.a() { // from class: dt.y2
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i811111111111118) {
                            case 0:
                                rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                break;
                            default:
                                rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar5.o0(objQ11);
            } else {
                final int i811111111111119 = 1;
                objQ11 = new fz.a() { // from class: dt.y2
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i811111111111119) {
                            case 0:
                                rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 0), 3);
                                break;
                            default:
                                rz.e0.B(b0Var, null, null, new i3(d2VarU2, null, 1), 3);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar5.o0(objQ11);
            }
            int i8111111111111110 = i31 >> 12;
            int i8111111111111111 = (i31 & 14) | (i8111111111111110 & 112) | (i8111111111111110 & 896) | (i8111111111111110 & 7168) | ((i31 >> 15) & 57344);
            int i8111111111111112 = i47 << 15;
            int i8111111111111113 = i67 << 18;
            b(str1117, z41111111, z41111112, z41111113, f15, f14, z31, z32, d2VarU, d2VarU2, rVarC11111118, dVar, dVar2, dVar3, eVar3, aVar10, aVar1111111, cVar10, cVar11, cVar12, cVar13, (fz.a) objQ11, sVar5, i8111111111111111 | (i8111111111111112 & 458752) | (3670016 & i8111111111111112) | (i8111111111111112 & 29360128), ((i47 >> 9) & 65520) | ((i67 >> 3) & 458752) | (29360128 & i8111111111111113) | (234881024 & i8111111111111113) | (i8111111111111113 & 1879048192), (i67 >> 12) & 14);
            boolean z41111114 = z31;
            float f11117 = f14;
            float f11118 = f15;
            str3 = str1117;
            if (courseTestState == ht.q.CHECKING) {
                sVar5.d0(1774820302);
                z1.r rVarG16 = j0.e2.g(j0.e2.e(j0.c.B(j0.c.v(oVar), f16, f16), 1.0f), 42);
                objQ17 = sVar5.Q();
                if (objQ17 == gVar) {
                    objQ17 = new cr.m(15);
                    sVar5.o0(objQ17);
                }
                iu.k.e((fz.a) objQ17, rVarG16, false, 0L, null, e.f23763j, sVar5, 196998, 24);
                z36 = false;
                sVar5.p(false);
                z37 = true;
            } else {
                sVar5.d0(1775330221);
                j0.a2 a2VarA16 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                iHashCode3 = Long.hashCode(sVar5.T);
                l1.q1 q1VarL1111113 = sVar5.l();
                z1.r rVarC11111119 = z1.a.c(sVar5, oVar);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar, a2VarA16, sVar5);
                l1.t.J(hVar2, q1VarL1111113, sVar5);
                if (sVar5.S) {
                    defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                } else {
                    defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
                }
                l1.t.J(hVar4, rVarC11111119, sVar5);
                if (d5 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.i1 i1Var16 = new j0.i1(1.0f, true);
                if ((i31 & 112) == 32) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                objQ12 = sVar5.Q();
                if (z35) {
                    objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                    sVar5.o0(objQ12);
                } else {
                    objQ12 = new com.google.firebase.datastorage.a(courseTestState, 16);
                    sVar5.o0(objQ12);
                }
                String str1118 = strE0;
                a0.g(courseTestState, g2.f0.q(i1Var16, (fz.c) objQ12), str1118, new at.f(27, uVar, onClickChecked), sVar5, ((i31 >> 3) & 14) | ((i47 >> 3) & 896), 0);
                strE0 = str1118;
                if (z30) {
                    z36 = false;
                    sVar5.d0(393996308);
                } else {
                    z36 = false;
                    sVar5.d0(393996308);
                }
                sVar5.p(z36);
                z37 = true;
                sVar5.p(true);
                sVar5.p(z36);
            }
            sVar5.p(z37);
            rVar = j0.r.f35391a;
            if (fVar4 == null) {
                sVar5.d0(1152060677);
                sVar5.p(z36);
                fVar5 = fVar4;
            } else {
                sVar5.d0(452805244);
                fVar5 = fVar4;
                fVar5.invoke(rVar, sVar5, Integer.valueOf(6 | ((i47 >> 21) & 112)));
                sVar5.p(z36);
            }
            z1.r rVarA16 = rVar.a(oVar, z1.c.H);
            w2.q0 q0VarD1112 = j0.o.d(jVar16, z36);
            fz.f fVar111 = fVar5;
            iHashCode4 = Long.hashCode(sVar5.T);
            l1.q1 q1VarL1111114 = sVar5.l();
            z1.r rVarC111111110 = z1.a.c(sVar5, rVarA16);
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar);
            } else {
                sVar5.r0();
            }
            l1.t.J(hVar, q0VarD1112, sVar5);
            l1.t.J(hVar2, q1VarL1111114, sVar5);
            if (sVar5.S) {
                defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
            } else {
                defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
            }
            l1.t.J(hVar4, rVarC111111110, sVar5);
            if (courseTestState == ht.q.REVISING) {
                z38 = true;
            } else {
                z38 = false;
            }
            objQ13 = sVar5.Q();
            if (objQ13 == gVar) {
                objQ13 = new d0.y1(20);
                sVar5.o0(objQ13);
            }
            a0.l1 l1VarC1111 = a0.f1.c((fz.c) objQ13, 7);
            objQ14 = sVar5.Q();
            if (objQ14 == gVar) {
                objQ14 = new d0.y1(21);
                sVar5.o0(objQ14);
            }
            a0.j0.d(z38, null, l1VarC1111, a0.f1.k((fz.c) objQ14, 7), null, t1.e.d(1121674766, new at.p(5, sVar111, aVar111119), sVar5), sVar5, 200064, 18);
            ht.q qVar16 = ht.q.CORRECT;
            boolean zD16 = ry.l.D(new ht.q[]{qVar16, ht.q.WRONG}, courseTestState);
            objQ15 = sVar5.Q();
            if (objQ15 == gVar) {
                objQ15 = new d0.y1(22);
                sVar5.o0(objQ15);
            }
            a0.l1 l1VarC1112 = a0.f1.c((fz.c) objQ15, 7);
            objQ16 = sVar5.Q();
            if (objQ16 == gVar) {
                objQ16 = new d0.y1(23);
                sVar5.o0(objQ16);
            }
            a0.j0.d(zD16, null, l1VarC1112, a0.f1.k((fz.c) objQ16, 7), null, t1.e.d(-255061307, new w2(courseTestState, context16, getComboCount, audioPlayingState, zVar19, onClickContinue, onClickPlayAudio, cVar5, dVar4), sVar5), sVar5, 200064, 18);
            sVar5.p(true);
            int iIntValue16 = ((Number) getComboCount.invoke()).intValue();
            if (z18) {
                z39 = false;
                sVar5.d0(1141210802);
            } else {
                z39 = false;
                sVar5.d0(1141210802);
            }
            sVar5.p(z39);
            sVar5.p(true);
            z24 = z18;
            z22 = z30;
            str4 = strE0;
            z20 = z41111111;
            z21 = z41111112;
            sVar3 = sVar5;
            z25 = z41111113;
            z26 = z32;
            z23 = z41111114;
            zVar2 = zVar19;
            cVar6 = cVar10;
            cVar7 = cVar11;
            cVar8 = cVar12;
            cVar9 = cVar13;
            aVar5 = aVar1111110;
            sVar2 = sVar111;
            aVar6 = aVar111119;
            f12 = f11118;
            f13 = f11117;
            eVar2 = eVar3;
            aVar7 = aVar10;
            fVar2 = fVar111;
        } else {
            sVar5.W();
            z20 = z12;
            z21 = z13;
            z22 = z15;
            f12 = f5;
            f13 = f11;
            z23 = z16;
            str4 = str2;
            eVar2 = eVar;
            fVar2 = fVar;
            zVar2 = zVar;
            cVar6 = cVar;
            cVar7 = cVar2;
            cVar8 = cVar3;
            cVar9 = cVar4;
            aVar5 = aVar;
            sVar2 = sVar;
            aVar6 = aVar3;
            aVar7 = aVar4;
            sVar3 = sVar5;
            z24 = z18;
            z25 = z14;
            z26 = z17;
        }
        str5 = str3;
        x1VarT = sVar3.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.x2
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i11 | 1);
                    int iM2 = l1.t.M(i12);
                    int iM3 = l1.t.M(i13);
                    int iM4 = l1.t.M(i14);
                    k3.e(str5, courseTestState, audioPlayingState, z24, z20, z21, z25, z22, f12, f13, z23, z26, str4, dVar, dVar2, dVar3, eVar2, fVar2, dVar4, zVar2, cVar6, cVar7, cVar8, cVar9, aVar5, aVar7, onClickPlayAudio, cVar5, getComboCount, onClickChecked, sVar2, aVar6, onClickContinue, (l1.n) obj, iM, iM2, iM3, iM4, i15, i16);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x0145  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147  */
    /* JADX WARN: Code duplicated, block: B:67:0x0150  */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a6  */
    public static final void f(boolean z11, d0.d2 d2Var, fz.a aVar, fz.c cVar, t1.d dVar, l1.n nVar, int i11) {
        fz.a aVar2;
        int i12;
        z1.r rVarE;
        int iHashCode;
        int i13;
        boolean z12;
        Object objQ;
        l1.b1 b1Var;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objQ2;
        boolean z16;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1338215313);
        int i14 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.f(d2Var) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128) | (sVar.h(cVar) ? 2048 : 1024) | (sVar.h(dVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i14 & 1, (i14 & 9363) != 9362)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
            boolean z17 = (i14 & 7168) == 2048;
            Object objQ3 = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z17 || objQ3 == gVar) {
                objQ3 = new b0.o1(cVar, 5);
                sVar.o0(objQ3);
            }
            z1.r rVarO = w2.a0.o(rVarE2, (fz.c) objQ3);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarO);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S) {
                i12 = i14;
            } else {
                i12 = i14;
                if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar);
                if (z11) {
                    rVarE = d0.n.y(j0.e2.e(oVar, 1.0f), d2Var, true, 12);
                } else {
                    rVarE = j0.e2.e(oVar, 1.0f);
                }
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarE);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, uVarA, sVar);
                l1.t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar);
                hh.p0.x((i12 >> 12) & 14, dVar, sVar, true);
                i13 = i12 & 14;
                if (i13 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ = sVar.Q();
                if (z12 || objQ == gVar) {
                    objQ = l1.t.B(Boolean.FALSE);
                    sVar.o0(objQ);
                }
                b1Var = (l1.b1) objQ;
                Boolean boolValueOf = Boolean.valueOf(z11);
                Boolean boolValueOf2 = Boolean.valueOf(d2Var.d());
                if (i13 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zF = z13 | sVar.f(b1Var);
                if ((i12 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zF | z14;
                objQ2 = sVar.Q();
                if (z15 || objQ2 == gVar) {
                    h3 h3Var = new h3(z11, d2Var, b1Var, null, 1);
                    sVar.o0(h3Var);
                    objQ2 = h3Var;
                }
                l1.t.g(boolValueOf, boolValueOf2, (fz.e) objQ2, sVar);
                if (z11 || !((Boolean) b1Var.getValue()).booleanValue()) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                aVar2 = aVar;
                a0.j0.d(z16, j0.e2.p(j0.r.f35391a.a(oVar, z1.c.K), 24, 16), null, null, null, t1.e.d(570878541, new bp.u(2, aVar2), sVar), sVar, 196608, 28);
                sVar.p(true);
            }
            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            if (z11) {
                rVarE = d0.n.y(j0.e2.e(oVar, 1.0f), d2Var, true, 12);
            } else {
                rVarE = j0.e2.e(oVar, 1.0f);
            }
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            l1.t.J(hVar5, rVarC3, sVar);
            hh.p0.x((i12 >> 12) & 14, dVar, sVar, true);
            i13 = i12 & 14;
            if (i13 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objQ = sVar.Q();
            if (z12) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            } else {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1Var = (l1.b1) objQ;
            Boolean boolValueOf3 = Boolean.valueOf(z11);
            Boolean boolValueOf4 = Boolean.valueOf(d2Var.d());
            if (i13 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zF2 = z13 | sVar.f(b1Var);
            if ((i12 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zF2 | z14;
            objQ2 = sVar.Q();
            if (z15) {
                h3 h3Var2 = new h3(z11, d2Var, b1Var, null, 1);
                sVar.o0(h3Var2);
                objQ2 = h3Var2;
            } else {
                h3 h3Var3 = new h3(z11, d2Var, b1Var, null, 1);
                sVar.o0(h3Var3);
                objQ2 = h3Var3;
            }
            l1.t.g(boolValueOf3, boolValueOf4, (fz.e) objQ2, sVar);
            if (z11) {
                z16 = false;
            } else {
                z16 = false;
            }
            aVar2 = aVar;
            a0.j0.d(z16, j0.e2.p(j0.r.f35391a.a(oVar, z1.c.K), 24, 16), null, null, null, t1.e.d(570878541, new bp.u(2, aVar2), sVar), sVar, 196608, 28);
            sVar.p(true);
        } else {
            aVar2 = aVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d3(z11, d2Var, aVar2, cVar, dVar, i11);
        }
    }

    public static final void g(ns.s sVar, fz.a aVar, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        z1.r rVar2;
        int i13;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(252632797);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.d(sVar.ordinal()) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(aVar) ? 32 : 16;
        }
        int i14 = i12 | 384;
        if (sVar2.T(i14 & 1, (i14 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            l1.c3 c3Var = h1.v1.f31180a;
            kotlin.jvm.internal.m.f((h1.s1) sVar2.j(c3Var), "<this>");
            float f5 = 16;
            float f11 = 20;
            z1.r rVarD = j0.c.D(j0.c.v(d0.n.h(rVarE, d0.n.t(sVar2) ? ju.a.U0 : ju.a.R, g2.f0.f28556b)), f5, f11, f5, f5);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            String strE0 = ub.a.e0(sVar2, R.string.retry_hint_title);
            kotlin.jvm.internal.m.f((h1.s1) sVar2.j(c3Var), "<this>");
            ua.b(strE0, null, d0.n.t(sVar2) ? ju.a.V0 : ju.a.S, fr.j3.A(18), null, n3.s.N, null, 0L, null, fr.j3.A(24), 0, false, 0, 0, null, sVar2, 199680, 6, 130002);
            j0.c.g(sVar2, j0.e2.g(oVar, 2));
            switch (j3.f23916a[sVar.ordinal()]) {
                case 1:
                    i13 = R.string.retry_hint_spelling;
                    break;
                case 2:
                    i13 = R.string.retry_hint_missing_element;
                    break;
                case 3:
                    i13 = R.string.retry_hint_extra_element;
                    break;
                case 4:
                    i13 = R.string.retry_hint_order;
                    break;
                case 5:
                    i13 = R.string.retry_hint_form;
                    break;
                case 6:
                    i13 = R.string.retry_hint_replace_element;
                    break;
                case 7:
                case 8:
                    i13 = R.string.retry_hint_other_local;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String strE1 = ub.a.e0(sVar2, i13);
            kotlin.jvm.internal.m.f((h1.s1) sVar2.j(c3Var), "<this>");
            ua.b(strE1, null, d0.n.t(sVar2) ? ju.a.V0 : ju.a.S, fr.j3.A(15), null, null, null, 0L, null, fr.j3.A(20), 0, false, 0, 0, null, sVar2, 3072, 6, 130034);
            sVar2 = sVar2;
            j0.c.g(sVar2, j0.e2.g(oVar, f11));
            z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
            kotlin.jvm.internal.m.f((h1.s1) sVar2.j(c3Var), "<this>");
            long j11 = d0.n.t(sVar2) ? ju.a.T0 : ju.a.Q;
            kotlin.jvm.internal.m.f((h1.s1) sVar2.j(c3Var), "<this>");
            g2.x xVar = new g2.x(d0.n.t(sVar2) ? ju.a.S0 : ju.a.P);
            kotlin.jvm.internal.m.f((h1.s1) sVar2.j(c3Var), "<this>");
            iu.k.e(aVar, rVarE2, false, j11, ns.o.L(xVar, new g2.x(d0.n.t(sVar2) ? ju.a.S0 : ju.a.P)), e.f23765l, sVar2, ((i14 >> 3) & 14) | 196656, 4);
            sVar2.p(true);
            rVar2 = oVar;
        } else {
            sVar2.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(sVar, aVar, rVar2, i11, 6);
        }
    }
}
