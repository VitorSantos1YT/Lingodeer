package jr;

import a0.f1;
import a0.l1;
import a0.w1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import b0.i2;
import b0.k2;
import b0.t1;
import bp.r0;
import bt.a3;
import bt.y2;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.logging.type.LogSeverity;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import dt.d4;
import dt.g4;
import fr.j3;
import h1.g7;
import h1.k7;
import h1.p7;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import j3.y0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kr.m0;
import kr.n0;
import kr.p0;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.q1;
import l1.x1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z {
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Iterable, java.lang.Object] */
    public static final void a(ir.a aVar, final fz.c cVar, fz.a aVar2, l1.n nVar, int i11) {
        ir.a aVar3;
        CourseWord courseWord;
        y2.h hVar;
        y2.h hVar2;
        y2.i iVar;
        y2.h hVar3;
        z1.o oVar;
        long jX;
        long jW;
        long jT;
        l1.g gVar;
        long j11;
        b1 b1Var;
        final b1 b1Var2;
        Object obj;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1323761115);
        int i12 = i11 | (sVar.h(aVar) ? 4 : 2) | (sVar.h(cVar) ? 32 : 16) | (sVar.h(aVar2) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                objQ = l1.t.B(null);
                sVar.o0(objQ);
            }
            b1 b1Var3 = (b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar2) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var4 = (b1) objQ2;
            z1.o oVar2 = z1.o.f58481a;
            float f5 = 16;
            z1.r rVarC = j0.c.C(e2.d(oVar2, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            y2.h hVar4 = y2.j.f56917f;
            l1.t.J(hVar4, q0VarD, sVar);
            y2.h hVar5 = y2.j.f56916e;
            l1.t.J(hVar5, q1VarL, sVar);
            y2.h hVar6 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar6);
            }
            y2.h hVar7 = y2.j.f56915d;
            l1.t.J(hVar7, rVarC2, sVar);
            c3 c3Var = v1.f31180a;
            float f11 = 14;
            z1.r rVarA = j0.c.A(d0.n.h(oVar2, ((s1) sVar.j(c3Var)).f31033p, r0.f.f(f11, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12)), f5);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarA);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar4, uVarA, sVar);
            l1.t.J(hVar5, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar6);
            }
            l1.t.J(hVar7, rVarC3, sVar);
            z1.r rVarN = e2.n(j0.c.y(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, -52, 1), 72);
            long jC = g2.x.c(((s1) sVar.j(c3Var)).f31024f, 0.8f);
            r0.e eVar = r0.f.f48733a;
            z1.r rVarH = d0.n.h(rVarN, jC, eVar);
            float f12 = 2;
            z1.r rVarJ = d0.n.j(rVarH, f12, ((s1) sVar.j(c3Var)).f31033p, eVar);
            q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarJ);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar4, q0VarD2, sVar);
            l1.t.J(hVar5, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar6);
            }
            l1.t.J(hVar7, rVarC4, sVar);
            l1.g gVar3 = gVar2;
            d0.n.c(se.k.y(R.drawable.ic_speak_question, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 124);
            sVar.p(true);
            String str = aVar.f34556d;
            CourseWord courseWord2 = aVar.f34553a;
            if (str.length() > 0) {
                sVar.d0(-342381494);
                courseWord = courseWord2;
                iVar = iVar2;
                hVar2 = hVar4;
                hVar3 = hVar5;
                hVar = hVar7;
                ua.b(aVar.f34556d, null, 0L, ct.c.c(sVar), null, n3.s.K, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 196608, 0, 130518);
                sVar = sVar;
                sVar.p(false);
            } else {
                courseWord = courseWord2;
                hVar = hVar7;
                hVar2 = hVar4;
                iVar = iVar2;
                hVar3 = hVar5;
                sVar = sVar;
                sVar.d0(-342119141);
                g4.b(aVar.f34553a, y0.a(ct.c.b(sVar), 0L, ct.c.c(sVar), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), null, false, null, false, false, false, 0, null, sVar, 0, 1020);
                sVar.p(false);
            }
            if (courseWord.getTranslation().length() > 0) {
                sVar.d0(-341752659);
                l1.s sVar2 = sVar;
                oVar = oVar2;
                ua.b(courseWord.getTranslation(), j0.c.E(e2.e(oVar2, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), g2.x.c(((s1) sVar.j(c3Var)).f31034q, 0.7f), j3.A(16), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar2, 3120, 0, 130544);
                sVar = sVar2;
            } else {
                oVar = oVar2;
                sVar.d0(-360023253);
            }
            sVar.p(false);
            float f13 = 1.0f;
            j0.c.g(sVar, j0.v.a(oVar, 1.0f));
            z1.r rVarE = e2.e(oVar, 1.0f);
            char c11 = 6;
            j0.u uVarA2 = j0.t.a(j0.i.g(8), z1.c.O, sVar, 6);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA2, sVar);
            l1.t.J(hVar3, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar6);
            }
            l1.t.J(hVar, rVarC5, sVar);
            sVar.d0(1460115215);
            aVar3 = aVar;
            final int i13 = 0;
            for (Object obj2 : aVar3.f34554b) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    ns.o.V();
                    throw null;
                }
                final CourseWord courseWord3 = (CourseWord) obj2;
                final boolean z11 = courseWord3.getWordId() == Long.parseLong(aVar3.f34555c);
                Integer num = (Integer) b1Var3.getValue();
                boolean z12 = num != null && num.intValue() == i13;
                if (z12 && z11) {
                    sVar.d0(-406903853);
                    jX = ob.f.x((s1) sVar.j(v1.f31180a), sVar);
                    sVar.p(false);
                } else if (z12 && !z11) {
                    sVar.d0(-406900207);
                    jX = ob.f.z((s1) sVar.j(v1.f31180a), sVar);
                    sVar.p(false);
                } else if (((Boolean) b1Var4.getValue()).booleanValue() && z11) {
                    sVar.d0(-406896429);
                    jX = ob.f.x((s1) sVar.j(v1.f31180a), sVar);
                    sVar.p(false);
                } else {
                    sVar.d0(-406893658);
                    jX = ((s1) sVar.j(v1.f31180a)).f31033p;
                    sVar.p(false);
                }
                long j12 = jX;
                if (z12 && z11) {
                    sVar.d0(-406888374);
                    jW = ob.f.w((s1) sVar.j(v1.f31180a), sVar);
                    sVar.p(false);
                } else if (z12 && !z11) {
                    sVar.d0(-406885016);
                    jW = ob.f.y((s1) sVar.j(v1.f31180a), sVar);
                    sVar.p(false);
                } else if (((Boolean) b1Var4.getValue()).booleanValue() && z11) {
                    sVar.d0(-406881526);
                    jW = ob.f.w((s1) sVar.j(v1.f31180a), sVar);
                    sVar.p(false);
                } else {
                    sVar.d0(-406879034);
                    jW = ((s1) sVar.j(v1.f31180a)).A;
                    sVar.p(false);
                }
                if (z12 && z11) {
                    sVar.d0(-406873995);
                    jT = ob.f.t((s1) sVar.j(v1.f31180a), sVar);
                    sVar.p(false);
                } else if (z12 && !z11) {
                    sVar.d0(-406870285);
                    jT = ob.f.u((s1) sVar.j(v1.f31180a), sVar);
                    sVar.p(false);
                } else if (((Boolean) b1Var4.getValue()).booleanValue() && z11) {
                    sVar.d0(-406866443);
                    jT = ob.f.t((s1) sVar.j(v1.f31180a), sVar);
                    sVar.p(false);
                } else {
                    sVar.d0(-406863768);
                    jT = ((s1) sVar.j(v1.f31180a)).f31034q;
                    sVar.p(false);
                }
                final long j13 = jT;
                char c12 = c11;
                z1.r rVarC6 = j0.c.C(e2.e(oVar, f13), CropImageView.DEFAULT_ASPECT_RATIO, 4, 1);
                boolean z13 = !((Boolean) b1Var4.getValue()).booleanValue();
                boolean zD = sVar.d(i13) | ((i12 & 112) == 32) | sVar.g(z11);
                Object objQ3 = sVar.Q();
                if (zD) {
                    gVar = gVar3;
                } else {
                    gVar = gVar3;
                    if (objQ3 != gVar) {
                        j11 = jW;
                        gVar3 = gVar;
                        obj = objQ3;
                        b1Var = b1Var3;
                        b1Var2 = b1Var4;
                    }
                    k7.d(d0.n.o(rVarC6, z13, null, (fz.a) obj, 14), null, k7.p(j12, sVar, 0), null, d0.n.a(j11, f12), t1.e.d(-845615887, new fz.f() { // from class: jr.u
                        /* JADX WARN: Code duplicated, block: B:41:0x01e4  */
                        /* JADX WARN: Code duplicated, block: B:42:0x01e8  */
                        /* JADX WARN: Code duplicated, block: B:47:0x0203  */
                        /* JADX WARN: Code duplicated, block: B:56:0x024b  */
                        @Override // fz.f
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            y2.h hVar8;
                            y2.h hVar9;
                            y2.h hVar10;
                            y2.i iVar3;
                            int iHashCode5;
                            j0.v Card = (j0.v) obj3;
                            l1.n nVar2 = (l1.n) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            kotlin.jvm.internal.m.f(Card, "$this$Card");
                            l1.s sVar3 = (l1.s) nVar2;
                            if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                z1.o oVar3 = z1.o.f58481a;
                                z1.r rVarB = j0.c.B(e2.i(e2.e(oVar3, 1.0f), 52, CropImageView.DEFAULT_ASPECT_RATIO, 2), 12, 8);
                                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar3, 48);
                                int iHashCode6 = Long.hashCode(sVar3.T);
                                q1 q1VarL5 = sVar3.l();
                                z1.r rVarC7 = z1.a.c(sVar3, rVarB);
                                y2.k.J.getClass();
                                y2.i iVar4 = y2.j.f56913b;
                                sVar3.h0();
                                if (sVar3.S) {
                                    sVar3.k(iVar4);
                                } else {
                                    sVar3.r0();
                                }
                                y2.h hVar11 = y2.j.f56917f;
                                l1.t.J(hVar11, a2VarA, sVar3);
                                y2.h hVar12 = y2.j.f56916e;
                                l1.t.J(hVar12, q1VarL5, sVar3);
                                y2.h hVar13 = y2.j.f56918g;
                                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode6))) {
                                    defpackage.e.A(iHashCode6, sVar3, iHashCode6, hVar13);
                                }
                                y2.h hVar14 = y2.j.f56915d;
                                l1.t.J(hVar14, rVarC7, sVar3);
                                float f14 = 24;
                                j0.c.g(sVar3, e2.n(oVar3, f14));
                                if (1.0f <= 0.0d) {
                                    k0.a.a(scNRoQgKSYX.DWghlAdTL);
                                }
                                i1 i1Var = new i1(1.0f, true);
                                z1.j jVar = z1.c.f58467e;
                                q0 q0VarD3 = j0.o.d(jVar, false);
                                int iHashCode7 = Long.hashCode(sVar3.T);
                                q1 q1VarL6 = sVar3.l();
                                z1.r rVarC8 = z1.a.c(sVar3, i1Var);
                                sVar3.h0();
                                if (sVar3.S) {
                                    sVar3.k(iVar4);
                                } else {
                                    sVar3.r0();
                                }
                                l1.t.J(hVar11, q0VarD3, sVar3);
                                l1.t.J(hVar12, q1VarL6, sVar3);
                                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode7))) {
                                    defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar13);
                                }
                                l1.t.J(hVar14, rVarC8, sVar3);
                                CourseWord courseWord4 = courseWord3;
                                if (ry.l.D(new String[]{"TRUE", "✓"}, courseWord4.getWord())) {
                                    sVar3.d0(-1128374839);
                                    hVar10 = hVar14;
                                    hVar8 = hVar13;
                                    hVar9 = hVar11;
                                    r4.b(se.k.y(R.drawable.check_24px, sVar3, 0), null, null, ((s1) sVar3.j(v1.f31180a)).f31034q, sVar3, 56, 4);
                                    sVar3.p(false);
                                } else {
                                    hVar8 = hVar13;
                                    hVar9 = hVar11;
                                    hVar10 = hVar14;
                                    if (ry.l.D(new String[]{"FALSE", "×"}, courseWord4.getWord())) {
                                        sVar3.d0(-1127941335);
                                        r4.b(se.k.y(R.drawable.close_24px, sVar3, 0), null, null, ((s1) sVar3.j(v1.f31180a)).f31034q, sVar3, 56, 4);
                                        sVar3.p(false);
                                    } else {
                                        sVar3.d0(-1127549774);
                                        iVar3 = iVar4;
                                        g4.b(courseWord4, y0.a(ct.c.b(sVar3), j13, ct.c.c(sVar3), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), null, true, null, false, false, false, 0, null, sVar3, 3072, 1012);
                                        sVar3 = sVar3;
                                        sVar3.p(false);
                                    }
                                    sVar3.p(true);
                                    z1.r rVarN2 = e2.n(oVar3, f14);
                                    q0 q0VarD4 = j0.o.d(jVar, false);
                                    iHashCode5 = Long.hashCode(sVar3.T);
                                    q1 q1VarL7 = sVar3.l();
                                    z1.r rVarC9 = z1.a.c(sVar3, rVarN2);
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar3);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(hVar9, q0VarD4, sVar3);
                                    l1.t.J(hVar12, q1VarL7, sVar3);
                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                                        defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar8);
                                    }
                                    l1.t.J(hVar10, rVarC9, sVar3);
                                    if (((Boolean) b1Var2.getValue()).booleanValue() || !z11) {
                                        sVar3.d0(1572934096);
                                    } else {
                                        sVar3.d0(1596504636);
                                        r4.b(se.k.y(R.drawable.ic_redo_penal_check, sVar3, 0), "正确", null, ob.f.w((s1) sVar3.j(v1.f31180a), sVar3), sVar3, 56, 4);
                                    }
                                    sVar3.p(false);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                }
                                iVar3 = iVar4;
                                sVar3.p(true);
                                z1.r rVarN3 = e2.n(oVar3, f14);
                                q0 q0VarD5 = j0.o.d(jVar, false);
                                iHashCode5 = Long.hashCode(sVar3.T);
                                q1 q1VarL8 = sVar3.l();
                                z1.r rVarC10 = z1.a.c(sVar3, rVarN3);
                                sVar3.h0();
                                if (sVar3.S) {
                                    sVar3.k(iVar3);
                                } else {
                                    sVar3.r0();
                                }
                                l1.t.J(hVar9, q0VarD5, sVar3);
                                l1.t.J(hVar12, q1VarL8, sVar3);
                                if (sVar3.S) {
                                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar8);
                                } else {
                                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar8);
                                }
                                l1.t.J(hVar10, rVarC10, sVar3);
                                if (((Boolean) b1Var2.getValue()).booleanValue()) {
                                    sVar3.d0(1572934096);
                                } else {
                                    sVar3.d0(1572934096);
                                }
                                sVar3.p(false);
                                sVar3.p(true);
                                sVar3.p(true);
                            } else {
                                sVar3.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar), sVar, 196608, 10);
                    b1Var4 = b1Var2;
                    i13 = i14;
                    b1Var3 = b1Var;
                    f13 = 1.0f;
                    c11 = c12;
                }
                gVar3 = gVar;
                j11 = jW;
                final b1 b1Var5 = b1Var3;
                final b1 b1Var6 = b1Var4;
                obj = new fz.a() { // from class: jr.t
                    @Override // fz.a
                    public final Object invoke() {
                        b1Var5.setValue(Integer.valueOf(i13));
                        b1Var6.setValue(Boolean.TRUE);
                        cVar.invoke(Boolean.valueOf(z11));
                        return qy.b0.f48488a;
                    }
                };
                b1Var = b1Var5;
                b1Var2 = b1Var6;
                sVar.o0(obj);
                k7.d(d0.n.o(rVarC6, z13, null, (fz.a) obj, 14), null, k7.p(j12, sVar, 0), null, d0.n.a(j11, f12), t1.e.d(-845615887, new fz.f() { // from class: jr.u
                    /* JADX WARN: Code duplicated, block: B:41:0x01e4  */
                    /* JADX WARN: Code duplicated, block: B:42:0x01e8  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0203  */
                    /* JADX WARN: Code duplicated, block: B:56:0x024b  */
                    @Override // fz.f
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        y2.h hVar8;
                        y2.h hVar9;
                        y2.h hVar10;
                        y2.i iVar3;
                        int iHashCode5;
                        j0.v Card = (j0.v) obj3;
                        l1.n nVar2 = (l1.n) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        kotlin.jvm.internal.m.f(Card, "$this$Card");
                        l1.s sVar3 = (l1.s) nVar2;
                        if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            z1.o oVar3 = z1.o.f58481a;
                            z1.r rVarB = j0.c.B(e2.i(e2.e(oVar3, 1.0f), 52, CropImageView.DEFAULT_ASPECT_RATIO, 2), 12, 8);
                            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar3, 48);
                            int iHashCode6 = Long.hashCode(sVar3.T);
                            q1 q1VarL5 = sVar3.l();
                            z1.r rVarC7 = z1.a.c(sVar3, rVarB);
                            y2.k.J.getClass();
                            y2.i iVar4 = y2.j.f56913b;
                            sVar3.h0();
                            if (sVar3.S) {
                                sVar3.k(iVar4);
                            } else {
                                sVar3.r0();
                            }
                            y2.h hVar11 = y2.j.f56917f;
                            l1.t.J(hVar11, a2VarA, sVar3);
                            y2.h hVar12 = y2.j.f56916e;
                            l1.t.J(hVar12, q1VarL5, sVar3);
                            y2.h hVar13 = y2.j.f56918g;
                            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode6))) {
                                defpackage.e.A(iHashCode6, sVar3, iHashCode6, hVar13);
                            }
                            y2.h hVar14 = y2.j.f56915d;
                            l1.t.J(hVar14, rVarC7, sVar3);
                            float f14 = 24;
                            j0.c.g(sVar3, e2.n(oVar3, f14));
                            if (1.0f <= 0.0d) {
                                k0.a.a(scNRoQgKSYX.DWghlAdTL);
                            }
                            i1 i1Var = new i1(1.0f, true);
                            z1.j jVar = z1.c.f58467e;
                            q0 q0VarD3 = j0.o.d(jVar, false);
                            int iHashCode7 = Long.hashCode(sVar3.T);
                            q1 q1VarL6 = sVar3.l();
                            z1.r rVarC8 = z1.a.c(sVar3, i1Var);
                            sVar3.h0();
                            if (sVar3.S) {
                                sVar3.k(iVar4);
                            } else {
                                sVar3.r0();
                            }
                            l1.t.J(hVar11, q0VarD3, sVar3);
                            l1.t.J(hVar12, q1VarL6, sVar3);
                            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode7))) {
                                defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar13);
                            }
                            l1.t.J(hVar14, rVarC8, sVar3);
                            CourseWord courseWord4 = courseWord3;
                            if (ry.l.D(new String[]{"TRUE", "✓"}, courseWord4.getWord())) {
                                sVar3.d0(-1128374839);
                                hVar10 = hVar14;
                                hVar8 = hVar13;
                                hVar9 = hVar11;
                                r4.b(se.k.y(R.drawable.check_24px, sVar3, 0), null, null, ((s1) sVar3.j(v1.f31180a)).f31034q, sVar3, 56, 4);
                                sVar3.p(false);
                            } else {
                                hVar8 = hVar13;
                                hVar9 = hVar11;
                                hVar10 = hVar14;
                                if (ry.l.D(new String[]{"FALSE", "×"}, courseWord4.getWord())) {
                                    sVar3.d0(-1127941335);
                                    r4.b(se.k.y(R.drawable.close_24px, sVar3, 0), null, null, ((s1) sVar3.j(v1.f31180a)).f31034q, sVar3, 56, 4);
                                    sVar3.p(false);
                                } else {
                                    sVar3.d0(-1127549774);
                                    iVar3 = iVar4;
                                    g4.b(courseWord4, y0.a(ct.c.b(sVar3), j13, ct.c.c(sVar3), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), null, true, null, false, false, false, 0, null, sVar3, 3072, 1012);
                                    sVar3 = sVar3;
                                    sVar3.p(false);
                                }
                                sVar3.p(true);
                                z1.r rVarN3 = e2.n(oVar3, f14);
                                q0 q0VarD5 = j0.o.d(jVar, false);
                                iHashCode5 = Long.hashCode(sVar3.T);
                                q1 q1VarL8 = sVar3.l();
                                z1.r rVarC10 = z1.a.c(sVar3, rVarN3);
                                sVar3.h0();
                                if (sVar3.S) {
                                    sVar3.k(iVar3);
                                } else {
                                    sVar3.r0();
                                }
                                l1.t.J(hVar9, q0VarD5, sVar3);
                                l1.t.J(hVar12, q1VarL8, sVar3);
                                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar8);
                                }
                                l1.t.J(hVar10, rVarC10, sVar3);
                                if (((Boolean) b1Var2.getValue()).booleanValue() || !z11) {
                                    sVar3.d0(1572934096);
                                } else {
                                    sVar3.d0(1596504636);
                                    r4.b(se.k.y(R.drawable.ic_redo_penal_check, sVar3, 0), "正确", null, ob.f.w((s1) sVar3.j(v1.f31180a), sVar3), sVar3, 56, 4);
                                }
                                sVar3.p(false);
                                sVar3.p(true);
                                sVar3.p(true);
                            }
                            iVar3 = iVar4;
                            sVar3.p(true);
                            z1.r rVarN4 = e2.n(oVar3, f14);
                            q0 q0VarD6 = j0.o.d(jVar, false);
                            iHashCode5 = Long.hashCode(sVar3.T);
                            q1 q1VarL9 = sVar3.l();
                            z1.r rVarC11 = z1.a.c(sVar3, rVarN4);
                            sVar3.h0();
                            if (sVar3.S) {
                                sVar3.k(iVar3);
                            } else {
                                sVar3.r0();
                            }
                            l1.t.J(hVar9, q0VarD6, sVar3);
                            l1.t.J(hVar12, q1VarL9, sVar3);
                            if (sVar3.S) {
                                defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar8);
                            } else {
                                defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar8);
                            }
                            l1.t.J(hVar10, rVarC11, sVar3);
                            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                                sVar3.d0(1572934096);
                            } else {
                                sVar3.d0(1572934096);
                            }
                            sVar3.p(false);
                            sVar3.p(true);
                            sVar3.p(true);
                        } else {
                            sVar3.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar), sVar, 196608, 10);
                b1Var4 = b1Var2;
                i13 = i14;
                b1Var3 = b1Var;
                f13 = 1.0f;
                c11 = c12;
            }
            sVar.p(false);
            sVar.p(true);
            j0.c.g(sVar, j0.v.a(oVar, 1.0f));
            sVar.p(true);
            k7.h(aVar2, j0.r.f35391a.a(oVar, z1.c.f58465c), false, null, a.f36570p, sVar, ((i12 >> 6) & 14) | 196608, 28);
            sVar.p(true);
        } else {
            aVar3 = aVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(aVar3, cVar, aVar2, i11, 11);
        }
    }

    public static final void b(kr.d0 d0Var, z1.r rVar, l1.n nVar, int i11, int i12) {
        z1.r rVar2;
        int i13;
        z1.r rVar3;
        int i14 = d0Var.f38442c;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1193916364);
        int i15 = i11 | (sVar.h(d0Var) ? 4 : 2);
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 = i15 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i13 = i15 | (sVar.f(rVar2) ? 32 : 16);
        }
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVar4 = i16 != 0 ? oVar : rVar2;
            q0 q0VarD = j0.o.d(z1.c.H, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar4);
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
            List list = d0Var.f38441b;
            wb.k.c(i14 < list.size() ? (String) list.get(i14) : null, j0.c.j(e2.e(oVar, 1.0f), 1.7777778f), w2.i.f54517d, sVar, 1573296, 4024);
            z1.r rVarE = e2.e(oVar, 1.0f);
            float f5 = -4;
            boolean zH = sVar.h(d0Var);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new hh.o(d0Var, 19);
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new j9.a0(21);
                sVar.o0(objQ2);
            }
            g7.c(aVar, rVarE, 0L, 0L, 0, f5, (fz.c) objQ2, sVar, 1769520, 28);
            sVar.p(true);
            rVar3 = rVar4;
        } else {
            sVar.W();
            rVar3 = rVar2;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(d0Var, rVar3, i11, i12, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x023d  */
    public static final void c(kr.d0 d0Var, z1.r rVar, fz.a aVar, fz.a aVar2, fz.a aVar3, l1.n nVar, int i11) {
        l1.g gVar;
        y2.h hVar;
        y2.i iVar;
        z1.o oVar;
        y2.h hVar2;
        y2.h hVar3;
        y2.h hVar4;
        boolean z11;
        int i12;
        int i13;
        int i14;
        y2.i iVar2;
        y2.h hVar5;
        fz.a aVar4;
        l1.g gVar2;
        fz.a aVar5 = aVar3;
        z1.h hVar6 = z1.c.P;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-528152414);
        int i15 = i11 | (sVar.h(d0Var) ? 4 : 2) | (sVar.f(rVar) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128) | (sVar.h(aVar2) ? 2048 : 1024) | (sVar.h(aVar5) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i15 & 1, (i15 & 9363) != 9362)) {
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar3 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            y2.h hVar7 = y2.j.f56917f;
            l1.t.J(hVar7, q0VarD, sVar);
            y2.h hVar8 = y2.j.f56916e;
            l1.t.J(hVar8, q1VarL, sVar);
            y2.h hVar9 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar9);
            }
            y2.h hVar10 = y2.j.f56915d;
            l1.t.J(hVar10, rVarC, sVar);
            boolean z12 = d0Var.f38450k;
            List list = d0Var.f38440a;
            int i16 = d0Var.f38442c;
            z1.o oVar2 = z1.o.f58481a;
            l1.g gVar3 = l1.m.f39353a;
            if (z12 || i16 >= list.size()) {
                gVar = gVar3;
                hVar = hVar8;
                iVar = iVar3;
                oVar = oVar2;
                hVar2 = hVar10;
                hVar3 = hVar7;
                hVar4 = hVar9;
                z11 = false;
                i12 = 32;
                i13 = 2;
                i14 = 16;
                sVar.d0(1112776922);
            } else {
                sVar.d0(1123386517);
                float f5 = 16;
                z1.r rVarY = d0.n.y(j0.c.A(e2.e(oVar2, 1.0f), f5), d0.n.u(sVar), false, 14);
                j0.u uVarA = j0.t.a(j0.i.f35305c, hVar6, sVar, 48);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarY);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar7, uVarA, sVar);
                l1.t.J(hVar8, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar9);
                }
                l1.t.J(hVar10, rVarC2, sVar);
                j0.c.g(sVar, e2.g(oVar2, 42));
                ir.b bVar = (ir.b) list.get(i16);
                Integer numValueOf = Integer.valueOf(i16);
                boolean zH = sVar.h(d0Var) | ((i15 & 896) == 256);
                Object objQ = sVar.Q();
                if (zH) {
                    gVar2 = gVar3;
                } else {
                    gVar2 = gVar3;
                    if (objQ == gVar2) {
                    }
                    l1.t.f((fz.e) objQ, numValueOf, sVar);
                    i14 = 16;
                    gVar = gVar2;
                    hVar4 = hVar9;
                    hVar = hVar8;
                    iVar = iVar3;
                    oVar = oVar2;
                    hVar2 = hVar10;
                    hVar3 = hVar7;
                    i13 = 2;
                    i12 = 32;
                    d4.a(bVar.f34557a.getDisplayCourseWords(), null, null, false, false, null, null, d0Var.f38444e, false, d0Var.f38443d, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar, 3072, 0, 0, 4193654);
                    sVar = sVar;
                    j0.c.g(sVar, e2.g(oVar, 32));
                    if (d0Var.f38447h) {
                        sVar.d0(-1320088007);
                        ua.b(bVar.f34557a.getTranslation(), j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, j3.A(16), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3120, 0, 130548);
                        sVar = sVar;
                        z11 = false;
                    } else {
                        z11 = false;
                        sVar.d0(-1331770295);
                    }
                    sVar.p(z11);
                    sVar.p(true);
                }
                objQ = new iv.h0(1, d0Var, aVar, null);
                sVar.o0(objQ);
                l1.t.f((fz.e) objQ, numValueOf, sVar);
                i14 = 16;
                gVar = gVar2;
                hVar4 = hVar9;
                hVar = hVar8;
                iVar = iVar3;
                oVar = oVar2;
                hVar2 = hVar10;
                hVar3 = hVar7;
                i13 = 2;
                i12 = 32;
                d4.a(bVar.f34557a.getDisplayCourseWords(), null, null, false, false, null, null, d0Var.f38444e, false, d0Var.f38443d, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar, 3072, 0, 0, 4193654);
                sVar = sVar;
                j0.c.g(sVar, e2.g(oVar, 32));
                if (d0Var.f38447h) {
                    sVar.d0(-1320088007);
                    ua.b(bVar.f34557a.getTranslation(), j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, j3.A(16), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3120, 0, 130548);
                    sVar = sVar;
                    z11 = false;
                } else {
                    z11 = false;
                    sVar.d0(-1331770295);
                }
                sVar.p(z11);
                sVar.p(true);
            }
            sVar.p(z11);
            float f11 = 8;
            z1.r rVarE = j0.c.E(j0.r.f35391a.a(oVar, z1.c.H), f11, CropImageView.DEFAULT_ASPECT_RATIO, f11, i12, 2);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, hVar6, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                iVar2 = iVar;
                sVar.k(iVar2);
            } else {
                iVar2 = iVar;
                sVar.r0();
            }
            y2.h hVar11 = hVar3;
            l1.t.J(hVar11, uVarA2, sVar);
            y2.h hVar12 = hVar;
            l1.t.J(hVar12, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar5 = hVar4;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
            } else {
                hVar5 = hVar4;
            }
            y2.h hVar13 = hVar2;
            l1.t.J(hVar13, rVarC3, sVar);
            z1.r rVarE2 = e2.e(oVar, 1.0f);
            a2 a2VarA = z1.a(j0.i.f35307e, z1.c.M, sVar, 54);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar11, a2VarA, sVar);
            l1.t.J(hVar12, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
            }
            l1.t.J(hVar13, rVarC4, sVar);
            boolean z13 = d0Var.f38451l;
            float f12 = 48;
            z1.r rVarG = e2.g(oVar, f12);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarY2 = j0.c.y(rVarG.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 10, CropImageView.DEFAULT_ASPECT_RATIO, i13);
            r0.e eVar = r0.f.f48733a;
            r0.e eVar2 = new r0.e(new r0.d(50.0f), new r0.d(CropImageView.DEFAULT_ASPECT_RATIO), new r0.d(CropImageView.DEFAULT_ASPECT_RATIO), new r0.d(50.0f));
            j0.v1 v1Var = h1.j0.f30447a;
            c3 c3Var = v1.f31180a;
            h1.i0 i0VarA = h1.j0.a(((s1) sVar.j(c3Var)).f31019b, ((s1) sVar.j(c3Var)).f31017a, sVar, 12);
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ2 = sVar.Q();
            l1.g gVar4 = gVar;
            if (z14 || objQ2 == gVar4) {
                objQ2 = new m(4, aVar2);
                sVar.o0(objQ2);
            }
            l1.s sVar2 = sVar;
            k7.i((fz.a) objQ2, rVarY2, z13, eVar2, i0VarA, null, null, a.f36569o, sVar2, 805306368, 480);
            z1.r rVarD = z1.a.d(e2.n(oVar, 104), 2.0f);
            boolean z15 = (i15 & 896) == 256;
            Object objQ3 = sVar2.Q();
            if (z15 || objQ3 == gVar4) {
                aVar4 = aVar;
                objQ3 = new m(5, aVar4);
                sVar2.o0(objQ3);
            } else {
                aVar4 = aVar;
            }
            k7.d(d0.n.o(rVarD, false, null, (fz.a) objQ3, 15), r0.f.f48733a, k7.p(((s1) sVar2.j(c3Var)).f31017a, sVar2, 0), null, d0.n.a(((s1) sVar2.j(c3Var)).f31019b, i13), t1.e.d(413490292, new at.p(i14, d0Var, aVar4), sVar2), sVar2, 196608, 8);
            z1.r rVarG2 = e2.g(oVar, f12);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarY3 = j0.c.y(rVarG2.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), -10, CropImageView.DEFAULT_ASPECT_RATIO, i13);
            r0.e eVar3 = new r0.e(new r0.d(CropImageView.DEFAULT_ASPECT_RATIO), new r0.d(50.0f), new r0.d(50.0f), new r0.d(CropImageView.DEFAULT_ASPECT_RATIO));
            h1.i0 i0VarA2 = h1.j0.a(((s1) sVar2.j(c3Var)).f31019b, ((s1) sVar2.j(c3Var)).f31017a, sVar2, 12);
            boolean z16 = (i15 & 57344) == 16384;
            Object objQ4 = sVar2.Q();
            if (z16 || objQ4 == gVar4) {
                aVar5 = aVar3;
                objQ4 = new m(6, aVar5);
                sVar2.o0(objQ4);
            } else {
                aVar5 = aVar3;
            }
            k7.i((fz.a) objQ4, rVarY3, true, eVar3, i0VarA2, null, null, t1.e.d(365439019, new a00.b(d0Var, 19), sVar2), sVar2, 805306752, 480);
            sVar = sVar2;
            com.google.android.material.datepicker.d.B(sVar, true, true, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.v1(d0Var, rVar, aVar, aVar2, aVar5, i11, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x0218  */
    /* JADX WARN: Code duplicated, block: B:78:0x0242  */
    /* JADX WARN: Code duplicated, block: B:84:0x0270  */
    /* JADX WARN: Code duplicated, block: B:88:0x029a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void d(final int i11, final long j11, final fz.e onNavigateToFinish, final fz.a onNavigateBack, final fz.e onNavigateToSettings, kr.g0 g0Var, l1.n nVar, final int i12) {
        final kr.g0 g0Var2;
        int i13;
        kr.g0 g0Var3;
        int i14;
        l1.g gVar;
        boolean zH;
        Object objQ;
        boolean zH2;
        Object objQ2;
        boolean zH3;
        kr.g0 g0Var4;
        Object objQ3;
        boolean zH4;
        Object objQ4;
        boolean zH5;
        Object objQ5;
        kr.g0 g0Var5;
        boolean zH6;
        Object objQ6;
        kotlin.jvm.internal.m.f(onNavigateToFinish, "onNavigateToFinish");
        kotlin.jvm.internal.m.f(onNavigateBack, "onNavigateBack");
        kotlin.jvm.internal.m.f(onNavigateToSettings, "onNavigateToSettings");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(578894042);
        int i15 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.e(j11) ? 32 : 16) | (sVar.h(onNavigateToFinish) ? 256 : 128) | (sVar.h(onNavigateBack) ? 2048 : 1024) | 65536;
        if (sVar.T(i15 & 1, (74899 & i15) != 74898)) {
            sVar.Y();
            int i16 = i12 & 1;
            l1.g gVar2 = l1.m.f39353a;
            if (i16 == 0 || sVar.C()) {
                boolean z11 = (i15 & 14) == 4;
                Object objQ7 = sVar.Q();
                if (z11 || objQ7 == gVar2) {
                    objQ7 = new fu.x(i11, 2);
                    sVar.o0(objQ7);
                }
                fz.a aVar = (fz.a) objQ7;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(kr.g0.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                i13 = i15 & (-458753);
                g0Var3 = (kr.g0) viewModelA;
            } else {
                sVar.W();
                i13 = i15 & (-458753);
                g0Var3 = g0Var;
            }
            sVar.q();
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(g0Var3.f38468f, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            sVar.d0(-1614864554);
            ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModel viewModelA2 = i20.b.a(kotlin.jvm.internal.z.a(p0.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar), null);
            sVar.p(false);
            p0 p0Var = (p0) viewModelA2;
            b3 b3VarCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(p0Var.f38557c, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            n0 n0Var = (n0) b3VarCollectAsStateWithLifecycle2.getValue();
            if (kotlin.jvm.internal.m.a(n0Var, kr.l0.f38522a)) {
                i14 = -1;
            } else {
                if (!(n0Var instanceof m0)) {
                    throw new NoWhenBranchMatchedException();
                }
                n0 n0Var2 = (n0) b3VarCollectAsStateWithLifecycle2.getValue();
                kotlin.jvm.internal.m.d(n0Var2, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySettingsUiState.Success");
                i14 = ((m0) n0Var2).f38531b.f38477b;
            }
            kr.e0 e0Var = (kr.e0) b3VarCollectAsStateWithLifecycle.getValue();
            if (kotlin.jvm.internal.m.a(e0Var, kr.c0.f38433a)) {
                sVar.d0(-2028546167);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
                g0Var5 = g0Var3;
            } else {
                if (!(e0Var instanceof kr.d0)) {
                    throw nv.p.x(sVar, -2028546918, false);
                }
                sVar.d0(1539664352);
                kr.e0 e0Var2 = (kr.e0) b3VarCollectAsStateWithLifecycle.getValue();
                kotlin.jvm.internal.m.d(e0Var2, "null cannot be cast to non-null type com.lingo.story.viewmodels.StoryReadingUiState.Success");
                kr.d0 d0Var = (kr.d0) e0Var2;
                boolean zH7 = sVar.h(g0Var3);
                Object objQ8 = sVar.Q();
                if (zH7) {
                    gVar = gVar2;
                } else {
                    gVar = gVar2;
                    if (objQ8 == gVar) {
                    }
                    fz.a aVar2 = (fz.a) ((mz.e) objQ8);
                    zH = sVar.h(g0Var3);
                    objQ = sVar.Q();
                    if (zH || objQ == gVar) {
                        objQ = new y2(0, g0Var3, kr.g0.class, "stopAudio", "stopAudio()V", 0, 9);
                        sVar.o0(objQ);
                    }
                    fz.a aVar3 = (fz.a) ((mz.e) objQ);
                    zH2 = sVar.h(g0Var3);
                    objQ2 = sVar.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new y2(0, g0Var3, kr.g0.class, "goToPrevious", "goToPrevious()V", 0, 10);
                        sVar.o0(objQ2);
                    }
                    fz.a aVar4 = (fz.a) ((mz.e) objQ2);
                    zH3 = sVar.h(g0Var3);
                    g0Var4 = g0Var3;
                    objQ3 = sVar.Q();
                    if (zH3 || objQ3 == gVar) {
                        objQ3 = new y2(0, g0Var4, kr.g0.class, "goToNext", "goToNext()V", 0, 11);
                        sVar.o0(objQ3);
                    }
                    fz.a aVar5 = (fz.a) ((mz.e) objQ3);
                    zH4 = sVar.h(g0Var4);
                    objQ4 = sVar.Q();
                    if (zH4 || objQ4 == gVar) {
                        objQ4 = new a3(1, g0Var4, kr.g0.class, "answerCurrentQuestion", "answerCurrentQuestion(Z)V", 0, 11);
                        sVar.o0(objQ4);
                    }
                    fz.c cVar = (fz.c) ((mz.e) objQ4);
                    zH5 = sVar.h(g0Var4);
                    objQ5 = sVar.Q();
                    if (!zH5 || objQ5 == gVar) {
                        g0Var5 = g0Var4;
                        objQ5 = new y2(0, g0Var5, kr.g0.class, "clearQuestion", "clearQuestion()V", 0, 12);
                        sVar.o0(objQ5);
                    } else {
                        g0Var5 = g0Var4;
                    }
                    fz.a aVar6 = (fz.a) ((mz.e) objQ5);
                    zH6 = sVar.h(p0Var);
                    objQ6 = sVar.Q();
                    if (zH6 || objQ6 == gVar) {
                        objQ6 = new v(p0Var, 0);
                        sVar.o0(objQ6);
                    }
                    e(d0Var, i11, j11, aVar2, aVar3, aVar4, aVar5, cVar, aVar6, onNavigateToFinish, onNavigateBack, onNavigateToSettings, i14, (fz.a) objQ6, sVar, ((i13 << 3) & 1008) | ((i13 << 21) & 1879048192), (i13 >> 9) & 126);
                    sVar = sVar;
                    sVar.p(false);
                }
                objQ8 = new y2(0, g0Var3, kr.g0.class, "playAudio", "playAudio()V", 0, 8);
                sVar.o0(objQ8);
                fz.a aVar7 = (fz.a) ((mz.e) objQ8);
                zH = sVar.h(g0Var3);
                objQ = sVar.Q();
                if (zH) {
                    objQ = new y2(0, g0Var3, kr.g0.class, "stopAudio", "stopAudio()V", 0, 9);
                    sVar.o0(objQ);
                } else {
                    objQ = new y2(0, g0Var3, kr.g0.class, "stopAudio", "stopAudio()V", 0, 9);
                    sVar.o0(objQ);
                }
                fz.a aVar8 = (fz.a) ((mz.e) objQ);
                zH2 = sVar.h(g0Var3);
                objQ2 = sVar.Q();
                if (zH2) {
                    objQ2 = new y2(0, g0Var3, kr.g0.class, "goToPrevious", "goToPrevious()V", 0, 10);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new y2(0, g0Var3, kr.g0.class, "goToPrevious", "goToPrevious()V", 0, 10);
                    sVar.o0(objQ2);
                }
                fz.a aVar9 = (fz.a) ((mz.e) objQ2);
                zH3 = sVar.h(g0Var3);
                g0Var4 = g0Var3;
                objQ3 = sVar.Q();
                if (zH3) {
                    objQ3 = new y2(0, g0Var4, kr.g0.class, "goToNext", "goToNext()V", 0, 11);
                    sVar.o0(objQ3);
                } else {
                    objQ3 = new y2(0, g0Var4, kr.g0.class, "goToNext", "goToNext()V", 0, 11);
                    sVar.o0(objQ3);
                }
                fz.a aVar10 = (fz.a) ((mz.e) objQ3);
                zH4 = sVar.h(g0Var4);
                objQ4 = sVar.Q();
                if (zH4) {
                    objQ4 = new a3(1, g0Var4, kr.g0.class, "answerCurrentQuestion", "answerCurrentQuestion(Z)V", 0, 11);
                    sVar.o0(objQ4);
                } else {
                    objQ4 = new a3(1, g0Var4, kr.g0.class, "answerCurrentQuestion", "answerCurrentQuestion(Z)V", 0, 11);
                    sVar.o0(objQ4);
                }
                fz.c cVar2 = (fz.c) ((mz.e) objQ4);
                zH5 = sVar.h(g0Var4);
                objQ5 = sVar.Q();
                if (zH5) {
                    g0Var5 = g0Var4;
                    objQ5 = new y2(0, g0Var5, kr.g0.class, "clearQuestion", "clearQuestion()V", 0, 12);
                    sVar.o0(objQ5);
                } else {
                    g0Var5 = g0Var4;
                    objQ5 = new y2(0, g0Var5, kr.g0.class, "clearQuestion", "clearQuestion()V", 0, 12);
                    sVar.o0(objQ5);
                }
                fz.a aVar11 = (fz.a) ((mz.e) objQ5);
                zH6 = sVar.h(p0Var);
                objQ6 = sVar.Q();
                if (zH6) {
                    objQ6 = new v(p0Var, 0);
                    sVar.o0(objQ6);
                } else {
                    objQ6 = new v(p0Var, 0);
                    sVar.o0(objQ6);
                }
                e(d0Var, i11, j11, aVar7, aVar8, aVar9, aVar10, cVar2, aVar11, onNavigateToFinish, onNavigateBack, onNavigateToSettings, i14, (fz.a) objQ6, sVar, ((i13 << 3) & 1008) | ((i13 << 21) & 1879048192), (i13 >> 9) & 126);
                sVar = sVar;
                sVar.p(false);
            }
            g0Var2 = g0Var5;
        } else {
            sVar.W();
            g0Var2 = g0Var;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(i11, j11, onNavigateToFinish, onNavigateBack, onNavigateToSettings, g0Var2, i12) { // from class: jr.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f36716a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f36717b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ fz.e f36718c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fz.a f36719d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fz.e f36720e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ kr.g0 f36721f;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(24577);
                    z.d(this.f36716a, this.f36717b, this.f36718c, this.f36719d, this.f36720e, this.f36721f, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0262  */
    /* JADX WARN: Code duplicated, block: B:142:0x0266  */
    /* JADX WARN: Code duplicated, block: B:147:0x0287  */
    /* JADX WARN: Code duplicated, block: B:150:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c4  */
    public static final void e(kr.d0 d0Var, final int i11, final long j11, final fz.a playAudio, final fz.a stopAudio, final fz.a goToPrevious, final fz.a goToNext, final fz.c answerCurrentQuestion, final fz.a clearQuestion, final fz.e onNavigateToFinish, final fz.a onNavigateBack, final fz.e onNavigateToSettings, final int i12, final fz.a updateScriptShortcutDisplay, l1.n nVar, final int i13, final int i14) {
        int i15;
        int i16;
        l1.s sVar;
        Boolean bool;
        l1.g gVar;
        int i17;
        l1.g gVar2;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        Object objQ;
        Object objQ2;
        final kr.d0 d0Var2 = d0Var;
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        kotlin.jvm.internal.m.f(stopAudio, "stopAudio");
        kotlin.jvm.internal.m.f(goToPrevious, "goToPrevious");
        kotlin.jvm.internal.m.f(goToNext, "goToNext");
        kotlin.jvm.internal.m.f(answerCurrentQuestion, "answerCurrentQuestion");
        kotlin.jvm.internal.m.f(clearQuestion, "clearQuestion");
        kotlin.jvm.internal.m.f(onNavigateToFinish, "onNavigateToFinish");
        kotlin.jvm.internal.m.f(onNavigateBack, "onNavigateBack");
        kotlin.jvm.internal.m.f(onNavigateToSettings, "onNavigateToSettings");
        kotlin.jvm.internal.m.f(updateScriptShortcutDisplay, "updateScriptShortcutDisplay");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-300896409);
        if ((i13 & 6) == 0) {
            i15 = (sVar2.h(d0Var2) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= sVar2.d(i11) ? 32 : 16;
        }
        int i18 = i15;
        if ((i13 & 384) == 0) {
            i18 |= sVar2.e(j11) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i18 |= sVar2.h(playAudio) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i18 |= sVar2.h(stopAudio) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i13) == 0) {
            i18 |= sVar2.h(goToPrevious) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i13) == 0) {
            i18 |= sVar2.h(goToNext) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i18 |= sVar2.h(answerCurrentQuestion) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i18 |= sVar2.h(clearQuestion) ? 67108864 : 33554432;
        }
        if ((805306368 & i13) == 0) {
            i18 |= sVar2.h(onNavigateToFinish) ? 536870912 : 268435456;
        }
        int i19 = i18;
        if ((i14 & 6) == 0) {
            i16 = i14 | (sVar2.h(onNavigateBack) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= sVar2.h(onNavigateToSettings) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= sVar2.d(i12) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= sVar2.h(updateScriptShortcutDisplay) ? 2048 : 1024;
        }
        if (sVar2.T(i19 & 1, ((i19 & 306783379) == 306783378 && (i16 & 1171) == 1170) ? false : true)) {
            Boolean boolValueOf = Boolean.valueOf(d0Var2.f38452n);
            boolean zH = sVar2.h(d0Var2) | ((1879048192 & i19) == 536870912) | ((i19 & 112) == 32) | ((i19 & 896) == 256);
            Object objQ3 = sVar2.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (zH || objQ3 == gVar3) {
                bool = boolValueOf;
                gVar = gVar3;
                sVar = sVar2;
                i17 = 16384;
                w1 w1Var = new w1(d0Var2, onNavigateToFinish, i11, j11, (vy.d) null);
                sVar.o0(w1Var);
                objQ3 = w1Var;
            } else {
                bool = boolValueOf;
                sVar = sVar2;
                gVar = gVar3;
                i17 = 16384;
            }
            l1.t.f((fz.e) objQ3, bool, sVar);
            Boolean bool2 = Boolean.TRUE;
            boolean z11 = (i19 & 57344) == i17;
            Object objQ4 = sVar.Q();
            if (z11) {
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if (objQ4 == gVar2) {
                }
                l1.t.c(bool2, (fz.c) objQ4, sVar);
                d0Var2 = d0Var;
                p7.a(null, t1.e.d(1420088611, new dt.l(onNavigateBack, onNavigateToSettings, i11, j11, i12, updateScriptShortcutDisplay), sVar), null, null, null, 0, 0L, 0L, null, t1.e.d(-1810803400, new br.j(d0Var2, playAudio, goToPrevious, goToNext, 7), sVar), sVar, 805306416, 509);
                j0.u uVarA = j0.t.a(j0.i.f35306d, z1.c.O, sVar, 6);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.o oVar = z1.o.f58481a;
                z1.r rVarC = z1.a.c(sVar, oVar);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                j0.c.g(sVar, j0.v.a(oVar, 1.0f));
                boolean z12 = d0Var2.f38450k;
                b0.v vVar = b0.b0.f3438a;
                i2 i2VarR = b0.e.r(LogSeverity.NOTICE_VALUE, 0, vVar, 2);
                objQ = sVar.Q();
                if (objQ == gVar2) {
                    objQ = new k2(29);
                    sVar.o0(objQ);
                }
                l1 l1VarQ = f1.q(i2VarR, (fz.c) objQ);
                i2 i2VarR2 = b0.e.r(LogSeverity.NOTICE_VALUE, 0, vVar, 2);
                objQ2 = sVar.Q();
                if (objQ2 == gVar2) {
                    objQ2 = new k2(29);
                    sVar.o0(objQ2);
                }
                a0.j0.c(z12, e2.c(oVar, 0.55f), l1VarQ, f1.v(i2VarR2, (fz.c) objQ2), null, t1.e.d(16473049, new defpackage.d(d0Var2, answerCurrentQuestion, clearQuestion), sVar), sVar, 1573254, 16);
                sVar.p(true);
            }
            objQ4 = new r0(8, stopAudio);
            sVar.o0(objQ4);
            l1.t.c(bool2, (fz.c) objQ4, sVar);
            d0Var2 = d0Var;
            p7.a(null, t1.e.d(1420088611, new dt.l(onNavigateBack, onNavigateToSettings, i11, j11, i12, updateScriptShortcutDisplay), sVar), null, null, null, 0, 0L, 0L, null, t1.e.d(-1810803400, new br.j(d0Var2, playAudio, goToPrevious, goToNext, 7), sVar), sVar, 805306416, 509);
            j0.u uVarA2 = j0.t.a(j0.i.f35306d, z1.c.O, sVar, 6);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarC2 = z1.a.c(sVar, oVar2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA2, sVar);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            j0.c.g(sVar, j0.v.a(oVar2, 1.0f));
            boolean z13 = d0Var2.f38450k;
            b0.v vVar2 = b0.b0.f3438a;
            i2 i2VarR3 = b0.e.r(LogSeverity.NOTICE_VALUE, 0, vVar2, 2);
            objQ = sVar.Q();
            if (objQ == gVar2) {
                objQ = new k2(29);
                sVar.o0(objQ);
            }
            l1 l1VarQ2 = f1.q(i2VarR3, (fz.c) objQ);
            i2 i2VarR4 = b0.e.r(LogSeverity.NOTICE_VALUE, 0, vVar2, 2);
            objQ2 = sVar.Q();
            if (objQ2 == gVar2) {
                objQ2 = new k2(29);
                sVar.o0(objQ2);
            }
            a0.j0.c(z13, e2.c(oVar2, 0.55f), l1VarQ2, f1.v(i2VarR4, (fz.c) objQ2), null, t1.e.d(16473049, new defpackage.d(d0Var2, answerCurrentQuestion, clearQuestion), sVar), sVar, 1573254, 16);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: jr.x
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iM = l1.t.M(i13 | 1);
                    int iM2 = l1.t.M(i14);
                    z.e(d0Var2, i11, j11, playAudio, stopAudio, goToPrevious, goToNext, answerCurrentQuestion, clearQuestion, onNavigateToFinish, onNavigateBack, onNavigateToSettings, i12, updateScriptShortcutDisplay, (l1.n) obj, iM, iM2);
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
