package com.lingo.lingoskill.franchskill.ui.learn;

import a9.i;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import b7.e0;
import bq.z;
import bw.ORXQ.ADSb;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.espanskill.ui.learn.adapter.ESSyllableAdapter1;
import com.lingo.lingoskill.franchskill.ui.learn.FRSyllableIntroductionActivity2;
import com.lingo.lingoskill.franchskill.ui.learn.adapter.FRSyllableAdapter1;
import com.lingo.lingoskill.franchskill.ui.learn.adapter.FRSyllableAdapter2;
import com.lingo.lingoskill.franchskill.ui.learn.adapter.FRSyllableAdapter3;
import com.lingo.lingoskill.franchskill.ui.learn.adapter.FRSyllableAdapter4;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import ff.h;
import fv.a;
import fv.c;
import hj.e3;
import hj.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import ji.b;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import qy.b0;
import qy.q;
import ry.r;
import se.g;
import sk.d;
import th.j;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FRSyllableIntroductionActivity2 extends b {
    public static final /* synthetic */ int K0 = 0;
    public final String A0;
    public final String B0;
    public final String C0;
    public final String D0;
    public final String E0;
    public final String F0;
    public final c G0;
    public int H0;
    public final g I0;
    public final i J0;
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
    public final String f21854a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final String f21855b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final String f21856c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final String f21857d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f21858e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final String f21859f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String f21860g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final String f21861h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final String f21862i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final String f21863j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final String f21864k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final String f21865l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final String f21866m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final String f21867n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final String f21868o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f21869p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f21870q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f21871r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f21872s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f21873t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f21874u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final String f21875v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final String f21876w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final String f21877x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final String f21878y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final String f21879z0;

    public FRSyllableIntroductionActivity2() {
        super("AlphabetIntro", d.f51718a);
        this.P = "[œ]\t[ɛ]\t[ɑ]\t[ɔ]\t[ø]\t[ə]\t[ɛ̃]\t[ɑ̃]\t[ɔ̃]\t[ɥ]\t[∫]\t[ʒ]\t[ɲ]\t[œ̃]\t[i]\t[y]\t[e]\t[a]\t[u]\t[o]\t[j]\t[ij]\t[w]\t[wa]\t[b]\t[p]\t[d]\t[t]\t[g]\t[gz]\t[k]\t[ks]\t[z]\t[s]\t[v]\t[f]\t[n]\t[m]\t[r]\t[l]\t[jɛ̃]\t[wɛ̃]";
        this.Q = "A a\nB b\nC c\nD d\nE e\nF f\nG g\nH h\nI i\nJ j\nK k\nL l\nM m\nN n\nO o\nP p\nQ q\nR r\nS s\nT t\nU u\nV v\nW w\nX x\nY y\nZ z";
        this.R = "professeur";
        this.S = "étudiant\nFrançais";
        this.T = "pas\npâle\nà";
        this.U = "le\npremier";
        this.V = "lire\nîle\nnaïf";
        this.W = "porte\nrose";
        this.X = "sur\nsûr";
        this.Y = "tôt\nallô";
        this.Z = "stylo\nmétro";
        this.f21854a0 = "chose\nrose";
        this.f21855b0 = "ordinateur\nprofesseur";
        this.f21856c0 = "elle\ncher\nmercredi";
        this.f21857d0 = "métro\nétudiant";
        this.f21858e0 = "mère\nfête\nNoël";
        this.f21859f0 = "rose\nmère\nfête";
        this.f21860g0 = "vrai\ntramway\nneiger\ntrolley";
        this.f21861h0 = "chaud\neau";
        this.f21862i0 = "ou\ngoût\naoût";
        this.f21863j0 = "heure\nsœur";
        this.f21864k0 = "peut\nbœufs";
        this.f21865l0 = "chanter\nlent\ntemps";
        this.f21866m0 = "ennui\nemmener";
        this.f21867n0 = "vin\nsimple\nsyndicat\npain\nfaim\nplein";
        this.f21868o0 = "bon\nnom";
        this.f21869p0 = "brun\nlundi";
        this.f21870q0 = "yaourt";
        this.f21871r0 = "voyelle\nmoyen";
        this.f21872s0 = "ciel\nplier\ncrier";
        this.f21873t0 = "travail\nbataille";
        this.f21874u0 = "oui\njouer";
        this.f21875v0 = "moi\nmoyen";
        this.f21876w0 = "huit\nnuage";
        this.f21877x0 = "ien, yen\t[jɛ̃]\tbien\noin\t[wɛ̃]\tpoint\nion, yon\t[jɔ̃]\tLyon";
        this.f21878y0 = "B/b\tblanc\nN/n\tne\nC/c\tcoq\nP/p\tpomme\nD/d\tdeux\nR/r\tReims\nF/f\tfixer\nS/s\tsimple\nG/g\tgarçon\nT/t\ttemps\nJ/j\tje\nV/v\tvalise\nK/k\tkilo\nW/w\tweek-end\nL/l\tlent\nZ/z\tzéro\nM/m\tmère";
        this.f21879z0 = "ce\nciel\ngarçon";
        this.A0 = "manger\ngentil";
        this.B0 = "huit\nthé";
        this.C0 = "rose\ntélévision";
        this.D0 = "sac\nneuf\nil\ncoq\ncher\nexact";
        this.E0 = "stop\nclub";
        this.F0 = "A/a\tà, â, æ\nE/e\té, è, ê, ë\nI/i\tî, ï\nO/o\tô, œ\nU/u\tù, û, ü\nY/y\tÿ\nC/c\tç";
        this.G0 = new c();
        g gVar = new g();
        HashMap map = new HashMap();
        gVar.f51597a = map;
        map.clear();
        for (String str : "à\ta1\nâ\ta2\næ\t#1\né\te1\nè\te2\nê\te3\në\te4\nî\ti1\nï\ti2\nô\to1\nœ\t#2\nù\tu1\nû\tu2\nü\tu3\nÿ\ty1\nç\tc1\nɛ\t#3\nɑ\t#4\nɔ\t#5\nø\t#6\nə\t#7\nɛ̃\t#8\nɑ̃\t#9\nɔ̃\t#10\nɥ\t#11\n∫\t#12\nʒ\t#13\nɲ\t#14\nœ̃\t#15\n[œ]\t#2\n[ɛ]\t#3\n[ɑ]\t#4\n[ɔ]\t#5\n[ø]\t#6\n[ə]\t#7\n[ɛ̃]\t#8\n[ɑ̃]\t#9\n[ɔ̃]\t#10\n[ɥ]\t#11\n[∫]\t#12\n[ʒ]\t#13\n[ɲ]\t#14\n[œ̃]\t#15\n[i]\t#16\n[y]\t#17\n[e]\t#18\n[a]\t#19\n[u]\t#20\n[o]\t#21\n[j]\t#22\n[ij]\t#23\n[w]\t#24\n[wa]\t#25\n[b]\t#26\n[p]\t#27\n[d]\t#28\n[t]\t#29\n[g]\t#30\n[gz]\t#31\n[k]\t#32\n[ks]\t#33\n[z]\t#34\n[s]\t#35\n[v]\t#36\n[f]\t#37\n[n]\t#38\n[m]\t#39\n[r]\t#40\n[l]\t#41\nj’aurai\t#42\n[jɛ̃]\t#43\n[wɛ̃]\t#44\nj’ai eu\t1\nvice versa\t2\nnous faisons\t3\nà jeun\t4\nC’est un garçon\t5\nles enfants\t6".split("\n")) {
            String[] strArrSplit = str.split("\t");
            gVar.f51597a.put(strArrSplit[0], strArrSplit[1]);
        }
        this.I0 = gVar;
        this.J0 = new i(1);
    }

    public final void A() {
        List listK;
        Collection collectionT;
        String str = this.f21872s0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.K("i"));
        ((t) p.z(3, ((t) j()).f33302x, this)).f33302x.setAdapter(eSSyllableAdapter1);
        ((t) j()).f33302x.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    public final void B() {
        List listK;
        Collection collectionT;
        String str = this.f21873t0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("il", "ille"));
        ((t) p.z(2, ((t) j()).f33303y, this)).f33303y.setAdapter(eSSyllableAdapter1);
        ((t) j()).f33303y.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    public final void C() {
        List listK;
        Collection collectionT;
        String str = this.f21874u0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("ou", "ou"));
        ((t) p.z(2, ((t) j()).f33304z, this)).f33304z.setAdapter(eSSyllableAdapter1);
        ((t) j()).f33304z.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    public final void D() {
        List listK;
        Collection collectionT;
        String str = this.f21875v0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("oi", "oy"));
        ((t) p.z(2, ((t) j()).A, this)).A.setAdapter(eSSyllableAdapter1);
        ((t) j()).A.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    public final void E() {
        List listK;
        Collection collectionT;
        String str = this.f21876w0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("u", "u"));
        ((t) p.z(2, ((t) j()).B, this)).B.setAdapter(eSSyllableAdapter1);
        ((t) j()).B.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    public final void F() {
        List listK;
        Collection collectionT;
        String str = this.f21877x0;
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
        FRSyllableAdapter3 fRSyllableAdapter3 = new FRSyllableAdapter3(Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("ien", "oin", "yon"));
        ((t) j()).C.setLayoutManager(new LinearLayoutManager(1));
        ((t) j()).C.setAdapter(fRSyllableAdapter3);
        ((t) j()).C.setNestedScrollingEnabled(false);
        G(fRSyllableAdapter3);
    }

    public final void G(BaseQuickAdapter baseQuickAdapter) {
        baseQuickAdapter.setOnItemChildClickListener(new sk.c(this));
    }

    public final void H() {
        List listK;
        Collection collectionT;
        String str = this.f21878y0;
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
        FRSyllableAdapter1 fRSyllableAdapter1 = new FRSyllableAdapter1(R.layout.fr_syllable_table_item_5, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("b", "n", "c", "p", "d", "R", "f", "s", "g", "t", "j", "v", "k", "w", "l", "z", "m"));
        ((t) p.z(2, ((t) j()).O, this)).O.setAdapter(fRSyllableAdapter1);
        ((t) j()).O.setNestedScrollingEnabled(false);
        G(fRSyllableAdapter1);
    }

    public final void I() {
        List listK;
        Collection collectionT;
        String str = this.f21879z0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("e", "c", "ç"));
        ((t) p.z(3, ((t) j()).P, this)).P.setAdapter(eSSyllableAdapter1);
        ((t) j()).P.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    public final void J() {
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.K("g"));
        ((t) p.z(2, ((t) j()).Q, this)).Q.setAdapter(eSSyllableAdapter1);
        ((t) j()).Q.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    public final void K() {
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.K("h"));
        ((t) p.z(2, ((t) j()).R, this)).R.setAdapter(eSSyllableAdapter1);
        ((t) j()).R.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    public final void M() {
        List listK;
        Collection collectionT;
        String strM = e.m(getString(R.string.fr_alp_table_content_1), "\tnation");
        Matcher matcher = e0.u(0, "\n", "compile(...)", strM, "input").matcher(strM);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, strM, iC, arrayList);
            } while (matcher.find());
            p.B(iC, strM, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(strM.toString());
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
        FRSyllableAdapter1 fRSyllableAdapter1 = new FRSyllableAdapter1(R.layout.fr_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.K("t"));
        ((t) j()).T.setLayoutManager(new LinearLayoutManager(1));
        ((t) j()).T.setAdapter(fRSyllableAdapter1);
        ((t) j()).T.setNestedScrollingEnabled(false);
        G(fRSyllableAdapter1);
    }

    public final void P() {
        List listK;
        Collection collectionT;
        String str = this.D0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("c", "f", "l", "q", "r", "ct"));
        ((t) p.z(3, ((t) j()).W, this)).W.setAdapter(eSSyllableAdapter1);
        ((t) j()).W.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    public final void Q() {
        List listK;
        Collection collectionT;
        String str = this.E0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("p", "b"));
        ((t) p.z(2, ((t) j()).X, this)).X.setAdapter(eSSyllableAdapter1);
        ((t) j()).X.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.G0.a(this.H0);
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
        ve.i.I(R.string.alphabet, this);
        String str = this.Q;
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
        ((t) p.z(5, ((t) j()).f33299u, this)).f33299u.setAdapter(eSSyllableAdapter1);
        ((t) j()).f33299u.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
        String str2 = this.R;
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
        ESSyllableAdapter1 eSSyllableAdapter2 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr2, strArr2.length)), o.K("professeur"));
        ((t) p.z(1, ((t) j()).N, this)).N.setAdapter(eSSyllableAdapter2);
        ((t) j()).N.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter2);
        String str3 = this.S;
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
        ESSyllableAdapter1 eSSyllableAdapter3 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr3, strArr3.length)), o.L("diant", "çais"));
        ((t) p.z(2, ((t) j()).D, this)).D.setAdapter(eSSyllableAdapter3);
        ((t) j()).D.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter3);
        String str4 = this.T;
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
        ESSyllableAdapter1 eSSyllableAdapter4 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr4, strArr4.length)), o.L("a", "â", "à"));
        ((t) p.z(3, ((t) j()).f33290k, this)).f33290k.setAdapter(eSSyllableAdapter4);
        ((t) j()).f33290k.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter4);
        String str5 = this.U;
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
        ESSyllableAdapter1 eSSyllableAdapter5 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr5, strArr5.length)), o.K("e"));
        ((t) p.z(2, ((t) j()).m, this)).m.setAdapter(eSSyllableAdapter5);
        ((t) j()).m.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter5);
        String str6 = this.V;
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
        ESSyllableAdapter1 eSSyllableAdapter6 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr6, strArr6.length)), o.L("i", "î", "ï"));
        ((t) p.z(3, ((t) j()).f33292n, this)).f33292n.setAdapter(eSSyllableAdapter6);
        ((t) j()).f33292n.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter6);
        String str7 = this.W;
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
        ESSyllableAdapter1 eSSyllableAdapter7 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr7, strArr7.length)), o.K("o"));
        ((t) p.z(2, ((t) j()).f33291l, this)).f33291l.setAdapter(eSSyllableAdapter7);
        ((t) j()).f33291l.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter7);
        String str8 = this.X;
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
        ESSyllableAdapter1 eSSyllableAdapter8 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr8, strArr8.length)), o.L("u", "û"));
        ((t) p.z(2, ((t) j()).f33293o, this)).f33293o.setAdapter(eSSyllableAdapter8);
        ((t) j()).f33293o.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter8);
        String str9 = this.Y;
        Matcher matcher9 = e0.u(0, "\n", "compile(...)", str9, "input").matcher(str9);
        if (matcher9.find()) {
            ArrayList arrayList9 = new ArrayList(10);
            int iC9 = 0;
            do {
                iC9 = p.c(matcher9, str9, iC9, arrayList9);
            } while (matcher9.find());
            p.B(iC9, str9, arrayList9);
            listK9 = arrayList9;
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
        ESSyllableAdapter1 eSSyllableAdapter9 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr9, strArr9.length)), o.K("ô"));
        ((t) p.z(2, ((t) j()).J, this)).J.setAdapter(eSSyllableAdapter9);
        ((t) j()).J.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter9);
        String str10 = this.Z;
        Matcher matcher10 = e0.u(0, "\n", "compile(...)", str10, "input").matcher(str10);
        if (matcher10.find()) {
            ArrayList arrayList10 = new ArrayList(10);
            int iC10 = 0;
            do {
                iC10 = p.c(matcher10, str10, iC10, arrayList10);
            } while (matcher10.find());
            p.B(iC10, str10, arrayList10);
            listK10 = arrayList10;
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
        ESSyllableAdapter1 eSSyllableAdapter10 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr10, strArr10.length)), o.K("o"));
        ((t) p.z(2, ((t) j()).K, this)).K.setAdapter(eSSyllableAdapter10);
        ((t) j()).K.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter10);
        String str11 = this.f21854a0;
        Matcher matcher11 = e0.u(0, "\n", "compile(...)", str11, "input").matcher(str11);
        if (matcher11.find()) {
            ArrayList arrayList11 = new ArrayList(10);
            int iC11 = 0;
            do {
                iC11 = p.c(matcher11, str11, iC11, arrayList11);
            } while (matcher11.find());
            p.B(iC11, str11, arrayList11);
            listK11 = arrayList11;
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
        ESSyllableAdapter1 eSSyllableAdapter11 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr11, strArr11.length)), o.K("o"));
        ((t) p.z(2, ((t) j()).L, this)).L.setAdapter(eSSyllableAdapter11);
        ((t) j()).L.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter11);
        String str12 = this.f21855b0;
        Matcher matcher12 = e0.u(0, "\n", "compile(...)", str12, "input").matcher(str12);
        if (matcher12.find()) {
            ArrayList arrayList12 = new ArrayList(10);
            int iC12 = 0;
            do {
                iC12 = p.c(matcher12, str12, iC12, arrayList12);
            } while (matcher12.find());
            p.B(iC12, str12, arrayList12);
            listK12 = arrayList12;
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
        ESSyllableAdapter1 eSSyllableAdapter12 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr12, strArr12.length)), o.K("o"));
        ((t) p.z(2, ((t) j()).M, this)).M.setAdapter(eSSyllableAdapter12);
        ((t) j()).M.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter12);
        String str13 = this.f21856c0;
        Matcher matcher13 = e0.u(0, "\n", "compile(...)", str13, "input").matcher(str13);
        if (matcher13.find()) {
            ArrayList arrayList13 = new ArrayList(10);
            int iC13 = 0;
            do {
                iC13 = p.c(matcher13, str13, iC13, arrayList13);
            } while (matcher13.find());
            p.B(iC13, str13, arrayList13);
            listK13 = arrayList13;
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
        ESSyllableAdapter1 eSSyllableAdapter13 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr13, strArr13.length)), o.K("e"));
        ((t) p.z(3, ((t) j()).f33295q, this)).f33295q.setAdapter(eSSyllableAdapter13);
        ((t) j()).f33295q.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter13);
        String str14 = this.f21857d0;
        Matcher matcher14 = e0.u(0, "\n", "compile(...)", str14, "input").matcher(str14);
        if (matcher14.find()) {
            ArrayList arrayList14 = new ArrayList(10);
            int iC14 = 0;
            do {
                iC14 = p.c(matcher14, str14, iC14, arrayList14);
            } while (matcher14.find());
            p.B(iC14, str14, arrayList14);
            listK14 = arrayList14;
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
        ESSyllableAdapter1 eSSyllableAdapter14 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr14, strArr14.length)), o.K("é"));
        ((t) p.z(2, ((t) j()).f33296r, this)).f33296r.setAdapter(eSSyllableAdapter14);
        ((t) j()).f33296r.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter14);
        String str15 = this.f21858e0;
        Matcher matcher15 = e0.u(0, "\n", "compile(...)", str15, "input").matcher(str15);
        if (matcher15.find()) {
            ArrayList arrayList15 = new ArrayList(10);
            int iC15 = 0;
            do {
                iC15 = p.c(matcher15, str15, iC15, arrayList15);
            } while (matcher15.find());
            p.B(iC15, str15, arrayList15);
            listK15 = arrayList15;
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
        ESSyllableAdapter1 eSSyllableAdapter15 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr15, strArr15.length)), o.L("è", "ê", "ë"));
        ((t) p.z(3, ((t) j()).f33297s, this)).f33297s.setAdapter(eSSyllableAdapter15);
        ((t) j()).f33297s.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter15);
        String str16 = this.f21859f0;
        Matcher matcher16 = e0.u(0, "\n", "compile(...)", str16, "input").matcher(str16);
        if (matcher16.find()) {
            ArrayList arrayList16 = new ArrayList(10);
            int iC16 = 0;
            do {
                iC16 = p.c(matcher16, str16, iC16, arrayList16);
            } while (matcher16.find());
            p.B(iC16, str16, arrayList16);
            listK16 = arrayList16;
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
        ESSyllableAdapter1 eSSyllableAdapter16 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr16, strArr16.length)), o.K("e"));
        ((t) p.z(3, ((t) j()).f33298t, this)).f33298t.setAdapter(eSSyllableAdapter16);
        ((t) j()).f33298t.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter16);
        String str17 = this.f21860g0;
        Matcher matcher17 = e0.u(0, "\n", "compile(...)", str17, "input").matcher(str17);
        if (matcher17.find()) {
            ArrayList arrayList17 = new ArrayList(10);
            int iC17 = 0;
            do {
                iC17 = p.c(matcher17, str17, iC17, arrayList17);
            } while (matcher17.find());
            p.B(iC17, str17, arrayList17);
            listK17 = arrayList17;
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
        ESSyllableAdapter1 eSSyllableAdapter17 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr17, strArr17.length)), o.L("ai", "ay", "ei", "ey"));
        ((t) p.z(4, ((t) j()).f33285f, this)).f33285f.setAdapter(eSSyllableAdapter17);
        ((t) j()).f33285f.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter17);
        String str18 = this.f21861h0;
        Matcher matcher18 = e0.u(0, "\n", "compile(...)", str18, "input").matcher(str18);
        if (matcher18.find()) {
            ArrayList arrayList18 = new ArrayList(10);
            int iC18 = 0;
            do {
                iC18 = p.c(matcher18, str18, iC18, arrayList18);
            } while (matcher18.find());
            p.B(iC18, str18, arrayList18);
            listK18 = arrayList18;
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
        ESSyllableAdapter1 eSSyllableAdapter18 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr18, strArr18.length)), o.L("au", "eau"));
        ((t) p.z(2, ((t) j()).f33286g, this)).f33286g.setAdapter(eSSyllableAdapter18);
        ((t) j()).f33286g.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter18);
        String str19 = this.f21862i0;
        Matcher matcher19 = e0.u(0, "\n", "compile(...)", str19, "input").matcher(str19);
        if (matcher19.find()) {
            ArrayList arrayList19 = new ArrayList(10);
            int iC19 = 0;
            do {
                iC19 = p.c(matcher19, str19, iC19, arrayList19);
            } while (matcher19.find());
            p.B(iC19, str19, arrayList19);
            listK19 = arrayList19;
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
        ESSyllableAdapter1 eSSyllableAdapter19 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr19, strArr19.length)), o.L("ou", "oû", "aoû"));
        ((t) p.z(3, ((t) j()).f33287h, this)).f33287h.setAdapter(eSSyllableAdapter19);
        ((t) j()).f33287h.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter19);
        String str20 = this.f21863j0;
        Matcher matcher20 = e0.u(0, "\n", "compile(...)", str20, "input").matcher(str20);
        if (matcher20.find()) {
            ArrayList arrayList20 = new ArrayList(10);
            int iC20 = 0;
            do {
                iC20 = p.c(matcher20, str20, iC20, arrayList20);
            } while (matcher20.find());
            p.B(iC20, str20, arrayList20);
            listK20 = arrayList20;
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
        ESSyllableAdapter1 eSSyllableAdapter20 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr20, strArr20.length)), o.L("eu", "œu"));
        ((t) p.z(2, ((t) j()).f33288i, this)).f33288i.setAdapter(eSSyllableAdapter20);
        ((t) j()).f33288i.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter20);
        String str21 = this.f21864k0;
        Matcher matcher21 = e0.u(0, "\n", "compile(...)", str21, "input").matcher(str21);
        if (matcher21.find()) {
            ArrayList arrayList21 = new ArrayList(10);
            int iC21 = 0;
            do {
                iC21 = p.c(matcher21, str21, iC21, arrayList21);
            } while (matcher21.find());
            p.B(iC21, str21, arrayList21);
            listK21 = arrayList21;
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
        ESSyllableAdapter1 eSSyllableAdapter21 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr21, strArr21.length)), o.L("eu", "œu"));
        ((t) p.z(2, ((t) j()).f33289j, this)).f33289j.setAdapter(eSSyllableAdapter21);
        ((t) j()).f33289j.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter21);
        String str22 = this.f21865l0;
        Matcher matcher22 = e0.u(0, "\n", "compile(...)", str22, "input").matcher(str22);
        if (matcher22.find()) {
            ArrayList arrayList22 = new ArrayList(10);
            int iC22 = 0;
            do {
                iC22 = p.c(matcher22, str22, iC22, arrayList22);
            } while (matcher22.find());
            p.B(iC22, str22, arrayList22);
            listK22 = arrayList22;
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
        ESSyllableAdapter1 eSSyllableAdapter22 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr22, strArr22.length)), o.L("an", "en", "em"));
        ((t) p.z(3, ((t) j()).E, this)).E.setAdapter(eSSyllableAdapter22);
        ((t) j()).E.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter22);
        String str23 = this.f21866m0;
        Matcher matcher23 = e0.u(0, "\n", "compile(...)", str23, "input").matcher(str23);
        if (matcher23.find()) {
            ArrayList arrayList23 = new ArrayList(10);
            int iC23 = 0;
            do {
                iC23 = p.c(matcher23, str23, iC23, arrayList23);
            } while (matcher23.find());
            p.B(iC23, str23, arrayList23);
            listK23 = arrayList23;
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
        ESSyllableAdapter1 eSSyllableAdapter23 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr23, strArr23.length)), o.L("en", "em"));
        ((t) p.z(2, ((t) j()).F, this)).F.setAdapter(eSSyllableAdapter23);
        ((t) j()).F.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter23);
        String str24 = this.f21867n0;
        Matcher matcher24 = e0.u(0, "\n", "compile(...)", str24, "input").matcher(str24);
        if (matcher24.find()) {
            ArrayList arrayList24 = new ArrayList(10);
            int iC24 = 0;
            do {
                iC24 = p.c(matcher24, str24, iC24, arrayList24);
            } while (matcher24.find());
            p.B(iC24, str24, arrayList24);
            listK24 = arrayList24;
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
        ESSyllableAdapter1 eSSyllableAdapter24 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr24, strArr24.length)), o.L("in", "im", "yn", "ain", "aim", "ein"));
        ((t) p.z(3, ((t) j()).G, this)).G.setAdapter(eSSyllableAdapter24);
        ((t) j()).G.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter24);
        String str25 = this.f21868o0;
        Matcher matcher25 = e0.u(0, "\n", "compile(...)", str25, "input").matcher(str25);
        if (matcher25.find()) {
            ArrayList arrayList25 = new ArrayList(10);
            int iC25 = 0;
            do {
                iC25 = p.c(matcher25, str25, iC25, arrayList25);
            } while (matcher25.find());
            p.B(iC25, str25, arrayList25);
            listK25 = arrayList25;
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
        ESSyllableAdapter1 eSSyllableAdapter25 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr25, strArr25.length)), o.L("on", "om"));
        ((t) p.z(2, ((t) j()).H, this)).H.setAdapter(eSSyllableAdapter25);
        ((t) j()).H.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter25);
        String str26 = this.f21869p0;
        Matcher matcher26 = e0.u(0, "\n", "compile(...)", str26, "input").matcher(str26);
        if (matcher26.find()) {
            ArrayList arrayList26 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList26.add(str26.subSequence(iEnd, matcher26.start()).toString());
                iEnd = matcher26.end();
            } while (matcher26.find());
            arrayList26.add(str26.subSequence(iEnd, str26.length()).toString());
            listK26 = arrayList26;
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
        ESSyllableAdapter1 eSSyllableAdapter26 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr26, strArr26.length)), o.L("un", "un"));
        ((t) p.z(2, ((t) j()).I, this)).I.setAdapter(eSSyllableAdapter26);
        ((t) j()).I.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter26);
        String str27 = this.f21870q0;
        Matcher matcher27 = e0.u(0, "\n", "compile(...)", str27, "input").matcher(str27);
        if (matcher27.find()) {
            ArrayList arrayList27 = new ArrayList(10);
            int iEnd2 = 0;
            do {
                arrayList27.add(str27.subSequence(iEnd2, matcher27.start()).toString());
                iEnd2 = matcher27.end();
            } while (matcher27.find());
            arrayList27.add(str27.subSequence(iEnd2, str27.length()).toString());
            listK27 = arrayList27;
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
        ESSyllableAdapter1 eSSyllableAdapter27 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr27, strArr27.length)), o.K("y"));
        ((t) p.z(1, ((t) j()).f33300v, this)).f33300v.setAdapter(eSSyllableAdapter27);
        ((t) j()).f33300v.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter27);
        z();
        A();
        B();
        C();
        D();
        E();
        F();
        H();
        I();
        J();
        K();
        L();
        M();
        N();
        O();
        P();
        Q();
        x();
        v();
        w();
        R();
        final int i11 = 0;
        z.b(((t) j()).Y, new fz.c(this) { // from class: sk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FRSyllableIntroductionActivity2 f51716b;

            {
                this.f51716b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                b0 b0Var = b0.f48488a;
                FRSyllableIntroductionActivity2 fRSyllableIntroductionActivity2 = this.f51716b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        int i13 = FRSyllableIntroductionActivity2.K0;
                        m.f(it, "it");
                        i iVar = fRSyllableIntroductionActivity2.J0;
                        q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("5", null, null));
                        break;
                    default:
                        int i14 = FRSyllableIntroductionActivity2.K0;
                        m.f(it, "it");
                        i iVar2 = fRSyllableIntroductionActivity2.J0;
                        q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("6", null, null));
                        break;
                }
                return b0Var;
            }
        });
        final int i12 = 1;
        z.b(((t) j()).Z, new fz.c(this) { // from class: sk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FRSyllableIntroductionActivity2 f51716b;

            {
                this.f51716b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                b0 b0Var = b0.f48488a;
                FRSyllableIntroductionActivity2 fRSyllableIntroductionActivity2 = this.f51716b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        int i14 = FRSyllableIntroductionActivity2.K0;
                        m.f(it, "it");
                        i iVar = fRSyllableIntroductionActivity2.J0;
                        q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("5", null, null));
                        break;
                    default:
                        int i15 = FRSyllableIntroductionActivity2.K0;
                        m.f(it, "it");
                        i iVar2 = fRSyllableIntroductionActivity2.J0;
                        q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("6", null, null));
                        break;
                }
                return b0Var;
            }
        });
        u();
        if (oz.q.v0("release", "debug", false)) {
            ((t) j()).f33282c.setOnLongClickListener(new fk.c(this, 6));
        }
    }

    public final void u() {
        File file = new File(e.m(xt.b.a().b(), fv.b.D(-1L)));
        a aVar = new a(0L, fv.b.E(-1L), fv.b.D(-1L));
        if (!file.exists()) {
            e3 e3Var = ((t) j()).f33281b;
            LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
            ComposeView composeView = (ComposeView) e3Var.f32524c;
            ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
            linearLayout.setVisibility(0);
            this.G0.d(aVar, new aj.e(this, 19));
            return;
        }
        yx.d dVarM = new yx.a(new bo.c(file, 5), 0).M(ky.e.f38937b);
        qx.o oVarA = px.b.a();
        xx.d dVar = new xx.d(vx.b.f54316e, new sk.c(this));
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
        List listK;
        Collection collectionT;
        String string = getString(R.string.fr_alp_table_content_9);
        String string2 = getString(R.string.fr_alp_table_content_10);
        String string3 = getString(R.string.fr_alp_table_content_11);
        String string4 = getString(R.string.fr_alp_table_content_12);
        String string5 = getString(R.string.fr_alp_table_content_23);
        String string6 = getString(R.string.fr_alp_table_content_13);
        String string7 = getString(R.string.fr_alp_table_content_14);
        String string8 = getString(R.string.fr_alp_table_content_24);
        String string9 = getString(R.string.fr_alp_table_content_15);
        String string10 = getString(R.string.fr_alp_table_content_16);
        String string11 = getString(R.string.fr_alp_table_content_25);
        String string12 = getString(R.string.fr_alp_table_content_17);
        String string13 = getString(R.string.fr_alp_table_content_18);
        String string14 = getString(R.string.fr_alp_table_content_19);
        String string15 = getString(R.string.fr_alp_table_content_20);
        String string16 = getString(R.string.fr_alp_table_content_21);
        String string17 = getString(R.string.fr_alp_table_content_22);
        StringBuilder sbQ = e0.q(string, "\t", string2, "\t", string3);
        com.google.android.material.datepicker.d.w(sbQ, "\t", string4, "\n", string5);
        com.google.android.material.datepicker.d.w(sbQ, "\t", string6, "\té\t", string7);
        com.google.android.material.datepicker.d.w(sbQ, "\n", string8, "\t", string9);
        com.google.android.material.datepicker.d.w(sbQ, "\tè\t", string10, "\n", string11);
        com.google.android.material.datepicker.d.w(sbQ, "\t", string12, "\tê\t", string13);
        com.google.android.material.datepicker.d.w(sbQ, "\ntréma\t", string14, "\të\t", string15);
        String strP = e.p(sbQ, "\ncédille\t", string16, "\tç\t", string17);
        Matcher matcher = e0.u(0, "\n", "compile(...)", strP, "input").matcher(strP);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, strP, iC, arrayList);
            } while (matcher.find());
            p.B(iC, strP, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(strP.toString());
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
        FRSyllableAdapter2 fRSyllableAdapter2 = new FRSyllableAdapter2(R.layout.fr_syllable_table_item_4, Arrays.asList(Arrays.copyOf(strArr, strArr.length)));
        ((t) j()).f33283d.setLayoutManager(new LinearLayoutManager(1));
        ((t) j()).f33283d.setAdapter(fRSyllableAdapter2);
        ((t) j()).f33283d.setNestedScrollingEnabled(false);
    }

    public final void w() {
        List listK;
        Collection collectionT;
        String str = this.F0;
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
        FRSyllableAdapter4 fRSyllableAdapter4 = new FRSyllableAdapter4(R.layout.fr_syllable_table_item_6, Arrays.asList(Arrays.copyOf(strArr, strArr.length)));
        ((t) j()).f33284e.setLayoutManager(new LinearLayoutManager(1));
        ((t) j()).f33284e.setAdapter(fRSyllableAdapter4);
        ((t) j()).f33284e.setNestedScrollingEnabled(false);
        G(fRSyllableAdapter4);
    }

    public final void x() {
        List listK;
        Collection collectionT;
        String strH = ep.a.h("ph\t[f]\tphoto\nth\t[t]\tthé\ngu\t[g]\tguerre\nqu\t[k]\tquel\n", getString(R.string.fr_alp_table_content_7), "\t[ɛks]\texpress\n", getString(R.string.fr_alp_table_content_8), "\t[ɛgz]\texamen\ncc + e/i\t[ks]\taccent\nsc + e/i\t[s]\tscène\nch/sh/sch\t[∫]\tcher\nmn\t[n]\tautomne\ngn\t[ɲ]\tligne");
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
        FRSyllableAdapter3 fRSyllableAdapter3 = new FRSyllableAdapter3(Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("ph", "th", "gu", "qu", "ex", "ex", "cc", "sc", "ch", "mn", "gn"));
        ((t) j()).f33294p.setLayoutManager(new LinearLayoutManager(1));
        ((t) j()).f33294p.setAdapter(fRSyllableAdapter3);
        ((t) j()).f33294p.setNestedScrollingEnabled(false);
        G(fRSyllableAdapter3);
    }

    public final void y(String status, boolean z11) {
        m.f(status, "status");
        e3 e3Var = ((t) j()).f33281b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }

    public final void z() {
        List listK;
        Collection collectionT;
        String str = this.f21871r0;
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.K("y"));
        ((t) p.z(2, ((t) j()).f33301w, this)).f33301w.setAdapter(eSSyllableAdapter1);
        ((t) j()).f33301w.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    public final void L() {
        List listK;
        Collection collectionT;
        String str = ADSb.pivejRgLkFl;
        String str2 = this.C0;
        Matcher matcher = e0.u(0, "\n", str, str2, "input").matcher(str2);
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
        ESSyllableAdapter1 eSSyllableAdapter1 = new ESSyllableAdapter1(R.layout.es_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.K("s"));
        ((t) p.z(2, ((t) j()).S, this)).S.setAdapter(eSSyllableAdapter1);
        ((t) j()).S.setNestedScrollingEnabled(false);
        G(eSSyllableAdapter1);
    }

    public final void R() {
        List listK;
        Collection collectionT;
        String str = OCBJEWZHh.lKxwnbIjkeinA;
        String str2 = this.P;
        Matcher matcher = e0.u(0, "\t", str, str2, "input").matcher(str2);
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
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                    break;
                }
            } else {
                collectionT = r.f50854a;
                break;
            }
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 1; i11 < 41; i11++) {
            try {
                TextView textView = (TextView) findViewById(h.w("tv_span_" + i11));
                if (textView != null) {
                    arrayList2.add(textView);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        Iterator it = arrayList2.iterator();
        m.e(it, "iterator(...)");
        while (it.hasNext()) {
            TextView textView2 = (TextView) it.next();
            String string = textView2.getText().toString();
            SpannableString spannableString = new SpannableString(string);
            for (String str3 : strArr) {
                if (oz.q.v0(string, str3, false)) {
                    spannableString.setSpan(new sk.e(this, str3), oz.q.I0(string, str3, 0, false, 6), str3.length() + oz.q.I0(string, str3, 0, false, 6), 33);
                }
            }
            textView2.setText(spannableString);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void N() {
        List listK;
        Collection collectionT;
        StringBuilder sbQ = e0.q(getString(R.string.fr_alp_table_content_2), ealNNtLp.GvHOPVu, getString(R.string.fr_alp_table_content_3), "\tindex,examen\n", getString(R.string.fr_alp_table_content_4));
        sbQ.append("\tsix,dix");
        String string = sbQ.toString();
        Matcher matcher = e0.u(0, "\n", "compile(...)", string, "input").matcher(string);
        if (!matcher.find()) {
            listK = o.K(string.toString());
        } else {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, string, iC, arrayList);
            } while (matcher.find());
            p.B(iC, string, arrayList);
            listK = arrayList;
        }
        if (!listK.isEmpty()) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        } else {
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        FRSyllableAdapter1 fRSyllableAdapter1 = new FRSyllableAdapter1(R.layout.fr_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L("x\nx", "x\nx", "x\nx"));
        ((t) j()).U.setLayoutManager(new LinearLayoutManager(1));
        ((t) j()).U.setAdapter(fRSyllableAdapter1);
        ((t) j()).U.setNestedScrollingEnabled(false);
        G(fRSyllableAdapter1);
    }

    public final void O() {
        List listK;
        Collection collectionT;
        String strR = p.r(getString(R.string.fr_alp_table_content_5), "\tfrançais,chaud\n", getString(R.string.fr_alp_table_content_6), "\tfrançaise,chaude");
        Matcher matcher = e0.u(0, "\n", "compile(...)", strR, "input").matcher(strR);
        if (!matcher.find()) {
            listK = o.K(strR.toString());
        } else {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, strR, iC, arrayList);
            } while (matcher.find());
            p.B(iC, strR, arrayList);
            listK = arrayList;
        }
        if (!listK.isEmpty()) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        } else {
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        FRSyllableAdapter1 fRSyllableAdapter1 = new FRSyllableAdapter1(R.layout.fr_syllable_table_item_1, Arrays.asList(Arrays.copyOf(strArr, strArr.length)), o.L(ealNNtLp.kYFArV, "s\nd"));
        ((t) j()).V.setLayoutManager(new LinearLayoutManager(1));
        ((t) j()).V.setAdapter(fRSyllableAdapter1);
        ((t) j()).V.setNestedScrollingEnabled(false);
        G(fRSyllableAdapter1);
    }
}
