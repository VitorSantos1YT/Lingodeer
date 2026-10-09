package bp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.logging.type.LogSeverity;
import com.google.protobuf.DescriptorProtos;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.object.LanguageExpandableItem2;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.object.LocateLanguageItem;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LanStaticsInfo;
import com.lingodeer.data.model.LearnProgress;
import com.lingodeer.database.model.LanguageHistoryEntity;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.UCrop;
import com.yalantis.ucrop.view.CropImageView;
import h1.a6;
import h1.e8;
import h1.k7;
import h1.p7;
import h1.t6;
import h1.ua;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import ko.Zea.ealNNtLp;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f4585a = new t1.d(new at.a(1), false, -247193774);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f4586b = new t1.d(new at.a(2), false, 1194257987);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f4587c = new t1.d(new at.a(3), false, 1532761157);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f4588d = new t1.d(new ah.e(27), false, -1049501750);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f4589e = new t1.d(new at.a(4), false, -1252547694);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f4590f = new t1.d(new ah.e(28), false, -524203030);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.d f4591g = new t1.d(new ah.e(29), false, -620182832);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t1.d f4592h = new t1.d(new at.a(5), false, -1066552577);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t1.d f4593i = new t1.d(new h1(0), false, 1913272650);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t1.d f4594j = new t1.d(new at.a(6), false, 784548189);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t1.d f4595k = new t1.d(new h1(1), false, 794195461);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t1.d f4596l = new t1.d(new at.a(7), false, 211870582);
    public static final t1.d m = new t1.d(new h1(2), false, -1992947311);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t1.d f4597n = new t1.d(new h1(3), false, 610665356);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t1.d f4598o = new t1.d(new h1(4), false, 1868393283);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t1.d f4599p = new t1.d(new at.a(8), false, -657794883);

    public static final void a(fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-31458786);
        int i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            float f5 = 12;
            z1.r rVarB = d2.h.b(j0.e2.e(j0.e2.g(j0.c.B(z1.o.f58481a, 18, 8), 84), 1.0f), r0.f.d(f5));
            boolean z11 = (i12 & 14) == 4;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new at.r(1, aVar);
                sVar.o0(objQ);
            }
            k7.k(d0.n.o(rVarB, false, null, (fz.a) objQ, 15), r0.f.d(f5), null, null, d0.n.a(g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31034q, 0.15f), 2), f4589e, sVar, 196608, 12);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.o(i11, 1, aVar);
        }
    }

    public static final void b(int i11, String str, String str2, z1.r rVar, l1.n nVar, int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1593397230);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128) | (sVar.f(rVar) ? 2048 : 1024);
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
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
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            k2.b bVarY = se.k.y(i11, sVar, i13 & 14);
            z1.o oVar = z1.o.f58481a;
            d0.n.c(bVarY, null, j0.e2.e(oVar, 1.0f), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25016, 104);
            z1.h hVar5 = z1.c.P;
            float f5 = 32;
            z1.r rVarE = j0.c.E(j0.e2.e(j0.r.f35391a.a(oVar, z1.c.f58464b), 1.0f), f5, f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8);
            j0.u uVarA = j0.t.a(j0.i.f35305c, hVar5, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
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
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0Var = (j3.y0) sVar.j(d0Var);
            long jK = se.i.k(sVar, R.color.white);
            long jA = fr.j3.A(18);
            n3.s sVar2 = n3.s.K;
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, jK, jA, sVar2, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, (i13 >> 3) & 14, 0, 65534);
            ua.b(str2, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), se.i.k(sVar, R.color.white), fr.j3.A(16), sVar2, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, ((i13 >> 6) & 14) | 48, 0, 65532);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new o1(i11, str, str2, rVar, i12, 0);
        }
    }

    public static final void c(fz.a aVar, fz.a aVar2, l1.n nVar, int i11) {
        fz.a aVar3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-253237650);
        int i12 = i11 | (sVar.h(aVar) ? 4 : 2) | (sVar.h(aVar2) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(j0.c.F(j0.e2.e(oVar, 1.0f)));
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            j0.c.g(sVar, j0.v.a(oVar, 1.0f));
            ua.b(ub.a.e0(sVar, R.string.what_s_your_level), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 22, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, fr.j3.A(22), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 48, 0, 65532);
            j0.c.g(sVar, j0.v.a(oVar, 1.0f));
            String strE0 = ub.a.e0(sVar, R.string.beginner_title);
            String strE1 = ub.a.e0(sVar, R.string.beginner_subtitle);
            boolean z11 = (i12 & 14) == 4;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new at.r(4, aVar);
                sVar.o0(objQ);
            }
            b(R.drawable.ic_have_base, strE0, strE1, iu.k.q(6, 7, (fz.a) objQ, sVar, oVar, false), sVar, 0);
            String strE2 = ub.a.e0(sVar, R.string.know_basic_title);
            String strE3 = ub.a.e0(sVar, R.string.know_basic_subtitle);
            boolean z12 = (i12 & 112) == 32;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                aVar3 = aVar2;
                objQ2 = new at.r(5, aVar3);
                sVar.o0(objQ2);
            } else {
                aVar3 = aVar2;
            }
            b(R.drawable.ic_have_no_base, strE2, strE3, iu.k.q(6, 7, (fz.a) objQ2, sVar, oVar, false), sVar, 0);
            sVar = sVar;
            j0.c.g(sVar, j0.v.a(oVar, 1.0f));
            sVar.p(true);
        } else {
            aVar3 = aVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n1(i11, 0, aVar, aVar3);
        }
    }

    public static final void d(String str, int i11, fz.c onLanguageSelected, fz.a onDismissRequest, l1.n nVar, int i12) {
        l1.s sVar;
        int i13;
        kotlin.jvm.internal.m.f(onLanguageSelected, "onLanguageSelected");
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-89421467);
        int i14 = i12 | 48 | (sVar2.h(onLanguageSelected) ? 256 : 128);
        if (sVar2.T(i14 & 1, (i14 & 1171) != 1170)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            e8 e8VarF = a6.f(6, 2, null, sVar2);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = new at.r(2, onDismissRequest);
                sVar2.o0(objQ2);
            }
            sVar = sVar2;
            a6.a((fz.a) objQ2, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-662422974, new v(str, -1, onLanguageSelected, b0Var, e8VarF, onDismissRequest), sVar2), sVar, 0, 384, 4090);
            i13 = -1;
        } else {
            sVar = sVar2;
            sVar.W();
            i13 = i11;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w(str, i13, onLanguageSelected, onDismissRequest, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:175:0x052e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0555  */
    /* JADX WARN: Code duplicated, block: B:181:0x0563  */
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
    public static final void e(String str, z1.r rVar, int i11, fz.c onLanguageSelected, ep.c cVar, l1.n nVar, int i12) {
        int i13;
        ep.c cVar2;
        int i14;
        ep.c cVar3;
        Object fVar;
        ep.c cVar4;
        x1.p pVar;
        l0.w wVar;
        l1.b1 b1Var;
        v3.m mVar;
        boolean z11;
        boolean z12;
        l1.g gVar;
        l1.b1 b1Var2;
        boolean z13;
        Object objQ;
        Object objQ2;
        Object xVar;
        l1.b1 b1Var3;
        kotlin.jvm.internal.m.f(onLanguageSelected, "onLanguageSelected");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(305975376);
        if ((i12 & 6) == 0) {
            i13 = (sVar.f(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i15 = i13 | (sVar.f(rVar) ? 32 : 16);
        if ((i12 & 384) == 0) {
            i15 |= sVar.d(i11) ? 256 : 128;
        }
        int i16 = i15 | (sVar.h(onLanguageSelected) ? 2048 : 1024) | OSSConstants.DEFAULT_BUFFER_SIZE;
        if (sVar.T(i16 & 1, (i16 & 9363) != 9362)) {
            sVar.Y();
            if ((i12 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(ep.c.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i14 = i16 & (-57345);
                cVar3 = (ep.c) viewModelA;
            } else {
                sVar.W();
                i14 = i16 & (-57345);
                cVar3 = cVar;
            }
            sVar.q();
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            Object objQ3 = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ3 == gVar2) {
                objQ3 = new x1.p();
                sVar.o0(objQ3);
            }
            x1.p pVar2 = (x1.p) objQ3;
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar2) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ4);
            }
            l1.b1 b1Var4 = (l1.b1) objQ4;
            l0.w wVarA = l0.y.a(0, sVar, 3);
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar2) {
                objQ5 = l1.t.B(null);
                sVar.o0(objQ5);
            }
            l1.b1 b1Var5 = (l1.b1) objQ5;
            int i17 = i14 & 896;
            boolean zH = ((i14 & 14) == 4) | sVar.h(cVar3) | sVar.h(context) | (i17 == 256);
            Object objQ6 = sVar.Q();
            if (zH || objQ6 == gVar2) {
                cVar4 = cVar3;
                fVar = new b0.f(str, cVar4, context, i11, pVar2, (vy.d) null);
                pVar = pVar2;
                sVar.o0(fVar);
            } else {
                pVar = pVar2;
                fVar = objQ6;
                cVar4 = cVar3;
            }
            l1.t.f((fz.e) fVar, qy.b0.f48488a, sVar);
            Integer numValueOf = Integer.valueOf(cVar4.f25723e.l());
            boolean zH2 = sVar.h(cVar4) | sVar.f(wVarA);
            Object objQ7 = sVar.Q();
            if (zH2 || objQ7 == gVar2) {
                objQ7 = new j0(cVar4, pVar, wVarA, null);
                sVar.o0(objQ7);
            }
            l1.t.f((fz.e) objQ7, numValueOf, sVar);
            v3.m mVar2 = kotlin.jvm.internal.m.a(cVar4.f25725t, "ar") ? v3.m.Rtl : v3.m.Ltr;
            boolean zF = sVar.f(cVar4.f25725t);
            Object objQ8 = sVar.Q();
            if (zF || objQ8 == gVar2) {
                Locale locale = kotlin.jvm.internal.m.a(cVar4.f25725t, "zh") ? Locale.TRADITIONAL_CHINESE : new Locale(cVar4.f25725t);
                kotlin.jvm.internal.m.c(locale);
                kotlin.jvm.internal.m.f(context, "context");
                Configuration configuration = context.getResources().getConfiguration();
                kotlin.jvm.internal.m.e(configuration, "getConfiguration(...)");
                Configuration configuration2 = new Configuration(configuration);
                configuration2.setLocale(locale);
                objQ8 = context.createConfigurationContext(configuration2).getResources();
                kotlin.jvm.internal.m.e(objQ8, "getResources(...)");
                sVar.o0(objQ8);
            }
            Resources resources = (Resources) objQ8;
            Object objQ9 = sVar.Q();
            if (objQ9 == gVar2) {
                objQ9 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ9);
            }
            l1.b1 b1Var6 = (l1.b1) objQ9;
            Object objQ10 = sVar.Q();
            if (objQ10 == gVar2) {
                objQ10 = l1.t.B(null);
                sVar.o0(objQ10);
            }
            l1.b1 b1Var7 = (l1.b1) objQ10;
            Object objQ11 = sVar.Q();
            if (objQ11 == gVar2) {
                objQ11 = l1.t.B(null);
                sVar.o0(objQ11);
            }
            l1.b1 b1Var8 = (l1.b1) objQ11;
            if (((Boolean) b1Var6.getValue()).booleanValue()) {
                wVar = wVarA;
                sVar.d0(1984678489);
                LocateLanguageItem locateLanguageItem = (LocateLanguageItem) b1Var7.getValue();
                if (locateLanguageItem == null) {
                    sVar.d0(1395526387);
                    sVar.p(false);
                    b1Var = b1Var4;
                    b1Var6 = b1Var6;
                    z11 = false;
                    mVar = mVar2;
                    cVar4 = cVar4;
                } else {
                    sVar.d0(1395526388);
                    int[] iArr = bq.r.f4959a;
                    String string = resources.getString(R.string.change_locate_prompt_title, bq.m.y(resources, locateLanguageItem.getLocate()));
                    kotlin.jvm.internal.m.e(string, "getString(...)");
                    String string2 = resources.getString(R.string.change_locate_prompt_message, bq.m.y(resources, locateLanguageItem.getLocate()));
                    kotlin.jvm.internal.m.e(string2, "getString(...)");
                    String string3 = resources.getString(R.string.confirm);
                    kotlin.jvm.internal.m.e(string3, "getString(...)");
                    String string4 = resources.getString(R.string.cancel);
                    kotlin.jvm.internal.m.e(string4, "getString(...)");
                    Object objQ12 = sVar.Q();
                    if (objQ12 == gVar2) {
                        objQ12 = new p(4, b1Var6);
                        sVar.o0(objQ12);
                    }
                    fz.a aVar = (fz.a) objQ12;
                    boolean zH3 = sVar.h(cVar4) | sVar.h(context) | sVar.h(locateLanguageItem) | (i17 == 256);
                    Object objQ13 = sVar.Q();
                    if (zH3 || objQ13 == gVar2) {
                        mVar = mVar2;
                        xVar = new x(b1Var4, cVar4, context, locateLanguageItem, i11);
                        b1Var3 = b1Var4;
                        sVar.o0(xVar);
                    } else {
                        b1Var3 = b1Var4;
                        mVar = mVar2;
                        xVar = objQ13;
                    }
                    b1Var = b1Var3;
                    n(string, string2, string3, string4, aVar, (fz.a) xVar, sVar, 24576);
                    sVar = sVar;
                    z11 = false;
                    sVar.p(false);
                }
            } else {
                wVar = wVarA;
                b1Var = b1Var4;
                mVar = mVar2;
                b1Var6 = b1Var6;
                z11 = false;
                cVar4 = cVar4;
                sVar.d0(1385205682);
            }
            sVar.p(z11);
            Object objQ14 = sVar.Q();
            if (objQ14 == gVar2) {
                objQ14 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ14);
            }
            l1.b1 b1Var9 = (l1.b1) objQ14;
            if (((Boolean) b1Var9.getValue()).booleanValue()) {
                sVar.d0(1396760467);
                String string5 = resources.getString(R.string.choose_lan_no_translate_title);
                kotlin.jvm.internal.m.e(string5, "getString(...)");
                String string6 = resources.getString(R.string.choose_lan_no_translate_subtitle);
                kotlin.jvm.internal.m.e(string6, "getString(...)");
                String string7 = resources.getString(R.string.confirm);
                kotlin.jvm.internal.m.e(string7, "getString(...)");
                String string8 = resources.getString(R.string.cancel);
                kotlin.jvm.internal.m.e(string8, "getString(...)");
                defpackage.g gVar3 = new defpackage.g(string5, string6, string7, string8);
                boolean z14 = (i14 & 7168) == 2048;
                Object objQ15 = sVar.Q();
                if (z14 || objQ15 == gVar2) {
                    objQ15 = new q(b1Var8, onLanguageSelected, 1);
                    sVar.o0(objQ15);
                }
                fz.a aVar2 = (fz.a) objQ15;
                Object objQ16 = sVar.Q();
                if (objQ16 == gVar2) {
                    objQ16 = new p(5, b1Var9);
                    sVar.o0(objQ16);
                }
                android.support.v4.media.session.a.a(gVar3, aVar2, (fz.a) objQ16, sVar, 384);
                z12 = false;
            } else {
                z12 = false;
                sVar.d0(1385205682);
            }
            sVar.p(z12);
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD = j0.o.d(jVar, z12);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
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
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            ep.c cVar5 = cVar4;
            l1.t.a(z2.g1.f58552n.a(mVar), t1.e.d(319528204, new t(b1Var, b1Var5, cVar5, context, 1), sVar), sVar, 56);
            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 0, 7);
            l1.s sVar2 = sVar;
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, q0VarD2, sVar2);
            l1.t.J(hVar2, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar2);
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            boolean zH4 = ((i14 & 7168) == 2048) | sVar2.h(cVar5);
            Object objQ17 = sVar2.Q();
            if (zH4) {
                gVar = gVar2;
            } else {
                gVar = gVar2;
                if (objQ17 == gVar) {
                }
                b1Var2 = b1Var;
                ue.f.a(rVarE, wVar, null, null, null, null, false, null, (fz.c) objQ17, sVar2, 6, 508);
                sVar = sVar2;
                if (((Boolean) b1Var2.getValue()).booleanValue() || b1Var5.getValue() == null) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                a0.l1 l1VarA = a0.f1.e(null, 3).a(a0.f1.d(null, 13));
                a0.m1 m1VarA = a0.f1.f(null, 3).a(a0.f1.l(null, 13));
                z1.r rVarD = j0.e2.d(oVar, 1.0f);
                objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = com.google.android.material.datepicker.d.f(sVar);
                }
                h0.i iVar2 = (h0.i) objQ;
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = new p(6, b1Var2);
                    sVar.o0(objQ2);
                }
                a0.j0.c(z13, d0.n.n(rVarD, iVar2, null, false, null, (fz.a) objQ2, 28), l1VarA, m1VarA, null, t1.e.d(925769898, new y(b1Var5, cVar5, context, b1Var6, b1Var7), sVar), sVar, 1600518, 16);
                com.google.android.material.datepicker.d.B(sVar, true, true, true);
                cVar2 = cVar5;
            }
            objQ17 = new b1.a((List) pVar, (Object) cVar5, onLanguageSelected, (Object) b1Var8, (Object) b1Var9, 1);
            sVar2.o0(objQ17);
            b1Var2 = b1Var;
            ue.f.a(rVarE, wVar, null, null, null, null, false, null, (fz.c) objQ17, sVar2, 6, 508);
            sVar = sVar2;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                z13 = false;
            } else {
                z13 = false;
            }
            a0.l1 l1VarA2 = a0.f1.e(null, 3).a(a0.f1.d(null, 13));
            a0.m1 m1VarA2 = a0.f1.f(null, 3).a(a0.f1.l(null, 13));
            z1.r rVarD2 = j0.e2.d(oVar, 1.0f);
            objQ = sVar.Q();
            if (objQ == gVar) {
                objQ = com.google.android.material.datepicker.d.f(sVar);
            }
            h0.i iVar3 = (h0.i) objQ;
            objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new p(6, b1Var2);
                sVar.o0(objQ2);
            }
            a0.j0.c(z13, d0.n.n(rVarD2, iVar3, null, false, null, (fz.a) objQ2, 28), l1VarA2, m1VarA2, null, t1.e.d(925769898, new y(b1Var5, cVar5, context, b1Var6, b1Var7), sVar), sVar, 1600518, 16);
            com.google.android.material.datepicker.d.B(sVar, true, true, true);
            cVar2 = cVar5;
        } else {
            sVar.W();
            cVar2 = cVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(str, rVar, i11, onLanguageSelected, cVar2, i12);
        }
    }

    public static final void f(boolean z11, fz.a onBackClick, fz.c onConfirmClick, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onConfirmClick, "onConfirmClick");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-979376815);
        int i12 = (sVar2.g(z11) ? 4 : 2) | i11 | (sVar2.h(onBackClick) ? 32 : 16) | (sVar2.h(onConfirmClick) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            e2.l lVar = (e2.l) sVar2.j(z2.g1.f58548i);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(BuildConfig.VERSION_NAME);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            p7.a(j0.c.r(j0.c.v(j0.e2.d(z1.o.f58481a, 1.0f))), t1.e.d(1882210325, new at.o(2, onBackClick), sVar2), null, null, null, 0, 0L, 0L, null, t1.e.d(1330820960, new y(lVar, onConfirmClick, b1Var, b1Var2, (l1.b1) objQ3), sVar2), sVar2, 805306416, 508);
            sVar = sVar2;
            if (z11) {
                sVar.d0(-898816462);
                tv.a.c(sVar, 0);
            } else {
                sVar.d0(-906941903);
            }
            sVar.p(false);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0(z11, onBackClick, onConfirmClick, i11);
        }
    }

    public static final void h(LanguageExpandableItem2 languageItem, boolean z11, fz.a onClick, l1.n nVar, int i11) {
        z1.o oVar;
        float f5;
        boolean z12;
        kotlin.jvm.internal.m.f(languageItem, "languageItem");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2095443673);
        int i12 = i11 | (sVar.h(languageItem) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(onClick) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            l1.b3 b3VarB = b0.h.b(z11 ? 180.0f : CropImageView.DEFAULT_ASPECT_RATIO, b0.e.r(LogSeverity.NOTICE_VALUE, 0, b0.b0.f3438a, 2), "arrow_rotation", sVar, 3072, 20);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar2);
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
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            l1.c3 c3Var = h1.v1.f31180a;
            z1.r rVarQ = iu.k.q((i12 << 6) & 57344, 7, onClick, sVar, j0.e2.i(j0.e2.e(d0.n.h(oVar2, ((h1.s1) sVar.j(c3Var)).f31033p, g2.f0.f28556b), 1.0f), 64, CropImageView.DEFAULT_ASPECT_RATIO, 2), false);
            l1.s sVar2 = sVar;
            z1.r rVarB = j0.c.B(rVarQ, 16, 8);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarB);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, a2VarA, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar2);
            int[] iArr = bq.r.f4959a;
            Integer language = languageItem.getLanguage();
            kotlin.jvm.internal.m.e(language, "getLanguage(...)");
            int iV = ff.h.v("ic_left_draw_lan_".concat(bq.m.t(language.intValue())));
            if (iV != 0) {
                sVar2.d0(-804476033);
                oVar = oVar2;
                f5 = 1.0f;
                d0.n.c(se.k.y(iV, sVar2, 0), null, j0.e2.n(oVar2, 34), null, w2.i.f54515b, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 25016, 104);
                sVar2 = sVar2;
                j0.c.g(sVar2, j0.e2.s(oVar, 12));
                z12 = false;
            } else {
                oVar = oVar2;
                f5 = 1.0f;
                z12 = false;
                sVar2.d0(-826318075);
            }
            sVar2.p(z12);
            boolean z13 = z12;
            String name = languageItem.getName();
            kotlin.jvm.internal.m.e(name, "getName(...)");
            n3.s sVar3 = n3.s.L;
            long jA = fr.j3.A(16);
            if (f5 <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            l1.s sVar4 = sVar2;
            z1.o oVar3 = oVar;
            ua.b(name, new j0.i1(f5, true), 0L, jA, null, sVar3, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 199680, 0, 131028);
            h1.r4.b(se.k.y(R.drawable.keyboard_arrow_down_24px, sVar4, z13 ? 1 : 0), z11 ? "Collapse" : "Expand", d2.h.h(oVar3, ((Number) b3VarB.getValue()).floatValue()), ((h1.s1) sVar4.j(c3Var)).f31036s, sVar4, 8, 0);
            sVar = sVar4;
            sVar.p(true);
            sVar.p(true);
            if (z11) {
                sVar.d0(1966404603);
            } else {
                sVar.d0(1989193292);
                k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, ((h1.s1) sVar.j(c3Var)).f31031n, sVar, 0, 3);
            }
            sVar.p(z13);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0(languageItem, z11, onClick, i11, 0);
        }
    }

    public static final void i(fz.c onLanguageSelected, fz.a onDismissRequest, z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar;
        z1.r rVar2;
        kotlin.jvm.internal.m.f(onLanguageSelected, "onLanguageSelected");
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1874833376);
        int i12 = i11 | (sVar2.h(onLanguageSelected) ? 4 : 2) | 384;
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            e8 e8VarF = a6.f(6, 2, null, sVar2);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.d0(1406804525);
                boolean z11 = (i12 & 14) == 4;
                Object objQ3 = sVar2.Q();
                if (z11 || objQ3 == gVar) {
                    objQ3 = new b0.o1(onLanguageSelected, 1);
                    sVar2.o0(objQ3);
                }
                fz.c cVar = (fz.c) objQ3;
                Object objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = new p(8, b1Var);
                    sVar2.o0(objQ4);
                }
                d("history", 0, cVar, (fz.a) objQ4, sVar2, 3078);
            } else {
                sVar2.d0(1374703746);
            }
            sVar2.p(false);
            sVar = sVar2;
            a6.a(onDismissRequest, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-1576432221, new y(onLanguageSelected, b0Var, e8VarF, onDismissRequest, b1Var), sVar2), sVar, 6, 384, 4090);
            rVar2 = z1.o.f58481a;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(i11, 1, onDismissRequest, onLanguageSelected, rVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r6v14, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [l1.s] */
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
    public static final void j(fz.c onLanguageSelected, fz.a onAddMoreClicked, z1.r rVar, gp.m mVar, l1.n nVar, int i11) {
        gp.m mVar2;
        ?? r9;
        int i12;
        gp.m mVar3;
        ?? r11;
        gp.m mVar4;
        l1.b1 b1Var;
        boolean z11;
        ?? r12;
        boolean z12;
        kotlin.jvm.internal.m.f(onLanguageSelected, "onLanguageSelected");
        kotlin.jvm.internal.m.f(onAddMoreClicked, "onAddMoreClicked");
        ?? r13 = (l1.s) nVar;
        r13.f0(-978830856);
        int i13 = i11 | (r13.h(onLanguageSelected) ? 4 : 2) | (r13.f(rVar) ? 256 : 128) | 1024;
        if (r13.T(i13 & 1, (i13 & 1171) != 1170)) {
            r13.Y();
            if ((i11 & 1) == 0 || r13.C()) {
                r13.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(r13, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(gp.m.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(r13), null);
                r13.p(false);
                i12 = i13 & (-7169);
                mVar3 = (gp.m) viewModelA;
            } else {
                r13.W();
                i12 = i13 & (-7169);
                mVar3 = mVar;
            }
            r13.q();
            Context context = (Context) r13.j(AndroidCompositionLocals_androidKt.f1200b);
            String language = Locale.getDefault().getLanguage();
            r13.d0(-1168520582);
            e20.a aVarA = q10.b.a(r13);
            r13.d0(-1633490746);
            vy.d dVar = null;
            boolean zF = r13.f(null) | r13.f(aVarA);
            Object objQ = r13.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = w4.c.e(vt.n0.class, aVarA, null, null, r13);
            }
            r13.p(false);
            r13.p(false);
            vt.n0 n0Var = (vt.n0) objQ;
            e20.a aVarC = w4.c.c(r13, -1168520582, r13, -1633490746);
            boolean zF2 = r13.f(null) | r13.f(aVarC);
            Object objQ2 = r13.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = w4.c.e(vt.a.class, aVarC, null, null, r13);
            }
            r13.p(false);
            r13.p(false);
            vt.a aVar = (vt.a) objQ2;
            Object objQ3 = r13.Q();
            if (objQ3 == gVar) {
                fr.i iVar = (fr.i) aVar;
                iVar.getClass();
                gp.r rVar2 = new gp.r(new fr.b(0, iVar, dVar));
                r13.o0(rVar2);
                objQ3 = rVar2;
            }
            Object obj = ry.r.f50854a;
            l1.b1 b1VarN = l1.t.n((uz.i) objQ3, obj, null, r13, 48, 2);
            boolean zF3 = r13.f((List) b1VarN.getValue());
            Object objQ4 = r13.Q();
            Object obj2 = objQ4;
            if (zF3 || objQ4 == gVar) {
                List<LanStaticsInfo> list = (List) b1VarN.getValue();
                int iW = ry.x.W(ry.n.W(list, 10));
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                for (LanStaticsInfo lanStaticsInfo : list) {
                    linkedHashMap.put(Integer.valueOf(lanStaticsInfo.getLan()), Float.valueOf(lanStaticsInfo.getProgress()));
                }
                r13.o0(linkedHashMap);
                obj2 = linkedHashMap;
            }
            Map map = (Map) obj2;
            l1.b1 b1VarO = l1.t.o(mVar3.f29446e, r13);
            gp.j jVar = (gp.j) b1VarO.getValue();
            if (jVar instanceof gp.i) {
                gp.j jVar2 = (gp.j) b1VarO.getValue();
                kotlin.jvm.internal.m.d(jVar2, "null cannot be cast to non-null type com.lingo.lingoskill.ui.base.viewmodels.LanguageHistoryUiState.Success");
                obj = ((gp.i) jVar2).f29393a;
            } else if (!kotlin.jvm.internal.m.a(jVar, gp.h.f29384a)) {
                throw new NoWhenBranchMatchedException();
            }
            Object objQ5 = r13.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(null);
                r13.o0(objQ5);
            }
            l1.b1 b1Var2 = (l1.b1) objQ5;
            Object objQ6 = r13.Q();
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(Boolean.FALSE);
                r13.o0(objQ6);
            }
            l1.b1 b1Var3 = (l1.b1) objQ6;
            Object objQ7 = r13.Q();
            if (objQ7 == gVar) {
                objQ7 = l1.t.B(null);
                r13.o0(objQ7);
            }
            l1.b1 b1Var4 = (l1.b1) objQ7;
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                r13.d0(-1815812288);
                Context context2 = (Context) r13.j(AndroidCompositionLocals_androidKt.f1200b);
                Locale locale = kotlin.jvm.internal.m.a(language, "zh") ? Locale.TRADITIONAL_CHINESE : new Locale(language);
                kotlin.jvm.internal.m.c(locale);
                kotlin.jvm.internal.m.f(context2, "context");
                Configuration configuration = context2.getResources().getConfiguration();
                kotlin.jvm.internal.m.e(configuration, "getConfiguration(...)");
                Configuration configuration2 = new Configuration(configuration);
                configuration2.setLocale(locale);
                Resources resources = context2.createConfigurationContext(configuration2).getResources();
                kotlin.jvm.internal.m.e(resources, "getResources(...)");
                String string = resources.getString(R.string.choose_lan_no_translate_title);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                String string2 = resources.getString(R.string.choose_lan_no_translate_subtitle);
                kotlin.jvm.internal.m.e(string2, "getString(...)");
                String string3 = resources.getString(R.string.confirm);
                kotlin.jvm.internal.m.e(string3, "getString(...)");
                String string4 = resources.getString(R.string.cancel);
                kotlin.jvm.internal.m.e(string4, "getString(...)");
                defpackage.g gVar2 = new defpackage.g(string, string2, string3, string4);
                boolean z13 = (i12 & 14) == 4;
                Object objQ8 = r13.Q();
                if (z13 || objQ8 == gVar) {
                    objQ8 = new q(b1Var4, onLanguageSelected, 0);
                    r13.o0(objQ8);
                }
                fz.a aVar2 = (fz.a) objQ8;
                Object objQ9 = r13.Q();
                if (objQ9 == gVar) {
                    objQ9 = new p(1, b1Var3);
                    r13.o0(objQ9);
                }
                android.support.v4.media.session.a.a(gVar2, aVar2, (fz.a) objQ9, r13, 384);
                r11 = 0;
            } else {
                r11 = 0;
                r13.d0(-1849916566);
            }
            r13.p(r11);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, r13, r11);
            int iHashCode = Long.hashCode(r13.T);
            l1.q1 q1VarL = r13.l();
            z1.r rVarC = z1.a.c(r13, rVar);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            r13.h0();
            if (r13.S) {
                r13.k(iVar2);
            } else {
                r13.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, r13);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, r13);
            y2.h hVar3 = y2.j.f56918g;
            if (r13.S || !kotlin.jvm.internal.m.a(r13.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, r13, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, r13);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = j0.c.A(j0.e2.e(oVar, 1.0f), 16);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35307e, z1.c.M, r13, 54);
            Object obj3 = obj;
            int iHashCode2 = Long.hashCode(r13.T);
            l1.q1 q1VarL2 = r13.l();
            z1.r rVarC2 = z1.a.c(r13, rVarA);
            r13.h0();
            if (r13.S) {
                r13.k(iVar2);
            } else {
                r13.r0();
            }
            l1.t.J(hVar, a2VarA, r13);
            l1.t.J(hVar2, q1VarL2, r13);
            if (r13.S || !kotlin.jvm.internal.m.a(r13.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, r13, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, r13);
            ua.b(ub.a.e0(r13, R.string.my_courses), null, 0L, 0L, null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, r13, 196608, 0, 131038);
            r13.p(true);
            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, r13, 0, 7);
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            boolean zH = r13.h(obj3) | r13.h(map) | r13.h(n0Var) | r13.h(mVar3) | ((i12 & 14) == 4) | r13.h(context);
            Object objQ10 = r13.Q();
            if (zH || objQ10 == gVar) {
                mVar4 = mVar3;
                b1Var = b1Var2;
                z11 = true;
                ?? r14 = r13;
                r rVar3 = new r(obj3, map, n0Var, b1Var, mVar4, onLanguageSelected, context, onAddMoreClicked, 0);
                r14.o0(rVar3);
                objQ10 = rVar3;
                r12 = r14;
            } else {
                mVar4 = mVar3;
                r12 = r13;
                b1Var = b1Var2;
                z11 = true;
            }
            fz.c cVar = (fz.c) objQ10;
            ?? r15 = r12;
            ue.f.a(rVarE, null, null, null, null, null, false, null, cVar, r15, 6, 510);
            r15.p(z11);
            LanguageHistoryEntity languageHistoryEntity = (LanguageHistoryEntity) b1Var.getValue();
            if (languageHistoryEntity == null) {
                r15.d0(-1801700996);
                z12 = false;
            } else {
                z12 = false;
                r15.d0(-1801700995);
                Object objQ11 = r15.Q();
                if (objQ11 == gVar) {
                    objQ11 = new p(2, b1Var);
                    r15.o0(objQ11);
                }
                k7.a((fz.a) objQ11, t1.e.d(-1726508090, new at.i(mVar4, languageHistoryEntity, b1Var, 2), r15), null, t1.e.d(-1388004920, new s(b1Var, 0, (byte) 0), r15), f4588d, t1.e.d(-880250165, new androidx.lifecycle.viewmodel.compose.a(languageHistoryEntity, 3), r15), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, r15, 1772598, 16276);
            }
            r15.p(z12);
            mVar2 = mVar4;
            r9 = r15;
        } else {
            r13.W();
            mVar2 = mVar;
            r9 = r13;
        }
        l1.x1 x1VarT = r9.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(onLanguageSelected, onAddMoreClicked, rVar, mVar2, i11, 0);
        }
    }

    public static final void k(ArrayList arrayList, String currentLanguage, fz.c onLanguageSelected, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(currentLanguage, "currentLanguage");
        kotlin.jvm.internal.m.f(onLanguageSelected, "onLanguageSelected");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1445754491);
        int i12 = i11 | (sVar.h(arrayList) ? 4 : 2) | (sVar.f(currentLanguage) ? 32 : 16) | (sVar.h(onLanguageSelected) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            float f5 = 14;
            k7.k(j0.c.E(z1.o.f58481a, 24, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 6), r0.f.f(f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 6), k7.p(((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, sVar, 0), null, null, t1.e.d(-2057594887, new defpackage.d(arrayList, currentLanguage, onLanguageSelected, 1), sVar), sVar, 196614, 24);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(arrayList, currentLanguage, onLanguageSelected, i11, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x0157  */
    /* JADX WARN: Code duplicated, block: B:44:0x015b  */
    /* JADX WARN: Code duplicated, block: B:51:0x017a  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x023b  */
    /* JADX WARN: Code duplicated, block: B:67:0x028d  */
    /* JADX WARN: Code duplicated, block: B:69:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x0301  */
    /* JADX WARN: Code duplicated, block: B:85:0x0320  */
    /* JADX WARN: Code duplicated, block: B:86:0x0322  */
    public static final void l(fz.a onBackClick, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        boolean z11;
        Object objQ;
        int iHashCode;
        float f5;
        int i13;
        boolean z12;
        boolean z13;
        Object aVar;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        Object objQ2;
        boolean z14;
        boolean z15;
        Object objQ3;
        boolean z16;
        fz.c onNextClick = cVar;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onNextClick, "onNextClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(660982655);
        int i14 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onNextClick) ? 32 : 16);
        if (sVar.T(i14 & 1, (i14 & 19) != 18)) {
            e2.l lVar = (e2.l) sVar.j(z2.g1.f58548i);
            ((Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b)).getResources();
            Object objQ4 = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(BuildConfig.VERSION_NAME);
                sVar.o0(objQ4);
            }
            l1.b1 b1Var3 = (l1.b1) objQ4;
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ5);
            }
            l1.b1 b1Var4 = (l1.b1) objQ5;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarR = j0.c.r(j0.c.v(j0.e2.d(oVar, 1.0f)));
            z1.h hVar = z1.c.P;
            j0.d dVar = j0.i.f35305c;
            j0.u uVarA = j0.t.a(dVar, hVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarR);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S) {
                i12 = i14;
            } else {
                i12 = i14;
                if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                }
                y2.h hVar5 = y2.j.f56915d;
                l1.t.J(hVar5, rVarC, sVar);
                if ((i12 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objQ = sVar.Q();
                if (z11 || objQ == gVar) {
                    objQ = new at.r(7, onBackClick);
                    sVar.o0(objQ);
                }
                iu.k.g((fz.a) objQ, null, f4593i, null, null, null, null, null, sVar, 384, 250);
                z1.r rVarD = j0.e2.d(oVar, 1.0f);
                j0.u uVarA2 = j0.t.a(dVar, hVar, sVar, 48);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarD);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, uVarA2, sVar);
                l1.t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                l1.t.J(hVar5, rVarC2, sVar);
                float f11 = 8;
                d0.n.c(se.k.y(R.drawable.ic_lingo_deer_prompt, sVar, 0), null, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 440, 120);
                f5 = 16;
                k7.d(j0.c.C(j0.e2.e(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(f11), null, null, null, f4594j, sVar, 196614, 28);
                String str = (String) b1Var3.getValue();
                z1.r rVarB = j0.c.B(j0.e2.e(oVar, 1.0f), f5, f5);
                s0.r0 r0Var = new s0.r0(3, 7, 115);
                boolean zH = sVar.h(lVar);
                i13 = i12 & 112;
                if (i13 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zH | z12;
                Object objQ6 = sVar.Q();
                if (!z13 || objQ6 == gVar) {
                    b1Var = b1Var3;
                    b1Var2 = b1Var4;
                    onNextClick = cVar;
                    aVar = new b0.a(2, onNextClick, lVar, b1Var, b1Var2);
                    sVar.o0(aVar);
                } else {
                    aVar = objQ6;
                    b1Var = b1Var3;
                    b1Var2 = b1Var4;
                    onNextClick = cVar;
                }
                s0.q0 q0Var = new s0.q0((fz.c) aVar, null, 62);
                boolean zBooleanValue = ((Boolean) b1Var2.getValue()).booleanValue();
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = new i2(b1Var, b1Var2, 0);
                    sVar.o0(objQ2);
                }
                t6.a(str, (fz.c) objQ2, rVarB, false, null, f4595k, null, null, null, zBooleanValue, null, r0Var, q0Var, true, 0, 0, null, null, sVar, 1573296, 12779520, 8150968);
                sVar = sVar;
                if (((Boolean) b1Var2.getValue()).booleanValue()) {
                    sVar.d0(1311485963);
                    ua.b(ub.a.e0(sVar, R.string.content_could_not_be_null), j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 48, 0, 131064);
                    sVar = sVar;
                    z14 = false;
                } else {
                    z14 = false;
                    sVar.d0(1303253975);
                }
                sVar.p(z14);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                w4.c.r(1.0f, true, sVar);
                if (i13 == 32) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                objQ3 = sVar.Q();
                if (z15 || objQ3 == gVar) {
                    objQ3 = new j2(onNextClick, b1Var, b1Var2, 0);
                    sVar.o0(objQ3);
                }
                fz.a aVar2 = (fz.a) objQ3;
                z1.r rVarB2 = j0.c.B(j0.e2.e(oVar, 1.0f), f5, f5);
                if (((String) b1Var.getValue()).length() > 0) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                iu.k.e(aVar2, rVarB2, z16, 0L, null, f4596l, sVar, 196656, 24);
                sVar.p(true);
                sVar.p(true);
            }
            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar);
            if ((i12 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            objQ = sVar.Q();
            if (z11) {
                objQ = new at.r(7, onBackClick);
                sVar.o0(objQ);
            } else {
                objQ = new at.r(7, onBackClick);
                sVar.o0(objQ);
            }
            iu.k.g((fz.a) objQ, null, f4593i, null, null, null, null, null, sVar, 384, 250);
            z1.r rVarD2 = j0.e2.d(oVar, 1.0f);
            j0.u uVarA3 = j0.t.a(dVar, hVar, sVar, 48);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarD2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA3, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            l1.t.J(hVar6, rVarC3, sVar);
            float f12 = 8;
            d0.n.c(se.k.y(R.drawable.ic_lingo_deer_prompt, sVar, 0), null, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 440, 120);
            f5 = 16;
            k7.d(j0.c.C(j0.e2.e(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(f12), null, null, null, f4594j, sVar, 196614, 28);
            String str2 = (String) b1Var3.getValue();
            z1.r rVarB3 = j0.c.B(j0.e2.e(oVar, 1.0f), f5, f5);
            s0.r0 r0Var2 = new s0.r0(3, 7, 115);
            boolean zH2 = sVar.h(lVar);
            i13 = i12 & 112;
            if (i13 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = zH2 | z12;
            Object objQ7 = sVar.Q();
            if (z13) {
                b1Var = b1Var3;
                b1Var2 = b1Var4;
                onNextClick = cVar;
                aVar = new b0.a(2, onNextClick, lVar, b1Var, b1Var2);
                sVar.o0(aVar);
            } else {
                b1Var = b1Var3;
                b1Var2 = b1Var4;
                onNextClick = cVar;
                aVar = new b0.a(2, onNextClick, lVar, b1Var, b1Var2);
                sVar.o0(aVar);
            }
            s0.q0 q0Var2 = new s0.q0((fz.c) aVar, null, 62);
            boolean zBooleanValue2 = ((Boolean) b1Var2.getValue()).booleanValue();
            objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new i2(b1Var, b1Var2, 0);
                sVar.o0(objQ2);
            }
            t6.a(str2, (fz.c) objQ2, rVarB3, false, null, f4595k, null, null, null, zBooleanValue2, null, r0Var2, q0Var2, true, 0, 0, null, null, sVar, 1573296, 12779520, 8150968);
            sVar = sVar;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar.d0(1311485963);
                ua.b(ub.a.e0(sVar, R.string.content_could_not_be_null), j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 48, 0, 131064);
                sVar = sVar;
                z14 = false;
            } else {
                z14 = false;
                sVar.d0(1303253975);
            }
            sVar.p(z14);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar);
            if (i13 == 32) {
                z15 = true;
            } else {
                z15 = z14;
            }
            objQ3 = sVar.Q();
            if (z15) {
                objQ3 = new j2(onNextClick, b1Var, b1Var2, 0);
                sVar.o0(objQ3);
            } else {
                objQ3 = new j2(onNextClick, b1Var, b1Var2, 0);
                sVar.o0(objQ3);
            }
            fz.a aVar3 = (fz.a) objQ3;
            z1.r rVarB4 = j0.c.B(j0.e2.e(oVar, 1.0f), f5, f5);
            if (((String) b1Var.getValue()).length() > 0) {
                z16 = true;
            } else {
                z16 = z14;
            }
            iu.k.e(aVar3, rVarB4, z16, 0L, null, f4596l, sVar, 196656, 24);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.h(onBackClick, i11, 8, onNextClick);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0451  */
    /* JADX WARN: Code duplicated, block: B:101:0x0454  */
    /* JADX WARN: Code duplicated, block: B:105:0x045d  */
    /* JADX WARN: Code duplicated, block: B:113:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    /* JADX WARN: Code duplicated, block: B:45:0x011a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:0x0189  */
    /* JADX WARN: Code duplicated, block: B:53:0x018d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x022f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0299  */
    /* JADX WARN: Code duplicated, block: B:70:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x030c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0314  */
    /* JADX WARN: Code duplicated, block: B:88:0x0324  */
    /* JADX WARN: Code duplicated, block: B:91:0x036b  */
    /* JADX WARN: Code duplicated, block: B:93:0x03be  */
    /* JADX WARN: Code duplicated, block: B:95:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:97:0x0413  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(fz.a onBackClick, fz.e eVar, l1.n nVar, int i11) {
        l1.s sVar;
        y2.i iVar;
        boolean z11;
        Object objQ;
        l1.b1 b1Var;
        y2.i iVar2;
        int iHashCode;
        float f5;
        Object objQ2;
        l1.b1 b1Var2;
        l1.b1 b1Var3;
        l1.s sVar2;
        float f11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        Object objQ3;
        l1.b1 b1Var4;
        boolean z15;
        Object objQ4;
        l1.b1 b1Var5;
        l1.b1 b1Var6;
        l1.b1 b1Var7;
        boolean z16;
        l1.s sVar3;
        float f12;
        l1.s sVar4;
        Object[] objArr;
        Object objQ5;
        z1.o oVar;
        l1.b1 b1Var8;
        boolean z17;
        fz.e onNextClick = eVar;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onNextClick, "onNextClick");
        l1.s sVar5 = (l1.s) nVar;
        sVar5.f0(1442177670);
        int i13 = i11 | (sVar5.h(onBackClick) ? 4 : 2) | (sVar5.h(onNextClick) ? 32 : 16);
        if (sVar5.T(i13 & 1, (i13 & 19) != 18)) {
            e2.l lVar = (e2.l) sVar5.j(z2.g1.f58548i);
            Object objQ6 = sVar5.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(BuildConfig.VERSION_NAME);
                sVar5.o0(objQ6);
            }
            l1.b1 b1Var9 = (l1.b1) objQ6;
            Object objQ7 = sVar5.Q();
            if (objQ7 == gVar) {
                objQ7 = l1.t.B(BuildConfig.VERSION_NAME);
                sVar5.o0(objQ7);
            }
            l1.b1 b1Var10 = (l1.b1) objQ7;
            Object objQ8 = sVar5.Q();
            if (objQ8 == gVar) {
                objQ8 = l1.t.B(Boolean.FALSE);
                sVar5.o0(objQ8);
            }
            l1.b1 b1Var11 = (l1.b1) objQ8;
            Object objQ9 = sVar5.Q();
            if (objQ9 == gVar) {
                objQ9 = l1.t.B(Boolean.FALSE);
                sVar5.o0(objQ9);
            }
            l1.b1 b1Var12 = (l1.b1) objQ9;
            Object objQ10 = sVar5.Q();
            if (objQ10 == gVar) {
                objQ10 = l1.t.B(Boolean.FALSE);
                sVar5.o0(objQ10);
            }
            l1.b1 b1Var13 = (l1.b1) objQ10;
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarR = j0.c.r(j0.c.v(j0.e2.d(oVar2, 1.0f)));
            z1.h hVar = z1.c.P;
            j0.d dVar = j0.i.f35305c;
            j0.u uVarA = j0.t.a(dVar, hVar, sVar5, 48);
            int iHashCode2 = Long.hashCode(sVar5.T);
            l1.q1 q1VarL = sVar5.l();
            z1.r rVarC = z1.a.c(sVar5, rVarR);
            y2.k.J.getClass();
            y2.i iVar3 = y2.j.f56913b;
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar3);
            } else {
                sVar5.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar5);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar5);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar5.S) {
                iVar = iVar3;
            } else {
                iVar = iVar3;
                if (!kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode2))) {
                }
                y2.h hVar5 = y2.j.f56915d;
                l1.t.J(hVar5, rVarC, sVar5);
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objQ = sVar5.Q();
                if (z11 || objQ == gVar) {
                    objQ = new at.r(8, onBackClick);
                    sVar5.o0(objQ);
                }
                b1Var = b1Var9;
                iVar2 = iVar;
                iu.k.g((fz.a) objQ, null, m, null, null, null, null, null, sVar5, 384, 250);
                z1.r rVarD = j0.e2.d(oVar2, 1.0f);
                j0.u uVarA2 = j0.t.a(dVar, hVar, sVar5, 48);
                iHashCode = Long.hashCode(sVar5.T);
                l1.q1 q1VarL2 = sVar5.l();
                z1.r rVarC2 = z1.a.c(sVar5, rVarD);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar2);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar2, uVarA2, sVar5);
                l1.t.J(hVar3, q1VarL2, sVar5);
                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar4);
                }
                l1.t.J(hVar5, rVarC2, sVar5);
                String str = (String) b1Var.getValue();
                f5 = 16;
                z1.r rVarB = j0.c.B(j0.e2.e(oVar2, 1.0f), f5, f5);
                s0.r0 r0Var = new s0.r0(1, 6, 115);
                boolean zBooleanValue = ((Boolean) b1Var11.getValue()).booleanValue();
                objQ2 = sVar5.Q();
                if (objQ2 == gVar) {
                    b1Var2 = b1Var11;
                    objQ2 = new i2(b1Var, b1Var2, 1);
                    sVar5.o0(objQ2);
                } else {
                    b1Var2 = b1Var11;
                }
                b1Var3 = b1Var2;
                t6.a(str, (fz.c) objQ2, rVarB, false, null, f4597n, null, null, null, zBooleanValue, null, r0Var, null, true, 0, 0, null, null, sVar5, 1573296, 12779520, 8216504);
                sVar2 = sVar5;
                if (((Boolean) b1Var3.getValue()).booleanValue()) {
                    sVar2.d0(1787399428);
                    f11 = 0.0f;
                    ua.b(ub.a.e0(sVar2, R.string.content_could_not_be_null), j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 48, 0, 131064);
                    sVar2 = sVar2;
                    z12 = false;
                } else {
                    f11 = 0.0f;
                    z12 = false;
                    sVar2.d0(1781283376);
                }
                sVar2.p(z12);
                String str2 = (String) b1Var10.getValue();
                z1.r rVarC3 = j0.c.C(j0.e2.e(oVar2, 1.0f), f5, f11, 2);
                s0.r0 r0Var2 = new s0.r0(6, 7, 115);
                boolean zH = sVar2.h(lVar);
                i12 = i13 & 112;
                if (i12 == 32) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                z14 = z13 | zH;
                objQ3 = sVar2.Q();
                if (!z14 || objQ3 == gVar) {
                    b1Var4 = b1Var10;
                    b0.a aVar = new b0.a(lVar, eVar, b1Var, b1Var4, 3);
                    b1Var = b1Var;
                    sVar2.o0(aVar);
                    objQ3 = aVar;
                } else {
                    b1Var4 = b1Var10;
                }
                s0.q0 q0Var = new s0.q0((fz.c) objQ3, null, 62);
                if (!((Boolean) b1Var12.getValue()).booleanValue() || ((Boolean) b1Var13.getValue()).booleanValue()) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    b1Var5 = b1Var12;
                    b1Var6 = b1Var13;
                    objQ4 = new r1(b1Var4, b1Var5, b1Var6, 1);
                    sVar2.o0(objQ4);
                } else {
                    b1Var5 = b1Var12;
                    b1Var6 = b1Var13;
                }
                b1Var7 = b1Var6;
                z16 = z12;
                l1.s sVar6 = sVar2;
                t6.a(str2, (fz.c) objQ4, rVarC3, false, null, f4598o, null, null, null, z15, null, r0Var2, q0Var, true, 0, 0, null, null, sVar6, 1573296, 12779520, 8150968);
                sVar3 = sVar6;
                if (((Boolean) b1Var5.getValue()).booleanValue()) {
                    sVar3.d0(1788815012);
                    f12 = 0.0f;
                    ua.b(ub.a.e0(sVar3, R.string.content_could_not_be_null), j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar3.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131064);
                    sVar3 = sVar3;
                    sVar3.p(z16);
                } else {
                    f12 = CropImageView.DEFAULT_ASPECT_RATIO;
                    if (((Boolean) b1Var7.getValue()).booleanValue()) {
                        sVar3.d0(1789110845);
                        ua.b(ub.a.e0(sVar3, R.string.the_format_of_email_is_incorrect), j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar3.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131064);
                        sVar3 = sVar3;
                    } else {
                        sVar3.d0(1781283376);
                    }
                    sVar3.p(z16);
                }
                j0.c.g(sVar3, j0.v.a(oVar2, 1.0f));
                sVar4 = sVar3;
                d0.n.c(se.k.y(R.drawable.ubg_36, sVar3, z16 ? 1 : 0), null, j0.c.C(oVar2, f12, f5, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 440, 120);
                j0.c.g(sVar4, j0.v.a(oVar2, 1.0f));
                if (i12 == 32) {
                    objArr = 1;
                } else {
                    objArr = z16 ? 1 : 0;
                }
                objQ5 = sVar4.Q();
                if (objArr == 0 || objQ5 == gVar) {
                    oVar = oVar2;
                    b1Var8 = b1Var;
                    onNextClick = eVar;
                    l2 l2Var = new l2(onNextClick, b1Var8, b1Var3, b1Var4, b1Var5, b1Var7, 0);
                    sVar4.o0(l2Var);
                    objQ5 = l2Var;
                } else {
                    b1Var8 = b1Var;
                    oVar = oVar2;
                    onNextClick = eVar;
                }
                fz.a aVar2 = (fz.a) objQ5;
                z1.r rVarB2 = j0.c.B(j0.e2.e(oVar, 1.0f), f5, f5);
                if (((String) b1Var8.getValue()).length() > 0 || ((String) b1Var4.getValue()).length() <= 0) {
                    z17 = z16 ? 1 : 0;
                } else {
                    z17 = true;
                }
                iu.k.e(aVar2, rVarB2, z17, 0L, null, f4599p, sVar4, 196656, 24);
                sVar = sVar4;
                sVar.p(r40);
                sVar.p(r40);
            }
            defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar4);
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar5);
            if ((i13 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            objQ = sVar5.Q();
            if (z11) {
                objQ = new at.r(8, onBackClick);
                sVar5.o0(objQ);
            } else {
                objQ = new at.r(8, onBackClick);
                sVar5.o0(objQ);
            }
            b1Var = b1Var9;
            iVar2 = iVar;
            iu.k.g((fz.a) objQ, null, m, null, null, null, null, null, sVar5, 384, 250);
            z1.r rVarD2 = j0.e2.d(oVar2, 1.0f);
            j0.u uVarA3 = j0.t.a(dVar, hVar, sVar5, 48);
            iHashCode = Long.hashCode(sVar5.T);
            l1.q1 q1VarL3 = sVar5.l();
            z1.r rVarC4 = z1.a.c(sVar5, rVarD2);
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar2);
            } else {
                sVar5.r0();
            }
            l1.t.J(hVar2, uVarA3, sVar5);
            l1.t.J(hVar3, q1VarL3, sVar5);
            if (sVar5.S) {
                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar4);
            }
            l1.t.J(hVar6, rVarC4, sVar5);
            String str3 = (String) b1Var.getValue();
            f5 = 16;
            z1.r rVarB3 = j0.c.B(j0.e2.e(oVar2, 1.0f), f5, f5);
            s0.r0 r0Var3 = new s0.r0(1, 6, 115);
            boolean zBooleanValue2 = ((Boolean) b1Var11.getValue()).booleanValue();
            objQ2 = sVar5.Q();
            if (objQ2 == gVar) {
                b1Var2 = b1Var11;
                objQ2 = new i2(b1Var, b1Var2, 1);
                sVar5.o0(objQ2);
            } else {
                b1Var2 = b1Var11;
            }
            b1Var3 = b1Var2;
            t6.a(str3, (fz.c) objQ2, rVarB3, false, null, f4597n, null, null, null, zBooleanValue2, null, r0Var3, null, true, 0, 0, null, null, sVar5, 1573296, 12779520, 8216504);
            sVar2 = sVar5;
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar2.d0(1787399428);
                f11 = 0.0f;
                ua.b(ub.a.e0(sVar2, R.string.content_could_not_be_null), j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 48, 0, 131064);
                sVar2 = sVar2;
                z12 = false;
            } else {
                f11 = 0.0f;
                z12 = false;
                sVar2.d0(1781283376);
            }
            sVar2.p(z12);
            String str4 = (String) b1Var10.getValue();
            z1.r rVarC5 = j0.c.C(j0.e2.e(oVar2, 1.0f), f5, f11, 2);
            s0.r0 r0Var4 = new s0.r0(6, 7, 115);
            boolean zH2 = sVar2.h(lVar);
            i12 = i13 & 112;
            if (i12 == 32) {
                z13 = true;
            } else {
                z13 = z12;
            }
            z14 = z13 | zH2;
            objQ3 = sVar2.Q();
            if (z14) {
                b1Var4 = b1Var10;
                b0.a aVar3 = new b0.a(lVar, eVar, b1Var, b1Var4, 3);
                b1Var = b1Var;
                sVar2.o0(aVar3);
                objQ3 = aVar3;
            } else {
                b1Var4 = b1Var10;
                b0.a aVar4 = new b0.a(lVar, eVar, b1Var, b1Var4, 3);
                b1Var = b1Var;
                sVar2.o0(aVar4);
                objQ3 = aVar4;
            }
            s0.q0 q0Var2 = new s0.q0((fz.c) objQ3, null, 62);
            if (((Boolean) b1Var12.getValue()).booleanValue()) {
                z15 = true;
            } else {
                z15 = true;
            }
            objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                b1Var5 = b1Var12;
                b1Var6 = b1Var13;
                objQ4 = new r1(b1Var4, b1Var5, b1Var6, 1);
                sVar2.o0(objQ4);
            } else {
                b1Var5 = b1Var12;
                b1Var6 = b1Var13;
            }
            b1Var7 = b1Var6;
            z16 = z12;
            l1.s sVar7 = sVar2;
            t6.a(str4, (fz.c) objQ4, rVarC5, false, null, f4598o, null, null, null, z15, null, r0Var4, q0Var2, true, 0, 0, null, null, sVar7, 1573296, 12779520, 8150968);
            sVar3 = sVar7;
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                sVar3.d0(1788815012);
                f12 = 0.0f;
                ua.b(ub.a.e0(sVar3, R.string.content_could_not_be_null), j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar3.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131064);
                sVar3 = sVar3;
                sVar3.p(z16);
            } else {
                f12 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (((Boolean) b1Var7.getValue()).booleanValue()) {
                    sVar3.d0(1789110845);
                    ua.b(ub.a.e0(sVar3, R.string.the_format_of_email_is_incorrect), j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar3.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131064);
                    sVar3 = sVar3;
                } else {
                    sVar3.d0(1781283376);
                }
                sVar3.p(z16);
            }
            j0.c.g(sVar3, j0.v.a(oVar2, 1.0f));
            sVar4 = sVar3;
            d0.n.c(se.k.y(R.drawable.ubg_36, sVar3, z16 ? 1 : 0), null, j0.c.C(oVar2, f12, f5, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 440, 120);
            j0.c.g(sVar4, j0.v.a(oVar2, 1.0f));
            if (i12 == 32) {
                objArr = 1;
            } else {
                objArr = z16 ? 1 : 0;
            }
            objQ5 = sVar4.Q();
            if (objArr == 0) {
                oVar = oVar2;
                b1Var8 = b1Var;
                onNextClick = eVar;
                l2 l2Var2 = new l2(onNextClick, b1Var8, b1Var3, b1Var4, b1Var5, b1Var7, 0);
                sVar4.o0(l2Var2);
                objQ5 = l2Var2;
            } else {
                oVar = oVar2;
                b1Var8 = b1Var;
                onNextClick = eVar;
                l2 l2Var3 = new l2(onNextClick, b1Var8, b1Var3, b1Var4, b1Var5, b1Var7, 0);
                sVar4.o0(l2Var3);
                objQ5 = l2Var3;
            }
            fz.a aVar5 = (fz.a) objQ5;
            z1.r rVarB4 = j0.c.B(j0.e2.e(oVar, 1.0f), f5, f5);
            if (((String) b1Var8.getValue()).length() > 0) {
                z17 = z16 ? 1 : 0;
            } else {
                z17 = z16 ? 1 : 0;
            }
            iu.k.e(aVar5, rVarB4, z17, 0L, null, f4599p, sVar4, 196656, 24);
            sVar = sVar4;
            sVar.p(r40);
            sVar.p(r40);
        } else {
            sVar = sVar5;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m2(onBackClick, onNextClick, i11);
        }
    }

    public static final void n(String str, String str2, String str3, String str4, fz.a onDismissRequest, fz.a onConfirm, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1632799864);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.f(str2) ? 32 : 16) | (sVar2.f(str3) ? 256 : 128) | (sVar2.f(str4) ? 2048 : 1024) | (sVar2.h(onConfirm) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar2.T(i12 & 1, (74899 & i12) != 74898)) {
            sVar = sVar2;
            k7.a(onDismissRequest, t1.e.d(289130448, new c0(onConfirm, onDismissRequest, str3), sVar2), j0.e2.u(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 320, 1), t1.e.d(937723218, new d0(onDismissRequest, str4, 0), sVar2), t1.e.d(1586315988, new e0(str, 0), sVar2), t1.e.d(-236871275, new e0(str2, 1), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772982, 16272);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f0(str, str2, str3, str4, onDismissRequest, onConfirm, i11, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object o(vt.k0 k0Var, int i11, xy.c cVar) {
        t1 t1Var;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i12 = t1Var.f4816b;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                t1Var.f4816b = i12 - Integer.MIN_VALUE;
            } else {
                t1Var = new t1(cVar);
            }
        } else {
            t1Var = new t1(cVar);
        }
        Object objU = t1Var.f4815a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = t1Var.f4816b;
        boolean z11 = true;
        if (i13 == 0) {
            com.bumptech.glide.e.F(objU);
            gp.r rVarE = ((bh.a1) k0Var).e(i11, true);
            t1Var.f4816b = 1;
            objU = uz.x0.u(rVarE, t1Var);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objU);
        }
        LearnProgress learnProgress = (LearnProgress) objU;
        LearnProgress learnProgress2 = new LearnProgress(learnProgress.getLan());
        if (kotlin.jvm.internal.m.a(learnProgress.getMain(), learnProgress2.getMain()) && oz.q.K0(learnProgress.getMainTT()) && oz.q.K0(learnProgress.getLessonExam()) && oz.q.K0(learnProgress.getLessonStars()) && oz.q.K0(learnProgress.getAudioLesson()) && learnProgress.getCurrentEnteredUnitId() == learnProgress2.getCurrentEnteredUnitId() && learnProgress.getAckEnterPos() == learnProgress2.getAckEnterPos() && learnProgress.getAckUnitId() == learnProgress2.getAckUnitId()) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    public static Intent p(Context context, int i11) {
        kotlin.jvm.internal.m.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) LoginActivity.class);
        intent.putExtra(INTENTS.EXTRA_INT, i11);
        return intent;
    }

    public static Intent q(Context context, String url, String title) {
        kotlin.jvm.internal.m.f(url, "url");
        kotlin.jvm.internal.m.f(title, "title");
        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
        intent.putExtra(INTENTS.EXTRA_STRING, url);
        intent.putExtra(INTENTS.EXTRA_STRING_2, title);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (r11 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable r(vt.n0 r9, vt.k0 r10, xy.c r11) {
        /*
            boolean r0 = r11 instanceof bp.u1
            if (r0 == 0) goto L13
            r0 = r11
            bp.u1 r0 = (bp.u1) r0
            int r1 = r0.f4838d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4838d = r1
            goto L18
        L13:
            bp.u1 r0 = new bp.u1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f4837c
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f4838d
            r3 = 0
            r4 = 15
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            com.bumptech.glide.e.F(r11)     // Catch: java.lang.Throwable -> L8d
            goto L7f
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            int r9 = r0.f4836b
            vt.k0 r10 = r0.f4835a
            com.bumptech.glide.e.F(r11)     // Catch: java.lang.Throwable -> L8d
            goto L69
        L3d:
            com.bumptech.glide.e.F(r11)
            fr.o0 r9 = (fr.o0) r9
            com.lingodeer.data.env.Env r9 = r9.f27733a
            int r11 = r9.keyLanguage
            int r2 = r9.fluentLanguage
            int r7 = r9.scLanguage
            int r9 = r9.handWriteLanguage
            r8 = 5
            if (r11 == r8) goto L51
            if (r11 != r4) goto L5b
        L51:
            r11 = -1
            if (r2 != r11) goto L5b
            if (r7 != r11) goto L5b
            if (r9 != r11) goto L5b
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L5b:
            r0.f4835a = r10     // Catch: java.lang.Throwable -> L8d
            r0.f4836b = r3     // Catch: java.lang.Throwable -> L8d
            r0.f4838d = r6     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r11 = o(r10, r8, r0)     // Catch: java.lang.Throwable -> L8d
            if (r11 != r1) goto L68
            goto L7e
        L68:
            r9 = r3
        L69:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L8d
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L8d
            if (r11 != 0) goto L87
            r11 = 0
            r0.f4835a = r11     // Catch: java.lang.Throwable -> L8d
            r0.f4836b = r9     // Catch: java.lang.Throwable -> L8d
            r0.f4838d = r5     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r11 = o(r10, r4, r0)     // Catch: java.lang.Throwable -> L8d
            if (r11 != r1) goto L7f
        L7e:
            return r1
        L7f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L8d
            boolean r9 = r11.booleanValue()     // Catch: java.lang.Throwable -> L8d
            if (r9 == 0) goto L88
        L87:
            r3 = r6
        L88:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L8d
            goto L92
        L8d:
            r9 = move-exception
            qy.n r9 = com.bumptech.glide.e.l(r9)
        L92:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            boolean r11 = r9 instanceof qy.n
            if (r11 == 0) goto L99
            r9 = r10
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.g1.r(vt.n0, vt.k0, xy.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01df  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:120:0x020a  */
    /* JADX WARN: Code duplicated, block: B:122:0x020f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0213  */
    /* JADX WARN: Code duplicated, block: B:124:0x0217  */
    /* JADX WARN: Code duplicated, block: B:125:0x021b  */
    /* JADX WARN: Code duplicated, block: B:126:0x021f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0223  */
    /* JADX WARN: Code duplicated, block: B:128:0x0227  */
    /* JADX WARN: Code duplicated, block: B:129:0x022b  */
    /* JADX WARN: Code duplicated, block: B:130:0x022f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0233  */
    /* JADX WARN: Code duplicated, block: B:132:0x0238  */
    /* JADX WARN: Code duplicated, block: B:133:0x023c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0240  */
    /* JADX WARN: Code duplicated, block: B:135:0x0244  */
    /* JADX WARN: Code duplicated, block: B:136:0x0248  */
    /* JADX WARN: Code duplicated, block: B:137:0x024c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0250  */
    /* JADX WARN: Code duplicated, block: B:139:0x0254  */
    /* JADX WARN: Code duplicated, block: B:140:0x0258  */
    /* JADX WARN: Code duplicated, block: B:141:0x025c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0260  */
    /* JADX WARN: Code duplicated, block: B:143:0x0264  */
    /* JADX WARN: Code duplicated, block: B:144:0x0267  */
    /* JADX WARN: Code duplicated, block: B:145:0x026b  */
    /* JADX WARN: Code duplicated, block: B:146:0x026f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0273  */
    /* JADX WARN: Code duplicated, block: B:148:0x0277  */
    /* JADX WARN: Code duplicated, block: B:149:0x027b  */
    /* JADX WARN: Code duplicated, block: B:150:0x027f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0283  */
    /* JADX WARN: Code duplicated, block: B:152:0x0287  */
    /* JADX WARN: Code duplicated, block: B:153:0x028b  */
    /* JADX WARN: Code duplicated, block: B:154:0x028f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0293  */
    /* JADX WARN: Code duplicated, block: B:156:0x0297  */
    /* JADX WARN: Code duplicated, block: B:157:0x029b  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:166:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:169:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:170:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:171:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:172:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:173:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:174:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:176:0x02db  */
    /* JADX WARN: Code duplicated, block: B:177:0x02de  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:180:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:184:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:185:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:189:0x031b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0333  */
    /* JADX WARN: Code duplicated, block: B:197:0x0345  */
    /* JADX WARN: Code duplicated, block: B:200:0x0380  */
    /* JADX WARN: Code duplicated, block: B:202:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:205:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:209:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:211:0x0400  */
    /* JADX WARN: Code duplicated, block: B:214:0x0432  */
    /* JADX WARN: Code duplicated, block: B:215:0x0436  */
    /* JADX WARN: Code duplicated, block: B:218:0x0443  */
    /* JADX WARN: Code duplicated, block: B:220:0x0451  */
    /* JADX WARN: Code duplicated, block: B:224:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:227:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:229:0x053d  */
    /* JADX WARN: Code duplicated, block: B:232:0x0563  */
    /* JADX WARN: Code duplicated, block: B:233:0x0565  */
    /* JADX WARN: Code duplicated, block: B:235:0x0604  */
    /* JADX WARN: Code duplicated, block: B:238:0x0613  */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea A[PHI: r1 r5 r6 r8
      0x00ea: PHI (r1v28 fz.a) = (r1v11 fz.a), (r1v31 fz.a) binds: [B:79:0x0117, B:66:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r5v17 z1.r) = (r5v4 z1.r), (r5v1 z1.r) binds: [B:79:0x0117, B:66:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r6v19 int) = (r6v15 int), (r6v21 int) binds: [B:79:0x0117, B:66:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r8v22 long) = (r8v13 long), (r8v10 long) binds: [B:79:0x0117, B:66:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x0102  */
    /* JADX WARN: Code duplicated, block: B:76:0x0108  */
    /* JADX WARN: Code duplicated, block: B:78:0x0115  */
    /* JADX WARN: Code duplicated, block: B:80:0x0119  */
    /* JADX WARN: Code duplicated, block: B:83:0x014d  */
    /* JADX WARN: Code duplicated, block: B:84:0x014f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0157  */
    /* JADX WARN: Code duplicated, block: B:88:0x0159  */
    /* JADX WARN: Code duplicated, block: B:91:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0166  */
    /* JADX WARN: Code duplicated, block: B:97:0x019b  */
    /* JADX WARN: Code duplicated, block: B:98:0x019f  */
    /* JADX WARN: Instruction removed from duplicated block: B:227:0x04d3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean, int] */
    public static final void g(z1.r rVar, final LanguageItem languageItem, final boolean z11, final boolean z12, long j11, final fz.a onClick, fz.a aVar, Integer num, l1.n nVar, final int i11, final int i12) {
        z1.r rVar2;
        int i13;
        long j12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        Integer num2;
        int i22;
        int i23;
        boolean z13;
        final z1.r rVar3;
        final long j13;
        final Integer num3;
        final fz.a aVar2;
        l1.s sVar;
        l1.x1 x1VarT;
        int i24;
        z1.o oVar;
        l1.g gVar;
        fz.a aVar3;
        int i25;
        Integer num4;
        Object objQ;
        Object obj;
        g2.r0 r0Var;
        float f5;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object obj2;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        fz.a aVar4;
        boolean zD;
        int i26;
        int keyLanguage;
        String str;
        int identifier;
        Object obj3;
        float f11;
        z1.r rVarI;
        float f12;
        ?? r15;
        int iHashCode2;
        int iHashCode3;
        l1.v1 v1Var;
        l1.s sVar2;
        z1.o oVar2;
        float f13;
        ?? r16;
        l1.s sVar3;
        float f14;
        kotlin.jvm.internal.m.f(languageItem, "languageItem");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(259651018);
        int i27 = i12 & 1;
        if (i27 != 0) {
            i13 = i11 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i13 = (sVar4.f(rVar2) ? 4 : 2) | i11;
        }
        int i28 = i13 | (sVar4.h(languageItem) ? 32 : 16) | (sVar4.g(z11) ? 256 : 128);
        if ((i11 & 3072) == 0) {
            i28 |= sVar4.g(z12) ? 2048 : 1024;
        }
        if ((i12 & 16) == 0) {
            j12 = j11;
            if (sVar4.e(j12)) {
                i14 = 16384;
            }
            int i29 = i28 | i14;
            if (sVar4.h(onClick)) {
                i15 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i15 = 65536;
            }
            i16 = i29 | i15;
            i17 = i12 & 64;
            if (i17 != 0) {
                i19 = i16 | 1572864;
            } else {
                if (sVar4.h(aVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i19 = i16 | i18;
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i23 = i19 | 12582912;
                num2 = num;
            } else {
                num2 = num;
                if (sVar4.f(num2)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i23 = i19 | i22;
            }
            if ((i23 & 4793491) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar4.T(i23 & 1, z13)) {
                sVar4.Y();
                i24 = i11 & 1;
                oVar = z1.o.f58481a;
                gVar = l1.m.f39353a;
                if (i24 != 0 || sVar4.C()) {
                    if (i27 != 0) {
                        rVar2 = oVar;
                    }
                    if ((i12 & 16) != 0) {
                        j12 = ((h1.s1) sVar4.j(h1.v1.f31180a)).f31031n;
                        i23 &= -57345;
                    }
                    if (i17 != 0) {
                        objQ = sVar4.Q();
                        if (objQ == gVar) {
                            obj = objQ;
                            ju.d dVar = new ju.d(25);
                            sVar4.o0(dVar);
                            obj = dVar;
                        }
                        obj = objQ;
                        aVar3 = (fz.a) obj;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i21 != 0) {
                        i25 = i23;
                        num4 = null;
                    }
                    sVar4.q();
                    r0Var = g2.f0.f28556b;
                    z1.r rVarH = d0.n.h(rVar2, j12, r0Var);
                    f5 = 8;
                    z1.r rVar4 = rVar2;
                    float f15 = 18;
                    z1.r rVarE = j0.e2.e(j0.e2.g(j0.c.B(rVarH, f15, f5), 84), 1.0f);
                    if ((i25 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i25 & 458752) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    Object objQ2 = sVar4.Q();
                    if (!z16 || objQ2 == gVar) {
                        z17 = false;
                        s0 s0Var = new s0(false ? 1 : 0, aVar3, onClick);
                        sVar4.o0(s0Var);
                        obj2 = s0Var;
                    } else {
                        z17 = false;
                        obj2 = objQ2;
                    }
                    z1.r rVarA = s2.g0.a(rVarE, qy.b0.f48488a, (PointerInputEventHandler) obj2);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58466d, z17);
                    long j14 = j12;
                    iHashCode = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL = sVar4.l();
                    z1.r rVarC = z1.a.c(sVar4, rVarA);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar);
                    } else {
                        sVar4.r0();
                    }
                    y2.h hVar2 = y2.j.f56917f;
                    l1.t.J(hVar2, q0VarD, sVar4);
                    y2.h hVar3 = y2.j.f56916e;
                    l1.t.J(hVar3, q1VarL, sVar4);
                    hVar = y2.j.f56918g;
                    if (sVar4.S) {
                        aVar4 = aVar3;
                    } else {
                        aVar4 = aVar3;
                        if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                        }
                        y2.h hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC, sVar4);
                        zD = sVar4.d(languageItem.getKeyLanguage());
                        Object objQ3 = sVar4.Q();
                        obj3 = objQ3;
                        if (zD || objQ3 == gVar) {
                            if (languageItem.getLocate() == 51) {
                                i26 = 34;
                                if (languageItem.getKeyLanguage() == 34) {
                                    identifier = R.drawable.ic_lan_choose_bg_cnhw_ar;
                                }
                                Integer numValueOf = Integer.valueOf(identifier);
                                sVar4.o0(numValueOf);
                                obj3 = numValueOf;
                            } else {
                                i26 = 34;
                            }
                            if (languageItem.getKeyLanguage() == i26) {
                                identifier = R.drawable.ic_lan_choose_bg_cnhw;
                            } else {
                                int[] iArr = bq.r.f4959a;
                                keyLanguage = languageItem.getKeyLanguage();
                                str = "en";
                                switch (keyLanguage) {
                                    case 0:
                                        str = "cn";
                                        break;
                                    case 1:
                                        str = "jp";
                                        break;
                                    case 2:
                                        str = "kr";
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        str = "es";
                                        break;
                                    case 5:
                                        str = "fr";
                                        break;
                                    case 6:
                                        str = "de";
                                        break;
                                    case 7:
                                        str = "vt";
                                        break;
                                    case 8:
                                        str = "pt";
                                        break;
                                    case 9:
                                        str = "tch";
                                        break;
                                    case 10:
                                        str = "ru";
                                        break;
                                    case 11:
                                        str = "cnup";
                                        break;
                                    case 12:
                                        str = "jpup";
                                        break;
                                    case 13:
                                        str = "krup";
                                        break;
                                    case 14:
                                        str = "esup";
                                        break;
                                    case 15:
                                        str = "frup";
                                        break;
                                    case 16:
                                        str = "deup";
                                        break;
                                    case 17:
                                        str = "ptup";
                                        break;
                                    case 18:
                                        str = "idn";
                                        break;
                                    case 19:
                                        str = "pol";
                                        break;
                                    case 20:
                                        str = "it";
                                        break;
                                    case 21:
                                        str = "tur";
                                        break;
                                    case 22:
                                        str = "ruup";
                                        break;
                                    default:
                                        switch (keyLanguage) {
                                            case 30:
                                                str = "jpfluent";
                                                break;
                                            case 31:
                                                str = "krfluent";
                                                break;
                                            case Consts.SP /* 32 */:
                                                str = "cnsc";
                                                break;
                                            case 33:
                                                str = bjXGJ.JvdJAib;
                                                break;
                                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                                if (cf.x.n().locateLanguage != 51) {
                                                    str = "cnhw";
                                                } else {
                                                    str = "cnhw_ar";
                                                }
                                                break;
                                            case 35:
                                                str = "cnfluent";
                                                break;
                                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                                str = "frsc";
                                                break;
                                            case 37:
                                                str = "jpsc";
                                                break;
                                            case 38:
                                                str = "krsc";
                                                break;
                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                str = "essc";
                                                break;
                                            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                                str = "itup";
                                                break;
                                            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                                str = "rusc";
                                                break;
                                            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                                str = "frfluent";
                                                break;
                                            case 43:
                                                str = "desc";
                                                break;
                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                            case 50:
                                                str = "ensc";
                                                break;
                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                str = "itsc";
                                                break;
                                            case 46:
                                                str = "ptsc";
                                                break;
                                            case 47:
                                                str = "esus";
                                                break;
                                            case 48:
                                                str = "esusup";
                                                break;
                                            case 49:
                                                break;
                                            case 51:
                                                str = "ara";
                                                break;
                                            case 52:
                                                str = "arasc";
                                                break;
                                            case 53:
                                                str = "frus";
                                                break;
                                            case 54:
                                                str = "frusup";
                                                break;
                                            case 55:
                                                str = "araup";
                                                break;
                                            case 56:
                                                str = "vtsc";
                                                break;
                                            case 57:
                                                str = "thai";
                                                break;
                                            case 58:
                                                str = "esusfluent";
                                                break;
                                            case 59:
                                                str = "thaisc";
                                                break;
                                            case 60:
                                                str = "tursc";
                                                break;
                                            case 61:
                                                str = "hindi";
                                                break;
                                            case 62:
                                                str = ealNNtLp.BfvQ;
                                                break;
                                            case 63:
                                                str = "ukr";
                                                break;
                                            case 64:
                                                str = "ukrsc";
                                                break;
                                            case 65:
                                                str = "grk";
                                                break;
                                            case 66:
                                                str = "grksc";
                                                break;
                                            case 67:
                                                str = "idnsc";
                                                break;
                                            case 68:
                                                str = "polsc";
                                                break;
                                            case UCrop.REQUEST_CROP /* 69 */:
                                                str = "mal";
                                                break;
                                            case 70:
                                                str = "malsc";
                                                break;
                                            default:
                                                str = BuildConfig.VERSION_NAME;
                                                break;
                                        }
                                        break;
                                }
                                String strConcat = "ic_lan_choose_bg_".concat(str);
                                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication2);
                                Resources resources = lingoSkillApplication2.getResources();
                                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication3);
                                identifier = resources.getIdentifier(strConcat, "drawable", lingoSkillApplication3.getPackageName());
                                if (identifier == 0) {
                                    identifier = R.drawable.ic_lan_choose_bg_cn;
                                }
                            }
                            Integer numValueOf2 = Integer.valueOf(identifier);
                            sVar4.o0(numValueOf2);
                            obj3 = numValueOf2;
                        }
                        int iIntValue = ((Number) obj3).intValue();
                        if (languageItem.getLocate() == 51 || languageItem.getKeyLanguage() == 34) {
                            f11 = 1.0f;
                            rVarI = oVar;
                        } else {
                            f11 = 1.0f;
                            rVarI = d2.h.i(oVar, -1.0f, 1.0f);
                        }
                        f12 = f11;
                        d0.n.c(se.k.y(iIntValue, sVar4, 0), null, j0.e2.d(rVarI, f11), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 24632, 104);
                        if (z12) {
                            sVar4.d0(-509227779);
                            j0.c.g(sVar4, d0.n.h(j0.e2.d(oVar, f12), g2.x.c(((h1.s1) sVar4.j(h1.v1.f31180a)).f31031n, 0.5f), r0Var));
                            r15 = 0;
                        } else {
                            r15 = 0;
                            sVar4.d0(-533998670);
                        }
                        sVar4.p(r15);
                        z1.r rVarE2 = j0.e2.e(j0.c.E(oVar, f15, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0.75f);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, r15);
                        iHashCode2 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL2 = sVar4.l();
                        z1.r rVarC2 = z1.a.c(sVar4, rVarE2);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar2, uVarA, sVar4);
                        l1.t.J(hVar3, q1VarL2, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
                        }
                        l1.t.J(hVar4, rVarC2, sVar4);
                        z1.i iVar2 = z1.c.M;
                        z1.r rVarG = j0.e2.g(j0.e2.e(oVar, 1.0f), 24);
                        j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar2, sVar4, 48);
                        iHashCode3 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL3 = sVar4.l();
                        z1.r rVarC3 = z1.a.c(sVar4, rVarG);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar2, a2VarA, sVar4);
                        l1.t.J(hVar3, q1VarL3, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar);
                        }
                        l1.t.J(hVar4, rVarC3, sVar4);
                        String name = languageItem.getName();
                        kotlin.jvm.internal.m.e(name, "getName(...)");
                        l1.v1 v1Var2 = ua.f31167a;
                        j3.y0 y0Var = (j3.y0) sVar4.j(v1Var2);
                        long jA = fr.j3.A(18);
                        n3.s sVar5 = n3.s.L;
                        v1Var = h1.v1.f31180a;
                        j3.y0 y0VarA = j3.y0.a(y0Var, ob.f.s((h1.s1) sVar4.j(v1Var), sVar4), jA, sVar5, null, null, 0L, null, u3.l.f52752c, 0, 0, 0L, null, 16773112);
                        s0.g gVar2 = new s0.g(fr.j3.A(6), fr.j3.A(18), fr.j3.A(1));
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        iu.k.c(name, new j0.i1(1.0f, false), y0VarA, 0, false, 1, 0, gVar2, sVar4, 1572864, 184);
                        sVar2 = sVar4;
                        if (num4 != null) {
                            sVar2.d0(1349823684);
                            long jS = ob.f.s((h1.s1) sVar2.j(v1Var), sVar2);
                            long jA2 = fr.j3.A(10);
                            n3.s sVar6 = n3.s.K;
                            z1.r rVarE3 = j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                            oVar2 = oVar;
                            f13 = f5;
                            ua.b("(" + num4 + "%)", rVarE3, jS, jA2, null, sVar6, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 199728, 0, 131024);
                            sVar3 = sVar2;
                            r16 = 0;
                        } else {
                            oVar2 = oVar;
                            f13 = f5;
                            r16 = 0;
                            sVar2.d0(1323808856);
                            sVar3 = sVar2;
                        }
                        sVar3.p(r16);
                        k2.b bVarY = se.k.y(R.drawable.ic_lan_choose_checked, sVar3, r16);
                        float f16 = f13;
                        z1.r rVarE4 = j0.c.E(oVar2, f16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                        if (z11) {
                            f14 = 1.0f;
                        } else {
                            f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                        }
                        l1.s sVar7 = sVar3;
                        d0.n.c(bVarY, null, d2.h.a(rVarE4, f14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar7, 56, 120);
                        sVar7.p(true);
                        String description = languageItem.getDescription();
                        kotlin.jvm.internal.m.e(description, "getDescription(...)");
                        iu.k.c(description, j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j3.y0.a((j3.y0) sVar7.j(v1Var2), ob.f.s((h1.s1) sVar7.j(v1Var), sVar7), fr.j3.A(12), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 2, 0, new s0.g(fr.j3.A(6), fr.j3.A(12), fr.j3.A(1)), sVar7, 1572912, 184);
                        l1.s sVar8 = sVar7;
                        sVar8.p(true);
                        sVar8.p(true);
                        rVar3 = rVar4;
                        aVar2 = aVar4;
                        num3 = num4;
                        j13 = j14;
                        sVar = sVar8;
                    }
                    defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                    y2.h hVar5 = y2.j.f56915d;
                    l1.t.J(hVar5, rVarC, sVar4);
                    zD = sVar4.d(languageItem.getKeyLanguage());
                    Object objQ4 = sVar4.Q();
                    obj3 = objQ4;
                    if (zD) {
                        if (languageItem.getLocate() == 51) {
                            i26 = 34;
                            if (languageItem.getKeyLanguage() == 34) {
                                identifier = R.drawable.ic_lan_choose_bg_cnhw_ar;
                            }
                            Integer numValueOf3 = Integer.valueOf(identifier);
                            sVar4.o0(numValueOf3);
                            obj3 = numValueOf3;
                        } else {
                            i26 = 34;
                        }
                        if (languageItem.getKeyLanguage() == i26) {
                            identifier = R.drawable.ic_lan_choose_bg_cnhw;
                        } else {
                            int[] iArr2 = bq.r.f4959a;
                            keyLanguage = languageItem.getKeyLanguage();
                            str = "en";
                            switch (keyLanguage) {
                                case 0:
                                    str = "cn";
                                    break;
                                case 1:
                                    str = "jp";
                                    break;
                                case 2:
                                    str = "kr";
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    str = "es";
                                    break;
                                case 5:
                                    str = "fr";
                                    break;
                                case 6:
                                    str = "de";
                                    break;
                                case 7:
                                    str = "vt";
                                    break;
                                case 8:
                                    str = "pt";
                                    break;
                                case 9:
                                    str = "tch";
                                    break;
                                case 10:
                                    str = "ru";
                                    break;
                                case 11:
                                    str = "cnup";
                                    break;
                                case 12:
                                    str = "jpup";
                                    break;
                                case 13:
                                    str = "krup";
                                    break;
                                case 14:
                                    str = "esup";
                                    break;
                                case 15:
                                    str = "frup";
                                    break;
                                case 16:
                                    str = "deup";
                                    break;
                                case 17:
                                    str = "ptup";
                                    break;
                                case 18:
                                    str = "idn";
                                    break;
                                case 19:
                                    str = "pol";
                                    break;
                                case 20:
                                    str = "it";
                                    break;
                                case 21:
                                    str = "tur";
                                    break;
                                case 22:
                                    str = "ruup";
                                    break;
                                default:
                                    switch (keyLanguage) {
                                        case 30:
                                            str = "jpfluent";
                                            break;
                                        case 31:
                                            str = "krfluent";
                                            break;
                                        case Consts.SP /* 32 */:
                                            str = "cnsc";
                                            break;
                                        case 33:
                                            str = bjXGJ.JvdJAib;
                                            break;
                                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                            if (cf.x.n().locateLanguage != 51) {
                                                str = "cnhw";
                                            } else {
                                                str = "cnhw_ar";
                                            }
                                            break;
                                        case 35:
                                            str = "cnfluent";
                                            break;
                                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                            str = "frsc";
                                            break;
                                        case 37:
                                            str = "jpsc";
                                            break;
                                        case 38:
                                            str = "krsc";
                                            break;
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                            str = "essc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                            str = "itup";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                            str = "rusc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                            str = "frfluent";
                                            break;
                                        case 43:
                                            str = "desc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        case 50:
                                            str = "ensc";
                                            break;
                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                            str = "itsc";
                                            break;
                                        case 46:
                                            str = "ptsc";
                                            break;
                                        case 47:
                                            str = "esus";
                                            break;
                                        case 48:
                                            str = "esusup";
                                            break;
                                        case 49:
                                            break;
                                        case 51:
                                            str = "ara";
                                            break;
                                        case 52:
                                            str = "arasc";
                                            break;
                                        case 53:
                                            str = "frus";
                                            break;
                                        case 54:
                                            str = "frusup";
                                            break;
                                        case 55:
                                            str = "araup";
                                            break;
                                        case 56:
                                            str = "vtsc";
                                            break;
                                        case 57:
                                            str = "thai";
                                            break;
                                        case 58:
                                            str = "esusfluent";
                                            break;
                                        case 59:
                                            str = "thaisc";
                                            break;
                                        case 60:
                                            str = "tursc";
                                            break;
                                        case 61:
                                            str = "hindi";
                                            break;
                                        case 62:
                                            str = ealNNtLp.BfvQ;
                                            break;
                                        case 63:
                                            str = "ukr";
                                            break;
                                        case 64:
                                            str = "ukrsc";
                                            break;
                                        case 65:
                                            str = "grk";
                                            break;
                                        case 66:
                                            str = "grksc";
                                            break;
                                        case 67:
                                            str = "idnsc";
                                            break;
                                        case 68:
                                            str = "polsc";
                                            break;
                                        case UCrop.REQUEST_CROP /* 69 */:
                                            str = "mal";
                                            break;
                                        case 70:
                                            str = "malsc";
                                            break;
                                        default:
                                            str = BuildConfig.VERSION_NAME;
                                            break;
                                    }
                                    break;
                            }
                            String strConcat2 = "ic_lan_choose_bg_".concat(str);
                            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication5);
                            Resources resources2 = lingoSkillApplication5.getResources();
                            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication6);
                            identifier = resources2.getIdentifier(strConcat2, "drawable", lingoSkillApplication6.getPackageName());
                            if (identifier == 0) {
                                identifier = R.drawable.ic_lan_choose_bg_cn;
                            }
                        }
                        Integer numValueOf4 = Integer.valueOf(identifier);
                        sVar4.o0(numValueOf4);
                        obj3 = numValueOf4;
                    } else {
                        if (languageItem.getLocate() == 51) {
                            i26 = 34;
                            if (languageItem.getKeyLanguage() == 34) {
                                identifier = R.drawable.ic_lan_choose_bg_cnhw_ar;
                            }
                            Integer numValueOf5 = Integer.valueOf(identifier);
                            sVar4.o0(numValueOf5);
                            obj3 = numValueOf5;
                        } else {
                            i26 = 34;
                        }
                        if (languageItem.getKeyLanguage() == i26) {
                            identifier = R.drawable.ic_lan_choose_bg_cnhw;
                        } else {
                            int[] iArr3 = bq.r.f4959a;
                            keyLanguage = languageItem.getKeyLanguage();
                            str = "en";
                            switch (keyLanguage) {
                                case 0:
                                    str = "cn";
                                    break;
                                case 1:
                                    str = "jp";
                                    break;
                                case 2:
                                    str = "kr";
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    str = "es";
                                    break;
                                case 5:
                                    str = "fr";
                                    break;
                                case 6:
                                    str = "de";
                                    break;
                                case 7:
                                    str = "vt";
                                    break;
                                case 8:
                                    str = "pt";
                                    break;
                                case 9:
                                    str = "tch";
                                    break;
                                case 10:
                                    str = "ru";
                                    break;
                                case 11:
                                    str = "cnup";
                                    break;
                                case 12:
                                    str = "jpup";
                                    break;
                                case 13:
                                    str = "krup";
                                    break;
                                case 14:
                                    str = "esup";
                                    break;
                                case 15:
                                    str = "frup";
                                    break;
                                case 16:
                                    str = "deup";
                                    break;
                                case 17:
                                    str = "ptup";
                                    break;
                                case 18:
                                    str = "idn";
                                    break;
                                case 19:
                                    str = "pol";
                                    break;
                                case 20:
                                    str = "it";
                                    break;
                                case 21:
                                    str = "tur";
                                    break;
                                case 22:
                                    str = "ruup";
                                    break;
                                default:
                                    switch (keyLanguage) {
                                        case 30:
                                            str = "jpfluent";
                                            break;
                                        case 31:
                                            str = "krfluent";
                                            break;
                                        case Consts.SP /* 32 */:
                                            str = "cnsc";
                                            break;
                                        case 33:
                                            str = bjXGJ.JvdJAib;
                                            break;
                                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                            LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                                            if (cf.x.n().locateLanguage != 51) {
                                                str = "cnhw";
                                            } else {
                                                str = "cnhw_ar";
                                            }
                                            break;
                                        case 35:
                                            str = "cnfluent";
                                            break;
                                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                            str = "frsc";
                                            break;
                                        case 37:
                                            str = "jpsc";
                                            break;
                                        case 38:
                                            str = "krsc";
                                            break;
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                            str = "essc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                            str = "itup";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                            str = "rusc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                            str = "frfluent";
                                            break;
                                        case 43:
                                            str = "desc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        case 50:
                                            str = "ensc";
                                            break;
                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                            str = "itsc";
                                            break;
                                        case 46:
                                            str = "ptsc";
                                            break;
                                        case 47:
                                            str = "esus";
                                            break;
                                        case 48:
                                            str = "esusup";
                                            break;
                                        case 49:
                                            break;
                                        case 51:
                                            str = "ara";
                                            break;
                                        case 52:
                                            str = "arasc";
                                            break;
                                        case 53:
                                            str = "frus";
                                            break;
                                        case 54:
                                            str = "frusup";
                                            break;
                                        case 55:
                                            str = "araup";
                                            break;
                                        case 56:
                                            str = "vtsc";
                                            break;
                                        case 57:
                                            str = "thai";
                                            break;
                                        case 58:
                                            str = "esusfluent";
                                            break;
                                        case 59:
                                            str = "thaisc";
                                            break;
                                        case 60:
                                            str = "tursc";
                                            break;
                                        case 61:
                                            str = "hindi";
                                            break;
                                        case 62:
                                            str = ealNNtLp.BfvQ;
                                            break;
                                        case 63:
                                            str = "ukr";
                                            break;
                                        case 64:
                                            str = "ukrsc";
                                            break;
                                        case 65:
                                            str = "grk";
                                            break;
                                        case 66:
                                            str = "grksc";
                                            break;
                                        case 67:
                                            str = "idnsc";
                                            break;
                                        case 68:
                                            str = "polsc";
                                            break;
                                        case UCrop.REQUEST_CROP /* 69 */:
                                            str = "mal";
                                            break;
                                        case 70:
                                            str = "malsc";
                                            break;
                                        default:
                                            str = BuildConfig.VERSION_NAME;
                                            break;
                                    }
                                    break;
                            }
                            String strConcat3 = "ic_lan_choose_bg_".concat(str);
                            LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication8);
                            Resources resources3 = lingoSkillApplication8.getResources();
                            LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication9);
                            identifier = resources3.getIdentifier(strConcat3, "drawable", lingoSkillApplication9.getPackageName());
                            if (identifier == 0) {
                                identifier = R.drawable.ic_lan_choose_bg_cn;
                            }
                        }
                        Integer numValueOf6 = Integer.valueOf(identifier);
                        sVar4.o0(numValueOf6);
                        obj3 = numValueOf6;
                    }
                    int iIntValue2 = ((Number) obj3).intValue();
                    if (languageItem.getLocate() == 51) {
                        f11 = 1.0f;
                        rVarI = oVar;
                    } else {
                        f11 = 1.0f;
                        rVarI = oVar;
                    }
                    f12 = f11;
                    d0.n.c(se.k.y(iIntValue2, sVar4, 0), null, j0.e2.d(rVarI, f11), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 24632, 104);
                    if (z12) {
                        sVar4.d0(-509227779);
                        j0.c.g(sVar4, d0.n.h(j0.e2.d(oVar, f12), g2.x.c(((h1.s1) sVar4.j(h1.v1.f31180a)).f31031n, 0.5f), r0Var));
                        r15 = 0;
                    } else {
                        r15 = 0;
                        sVar4.d0(-533998670);
                    }
                    sVar4.p(r15);
                    z1.r rVarE5 = j0.e2.e(j0.c.E(oVar, f15, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0.75f);
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, r15);
                    iHashCode2 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL4 = sVar4.l();
                    z1.r rVarC4 = z1.a.c(sVar4, rVarE5);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar2, uVarA2, sVar4);
                    l1.t.J(hVar3, q1VarL4, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
                    } else {
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
                    }
                    l1.t.J(hVar5, rVarC4, sVar4);
                    z1.i iVar3 = z1.c.M;
                    z1.r rVarG2 = j0.e2.g(j0.e2.e(oVar, 1.0f), 24);
                    j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, iVar3, sVar4, 48);
                    iHashCode3 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL5 = sVar4.l();
                    z1.r rVarC5 = z1.a.c(sVar4, rVarG2);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar2, a2VarA2, sVar4);
                    l1.t.J(hVar3, q1VarL5, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar);
                    } else {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar);
                    }
                    l1.t.J(hVar5, rVarC5, sVar4);
                    String name2 = languageItem.getName();
                    kotlin.jvm.internal.m.e(name2, "getName(...)");
                    l1.v1 v1Var3 = ua.f31167a;
                    j3.y0 y0Var2 = (j3.y0) sVar4.j(v1Var3);
                    long jA3 = fr.j3.A(18);
                    n3.s sVar9 = n3.s.L;
                    v1Var = h1.v1.f31180a;
                    j3.y0 y0VarA2 = j3.y0.a(y0Var2, ob.f.s((h1.s1) sVar4.j(v1Var), sVar4), jA3, sVar9, null, null, 0L, null, u3.l.f52752c, 0, 0, 0L, null, 16773112);
                    s0.g gVar3 = new s0.g(fr.j3.A(6), fr.j3.A(18), fr.j3.A(1));
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    iu.k.c(name2, new j0.i1(1.0f, false), y0VarA2, 0, false, 1, 0, gVar3, sVar4, 1572864, 184);
                    sVar2 = sVar4;
                    if (num4 != null) {
                        sVar2.d0(1349823684);
                        long jS2 = ob.f.s((h1.s1) sVar2.j(v1Var), sVar2);
                        long jA4 = fr.j3.A(10);
                        n3.s sVar10 = n3.s.K;
                        z1.r rVarE6 = j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                        oVar2 = oVar;
                        f13 = f5;
                        ua.b("(" + num4 + "%)", rVarE6, jS2, jA4, null, sVar10, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 199728, 0, 131024);
                        sVar3 = sVar2;
                        r16 = 0;
                    } else {
                        oVar2 = oVar;
                        f13 = f5;
                        r16 = 0;
                        sVar2.d0(1323808856);
                        sVar3 = sVar2;
                    }
                    sVar3.p(r16);
                    k2.b bVarY2 = se.k.y(R.drawable.ic_lan_choose_checked, sVar3, r16);
                    float f17 = f13;
                    z1.r rVarE7 = j0.c.E(oVar2, f17, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    if (z11) {
                        f14 = 1.0f;
                    } else {
                        f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    l1.s sVar11 = sVar3;
                    d0.n.c(bVarY2, null, d2.h.a(rVarE7, f14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar11, 56, 120);
                    sVar11.p(true);
                    String description2 = languageItem.getDescription();
                    kotlin.jvm.internal.m.e(description2, "getDescription(...)");
                    iu.k.c(description2, j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f17, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j3.y0.a((j3.y0) sVar11.j(v1Var3), ob.f.s((h1.s1) sVar11.j(v1Var), sVar11), fr.j3.A(12), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 2, 0, new s0.g(fr.j3.A(6), fr.j3.A(12), fr.j3.A(1)), sVar11, 1572912, 184);
                    l1.s sVar12 = sVar11;
                    sVar12.p(true);
                    sVar12.p(true);
                    rVar3 = rVar4;
                    aVar2 = aVar4;
                    num3 = num4;
                    j13 = j14;
                    sVar = sVar12;
                } else {
                    sVar4.W();
                    if ((i12 & 16) != 0) {
                        i23 &= -57345;
                    }
                    aVar3 = aVar;
                }
                i25 = i23;
                num4 = num2;
                sVar4.q();
                r0Var = g2.f0.f28556b;
                z1.r rVarH2 = d0.n.h(rVar2, j12, r0Var);
                f5 = 8;
                z1.r rVar5 = rVar2;
                float f18 = 18;
                z1.r rVarE8 = j0.e2.e(j0.e2.g(j0.c.B(rVarH2, f18, f5), 84), 1.0f);
                if ((i25 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i25 & 458752) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                Object objQ5 = sVar4.Q();
                if (z16) {
                    z17 = false;
                    s0 s0Var2 = new s0(false ? 1 : 0, aVar3, onClick);
                    sVar4.o0(s0Var2);
                    obj2 = s0Var2;
                } else {
                    z17 = false;
                    s0 s0Var3 = new s0(false ? 1 : 0, aVar3, onClick);
                    sVar4.o0(s0Var3);
                    obj2 = s0Var3;
                }
                z1.r rVarA2 = s2.g0.a(rVarE8, qy.b0.f48488a, (PointerInputEventHandler) obj2);
                w2.q0 q0VarD2 = j0.o.d(z1.c.f58466d, z17);
                long j15 = j12;
                iHashCode = Long.hashCode(sVar4.T);
                l1.q1 q1VarL6 = sVar4.l();
                z1.r rVarC6 = z1.a.c(sVar4, rVarA2);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar);
                } else {
                    sVar4.r0();
                }
                y2.h hVar6 = y2.j.f56917f;
                l1.t.J(hVar6, q0VarD2, sVar4);
                y2.h hVar7 = y2.j.f56916e;
                l1.t.J(hVar7, q1VarL6, sVar4);
                hVar = y2.j.f56918g;
                if (sVar4.S) {
                    aVar4 = aVar3;
                    if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                    }
                    y2.h hVar8 = y2.j.f56915d;
                    l1.t.J(hVar8, rVarC6, sVar4);
                    zD = sVar4.d(languageItem.getKeyLanguage());
                    Object objQ6 = sVar4.Q();
                    obj3 = objQ6;
                    if (zD) {
                        if (languageItem.getLocate() == 51) {
                            i26 = 34;
                            if (languageItem.getKeyLanguage() == 34) {
                                identifier = R.drawable.ic_lan_choose_bg_cnhw_ar;
                            }
                            Integer numValueOf7 = Integer.valueOf(identifier);
                            sVar4.o0(numValueOf7);
                            obj3 = numValueOf7;
                        } else {
                            i26 = 34;
                        }
                        if (languageItem.getKeyLanguage() == i26) {
                            identifier = R.drawable.ic_lan_choose_bg_cnhw;
                        } else {
                            int[] iArr4 = bq.r.f4959a;
                            keyLanguage = languageItem.getKeyLanguage();
                            str = "en";
                            switch (keyLanguage) {
                                case 0:
                                    str = "cn";
                                    break;
                                case 1:
                                    str = "jp";
                                    break;
                                case 2:
                                    str = "kr";
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    str = "es";
                                    break;
                                case 5:
                                    str = "fr";
                                    break;
                                case 6:
                                    str = "de";
                                    break;
                                case 7:
                                    str = "vt";
                                    break;
                                case 8:
                                    str = "pt";
                                    break;
                                case 9:
                                    str = "tch";
                                    break;
                                case 10:
                                    str = "ru";
                                    break;
                                case 11:
                                    str = "cnup";
                                    break;
                                case 12:
                                    str = "jpup";
                                    break;
                                case 13:
                                    str = "krup";
                                    break;
                                case 14:
                                    str = "esup";
                                    break;
                                case 15:
                                    str = "frup";
                                    break;
                                case 16:
                                    str = "deup";
                                    break;
                                case 17:
                                    str = "ptup";
                                    break;
                                case 18:
                                    str = "idn";
                                    break;
                                case 19:
                                    str = "pol";
                                    break;
                                case 20:
                                    str = "it";
                                    break;
                                case 21:
                                    str = "tur";
                                    break;
                                case 22:
                                    str = "ruup";
                                    break;
                                default:
                                    switch (keyLanguage) {
                                        case 30:
                                            str = "jpfluent";
                                            break;
                                        case 31:
                                            str = "krfluent";
                                            break;
                                        case Consts.SP /* 32 */:
                                            str = "cnsc";
                                            break;
                                        case 33:
                                            str = bjXGJ.JvdJAib;
                                            break;
                                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                            LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                                            if (cf.x.n().locateLanguage != 51) {
                                                str = "cnhw";
                                            } else {
                                                str = "cnhw_ar";
                                            }
                                            break;
                                        case 35:
                                            str = "cnfluent";
                                            break;
                                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                            str = "frsc";
                                            break;
                                        case 37:
                                            str = "jpsc";
                                            break;
                                        case 38:
                                            str = "krsc";
                                            break;
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                            str = "essc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                            str = "itup";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                            str = "rusc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                            str = "frfluent";
                                            break;
                                        case 43:
                                            str = "desc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        case 50:
                                            str = "ensc";
                                            break;
                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                            str = "itsc";
                                            break;
                                        case 46:
                                            str = "ptsc";
                                            break;
                                        case 47:
                                            str = "esus";
                                            break;
                                        case 48:
                                            str = "esusup";
                                            break;
                                        case 49:
                                            break;
                                        case 51:
                                            str = "ara";
                                            break;
                                        case 52:
                                            str = "arasc";
                                            break;
                                        case 53:
                                            str = "frus";
                                            break;
                                        case 54:
                                            str = "frusup";
                                            break;
                                        case 55:
                                            str = "araup";
                                            break;
                                        case 56:
                                            str = "vtsc";
                                            break;
                                        case 57:
                                            str = "thai";
                                            break;
                                        case 58:
                                            str = "esusfluent";
                                            break;
                                        case 59:
                                            str = "thaisc";
                                            break;
                                        case 60:
                                            str = "tursc";
                                            break;
                                        case 61:
                                            str = "hindi";
                                            break;
                                        case 62:
                                            str = ealNNtLp.BfvQ;
                                            break;
                                        case 63:
                                            str = "ukr";
                                            break;
                                        case 64:
                                            str = "ukrsc";
                                            break;
                                        case 65:
                                            str = "grk";
                                            break;
                                        case 66:
                                            str = "grksc";
                                            break;
                                        case 67:
                                            str = "idnsc";
                                            break;
                                        case 68:
                                            str = "polsc";
                                            break;
                                        case UCrop.REQUEST_CROP /* 69 */:
                                            str = "mal";
                                            break;
                                        case 70:
                                            str = "malsc";
                                            break;
                                        default:
                                            str = BuildConfig.VERSION_NAME;
                                            break;
                                    }
                                    break;
                            }
                            String strConcat4 = "ic_lan_choose_bg_".concat(str);
                            LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication11);
                            Resources resources4 = lingoSkillApplication11.getResources();
                            LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication12);
                            identifier = resources4.getIdentifier(strConcat4, "drawable", lingoSkillApplication12.getPackageName());
                            if (identifier == 0) {
                                identifier = R.drawable.ic_lan_choose_bg_cn;
                            }
                        }
                        Integer numValueOf8 = Integer.valueOf(identifier);
                        sVar4.o0(numValueOf8);
                        obj3 = numValueOf8;
                    } else {
                        if (languageItem.getLocate() == 51) {
                            i26 = 34;
                            if (languageItem.getKeyLanguage() == 34) {
                                identifier = R.drawable.ic_lan_choose_bg_cnhw_ar;
                            }
                            Integer numValueOf9 = Integer.valueOf(identifier);
                            sVar4.o0(numValueOf9);
                            obj3 = numValueOf9;
                        } else {
                            i26 = 34;
                        }
                        if (languageItem.getKeyLanguage() == i26) {
                            identifier = R.drawable.ic_lan_choose_bg_cnhw;
                        } else {
                            int[] iArr5 = bq.r.f4959a;
                            keyLanguage = languageItem.getKeyLanguage();
                            str = "en";
                            switch (keyLanguage) {
                                case 0:
                                    str = "cn";
                                    break;
                                case 1:
                                    str = "jp";
                                    break;
                                case 2:
                                    str = "kr";
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    str = "es";
                                    break;
                                case 5:
                                    str = "fr";
                                    break;
                                case 6:
                                    str = "de";
                                    break;
                                case 7:
                                    str = "vt";
                                    break;
                                case 8:
                                    str = "pt";
                                    break;
                                case 9:
                                    str = "tch";
                                    break;
                                case 10:
                                    str = "ru";
                                    break;
                                case 11:
                                    str = "cnup";
                                    break;
                                case 12:
                                    str = "jpup";
                                    break;
                                case 13:
                                    str = "krup";
                                    break;
                                case 14:
                                    str = "esup";
                                    break;
                                case 15:
                                    str = "frup";
                                    break;
                                case 16:
                                    str = "deup";
                                    break;
                                case 17:
                                    str = "ptup";
                                    break;
                                case 18:
                                    str = "idn";
                                    break;
                                case 19:
                                    str = "pol";
                                    break;
                                case 20:
                                    str = "it";
                                    break;
                                case 21:
                                    str = "tur";
                                    break;
                                case 22:
                                    str = "ruup";
                                    break;
                                default:
                                    switch (keyLanguage) {
                                        case 30:
                                            str = "jpfluent";
                                            break;
                                        case 31:
                                            str = "krfluent";
                                            break;
                                        case Consts.SP /* 32 */:
                                            str = "cnsc";
                                            break;
                                        case 33:
                                            str = bjXGJ.JvdJAib;
                                            break;
                                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                            LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                                            if (cf.x.n().locateLanguage != 51) {
                                                str = "cnhw";
                                            } else {
                                                str = "cnhw_ar";
                                            }
                                            break;
                                        case 35:
                                            str = "cnfluent";
                                            break;
                                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                            str = "frsc";
                                            break;
                                        case 37:
                                            str = "jpsc";
                                            break;
                                        case 38:
                                            str = "krsc";
                                            break;
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                            str = "essc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                            str = "itup";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                            str = "rusc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                            str = "frfluent";
                                            break;
                                        case 43:
                                            str = "desc";
                                            break;
                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        case 50:
                                            str = "ensc";
                                            break;
                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                            str = "itsc";
                                            break;
                                        case 46:
                                            str = "ptsc";
                                            break;
                                        case 47:
                                            str = "esus";
                                            break;
                                        case 48:
                                            str = "esusup";
                                            break;
                                        case 49:
                                            break;
                                        case 51:
                                            str = "ara";
                                            break;
                                        case 52:
                                            str = "arasc";
                                            break;
                                        case 53:
                                            str = "frus";
                                            break;
                                        case 54:
                                            str = "frusup";
                                            break;
                                        case 55:
                                            str = "araup";
                                            break;
                                        case 56:
                                            str = "vtsc";
                                            break;
                                        case 57:
                                            str = "thai";
                                            break;
                                        case 58:
                                            str = "esusfluent";
                                            break;
                                        case 59:
                                            str = "thaisc";
                                            break;
                                        case 60:
                                            str = "tursc";
                                            break;
                                        case 61:
                                            str = "hindi";
                                            break;
                                        case 62:
                                            str = ealNNtLp.BfvQ;
                                            break;
                                        case 63:
                                            str = "ukr";
                                            break;
                                        case 64:
                                            str = "ukrsc";
                                            break;
                                        case 65:
                                            str = "grk";
                                            break;
                                        case 66:
                                            str = "grksc";
                                            break;
                                        case 67:
                                            str = "idnsc";
                                            break;
                                        case 68:
                                            str = "polsc";
                                            break;
                                        case UCrop.REQUEST_CROP /* 69 */:
                                            str = "mal";
                                            break;
                                        case 70:
                                            str = "malsc";
                                            break;
                                        default:
                                            str = BuildConfig.VERSION_NAME;
                                            break;
                                    }
                                    break;
                            }
                            String strConcat5 = "ic_lan_choose_bg_".concat(str);
                            LingoSkillApplication lingoSkillApplication14 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication14);
                            Resources resources5 = lingoSkillApplication14.getResources();
                            LingoSkillApplication lingoSkillApplication15 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication15);
                            identifier = resources5.getIdentifier(strConcat5, "drawable", lingoSkillApplication15.getPackageName());
                            if (identifier == 0) {
                                identifier = R.drawable.ic_lan_choose_bg_cn;
                            }
                        }
                        Integer numValueOf10 = Integer.valueOf(identifier);
                        sVar4.o0(numValueOf10);
                        obj3 = numValueOf10;
                    }
                    int iIntValue3 = ((Number) obj3).intValue();
                    if (languageItem.getLocate() == 51) {
                        f11 = 1.0f;
                        rVarI = oVar;
                    } else {
                        f11 = 1.0f;
                        rVarI = oVar;
                    }
                    f12 = f11;
                    d0.n.c(se.k.y(iIntValue3, sVar4, 0), null, j0.e2.d(rVarI, f11), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 24632, 104);
                    if (z12) {
                        sVar4.d0(-509227779);
                        j0.c.g(sVar4, d0.n.h(j0.e2.d(oVar, f12), g2.x.c(((h1.s1) sVar4.j(h1.v1.f31180a)).f31031n, 0.5f), r0Var));
                        r15 = 0;
                    } else {
                        r15 = 0;
                        sVar4.d0(-533998670);
                    }
                    sVar4.p(r15);
                    z1.r rVarE9 = j0.e2.e(j0.c.E(oVar, f18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0.75f);
                    j0.u uVarA3 = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, r15);
                    iHashCode2 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL7 = sVar4.l();
                    z1.r rVarC7 = z1.a.c(sVar4, rVarE9);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar6, uVarA3, sVar4);
                    l1.t.J(hVar7, q1VarL7, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
                    } else {
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
                    }
                    l1.t.J(hVar8, rVarC7, sVar4);
                    z1.i iVar4 = z1.c.M;
                    z1.r rVarG3 = j0.e2.g(j0.e2.e(oVar, 1.0f), 24);
                    j0.a2 a2VarA3 = j0.z1.a(j0.i.f35303a, iVar4, sVar4, 48);
                    iHashCode3 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL8 = sVar4.l();
                    z1.r rVarC8 = z1.a.c(sVar4, rVarG3);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar6, a2VarA3, sVar4);
                    l1.t.J(hVar7, q1VarL8, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar);
                    } else {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar);
                    }
                    l1.t.J(hVar8, rVarC8, sVar4);
                    String name3 = languageItem.getName();
                    kotlin.jvm.internal.m.e(name3, "getName(...)");
                    l1.v1 v1Var4 = ua.f31167a;
                    j3.y0 y0Var3 = (j3.y0) sVar4.j(v1Var4);
                    long jA5 = fr.j3.A(18);
                    n3.s sVar13 = n3.s.L;
                    v1Var = h1.v1.f31180a;
                    j3.y0 y0VarA3 = j3.y0.a(y0Var3, ob.f.s((h1.s1) sVar4.j(v1Var), sVar4), jA5, sVar13, null, null, 0L, null, u3.l.f52752c, 0, 0, 0L, null, 16773112);
                    s0.g gVar4 = new s0.g(fr.j3.A(6), fr.j3.A(18), fr.j3.A(1));
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    iu.k.c(name3, new j0.i1(1.0f, false), y0VarA3, 0, false, 1, 0, gVar4, sVar4, 1572864, 184);
                    sVar2 = sVar4;
                    if (num4 != null) {
                        sVar2.d0(1349823684);
                        long jS3 = ob.f.s((h1.s1) sVar2.j(v1Var), sVar2);
                        long jA6 = fr.j3.A(10);
                        n3.s sVar14 = n3.s.K;
                        z1.r rVarE10 = j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                        oVar2 = oVar;
                        f13 = f5;
                        ua.b("(" + num4 + "%)", rVarE10, jS3, jA6, null, sVar14, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 199728, 0, 131024);
                        sVar3 = sVar2;
                        r16 = 0;
                    } else {
                        oVar2 = oVar;
                        f13 = f5;
                        r16 = 0;
                        sVar2.d0(1323808856);
                        sVar3 = sVar2;
                    }
                    sVar3.p(r16);
                    k2.b bVarY3 = se.k.y(R.drawable.ic_lan_choose_checked, sVar3, r16);
                    float f19 = f13;
                    z1.r rVarE11 = j0.c.E(oVar2, f19, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    if (z11) {
                        f14 = 1.0f;
                    } else {
                        f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    l1.s sVar15 = sVar3;
                    d0.n.c(bVarY3, null, d2.h.a(rVarE11, f14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar15, 56, 120);
                    sVar15.p(true);
                    String description3 = languageItem.getDescription();
                    kotlin.jvm.internal.m.e(description3, "getDescription(...)");
                    iu.k.c(description3, j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f19, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j3.y0.a((j3.y0) sVar15.j(v1Var4), ob.f.s((h1.s1) sVar15.j(v1Var), sVar15), fr.j3.A(12), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 2, 0, new s0.g(fr.j3.A(6), fr.j3.A(12), fr.j3.A(1)), sVar15, 1572912, 184);
                    l1.s sVar16 = sVar15;
                    sVar16.p(true);
                    sVar16.p(true);
                    rVar3 = rVar5;
                    aVar2 = aVar4;
                    num3 = num4;
                    j13 = j15;
                    sVar = sVar16;
                } else {
                    aVar4 = aVar3;
                }
                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                y2.h hVar9 = y2.j.f56915d;
                l1.t.J(hVar9, rVarC6, sVar4);
                zD = sVar4.d(languageItem.getKeyLanguage());
                Object objQ7 = sVar4.Q();
                obj3 = objQ7;
                if (zD) {
                    if (languageItem.getLocate() == 51) {
                        i26 = 34;
                        if (languageItem.getKeyLanguage() == 34) {
                            identifier = R.drawable.ic_lan_choose_bg_cnhw_ar;
                        }
                        Integer numValueOf11 = Integer.valueOf(identifier);
                        sVar4.o0(numValueOf11);
                        obj3 = numValueOf11;
                    } else {
                        i26 = 34;
                    }
                    if (languageItem.getKeyLanguage() == i26) {
                        identifier = R.drawable.ic_lan_choose_bg_cnhw;
                    } else {
                        int[] iArr6 = bq.r.f4959a;
                        keyLanguage = languageItem.getKeyLanguage();
                        str = "en";
                        switch (keyLanguage) {
                            case 0:
                                str = "cn";
                                break;
                            case 1:
                                str = "jp";
                                break;
                            case 2:
                                str = "kr";
                                break;
                            case 3:
                                break;
                            case 4:
                                str = "es";
                                break;
                            case 5:
                                str = "fr";
                                break;
                            case 6:
                                str = "de";
                                break;
                            case 7:
                                str = "vt";
                                break;
                            case 8:
                                str = "pt";
                                break;
                            case 9:
                                str = "tch";
                                break;
                            case 10:
                                str = "ru";
                                break;
                            case 11:
                                str = "cnup";
                                break;
                            case 12:
                                str = "jpup";
                                break;
                            case 13:
                                str = "krup";
                                break;
                            case 14:
                                str = "esup";
                                break;
                            case 15:
                                str = "frup";
                                break;
                            case 16:
                                str = "deup";
                                break;
                            case 17:
                                str = "ptup";
                                break;
                            case 18:
                                str = "idn";
                                break;
                            case 19:
                                str = "pol";
                                break;
                            case 20:
                                str = "it";
                                break;
                            case 21:
                                str = "tur";
                                break;
                            case 22:
                                str = "ruup";
                                break;
                            default:
                                switch (keyLanguage) {
                                    case 30:
                                        str = "jpfluent";
                                        break;
                                    case 31:
                                        str = "krfluent";
                                        break;
                                    case Consts.SP /* 32 */:
                                        str = "cnsc";
                                        break;
                                    case 33:
                                        str = bjXGJ.JvdJAib;
                                        break;
                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        LingoSkillApplication lingoSkillApplication16 = LingoSkillApplication.f21665b;
                                        if (cf.x.n().locateLanguage != 51) {
                                            str = "cnhw";
                                        } else {
                                            str = "cnhw_ar";
                                        }
                                        break;
                                    case 35:
                                        str = "cnfluent";
                                        break;
                                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        str = "frsc";
                                        break;
                                    case 37:
                                        str = "jpsc";
                                        break;
                                    case 38:
                                        str = "krsc";
                                        break;
                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        str = "essc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                        str = "itup";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        str = "rusc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        str = "frfluent";
                                        break;
                                    case 43:
                                        str = "desc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    case 50:
                                        str = "ensc";
                                        break;
                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        str = "itsc";
                                        break;
                                    case 46:
                                        str = "ptsc";
                                        break;
                                    case 47:
                                        str = "esus";
                                        break;
                                    case 48:
                                        str = "esusup";
                                        break;
                                    case 49:
                                        break;
                                    case 51:
                                        str = "ara";
                                        break;
                                    case 52:
                                        str = "arasc";
                                        break;
                                    case 53:
                                        str = "frus";
                                        break;
                                    case 54:
                                        str = "frusup";
                                        break;
                                    case 55:
                                        str = "araup";
                                        break;
                                    case 56:
                                        str = "vtsc";
                                        break;
                                    case 57:
                                        str = "thai";
                                        break;
                                    case 58:
                                        str = "esusfluent";
                                        break;
                                    case 59:
                                        str = "thaisc";
                                        break;
                                    case 60:
                                        str = "tursc";
                                        break;
                                    case 61:
                                        str = "hindi";
                                        break;
                                    case 62:
                                        str = ealNNtLp.BfvQ;
                                        break;
                                    case 63:
                                        str = "ukr";
                                        break;
                                    case 64:
                                        str = "ukrsc";
                                        break;
                                    case 65:
                                        str = "grk";
                                        break;
                                    case 66:
                                        str = "grksc";
                                        break;
                                    case 67:
                                        str = "idnsc";
                                        break;
                                    case 68:
                                        str = "polsc";
                                        break;
                                    case UCrop.REQUEST_CROP /* 69 */:
                                        str = "mal";
                                        break;
                                    case 70:
                                        str = "malsc";
                                        break;
                                    default:
                                        str = BuildConfig.VERSION_NAME;
                                        break;
                                }
                                break;
                        }
                        String strConcat6 = "ic_lan_choose_bg_".concat(str);
                        LingoSkillApplication lingoSkillApplication17 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication17);
                        Resources resources6 = lingoSkillApplication17.getResources();
                        LingoSkillApplication lingoSkillApplication18 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication18);
                        identifier = resources6.getIdentifier(strConcat6, "drawable", lingoSkillApplication18.getPackageName());
                        if (identifier == 0) {
                            identifier = R.drawable.ic_lan_choose_bg_cn;
                        }
                    }
                    Integer numValueOf12 = Integer.valueOf(identifier);
                    sVar4.o0(numValueOf12);
                    obj3 = numValueOf12;
                } else {
                    if (languageItem.getLocate() == 51) {
                        i26 = 34;
                        if (languageItem.getKeyLanguage() == 34) {
                            identifier = R.drawable.ic_lan_choose_bg_cnhw_ar;
                        }
                        Integer numValueOf13 = Integer.valueOf(identifier);
                        sVar4.o0(numValueOf13);
                        obj3 = numValueOf13;
                    } else {
                        i26 = 34;
                    }
                    if (languageItem.getKeyLanguage() == i26) {
                        identifier = R.drawable.ic_lan_choose_bg_cnhw;
                    } else {
                        int[] iArr7 = bq.r.f4959a;
                        keyLanguage = languageItem.getKeyLanguage();
                        str = "en";
                        switch (keyLanguage) {
                            case 0:
                                str = "cn";
                                break;
                            case 1:
                                str = "jp";
                                break;
                            case 2:
                                str = "kr";
                                break;
                            case 3:
                                break;
                            case 4:
                                str = "es";
                                break;
                            case 5:
                                str = "fr";
                                break;
                            case 6:
                                str = "de";
                                break;
                            case 7:
                                str = "vt";
                                break;
                            case 8:
                                str = "pt";
                                break;
                            case 9:
                                str = "tch";
                                break;
                            case 10:
                                str = "ru";
                                break;
                            case 11:
                                str = "cnup";
                                break;
                            case 12:
                                str = "jpup";
                                break;
                            case 13:
                                str = "krup";
                                break;
                            case 14:
                                str = "esup";
                                break;
                            case 15:
                                str = "frup";
                                break;
                            case 16:
                                str = "deup";
                                break;
                            case 17:
                                str = "ptup";
                                break;
                            case 18:
                                str = "idn";
                                break;
                            case 19:
                                str = "pol";
                                break;
                            case 20:
                                str = "it";
                                break;
                            case 21:
                                str = "tur";
                                break;
                            case 22:
                                str = "ruup";
                                break;
                            default:
                                switch (keyLanguage) {
                                    case 30:
                                        str = "jpfluent";
                                        break;
                                    case 31:
                                        str = "krfluent";
                                        break;
                                    case Consts.SP /* 32 */:
                                        str = "cnsc";
                                        break;
                                    case 33:
                                        str = bjXGJ.JvdJAib;
                                        break;
                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        LingoSkillApplication lingoSkillApplication19 = LingoSkillApplication.f21665b;
                                        if (cf.x.n().locateLanguage != 51) {
                                            str = "cnhw";
                                        } else {
                                            str = "cnhw_ar";
                                        }
                                        break;
                                    case 35:
                                        str = "cnfluent";
                                        break;
                                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        str = "frsc";
                                        break;
                                    case 37:
                                        str = "jpsc";
                                        break;
                                    case 38:
                                        str = "krsc";
                                        break;
                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        str = "essc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                        str = "itup";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        str = "rusc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        str = "frfluent";
                                        break;
                                    case 43:
                                        str = "desc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    case 50:
                                        str = "ensc";
                                        break;
                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        str = "itsc";
                                        break;
                                    case 46:
                                        str = "ptsc";
                                        break;
                                    case 47:
                                        str = "esus";
                                        break;
                                    case 48:
                                        str = "esusup";
                                        break;
                                    case 49:
                                        break;
                                    case 51:
                                        str = "ara";
                                        break;
                                    case 52:
                                        str = "arasc";
                                        break;
                                    case 53:
                                        str = "frus";
                                        break;
                                    case 54:
                                        str = "frusup";
                                        break;
                                    case 55:
                                        str = "araup";
                                        break;
                                    case 56:
                                        str = "vtsc";
                                        break;
                                    case 57:
                                        str = "thai";
                                        break;
                                    case 58:
                                        str = "esusfluent";
                                        break;
                                    case 59:
                                        str = "thaisc";
                                        break;
                                    case 60:
                                        str = "tursc";
                                        break;
                                    case 61:
                                        str = "hindi";
                                        break;
                                    case 62:
                                        str = ealNNtLp.BfvQ;
                                        break;
                                    case 63:
                                        str = "ukr";
                                        break;
                                    case 64:
                                        str = "ukrsc";
                                        break;
                                    case 65:
                                        str = "grk";
                                        break;
                                    case 66:
                                        str = "grksc";
                                        break;
                                    case 67:
                                        str = "idnsc";
                                        break;
                                    case 68:
                                        str = "polsc";
                                        break;
                                    case UCrop.REQUEST_CROP /* 69 */:
                                        str = "mal";
                                        break;
                                    case 70:
                                        str = "malsc";
                                        break;
                                    default:
                                        str = BuildConfig.VERSION_NAME;
                                        break;
                                }
                                break;
                        }
                        String strConcat7 = "ic_lan_choose_bg_".concat(str);
                        LingoSkillApplication lingoSkillApplication110 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication110);
                        Resources resources7 = lingoSkillApplication110.getResources();
                        LingoSkillApplication lingoSkillApplication111 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication111);
                        identifier = resources7.getIdentifier(strConcat7, "drawable", lingoSkillApplication111.getPackageName());
                        if (identifier == 0) {
                            identifier = R.drawable.ic_lan_choose_bg_cn;
                        }
                    }
                    Integer numValueOf14 = Integer.valueOf(identifier);
                    sVar4.o0(numValueOf14);
                    obj3 = numValueOf14;
                }
                int iIntValue4 = ((Number) obj3).intValue();
                if (languageItem.getLocate() == 51) {
                    f11 = 1.0f;
                    rVarI = oVar;
                } else {
                    f11 = 1.0f;
                    rVarI = oVar;
                }
                f12 = f11;
                d0.n.c(se.k.y(iIntValue4, sVar4, 0), null, j0.e2.d(rVarI, f11), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 24632, 104);
                if (z12) {
                    sVar4.d0(-509227779);
                    j0.c.g(sVar4, d0.n.h(j0.e2.d(oVar, f12), g2.x.c(((h1.s1) sVar4.j(h1.v1.f31180a)).f31031n, 0.5f), r0Var));
                    r15 = 0;
                } else {
                    r15 = 0;
                    sVar4.d0(-533998670);
                }
                sVar4.p(r15);
                z1.r rVarE12 = j0.e2.e(j0.c.E(oVar, f18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0.75f);
                j0.u uVarA4 = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, r15);
                iHashCode2 = Long.hashCode(sVar4.T);
                l1.q1 q1VarL9 = sVar4.l();
                z1.r rVarC9 = z1.a.c(sVar4, rVarE12);
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar);
                } else {
                    sVar4.r0();
                }
                l1.t.J(hVar6, uVarA4, sVar4);
                l1.t.J(hVar7, q1VarL9, sVar4);
                if (sVar4.S) {
                    defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
                }
                l1.t.J(hVar9, rVarC9, sVar4);
                z1.i iVar5 = z1.c.M;
                z1.r rVarG4 = j0.e2.g(j0.e2.e(oVar, 1.0f), 24);
                j0.a2 a2VarA4 = j0.z1.a(j0.i.f35303a, iVar5, sVar4, 48);
                iHashCode3 = Long.hashCode(sVar4.T);
                l1.q1 q1VarL10 = sVar4.l();
                z1.r rVarC10 = z1.a.c(sVar4, rVarG4);
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar);
                } else {
                    sVar4.r0();
                }
                l1.t.J(hVar6, a2VarA4, sVar4);
                l1.t.J(hVar7, q1VarL10, sVar4);
                if (sVar4.S) {
                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar);
                } else {
                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar);
                }
                l1.t.J(hVar9, rVarC10, sVar4);
                String name4 = languageItem.getName();
                kotlin.jvm.internal.m.e(name4, "getName(...)");
                l1.v1 v1Var5 = ua.f31167a;
                j3.y0 y0Var4 = (j3.y0) sVar4.j(v1Var5);
                long jA7 = fr.j3.A(18);
                n3.s sVar17 = n3.s.L;
                v1Var = h1.v1.f31180a;
                j3.y0 y0VarA4 = j3.y0.a(y0Var4, ob.f.s((h1.s1) sVar4.j(v1Var), sVar4), jA7, sVar17, null, null, 0L, null, u3.l.f52752c, 0, 0, 0L, null, 16773112);
                s0.g gVar5 = new s0.g(fr.j3.A(6), fr.j3.A(18), fr.j3.A(1));
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                iu.k.c(name4, new j0.i1(1.0f, false), y0VarA4, 0, false, 1, 0, gVar5, sVar4, 1572864, 184);
                sVar2 = sVar4;
                if (num4 != null) {
                    sVar2.d0(1349823684);
                    long jS4 = ob.f.s((h1.s1) sVar2.j(v1Var), sVar2);
                    long jA8 = fr.j3.A(10);
                    n3.s sVar18 = n3.s.K;
                    z1.r rVarE13 = j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    oVar2 = oVar;
                    f13 = f5;
                    ua.b("(" + num4 + "%)", rVarE13, jS4, jA8, null, sVar18, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 199728, 0, 131024);
                    sVar3 = sVar2;
                    r16 = 0;
                } else {
                    oVar2 = oVar;
                    f13 = f5;
                    r16 = 0;
                    sVar2.d0(1323808856);
                    sVar3 = sVar2;
                }
                sVar3.p(r16);
                k2.b bVarY4 = se.k.y(R.drawable.ic_lan_choose_checked, sVar3, r16);
                float f110 = f13;
                z1.r rVarE14 = j0.c.E(oVar2, f110, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                l1.s sVar19 = sVar3;
                d0.n.c(bVarY4, null, d2.h.a(rVarE14, f14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar19, 56, 120);
                sVar19.p(true);
                String description4 = languageItem.getDescription();
                kotlin.jvm.internal.m.e(description4, "getDescription(...)");
                iu.k.c(description4, j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f110, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j3.y0.a((j3.y0) sVar19.j(v1Var5), ob.f.s((h1.s1) sVar19.j(v1Var), sVar19), fr.j3.A(12), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 2, 0, new s0.g(fr.j3.A(6), fr.j3.A(12), fr.j3.A(1)), sVar19, 1572912, 184);
                l1.s sVar110 = sVar19;
                sVar110.p(true);
                sVar110.p(true);
                rVar3 = rVar5;
                aVar2 = aVar4;
                num3 = num4;
                j13 = j15;
                sVar = sVar110;
            } else {
                l1.s sVar20 = sVar4;
                sVar20.W();
                rVar3 = rVar2;
                j13 = j12;
                num3 = num2;
                aVar2 = aVar;
                sVar = sVar20;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: bp.g0
                    @Override // fz.e
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        g1.g(rVar3, languageItem, z11, z12, j13, onClick, aVar2, num3, (l1.n) obj4, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        j12 = j11;
        i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i210 = i28 | i14;
        if (sVar4.h(onClick)) {
            i15 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
        } else {
            i15 = 65536;
        }
        i16 = i210 | i15;
        i17 = i12 & 64;
        if (i17 != 0) {
            i19 = i16 | 1572864;
        } else {
            if (sVar4.h(aVar)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i19 = i16 | i18;
        }
        i21 = i12 & 128;
        if (i21 != 0) {
            i23 = i19 | 12582912;
            num2 = num;
        } else {
            num2 = num;
            if (sVar4.f(num2)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i23 = i19 | i22;
        }
        if ((i23 & 4793491) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar4.T(i23 & 1, z13)) {
            sVar4.Y();
            i24 = i11 & 1;
            oVar = z1.o.f58481a;
            gVar = l1.m.f39353a;
            if (i24 != 0) {
                if (i27 != 0) {
                    rVar2 = oVar;
                }
                if ((i12 & 16) != 0) {
                    j12 = ((h1.s1) sVar4.j(h1.v1.f31180a)).f31031n;
                    i23 &= -57345;
                }
                if (i17 != 0) {
                    objQ = sVar4.Q();
                    if (objQ == gVar) {
                        obj = objQ;
                        ju.d dVar2 = new ju.d(25);
                        sVar4.o0(dVar2);
                        obj = dVar2;
                    }
                    obj = objQ;
                    aVar3 = (fz.a) obj;
                } else {
                    aVar3 = aVar;
                }
                if (i21 != 0) {
                    i25 = i23;
                    num4 = null;
                } else {
                    i25 = i23;
                    num4 = num2;
                }
            } else {
                if (i27 != 0) {
                    rVar2 = oVar;
                }
                if ((i12 & 16) != 0) {
                    j12 = ((h1.s1) sVar4.j(h1.v1.f31180a)).f31031n;
                    i23 &= -57345;
                }
                if (i17 != 0) {
                    objQ = sVar4.Q();
                    if (objQ == gVar) {
                        obj = objQ;
                        ju.d dVar3 = new ju.d(25);
                        sVar4.o0(dVar3);
                        obj = dVar3;
                    }
                    obj = objQ;
                    aVar3 = (fz.a) obj;
                } else {
                    aVar3 = aVar;
                }
                if (i21 != 0) {
                    i25 = i23;
                    num4 = null;
                } else {
                    i25 = i23;
                    num4 = num2;
                }
            }
            sVar4.q();
            r0Var = g2.f0.f28556b;
            z1.r rVarH3 = d0.n.h(rVar2, j12, r0Var);
            f5 = 8;
            z1.r rVar6 = rVar2;
            float f111 = 18;
            z1.r rVarE15 = j0.e2.e(j0.e2.g(j0.c.B(rVarH3, f111, f5), 84), 1.0f);
            if ((i25 & 3670016) == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i25 & 458752) == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z14 | z15;
            Object objQ8 = sVar4.Q();
            if (z16) {
                z17 = false;
                s0 s0Var4 = new s0(false ? 1 : 0, aVar3, onClick);
                sVar4.o0(s0Var4);
                obj2 = s0Var4;
            } else {
                z17 = false;
                s0 s0Var5 = new s0(false ? 1 : 0, aVar3, onClick);
                sVar4.o0(s0Var5);
                obj2 = s0Var5;
            }
            z1.r rVarA3 = s2.g0.a(rVarE15, qy.b0.f48488a, (PointerInputEventHandler) obj2);
            w2.q0 q0VarD3 = j0.o.d(z1.c.f58466d, z17);
            long j16 = j12;
            iHashCode = Long.hashCode(sVar4.T);
            l1.q1 q1VarL11 = sVar4.l();
            z1.r rVarC11 = z1.a.c(sVar4, rVarA3);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(iVar);
            } else {
                sVar4.r0();
            }
            y2.h hVar10 = y2.j.f56917f;
            l1.t.J(hVar10, q0VarD3, sVar4);
            y2.h hVar11 = y2.j.f56916e;
            l1.t.J(hVar11, q1VarL11, sVar4);
            hVar = y2.j.f56918g;
            if (sVar4.S) {
                aVar4 = aVar3;
                if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                }
                y2.h hVar12 = y2.j.f56915d;
                l1.t.J(hVar12, rVarC11, sVar4);
                zD = sVar4.d(languageItem.getKeyLanguage());
                Object objQ9 = sVar4.Q();
                obj3 = objQ9;
                if (zD) {
                    if (languageItem.getLocate() == 51) {
                        i26 = 34;
                        if (languageItem.getKeyLanguage() == 34) {
                            identifier = R.drawable.ic_lan_choose_bg_cnhw_ar;
                        }
                        Integer numValueOf15 = Integer.valueOf(identifier);
                        sVar4.o0(numValueOf15);
                        obj3 = numValueOf15;
                    } else {
                        i26 = 34;
                    }
                    if (languageItem.getKeyLanguage() == i26) {
                        identifier = R.drawable.ic_lan_choose_bg_cnhw;
                    } else {
                        int[] iArr8 = bq.r.f4959a;
                        keyLanguage = languageItem.getKeyLanguage();
                        str = "en";
                        switch (keyLanguage) {
                            case 0:
                                str = "cn";
                                break;
                            case 1:
                                str = "jp";
                                break;
                            case 2:
                                str = "kr";
                                break;
                            case 3:
                                break;
                            case 4:
                                str = "es";
                                break;
                            case 5:
                                str = "fr";
                                break;
                            case 6:
                                str = "de";
                                break;
                            case 7:
                                str = "vt";
                                break;
                            case 8:
                                str = "pt";
                                break;
                            case 9:
                                str = "tch";
                                break;
                            case 10:
                                str = "ru";
                                break;
                            case 11:
                                str = "cnup";
                                break;
                            case 12:
                                str = "jpup";
                                break;
                            case 13:
                                str = "krup";
                                break;
                            case 14:
                                str = "esup";
                                break;
                            case 15:
                                str = "frup";
                                break;
                            case 16:
                                str = "deup";
                                break;
                            case 17:
                                str = "ptup";
                                break;
                            case 18:
                                str = "idn";
                                break;
                            case 19:
                                str = "pol";
                                break;
                            case 20:
                                str = "it";
                                break;
                            case 21:
                                str = "tur";
                                break;
                            case 22:
                                str = "ruup";
                                break;
                            default:
                                switch (keyLanguage) {
                                    case 30:
                                        str = "jpfluent";
                                        break;
                                    case 31:
                                        str = "krfluent";
                                        break;
                                    case Consts.SP /* 32 */:
                                        str = "cnsc";
                                        break;
                                    case 33:
                                        str = bjXGJ.JvdJAib;
                                        break;
                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        LingoSkillApplication lingoSkillApplication112 = LingoSkillApplication.f21665b;
                                        if (cf.x.n().locateLanguage != 51) {
                                            str = "cnhw";
                                        } else {
                                            str = "cnhw_ar";
                                        }
                                        break;
                                    case 35:
                                        str = "cnfluent";
                                        break;
                                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        str = "frsc";
                                        break;
                                    case 37:
                                        str = "jpsc";
                                        break;
                                    case 38:
                                        str = "krsc";
                                        break;
                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        str = "essc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                        str = "itup";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        str = "rusc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        str = "frfluent";
                                        break;
                                    case 43:
                                        str = "desc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    case 50:
                                        str = "ensc";
                                        break;
                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        str = "itsc";
                                        break;
                                    case 46:
                                        str = "ptsc";
                                        break;
                                    case 47:
                                        str = "esus";
                                        break;
                                    case 48:
                                        str = "esusup";
                                        break;
                                    case 49:
                                        break;
                                    case 51:
                                        str = "ara";
                                        break;
                                    case 52:
                                        str = "arasc";
                                        break;
                                    case 53:
                                        str = "frus";
                                        break;
                                    case 54:
                                        str = "frusup";
                                        break;
                                    case 55:
                                        str = "araup";
                                        break;
                                    case 56:
                                        str = "vtsc";
                                        break;
                                    case 57:
                                        str = "thai";
                                        break;
                                    case 58:
                                        str = "esusfluent";
                                        break;
                                    case 59:
                                        str = "thaisc";
                                        break;
                                    case 60:
                                        str = "tursc";
                                        break;
                                    case 61:
                                        str = "hindi";
                                        break;
                                    case 62:
                                        str = ealNNtLp.BfvQ;
                                        break;
                                    case 63:
                                        str = "ukr";
                                        break;
                                    case 64:
                                        str = "ukrsc";
                                        break;
                                    case 65:
                                        str = "grk";
                                        break;
                                    case 66:
                                        str = "grksc";
                                        break;
                                    case 67:
                                        str = "idnsc";
                                        break;
                                    case 68:
                                        str = "polsc";
                                        break;
                                    case UCrop.REQUEST_CROP /* 69 */:
                                        str = "mal";
                                        break;
                                    case 70:
                                        str = "malsc";
                                        break;
                                    default:
                                        str = BuildConfig.VERSION_NAME;
                                        break;
                                }
                                break;
                        }
                        String strConcat8 = "ic_lan_choose_bg_".concat(str);
                        LingoSkillApplication lingoSkillApplication113 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication113);
                        Resources resources8 = lingoSkillApplication113.getResources();
                        LingoSkillApplication lingoSkillApplication114 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication114);
                        identifier = resources8.getIdentifier(strConcat8, "drawable", lingoSkillApplication114.getPackageName());
                        if (identifier == 0) {
                            identifier = R.drawable.ic_lan_choose_bg_cn;
                        }
                    }
                    Integer numValueOf16 = Integer.valueOf(identifier);
                    sVar4.o0(numValueOf16);
                    obj3 = numValueOf16;
                } else {
                    if (languageItem.getLocate() == 51) {
                        i26 = 34;
                        if (languageItem.getKeyLanguage() == 34) {
                            identifier = R.drawable.ic_lan_choose_bg_cnhw_ar;
                        }
                        Integer numValueOf17 = Integer.valueOf(identifier);
                        sVar4.o0(numValueOf17);
                        obj3 = numValueOf17;
                    } else {
                        i26 = 34;
                    }
                    if (languageItem.getKeyLanguage() == i26) {
                        identifier = R.drawable.ic_lan_choose_bg_cnhw;
                    } else {
                        int[] iArr9 = bq.r.f4959a;
                        keyLanguage = languageItem.getKeyLanguage();
                        str = "en";
                        switch (keyLanguage) {
                            case 0:
                                str = "cn";
                                break;
                            case 1:
                                str = "jp";
                                break;
                            case 2:
                                str = "kr";
                                break;
                            case 3:
                                break;
                            case 4:
                                str = "es";
                                break;
                            case 5:
                                str = "fr";
                                break;
                            case 6:
                                str = "de";
                                break;
                            case 7:
                                str = "vt";
                                break;
                            case 8:
                                str = "pt";
                                break;
                            case 9:
                                str = "tch";
                                break;
                            case 10:
                                str = "ru";
                                break;
                            case 11:
                                str = "cnup";
                                break;
                            case 12:
                                str = "jpup";
                                break;
                            case 13:
                                str = "krup";
                                break;
                            case 14:
                                str = "esup";
                                break;
                            case 15:
                                str = "frup";
                                break;
                            case 16:
                                str = "deup";
                                break;
                            case 17:
                                str = "ptup";
                                break;
                            case 18:
                                str = "idn";
                                break;
                            case 19:
                                str = "pol";
                                break;
                            case 20:
                                str = "it";
                                break;
                            case 21:
                                str = "tur";
                                break;
                            case 22:
                                str = "ruup";
                                break;
                            default:
                                switch (keyLanguage) {
                                    case 30:
                                        str = "jpfluent";
                                        break;
                                    case 31:
                                        str = "krfluent";
                                        break;
                                    case Consts.SP /* 32 */:
                                        str = "cnsc";
                                        break;
                                    case 33:
                                        str = bjXGJ.JvdJAib;
                                        break;
                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        LingoSkillApplication lingoSkillApplication115 = LingoSkillApplication.f21665b;
                                        if (cf.x.n().locateLanguage != 51) {
                                            str = "cnhw";
                                        } else {
                                            str = "cnhw_ar";
                                        }
                                        break;
                                    case 35:
                                        str = "cnfluent";
                                        break;
                                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        str = "frsc";
                                        break;
                                    case 37:
                                        str = "jpsc";
                                        break;
                                    case 38:
                                        str = "krsc";
                                        break;
                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        str = "essc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                        str = "itup";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        str = "rusc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        str = "frfluent";
                                        break;
                                    case 43:
                                        str = "desc";
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    case 50:
                                        str = "ensc";
                                        break;
                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        str = "itsc";
                                        break;
                                    case 46:
                                        str = "ptsc";
                                        break;
                                    case 47:
                                        str = "esus";
                                        break;
                                    case 48:
                                        str = "esusup";
                                        break;
                                    case 49:
                                        break;
                                    case 51:
                                        str = "ara";
                                        break;
                                    case 52:
                                        str = "arasc";
                                        break;
                                    case 53:
                                        str = "frus";
                                        break;
                                    case 54:
                                        str = "frusup";
                                        break;
                                    case 55:
                                        str = "araup";
                                        break;
                                    case 56:
                                        str = "vtsc";
                                        break;
                                    case 57:
                                        str = "thai";
                                        break;
                                    case 58:
                                        str = "esusfluent";
                                        break;
                                    case 59:
                                        str = "thaisc";
                                        break;
                                    case 60:
                                        str = "tursc";
                                        break;
                                    case 61:
                                        str = "hindi";
                                        break;
                                    case 62:
                                        str = ealNNtLp.BfvQ;
                                        break;
                                    case 63:
                                        str = "ukr";
                                        break;
                                    case 64:
                                        str = "ukrsc";
                                        break;
                                    case 65:
                                        str = "grk";
                                        break;
                                    case 66:
                                        str = "grksc";
                                        break;
                                    case 67:
                                        str = "idnsc";
                                        break;
                                    case 68:
                                        str = "polsc";
                                        break;
                                    case UCrop.REQUEST_CROP /* 69 */:
                                        str = "mal";
                                        break;
                                    case 70:
                                        str = "malsc";
                                        break;
                                    default:
                                        str = BuildConfig.VERSION_NAME;
                                        break;
                                }
                                break;
                        }
                        String strConcat9 = "ic_lan_choose_bg_".concat(str);
                        LingoSkillApplication lingoSkillApplication116 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication116);
                        Resources resources9 = lingoSkillApplication116.getResources();
                        LingoSkillApplication lingoSkillApplication117 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication117);
                        identifier = resources9.getIdentifier(strConcat9, "drawable", lingoSkillApplication117.getPackageName());
                        if (identifier == 0) {
                            identifier = R.drawable.ic_lan_choose_bg_cn;
                        }
                    }
                    Integer numValueOf18 = Integer.valueOf(identifier);
                    sVar4.o0(numValueOf18);
                    obj3 = numValueOf18;
                }
                int iIntValue5 = ((Number) obj3).intValue();
                if (languageItem.getLocate() == 51) {
                    f11 = 1.0f;
                    rVarI = oVar;
                } else {
                    f11 = 1.0f;
                    rVarI = oVar;
                }
                f12 = f11;
                d0.n.c(se.k.y(iIntValue5, sVar4, 0), null, j0.e2.d(rVarI, f11), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 24632, 104);
                if (z12) {
                    sVar4.d0(-509227779);
                    j0.c.g(sVar4, d0.n.h(j0.e2.d(oVar, f12), g2.x.c(((h1.s1) sVar4.j(h1.v1.f31180a)).f31031n, 0.5f), r0Var));
                    r15 = 0;
                } else {
                    r15 = 0;
                    sVar4.d0(-533998670);
                }
                sVar4.p(r15);
                z1.r rVarE16 = j0.e2.e(j0.c.E(oVar, f111, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0.75f);
                j0.u uVarA5 = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, r15);
                iHashCode2 = Long.hashCode(sVar4.T);
                l1.q1 q1VarL12 = sVar4.l();
                z1.r rVarC12 = z1.a.c(sVar4, rVarE16);
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar);
                } else {
                    sVar4.r0();
                }
                l1.t.J(hVar10, uVarA5, sVar4);
                l1.t.J(hVar11, q1VarL12, sVar4);
                if (sVar4.S) {
                    defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
                }
                l1.t.J(hVar12, rVarC12, sVar4);
                z1.i iVar6 = z1.c.M;
                z1.r rVarG5 = j0.e2.g(j0.e2.e(oVar, 1.0f), 24);
                j0.a2 a2VarA5 = j0.z1.a(j0.i.f35303a, iVar6, sVar4, 48);
                iHashCode3 = Long.hashCode(sVar4.T);
                l1.q1 q1VarL13 = sVar4.l();
                z1.r rVarC13 = z1.a.c(sVar4, rVarG5);
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar);
                } else {
                    sVar4.r0();
                }
                l1.t.J(hVar10, a2VarA5, sVar4);
                l1.t.J(hVar11, q1VarL13, sVar4);
                if (sVar4.S) {
                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar);
                } else {
                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar);
                }
                l1.t.J(hVar12, rVarC13, sVar4);
                String name5 = languageItem.getName();
                kotlin.jvm.internal.m.e(name5, "getName(...)");
                l1.v1 v1Var6 = ua.f31167a;
                j3.y0 y0Var5 = (j3.y0) sVar4.j(v1Var6);
                long jA9 = fr.j3.A(18);
                n3.s sVar111 = n3.s.L;
                v1Var = h1.v1.f31180a;
                j3.y0 y0VarA5 = j3.y0.a(y0Var5, ob.f.s((h1.s1) sVar4.j(v1Var), sVar4), jA9, sVar111, null, null, 0L, null, u3.l.f52752c, 0, 0, 0L, null, 16773112);
                s0.g gVar6 = new s0.g(fr.j3.A(6), fr.j3.A(18), fr.j3.A(1));
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                iu.k.c(name5, new j0.i1(1.0f, false), y0VarA5, 0, false, 1, 0, gVar6, sVar4, 1572864, 184);
                sVar2 = sVar4;
                if (num4 != null) {
                    sVar2.d0(1349823684);
                    long jS5 = ob.f.s((h1.s1) sVar2.j(v1Var), sVar2);
                    long jA10 = fr.j3.A(10);
                    n3.s sVar112 = n3.s.K;
                    z1.r rVarE17 = j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    oVar2 = oVar;
                    f13 = f5;
                    ua.b("(" + num4 + "%)", rVarE17, jS5, jA10, null, sVar112, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 199728, 0, 131024);
                    sVar3 = sVar2;
                    r16 = 0;
                } else {
                    oVar2 = oVar;
                    f13 = f5;
                    r16 = 0;
                    sVar2.d0(1323808856);
                    sVar3 = sVar2;
                }
                sVar3.p(r16);
                k2.b bVarY5 = se.k.y(R.drawable.ic_lan_choose_checked, sVar3, r16);
                float f112 = f13;
                z1.r rVarE18 = j0.c.E(oVar2, f112, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                l1.s sVar113 = sVar3;
                d0.n.c(bVarY5, null, d2.h.a(rVarE18, f14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar113, 56, 120);
                sVar113.p(true);
                String description5 = languageItem.getDescription();
                kotlin.jvm.internal.m.e(description5, "getDescription(...)");
                iu.k.c(description5, j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f112, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j3.y0.a((j3.y0) sVar113.j(v1Var6), ob.f.s((h1.s1) sVar113.j(v1Var), sVar113), fr.j3.A(12), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 2, 0, new s0.g(fr.j3.A(6), fr.j3.A(12), fr.j3.A(1)), sVar113, 1572912, 184);
                l1.s sVar114 = sVar113;
                sVar114.p(true);
                sVar114.p(true);
                rVar3 = rVar6;
                aVar2 = aVar4;
                num3 = num4;
                j13 = j16;
                sVar = sVar114;
            } else {
                aVar4 = aVar3;
            }
            defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
            y2.h hVar13 = y2.j.f56915d;
            l1.t.J(hVar13, rVarC11, sVar4);
            zD = sVar4.d(languageItem.getKeyLanguage());
            Object objQ10 = sVar4.Q();
            obj3 = objQ10;
            if (zD) {
                if (languageItem.getLocate() == 51) {
                    i26 = 34;
                    if (languageItem.getKeyLanguage() == 34) {
                        identifier = R.drawable.ic_lan_choose_bg_cnhw_ar;
                    }
                    Integer numValueOf19 = Integer.valueOf(identifier);
                    sVar4.o0(numValueOf19);
                    obj3 = numValueOf19;
                } else {
                    i26 = 34;
                }
                if (languageItem.getKeyLanguage() == i26) {
                    identifier = R.drawable.ic_lan_choose_bg_cnhw;
                } else {
                    int[] iArr10 = bq.r.f4959a;
                    keyLanguage = languageItem.getKeyLanguage();
                    str = "en";
                    switch (keyLanguage) {
                        case 0:
                            str = "cn";
                            break;
                        case 1:
                            str = "jp";
                            break;
                        case 2:
                            str = "kr";
                            break;
                        case 3:
                            break;
                        case 4:
                            str = "es";
                            break;
                        case 5:
                            str = "fr";
                            break;
                        case 6:
                            str = "de";
                            break;
                        case 7:
                            str = "vt";
                            break;
                        case 8:
                            str = "pt";
                            break;
                        case 9:
                            str = "tch";
                            break;
                        case 10:
                            str = "ru";
                            break;
                        case 11:
                            str = "cnup";
                            break;
                        case 12:
                            str = "jpup";
                            break;
                        case 13:
                            str = "krup";
                            break;
                        case 14:
                            str = "esup";
                            break;
                        case 15:
                            str = "frup";
                            break;
                        case 16:
                            str = "deup";
                            break;
                        case 17:
                            str = "ptup";
                            break;
                        case 18:
                            str = "idn";
                            break;
                        case 19:
                            str = "pol";
                            break;
                        case 20:
                            str = "it";
                            break;
                        case 21:
                            str = "tur";
                            break;
                        case 22:
                            str = "ruup";
                            break;
                        default:
                            switch (keyLanguage) {
                                case 30:
                                    str = "jpfluent";
                                    break;
                                case 31:
                                    str = "krfluent";
                                    break;
                                case Consts.SP /* 32 */:
                                    str = "cnsc";
                                    break;
                                case 33:
                                    str = bjXGJ.JvdJAib;
                                    break;
                                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                    LingoSkillApplication lingoSkillApplication118 = LingoSkillApplication.f21665b;
                                    if (cf.x.n().locateLanguage != 51) {
                                        str = "cnhw";
                                    } else {
                                        str = "cnhw_ar";
                                    }
                                    break;
                                case 35:
                                    str = "cnfluent";
                                    break;
                                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                    str = "frsc";
                                    break;
                                case 37:
                                    str = "jpsc";
                                    break;
                                case 38:
                                    str = "krsc";
                                    break;
                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    str = "essc";
                                    break;
                                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                    str = "itup";
                                    break;
                                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                    str = "rusc";
                                    break;
                                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                    str = "frfluent";
                                    break;
                                case 43:
                                    str = "desc";
                                    break;
                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                case 50:
                                    str = "ensc";
                                    break;
                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    str = "itsc";
                                    break;
                                case 46:
                                    str = "ptsc";
                                    break;
                                case 47:
                                    str = "esus";
                                    break;
                                case 48:
                                    str = "esusup";
                                    break;
                                case 49:
                                    break;
                                case 51:
                                    str = "ara";
                                    break;
                                case 52:
                                    str = "arasc";
                                    break;
                                case 53:
                                    str = "frus";
                                    break;
                                case 54:
                                    str = "frusup";
                                    break;
                                case 55:
                                    str = "araup";
                                    break;
                                case 56:
                                    str = "vtsc";
                                    break;
                                case 57:
                                    str = "thai";
                                    break;
                                case 58:
                                    str = "esusfluent";
                                    break;
                                case 59:
                                    str = "thaisc";
                                    break;
                                case 60:
                                    str = "tursc";
                                    break;
                                case 61:
                                    str = "hindi";
                                    break;
                                case 62:
                                    str = ealNNtLp.BfvQ;
                                    break;
                                case 63:
                                    str = "ukr";
                                    break;
                                case 64:
                                    str = "ukrsc";
                                    break;
                                case 65:
                                    str = "grk";
                                    break;
                                case 66:
                                    str = "grksc";
                                    break;
                                case 67:
                                    str = "idnsc";
                                    break;
                                case 68:
                                    str = "polsc";
                                    break;
                                case UCrop.REQUEST_CROP /* 69 */:
                                    str = "mal";
                                    break;
                                case 70:
                                    str = "malsc";
                                    break;
                                default:
                                    str = BuildConfig.VERSION_NAME;
                                    break;
                            }
                            break;
                    }
                    String strConcat10 = "ic_lan_choose_bg_".concat(str);
                    LingoSkillApplication lingoSkillApplication119 = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication119);
                    Resources resources10 = lingoSkillApplication119.getResources();
                    LingoSkillApplication lingoSkillApplication1110 = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication1110);
                    identifier = resources10.getIdentifier(strConcat10, "drawable", lingoSkillApplication1110.getPackageName());
                    if (identifier == 0) {
                        identifier = R.drawable.ic_lan_choose_bg_cn;
                    }
                }
                Integer numValueOf110 = Integer.valueOf(identifier);
                sVar4.o0(numValueOf110);
                obj3 = numValueOf110;
            } else {
                if (languageItem.getLocate() == 51) {
                    i26 = 34;
                    if (languageItem.getKeyLanguage() == 34) {
                        identifier = R.drawable.ic_lan_choose_bg_cnhw_ar;
                    }
                    Integer numValueOf111 = Integer.valueOf(identifier);
                    sVar4.o0(numValueOf111);
                    obj3 = numValueOf111;
                } else {
                    i26 = 34;
                }
                if (languageItem.getKeyLanguage() == i26) {
                    identifier = R.drawable.ic_lan_choose_bg_cnhw;
                } else {
                    int[] iArr11 = bq.r.f4959a;
                    keyLanguage = languageItem.getKeyLanguage();
                    str = "en";
                    switch (keyLanguage) {
                        case 0:
                            str = "cn";
                            break;
                        case 1:
                            str = "jp";
                            break;
                        case 2:
                            str = "kr";
                            break;
                        case 3:
                            break;
                        case 4:
                            str = "es";
                            break;
                        case 5:
                            str = "fr";
                            break;
                        case 6:
                            str = "de";
                            break;
                        case 7:
                            str = "vt";
                            break;
                        case 8:
                            str = "pt";
                            break;
                        case 9:
                            str = "tch";
                            break;
                        case 10:
                            str = "ru";
                            break;
                        case 11:
                            str = "cnup";
                            break;
                        case 12:
                            str = "jpup";
                            break;
                        case 13:
                            str = "krup";
                            break;
                        case 14:
                            str = "esup";
                            break;
                        case 15:
                            str = "frup";
                            break;
                        case 16:
                            str = "deup";
                            break;
                        case 17:
                            str = "ptup";
                            break;
                        case 18:
                            str = "idn";
                            break;
                        case 19:
                            str = "pol";
                            break;
                        case 20:
                            str = "it";
                            break;
                        case 21:
                            str = "tur";
                            break;
                        case 22:
                            str = "ruup";
                            break;
                        default:
                            switch (keyLanguage) {
                                case 30:
                                    str = "jpfluent";
                                    break;
                                case 31:
                                    str = "krfluent";
                                    break;
                                case Consts.SP /* 32 */:
                                    str = "cnsc";
                                    break;
                                case 33:
                                    str = bjXGJ.JvdJAib;
                                    break;
                                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                    LingoSkillApplication lingoSkillApplication1111 = LingoSkillApplication.f21665b;
                                    if (cf.x.n().locateLanguage != 51) {
                                        str = "cnhw";
                                    } else {
                                        str = "cnhw_ar";
                                    }
                                    break;
                                case 35:
                                    str = "cnfluent";
                                    break;
                                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                    str = "frsc";
                                    break;
                                case 37:
                                    str = "jpsc";
                                    break;
                                case 38:
                                    str = "krsc";
                                    break;
                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    str = "essc";
                                    break;
                                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                    str = "itup";
                                    break;
                                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                    str = "rusc";
                                    break;
                                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                    str = "frfluent";
                                    break;
                                case 43:
                                    str = "desc";
                                    break;
                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                case 50:
                                    str = "ensc";
                                    break;
                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    str = "itsc";
                                    break;
                                case 46:
                                    str = "ptsc";
                                    break;
                                case 47:
                                    str = "esus";
                                    break;
                                case 48:
                                    str = "esusup";
                                    break;
                                case 49:
                                    break;
                                case 51:
                                    str = "ara";
                                    break;
                                case 52:
                                    str = "arasc";
                                    break;
                                case 53:
                                    str = "frus";
                                    break;
                                case 54:
                                    str = "frusup";
                                    break;
                                case 55:
                                    str = "araup";
                                    break;
                                case 56:
                                    str = "vtsc";
                                    break;
                                case 57:
                                    str = "thai";
                                    break;
                                case 58:
                                    str = "esusfluent";
                                    break;
                                case 59:
                                    str = "thaisc";
                                    break;
                                case 60:
                                    str = "tursc";
                                    break;
                                case 61:
                                    str = "hindi";
                                    break;
                                case 62:
                                    str = ealNNtLp.BfvQ;
                                    break;
                                case 63:
                                    str = "ukr";
                                    break;
                                case 64:
                                    str = "ukrsc";
                                    break;
                                case 65:
                                    str = "grk";
                                    break;
                                case 66:
                                    str = "grksc";
                                    break;
                                case 67:
                                    str = "idnsc";
                                    break;
                                case 68:
                                    str = "polsc";
                                    break;
                                case UCrop.REQUEST_CROP /* 69 */:
                                    str = "mal";
                                    break;
                                case 70:
                                    str = "malsc";
                                    break;
                                default:
                                    str = BuildConfig.VERSION_NAME;
                                    break;
                            }
                            break;
                    }
                    String strConcat11 = "ic_lan_choose_bg_".concat(str);
                    LingoSkillApplication lingoSkillApplication1112 = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication1112);
                    Resources resources11 = lingoSkillApplication1112.getResources();
                    LingoSkillApplication lingoSkillApplication1113 = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication1113);
                    identifier = resources11.getIdentifier(strConcat11, "drawable", lingoSkillApplication1113.getPackageName());
                    if (identifier == 0) {
                        identifier = R.drawable.ic_lan_choose_bg_cn;
                    }
                }
                Integer numValueOf112 = Integer.valueOf(identifier);
                sVar4.o0(numValueOf112);
                obj3 = numValueOf112;
            }
            int iIntValue6 = ((Number) obj3).intValue();
            if (languageItem.getLocate() == 51) {
                f11 = 1.0f;
                rVarI = oVar;
            } else {
                f11 = 1.0f;
                rVarI = oVar;
            }
            f12 = f11;
            d0.n.c(se.k.y(iIntValue6, sVar4, 0), null, j0.e2.d(rVarI, f11), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 24632, 104);
            if (z12) {
                sVar4.d0(-509227779);
                j0.c.g(sVar4, d0.n.h(j0.e2.d(oVar, f12), g2.x.c(((h1.s1) sVar4.j(h1.v1.f31180a)).f31031n, 0.5f), r0Var));
                r15 = 0;
            } else {
                r15 = 0;
                sVar4.d0(-533998670);
            }
            sVar4.p(r15);
            z1.r rVarE19 = j0.e2.e(j0.c.E(oVar, f111, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0.75f);
            j0.u uVarA6 = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, r15);
            iHashCode2 = Long.hashCode(sVar4.T);
            l1.q1 q1VarL14 = sVar4.l();
            z1.r rVarC14 = z1.a.c(sVar4, rVarE19);
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(iVar);
            } else {
                sVar4.r0();
            }
            l1.t.J(hVar10, uVarA6, sVar4);
            l1.t.J(hVar11, q1VarL14, sVar4);
            if (sVar4.S) {
                defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
            } else {
                defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
            }
            l1.t.J(hVar13, rVarC14, sVar4);
            z1.i iVar7 = z1.c.M;
            z1.r rVarG6 = j0.e2.g(j0.e2.e(oVar, 1.0f), 24);
            j0.a2 a2VarA6 = j0.z1.a(j0.i.f35303a, iVar7, sVar4, 48);
            iHashCode3 = Long.hashCode(sVar4.T);
            l1.q1 q1VarL15 = sVar4.l();
            z1.r rVarC15 = z1.a.c(sVar4, rVarG6);
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(iVar);
            } else {
                sVar4.r0();
            }
            l1.t.J(hVar10, a2VarA6, sVar4);
            l1.t.J(hVar11, q1VarL15, sVar4);
            if (sVar4.S) {
                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar);
            } else {
                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar);
            }
            l1.t.J(hVar13, rVarC15, sVar4);
            String name6 = languageItem.getName();
            kotlin.jvm.internal.m.e(name6, "getName(...)");
            l1.v1 v1Var7 = ua.f31167a;
            j3.y0 y0Var6 = (j3.y0) sVar4.j(v1Var7);
            long jA11 = fr.j3.A(18);
            n3.s sVar115 = n3.s.L;
            v1Var = h1.v1.f31180a;
            j3.y0 y0VarA6 = j3.y0.a(y0Var6, ob.f.s((h1.s1) sVar4.j(v1Var), sVar4), jA11, sVar115, null, null, 0L, null, u3.l.f52752c, 0, 0, 0L, null, 16773112);
            s0.g gVar7 = new s0.g(fr.j3.A(6), fr.j3.A(18), fr.j3.A(1));
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            iu.k.c(name6, new j0.i1(1.0f, false), y0VarA6, 0, false, 1, 0, gVar7, sVar4, 1572864, 184);
            sVar2 = sVar4;
            if (num4 != null) {
                sVar2.d0(1349823684);
                long jS6 = ob.f.s((h1.s1) sVar2.j(v1Var), sVar2);
                long jA12 = fr.j3.A(10);
                n3.s sVar116 = n3.s.K;
                z1.r rVarE110 = j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                oVar2 = oVar;
                f13 = f5;
                ua.b("(" + num4 + "%)", rVarE110, jS6, jA12, null, sVar116, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 199728, 0, 131024);
                sVar3 = sVar2;
                r16 = 0;
            } else {
                oVar2 = oVar;
                f13 = f5;
                r16 = 0;
                sVar2.d0(1323808856);
                sVar3 = sVar2;
            }
            sVar3.p(r16);
            k2.b bVarY6 = se.k.y(R.drawable.ic_lan_choose_checked, sVar3, r16);
            float f113 = f13;
            z1.r rVarE111 = j0.c.E(oVar2, f113, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            if (z11) {
                f14 = 1.0f;
            } else {
                f14 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            l1.s sVar117 = sVar3;
            d0.n.c(bVarY6, null, d2.h.a(rVarE111, f14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar117, 56, 120);
            sVar117.p(true);
            String description6 = languageItem.getDescription();
            kotlin.jvm.internal.m.e(description6, "getDescription(...)");
            iu.k.c(description6, j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f113, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j3.y0.a((j3.y0) sVar117.j(v1Var7), ob.f.s((h1.s1) sVar117.j(v1Var), sVar117), fr.j3.A(12), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 2, 0, new s0.g(fr.j3.A(6), fr.j3.A(12), fr.j3.A(1)), sVar117, 1572912, 184);
            l1.s sVar118 = sVar117;
            sVar118.p(true);
            sVar118.p(true);
            rVar3 = rVar6;
            aVar2 = aVar4;
            num3 = num4;
            j13 = j16;
            sVar = sVar118;
        } else {
            l1.s sVar21 = sVar4;
            sVar21.W();
            rVar3 = rVar2;
            j13 = j12;
            num3 = num2;
            aVar2 = aVar;
            sVar = sVar21;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: bp.g0
                @Override // fz.e
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    g1.g(rVar3, languageItem, z11, z12, j13, onClick, aVar2, num3, (l1.n) obj4, l1.t.M(i11 | 1), i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void s(String emailString, fz.c cVar) {
        if (emailString.length() == 0) {
            return;
        }
        kotlin.jvm.internal.m.f(emailString, "emailString");
        if (!Pattern.compile(scNRoQgKSYX.lXIPZu).matcher(emailString).matches()) {
            return;
        }
        cVar.invoke(emailString);
    }
}
