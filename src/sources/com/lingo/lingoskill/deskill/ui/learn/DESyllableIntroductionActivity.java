package com.lingo.lingoskill.deskill.ui.learn;

import a9.i;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.lingo.lingoskill.deskill.ui.learn.adapter.DESyllableAdapter1;
import com.lingo.lingoskill.espanskill.ui.learn.adapter.ESSyllableAdapter1;
import com.lingo.lingoskill.espanskill.ui.learn.adapter.ESSyllableAdapter2;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import fv.c;
import hh.p0;
import hj.e3;
import hj.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import ji.b;
import ns.o;
import nv.p;
import oz.q;
import ry.r;
import sj.a;
import th.j;
import yx.d;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DESyllableIntroductionActivity extends b {
    public static final /* synthetic */ int G0 = 0;
    public final String A0;
    public final String B0;
    public final c C0;
    public int D0;
    public final a E0;
    public final i F0;
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
    public final String f21771a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final String f21772b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final String f21773c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final String f21774d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f21775e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final String f21776f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String f21777g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final String f21778h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final String f21779i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final String f21780j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final String f21781k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final String f21782l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final String f21783m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final String f21784n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final String f21785o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f21786p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f21787q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f21788r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f21789s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f21790t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f21791u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final String f21792v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final String f21793w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final String f21794x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final String f21795y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final String f21796z0;

    public DESyllableIntroductionActivity() {
        super("AlphabetIntro", mj.c.f41163a);
        this.P = "A a\nB b\nC c\nD d\nE e\nF f\nG g\nH h\nI i\nJ j\nK k\nL l\nM m\nN n\nO o\nP p\nQ q\nR r\nS s\nT t\nU u\nV v\nW w\nX x\nY y\nZ z\nÄ ä\nÖ ö\nÜ ü\nẞ ß";
        this.Q = "Vater\nbrauchen\nFlughafen";
        this.R = "aufstellen\neinladen\naussteigen\nmitbringen\nunbekannt";
        this.S = "bezahlen\nerscheinen\nentschuldigen\nzerstören";
        this.T = "Ingenieur\nTheater";
        this.U = "Universität\nstudieren";
        this.V = "Hausaufgabe\nKlassenzimmer";
        this.W = "f\tfest\tFehler\nh\tHund\tHuhn\nj\tJacke\tJahr\nk\tkommen\tKohl\nl\tLicht\tLied\nm\tMann\tMaat\nn\tNeffe\tNacken\np\tpacken\tPaar\nt\tTante\tTag\nz\tZoll\tZoo";
        this.X = "a\tVater\tMann\nä\tVäter\tMänner\no\tSohn\tDorf\nö\tSöhne\tDörfer\nu\tKuh\tMutter\nü\tKühe\tMütter\n";
        this.Y = "au\tHaus\tMaus\nei/ai\tEis\tMai\neu/äu\tneu\tHäuser";
        this.Z = "ff\tNeffe\nck\tZucker\nll\tBall\nmm\tNummer\nnn\tnennen\npp\tPuppe\nss\tTasse\ntt\tGatte";
        this.f21771a0 = "Stadt\nSchmidt\nThomas\nThema";
        this.f21772b0 = "Photo\nPhase";
        this.f21773c0 = "Satz\nsitzen\nMietshaus\nMonatsende";
        this.f21774d0 = "Fuchs\nsechs\nMarx\nBoxen";
        this.f21775e0 = "Bach\nhoch\nBuch\nauch";
        this.f21776f0 = "ich\neuch\nmöchte\nleicht";
        this.f21777g0 = "bleibt\nRad\nTag";
        this.f21778h0 = "baden\nDame\nGarten";
        this.f21779i0 = "sagen\nSee";
        this.f21780j0 = "das\nDienst";
        this.f21781k0 = "heiß\nFüße";
        this.f21782l0 = "Stadt\nSport";
        this.f21783m0 = "Fenster\nKnospe";
        this.f21784n0 = "Pfeffer\nPflanze\nKnabe\nKneipe";
        this.f21785o0 = "lang\nÜbung";
        this.f21786p0 = "Quelle\nQual";
        this.f21787q0 = "wann\nWetter";
        this.f21788r0 = "vier\nMotiv";
        this.f21789s0 = "Vase\nKlavier";
        this.f21790t0 = "richtig\nHonig";
        this.f21791u0 = "richtige\nwenige";
        this.f21792v0 = "Schnee\nschon\nDeutsch\nQuatsch";
        this.f21793w0 = "Typ\nSymbol";
        this.f21794x0 = "York\nYoga";
        this.f21795y0 = "Radio\nFrau";
        this.f21796z0 = "Herren\nkurz";
        this.A0 = "Kinder\nerzählen\nklettern\nvergessen\nklettert\nzerstören";
        this.B0 = "Ohr\nTier";
        this.C0 = new c();
        this.E0 = new a(0);
        this.F0 = new i(1);
    }

    public final void A() {
        List listK;
        Collection collectionT;
        String str = this.f21796z0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), p0.r("er", "ur"));
        ((m) p0.u(2, ((m) j()).f32897v, this)).f32897v.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }

    public final void B() {
        List listK;
        Collection collectionT;
        String str = this.A0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), w4.c.l("er"));
        ((m) p0.u(2, ((m) j()).f32898w, this)).f32898w.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }

    public final void C() {
        List listK;
        Collection collectionT;
        String str = this.B0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), p0.r("Ohr", "ier"));
        ((m) p0.u(2, ((m) j()).f32899x, this)).f32899x.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }

    public final void D() {
        List listK;
        Collection collectionT;
        String str = this.f21792v0;
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
        List listAsList = Arrays.asList(Arrays.copyOf(strArr, strArr.length));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("Sch");
        arrayList2.add("sch");
        arrayList2.add("tsch");
        arrayList2.add("tsch");
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList, arrayList2);
        ((m) p0.u(2, ((m) j()).C, this)).C.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }

    public final void F() {
        List listK;
        Collection collectionT;
        String str = this.f21788r0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), w4.c.l("v"));
        ((m) p0.u(2, ((m) j()).N, this)).N.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }

    public final void G() {
        List listK;
        Collection collectionT;
        String str = this.f21789s0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), p0.r("Va", "vier"));
        ((m) p0.u(2, ((m) j()).O, this)).O.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }

    public final void H() {
        List listK;
        Collection collectionT;
        String str = this.f21793w0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), w4.c.l("y"));
        ((m) p0.u(2, ((m) j()).P, this)).P.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.C0.a(this.D0);
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
        List listT19;
        List listK20;
        List listT20;
        List listK21;
        List listT21;
        List listK22;
        List listT22;
        List listK23;
        List listT23;
        List listK24;
        List listT24;
        List listK25;
        List listT25;
        List listK26;
        List listT26;
        List listK27;
        List listT27;
        List listK28;
        String string = getString(R.string.alphabet);
        kotlin.jvm.internal.m.e(string, "getString(...)");
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
        List listT28 = r.f50854a;
        if (!zIsEmpty) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listT = listT28;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    listT = e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            listT = listT28;
            break;
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), null);
        ((m) p0.u(5, ((m) j()).f32887k, this)).f32887k.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
        String str2 = this.Q;
        Matcher matcher2 = e0.u(0, "\n", "compile(...)", str2, "input").matcher(str2);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iC2 = 0;
            do {
                iC2 = p.c(matcher2, str2, iC2, arrayList2);
            } while (matcher2.find());
            p.B(iC2, str2, arrayList2);
            listK2 = arrayList2;
        } else {
            listK2 = o.K(str2.toString());
        }
        if (!listK2.isEmpty()) {
            ListIterator listIterator2 = listK2.listIterator(listK2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT2 = listT28;
                    break;
                } else if (((String) listIterator2.previous()).length() != 0) {
                    listT2 = e0.t(listIterator2, 1, listK2);
                    break;
                }
            }
        } else {
            listT2 = listT28;
            break;
        }
        String[] strArr2 = (String[]) listT2.toArray(new String[0]);
        List listAsList = Arrays.asList(Arrays.copyOf(strArr2, strArr2.length));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("Va");
        arrayList3.add("brau");
        arrayList3.add("Flu");
        ESSyllableAdapter1 eSSyllableAdapter2 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList, arrayList3);
        ((m) p0.u(3, ((m) j()).F, this)).F.setAdapter(eSSyllableAdapter2);
        y(eSSyllableAdapter2);
        E();
        E();
        String str3 = this.S;
        Matcher matcher3 = e0.u(0, "\n", "compile(...)", str3, "input").matcher(str3);
        if (matcher3.find()) {
            ArrayList arrayList4 = new ArrayList(10);
            int iC3 = 0;
            do {
                iC3 = p.c(matcher3, str3, iC3, arrayList4);
            } while (matcher3.find());
            p.B(iC3, str3, arrayList4);
            listK3 = arrayList4;
        } else {
            listK3 = o.K(str3.toString());
        }
        if (!listK3.isEmpty()) {
            ListIterator listIterator3 = listK3.listIterator(listK3.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT3 = listT28;
                    break;
                } else if (((String) listIterator3.previous()).length() != 0) {
                    listT3 = e0.t(listIterator3, 1, listK3);
                    break;
                }
            }
        } else {
            listT3 = listT28;
            break;
        }
        String[] strArr3 = (String[]) listT3.toArray(new String[0]);
        List listAsList2 = Arrays.asList(Arrays.copyOf(strArr3, strArr3.length));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("zah");
        arrayList5.add("schei");
        arrayList5.add("schul");
        arrayList5.add("stö");
        ESSyllableAdapter1 eSSyllableAdapter3 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList2, arrayList5);
        ((m) p0.u(2, ((m) j()).H, this)).H.setAdapter(eSSyllableAdapter3);
        y(eSSyllableAdapter3);
        String strH = ep.a.h("übersetzen (", getString(R.string.de_alp_content_72), ")\nübersetzen (", getString(R.string.de_alp_content_73), ")");
        Matcher matcher4 = e0.u(0, "\n", "compile(...)", strH, "input").matcher(strH);
        if (matcher4.find()) {
            ArrayList arrayList6 = new ArrayList(10);
            int iC4 = 0;
            do {
                iC4 = p.c(matcher4, strH, iC4, arrayList6);
            } while (matcher4.find());
            p.B(iC4, strH, arrayList6);
            listK4 = arrayList6;
        } else {
            listK4 = o.K(strH.toString());
        }
        if (!listK4.isEmpty()) {
            ListIterator listIterator4 = listK4.listIterator(listK4.size());
            while (true) {
                if (!listIterator4.hasPrevious()) {
                    listT4 = listT28;
                    break;
                } else if (((String) listIterator4.previous()).length() != 0) {
                    listT4 = e0.t(listIterator4, 1, listK4);
                    break;
                }
            }
        } else {
            listT4 = listT28;
            break;
        }
        String[] strArr4 = (String[]) listT4.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter4 = new ESSyllableAdapter1(R.layout.de_syllable_table_item_2, Arrays.asList(Arrays.copyOf(strArr4, strArr4.length)), p0.r("se", "ü"));
        ((m) p0.u(2, ((m) j()).I, this)).I.setAdapter(eSSyllableAdapter4);
        y(eSSyllableAdapter4);
        String str4 = this.T;
        Matcher matcher5 = e0.u(0, "\n", "compile(...)", str4, "input").matcher(str4);
        if (matcher5.find()) {
            ArrayList arrayList7 = new ArrayList(10);
            int iC5 = 0;
            do {
                iC5 = p.c(matcher5, str4, iC5, arrayList7);
            } while (matcher5.find());
            p.B(iC5, str4, arrayList7);
            listK5 = arrayList7;
        } else {
            listK5 = o.K(str4.toString());
        }
        if (!listK5.isEmpty()) {
            ListIterator listIterator5 = listK5.listIterator(listK5.size());
            while (true) {
                if (!listIterator5.hasPrevious()) {
                    listT5 = listT28;
                    break;
                } else if (((String) listIterator5.previous()).length() != 0) {
                    listT5 = e0.t(listIterator5, 1, listK5);
                    break;
                }
            }
        } else {
            listT5 = listT28;
            break;
        }
        String[] strArr5 = (String[]) listT5.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter5 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr5, strArr5.length)), p0.r("nieur", "a"));
        ((m) p0.u(2, ((m) j()).J, this)).J.setAdapter(eSSyllableAdapter5);
        y(eSSyllableAdapter5);
        String str5 = this.U;
        Matcher matcher6 = e0.u(0, "\n", "compile(...)", str5, "input").matcher(str5);
        if (matcher6.find()) {
            ArrayList arrayList8 = new ArrayList(10);
            int iC6 = 0;
            do {
                iC6 = p.c(matcher6, str5, iC6, arrayList8);
            } while (matcher6.find());
            p.B(iC6, str5, arrayList8);
            listK6 = arrayList8;
        } else {
            listK6 = o.K(str5.toString());
        }
        if (!listK6.isEmpty()) {
            ListIterator listIterator6 = listK6.listIterator(listK6.size());
            while (true) {
                if (!listIterator6.hasPrevious()) {
                    listT6 = listT28;
                    break;
                } else if (((String) listIterator6.previous()).length() != 0) {
                    listT6 = e0.t(listIterator6, 1, listK6);
                    break;
                }
            }
        } else {
            listT6 = listT28;
            break;
        }
        String[] strArr6 = (String[]) listT6.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter6 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr6, strArr6.length)), p0.r("tät", "die"));
        ((m) p0.u(2, ((m) j()).K, this)).K.setAdapter(eSSyllableAdapter6);
        y(eSSyllableAdapter6);
        String str6 = this.V;
        Matcher matcher7 = e0.u(0, "\n", "compile(...)", str6, "input").matcher(str6);
        if (matcher7.find()) {
            ArrayList arrayList9 = new ArrayList(10);
            int iC7 = 0;
            do {
                iC7 = p.c(matcher7, str6, iC7, arrayList9);
            } while (matcher7.find());
            p.B(iC7, str6, arrayList9);
            listK7 = arrayList9;
        } else {
            listK7 = o.K(str6.toString());
        }
        if (!listK7.isEmpty()) {
            ListIterator listIterator7 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator7.hasPrevious()) {
                    listT7 = listT28;
                    break;
                } else if (((String) listIterator7.previous()).length() != 0) {
                    listT7 = e0.t(listIterator7, 1, listK7);
                    break;
                }
            }
        } else {
            listT7 = listT28;
            break;
        }
        String[] strArr7 = (String[]) listT7.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter7 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr7, strArr7.length)), p0.r("Haus", "Kla"));
        ((m) p0.u(2, ((m) j()).L, this)).L.setAdapter(eSSyllableAdapter7);
        y(eSSyllableAdapter7);
        String str7 = this.W;
        Matcher matcher8 = e0.u(0, "\n", "compile(...)", str7, "input").matcher(str7);
        if (matcher8.find()) {
            ArrayList arrayList10 = new ArrayList(10);
            int iC8 = 0;
            do {
                iC8 = p.c(matcher8, str7, iC8, arrayList10);
            } while (matcher8.find());
            p.B(iC8, str7, arrayList10);
            listK8 = arrayList10;
        } else {
            listK8 = o.K(str7.toString());
        }
        if (!listK8.isEmpty()) {
            ListIterator listIterator8 = listK8.listIterator(listK8.size());
            while (true) {
                if (!listIterator8.hasPrevious()) {
                    listT8 = listT28;
                    break;
                } else if (((String) listIterator8.previous()).length() != 0) {
                    listT8 = e0.t(listIterator8, 1, listK8);
                    break;
                }
            }
        } else {
            listT8 = listT28;
            break;
        }
        String[] strArr8 = (String[]) listT8.toArray(new String[0]);
        DESyllableAdapter1 dESyllableAdapter1 = new DESyllableAdapter1(R.layout.de_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr8, strArr8.length)));
        ((m) j()).f32884h.setLayoutManager(new LinearLayoutManager(1));
        ((m) j()).f32884h.setAdapter(dESyllableAdapter1);
        y(dESyllableAdapter1);
        String str8 = this.X;
        Matcher matcher9 = e0.u(0, "\n", "compile(...)", str8, "input").matcher(str8);
        if (matcher9.find()) {
            ArrayList arrayList11 = new ArrayList(10);
            int iC9 = 0;
            do {
                iC9 = p.c(matcher9, str8, iC9, arrayList11);
            } while (matcher9.find());
            p.B(iC9, str8, arrayList11);
            listK9 = arrayList11;
        } else {
            listK9 = o.K(str8.toString());
        }
        if (!listK9.isEmpty()) {
            ListIterator listIterator9 = listK9.listIterator(listK9.size());
            while (true) {
                if (!listIterator9.hasPrevious()) {
                    listT9 = listT28;
                    break;
                } else if (((String) listIterator9.previous()).length() != 0) {
                    listT9 = e0.t(listIterator9, 1, listK9);
                    break;
                }
            }
        } else {
            listT9 = listT28;
            break;
        }
        String[] strArr9 = (String[]) listT9.toArray(new String[0]);
        DESyllableAdapter1 dESyllableAdapter2 = new DESyllableAdapter1(R.layout.de_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr9, strArr9.length)));
        ((m) j()).f32900y.setLayoutManager(new LinearLayoutManager(1));
        ((m) j()).f32900y.setAdapter(dESyllableAdapter2);
        y(dESyllableAdapter2);
        String str9 = this.Y;
        Matcher matcher10 = e0.u(0, "\n", "compile(...)", str9, "input").matcher(str9);
        if (matcher10.find()) {
            ArrayList arrayList12 = new ArrayList(10);
            int iC10 = 0;
            do {
                iC10 = p.c(matcher10, str9, iC10, arrayList12);
            } while (matcher10.find());
            p.B(iC10, str9, arrayList12);
            listK10 = arrayList12;
        } else {
            listK10 = o.K(str9.toString());
        }
        if (!listK10.isEmpty()) {
            ListIterator listIterator10 = listK10.listIterator(listK10.size());
            while (true) {
                if (!listIterator10.hasPrevious()) {
                    listT10 = listT28;
                    break;
                } else if (((String) listIterator10.previous()).length() != 0) {
                    listT10 = e0.t(listIterator10, 1, listK10);
                    break;
                }
            }
        } else {
            listT10 = listT28;
            break;
        }
        String[] strArr10 = (String[]) listT10.toArray(new String[0]);
        DESyllableAdapter1 dESyllableAdapter3 = new DESyllableAdapter1(R.layout.de_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr10, strArr10.length)));
        ((m) j()).f32885i.setLayoutManager(new LinearLayoutManager(1));
        ((m) j()).f32885i.setAdapter(dESyllableAdapter3);
        y(dESyllableAdapter3);
        String str10 = this.Z;
        Matcher matcher11 = e0.u(0, "\n", "compile(...)", str10, "input").matcher(str10);
        if (matcher11.find()) {
            ArrayList arrayList13 = new ArrayList(10);
            int iC11 = 0;
            do {
                iC11 = p.c(matcher11, str10, iC11, arrayList13);
            } while (matcher11.find());
            p.B(iC11, str10, arrayList13);
            listK11 = arrayList13;
        } else {
            listK11 = o.K(str10.toString());
        }
        if (!listK11.isEmpty()) {
            ListIterator listIterator11 = listK11.listIterator(listK11.size());
            while (true) {
                if (!listIterator11.hasPrevious()) {
                    listT11 = listT28;
                    break;
                } else if (((String) listIterator11.previous()).length() != 0) {
                    listT11 = e0.t(listIterator11, 1, listK11);
                    break;
                }
            }
        } else {
            listT11 = listT28;
            break;
        }
        String[] strArr11 = (String[]) listT11.toArray(new String[0]);
        ESSyllableAdapter2 eSSyllableAdapter8 = new ESSyllableAdapter2(R.layout.es_syllable_table_item_2, Arrays.asList(Arrays.copyOf(strArr11, strArr11.length)));
        ((m) p0.u(2, ((m) j()).f32886j, this)).f32886j.setAdapter(eSSyllableAdapter8);
        y(eSSyllableAdapter8);
        String str11 = this.f21771a0;
        Matcher matcher12 = e0.u(0, "\n", "compile(...)", str11, "input").matcher(str11);
        if (matcher12.find()) {
            ArrayList arrayList14 = new ArrayList(10);
            int iC12 = 0;
            do {
                iC12 = p.c(matcher12, str11, iC12, arrayList14);
            } while (matcher12.find());
            p.B(iC12, str11, arrayList14);
            listK12 = arrayList14;
        } else {
            listK12 = o.K(str11.toString());
        }
        if (!listK12.isEmpty()) {
            ListIterator listIterator12 = listK12.listIterator(listK12.size());
            while (true) {
                if (!listIterator12.hasPrevious()) {
                    listT12 = listT28;
                    break;
                } else if (((String) listIterator12.previous()).length() != 0) {
                    listT12 = e0.t(listIterator12, 1, listK12);
                    break;
                }
            }
        } else {
            listT12 = listT28;
            break;
        }
        String[] strArr12 = (String[]) listT12.toArray(new String[0]);
        List listAsList3 = Arrays.asList(Arrays.copyOf(strArr12, strArr12.length));
        ArrayList arrayList15 = new ArrayList();
        arrayList15.add("dt");
        arrayList15.add("dt");
        arrayList15.add("Th");
        arrayList15.add("Th");
        ESSyllableAdapter1 eSSyllableAdapter9 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList3, arrayList15);
        ((m) p0.u(2, ((m) j()).f32888l, this)).f32888l.setAdapter(eSSyllableAdapter9);
        y(eSSyllableAdapter9);
        String str12 = this.f21772b0;
        Matcher matcher13 = e0.u(0, "\n", "compile(...)", str12, "input").matcher(str12);
        if (matcher13.find()) {
            ArrayList arrayList16 = new ArrayList(10);
            int iC13 = 0;
            do {
                iC13 = p.c(matcher13, str12, iC13, arrayList16);
            } while (matcher13.find());
            p.B(iC13, str12, arrayList16);
            listK13 = arrayList16;
        } else {
            listK13 = o.K(str12.toString());
        }
        if (!listK13.isEmpty()) {
            ListIterator listIterator13 = listK13.listIterator(listK13.size());
            while (true) {
                if (!listIterator13.hasPrevious()) {
                    listT13 = listT28;
                    break;
                } else if (((String) listIterator13.previous()).length() != 0) {
                    listT13 = e0.t(listIterator13, 1, listK13);
                    break;
                }
            }
        } else {
            listT13 = listT28;
            break;
        }
        String[] strArr13 = (String[]) listT13.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter10 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr13, strArr13.length)), w4.c.l("Ph"));
        ((m) p0.u(2, ((m) j()).m, this)).m.setAdapter(eSSyllableAdapter10);
        y(eSSyllableAdapter10);
        String str13 = this.f21773c0;
        Matcher matcher14 = e0.u(0, "\n", "compile(...)", str13, "input").matcher(str13);
        if (matcher14.find()) {
            ArrayList arrayList17 = new ArrayList(10);
            int iC14 = 0;
            do {
                iC14 = p.c(matcher14, str13, iC14, arrayList17);
            } while (matcher14.find());
            p.B(iC14, str13, arrayList17);
            listK14 = arrayList17;
        } else {
            listK14 = o.K(str13.toString());
        }
        if (!listK14.isEmpty()) {
            ListIterator listIterator14 = listK14.listIterator(listK14.size());
            while (true) {
                if (!listIterator14.hasPrevious()) {
                    listT14 = listT28;
                    break;
                } else if (((String) listIterator14.previous()).length() != 0) {
                    listT14 = e0.t(listIterator14, 1, listK14);
                    break;
                }
            }
        } else {
            listT14 = listT28;
            break;
        }
        String[] strArr14 = (String[]) listT14.toArray(new String[0]);
        List listAsList4 = Arrays.asList(Arrays.copyOf(strArr14, strArr14.length));
        ArrayList arrayList18 = new ArrayList();
        arrayList18.add("tz");
        arrayList18.add("tz");
        arrayList18.add("ts");
        arrayList18.add("ts");
        ESSyllableAdapter1 eSSyllableAdapter11 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList4, arrayList18);
        ((m) p0.u(2, ((m) j()).f32889n, this)).f32889n.setAdapter(eSSyllableAdapter11);
        y(eSSyllableAdapter11);
        String str14 = this.f21774d0;
        Matcher matcher15 = e0.u(0, "\n", "compile(...)", str14, "input").matcher(str14);
        if (matcher15.find()) {
            ArrayList arrayList19 = new ArrayList(10);
            int iC15 = 0;
            do {
                iC15 = p.c(matcher15, str14, iC15, arrayList19);
            } while (matcher15.find());
            p.B(iC15, str14, arrayList19);
            listK15 = arrayList19;
        } else {
            listK15 = o.K(str14.toString());
        }
        if (!listK15.isEmpty()) {
            ListIterator listIterator15 = listK15.listIterator(listK15.size());
            while (true) {
                if (!listIterator15.hasPrevious()) {
                    listT15 = listT28;
                    break;
                } else if (((String) listIterator15.previous()).length() != 0) {
                    listT15 = e0.t(listIterator15, 1, listK15);
                    break;
                }
            }
        } else {
            listT15 = listT28;
            break;
        }
        String[] strArr15 = (String[]) listT15.toArray(new String[0]);
        List listAsList5 = Arrays.asList(Arrays.copyOf(strArr15, strArr15.length));
        ArrayList arrayList20 = new ArrayList();
        arrayList20.add("chs");
        arrayList20.add("chs");
        arrayList20.add("x");
        arrayList20.add("x");
        ESSyllableAdapter1 eSSyllableAdapter12 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList5, arrayList20);
        ((m) p0.u(2, ((m) j()).f32890o, this)).f32890o.setAdapter(eSSyllableAdapter12);
        y(eSSyllableAdapter12);
        String str15 = this.f21775e0;
        Matcher matcher16 = e0.u(0, "\n", "compile(...)", str15, "input").matcher(str15);
        if (matcher16.find()) {
            ArrayList arrayList21 = new ArrayList(10);
            int iC16 = 0;
            do {
                iC16 = p.c(matcher16, str15, iC16, arrayList21);
            } while (matcher16.find());
            p.B(iC16, str15, arrayList21);
            listK16 = arrayList21;
        } else {
            listK16 = o.K(str15.toString());
        }
        if (!listK16.isEmpty()) {
            ListIterator listIterator16 = listK16.listIterator(listK16.size());
            while (true) {
                if (!listIterator16.hasPrevious()) {
                    listT16 = listT28;
                    break;
                } else if (((String) listIterator16.previous()).length() != 0) {
                    listT16 = e0.t(listIterator16, 1, listK16);
                    break;
                }
            }
        } else {
            listT16 = listT28;
            break;
        }
        String[] strArr16 = (String[]) listT16.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter13 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr16, strArr16.length)), w4.c.l("ch"));
        ((m) p0.u(2, ((m) j()).f32882f, this)).f32882f.setAdapter(eSSyllableAdapter13);
        y(eSSyllableAdapter13);
        String str16 = this.f21776f0;
        Matcher matcher17 = e0.u(0, "\n", "compile(...)", str16, "input").matcher(str16);
        if (matcher17.find()) {
            ArrayList arrayList22 = new ArrayList(10);
            int iC17 = 0;
            do {
                iC17 = p.c(matcher17, str16, iC17, arrayList22);
            } while (matcher17.find());
            p.B(iC17, str16, arrayList22);
            listK17 = arrayList22;
        } else {
            listK17 = o.K(str16.toString());
        }
        if (!listK17.isEmpty()) {
            ListIterator listIterator17 = listK17.listIterator(listK17.size());
            while (true) {
                if (!listIterator17.hasPrevious()) {
                    listT17 = listT28;
                    break;
                } else if (((String) listIterator17.previous()).length() != 0) {
                    listT17 = e0.t(listIterator17, 1, listK17);
                    break;
                }
            }
        } else {
            listT17 = listT28;
            break;
        }
        String[] strArr17 = (String[]) listT17.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter14 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr17, strArr17.length)), w4.c.l("ch"));
        ((m) p0.u(2, ((m) j()).f32883g, this)).f32883g.setAdapter(eSSyllableAdapter14);
        y(eSSyllableAdapter14);
        String str17 = this.f21777g0;
        Matcher matcher18 = e0.u(0, "\n", "compile(...)", str17, "input").matcher(str17);
        if (matcher18.find()) {
            ArrayList arrayList23 = new ArrayList(10);
            int iC18 = 0;
            do {
                iC18 = p.c(matcher18, str17, iC18, arrayList23);
            } while (matcher18.find());
            p.B(iC18, str17, arrayList23);
            listK18 = arrayList23;
        } else {
            listK18 = o.K(str17.toString());
        }
        if (!listK18.isEmpty()) {
            ListIterator listIterator18 = listK18.listIterator(listK18.size());
            while (true) {
                if (!listIterator18.hasPrevious()) {
                    listT18 = listT28;
                    break;
                } else if (((String) listIterator18.previous()).length() != 0) {
                    listT18 = e0.t(listIterator18, 1, listK18);
                    break;
                }
            }
        } else {
            listT18 = listT28;
            break;
        }
        String[] strArr18 = (String[]) listT18.toArray(new String[0]);
        List listAsList6 = Arrays.asList(Arrays.copyOf(strArr18, strArr18.length));
        ArrayList arrayList24 = new ArrayList();
        arrayList24.add("b");
        arrayList24.add("d");
        arrayList24.add("g");
        ESSyllableAdapter1 eSSyllableAdapter15 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList6, arrayList24);
        ((m) p0.u(2, ((m) j()).f32880d, this)).f32880d.setAdapter(eSSyllableAdapter15);
        y(eSSyllableAdapter15);
        String str18 = this.f21778h0;
        Matcher matcher19 = e0.u(0, "\n", "compile(...)", str18, "input").matcher(str18);
        if (matcher19.find()) {
            ArrayList arrayList25 = new ArrayList(10);
            int iC19 = 0;
            do {
                iC19 = p.c(matcher19, str18, iC19, arrayList25);
            } while (matcher19.find());
            p.B(iC19, str18, arrayList25);
            listK19 = arrayList25;
        } else {
            listK19 = o.K(str18.toString());
        }
        if (!listK19.isEmpty()) {
            ListIterator listIterator19 = listK19.listIterator(listK19.size());
            while (true) {
                if (!listIterator19.hasPrevious()) {
                    listT19 = listT28;
                    break;
                } else if (((String) listIterator19.previous()).length() != 0) {
                    listT19 = e0.t(listIterator19, 1, listK19);
                    break;
                }
            }
        } else {
            listT19 = listT28;
            break;
        }
        String[] strArr19 = (String[]) listT19.toArray(new String[0]);
        List listAsList7 = Arrays.asList(Arrays.copyOf(strArr19, strArr19.length));
        ArrayList arrayList26 = new ArrayList();
        arrayList26.add("b");
        arrayList26.add("D");
        arrayList26.add("G");
        ESSyllableAdapter1 eSSyllableAdapter16 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList7, arrayList26);
        ((m) p0.u(2, ((m) j()).f32881e, this)).f32881e.setAdapter(eSSyllableAdapter16);
        y(eSSyllableAdapter16);
        String str19 = this.f21779i0;
        Matcher matcher20 = e0.u(0, "\n", "compile(...)", str19, "input").matcher(str19);
        if (matcher20.find()) {
            ArrayList arrayList27 = new ArrayList(10);
            int iC20 = 0;
            do {
                iC20 = p.c(matcher20, str19, iC20, arrayList27);
            } while (matcher20.find());
            p.B(iC20, str19, arrayList27);
            listK20 = arrayList27;
        } else {
            listK20 = o.K(str19.toString());
        }
        if (!listK20.isEmpty()) {
            ListIterator listIterator20 = listK20.listIterator(listK20.size());
            while (true) {
                if (!listIterator20.hasPrevious()) {
                    listT20 = listT28;
                    break;
                } else if (((String) listIterator20.previous()).length() != 0) {
                    listT20 = e0.t(listIterator20, 1, listK20);
                    break;
                }
            }
        } else {
            listT20 = listT28;
            break;
        }
        String[] strArr20 = (String[]) listT20.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter17 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr20, strArr20.length)), p0.r("s", "S"));
        ((m) p0.u(2, ((m) j()).f32901z, this)).f32901z.setAdapter(eSSyllableAdapter17);
        y(eSSyllableAdapter17);
        String str20 = this.f21780j0;
        Matcher matcher21 = e0.u(0, "\n", "compile(...)", str20, "input").matcher(str20);
        if (matcher21.find()) {
            ArrayList arrayList28 = new ArrayList(10);
            int iC21 = 0;
            do {
                iC21 = p.c(matcher21, str20, iC21, arrayList28);
            } while (matcher21.find());
            p.B(iC21, str20, arrayList28);
            listK21 = arrayList28;
        } else {
            listK21 = o.K(str20.toString());
        }
        if (!listK21.isEmpty()) {
            ListIterator listIterator21 = listK21.listIterator(listK21.size());
            while (true) {
                if (!listIterator21.hasPrevious()) {
                    listT21 = listT28;
                    break;
                } else if (((String) listIterator21.previous()).length() != 0) {
                    listT21 = e0.t(listIterator21, 1, listK21);
                    break;
                }
            }
        } else {
            listT21 = listT28;
            break;
        }
        String[] strArr21 = (String[]) listT21.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter18 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr21, strArr21.length)), w4.c.l("s"));
        ((m) p0.u(2, ((m) j()).A, this)).A.setAdapter(eSSyllableAdapter18);
        y(eSSyllableAdapter18);
        String str21 = this.f21781k0;
        Matcher matcher22 = e0.u(0, "\n", "compile(...)", str21, "input").matcher(str21);
        if (matcher22.find()) {
            ArrayList arrayList29 = new ArrayList(10);
            int iC22 = 0;
            do {
                iC22 = p.c(matcher22, str21, iC22, arrayList29);
            } while (matcher22.find());
            p.B(iC22, str21, arrayList29);
            listK22 = arrayList29;
        } else {
            listK22 = o.K(str21.toString());
        }
        if (!listK22.isEmpty()) {
            ListIterator listIterator22 = listK22.listIterator(listK22.size());
            while (true) {
                if (!listIterator22.hasPrevious()) {
                    listT22 = listT28;
                    break;
                } else if (((String) listIterator22.previous()).length() != 0) {
                    listT22 = e0.t(listIterator22, 1, listK22);
                    break;
                }
            }
        } else {
            listT22 = listT28;
            break;
        }
        String[] strArr22 = (String[]) listT22.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter19 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr22, strArr22.length)), w4.c.l("ß"));
        ((m) p0.u(2, ((m) j()).B, this)).B.setAdapter(eSSyllableAdapter19);
        y(eSSyllableAdapter19);
        String str22 = this.f21782l0;
        Matcher matcher23 = e0.u(0, "\n", "compile(...)", str22, "input").matcher(str22);
        if (matcher23.find()) {
            ArrayList arrayList30 = new ArrayList(10);
            int iC23 = 0;
            do {
                iC23 = p.c(matcher23, str22, iC23, arrayList30);
            } while (matcher23.find());
            p.B(iC23, str22, arrayList30);
            listK23 = arrayList30;
        } else {
            listK23 = o.K(str22.toString());
        }
        if (!listK23.isEmpty()) {
            ListIterator listIterator23 = listK23.listIterator(listK23.size());
            while (true) {
                if (!listIterator23.hasPrevious()) {
                    listT23 = listT28;
                    break;
                } else if (((String) listIterator23.previous()).length() != 0) {
                    listT23 = e0.t(listIterator23, 1, listK23);
                    break;
                }
            }
        } else {
            listT23 = listT28;
            break;
        }
        String[] strArr23 = (String[]) listT23.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter20 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr23, strArr23.length)), p0.r("St", "Sp"));
        ((m) p0.u(2, ((m) j()).D, this)).D.setAdapter(eSSyllableAdapter20);
        y(eSSyllableAdapter20);
        String str23 = this.f21783m0;
        Matcher matcher24 = e0.u(0, "\n", "compile(...)", str23, "input").matcher(str23);
        if (matcher24.find()) {
            ArrayList arrayList31 = new ArrayList(10);
            int iC24 = 0;
            do {
                iC24 = p.c(matcher24, str23, iC24, arrayList31);
            } while (matcher24.find());
            p.B(iC24, str23, arrayList31);
            listK24 = arrayList31;
        } else {
            listK24 = o.K(str23.toString());
        }
        if (!listK24.isEmpty()) {
            ListIterator listIterator24 = listK24.listIterator(listK24.size());
            while (true) {
                if (!listIterator24.hasPrevious()) {
                    listT24 = listT28;
                    break;
                } else if (((String) listIterator24.previous()).length() != 0) {
                    listT24 = e0.t(listIterator24, 1, listK24);
                    break;
                }
            }
        } else {
            listT24 = listT28;
            break;
        }
        String[] strArr24 = (String[]) listT24.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter21 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr24, strArr24.length)), p0.r("st", "sp"));
        ((m) p0.u(2, ((m) j()).E, this)).E.setAdapter(eSSyllableAdapter21);
        y(eSSyllableAdapter21);
        String str24 = this.f21784n0;
        Matcher matcher25 = e0.u(0, "\n", "compile(...)", str24, "input").matcher(str24);
        if (matcher25.find()) {
            ArrayList arrayList32 = new ArrayList(10);
            int iC25 = 0;
            do {
                iC25 = p.c(matcher25, str24, iC25, arrayList32);
            } while (matcher25.find());
            p.B(iC25, str24, arrayList32);
            listK25 = arrayList32;
        } else {
            listK25 = o.K(str24.toString());
        }
        if (!listK25.isEmpty()) {
            ListIterator listIterator25 = listK25.listIterator(listK25.size());
            while (true) {
                if (!listIterator25.hasPrevious()) {
                    listT25 = listT28;
                    break;
                } else if (((String) listIterator25.previous()).length() != 0) {
                    listT25 = e0.t(listIterator25, 1, listK25);
                    break;
                }
            }
        } else {
            listT25 = listT28;
            break;
        }
        String[] strArr25 = (String[]) listT25.toArray(new String[0]);
        List listAsList8 = Arrays.asList(Arrays.copyOf(strArr25, strArr25.length));
        ArrayList arrayList33 = new ArrayList();
        arrayList33.add("Pf");
        arrayList33.add("Pf");
        arrayList33.add("Kn");
        arrayList33.add("Kn");
        ESSyllableAdapter1 eSSyllableAdapter22 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList8, arrayList33);
        ((m) p0.u(2, ((m) j()).f32894s, this)).f32894s.setAdapter(eSSyllableAdapter22);
        y(eSSyllableAdapter22);
        String str25 = this.f21785o0;
        Matcher matcher26 = e0.u(0, "\n", "compile(...)", str25, "input").matcher(str25);
        if (matcher26.find()) {
            ArrayList arrayList34 = new ArrayList(10);
            int iC26 = 0;
            do {
                iC26 = p.c(matcher26, str25, iC26, arrayList34);
            } while (matcher26.find());
            p.B(iC26, str25, arrayList34);
            listK26 = arrayList34;
        } else {
            listK26 = o.K(str25.toString());
        }
        if (!listK26.isEmpty()) {
            ListIterator listIterator26 = listK26.listIterator(listK26.size());
            while (true) {
                if (!listIterator26.hasPrevious()) {
                    listT26 = listT28;
                    break;
                } else if (((String) listIterator26.previous()).length() != 0) {
                    listT26 = e0.t(listIterator26, 1, listK26);
                    break;
                }
            }
        } else {
            listT26 = listT28;
            break;
        }
        String[] strArr26 = (String[]) listT26.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter23 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr26, strArr26.length)), w4.c.l("ng"));
        ((m) p0.u(2, ((m) j()).f32893r, this)).f32893r.setAdapter(eSSyllableAdapter23);
        y(eSSyllableAdapter23);
        String str26 = this.f21786p0;
        Matcher matcher27 = e0.u(0, "\n", "compile(...)", str26, "input").matcher(str26);
        if (matcher27.find()) {
            ArrayList arrayList35 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList35.add(str26.subSequence(iEnd, matcher27.start()).toString());
                iEnd = matcher27.end();
            } while (matcher27.find());
            arrayList35.add(str26.subSequence(iEnd, str26.length()).toString());
            listK27 = arrayList35;
        } else {
            listK27 = o.K(str26.toString());
        }
        if (!listK27.isEmpty()) {
            ListIterator listIterator27 = listK27.listIterator(listK27.size());
            while (true) {
                if (!listIterator27.hasPrevious()) {
                    listT27 = listT28;
                    break;
                } else if (((String) listIterator27.previous()).length() != 0) {
                    listT27 = e0.t(listIterator27, 1, listK27);
                    break;
                }
            }
        } else {
            listT27 = listT28;
            break;
        }
        String[] strArr27 = (String[]) listT27.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter24 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr27, strArr27.length)), w4.c.l("Qu"));
        ((m) p0.u(2, ((m) j()).f32895t, this)).f32895t.setAdapter(eSSyllableAdapter24);
        y(eSSyllableAdapter24);
        String str27 = this.f21787q0;
        Matcher matcher28 = e0.u(0, "\n", "compile(...)", str27, "input").matcher(str27);
        if (matcher28.find()) {
            ArrayList arrayList36 = new ArrayList(10);
            int iEnd2 = 0;
            do {
                arrayList36.add(str27.subSequence(iEnd2, matcher28.start()).toString());
                iEnd2 = matcher28.end();
            } while (matcher28.find());
            arrayList36.add(str27.subSequence(iEnd2, str27.length()).toString());
            listK28 = arrayList36;
        } else {
            listK28 = o.K(str27.toString());
        }
        if (!listK28.isEmpty()) {
            ListIterator listIterator28 = listK28.listIterator(listK28.size());
            while (listIterator28.hasPrevious()) {
                if (((String) listIterator28.previous()).length() != 0) {
                    listT28 = e0.t(listIterator28, 1, listK28);
                    break;
                }
            }
        }
        String[] strArr28 = (String[]) listT28.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter25 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr28, strArr28.length)), p0.r("w", "W"));
        ((m) p0.u(2, ((m) j()).M, this)).M.setAdapter(eSSyllableAdapter25);
        y(eSSyllableAdapter25);
        F();
        G();
        w();
        x();
        D();
        H();
        I();
        z();
        A();
        B();
        C();
        u();
        if (q.v0("release", "debug", false)) {
            ((m) j()).f32879c.setOnLongClickListener(new fk.c(this, 4));
        }
    }

    public final void u() {
        File file = new File(e.m(xt.b.a().b(), fv.b.D(-1L)));
        fv.a aVar = new fv.a(0L, fv.b.E(-1L), fv.b.D(-1L));
        if (!file.exists()) {
            e3 e3Var = ((m) j()).f32878b;
            LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
            ComposeView composeView = (ComposeView) e3Var.f32524c;
            ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
            linearLayout.setVisibility(0);
            this.C0.d(aVar, new aj.e(this, 12));
            return;
        }
        d dVarM = new yx.a(new bo.c(file, 2), 0).M(ky.e.f38937b);
        qx.o oVarA = px.b.a();
        xx.d dVar = new xx.d(vx.b.f54316e, new mj.b(this));
        try {
            dVarM.K(new yx.b(dVar, oVarA));
            j.a(dVar, this.f36391f);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    public final void v(String status, boolean z11) {
        kotlin.jvm.internal.m.f(status, "status");
        e3 e3Var = ((m) j()).f32878b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }

    public final void w() {
        List listK;
        Collection collectionT;
        String str = this.f21790t0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), w4.c.l("ig"));
        ((m) p0.u(2, ((m) j()).f32891p, this)).f32891p.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }

    public final void x() {
        List listK;
        Collection collectionT;
        String str = this.f21791u0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), w4.c.l("ige"));
        ((m) p0.u(2, ((m) j()).f32892q, this)).f32892q.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }

    public final void y(BaseQuickAdapter baseQuickAdapter) {
        baseQuickAdapter.setOnItemChildClickListener(new mj.b(this));
    }

    public final void z() {
        List listK;
        Collection collectionT;
        String str = this.f21795y0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), p0.r("Ra", "rau"));
        ((m) p0.u(2, ((m) j()).f32896u, this)).f32896u.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }

    public final void E() {
        List listK;
        Collection collectionT;
        String str = this.R;
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
        List listAsList = Arrays.asList(Arrays.copyOf(strArr, strArr.length));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("auf");
        arrayList2.add("ein");
        arrayList2.add(kHfjNGauVgdF.WaUNlb);
        arrayList2.add("mit");
        arrayList2.add("un");
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList, arrayList2);
        ((m) p0.u(3, ((m) j()).G, this)).G.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }

    public final void I() {
        List listK;
        Collection collectionT;
        String str = kHfjNGauVgdF.HTMkDNoqHnkUl;
        String str2 = this.f21794x0;
        Matcher matcher = e0.u(0, str, "compile(...)", str2, "input").matcher(str2);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str2, iC, arrayList);
            } while (matcher.find());
            p.B(iC, str2, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str2.toString());
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), w4.c.l("Y"));
        ((m) p0.u(2, ((m) j()).Q, this)).Q.setAdapter(eSSyllableAdapter1);
        y(eSSyllableAdapter1);
    }
}
