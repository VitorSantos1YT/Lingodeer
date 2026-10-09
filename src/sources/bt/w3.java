package bt;

import android.net.Uri;
import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ht.o f6146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ot.n f6147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jt.s0 f6149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f6150f;

    public /* synthetic */ w3(int i11, ht.o oVar, jt.s0 s0Var, l1.b1 b1Var, ot.n nVar, ys.d0 d0Var) {
        this.f6145a = i11;
        this.f6146b = oVar;
        this.f6147c = nVar;
        this.f6148d = b1Var;
        this.f6149e = s0Var;
        this.f6150f = d0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.b1 b1Var;
        ot.n nVar;
        ys.d0 d0Var;
        ot.n nVar2;
        ys.d0 d0Var2;
        switch (this.f6145a) {
            case 0:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar3;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ht.o oVar = this.f6146b;
                    if (oVar.f33757e) {
                        sVar.d0(-1504667810);
                    } else {
                        sVar.d0(-1500495272);
                        boolean z11 = oVar.f33762j;
                        final jt.s0 s0Var = this.f6149e;
                        final l1.b1 b1Var2 = this.f6148d;
                        final ys.d0 d0Var3 = this.f6150f;
                        final ot.n nVar4 = this.f6147c;
                        l1.g gVar = l1.m.f39353a;
                        if (z11) {
                            sVar.d0(-1500460366);
                            ht.l lVar = (ht.l) s0Var.f37168k.getValue();
                            boolean zF = sVar.f(oVar) | sVar.f(b1Var2) | sVar.h(d0Var3) | sVar.h(s0Var) | sVar.h(nVar4);
                            Object objQ = sVar.Q();
                            if (zF || objQ == gVar) {
                                final int i11 = 2;
                                fz.a aVar = new fz.a() { // from class: bt.z3
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i11) {
                                            case 0:
                                                ot.n nVar5 = nVar4;
                                                b.x(oVar, b1Var2, d0Var3, s0Var, jh.h.q(nVar5.f45907a), new ht.c(nVar5.f45907a.getVisemedMap()));
                                                break;
                                            case 1:
                                                ot.n nVar6 = nVar4;
                                                b.x(oVar, b1Var2, d0Var3, s0Var, jh.h.q(nVar6.f45907a), new ht.c(nVar6.f45907a.getVisemedMap()));
                                                break;
                                            case 2:
                                                ot.n nVar7 = nVar4;
                                                b.x(oVar, b1Var2, d0Var3, s0Var, jh.h.u(nVar7.f45907a), new ht.i(nVar7.f45907a.getSlowVisemedMap()));
                                                break;
                                            case 3:
                                                ot.n nVar8 = nVar4;
                                                b.x(oVar, b1Var2, d0Var3, s0Var, jh.h.q(nVar8.f45907a), new ht.c(nVar8.f45907a.getVisemedMap()));
                                                break;
                                            case 4:
                                                ot.n nVar9 = nVar4;
                                                b.x(oVar, b1Var2, d0Var3, s0Var, jh.h.u(nVar9.f45907a), new ht.i(nVar9.f45907a.getSlowVisemedMap()));
                                                break;
                                            case 5:
                                                ot.n nVar10 = nVar4;
                                                b.A(oVar, b1Var2, d0Var3, s0Var, jh.h.u(nVar10.f45907a), new ht.i(nVar10.f45907a.getSlowVisemedMap()));
                                                break;
                                            default:
                                                ot.n nVar11 = nVar4;
                                                b.A(oVar, b1Var2, d0Var3, s0Var, jh.h.q(nVar11.f45907a), new ht.c(nVar11.f45907a.getVisemedMap()));
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                b1Var = b1Var2;
                                nVar = nVar4;
                                d0Var = d0Var3;
                                sVar.o0(aVar);
                                objQ = aVar;
                            } else {
                                b1Var = b1Var2;
                                d0Var = d0Var3;
                                nVar = nVar4;
                            }
                            fz.a aVar2 = (fz.a) objQ;
                            boolean zF2 = sVar.f(oVar) | sVar.f(b1Var) | sVar.h(d0Var) | sVar.h(s0Var) | sVar.h(nVar);
                            Object objQ2 = sVar.Q();
                            if (zF2 || objQ2 == gVar) {
                                final int i12 = 3;
                                final l1.b1 b1Var3 = b1Var;
                                final ys.d0 d0Var4 = d0Var;
                                final ot.n nVar5 = nVar;
                                fz.a aVar3 = new fz.a() { // from class: bt.z3
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i12) {
                                            case 0:
                                                ot.n nVar6 = nVar5;
                                                b.x(oVar, b1Var3, d0Var4, s0Var, jh.h.q(nVar6.f45907a), new ht.c(nVar6.f45907a.getVisemedMap()));
                                                break;
                                            case 1:
                                                ot.n nVar7 = nVar5;
                                                b.x(oVar, b1Var3, d0Var4, s0Var, jh.h.q(nVar7.f45907a), new ht.c(nVar7.f45907a.getVisemedMap()));
                                                break;
                                            case 2:
                                                ot.n nVar8 = nVar5;
                                                b.x(oVar, b1Var3, d0Var4, s0Var, jh.h.u(nVar8.f45907a), new ht.i(nVar8.f45907a.getSlowVisemedMap()));
                                                break;
                                            case 3:
                                                ot.n nVar9 = nVar5;
                                                b.x(oVar, b1Var3, d0Var4, s0Var, jh.h.q(nVar9.f45907a), new ht.c(nVar9.f45907a.getVisemedMap()));
                                                break;
                                            case 4:
                                                ot.n nVar10 = nVar5;
                                                b.x(oVar, b1Var3, d0Var4, s0Var, jh.h.u(nVar10.f45907a), new ht.i(nVar10.f45907a.getSlowVisemedMap()));
                                                break;
                                            case 5:
                                                ot.n nVar11 = nVar5;
                                                b.A(oVar, b1Var3, d0Var4, s0Var, jh.h.u(nVar11.f45907a), new ht.i(nVar11.f45907a.getSlowVisemedMap()));
                                                break;
                                            default:
                                                ot.n nVar12 = nVar5;
                                                b.A(oVar, b1Var3, d0Var4, s0Var, jh.h.q(nVar12.f45907a), new ht.c(nVar12.f45907a.getVisemedMap()));
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar.o0(aVar3);
                                objQ2 = aVar3;
                            }
                            dt.a0.t(lVar, true, aVar2, (fz.a) objQ2, sVar, 48);
                            sVar.p(false);
                        } else {
                            sVar.d0(-1499658675);
                            boolean z12 = s0Var.f37168k.getValue() instanceof ht.i;
                            long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
                            boolean zF3 = sVar.f(oVar) | sVar.f(b1Var2) | sVar.h(d0Var3) | sVar.h(s0Var) | sVar.h(nVar4);
                            Object objQ3 = sVar.Q();
                            if (zF3 || objQ3 == gVar) {
                                final int i13 = 4;
                                fz.a aVar4 = new fz.a() { // from class: bt.z3
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i13) {
                                            case 0:
                                                ot.n nVar6 = nVar4;
                                                b.x(oVar, b1Var2, d0Var3, s0Var, jh.h.q(nVar6.f45907a), new ht.c(nVar6.f45907a.getVisemedMap()));
                                                break;
                                            case 1:
                                                ot.n nVar7 = nVar4;
                                                b.x(oVar, b1Var2, d0Var3, s0Var, jh.h.q(nVar7.f45907a), new ht.c(nVar7.f45907a.getVisemedMap()));
                                                break;
                                            case 2:
                                                ot.n nVar8 = nVar4;
                                                b.x(oVar, b1Var2, d0Var3, s0Var, jh.h.u(nVar8.f45907a), new ht.i(nVar8.f45907a.getSlowVisemedMap()));
                                                break;
                                            case 3:
                                                ot.n nVar9 = nVar4;
                                                b.x(oVar, b1Var2, d0Var3, s0Var, jh.h.q(nVar9.f45907a), new ht.c(nVar9.f45907a.getVisemedMap()));
                                                break;
                                            case 4:
                                                ot.n nVar10 = nVar4;
                                                b.x(oVar, b1Var2, d0Var3, s0Var, jh.h.u(nVar10.f45907a), new ht.i(nVar10.f45907a.getSlowVisemedMap()));
                                                break;
                                            case 5:
                                                ot.n nVar11 = nVar4;
                                                b.A(oVar, b1Var2, d0Var3, s0Var, jh.h.u(nVar11.f45907a), new ht.i(nVar11.f45907a.getSlowVisemedMap()));
                                                break;
                                            default:
                                                ot.n nVar12 = nVar4;
                                                b.A(oVar, b1Var2, d0Var3, s0Var, jh.h.q(nVar12.f45907a), new ht.c(nVar12.f45907a.getVisemedMap()));
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar.o0(aVar4);
                                objQ3 = aVar4;
                            }
                            dt.a0.b(z12, null, j11, (fz.a) objQ3, sVar, 0, 2);
                            sVar = sVar;
                            sVar.p(false);
                        }
                    }
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar6;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final ht.o oVar2 = this.f6146b;
                    boolean z13 = oVar2.f33762j;
                    z1.o oVar3 = z1.o.f58481a;
                    final ot.n nVar7 = this.f6147c;
                    final l1.b1 b1Var4 = this.f6148d;
                    final jt.s0 s0Var2 = this.f6149e;
                    final ys.d0 d0Var5 = this.f6150f;
                    l1.g gVar2 = l1.m.f39353a;
                    if (z13) {
                        sVar2.d0(-1927771046);
                        Uri videoUri = nVar7.f45907a.getVideoUri();
                        z1.r rVarB = d2.h.b(j0.e2.n(j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4, 7), AchievementLevelType.DAY_STREAK_LV_8), r0.f.d(12));
                        long jLongValue = ((Number) b1Var4.getValue()).longValue();
                        Long lValueOf = Long.valueOf(oVar2.f33756d);
                        boolean zH = sVar2.h(s0Var2) | sVar2.h(d0Var5);
                        Object objQ4 = sVar2.Q();
                        if (zH || objQ4 == gVar2) {
                            final int i14 = 0;
                            objQ4 = new fz.c() { // from class: bt.y3
                                @Override // fz.c
                                public final Object invoke(Object obj3) {
                                    dt.z4 videoState = (dt.z4) obj3;
                                    switch (i14) {
                                        case 0:
                                            kotlin.jvm.internal.m.f(videoState, "videoState");
                                            dt.z4 z4Var = dt.z4.Idle;
                                            jt.s0 s0Var3 = s0Var2;
                                            if (videoState != z4Var) {
                                                ys.d0 d0Var6 = d0Var5;
                                                if (d0Var6 != null) {
                                                    d0Var6.h();
                                                }
                                                s0Var3.f37168k.setValue(new ht.j());
                                            } else if (s0Var3.f37168k.getValue() instanceof ht.j) {
                                                s0Var3.f37168k.setValue(ht.a.f33722e);
                                            }
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.f(videoState, "videoState");
                                            dt.z4 z4Var2 = dt.z4.Idle;
                                            jt.s0 s0Var4 = s0Var2;
                                            if (videoState != z4Var2) {
                                                ys.d0 d0Var7 = d0Var5;
                                                if (d0Var7 != null) {
                                                    d0Var7.h();
                                                }
                                                s0Var4.f37168k.setValue(new ht.j());
                                            } else if (s0Var4.f37168k.getValue() instanceof ht.j) {
                                                s0Var4.f37168k.setValue(ht.a.f33722e);
                                            }
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar2.o0(objQ4);
                        }
                        dt.y4.a(videoUri, rVarB, null, false, jLongValue, lValueOf, (fz.c) objQ4, sVar2, 0, 12);
                        sVar2.p(false);
                    } else if (((Boolean) sVar2.j(ju.f.f37373g)).booleanValue()) {
                        sVar2.d0(-1926628851);
                        ht.q qVar = (ht.q) s0Var2.f37167j.getValue();
                        ht.l lVar2 = (ht.l) s0Var2.f37168k.getValue();
                        boolean zH2 = sVar2.h(d0Var5);
                        Object objQ5 = sVar2.Q();
                        if (zH2 || objQ5 == gVar2) {
                            objQ5 = new l(d0Var5, 22);
                            sVar2.o0(objQ5);
                        }
                        fz.a aVar5 = (fz.a) objQ5;
                        boolean zF4 = sVar2.f(oVar2) | sVar2.f(b1Var4) | sVar2.h(d0Var5) | sVar2.h(s0Var2) | sVar2.h(nVar7);
                        Object objQ6 = sVar2.Q();
                        if (zF4 || objQ6 == gVar2) {
                            final int i15 = 0;
                            objQ6 = new fz.a() { // from class: bt.z3
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            ot.n nVar8 = nVar7;
                                            b.x(oVar2, b1Var4, d0Var5, s0Var2, jh.h.q(nVar8.f45907a), new ht.c(nVar8.f45907a.getVisemedMap()));
                                            break;
                                        case 1:
                                            ot.n nVar9 = nVar7;
                                            b.x(oVar2, b1Var4, d0Var5, s0Var2, jh.h.q(nVar9.f45907a), new ht.c(nVar9.f45907a.getVisemedMap()));
                                            break;
                                        case 2:
                                            ot.n nVar10 = nVar7;
                                            b.x(oVar2, b1Var4, d0Var5, s0Var2, jh.h.u(nVar10.f45907a), new ht.i(nVar10.f45907a.getSlowVisemedMap()));
                                            break;
                                        case 3:
                                            ot.n nVar11 = nVar7;
                                            b.x(oVar2, b1Var4, d0Var5, s0Var2, jh.h.q(nVar11.f45907a), new ht.c(nVar11.f45907a.getVisemedMap()));
                                            break;
                                        case 4:
                                            ot.n nVar12 = nVar7;
                                            b.x(oVar2, b1Var4, d0Var5, s0Var2, jh.h.u(nVar12.f45907a), new ht.i(nVar12.f45907a.getSlowVisemedMap()));
                                            break;
                                        case 5:
                                            ot.n nVar13 = nVar7;
                                            b.A(oVar2, b1Var4, d0Var5, s0Var2, jh.h.u(nVar13.f45907a), new ht.i(nVar13.f45907a.getSlowVisemedMap()));
                                            break;
                                        default:
                                            ot.n nVar14 = nVar7;
                                            b.A(oVar2, b1Var4, d0Var5, s0Var2, jh.h.q(nVar14.f45907a), new ht.c(nVar14.f45907a.getVisemedMap()));
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar2.o0(objQ6);
                        }
                        dt.e.o(qVar, lVar2, aVar5, (fz.a) objQ6, sVar2, 0);
                        sVar2.p(false);
                    } else {
                        sVar2.d0(-1925851061);
                        j0.c.g(sVar2, j0.e2.g(oVar3, 12));
                        z1.r rVarN = j0.e2.n(oVar3, 72);
                        boolean z14 = s0Var2.f37168k.getValue() instanceof ht.c;
                        boolean zF5 = sVar2.f(oVar2) | sVar2.f(b1Var4) | sVar2.h(d0Var5) | sVar2.h(s0Var2) | sVar2.h(nVar7);
                        Object objQ7 = sVar2.Q();
                        if (zF5 || objQ7 == gVar2) {
                            final int i16 = 1;
                            fz.a aVar6 = new fz.a() { // from class: bt.z3
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            ot.n nVar8 = nVar7;
                                            b.x(oVar2, b1Var4, d0Var5, s0Var2, jh.h.q(nVar8.f45907a), new ht.c(nVar8.f45907a.getVisemedMap()));
                                            break;
                                        case 1:
                                            ot.n nVar9 = nVar7;
                                            b.x(oVar2, b1Var4, d0Var5, s0Var2, jh.h.q(nVar9.f45907a), new ht.c(nVar9.f45907a.getVisemedMap()));
                                            break;
                                        case 2:
                                            ot.n nVar10 = nVar7;
                                            b.x(oVar2, b1Var4, d0Var5, s0Var2, jh.h.u(nVar10.f45907a), new ht.i(nVar10.f45907a.getSlowVisemedMap()));
                                            break;
                                        case 3:
                                            ot.n nVar11 = nVar7;
                                            b.x(oVar2, b1Var4, d0Var5, s0Var2, jh.h.q(nVar11.f45907a), new ht.c(nVar11.f45907a.getVisemedMap()));
                                            break;
                                        case 4:
                                            ot.n nVar12 = nVar7;
                                            b.x(oVar2, b1Var4, d0Var5, s0Var2, jh.h.u(nVar12.f45907a), new ht.i(nVar12.f45907a.getSlowVisemedMap()));
                                            break;
                                        case 5:
                                            ot.n nVar13 = nVar7;
                                            b.A(oVar2, b1Var4, d0Var5, s0Var2, jh.h.u(nVar13.f45907a), new ht.i(nVar13.f45907a.getSlowVisemedMap()));
                                            break;
                                        default:
                                            ot.n nVar14 = nVar7;
                                            b.A(oVar2, b1Var4, d0Var5, s0Var2, jh.h.q(nVar14.f45907a), new ht.c(nVar14.f45907a.getVisemedMap()));
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar2.o0(aVar6);
                            objQ7 = aVar6;
                        }
                        dt.a0.f(rVarN, CropImageView.DEFAULT_ASPECT_RATIO, z14, (fz.a) objQ7, sVar2, 6, 2);
                        ep.a.C(oVar3, 26, sVar2, false);
                    }
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar8;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    final jt.s0 s0Var3 = this.f6149e;
                    ht.l lVar3 = (ht.l) s0Var3.f37168k.getValue();
                    final ht.o oVar4 = this.f6146b;
                    boolean z15 = !oVar4.f33757e;
                    boolean zF6 = sVar3.f(oVar4);
                    final l1.b1 b1Var5 = this.f6148d;
                    boolean zF7 = zF6 | sVar3.f(b1Var5);
                    final ys.d0 d0Var6 = this.f6150f;
                    boolean zH3 = zF7 | sVar3.h(d0Var6) | sVar3.h(s0Var3);
                    final ot.n nVar9 = this.f6147c;
                    boolean zH4 = zH3 | sVar3.h(nVar9);
                    Object objQ8 = sVar3.Q();
                    l1.g gVar3 = l1.m.f39353a;
                    if (zH4 || objQ8 == gVar3) {
                        final int i17 = 5;
                        fz.a aVar7 = new fz.a() { // from class: bt.z3
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        ot.n nVar10 = nVar9;
                                        b.x(oVar4, b1Var5, d0Var6, s0Var3, jh.h.q(nVar10.f45907a), new ht.c(nVar10.f45907a.getVisemedMap()));
                                        break;
                                    case 1:
                                        ot.n nVar11 = nVar9;
                                        b.x(oVar4, b1Var5, d0Var6, s0Var3, jh.h.q(nVar11.f45907a), new ht.c(nVar11.f45907a.getVisemedMap()));
                                        break;
                                    case 2:
                                        ot.n nVar12 = nVar9;
                                        b.x(oVar4, b1Var5, d0Var6, s0Var3, jh.h.u(nVar12.f45907a), new ht.i(nVar12.f45907a.getSlowVisemedMap()));
                                        break;
                                    case 3:
                                        ot.n nVar13 = nVar9;
                                        b.x(oVar4, b1Var5, d0Var6, s0Var3, jh.h.q(nVar13.f45907a), new ht.c(nVar13.f45907a.getVisemedMap()));
                                        break;
                                    case 4:
                                        ot.n nVar14 = nVar9;
                                        b.x(oVar4, b1Var5, d0Var6, s0Var3, jh.h.u(nVar14.f45907a), new ht.i(nVar14.f45907a.getSlowVisemedMap()));
                                        break;
                                    case 5:
                                        ot.n nVar15 = nVar9;
                                        b.A(oVar4, b1Var5, d0Var6, s0Var3, jh.h.u(nVar15.f45907a), new ht.i(nVar15.f45907a.getSlowVisemedMap()));
                                        break;
                                    default:
                                        ot.n nVar16 = nVar9;
                                        b.A(oVar4, b1Var5, d0Var6, s0Var3, jh.h.q(nVar16.f45907a), new ht.c(nVar16.f45907a.getVisemedMap()));
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        nVar2 = nVar9;
                        d0Var2 = d0Var6;
                        sVar3.o0(aVar7);
                        objQ8 = aVar7;
                    } else {
                        d0Var2 = d0Var6;
                        nVar2 = nVar9;
                    }
                    fz.a aVar8 = (fz.a) objQ8;
                    boolean zF8 = sVar3.f(oVar4) | sVar3.f(b1Var5) | sVar3.h(d0Var2) | sVar3.h(s0Var3) | sVar3.h(nVar2);
                    Object objQ9 = sVar3.Q();
                    if (zF8 || objQ9 == gVar3) {
                        final int i18 = 6;
                        final ys.d0 d0Var7 = d0Var2;
                        final ot.n nVar10 = nVar2;
                        fz.a aVar9 = new fz.a() { // from class: bt.z3
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        ot.n nVar11 = nVar10;
                                        b.x(oVar4, b1Var5, d0Var7, s0Var3, jh.h.q(nVar11.f45907a), new ht.c(nVar11.f45907a.getVisemedMap()));
                                        break;
                                    case 1:
                                        ot.n nVar12 = nVar10;
                                        b.x(oVar4, b1Var5, d0Var7, s0Var3, jh.h.q(nVar12.f45907a), new ht.c(nVar12.f45907a.getVisemedMap()));
                                        break;
                                    case 2:
                                        ot.n nVar13 = nVar10;
                                        b.x(oVar4, b1Var5, d0Var7, s0Var3, jh.h.u(nVar13.f45907a), new ht.i(nVar13.f45907a.getSlowVisemedMap()));
                                        break;
                                    case 3:
                                        ot.n nVar14 = nVar10;
                                        b.x(oVar4, b1Var5, d0Var7, s0Var3, jh.h.q(nVar14.f45907a), new ht.c(nVar14.f45907a.getVisemedMap()));
                                        break;
                                    case 4:
                                        ot.n nVar15 = nVar10;
                                        b.x(oVar4, b1Var5, d0Var7, s0Var3, jh.h.u(nVar15.f45907a), new ht.i(nVar15.f45907a.getSlowVisemedMap()));
                                        break;
                                    case 5:
                                        ot.n nVar16 = nVar10;
                                        b.A(oVar4, b1Var5, d0Var7, s0Var3, jh.h.u(nVar16.f45907a), new ht.i(nVar16.f45907a.getSlowVisemedMap()));
                                        break;
                                    default:
                                        ot.n nVar17 = nVar10;
                                        b.A(oVar4, b1Var5, d0Var7, s0Var3, jh.h.q(nVar17.f45907a), new ht.c(nVar17.f45907a.getVisemedMap()));
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar3.o0(aVar9);
                        objQ9 = aVar9;
                    }
                    dt.a0.t(lVar3, z15, aVar8, (fz.a) objQ9, sVar3, 0);
                } else {
                    sVar3.W();
                }
                break;
            default:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar11;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ht.o oVar5 = this.f6146b;
                    if (oVar5.f33762j) {
                        sVar4.d0(763176092);
                        Uri videoUri2 = this.f6147c.f45907a.getVideoUri();
                        z1.r rVarB2 = d2.h.b(j0.e2.n(j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4, 7), AchievementLevelType.DAY_STREAK_LV_8), r0.f.d(12));
                        long jLongValue2 = ((Number) this.f6148d.getValue()).longValue();
                        Long lValueOf2 = Long.valueOf(oVar5.f33756d);
                        final jt.s0 s0Var4 = this.f6149e;
                        boolean zH5 = sVar4.h(s0Var4);
                        final ys.d0 d0Var8 = this.f6150f;
                        boolean zH6 = zH5 | sVar4.h(d0Var8);
                        Object objQ10 = sVar4.Q();
                        if (zH6 || objQ10 == l1.m.f39353a) {
                            final int i19 = 1;
                            objQ10 = new fz.c() { // from class: bt.y3
                                @Override // fz.c
                                public final Object invoke(Object obj3) {
                                    dt.z4 videoState = (dt.z4) obj3;
                                    switch (i19) {
                                        case 0:
                                            kotlin.jvm.internal.m.f(videoState, "videoState");
                                            dt.z4 z4Var = dt.z4.Idle;
                                            jt.s0 s0Var5 = s0Var4;
                                            if (videoState != z4Var) {
                                                ys.d0 d0Var9 = d0Var8;
                                                if (d0Var9 != null) {
                                                    d0Var9.h();
                                                }
                                                s0Var5.f37168k.setValue(new ht.j());
                                            } else if (s0Var5.f37168k.getValue() instanceof ht.j) {
                                                s0Var5.f37168k.setValue(ht.a.f33722e);
                                            }
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.f(videoState, "videoState");
                                            dt.z4 z4Var2 = dt.z4.Idle;
                                            jt.s0 s0Var6 = s0Var4;
                                            if (videoState != z4Var2) {
                                                ys.d0 d0Var10 = d0Var8;
                                                if (d0Var10 != null) {
                                                    d0Var10.h();
                                                }
                                                s0Var6.f37168k.setValue(new ht.j());
                                            } else if (s0Var6.f37168k.getValue() instanceof ht.j) {
                                                s0Var6.f37168k.setValue(ht.a.f33722e);
                                            }
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar4.o0(objQ10);
                        }
                        dt.y4.a(videoUri2, rVarB2, null, false, jLongValue2, lValueOf2, (fz.c) objQ10, sVar4, 0, 12);
                    } else {
                        sVar4.d0(753862111);
                    }
                    sVar4.p(false);
                } else {
                    sVar4.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ w3(ht.o oVar, jt.s0 s0Var, l1.b1 b1Var, ys.d0 d0Var, ot.n nVar) {
        this.f6145a = 0;
        this.f6146b = oVar;
        this.f6149e = s0Var;
        this.f6148d = b1Var;
        this.f6150f = d0Var;
        this.f6147c = nVar;
    }

    public /* synthetic */ w3(jt.s0 s0Var, ht.o oVar, l1.b1 b1Var, ys.d0 d0Var, ot.n nVar) {
        this.f6145a = 2;
        this.f6149e = s0Var;
        this.f6146b = oVar;
        this.f6148d = b1Var;
        this.f6150f = d0Var;
        this.f6147c = nVar;
    }
}
