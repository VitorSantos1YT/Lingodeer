package com.lingo.lingoskill.itskill.ui.learn;

import a9.i;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import b7.e0;
import cm.a;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.espanskill.ui.learn.adapter.ESSyllableAdapter2;
import com.lingo.lingoskill.itskill.ui.learn.adapter.ITSyllableAdapter1;
import com.lingo.lingoskill.itskill.ui.learn.adapter.ITSyllableAdapter2;
import com.lingo.lingoskill.itskill.ui.learn.adapter.ITSyllableAdapter3;
import com.lingo.lingoskill.itskill.ui.learn.adapter.ITSyllableAdapter4;
import com.lingo.lingoskill.itskill.ui.learn.adapter.ITSyllableAdapter5;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import fv.c;
import hh.p0;
import hj.e3;
import hj.w;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import ji.b;
import kotlin.jvm.internal.m;
import lt.AJC.PQgum;
import ns.o;
import nv.p;
import oz.q;
import ry.r;
import th.j;
import yx.d;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ITSyllableIntroductionActivity extends b {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f21889h0 = 0;
    public final c P;
    public int Q;
    public final a R;
    public final i S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    public final String X;
    public final String Y;
    public final String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final String f21890a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final String f21891b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final String f21892c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final String f21893d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f21894e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final String f21895f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String f21896g0;

    public ITSyllableIntroductionActivity() {
        super("AlphabetIntro", yl.c.f57863a);
        this.P = new c();
        a aVar = new a(0);
        HashMap map = new HashMap();
        aVar.f7184b = map;
        map.clear();
        for (String str : "a\ta\nb\tb\nc\tc\nd\td\ne\te\nf\tf\ng\tg\nh\th\ni\ti\nj\tj\nk\tk\nl\tl\nm\tm\nn\tn\no\to\np\tp\nq\tq\nr\tr\ns\ts\nt\tt\nu\tu\nv\tv\nw\tw\nx\tx\ny\ty\nz\tz\ne4\tè\ncaffe4\tcaffè\no4\tò\ncuore\tcuore*\ne2\té\nperche2\tperché\no2\tó\ncorrere\tcorrere*\nuniversita4\tuniversità\ncosi4\tcosì\npuo4\tpuò\nvirtu4\tvirtù\npe4sca\tpèsca\npe2sca\tpésca\nballa\tballa\npalla\tpalla\ndue\tdue\ntu\ttu\nfare\tfare\nvalore\tvalore\ncara\tcara\ngara\tgara\nhanno\thanno\nluogo\tluogo\nruolo\truolo\nmadre\tmadre\nora\tora\nquesto\tquesto\nsuono\tsuono\nzaino\tzaino\nca\tca\ncasa\tcasa\nco\tco\ncosa\tcosa\ncu\tcu\ncucina\tcucina\nga\tga\ngatto\tgatto\ngo\tgo\ngodere\tgodere\ngu\tgu\nguida\tguida\nci\tci\nCina\tCina\nce\tce\nluce\tluce\ngi\tgi\ngiro\tgiro\nge\tge\ngelato\tgelato\nchi\tchi\nchiave\tchiave\nche\tche\npacchetto\tpacchetto\nghi\tghi\nghiaccio\tghiaccio\nghe\tghe\nUngheria\tUngheria\nragazzo\tragazzo\npranzo\tpranzo\nsport\tsport\nmusica\tmusica\nuscita\tuscita\nconosce\tconosce\nschiena\tschiena\nmaschile\tmaschile\nbagno\tbagno\nsogno\tsogno\nfamiglia\tfamiglia\nmeglio\tmeglio\nnegligente\tnegligente\npolo\tpolo\npollo\tpollo\nnono\tnono\nnonno\tnonno".split("\n")) {
            String[] strArrSplit = str.split("\t");
            aVar.f7184b.put(strArrSplit[1], strArrSplit[0]);
        }
        this.R = aVar;
        this.S = new i(1);
        this.T = "A a\nB b\nC c\nD d\nE e\nF f\nG g\nH h\nI i\nJ j\nK k\nL l\nM m\nN n\nO o\nP p\nQ q\nR r\nS s\nT t\nU u\nV v\nW w\nX x\nY y\nZ z";
        this.U = "a\ne\ni\no\nu";
        this.V = "università\nperché\ncosì\npuò\nvirtù";
        this.W = "b\tballa\np\tpalla\nd\tdue\nt\ttu\nf\tfare\nv\tvalore\nc\tcara\ng\tgara\nh\thanno\nl\tluogo\nr\truolo\nm\tmadre\ns\tsuono\nz\tzaino\nq\tquesto";
        this.X = "ca\tcasa\nga\tgatto\nco\tcosa\ngo\tgodere\ncu\tcucina\ngu\tguida";
        this.Y = "ci\tCina\ngi\tgiro\nce\tluce\nge\tgelato";
        this.Z = "hanno";
        this.f21890a0 = "chi\tchiave\nghi\tghiaccio\nche\tpacchetto\nghe\tUngheria";
        this.f21891b0 = "z!@@@!/ts/\tragazzo\t/dz/\tpranzo\ns!@@@!/s/\tsport\t/z/\tmusica";
        this.f21892c0 = "uscita\nconosce";
        this.f21893d0 = "schiena\nmaschile";
        this.f21894e0 = "bagno\nsogno";
        this.f21895f0 = "famiglia\nmeglio";
        this.f21896g0 = "negligente";
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.P.a(this.Q);
    }

    public final void u(String status, boolean z11) {
        m.f(status, "status");
        e3 e3Var = ((w) j()).f33477b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }

    public final void v(BaseQuickAdapter baseQuickAdapter) {
        baseQuickAdapter.setOnItemChildClickListener(new yl.b(this));
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
        String string = getString(R.string.alphabet);
        m.e(string, PQgum.pspZKbgdiIjqhP);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        l.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        String str = this.T;
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
        List listT15 = r.f50854a;
        if (!zIsEmpty) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listT = listT15;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    listT = e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            listT = listT15;
            break;
        }
        ITSyllableAdapter1 iTSyllableAdapter1 = new ITSyllableAdapter1(listT, null);
        ((w) j()).f33479d.setLayoutManager(new GridLayoutManager(5));
        ((w) j()).f33479d.setAdapter(iTSyllableAdapter1);
        v(iTSyllableAdapter1);
        String str2 = this.U;
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
                    listT2 = listT15;
                    break;
                } else if (((String) listIterator2.previous()).length() != 0) {
                    listT2 = e0.t(listIterator2, 1, listK2);
                    break;
                }
            }
        } else {
            listT2 = listT15;
            break;
        }
        ITSyllableAdapter1 iTSyllableAdapter2 = new ITSyllableAdapter1(listT2, null);
        ((w) j()).m.setLayoutManager(new GridLayoutManager(5));
        ((w) j()).m.setAdapter(iTSyllableAdapter2);
        v(iTSyllableAdapter2);
        ITSyllableAdapter2 iTSyllableAdapter3 = new ITSyllableAdapter2(q.W0(p.r(getString(R.string.it_alp_section_table_5), "!@@@!è\tcaffè\tò\tcuore*\n", getString(R.string.it_alp_section_table_6), "!@@@!é\tperché\tó\tcorrere*"), new String[]{"\n"}, 0, 6), o.L("è\to", "é\to"));
        ((w) j()).f33488n.setLayoutManager(new LinearLayoutManager(1));
        ((w) j()).f33488n.setAdapter(iTSyllableAdapter3);
        v(iTSyllableAdapter3);
        String str3 = this.V;
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
                    listT3 = listT15;
                    break;
                } else if (((String) listIterator3.previous()).length() != 0) {
                    listT3 = e0.t(listIterator3, 1, listK3);
                    break;
                }
            }
        } else {
            listT3 = listT15;
            break;
        }
        ITSyllableAdapter1 iTSyllableAdapter4 = new ITSyllableAdapter1(listT3, o.L("tà", "ché", "sì", "ò", "tù"));
        ((w) j()).f33489o.setLayoutManager(new GridLayoutManager(5));
        ((w) j()).f33489o.setAdapter(iTSyllableAdapter4);
        v(iTSyllableAdapter4);
        String strN = e.n("pesca\t[pèsca] ", getString(R.string.it_alp_section_table_7), "\npesca\t[pésca] ", getString(R.string.it_alp_section_table_8));
        Matcher matcher4 = e0.u(0, "\n", "compile(...)", strN, "input").matcher(strN);
        if (matcher4.find()) {
            ArrayList arrayList4 = new ArrayList(10);
            int iC4 = 0;
            do {
                iC4 = p.c(matcher4, strN, iC4, arrayList4);
            } while (matcher4.find());
            p.B(iC4, strN, arrayList4);
            listK4 = arrayList4;
        } else {
            listK4 = o.K(strN.toString());
        }
        if (!listK4.isEmpty()) {
            ListIterator listIterator4 = listK4.listIterator(listK4.size());
            while (true) {
                if (!listIterator4.hasPrevious()) {
                    listT4 = listT15;
                    break;
                } else if (((String) listIterator4.previous()).length() != 0) {
                    listT4 = e0.t(listIterator4, 1, listK4);
                    break;
                }
            }
        } else {
            listT4 = listT15;
            break;
        }
        ITSyllableAdapter3 iTSyllableAdapter5 = new ITSyllableAdapter3(listT4, o.L("e\tè", "e\té"));
        ((w) j()).f33490p.setLayoutManager(new LinearLayoutManager(1));
        ((w) j()).f33490p.setAdapter(iTSyllableAdapter5);
        v(iTSyllableAdapter5);
        String str4 = this.W;
        Matcher matcher5 = e0.u(0, "\n", "compile(...)", str4, "input").matcher(str4);
        if (matcher5.find()) {
            ArrayList arrayList5 = new ArrayList(10);
            int iC5 = 0;
            do {
                iC5 = p.c(matcher5, str4, iC5, arrayList5);
            } while (matcher5.find());
            p.B(iC5, str4, arrayList5);
            listK5 = arrayList5;
        } else {
            listK5 = o.K(str4.toString());
        }
        if (!listK5.isEmpty()) {
            ListIterator listIterator5 = listK5.listIterator(listK5.size());
            while (true) {
                if (!listIterator5.hasPrevious()) {
                    listT5 = listT15;
                    break;
                } else if (((String) listIterator5.previous()).length() != 0) {
                    listT5 = e0.t(listIterator5, 1, listK5);
                    break;
                }
            }
        } else {
            listT5 = listT15;
            break;
        }
        ESSyllableAdapter2 eSSyllableAdapter2 = new ESSyllableAdapter2(R.layout.es_syllable_table_item_2, listT5);
        ((w) j()).f33491q.setLayoutManager(new GridLayoutManager(2));
        ((w) j()).f33491q.setAdapter(eSSyllableAdapter2);
        v(eSSyllableAdapter2);
        String str5 = this.X;
        Matcher matcher6 = e0.u(0, "\n", "compile(...)", str5, "input").matcher(str5);
        if (matcher6.find()) {
            ArrayList arrayList6 = new ArrayList(10);
            int iC6 = 0;
            do {
                iC6 = p.c(matcher6, str5, iC6, arrayList6);
            } while (matcher6.find());
            p.B(iC6, str5, arrayList6);
            listK6 = arrayList6;
        } else {
            listK6 = o.K(str5.toString());
        }
        if (!listK6.isEmpty()) {
            ListIterator listIterator6 = listK6.listIterator(listK6.size());
            while (true) {
                if (!listIterator6.hasPrevious()) {
                    listT6 = listT15;
                    break;
                } else if (((String) listIterator6.previous()).length() != 0) {
                    listT6 = e0.t(listIterator6, 1, listK6);
                    break;
                }
            }
        } else {
            listT6 = listT15;
            break;
        }
        ITSyllableAdapter5 iTSyllableAdapter6 = new ITSyllableAdapter5(R.layout.it_syllable_table_item_2, listT6);
        ((w) j()).f33492r.setLayoutManager(new GridLayoutManager(2));
        ((w) j()).f33492r.setAdapter(iTSyllableAdapter6);
        v(iTSyllableAdapter6);
        String str6 = this.Y;
        Matcher matcher7 = e0.u(0, "\n", "compile(...)", str6, "input").matcher(str6);
        if (matcher7.find()) {
            ArrayList arrayList7 = new ArrayList(10);
            int iC7 = 0;
            do {
                iC7 = p.c(matcher7, str6, iC7, arrayList7);
            } while (matcher7.find());
            p.B(iC7, str6, arrayList7);
            listK7 = arrayList7;
        } else {
            listK7 = o.K(str6.toString());
        }
        if (!listK7.isEmpty()) {
            ListIterator listIterator7 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator7.hasPrevious()) {
                    listT7 = listT15;
                    break;
                } else if (((String) listIterator7.previous()).length() != 0) {
                    listT7 = e0.t(listIterator7, 1, listK7);
                    break;
                }
            }
        } else {
            listT7 = listT15;
            break;
        }
        ITSyllableAdapter5 iTSyllableAdapter7 = new ITSyllableAdapter5(R.layout.it_syllable_table_item_2, listT7);
        ((w) j()).f33493s.setLayoutManager(new GridLayoutManager(2));
        ((w) j()).f33493s.setAdapter(iTSyllableAdapter7);
        v(iTSyllableAdapter7);
        String str7 = this.Z;
        Matcher matcher8 = e0.u(0, "\n", "compile(...)", str7, "input").matcher(str7);
        if (matcher8.find()) {
            ArrayList arrayList8 = new ArrayList(10);
            int iC8 = 0;
            do {
                iC8 = p.c(matcher8, str7, iC8, arrayList8);
            } while (matcher8.find());
            p.B(iC8, str7, arrayList8);
            listK8 = arrayList8;
        } else {
            listK8 = o.K(str7.toString());
        }
        if (!listK8.isEmpty()) {
            ListIterator listIterator8 = listK8.listIterator(listK8.size());
            while (true) {
                if (!listIterator8.hasPrevious()) {
                    listT8 = listT15;
                    break;
                } else if (((String) listIterator8.previous()).length() != 0) {
                    listT8 = e0.t(listIterator8, 1, listK8);
                    break;
                }
            }
        } else {
            listT8 = listT15;
            break;
        }
        ITSyllableAdapter1 iTSyllableAdapter8 = new ITSyllableAdapter1(listT8, null);
        ((w) j()).f33494t.setLayoutManager(new GridLayoutManager(1));
        ((w) j()).f33494t.setAdapter(iTSyllableAdapter8);
        v(iTSyllableAdapter8);
        String str8 = this.f21890a0;
        Matcher matcher9 = e0.u(0, "\n", "compile(...)", str8, "input").matcher(str8);
        if (matcher9.find()) {
            ArrayList arrayList9 = new ArrayList(10);
            int iC9 = 0;
            do {
                iC9 = p.c(matcher9, str8, iC9, arrayList9);
            } while (matcher9.find());
            p.B(iC9, str8, arrayList9);
            listK9 = arrayList9;
        } else {
            listK9 = o.K(str8.toString());
        }
        if (!listK9.isEmpty()) {
            ListIterator listIterator9 = listK9.listIterator(listK9.size());
            while (true) {
                if (!listIterator9.hasPrevious()) {
                    listT9 = listT15;
                    break;
                } else if (((String) listIterator9.previous()).length() != 0) {
                    listT9 = e0.t(listIterator9, 1, listK9);
                    break;
                }
            }
        } else {
            listT9 = listT15;
            break;
        }
        ITSyllableAdapter5 iTSyllableAdapter9 = new ITSyllableAdapter5(R.layout.it_syllable_table_item_2, listT9);
        ((w) j()).f33480e.setLayoutManager(new GridLayoutManager(2));
        ((w) j()).f33480e.setAdapter(iTSyllableAdapter9);
        v(iTSyllableAdapter9);
        ITSyllableAdapter4 iTSyllableAdapter10 = new ITSyllableAdapter4(q.W0(this.f21891b0, new String[]{"\n"}, 0, 6), o.L("zz\tz", "s\ts"));
        ((w) j()).f33481f.setLayoutManager(new LinearLayoutManager(1));
        ((w) j()).f33481f.setAdapter(iTSyllableAdapter10);
        v(iTSyllableAdapter10);
        String str9 = this.f21892c0;
        Matcher matcher10 = e0.u(0, "\n", "compile(...)", str9, "input").matcher(str9);
        if (matcher10.find()) {
            ArrayList arrayList10 = new ArrayList(10);
            int iC10 = 0;
            do {
                iC10 = p.c(matcher10, str9, iC10, arrayList10);
            } while (matcher10.find());
            p.B(iC10, str9, arrayList10);
            listK10 = arrayList10;
        } else {
            listK10 = o.K(str9.toString());
        }
        if (!listK10.isEmpty()) {
            ListIterator listIterator10 = listK10.listIterator(listK10.size());
            while (true) {
                if (!listIterator10.hasPrevious()) {
                    listT10 = listT15;
                    break;
                } else if (((String) listIterator10.previous()).length() != 0) {
                    listT10 = e0.t(listIterator10, 1, listK10);
                    break;
                }
            }
        } else {
            listT10 = listT15;
            break;
        }
        ITSyllableAdapter1 iTSyllableAdapter11 = new ITSyllableAdapter1(listT10, o.K("sc"));
        ((w) j()).f33482g.setLayoutManager(new GridLayoutManager(2));
        ((w) j()).f33482g.setAdapter(iTSyllableAdapter11);
        v(iTSyllableAdapter11);
        String str10 = this.f21893d0;
        Matcher matcher11 = e0.u(0, "\n", "compile(...)", str10, "input").matcher(str10);
        if (matcher11.find()) {
            ArrayList arrayList11 = new ArrayList(10);
            int iC11 = 0;
            do {
                iC11 = p.c(matcher11, str10, iC11, arrayList11);
            } while (matcher11.find());
            p.B(iC11, str10, arrayList11);
            listK11 = arrayList11;
        } else {
            listK11 = o.K(str10.toString());
        }
        if (!listK11.isEmpty()) {
            ListIterator listIterator11 = listK11.listIterator(listK11.size());
            while (true) {
                if (!listIterator11.hasPrevious()) {
                    listT11 = listT15;
                    break;
                } else if (((String) listIterator11.previous()).length() != 0) {
                    listT11 = e0.t(listIterator11, 1, listK11);
                    break;
                }
            }
        } else {
            listT11 = listT15;
            break;
        }
        ITSyllableAdapter1 iTSyllableAdapter12 = new ITSyllableAdapter1(listT11, o.K("sch"));
        ((w) j()).f33483h.setLayoutManager(new GridLayoutManager(2));
        ((w) j()).f33483h.setAdapter(iTSyllableAdapter12);
        v(iTSyllableAdapter12);
        String str11 = this.f21894e0;
        Matcher matcher12 = e0.u(0, "\n", "compile(...)", str11, "input").matcher(str11);
        if (matcher12.find()) {
            ArrayList arrayList12 = new ArrayList(10);
            int iC12 = 0;
            do {
                iC12 = p.c(matcher12, str11, iC12, arrayList12);
            } while (matcher12.find());
            p.B(iC12, str11, arrayList12);
            listK12 = arrayList12;
        } else {
            listK12 = o.K(str11.toString());
        }
        if (!listK12.isEmpty()) {
            ListIterator listIterator12 = listK12.listIterator(listK12.size());
            while (true) {
                if (!listIterator12.hasPrevious()) {
                    listT12 = listT15;
                    break;
                } else if (((String) listIterator12.previous()).length() != 0) {
                    listT12 = e0.t(listIterator12, 1, listK12);
                    break;
                }
            }
        } else {
            listT12 = listT15;
            break;
        }
        ITSyllableAdapter1 iTSyllableAdapter13 = new ITSyllableAdapter1(listT12, o.K("gn"));
        ((w) j()).f33484i.setLayoutManager(new GridLayoutManager(2));
        ((w) j()).f33484i.setAdapter(iTSyllableAdapter13);
        v(iTSyllableAdapter13);
        String str12 = this.f21895f0;
        Matcher matcher13 = e0.u(0, "\n", "compile(...)", str12, "input").matcher(str12);
        if (matcher13.find()) {
            ArrayList arrayList13 = new ArrayList(10);
            int iC13 = 0;
            do {
                iC13 = p.c(matcher13, str12, iC13, arrayList13);
            } while (matcher13.find());
            p.B(iC13, str12, arrayList13);
            listK13 = arrayList13;
        } else {
            listK13 = o.K(str12.toString());
        }
        if (!listK13.isEmpty()) {
            ListIterator listIterator13 = listK13.listIterator(listK13.size());
            while (true) {
                if (!listIterator13.hasPrevious()) {
                    listT13 = listT15;
                    break;
                } else if (((String) listIterator13.previous()).length() != 0) {
                    listT13 = e0.t(listIterator13, 1, listK13);
                    break;
                }
            }
        } else {
            listT13 = listT15;
            break;
        }
        ITSyllableAdapter1 iTSyllableAdapter14 = new ITSyllableAdapter1(listT13, o.K("gli"));
        ((w) j()).f33485j.setLayoutManager(new GridLayoutManager(2));
        ((w) j()).f33485j.setAdapter(iTSyllableAdapter14);
        v(iTSyllableAdapter14);
        String str13 = this.f21896g0;
        Matcher matcher14 = e0.u(0, "\n", "compile(...)", str13, "input").matcher(str13);
        if (matcher14.find()) {
            ArrayList arrayList14 = new ArrayList(10);
            int iC14 = 0;
            do {
                iC14 = p.c(matcher14, str13, iC14, arrayList14);
            } while (matcher14.find());
            p.B(iC14, str13, arrayList14);
            listK14 = arrayList14;
        } else {
            listK14 = o.K(str13.toString());
        }
        if (!listK14.isEmpty()) {
            ListIterator listIterator14 = listK14.listIterator(listK14.size());
            while (true) {
                if (!listIterator14.hasPrevious()) {
                    listT14 = listT15;
                    break;
                } else if (((String) listIterator14.previous()).length() != 0) {
                    listT14 = e0.t(listIterator14, 1, listK14);
                    break;
                }
            }
        } else {
            listT14 = listT15;
            break;
        }
        ITSyllableAdapter1 iTSyllableAdapter15 = new ITSyllableAdapter1(listT14, o.K("gli"));
        ((w) j()).f33486k.setLayoutManager(new GridLayoutManager(1));
        ((w) j()).f33486k.setAdapter(iTSyllableAdapter15);
        v(iTSyllableAdapter15);
        String strP = e.p(e.s("polo (", getString(R.string.it_alp_section_table_1), ")\npollo (", getString(R.string.it_alp_section_table_2), ")\nnono ("), getString(R.string.it_alp_section_table_3), ")\nnonno (", getString(R.string.it_alp_section_table_4), ")");
        Matcher matcher15 = e0.u(0, "\n", "compile(...)", strP, "input").matcher(strP);
        if (matcher15.find()) {
            ArrayList arrayList15 = new ArrayList(10);
            int iC15 = 0;
            do {
                iC15 = p.c(matcher15, strP, iC15, arrayList15);
            } while (matcher15.find());
            p.B(iC15, strP, arrayList15);
            listK15 = arrayList15;
        } else {
            listK15 = o.K(strP.toString());
        }
        if (!listK15.isEmpty()) {
            ListIterator listIterator15 = listK15.listIterator(listK15.size());
            while (listIterator15.hasPrevious()) {
                if (((String) listIterator15.previous()).length() != 0) {
                    listT15 = e0.t(listIterator15, 1, listK15);
                    break;
                }
            }
        }
        ITSyllableAdapter1 iTSyllableAdapter16 = new ITSyllableAdapter1(listT15, o.L("l", "ll", "n", "nn"));
        ((w) j()).f33487l.setLayoutManager(new GridLayoutManager(2));
        ((w) j()).f33487l.setAdapter(iTSyllableAdapter16);
        v(iTSyllableAdapter16);
        File file = new File(e.m(xt.b.a().b(), fv.b.D(-1L)));
        fv.a aVar = new fv.a(0L, fv.b.E(-1L), fv.b.D(-1L));
        if (file.exists()) {
            d dVarM = new yx.a(new bo.c(file, 8), 0).M(ky.e.f38937b);
            qx.o oVarA = px.b.a();
            xx.d dVar = new xx.d(vx.b.f54316e, new yl.b(this));
            try {
                dVarM.K(new yx.b(dVar, oVarA));
                j.a(dVar, this.f36391f);
            } catch (NullPointerException e8) {
                throw e8;
            } catch (Throwable th2) {
                throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
            }
        } else {
            ((LinearLayout) ((w) j()).f33477b.f32525d).setVisibility(8);
            this.P.d(aVar, new aj.e(this, 28));
        }
        if (q.v0("release", "debug", false)) {
            ((w) j()).f33478c.setOnLongClickListener(new fk.c(this, 8));
        }
    }
}
