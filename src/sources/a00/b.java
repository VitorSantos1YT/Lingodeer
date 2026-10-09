package a00;

import a0.k0;
import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import bt.i0;
import bv.c0;
import com.google.api.Service;
import com.google.logging.type.LogSeverity;
import com.lingo.fluent.ui.base.PdVocabularyActivity;
import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingo.me.MeAchievementLanguageDetailActivity;
import com.lingo.me.MeAchievementLeaderBoardDetailActivity;
import com.lingo.me.MeAchievementLevelDetailActivity;
import com.lingo.me.MeAchievementRecordDetailActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import d1.z0;
import dt.a0;
import dt.g4;
import fr.j3;
import g2.f0;
import g2.x;
import h1.dc;
import h1.fc;
import h1.r4;
import h1.s1;
import h1.ua;
import j0.a2;
import j0.b2;
import j0.e2;
import j0.i1;
import j0.o;
import j0.q;
import j0.u;
import j0.v;
import j0.z1;
import j3.x0;
import j3.y0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jt.h2;
import kr.a1;
import l1.c3;
import l1.d0;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.v1;
import l2.h0;
import l2.z;
import ns.r0;
import o3.w;
import qy.b0;
import rt.e3;
import rt.f8;
import rt.g8;
import rt.h7;
import rt.m8;
import rt.me;
import rt.v4;
import rz.e0;
import w2.q0;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f247b;

    public /* synthetic */ b(e eVar, d dVar) {
        this.f246a = 0;
        this.f247b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    private final Object a(Object obj, Object obj2, Object obj3) {
        ?? r15;
        s sVar;
        boolean z11;
        boolean z12;
        s sVar2;
        mh.i iVar = (mh.i) this.f247b;
        v Card = (v) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(Card, "$this$Card");
        s sVar3 = (s) nVar;
        if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            z1.j jVar = z1.c.f58463a;
            q0 q0VarD = o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar3.T);
            q1 q1VarL = sVar3.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar3, oVar);
            y2.k.J.getClass();
            fz.a aVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(aVar);
            } else {
                sVar3.r0();
            }
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, q0VarD, sVar3);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar3);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar3);
            float f5 = 6;
            r rVarA = j0.c.A(oVar, f5);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            u uVarA = j0.t.a(dVar, hVar5, sVar3, 0);
            int iHashCode2 = Long.hashCode(sVar3.T);
            q1 q1VarL2 = sVar3.l();
            r rVarC2 = z1.a.c(sVar3, rVarA);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(aVar);
            } else {
                sVar3.r0();
            }
            t.J(hVar, uVarA, sVar3);
            t.J(hVar2, q1VarL2, sVar3);
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar3);
            q0 q0VarD2 = o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar3.T);
            q1 q1VarL3 = sVar3.l();
            r rVarC3 = z1.a.c(sVar3, oVar);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(aVar);
            } else {
                sVar3.r0();
            }
            t.J(hVar, q0VarD2, sVar3);
            t.J(hVar2, q1VarL3, sVar3);
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar3);
            }
            t.J(hVar4, rVarC3, sVar3);
            gc.h hVar6 = new gc.h((Context) sVar3.j(AndroidCompositionLocals_androidKt.f1200b));
            hVar6.f29004c = iVar.f41138d;
            hVar6.b();
            wb.k.b(hVar6.a(), iVar.f41136b, d2.h.b(e2.g(e2.e(oVar, 1.0f), 100), r0.f.d(9)), se.k.y(R.drawable.ic_me_banner, sVar3, 0), null, w2.i.f54514a, sVar3, 4096, 64496);
            if (iVar.f41141g == mh.f.IN_PROGRESS) {
                sVar3.d0(1755343261);
                d0.n.c(se.k.y(R.drawable.ic_pd_lesson_inprogress, sVar3, 0), null, j0.r.f35391a.a(j0.c.A(oVar, 4), z1.c.K), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 56, 120);
                sVar = sVar3;
                r15 = 0;
            } else {
                r15 = 0;
                sVar3.d0(1749750768);
                sVar = sVar3;
            }
            sVar.p(r15);
            sVar.p(true);
            r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            u uVarA2 = j0.t.a(dVar, hVar5, sVar, r15);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            r rVarC4 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(aVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, uVarA2, sVar);
            t.J(hVar2, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar3);
            }
            t.J(hVar4, rVarC4, sVar);
            s sVar4 = sVar;
            ua.b(iVar.f41136b, null, 0L, 0L, null, n3.s.K, null, 0L, null, 0L, 2, false, 2, 0, null, sVar4, 196608, 3120, 120798);
            float f11 = 8;
            j0.c.g(sVar4, e2.g(oVar, f11));
            String str = iVar.f41137c;
            long jA = j3.A(12);
            v1 v1Var = h1.v1.f31180a;
            ua.b(str, null, ((s1) sVar4.j(v1Var)).f31036s, jA, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, sVar4, 3072, 3120, 120818);
            s sVar5 = sVar4;
            sVar5.p(true);
            sVar5.p(true);
            List list = uh.a.f52967a;
            if (!ry.l.D(c.a.n(), Long.valueOf(iVar.f41135a)) || iVar.f41142h) {
                z11 = true;
                z12 = false;
                sVar5.d0(-1576327380);
                sVar2 = sVar5;
            } else {
                sVar5.d0(-1569464383);
                r rVarB = j0.c.B(d0.n.h(oVar, ((s1) sVar5.j(v1Var)).f31017a, r0.f.f(f11, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 10)), f5, 2);
                q0 q0VarD3 = o.d(jVar, false);
                int iHashCode5 = Long.hashCode(sVar5.T);
                q1 q1VarL5 = sVar5.l();
                r rVarC5 = z1.a.c(sVar5, rVarB);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(aVar);
                } else {
                    sVar5.r0();
                }
                t.J(hVar, q0VarD3, sVar5);
                t.J(hVar2, q1VarL5, sVar5);
                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar5, iHashCode5, hVar3);
                }
                t.J(hVar4, rVarC5, sVar5);
                String upperCase = ub.a.e0(sVar5, R.string.free).toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                ua.b(upperCase, null, ((s1) sVar5.j(v1Var)).f31019b, j3.A(12), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 199680, 0, 131026);
                s sVar6 = sVar5;
                z11 = true;
                sVar6.p(true);
                z12 = false;
                sVar2 = sVar6;
            }
            sVar2.p(z12);
            sVar2.p(z11);
        } else {
            sVar3.W();
        }
        return b0.f48488a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        me meVar = (me) this.f247b;
        b2 TextButton = (b2) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(TextButton, "$this$TextButton");
        s sVar = (s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            ua.b(ub.a.e0(sVar, meVar.b()), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
            r4.b(se.k.y(R.drawable.keyboard_arrow_down_24px, sVar, 0), null, e2.n(z1.o.f58481a, 18), 0L, sVar, 432, 8);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        v4 v4Var = (v4) this.f247b;
        v Card = (v) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(Card, "$this$Card");
        s sVar = (s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            z1.o oVar = z1.o.f58481a;
            r rVarD = e2.d(oVar, 1.0f);
            q0 q0VarD = o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            if (v4Var == v4.PLAYING || v4Var == v4.PREPARING) {
                sVar.d0(-438330804);
                ua.b("II", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(((dc) sVar.j(fc.f30256a)).f30172e, 0L, 0L, n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777211), sVar, 6, 0, 65534);
                sVar = sVar;
                sVar.p(false);
            } else {
                sVar.d0(-438133706);
                l2.e eVarB = ve.i.f54005a;
                if (eVarB == null) {
                    l2.d dVar = new l2.d("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = h0.f39633a;
                    g2.y0 y0Var = new g2.y0(x.f28615b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new l2.n(8.0f, 5.0f));
                    arrayList.add(new z(14.0f));
                    arrayList.add(new l2.u(11.0f, -7.0f));
                    arrayList.add(l2.j.f39641c);
                    l2.d.a(dVar, arrayList, y0Var);
                    eVarB = dVar.b();
                    ve.i.f54005a = eVarB;
                }
                r4.c(eVarB, null, e2.n(oVar, 38), 0L, sVar, 432, 8);
                sVar.p(false);
            }
            sVar.p(true);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        g8 g8Var = (g8) this.f247b;
        b2 AppGradientButton = (b2) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(AppGradientButton, "$this$AppGradientButton");
        s sVar = (s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            iu.k.d(ub.a.e0(sVar, R.string.test_continue) + "(" + ((f8) g8Var).f49745d.size() + ")", null, null, sVar, 0, 6);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        AchievementLanguage achievementLanguage = (AchievementLanguage) this.f247b;
        k0 AnimatedVisibility = (k0) obj;
        ((Integer) obj3).getClass();
        kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
        r rVarG = e2.g(e2.e(z1.o.f58481a, 1.0f), 356);
        s sVar = (s) ((n) obj2);
        boolean zH = sVar.h(achievementLanguage);
        Object objQ = sVar.Q();
        if (zH || objQ == l1.m.f39353a) {
            objQ = new ot.e2(achievementLanguage, 2);
            sVar.o0(objQ);
        }
        d0.n.b(6, (fz.c) objQ, sVar, rVarG);
        return b0.f48488a;
    }

    public /* synthetic */ b(Object obj, int i11) {
        this.f246a = i11;
        this.f247b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:319:0x0c3f  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        boolean z12;
        boolean z13;
        String strM;
        boolean z14;
        y2.h hVar;
        boolean z15;
        int i11;
        int i12;
        int i13 = this.f246a;
        l1.g gVar = l1.m.f39353a;
        int i14 = 3;
        vy.d dVar = null;
        int i15 = 6;
        z1.o oVar = z1.o.f58481a;
        b0 b0Var = b0.f48488a;
        Object obj4 = this.f247b;
        switch (i13) {
            case 0:
                e eVar = (e) obj4;
                e.H.set(eVar, null);
                eVar.a(null);
                return b0Var;
            case 1:
                ((j) obj4).e();
                return b0Var;
            case 2:
                b1.k kVar = (b1.k) obj4;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue = kVar.Y.f(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = kVar.Y.f(iIntValue2);
                }
                if (kVar.W) {
                    long j11 = kVar.T.f44705b;
                    int i16 = x0.f35822c;
                    if (iIntValue == ((int) (j11 >> 32)) && iIntValue2 == ((int) (j11 & 4294967295L))) {
                        z11 = false;
                    } else if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > kVar.T.f44704a.f35700b.length()) {
                        z0 z0Var = kVar.Z;
                        z0Var.s(false);
                        z0Var.p(s0.h0.None);
                        z11 = false;
                    } else {
                        if (zBooleanValue || iIntValue == iIntValue2) {
                            z12 = true;
                            z0 z0Var2 = kVar.Z;
                            z0Var2.s(false);
                            z0Var2.p(s0.h0.None);
                        } else {
                            z12 = true;
                            kVar.Z.h(true);
                        }
                        kVar.U.f51186v.invoke(new w(kVar.T.f44704a, j3.t.b(iIntValue, iIntValue2), (x0) null));
                        z11 = z12;
                    }
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 3:
                c0 c0Var = (c0) obj4;
                k0 AnimatedVisibility = (k0) obj;
                n nVar = (n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                u uVarA = j0.t.a(j0.i.g(8), z1.c.O, nVar, 6);
                s sVar = (s) nVar;
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                r rVarC = z1.a.c(nVar, oVar);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, uVarA, nVar);
                t.J(y2.j.f56916e, q1VarL, nVar);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                }
                t.J(y2.j.f56915d, rVarC, nVar);
                if (c0Var.f6284a.length() > 0) {
                    sVar.d0(-2101945377);
                    i0.g(c0Var.f6285b, 200, 384, c0Var.f6284a, nVar, null);
                    z13 = false;
                } else {
                    z13 = false;
                    sVar.d0(-2126980915);
                }
                sVar.p(z13);
                i0.g(c0Var.f6287d, LogSeverity.NOTICE_VALUE, 384, c0Var.f6286c, nVar, null);
                sVar.p(true);
                return b0Var;
            case 4:
                h2 h2Var = (h2) obj4;
                v Card = (v) obj;
                n nVar2 = (n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                s sVar2 = (s) nVar2;
                if (sVar2.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    g4.b(h2Var.f36962a, y0.a(ct.c.b(sVar2), 0L, ct.c.c(sVar2), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), a0.v(oVar), false, null, false, false, false, 0, null, sVar2, 0, 1016);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 5:
                Uri uri = (Uri) obj;
                String packageName = (String) obj2;
                String title = (String) obj3;
                int i17 = MeAchievementLanguageDetailActivity.H;
                kotlin.jvm.internal.m.f(uri, "uri");
                kotlin.jvm.internal.m.f(packageName, "packageName");
                kotlin.jvm.internal.m.f(title, "title");
                ks.b.i((MeAchievementLanguageDetailActivity) obj4, uri, packageName, title);
                return b0Var;
            case 6:
                Uri uri2 = (Uri) obj;
                String packageName2 = (String) obj2;
                String title2 = (String) obj3;
                int i18 = MeAchievementLeaderBoardDetailActivity.H;
                kotlin.jvm.internal.m.f(uri2, "uri");
                kotlin.jvm.internal.m.f(packageName2, "packageName");
                kotlin.jvm.internal.m.f(title2, "title");
                ks.b.i((MeAchievementLeaderBoardDetailActivity) obj4, uri2, packageName2, title2);
                return b0Var;
            case 7:
                Uri uri3 = (Uri) obj;
                String packageName3 = (String) obj2;
                String title3 = (String) obj3;
                int i19 = MeAchievementLevelDetailActivity.H;
                kotlin.jvm.internal.m.f(uri3, "uri");
                kotlin.jvm.internal.m.f(packageName3, "packageName");
                kotlin.jvm.internal.m.f(title3, "title");
                ks.b.i((MeAchievementLevelDetailActivity) obj4, uri3, packageName3, title3);
                return b0Var;
            case 8:
                Uri uri4 = (Uri) obj;
                String packageName4 = (String) obj2;
                String title4 = (String) obj3;
                int i21 = MeAchievementRecordDetailActivity.H;
                kotlin.jvm.internal.m.f(uri4, "uri");
                kotlin.jvm.internal.m.f(packageName4, "packageName");
                kotlin.jvm.internal.m.f(title4, "title");
                ks.b.i((MeAchievementRecordDetailActivity) obj4, uri4, packageName4, title4);
                return b0Var;
            case 9:
                GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity = (GRKSyllableIntroductionActivity) obj4;
                m0.l item = (m0.l) obj;
                n nVar3 = (n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i22 = GRKSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(item, "$this$item");
                s sVar3 = (s) nVar3;
                if (sVar3.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    q1 q1VarL2 = sVar3.l();
                    r rVarC2 = z1.a.c(sVar3, oVar);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    t.J(y2.j.f56917f, uVarA2, sVar3);
                    t.J(y2.j.f56916e, q1VarL2, sVar3);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
                    }
                    t.J(y2.j.f56915d, rVarC2, sVar3);
                    gRKSyllableIntroductionActivity.v(ub.a.e0(sVar3, R.string.grk_alp_section_content_1), sVar3, 0);
                    gRKSyllableIntroductionActivity.q(ub.a.e0(sVar3, R.string.grk_alp_section_content_2), sVar3, 0);
                    ep.a.C(oVar, 8, sVar3, true);
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 10:
                r0 r0Var = (r0) obj4;
                tg.i0 RichText = (tg.i0) obj;
                n nVar4 = (n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(RichText, "$this$RichText");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((s) nVar4).f(RichText) ? 4 : 2;
                }
                s sVar4 = (s) nVar4;
                if (sVar4.T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    ue.f.d(RichText, r0Var.f44016c, null, sVar4, iIntValue5 & 14);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 11:
                k0 AnimatedVisibility2 = (k0) obj;
                n nVar5 = (n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility2, "$this$AnimatedVisibility");
                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, nVar5, 48);
                s sVar5 = (s) nVar5;
                int iHashCode3 = Long.hashCode(sVar5.T);
                q1 q1VarL3 = sVar5.l();
                r rVarC3 = z1.a.c(nVar5, (r) obj4);
                y2.k.J.getClass();
                y2.i iVar3 = y2.j.f56913b;
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar3);
                } else {
                    sVar5.r0();
                }
                t.J(y2.j.f56917f, a2VarA, nVar5);
                t.J(y2.j.f56916e, q1VarL3, nVar5);
                y2.h hVar4 = y2.j.f56918g;
                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar4);
                }
                t.J(y2.j.f56915d, rVarC3, nVar5);
                k2.b bVarY = se.k.y(R.drawable.course_test_label_hard, nVar5, 0);
                z1.o oVar2 = z1.o.f58481a;
                d0.n.c(bVarY, null, e2.n(oVar2, 22), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, nVar5, 432, 120);
                ua.b(ub.a.e0(nVar5, R.string.challenge_question), j0.c.E(oVar2, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), f0.e(4294932740L), j3.A(14), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), nVar5, 48, 0, 65532);
                sVar5.p(true);
                return b0Var;
            case 12:
                bs.a aVar = (bs.a) obj4;
                l0.c item2 = (l0.c) obj;
                n nVar6 = (n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                s sVar6 = (s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    aVar.getClass();
                    gs.a.l(R.string.chinese_tone_3rd_tone_change_subtitle, R.string.chinese_tone_common_desc_tone_marks_stay, 0, 2, sVar6, null);
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 13:
                bs.b bVar = (bs.b) obj4;
                l0.c item3 = (l0.c) obj;
                n nVar7 = (n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item3, "$this$item");
                s sVar7 = (s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    bVar.getClass();
                    gs.a.l(R.string.chinese_tone_bu_subtitle, R.string.chinese_tone_common_desc_tone_marks_stay, 0, 2, sVar7, null);
                } else {
                    sVar7.W();
                }
                return b0Var;
            case 14:
                bs.c cVar = (bs.c) obj4;
                String str = cVar.f5115d;
                v Card2 = (v) obj;
                n nVar8 = (n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                s sVar8 = (s) nVar8;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    r rVarC4 = j0.c.C(e2.c(oVar, 1.0f), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    u uVarA3 = j0.t.a(j0.i.f35307e, z1.c.O, sVar8, 6);
                    int iHashCode4 = Long.hashCode(sVar8.T);
                    q1 q1VarL4 = sVar8.l();
                    r rVarC5 = z1.a.c(sVar8, rVarC4);
                    y2.k.J.getClass();
                    y2.i iVar4 = y2.j.f56913b;
                    sVar8.h0();
                    if (sVar8.S) {
                        sVar8.k(iVar4);
                    } else {
                        sVar8.r0();
                    }
                    y2.h hVar5 = y2.j.f56917f;
                    t.J(hVar5, uVarA3, sVar8);
                    y2.h hVar6 = y2.j.f56916e;
                    t.J(hVar6, q1VarL4, sVar8);
                    y2.h hVar7 = y2.j.f56918g;
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar8, iHashCode4, hVar7);
                    }
                    y2.h hVar8 = y2.j.f56915d;
                    t.J(hVar8, rVarC5, sVar8);
                    a2 a2VarA2 = z1.a(j0.i.f35303a, z1.c.M, sVar8, 48);
                    int iHashCode5 = Long.hashCode(sVar8.T);
                    q1 q1VarL5 = sVar8.l();
                    r rVarC6 = z1.a.c(sVar8, oVar);
                    sVar8.h0();
                    if (sVar8.S) {
                        sVar8.k(iVar4);
                    } else {
                        sVar8.r0();
                    }
                    t.J(hVar5, a2VarA2, sVar8);
                    t.J(hVar6, q1VarL5, sVar8);
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar8, iHashCode5, hVar7);
                    }
                    t.J(hVar8, rVarC6, sVar8);
                    int i23 = cVar.f5116e;
                    String str2 = cVar.f5113b;
                    String str3 = cVar.f5114c;
                    int length = str.length();
                    String strConcat = BuildConfig.VERSION_NAME;
                    if (length > 0) {
                        if (str3.length() > 0) {
                            strConcat = " → ".concat(str3);
                        }
                        strM = w4.c.h(str, " (", str2, strConcat, ")");
                    } else {
                        if (str3.length() > 0) {
                            strConcat = " → ".concat(str3);
                        }
                        strM = defpackage.e.m(str2, strConcat);
                    }
                    j3.h hVarY = gs.a.y(strM, sVar8);
                    long jA = j3.A(20);
                    n3.s sVar9 = n3.s.H;
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    ua.c(hVarY, new i1(1.0f, true), 0L, jA, sVar9, 0L, null, 0L, 0, false, 0, 0, null, null, null, sVar8, 199680, 0, 262100);
                    sVar8.p(true);
                    if (i23 != 0) {
                        sVar8.d0(-682102893);
                        ua.b(ub.a.e0(sVar8, i23), null, ((s1) sVar8.j(h1.v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 0, 0, 131066);
                        z14 = false;
                    } else {
                        z14 = false;
                        sVar8.d0(-692498929);
                    }
                    sVar8.p(z14);
                    sVar8.p(true);
                } else {
                    sVar8.W();
                }
                return b0Var;
            case 15:
                PdVocabularyActivity pdVocabularyActivity = (PdVocabularyActivity) obj4;
                lc.d dialog = (lc.d) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                CharSequence text = (CharSequence) obj3;
                int i24 = PdVocabularyActivity.Z;
                kotlin.jvm.internal.m.f(dialog, "dialog");
                kotlin.jvm.internal.m.f(text, "text");
                e0.B(LifecycleOwnerKt.getLifecycleScope(pdVocabularyActivity), null, null, new bp.h2(pdVocabularyActivity, iIntValue9, dVar, i15), 3);
                dialog.dismiss();
                return b0Var;
            case 16:
                MALSyllableIntroductionActivity mALSyllableIntroductionActivity = (MALSyllableIntroductionActivity) obj4;
                m0.l item4 = (m0.l) obj;
                n nVar9 = (n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i25 = MALSyllableIntroductionActivity.Q;
                kotlin.jvm.internal.m.f(item4, "$this$item");
                s sVar10 = (s) nVar9;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    u uVarA4 = j0.t.a(j0.i.f35305c, z1.c.O, sVar10, 0);
                    int iHashCode6 = Long.hashCode(sVar10.T);
                    q1 q1VarL6 = sVar10.l();
                    r rVarC7 = z1.a.c(sVar10, oVar);
                    y2.k.J.getClass();
                    y2.i iVar5 = y2.j.f56913b;
                    sVar10.h0();
                    if (sVar10.S) {
                        sVar10.k(iVar5);
                    } else {
                        sVar10.r0();
                    }
                    t.J(y2.j.f56917f, uVarA4, sVar10);
                    t.J(y2.j.f56916e, q1VarL6, sVar10);
                    y2.h hVar9 = y2.j.f56918g;
                    if (sVar10.S || !kotlin.jvm.internal.m.a(sVar10.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar10, iHashCode6, hVar9);
                    }
                    t.J(y2.j.f56915d, rVarC7, sVar10);
                    mALSyllableIntroductionActivity.s("What is Malay?", sVar10, 6);
                    mALSyllableIntroductionActivity.q("Malay is a language within the Malayo-Polynesian branch of the western Austronesian language family, originally spoken by the Malay people. Today, it is the national language of Malaysia, Brunei, and Indonesia—where it is known as \"Indonesian.\" Malay is also one of the four official languages of Singapore.", sVar10, 6);
                    mALSyllableIntroductionActivity.q("The version of Malay taught here is Standard Malay (Bahasa Melayu Standard), which is widely understood across Malaysia, Singapore, and Brunei. Although it shares similarities with Indonesian, differences in vocabulary, pronunciation, and usage have led to a growing divergence between the two languages. Despite this, they remain largely mutually intelligible.", sVar10, 6);
                    mALSyllableIntroductionActivity.q("Malay uses the Latin alphabet, consisting of 26 letters, with a straightforward pronunciation that closely matches its spelling.", sVar10, 6);
                    ep.a.C(oVar, 8, sVar10, true);
                } else {
                    sVar10.W();
                }
                return b0Var;
            case 17:
                kv.e0 e0Var = (kv.e0) obj4;
                q PressableCard = (q) obj;
                n nVar10 = (n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(PressableCard, "$this$PressableCard");
                s sVar11 = (s) nVar10;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    float f5 = 8;
                    r rVarB = j0.c.B(e2.i(e2.e(oVar, 1.0f), 48, CropImageView.DEFAULT_ASPECT_RATIO, 2), 12, f5);
                    a2 a2VarA3 = z1.a(j0.i.g(f5), z1.c.M, sVar11, 54);
                    int iHashCode7 = Long.hashCode(sVar11.T);
                    q1 q1VarL7 = sVar11.l();
                    r rVarC8 = z1.a.c(sVar11, rVarB);
                    y2.k.J.getClass();
                    y2.i iVar6 = y2.j.f56913b;
                    sVar11.h0();
                    if (sVar11.S) {
                        sVar11.k(iVar6);
                    } else {
                        sVar11.r0();
                    }
                    y2.h hVar10 = y2.j.f56917f;
                    t.J(hVar10, a2VarA3, sVar11);
                    y2.h hVar11 = y2.j.f56916e;
                    t.J(hVar11, q1VarL7, sVar11);
                    y2.h hVar12 = y2.j.f56918g;
                    if (sVar11.S || !kotlin.jvm.internal.m.a(sVar11.Q(), Integer.valueOf(iHashCode7))) {
                        defpackage.e.A(iHashCode7, sVar11, iHashCode7, hVar12);
                    }
                    y2.h hVar13 = y2.j.f56915d;
                    t.J(hVar13, rVarC8, sVar11);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    i1 i1Var = new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    z1.j jVar = z1.c.f58467e;
                    q0 q0VarD = o.d(jVar, false);
                    int iHashCode8 = Long.hashCode(sVar11.T);
                    q1 q1VarL8 = sVar11.l();
                    r rVarC9 = z1.a.c(sVar11, i1Var);
                    sVar11.h0();
                    if (sVar11.S) {
                        sVar11.k(iVar6);
                    } else {
                        sVar11.r0();
                    }
                    t.J(hVar10, q0VarD, sVar11);
                    t.J(hVar11, q1VarL8, sVar11);
                    if (sVar11.S || !kotlin.jvm.internal.m.a(sVar11.Q(), Integer.valueOf(iHashCode8))) {
                        hVar = hVar12;
                        defpackage.e.A(iHashCode8, sVar11, iHashCode8, hVar);
                    } else {
                        hVar = hVar12;
                    }
                    t.J(hVar13, rVarC9, sVar11);
                    r rVarE = e2.e(oVar, 1.0f);
                    u uVarA5 = j0.t.a(j0.i.g(2), z1.c.P, sVar11, 54);
                    int iHashCode9 = Long.hashCode(sVar11.T);
                    q1 q1VarL9 = sVar11.l();
                    r rVarC10 = z1.a.c(sVar11, rVarE);
                    sVar11.h0();
                    if (sVar11.S) {
                        sVar11.k(iVar6);
                    } else {
                        sVar11.r0();
                    }
                    t.J(hVar10, uVarA5, sVar11);
                    t.J(hVar11, q1VarL9, sVar11);
                    if (sVar11.S || !kotlin.jvm.internal.m.a(sVar11.Q(), Integer.valueOf(iHashCode9))) {
                        defpackage.e.A(iHashCode9, sVar11, iHashCode9, hVar);
                    }
                    t.J(hVar13, rVarC10, sVar11);
                    String str4 = e0Var.f38729a;
                    y2.h hVar14 = hVar;
                    List list = e0Var.f38732d;
                    d0 d0Var = ua.f31167a;
                    y0 y0Var = (y0) sVar11.j(d0Var);
                    long jA2 = j3.A(20);
                    n3.s sVar12 = n3.s.H;
                    c3 c3Var = h1.v1.f31180a;
                    iv.a.d(str4, list, y0.a(y0Var, ((s1) sVar11.j(c3Var)).f31034q, jA2, sVar12, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), 20, 10, sVar11, 27648);
                    iv.a.d(e0Var.f38730b, e0Var.f38733e, y0.a((y0) sVar11.j(d0Var), ((s1) sVar11.j(c3Var)).f31036s, j3.A(13), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), 13, 7, sVar11, 27648);
                    sVar11.p(true);
                    sVar11.p(true);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    i1 i1Var2 = new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    q0 q0VarD2 = o.d(jVar, false);
                    int iHashCode10 = Long.hashCode(sVar11.T);
                    q1 q1VarL10 = sVar11.l();
                    r rVarC11 = z1.a.c(sVar11, i1Var2);
                    sVar11.h0();
                    if (sVar11.S) {
                        sVar11.k(iVar6);
                    } else {
                        sVar11.r0();
                    }
                    t.J(hVar10, q0VarD2, sVar11);
                    t.J(hVar11, q1VarL10, sVar11);
                    if (sVar11.S || !kotlin.jvm.internal.m.a(sVar11.Q(), Integer.valueOf(iHashCode10))) {
                        defpackage.e.A(iHashCode10, sVar11, iHashCode10, hVar14);
                    }
                    t.J(hVar13, rVarC11, sVar11);
                    iu.k.c(e0Var.f38731c, e2.e(oVar, 1.0f), y0.a((y0) sVar11.j(d0Var), ((s1) sVar11.j(c3Var)).f31036s, j3.A(14), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), 0, false, 2, 0, new s0.g(j3.A(7), j3.A(14), j3.A(1)), sVar11, 1572912, 184);
                    sVar11.p(true);
                    sVar11.p(true);
                } else {
                    sVar11.W();
                }
                return b0Var;
            case 18:
                ml.a aVar2 = (ml.a) obj4;
                v Card3 = (v) obj;
                n nVar11 = (n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i26 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(Card3, "$this$Card");
                s sVar13 = (s) nVar11;
                if (sVar13.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    z1.h hVar15 = z1.c.P;
                    j0.e eVar2 = j0.i.f35308f;
                    r rVarD = e2.d(oVar, 1.0f);
                    boolean zH = sVar13.h(aVar2);
                    Object objQ = sVar13.Q();
                    if (zH || objQ == gVar) {
                        objQ = new hh.o(aVar2, 13);
                        sVar13.o0(objQ);
                    }
                    r rVarO = d0.n.o(rVarD, false, null, (fz.a) objQ, 15);
                    u uVarA6 = j0.t.a(eVar2, hVar15, sVar13, 54);
                    int iHashCode11 = Long.hashCode(sVar13.T);
                    q1 q1VarL11 = sVar13.l();
                    r rVarC12 = z1.a.c(sVar13, rVarO);
                    y2.k.J.getClass();
                    y2.i iVar7 = y2.j.f56913b;
                    sVar13.h0();
                    if (sVar13.S) {
                        sVar13.k(iVar7);
                    } else {
                        sVar13.r0();
                    }
                    t.J(y2.j.f56917f, uVarA6, sVar13);
                    t.J(y2.j.f56916e, q1VarL11, sVar13);
                    y2.h hVar16 = y2.j.f56918g;
                    if (sVar13.S || !kotlin.jvm.internal.m.a(sVar13.Q(), Integer.valueOf(iHashCode11))) {
                        defpackage.e.A(iHashCode11, sVar13, iHashCode11, hVar16);
                    }
                    t.J(y2.j.f56915d, rVarC12, sVar13);
                    d0 d0Var2 = ua.f31167a;
                    ua.b("main raam hoon", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar13.j(d0Var2), se.i.k(sVar13, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar13, 6, 0, 65534);
                    ua.b("मैं राम हूँ |", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar13.j(d0Var2), se.i.k(sVar13, R.color.primary_black), j3.A(16), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar13, 6, 0, 65534);
                    ua.b(ub.a.e0(sVar13, R.string.hindi_alp_section_content_20), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar13.j(d0Var2), se.i.k(sVar13, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar13, 0, 0, 65534);
                    sVar13.p(true);
                } else {
                    sVar13.W();
                }
                return b0Var;
            case 19:
                kr.d0 d0Var3 = (kr.d0) obj4;
                b2 OutlinedButton = (b2) obj;
                n nVar12 = (n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedButton, "$this$OutlinedButton");
                s sVar14 = (s) nVar12;
                if (sVar14.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    if (d0Var3.f38442c >= d0Var3.f38440a.size() - 1) {
                        i11 = -1000417183;
                        i12 = R.string._finish;
                        z15 = false;
                    } else {
                        z15 = false;
                        i11 = -1000413528;
                        i12 = R.string.next;
                    }
                    iu.k.d(ep.a.m(sVar14, i11, i12, sVar14, z15), null, null, sVar14, 0, 6);
                } else {
                    sVar14.W();
                }
                return b0Var;
            case 20:
                k0 AnimatedVisibility3 = (k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility3, "$this$AnimatedVisibility");
                ua.b(((a1) obj4).f38410a.f34557a.getTranslation(), j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, (n) obj2, 48, 0, 130556);
                return b0Var;
            case 21:
                WordSentenceCharacterType wordSentenceCharacterType = (WordSentenceCharacterType) obj4;
                v KnowledgeNoteEditorSheetContent = (v) obj;
                n nVar13 = (n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(KnowledgeNoteEditorSheetContent, "$this$KnowledgeNoteEditorSheetContent");
                s sVar15 = (s) nVar13;
                if (sVar15.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    kt.l.e(wordSentenceCharacterType, null, false, sVar15, 0);
                } else {
                    sVar15.W();
                }
                return b0Var;
            case 22:
                return a(obj, obj2, obj3);
            case 23:
                return c(obj, obj2, obj3);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                String bookmarkValue = (String) obj;
                long jLongValue = ((Long) obj2).longValue();
                String str5 = (String) obj3;
                kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
                kotlin.jvm.internal.m.f(str5, scqhIrGXy.QRiHBOGBMrOX);
                ((e3) obj4).E(jLongValue, bookmarkValue, str5);
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return d(obj, obj2, obj3);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                String reviewId = (String) obj;
                long jLongValue2 = ((Long) obj2).longValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.m.f(reviewId, "reviewId");
                ((m8) obj4).f(new h7(reviewId, jLongValue2, zBooleanValue2));
                return b0Var;
            case 27:
                return e(obj, obj2, obj3);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return h(obj, obj2, obj3);
            default:
                AchievementLeaderBoard achievementLeaderBoard = (AchievementLeaderBoard) obj4;
                k0 AnimatedVisibility4 = (k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility4, "$this$AnimatedVisibility");
                r rVarG = e2.g(e2.e(oVar, 1.0f), 356);
                s sVar16 = (s) ((n) obj2);
                boolean zH2 = sVar16.h(achievementLeaderBoard);
                Object objQ2 = sVar16.Q();
                if (zH2 || objQ2 == gVar) {
                    objQ2 = new ot.e2(achievementLeaderBoard, i14);
                    sVar16.o0(objQ2);
                }
                d0.n.b(6, (fz.c) objQ2, sVar16, rVarG);
                return b0Var;
        }
    }
}
