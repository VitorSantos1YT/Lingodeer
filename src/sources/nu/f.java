package nu;

import a0.b2;
import com.lingodeer.course.smarttips.data.model.Element;
import com.lingodeer.course.smarttips.data.model.Hint;
import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import g2.k0;
import g2.p0;
import g2.x;
import j3.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.g1;
import l1.k1;
import ns.o;
import qy.b0;
import x1.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44069a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f44070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f44071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f44072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f44073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f44074f;

    public /* synthetic */ f(Element element, g1 g1Var, long j11, HashMap map, b1 b1Var) {
        this.f44072d = element;
        this.f44073e = g1Var;
        this.f44070b = j11;
        this.f44074f = map;
        this.f44071c = b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x068d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0694  */
    /* JADX WARN: Code duplicated, block: B:187:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x01aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.util.List] */
    @Override // fz.c
    public final Object invoke(Object obj) throws Throwable {
        k1 k1Var;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        float f5;
        float f11;
        long j11;
        p pVar;
        long j12;
        long j13;
        float fFloatValue;
        xq.c cVarJ0;
        long jH;
        ArrayList arrayList3;
        xq.c cVarJ1;
        long j14;
        long j15;
        long j16;
        i2.d dVar;
        long j17;
        switch (this.f44069a) {
            case 0:
                pu.b bVar = (pu.b) this.f44072d;
                ou.c cVar = (ou.c) this.f44073e;
                ou.e eVar = (ou.e) this.f44074f;
                long j18 = eVar.f46083e;
                i2.d Canvas = (i2.d) obj;
                m.f(Canvas, "$this$Canvas");
                bVar.d();
                k1 k1Var2 = bVar.f47183z;
                k1 k1Var3 = bVar.f47182y;
                k1 k1Var4 = bVar.f47172o;
                p pVar2 = bVar.I;
                g2.k kVar = bVar.f47163e;
                g2.k kVar2 = bVar.f47171n;
                g2.k kVar3 = bVar.f47174q;
                g2.k kVar4 = bVar.f47167i;
                g2.k kVar5 = bVar.f47170l;
                i2.d dVar2 = Canvas;
                ((Number) this.f44071c.getValue()).intValue();
                p pVar3 = pVar2;
                int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (dVar2.d() >> 32));
                g2.k kVar6 = kVar;
                int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) (dVar2.d() & 4294967295L));
                int i12 = cVar.f46075h;
                g2.k kVar7 = kVar3;
                Object obj2 = cVar.f46072e;
                ArrayList arrayList4 = cVar.f46074g;
                ArrayList arrayList5 = cVar.f46073f;
                if (i12 != iIntBitsToFloat || cVar.f46076i != iIntBitsToFloat2) {
                    cVar.f46075h = iIntBitsToFloat;
                    cVar.f46076i = iIntBitsToFloat2;
                    try {
                        cVar.d();
                        cVar.c();
                    } catch (Exception unused) {
                        m.d(arrayList5, "null cannot be cast to non-null type kotlin.collections.MutableList<androidx.compose.ui.graphics.Path>");
                        c0.b(arrayList5).clear();
                        m.d(arrayList4, "null cannot be cast to non-null type kotlin.collections.MutableList<androidx.compose.ui.graphics.Path>");
                        c0.b(arrayList4).clear();
                    }
                }
                boolean z11 = eVar.f46085g;
                long j19 = eVar.f46080b;
                g2.k kVar8 = kVar5;
                long j21 = eVar.f46079a;
                long j22 = eVar.f46082d;
                ArrayList arrayList6 = arrayList4;
                if (z11) {
                    int size = arrayList5.size();
                    int i13 = 0;
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList5.get(i14);
                        int i15 = i14 + 1;
                        int i16 = i13 + 1;
                        if (i13 < 0) {
                            o.V();
                            throw null;
                        }
                        p0 p0Var = (p0) obj3;
                        int i17 = j.f44081a[bVar.c().ordinal()];
                        int i18 = size;
                        if (i17 != 1) {
                            if (i17 != 2 && i17 != 3) {
                                if (i17 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (i13 >= bVar.e()) {
                                    j15 = j22;
                                } else {
                                    long j23 = j19;
                                    dVar = dVar2;
                                    j16 = j23;
                                }
                            } else if (i13 >= bVar.e()) {
                                if (i13 == bVar.b()) {
                                    bVar.c();
                                    ou.f fVar = ou.f.Writer;
                                }
                                j15 = j22;
                            } else {
                                long j24 = j19;
                                dVar = dVar2;
                                j16 = j24;
                            }
                            long j25 = j16;
                            kVar7 = kVar7;
                            dVar2 = dVar;
                            j19 = j25;
                            obj2 = obj2;
                            i14 = i15;
                            i13 = i16;
                            kVar8 = kVar8;
                            kVar2 = kVar2;
                            kVar6 = kVar6;
                            arrayList5 = arrayList5;
                            pVar3 = pVar3;
                            size = i18;
                        } else {
                            j15 = j21;
                        }
                        long j26 = j19;
                        dVar = dVar2;
                        j16 = j26;
                        i2.d.o0(dVar, p0Var, j15, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
                        long j27 = j16;
                        kVar7 = kVar7;
                        dVar2 = dVar;
                        j19 = j27;
                        obj2 = obj2;
                        i14 = i15;
                        i13 = i16;
                        kVar8 = kVar8;
                        kVar2 = kVar2;
                        kVar6 = kVar6;
                        arrayList5 = arrayList5;
                        pVar3 = pVar3;
                        size = i18;
                    }
                }
                g2.k kVar9 = kVar8;
                g2.k kVar10 = kVar2;
                ArrayList arrayList7 = arrayList5;
                p pVar4 = pVar3;
                g2.k kVar11 = kVar6;
                ?? r19 = obj2;
                long j28 = j19;
                i2.d dVar3 = dVar2;
                g2.k kVar12 = kVar7;
                int i19 = -1;
                if (!eVar.f46086h) {
                    k1Var = k1Var3;
                    arrayList = arrayList6;
                    i11 = i19;
                } else if (bVar.c() == ou.f.Normal) {
                    int size2 = arrayList6.size();
                    int i21 = 0;
                    while (i21 < size2) {
                        ArrayList arrayList8 = arrayList6;
                        p0 p0Var2 = (p0) arrayList8.get(i21);
                        i2.d.o0(dVar3, p0Var2, eVar.f46083e, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(5.0f, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                        ub.a.R(dVar3, p0Var2, j18);
                        i19 = i19;
                        i21++;
                        size2 = size2;
                        k1Var3 = k1Var3;
                        arrayList6 = arrayList8;
                    }
                    k1Var = k1Var3;
                    arrayList = arrayList6;
                    i11 = i19;
                } else {
                    k1Var = k1Var3;
                    arrayList = arrayList6;
                    i11 = -1;
                    ou.f fVarC = bVar.c();
                    ou.f fVar2 = ou.f.Writer;
                    if (fVarC == fVar2 && bVar.b() < r19.size()) {
                        p0 p0Var3 = (p0) arrayList.get(bVar.b());
                        long j29 = (((Boolean) k1Var4.getValue()).booleanValue() && bVar.c() == fVar2) ? j28 : j18;
                        i2.d.o0(dVar3, p0Var3, j29, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(5.0f, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                        ub.a.R(dVar3, p0Var3, j29);
                    } else if (bVar.c() == ou.f.Anim && bVar.a() != -1) {
                        p0 p0Var4 = (p0) arrayList.get(bVar.a());
                        i2.d.o0(dVar3, p0Var4, eVar.f46083e, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(5.0f, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                        ub.a.R(dVar3, p0Var4, j18);
                    }
                }
                int i22 = j.f44081a[bVar.c().ordinal()];
                if (i22 == 2) {
                    arrayList2 = arrayList7;
                    if (!((Boolean) bVar.f47175r.getValue()).booleanValue() || ((Boolean) k1Var4.getValue()).booleanValue() || bVar.b() >= r19.size()) {
                        f5 = 1024.0f;
                        f11 = 0.0f;
                    } else {
                        g2.m mVarI = f0.i();
                        mVarI.c((p0) arrayList.get(bVar.b()));
                        kVar12.j();
                        mVarI.b(CropImageView.DEFAULT_ASPECT_RATIO, ((Number) bVar.f47173p.d()).floatValue() * mVarI.f28582a.getLength(), kVar12);
                        p0 p0Var5 = (p0) arrayList2.get(bVar.b());
                        xq.c cVarJ2 = dVar3.j0();
                        long jH2 = cVarJ2.H();
                        cVarJ2.x().e();
                        try {
                            ((b2) cVarJ2.f56174b).c(p0Var5);
                            long j30 = eVar.f46080b;
                            f5 = 1024.0f;
                            i2.h hVar = new i2.h((Float.intBitsToFloat((int) (dVar3.d() >> 32)) / 1024.0f) * 150.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1, 1, null, 18);
                            f11 = 0.0f;
                            dVar3 = dVar3;
                            j11 = jH2;
                            try {
                                i2.d.o0(dVar3, kVar12, j30, CropImageView.DEFAULT_ASPECT_RATIO, hVar, 52);
                                com.google.android.material.datepicker.d.C(cVarJ2, j11);
                            } catch (Throwable th2) {
                                th = th2;
                                com.google.android.material.datepicker.d.C(cVarJ2, j11);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j11 = jH2;
                        }
                    }
                    if (((Boolean) k1Var4.getValue()).booleanValue() && bVar.b() < r19.size()) {
                        g2.m mVarI2 = f0.i();
                        mVarI2.c((p0) arrayList.get(bVar.b()));
                        kVar10.j();
                        mVarI2.b(f11, ((Number) bVar.m.d()).floatValue() * mVarI2.f28582a.getLength(), kVar10);
                        p0 p0Var6 = (p0) arrayList2.get(bVar.b());
                        xq.c cVarJ3 = dVar3.j0();
                        long jH3 = cVarJ3.H();
                        cVarJ3.x().e();
                        try {
                            ((b2) cVarJ3.f56174b).c(p0Var6);
                            i2.d.o0(dVar3, kVar10, eVar.f46080b, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h((Float.intBitsToFloat((int) (dVar3.d() >> 32)) / f5) * 150.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1, 1, null, 18), 52);
                            com.google.android.material.datepicker.d.C(cVarJ3, jH3);
                        } catch (Throwable th4) {
                            com.google.android.material.datepicker.d.C(cVarJ3, jH3);
                            throw th4;
                        }
                    }
                    if (((p0) k1Var.getValue()) != null) {
                        p0 p0Var7 = (p0) k1Var.getValue();
                        m.c(p0Var7);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (((f2.b) k1Var2.getValue()).f26570a >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((f2.b) k1Var2.getValue()).f26570a & 4294967295L));
                        g2.k kVarA = g2.o.a();
                        p0.b(kVarA, p0Var7);
                        float[] fArrA = k0.a();
                        k0.f(fArrA, fIntBitsToFloat, fIntBitsToFloat2);
                        kVarA.l(fArrA);
                        i2.d.o0(dVar3, kVarA, eVar.f46079a, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
                    }
                    if (!kVar11.f28575a.isEmpty()) {
                        i2.d.o0(dVar3, kVar11, eVar.f46079a, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(eVar.f46084f, CropImageView.DEFAULT_ASPECT_RATIO, 1, 1, null, 18), 52);
                    }
                } else if (i22 == 3) {
                    arrayList3 = arrayList7;
                    if (bVar.a() != i11) {
                        g2.m mVarI3 = f0.i();
                        mVarI3.c((p0) arrayList.get(bVar.a()));
                        kVar4.j();
                        mVarI3.b(CropImageView.DEFAULT_ASPECT_RATIO, ((Number) bVar.f47166h.d()).floatValue() * mVarI3.f28582a.getLength(), kVar4);
                        p0 p0Var8 = (p0) arrayList3.get(bVar.a());
                        cVarJ1 = dVar3.j0();
                        long jH4 = cVarJ1.H();
                        cVarJ1.x().e();
                        try {
                            ((b2) cVarJ1.f56174b).c(p0Var8);
                            try {
                                long j31 = eVar.f46080b;
                                j14 = jH4;
                                try {
                                    i2.d.o0(dVar3, kVar4, j31, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h((Float.intBitsToFloat((int) (dVar3.d() >> 32)) / 1024.0f) * 150.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1, 1, null, 18), 52);
                                    com.google.android.material.datepicker.d.C(cVarJ1, j14);
                                } catch (Throwable th5) {
                                    th = th5;
                                    com.google.android.material.datepicker.d.C(cVarJ1, j14);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                j14 = jH4;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j14 = jH4;
                        }
                    }
                    pVar4 = pVar4;
                    arrayList2 = arrayList3;
                } else if (i22 != 4) {
                    pVar4 = pVar4;
                    arrayList2 = arrayList7;
                } else {
                    if (bVar.e() < r19.size()) {
                        g2.m mVarI4 = f0.i();
                        mVarI4.c((p0) arrayList.get(bVar.e()));
                        kVar9.j();
                        mVarI4.b(CropImageView.DEFAULT_ASPECT_RATIO, ((Number) bVar.f47169k.d()).floatValue() * mVarI4.f28582a.getLength(), kVar9);
                        arrayList3 = arrayList7;
                        p0 p0Var9 = (p0) arrayList3.get(bVar.e());
                        cVarJ1 = dVar3.j0();
                        long jH5 = cVarJ1.H();
                        cVarJ1.x().e();
                        try {
                            ((b2) cVarJ1.f56174b).c(p0Var9);
                            try {
                                long j32 = eVar.f46079a;
                                j14 = jH5;
                                try {
                                    i2.d.o0(dVar3, kVar9, j32, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h((Float.intBitsToFloat((int) (dVar3.d() >> 32)) / 1024.0f) * 150.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1, 1, null, 18), 52);
                                    com.google.android.material.datepicker.d.C(cVarJ1, j14);
                                } catch (Throwable th8) {
                                    th = th8;
                                    com.google.android.material.datepicker.d.C(cVarJ1, j14);
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                j14 = jH5;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            j14 = jH5;
                        }
                    } else {
                        arrayList3 = arrayList7;
                    }
                    pVar4 = pVar4;
                    arrayList2 = arrayList3;
                }
                int iE = bVar.e();
                int i23 = 0;
                while (i23 < iE) {
                    if (i23 != bVar.f47179v.l()) {
                        if (m.a((Boolean) ry.m.t0(i23, bVar.F), Boolean.FALSE)) {
                            j13 = this.f44070b;
                        } else {
                            if (bVar.c() == ou.f.Anim) {
                                j12 = j28;
                            } else {
                                x xVar = (x) ry.m.t0(i23, bVar.f47178u);
                                if (xVar != null) {
                                    j13 = xVar.f28624a;
                                } else {
                                    j12 = j21;
                                }
                            }
                            if (((Boolean) bVar.E.getValue()).booleanValue() || i23 >= pVar4.size()) {
                                pVar = pVar4;
                                fFloatValue = 1.0f;
                            } else {
                                pVar = pVar4;
                                fFloatValue = ((Number) ((b0.d) pVar.get(i23)).d()).floatValue();
                            }
                            if (fFloatValue == 1.0f) {
                                i2.d.o0(dVar3, (p0) arrayList2.get(i23), j12, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
                            } else {
                                long jR0 = dVar3.r0();
                                cVarJ0 = dVar3.j0();
                                jH = cVarJ0.H();
                                cVarJ0.x().e();
                                try {
                                    ((b2) cVarJ0.f56174b).n(jR0, fFloatValue, fFloatValue);
                                    i2.d.o0(dVar3, (p0) arrayList2.get(i23), j12, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
                                    com.google.android.material.datepicker.d.C(cVarJ0, jH);
                                } catch (Throwable th11) {
                                    com.google.android.material.datepicker.d.C(cVarJ0, jH);
                                    throw th11;
                                }
                            }
                        }
                        j12 = j13;
                        if (((Boolean) bVar.E.getValue()).booleanValue()) {
                            pVar = pVar4;
                            fFloatValue = 1.0f;
                        } else {
                            pVar = pVar4;
                            fFloatValue = 1.0f;
                        }
                        if (fFloatValue == 1.0f) {
                            i2.d.o0(dVar3, (p0) arrayList2.get(i23), j12, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
                        } else {
                            long jR1 = dVar3.r0();
                            cVarJ0 = dVar3.j0();
                            jH = cVarJ0.H();
                            cVarJ0.x().e();
                            ((b2) cVarJ0.f56174b).n(jR1, fFloatValue, fFloatValue);
                            i2.d.o0(dVar3, (p0) arrayList2.get(i23), j12, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
                            com.google.android.material.datepicker.d.C(cVarJ0, jH);
                        }
                    } else {
                        pVar = pVar4;
                    }
                    i23++;
                    pVar4 = pVar;
                }
                break;
            default:
                Element element = (Element) this.f44072d;
                g1 g1Var = (g1) this.f44073e;
                HashMap map = (HashMap) this.f44074f;
                u0 textLayoutResult = (u0) obj;
                m.f(textLayoutResult, "textLayoutResult");
                j3.x xVar2 = textLayoutResult.f35798b;
                float f12 = xVar2.f(0);
                float f13 = 2;
                g1Var.m(((xVar2.b(0) - f12) / f13) + f12);
                ArrayList arrayList9 = new ArrayList();
                Iterator it = element.getHints().iterator();
                while (it.hasNext()) {
                    Hint hint = (Hint) it.next();
                    int from = hint.getFrom();
                    int to2 = hint.getTo();
                    float f14 = -1.0f;
                    float f15 = -1.0f;
                    float f16 = -1.0f;
                    while (true) {
                        j17 = this.f44070b;
                        if (from < to2) {
                            f2.c cVarB = textLayoutResult.b(from);
                            float f17 = cVarB.f26574c;
                            Iterator it2 = it;
                            float f18 = cVarB.f26572a;
                            float f19 = cVarB.f26575d;
                            if (f19 != f15 && f15 != -1.0f) {
                                arrayList9.add(new us.a(f14, f15, f16, j17));
                                f14 = f18;
                                f15 = f19;
                            } else if (f14 == -1.0f) {
                                f14 = f18;
                                f15 = f19;
                            }
                            from++;
                            f16 = f17;
                            it = it2;
                        }
                    }
                    arrayList9.add(new us.a(f14, f15, f16, j17));
                    map.put(hint, new v3.j((((long) ((int) (((f16 - f14) / f13) + f14))) << 32) | (((long) ((int) f15)) & 4294967295L)));
                    it = it;
                }
                List listA1 = ry.m.a1(arrayList9);
                b1 b1Var = this.f44071c;
                b1Var.setValue(listA1);
                Objects.toString((List) b1Var.getValue());
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ f(pu.b bVar, ou.c cVar, ou.e eVar, long j11, b1 b1Var) {
        this.f44072d = bVar;
        this.f44073e = cVar;
        this.f44074f = eVar;
        this.f44070b = j11;
        this.f44071c = b1Var;
    }
}
