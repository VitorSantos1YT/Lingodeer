package bt;

import android.net.Uri;
import com.lingo.lingoskill.object.ARChar;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.RecordingStatus;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import l1.b1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c0 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5244a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5249f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5250t;

    public /* synthetic */ c0(dn.d dVar, gi.d dVar2, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6, l1.b1 b1Var7, l1.b1 b1Var8) {
        this.f5250t = dVar;
        this.H = dVar2;
        this.f5245b = b1Var;
        this.f5246c = b1Var2;
        this.f5247d = b1Var3;
        this.f5248e = b1Var4;
        this.f5249f = b1Var5;
        this.K = b1Var6;
        this.L = b1Var7;
        this.M = b1Var8;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x022d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0286  */
    /* JADX WARN: Code duplicated, block: B:58:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x0315  */
    /* JADX WARN: Code duplicated, block: B:63:0x0319  */
    /* JADX WARN: Code duplicated, block: B:68:0x0334  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.b1 b1Var;
        y2.h hVar;
        l1.s sVar;
        int iHashCode;
        boolean z11;
        boolean zH;
        Object objQ;
        boolean zH2;
        Object objQ2;
        l1.b1 b1Var2;
        Object lVar;
        gi.d dVar;
        l1.g gVar;
        l1.b1 b1Var3;
        l1.b1 b1Var4;
        final l1.b1 b1Var5;
        final l1.b1 b1Var6;
        final gi.d dVar2;
        final l1.b1 b1Var7;
        final l1.b1 b1Var8;
        final l1.b1 b1Var9;
        switch (this.f5244a) {
            case 0:
                l1.b1 b1Var10 = (l1.b1) this.f5245b;
                l1.b1 b1Var11 = (l1.b1) this.f5246c;
                l1.b1 b1Var12 = (l1.b1) this.f5247d;
                l1.b1 b1Var13 = (l1.b1) this.f5248e;
                CourseSentence courseSentence = (CourseSentence) this.f5250t;
                fz.a aVar = (fz.a) this.H;
                jt.g gVar2 = (jt.g) this.K;
                ys.d0 d0Var = (ys.d0) this.L;
                l1.a1 a1Var = (l1.a1) this.M;
                l1.b1 b1Var14 = (l1.b1) this.f5249f;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarE = j0.e2.e(oVar, 1.0f);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar2 = y2.j.f56917f;
                    l1.t.J(hVar2, q0VarD, sVar2);
                    y2.h hVar3 = y2.j.f56916e;
                    l1.t.J(hVar3, q1VarL, sVar2);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar2.S) {
                        b1Var = b1Var12;
                    } else {
                        b1Var = b1Var12;
                        if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        }
                        hVar = y2.j.f56915d;
                        l1.t.J(hVar, rVarC, sVar2);
                        if (((Boolean) sVar2.j(ju.f.f37373g)).booleanValue()) {
                            sVar2.d0(-680529099);
                            ht.q qVar = (ht.q) b1Var10.getValue();
                            ht.l lVar2 = (ht.l) b1Var11.getValue();
                            RecordingStatus recordingStatus = (RecordingStatus) b1Var.getValue();
                            z1.r rVarE2 = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                            List list = (List) b1Var13.getValue();
                            String translation = courseSentence.getTranslation();
                            int iL = ((l1.h1) a1Var).l();
                            Uri EMPTY = Uri.EMPTY;
                            kotlin.jvm.internal.m.e(EMPTY, "EMPTY");
                            zH = sVar2.h(gVar2) | sVar2.h(d0Var) | sVar2.h(courseSentence);
                            objQ = sVar2.Q();
                            l1.g gVar3 = l1.m.f39353a;
                            if (zH || objQ == gVar3) {
                                r rVar = new r(courseSentence, gVar2, d0Var, b1Var14, 0);
                                sVar2.o0(rVar);
                                objQ = rVar;
                            }
                            fz.a aVar2 = (fz.a) objQ;
                            zH2 = sVar2.h(gVar2) | sVar2.h(d0Var);
                            objQ2 = sVar2.Q();
                            if (zH2 || objQ2 == gVar3) {
                                objQ2 = new au.d1(16, gVar2, d0Var);
                                sVar2.o0(objQ2);
                            }
                            z11 = true;
                            dt.e.p(qVar, lVar2, recordingStatus, list, translation, true, rVarE2, false, false, false, false, null, iL, 0, EMPTY, 0L, null, null, aVar, aVar2, (fz.c) objQ2, c.f5241a, sVar2, 807075840, 6, 48, 240000);
                            sVar = sVar2;
                            sVar.p(false);
                        } else {
                            sVar = sVar2;
                            sVar.d0(-679112802);
                            z1.r rVarA = j0.r.f35391a.a(oVar, z1.c.f58464b);
                            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                            iHashCode = Long.hashCode(sVar.T);
                            l1.q1 q1VarL2 = sVar.l();
                            z1.r rVarC2 = z1.a.c(sVar, rVarA);
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(hVar2, uVarA, sVar);
                            l1.t.J(hVar3, q1VarL2, sVar);
                            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                            }
                            l1.t.J(hVar, rVarC2, sVar);
                            float f5 = 26;
                            j0.c.g(sVar, j0.e2.g(oVar, f5));
                            dt.d4.a((List) b1Var13.getValue(), null, null, false, false, null, null, ((Boolean) b1Var14.getValue()).booleanValue(), false, ((l1.h1) a1Var).l(), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar, 3072, 0, 0, 4193654);
                            j0.c.g(sVar, j0.e2.g(oVar, f5));
                            dt.a0.r(courseSentence.getTranslation(), null, 0, 0, sVar, 0, 14);
                            z11 = true;
                            sVar.p(true);
                            sVar.p(false);
                        }
                        sVar.p(z11);
                    }
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                    hVar = y2.j.f56915d;
                    l1.t.J(hVar, rVarC, sVar2);
                    if (((Boolean) sVar2.j(ju.f.f37373g)).booleanValue()) {
                        sVar2.d0(-680529099);
                        ht.q qVar2 = (ht.q) b1Var10.getValue();
                        ht.l lVar3 = (ht.l) b1Var11.getValue();
                        RecordingStatus recordingStatus2 = (RecordingStatus) b1Var.getValue();
                        z1.r rVarE3 = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                        List list2 = (List) b1Var13.getValue();
                        String translation2 = courseSentence.getTranslation();
                        int iL2 = ((l1.h1) a1Var).l();
                        Uri EMPTY2 = Uri.EMPTY;
                        kotlin.jvm.internal.m.e(EMPTY2, "EMPTY");
                        zH = sVar2.h(gVar2) | sVar2.h(d0Var) | sVar2.h(courseSentence);
                        objQ = sVar2.Q();
                        l1.g gVar4 = l1.m.f39353a;
                        if (zH) {
                            r rVar2 = new r(courseSentence, gVar2, d0Var, b1Var14, 0);
                            sVar2.o0(rVar2);
                            objQ = rVar2;
                        } else {
                            r rVar3 = new r(courseSentence, gVar2, d0Var, b1Var14, 0);
                            sVar2.o0(rVar3);
                            objQ = rVar3;
                        }
                        fz.a aVar3 = (fz.a) objQ;
                        zH2 = sVar2.h(gVar2) | sVar2.h(d0Var);
                        objQ2 = sVar2.Q();
                        if (zH2) {
                            objQ2 = new au.d1(16, gVar2, d0Var);
                            sVar2.o0(objQ2);
                        } else {
                            objQ2 = new au.d1(16, gVar2, d0Var);
                            sVar2.o0(objQ2);
                        }
                        z11 = true;
                        dt.e.p(qVar2, lVar3, recordingStatus2, list2, translation2, true, rVarE3, false, false, false, false, null, iL2, 0, EMPTY2, 0L, null, null, aVar, aVar3, (fz.c) objQ2, c.f5241a, sVar2, 807075840, 6, 48, 240000);
                        sVar = sVar2;
                        sVar.p(false);
                    } else {
                        sVar = sVar2;
                        sVar.d0(-679112802);
                        z1.r rVarA2 = j0.r.f35391a.a(oVar, z1.c.f58464b);
                        j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                        iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL3 = sVar.l();
                        z1.r rVarC3 = z1.a.c(sVar, rVarA2);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar2, uVarA2, sVar);
                        l1.t.J(hVar3, q1VarL3, sVar);
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                        }
                        l1.t.J(hVar, rVarC3, sVar);
                        float f11 = 26;
                        j0.c.g(sVar, j0.e2.g(oVar, f11));
                        dt.d4.a((List) b1Var13.getValue(), null, null, false, false, null, null, ((Boolean) b1Var14.getValue()).booleanValue(), false, ((l1.h1) a1Var).l(), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar, 3072, 0, 0, 4193654);
                        j0.c.g(sVar, j0.e2.g(oVar, f11));
                        dt.a0.r(courseSentence.getTranslation(), null, 0, 0, sVar, 0, 14);
                        z11 = true;
                        sVar.p(true);
                        sVar.p(false);
                    }
                    sVar.p(z11);
                } else {
                    sVar2.W();
                }
                break;
            case 1:
                final dn.d dVar3 = (dn.d) this.f5250t;
                gi.d dVar4 = (gi.d) this.H;
                final l1.b1 b1Var15 = (l1.b1) this.f5245b;
                final l1.b1 b1Var16 = (l1.b1) this.f5246c;
                l1.b1 b1Var17 = (l1.b1) this.f5247d;
                l1.b1 b1Var18 = (l1.b1) this.f5248e;
                l1.b1 b1Var19 = (l1.b1) this.f5249f;
                l1.b1 b1Var20 = (l1.b1) this.K;
                l1.b1 b1Var21 = (l1.b1) this.L;
                final l1.b1 b1Var22 = (l1.b1) this.M;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Integer num = (Integer) b1Var15.getValue();
                    Integer num2 = (Integer) b1Var16.getValue();
                    Integer num3 = (Integer) b1Var17.getValue();
                    Integer num4 = (Integer) b1Var18.getValue();
                    z1.r rVarA3 = j0.c.A(j0.e2.d(z1.o.f58481a, 1.0f), 8);
                    boolean zH3 = sVar3.h(dVar4);
                    Object objQ3 = sVar3.Q();
                    l1.g gVar5 = l1.m.f39353a;
                    if (zH3 || objQ3 == gVar5) {
                        b1Var2 = b1Var20;
                        dVar = dVar4;
                        gVar = gVar5;
                        b1Var3 = b1Var21;
                        lVar = new ei.l(dVar, b1Var15, b1Var16, b1Var19, b1Var2, b1Var3, b1Var22, 0);
                        b1Var15 = b1Var15;
                        b1Var4 = b1Var19;
                        b1Var16 = b1Var16;
                        sVar3.o0(lVar);
                    } else {
                        b1Var2 = b1Var20;
                        lVar = objQ3;
                        b1Var3 = b1Var21;
                        b1Var4 = b1Var19;
                        dVar = dVar4;
                        gVar = gVar5;
                    }
                    fz.f fVar = (fz.f) lVar;
                    boolean zH4 = sVar3.h(dVar) | sVar3.h(dVar3);
                    Object objQ4 = sVar3.Q();
                    if (zH4 || objQ4 == gVar) {
                        l1.b1 b1Var23 = b1Var3;
                        b1Var5 = b1Var18;
                        final int i11 = 0;
                        l1.b1 b1Var24 = b1Var2;
                        b1Var6 = b1Var17;
                        dVar2 = dVar;
                        b1Var7 = b1Var4;
                        b1Var8 = b1Var23;
                        b1Var9 = b1Var24;
                        fz.c cVar = new fz.c() { // from class: ei.m
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                Integer num5 = (Integer) obj3;
                                switch (i11) {
                                    case 0:
                                        int iIntValue3 = num5.intValue();
                                        b1 b1Var25 = b1Var9;
                                        Integer num6 = (Integer) b1Var25.getValue();
                                        gi.d dVar5 = dVar2;
                                        b1 b1Var26 = b1Var7;
                                        b1 b1Var27 = b1Var8;
                                        b1 b1Var28 = b1Var15;
                                        b1 b1Var29 = b1Var16;
                                        b1 b1Var30 = b1Var6;
                                        b1 b1Var31 = b1Var5;
                                        if (num6 == null || num6.intValue() != iIntValue3 || ((List) b1Var26.getValue()) == null) {
                                            b1Var28.setValue(num5);
                                            b1Var29.setValue(1);
                                            b1Var30.setValue(null);
                                            b1Var31.setValue(null);
                                            b1Var30.setValue(num5);
                                            b1Var31.setValue(1);
                                            ArrayList arrayList = new ArrayList();
                                            dn.d dVar6 = dVar3;
                                            int iA = dVar6.a();
                                            for (int i12 = 1; i12 < iA; i12++) {
                                                arrayList.add((ARChar) dVar6.d(iIntValue3, i12));
                                            }
                                            if (!arrayList.isEmpty()) {
                                                b1Var26.setValue(arrayList);
                                                dVar5.b(iIntValue3, 1, (ARChar) ry.m.q0(arrayList));
                                                b1Var25.setValue(num5);
                                                b1Var27.setValue(null);
                                                b1Var22.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var26.setValue(null);
                                            b1Var25.setValue(null);
                                            b1Var27.setValue(null);
                                            b1Var28.setValue(null);
                                            b1Var29.setValue(null);
                                            b1Var30.setValue(null);
                                            b1Var31.setValue(null);
                                            dVar5.a();
                                        }
                                        break;
                                    default:
                                        int iIntValue4 = num5.intValue();
                                        b1 b1Var32 = b1Var9;
                                        Integer num7 = (Integer) b1Var32.getValue();
                                        gi.d dVar7 = dVar2;
                                        b1 b1Var33 = b1Var7;
                                        b1 b1Var34 = b1Var8;
                                        b1 b1Var35 = b1Var15;
                                        b1 b1Var36 = b1Var16;
                                        b1 b1Var37 = b1Var6;
                                        b1 b1Var38 = b1Var5;
                                        if (num7 == null || num7.intValue() != iIntValue4 || ((List) b1Var33.getValue()) == null) {
                                            b1Var36.setValue(num5);
                                            b1Var35.setValue(1);
                                            b1Var37.setValue(null);
                                            b1Var38.setValue(null);
                                            b1Var37.setValue(1);
                                            b1Var38.setValue(num5);
                                            ArrayList arrayList2 = new ArrayList();
                                            dn.d dVar8 = dVar3;
                                            int iF = dVar8.f();
                                            for (int i13 = 1; i13 < iF; i13++) {
                                                arrayList2.add((ARChar) dVar8.d(i13, iIntValue4));
                                            }
                                            if (!arrayList2.isEmpty()) {
                                                b1Var33.setValue(arrayList2);
                                                dVar7.b(1, iIntValue4, (ARChar) ry.m.q0(arrayList2));
                                                b1Var32.setValue(num5);
                                                b1Var34.setValue(null);
                                                b1Var22.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var33.setValue(null);
                                            b1Var34.setValue(null);
                                            b1Var32.setValue(null);
                                            b1Var35.setValue(null);
                                            b1Var36.setValue(null);
                                            b1Var37.setValue(null);
                                            b1Var38.setValue(null);
                                            dVar7.a();
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar3.o0(cVar);
                        objQ4 = cVar;
                    } else {
                        b1Var9 = b1Var2;
                        b1Var6 = b1Var17;
                        dVar2 = dVar;
                        b1Var7 = b1Var4;
                        b1Var8 = b1Var3;
                        b1Var5 = b1Var18;
                    }
                    fz.c cVar2 = (fz.c) objQ4;
                    boolean zH5 = sVar3.h(dVar2) | sVar3.h(dVar3);
                    Object objQ5 = sVar3.Q();
                    if (zH5 || objQ5 == gVar) {
                        final int i12 = 1;
                        final l1.b1 b1Var25 = b1Var8;
                        final l1.b1 b1Var26 = b1Var9;
                        fz.c cVar3 = new fz.c() { // from class: ei.m
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                Integer num5 = (Integer) obj3;
                                switch (i12) {
                                    case 0:
                                        int iIntValue3 = num5.intValue();
                                        b1 b1Var27 = b1Var25;
                                        Integer num6 = (Integer) b1Var27.getValue();
                                        gi.d dVar5 = dVar2;
                                        b1 b1Var28 = b1Var7;
                                        b1 b1Var29 = b1Var26;
                                        b1 b1Var210 = b1Var15;
                                        b1 b1Var211 = b1Var16;
                                        b1 b1Var30 = b1Var6;
                                        b1 b1Var31 = b1Var5;
                                        if (num6 == null || num6.intValue() != iIntValue3 || ((List) b1Var28.getValue()) == null) {
                                            b1Var210.setValue(num5);
                                            b1Var211.setValue(1);
                                            b1Var30.setValue(null);
                                            b1Var31.setValue(null);
                                            b1Var30.setValue(num5);
                                            b1Var31.setValue(1);
                                            ArrayList arrayList = new ArrayList();
                                            dn.d dVar6 = dVar3;
                                            int iA = dVar6.a();
                                            for (int i13 = 1; i13 < iA; i13++) {
                                                arrayList.add((ARChar) dVar6.d(iIntValue3, i13));
                                            }
                                            if (!arrayList.isEmpty()) {
                                                b1Var28.setValue(arrayList);
                                                dVar5.b(iIntValue3, 1, (ARChar) ry.m.q0(arrayList));
                                                b1Var27.setValue(num5);
                                                b1Var29.setValue(null);
                                                b1Var22.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var28.setValue(null);
                                            b1Var27.setValue(null);
                                            b1Var29.setValue(null);
                                            b1Var210.setValue(null);
                                            b1Var211.setValue(null);
                                            b1Var30.setValue(null);
                                            b1Var31.setValue(null);
                                            dVar5.a();
                                        }
                                        break;
                                    default:
                                        int iIntValue4 = num5.intValue();
                                        b1 b1Var32 = b1Var25;
                                        Integer num7 = (Integer) b1Var32.getValue();
                                        gi.d dVar7 = dVar2;
                                        b1 b1Var33 = b1Var7;
                                        b1 b1Var34 = b1Var26;
                                        b1 b1Var35 = b1Var15;
                                        b1 b1Var36 = b1Var16;
                                        b1 b1Var37 = b1Var6;
                                        b1 b1Var38 = b1Var5;
                                        if (num7 == null || num7.intValue() != iIntValue4 || ((List) b1Var33.getValue()) == null) {
                                            b1Var36.setValue(num5);
                                            b1Var35.setValue(1);
                                            b1Var37.setValue(null);
                                            b1Var38.setValue(null);
                                            b1Var37.setValue(1);
                                            b1Var38.setValue(num5);
                                            ArrayList arrayList2 = new ArrayList();
                                            dn.d dVar8 = dVar3;
                                            int iF = dVar8.f();
                                            for (int i14 = 1; i14 < iF; i14++) {
                                                arrayList2.add((ARChar) dVar8.d(i14, iIntValue4));
                                            }
                                            if (!arrayList2.isEmpty()) {
                                                b1Var33.setValue(arrayList2);
                                                dVar7.b(1, iIntValue4, (ARChar) ry.m.q0(arrayList2));
                                                b1Var32.setValue(num5);
                                                b1Var34.setValue(null);
                                                b1Var22.setValue(Boolean.FALSE);
                                            }
                                        } else {
                                            b1Var33.setValue(null);
                                            b1Var34.setValue(null);
                                            b1Var32.setValue(null);
                                            b1Var35.setValue(null);
                                            b1Var36.setValue(null);
                                            b1Var37.setValue(null);
                                            b1Var38.setValue(null);
                                            dVar7.a();
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar3.o0(cVar3);
                        objQ5 = cVar3;
                    }
                    ei.z.b(48, dVar3, null, cVar2, (fz.c) objQ5, fVar, num, num2, num3, num4, sVar3, rVarA3);
                } else {
                    sVar3.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                xu.c.b((fz.a) this.H, (fz.a) this.f5245b, (fz.a) this.f5246c, (fz.a) this.f5247d, (fz.a) this.f5248e, (fz.a) this.f5249f, (fz.a) this.f5250t, (fz.a) this.K, (fz.a) this.L, (fz.a) this.M, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c0(fz.a aVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, fz.a aVar5, fz.a aVar6, fz.a aVar7, fz.a aVar8, fz.a aVar9, fz.a aVar10, int i11) {
        this.H = aVar;
        this.f5245b = aVar2;
        this.f5246c = aVar3;
        this.f5247d = aVar4;
        this.f5248e = aVar5;
        this.f5249f = aVar6;
        this.f5250t = aVar7;
        this.K = aVar8;
        this.L = aVar9;
        this.M = aVar10;
    }

    public /* synthetic */ c0(l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, CourseSentence courseSentence, fz.a aVar, jt.g gVar, ys.d0 d0Var, l1.a1 a1Var, l1.b1 b1Var5) {
        this.f5245b = b1Var;
        this.f5246c = b1Var2;
        this.f5247d = b1Var3;
        this.f5248e = b1Var4;
        this.f5250t = courseSentence;
        this.H = aVar;
        this.K = gVar;
        this.L = d0Var;
        this.M = a1Var;
        this.f5249f = b1Var5;
    }
}
