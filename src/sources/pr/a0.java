package pr;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import bp.d1;
import ci.m0;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.lingo.fluent.ui.game.adapter.WordListenGameFinishAdapter;
import com.lingo.fluent.ui.game.adapter.WordReviewListAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonStudySimpleAdapter;
import com.lingo.lingoskill.object.BaseReviewGroup;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import com.lingo.lingoskill.ui.review.adapter.BaseReviewCateAdapter;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.Bookmark;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.RxPermissions;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.v0;
import hj.c2;
import hj.c3;
import hj.i1;
import hj.r1;
import hj.s1;
import j3.p0;
import j3.t0;
import j3.u0;
import j3.x0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import l1.b1;
import qh.k0;
import qp.h2;
import qp.i2;
import qp.j4;
import qp.k2;
import qp.m3;
import qp.p3;
import qp.t4;
import qp.z2;
import rt.ke;
import rt.oe;
import rt.v7;
import s0.e1;
import s0.f1;
import s0.l0;
import s0.o1;
import s0.s0;
import s0.t1;
import y.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46998d;

    public /* synthetic */ a0(fz.e eVar, Map.Entry entry, b1 b1Var) {
        this.f46995a = 23;
        this.f46998d = eVar;
        this.f46996b = entry;
        this.f46997c = b1Var;
    }

    private final Object a(Object obj) {
        s0 s0Var = (s0) this.f46996b;
        o3.w wVar = (o3.w) this.f46997c;
        o3.p pVar = (o3.p) this.f46998d;
        i2.d dVar = (i2.d) obj;
        o1 o1VarD = s0Var.d();
        if (o1VarD != null) {
            g2.v vVarX = dVar.j0().x();
            long j11 = ((x0) s0Var.A.getValue()).f35823a;
            long j12 = ((x0) s0Var.B.getValue()).f35823a;
            u0 u0Var = o1VarD.f51124a;
            j3.x xVar = u0Var.f35798b;
            t0 t0Var = u0Var.f35797a;
            a.a aVar = s0Var.f51189y;
            long j13 = s0Var.f51190z;
            if (!x0.c(j11)) {
                aVar.N(j13);
                int iS = pVar.s(x0.f(j11));
                int iS2 = pVar.s(x0.e(j11));
                if (iS != iS2) {
                    vVarX.j(u0Var.i(iS, iS2), aVar);
                }
            } else if (!x0.c(j12)) {
                long jB = t0Var.f35785b.b();
                g2.x xVar2 = new g2.x(jB);
                if (jB == 16) {
                    xVar2 = null;
                }
                long j14 = xVar2 != null ? xVar2.f28624a : g2.x.f28615b;
                aVar.N(g2.x.c(j14, g2.x.e(j14) * 0.2f));
                int iS3 = pVar.s(x0.f(j12));
                int iS4 = pVar.s(x0.e(j12));
                if (iS3 != iS4) {
                    vVarX.j(u0Var.i(iS3, iS4), aVar);
                }
            } else if (!x0.c(wVar.f44705b)) {
                aVar.N(j13);
                long j15 = wVar.f44705b;
                int iS5 = pVar.s(x0.f(j15));
                int iS6 = pVar.s(x0.e(j15));
                if (iS5 != iS6) {
                    vVarX.j(u0Var.i(iS5, iS6), aVar);
                }
            }
            boolean z11 = u0Var.d() && t0Var.f35789f != 3;
            if (z11) {
                long j16 = u0Var.f35799c;
                f2.c cVarE = com.bumptech.glide.e.e(0L, (((long) Float.floatToRawIntBits((int) (j16 >> 32))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((int) (j16 & 4294967295L)))));
                vVarX.e();
                g2.v.r(vVarX, cVarE);
            }
            p0 p0Var = t0Var.f35785b.f35827a;
            u3.l lVar = p0Var.m;
            u3.o oVar = p0Var.f35754a;
            if (lVar == null) {
                lVar = u3.l.f52751b;
            }
            u3.l lVar2 = lVar;
            v0 v0Var = p0Var.f35766n;
            if (v0Var == null) {
                v0Var = v0.f28610d;
            }
            v0 v0Var2 = v0Var;
            i2.e eVar = p0Var.f35768p;
            if (eVar == null) {
                eVar = i2.g.f34126a;
            }
            i2.e eVar2 = eVar;
            try {
                g2.t tVarC = oVar.c();
                u3.n nVar = u3.n.f52756a;
                if (tVarC != null) {
                    j3.x.j(xVar, vVarX, tVarC, oVar != nVar ? oVar.a() : 1.0f, v0Var2, lVar2, eVar2);
                } else {
                    j3.x.i(xVar, vVarX, oVar != nVar ? oVar.b() : g2.x.f28615b, v0Var2, lVar2, eVar2, 32);
                }
            } finally {
                if (z11) {
                    vVarX.p();
                }
            }
        }
        return qy.b0.f48488a;
    }

    private final Object c(Object obj) {
        Integer numD;
        Integer numE;
        Integer numE2;
        Integer numD2;
        u0 u0Var;
        u0 u0Var2;
        o1 o1Var;
        o1 o1Var2;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        u0 u0Var3;
        u0 u0Var4;
        o1 o1Var3;
        o1 o1Var4;
        qp.r rVar;
        l0 l0Var = (l0) this.f46996b;
        f1 f1Var = (f1) this.f46997c;
        kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f46998d;
        d1.p0 p0Var = (d1.p0) obj;
        int i11 = 2;
        o3.w wVar = null;
        switch (e1.f51024a[l0Var.ordinal()]) {
            case 1:
                f1Var.f51028b.d(false);
                break;
            case 2:
                f1Var.f51028b.o();
                break;
            case 3:
                f1Var.f51028b.f();
                break;
            case 4:
                p0Var.f22961e.f22905a = null;
                if (p0Var.f22963g.f35700b.length() > 0) {
                    if (x0.c(p0Var.f22962f)) {
                        p0Var.i();
                    } else if (!p0Var.f()) {
                        int iE = x0.e(p0Var.f22962f);
                        p0Var.q(iE, iE);
                    } else {
                        int iF = x0.f(p0Var.f22962f);
                        p0Var.q(iF, iF);
                    }
                }
                break;
            case 5:
                p0Var.f22961e.f22905a = null;
                if (p0Var.f22963g.f35700b.length() > 0) {
                    if (x0.c(p0Var.f22962f)) {
                        p0Var.m();
                    } else if (!p0Var.f()) {
                        int iF2 = x0.f(p0Var.f22962f);
                        p0Var.q(iF2, iF2);
                    } else {
                        int iE2 = x0.e(p0Var.f22962f);
                        p0Var.q(iE2, iE2);
                    }
                }
                break;
            case 6:
                d1.f1 f1Var2 = p0Var.f22961e;
                f1Var2.f22905a = null;
                j3.h hVar = p0Var.f22963g;
                String str = hVar.f35700b;
                String str2 = hVar.f35700b;
                if (str.length() > 0) {
                    if (!p0Var.f()) {
                        f1Var2.f22905a = null;
                        if (str2.length() > 0 && (numD = p0Var.d()) != null) {
                            int iIntValue = numD.intValue();
                            p0Var.q(iIntValue, iIntValue);
                        }
                    } else {
                        f1Var2.f22905a = null;
                        if (str2.length() > 0 && (numE = p0Var.e()) != null) {
                            int iIntValue2 = numE.intValue();
                            p0Var.q(iIntValue2, iIntValue2);
                        }
                    }
                }
                break;
            case 7:
                d1.f1 f1Var3 = p0Var.f22961e;
                f1Var3.f22905a = null;
                j3.h hVar2 = p0Var.f22963g;
                String str3 = hVar2.f35700b;
                String str4 = hVar2.f35700b;
                if (str3.length() > 0) {
                    if (!p0Var.f()) {
                        f1Var3.f22905a = null;
                        if (str4.length() > 0 && (numE2 = p0Var.e()) != null) {
                            int iIntValue3 = numE2.intValue();
                            p0Var.q(iIntValue3, iIntValue3);
                        }
                    } else {
                        f1Var3.f22905a = null;
                        if (str4.length() > 0 && (numD2 = p0Var.d()) != null) {
                            int iIntValue4 = numD2.intValue();
                            p0Var.q(iIntValue4, iIntValue4);
                        }
                    }
                }
                break;
            case 8:
                p0Var.l();
                break;
            case 9:
                p0Var.j();
                break;
            case 10:
                if (p0Var.f22963g.f35700b.length() > 0 && (u0Var = p0Var.f22959c) != null) {
                    int iG = p0Var.g(u0Var, -1);
                    p0Var.q(iG, iG);
                }
                break;
            case 11:
                if (p0Var.f22963g.f35700b.length() > 0 && (u0Var2 = p0Var.f22959c) != null) {
                    int iG2 = p0Var.g(u0Var2, 1);
                    p0Var.q(iG2, iG2);
                }
                break;
            case 12:
                if (p0Var.f22963g.f35700b.length() > 0 && (o1Var = p0Var.f22965i) != null) {
                    int iH = p0Var.h(o1Var, -1);
                    p0Var.q(iH, iH);
                }
                break;
            case 13:
                if (p0Var.f22963g.f35700b.length() > 0 && (o1Var2 = p0Var.f22965i) != null) {
                    int iH2 = p0Var.h(o1Var2, 1);
                    p0Var.q(iH2, iH2);
                }
                break;
            case 14:
                p0Var.o();
                break;
            case 15:
                p0Var.n();
                break;
            case 16:
                p0Var.f22961e.f22905a = null;
                if (p0Var.f22963g.f35700b.length() > 0) {
                    if (!p0Var.f()) {
                        p0Var.n();
                    } else {
                        p0Var.o();
                    }
                }
                break;
            case 17:
                p0Var.f22961e.f22905a = null;
                if (p0Var.f22963g.f35700b.length() > 0) {
                    if (!p0Var.f()) {
                        p0Var.o();
                    } else {
                        p0Var.n();
                    }
                }
                break;
            case 18:
                p0Var.f22961e.f22905a = null;
                if (p0Var.f22963g.f35700b.length() > 0) {
                    p0Var.q(0, 0);
                }
                break;
            case 19:
                p0Var.f22961e.f22905a = null;
                j3.h hVar3 = p0Var.f22963g;
                if (hVar3.f35700b.length() > 0) {
                    int length = hVar3.f35700b.length();
                    p0Var.q(length, length);
                }
                break;
            case 20:
                List listA = p0Var.a(new v7(17));
                if (listA != null) {
                    f1Var.a(listA);
                }
                break;
            case 21:
                List listA2 = p0Var.a(new v7(18));
                if (listA2 != null) {
                    f1Var.a(listA2);
                }
                break;
            case 22:
                List listA3 = p0Var.a(new v7(19));
                if (listA3 != null) {
                    f1Var.a(listA3);
                }
                break;
            case 23:
                List listA4 = p0Var.a(new v7(20));
                if (listA4 != null) {
                    f1Var.a(listA4);
                }
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                List listA5 = p0Var.a(new v7(21));
                if (listA5 != null) {
                    f1Var.a(listA5);
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                List listA6 = p0Var.a(new v7(22));
                if (listA6 != null) {
                    f1Var.a(listA6);
                }
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                if (!f1Var.f51031e) {
                    f1Var.a(ns.o.K(new o3.a("\n", 1)));
                } else {
                    uVar.f38357a = f1Var.f51027a.f51188x.f51243b.f51182r.b(f1Var.f51038l);
                }
                break;
            case 27:
                if (!f1Var.f51031e) {
                    f1Var.a(ns.o.K(new o3.a("\t", 1)));
                } else {
                    uVar.f38357a = false;
                }
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                p0Var.f22961e.f22905a = null;
                j3.h hVar4 = p0Var.f22963g;
                if (hVar4.f35700b.length() > 0) {
                    p0Var.q(0, hVar4.f35700b.length());
                }
                break;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                p0Var.i();
                p0Var.p();
                break;
            case 30:
                p0Var.m();
                p0Var.p();
                break;
            case 31:
                d1.f1 f1Var4 = p0Var.f22961e;
                f1Var4.f22905a = null;
                j3.h hVar5 = p0Var.f22963g;
                String str5 = hVar5.f35700b;
                String str6 = hVar5.f35700b;
                if (str5.length() > 0) {
                    if (p0Var.f()) {
                        f1Var4.f22905a = null;
                        if (str6.length() > 0 && (numE3 = p0Var.e()) != null) {
                            int iIntValue5 = numE3.intValue();
                            p0Var.q(iIntValue5, iIntValue5);
                        }
                    } else {
                        f1Var4.f22905a = null;
                        if (str6.length() > 0 && (numD3 = p0Var.d()) != null) {
                            int iIntValue6 = numD3.intValue();
                            p0Var.q(iIntValue6, iIntValue6);
                        }
                    }
                }
                p0Var.p();
                break;
            case Consts.SP /* 32 */:
                d1.f1 f1Var5 = p0Var.f22961e;
                f1Var5.f22905a = null;
                j3.h hVar6 = p0Var.f22963g;
                String str7 = hVar6.f35700b;
                String str8 = hVar6.f35700b;
                if (str7.length() > 0) {
                    if (p0Var.f()) {
                        f1Var5.f22905a = null;
                        if (str8.length() > 0 && (numD4 = p0Var.d()) != null) {
                            int iIntValue7 = numD4.intValue();
                            p0Var.q(iIntValue7, iIntValue7);
                        }
                    } else {
                        f1Var5.f22905a = null;
                        if (str8.length() > 0 && (numE4 = p0Var.e()) != null) {
                            int iIntValue8 = numE4.intValue();
                            p0Var.q(iIntValue8, iIntValue8);
                        }
                    }
                }
                p0Var.p();
                break;
            case 33:
                p0Var.l();
                p0Var.p();
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                p0Var.j();
                p0Var.p();
                break;
            case 35:
                p0Var.o();
                p0Var.p();
                break;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                p0Var.n();
                p0Var.p();
                break;
            case 37:
                p0Var.f22961e.f22905a = null;
                if (p0Var.f22963g.f35700b.length() > 0) {
                    if (p0Var.f()) {
                        p0Var.o();
                    } else {
                        p0Var.n();
                    }
                }
                p0Var.p();
                break;
            case 38:
                p0Var.f22961e.f22905a = null;
                if (p0Var.f22963g.f35700b.length() > 0) {
                    if (p0Var.f()) {
                        p0Var.n();
                    } else {
                        p0Var.o();
                    }
                }
                p0Var.p();
                break;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                if (p0Var.f22963g.f35700b.length() > 0 && (u0Var3 = p0Var.f22959c) != null) {
                    int iG3 = p0Var.g(u0Var3, -1);
                    p0Var.q(iG3, iG3);
                }
                p0Var.p();
                break;
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                if (p0Var.f22963g.f35700b.length() > 0 && (u0Var4 = p0Var.f22959c) != null) {
                    int iG4 = p0Var.g(u0Var4, 1);
                    p0Var.q(iG4, iG4);
                }
                p0Var.p();
                break;
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                if (p0Var.f22963g.f35700b.length() > 0 && (o1Var3 = p0Var.f22965i) != null) {
                    int iH3 = p0Var.h(o1Var3, -1);
                    p0Var.q(iH3, iH3);
                }
                p0Var.p();
                break;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                if (p0Var.f22963g.f35700b.length() > 0 && (o1Var4 = p0Var.f22965i) != null) {
                    int iH4 = p0Var.h(o1Var4, 1);
                    p0Var.q(iH4, iH4);
                }
                p0Var.p();
                break;
            case 43:
                p0Var.f22961e.f22905a = null;
                if (p0Var.f22963g.f35700b.length() > 0) {
                    p0Var.q(0, 0);
                }
                p0Var.p();
                break;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                p0Var.f22961e.f22905a = null;
                j3.h hVar7 = p0Var.f22963g;
                if (hVar7.f35700b.length() > 0) {
                    int length2 = hVar7.f35700b.length();
                    p0Var.q(length2, length2);
                }
                p0Var.p();
                break;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                p0Var.f22961e.f22905a = null;
                if (p0Var.f22963g.f35700b.length() > 0) {
                    long j11 = p0Var.f22962f;
                    int i12 = x0.f35822c;
                    int i13 = (int) (j11 & 4294967295L);
                    p0Var.q(i13, i13);
                }
                break;
            case 46:
                t1 t1Var = f1Var.f51034h;
                if (t1Var != null) {
                    t1Var.a(o3.w.a(p0Var.f22964h, p0Var.f22963g, p0Var.f22962f, 4));
                }
                t1 t1Var2 = f1Var.f51034h;
                if (t1Var2 != null) {
                    qp.r rVar2 = t1Var2.f51196a;
                    if (rVar2 != null && (rVar = (qp.r) rVar2.f48145b) != null) {
                        t1Var2.f51196a = rVar;
                        t1Var2.f51198c -= ((o3.w) rVar2.f48146c).f44704a.f35700b.length();
                        t1Var2.f51197b = new qp.r(i11, t1Var2.f51197b, (o3.w) rVar2.f48146c);
                        wVar = (o3.w) rVar.f48146c;
                    }
                    if (wVar != null) {
                        f1Var.f51037k.invoke(wVar);
                    }
                }
                break;
            case 47:
                t1 t1Var3 = f1Var.f51034h;
                if (t1Var3 != null) {
                    qp.r rVar3 = t1Var3.f51197b;
                    if (rVar3 != null) {
                        t1Var3.f51197b = (qp.r) rVar3.f48145b;
                        o3.w wVar2 = (o3.w) rVar3.f48146c;
                        t1Var3.f51196a = new qp.r(i11, t1Var3.f51196a, wVar2);
                        t1Var3.f51198c = wVar2.f44704a.f35700b.length() + t1Var3.f51198c;
                        wVar = (o3.w) rVar3.f48146c;
                    }
                    if (wVar != null) {
                        f1Var.f51037k.invoke(wVar);
                    }
                }
                break;
            case 48:
            case 49:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return qy.b0.f48488a;
    }

    private final Object d(Object obj) {
        fz.e eVar = (fz.e) this.f46998d;
        Map.Entry entry = (Map.Entry) this.f46996b;
        b1 b1Var = (b1) this.f46997c;
        String it = (String) obj;
        kotlin.jvm.internal.m.f(it, "it");
        b1Var.setValue(new qy.l(null, new v3.j(0L)));
        eVar.invoke(it, Integer.valueOf(((vs.k) entry.getKey()).f54170c));
        return qy.b0.f48488a;
    }

    private final Object e(Object obj) {
        Map map = (Map) this.f46996b;
        fz.e eVar = (fz.e) this.f46998d;
        b1 b1Var = (b1) this.f46997c;
        l0.h LazyColumn = (l0.h) obj;
        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
        for (Map.Entry entry : map.entrySet()) {
            l0.h.p(LazyColumn, null, new t1.d(new defpackage.d(entry, eVar, b1Var, 16), true, 1187411540), 3);
            List list = (List) entry.getValue();
            LazyColumn.q(list.size(), null, new qu.m(7, list), new t1.d(new dl.n(list, eVar, b1Var, 6), true, 802480018));
        }
        l0.h.p(LazyColumn, null, us.b.f53076b, 3);
        return qy.b0.f48488a;
    }

    private final Object h(Object obj) {
        PinyinLessonStudySimpleAdapter pinyinLessonStudySimpleAdapter = (PinyinLessonStudySimpleAdapter) this.f46996b;
        ImageView imageView = (ImageView) this.f46997c;
        xi.a aVar = (xi.a) this.f46998d;
        View it = (View) obj;
        kotlin.jvm.internal.m.f(it, "it");
        fz.e eVar = pinyinLessonStudySimpleAdapter.f21746a;
        kotlin.jvm.internal.m.c(imageView);
        eVar.invoke(imageView, com.bumptech.glide.f.r(1, aVar.f56085a));
        return qy.b0.f48488a;
    }

    private final Object j(Object obj) {
        ArrayList arrayList = (ArrayList) this.f46996b;
        Set set = (Set) this.f46997c;
        fz.c cVar = (fz.c) this.f46998d;
        m0.j LazyVerticalGrid = (m0.j) obj;
        kotlin.jvm.internal.m.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyVerticalGrid.q(arrayList.size(), null, null, new d1(7, arrayList), new t1.d(new dl.n(arrayList, set, cVar, 7), true, -1117249557));
        return qy.b0.f48488a;
    }

    private final Object k(Object obj) {
        zr.h hVar = (zr.h) this.f46996b;
        fz.c cVar = (fz.c) this.f46997c;
        fz.a aVar = (fz.a) this.f46998d;
        l0.h LazyColumn = (l0.h) obj;
        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
        List list = ((zr.g) hVar).f59299b;
        LazyColumn.q(list.size(), null, new qu.m(8, list), new t1.d(new bp.e1(list, hVar, cVar, aVar, 5), true, 802480018));
        return qy.b0.f48488a;
    }

    private final Object l(Object obj) {
        w1.c cVar = (w1.c) this.f46996b;
        w1.h hVar = (w1.h) this.f46998d;
        i0 i0Var = cVar.f54459b;
        Object obj2 = this.f46997c;
        if (!i0Var.b(obj2)) {
            cVar.f54458a.remove(obj2);
            i0Var.m(obj2, hVar);
            return new a0.i(cVar, obj2, hVar, 4);
        }
        throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
    }

    /* JADX WARN: Code duplicated, block: B:146:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:156:0x05f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:158:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:161:0x0608  */
    /* JADX WARN: Code duplicated, block: B:162:0x060b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0619 A[Catch: Exception -> 0x0630, TryCatch #0 {Exception -> 0x0630, blocks: (B:154:0x05e4, B:159:0x05fc, B:166:0x0613, B:169:0x0619, B:170:0x061c), top: B:350:0x05e4 }] */
    /* JADX WARN: Code duplicated, block: B:360:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0610 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x060e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0618 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x017e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.c
    public final Object invoke(Object obj) {
        String strL0;
        int i11;
        View view;
        String strL1;
        int i12;
        View view2;
        boolean z11;
        Env env;
        String luoma;
        int length;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        String strL2;
        View view3;
        String strL3;
        int i15;
        View view4;
        String strF;
        String string;
        String strF2;
        String string2;
        j3.f fVar;
        int i16 = this.f46995a;
        int i17 = 2;
        qy.b0 b0Var = qy.b0.f48488a;
        boolean z14 = false;
        z14 = false;
        z14 = false;
        z14 = false;
        Object obj2 = this.f46998d;
        Object obj3 = this.f46997c;
        Object obj4 = this.f46996b;
        boolean z15 = true;
        switch (i16) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                kotlin.jvm.internal.m.f(bitmap, "bitmap");
                rz.e0.B((rz.b0) obj4, null, null, new kr.w((Context) obj3, bitmap, (fz.e) obj2, (vy.d) null, 27), 3);
                return b0Var;
            case 1:
                k0 k0Var = (k0) obj4;
                View view5 = (View) obj3;
                PdWord pdWord = (PdWord) obj2;
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                int childCount = k0Var.x().f32539d.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = k0Var.x().f32539d.getChildAt(i18);
                    CharSequence text = ((TextView) childAt.findViewById(R.id.tv_char)).getText();
                    if (text == null || text.length() == 0) {
                        th.e eVar = k0Var.N;
                        if (eVar == null) {
                            kotlin.jvm.internal.m.n("player");
                            throw null;
                        }
                        eVar.k(R.raw.switch18);
                        view5.setEnabled(false);
                        view5.setAlpha(0.2f);
                        ((TextView) childAt.findViewById(R.id.tv_char)).setText(pdWord.getWord());
                        childAt.setTag(view5);
                        return b0Var;
                    }
                }
                FlexboxLayout flexboxLayout = k0Var.x().f32539d;
                Context contextRequireContext = k0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                float fZ = j3.Z(-8, contextRequireContext);
                Context contextRequireContext2 = k0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                ObjectAnimator duration = ObjectAnimator.ofFloat(flexboxLayout, "translationX", fZ, CropImageView.DEFAULT_ASPECT_RATIO, j3.Z(8, contextRequireContext2), CropImageView.DEFAULT_ASPECT_RATIO).setDuration(300L);
                kotlin.jvm.internal.m.e(duration, "setDuration(...)");
                duration.setInterpolator(new BounceInterpolator());
                duration.start();
                th.e eVar2 = k0Var.N;
                if (eVar2 != null) {
                    eVar2.k(R.raw.game_spell_more);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("player");
                throw null;
            case 2:
                FrameLayout frameLayout = (FrameLayout) obj4;
                qp.b0 b0Var2 = (qp.b0) obj3;
                Word word = (Word) obj2;
                View v11 = (View) obj;
                kotlin.jvm.internal.m.f(v11, "v");
                frameLayout.setVisibility(4);
                frameLayout.setClickable(false);
                Object tag = frameLayout.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                mp.b bVar = b0Var2.f47881a;
                ArrayList arrayList = b0Var2.f47837l;
                String strB = j3.B((Word) tag);
                ta.a aVar = b0Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                int selectionStart = ((i1) aVar).f32681d.getSelectionStart();
                if (selectionStart == 0) {
                    arrayList.add(selectionStart, (FrameLayout) v11);
                    b0Var2.v(selectionStart, strB);
                } else {
                    int size = arrayList.size();
                    int length2 = 0;
                    for (int i19 = 0; i19 < size; i19++) {
                        Object tag2 = ((FrameLayout) arrayList.get(i19)).getTag();
                        kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                        String strB2 = j3.B((Word) tag2);
                        if (selectionStart <= length2 || selectionStart > strB2.length() + length2) {
                            length2 += strB2.length();
                        } else {
                            arrayList.add(i19 + 1, (FrameLayout) v11);
                            ta.a aVar2 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar2);
                            ((i1) aVar2).f32681d.setSelection(strB2.length() + length2);
                            b0Var2.v(strB2.length() + length2, strB);
                        }
                    }
                }
                b0Var2.r();
                int[] iArr = bq.r.f4959a;
                if (bq.m.F()) {
                    Env env2 = b0Var2.f47884d;
                    if (env2.examCharAudioSwitch && env2.isAudioModel && !((jp.p0) bVar).Q && !kotlin.jvm.internal.m.a(word.getWord(), " ")) {
                        try {
                            qy.q qVar = fv.b.f28186a;
                            String luoma2 = word.getLuoma();
                            kotlin.jvm.internal.m.e(luoma2, "getLuoma(...)");
                            int length3 = luoma2.length() - 1;
                            boolean z16 = false;
                            int i21 = 0;
                            while (i21 <= length3) {
                                boolean z17 = kotlin.jvm.internal.m.h(luoma2.charAt(!z16 ? i21 : length3), 32) <= 0;
                                if (z16) {
                                    if (!z17) {
                                        ((jp.p0) bVar).I(fv.b.l0(luoma2.subSequence(i21, length3 + 1).toString()));
                                    } else {
                                        length3--;
                                    }
                                    break;
                                } else if (z17) {
                                    i21++;
                                } else {
                                    z16 = true;
                                }
                            }
                            ((jp.p0) bVar).I(fv.b.l0(luoma2.subSequence(i21, length3 + 1).toString()));
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                    break;
                }
                b0Var2.z();
                return b0Var;
            case 3:
                qp.l0 l0Var = (qp.l0) obj4;
                Word word2 = (Word) obj3;
                CardView cardView = (CardView) obj2;
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j11 = l0Var.f48026n;
                Context context = l0Var.f47883c;
                if (jCurrentTimeMillis - j11 <= 200) {
                    l0Var.f48026n = jCurrentTimeMillis;
                } else {
                    l0Var.f48026n = jCurrentTimeMillis;
                    if (l0Var.y()) {
                        qy.q qVar2 = fv.b.f28186a;
                        String luoma3 = word2.getLuoma();
                        kotlin.jvm.internal.m.e(luoma3, "getLuoma(...)");
                        strL0 = fv.b.l0(luoma3);
                    } else {
                        strL0 = null;
                    }
                    if (strL0 != null && l0Var.f47884d.isAudioModel) {
                        ((jp.p0) l0Var.f47881a).I(strL0);
                    }
                    int[] iArr2 = new int[2];
                    int[] iArr3 = new int[2];
                    ta.a aVar3 = l0Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    int childCount2 = ((r1) aVar3).f33208d.getChildCount();
                    int i22 = 0;
                    while (true) {
                        if (i22 < childCount2) {
                            ta.a aVar4 = l0Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar4);
                            View childAt2 = ((r1) aVar4).f33208d.getChildAt(i22);
                            i11 = R.id.bottom_view;
                            if (childAt2.getTag(R.id.bottom_view) == null) {
                                childAt2.findViewById(R.id.ll_item).getLocationOnScreen(iArr2);
                                view = childAt2;
                            } else {
                                i22++;
                            }
                        } else {
                            i11 = R.id.bottom_view;
                            view = null;
                        }
                    }
                    if (view != null) {
                        view.setTag(i11, cardView);
                        kotlin.jvm.internal.m.f(context, "context");
                        qp.l0.r(cardView, context.getColor(R.color.second_black), context.getColor(R.color.primary_black));
                        cardView.getLocationOnScreen(iArr3);
                        int i23 = iArr2[0] - iArr3[0];
                        int i24 = iArr2[1] - iArr3[1];
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cardView, "translationX", i23);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cardView, "translationY", i24);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                        animatorSet.setDuration(200L);
                        animatorSet.addListener(new om.l(cardView, view, l0Var, 1));
                        animatorSet.setInterpolator(new DecelerateInterpolator());
                        animatorSet.start();
                    }
                }
                return b0Var;
            case 4:
                qp.l0 l0Var2 = (qp.l0) obj4;
                Word word3 = (Word) obj3;
                CardView cardView2 = (CardView) obj2;
                View it3 = (View) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j12 = l0Var2.f48026n;
                Context context2 = l0Var2.f47883c;
                if (jCurrentTimeMillis2 - j12 <= 200) {
                    l0Var2.f48026n = jCurrentTimeMillis2;
                } else {
                    l0Var2.f48026n = jCurrentTimeMillis2;
                    if (l0Var2.y()) {
                        qy.q qVar3 = fv.b.f28186a;
                        String luoma4 = word3.getLuoma();
                        kotlin.jvm.internal.m.e(luoma4, "getLuoma(...)");
                        strL1 = fv.b.l0(luoma4);
                    } else {
                        strL1 = null;
                    }
                    if (strL1 != null && l0Var2.f47884d.isAudioModel) {
                        ((jp.p0) l0Var2.f47881a).I(strL1);
                    }
                    int[] iArr4 = new int[2];
                    int[] iArr5 = new int[2];
                    ta.a aVar5 = l0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    int childCount3 = ((s1) aVar5).f33259d.getChildCount();
                    int i25 = 0;
                    while (true) {
                        if (i25 < childCount3) {
                            ta.a aVar6 = l0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar6);
                            View childAt3 = ((s1) aVar6).f33259d.getChildAt(i25);
                            i12 = R.id.bottom_view;
                            if (childAt3.getTag(R.id.bottom_view) == null) {
                                childAt3.findViewById(R.id.ll_item).getLocationOnScreen(iArr4);
                                view2 = childAt3;
                            } else {
                                i25++;
                            }
                        } else {
                            i12 = R.id.bottom_view;
                            view2 = null;
                        }
                    }
                    if (view2 != null) {
                        view2.setTag(i12, cardView2);
                        kotlin.jvm.internal.m.f(context2, "context");
                        qp.l0.s(cardView2, context2.getColor(R.color.second_black), context2.getColor(R.color.primary_black));
                        cardView2.getLocationOnScreen(iArr5);
                        int i26 = iArr4[0] - iArr5[0];
                        int i27 = iArr4[1] - iArr5[1];
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(cardView2, "translationX", i26);
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(cardView2, "translationY", i27);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
                        animatorSet2.setDuration(200L);
                        animatorSet2.addListener(new om.l(cardView2, view2, l0Var2, i17));
                        animatorSet2.setInterpolator(new DecelerateInterpolator());
                        animatorSet2.start();
                    }
                }
                return b0Var;
            case 5:
                i2 i2Var = (i2) obj4;
                h2 h2Var = (h2) obj3;
                Sentence sentence = (Sentence) obj2;
                View v12 = (View) obj;
                kotlin.jvm.internal.m.f(v12, "v");
                View view6 = (View) i2Var.f47818j;
                mp.b bVar2 = i2Var.f47881a;
                if (view6 != null) {
                    i2Var.r(view6);
                }
                i2Var.f47978p = h2Var;
                i2Var.f47818j = v12;
                i2Var.s(v12);
                jp.p0 p0Var = (jp.p0) bVar2;
                p0Var.O(4);
                if (i2Var.f47884d.isAudioModel && !p0Var.Q) {
                    qy.q qVar4 = fv.b.f28186a;
                    p0Var.I(fv.b.G(sentence.getSentenceId(), null, null));
                }
                return b0Var;
            case 6:
                boolean z18 = true;
                EditText editText = (EditText) obj2;
                View it4 = (View) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                ArrayList arrayList2 = (ArrayList) ((k2) obj4).f48011l.get((View) obj3);
                if (arrayList2 != null) {
                    kotlin.jvm.internal.m.c(editText);
                    int selectionStart2 = editText.getSelectionStart();
                    if (selectionStart2 > 0) {
                        Editable text2 = editText.getText();
                        int size2 = arrayList2.size();
                        int i28 = 0;
                        int length4 = 0;
                        while (i28 < size2) {
                            Object obj5 = arrayList2.get(i28);
                            kotlin.jvm.internal.m.e(obj5, "get(...)");
                            View view7 = (View) obj5;
                            Object tag3 = view7.getTag();
                            kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                            String word4 = ((Word) tag3).getWord();
                            if (selectionStart2 <= length4 || selectionStart2 > word4.length() + length4) {
                                length4 += word4.length();
                                i28++;
                                z18 = true;
                            } else {
                                text2.delete(length4, word4.length() + length4);
                                view7.setVisibility(0);
                                view7.setClickable(z18);
                                arrayList2.remove(view7);
                            }
                        }
                    }
                }
                return b0Var;
            case 7:
                FrameLayout frameLayout2 = (FrameLayout) obj4;
                z2 z2Var = (z2) obj3;
                Word word5 = (Word) obj2;
                View v13 = (View) obj;
                kotlin.jvm.internal.m.f(v13, "v");
                frameLayout2.setVisibility(4);
                frameLayout2.setClickable(false);
                Object tag4 = frameLayout2.getTag();
                kotlin.jvm.internal.m.d(tag4, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                mp.b bVar3 = z2Var.f47881a;
                ArrayList arrayList3 = z2Var.f48289l;
                String strB3 = j3.B((Word) tag4);
                ta.a aVar7 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                int selectionStart3 = ((c2) aVar7).f32446d.getSelectionStart();
                if (selectionStart3 == 0) {
                    arrayList3.add(selectionStart3, (FrameLayout) v13);
                    z2Var.w(selectionStart3, strB3);
                } else {
                    int size3 = arrayList3.size();
                    int length5 = 0;
                    for (int i29 = 0; i29 < size3; i29++) {
                        Object tag5 = ((FrameLayout) arrayList3.get(i29)).getTag();
                        kotlin.jvm.internal.m.d(tag5, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                        String strB4 = j3.B((Word) tag5);
                        if (selectionStart3 <= length5 || selectionStart3 > strB4.length() + length5) {
                            length5 += strB4.length();
                        } else {
                            arrayList3.add(i29 + 1, (FrameLayout) v13);
                            ta.a aVar8 = z2Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar8);
                            ((c2) aVar8).f32446d.setSelection(strB4.length() + length5);
                            z2Var.w(strB4.length() + length5, strB3);
                        }
                    }
                }
                z2Var.r();
                int[] iArr6 = bq.r.f4959a;
                if (bq.m.F()) {
                    Env env3 = z2Var.f47884d;
                    if (env3.examCharAudioSwitch && env3.isAudioModel && !((jp.p0) bVar3).Q && !kotlin.jvm.internal.m.a(word5.getWord(), " ")) {
                        try {
                            qy.q qVar5 = fv.b.f28186a;
                            String luoma5 = word5.getLuoma();
                            kotlin.jvm.internal.m.e(luoma5, "getLuoma(...)");
                            int length6 = luoma5.length() - 1;
                            Object[] objArr = false;
                            int i30 = 0;
                            while (i30 <= length6) {
                                Object[] objArr2 = kotlin.jvm.internal.m.h(luoma5.charAt(objArr == false ? i30 : length6), 32) <= 0;
                                if (objArr == true) {
                                    if (objArr2 != true) {
                                        ((jp.p0) bVar3).I(fv.b.l0(luoma5.subSequence(i30, length6 + 1).toString()));
                                    } else {
                                        length6--;
                                    }
                                    break;
                                } else if (objArr2 == true) {
                                    i30++;
                                } else {
                                    objArr = true;
                                }
                            }
                            ((jp.p0) bVar3).I(fv.b.l0(luoma5.subSequence(i30, length6 + 1).toString()));
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    break;
                }
                z2Var.B();
                return b0Var;
            case 8:
                FrameLayout frameLayout3 = (FrameLayout) obj4;
                p3 p3Var = (p3) obj3;
                Word word6 = (Word) obj2;
                View v14 = (View) obj;
                kotlin.jvm.internal.m.f(v14, "v");
                frameLayout3.setVisibility(4);
                frameLayout3.setClickable(false);
                Object tag6 = frameLayout3.getTag();
                kotlin.jvm.internal.m.d(tag6, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                mp.b bVar4 = p3Var.f47881a;
                ArrayList arrayList4 = p3Var.m;
                String strB5 = j3.B((Word) tag6);
                ta.a aVar9 = p3Var.f47886f;
                kotlin.jvm.internal.m.c(aVar9);
                int selectionStart4 = ((hj.i2) aVar9).f32689c.getSelectionStart();
                if (selectionStart4 != 0) {
                    int size4 = arrayList4.size();
                    int i31 = 0;
                    int length7 = 0;
                    while (true) {
                        if (i31 < size4) {
                            Object tag7 = ((FrameLayout) arrayList4.get(i31)).getTag();
                            kotlin.jvm.internal.m.d(tag7, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                            String strB6 = j3.B((Word) tag7);
                            if (selectionStart4 > length7) {
                                z11 = z15;
                                if (selectionStart4 <= strB6.length() + length7) {
                                    arrayList4.add(i31 + 1, (FrameLayout) v14);
                                    ta.a aVar10 = p3Var.f47886f;
                                    kotlin.jvm.internal.m.c(aVar10);
                                    ((hj.i2) aVar10).f32689c.setSelection(strB6.length() + length7);
                                    p3Var.u(strB6.length() + length7, strB5);
                                }
                            } else {
                                z11 = z15;
                            }
                            length7 += strB6.length();
                            i31++;
                            z15 = z11;
                        }
                    }
                    p3Var.r();
                    int[] iArr7 = bq.r.f4959a;
                    if (bq.m.F()) {
                        env = p3Var.f47884d;
                        if (env.examCharAudioSwitch && env.isAudioModel && !((jp.p0) bVar4).Q && !kotlin.jvm.internal.m.a(word6.getWord(), " ")) {
                            try {
                                qy.q qVar6 = fv.b.f28186a;
                                luoma = word6.getLuoma();
                                kotlin.jvm.internal.m.e(luoma, "getLuoma(...)");
                                length = luoma.length() - 1;
                                z12 = false;
                                i13 = 0;
                                while (i13 <= length) {
                                    if (z12) {
                                        i14 = length;
                                    } else {
                                        i14 = i13;
                                    }
                                    if (kotlin.jvm.internal.m.h(luoma.charAt(i14), 32) <= 0) {
                                        z13 = z11;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z12) {
                                        if (!z13) {
                                            ((jp.p0) bVar4).I(fv.b.l0(luoma.subSequence(i13, length + 1).toString()));
                                        } else {
                                            length--;
                                        }
                                        break;
                                    } else if (z13) {
                                        i13++;
                                    } else {
                                        z12 = z11;
                                    }
                                }
                                ((jp.p0) bVar4).I(fv.b.l0(luoma.subSequence(i13, length + 1).toString()));
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        break;
                    }
                    p3Var.x();
                    return b0Var;
                }
                arrayList4.add(selectionStart4, (FrameLayout) v14);
                p3Var.u(selectionStart4, strB5);
                z11 = z15;
                p3Var.r();
                int[] iArr8 = bq.r.f4959a;
                if (bq.m.F()) {
                    env = p3Var.f47884d;
                    if (env.examCharAudioSwitch) {
                        qy.q qVar7 = fv.b.f28186a;
                        luoma = word6.getLuoma();
                        kotlin.jvm.internal.m.e(luoma, "getLuoma(...)");
                        length = luoma.length() - 1;
                        z12 = false;
                        i13 = 0;
                        while (i13 <= length) {
                            if (z12) {
                                i14 = i13;
                            } else {
                                i14 = length;
                            }
                            if (kotlin.jvm.internal.m.h(luoma.charAt(i14), 32) <= 0) {
                                z13 = z11;
                            } else {
                                z13 = false;
                            }
                            if (!z12) {
                                if (!z13) {
                                    ((jp.p0) bVar4).I(fv.b.l0(luoma.subSequence(i13, length + 1).toString()));
                                } else {
                                    length--;
                                }
                                break;
                            } else if (z13) {
                                z12 = z11;
                            } else {
                                i13++;
                            }
                        }
                        ((jp.p0) bVar4).I(fv.b.l0(luoma.subSequence(i13, length + 1).toString()));
                    }
                    break;
                }
                p3Var.x();
                return b0Var;
            case 9:
                j4 j4Var = (j4) obj4;
                Word word7 = (Word) obj3;
                CardView cardView3 = (CardView) obj2;
                View it5 = (View) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                boolean zU = j4.u();
                Context context3 = j4Var.f47883c;
                if (zU) {
                    qy.q qVar8 = fv.b.f28186a;
                    String luoma6 = word7.getLuoma();
                    kotlin.jvm.internal.m.e(luoma6, "getLuoma(...)");
                    strL2 = fv.b.l0(luoma6);
                } else {
                    strL2 = null;
                }
                if (strL2 != null) {
                    ((jp.p0) j4Var.f47881a).I(strL2);
                }
                int[] iArr9 = new int[2];
                int[] iArr10 = new int[2];
                ta.a aVar11 = j4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar11);
                int childCount4 = ((hj.z2) aVar11).f33659c.getChildCount();
                int i32 = 0;
                while (true) {
                    if (i32 < childCount4) {
                        ta.a aVar12 = j4Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar12);
                        View childAt4 = ((hj.z2) aVar12).f33659c.getChildAt(i32);
                        if (childAt4.getTag(R.id.bottom_view) == null) {
                            childAt4.findViewById(R.id.ll_item).getLocationOnScreen(iArr9);
                            view3 = childAt4;
                        } else {
                            i32++;
                        }
                    } else {
                        view3 = null;
                    }
                }
                if (view3 != null) {
                    kotlin.jvm.internal.m.f(context3, "context");
                    j4.s(cardView3, context3.getColor(R.color.second_black), context3.getColor(R.color.primary_black));
                    cardView3.getLocationOnScreen(iArr10);
                    view3.setTag(R.id.bottom_view, cardView3);
                    int iC = com.google.android.material.datepicker.d.c(view3, 2, iArr9[0]) - ((cardView3.getWidth() / 2) + iArr10[0]);
                    int i33 = iArr9[1] - iArr10[1];
                    ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(cardView3, "translationX", iC);
                    ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(cardView3, "translationY", i33);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.play(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
                    animatorSet3.setDuration(200L);
                    animatorSet3.addListener(new om.l(cardView3, view3, j4Var, 3));
                    animatorSet3.setInterpolator(new DecelerateInterpolator());
                    animatorSet3.start();
                }
                return b0Var;
            case 10:
                t4 t4Var = (t4) obj4;
                Word word8 = (Word) obj3;
                CardView cardView4 = (CardView) obj2;
                View it6 = (View) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                Context context4 = t4Var.f47883c;
                kotlin.jvm.internal.m.f(word8, "word");
                if (t4Var.z()) {
                    qy.q qVar9 = fv.b.f28186a;
                    String luoma7 = word8.getLuoma();
                    kotlin.jvm.internal.m.e(luoma7, "getLuoma(...)");
                    strL3 = fv.b.l0(luoma7);
                } else {
                    strL3 = null;
                }
                if (strL3 != null && t4Var.f47884d.isAudioModel) {
                    ((jp.p0) t4Var.f47881a).I(strL3);
                }
                int[] iArr11 = new int[2];
                int[] iArr12 = new int[2];
                ta.a aVar13 = t4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar13);
                int childCount5 = ((c3) aVar13).f32457c.getChildCount();
                int i34 = 0;
                while (true) {
                    if (i34 < childCount5) {
                        ta.a aVar14 = t4Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar14);
                        View childAt5 = ((c3) aVar14).f32457c.getChildAt(i34);
                        i15 = R.id.bottom_view;
                        if (childAt5.getTag(R.id.bottom_view) == null) {
                            childAt5.findViewById(R.id.ll_item).getLocationOnScreen(iArr11);
                            view4 = childAt5;
                        } else {
                            i34++;
                        }
                    } else {
                        i15 = R.id.bottom_view;
                        view4 = null;
                    }
                }
                if (view4 != null) {
                    view4.setTag(i15, cardView4);
                    kotlin.jvm.internal.m.f(context4, "context");
                    t4.s(cardView4, context4.getColor(R.color.second_black), context4.getColor(R.color.primary_black));
                    cardView4.getLocationOnScreen(iArr12);
                    int i35 = iArr11[0] - iArr12[0];
                    int i36 = iArr11[1] - iArr12[1];
                    ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(cardView4, "translationX", i35);
                    ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(cardView4, "translationY", i36);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.play(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8);
                    animatorSet4.setDuration(200L);
                    animatorSet4.addListener(new om.l(cardView4, view4, t4Var, 4));
                    animatorSet4.setInterpolator(new DecelerateInterpolator());
                    animatorSet4.start();
                }
                return b0Var;
            case 11:
                LeaderBoardUser leaderBoardUser = (LeaderBoardUser) obj;
                kotlin.jvm.internal.m.f(leaderBoardUser, "leaderBoardUser");
                ((b1) obj3).setValue(Boolean.TRUE);
                rz.e0.B((rz.b0) obj4, null, null, new qu.k((ur.a) obj2, leaderBoardUser, null), 3);
                return b0Var;
            case 12:
                WordListenGameFinishAdapter wordListenGameFinishAdapter = (WordListenGameFinishAdapter) obj4;
                ImageView imageView = (ImageView) obj3;
                PdWord pdWord2 = (PdWord) obj2;
                View it7 = (View) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                ImageView imageView2 = wordListenGameFinishAdapter.f21659b;
                th.e eVar3 = wordListenGameFinishAdapter.f21658a;
                if (imageView2 != null) {
                    Drawable background = imageView2.getBackground();
                    kotlin.jvm.internal.m.c(background);
                    android.support.v4.media.session.a.H(background);
                }
                wordListenGameFinishAdapter.f21659b = imageView;
                android.support.v4.media.session.a.K(imageView.getBackground());
                m0 m0Var = new m0(imageView, 2);
                eVar3.getClass();
                eVar3.f52416c = m0Var;
                if (pdWord2.getWordStruct() == 1) {
                    strF = xt.b.a().f();
                    Long wordId = pdWord2.getWordId();
                    kotlin.jvm.internal.m.e(wordId, "getWordId(...)");
                    long jLongValue = wordId.longValue();
                    int[] iArr13 = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    StringBuilder sbM = com.google.android.material.datepicker.d.m(jLongValue, "pod-", bq.m.g(cf.x.n().keyLanguage), "-w-yx-");
                    sbM.append(".mp3");
                    string = sbM.toString();
                } else {
                    strF = xt.b.a().f();
                    Long wordId2 = pdWord2.getWordId();
                    kotlin.jvm.internal.m.e(wordId2, "getWordId(...)");
                    long jLongValue2 = wordId2.longValue();
                    int[] iArr14 = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    StringBuilder sbM2 = com.google.android.material.datepicker.d.m(jLongValue2, "pod-", bq.m.g(cf.x.n().keyLanguage), "-w-");
                    sbM2.append(".mp3");
                    string = sbM2.toString();
                }
                eVar3.h(defpackage.e.m(strF, string));
                return b0Var;
            case 13:
                WordReviewListAdapter wordReviewListAdapter = (WordReviewListAdapter) obj4;
                ImageView imageView3 = (ImageView) obj3;
                PdWord pdWord3 = (PdWord) obj2;
                View it8 = (View) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                ImageView imageView4 = wordReviewListAdapter.f21662c;
                th.e eVar4 = wordReviewListAdapter.f21660a;
                if (imageView4 != null) {
                    Drawable background2 = imageView4.getBackground();
                    kotlin.jvm.internal.m.c(background2);
                    android.support.v4.media.session.a.H(background2);
                }
                wordReviewListAdapter.f21662c = imageView3;
                android.support.v4.media.session.a.K(imageView3.getBackground());
                ci.a0 a0Var = new ci.a0(imageView3, 5);
                eVar4.getClass();
                eVar4.f52416c = a0Var;
                if (pdWord3.getWordStruct() == 1) {
                    strF2 = xt.b.a().f();
                    Long wordId3 = pdWord3.getWordId();
                    kotlin.jvm.internal.m.e(wordId3, "getWordId(...)");
                    long jLongValue3 = wordId3.longValue();
                    int[] iArr15 = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    StringBuilder sbM3 = com.google.android.material.datepicker.d.m(jLongValue3, "pod-", bq.m.g(cf.x.n().keyLanguage), "-w-yx-");
                    sbM3.append(".mp3");
                    string2 = sbM3.toString();
                } else {
                    strF2 = xt.b.a().f();
                    Long wordId4 = pdWord3.getWordId();
                    kotlin.jvm.internal.m.e(wordId4, "getWordId(...)");
                    long jLongValue4 = wordId4.longValue();
                    int[] iArr16 = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    StringBuilder sbM4 = com.google.android.material.datepicker.d.m(jLongValue4, "pod-", bq.m.g(cf.x.n().keyLanguage), "-w-");
                    sbM4.append(".mp3");
                    string2 = sbM4.toString();
                }
                eVar4.h(defpackage.e.m(strF2, string2));
                return b0Var;
            case 14:
                return Boolean.valueOf(rt.c2.a(((oe) obj).f50221b, (ke) obj4, (String) obj3, ((rt.r1) obj2).f50328f));
            case 15:
                String str = (String) obj4;
                String str2 = (String) obj3;
                Set set = (Set) obj2;
                Bookmark bookmark = (Bookmark) obj;
                kotlin.jvm.internal.m.f(bookmark, "bookmark");
                if (bookmark.isFav() == 1 && kotlin.jvm.internal.m.a(bookmark.getValue(), str)) {
                    if (oz.x.s0(bookmark.getId(), str2 + "_", false) && (bookmark.getFolderId() == null || ry.m.i0(set, bookmark.getFolderId()))) {
                        z14 = true;
                    }
                }
                return Boolean.valueOf(z14);
            case 16:
                fz.c cVar = (fz.c) obj4;
                b1 b1Var = (b1) obj2;
                o3.w wVar = (o3.w) obj;
                ((b1) obj3).setValue(wVar);
                boolean zA = kotlin.jvm.internal.m.a((String) b1Var.getValue(), wVar.f44704a.f35700b);
                j3.h hVar = wVar.f44704a;
                b1Var.setValue(hVar.f35700b);
                if (!zA) {
                    cVar.invoke(hVar.f35700b);
                }
                return b0Var;
            case 17:
                return a(obj);
            case 18:
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) obj4;
                j3.f fVar2 = (j3.f) obj3;
                p0 p0Var2 = (p0) obj2;
                j3.f fVar3 = (j3.f) obj;
                if (uVar.f38357a) {
                    Object obj6 = fVar3.f35689a;
                    int i37 = fVar3.f35691c;
                    int i38 = fVar3.f35690b;
                    if ((obj6 instanceof p0) && i38 == fVar2.f35690b && i37 == fVar2.f35691c) {
                        if (p0Var2 == null) {
                            p0Var2 = new p0(0L, 0L, (n3.s) null, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65535);
                        }
                        fVar = new j3.f(p0Var2, i38, i37);
                    } else {
                        fVar = fVar3;
                    }
                } else {
                    fVar = fVar3;
                }
                uVar.f38357a = fVar2.equals(fVar3);
                return fVar;
            case 19:
                fz.c cVar2 = (fz.c) obj3;
                o3.c0 c0Var = (o3.c0) ((kotlin.jvm.internal.y) obj2).f38361a;
                o3.w wVarJ = ((ob.c) obj4).j((List) obj);
                if (c0Var != null) {
                    c0Var.a(null, wVarJ);
                }
                cVar2.invoke(wVarJ);
                return b0Var;
            case 20:
                return c(obj);
            case 21:
                um.f fVar4 = (um.f) obj4;
                View it9 = (View) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                m3 m3Var = new m3(fVar4, (ImageView) obj3, (t7.d) obj2);
                Context context5 = fVar4.f53031a;
                kotlin.jvm.internal.m.d(context5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) context5);
                kotlin.jvm.internal.m.f(context5, "context");
                rxPermissions.setLogging(true);
                if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                    m3Var.m();
                } else {
                    rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(m3Var, context5, rxPermissions, 17), vx.b.f54316e);
                }
                return b0Var;
            case 22:
                BaseReviewCateAdapter baseReviewCateAdapter = (BaseReviewCateAdapter) obj2;
                View it10 = (View) obj;
                kotlin.jvm.internal.m.f(it10, "it");
                int layoutPosition = ((BaseViewHolder) obj4).getLayoutPosition();
                if (((BaseReviewGroup) obj3).isExpanded()) {
                    baseReviewCateAdapter.collapse(layoutPosition, false);
                } else {
                    baseReviewCateAdapter.expand(layoutPosition, false);
                }
                return b0Var;
            case 23:
                return d(obj);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return e(obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return h(obj);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return j(obj);
            case 27:
                return k(obj);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return l(obj);
            default:
                List list = (List) obj4;
                TURSyllableIntroductionActivity tURSyllableIntroductionActivity = (TURSyllableIntroductionActivity) obj3;
                zo.b bVar5 = (zo.b) obj2;
                m0.j LazyVerticalGrid = (m0.j) obj;
                int i39 = TURSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                m0.j.p(LazyVerticalGrid, new vr.a(10), new t1.d(new qu.s(tURSyllableIntroductionActivity, 5), true, -1443965451), 5);
                LazyVerticalGrid.q(list.size(), null, null, new qu.m(10, list), new t1.d(new dl.n(list, tURSyllableIntroductionActivity, bVar5, 8), true, -1117249557));
                m0.j.p(LazyVerticalGrid, new vr.a(11), new t1.d(new wo.f(tURSyllableIntroductionActivity, bVar5, false ? 1 : 0), true, -374185954), 5);
                return b0Var;
        }
    }

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i11) {
        this.f46995a = i11;
        this.f46996b = obj;
        this.f46997c = obj2;
        this.f46998d = obj3;
    }

    public /* synthetic */ a0(Map map, fz.e eVar, b1 b1Var) {
        this.f46995a = 24;
        this.f46996b = map;
        this.f46998d = eVar;
        this.f46997c = b1Var;
    }

    public /* synthetic */ a0(b1 b1Var, rz.b0 b0Var, ur.a aVar) {
        this.f46995a = 11;
        this.f46997c = b1Var;
        this.f46996b = b0Var;
        this.f46998d = aVar;
    }
}
