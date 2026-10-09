package qp;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.tbruyelle.rxpermissions3.RxPermissions;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Sentence f48030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f48031l;
    public h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f48032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f48033o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f48034p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public bq.f f48035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ij.d f48036r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f48037s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public rx.b f48038t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f48039u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f48040v;

    public l1(mp.b bVar, long j11) {
        super(bVar, j11, 0);
        this.f48031l = -1;
        this.f48033o = ff.h.l(2.0f);
        this.f48037s = BuildConfig.VERSION_NAME;
        this.f48039u = fv.b.G(j11, null, null);
        this.f48040v = 1;
    }

    public static boolean u(FrameLayout frameLayout, String str) {
        if (com.google.android.material.datepicker.d.D(str)) {
            frameLayout.setClickable(true);
            frameLayout.setBackgroundResource(R.drawable.bg_speak_btn_enable);
        } else {
            frameLayout.setClickable(false);
            frameLayout.setBackgroundResource(R.drawable.point_grey);
        }
        return com.google.android.material.datepicker.d.D(str);
    }

    @Override // hi.a
    public final String b() {
        return this.f48039u;
    }

    @Override // qp.a, qp.d, hi.a
    public final void f() {
        super.f();
        h hVar = this.m;
        if (hVar != null) {
            hVar.b();
        }
        z();
        bq.f fVar = this.f48035q;
        if (fVar != null) {
            fVar.t();
        }
        rx.b bVar = this.f48038t;
        if (bVar != null) {
            bVar.dispose();
        }
        ij.d dVar = this.f48036r;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        long j11 = this.f47882b;
        arrayList.add(new fv.a(2L, fv.b.H(j11), fv.b.F(j11)));
        Sentence sentence = this.f48030k;
        if (sentence == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        for (Word word : sentence.getSentWords()) {
            if (word.getWordType() != 1) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if ((cf.x.n().keyLanguage != 5 && cf.x.n().keyLanguage != 15) || (word.getWordId() != 1858 && word.getWordId() != 544)) {
                    qy.q qVar2 = fv.b.f28186a;
                    arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
                }
            }
        }
        return arrayList;
    }

    @Override // hi.a
    public final int i() {
        return this.f48040v;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        Sentence sentenceE = ij.c.e(this.f47882b);
        if (sentenceE == null) {
            throw new NoSuchElemException();
        }
        this.f48030k = sentenceE;
    }

    @Override // hi.a
    public final void k() {
        h hVar = this.m;
        if (hVar != null) {
            hVar.e();
        } else {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return k1.f48007a;
    }

    @Override // qp.d
    public final void p() {
        final int i11 = 0;
        this.f48034p = false;
        Sentence sentence = this.f48030k;
        if (sentence == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = sentence.getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        this.f48032n = sentWords;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((hj.z1) aVar).f33647d;
        Sentence sentence2 = this.f48030k;
        if (sentence2 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String dirCode = sentence2.getDirCode();
        mp.b bVar = this.f47881a;
        bVar.getClass();
        this.m = new h(this.f47883c, sentWords, flexboxLayout, this, dirCode);
        int[] iArr = bq.r.f4959a;
        boolean zF = bq.m.F();
        final int i12 = 2;
        final int i13 = 1;
        int i14 = this.f48033o;
        if (zF) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if ((cf.x.n().keyLanguage == 1 || cf.x.n().keyLanguage == 12) && cf.x.n().jsDisPlay == 2) {
                h hVar = this.m;
                if (hVar == null) {
                    kotlin.jvm.internal.m.n("sentenceLayout");
                    throw null;
                }
                hVar.f59274j = i14;
            } else {
                h hVar2 = this.m;
                if (hVar2 == null) {
                    kotlin.jvm.internal.m.n("sentenceLayout");
                    throw null;
                }
                hVar2.f59274j = 2;
            }
        } else {
            h hVar3 = this.m;
            if (hVar3 == null) {
                kotlin.jvm.internal.m.n("sentenceLayout");
                throw null;
            }
            hVar3.f59274j = i14;
        }
        h hVar4 = this.m;
        if (hVar4 == null) {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
        hVar4.f59278o = false;
        hVar4.m = new lp.j(this, 15);
        hVar4.d();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        bq.z.b(((hj.z1) aVar2).f33648e, new fz.c(this) { // from class: qp.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f47973b;

            {
                this.f47973b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                l1 l1Var = this.f47973b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.v() : !l1Var.w()) {
                            h hVar5 = l1Var.m;
                            if (hVar5 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow = hVar5.f59275k;
                            if (popupWindow != null && popupWindow.isShowing()) {
                                h hVar6 = l1Var.m;
                                if (hVar6 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow2 = hVar6.f59275k;
                                if (popupWindow2 != null) {
                                    popupWindow2.dismiss();
                                }
                            }
                            ta.a aVar3 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar3);
                            ((hj.z1) aVar3).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.w() : !l1Var.v()) {
                            h hVar7 = l1Var.m;
                            if (hVar7 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow3 = hVar7.f59275k;
                            if (popupWindow3 != null && popupWindow3.isShowing()) {
                                h hVar8 = l1Var.m;
                                if (hVar8 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow4 = hVar8.f59275k;
                                if (popupWindow4 != null) {
                                    popupWindow4.dismiss();
                                }
                            }
                            ta.a aVar4 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar4);
                            ((hj.z1) aVar4).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        ta.a aVar5 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar5);
                        ((hj.z1) aVar5).f33654k.c();
                        ta.a aVar6 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar6);
                        if (((hj.z1) aVar6).f33654k.f22150c) {
                            ta.a aVar7 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar7);
                            ((ImageView) ((hj.z1) aVar7).f33650g.f32409e).setVisibility(0);
                        } else {
                            ta.a aVar8 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar8);
                            ((ImageView) ((hj.z1) aVar8).f33650g.f32409e).setVisibility(8);
                        }
                        h hVar9 = l1Var.m;
                        if (hVar9 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow5 = hVar9.f59275k;
                        if (popupWindow5 != null && popupWindow5.isShowing()) {
                            h hVar10 = l1Var.m;
                            if (hVar10 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow6 = hVar10.f59275k;
                            if (popupWindow6 != null) {
                                popupWindow6.dismiss();
                            }
                        }
                        ta.a aVar9 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar9);
                        ((ImageView) ((hj.z1) aVar9).f33650g.f32408d).performClick();
                        return b0Var;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        h hVar11 = l1Var.m;
                        if (hVar11 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow7 = hVar11.f59275k;
                        if (popupWindow7 == null || !popupWindow7.isShowing()) {
                            ta.a aVar10 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar10);
                            ((ImageView) ((hj.z1) aVar10).f33650g.f32408d).performClick();
                        } else {
                            h hVar12 = l1Var.m;
                            if (hVar12 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow8 = hVar12.f59275k;
                            if (popupWindow8 != null) {
                                popupWindow8.dismiss();
                            }
                        }
                        return b0Var;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        jp.p0 p0Var = (jp.p0) l1Var.f47881a;
                        th.e eVar = p0Var.V;
                        if (eVar != null) {
                            eVar.n();
                        }
                        ta.a aVar11 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar11);
                        android.support.v4.media.session.a.H(((ImageView) ((hj.z1) aVar11).f33650g.f32408d).getBackground());
                        o20.w wVar = new o20.w(l1Var, 11);
                        RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) p0Var.C());
                        Context contextC = p0Var.C();
                        rxPermissions.setLogging(true);
                        if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                            wVar.m();
                        } else {
                            rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(wVar, contextC, rxPermissions, 17), vx.b.f54316e);
                        }
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        l1Var.x();
                        th.e eVar2 = ((jp.p0) l1Var.f47881a).V;
                        if (eVar2 != null) {
                            eVar2.h(l1Var.f48037s);
                        }
                        ta.a aVar12 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar12);
                        ((hj.z1) aVar12).f33645b.setBackgroundResource(R.drawable.point_accent);
                        ta.a aVar13 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar13);
                        android.support.v4.media.session.a.K(((hj.z1) aVar13).f33651h.getBackground());
                        ta.a aVar14 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar14);
                        ((hj.z1) aVar14).f33652i.setVisibility(0);
                        ij.d dVar = l1Var.f48036r;
                        if (dVar != null) {
                            dVar.d();
                        }
                        ij.d dVar2 = new ij.d(23);
                        ta.a aVar15 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar15);
                        dVar2.f34423d = ((hj.z1) aVar15).f33652i;
                        dVar2.f34421b = 2000;
                        dVar2.E();
                        l1Var.f48036r = dVar2;
                        int[] iArr2 = bq.r.f4959a;
                        long jB = bq.m.B(l1Var.f48037s);
                        rx.b bVar2 = l1Var.f48038t;
                        if (bVar2 != null) {
                            bVar2.dispose();
                        }
                        l1Var.f48038t = qx.h.m(jB, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(l1Var, 18), c.M);
                        return b0Var;
                }
            }
        });
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        bq.z.b(((hj.z1) aVar3).f33649f, new fz.c(this) { // from class: qp.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f47973b;

            {
                this.f47973b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i13;
                qy.b0 b0Var = qy.b0.f48488a;
                l1 l1Var = this.f47973b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.v() : !l1Var.w()) {
                            h hVar5 = l1Var.m;
                            if (hVar5 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow = hVar5.f59275k;
                            if (popupWindow != null && popupWindow.isShowing()) {
                                h hVar6 = l1Var.m;
                                if (hVar6 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow2 = hVar6.f59275k;
                                if (popupWindow2 != null) {
                                    popupWindow2.dismiss();
                                }
                            }
                            ta.a aVar4 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar4);
                            ((hj.z1) aVar4).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.w() : !l1Var.v()) {
                            h hVar7 = l1Var.m;
                            if (hVar7 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow3 = hVar7.f59275k;
                            if (popupWindow3 != null && popupWindow3.isShowing()) {
                                h hVar8 = l1Var.m;
                                if (hVar8 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow4 = hVar8.f59275k;
                                if (popupWindow4 != null) {
                                    popupWindow4.dismiss();
                                }
                            }
                            ta.a aVar5 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar5);
                            ((hj.z1) aVar5).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        ta.a aVar6 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar6);
                        ((hj.z1) aVar6).f33654k.c();
                        ta.a aVar7 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar7);
                        if (((hj.z1) aVar7).f33654k.f22150c) {
                            ta.a aVar8 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar8);
                            ((ImageView) ((hj.z1) aVar8).f33650g.f32409e).setVisibility(0);
                        } else {
                            ta.a aVar9 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar9);
                            ((ImageView) ((hj.z1) aVar9).f33650g.f32409e).setVisibility(8);
                        }
                        h hVar9 = l1Var.m;
                        if (hVar9 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow5 = hVar9.f59275k;
                        if (popupWindow5 != null && popupWindow5.isShowing()) {
                            h hVar10 = l1Var.m;
                            if (hVar10 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow6 = hVar10.f59275k;
                            if (popupWindow6 != null) {
                                popupWindow6.dismiss();
                            }
                        }
                        ta.a aVar10 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar10);
                        ((ImageView) ((hj.z1) aVar10).f33650g.f32408d).performClick();
                        return b0Var;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        h hVar11 = l1Var.m;
                        if (hVar11 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow7 = hVar11.f59275k;
                        if (popupWindow7 == null || !popupWindow7.isShowing()) {
                            ta.a aVar11 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar11);
                            ((ImageView) ((hj.z1) aVar11).f33650g.f32408d).performClick();
                        } else {
                            h hVar12 = l1Var.m;
                            if (hVar12 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow8 = hVar12.f59275k;
                            if (popupWindow8 != null) {
                                popupWindow8.dismiss();
                            }
                        }
                        return b0Var;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        jp.p0 p0Var = (jp.p0) l1Var.f47881a;
                        th.e eVar = p0Var.V;
                        if (eVar != null) {
                            eVar.n();
                        }
                        ta.a aVar12 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar12);
                        android.support.v4.media.session.a.H(((ImageView) ((hj.z1) aVar12).f33650g.f32408d).getBackground());
                        o20.w wVar = new o20.w(l1Var, 11);
                        RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) p0Var.C());
                        Context contextC = p0Var.C();
                        rxPermissions.setLogging(true);
                        if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                            wVar.m();
                        } else {
                            rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(wVar, contextC, rxPermissions, 17), vx.b.f54316e);
                        }
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        l1Var.x();
                        th.e eVar2 = ((jp.p0) l1Var.f47881a).V;
                        if (eVar2 != null) {
                            eVar2.h(l1Var.f48037s);
                        }
                        ta.a aVar13 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar13);
                        ((hj.z1) aVar13).f33645b.setBackgroundResource(R.drawable.point_accent);
                        ta.a aVar14 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar14);
                        android.support.v4.media.session.a.K(((hj.z1) aVar14).f33651h.getBackground());
                        ta.a aVar15 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar15);
                        ((hj.z1) aVar15).f33652i.setVisibility(0);
                        ij.d dVar = l1Var.f48036r;
                        if (dVar != null) {
                            dVar.d();
                        }
                        ij.d dVar2 = new ij.d(23);
                        ta.a aVar16 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar16);
                        dVar2.f34423d = ((hj.z1) aVar16).f33652i;
                        dVar2.f34421b = 2000;
                        dVar2.E();
                        l1Var.f48036r = dVar2;
                        int[] iArr2 = bq.r.f4959a;
                        long jB = bq.m.B(l1Var.f48037s);
                        rx.b bVar2 = l1Var.f48038t;
                        if (bVar2 != null) {
                            bVar2.dispose();
                        }
                        l1Var.f48038t = qx.h.m(jB, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(l1Var, 18), c.M);
                        return b0Var;
                }
            }
        });
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        bq.z.b((ImageView) ((hj.z1) aVar4).f33650g.f32408d, new n0.w0(22, this, this.f48039u));
        ((jp.p0) bVar).O(1);
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((hj.z1) aVar5).f33648e.setVisibility(8);
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((hj.z1) aVar6).f33649f.setVisibility(8);
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        final int i15 = 4;
        ((hj.z1) aVar7).f33654k.setVisibility(4);
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        TextView textView = ((hj.z1) aVar8).m;
        Sentence sentence3 = this.f48030k;
        if (sentence3 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        textView.setText(sentence3.getTranslations());
        ta.a aVar9 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar9);
        bq.z.b(((hj.z1) aVar9).f33654k, new fz.c(this) { // from class: qp.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f47973b;

            {
                this.f47973b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i16 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                l1 l1Var = this.f47973b;
                View it = (View) obj;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.v() : !l1Var.w()) {
                            h hVar5 = l1Var.m;
                            if (hVar5 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow = hVar5.f59275k;
                            if (popupWindow != null && popupWindow.isShowing()) {
                                h hVar6 = l1Var.m;
                                if (hVar6 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow2 = hVar6.f59275k;
                                if (popupWindow2 != null) {
                                    popupWindow2.dismiss();
                                }
                            }
                            ta.a aVar10 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar10);
                            ((hj.z1) aVar10).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.w() : !l1Var.v()) {
                            h hVar7 = l1Var.m;
                            if (hVar7 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow3 = hVar7.f59275k;
                            if (popupWindow3 != null && popupWindow3.isShowing()) {
                                h hVar8 = l1Var.m;
                                if (hVar8 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow4 = hVar8.f59275k;
                                if (popupWindow4 != null) {
                                    popupWindow4.dismiss();
                                }
                            }
                            ta.a aVar11 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar11);
                            ((hj.z1) aVar11).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        ta.a aVar12 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar12);
                        ((hj.z1) aVar12).f33654k.c();
                        ta.a aVar13 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar13);
                        if (((hj.z1) aVar13).f33654k.f22150c) {
                            ta.a aVar14 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar14);
                            ((ImageView) ((hj.z1) aVar14).f33650g.f32409e).setVisibility(0);
                        } else {
                            ta.a aVar15 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar15);
                            ((ImageView) ((hj.z1) aVar15).f33650g.f32409e).setVisibility(8);
                        }
                        h hVar9 = l1Var.m;
                        if (hVar9 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow5 = hVar9.f59275k;
                        if (popupWindow5 != null && popupWindow5.isShowing()) {
                            h hVar10 = l1Var.m;
                            if (hVar10 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow6 = hVar10.f59275k;
                            if (popupWindow6 != null) {
                                popupWindow6.dismiss();
                            }
                        }
                        ta.a aVar16 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar16);
                        ((ImageView) ((hj.z1) aVar16).f33650g.f32408d).performClick();
                        return b0Var;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        h hVar11 = l1Var.m;
                        if (hVar11 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow7 = hVar11.f59275k;
                        if (popupWindow7 == null || !popupWindow7.isShowing()) {
                            ta.a aVar17 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar17);
                            ((ImageView) ((hj.z1) aVar17).f33650g.f32408d).performClick();
                        } else {
                            h hVar12 = l1Var.m;
                            if (hVar12 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow8 = hVar12.f59275k;
                            if (popupWindow8 != null) {
                                popupWindow8.dismiss();
                            }
                        }
                        return b0Var;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        jp.p0 p0Var = (jp.p0) l1Var.f47881a;
                        th.e eVar = p0Var.V;
                        if (eVar != null) {
                            eVar.n();
                        }
                        ta.a aVar18 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar18);
                        android.support.v4.media.session.a.H(((ImageView) ((hj.z1) aVar18).f33650g.f32408d).getBackground());
                        o20.w wVar = new o20.w(l1Var, 11);
                        RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) p0Var.C());
                        Context contextC = p0Var.C();
                        rxPermissions.setLogging(true);
                        if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                            wVar.m();
                        } else {
                            rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(wVar, contextC, rxPermissions, 17), vx.b.f54316e);
                        }
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        l1Var.x();
                        th.e eVar2 = ((jp.p0) l1Var.f47881a).V;
                        if (eVar2 != null) {
                            eVar2.h(l1Var.f48037s);
                        }
                        ta.a aVar19 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar19);
                        ((hj.z1) aVar19).f33645b.setBackgroundResource(R.drawable.point_accent);
                        ta.a aVar110 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar110);
                        android.support.v4.media.session.a.K(((hj.z1) aVar110).f33651h.getBackground());
                        ta.a aVar111 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar111);
                        ((hj.z1) aVar111).f33652i.setVisibility(0);
                        ij.d dVar = l1Var.f48036r;
                        if (dVar != null) {
                            dVar.d();
                        }
                        ij.d dVar2 = new ij.d(23);
                        ta.a aVar112 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar112);
                        dVar2.f34423d = ((hj.z1) aVar112).f33652i;
                        dVar2.f34421b = 2000;
                        dVar2.E();
                        l1Var.f48036r = dVar2;
                        int[] iArr2 = bq.r.f4959a;
                        long jB = bq.m.B(l1Var.f48037s);
                        rx.b bVar2 = l1Var.f48038t;
                        if (bVar2 != null) {
                            bVar2.dispose();
                        }
                        l1Var.f48038t = qx.h.m(jB, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(l1Var, 18), c.M);
                        return b0Var;
                }
            }
        });
        ta.a aVar10 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar10);
        LinearLayout rootParent = ((hj.z1) aVar10).f33653j;
        kotlin.jvm.internal.m.e(rootParent, "rootParent");
        final int i16 = 3;
        bq.z.b(rootParent, new fz.c(this) { // from class: qp.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f47973b;

            {
                this.f47973b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i17 = i16;
                qy.b0 b0Var = qy.b0.f48488a;
                l1 l1Var = this.f47973b;
                View it = (View) obj;
                switch (i17) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.v() : !l1Var.w()) {
                            h hVar5 = l1Var.m;
                            if (hVar5 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow = hVar5.f59275k;
                            if (popupWindow != null && popupWindow.isShowing()) {
                                h hVar6 = l1Var.m;
                                if (hVar6 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow2 = hVar6.f59275k;
                                if (popupWindow2 != null) {
                                    popupWindow2.dismiss();
                                }
                            }
                            ta.a aVar11 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar11);
                            ((hj.z1) aVar11).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.w() : !l1Var.v()) {
                            h hVar7 = l1Var.m;
                            if (hVar7 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow3 = hVar7.f59275k;
                            if (popupWindow3 != null && popupWindow3.isShowing()) {
                                h hVar8 = l1Var.m;
                                if (hVar8 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow4 = hVar8.f59275k;
                                if (popupWindow4 != null) {
                                    popupWindow4.dismiss();
                                }
                            }
                            ta.a aVar12 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar12);
                            ((hj.z1) aVar12).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        ta.a aVar13 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar13);
                        ((hj.z1) aVar13).f33654k.c();
                        ta.a aVar14 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar14);
                        if (((hj.z1) aVar14).f33654k.f22150c) {
                            ta.a aVar15 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar15);
                            ((ImageView) ((hj.z1) aVar15).f33650g.f32409e).setVisibility(0);
                        } else {
                            ta.a aVar16 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar16);
                            ((ImageView) ((hj.z1) aVar16).f33650g.f32409e).setVisibility(8);
                        }
                        h hVar9 = l1Var.m;
                        if (hVar9 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow5 = hVar9.f59275k;
                        if (popupWindow5 != null && popupWindow5.isShowing()) {
                            h hVar10 = l1Var.m;
                            if (hVar10 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow6 = hVar10.f59275k;
                            if (popupWindow6 != null) {
                                popupWindow6.dismiss();
                            }
                        }
                        ta.a aVar17 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar17);
                        ((ImageView) ((hj.z1) aVar17).f33650g.f32408d).performClick();
                        return b0Var;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        h hVar11 = l1Var.m;
                        if (hVar11 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow7 = hVar11.f59275k;
                        if (popupWindow7 == null || !popupWindow7.isShowing()) {
                            ta.a aVar18 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar18);
                            ((ImageView) ((hj.z1) aVar18).f33650g.f32408d).performClick();
                        } else {
                            h hVar12 = l1Var.m;
                            if (hVar12 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow8 = hVar12.f59275k;
                            if (popupWindow8 != null) {
                                popupWindow8.dismiss();
                            }
                        }
                        return b0Var;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        jp.p0 p0Var = (jp.p0) l1Var.f47881a;
                        th.e eVar = p0Var.V;
                        if (eVar != null) {
                            eVar.n();
                        }
                        ta.a aVar19 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar19);
                        android.support.v4.media.session.a.H(((ImageView) ((hj.z1) aVar19).f33650g.f32408d).getBackground());
                        o20.w wVar = new o20.w(l1Var, 11);
                        RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) p0Var.C());
                        Context contextC = p0Var.C();
                        rxPermissions.setLogging(true);
                        if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                            wVar.m();
                        } else {
                            rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(wVar, contextC, rxPermissions, 17), vx.b.f54316e);
                        }
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        l1Var.x();
                        th.e eVar2 = ((jp.p0) l1Var.f47881a).V;
                        if (eVar2 != null) {
                            eVar2.h(l1Var.f48037s);
                        }
                        ta.a aVar110 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar110);
                        ((hj.z1) aVar110).f33645b.setBackgroundResource(R.drawable.point_accent);
                        ta.a aVar111 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar111);
                        android.support.v4.media.session.a.K(((hj.z1) aVar111).f33651h.getBackground());
                        ta.a aVar112 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar112);
                        ((hj.z1) aVar112).f33652i.setVisibility(0);
                        ij.d dVar = l1Var.f48036r;
                        if (dVar != null) {
                            dVar.d();
                        }
                        ij.d dVar2 = new ij.d(23);
                        ta.a aVar113 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar113);
                        dVar2.f34423d = ((hj.z1) aVar113).f33652i;
                        dVar2.f34421b = 2000;
                        dVar2.E();
                        l1Var.f48036r = dVar2;
                        int[] iArr2 = bq.r.f4959a;
                        long jB = bq.m.B(l1Var.f48037s);
                        rx.b bVar2 = l1Var.f48038t;
                        if (bVar2 != null) {
                            bVar2.dispose();
                        }
                        l1Var.f48038t = qx.h.m(jB, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(l1Var, 18), c.M);
                        return b0Var;
                }
            }
        });
        ef.e.B(o());
        this.f48035q = new bq.f(0, false);
        this.f48037s = defpackage.e.m(this.f47884d.tempDir, "recorder_temp.mp3");
        if (new File(this.f48037s).exists()) {
            new File(this.f48037s).delete();
        }
        ta.a aVar11 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar11);
        bq.z.b(((hj.z1) aVar11).f33646c, new fz.c(this) { // from class: qp.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f47973b;

            {
                this.f47973b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i17 = i15;
                qy.b0 b0Var = qy.b0.f48488a;
                l1 l1Var = this.f47973b;
                View it = (View) obj;
                switch (i17) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.v() : !l1Var.w()) {
                            h hVar5 = l1Var.m;
                            if (hVar5 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow = hVar5.f59275k;
                            if (popupWindow != null && popupWindow.isShowing()) {
                                h hVar6 = l1Var.m;
                                if (hVar6 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow2 = hVar6.f59275k;
                                if (popupWindow2 != null) {
                                    popupWindow2.dismiss();
                                }
                            }
                            ta.a aVar12 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar12);
                            ((hj.z1) aVar12).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.w() : !l1Var.v()) {
                            h hVar7 = l1Var.m;
                            if (hVar7 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow3 = hVar7.f59275k;
                            if (popupWindow3 != null && popupWindow3.isShowing()) {
                                h hVar8 = l1Var.m;
                                if (hVar8 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow4 = hVar8.f59275k;
                                if (popupWindow4 != null) {
                                    popupWindow4.dismiss();
                                }
                            }
                            ta.a aVar13 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar13);
                            ((hj.z1) aVar13).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        ta.a aVar14 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar14);
                        ((hj.z1) aVar14).f33654k.c();
                        ta.a aVar15 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar15);
                        if (((hj.z1) aVar15).f33654k.f22150c) {
                            ta.a aVar16 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar16);
                            ((ImageView) ((hj.z1) aVar16).f33650g.f32409e).setVisibility(0);
                        } else {
                            ta.a aVar17 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar17);
                            ((ImageView) ((hj.z1) aVar17).f33650g.f32409e).setVisibility(8);
                        }
                        h hVar9 = l1Var.m;
                        if (hVar9 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow5 = hVar9.f59275k;
                        if (popupWindow5 != null && popupWindow5.isShowing()) {
                            h hVar10 = l1Var.m;
                            if (hVar10 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow6 = hVar10.f59275k;
                            if (popupWindow6 != null) {
                                popupWindow6.dismiss();
                            }
                        }
                        ta.a aVar18 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar18);
                        ((ImageView) ((hj.z1) aVar18).f33650g.f32408d).performClick();
                        return b0Var;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        h hVar11 = l1Var.m;
                        if (hVar11 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow7 = hVar11.f59275k;
                        if (popupWindow7 == null || !popupWindow7.isShowing()) {
                            ta.a aVar19 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar19);
                            ((ImageView) ((hj.z1) aVar19).f33650g.f32408d).performClick();
                        } else {
                            h hVar12 = l1Var.m;
                            if (hVar12 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow8 = hVar12.f59275k;
                            if (popupWindow8 != null) {
                                popupWindow8.dismiss();
                            }
                        }
                        return b0Var;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        jp.p0 p0Var = (jp.p0) l1Var.f47881a;
                        th.e eVar = p0Var.V;
                        if (eVar != null) {
                            eVar.n();
                        }
                        ta.a aVar110 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar110);
                        android.support.v4.media.session.a.H(((ImageView) ((hj.z1) aVar110).f33650g.f32408d).getBackground());
                        o20.w wVar = new o20.w(l1Var, 11);
                        RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) p0Var.C());
                        Context contextC = p0Var.C();
                        rxPermissions.setLogging(true);
                        if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                            wVar.m();
                        } else {
                            rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(wVar, contextC, rxPermissions, 17), vx.b.f54316e);
                        }
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        l1Var.x();
                        th.e eVar2 = ((jp.p0) l1Var.f47881a).V;
                        if (eVar2 != null) {
                            eVar2.h(l1Var.f48037s);
                        }
                        ta.a aVar111 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar111);
                        ((hj.z1) aVar111).f33645b.setBackgroundResource(R.drawable.point_accent);
                        ta.a aVar112 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar112);
                        android.support.v4.media.session.a.K(((hj.z1) aVar112).f33651h.getBackground());
                        ta.a aVar113 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar113);
                        ((hj.z1) aVar113).f33652i.setVisibility(0);
                        ij.d dVar = l1Var.f48036r;
                        if (dVar != null) {
                            dVar.d();
                        }
                        ij.d dVar2 = new ij.d(23);
                        ta.a aVar114 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar114);
                        dVar2.f34423d = ((hj.z1) aVar114).f33652i;
                        dVar2.f34421b = 2000;
                        dVar2.E();
                        l1Var.f48036r = dVar2;
                        int[] iArr2 = bq.r.f4959a;
                        long jB = bq.m.B(l1Var.f48037s);
                        rx.b bVar2 = l1Var.f48038t;
                        if (bVar2 != null) {
                            bVar2.dispose();
                        }
                        l1Var.f48038t = qx.h.m(jB, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(l1Var, 18), c.M);
                        return b0Var;
                }
            }
        });
        ta.a aVar12 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar12);
        final int i17 = 5;
        bq.z.b(((hj.z1) aVar12).f33645b, new fz.c(this) { // from class: qp.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f47973b;

            {
                this.f47973b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i18 = i17;
                qy.b0 b0Var = qy.b0.f48488a;
                l1 l1Var = this.f47973b;
                View it = (View) obj;
                switch (i18) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.v() : !l1Var.w()) {
                            h hVar5 = l1Var.m;
                            if (hVar5 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow = hVar5.f59275k;
                            if (popupWindow != null && popupWindow.isShowing()) {
                                h hVar6 = l1Var.m;
                                if (hVar6 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow2 = hVar6.f59275k;
                                if (popupWindow2 != null) {
                                    popupWindow2.dismiss();
                                }
                            }
                            ta.a aVar13 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar13);
                            ((hj.z1) aVar13).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) ? !l1Var.w() : !l1Var.v()) {
                            h hVar7 = l1Var.m;
                            if (hVar7 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow3 = hVar7.f59275k;
                            if (popupWindow3 != null && popupWindow3.isShowing()) {
                                h hVar8 = l1Var.m;
                                if (hVar8 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow4 = hVar8.f59275k;
                                if (popupWindow4 != null) {
                                    popupWindow4.dismiss();
                                }
                            }
                            ta.a aVar14 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar14);
                            ((hj.z1) aVar14).f33647d.getChildAt(l1Var.f48031l).performClick();
                        }
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        ta.a aVar15 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar15);
                        ((hj.z1) aVar15).f33654k.c();
                        ta.a aVar16 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar16);
                        if (((hj.z1) aVar16).f33654k.f22150c) {
                            ta.a aVar17 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar17);
                            ((ImageView) ((hj.z1) aVar17).f33650g.f32409e).setVisibility(0);
                        } else {
                            ta.a aVar18 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar18);
                            ((ImageView) ((hj.z1) aVar18).f33650g.f32409e).setVisibility(8);
                        }
                        h hVar9 = l1Var.m;
                        if (hVar9 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow5 = hVar9.f59275k;
                        if (popupWindow5 != null && popupWindow5.isShowing()) {
                            h hVar10 = l1Var.m;
                            if (hVar10 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow6 = hVar10.f59275k;
                            if (popupWindow6 != null) {
                                popupWindow6.dismiss();
                            }
                        }
                        ta.a aVar19 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar19);
                        ((ImageView) ((hj.z1) aVar19).f33650g.f32408d).performClick();
                        return b0Var;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        h hVar11 = l1Var.m;
                        if (hVar11 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow7 = hVar11.f59275k;
                        if (popupWindow7 == null || !popupWindow7.isShowing()) {
                            ta.a aVar110 = l1Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar110);
                            ((ImageView) ((hj.z1) aVar110).f33650g.f32408d).performClick();
                        } else {
                            h hVar12 = l1Var.m;
                            if (hVar12 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow8 = hVar12.f59275k;
                            if (popupWindow8 != null) {
                                popupWindow8.dismiss();
                            }
                        }
                        return b0Var;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        jp.p0 p0Var = (jp.p0) l1Var.f47881a;
                        th.e eVar = p0Var.V;
                        if (eVar != null) {
                            eVar.n();
                        }
                        ta.a aVar111 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar111);
                        android.support.v4.media.session.a.H(((ImageView) ((hj.z1) aVar111).f33650g.f32408d).getBackground());
                        o20.w wVar = new o20.w(l1Var, 11);
                        RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) p0Var.C());
                        Context contextC = p0Var.C();
                        rxPermissions.setLogging(true);
                        if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                            wVar.m();
                        } else {
                            rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(wVar, contextC, rxPermissions, 17), vx.b.f54316e);
                        }
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l1Var.z();
                        l1Var.x();
                        th.e eVar2 = ((jp.p0) l1Var.f47881a).V;
                        if (eVar2 != null) {
                            eVar2.h(l1Var.f48037s);
                        }
                        ta.a aVar112 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar112);
                        ((hj.z1) aVar112).f33645b.setBackgroundResource(R.drawable.point_accent);
                        ta.a aVar113 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar113);
                        android.support.v4.media.session.a.K(((hj.z1) aVar113).f33651h.getBackground());
                        ta.a aVar114 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar114);
                        ((hj.z1) aVar114).f33652i.setVisibility(0);
                        ij.d dVar = l1Var.f48036r;
                        if (dVar != null) {
                            dVar.d();
                        }
                        ij.d dVar2 = new ij.d(23);
                        ta.a aVar115 = l1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar115);
                        dVar2.f34423d = ((hj.z1) aVar115).f33652i;
                        dVar2.f34421b = 2000;
                        dVar2.E();
                        l1Var.f48036r = dVar2;
                        int[] iArr2 = bq.r.f4959a;
                        long jB = bq.m.B(l1Var.f48037s);
                        rx.b bVar2 = l1Var.f48038t;
                        if (bVar2 != null) {
                            bVar2.dispose();
                        }
                        l1Var.f48038t = qx.h.m(jB, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(l1Var, 18), c.M);
                        return b0Var;
                }
            }
        });
        ta.a aVar13 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar13);
        bq.z.a((ImageView) ((hj.z1) aVar13).f33650g.f32408d, 0L, new j1(this, i11));
    }

    public final boolean v() {
        ta.a aVar;
        if (this.f48031l == -1) {
            this.f48031l = 0;
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.z1) aVar2).f33647d.getChildAt(this.f48031l).performClick();
            return true;
        }
        do {
            int i11 = this.f48031l + 1;
            this.f48031l = i11;
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            if (i11 == ((hj.z1) aVar3).f33647d.getChildCount()) {
                this.f48031l = 0;
            }
            aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
        } while (((Word) hh.p0.g(((hj.z1) aVar).f33647d, this.f48031l, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getWordType() == 1);
        return false;
    }

    public final boolean w() {
        ta.a aVar;
        if (this.f48031l == -1) {
            this.f48031l = 0;
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.z1) aVar2).f33647d.getChildAt(this.f48031l).performClick();
            return true;
        }
        do {
            int i11 = this.f48031l - 1;
            this.f48031l = i11;
            if (i11 < 0) {
                ta.a aVar3 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                this.f48031l = ((hj.z1) aVar3).f33647d.getChildCount() - 1;
            }
            aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
        } while (((Word) hh.p0.g(((hj.z1) aVar).f33647d, this.f48031l, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getWordType() == 1);
        return false;
    }

    public final void x() {
        try {
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            ((hj.z1) aVar).f33646c.setBackgroundResource(R.drawable.bg_speak_btn_enable);
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.z1) aVar2).f33645b.setBackgroundResource(R.drawable.bg_speak_btn_enable);
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            ((hj.z1) aVar3).f33656n.b();
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            android.support.v4.media.session.a.H(((hj.z1) aVar4).f33651h.getBackground());
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            ((hj.z1) aVar5).f33652i.setVisibility(8);
            ij.d dVar = this.f48036r;
            if (dVar != null) {
                dVar.d();
            }
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            u(((hj.z1) aVar6).f33645b, this.f48037s);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void y() {
        if (!this.f48034p) {
            ((jp.p0) this.f47881a).O(5);
            this.f48034p = true;
        }
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.z1) aVar).f33648e.setVisibility(0);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.z1) aVar2).f33649f.setVisibility(0);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.z1) aVar3).f33654k.setVisibility(0);
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.z1) aVar4).f33655l.setVisibility(8);
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((hj.z1) aVar5).f33645b.setVisibility(0);
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((hj.z1) aVar6).f33646c.setVisibility(0);
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        ((hj.z1) aVar7).f33656n.setVisibility(0);
    }

    public final void z() {
        try {
            rx.b bVar = this.f48038t;
            if (bVar != null) {
                bVar.dispose();
            }
            th.e eVar = ((jp.p0) this.f47881a).V;
            if (eVar != null) {
                eVar.n();
            }
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            android.support.v4.media.session.a.H(((ImageView) ((hj.z1) aVar).f33650g.f32408d).getBackground());
            bq.f fVar = this.f48035q;
            if (fVar != null && fVar.f4943a) {
                fVar.t();
            }
            x();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
