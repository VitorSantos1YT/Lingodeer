package qp;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
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
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Sentence f48233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h f48234l;
    public List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f48235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f48236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public po.a f48237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f48238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f48239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qy.q f48240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f48241t;

    public w(mp.b bVar, long j11) {
        super(bVar, j11, 0);
        this.f48235n = ff.h.l(2.0f);
        this.f48236o = BuildConfig.VERSION_NAME;
        int[] iArr = bq.r.f4959a;
        this.f48238q = bq.m.b();
        this.f48239r = new AtomicBoolean(false);
        this.f48240s = com.bumptech.glide.d.v(new ns.d(24));
        this.f48241t = 1;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        return fv.b.G(this.f47882b, null, null);
    }

    @Override // qp.a, hi.a
    public final String c() {
        return this.f48241t + ";" + this.f47882b + ";7";
    }

    @Override // qp.a, qp.d, hi.a
    public final void f() throws IOException {
        super.f();
        h hVar = this.f48234l;
        if (hVar != null) {
            hVar.b();
        }
        po.a aVar = this.f48237p;
        if (aVar != null) {
            aVar.a();
        }
        ((av.i) this.f48240s.getValue()).c();
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        long j11 = this.f47882b;
        arrayList.add(new fv.a(2L, fv.b.H(j11), fv.b.F(j11)));
        Sentence sentence = this.f48233k;
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
        return this.f48241t;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        Sentence sentenceE = ij.c.e(this.f47882b);
        if (sentenceE == null) {
            throw new NoSuchElemException();
        }
        this.f48233k = sentenceE;
    }

    @Override // hi.a
    public final void k() {
        h hVar = this.f48234l;
        if (hVar != null) {
            hVar.e();
        } else {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return v.f48217a;
    }

    @Override // qp.d
    public final void p() throws IOException {
        Sentence sentence = this.f48233k;
        if (sentence == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = sentence.getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        this.m = sentWords;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((hj.n1) aVar).f32956e;
        mp.b bVar = this.f47881a;
        bVar.getClass();
        Context context = this.f47883c;
        this.f48234l = new h(context, sentWords, flexboxLayout, this, 1);
        int[] iArr = bq.r.f4959a;
        boolean zF = bq.m.F();
        int i11 = 2;
        Env env = this.f47884d;
        if (!zF || env.csDisplay == 0) {
            h hVar = this.f48234l;
            if (hVar == null) {
                kotlin.jvm.internal.m.n("sentenceLayout");
                throw null;
            }
            hVar.f59274j = this.f48235n;
        } else {
            h hVar2 = this.f48234l;
            if (hVar2 == null) {
                kotlin.jvm.internal.m.n("sentenceLayout");
                throw null;
            }
            hVar2.f59274j = 2;
        }
        h hVar3 = this.f48234l;
        if (hVar3 == null) {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
        hVar3.f59268d = 10;
        hVar3.f59269e = 18;
        hVar3.f59270f = 10;
        if (hVar3 == null) {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
        hVar3.f59278o = false;
        hVar3.m = new lf.x0(this, 17);
        hVar3.d();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ConstraintLayout rootParent = ((hj.n1) aVar2).f32961j;
        kotlin.jvm.internal.m.e(rootParent, "rootParent");
        bq.z.b(rootParent, new t(this, 0));
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        TextView textView = ((hj.n1) aVar3).m;
        Sentence sentence2 = this.f48233k;
        if (sentence2 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        textView.setText(sentence2.getTranslations());
        ((jp.p0) bVar).O(2);
        ef.e.B(o());
        this.f48237p = new po.a(context.getApplicationContext());
        this.f48236o = defpackage.e.m(env.tempDir, "userRecorder.wav");
        if (new File(this.f48236o).exists()) {
            new File(this.f48236o).delete();
        }
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        bq.z.b(((hj.n1) aVar4).f32966p, new t(this, i11));
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        bq.z.b(((hj.n1) aVar5).f32959h, new t(this, 3));
        po.a aVar6 = this.f48237p;
        if (aVar6 != null) {
            aVar6.c();
        }
        this.f48239r.set(false);
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        bq.z.b(((hj.n1) aVar7).f32958g, new t(this, 1));
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        ((hj.n1) aVar8).f32958g.performClick();
        ta.a aVar9 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar9);
        LottieAnimationView lottieAnimationView = ((hj.n1) aVar9).f32960i;
        Collection collection = (Collection) this.f48238q.get(0);
        jz.d dVar = jz.e.f37397a;
        lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
        ta.a aVar10 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar10);
        ((hj.n1) aVar10).f32960i.setRepeatCount(-1);
        if (env.showAnim) {
            ta.a aVar11 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar11);
            ((hj.n1) aVar11).f32960i.h();
        } else {
            ta.a aVar12 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar12);
            ((hj.n1) aVar12).f32960i.e();
        }
    }

    public final void u() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.n1) aVar).f32962k.setVisibility(8);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.n1) aVar2).f32959h.setVisibility(0);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.n1) aVar3).f32953b.setBackgroundResource(R.drawable.point_accent);
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.n1) aVar4).f32958g.setEnabled(true);
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((hj.n1) aVar5).f32954c.setBackgroundResource(R.drawable.point_accent);
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((hj.n1) aVar6).f32957f.setEnabled(true);
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        bq.z.b(((hj.n1) aVar7).f32957f, new t(this, 4));
    }

    public final void v() {
        mp.b bVar = this.f47881a;
        th.e eVar = ((jp.p0) bVar).V;
        if (eVar != null) {
            eVar.a();
        }
        th.e eVar2 = ((jp.p0) bVar).V;
        if (eVar2 != null) {
            eVar2.n();
        }
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.n1) aVar).f32957f.setEnabled(true);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        android.support.v4.media.session.a.H(((hj.n1) aVar2).f32957f.getBackground());
    }
}
