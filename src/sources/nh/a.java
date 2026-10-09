package nh;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bp.e0;
import bp.f0;
import bt.g5;
import bt.h7;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fu.j0;
import h1.a6;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import h1.x8;
import j0.e2;
import j0.o;
import j0.u;
import java.util.List;
import jr.i0;
import k9.p;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.b3;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import mt.k;
import mt.n4;
import w2.q0;
import y2.j;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f43773a = new t1.d(new k(11, (byte) 0), false, 122803564);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f43774b = new t1.d(new mt.i(25), false, 860786895);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f43775c = new t1.d(new k(12, (byte) 0), false, -1514123160);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f43776d = new t1.d(new k(13, (byte) 0), false, 2118021179);

    public static final void a(r rVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1314222858);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            q0 q0VarD = o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, uVarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            d0.n.c(se.k.y(R.drawable.ic_empty_collection, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 124);
            j0.c.g(sVar, e2.g(oVar, 16));
            ua.b(ub.a.e0(sVar, R.string.please_go_to_learn_and_start_your_first_lesson), null, ((s1) sVar.j(v1.f31180a)).f31036s, 0L, null, n3.s.H, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 196608, 0, 64986);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 15);
        }
    }

    public static final void b(List allCategories, List allStatuses, List selectedCategories, List selectedStatuses, fz.e updateSelectedTags, fz.a onDismissRequest, n nVar, int i11) {
        s sVar;
        m.f(allCategories, "allCategories");
        m.f(allStatuses, "allStatuses");
        m.f(selectedCategories, "selectedCategories");
        m.f(selectedStatuses, "selectedStatuses");
        m.f(updateSelectedTags, "updateSelectedTags");
        m.f(onDismissRequest, "onDismissRequest");
        s sVar2 = (s) nVar;
        sVar2.f0(-1340722680);
        int i12 = i11 | (sVar2.h(allCategories) ? 4 : 2) | (sVar2.h(selectedCategories) ? 256 : 128) | (sVar2.h(selectedStatuses) ? 2048 : 1024) | (sVar2.h(updateSelectedTags) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar2.T(i12 & 1, (74883 & i12) != 74882)) {
            sVar = sVar2;
            a6.a(onDismissRequest, null, a6.f(6, 2, null, sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-1913724187, new br.j(selectedCategories, selectedStatuses, updateSelectedTags, allCategories, 14), sVar2), sVar, 6, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f0(allCategories, (Object) allStatuses, (Object) selectedCategories, (Object) selectedStatuses, (qy.e) updateSelectedTags, onDismissRequest, i11, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(String difficulty, fz.c onLessonClick, fz.a onBackClick, ph.k kVar, n nVar, int i11) {
        fz.c cVar;
        ph.k kVar2;
        s sVar;
        int i12;
        ph.k kVar3;
        Object h7Var;
        o9.b bVar;
        b3 b3Var;
        b1 b1Var;
        ph.k kVar4;
        b1 b1Var2;
        Object obj;
        ?? r9;
        s sVar2;
        boolean z11;
        m.f(difficulty, "difficulty");
        m.f(onLessonClick, "onLessonClick");
        m.f(onBackClick, "onBackClick");
        s sVar3 = (s) nVar;
        sVar3.f0(16169764);
        int i13 = i11 | (sVar3.f(difficulty) ? 4 : 2) | (sVar3.h(onLessonClick) ? 32 : 16) | (sVar3.h(onBackClick) ? 256 : 128) | 1024;
        if (sVar3.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar3.Y();
            int i14 = i11 & 1;
            Object obj2 = l1.m.f39353a;
            if (i14 == 0 || sVar3.C()) {
                boolean z12 = (i13 & 14) == 4;
                Object objQ = sVar3.Q();
                if (z12 || objQ == obj2) {
                    objQ = new ar.a(difficulty, 10);
                    sVar3.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar3.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar3, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(ph.k.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar3), aVar);
                sVar3.p(false);
                i12 = i13 & (-7169);
                kVar3 = (ph.k) viewModelA;
            } else {
                sVar3.W();
                i12 = i13 & (-7169);
                kVar3 = kVar;
            }
            sVar3.q();
            final o9.b bVarA = o9.d.a(kVar3.O, sVar3);
            b1 b1VarO = t.o(kVar3.f46884t, sVar3);
            b1 b1VarO2 = t.o(kVar3.K, sVar3);
            Object objQ2 = sVar3.Q();
            if (objQ2 == obj2) {
                objQ2 = t.B(Boolean.FALSE);
                sVar3.o0(objQ2);
            }
            b1 b1Var3 = (b1) objQ2;
            Object objQ3 = sVar3.Q();
            if (objQ3 == obj2) {
                final int i15 = 0;
                objQ3 = t.s(new fz.a() { // from class: nh.c
                    @Override // fz.a
                    public final Object invoke() {
                        boolean z13;
                        switch (i15) {
                            case 0:
                                z13 = bVarA.d().f43541a instanceof n9.t;
                                break;
                            case 1:
                                z13 = bVarA.d().f43543c instanceof n9.t;
                                break;
                            default:
                                o9.b bVar2 = bVarA;
                                return Boolean.valueOf((bVar2.d().f43541a instanceof n9.s) || (bVar2.d().f43543c instanceof n9.s));
                        }
                        return Boolean.valueOf(z13);
                    }
                });
                sVar3.o0(objQ3);
            }
            b3 b3Var2 = (b3) objQ3;
            Object objQ4 = sVar3.Q();
            if (objQ4 == obj2) {
                final int i16 = 1;
                objQ4 = t.s(new fz.a() { // from class: nh.c
                    @Override // fz.a
                    public final Object invoke() {
                        boolean z13;
                        switch (i16) {
                            case 0:
                                z13 = bVarA.d().f43541a instanceof n9.t;
                                break;
                            case 1:
                                z13 = bVarA.d().f43543c instanceof n9.t;
                                break;
                            default:
                                o9.b bVar2 = bVarA;
                                return Boolean.valueOf((bVar2.d().f43541a instanceof n9.s) || (bVar2.d().f43543c instanceof n9.s));
                        }
                        return Boolean.valueOf(z13);
                    }
                });
                sVar3.o0(objQ4);
            }
            b3 b3Var3 = (b3) objQ4;
            Object objQ5 = sVar3.Q();
            if (objQ5 == obj2) {
                final int i17 = 2;
                objQ5 = t.s(new fz.a() { // from class: nh.c
                    @Override // fz.a
                    public final Object invoke() {
                        boolean z13;
                        switch (i17) {
                            case 0:
                                z13 = bVarA.d().f43541a instanceof n9.t;
                                break;
                            case 1:
                                z13 = bVarA.d().f43543c instanceof n9.t;
                                break;
                            default:
                                o9.b bVar2 = bVarA;
                                return Boolean.valueOf((bVar2.d().f43541a instanceof n9.s) || (bVar2.d().f43543c instanceof n9.s));
                        }
                        return Boolean.valueOf(z13);
                    }
                });
                sVar3.o0(objQ5);
            }
            b3 b3Var4 = (b3) objQ5;
            Integer numValueOf = Integer.valueOf(bVarA.c());
            Boolean bool = (Boolean) b3Var2.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) b3Var3.getValue();
            bool2.getClass();
            Boolean bool3 = (Boolean) b3Var4.getValue();
            bool3.getClass();
            Object[] objArr = {numValueOf, bool, bool2, bool3};
            boolean zH = ((i12 & 14) == 4) | sVar3.h(bVarA);
            Object objQ6 = sVar3.Q();
            if (zH || objQ6 == obj2) {
                bVar = bVarA;
                b3Var = b3Var2;
                b1Var = b1Var3;
                kVar4 = kVar3;
                h7Var = new h7(difficulty, bVar, b3Var, b3Var3, b3Var4, null, 2);
                sVar3.o0(h7Var);
            } else {
                kVar4 = kVar3;
                h7Var = objQ6;
                bVar = bVarA;
                b1Var = b1Var3;
                b3Var = b3Var2;
            }
            t.i(objArr, (fz.e) h7Var, sVar3);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar3.d0(678929128);
                List list = kVar4.f46881d;
                yy.a aVar2 = kVar4.f46882e;
                List list2 = (List) b1VarO.getValue();
                List list3 = (List) b1VarO2.getValue();
                boolean zH2 = sVar3.h(kVar4);
                Object objQ7 = sVar3.Q();
                if (zH2 || objQ7 == obj2) {
                    objQ7 = new p(18, kVar4, b1Var);
                    sVar3.o0(objQ7);
                }
                fz.e eVar = (fz.e) objQ7;
                Object objQ8 = sVar3.Q();
                if (objQ8 == obj2) {
                    objQ8 = new n4(18, b1Var);
                    sVar3.o0(objQ8);
                }
                fz.a aVar3 = (fz.a) objQ8;
                kVar2 = kVar4;
                b1Var2 = b1Var;
                obj = obj2;
                r9 = 0;
                b(list, aVar2, list2, list3, eVar, aVar3, sVar3, 196608);
                sVar2 = sVar3;
            } else {
                kVar2 = kVar4;
                b1Var2 = b1Var;
                obj = obj2;
                r9 = 0;
                sVar3.d0(675266974);
                sVar2 = sVar3;
            }
            sVar2.p(r9);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, r9);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar2, oVar);
            y2.k.J.getClass();
            fz.a aVar4 = j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(aVar4);
            } else {
                sVar2.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar2);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = j.f56918g;
            b3 b3Var5 = b3Var;
            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar2);
            s sVar4 = sVar2;
            iu.k.g(onBackClick, null, t1.e.d(-1719373127, new e0(difficulty, 22), sVar2), null, t1.e.d(-1420118321, new g5(6, b1Var2), sVar2), null, null, null, sVar4, ((i12 >> 6) & 14) | 24960, 234);
            ef.e.f(((Boolean) b3Var5.getValue()).booleanValue() && bVar.c() != 0, sVar4, 6);
            r rVarD = e2.d(oVar, 1.0f);
            q0 q0VarD = o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar4.T);
            q1 q1VarL2 = sVar4.l();
            r rVarC2 = z1.a.c(sVar4, rVarD);
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(aVar4);
            } else {
                sVar4.r0();
            }
            t.J(hVar, q0VarD, sVar4);
            t.J(hVar2, q1VarL2, sVar4);
            if (sVar4.S || !m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar4);
            j0.g gVarG = j0.i.g(16);
            float f5 = 18;
            float f11 = 24;
            j0.v1 v1Var = new j0.v1(f5, f11, f5, f11);
            boolean zH3 = sVar4.h(bVar) | ((i12 & 112) == 32) | sVar4.h(kVar2);
            Object objQ9 = sVar4.Q();
            if (zH3 || objQ9 == obj) {
                cVar = onLessonClick;
                objQ9 = new j0(bVar, cVar, kVar2, 25);
                sVar4.o0(objQ9);
            } else {
                cVar = onLessonClick;
            }
            ue.f.a(null, null, v1Var, gVarG, null, null, false, null, (fz.c) objQ9, sVar4, 24960, 491);
            s sVar5 = sVar4;
            if (bVar.c() == 0) {
                sVar5.d0(-1170761455);
                ef.e.e(bVar.d().f43541a, e2.d(oVar, 1.0f), null, sVar5, 48);
                z11 = false;
            } else {
                z11 = false;
                sVar5.d0(-1176716710);
            }
            sVar5.p(z11);
            sVar5.p(true);
            sVar5.p(true);
            sVar = sVar5;
        } else {
            cVar = onLessonClick;
            sVar3.W();
            kVar2 = kVar;
            sVar = sVar3;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(difficulty, cVar, onBackClick, kVar2, i11);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void d(fz.c onLessonClick, fz.a onBackClick, r rVar, ph.o oVar, n nVar, int i11) {
        r rVar2;
        ph.o oVar2;
        ph.o oVar3;
        int i12;
        r rVar3;
        ph.o oVar4;
        m.f(onLessonClick, "onLessonClick");
        m.f(onBackClick, "onBackClick");
        s sVar = (s) nVar;
        sVar.f0(-1543122019);
        int i13 = i11 | (sVar.h(onLessonClick) ? 4 : 2) | (sVar.h(onBackClick) ? 32 : 16) | 1408;
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.Y();
            int i14 = i11 & 1;
            z1.o oVar5 = z1.o.f58481a;
            if (i14 == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(ph.o.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                oVar3 = (ph.o) viewModelA;
                i12 = i13 & (-7169);
                rVar3 = oVar5;
            } else {
                sVar.W();
                oVar3 = oVar;
                i12 = i13 & (-7169);
                rVar3 = rVar;
            }
            sVar.q();
            b1 b1VarO = t.o(oVar3.f46898c, sVar);
            b1 b1VarO2 = t.o(oVar3.f46900e, sVar);
            b1 b1VarO3 = t.o(oVar3.f46902t, sVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new x8();
                sVar.o0(objQ);
            }
            x8 x8Var = (x8) objQ;
            String str = (String) b1VarO3.getValue();
            boolean zF = sVar.f(b1VarO3) | sVar.h(oVar3);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = new i0(b1VarO3, x8Var, oVar3, (vy.d) null);
                sVar.o0(objQ2);
            }
            t.f((fz.e) objQ2, str, sVar);
            r rVarD = e2.d(rVar3, 1.0f);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            y2.k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            ph.o oVar6 = oVar3;
            r rVar4 = rVar3;
            iu.k.g(onBackClick, null, f43775c, null, null, null, null, null, sVar, ((i12 >> 3) & 14) | 384, 250);
            r rVarD2 = e2.d(oVar5, 1.0f);
            q0 q0VarD = o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarD2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, q0VarD, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            if (((Boolean) b1VarO2.getValue()).booleanValue() && ((List) b1VarO.getValue()).isEmpty()) {
                sVar.d0(1872956145);
                tv.a.d(6, 0, sVar, e2.d(oVar5, 1.0f));
                sVar.p(false);
            } else {
                if (((Boolean) b1VarO2.getValue()).booleanValue() || !((List) b1VarO.getValue()).isEmpty()) {
                    sVar.d0(1873331617);
                    List list = (List) b1VarO.getValue();
                    oVar4 = oVar6;
                    boolean zH = sVar.h(oVar4);
                    Object objQ3 = sVar.Q();
                    if (zH || objQ3 == gVar) {
                        objQ3 = new kp.j(oVar4, 21);
                        sVar.o0(objQ3);
                    }
                    e(list, onLessonClick, (fz.c) objQ3, e2.d(oVar5, 1.0f), sVar, ((i12 << 3) & 112) | 3072);
                    sVar.p(false);
                } else {
                    sVar.d0(1873127606);
                    a(e2.d(oVar5, 1.0f), sVar, 6);
                    sVar.p(false);
                }
                k7.l(x8Var, j0.r.f35391a.a(oVar5, z1.c.H), null, sVar, 6);
                sVar.p(true);
                sVar.p(true);
                oVar2 = oVar4;
                rVar2 = rVar4;
            }
            oVar4 = oVar6;
            k7.l(x8Var, j0.r.f35391a.a(oVar5, z1.c.H), null, sVar, 6);
            sVar.p(true);
            sVar.p(true);
            oVar2 = oVar4;
            rVar2 = rVar4;
        } else {
            sVar.W();
            rVar2 = rVar;
            oVar2 = oVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(onLessonClick, onBackClick, rVar2, oVar2, i11, 28);
        }
    }

    public static final void e(List list, fz.c cVar, fz.c cVar2, r rVar, n nVar, int i11) {
        int i12;
        r rVar2;
        s sVar = (s) nVar;
        sVar.f0(1907624167);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(cVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            rVar2 = rVar;
            i12 |= sVar.f(rVar2) ? 2048 : 1024;
        } else {
            rVar2 = rVar;
        }
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            j0.g gVarG = j0.i.g(16);
            float f5 = 18;
            float f11 = 24;
            j0.v1 v1Var = new j0.v1(f5, f11, f5, f11);
            boolean zH = sVar.h(list) | ((i12 & 112) == 32) | ((i12 & 896) == 256);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new j0(list, cVar, cVar2, 28);
                sVar.o0(objQ);
            }
            ue.f.a(rVar2, null, v1Var, gVarG, null, null, false, null, (fz.c) objQ, sVar, ((i12 >> 9) & 14) | 24960, 490);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(list, cVar, cVar2, rVar, i11, 9);
        }
    }
}
