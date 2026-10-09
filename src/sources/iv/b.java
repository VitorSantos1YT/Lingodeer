package iv;

import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.dc;
import h1.fc;
import h1.g7;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.b2;
import j0.e2;
import j0.z1;
import l1.c3;
import l1.q1;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34684a;

    public /* synthetic */ b(int i11) {
        this.f34684a = i11;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        b2 AppGradientButton = (b2) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(AppGradientButton, "$this$AppGradientButton");
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            iu.k.d(oz.x.q0(ub.a.e0(sVar, R.string.use_s_gems), "%s", "200"), null, null, sVar, 0, 6);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        b2 TextButton = (b2) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(TextButton, "$this$TextButton");
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            iu.k.d(ub.a.e0(sVar, R.string.no_thanks), null, null, sVar, 0, 6);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        b2 TextButton = (b2) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(TextButton, "$this$TextButton");
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            ua.b(ub.a.e0(sVar, R.string.confirm), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        a0.k0 AnimatedVisibility = (a0.k0) obj;
        l1.n nVar = (l1.n) obj2;
        ((Integer) obj3).getClass();
        kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
        g7.b(2, 0, 390, 24, ((s1) ((l1.s) nVar).j(v1.f31180a)).f31017a, 0L, nVar, j0.c.E(e2.n(z1.o.f58481a, 20), CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
        return qy.b0.f48488a;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y2.i iVar;
        switch (this.f34684a) {
            case 0:
                j0.v Card = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.r rVarD = e2.d(z1.o.f58481a, 1.0f);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarD);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
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
                    ua.b(ub.a.e0(sVar, R.string.introduction), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(fc.f30256a)).f30175h, ((s1) sVar.j(v1.f31180a)).f31017a, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar, 0, 0, 65534);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                b2 TextButton = (b2) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton, "$this$TextButton");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar2, R.string.confirm), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                b2 TextButton2 = (b2) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton2, "$this$TextButton");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar3, R.string.cancel), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 3:
                b2 TextButton3 = (b2) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton3, "$this$TextButton");
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar4, R.string.confirm), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 131070);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 4:
                b2 TextButton4 = (b2) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton4, "$this$TextButton");
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar5, R.string.cancel), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar5, 0, 0, 131070);
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            case 5:
                l0.c item = (l0.c) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    j0.c.g(sVar6, j0.c.v(z1.o.f58481a));
                } else {
                    sVar6.W();
                }
                return qy.b0.f48488a;
            case 6:
                b2 AppGradientButton = (b2) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton, "$this$AppGradientButton");
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar7, R.string.test_continue), null, null, sVar7, 0, 6);
                } else {
                    sVar7.W();
                }
                return qy.b0.f48488a;
            case 7:
                b2 OutlinedButton = (b2) obj;
                l1.n nVar8 = (l1.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedButton, "$this$OutlinedButton");
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar8, R.string.prev), null, null, sVar8, 0, 6);
                } else {
                    sVar8.W();
                }
                return qy.b0.f48488a;
            case 8:
                b2 AppGradientButton2 = (b2) obj;
                l1.n nVar9 = (l1.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton2, "$this$AppGradientButton");
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar9, R.string.publish), null, null, sVar9, 0, 6);
                } else {
                    sVar9.W();
                }
                return qy.b0.f48488a;
            case 9:
                b2 TextButton5 = (b2) obj;
                l1.n nVar10 = (l1.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton5, "$this$TextButton");
                l1.s sVar10 = (l1.s) nVar10;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar10, R.string.redo_recording), null, null, sVar10, 0, 6);
                } else {
                    sVar10.W();
                }
                return qy.b0.f48488a;
            case 10:
                b2 AppGradientButton3 = (b2) obj;
                l1.n nVar11 = (l1.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton3, "$this$AppGradientButton");
                l1.s sVar11 = (l1.s) nVar11;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar11, R.string.preview), null, null, sVar11, 0, 6);
                } else {
                    sVar11.W();
                }
                return qy.b0.f48488a;
            case 11:
                b2 AppGradientButton4 = (b2) obj;
                l1.n nVar12 = (l1.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton4, "$this$AppGradientButton");
                l1.s sVar12 = (l1.s) nVar12;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar12, R.string.japanese_alphabet_chart), null, null, sVar12, 0, 6);
                } else {
                    sVar12.W();
                }
                return qy.b0.f48488a;
            case 12:
                b2 TextButton6 = (b2) obj;
                l1.n nVar13 = (l1.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton6, "$this$TextButton");
                l1.s sVar13 = (l1.s) nVar13;
                if (sVar13.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar13, R.string.cancel), null, ((s1) sVar13.j(v1.f31180a)).f31036s, j3.A(15), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar13, 3072, 0, 131058);
                } else {
                    sVar13.W();
                }
                return qy.b0.f48488a;
            case 13:
                b2 Button = (b2) obj;
                l1.n nVar14 = (l1.n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Button, "$this$Button");
                l1.s sVar14 = (l1.s) nVar14;
                if (sVar14.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar14, R.string.knowledge_note_save_action), null, 0L, j3.A(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar14, 3072, 0, 131062);
                } else {
                    sVar14.W();
                }
                return qy.b0.f48488a;
            case 14:
                b2 TextButton7 = (b2) obj;
                l1.n nVar15 = (l1.n) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton7, "$this$TextButton");
                l1.s sVar15 = (l1.s) nVar15;
                if (sVar15.T(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar15, R.string.knowledge_note_delete_confirm), null, g2.x.c(((s1) sVar15.j(v1.f31180a)).f31040w, 0.8f), j3.A(14), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar15, 199680, 0, 131026);
                } else {
                    sVar15.W();
                }
                return qy.b0.f48488a;
            case 15:
                b2 TextButton8 = (b2) obj;
                l1.n nVar16 = (l1.n) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton8, "$this$TextButton");
                l1.s sVar16 = (l1.s) nVar16;
                if (sVar16.T(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar16, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar16, 0, 0, 131070);
                } else {
                    sVar16.W();
                }
                return qy.b0.f48488a;
            case 16:
                b2 AppGradientButton5 = (b2) obj;
                l1.n nVar17 = (l1.n) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton5, "$this$AppGradientButton");
                l1.s sVar17 = (l1.s) nVar17;
                if (sVar17.T(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar17, R.string.login_to_claim_gems), null, null, sVar17, 0, 6);
                } else {
                    sVar17.W();
                }
                return qy.b0.f48488a;
            case 17:
                b2 OutlinedButton2 = (b2) obj;
                l1.n nVar18 = (l1.n) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedButton2, "$this$OutlinedButton");
                l1.s sVar18 = (l1.s) nVar18;
                if (sVar18.T(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar18, R.string.cancel), null, null, sVar18, 0, 6);
                } else {
                    sVar18.W();
                }
                return qy.b0.f48488a;
            case 18:
                b2 AppGradientButton6 = (b2) obj;
                l1.n nVar19 = (l1.n) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton6, "$this$AppGradientButton");
                l1.s sVar19 = (l1.s) nVar19;
                if (sVar19.T(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar19, R.string.claim_gems), null, null, sVar19, 0, 6);
                } else {
                    sVar19.W();
                }
                return qy.b0.f48488a;
            case 19:
                j0.v OutlinedCard = (j0.v) obj;
                l1.n nVar20 = (l1.n) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                l1.s sVar20 = (l1.s) nVar20;
                if (sVar20.T(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                    int iHashCode2 = Long.hashCode(sVar20.T);
                    q1 q1VarL2 = sVar20.l();
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC2 = z1.a.c(sVar20, oVar);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar20.h0();
                    if (sVar20.S) {
                        sVar20.k(iVar3);
                    } else {
                        sVar20.r0();
                    }
                    y2.h hVar2 = y2.j.f56917f;
                    l1.t.J(hVar2, q0VarD2, sVar20);
                    y2.h hVar3 = y2.j.f56916e;
                    l1.t.J(hVar3, q1VarL2, sVar20);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar20.S || !kotlin.jvm.internal.m.a(sVar20.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar20, iHashCode2, hVar4);
                    }
                    y2.h hVar5 = y2.j.f56915d;
                    l1.t.J(hVar5, rVarC2, sVar20);
                    z1.r rVarD2 = e2.d(oVar, 1.0f);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar20, 48);
                    int iHashCode3 = Long.hashCode(sVar20.T);
                    q1 q1VarL3 = sVar20.l();
                    z1.r rVarC3 = z1.a.c(sVar20, rVarD2);
                    sVar20.h0();
                    if (sVar20.S) {
                        sVar20.k(iVar3);
                    } else {
                        sVar20.r0();
                    }
                    l1.t.J(hVar2, uVarA, sVar20);
                    l1.t.J(hVar3, q1VarL3, sVar20);
                    if (sVar20.S || !kotlin.jvm.internal.m.a(sVar20.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar20, iHashCode3, hVar4);
                    }
                    l1.t.J(hVar5, rVarC3, sVar20);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar20);
                    d0.n.c(se.k.y(R.drawable.gem_premium_deer, sVar20, 0), null, e2.p(oVar, 72, 79), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar20, 432, 120);
                    float f5 = 6;
                    j0.c.g(sVar20, e2.g(oVar, f5));
                    float f11 = 16;
                    ua.b(ub.a.e0(sVar20, R.string.gems_pay_wall_premium_title), j0.c.C(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, j3.A(14), null, n3.s.N, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar20, 199728, 0, 130516);
                    String strE0 = ub.a.e0(sVar20, R.string.gems_pay_wall_premium_desc);
                    j3.y0 y0Var = (j3.y0) sVar20.j(ua.f31167a);
                    c3 c3Var = v1.f31180a;
                    iu.k.c(strE0, j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, f11, 5), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), j3.y0.a(y0Var, ((s1) sVar20.j(c3Var)).f31034q, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744446), 0, false, 2, 2, new s0.g(j3.A(8), j3.A(11), j3.A(1)), sVar20, 14155824, 56);
                    sVar20.p(true);
                    z1.r rVarE = e2.e(oVar, 1.0f);
                    a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar20, 0);
                    int iHashCode4 = Long.hashCode(sVar20.T);
                    q1 q1VarL4 = sVar20.l();
                    z1.r rVarC4 = z1.a.c(sVar20, rVarE);
                    sVar20.h0();
                    if (sVar20.S) {
                        iVar = iVar3;
                        sVar20.k(iVar);
                    } else {
                        iVar = iVar3;
                        sVar20.r0();
                    }
                    l1.t.J(hVar2, a2VarA, sVar20);
                    l1.t.J(hVar3, q1VarL4, sVar20);
                    if (sVar20.S || !kotlin.jvm.internal.m.a(sVar20.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar20, iHashCode4, hVar4);
                    }
                    l1.t.J(hVar5, rVarC4, sVar20);
                    z1.r rVarC5 = j0.c.C(j0.c.E(d0.n.h(oVar, g2.f0.e(4281155925L), r0.f.f(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 100, CropImageView.DEFAULT_ASPECT_RATIO, 11)), 10, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, 10), CropImageView.DEFAULT_ASPECT_RATIO, 4, 1);
                    w2.q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
                    int iHashCode5 = Long.hashCode(sVar20.T);
                    q1 q1VarL5 = sVar20.l();
                    z1.r rVarC6 = z1.a.c(sVar20, rVarC5);
                    sVar20.h0();
                    if (sVar20.S) {
                        sVar20.k(iVar);
                    } else {
                        sVar20.r0();
                    }
                    l1.t.J(hVar2, q0VarD3, sVar20);
                    l1.t.J(hVar3, q1VarL5, sVar20);
                    if (sVar20.S || !kotlin.jvm.internal.m.a(sVar20.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar20, iHashCode5, hVar4);
                    }
                    l1.t.J(hVar5, rVarC6, sVar20);
                    ua.b(ub.a.e0(sVar20, R.string.gems_pay_wall_premium), null, ob.f.v((s1) sVar20.j(c3Var), sVar20), j3.A(14), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar20, 199680, 0, 131026);
                    com.google.android.material.datepicker.d.B(sVar20, true, true, true);
                } else {
                    sVar20.W();
                }
                return qy.b0.f48488a;
            case 20:
                l1.n nVar21 = (l1.n) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f((j0.v) obj, OYAvlbfUyD.gPuvghdDomsYlKp);
                l1.s sVar21 = (l1.s) nVar21;
                if (sVar21.T(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    w2.q0 q0VarD4 = j0.o.d(z1.c.f58463a, false);
                    int iHashCode6 = Long.hashCode(sVar21.T);
                    q1 q1VarL6 = sVar21.l();
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarC7 = z1.a.c(sVar21, oVar2);
                    y2.k.J.getClass();
                    y2.i iVar4 = y2.j.f56913b;
                    sVar21.h0();
                    if (sVar21.S) {
                        sVar21.k(iVar4);
                    } else {
                        sVar21.r0();
                    }
                    y2.h hVar6 = y2.j.f56917f;
                    l1.t.J(hVar6, q0VarD4, sVar21);
                    y2.h hVar7 = y2.j.f56916e;
                    l1.t.J(hVar7, q1VarL6, sVar21);
                    y2.h hVar8 = y2.j.f56918g;
                    if (sVar21.S || !kotlin.jvm.internal.m.a(sVar21.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar21, iHashCode6, hVar8);
                    }
                    y2.h hVar9 = y2.j.f56915d;
                    l1.t.J(hVar9, rVarC7, sVar21);
                    z1.r rVarD3 = e2.d(oVar2, 1.0f);
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar21, 48);
                    int iHashCode7 = Long.hashCode(sVar21.T);
                    q1 q1VarL7 = sVar21.l();
                    z1.r rVarC8 = z1.a.c(sVar21, rVarD3);
                    sVar21.h0();
                    if (sVar21.S) {
                        sVar21.k(iVar4);
                    } else {
                        sVar21.r0();
                    }
                    l1.t.J(hVar6, uVarA2, sVar21);
                    l1.t.J(hVar7, q1VarL7, sVar21);
                    if (sVar21.S || !kotlin.jvm.internal.m.a(sVar21.Q(), Integer.valueOf(iHashCode7))) {
                        defpackage.e.A(iHashCode7, sVar21, iHashCode7, hVar8);
                    }
                    l1.t.J(hVar9, rVarC8, sVar21);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar21);
                    d0.n.c(se.k.y(R.drawable.gem_deer, sVar21, 0), null, e2.p(oVar2, 72, 79), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar21, 432, 120);
                    float f12 = 6;
                    j0.c.g(sVar21, e2.g(oVar2, f12));
                    float f13 = 16;
                    ua.b(ub.a.e0(sVar21, R.string.gems_pay_wall_single_access), j0.c.C(oVar2, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, j3.A(14), null, n3.s.N, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar21, 199728, 0, 130516);
                    iu.k.c(ub.a.e0(sVar21, R.string.gems_pay_wall_single_access_desc), j0.c.C(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, f13, 5), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), j3.y0.a((j3.y0) sVar21.j(ua.f31167a), ((s1) sVar21.j(v1.f31180a)).f31034q, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744446), 0, false, 2, 2, new s0.g(j3.A(8), j3.A(11), j3.A(1)), sVar21, 14155824, 56);
                    sVar21.p(true);
                    z1.i iVar5 = z1.c.M;
                    j0.g gVarG = j0.i.g(4);
                    z1.r rVarE2 = j0.c.E(oVar2, 10, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                    a2 a2VarA2 = z1.a(gVarG, iVar5, sVar21, 54);
                    int iHashCode8 = Long.hashCode(sVar21.T);
                    q1 q1VarL8 = sVar21.l();
                    z1.r rVarC9 = z1.a.c(sVar21, rVarE2);
                    sVar21.h0();
                    if (sVar21.S) {
                        sVar21.k(iVar4);
                    } else {
                        sVar21.r0();
                    }
                    l1.t.J(hVar6, a2VarA2, sVar21);
                    l1.t.J(hVar7, q1VarL8, sVar21);
                    if (sVar21.S || !kotlin.jvm.internal.m.a(sVar21.Q(), Integer.valueOf(iHashCode8))) {
                        defpackage.e.A(iHashCode8, sVar21, iHashCode8, hVar8);
                    }
                    l1.t.J(hVar9, rVarC9, sVar21);
                    d0.n.c(se.k.y(R.drawable.gem_icon, sVar21, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar21, 48, 124);
                    ua.b("100", null, g2.f0.e(4280662527L), j3.A(14), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar21, 200070, 0, 131026);
                    sVar21.p(true);
                    sVar21.p(true);
                } else {
                    sVar21.W();
                }
                return qy.b0.f48488a;
            case 21:
                b2 AppGradientButton7 = (b2) obj;
                l1.n nVar22 = (l1.n) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton7, "$this$AppGradientButton");
                l1.s sVar22 = (l1.s) nVar22;
                if (sVar22.T(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    a2 a2VarA3 = z1.a(j0.i.f35303a, z1.c.M, sVar22, 48);
                    int iHashCode9 = Long.hashCode(sVar22.T);
                    q1 q1VarL9 = sVar22.l();
                    z1.o oVar3 = z1.o.f58481a;
                    z1.r rVarC10 = z1.a.c(sVar22, oVar3);
                    y2.k.J.getClass();
                    y2.i iVar6 = y2.j.f56913b;
                    sVar22.h0();
                    if (sVar22.S) {
                        sVar22.k(iVar6);
                    } else {
                        sVar22.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA3, sVar22);
                    l1.t.J(y2.j.f56916e, q1VarL9, sVar22);
                    y2.h hVar10 = y2.j.f56918g;
                    if (sVar22.S || !kotlin.jvm.internal.m.a(sVar22.Q(), Integer.valueOf(iHashCode9))) {
                        defpackage.e.A(iHashCode9, sVar22, iHashCode9, hVar10);
                    }
                    l1.t.J(y2.j.f56915d, rVarC10, sVar22);
                    r4.a(se.k.y(R.drawable.gem_icon, sVar22, 0), null, sVar22, 432);
                    iu.k.d(oz.x.q0(ub.a.e0(sVar22, R.string.gems_pay_wall_single_access_btn), "%s", "100"), j0.c.E(oVar3, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), null, sVar22, 48, 4);
                    sVar22.p(true);
                } else {
                    sVar22.W();
                }
                return qy.b0.f48488a;
            case 22:
                b2 TextButton9 = (b2) obj;
                l1.n nVar23 = (l1.n) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton9, "$this$TextButton");
                l1.s sVar23 = (l1.s) nVar23;
                if (sVar23.T(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar23, R.string.no_thanks), null, null, sVar23, 0, 6);
                } else {
                    sVar23.W();
                }
                return qy.b0.f48488a;
            case 23:
                return a(obj, obj2, obj3);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                b2 TextButton10 = (b2) obj;
                l1.n nVar24 = (l1.n) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton10, "$this$TextButton");
                l1.s sVar24 = (l1.s) nVar24;
                if (sVar24.T(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar24, R.string.no_thanks), null, null, sVar24, 0, 6);
                } else {
                    sVar24.W();
                }
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                b2 AppGradientButton8 = (b2) obj;
                l1.n nVar25 = (l1.n) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton8, "$this$AppGradientButton");
                l1.s sVar25 = (l1.s) nVar25;
                if (sVar25.T(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar25, R.string.refill_gem_dialogue_confirm), null, null, sVar25, 0, 6);
                } else {
                    sVar25.W();
                }
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return c(obj, obj2, obj3);
            case 27:
                return d(obj, obj2, obj3);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return e(obj, obj2, obj3);
            default:
                b2 TextButton11 = (b2) obj;
                l1.n nVar26 = (l1.n) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton11, "$this$TextButton");
                l1.s sVar26 = (l1.s) nVar26;
                if (sVar26.T(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar26, R.string.offline_deselect_all), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar26, 0, 0, 131070);
                } else {
                    sVar26.W();
                }
                return qy.b0.f48488a;
        }
    }
}
