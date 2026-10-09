package com.lingo.lingoskill.englishskill.ui.learn;

import a9.i;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import b7.e0;
import com.lingo.lingoskill.englishskill.ui.learn.adapter.ENSyllableAdapter1;
import com.lingo.lingoskill.englishskill.ui.learn.adapter.ENSyllableAdapter2;
import com.lingo.lingoskill.englishskill.ui.learn.adapter.ENSyllableAdapter4;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fv.c;
import hj.e3;
import hj.z3;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ji.b;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import ob.e;
import oz.q;
import th.j;
import yj.a;
import yx.d;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ENSyllableIntroductionActivity extends b {
    public static final /* synthetic */ int V = 0;
    public final c P;
    public int Q;
    public final e R;
    public final i S;
    public final String T;
    public final aj.b U;

    public ENSyllableIntroductionActivity() {
        super("AlphabetIntro", yj.b.f57861a);
        this.P = new c();
        e eVar = new e(6, false);
        HashMap map = new HashMap();
        eVar.f44804b = map;
        eVar.f44805c = new HashMap();
        map.clear();
        for (String str : "/ɑː/\t1\n/e/\t2\n/ɜː/\t3\n/iː/\t4\n/ɔː/\t5\n/uː/\t6\n/aɪ/\t7\n/aʊ/\t8\n/ʌ/\t9\n/æ/\t10\n/ə/\t11\n/ɪ/\t12\n/ɒ/\t13\n/ʊ/\t14\n/eɪ/\t15\n/ɔɪ/\t16\n/ɑːr/\t17\n/ɔːr/\t18\n/ɜːr/\t19\n/ər/\t20\nstart\tstartus\nnorth\tnorthus\nword\twordus\nmother\tmotherus".split("\n")) {
            String[] strArrSplit = str.split("\t");
            ((HashMap) eVar.f44804b).put(strArrSplit[0], strArrSplit[1]);
        }
        ((HashMap) eVar.f44805c).clear();
        for (String str2 : "start\tstartuk\nnorth\tnorthuk\nword\tworduk\nmother\tmotheruk\ncolour\tcolour\ncentre\tcentre\ngrey\tgrey\n/ɑː/\t21\n/ɔː/\t22\n/ɜː/\t23\n/ə/\t24".split("\n")) {
            String[] strArrSplit2 = str2.split("\t");
            ((HashMap) eVar.f44805c).put(strArrSplit2[0], strArrSplit2[1]);
        }
        this.R = eVar;
        this.S = new i(1);
        this.T = "A a\tB b\tC c\tD d\tE e\tF f\tG g\tH h\tI i\tJ j\tK k\tL l\tM m\tN n\tO o\tP p\tQ q\tR r\tS s\tT t\tU u\tV v\tW w\tX x\tY y\tZ z";
        this.U = new aj.b(this, 26);
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.P.a(this.Q);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        ve.i.I(R.string.alphabet, this);
        int i11 = 0;
        int i12 = 6;
        ENSyllableAdapter1 eNSyllableAdapter1 = new ENSyllableAdapter1(R.layout.es_syllable_table_item_1, q.W0(this.T, new String[]{"\t"}, 0, 6));
        ((z3) j()).f33667f.setLayoutManager(new GridLayoutManager(5));
        ((z3) j()).f33667f.setAdapter(eNSyllableAdapter1);
        eNSyllableAdapter1.setOnItemChildClickListener(new a(this));
        List listW0 = q.W0(p.u(e0.q(getString(R.string.en_alp_content_19), "\t", getString(R.string.en_alp_content_20), "\t", getString(R.string.en_alp_content_19)), "\t", getString(R.string.en_alp_content_20), "\n/b/\tbuy  /baɪ/\t/p/\tpie  /paɪ/\n/d/\tdie  /daɪ/\t/t/\ttie  /taɪ/\n/dʒ/\tgiant  */ˈdʒaɪənt/\t/tʃ/\tchill  /ˈtʃɪl/\n/v/\tvan  /væn/\t/f/\tfan  /fæn/\n/ɡ/\tgood  /gʊd/\t/k/\tcook  /kʊk/\n/z/\tzoo  /zuː/\t/s/\tsue  /suː/\n/ð/\tthough  /ðəʊ/\t/θ/\tthrow  /θrəʊ/\n/r/\trye  /raɪ/\t/l/\tlie  /laɪ/\n/ʒ/\tpleasure  /ˈpleʒər/\t/ʃ/\tshy  /ʃaɪ/\n/h/\thigh  /haɪ/\t/ŋ/\tsinger  /ˈsɪŋər/\n/m/\tmy  /maɪ/\t/n/\tnine  /naɪn/\n/j/\tyes  /jes/\t/w/\twhite  /waɪt/"), new String[]{"\n"}, 0, 6);
        List listL = o.L("b\np", "d\nt", "g\ndʒ\nch\ntʃ", "v\nf", "g\nc\nk", "z\ns", "th\nð\nθ", "r\nl", "s\nsh\nʒ\nʃ", "h\nng\nŋ", "m\nn", "y\nj\nwh\nw");
        aj.b bVar = this.U;
        ENSyllableAdapter2 eNSyllableAdapter2 = new ENSyllableAdapter2(listW0, listL, bVar, false);
        ((z3) j()).f33668g.setLayoutManager(new LinearLayoutManager(1));
        ((z3) j()).f33668g.setAdapter(eNSyllableAdapter2);
        ENSyllableAdapter2 eNSyllableAdapter3 = new ENSyllableAdapter2(q.W0(p.u(e0.q(getString(R.string.en_alp_content_19), "\t", getString(R.string.en_alp_content_20), "\t", getString(R.string.en_alp_content_19)), "\t", getString(R.string.en_alp_content_20), "\n/ɑː/\tfather  /ˈfɑːðər/\t/ʌ/\tbus  /bʌs/\n/e/\tbed  /bed/\t/æ/\tcat  /kæt/\n/ɜː/\ther  /hɜːr/\t/ə/\tfocus  /ˈfoʊkəs/\n/iː/\tsee  /siː/\t/ɪ/\tkid  /kɪd/\n/ɔː/\tthought  /θɔːt/\t/ɒ/\twatch  /wɒtʃ/\n/uː/\tfood  /fuːd/\t/ʊ/\tgood  /ɡʊd/\n/aɪ/\tpie  /paɪ/\t/eɪ/\tface  /feɪs/\n/aʊ/\tmouth  /maʊθ/\t/ɔɪ/\tboy  /bɔɪ/"), new String[]{"\n"}, 0, 6), o.L("a\nɑː\nu\nʌ", "a\næ\ne", "e\nɜː\nu\nə", "ee\niː\ni\nɪ", "ough\nɔː\na\nɒ", "oo\nuː\nʊ", "ie\naɪ\na\neɪ", "ou\naʊ\noy\nɔɪ"), bVar, true);
        ((z3) j()).f33669h.setLayoutManager(new LinearLayoutManager(1));
        ((z3) j()).f33669h.setAdapter(eNSyllableAdapter3);
        ENSyllableAdapter4 eNSyllableAdapter4 = new ENSyllableAdapter4(q.W0(p.r(getString(R.string.en_alp_content_21), "\t", getString(R.string.en_alp_content_22), "\n/ɑː/\tstart\t/ɑːr/\tstart\n/ɔː/\tnorth\t/ɔːr/\tnorth\n/ɜː/\tword\t/ɜːr/\tword\n/ə/\tmother\t/ər/\tmother"), new String[]{"\n"}, 0, 6), o.L("ar", "or", "or", "er"), bVar);
        ((z3) j()).f33670i.setLayoutManager(new LinearLayoutManager(1));
        ((z3) j()).f33670i.setAdapter(eNSyllableAdapter4);
        List listL2 = o.L("our\nor", "re\ner", "e\na");
        LinearLayout[] linearLayoutArr = {((z3) j()).f33664c, ((z3) j()).f33663b, ((z3) j()).f33666e};
        int i13 = 0;
        int i14 = 0;
        while (i13 < 3) {
            LinearLayout linearLayout = linearLayoutArr[i13];
            int i15 = i14 + 1;
            int childCount = linearLayout.getChildCount();
            int i16 = i11;
            while (i16 < childCount) {
                View childAt = linearLayout.getChildAt(i16);
                m.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) childAt;
                if (i16 == 0) {
                    textView.setTag(R.id.tag_is_bre, Boolean.TRUE);
                }
                SpannableString spannableString = new SpannableString(textView.getText().toString());
                List list = listL2;
                LinearLayout[] linearLayoutArr2 = linearLayoutArr;
                Iterator it = q.W0((CharSequence) listL2.get(i14), new String[]{"\n"}, 0, i12).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String string = spannableString.toString();
                    it = it;
                    m.e(string, "toString(...)");
                    int iI0 = q.I0(string, str, 0, false, i12);
                    if (iI0 > -1) {
                        spannableString.setSpan(new ForegroundColorSpan(getColor(R.color.colorAccent)), iI0, str.length() + iI0, 33);
                        i12 = 6;
                    }
                }
                textView.setText(spannableString);
                View childAt2 = linearLayout.getChildAt(i16);
                m.d(childAt2, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) childAt2).setOnClickListener(bVar);
                i16++;
                listL2 = list;
                linearLayoutArr = linearLayoutArr2;
                i12 = 6;
            }
            i13++;
            i14 = i15;
            i11 = 0;
            i12 = 6;
        }
        File file = new File(defpackage.e.m(xt.b.a().b(), "enes-f-zy-table.zip"));
        fv.a aVar = new fv.a(0L, "https://d5jzww2qenbcc.cloudfront.net/en/z/course/others/enes-f-zy-table.zip", "enes-f-zy-table.zip");
        if (!file.exists()) {
            e3 e3Var = ((z3) j()).f33665d;
            LinearLayout linearLayout2 = (LinearLayout) e3Var.f32525d;
            ComposeView composeView = (ComposeView) e3Var.f32524c;
            ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
            linearLayout2.setVisibility(0);
            this.P.d(aVar, new aj.e(this, 27));
            return;
        }
        d dVarM = new yx.a(new bo.c(file, 7), 0).M(ky.e.f38937b);
        qx.o oVarA = px.b.a();
        xx.d dVar = new xx.d(vx.b.f54316e, new a(this));
        try {
            dVarM.K(new yx.b(dVar, oVarA));
            j.a(dVar, this.f36391f);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    public final void u(String status, boolean z11) {
        m.f(status, "status");
        e3 e3Var = ((z3) j()).f33665d;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }
}
