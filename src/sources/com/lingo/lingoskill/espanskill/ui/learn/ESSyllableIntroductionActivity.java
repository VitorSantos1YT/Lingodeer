package com.lingo.lingoskill.espanskill.ui.learn;

import a9.i;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import androidx.recyclerview.widget.LinearLayoutManager;
import b7.e0;
import c20.a;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.espanskill.ui.learn.adapter.ESSyllableAdapter1;
import com.lingo.lingoskill.espanskill.ui.learn.adapter.ESSyllableAdapter2;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fk.e;
import fv.c;
import hh.p0;
import hj.e3;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import ji.b;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import oz.q;
import ry.r;
import th.j;
import yx.d;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ESSyllableIntroductionActivity extends b {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f21802y0 = 0;
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
    public final String f21803a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final String f21804b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final String f21805c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final String f21806d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f21807e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final String f21808f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String f21809g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final String f21810h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final String f21811i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final String f21812j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final String f21813k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final String f21814l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final String f21815m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final String f21816n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final String f21817o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f21818p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f21819q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f21820r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f21821s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f21822t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final c f21823u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f21824v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final a f21825w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final i f21826x0;

    public ESSyllableIntroductionActivity() {
        super("AlphabetIntro", e.f27337a);
        this.P = "A a\nB b\nC c\nCH ch\nD d\nE e\nF f\nG g\nH h\nI i\nJ j\nK k\nL l\nLL ll\nM m\nN n\nÑ ñ\nO o\nP p\nQ q\nR r\nS s\nT t\nU u\nV v\nW w\nX x\nY y\nZ z";
        this.Q = "D\tdos\nN\tnada\nF\tfavor\nP\tpadre\nJ\trojo\nS\tsegundo\nK\tkilo\nT\ttarta\nL\tleche\nW\tkiwi\nM\tmesa\nY\tyo";
        this.R = "ai\tbailar\nia\tpiano\nei\tseis\nie\tsiete\noi\tsois\nio\tarmario\noi\thoy\nui\tmuy\niu\tciudad\nau\tautobús\nua\tagua\neu\teuro\nue\tbueno\nou\tbou\nuo\tantiguo";
        this.S = "iai\testudiáis\nuai/uay\tUruguay\niei\tcambiéis\nuei/üei\taverigüéis";
        this.T = "pl\tplato\npr\tprofesor\nbl\tblanco\nbr\tlibro\ncl\tclase\ncr\tescritorio\ngl\tinglés\ngr\tnegro\ntl\tatlántico\ntr\ttres\nfl\tflor\nfr\tfresco\ndr\tmadre";
        this.U = "papá\nmédico";
        this.V = "pirata\namigo";
        this.W = "profesor\nespañol\njoven\nmuchos";
        this.X = "bueno\nestudiante";
        this.Y = "beso\nvino\nambos\nen vano";
        this.Z = "lobo\nllave";
        this.f21803a0 = "cama\ncosa\ncuna";
        this.f21804b0 = "qué\nalquilar";
        this.f21805c0 = "acción\ntécnico\ncontacto\nanécdota";
        this.f21806d0 = "ch + a = cha\tchaqueta\nch + o = cho\tchocolate\nch + e = che\tleche\nch + u = chu\tlechuza\nch + i = chi\tmochila";
        this.f21807e0 = "gato\nagosto\nalguno";
        this.f21808f0 = "juguete\nseguir";
        this.f21809g0 = "ligero\ngimnasio";
        this.f21810h0 = "cigüeña\npingüino";
        this.f21811i0 = "hombre\nhospital";
        this.f21812j0 = "niño\nespañol";
        this.f21813k0 = "caro\ntener";
        this.f21814l0 = "rico\nalrededor\nperro";
        this.f21815m0 = "llave [ES]\nllevar [ES]\npollito [ES]\nllave [MX]\nllevar [MX]\npollito [MX]\nllorar [ES]\nlluvia [ES]\n \nllorar [MX]\nlluvia [MX]\n \n";
        this.f21816n0 = "j + a = ja\troja\nj + o = jo\tconejo\nj + e = je\tjefe\nj + u = ju\tjugar\nj + i = ji\tjirafa";
        this.f21817o0 = "xilófono\nxenófobo";
        this.f21818p0 = "examen\néxito";
        this.f21819q0 = "texto\nexplicar";
        this.f21820r0 = "México\nmexicano";
        this.f21821s0 = "manzana [ES]\nmarzo [ES]\nzumo [ES]\nmanzana [MX]\nmarzo [MX]\nzumo [MX]";
        this.f21822t0 = "princesa [ES]\npríncipe [ES]\nprincesa [MX]\npríncipe [MX]";
        this.f21823u0 = new c();
        a aVar = new a(2, false);
        HashMap map = new HashMap();
        aVar.f6510b = map;
        map.clear();
        for (String str : "á\ta1\né\te1\ní\ti1\nó\to1\nú\tu1\nñ\tn1\nÁ\ta1\nÉ\te1\nÍ\ti1\nÓ\to1\nÚ\tu1\nÑ\tn1\nü\tv1\nllave (es)\t1\nllevar (es)\t2\npollito (es)\t3\nllorar (es)\t4\nlluvia (es)\t5\nmanzana (es)\t6\nmarzo (es)\t7\nzumo (es)\t8\nprincesa (es)\t9\npríncipe (es)\t10\nllave (mx)\t11\nllevar (mx)\t12\npollito (mx)\t13\nllorar (mx)\t14\nlluvia (mx)\t15\nmanzana (mx)\t16\nmarzo (mx)\t17\nzumo (mx)\t18\nprincesa (mx)\t19\npríncipe (mx)\t20".split("\n")) {
            String[] strArrSplit = str.split("\t");
            aVar.f6510b.put(strArrSplit[0], strArrSplit[1]);
        }
        this.f21825w0 = aVar;
        this.f21826x0 = new i(1);
    }

    public final void A() {
        List listK;
        Collection collectionT;
        String str = this.f21822t0;
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
        arrayList2.add("ce");
        arrayList2.add("ci");
        arrayList2.add("ce");
        arrayList2.add("ci");
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList, arrayList2);
        ((hj.p) ep.a.t(2, ((hj.p) j()).H, this)).H.setAdapter(eSSyllableAdapter1);
        w(eSSyllableAdapter1);
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f21823u0.a(this.f21824v0);
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
        String string = getString(R.string.alphabet);
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
        List listT27 = r.f50854a;
        if (!zIsEmpty) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listT = listT27;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    listT = e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            listT = listT27;
            break;
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), null);
        ((hj.p) ep.a.t(5, ((hj.p) j()).f33073w, this)).f33073w.setAdapter(eSSyllableAdapter1);
        w(eSSyllableAdapter1);
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
                    listT2 = listT27;
                    break;
                } else if (((String) listIterator2.previous()).length() != 0) {
                    listT2 = e0.t(listIterator2, 1, listK2);
                    break;
                }
            }
        } else {
            listT2 = listT27;
            break;
        }
        String[] strArr2 = (String[]) listT2.toArray(new String[0]);
        ESSyllableAdapter2 eSSyllableAdapter2 = new ESSyllableAdapter2(R.layout.es_syllable_table_item_2, Arrays.asList(Arrays.copyOf(strArr2, strArr2.length)));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33059h, this)).f33059h.setAdapter(eSSyllableAdapter2);
        w(eSSyllableAdapter2);
        String str3 = this.R;
        Matcher matcher3 = e0.u(0, "\n", "compile(...)", str3, "input").matcher(str3);
        if (matcher3.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iC3 = 0;
            do {
                iC3 = p.c(matcher3, str3, iC3, arrayList3);
            } while (matcher3.find());
            p.B(iC3, str3, arrayList3);
            listK3 = arrayList3;
        } else {
            listK3 = o.K(str3.toString());
        }
        if (!listK3.isEmpty()) {
            ListIterator listIterator3 = listK3.listIterator(listK3.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT3 = listT27;
                    break;
                } else if (((String) listIterator3.previous()).length() != 0) {
                    listT3 = e0.t(listIterator3, 1, listK3);
                    break;
                }
            }
        } else {
            listT3 = listT27;
            break;
        }
        String[] strArr3 = (String[]) listT3.toArray(new String[0]);
        ESSyllableAdapter2 eSSyllableAdapter3 = new ESSyllableAdapter2(R.layout.es_syllable_table_item_2, Arrays.asList(Arrays.copyOf(strArr3, strArr3.length)));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33063l, this)).f33063l.setAdapter(eSSyllableAdapter3);
        w(eSSyllableAdapter3);
        String str4 = this.S;
        Matcher matcher4 = e0.u(0, "\n", "compile(...)", str4, "input").matcher(str4);
        if (matcher4.find()) {
            ArrayList arrayList4 = new ArrayList(10);
            int iC4 = 0;
            do {
                iC4 = p.c(matcher4, str4, iC4, arrayList4);
            } while (matcher4.find());
            p.B(iC4, str4, arrayList4);
            listK4 = arrayList4;
        } else {
            listK4 = o.K(str4.toString());
        }
        if (!listK4.isEmpty()) {
            ListIterator listIterator4 = listK4.listIterator(listK4.size());
            while (true) {
                if (!listIterator4.hasPrevious()) {
                    listT4 = listT27;
                    break;
                } else if (((String) listIterator4.previous()).length() != 0) {
                    listT4 = e0.t(listIterator4, 1, listK4);
                    break;
                }
            }
        } else {
            listT4 = listT27;
            break;
        }
        String[] strArr4 = (String[]) listT4.toArray(new String[0]);
        ESSyllableAdapter2 eSSyllableAdapter4 = new ESSyllableAdapter2(R.layout.es_syllable_table_item_2, Arrays.asList(Arrays.copyOf(strArr4, strArr4.length)));
        ((hj.p) ep.a.t(1, ((hj.p) j()).f33074x, this)).f33074x.setAdapter(eSSyllableAdapter4);
        w(eSSyllableAdapter4);
        String str5 = this.T;
        Matcher matcher5 = e0.u(0, "\n", "compile(...)", str5, "input").matcher(str5);
        if (matcher5.find()) {
            ArrayList arrayList5 = new ArrayList(10);
            int iC5 = 0;
            do {
                iC5 = p.c(matcher5, str5, iC5, arrayList5);
            } while (matcher5.find());
            p.B(iC5, str5, arrayList5);
            listK5 = arrayList5;
        } else {
            listK5 = o.K(str5.toString());
        }
        if (!listK5.isEmpty()) {
            ListIterator listIterator5 = listK5.listIterator(listK5.size());
            while (true) {
                if (!listIterator5.hasPrevious()) {
                    listT5 = listT27;
                    break;
                } else if (((String) listIterator5.previous()).length() != 0) {
                    listT5 = e0.t(listIterator5, 1, listK5);
                    break;
                }
            }
        } else {
            listT5 = listT27;
            break;
        }
        String[] strArr5 = (String[]) listT5.toArray(new String[0]);
        ESSyllableAdapter2 eSSyllableAdapter5 = new ESSyllableAdapter2(R.layout.es_syllable_table_item_2, Arrays.asList(Arrays.copyOf(strArr5, strArr5.length)));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33058g, this)).f33058g.setAdapter(eSSyllableAdapter5);
        w(eSSyllableAdapter5);
        String str6 = this.U;
        Matcher matcher6 = e0.u(0, "\n", "compile(...)", str6, "input").matcher(str6);
        if (matcher6.find()) {
            ArrayList arrayList6 = new ArrayList(10);
            int iC6 = 0;
            do {
                iC6 = p.c(matcher6, str6, iC6, arrayList6);
            } while (matcher6.find());
            p.B(iC6, str6, arrayList6);
            listK6 = arrayList6;
        } else {
            listK6 = o.K(str6.toString());
        }
        if (!listK6.isEmpty()) {
            ListIterator listIterator6 = listK6.listIterator(listK6.size());
            while (true) {
                if (!listIterator6.hasPrevious()) {
                    listT6 = listT27;
                    break;
                } else if (((String) listIterator6.previous()).length() != 0) {
                    listT6 = e0.t(listIterator6, 1, listK6);
                    break;
                }
            }
        } else {
            listT6 = listT27;
            break;
        }
        String[] strArr6 = (String[]) listT6.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter6 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr6, strArr6.length)), p0.r("pá", "mé"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33075y, this)).f33075y.setAdapter(eSSyllableAdapter6);
        w(eSSyllableAdapter6);
        String str7 = this.V;
        Matcher matcher7 = e0.u(0, "\n", "compile(...)", str7, "input").matcher(str7);
        if (matcher7.find()) {
            ArrayList arrayList7 = new ArrayList(10);
            int iC7 = 0;
            do {
                iC7 = p.c(matcher7, str7, iC7, arrayList7);
            } while (matcher7.find());
            p.B(iC7, str7, arrayList7);
            listK7 = arrayList7;
        } else {
            listK7 = o.K(str7.toString());
        }
        if (!listK7.isEmpty()) {
            ListIterator listIterator7 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator7.hasPrevious()) {
                    listT7 = listT27;
                    break;
                } else if (((String) listIterator7.previous()).length() != 0) {
                    listT7 = e0.t(listIterator7, 1, listK7);
                    break;
                }
            }
        } else {
            listT7 = listT27;
            break;
        }
        String[] strArr7 = (String[]) listT7.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter7 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr7, strArr7.length)), p0.r("ra", "mi"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33076z, this)).f33076z.setAdapter(eSSyllableAdapter7);
        w(eSSyllableAdapter7);
        String str8 = this.W;
        Matcher matcher8 = e0.u(0, "\n", "compile(...)", str8, "input").matcher(str8);
        if (matcher8.find()) {
            ArrayList arrayList8 = new ArrayList(10);
            int iC8 = 0;
            do {
                iC8 = p.c(matcher8, str8, iC8, arrayList8);
            } while (matcher8.find());
            p.B(iC8, str8, arrayList8);
            listK8 = arrayList8;
        } else {
            listK8 = o.K(str8.toString());
        }
        if (!listK8.isEmpty()) {
            ListIterator listIterator8 = listK8.listIterator(listK8.size());
            while (true) {
                if (!listIterator8.hasPrevious()) {
                    listT8 = listT27;
                    break;
                } else if (((String) listIterator8.previous()).length() != 0) {
                    listT8 = e0.t(listIterator8, 1, listK8);
                    break;
                }
            }
        } else {
            listT8 = listT27;
            break;
        }
        String[] strArr8 = (String[]) listT8.toArray(new String[0]);
        List listAsList = Arrays.asList(Arrays.copyOf(strArr8, strArr8.length));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add("sor");
        arrayList9.add("ñol");
        arrayList9.add("jo");
        arrayList9.add("mu");
        ESSyllableAdapter1 eSSyllableAdapter8 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList, arrayList9);
        ((hj.p) ep.a.t(2, ((hj.p) j()).A, this)).A.setAdapter(eSSyllableAdapter8);
        w(eSSyllableAdapter8);
        String str9 = this.X;
        Matcher matcher9 = e0.u(0, "\n", "compile(...)", str9, "input").matcher(str9);
        if (matcher9.find()) {
            ArrayList arrayList10 = new ArrayList(10);
            int iC9 = 0;
            do {
                iC9 = p.c(matcher9, str9, iC9, arrayList10);
            } while (matcher9.find());
            p.B(iC9, str9, arrayList10);
            listK9 = arrayList10;
        } else {
            listK9 = o.K(str9.toString());
        }
        if (!listK9.isEmpty()) {
            ListIterator listIterator9 = listK9.listIterator(listK9.size());
            while (true) {
                if (!listIterator9.hasPrevious()) {
                    listT9 = listT27;
                    break;
                } else if (((String) listIterator9.previous()).length() != 0) {
                    listT9 = e0.t(listIterator9, 1, listK9);
                    break;
                }
            }
        } else {
            listT9 = listT27;
            break;
        }
        String[] strArr9 = (String[]) listT9.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter9 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr9, strArr9.length)), p0.r("e", "a"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).B, this)).B.setAdapter(eSSyllableAdapter9);
        w(eSSyllableAdapter9);
        String str10 = this.Y;
        Matcher matcher10 = e0.u(0, "\n", "compile(...)", str10, "input").matcher(str10);
        if (matcher10.find()) {
            ArrayList arrayList11 = new ArrayList(10);
            int iC10 = 0;
            do {
                iC10 = p.c(matcher10, str10, iC10, arrayList11);
            } while (matcher10.find());
            p.B(iC10, str10, arrayList11);
            listK10 = arrayList11;
        } else {
            listK10 = o.K(str10.toString());
        }
        if (!listK10.isEmpty()) {
            ListIterator listIterator10 = listK10.listIterator(listK10.size());
            while (true) {
                if (!listIterator10.hasPrevious()) {
                    listT10 = listT27;
                    break;
                } else if (((String) listIterator10.previous()).length() != 0) {
                    listT10 = e0.t(listIterator10, 1, listK10);
                    break;
                }
            }
        } else {
            listT10 = listT27;
            break;
        }
        String[] strArr10 = (String[]) listT10.toArray(new String[0]);
        List listAsList2 = Arrays.asList(Arrays.copyOf(strArr10, strArr10.length));
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add("b");
        arrayList12.add("v");
        arrayList12.add("b");
        arrayList12.add("v");
        ESSyllableAdapter1 eSSyllableAdapter10 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList2, arrayList12);
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33055d, this)).f33055d.setAdapter(eSSyllableAdapter10);
        w(eSSyllableAdapter10);
        String str11 = this.Z;
        Matcher matcher11 = e0.u(0, "\n", "compile(...)", str11, "input").matcher(str11);
        if (matcher11.find()) {
            ArrayList arrayList13 = new ArrayList(10);
            int iC11 = 0;
            do {
                iC11 = p.c(matcher11, str11, iC11, arrayList13);
            } while (matcher11.find());
            p.B(iC11, str11, arrayList13);
            listK11 = arrayList13;
        } else {
            listK11 = o.K(str11.toString());
        }
        if (!listK11.isEmpty()) {
            ListIterator listIterator11 = listK11.listIterator(listK11.size());
            while (true) {
                if (!listIterator11.hasPrevious()) {
                    listT11 = listT27;
                    break;
                } else if (((String) listIterator11.previous()).length() != 0) {
                    listT11 = e0.t(listIterator11, 1, listK11);
                    break;
                }
            }
        } else {
            listT11 = listT27;
            break;
        }
        String[] strArr11 = (String[]) listT11.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter11 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr11, strArr11.length)), p0.r("b", "v"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33056e, this)).f33056e.setAdapter(eSSyllableAdapter11);
        w(eSSyllableAdapter11);
        String str12 = this.f21803a0;
        Matcher matcher12 = e0.u(0, "\n", "compile(...)", str12, "input").matcher(str12);
        if (matcher12.find()) {
            ArrayList arrayList14 = new ArrayList(10);
            int iC12 = 0;
            do {
                iC12 = p.c(matcher12, str12, iC12, arrayList14);
            } while (matcher12.find());
            p.B(iC12, str12, arrayList14);
            listK12 = arrayList14;
        } else {
            listK12 = o.K(str12.toString());
        }
        if (!listK12.isEmpty()) {
            ListIterator listIterator12 = listK12.listIterator(listK12.size());
            while (true) {
                if (!listIterator12.hasPrevious()) {
                    listT12 = listT27;
                    break;
                } else if (((String) listIterator12.previous()).length() != 0) {
                    listT12 = e0.t(listIterator12, 1, listK12);
                    break;
                }
            }
        } else {
            listT12 = listT27;
            break;
        }
        String[] strArr12 = (String[]) listT12.toArray(new String[0]);
        List listAsList3 = Arrays.asList(Arrays.copyOf(strArr12, strArr12.length));
        ArrayList arrayList15 = new ArrayList();
        arrayList15.add("ca");
        arrayList15.add("co");
        arrayList15.add("cu");
        ESSyllableAdapter1 eSSyllableAdapter12 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList3, arrayList15);
        ((hj.p) ep.a.t(3, ((hj.p) j()).f33060i, this)).f33060i.setAdapter(eSSyllableAdapter12);
        w(eSSyllableAdapter12);
        String str13 = this.f21804b0;
        Matcher matcher13 = e0.u(0, "\n", "compile(...)", str13, "input").matcher(str13);
        if (matcher13.find()) {
            ArrayList arrayList16 = new ArrayList(10);
            int iC13 = 0;
            do {
                iC13 = p.c(matcher13, str13, iC13, arrayList16);
            } while (matcher13.find());
            p.B(iC13, str13, arrayList16);
            listK13 = arrayList16;
        } else {
            listK13 = o.K(str13.toString());
        }
        if (!listK13.isEmpty()) {
            ListIterator listIterator13 = listK13.listIterator(listK13.size());
            while (true) {
                if (!listIterator13.hasPrevious()) {
                    listT13 = listT27;
                    break;
                } else if (((String) listIterator13.previous()).length() != 0) {
                    listT13 = e0.t(listIterator13, 1, listK13);
                    break;
                }
            }
        } else {
            listT13 = listT27;
            break;
        }
        String[] strArr13 = (String[]) listT13.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter13 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr13, strArr13.length)), p0.r("qué", "qui"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33061j, this)).f33061j.setAdapter(eSSyllableAdapter13);
        w(eSSyllableAdapter13);
        String str14 = this.f21805c0;
        Matcher matcher14 = e0.u(0, "\n", "compile(...)", str14, "input").matcher(str14);
        if (matcher14.find()) {
            ArrayList arrayList17 = new ArrayList(10);
            int iC14 = 0;
            do {
                iC14 = p.c(matcher14, str14, iC14, arrayList17);
            } while (matcher14.find());
            p.B(iC14, str14, arrayList17);
            listK14 = arrayList17;
        } else {
            listK14 = o.K(str14.toString());
        }
        if (!listK14.isEmpty()) {
            ListIterator listIterator14 = listK14.listIterator(listK14.size());
            while (true) {
                if (!listIterator14.hasPrevious()) {
                    listT14 = listT27;
                    break;
                } else if (((String) listIterator14.previous()).length() != 0) {
                    listT14 = e0.t(listIterator14, 1, listK14);
                    break;
                }
            }
        } else {
            listT14 = listT27;
            break;
        }
        String[] strArr14 = (String[]) listT14.toArray(new String[0]);
        List listAsList4 = Arrays.asList(Arrays.copyOf(strArr14, strArr14.length));
        ArrayList arrayList18 = new ArrayList();
        arrayList18.add("cc");
        arrayList18.add("cn");
        arrayList18.add("ct");
        arrayList18.add("cd");
        ESSyllableAdapter1 eSSyllableAdapter14 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList4, arrayList18);
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33062k, this)).f33062k.setAdapter(eSSyllableAdapter14);
        w(eSSyllableAdapter14);
        String str15 = this.f21806d0;
        Matcher matcher15 = e0.u(0, "\n", "compile(...)", str15, "input").matcher(str15);
        if (matcher15.find()) {
            ArrayList arrayList19 = new ArrayList(10);
            int iC15 = 0;
            do {
                iC15 = p.c(matcher15, str15, iC15, arrayList19);
            } while (matcher15.find());
            p.B(iC15, str15, arrayList19);
            listK15 = arrayList19;
        } else {
            listK15 = o.K(str15.toString());
        }
        if (!listK15.isEmpty()) {
            ListIterator listIterator15 = listK15.listIterator(listK15.size());
            while (true) {
                if (!listIterator15.hasPrevious()) {
                    listT15 = listT27;
                    break;
                } else if (((String) listIterator15.previous()).length() != 0) {
                    listT15 = e0.t(listIterator15, 1, listK15);
                    break;
                }
            }
        } else {
            listT15 = listT27;
            break;
        }
        String[] strArr15 = (String[]) listT15.toArray(new String[0]);
        ESSyllableAdapter2 eSSyllableAdapter15 = new ESSyllableAdapter2(R.layout.es_syllable_table_item_3, Arrays.asList(Arrays.copyOf(strArr15, strArr15.length)));
        ((hj.p) j()).f33057f.setLayoutManager(new LinearLayoutManager(1));
        ((hj.p) j()).f33057f.setAdapter(eSSyllableAdapter15);
        w(eSSyllableAdapter15);
        String str16 = this.f21807e0;
        Matcher matcher16 = e0.u(0, "\n", "compile(...)", str16, "input").matcher(str16);
        if (matcher16.find()) {
            ArrayList arrayList20 = new ArrayList(10);
            int iC16 = 0;
            do {
                iC16 = p.c(matcher16, str16, iC16, arrayList20);
            } while (matcher16.find());
            p.B(iC16, str16, arrayList20);
            listK16 = arrayList20;
        } else {
            listK16 = o.K(str16.toString());
        }
        if (!listK16.isEmpty()) {
            ListIterator listIterator16 = listK16.listIterator(listK16.size());
            while (true) {
                if (!listIterator16.hasPrevious()) {
                    listT16 = listT27;
                    break;
                } else if (((String) listIterator16.previous()).length() != 0) {
                    listT16 = e0.t(listIterator16, 1, listK16);
                    break;
                }
            }
        } else {
            listT16 = listT27;
            break;
        }
        String[] strArr16 = (String[]) listT16.toArray(new String[0]);
        List listAsList5 = Arrays.asList(Arrays.copyOf(strArr16, strArr16.length));
        ArrayList arrayList21 = new ArrayList();
        arrayList21.add("ga");
        arrayList21.add("go");
        arrayList21.add("gu");
        ESSyllableAdapter1 eSSyllableAdapter16 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList5, arrayList21);
        ((hj.p) ep.a.t(3, ((hj.p) j()).m, this)).m.setAdapter(eSSyllableAdapter16);
        w(eSSyllableAdapter16);
        String str17 = this.f21808f0;
        Matcher matcher17 = e0.u(0, "\n", "compile(...)", str17, "input").matcher(str17);
        if (matcher17.find()) {
            ArrayList arrayList22 = new ArrayList(10);
            int iC17 = 0;
            do {
                iC17 = p.c(matcher17, str17, iC17, arrayList22);
            } while (matcher17.find());
            p.B(iC17, str17, arrayList22);
            listK17 = arrayList22;
        } else {
            listK17 = o.K(str17.toString());
        }
        if (!listK17.isEmpty()) {
            ListIterator listIterator17 = listK17.listIterator(listK17.size());
            while (true) {
                if (!listIterator17.hasPrevious()) {
                    listT17 = listT27;
                    break;
                } else if (((String) listIterator17.previous()).length() != 0) {
                    listT17 = e0.t(listIterator17, 1, listK17);
                    break;
                }
            }
        } else {
            listT17 = listT27;
            break;
        }
        String[] strArr17 = (String[]) listT17.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter17 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr17, strArr17.length)), p0.r("gue", "gui"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33064n, this)).f33064n.setAdapter(eSSyllableAdapter17);
        w(eSSyllableAdapter17);
        String str18 = this.f21809g0;
        Matcher matcher18 = e0.u(0, "\n", "compile(...)", str18, "input").matcher(str18);
        if (matcher18.find()) {
            ArrayList arrayList23 = new ArrayList(10);
            int iC18 = 0;
            do {
                iC18 = p.c(matcher18, str18, iC18, arrayList23);
            } while (matcher18.find());
            p.B(iC18, str18, arrayList23);
            listK18 = arrayList23;
        } else {
            listK18 = o.K(str18.toString());
        }
        if (!listK18.isEmpty()) {
            ListIterator listIterator18 = listK18.listIterator(listK18.size());
            while (true) {
                if (!listIterator18.hasPrevious()) {
                    listT18 = listT27;
                    break;
                } else if (((String) listIterator18.previous()).length() != 0) {
                    listT18 = e0.t(listIterator18, 1, listK18);
                    break;
                }
            }
        } else {
            listT18 = listT27;
            break;
        }
        String[] strArr18 = (String[]) listT18.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter18 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr18, strArr18.length)), p0.r("ge", "gi"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33065o, this)).f33065o.setAdapter(eSSyllableAdapter18);
        w(eSSyllableAdapter18);
        String str19 = this.f21810h0;
        Matcher matcher19 = e0.u(0, "\n", "compile(...)", str19, "input").matcher(str19);
        if (matcher19.find()) {
            ArrayList arrayList24 = new ArrayList(10);
            int iC19 = 0;
            do {
                iC19 = p.c(matcher19, str19, iC19, arrayList24);
            } while (matcher19.find());
            p.B(iC19, str19, arrayList24);
            listK19 = arrayList24;
        } else {
            listK19 = o.K(str19.toString());
        }
        if (!listK19.isEmpty()) {
            ListIterator listIterator19 = listK19.listIterator(listK19.size());
            while (true) {
                if (!listIterator19.hasPrevious()) {
                    listT19 = listT27;
                    break;
                } else if (((String) listIterator19.previous()).length() != 0) {
                    listT19 = e0.t(listIterator19, 1, listK19);
                    break;
                }
            }
        } else {
            listT19 = listT27;
            break;
        }
        String[] strArr19 = (String[]) listT19.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter19 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr19, strArr19.length)), p0.r("güe", "güi"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33066p, this)).f33066p.setAdapter(eSSyllableAdapter19);
        w(eSSyllableAdapter19);
        String str20 = this.f21811i0;
        Matcher matcher20 = e0.u(0, "\n", "compile(...)", str20, "input").matcher(str20);
        if (matcher20.find()) {
            ArrayList arrayList25 = new ArrayList(10);
            int iC20 = 0;
            do {
                iC20 = p.c(matcher20, str20, iC20, arrayList25);
            } while (matcher20.find());
            p.B(iC20, str20, arrayList25);
            listK20 = arrayList25;
        } else {
            listK20 = o.K(str20.toString());
        }
        if (!listK20.isEmpty()) {
            ListIterator listIterator20 = listK20.listIterator(listK20.size());
            while (true) {
                if (!listIterator20.hasPrevious()) {
                    listT20 = listT27;
                    break;
                } else if (((String) listIterator20.previous()).length() != 0) {
                    listT20 = e0.t(listIterator20, 1, listK20);
                    break;
                }
            }
        } else {
            listT20 = listT27;
            break;
        }
        String[] strArr20 = (String[]) listT20.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter20 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr20, strArr20.length)), w4.c.l("h"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33067q, this)).f33067q.setAdapter(eSSyllableAdapter20);
        w(eSSyllableAdapter20);
        String str21 = this.f21812j0;
        Matcher matcher21 = e0.u(0, "\n", "compile(...)", str21, "input").matcher(str21);
        if (matcher21.find()) {
            ArrayList arrayList26 = new ArrayList(10);
            int iC21 = 0;
            do {
                iC21 = p.c(matcher21, str21, iC21, arrayList26);
            } while (matcher21.find());
            p.B(iC21, str21, arrayList26);
            listK21 = arrayList26;
        } else {
            listK21 = o.K(str21.toString());
        }
        if (!listK21.isEmpty()) {
            ListIterator listIterator21 = listK21.listIterator(listK21.size());
            while (true) {
                if (!listIterator21.hasPrevious()) {
                    listT21 = listT27;
                    break;
                } else if (((String) listIterator21.previous()).length() != 0) {
                    listT21 = e0.t(listIterator21, 1, listK21);
                    break;
                }
            }
        } else {
            listT21 = listT27;
            break;
        }
        String[] strArr21 = (String[]) listT21.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter21 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr21, strArr21.length)), w4.c.l("ñ"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33070t, this)).f33070t.setAdapter(eSSyllableAdapter21);
        w(eSSyllableAdapter21);
        String str22 = this.f21813k0;
        Matcher matcher22 = e0.u(0, "\n", "compile(...)", str22, "input").matcher(str22);
        if (matcher22.find()) {
            ArrayList arrayList27 = new ArrayList(10);
            int iC22 = 0;
            do {
                iC22 = p.c(matcher22, str22, iC22, arrayList27);
            } while (matcher22.find());
            p.B(iC22, str22, arrayList27);
            listK22 = arrayList27;
        } else {
            listK22 = o.K(str22.toString());
        }
        if (!listK22.isEmpty()) {
            ListIterator listIterator22 = listK22.listIterator(listK22.size());
            while (true) {
                if (!listIterator22.hasPrevious()) {
                    listT22 = listT27;
                    break;
                } else if (((String) listIterator22.previous()).length() != 0) {
                    listT22 = e0.t(listIterator22, 1, listK22);
                    break;
                }
            }
        } else {
            listT22 = listT27;
            break;
        }
        String[] strArr22 = (String[]) listT22.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter22 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr22, strArr22.length)), w4.c.l("r"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33071u, this)).f33071u.setAdapter(eSSyllableAdapter22);
        w(eSSyllableAdapter22);
        String str23 = this.f21814l0;
        Matcher matcher23 = e0.u(0, "\n", "compile(...)", str23, "input").matcher(str23);
        if (matcher23.find()) {
            ArrayList arrayList28 = new ArrayList(10);
            int iC23 = 0;
            do {
                iC23 = p.c(matcher23, str23, iC23, arrayList28);
            } while (matcher23.find());
            p.B(iC23, str23, arrayList28);
            listK23 = arrayList28;
        } else {
            listK23 = o.K(str23.toString());
        }
        if (!listK23.isEmpty()) {
            ListIterator listIterator23 = listK23.listIterator(listK23.size());
            while (true) {
                if (!listIterator23.hasPrevious()) {
                    listT23 = listT27;
                    break;
                } else if (((String) listIterator23.previous()).length() != 0) {
                    listT23 = e0.t(listIterator23, 1, listK23);
                    break;
                }
            }
        } else {
            listT23 = listT27;
            break;
        }
        String[] strArr23 = (String[]) listT23.toArray(new String[0]);
        List listAsList6 = Arrays.asList(Arrays.copyOf(strArr23, strArr23.length));
        ArrayList arrayList29 = new ArrayList();
        arrayList29.add("ri");
        arrayList29.add("re");
        arrayList29.add("rro");
        ESSyllableAdapter1 eSSyllableAdapter23 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList6, arrayList29);
        ((hj.p) ep.a.t(3, ((hj.p) j()).f33072v, this)).f33072v.setAdapter(eSSyllableAdapter23);
        w(eSSyllableAdapter23);
        String str24 = this.f21815m0;
        Matcher matcher24 = e0.u(0, "\n", "compile(...)", str24, "input").matcher(str24);
        if (matcher24.find()) {
            ArrayList arrayList30 = new ArrayList(10);
            int iC24 = 0;
            do {
                iC24 = p.c(matcher24, str24, iC24, arrayList30);
            } while (matcher24.find());
            p.B(iC24, str24, arrayList30);
            listK24 = arrayList30;
        } else {
            listK24 = o.K(str24.toString());
        }
        if (!listK24.isEmpty()) {
            ListIterator listIterator24 = listK24.listIterator(listK24.size());
            while (true) {
                if (!listIterator24.hasPrevious()) {
                    listT24 = listT27;
                    break;
                } else if (((String) listIterator24.previous()).length() != 0) {
                    listT24 = e0.t(listIterator24, 1, listK24);
                    break;
                }
            }
        } else {
            listT24 = listT27;
            break;
        }
        String[] strArr24 = (String[]) listT24.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter24 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr24, strArr24.length)), w4.c.l("ll"));
        ((hj.p) ep.a.t(3, ((hj.p) j()).f33069s, this)).f33069s.setAdapter(eSSyllableAdapter24);
        w(eSSyllableAdapter24);
        String str25 = this.f21816n0;
        Matcher matcher25 = e0.u(0, "\n", "compile(...)", str25, "input").matcher(str25);
        if (matcher25.find()) {
            ArrayList arrayList31 = new ArrayList(10);
            int iC25 = 0;
            do {
                iC25 = p.c(matcher25, str25, iC25, arrayList31);
            } while (matcher25.find());
            p.B(iC25, str25, arrayList31);
            listK25 = arrayList31;
        } else {
            listK25 = o.K(str25.toString());
        }
        if (!listK25.isEmpty()) {
            ListIterator listIterator25 = listK25.listIterator(listK25.size());
            while (true) {
                if (!listIterator25.hasPrevious()) {
                    listT25 = listT27;
                    break;
                } else if (((String) listIterator25.previous()).length() != 0) {
                    listT25 = e0.t(listIterator25, 1, listK25);
                    break;
                }
            }
        } else {
            listT25 = listT27;
            break;
        }
        String[] strArr25 = (String[]) listT25.toArray(new String[0]);
        ESSyllableAdapter2 eSSyllableAdapter25 = new ESSyllableAdapter2(R.layout.es_syllable_table_item_3, Arrays.asList(Arrays.copyOf(strArr25, strArr25.length)));
        ((hj.p) ep.a.t(2, ((hj.p) j()).f33068r, this)).f33068r.setAdapter(eSSyllableAdapter25);
        w(eSSyllableAdapter25);
        String str26 = this.f21817o0;
        Matcher matcher26 = e0.u(0, "\n", "compile(...)", str26, "input").matcher(str26);
        if (matcher26.find()) {
            ArrayList arrayList32 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList32.add(str26.subSequence(iEnd, matcher26.start()).toString());
                iEnd = matcher26.end();
            } while (matcher26.find());
            arrayList32.add(str26.subSequence(iEnd, str26.length()).toString());
            listK26 = arrayList32;
        } else {
            listK26 = o.K(str26.toString());
        }
        if (!listK26.isEmpty()) {
            ListIterator listIterator26 = listK26.listIterator(listK26.size());
            while (true) {
                if (!listIterator26.hasPrevious()) {
                    listT26 = listT27;
                    break;
                } else if (((String) listIterator26.previous()).length() != 0) {
                    listT26 = e0.t(listIterator26, 1, listK26);
                    break;
                }
            }
        } else {
            listT26 = listT27;
            break;
        }
        String[] strArr26 = (String[]) listT26.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter26 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr26, strArr26.length)), w4.c.l("x"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).C, this)).C.setAdapter(eSSyllableAdapter26);
        w(eSSyllableAdapter26);
        String str27 = this.f21818p0;
        Matcher matcher27 = e0.u(0, "\n", "compile(...)", str27, "input").matcher(str27);
        if (matcher27.find()) {
            ArrayList arrayList33 = new ArrayList(10);
            int iEnd2 = 0;
            do {
                arrayList33.add(str27.subSequence(iEnd2, matcher27.start()).toString());
                iEnd2 = matcher27.end();
            } while (matcher27.find());
            arrayList33.add(str27.subSequence(iEnd2, str27.length()).toString());
            listK27 = arrayList33;
        } else {
            listK27 = o.K(str27.toString());
        }
        if (!listK27.isEmpty()) {
            ListIterator listIterator27 = listK27.listIterator(listK27.size());
            while (listIterator27.hasPrevious()) {
                if (((String) listIterator27.previous()).length() != 0) {
                    listT27 = e0.t(listIterator27, 1, listK27);
                    break;
                }
            }
        }
        String[] strArr27 = (String[]) listT27.toArray(new String[0]);
        ESSyllableAdapter1 eSSyllableAdapter27 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr27, strArr27.length)), p0.r("exa", "éxi"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).D, this)).D.setAdapter(eSSyllableAdapter27);
        w(eSSyllableAdapter27);
        x();
        y();
        z();
        A();
        u();
        String string2 = ((hj.p) j()).I.getText().toString();
        int iI0 = q.I0(string2, "'", 0, false, 6);
        int i11 = iI0 + 1;
        if (iI0 > -1) {
            SpannableString spannableString = new SpannableString(string2);
            spannableString.setSpan(new ForegroundColorSpan(getColor(R.color.colorAccent)), iI0, i11, 33);
            ((hj.p) j()).I.setText(spannableString);
        }
        if (q.v0("release", "debug", false)) {
            ((hj.p) j()).f33054c.setOnLongClickListener(new fk.c(this, 0));
        }
    }

    public final void u() {
        File file = new File(defpackage.e.m(xt.b.a().b(), fv.b.D(-1L)));
        fv.a aVar = new fv.a(0L, fv.b.E(-1L), fv.b.D(-1L));
        if (!file.exists()) {
            e3 e3Var = ((hj.p) j()).f33053b;
            LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
            ComposeView composeView = (ComposeView) e3Var.f32524c;
            ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
            linearLayout.setVisibility(0);
            this.f21823u0.d(aVar, new aj.e(this, 5));
            return;
        }
        d dVarM = new yx.a(new bo.c(file, 1), 0).M(ky.e.f38937b);
        qx.o oVarA = px.b.a();
        xx.d dVar = new xx.d(vx.b.f54316e, new fk.d(this));
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
        m.f(status, "status");
        e3 e3Var = ((hj.p) j()).f33053b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }

    public final void w(BaseQuickAdapter baseQuickAdapter) {
        baseQuickAdapter.setOnItemChildClickListener(new fk.d(this));
    }

    public final void y() {
        List listK;
        Collection collectionT;
        String str = this.f21820r0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), w4.c.l("xi"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).F, this)).F.setAdapter(eSSyllableAdapter1);
        w(eSSyllableAdapter1);
    }

    public final void z() {
        List listK;
        Collection collectionT;
        String str = this.f21821s0;
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
        arrayList2.add("za");
        arrayList2.add("zo");
        arrayList2.add("zu");
        arrayList2.add("za");
        arrayList2.add("zo");
        arrayList2.add("zu");
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, listAsList, arrayList2);
        ((hj.p) ep.a.t(3, ((hj.p) j()).G, this)).G.setAdapter(eSSyllableAdapter1);
        w(eSSyllableAdapter1);
    }

    public final void x() {
        List listK;
        Collection collectionT;
        String str = DytezVyM.UUJJyhKDZmO;
        String str2 = this.f21819q0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), p0.r("xt", "xp"));
        ((hj.p) ep.a.t(2, ((hj.p) j()).E, this)).E.setAdapter(eSSyllableAdapter1);
        w(eSSyllableAdapter1);
    }
}
