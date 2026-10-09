package qp;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f2 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Sentence f47923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h f47924l;
    public List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f47925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f47926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public po.a f47927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f47928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qy.q f47929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f47930s;

    public f2(mp.b bVar, long j11) {
        super(bVar, j11, 0);
        this.f47925n = ff.h.l(2.0f);
        this.f47926o = BuildConfig.VERSION_NAME;
        this.f47928q = new AtomicBoolean(false);
        this.f47929r = com.bumptech.glide.d.v(new ns.d(26));
        this.f47930s = 1;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        return fv.b.G(this.f47882b, null, null);
    }

    @Override // qp.a, hi.a
    public final String c() {
        return this.f47930s + ";" + this.f47882b + ";7";
    }

    @Override // qp.a, qp.d, hi.a
    public final void f() throws IOException {
        super.f();
        h hVar = this.f47924l;
        if (hVar != null) {
            hVar.b();
        }
        po.a aVar = this.f47927p;
        if (aVar != null) {
            aVar.a();
        }
        ((av.i) this.f47929r.getValue()).c();
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        long j11 = this.f47882b;
        arrayList.add(new fv.a(2L, fv.b.H(j11), fv.b.F(j11)));
        Sentence sentence = this.f47923k;
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
        return this.f47930s;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        Sentence sentenceE = ij.c.e(this.f47882b);
        if (sentenceE == null) {
            throw new NoSuchElemException();
        }
        this.f47923k = sentenceE;
    }

    @Override // hi.a
    public final void k() {
        h hVar = this.f47924l;
        if (hVar != null) {
            hVar.e();
        } else {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return e2.f47910a;
    }

    public final void u() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.n2) aVar).f32976j.setVisibility(8);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.n2) aVar2).f32974h.setVisibility(0);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.n2) aVar3).f32968b.setBackgroundResource(R.drawable.point_accent);
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.n2) aVar4).f32973g.setEnabled(true);
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((hj.n2) aVar5).f32969c.setBackgroundResource(R.drawable.point_accent);
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((hj.n2) aVar6).f32972f.setEnabled(true);
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        bq.z.b(((hj.n2) aVar7).f32972f, new c2(this, 4));
    }

    public final void v() {
        mp.b bVar = this.f47881a;
        th.e eVar = ((jp.p0) bVar).V;
        if (eVar != null) {
            eVar.n();
        }
        th.e eVar2 = ((jp.p0) bVar).V;
        if (eVar2 != null) {
            eVar2.a();
        }
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.n2) aVar).f32972f.setEnabled(true);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        android.support.v4.media.session.a.H(((hj.n2) aVar2).f32972f.getBackground());
    }

    @Override // qp.d
    public final void p() throws IOException {
        Sentence sentence = this.f47923k;
        if (sentence == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = sentence.getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        this.m = sentWords;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((hj.n2) aVar).f32971e;
        mp.b bVar = this.f47881a;
        bVar.getClass();
        Context context = this.f47883c;
        this.f47924l = new h(context, sentWords, flexboxLayout, this, 7);
        int[] iArr = bq.r.f4959a;
        boolean zF = bq.m.F();
        int i11 = 2;
        Env env = this.f47884d;
        String str = SemtNwfPgIhi.xvsGHYqpoBgR;
        if (!zF || env.csDisplay == 0) {
            h hVar = this.f47924l;
            if (hVar == null) {
                kotlin.jvm.internal.m.n(str);
                throw null;
            }
            hVar.f59274j = this.f47925n;
        } else {
            h hVar2 = this.f47924l;
            if (hVar2 == null) {
                kotlin.jvm.internal.m.n(str);
                throw null;
            }
            hVar2.f59274j = 2;
        }
        h hVar3 = this.f47924l;
        if (hVar3 == null) {
            kotlin.jvm.internal.m.n(str);
            throw null;
        }
        int i12 = 0;
        hVar3.f59278o = false;
        hVar3.m = new lp.j(this, 17);
        hVar3.d();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ConstraintLayout rootParent = ((hj.n2) aVar2).f32975i;
        kotlin.jvm.internal.m.e(rootParent, "rootParent");
        bq.z.b(rootParent, new c2(this, 1));
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        TextView textView = ((hj.n2) aVar3).f32978l;
        Sentence sentence2 = this.f47923k;
        if (sentence2 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        textView.setText(sentence2.getTranslations());
        ((jp.p0) bVar).O(2);
        ef.e.B(o());
        this.f47927p = new po.a(context.getApplicationContext());
        this.f47926o = defpackage.e.m(env.tempDir, "userRecorder.wav");
        if (new File(this.f47926o).exists()) {
            new File(this.f47926o).delete();
        }
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        bq.z.b(((hj.n2) aVar4).m, new c2(this, i11));
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        bq.z.b(((hj.n2) aVar5).f32974h, new c2(this, 3));
        po.a aVar6 = this.f47927p;
        if (aVar6 != null) {
            aVar6.c();
        }
        this.f47928q.set(false);
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        bq.z.b(((hj.n2) aVar7).f32973g, new c2(this, i12));
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().isTestAutoPlayAudio) {
            ta.a aVar8 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar8);
            ((hj.n2) aVar8).f32973g.performClick();
        }
    }
}
