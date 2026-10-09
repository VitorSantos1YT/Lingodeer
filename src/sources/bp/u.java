package bp;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f4828b;

    public /* synthetic */ u(int i11, fz.a aVar) {
        this.f4827a = i11;
        this.f4828b = aVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4827a) {
            case 0:
                l0.c item = (l0.c) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    g1.a(this.f4828b, sVar, 0);
                    j0.c.g(sVar, j0.e2.g(z1.o.f58481a, 16));
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                z1.r rVarD = j0.e2.d(z1.o.f58481a, 1.0f);
                l1.s sVar2 = (l1.s) ((l1.n) obj2);
                fz.a aVar = this.f4828b;
                boolean zF = sVar2.f(aVar);
                Object objQ = sVar2.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new ch.o0(17, aVar);
                    sVar2.o0(objQ);
                }
                dt.a0.u(iu.k.q(6, 7, (fz.a) objQ, sVar2, rVarD, false), sVar2, 0);
                break;
            case 2:
                a0.k0 AnimatedVisibility2 = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility2, "$this$AnimatedVisibility");
                z1.r rVarD2 = j0.e2.d(z1.o.f58481a, 1.0f);
                l1.s sVar3 = (l1.s) ((l1.n) obj2);
                fz.a aVar2 = this.f4828b;
                boolean zF2 = sVar3.f(aVar2);
                Object objQ2 = sVar3.Q();
                if (zF2 || objQ2 == l1.m.f39353a) {
                    objQ2 = new ch.o0(18, aVar2);
                    sVar3.o0(objQ2);
                }
                dt.a0.u(iu.k.q(6, 7, (fz.a) objQ2, sVar3, rVarD2, false), sVar3, 0);
                break;
            case 3:
                a0.k0 AnimatedVisibility3 = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility3, "$this$AnimatedVisibility");
                z1.r rVarD3 = j0.e2.d(z1.o.f58481a, 1.0f);
                l1.s sVar4 = (l1.s) ((l1.n) obj2);
                fz.a aVar3 = this.f4828b;
                boolean zF3 = sVar4.f(aVar3);
                Object objQ3 = sVar4.Q();
                if (zF3 || objQ3 == l1.m.f39353a) {
                    objQ3 = new a1.d(aVar3, 7);
                    sVar4.o0(objQ3);
                }
                j0.o.a(s2.g0.a(rVarD3, aVar3, (PointerInputEventHandler) objQ3), sVar4, 0);
                break;
            case 4:
                a0.k0 AnimatedVisibility4 = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility4, "$this$AnimatedVisibility");
                l1.s sVar5 = (l1.s) ((l1.n) obj2);
                fz.a aVar4 = this.f4828b;
                boolean zF4 = sVar5.f(aVar4);
                Object objQ4 = sVar5.Q();
                if (zF4 || objQ4 == l1.m.f39353a) {
                    objQ4 = new et.p(5, aVar4);
                    sVar5.o0(objQ4);
                }
                k7.h((fz.a) objQ4, null, false, null, fu.a.f28049f, sVar5, 196608, 30);
                break;
            case 5:
                l0.c item2 = (l0.c) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar6 = (l1.s) nVar2;
                if (sVar6.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    gs.a.g(384, this.f4828b, ub.a.e0(sVar6, R.string.chinese_tone_btn_lets_practice), sVar6, j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, 1));
                } else {
                    sVar6.W();
                }
                return qy.b0.f48488a;
            case 6:
                l0.c item3 = (l0.c) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item3, "$this$item");
                l1.s sVar7 = (l1.s) nVar3;
                if (sVar7.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    gs.a.g(384, this.f4828b, ub.a.e0(sVar7, R.string.chinese_tone_btn_lets_practice), sVar7, j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, 1));
                } else {
                    sVar7.W();
                }
                return qy.b0.f48488a;
            case 7:
                l0.c item4 = (l0.c) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item4, "$this$item");
                l1.s sVar8 = (l1.s) nVar4;
                if (sVar8.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    gs.a.g(384, this.f4828b, ub.a.e0(sVar8, R.string.chinese_tone_btn_lets_practice), sVar8, j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, 1));
                } else {
                    sVar8.W();
                }
                return qy.b0.f48488a;
            case 8:
                l0.c item5 = (l0.c) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item5, "$this$item");
                l1.s sVar9 = (l1.s) nVar5;
                if (sVar9.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    gs.a.g(384, this.f4828b, ub.a.e0(sVar9, R.string.chinese_tone_btn_lets_practice), sVar9, j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, 1));
                } else {
                    sVar9.W();
                }
                return qy.b0.f48488a;
            case 9:
                l0.c item6 = (l0.c) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item6, "$this$item");
                l1.s sVar10 = (l1.s) nVar6;
                if (sVar10.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    gs.a.g(384, this.f4828b, ub.a.e0(sVar10, R.string.chinese_tone_btn_lets_practice), sVar10, j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, 1));
                } else {
                    sVar10.W();
                }
                return qy.b0.f48488a;
            case 10:
                l0.c item7 = (l0.c) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item7, "$this$item");
                l1.s sVar11 = (l1.s) nVar7;
                if (sVar11.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    gs.a.g(384, this.f4828b, ub.a.e0(sVar11, R.string.chinese_tone_btn_lets_practice), sVar11, j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, 1));
                } else {
                    sVar11.W();
                }
                return qy.b0.f48488a;
            case 11:
                l0.c item8 = (l0.c) obj;
                l1.n nVar8 = (l1.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item8, "$this$item");
                l1.s sVar12 = (l1.s) nVar8;
                if (sVar12.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    gs.a.g(384, this.f4828b, ub.a.e0(sVar12, R.string.chinese_tone_btn_lets_practice), sVar12, j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, 1));
                } else {
                    sVar12.W();
                }
                return qy.b0.f48488a;
            case 12:
                l0.c item9 = (l0.c) obj;
                l1.n nVar9 = (l1.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item9, "$this$item");
                l1.s sVar13 = (l1.s) nVar9;
                if (sVar13.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    gs.a.g(384, this.f4828b, ub.a.e0(sVar13, R.string.chinese_tone_btn_lets_practice), sVar13, j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, 1));
                } else {
                    sVar13.W();
                }
                return qy.b0.f48488a;
            case 13:
                l0.c item10 = (l0.c) obj;
                l1.n nVar10 = (l1.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item10, "$this$item");
                l1.s sVar14 = (l1.s) nVar10;
                if (sVar14.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    float f5 = 10;
                    z1.r rVarB = d2.h.b(j0.e2.g(j0.e2.e(z1.o.f58481a, 1.0f), 58), r0.f.d(f5));
                    fz.a aVar5 = this.f4828b;
                    boolean zF5 = sVar14.f(aVar5);
                    Object objQ5 = sVar14.Q();
                    if (zF5 || objQ5 == l1.m.f39353a) {
                        objQ5 = new et.p(20, aVar5);
                        sVar14.o0(objQ5);
                    }
                    z1.r rVarO = d0.n.o(rVarB, false, null, (fz.a) objQ5, 15);
                    r0.e eVarD = r0.f.d(f5);
                    l1.c3 c3Var = h1.v1.f31180a;
                    k7.d(rVarO, eVarD, k7.p(((h1.s1) sVar14.j(c3Var)).f31021c, sVar14, 0), null, d0.n.a(((h1.s1) sVar14.j(c3Var)).f31017a, 1), iv.a.f34665e, sVar14, 196608, 8);
                } else {
                    sVar14.W();
                }
                return qy.b0.f48488a;
            case 14:
                j0.v OutlinedCard = (j0.v) obj;
                l1.n nVar11 = (l1.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                l1.s sVar15 = (l1.s) nVar11;
                if (sVar15.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    float f11 = 4;
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarD4 = j0.c.D(oVar, 12, f11, f11, f11);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar15, 48);
                    int iHashCode = Long.hashCode(sVar15.T);
                    l1.q1 q1VarL = sVar15.l();
                    z1.r rVarC = z1.a.c(sVar15, rVarD4);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar15.h0();
                    if (sVar15.S) {
                        sVar15.k(iVar);
                    } else {
                        sVar15.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar15);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar15);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar15.S || !kotlin.jvm.internal.m.a(sVar15.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar15, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar15);
                    k2.b bVarY = se.k.y(R.drawable.ic_bookmark_toast, sVar15, 0);
                    l1.c3 c3Var2 = h1.v1.f31180a;
                    h1.r4.b(bVarY, null, j0.e2.n(oVar, 22), ((h1.s1) sVar15.j(c3Var2)).f31017a, sVar15, 432, 0);
                    j0.c.g(sVar15, j0.e2.s(oVar, 8));
                    String strE0 = ub.a.e0(sVar15, R.string.bookmark_folder_added_to_default_folder);
                    long j11 = ((h1.s1) sVar15.j(c3Var2)).f31036s;
                    long jA = fr.j3.A(14);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    ua.b(strE0, new j0.i1(1.0f, true), j11, jA, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar15, 3072, 0, 131056);
                    k7.m(this.f4828b, null, false, null, null, null, mt.g.f41417a, sVar15, 805306368, 510);
                    sVar15.p(true);
                } else {
                    sVar15.W();
                }
                return qy.b0.f48488a;
            case 15:
                l0.c item11 = (l0.c) obj;
                l1.n nVar12 = (l1.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item11, "$this$item");
                l1.s sVar16 = (l1.s) nVar12;
                if (sVar16.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    float f12 = 10;
                    z1.r rVarB2 = d2.h.b(j0.e2.g(j0.e2.e(z1.o.f58481a, 1.0f), 58), r0.f.d(f12));
                    fz.a aVar6 = this.f4828b;
                    boolean zF6 = sVar16.f(aVar6);
                    Object objQ6 = sVar16.Q();
                    if (zF6 || objQ6 == l1.m.f39353a) {
                        objQ6 = new nv.d(1, aVar6);
                        sVar16.o0(objQ6);
                    }
                    z1.r rVarO2 = d0.n.o(rVarB2, false, null, (fz.a) objQ6, 15);
                    r0.e eVarD2 = r0.f.d(f12);
                    l1.c3 c3Var3 = h1.v1.f31180a;
                    k7.d(rVarO2, eVarD2, k7.p(((h1.s1) sVar16.j(c3Var3)).f31021c, sVar16, 0), null, d0.n.a(((h1.s1) sVar16.j(c3Var3)).f31017a, 1), nv.a.f44101j, sVar16, 196608, 8);
                } else {
                    sVar16.W();
                }
                return qy.b0.f48488a;
            case 16:
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar13 = (l1.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar17 = (l1.s) nVar13;
                if (sVar17.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    z1.h hVar2 = z1.c.P;
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarE = j0.e2.e(oVar2, 1.0f);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, hVar2, sVar17, 48);
                    int iHashCode2 = Long.hashCode(sVar17.T);
                    l1.q1 q1VarL2 = sVar17.l();
                    z1.r rVarC2 = z1.a.c(sVar17, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar17.h0();
                    if (sVar17.S) {
                        sVar17.k(iVar2);
                    } else {
                        sVar17.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar17);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar17);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar17.S || !kotlin.jvm.internal.m.a(sVar17.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar17, iHashCode2, hVar3);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar17);
                    d0.n.c(se.k.y(R.drawable.ic_deer_quit_cry, sVar17, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar17, 48, 124);
                    float f13 = 16;
                    ua.b(ub.a.e0(sVar17, R.string.sorry_let_s_go_through_the_lessons_and_try_again_later), j0.c.A(oVar2, f13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar17.j(ua.f31167a), 0L, fr.j3.A(18), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar17, 48, 0, 65532);
                    iu.k.e(this.f4828b, j0.e2.e(j0.c.C(j0.c.C(oVar2, 32, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f13, 1), 1.0f), false, 0L, null, nv.a.f44097f0, sVar17, 196656, 28);
                    sVar17.p(true);
                } else {
                    sVar17.W();
                }
                return qy.b0.f48488a;
            case 17:
                j0.b2 AppTopAppBar = (j0.b2) obj;
                l1.n nVar14 = (l1.n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
                l1.s sVar18 = (l1.s) nVar14;
                if (sVar18.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    k7.h(this.f4828b, null, false, null, xu.c.S, sVar18, 196608, 30);
                } else {
                    sVar18.W();
                }
                return qy.b0.f48488a;
            case 18:
                a0.k0 AnimatedVisibility5 = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility5, "$this$AnimatedVisibility");
                iu.k.e(this.f4828b, j0.c.E(j0.e2.e(j0.c.C(z1.o.f58481a, 32, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7), false, 0L, null, ys.a.f57895p, (l1.n) obj2, 196656, 28);
                break;
            default:
                a0.k0 AnimatedVisibility6 = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility6, "$this$AnimatedVisibility");
                iu.k.e(this.f4828b, j0.c.E(j0.e2.e(j0.c.C(z1.o.f58481a, 32, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7), false, 0L, null, ys.a.f57899t, (l1.n) obj2, 196656, 28);
                break;
        }
        return qy.b0.f48488a;
    }
}
