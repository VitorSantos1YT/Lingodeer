package jp;

import a.ar.MFeWs;
import a0.b2;
import aj.uZCn.evRpcb;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import bw.ORXQ.ADSb;
import com.airbnb.lottie.LottieAnimationView;
import com.github.javiersantos.piracychecker.PiracyChecker;
import com.github.javiersantos.piracychecker.PiracyChecker$callback$1;
import com.github.javiersantos.piracychecker.PiracyChecker$callback$2;
import com.github.javiersantos.piracychecker.PiracyChecker$start$1;
import com.github.javiersantos.piracychecker.activities.LicenseActivity;
import com.github.javiersantos.piracychecker.callbacks.DoNotAllowCallback;
import com.github.javiersantos.piracychecker.enums.AppType;
import com.github.javiersantos.piracychecker.enums.Display;
import com.github.javiersantos.piracychecker.enums.InstallerID;
import com.github.javiersantos.piracychecker.enums.PiracyCheckerError;
import com.github.javiersantos.piracychecker.enums.PirateApp;
import com.github.javiersantos.piracychecker.utils.LibraryUtilsKt;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.android.material.button.MaterialButton;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingo.lingoskill.widget.GameLife;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fa.EQx.nuRcCS;
import hj.e3;
import hj.x3;
import i0.pKy.shrCcjmOhAmRC;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.m;
import l0.Eeqr.HOBXIlHxIkMBEA;
import su.Mbl.tcppUUQxZjFdy;
import sz.xej.iFLeRCXvYCGdPW;
import vf.eq.EHjhWcesDUIsIw;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class p0 extends bp.n implements mp.b {
    public long P;
    public boolean Q;
    public final List R;
    public long S;
    public int T;
    public int U;
    public th.e V;
    public boolean W;
    public th.b X;
    public dm.c Y;
    public g1.k Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f36525a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f36526b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public rx.b f36527c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public m0 f36528d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public o0 f36529e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ObjectAnimator f36530f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ObjectAnimator f36531g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public z4.w0 f36532h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public z4.w0 f36533i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f36534j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f36535k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Integer[] f36536l0;

    public p0() {
        super(l0.f36508a, BuildConfig.VERSION_NAME);
        LearnType learnType = LearnType.LEARN;
        int[] iArr = bq.r.f4959a;
        this.R = bq.m.b();
        this.S = -1L;
        this.f36526b0 = -1;
        this.f36534j0 = BuildConfig.VERSION_NAME;
        this.f36536l0 = new Integer[]{57, 21, 61, 63, 65, 18, 19, 69};
    }

    public static int z() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (!ry.l.D(new Integer[]{1, 12}, Integer.valueOf(cf.x.n().keyLanguage))) {
            return R.raw.lesson_test_anima_correct;
        }
        Integer[] numArr = {Integer.valueOf(R.raw.lesson_test_anima_correct), Integer.valueOf(R.raw.lesson_test_jp_anim_correct)};
        jz.d dVar = jz.e.f37397a;
        return ((Number) ry.l.d0(numArr)).intValue();
    }

    public final mp.a A() {
        ii.a aVar = this.N;
        kotlin.jvm.internal.m.c(aVar);
        return (mp.a) aVar;
    }

    public final RelativeLayout B() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        RelativeLayout rootParent = ((x3) aVar).f33579l;
        kotlin.jvm.internal.m.e(rootParent, "rootParent");
        return rootParent;
    }

    public final Context C() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    public void D() {
        this.Q = requireArguments().getBoolean(INTENTS.EXTRA_BOOLEAN);
        this.P = requireArguments().getLong(INTENTS.EXTRA_LONG, -1L);
        this.S = requireArguments().getLong(INTENTS.EXTRA_LONG_2, -1L);
        this.f36525a0 = requireArguments().getInt(INTENTS.EXTRA_INT, -1);
        U(requireArguments().getInt(INTENTS.EXTRA_INT_2, -1));
        String string = requireArguments().getString(INTENTS.EXTRA_STRING, BuildConfig.VERSION_NAME);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        this.f36534j0 = string;
        boolean z11 = requireArguments().getBoolean(INTENTS.EXTRA_BOOLEAN_2);
        this.f36535k0 = z11;
        pp.f fVar = new pp.f(this, this.P, this.Q, z11);
        if (kotlin.jvm.internal.m.a(this.f36534j0, "classic")) {
            fVar.Z = false;
        }
    }

    public final void E(int i11) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        if (((ProgressBar) ((x3) aVar).f33575h.f32795d) == null) {
            return;
        }
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ProgressBar progressBar = (ProgressBar) ((x3) aVar2).f33575h.f32795d;
        if (progressBar != null) {
            progressBar.setMax(i11 * 100);
        }
    }

    public void F() {
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        oi.c cVar = new oi.c();
        cVar.f44925a = mVar;
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        cVar.f44926b = view;
        cVar.f44927c = new ch.x();
        cVar.v(this.f36401t);
    }

    public void G(int i11, KeyEvent keyEvent) {
        if (i11 != 4 || getActivity() == null) {
            return;
        }
        Y();
    }

    public final void H(ImageView imageView, String str) {
        kotlin.jvm.internal.m.f(imageView, "imageView");
        J(str, imageView, r().audioSpeed / 100.0f);
    }

    public final void I(String str) {
        float f5 = r().audioSpeed / 100.0f;
        if (str == null) {
            return;
        }
        th.b bVar = this.X;
        if (bVar != null) {
            bVar.a();
            this.X = new h(9);
        }
        th.e eVar = this.V;
        if (eVar != null) {
            eVar.n();
        }
        if (com.google.android.material.datepicker.d.D(str)) {
            th.e eVar2 = this.V;
            if (eVar2 != null) {
                eVar2.f52417d = this.X;
            }
            if (eVar2 != null) {
                eVar2.m(f5, false);
            }
            th.e eVar3 = this.V;
            if (eVar3 != null) {
                eVar3.h(str);
            }
        }
    }

    public final void J(String str, ImageView imageView, float f5) {
        kotlin.jvm.internal.m.f(imageView, "imageView");
        if (str == null) {
            return;
        }
        th.b bVar = this.X;
        if (bVar != null) {
            bVar.a();
        }
        this.X = new ci.a0(imageView, 4);
        android.support.v4.media.session.a.H(imageView.getBackground());
        if (new File(str).exists()) {
            th.e eVar = this.V;
            if (eVar != null) {
                eVar.n();
            }
            th.e eVar2 = this.V;
            if (eVar2 != null) {
                eVar2.f52417d = this.X;
            }
            if (eVar2 != null) {
                eVar2.m(f5, false);
            }
            th.e eVar3 = this.V;
            if (eVar3 != null) {
                eVar3.h(str);
            }
            android.support.v4.media.session.a.K(imageView.getBackground());
        }
    }

    public final void K() {
        mp.a aVar;
        hi.a aVarU;
        String strB;
        List listK;
        Collection collectionT;
        ii.a aVar2 = this.N;
        if ((aVar2 != null && ((mp.a) aVar2).u() == null) || !r().isAudioModel || (aVar = (mp.a) this.N) == null || (aVarU = aVar.u()) == null || (strB = aVarU.b()) == null) {
            return;
        }
        Matcher matcherW = nv.p.w(0, "#@@@#", "compile(...)", strB);
        if (matcherW.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = nv.p.c(matcherW, strB, iC, arrayList);
            } while (matcherW.find());
            nv.p.B(iC, strB, arrayList);
            listK = arrayList;
        } else {
            listK = ns.o.K(strB.toString());
        }
        if (!listK.isEmpty()) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionT = ry.r.f50854a;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    collectionT = b7.e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            collectionT = ry.r.f50854a;
            break;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        if (strArr.length == 2) {
            if (this.X != null) {
                this.X = new h(10);
            }
            this.X = new ob.l(15, this, strArr);
            if (new File(strArr[0]).exists()) {
                th.e eVar = this.V;
                if (eVar != null) {
                    eVar.n();
                }
                th.e eVar2 = this.V;
                if (eVar2 != null) {
                    eVar2.f52417d = this.X;
                }
                if (eVar2 != null) {
                    eVar2.m(r().audioSpeed / 100.0f, false);
                }
                th.e eVar3 = this.V;
                if (eVar3 != null) {
                    eVar3.h(strArr[0]);
                }
                ta.a aVar3 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                android.support.v4.media.session.a.K(((x3) aVar3).f33576i.f32664c.getBackground());
                return;
            }
            return;
        }
        if (strArr.length == 0) {
            return;
        }
        if (this.X != null) {
            this.X = new h(11);
        }
        th.e eVar4 = this.V;
        if (eVar4 != null) {
            eVar4.n();
        }
        b2 b2Var = new b2(this, 24);
        this.X = b2Var;
        th.e eVar5 = this.V;
        if (eVar5 != null) {
            eVar5.f52417d = b2Var;
        }
        if (eVar5 != null) {
            eVar5.m(r().audioSpeed / 100.0f, false);
        }
        th.e eVar6 = this.V;
        if (eVar6 != null) {
            eVar6.h(strArr[0]);
        }
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        android.support.v4.media.session.a.K(((x3) aVar4).f33576i.f32664c.getBackground());
    }

    public final void L() {
        hi.a aVarU;
        l.m mVar = this.f36398d;
        if (mVar != null) {
            mVar.setResult(INTENTS.RESULT_LESSON_QUIT);
            l.m mVar2 = this.f36398d;
            kotlin.jvm.internal.m.c(mVar2);
            mVar2.finish();
            if (this.Q) {
                b7.e0.A(t(), "jxz_testout_quit");
            } else if (this.f36535k0) {
                mp.a aVar = (mp.a) this.N;
                if (aVar != null && (aVarU = aVar.u()) != null) {
                    if (aVarU.i() == 4) {
                        t().c("jxz_dialogue_practice_quit", new i0(this, 0));
                    } else {
                        t().c("jxz_dialogue_warmup_quit", new i0(this, 3));
                    }
                }
            } else {
                boolean z11 = this.W;
                if (z11) {
                    if (z11) {
                        M();
                    }
                } else if (this.f36534j0.length() > 0) {
                    try {
                        t().c("jxz_main_lesson_quit", new i0(this, 4));
                    } catch (Throwable th2) {
                        com.bumptech.glide.e.l(th2);
                    }
                }
            }
        }
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new n0(this, null, 1), 3);
    }

    public void M() {
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void N(boolean z11, hi.a aVar) {
        String strH;
        List listK;
        List listT;
        int i11;
        List listK2;
        List listT2;
        List listK3;
        List listT3;
        List listK4;
        List listT4;
        List listK5;
        List listT5;
        List listK6;
        List listT6;
        ry.r rVar;
        th.e eVar;
        List listK7;
        int i12;
        List listT7;
        th.e eVar2;
        long j11;
        th.e eVar3;
        th.e eVar4;
        List listK8;
        List listT8;
        List listK9;
        List listT9;
        List listK10;
        List listT10;
        if (((mp.a) this.N) == null || aVar == null || (strH = aVar.h()) == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        this.T = contextRequireContext.getColor(R.color.color_43CC93);
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
        this.U = contextRequireContext2.getColor(R.color.color_FF6666);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((x3) aVar2).f33576i.f32668g.setOnTouchListener(null);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((x3) aVar3).f33572e.setVisibility(0);
        if (r().isLessonTestChallenge) {
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((x3) aVar4).f33572e.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        } else {
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ((x3) aVar5).f33572e.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ((x3) aVar6).f33572e.animate().alpha(1.0f).setDuration(300L).start();
        }
        int[] iArr = bq.r.f4959a;
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        bq.m.J(((x3) aVar7).f33576i.f32671j);
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        ((x3) aVar8).f33576i.f32667f.setVisibility(8);
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        ((x3) aVar9).f33576i.f32669h.setVisibility(8);
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        ((x3) aVar10).f33576i.f32669h.setText(BuildConfig.VERSION_NAME);
        if (z11) {
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            ((x3) aVar11).f33576i.f32666e.setTextColor(this.T);
            ta.a aVar12 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar12);
            ((x3) aVar12).f33576i.f32667f.setBackgroundResource(R.drawable.bg_answer_rect_correct);
            ta.a aVar13 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar13);
            ((FrameLayout) ((x3) aVar13).f33576i.f32668g.findViewById(R.id.fl_audio)).setBackgroundResource(R.drawable.bg_answer_point_correct);
            ta.a aVar14 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar14);
            ((x3) aVar14).f33576i.f32665d.setBackgroundResource(R.drawable.bg_answer_point_correct);
        } else {
            ta.a aVar15 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar15);
            ((GameLife) ((x3) aVar15).f33575h.f32797f).a();
            ta.a aVar16 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar16);
            ((x3) aVar16).f33576i.f32666e.setTextColor(this.U);
            ta.a aVar17 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar17);
            ((x3) aVar17).f33576i.f32667f.setBackgroundResource(R.drawable.bg_answer_rect_wrong);
            ta.a aVar18 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar18);
            ((FrameLayout) ((x3) aVar18).f33576i.f32668g.findViewById(R.id.fl_audio)).setBackgroundResource(R.drawable.bg_answer_point_wrong);
            ta.a aVar19 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar19);
            ((x3) aVar19).f33576i.f32665d.setBackgroundResource(R.drawable.bg_answer_point_wrong);
        }
        Matcher matcherW = nv.p.w(0, "\n", "compile(...)", strH);
        if (matcherW.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = nv.p.c(matcherW, strH, iC, arrayList);
            } while (matcherW.find());
            nv.p.B(iC, strH, arrayList);
            listK = arrayList;
        } else {
            listK = ns.o.K(strH.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        ry.r rVar2 = ry.r.f50854a;
        boolean z12 = true;
        z12 = true;
        z12 = true;
        z12 = true;
        z12 = true;
        if (zIsEmpty) {
            listT = rVar2;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listT = b7.e0.t(listIterator, 1, listK);
                    break;
                }
            } else {
                listT = rVar2;
                break;
            }
        }
        if (listT.toArray(new String[0]).length == 2) {
            ta.a aVar20 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar20);
            TextView textView = ((x3) aVar20).f33576i.f32670i;
            i11 = 2;
            Matcher matcherW2 = nv.p.w(0, "\n", "compile(...)", strH);
            if (matcherW2.find()) {
                ArrayList arrayList2 = new ArrayList(10);
                int iC2 = 0;
                do {
                    iC2 = nv.p.c(matcherW2, strH, iC2, arrayList2);
                } while (matcherW2.find());
                nv.p.B(iC2, strH, arrayList2);
                listK8 = arrayList2;
            } else {
                listK8 = ns.o.K(strH.toString());
            }
            if (listK8.isEmpty()) {
                listT8 = rVar2;
                break;
            }
            ListIterator listIterator2 = listK8.listIterator(listK8.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        listT8 = b7.e0.t(listIterator2, 1, listK8);
                        break;
                    }
                } else {
                    listT8 = rVar2;
                    break;
                }
            }
            textView.setText(((String[]) listT8.toArray(new String[0]))[0]);
            ta.a aVar21 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar21);
            TextView textView2 = ((x3) aVar21).f33576i.f32671j;
            Matcher matcherW3 = nv.p.w(0, "\n", "compile(...)", strH);
            if (matcherW3.find()) {
                ArrayList arrayList3 = new ArrayList(10);
                int iC3 = 0;
                do {
                    iC3 = nv.p.c(matcherW3, strH, iC3, arrayList3);
                } while (matcherW3.find());
                nv.p.B(iC3, strH, arrayList3);
                listK9 = arrayList3;
            } else {
                listK9 = ns.o.K(strH.toString());
            }
            if (listK9.isEmpty()) {
                listT9 = rVar2;
                break;
            }
            ListIterator listIterator3 = listK9.listIterator(listK9.size());
            while (true) {
                if (listIterator3.hasPrevious()) {
                    if (((String) listIterator3.previous()).length() != 0) {
                        listT9 = b7.e0.t(listIterator3, 1, listK9);
                        break;
                    }
                } else {
                    listT9 = rVar2;
                    break;
                }
            }
            textView2.setText(((String[]) listT9.toArray(new String[0]))[1]);
            if (r().keyLanguage == 10 || r().keyLanguage == 22) {
                ta.a aVar22 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar22);
                TextView textView3 = ((x3) aVar22).f33576i.f32671j;
                Matcher matcherW4 = nv.p.w(0, "\n", "compile(...)", strH);
                if (matcherW4.find()) {
                    ArrayList arrayList4 = new ArrayList(10);
                    int iC4 = 0;
                    do {
                        iC4 = nv.p.c(matcherW4, strH, iC4, arrayList4);
                    } while (matcherW4.find());
                    nv.p.B(iC4, strH, arrayList4);
                    listK10 = arrayList4;
                } else {
                    listK10 = ns.o.K(strH.toString());
                }
                if (listK10.isEmpty()) {
                    listT10 = rVar2;
                    break;
                }
                ListIterator listIterator4 = listK10.listIterator(listK10.size());
                while (true) {
                    if (listIterator4.hasPrevious()) {
                        if (((String) listIterator4.previous()).length() != 0) {
                            listT10 = b7.e0.t(listIterator4, 1, listK10);
                            break;
                        }
                    } else {
                        listT10 = rVar2;
                        break;
                    }
                }
                textView3.setText(oz.x.q0(((String[]) listT10.toArray(new String[0]))[1], "́", BuildConfig.VERSION_NAME));
            }
        } else {
            i11 = 2;
            List listW0 = oz.q.W0(strH, new String[]{"\n"}, 0, 6);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : listW0) {
                if (((String) obj).length() > 0) {
                    arrayList5.add(obj);
                }
            }
            if (arrayList5.size() == 3) {
                ta.a aVar23 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar23);
                TextView textView4 = ((x3) aVar23).f33576i.f32670i;
                Matcher matcherW5 = nv.p.w(0, "\n", "compile(...)", strH);
                if (matcherW5.find()) {
                    ArrayList arrayList6 = new ArrayList(10);
                    int iC5 = 0;
                    do {
                        iC5 = nv.p.c(matcherW5, strH, iC5, arrayList6);
                    } while (matcherW5.find());
                    nv.p.B(iC5, strH, arrayList6);
                    listK4 = arrayList6;
                } else {
                    listK4 = ns.o.K(strH.toString());
                }
                if (listK4.isEmpty()) {
                    listT4 = rVar2;
                    break;
                }
                ListIterator listIterator5 = listK4.listIterator(listK4.size());
                while (true) {
                    if (listIterator5.hasPrevious()) {
                        if (((String) listIterator5.previous()).length() != 0) {
                            listT4 = b7.e0.t(listIterator5, 1, listK4);
                            break;
                        }
                    } else {
                        listT4 = rVar2;
                        break;
                    }
                }
                textView4.setText(((String[]) listT4.toArray(new String[0]))[0]);
                ta.a aVar24 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar24);
                ((x3) aVar24).f33576i.f32669h.setVisibility(0);
                ta.a aVar25 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar25);
                TextView textView5 = ((x3) aVar25).f33576i.f32669h;
                Matcher matcherW6 = nv.p.w(0, "\n", "compile(...)", strH);
                if (matcherW6.find()) {
                    ArrayList arrayList7 = new ArrayList(10);
                    int iC6 = 0;
                    do {
                        iC6 = nv.p.c(matcherW6, strH, iC6, arrayList7);
                    } while (matcherW6.find());
                    nv.p.B(iC6, strH, arrayList7);
                    listK5 = arrayList7;
                } else {
                    listK5 = ns.o.K(strH.toString());
                }
                if (listK5.isEmpty()) {
                    listT5 = rVar2;
                    break;
                }
                ListIterator listIterator6 = listK5.listIterator(listK5.size());
                while (true) {
                    if (listIterator6.hasPrevious()) {
                        if (((String) listIterator6.previous()).length() != 0) {
                            listT5 = b7.e0.t(listIterator6, 1, listK5);
                            break;
                        }
                    } else {
                        listT5 = rVar2;
                        break;
                    }
                }
                textView5.setText(((String[]) listT5.toArray(new String[0]))[1]);
                ta.a aVar26 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar26);
                TextView textView6 = ((x3) aVar26).f33576i.f32671j;
                Matcher matcherW7 = nv.p.w(0, "\n", "compile(...)", strH);
                if (matcherW7.find()) {
                    ArrayList arrayList8 = new ArrayList(10);
                    int iC7 = 0;
                    do {
                        iC7 = nv.p.c(matcherW7, strH, iC7, arrayList8);
                    } while (matcherW7.find());
                    nv.p.B(iC7, strH, arrayList8);
                    listK6 = arrayList8;
                } else {
                    listK6 = ns.o.K(strH.toString());
                }
                if (listK6.isEmpty()) {
                    listT6 = rVar2;
                    break;
                }
                ListIterator listIterator7 = listK6.listIterator(listK6.size());
                while (true) {
                    if (listIterator7.hasPrevious()) {
                        if (((String) listIterator7.previous()).length() != 0) {
                            listT6 = b7.e0.t(listIterator7, 1, listK6);
                            break;
                        }
                    } else {
                        listT6 = rVar2;
                        break;
                    }
                }
                textView6.setText(((String[]) listT6.toArray(new String[0]))[2]);
            } else {
                Matcher matcherW8 = nv.p.w(0, "\n", "compile(...)", strH);
                if (matcherW8.find()) {
                    ArrayList arrayList9 = new ArrayList(10);
                    int iC8 = 0;
                    while (true) {
                        iC8 = nv.p.c(matcherW8, strH, iC8, arrayList9);
                        if (!matcherW8.find()) {
                            break;
                        } else {
                            z12 = (z12 ? 1 : 0) == true ? 1 : 0;
                        }
                    }
                    nv.p.B(iC8, strH, arrayList9);
                    listK2 = arrayList9;
                } else {
                    listK2 = ns.o.K(strH.toString());
                }
                if (listK2.isEmpty()) {
                    listT2 = rVar2;
                    break;
                }
                ListIterator listIterator8 = listK2.listIterator(listK2.size());
                while (true) {
                    if (listIterator8.hasPrevious()) {
                        if (((String) listIterator8.previous()).length() != 0) {
                            listT2 = b7.e0.t(listIterator8, z12 ? 1 : 0, listK2);
                            break;
                        }
                    } else {
                        listT2 = rVar2;
                        break;
                    }
                }
                if (listT2.toArray(new String[0]).length == z12) {
                    ta.a aVar27 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar27);
                    TextView textView7 = ((x3) aVar27).f33576i.f32670i;
                    Matcher matcherW9 = nv.p.w(0, "\n", "compile(...)", strH);
                    if (matcherW9.find()) {
                        ArrayList arrayList10 = new ArrayList(10);
                        int iC9 = 0;
                        do {
                            iC9 = nv.p.c(matcherW9, strH, iC9, arrayList10);
                        } while (matcherW9.find());
                        nv.p.B(iC9, strH, arrayList10);
                        listK3 = arrayList10;
                    } else {
                        listK3 = ns.o.K(strH.toString());
                    }
                    if (listK3.isEmpty()) {
                        listT3 = rVar2;
                        break;
                    }
                    ListIterator listIterator9 = listK3.listIterator(listK3.size());
                    while (true) {
                        if (listIterator9.hasPrevious()) {
                            if (((String) listIterator9.previous()).length() != 0) {
                                listT3 = b7.e0.t(listIterator9, z12 ? 1 : 0, listK3);
                                break;
                            }
                        } else {
                            listT3 = rVar2;
                            break;
                        }
                    }
                    textView7.setText(((String[]) listT3.toArray(new String[0]))[0]);
                    ta.a aVar28 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar28);
                    ((x3) aVar28).f33576i.f32671j.setText(BuildConfig.VERSION_NAME);
                }
            }
        }
        mp.a aVar29 = (mp.a) this.N;
        if (aVar29 == null || aVar29.b() != z12) {
            ta.a aVar30 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar30);
            ((x3) aVar30).f33576i.f32666e.setText(R.string.test_continue);
        } else {
            ta.a aVar31 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar31);
            ((x3) aVar31).f33576i.f32666e.setText(R.string.test_finish);
        }
        ta.a aVar32 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar32);
        ((x3) aVar32).f33576i.f32666e.setClickable(z12);
        ta.a aVar33 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar33);
        bq.z.b(((x3) aVar33).f33576i.f32666e, new j0(this, 4));
        ta.a aVar34 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar34);
        ((x3) aVar34).f33576i.f32668g.setVisibility(0);
        int iZ = R.raw.lesson_test_anima_wrong;
        if (z11) {
            ta.a aVar35 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar35);
            ((x3) aVar35).f33569b.setAnimation(z());
            try {
                rVar = rVar2;
                int iRandom = (int) (Math.random() * ((double) 5));
                try {
                    Resources resources = getResources();
                    kotlin.jvm.internal.m.e(resources, "getResources(...)");
                    l.m mVar = this.f36398d;
                    kotlin.jvm.internal.m.c(mVar);
                    int identifier = resources.getIdentifier("You_are_correct_" + iRandom, "string", mVar.getPackageName());
                    ta.a aVar36 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar36);
                    ((x3) aVar36).f33580n.setText(resources.getString(identifier));
                } catch (Exception e8) {
                    e = e8;
                    e.printStackTrace();
                }
            } catch (Exception e10) {
                e = e10;
                rVar = rVar2;
            }
        } else {
            rVar = rVar2;
            ta.a aVar37 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar37);
            ((x3) aVar37).f33569b.setAnimation(R.raw.lesson_test_anima_wrong);
            ta.a aVar38 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar38);
            ((x3) aVar38).f33580n.setText(BuildConfig.VERSION_NAME);
        }
        if (r().showAnim) {
            ta.a aVar39 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar39);
            ((x3) aVar39).f33576i.f32663b.setVisibility(4);
            ta.a aVar40 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar40);
            ((x3) aVar40).f33569b.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
            ta.a aVar41 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar41);
            ((x3) aVar41).f33569b.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
            ta.a aVar42 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar42);
            ((x3) aVar42).f33569b.setScaleX(1.0f);
            ta.a aVar43 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar43);
            ((x3) aVar43).f33569b.setScaleY(1.0f);
            ObjectAnimator objectAnimator = this.f36531g0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f36531g0 = null;
            }
            ta.a aVar44 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar44);
            int i13 = i11;
            float[] fArr = new float[i13];
            // fill-array-data instruction
            fArr[0] = 0.5f;
            fArr[1] = 1.0f;
            float[] fArr2 = new float[i13];
            // fill-array-data instruction
            fArr2[0] = 0.5f;
            fArr2[1] = 1.0f;
            ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(((x3) aVar44).f33573f, PropertyValuesHolder.ofFloat("scaleX", Arrays.copyOf(fArr, i13)), PropertyValuesHolder.ofFloat("scaleY", Arrays.copyOf(fArr2, i13))).setDuration(400L);
            kotlin.jvm.internal.m.e(duration, "setDuration(...)");
            duration.start();
            this.f36531g0 = duration;
            if (r().isLessonTestChallenge) {
                ta.a aVar45 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar45);
                ((x3) aVar45).f33573f.setVisibility(4);
                j11 = 0;
            } else {
                ta.a aVar46 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar46);
                ((x3) aVar46).f33573f.setVisibility(0);
                j11 = 600;
            }
            ta.a aVar47 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar47);
            ((x3) aVar47).f33580n.setVisibility(8);
            ta.a aVar48 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar48);
            ((x3) aVar48).f33569b.h();
            if (z11) {
                if (r().allowSoundEffect && r().isAudioModel && (eVar4 = this.V) != null) {
                    eVar4.k(R.raw.correct_sound);
                }
            } else if (r().allowSoundEffect && r().isAudioModel && (eVar3 = this.V) != null) {
                eVar3.k(R.raw.wrong_sound);
            }
            th.j.a(qx.h.m(j11, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new hd.d(this, 23), h.K), this.f36401t);
        } else {
            ta.a aVar49 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar49);
            ((x3) aVar49).f33576i.f32663b.setVisibility(0);
            if (z11) {
                if (r().allowSoundEffect && r().isAudioModel && (eVar2 = this.V) != null) {
                    eVar2.k(R.raw.correct_sound);
                }
            } else if (r().allowSoundEffect && r().isAudioModel && (eVar = this.V) != null) {
                eVar.k(R.raw.wrong_sound);
            }
            ta.a aVar50 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar50);
            ((x3) aVar50).f33576i.f32667f.setVisibility(0);
            ta.a aVar51 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar51);
            LottieAnimationView lottieAnimationView = ((x3) aVar51).f33576i.f32663b;
            if (z11) {
                iZ = z();
            }
            lottieAnimationView.setAnimation(iZ);
            ii.a aVar52 = this.N;
            if (aVar52 != null && ((mp.a) aVar52).u() != null) {
                mp.a aVar53 = (mp.a) this.N;
                hi.a aVarU = aVar53 != null ? aVar53.u() : null;
                if (aVarU != null) {
                    String strC = aVarU.c();
                    Matcher matcher = b7.e0.u(0, ";", "compile(...)", strC, "input").matcher(strC);
                    if (matcher.find()) {
                        ArrayList arrayList11 = new ArrayList(10);
                        int iC10 = 0;
                        do {
                            iC10 = nv.p.c(matcher, strC, iC10, arrayList11);
                        } while (matcher.find());
                        nv.p.B(iC10, strC, arrayList11);
                        listK7 = arrayList11;
                    } else {
                        listK7 = ns.o.K(strC.toString());
                    }
                    if (listK7.isEmpty()) {
                        i12 = 1;
                        listT7 = rVar;
                        break;
                    }
                    ListIterator listIterator10 = listK7.listIterator(listK7.size());
                    while (true) {
                        if (listIterator10.hasPrevious()) {
                            if (((String) listIterator10.previous()).length() != 0) {
                                i12 = 1;
                                listT7 = b7.e0.t(listIterator10, 1, listK7);
                                break;
                            }
                        } else {
                            i12 = 1;
                            listT7 = rVar;
                            break;
                        }
                    }
                    String[] strArr = (String[]) listT7.toArray(new String[0]);
                    if (strArr.length == 3) {
                        if (aVarU.i() == i12 && ry.l.D(new String[]{"5", "13", "1"}, strArr[2]) && !this.Q) {
                            K();
                        } else if (aVarU.i() == 0 && ry.l.D(new String[]{"9"}, strArr[2]) && !this.Q) {
                            K();
                        } else {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            if (ry.l.D(this.f36536l0, Integer.valueOf(cf.x.n().keyLanguage))) {
                                K();
                            }
                        }
                    }
                }
            }
            V();
            T();
        }
        ta.a aVar54 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar54);
        x3 binding = (x3) aVar54;
        l.m activity = this.f36398d;
        kotlin.jvm.internal.m.c(activity);
        Env mEnv = r();
        kotlin.jvm.internal.m.f(binding, "binding");
        kotlin.jvm.internal.m.f(activity, "activity");
        kotlin.jvm.internal.m.f(mEnv, "mEnv");
        g1.k kVar = new g1.k();
        kVar.f28529b = binding;
        kVar.f28530c = activity;
        kVar.f28531d = mEnv;
        kVar.f28528a = z11;
        this.Z = kVar;
        ii.a aVar55 = this.N;
        kotlin.jvm.internal.m.c(aVar55);
        hi.a aVarU2 = ((mp.a) aVar55).u();
        kotlin.jvm.internal.m.c(aVarU2);
        kVar.h(aVarU2, d(), this.f36525a0, this.f36534j0);
        m0 m0Var = this.f36528d0;
        if (m0Var != null) {
            ta.a aVar56 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar56);
            m0Var.D(((x3) aVar56).f33576i.f32668g);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
    public final void O(int i11) {
        List listK;
        List listK2;
        if (getView() == null) {
            return;
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((x3) aVar).f33581o.setVisibility(8);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        if (((x3) aVar2).f33571d.getVisibility() != 8) {
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            if (((x3) aVar3).f33571d.getVisibility() == 4) {
                ta.a aVar4 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((x3) aVar4).f33571d.setVisibility(0);
            }
        } else {
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ((x3) aVar5).f33571d.setVisibility(0);
        }
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((x3) aVar6).f33570c.setEnabled(false);
        Collection collectionT = ry.r.f50854a;
        switch (i11) {
            case 0:
                ta.a aVar7 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                ((x3) aVar7).f33570c.setText(R.string.test_check);
                ta.a aVar8 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                MaterialButton materialButton = ((x3) aVar8).f33570c;
                Context contextRequireContext = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                materialButton.setTextColor(contextRequireContext.getColor(R.color.color_AFAFAF));
                ta.a aVar9 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                ((x3) aVar9).f33570c.setEnabled(false);
                ii.a aVar10 = this.N;
                kotlin.jvm.internal.m.c(aVar10);
                hi.a aVarU = ((mp.a) aVar10).u();
                if (this.N != null && aVarU != null) {
                    String strC = aVarU.c();
                    Matcher matcher = b7.e0.u(0, ";", "compile(...)", strC, "input").matcher(strC);
                    if (matcher.find()) {
                        ArrayList arrayList = new ArrayList(10);
                        int iC = 0;
                        do {
                            iC = nv.p.c(matcher, strC, iC, arrayList);
                        } while (matcher.find());
                        nv.p.B(iC, strC, arrayList);
                        listK = arrayList;
                    } else {
                        listK = ns.o.K(strC.toString());
                    }
                    if (!listK.isEmpty()) {
                        ListIterator listIterator = listK.listIterator(listK.size());
                        while (listIterator.hasPrevious()) {
                            if (((String) listIterator.previous()).length() != 0) {
                                collectionT = b7.e0.t(listIterator, 1, listK);
                            }
                        }
                    }
                    String[] strArr = (String[]) collectionT.toArray(new String[0]);
                    if (strArr.length == 3 && "1".equals(strArr[0]) && "6".equals(strArr[2])) {
                        ta.a aVar11 = this.f36400f;
                        kotlin.jvm.internal.m.c(aVar11);
                        final int i12 = 1;
                        ((x3) aVar11).f33570c.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: jp.k0

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ p0 f36506b;

                            {
                                this.f36506b = this;
                            }

                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                switch (i12) {
                                    case 0:
                                        p0 p0Var = this.f36506b;
                                        ii.a aVar12 = p0Var.N;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ((mp.a) aVar12).z(true);
                                        p0Var.X();
                                        break;
                                    default:
                                        p0 p0Var2 = this.f36506b;
                                        ii.a aVar13 = p0Var2.N;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ((mp.a) aVar13).z(true);
                                        p0Var2.X();
                                        break;
                                }
                                return true;
                            }
                        });
                        break;
                    }
                }
                break;
            case 1:
                ii.a aVar12 = this.N;
                kotlin.jvm.internal.m.c(aVar12);
                if (((mp.a) aVar12).b()) {
                    ta.a aVar13 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar13);
                    ((x3) aVar13).f33570c.setText(R.string.test_finish);
                } else {
                    ta.a aVar14 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar14);
                    ((x3) aVar14).f33570c.setText(R.string.test_next);
                }
                ta.a aVar15 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar15);
                ((x3) aVar15).f33570c.setEnabled(false);
                ta.a aVar16 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar16);
                MaterialButton materialButton2 = ((x3) aVar16).f33570c;
                Context contextRequireContext2 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                materialButton2.setTextColor(contextRequireContext2.getColor(R.color.color_AFAFAF));
                break;
            case 2:
                ii.a aVar17 = this.N;
                kotlin.jvm.internal.m.c(aVar17);
                if (((mp.a) aVar17).b()) {
                    ta.a aVar18 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar18);
                    ((x3) aVar18).f33570c.setText(R.string.test_finish);
                } else {
                    ta.a aVar19 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar19);
                    ((x3) aVar19).f33570c.setText(R.string.test_next);
                }
                ta.a aVar20 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar20);
                ((x3) aVar20).f33570c.setEnabled(false);
                ta.a aVar21 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar21);
                MaterialButton materialButton3 = ((x3) aVar21).f33570c;
                Context contextRequireContext3 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                materialButton3.setTextColor(contextRequireContext3.getColor(R.color.color_AFAFAF));
                ta.a aVar22 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar22);
                ((x3) aVar22).f33581o.setVisibility(0);
                ta.a aVar23 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar23);
                bq.z.b(((x3) aVar23).f33581o, new j0(this, 0));
                break;
            case 3:
                ta.a aVar24 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar24);
                ((x3) aVar24).f33571d.setVisibility(8);
                break;
            case 4:
                ta.a aVar25 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar25);
                ((x3) aVar25).f33570c.setText(R.string.test_check);
                ta.a aVar26 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar26);
                ((x3) aVar26).f33570c.setClickable(true);
                ta.a aVar27 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar27);
                MaterialButton materialButton4 = ((x3) aVar27).f33570c;
                Context contextRequireContext4 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                materialButton4.setTextColor(contextRequireContext4.getColor(R.color.white));
                ta.a aVar28 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar28);
                ((x3) aVar28).f33570c.setEnabled(true);
                ta.a aVar29 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar29);
                bq.z.b(((x3) aVar29).f33570c, new j0(this, 1));
                break;
            case 5:
                ii.a aVar30 = this.N;
                kotlin.jvm.internal.m.c(aVar30);
                if (((mp.a) aVar30).b()) {
                    ta.a aVar31 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar31);
                    ((x3) aVar31).f33570c.setText(R.string.test_finish);
                } else {
                    ta.a aVar32 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar32);
                    ((x3) aVar32).f33570c.setText(R.string.test_next);
                }
                ta.a aVar33 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar33);
                ((x3) aVar33).f33570c.setClickable(true);
                ta.a aVar34 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar34);
                MaterialButton materialButton5 = ((x3) aVar34).f33570c;
                Context contextRequireContext5 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                materialButton5.setTextColor(contextRequireContext5.getColor(R.color.white));
                ta.a aVar35 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar35);
                ((x3) aVar35).f33570c.setEnabled(true);
                ta.a aVar36 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar36);
                bq.z.b(((x3) aVar36).f33570c, new j0(this, 2));
                break;
            case 6:
                ta.a aVar37 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar37);
                ((x3) aVar37).f33570c.setText(R.string.test_check);
                ta.a aVar38 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar38);
                MaterialButton materialButton6 = ((x3) aVar38).f33570c;
                Context contextRequireContext6 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext6, "requireContext(...)");
                materialButton6.setTextColor(contextRequireContext6.getColor(R.color.color_AFAFAF));
                ta.a aVar39 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar39);
                ((x3) aVar39).f33570c.setEnabled(false);
                ta.a aVar40 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar40);
                ((x3) aVar40).f33581o.setVisibility(0);
                ta.a aVar41 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar41);
                bq.z.b(((x3) aVar41).f33581o, new j0(this, 3));
                ii.a aVar42 = this.N;
                kotlin.jvm.internal.m.c(aVar42);
                hi.a aVarU2 = ((mp.a) aVar42).u();
                if (this.N != null && aVarU2 != null) {
                    String strC2 = aVarU2.c();
                    Matcher matcher2 = b7.e0.u(0, ";", "compile(...)", strC2, "input").matcher(strC2);
                    if (matcher2.find()) {
                        ArrayList arrayList2 = new ArrayList(10);
                        int iC2 = 0;
                        do {
                            iC2 = nv.p.c(matcher2, strC2, iC2, arrayList2);
                        } while (matcher2.find());
                        nv.p.B(iC2, strC2, arrayList2);
                        listK2 = arrayList2;
                    } else {
                        listK2 = ns.o.K(strC2.toString());
                    }
                    if (!listK2.isEmpty()) {
                        ListIterator listIterator2 = listK2.listIterator(listK2.size());
                        while (listIterator2.hasPrevious()) {
                            if (((String) listIterator2.previous()).length() != 0) {
                                collectionT = b7.e0.t(listIterator2, 1, listK2);
                            }
                        }
                    }
                    String[] strArr2 = (String[]) collectionT.toArray(new String[0]);
                    if (strArr2.length == 3 && "1".equals(strArr2[0]) && "6".equals(strArr2[2])) {
                        ta.a aVar43 = this.f36400f;
                        kotlin.jvm.internal.m.c(aVar43);
                        final int i13 = 0;
                        ((x3) aVar43).f33570c.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: jp.k0

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ p0 f36506b;

                            {
                                this.f36506b = this;
                            }

                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                switch (i13) {
                                    case 0:
                                        p0 p0Var = this.f36506b;
                                        ii.a aVar110 = p0Var.N;
                                        kotlin.jvm.internal.m.c(aVar110);
                                        ((mp.a) aVar110).z(true);
                                        p0Var.X();
                                        break;
                                    default:
                                        p0 p0Var2 = this.f36506b;
                                        ii.a aVar111 = p0Var2.N;
                                        kotlin.jvm.internal.m.c(aVar111);
                                        ((mp.a) aVar111).z(true);
                                        p0Var2.X();
                                        break;
                                }
                                return true;
                            }
                        });
                        break;
                    }
                }
                break;
        }
    }

    public final void P() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        if (((x3) aVar).f33577j == null) {
            return;
        }
        if (!r().showAnim) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setAnimator(2, null);
            layoutTransition.setAnimator(3, null);
            layoutTransition.setDuration(0L);
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((x3) aVar2).f33577j.setLayoutTransition(layoutTransition);
            return;
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat("translationX", CropImageView.DEFAULT_ASPECT_RATIO, -b7.e0.f(LingoSkillApplication.f21665b).widthPixels), PropertyValuesHolder.ofFloat("translationY", CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
        kotlin.jvm.internal.m.e(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(...)");
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat("translationX", b7.e0.f(LingoSkillApplication.f21665b).widthPixels, CropImageView.DEFAULT_ASPECT_RATIO), PropertyValuesHolder.ofFloat("translationY", CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
        kotlin.jvm.internal.m.e(objectAnimatorOfPropertyValuesHolder2, "ofPropertyValuesHolder(...)");
        objectAnimatorOfPropertyValuesHolder2.setDuration(500L);
        objectAnimatorOfPropertyValuesHolder2.setStartDelay(500L);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(new AccelerateInterpolator());
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setAnimator(2, objectAnimatorOfPropertyValuesHolder2);
        layoutTransition2.setAnimator(3, objectAnimatorOfPropertyValuesHolder);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((x3) aVar3).f33577j.setLayoutTransition(layoutTransition2);
    }

    public final void Q() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((x3) aVar).f33575h.f32794c.setVisibility(8);
    }

    public final void R() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((ImageView) ((x3) aVar).f33575h.f32798g).setVisibility(8);
    }

    public final void S(int i11) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        int i12 = i11 * 100;
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        if (i12 > ((ProgressBar) ((x3) aVar2).f33575h.f32795d).getMax()) {
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            i11 = ((ProgressBar) ((x3) aVar3).f33575h.f32795d).getMax() / 100;
        }
        ObjectAnimator objectAnimator = this.f36530f0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f36530f0 = null;
        }
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ProgressBar progressBar = (ProgressBar) ((x3) aVar4).f33575h.f32795d;
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "progress", ((ProgressBar) ((x3) aVar5).f33575h.f32795d).getProgress(), i11 * 100);
        this.f36530f0 = objectAnimatorOfInt;
        if (objectAnimatorOfInt != null) {
            objectAnimatorOfInt.setDuration(500L);
        }
        ObjectAnimator objectAnimator2 = this.f36530f0;
        if (objectAnimator2 != null) {
            objectAnimator2.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator3 = this.f36530f0;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
    }

    public final void T() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = ((x3) aVar).f33576i.f32670i;
        v10.c.G(textView);
        textView.setTextSize(18.0f);
        textView.postDelayed(new b2.c(4, textView, new i0(this, 1)), 0L);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        TextView textView2 = ((x3) aVar2).f33576i.f32671j;
        v10.c.G(textView2);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        ff.h.L(contextRequireContext, textView2, 24);
        textView2.postDelayed(new b2.c(4, textView2, new i0(this, 2)), 0L);
    }

    public void U(int i11) {
        this.f36526b0 = i11;
    }

    public final void V() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        View viewFindViewById = ((x3) aVar).f33576i.f32668g.findViewById(R.id.fl_audio);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        bq.z.b(viewFindViewById, new j0(this, 5));
        if (r().isAudioModel) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((ImageView) ((x3) aVar2).f33576i.f32668g.findViewById(R.id.iv_audio_answer)).setBackgroundResource(R.drawable.ic_audio_white_ls);
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((ImageView) ((x3) aVar3).f33576i.f32668g.findViewById(R.id.iv_audio_answer)).setVisibility(0);
        } else {
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((ImageView) ((x3) aVar4).f33576i.f32668g.findViewById(R.id.iv_audio_answer)).setVisibility(8);
        }
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        float y10 = ((x3) aVar5).f33569b.getY();
        if (this.f36529e0 != null) {
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ((x3) aVar6).f33576i.f32668g.setOnTouchListener(this.f36529e0);
        } else {
            this.f36529e0 = new o0(this, y10);
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((x3) aVar7).f33576i.f32668g.setOnTouchListener(this.f36529e0);
        }
    }

    public final void W(boolean z11) {
        if (this.f36399e == null) {
            return;
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        e3 e3Var = ((x3) aVar).f33574g;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            ComposeView composeView = (ComposeView) e3Var.f32524c;
            ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        if (z11) {
            System.currentTimeMillis();
        } else {
            X();
        }
    }

    public final void X() {
        if (this.N == null) {
            return;
        }
        rx.b bVar = this.f36527c0;
        if (bVar != null) {
            bVar.dispose();
        }
        th.e eVar = this.V;
        if (eVar != null) {
            eVar.a();
        }
        th.e eVar2 = this.V;
        if (eVar2 != null) {
            eVar2.g();
        }
        th.e eVar3 = this.V;
        if (eVar3 != null) {
            eVar3.n();
        }
        P();
        this.f36528d0 = null;
        ii.a aVar = this.N;
        kotlin.jvm.internal.m.c(aVar);
        if (((mp.a) aVar).b()) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((LinearLayout) ((x3) aVar2).f33574g.f32525d).setVisibility(8);
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((x3) aVar3).f33578k.m.setVisibility(8);
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((x3) aVar4).f33572e.setVisibility(0);
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            RelativeLayout relativeLayout = ((x3) aVar5).f33579l;
            kotlin.jvm.internal.m.c(relativeLayout);
            ve.i.B(relativeLayout);
            g1.k kVar = this.Z;
            if (kVar != null) {
                kVar.b();
            }
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            if (((TextView) ((x3) aVar6).f33575h.f32799h).getVisibility() == 0) {
                ta.a aVar7 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                ((TextView) ((x3) aVar7).f33575h.f32799h).setVisibility(8);
            }
        } else {
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            ((x3) aVar8).f33569b.setImageResource(android.R.color.transparent);
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            ((x3) aVar9).f33576i.f32663b.setImageResource(android.R.color.transparent);
            ta.a aVar10 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar10);
            ((LinearLayout) ((x3) aVar10).f33574g.f32525d).setVisibility(8);
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            ((x3) aVar11).f33572e.animate().alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(300L).start();
            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new a5.f(this, 18), h.f36480t), this.f36401t);
            ta.a aVar12 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar12);
            ((x3) aVar12).f33576i.f32668g.setVisibility(8);
            ta.a aVar13 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar13);
            ((x3) aVar13).f33573f.setVisibility(8);
            ta.a aVar14 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar14);
            ((x3) aVar14).f33578k.m.setVisibility(8);
            ta.a aVar15 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar15);
            ((x3) aVar15).f33569b.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
            ta.a aVar16 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar16);
            ((x3) aVar16).f33576i.f32668g.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
            ta.a aVar17 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar17);
            ve.i.B(((x3) aVar17).f33579l);
            g1.k kVar2 = this.Z;
            if (kVar2 != null) {
                kVar2.b();
            }
            ta.a aVar18 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar18);
            if (((TextView) ((x3) aVar18).f33575h.f32799h).getVisibility() == 0) {
                ta.a aVar19 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar19);
                ((TextView) ((x3) aVar19).f33575h.f32799h).setVisibility(8);
            }
        }
        mp.a aVar20 = (mp.a) this.N;
        if (aVar20 != null) {
            ta.a aVar21 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar21);
            aVar20.t(((x3) aVar21).f33577j);
        }
    }

    public final void Y() {
        if (this.f36398d == null) {
            return;
        }
        mp.a aVar = (mp.a) this.N;
        if (aVar != null && aVar.n() == 0) {
            L();
            return;
        }
        h1 h1Var = new h1();
        h1Var.u(getChildFragmentManager(), "LessonQuitBottomSheetDialogFragment");
        h1Var.U = new ob.u(15, this, h1Var);
    }

    public void Z() {
        if (this.Q) {
            t().d("TestOutPage");
            return;
        }
        if (this.W) {
            t().d("ReviewPractice");
        } else if (this.f36535k0) {
            t().d("DialoguePractice");
        } else {
            t().d("MainCourseLessonPractice");
        }
    }

    @Override // mp.b
    public int d() {
        return this.f36526b0;
    }

    @Override // mp.b
    public void g(boolean z11) {
        th.e eVar = this.V;
        if (eVar != null) {
            eVar.a();
        }
        th.e eVar2 = this.V;
        if (eVar2 != null) {
            eVar2.n();
        }
        if (z11) {
            x();
            if (this.W) {
                F();
                return;
            }
            ii.a aVar = this.N;
            kotlin.jvm.internal.m.c(aVar);
            boolean zIsEmpty = ((mp.a) aVar).s().isEmpty();
            n9.q qVar = this.f36401t;
            if (zIsEmpty) {
                l.m mVar = this.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                oi.c cVar = new oi.c();
                cVar.f44925a = mVar;
                View view = this.f36399e;
                kotlin.jvm.internal.m.c(view);
                cVar.f44926b = view;
                cVar.f44927c = new ch.x();
                cVar.v(qVar);
                return;
            }
            l.m mVar2 = this.f36398d;
            kotlin.jvm.internal.m.c(mVar2);
            oi.c cVar2 = new oi.c();
            cVar2.f44925a = mVar2;
            View view2 = this.f36399e;
            kotlin.jvm.internal.m.c(view2);
            cVar2.f44926b = view2;
            ii.a aVar2 = this.N;
            kotlin.jvm.internal.m.c(aVar2);
            HashMap knowPoint = ((mp.a) aVar2).s();
            ii.a aVar3 = this.N;
            kotlin.jvm.internal.m.c(aVar3);
            ((mp.a) aVar3).i();
            ii.a aVar4 = this.N;
            kotlin.jvm.internal.m.c(aVar4);
            String mode = this.f36534j0;
            kotlin.jvm.internal.m.f(knowPoint, "knowPoint");
            kotlin.jvm.internal.m.f(mode, "mode");
            cVar2.f44927c = new androidx.fragment.app.k0();
            cVar2.v(qVar);
        }
    }

    @Override // mp.b
    public void h(String status, boolean z11) {
        kotlin.jvm.internal.m.f(status, "status");
        if (getView() == null) {
            return;
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        e3 llDownload = ((x3) aVar).f33574g;
        kotlin.jvm.internal.m.e(llDownload, "llDownload");
        LinearLayout linearLayout = (LinearLayout) llDownload.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
        } else {
            ComposeView composeView = (ComposeView) llDownload.f32524c;
            ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
            linearLayout.setVisibility(0);
        }
        if (z11) {
            X();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onActivityResult(int i11, int i12, Intent intent) {
        g1.k kVar;
        super.onActivityResult(i11, i12, intent);
        if (i11 != 3004 || r().isUnloginUser() || this.Z == null) {
            return;
        }
        try {
            View view = this.f36399e;
            if (view == null || view.findViewById(R.id.rl_bug_report).getVisibility() != 0 || (kVar = this.Z) == null) {
                return;
            }
            mp.a aVar = (mp.a) this.N;
            hi.a aVarU = aVar != null ? aVar.u() : null;
            kotlin.jvm.internal.m.c(aVarU);
            kVar.h(aVarU, d(), this.f36525a0, this.f36534j0);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // bp.n, androidx.fragment.app.k0
    public final void onPause() {
        super.onPause();
        th.e eVar = this.V;
        if (eVar != null) {
            eVar.n();
        }
    }

    @Override // bp.n, ji.e, androidx.fragment.app.k0
    public void onResume() {
        super.onResume();
        Z();
    }

    @Override // androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.m.f(outState, "outState");
        super.onSaveInstanceState(outState);
        ii.a aVar = this.N;
        if (aVar != null) {
            ((mp.a) aVar).e(outState);
        }
    }

    @Override // ji.f, ji.e
    public final void q() {
        super.q();
        x();
    }

    public final void x() {
        mp.a aVar;
        hi.a aVarU;
        lc.d dVar;
        th.e eVar = this.V;
        if (eVar != null) {
            eVar.b();
        }
        dm.c cVar = this.Y;
        if (cVar != null && (dVar = (lc.d) cVar.f23493e) != null && dVar.isShowing()) {
            lc.d dVar2 = (lc.d) cVar.f23493e;
            kotlin.jvm.internal.m.c(dVar2);
            dVar2.dismiss();
        }
        ii.a aVar2 = this.N;
        if (aVar2 != null && ((mp.a) aVar2).u() != null && (aVar = (mp.a) this.N) != null && (aVarU = aVar.u()) != null) {
            aVarU.f();
        }
        g1.k kVar = this.Z;
        if (kVar != null) {
            kVar.b();
        }
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((x3) aVar4).f33576i.f32668g.setOnTouchListener(null);
        ObjectAnimator objectAnimator = this.f36530f0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f36530f0 = null;
        }
        ObjectAnimator objectAnimator2 = this.f36531g0;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
            this.f36531g0 = null;
        }
        z4.w0 w0Var = this.f36532h0;
        if (w0Var != null) {
            w0Var.b();
            this.f36532h0 = null;
        }
        z4.w0 w0Var2 = this.f36533i0;
        if (w0Var2 != null) {
            w0Var2.b();
            this.f36533i0 = null;
        }
    }

    public final ConstraintLayout y() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        return ((x3) aVar).f33576i.f32668g;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0956 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x08f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x08dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0973 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x08de  */
    /* JADX WARN: Code duplicated, block: B:49:0x0900 A[Catch: Exception -> 0x0973, TryCatch #1 {Exception -> 0x0973, blocks: (B:47:0x08fa, B:49:0x0900, B:51:0x0908, B:53:0x0910, B:56:0x0920, B:59:0x0928, B:60:0x092c, B:62:0x0932, B:66:0x094c), top: B:130:0x08fa }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0907  */
    /* JADX WARN: Code duplicated, block: B:53:0x0910 A[Catch: Exception -> 0x0973, TryCatch #1 {Exception -> 0x0973, blocks: (B:47:0x08fa, B:49:0x0900, B:51:0x0908, B:53:0x0910, B:56:0x0920, B:59:0x0928, B:60:0x092c, B:62:0x0932, B:66:0x094c), top: B:130:0x08fa }] */
    /* JADX WARN: Code duplicated, block: B:55:0x091e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0926 A[EDGE_INSN: B:58:0x0926->B:65:0x094a BREAK  A[LOOP:4: B:60:0x092c->B:143:?]] */
    /* JADX WARN: Code duplicated, block: B:66:0x094c A[Catch: Exception -> 0x0973, TRY_LEAVE, TryCatch #1 {Exception -> 0x0973, blocks: (B:47:0x08fa, B:49:0x0900, B:51:0x0908, B:53:0x0910, B:56:0x0920, B:59:0x0928, B:60:0x092c, B:62:0x0932, B:66:0x094c), top: B:130:0x08fa }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0962  */
    /* JADX WARN: Code duplicated, block: B:71:0x0963 A[Catch: Exception -> 0x096c, TryCatch #0 {Exception -> 0x096c, blocks: (B:68:0x0956, B:72:0x0965, B:71:0x0963), top: B:128:0x0956 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x096c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0973 A[EDGE_INSN: B:78:0x0973->B:79:0x0974 BREAK  A[LOOP:3: B:52:0x090e->B:77:0x0970]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0980  */
    /* JADX WARN: Code duplicated, block: B:85:0x0983  */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.github.javiersantos.piracychecker.PiracyChecker$callback$2] */
    @Override // ji.e
    public final void v(Bundle bundle) {
        PiracyChecker piracyChecker;
        Context context;
        PirateApp pirateApp;
        PiracyChecker$callback$2 piracyChecker$callback$2;
        PiracyCheckerError piracyCheckerError;
        ArrayList extraApps;
        ArrayList arrayList;
        HashSet hashSet;
        ArrayList arrayList2;
        int size;
        int i11;
        ArrayList arrayList3;
        PackageManager packageManager;
        List<ApplicationInfo> installedApplications;
        int size2;
        boolean z11;
        int i12;
        Intent launchIntentForPackage;
        List<ResolveInfo> listQueryIntentActivities;
        Object obj;
        Context context2;
        j9.a0 a0Var = new j9.a0(11);
        androidx.fragment.app.p0 activity = getActivity();
        if (activity != null) {
            piracyChecker = new PiracyChecker(activity);
        } else {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext()");
            piracyChecker = new PiracyChecker(contextRequireContext);
        }
        a0Var.invoke(piracyChecker);
        if (piracyChecker.f7759i == null && piracyChecker.f7760j == null) {
            final PiracyChecker$start$1 piracyChecker$start$1 = new PiracyChecker$start$1(piracyChecker);
            piracyChecker.f7759i = new PiracyChecker$callback$1();
            piracyChecker.f7760j = new DoNotAllowCallback() { // from class: com.github.javiersantos.piracychecker.PiracyChecker$callback$2
                /* JADX WARN: Code duplicated, block: B:15:0x0034  */
                public final void a(PiracyCheckerError error, PirateApp pirateApp2) {
                    String string;
                    m.f(error, "error");
                    PiracyChecker piracyChecker2 = piracyChecker$start$1.f7765a;
                    Context context3 = piracyChecker2.f7762l;
                    if ((context3 instanceof Activity) && ((Activity) context3).isFinishing()) {
                        return;
                    }
                    String str = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
                    if (pirateApp2 != null) {
                        Context context4 = piracyChecker2.f7762l;
                        string = context4 != null ? context4.getString(com.lingodeer.R.string.unauthorized_app_found, pirateApp2.f7772a) : null;
                        if (string == null) {
                            string = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
                        }
                    } else if (error == PiracyCheckerError.BLOCK_PIRATE_APP) {
                        Context context5 = piracyChecker2.f7762l;
                        string = context5 != null ? context5.getString(com.lingodeer.R.string.unauthorized_app_blocked) : null;
                        if (string == null) {
                            string = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
                        }
                    } else {
                        string = piracyChecker2.f7763n;
                    }
                    if (piracyChecker2.f7751a != Display.DIALOG) {
                        Intent intentPutExtra = new Intent(piracyChecker2.f7762l, (Class<?>) LicenseActivity.class).putExtra("content", string).putExtra("colorPrimary", piracyChecker2.f7752b).putExtra("colorPrimaryDark", piracyChecker2.f7753c).putExtra("withLightStatusBar", false).putExtra("layoutXML", piracyChecker2.f7754d);
                        m.e(intentPutExtra, "Intent(context, LicenseA…a(\"layoutXML\", layoutXML)");
                        Context context6 = piracyChecker2.f7762l;
                        if (context6 != null) {
                            context6.startActivity(intentPutExtra);
                        }
                        Context context7 = piracyChecker2.f7762l;
                        if (!(context7 instanceof Activity)) {
                            context7 = null;
                        }
                        Activity activity2 = (Activity) context7;
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        PiracyCheckerDialog piracyCheckerDialog = piracyChecker2.f7761k;
                        if (piracyCheckerDialog != null) {
                            piracyCheckerDialog.q(false, false);
                        }
                        piracyChecker2.f7761k = null;
                        piracyChecker2.f7762l = null;
                        return;
                    }
                    PiracyCheckerDialog piracyCheckerDialog2 = piracyChecker2.f7761k;
                    if (piracyCheckerDialog2 != null) {
                        piracyCheckerDialog2.q(false, false);
                    }
                    piracyChecker2.f7761k = null;
                    PiracyCheckerDialog.Companion companion = PiracyCheckerDialog.V;
                    String str2 = piracyChecker2.m;
                    if (str2 == null) {
                        str2 = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
                    }
                    if (string != null) {
                        str = string;
                    }
                    companion.getClass();
                    PiracyCheckerDialog.S = new PiracyCheckerDialog();
                    PiracyCheckerDialog.T = str2;
                    PiracyCheckerDialog.U = str;
                    PiracyCheckerDialog piracyCheckerDialog3 = PiracyCheckerDialog.S;
                    piracyChecker2.f7761k = piracyCheckerDialog3;
                    Context context8 = piracyChecker2.f7762l;
                    if (context8 != null) {
                        if (piracyCheckerDialog3 == null) {
                            PiracyChecker$start$1$doNotAllow$1$1.f7766a.getClass();
                            return;
                        }
                        l.m mVar = (l.m) (context8 instanceof l.m ? context8 : null);
                        if (mVar != null) {
                            piracyCheckerDialog3.u(mVar.getSupportFragmentManager(), "[LICENSE_DIALOG]");
                        }
                    }
                }
            };
        }
        vy.d dVar = null;
        int i13 = 0;
        if (!piracyChecker.f7755e || ((context2 = piracyChecker.f7762l) != null && LibraryUtilsKt.b(context2, piracyChecker.f7756f))) {
            ArrayList installerID = piracyChecker.f7757g;
            if (installerID.isEmpty()) {
                context = piracyChecker.f7762l;
                if (context != null) {
                    pirateApp = null;
                    break;
                }
                extraApps = piracyChecker.f7758h;
                kotlin.jvm.internal.m.f(extraApps, "extraApps");
                if (extraApps.isEmpty()) {
                    pirateApp = null;
                    break;
                }
                arrayList = new ArrayList();
                AppType appType = AppType.PIRATE;
                arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "c", "h", "e", "l", "p", "u", "s", ".", "l", "a", "c", "k", "y", "p", "a", "t", "c", "h"}, appType));
                arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "d", "i", "m", MFeWs.RuUraprZcuLXTfW, "n", "v", "i", "d", "e", "o", ".", "l", "u", "c", "k", "y", "p", "a", "t", "c", "h", "e", "r"}, appType));
                arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "f", "o", "r", "p", "d", "a", ".", "l", "p"}, appType));
                arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "a", "n", "d", "r", "o", "i", "d", ".", "v", "e", "n", "d", "i", "n", "g", ".", "b", "i", "l", "l", "i", "n", "g", ".", "I", "n", "A", "p", "p", "B", "i", "l", "l", "i", "n", "g", "S", "e", "r", "v", "i", "c", "e"}, appType));
                arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "a", "n", "d", "r", "o", "i", "d", ".", "v", "e", "n", "d", "i", "n", "g", ".", "b", "i", "l", "l", "i", "n", "g", ".", "I", "n", "A", "p", "p", "B", "i", "l", EHjhWcesDUIsIw.uZTIJJjzN, "i", "n", "g", "S", "o", "r", "v", "i", "c", "e"}, appType));
                arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "a", "n", "d", "r", "o", "i", "d", ".", "v", "e", MFeWs.DYUEONCh, "d", "i", "n", ealNNtLp.hyiCZxtZLG}, appType));
                arrayList.add(new PirateApp("UretPatcher", new String[]{"u", "r", "e", nuRcCS.rfKeo, ".", "j", "a", "s", "i", "2", "1", "6", "9", ".", "p", "a", "t", "c", "h", "e", "r"}, appType));
                arrayList.add(new PirateApp("UretPatcher", new String[]{"z", "o", "n", "e", ".", "j", "a", "s", "i", "2", "1", "6", "9", ".", "u", "r", "e", "t", "p", "a", "t", "c", "h", "e", "r"}, appType));
                arrayList.add(new PirateApp("ActionLauncherPatcher", new String[]{"p", ".", "j", "a", "s", "i", "2", "1", "6", "9", ".", "a", "l", "3"}, appType));
                arrayList.add(new PirateApp("Freedom", new String[]{"c", "c", ".", "m", "a", "d", "k", "i", "t", "e", ".", "f", "r", "e", "e", "d", "o", "m"}, appType));
                arrayList.add(new PirateApp("Freedom", new String[]{"c", "c", ".", "c", "z", ".", "m", "a", "d", "k", "i", "t", "e", ".", "f", "r", "e", "e", "d", "o", "m"}, appType));
                arrayList.add(new PirateApp("CreeHack", new String[]{"o", "r", "g", ".", "c", "r", "e", "e", "p", "l", "a", "y", "s", ".", "h", "a", "c", "k"}, appType));
                arrayList.add(new PirateApp("HappyMod", new String[]{"c", "o", "m", ".", "h", "a", "p", "p", "y", "m", "o", "d", ".", "a", "p", "k"}, appType));
                arrayList.add(new PirateApp("Game Hacker", new String[]{"o", tcppUUQxZjFdy.nBFsSWzzRyOP, "g", ".", "s", "b", "t", "o", "o", iFLeRCXvYCGdPW.bGytOiDiB, "s", ".", "g", "a", "m", "e", "h", "a", "c", "k"}, appType));
                arrayList.add(new PirateApp("Game Killer Cheats", new String[]{"c", "o", "m", ".", "z", "u", "n", "e", ".", "g", "a", "m", "e", "k", "i", "l", "l", "e", "r"}, appType));
                arrayList.add(new PirateApp("AGK - App Killer", new String[]{"c", "o", "m", ".", "a", "a", "g", ".", "k", "i", "l", "l", "e", "r"}, appType));
                arrayList.add(new PirateApp("Game Killer", new String[]{"c", "o", "m", ".", "k", "i", "l", "l", "e", "r", "a", "p", "p", ".", "g", "a", "m", "e", "k", "i", HOBXIlHxIkMBEA.mOOCPuGLM, "l", "e", "r"}, appType));
                arrayList.add(new PirateApp("Game Killer", new String[]{"c", "n", ".", "l", "m", ".", "s", ualZoVVCQs.UNgaivuLKupcXeK}, appType));
                arrayList.add(new PirateApp("Game CheatIng Hacker", new String[]{"n", "e", "t", ".", "s", "c", "h", "w", "a", "r", "z", "i", "s", ".", "g", "a", "m", "e", "_", "c", "i", "h"}, appType));
                arrayList.add(new PirateApp("Game Hacker", new String[]{"c", "o", "m", ".", "b", "a", "s", "e", "a", "p", "p", "f", "u", "l", "l", ".", "f", "w", "d"}, appType));
                arrayList.add(new PirateApp("Content Guard Disabler", new String[]{"c", "o", "m", ".", "g", "i", "t", "h", "u", "b", ".", "o", "n", "e", "m", "i", "n", "u", "s", "o", "n", "e", ".", "d", "i", "s", "a", "b", "l", "e", "c", "o", "n", "t", "e", "n", "t", "g", "u", "a", "r", "d"}, appType));
                arrayList.add(new PirateApp("Content Guard Disabler", new String[]{"c", "o", "m", ".", "o", "n", shrCcjmOhAmRC.OPABNY, "m", "i", "n", "u", "s", "o", "n", "e", ".", "d", "i", "s", "a", "b", "l", "e", "c", "o", "n", "t", "e", "n", "t", "g", "u", "a", "r", "d"}, appType));
                AppType appType2 = AppType.STORE;
                arrayList.add(new PirateApp("Aptoide", new String[]{"c", "m", ".", "a", "p", "t", "o", "i", "d", "e", ".", "p", "t"}, appType2));
                arrayList.add(new PirateApp("BlackMart", new String[]{"o", "r", "g", ADSb.HjZmrLABMMcrzsV, "b", "l", "a", "c", "k", "m", "a", "r", "t", ".", "m", "a", "r", "k", "e", "t"}, appType2));
                arrayList.add(new PirateApp("BlackMart", new String[]{"c", "o", "m", ".", "b", "l", "a", "c", "k", "m", "a", "r", "t", "a", "l", "p", "h", "a"}, appType2));
                arrayList.add(new PirateApp("Mobogenie", new String[]{"c", "o", "m", ".", "m", gkbGsXmgaxRjJ.CESegwzsAgr, "b", "o", "g", "e", "n", "i", "e"}, appType2));
                arrayList.add(new PirateApp("1Mobile", new String[]{"m", "e", ".", "o", "n", "e", "m", "o", "b", "i", "l", "e", ".", "a", "n", "d", "r", "o", "i", "d"}, appType2));
                arrayList.add(new PirateApp("GetApk", new String[]{"c", "o", "m", ".", "r", "e", "p", "o", "d", "r", "o", "i", "d", ".", "a", "p", "p"}, appType2));
                arrayList.add(new PirateApp("GetJar", new String[]{"c", "o", "m", ".", "g", "e", "t", "j", "a", "r", ".", "r", "e", "w", "a", "r", "d", "s"}, appType2));
                arrayList.add(new PirateApp("SlideMe", new String[]{"c", "o", "m", ".", "s", "l", "i", "d", "e", "m", "e", ".", "s", "a", "m", ".", "m", "a", "n", "a", "g", "e", "r"}, appType2));
                arrayList.add(new PirateApp("ACMarket", new String[]{"n", "e", "t", ".", "a", "p", "p", "c", "a", "k", "e"}, appType2));
                arrayList.add(new PirateApp("ACMarket", new String[]{scqhIrGXy.IeuKIaDYtBQ, "c", ".", "m", "a", "r", "k", "e", "t", ".", "s", "t", "o", "r", "e"}, appType2));
                arrayList.add(new PirateApp("AppCake", new String[]{"c", "o", "m", ".", "a", "p", "p", "c", "a", "k", "e"}, appType2));
                arrayList.add(new PirateApp("Z Market", new String[]{"c", "o", "m", ".", "z", "m", "a", "p", "p"}, appType2));
                arrayList.add(new PirateApp("Modded Play Store", new String[]{"c", "o", "m", ".", "d", "v", ".", "m", "a", "r", "k", "e", "t", "m", "o", "d", ".", "i", "n", "s", "t", "a", "l", "l", "e", "r"}, appType2));
                arrayList.add(new PirateApp("Mobilism Market", new String[]{"o", "r", "g", ".", "m", "o", "b", "i", "l", "i", "s", evRpcb.YQlmBkbdFT, ".", "a", "n", "d", "r", "o", "i", "d"}, appType2));
                arrayList.add(new PirateApp("All-in-one Downloader", new String[]{"c", "o", "m", ".", "a", "l", "l", "i", "n", "o", "n", "e", ".", "f", "r", "e", MzwEyWCkjXL.UiHszvYDkFzXFmO}, appType2));
                arrayList.addAll(extraApps);
                hashSet = new HashSet();
                arrayList2 = new ArrayList();
                size = arrayList.size();
                i11 = 0;
                while (i11 < size) {
                    obj = arrayList.get(i11);
                    i11++;
                    if (hashSet.add(((PirateApp) obj).a())) {
                        arrayList2.add(obj);
                    }
                }
                arrayList3 = new ArrayList(arrayList2);
                try {
                    packageManager = context.getPackageManager();
                    if (packageManager != null) {
                        installedApplications = packageManager.getInstalledApplications(128);
                    } else {
                        installedApplications = null;
                    }
                    size2 = arrayList3.size();
                    z11 = false;
                    i12 = 0;
                    do {
                        if (i12 < size2) {
                            pirateApp = null;
                            break;
                        }
                        Object obj2 = arrayList3.get(i12);
                        i12++;
                        pirateApp = (PirateApp) obj2;
                        if (pirateApp.f7773b == AppType.OTHER) {
                            if (installedApplications == null && !installedApplications.isEmpty()) {
                                Iterator<T> it = installedApplications.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z11 = false;
                                        break;
                                    }
                                    String str = ((ApplicationInfo) it.next()).packageName;
                                    kotlin.jvm.internal.m.e(str, "it.packageName");
                                    if (oz.q.v0(str, pirateApp.a(), false)) {
                                        z11 = true;
                                        break;
                                    }
                                }
                            } else {
                                z11 = false;
                                break;
                            }
                            if (!z11) {
                                launchIntentForPackage = packageManager.getLaunchIntentForPackage(pirateApp.a());
                                if (launchIntentForPackage != null) {
                                    try {
                                        listQueryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 65536);
                                        if (listQueryIntentActivities != null) {
                                            listQueryIntentActivities = ry.r.f50854a;
                                        }
                                        z11 = !listQueryIntentActivities.isEmpty();
                                    } catch (Exception unused) {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = false;
                                }
                            }
                        }
                    } while (!z11);
                } catch (Exception unused2) {
                }
                if (pirateApp != null && (piracyChecker$callback$2 = piracyChecker.f7760j) != null) {
                    if (pirateApp.f7773b == AppType.STORE) {
                        piracyCheckerError = PiracyCheckerError.THIRD_PARTY_STORE_INSTALLED;
                    } else {
                        piracyCheckerError = PiracyCheckerError.PIRATE_APP_INSTALLED;
                    }
                    piracyChecker$callback$2.a(piracyCheckerError, pirateApp);
                }
            } else {
                Context context3 = piracyChecker.f7762l;
                if (context3 != null) {
                    kotlin.jvm.internal.m.f(installerID, "installerID");
                    ArrayList arrayList4 = new ArrayList();
                    String installerPackageName = context3.getPackageManager().getInstallerPackageName(context3.getPackageName());
                    int size3 = installerID.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj3 = installerID.get(i14);
                        i14++;
                        arrayList4.addAll(((InstallerID) obj3).a());
                    }
                    if (installerPackageName != null && arrayList4.contains(installerPackageName)) {
                        context = piracyChecker.f7762l;
                        if (context != null) {
                            pirateApp = null;
                            break;
                        }
                        extraApps = piracyChecker.f7758h;
                        kotlin.jvm.internal.m.f(extraApps, "extraApps");
                        if (extraApps.isEmpty()) {
                            pirateApp = null;
                            break;
                        }
                        arrayList = new ArrayList();
                        AppType appType3 = AppType.PIRATE;
                        arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "c", "h", "e", "l", "p", "u", "s", ".", "l", "a", "c", "k", "y", "p", "a", "t", "c", "h"}, appType3));
                        arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "d", "i", "m", MFeWs.RuUraprZcuLXTfW, "n", "v", "i", "d", "e", "o", ".", "l", "u", "c", "k", "y", "p", "a", "t", "c", "h", "e", "r"}, appType3));
                        arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "f", "o", "r", "p", "d", "a", ".", "l", "p"}, appType3));
                        arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "a", "n", "d", "r", "o", "i", "d", ".", "v", "e", "n", "d", "i", "n", "g", ".", "b", "i", "l", "l", "i", "n", "g", ".", "I", "n", "A", "p", "p", "B", "i", "l", "l", "i", "n", "g", "S", "e", "r", "v", "i", "c", "e"}, appType3));
                        arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "a", "n", "d", "r", "o", "i", "d", ".", "v", "e", "n", "d", "i", "n", "g", ".", "b", "i", "l", "l", "i", "n", "g", ".", "I", "n", "A", "p", "p", "B", "i", "l", EHjhWcesDUIsIw.uZTIJJjzN, "i", "n", "g", "S", "o", "r", "v", "i", "c", "e"}, appType3));
                        arrayList.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "a", "n", "d", "r", "o", "i", "d", ".", "v", "e", MFeWs.DYUEONCh, "d", "i", "n", ealNNtLp.hyiCZxtZLG}, appType3));
                        arrayList.add(new PirateApp("UretPatcher", new String[]{"u", "r", "e", nuRcCS.rfKeo, ".", "j", "a", "s", "i", "2", "1", "6", "9", ".", "p", "a", "t", "c", "h", "e", "r"}, appType3));
                        arrayList.add(new PirateApp("UretPatcher", new String[]{"z", "o", "n", "e", ".", "j", "a", "s", "i", "2", "1", "6", "9", ".", "u", "r", "e", "t", "p", "a", "t", "c", "h", "e", "r"}, appType3));
                        arrayList.add(new PirateApp("ActionLauncherPatcher", new String[]{"p", ".", "j", "a", "s", "i", "2", "1", "6", "9", ".", "a", "l", "3"}, appType3));
                        arrayList.add(new PirateApp("Freedom", new String[]{"c", "c", ".", "m", "a", "d", "k", "i", "t", "e", ".", "f", "r", "e", "e", "d", "o", "m"}, appType3));
                        arrayList.add(new PirateApp("Freedom", new String[]{"c", "c", ".", "c", "z", ".", "m", "a", "d", "k", "i", "t", "e", ".", "f", "r", "e", "e", "d", "o", "m"}, appType3));
                        arrayList.add(new PirateApp("CreeHack", new String[]{"o", "r", "g", ".", "c", "r", "e", "e", "p", "l", "a", "y", "s", ".", "h", "a", "c", "k"}, appType3));
                        arrayList.add(new PirateApp("HappyMod", new String[]{"c", "o", "m", ".", "h", "a", "p", "p", "y", "m", "o", "d", ".", "a", "p", "k"}, appType3));
                        arrayList.add(new PirateApp("Game Hacker", new String[]{"o", tcppUUQxZjFdy.nBFsSWzzRyOP, "g", ".", "s", "b", "t", "o", "o", iFLeRCXvYCGdPW.bGytOiDiB, "s", ".", "g", "a", "m", "e", "h", "a", "c", "k"}, appType3));
                        arrayList.add(new PirateApp("Game Killer Cheats", new String[]{"c", "o", "m", ".", "z", "u", "n", "e", ".", "g", "a", "m", "e", "k", "i", "l", "l", "e", "r"}, appType3));
                        arrayList.add(new PirateApp("AGK - App Killer", new String[]{"c", "o", "m", ".", "a", "a", "g", ".", "k", "i", "l", "l", "e", "r"}, appType3));
                        arrayList.add(new PirateApp("Game Killer", new String[]{"c", "o", "m", ".", "k", "i", "l", "l", "e", "r", "a", "p", "p", ".", "g", "a", "m", "e", "k", "i", HOBXIlHxIkMBEA.mOOCPuGLM, "l", "e", "r"}, appType3));
                        arrayList.add(new PirateApp("Game Killer", new String[]{"c", "n", ".", "l", "m", ".", "s", ualZoVVCQs.UNgaivuLKupcXeK}, appType3));
                        arrayList.add(new PirateApp("Game CheatIng Hacker", new String[]{"n", "e", "t", ".", "s", "c", "h", "w", "a", "r", "z", "i", "s", ".", "g", "a", "m", "e", "_", "c", "i", "h"}, appType3));
                        arrayList.add(new PirateApp("Game Hacker", new String[]{"c", "o", "m", ".", "b", "a", "s", "e", "a", "p", "p", "f", "u", "l", "l", ".", "f", "w", "d"}, appType3));
                        arrayList.add(new PirateApp("Content Guard Disabler", new String[]{"c", "o", "m", ".", "g", "i", "t", "h", "u", "b", ".", "o", "n", "e", "m", "i", "n", "u", "s", "o", "n", "e", ".", "d", "i", "s", "a", "b", "l", "e", "c", "o", "n", "t", "e", "n", "t", "g", "u", "a", "r", "d"}, appType3));
                        arrayList.add(new PirateApp("Content Guard Disabler", new String[]{"c", "o", "m", ".", "o", "n", shrCcjmOhAmRC.OPABNY, "m", "i", "n", "u", "s", "o", "n", "e", ".", "d", "i", "s", "a", "b", "l", "e", "c", "o", "n", "t", "e", "n", "t", "g", "u", "a", "r", "d"}, appType3));
                        AppType appType4 = AppType.STORE;
                        arrayList.add(new PirateApp("Aptoide", new String[]{"c", "m", ".", "a", "p", "t", "o", "i", "d", "e", ".", "p", "t"}, appType4));
                        arrayList.add(new PirateApp("BlackMart", new String[]{"o", "r", "g", ADSb.HjZmrLABMMcrzsV, "b", "l", "a", "c", "k", "m", "a", "r", "t", ".", "m", "a", "r", "k", "e", "t"}, appType4));
                        arrayList.add(new PirateApp("BlackMart", new String[]{"c", "o", "m", ".", "b", "l", "a", "c", "k", "m", "a", "r", "t", "a", "l", "p", "h", "a"}, appType4));
                        arrayList.add(new PirateApp("Mobogenie", new String[]{"c", "o", "m", ".", "m", gkbGsXmgaxRjJ.CESegwzsAgr, "b", "o", "g", "e", "n", "i", "e"}, appType4));
                        arrayList.add(new PirateApp("1Mobile", new String[]{"m", "e", ".", "o", "n", "e", "m", "o", "b", "i", "l", "e", ".", "a", "n", "d", "r", "o", "i", "d"}, appType4));
                        arrayList.add(new PirateApp("GetApk", new String[]{"c", "o", "m", ".", "r", "e", "p", "o", "d", "r", "o", "i", "d", ".", "a", "p", "p"}, appType4));
                        arrayList.add(new PirateApp("GetJar", new String[]{"c", "o", "m", ".", "g", "e", "t", "j", "a", "r", ".", "r", "e", "w", "a", "r", "d", "s"}, appType4));
                        arrayList.add(new PirateApp("SlideMe", new String[]{"c", "o", "m", ".", "s", "l", "i", "d", "e", "m", "e", ".", "s", "a", "m", ".", "m", "a", "n", "a", "g", "e", "r"}, appType4));
                        arrayList.add(new PirateApp("ACMarket", new String[]{"n", "e", "t", ".", "a", "p", "p", "c", "a", "k", "e"}, appType4));
                        arrayList.add(new PirateApp("ACMarket", new String[]{scqhIrGXy.IeuKIaDYtBQ, "c", ".", "m", "a", "r", "k", "e", "t", ".", "s", "t", "o", "r", "e"}, appType4));
                        arrayList.add(new PirateApp("AppCake", new String[]{"c", "o", "m", ".", "a", "p", "p", "c", "a", "k", "e"}, appType4));
                        arrayList.add(new PirateApp("Z Market", new String[]{"c", "o", "m", ".", "z", "m", "a", "p", "p"}, appType4));
                        arrayList.add(new PirateApp("Modded Play Store", new String[]{"c", "o", "m", ".", "d", "v", ".", "m", "a", "r", "k", "e", "t", "m", "o", "d", ".", "i", "n", "s", "t", "a", "l", "l", "e", "r"}, appType4));
                        arrayList.add(new PirateApp("Mobilism Market", new String[]{"o", "r", "g", ".", "m", "o", "b", "i", "l", "i", "s", evRpcb.YQlmBkbdFT, ".", "a", "n", "d", "r", "o", "i", "d"}, appType4));
                        arrayList.add(new PirateApp("All-in-one Downloader", new String[]{"c", "o", "m", ".", "a", "l", "l", "i", "n", "o", "n", "e", ".", "f", "r", "e", MzwEyWCkjXL.UiHszvYDkFzXFmO}, appType4));
                        arrayList.addAll(extraApps);
                        hashSet = new HashSet();
                        arrayList2 = new ArrayList();
                        size = arrayList.size();
                        i11 = 0;
                        while (i11 < size) {
                            obj = arrayList.get(i11);
                            i11++;
                            if (hashSet.add(((PirateApp) obj).a())) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList3 = new ArrayList(arrayList2);
                        packageManager = context.getPackageManager();
                        if (packageManager != null) {
                            installedApplications = packageManager.getInstalledApplications(128);
                        } else {
                            installedApplications = null;
                        }
                        size2 = arrayList3.size();
                        z11 = false;
                        i12 = 0;
                        do {
                            if (i12 < size2) {
                                pirateApp = null;
                                break;
                            }
                            Object obj4 = arrayList3.get(i12);
                            i12++;
                            pirateApp = (PirateApp) obj4;
                            if (pirateApp.f7773b == AppType.OTHER) {
                                if (installedApplications == null) {
                                    z11 = false;
                                    break;
                                } else {
                                    z11 = false;
                                    break;
                                }
                                if (!z11) {
                                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(pirateApp.a());
                                    if (launchIntentForPackage != null) {
                                        listQueryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 65536);
                                        if (listQueryIntentActivities != null) {
                                            listQueryIntentActivities = ry.r.f50854a;
                                        }
                                        z11 = !listQueryIntentActivities.isEmpty();
                                    } else {
                                        z11 = false;
                                    }
                                }
                            }
                        } while (!z11);
                        if (pirateApp != null) {
                            if (pirateApp.f7773b == AppType.STORE) {
                                piracyCheckerError = PiracyCheckerError.THIRD_PARTY_STORE_INSTALLED;
                            } else {
                                piracyCheckerError = PiracyCheckerError.PIRATE_APP_INSTALLED;
                            }
                            piracyChecker$callback$2.a(piracyCheckerError, pirateApp);
                        }
                    }
                }
                PiracyChecker$callback$2 piracyChecker$callback$3 = piracyChecker.f7760j;
                if (piracyChecker$callback$3 != null) {
                    piracyChecker$callback$3.a(PiracyCheckerError.INVALID_INSTALLER_ID, null);
                }
            }
        } else {
            PiracyChecker$callback$2 piracyChecker$callback$4 = piracyChecker.f7760j;
            if (piracyChecker$callback$4 != null) {
                piracyChecker$callback$4.a(PiracyCheckerError.SIGNATURE_NOT_VALID, null);
            }
        }
        D();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        RelativeLayout rootParent = ((x3) aVar).f33579l;
        kotlin.jvm.internal.m.e(rootParent, "rootParent");
        int i15 = r().themeStyle;
        if ((rootParent.getResources().getConfiguration().uiMode & 48) == 16) {
            if (i15 == 0) {
                rootParent.setBackgroundResource(R.color.color_F6F6F6);
            } else if (i15 == 1) {
                rootParent.setBackgroundResource(R.color.color_F7F0E0);
            } else if (i15 == 2) {
                rootParent.setBackgroundResource(R.color.color_CBF0CF);
            }
        }
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        bq.z.b(((x3) aVar2).f33572e, new j9.a0(12));
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
        this.V = new th.e(contextRequireContext2);
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        this.Y = new dm.c(mVar, r());
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((x3) aVar3).f33575h.f32794c.setVisibility(0);
        O(3);
        P();
        if (this.Q) {
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((GameLife) ((x3) aVar4).f33575h.f32797f).setVisibility(0);
            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_WRONG_COUNT)) {
                int i16 = bundle.getInt(INTENTS.EXTRA_WRONG_COUNT);
                for (int i17 = 0; i17 < i16; i17++) {
                    ta.a aVar5 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar5);
                    ((GameLife) ((x3) aVar5).f33575h.f32797f).a();
                }
            }
        } else {
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ((GameLife) ((x3) aVar6).f33575h.f32797f).setVisibility(8);
        }
        if (bundle != null && bundle.containsKey(INTENTS.EXTRA_IS_SHOW_THEME) && bundle.getBoolean(INTENTS.EXTRA_IS_SHOW_THEME)) {
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((ImageView) ((x3) aVar7).f33575h.f32798g).performClick();
        }
        if (r().hasClickedSettings) {
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            ((x3) aVar8).f33575h.f32794c.setImageResource(R.drawable.ic_lesson_test_setting_ls);
        } else {
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            ((x3) aVar9).f33575h.f32794c.setImageResource(R.drawable.ic_lesson_test_setting_ls_accent);
        }
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        bq.z.b(((x3) aVar10).f33575h.f32794c, new j0(this, 6));
        ta.a aVar11 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar11);
        ((ImageView) ((x3) aVar11).f33575h.f32798g).setVisibility(8);
        if (this.S != -1) {
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new n0(this, dVar, i13), 3);
        }
        ii.a aVar12 = this.N;
        kotlin.jvm.internal.m.c(aVar12);
        ((mp.a) aVar12).p(bundle);
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        ((x3) aVar13).f33575h.f32793b.setOnClickListener(new aj.b(this, 11));
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().locateLanguage == 51) {
            ta.a aVar14 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar14);
            ((x3) aVar14).f33577j.setLayoutDirection(0);
        } else {
            ta.a aVar15 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar15);
            ((x3) aVar15).f33577j.setLayoutDirection(0);
        }
    }
}
