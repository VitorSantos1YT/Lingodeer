package com.lingo.lingoskill.ptskill.ui.syllable;

import a9.i;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingo.lingoskill.espanskill.ui.learn.adapter.ESSyllableAdapter1;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.ptskill.ui.syllable.adapter.PTHeavyTableAdapter;
import com.lingo.lingoskill.ptskill.ui.syllable.adapter.PTNoseTableAdapter;
import com.lingo.lingoskill.ptskill.ui.syllable.adapter.PTVowelTableAdapter;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import fv.c;
import hh.p0;
import hj.e3;
import hj.r0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import ji.b;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import ry.r;
import sj.a;
import th.j;
import xn.g;
import xn.h;
import yx.d;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PTSyllableIntroductionActivity extends b {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f21987p0 = 0;
    public final String P;
    public final String Q;
    public final String R;
    public final String S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    public final String X;
    public final String Y;
    public final String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final String f21988a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final String f21989b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final String f21990c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final String f21991d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f21992e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final String f21993f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String f21994g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final String f21995h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final String f21996i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final String f21997j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final c f21998k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f21999l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final a f22000m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final i f22001n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final aj.b f22002o0;

    public PTSyllableIntroductionActivity() {
        super("AlphabetIntro", h.f56140a);
        this.P = "A a\nB b\nC c\nD d\nE e\nF f\nG g\nH h\nI i\nJ j\nK k\nL l\nM m\nN n\nO o\nP p\nQ q\nR r\nS s\nT t\nU u\nV v\nW w\nX x\nY y\nZ z\n";
        this.Q = "Brasil\nglobo\npneu";
        this.R = "é";
        this.S = "um\njá\nsal";
        this.T = "ovo (o-vo)";
        this.U = "isto (is-to)";
        this.V = "acho (a-cho)\nmanhã (ma-nhã)\ntrabalham (tra-ba-lham)";
        this.W = "igual (i-gual)\nquente (quen-te)";
        this.X = "sair (sa-ir)\njuiz (ju-iz)";
        this.Y = "café\nTânia";
        this.Z = "Ana\nele\nbonito";
        this.f21988a0 = "falam\nsabem";
        this.f21989b0 = "pudim\nbombom\nalgum";
        this.f21990c0 = "estudei\nfalou";
        this.f21991d0 = "Israel\nestar\nfeliz";
        this.f21992e0 = "Israel (Is-ra-el)\nboa (bo-a)";
        this.f21993f0 = "país (pa-ís) \nsaúde (sa-ú-de)";
        this.f21994g0 = "dia (di-a)\ncliente (cli-en-te)";
        this.f21995h0 = "sua (su-a)";
        this.f21996i0 = "água (á-gua)\nninguém (nin-guém)\nquando (quan-do)\nquente (quen-te)";
        this.f21997j0 = "sair (sa-ir)\njuiz (ju-iz)";
        this.f21998k0 = new c();
        this.f22000m0 = new a(2);
        this.f22001n0 = new i(1);
        this.f22002o0 = new aj.b(this, 25);
    }

    public final void A() {
        List listK;
        Collection collectionT;
        String str = this.f21993f0;
        Matcher matcher = e0.u(0, "\n", "compile(...)", str, "input").matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str, iC, arrayList);
            } while (matcher.find());
            p.B(iC, str, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str.toString());
        }
        if (listK.isEmpty()) {
            collectionT = r.f50854a;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("aí", "aú"));
        ((r0) w4.c.o(2, ((r0) j()).f33188i, this)).f33188i.setAdapter(pTHeavyTableAdapter);
        ((r0) j()).f33188i.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter);
    }

    public final void C() {
        List listK;
        Collection collectionT;
        String str = this.f21996i0;
        Matcher matcher = e0.u(0, "\n", "compile(...)", str, "input").matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str, iC, arrayList);
            } while (matcher.find());
            p.B(iC, str, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str.toString());
        }
        if (listK.isEmpty()) {
            collectionT = r.f50854a;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("gua", "guém", "quan", "quen"));
        ((r0) w4.c.o(1, ((r0) j()).f33191l, this)).f33191l.setAdapter(pTHeavyTableAdapter);
        ((r0) j()).f33191l.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter);
    }

    public final void D() {
        List listK;
        Collection collectionT;
        String str = this.f21997j0;
        Matcher matcher = e0.u(0, "\n", "compile(...)", str, "input").matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str, iC, arrayList);
            } while (matcher.find());
            p.B(iC, str, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str.toString());
        }
        if (listK.isEmpty()) {
            collectionT = r.f50854a;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("ai", "ui"));
        ((r0) w4.c.o(1, ((r0) j()).m, this)).m.setAdapter(pTHeavyTableAdapter);
        ((r0) j()).m.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter);
    }

    public final void E() {
        List listK;
        Collection collectionT;
        String str = this.f21990c0;
        Matcher matcher = e0.u(0, "\n", "compile(...)", str, "input").matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str, iC, arrayList);
            } while (matcher.find());
            p.B(iC, str, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str.toString());
        }
        if (listK.isEmpty()) {
            collectionT = r.f50854a;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("dei", "lou"));
        ((r0) w4.c.o(2, ((r0) j()).f33198t, this)).f33198t.setAdapter(pTHeavyTableAdapter);
        ((r0) j()).f33198t.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter);
    }

    public final void F() {
        List listK;
        Collection collectionT;
        String str = this.f21991d0;
        Matcher matcher = e0.u(0, "\n", "compile(...)", str, "input").matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str, iC, arrayList);
            } while (matcher.find());
            p.B(iC, str, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str.toString());
        }
        if (listK.isEmpty()) {
            collectionT = r.f50854a;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("el", "tar", "liz"));
        ((r0) w4.c.o(3, ((r0) j()).f33199u, this)).f33199u.setAdapter(pTHeavyTableAdapter);
        ((r0) j()).f33199u.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter);
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f21998k0.a(this.f21999l0);
    }

    public final void u() {
        File file = new File(e.m(xt.b.a().b(), fv.b.D(-1L)));
        fv.a aVar = new fv.a(0L, fv.b.E(-1L), fv.b.D(-1L));
        if (!file.exists()) {
            e3 e3Var = ((r0) j()).f33181b;
            LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
            ComposeView composeView = (ComposeView) e3Var.f32524c;
            ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
            linearLayout.setVisibility(0);
            this.f21998k0.d(aVar, new aj.e(this, 26));
            return;
        }
        d dVarM = new yx.a(new bo.c(file, 6), 0).M(ky.e.f38937b);
        qx.o oVarA = px.b.a();
        xx.d dVar = new xx.d(vx.b.f54316e, new g(this));
        try {
            dVarM.K(new yx.b(dVar, oVarA));
            j.a(dVar, this.f36391f);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    public final void v() {
        TextView textView = ((r0) j()).C;
        aj.b bVar = this.f22002o0;
        textView.setOnClickListener(bVar);
        ((r0) j()).G.setOnClickListener(bVar);
        ((r0) j()).I.setOnClickListener(bVar);
        ((r0) j()).J.setOnClickListener(bVar);
        ((r0) j()).M.setOnClickListener(bVar);
        ((r0) j()).D.setOnClickListener(bVar);
        ((r0) j()).H.setOnClickListener(bVar);
        ((r0) j()).K.setOnClickListener(bVar);
        ((r0) j()).D.setOnClickListener(bVar);
        ((r0) j()).L.setOnClickListener(bVar);
        ((r0) j()).E.setOnClickListener(bVar);
        ((r0) j()).F.setOnClickListener(bVar);
    }

    public final void w() {
        List listK;
        Collection collectionT;
        String strH = w4.c.h(getString(R.string.pt_alp_section_table_36), "\n", getString(R.string.pt_alp_section_table_15), "\npaís (pa-ís)\npais (pais) ", getString(R.string.pt_alp_section_table_37));
        Matcher matcher = e0.u(0, "\n", "compile(...)", strH, "input").matcher(strH);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, strH, iC, arrayList);
            } while (matcher.find());
            p.B(iC, strH, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(strH.toString());
        }
        if (listK.isEmpty()) {
            collectionT = r.f50854a;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter = new PTHeavyTableAdapter(1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("aí", "ai"));
        ((r0) w4.c.o(2, ((r0) j()).f33182c, this)).f33182c.setAdapter(pTHeavyTableAdapter);
        ((r0) j()).f33182c.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter);
    }

    public final void x(String status, boolean z11) {
        m.f(status, "status");
        e3 e3Var = ((r0) j()).f33181b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }

    public final void y(BaseQuickAdapter baseQuickAdapter) {
        baseQuickAdapter.setOnItemChildClickListener(new g(this));
    }

    public final void z() {
        List listK;
        Collection collectionT;
        String str = this.f21992e0;
        Matcher matcher = e0.u(0, "\n", "compile(...)", str, "input").matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str, iC, arrayList);
            } while (matcher.find());
            p.B(iC, str, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str.toString());
        }
        if (listK.isEmpty()) {
            collectionT = r.f50854a;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("ae", "oa"));
        ((r0) w4.c.o(2, ((r0) j()).f33187h, this)).f33187h.setAdapter(pTHeavyTableAdapter);
        ((r0) j()).f33187h.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter);
    }

    public final void B() {
        List listK;
        Collection collectionT;
        String str = bjXGJ.OECrPJsyXJbLem;
        String str2 = scNRoQgKSYX.YXTqXcC;
        String str3 = this.f21995h0;
        Matcher matcher = e0.u(0, "\n", str2, str3, str).matcher(str3);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str3, iC, arrayList);
            } while (matcher.find());
            p.B(iC, str3, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str3.toString());
        }
        if (listK.isEmpty()) {
            collectionT = r.f50854a;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("ua", "uo", "uen"));
        ((r0) w4.c.o(1, ((r0) j()).f33190k, this)).f33190k.setAdapter(pTHeavyTableAdapter);
        ((r0) j()).f33190k.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        List listK;
        List listT;
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
        List listK7;
        List listT7;
        List listK8;
        List listT8;
        List listK9;
        List listT9;
        List listK10;
        List listT10;
        List listK11;
        List listT11;
        List listK12;
        List listT12;
        List listK13;
        List listT13;
        List listK14;
        List listT14;
        List listK15;
        List listT15;
        List listK16;
        List listT16;
        List listK17;
        List listT17;
        List listK18;
        List listT18;
        List listK19;
        Collection collectionT;
        List listK20;
        List listT19;
        String string = getString(R.string.introduction);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        l.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        String str = this.P;
        Matcher matcher = e0.u(0, "\n", "compile(...)", str, "input").matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str, iC, arrayList);
            } while (matcher.find());
            p.B(iC, str, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        r rVar = r.f50854a;
        if (!zIsEmpty) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listT = rVar;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    listT = e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            listT = rVar;
            break;
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.pt_syllable_heavy_item, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "K k", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "W w", BuildConfig.VERSION_NAME, "Y y", BuildConfig.VERSION_NAME));
        ((r0) w4.c.o(5, ((r0) j()).f33193o, this)).f33193o.setAdapter(eSSyllableAdapter1);
        ((r0) j()).f33193o.setNestedScrollingEnabled(false);
        y(eSSyllableAdapter1);
        String string2 = getString(R.string.pt_alp_section_table_4);
        String string3 = getString(R.string.pt_alp_section_table_1);
        String string4 = getString(R.string.pt_alp_section_table_5);
        String string5 = getString(R.string.pt_alp_section_table_3);
        String string6 = getString(R.string.pt_alp_section_table_6);
        String string7 = getString(R.string.pt_alp_section_table_7);
        String string8 = getString(R.string.pt_alp_section_table_8);
        String string9 = getString(R.string.pt_alp_section_table_9);
        String string10 = getString(R.string.pt_alp_section_table_9);
        String string11 = getString(R.string.pt_alp_section_table_8);
        String string12 = getString(R.string.pt_alp_section_table_10);
        String string13 = getString(R.string.pt_alp_section_table_11);
        String string14 = getString(R.string.pt_alp_section_table_12);
        String string15 = getString(R.string.pt_alp_section_table_9);
        String string16 = getString(R.string.pt_alp_section_table_13);
        String string17 = getString(R.string.pt_alp_section_table_10);
        String string18 = getString(R.string.pt_alp_section_table_8);
        String string19 = getString(R.string.pt_alp_section_table_9);
        String string20 = getString(R.string.pt_alp_section_table_13);
        String string21 = getString(R.string.pt_alp_section_table_38);
        String string22 = getString(R.string.pt_alp_section_table_14);
        StringBuilder sbQ = e0.q(string2, "\t", string3, "_", string4);
        com.google.android.material.datepicker.d.w(sbQ, "!&&&!", string5, "\na\t[a]_á!&&&!olá!***!à!&&&!às!***!", string6);
        com.google.android.material.datepicker.d.w(sbQ, "!&&&!obrigado!@@@![α]_â!&&&!Tânia!***!", string7, "!&&&!fala!***!", string8);
        com.google.android.material.datepicker.d.w(sbQ, "!&&&!Ana\ne\t[ε]_é!&&&!café!***!", string9, "!&&&!ela!@@@![e]_ê!&&&!você!***!", string10);
        com.google.android.material.datepicker.d.w(sbQ, "!&&&!ele!***!", string11, "!&&&!cinema!@@@![i]_", string12);
        com.google.android.material.datepicker.d.w(sbQ, "!&&&!estudo!***!", string13, "!&&&!saúde!***!", string14);
        com.google.android.material.datepicker.d.w(sbQ, "!&&&!óleo\ni\t[i]_i!&&&!isso!***!í!&&&!açaí\no\t[ͻ]_ó!&&&!avó!***!", string15, "!&&&!agora!***!", string16);
        com.google.android.material.datepicker.d.w(sbQ, "!&&&!você!@@@![o]_ô!&&&!avô!***!", string17, "!&&&!obrigado!***!", string18);
        com.google.android.material.datepicker.d.w(sbQ, "!&&&!como!***!", string19, "!&&&!pode!***!", string20);
        com.google.android.material.datepicker.d.w(sbQ, "!&&&!sobretudo!@@@![u]_", string21, "!&&&!amigo!***!", string22);
        sbQ.append("!&&&!motivo\nu\t[u]_u!&&&!tudo!***!ú!&&&!açúcar");
        String string23 = sbQ.toString();
        String str2 = "compile(...)";
        Matcher matcher2 = e0.u(0, "\n", str2, string23, "input").matcher(string23);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iC2 = 0;
            while (true) {
                iC2 = p.c(matcher2, string23, iC2, arrayList2);
                if (!matcher2.find()) {
                    break;
                } else {
                    str2 = str2;
                }
            }
            p.B(iC2, string23, arrayList2);
            listK2 = arrayList2;
        } else {
            listK2 = o.K(string23.toString());
        }
        if (!listK2.isEmpty()) {
            ListIterator listIterator2 = listK2.listIterator(listK2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT2 = rVar;
                    break;
                } else if (((String) listIterator2.previous()).length() != 0) {
                    listT2 = e0.t(listIterator2, 1, listK2);
                    break;
                }
            }
        } else {
            listT2 = rVar;
            break;
        }
        String[] strArr2 = (String[]) listT2.toArray(new String[0]);
        List listAsList = Arrays.asList(Arrays.copyOf(strArr2, strArr2.length));
        List listL = o.L("á\nà\na\nâ\na\nA", "é\ne\nê\ne\ne\ne\ne\ne", "i\ní", "ó\no\no\nô\no\no\no\no\no\no", "u\nú");
        aj.b bVar = this.f22002o0;
        PTVowelTableAdapter pTVowelTableAdapter = new PTVowelTableAdapter(listAsList, listL, bVar);
        ((r0) j()).f33192n.setLayoutManager(new LinearLayoutManager(1));
        ((r0) j()).f33192n.setAdapter(pTVowelTableAdapter);
        ((r0) j()).f33192n.setNestedScrollingEnabled(false);
        StringBuilder sbQ2 = e0.q(getString(R.string.pt_alp_section_table_1), "\t", getString(R.string.pt_alp_section_table_2), "!&&&!", getString(R.string.pt_alp_section_table_3));
        sbQ2.append("\n[ã]\tã!&&&!maçã!@@@!am!&&&!também!@@@!an!&&&!estudante\n[ẽ]\tem!&&&!tempo!@@@!en!&&&!cento\n[ĩ]\tim!&&&!sim!@@@!in!&&&!tinta\n[õ]\tom!&&&!bom!@@@!on!&&&!onde\n[ũ]\tum!&&&!um!@@@!un!&&&!mundo");
        String string24 = sbQ2.toString();
        Matcher matcher3 = e0.u(0, "\n", str2, string24, "input").matcher(string24);
        if (matcher3.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iC3 = 0;
            while (true) {
                iC3 = p.c(matcher3, string24, iC3, arrayList3);
                if (!matcher3.find()) {
                    break;
                }
                str2 = str2;
                bVar = bVar;
            }
            p.B(iC3, string24, arrayList3);
            listK3 = arrayList3;
        } else {
            listK3 = o.K(string24.toString());
        }
        if (!listK3.isEmpty()) {
            ListIterator listIterator3 = listK3.listIterator(listK3.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT3 = rVar;
                    break;
                } else if (((String) listIterator3.previous()).length() != 0) {
                    listT3 = e0.t(listIterator3, 1, listK3);
                    break;
                }
            }
        } else {
            listT3 = rVar;
            break;
        }
        String[] strArr3 = (String[]) listT3.toArray(new String[0]);
        PTNoseTableAdapter pTNoseTableAdapter = new PTNoseTableAdapter(Arrays.asList(Arrays.copyOf(strArr3, strArr3.length)), bVar);
        ((r0) j()).f33186g.setLayoutManager(new LinearLayoutManager(1));
        ((r0) j()).f33186g.setAdapter(pTNoseTableAdapter);
        ((r0) j()).f33186g.setNestedScrollingEnabled(false);
        String string25 = getString(R.string.pt_alp_section_table_1);
        String string26 = getString(R.string.pt_alp_section_table_15);
        String string27 = getString(R.string.pt_alp_section_table_3);
        String string28 = getString(R.string.pt_alp_section_table_16);
        String string29 = getString(R.string.pt_alp_section_table_17);
        String string30 = getString(R.string.pt_alp_section_table_18);
        StringBuilder sbQ3 = e0.q(string25, "\t", string26, "!&&&!", string27);
        com.google.android.material.datepicker.d.w(sbQ3, "\n[aj]\tai!&&&!pai\n[aw]\tau!&&&!aula\n[ej]\tei!&&&!falei\n[ew]\teu!&&&!meu\n[oj]\toi!&&&!foi\n[ow]\tou!&&&!sou\n[iw]\tiu!&&&!abriu\n[uj]\tui!&&&!contribui\n[wa]\tua!&&&!água\n[ãw]\tão!&&&!não!@@@!", string28, "!&&&!falam\n[ãj]\tãe!&&&!mãe!@@@!ãi!&&&!cãibra\n[ẽj]\t", string29);
        String strU = p.u(sbQ3, "!&&&!bem!@@@!", string30, "!&&&!também\n[õj]\tõe!&&&!limões\n[ũj]\tui!&&&!muito");
        Matcher matcher4 = e0.u(0, "\n", str2, strU, "input").matcher(strU);
        if (matcher4.find()) {
            ArrayList arrayList4 = new ArrayList(10);
            int iC4 = 0;
            while (true) {
                iC4 = p.c(matcher4, strU, iC4, arrayList4);
                if (!matcher4.find()) {
                    break;
                }
                str2 = str2;
                bVar = bVar;
            }
            p.B(iC4, strU, arrayList4);
            listK4 = arrayList4;
        } else {
            listK4 = o.K(strU.toString());
        }
        if (!listK4.isEmpty()) {
            ListIterator listIterator4 = listK4.listIterator(listK4.size());
            while (true) {
                if (!listIterator4.hasPrevious()) {
                    listT4 = rVar;
                    break;
                } else if (((String) listIterator4.previous()).length() != 0) {
                    listT4 = e0.t(listIterator4, 1, listK4);
                    break;
                }
            }
        } else {
            listT4 = rVar;
            break;
        }
        String[] strArr4 = (String[]) listT4.toArray(new String[0]);
        PTNoseTableAdapter pTNoseTableAdapter2 = new PTNoseTableAdapter(Arrays.asList(Arrays.copyOf(strArr4, strArr4.length)), bVar);
        ((r0) j()).f33183d.setLayoutManager(new LinearLayoutManager(1));
        ((r0) j()).f33183d.setAdapter(pTNoseTableAdapter2);
        ((r0) j()).f33183d.setNestedScrollingEnabled(false);
        StringBuilder sbQ4 = e0.q(getString(R.string.pt_alp_section_table_1), "\t", getString(R.string.pt_alp_section_table_19), "!&&&!", getString(R.string.pt_alp_section_table_3));
        sbQ4.append("\n[waj]\tuai!&&&!Uruguai\n[wej]\tuei!&&&!averiguei\n[wiw]\tuiu!&&&!delinguiu\n[wãw]\tuão!&&&!saguão\n[wẽj]\tuem!&&&!adequem\n[wõj]\tuõe!&&&!saguões");
        String string31 = sbQ4.toString();
        Matcher matcher5 = e0.u(0, "\n", str2, string31, "input").matcher(string31);
        if (matcher5.find()) {
            ArrayList arrayList5 = new ArrayList(10);
            int iC5 = 0;
            while (true) {
                iC5 = p.c(matcher5, string31, iC5, arrayList5);
                if (!matcher5.find()) {
                    break;
                }
                str2 = str2;
                bVar = bVar;
            }
            p.B(iC5, string31, arrayList5);
            listK5 = arrayList5;
        } else {
            listK5 = o.K(string31.toString());
        }
        if (!listK5.isEmpty()) {
            ListIterator listIterator5 = listK5.listIterator(listK5.size());
            while (true) {
                if (!listIterator5.hasPrevious()) {
                    listT5 = rVar;
                    break;
                } else if (((String) listIterator5.previous()).length() != 0) {
                    listT5 = e0.t(listIterator5, 1, listK5);
                    break;
                }
            }
        } else {
            listT5 = rVar;
            break;
        }
        String[] strArr5 = (String[]) listT5.toArray(new String[0]);
        PTNoseTableAdapter pTNoseTableAdapter3 = new PTNoseTableAdapter(Arrays.asList(Arrays.copyOf(strArr5, strArr5.length)), bVar);
        ((r0) j()).A.setLayoutManager(new LinearLayoutManager(1));
        ((r0) j()).A.setAdapter(pTNoseTableAdapter3);
        ((r0) j()).A.setNestedScrollingEnabled(false);
        String string32 = getString(R.string.pt_alp_section_table_4);
        String string33 = getString(R.string.pt_alp_section_table_1);
        String string34 = getString(R.string.pt_alp_section_table_5);
        String string35 = getString(R.string.pt_alp_section_table_3);
        String string36 = getString(R.string.pt_alp_section_table_20);
        String string37 = getString(R.string.pt_alp_section_table_21);
        aj.b bVar2 = bVar;
        String string38 = getString(R.string.pt_alp_section_table_22);
        String string39 = getString(R.string.pt_alp_section_table_21);
        String string40 = getString(R.string.pt_alp_section_table_23);
        String string41 = getString(R.string.pt_alp_section_table_24);
        String str3 = str2;
        String string42 = getString(R.string.pt_alp_section_table_34);
        String string43 = getString(R.string.pt_alp_section_table_20);
        String string44 = getString(R.string.pt_alp_section_table_21);
        String string45 = getString(R.string.pt_alp_section_table_22);
        String string46 = getString(R.string.pt_alp_section_table_25);
        String string47 = getString(R.string.pt_alp_section_table_20);
        String string48 = getString(R.string.pt_alp_section_table_26);
        String string49 = getString(R.string.pt_alp_section_table_27);
        String string50 = getString(R.string.pt_alp_section_table_20);
        String string51 = getString(R.string.pt_alp_section_table_20);
        String string52 = getString(R.string.pt_alp_section_table_20);
        String string53 = getString(R.string.pt_alp_section_table_28);
        String string54 = getString(R.string.pt_alp_section_table_29);
        String string55 = getString(R.string.pt_alp_section_table_28);
        String string56 = getString(R.string.pt_alp_section_table_30);
        String string57 = getString(R.string.pt_alp_section_table_27);
        String string58 = getString(R.string.pt_alp_section_table_31);
        String string59 = getString(R.string.pt_alp_section_table_8);
        String string60 = getString(R.string.pt_alp_section_table_23);
        String string61 = getString(R.string.pt_alp_section_table_33);
        String string62 = getString(R.string.pt_alp_section_table_34);
        String string63 = getString(R.string.pt_alp_section_table_20);
        String string64 = getString(R.string.pt_alp_section_table_28);
        String string65 = getString(R.string.pt_alp_section_table_35);
        String string66 = getString(R.string.pt_alp_section_table_30);
        String string67 = getString(R.string.pt_alp_section_table_35);
        String string68 = getString(R.string.pt_alp_section_table_35);
        String string69 = getString(R.string.pt_alp_section_table_31);
        String string70 = getString(R.string.pt_alp_section_table_26);
        String string71 = getString(R.string.pt_alp_section_table_27);
        StringBuilder sbQ5 = e0.q(string32, "\t", string33, "_", string34);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!", string35, "\nb\t[b]_", string36);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!boa\nc\t[k]_", string37, "!&&&!cá!@@@![s]_", string38);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!cedo\nç\t[s]_", string39, "!&&&!moça\nd\t[d]_", string40);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!dama!@@@![dƷ]_", string41, "!&&&!verde!***!", string42);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!dia\nf\t[f]_", string43, "!&&&!ficar\ng\t[g]_", string44);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!gosto!@@@![Ʒ]_", string45, "!&&&!gigante\nh\t _", string46);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!hoje\nj\t[Ʒ]_", string47, "!&&&!janela\nl\t[l]_", string48);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!mala!@@@![w]_", string49, "!&&&!sol\nm\t[m]_", string50);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!mala\nn\t[n]_", string51, "!&&&!nome\np\t[p]_", string52);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!porta\nr\t[R]_", string53, "!&&&!rato!***!rr!&&&!carro!@@@![r]_", string54);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!cara\ns\t[s]_", string55, "!&&&!sala!***!", string56);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!mas!***!", string57, "!&&&!estudei!***!ss!&&&!massa!@@@![z]_", string58);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!mesa!@@@![Ʒ]_", string59, "!&&&!mesmo\nt\t[t]_", string60);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!tema!@@@![tʃ]_", string61, "!&&&!dente!***!", string62);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!tio\nv\t[v]_", string63, "!&&&!vida\nx\t[ʃ]_", string64);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!xarope!***!", string65, "!&&&!caixa!@@@![ks]_", string66);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!fênix!***!", string67, "!&&&!táxi!@@@![s]_", string68);
        com.google.android.material.datepicker.d.w(sbQ5, "!&&&!próximo!@@@![z]_", string69, "!&&&!exame\nz\t[z]_", string70);
        String strU2 = p.u(sbQ5, "!&&&!zero!@@@![s]_", string71, "!&&&!dez");
        Matcher matcher6 = e0.u(0, "\n", str3, strU2, "input").matcher(strU2);
        if (matcher6.find()) {
            ArrayList arrayList6 = new ArrayList(10);
            int iC6 = 0;
            do {
                iC6 = p.c(matcher6, strU2, iC6, arrayList6);
            } while (matcher6.find());
            p.B(iC6, strU2, arrayList6);
            listK6 = arrayList6;
        } else {
            listK6 = o.K(strU2.toString());
        }
        if (!listK6.isEmpty()) {
            ListIterator listIterator6 = listK6.listIterator(listK6.size());
            while (true) {
                if (!listIterator6.hasPrevious()) {
                    listT6 = rVar;
                    break;
                } else if (((String) listIterator6.previous()).length() != 0) {
                    listT6 = e0.t(listIterator6, 1, listK6);
                    break;
                }
            }
        } else {
            listT6 = rVar;
            break;
        }
        String[] strArr6 = (String[]) listT6.toArray(new String[0]);
        PTVowelTableAdapter pTVowelTableAdapter2 = new PTVowelTableAdapter(Arrays.asList(Arrays.copyOf(strArr6, strArr6.length)), o.L("b", "c", "ç", "d", "f", "g", "h", "j", "l", "m", "n", "p", "r\nrr\nr", ealNNtLp.tKeeOGhZk, "t", "v", "x", "z"), bVar2);
        ((r0) j()).f33184e.setLayoutManager(new LinearLayoutManager(1));
        ((r0) j()).f33184e.setAdapter(pTVowelTableAdapter2);
        ((r0) j()).f33184e.setNestedScrollingEnabled(false);
        String str4 = this.Q;
        Matcher matcher7 = e0.u(0, "\n", str3, str4, "input").matcher(str4);
        if (matcher7.find()) {
            ArrayList arrayList7 = new ArrayList(10);
            int iC7 = 0;
            do {
                iC7 = p.c(matcher7, str4, iC7, arrayList7);
            } while (matcher7.find());
            p.B(iC7, str4, arrayList7);
            listK7 = arrayList7;
        } else {
            listK7 = o.K(str4.toString());
        }
        if (!listK7.isEmpty()) {
            ListIterator listIterator7 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator7.hasPrevious()) {
                    listT7 = rVar;
                    break;
                } else if (((String) listIterator7.previous()).length() != 0) {
                    listT7 = e0.t(listIterator7, 1, listK7);
                    break;
                }
            }
        } else {
            listT7 = rVar;
            break;
        }
        String[] strArr7 = (String[]) listT7.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr7, strArr7.length)), o.L("Br", "gl", "pn"));
        ((r0) w4.c.o(3, ((r0) j()).B, this)).B.setAdapter(pTHeavyTableAdapter);
        ((r0) j()).B.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter);
        String string72 = getString(R.string.pt_alp_section_table_4);
        String string73 = getString(R.string.pt_alp_section_table_1);
        String string74 = getString(R.string.pt_alp_section_table_5);
        String string75 = getString(R.string.pt_alp_section_table_3);
        String string76 = getString(R.string.pt_alp_section_table_20);
        String string77 = getString(R.string.pt_alp_section_table_20);
        String string78 = getString(R.string.pt_alp_section_table_20);
        String string79 = getString(R.string.pt_alp_section_table_39);
        String string80 = getString(R.string.pt_alp_section_table_40);
        StringBuilder sbQ6 = e0.q(string72, "\t", string73, "_", string74);
        com.google.android.material.datepicker.d.w(sbQ6, "!&&&!", string75, "\nch\t[ʃ]_", string76);
        com.google.android.material.datepicker.d.w(sbQ6, "!&&&!chá\nnh\t[ɲ]_", string77, "!&&&!minha\nlh\t[λ]_", string78);
        com.google.android.material.datepicker.d.w(sbQ6, "!&&&!trabalham\ngu\t[g]_gu+e!&&&!ninguém!***!gu+i!&&&!conseguir!@@@![gw]_gu+a!&&&!igual!***!", string79, "!&&&!linguista\nqu\t[k]_qu+e!&&&!quente!***!qu+i!&&&!quilo!@@@![kw]_qu+a/o!&&&!qual!***!", string80);
        sbQ6.append(kHfjNGauVgdF.MyTsXgTiRIqzuOh);
        String string81 = sbQ6.toString();
        Matcher matcher8 = e0.u(0, "\n", str3, string81, "input").matcher(string81);
        if (matcher8.find()) {
            ArrayList arrayList8 = new ArrayList(10);
            int iC8 = 0;
            do {
                iC8 = p.c(matcher8, string81, iC8, arrayList8);
            } while (matcher8.find());
            p.B(iC8, string81, arrayList8);
            listK8 = arrayList8;
        } else {
            listK8 = o.K(string81.toString());
        }
        if (!listK8.isEmpty()) {
            ListIterator listIterator8 = listK8.listIterator(listK8.size());
            while (true) {
                if (!listIterator8.hasPrevious()) {
                    listT8 = rVar;
                    break;
                } else if (((String) listIterator8.previous()).length() != 0) {
                    listT8 = e0.t(listIterator8, 1, listK8);
                    break;
                }
            }
        } else {
            listT8 = rVar;
            break;
        }
        String[] strArr8 = (String[]) listT8.toArray(new String[0]);
        PTVowelTableAdapter pTVowelTableAdapter3 = new PTVowelTableAdapter(Arrays.asList(Arrays.copyOf(strArr8, strArr8.length)), o.L("ch", "nh", "lh", "gu", "qu"), bVar2);
        ((r0) j()).f33185f.setLayoutManager(new LinearLayoutManager(1));
        ((r0) j()).f33185f.setAdapter(pTVowelTableAdapter3);
        ((r0) j()).f33185f.setNestedScrollingEnabled(false);
        String str5 = this.R;
        Matcher matcher9 = e0.u(0, "\n", str3, str5, "input").matcher(str5);
        if (matcher9.find()) {
            ArrayList arrayList9 = new ArrayList(10);
            int iC9 = 0;
            do {
                iC9 = p.c(matcher9, str5, iC9, arrayList9);
            } while (matcher9.find());
            p.B(iC9, str5, arrayList9);
            listK9 = arrayList9;
        } else {
            listK9 = o.K(str5.toString());
        }
        if (!listK9.isEmpty()) {
            ListIterator listIterator9 = listK9.listIterator(listK9.size());
            while (true) {
                if (!listIterator9.hasPrevious()) {
                    listT9 = rVar;
                    break;
                } else if (((String) listIterator9.previous()).length() != 0) {
                    listT9 = e0.t(listIterator9, 1, listK9);
                    break;
                }
            }
        } else {
            listT9 = rVar;
            break;
        }
        String[] strArr9 = (String[]) listT9.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter2 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr9, strArr9.length)), o.K("é"));
        ((r0) w4.c.o(1, ((r0) j()).f33200v, this)).f33200v.setAdapter(pTHeavyTableAdapter2);
        ((r0) j()).f33200v.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter2);
        String str6 = this.S;
        Matcher matcher10 = e0.u(0, "\n", str3, str6, "input").matcher(str6);
        if (matcher10.find()) {
            ArrayList arrayList10 = new ArrayList(10);
            int iC10 = 0;
            do {
                iC10 = p.c(matcher10, str6, iC10, arrayList10);
            } while (matcher10.find());
            p.B(iC10, str6, arrayList10);
            listK10 = arrayList10;
        } else {
            listK10 = o.K(str6.toString());
        }
        if (!listK10.isEmpty()) {
            ListIterator listIterator10 = listK10.listIterator(listK10.size());
            while (true) {
                if (!listIterator10.hasPrevious()) {
                    listT10 = rVar;
                    break;
                } else if (((String) listIterator10.previous()).length() != 0) {
                    listT10 = e0.t(listIterator10, 1, listK10);
                    break;
                }
            }
        } else {
            listT10 = rVar;
            break;
        }
        String[] strArr10 = (String[]) listT10.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter3 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr10, strArr10.length)), o.L("u", "á", "a"));
        ((r0) w4.c.o(3, ((r0) j()).f33201w, this)).f33201w.setAdapter(pTHeavyTableAdapter3);
        ((r0) j()).f33201w.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter3);
        String str7 = this.T;
        Matcher matcher11 = e0.u(0, "\n", str3, str7, "input").matcher(str7);
        if (matcher11.find()) {
            ArrayList arrayList11 = new ArrayList(10);
            int iC11 = 0;
            do {
                iC11 = p.c(matcher11, str7, iC11, arrayList11);
            } while (matcher11.find());
            p.B(iC11, str7, arrayList11);
            listK11 = arrayList11;
        } else {
            listK11 = o.K(str7.toString());
        }
        if (!listK11.isEmpty()) {
            ListIterator listIterator11 = listK11.listIterator(listK11.size());
            while (true) {
                if (!listIterator11.hasPrevious()) {
                    listT11 = rVar;
                    break;
                } else if (((String) listIterator11.previous()).length() != 0) {
                    listT11 = e0.t(listIterator11, 1, listK11);
                    break;
                }
            }
        } else {
            listT11 = rVar;
            break;
        }
        String[] strArr11 = (String[]) listT11.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter4 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr11, strArr11.length)), o.K("v"));
        ((r0) w4.c.o(1, ((r0) j()).f33202x, this)).f33202x.setAdapter(pTHeavyTableAdapter4);
        ((r0) j()).f33202x.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter4);
        String str8 = this.U;
        Matcher matcher12 = e0.u(0, "\n", str3, str8, "input").matcher(str8);
        if (matcher12.find()) {
            ArrayList arrayList12 = new ArrayList(10);
            int iC12 = 0;
            do {
                iC12 = p.c(matcher12, str8, iC12, arrayList12);
            } while (matcher12.find());
            p.B(iC12, str8, arrayList12);
            listK12 = arrayList12;
        } else {
            listK12 = o.K(str8.toString());
        }
        if (!listK12.isEmpty()) {
            ListIterator listIterator12 = listK12.listIterator(listK12.size());
            while (true) {
                if (!listIterator12.hasPrevious()) {
                    listT12 = rVar;
                    break;
                } else if (((String) listIterator12.previous()).length() != 0) {
                    listT12 = e0.t(listIterator12, 1, listK12);
                    break;
                }
            }
        } else {
            listT12 = rVar;
            break;
        }
        String[] strArr12 = (String[]) listT12.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter5 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr12, strArr12.length)), o.K("st"));
        ((r0) w4.c.o(1, ((r0) j()).f33203y, this)).f33203y.setAdapter(pTHeavyTableAdapter5);
        ((r0) j()).f33203y.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter5);
        String str9 = this.V;
        Matcher matcher13 = e0.u(0, "\n", str3, str9, "input").matcher(str9);
        if (matcher13.find()) {
            ArrayList arrayList13 = new ArrayList(10);
            int iC13 = 0;
            do {
                iC13 = p.c(matcher13, str9, iC13, arrayList13);
            } while (matcher13.find());
            p.B(iC13, str9, arrayList13);
            listK13 = arrayList13;
        } else {
            listK13 = o.K(str9.toString());
        }
        if (!listK13.isEmpty()) {
            ListIterator listIterator13 = listK13.listIterator(listK13.size());
            while (true) {
                if (!listIterator13.hasPrevious()) {
                    listT13 = rVar;
                    break;
                } else if (((String) listIterator13.previous()).length() != 0) {
                    listT13 = e0.t(listIterator13, 1, listK13);
                    break;
                }
            }
        } else {
            listT13 = rVar;
            break;
        }
        String[] strArr13 = (String[]) listT13.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter6 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr13, strArr13.length)), o.L("ch", "nh", "lh"));
        ((r0) w4.c.o(1, ((r0) j()).f33198t, this)).f33198t.setAdapter(pTHeavyTableAdapter6);
        ((r0) j()).f33198t.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter6);
        String str10 = this.W;
        Matcher matcher14 = e0.u(0, "\n", str3, str10, "input").matcher(str10);
        if (matcher14.find()) {
            ArrayList arrayList14 = new ArrayList(10);
            int iC14 = 0;
            do {
                iC14 = p.c(matcher14, str10, iC14, arrayList14);
            } while (matcher14.find());
            p.B(iC14, str10, arrayList14);
            listK14 = arrayList14;
        } else {
            listK14 = o.K(str10.toString());
        }
        if (!listK14.isEmpty()) {
            ListIterator listIterator14 = listK14.listIterator(listK14.size());
            while (true) {
                if (!listIterator14.hasPrevious()) {
                    listT14 = rVar;
                    break;
                } else if (((String) listIterator14.previous()).length() != 0) {
                    listT14 = e0.t(listIterator14, 1, listK14);
                    break;
                }
            }
        } else {
            listT14 = rVar;
            break;
        }
        String[] strArr14 = (String[]) listT14.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter7 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr14, strArr14.length)), o.L("gu", "qu"));
        ((r0) w4.c.o(1, ((r0) j()).f33199u, this)).f33199u.setAdapter(pTHeavyTableAdapter7);
        ((r0) j()).f33199u.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter7);
        String str11 = this.X;
        Matcher matcher15 = e0.u(0, "\n", str3, str11, "input").matcher(str11);
        if (matcher15.find()) {
            ArrayList arrayList15 = new ArrayList(10);
            int iC15 = 0;
            do {
                iC15 = p.c(matcher15, str11, iC15, arrayList15);
            } while (matcher15.find());
            p.B(iC15, str11, arrayList15);
            listK15 = arrayList15;
        } else {
            listK15 = o.K(str11.toString());
        }
        if (!listK15.isEmpty()) {
            ListIterator listIterator15 = listK15.listIterator(listK15.size());
            while (true) {
                if (!listIterator15.hasPrevious()) {
                    listT15 = rVar;
                    break;
                } else if (((String) listIterator15.previous()).length() != 0) {
                    listT15 = e0.t(listIterator15, 1, listK15);
                    break;
                }
            }
        } else {
            listT15 = rVar;
            break;
        }
        String[] strArr15 = (String[]) listT15.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter8 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr15, strArr15.length)), o.L("ai", "ui"));
        ((r0) w4.c.o(1, ((r0) j()).f33204z, this)).f33204z.setAdapter(pTHeavyTableAdapter8);
        ((r0) j()).f33204z.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter8);
        String str12 = this.Y;
        Matcher matcher16 = e0.u(0, "\n", str3, str12, "input").matcher(str12);
        if (matcher16.find()) {
            ArrayList arrayList16 = new ArrayList(10);
            int iC16 = 0;
            do {
                iC16 = p.c(matcher16, str12, iC16, arrayList16);
            } while (matcher16.find());
            p.B(iC16, str12, arrayList16);
            listK16 = arrayList16;
        } else {
            listK16 = o.K(str12.toString());
        }
        if (!listK16.isEmpty()) {
            ListIterator listIterator16 = listK16.listIterator(listK16.size());
            while (true) {
                if (!listIterator16.hasPrevious()) {
                    listT16 = rVar;
                    break;
                } else if (((String) listIterator16.previous()).length() != 0) {
                    listT16 = e0.t(listIterator16, 1, listK16);
                    break;
                }
            }
        } else {
            listT16 = rVar;
            break;
        }
        String[] strArr16 = (String[]) listT16.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter9 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr16, strArr16.length)), o.L("fé", "Tâ"));
        ((r0) w4.c.o(2, ((r0) j()).f33194p, this)).f33194p.setAdapter(pTHeavyTableAdapter9);
        ((r0) j()).f33194p.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter9);
        String str13 = this.Z;
        Matcher matcher17 = e0.u(0, "\n", str3, str13, "input").matcher(str13);
        if (matcher17.find()) {
            ArrayList arrayList17 = new ArrayList(10);
            int iC17 = 0;
            do {
                iC17 = p.c(matcher17, str13, iC17, arrayList17);
            } while (matcher17.find());
            p.B(iC17, str13, arrayList17);
            listK17 = arrayList17;
        } else {
            listK17 = o.K(str13.toString());
        }
        if (!listK17.isEmpty()) {
            ListIterator listIterator17 = listK17.listIterator(listK17.size());
            while (true) {
                if (!listIterator17.hasPrevious()) {
                    listT17 = rVar;
                    break;
                } else if (((String) listIterator17.previous()).length() != 0) {
                    listT17 = e0.t(listIterator17, 1, listK17);
                    break;
                }
            }
        } else {
            listT17 = rVar;
            break;
        }
        String[] strArr17 = (String[]) listT17.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter10 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr17, strArr17.length)), o.L("A", "e", "ni"));
        ((r0) w4.c.o(3, ((r0) j()).f33195q, this)).f33195q.setAdapter(pTHeavyTableAdapter10);
        ((r0) j()).f33195q.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter10);
        String str14 = this.f21988a0;
        Matcher matcher18 = e0.u(0, "\n", str3, str14, "input").matcher(str14);
        if (matcher18.find()) {
            ArrayList arrayList18 = new ArrayList(10);
            int iC18 = 0;
            do {
                iC18 = p.c(matcher18, str14, iC18, arrayList18);
            } while (matcher18.find());
            p.B(iC18, str14, arrayList18);
            listK18 = arrayList18;
        } else {
            listK18 = o.K(str14.toString());
        }
        if (!listK18.isEmpty()) {
            ListIterator listIterator18 = listK18.listIterator(listK18.size());
            while (true) {
                if (!listIterator18.hasPrevious()) {
                    listT18 = rVar;
                    break;
                } else if (((String) listIterator18.previous()).length() != 0) {
                    listT18 = e0.t(listIterator18, 1, listK18);
                    break;
                }
            }
        } else {
            listT18 = rVar;
            break;
        }
        String[] strArr18 = (String[]) listT18.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter11 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr18, strArr18.length)), o.L("fa", "sa"));
        ((r0) w4.c.o(2, ((r0) j()).f33196r, this)).f33196r.setAdapter(pTHeavyTableAdapter11);
        ((r0) j()).f33196r.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter11);
        String str15 = this.f21989b0;
        Matcher matcher19 = e0.u(0, "\n", "compile(...)", str15, "input").matcher(str15);
        if (matcher19.find()) {
            ArrayList arrayList19 = new ArrayList(10);
            int iC19 = 0;
            do {
                iC19 = p.c(matcher19, str15, iC19, arrayList19);
            } while (matcher19.find());
            p.B(iC19, str15, arrayList19);
            listK19 = arrayList19;
        } else {
            listK19 = o.K(str15.toString());
        }
        if (!listK19.isEmpty()) {
            ListIterator listIterator19 = listK19.listIterator(listK19.size());
            while (true) {
                if (!listIterator19.hasPrevious()) {
                    collectionT = r.f50854a;
                    break;
                } else if (((String) listIterator19.previous()).length() != 0) {
                    collectionT = e0.t(listIterator19, 1, listK19);
                    break;
                }
            }
        } else {
            collectionT = r.f50854a;
            break;
        }
        String[] strArr19 = (String[]) collectionT.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter12 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr19, strArr19.length)), o.L("dim", "bom", "gum"));
        ((r0) w4.c.o(3, ((r0) j()).f33197s, this)).f33197s.setAdapter(pTHeavyTableAdapter12);
        ((r0) j()).f33197s.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter12);
        E();
        F();
        w();
        z();
        A();
        String str16 = this.f21994g0;
        Matcher matcher20 = e0.u(0, "\n", str3, str16, "input").matcher(str16);
        if (matcher20.find()) {
            ArrayList arrayList20 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList20.add(str16.subSequence(iEnd, matcher20.start()).toString());
                iEnd = matcher20.end();
            } while (matcher20.find());
            arrayList20.add(str16.subSequence(iEnd, str16.length()).toString());
            listK20 = arrayList20;
        } else {
            listK20 = o.K(str16.toString());
        }
        if (!listK20.isEmpty()) {
            ListIterator listIterator20 = listK20.listIterator(listK20.size());
            while (true) {
                if (!listIterator20.hasPrevious()) {
                    listT19 = rVar;
                    break;
                } else if (((String) listIterator20.previous()).length() != 0) {
                    listT19 = e0.t(listIterator20, 1, listK20);
                    break;
                }
            }
        } else {
            listT19 = rVar;
            break;
        }
        String[] strArr20 = (String[]) listT19.toArray(new String[0]);
        PTHeavyTableAdapter pTHeavyTableAdapter13 = new PTHeavyTableAdapter(-1, Arrays.asList(Arrays.copyOf(strArr20, strArr20.length)), o.L("ia", "ien"));
        ((r0) w4.c.o(1, ((r0) j()).f33189j, this)).f33189j.setAdapter(pTHeavyTableAdapter13);
        ((r0) j()).f33189j.setNestedScrollingEnabled(false);
        y(pTHeavyTableAdapter13);
        B();
        C();
        D();
        v();
        u();
    }
}
