package qp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.Phrase;
import com.lingo.lingoskill.object.PhraseDao;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f47947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f47948l;
    public ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f47949n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MaterialCardView f47950o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f47951p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f47952q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f47953r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f47954s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(mp.b bVar, long j11, List optionsIds) {
        super(bVar, j11, 1);
        kotlin.jvm.internal.m.f(optionsIds, "optionsIds");
        this.f47947k = optionsIds;
        this.f47949n = new ArrayList();
        this.f47951p = -1L;
        this.f47952q = BuildConfig.VERSION_NAME;
        this.f47953r = 3;
        this.f47954s = nv.p.m(j11, "3;", ";14");
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        return false;
    }

    @Override // hi.a
    public final String b() {
        return this.f47952q;
    }

    @Override // qp.a, hi.a
    public final String c() {
        return this.f47954s;
    }

    @Override // hi.a
    public final int i() {
        return this.f47953r;
    }

    @Override // hi.a
    public final void j() {
        this.f47948l = new ArrayList();
        this.m = new ArrayList();
        Iterator it = this.f47947k.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (ij.d.f34419e == null) {
                synchronized (ij.d.class) {
                    if (ij.d.f34419e == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication);
                        ij.d.f34419e = new ij.d(lingoSkillApplication);
                    }
                }
            }
            ij.d dVar = ij.d.f34419e;
            kotlin.jvm.internal.m.c(dVar);
            PhraseDao phraseDao = ((DaoSession) dVar.f34423d).getPhraseDao();
            kotlin.jvm.internal.m.e(phraseDao, "getPhraseDao(...)");
            Phrase phrase = (Phrase) phraseDao.load(Long.valueOf(jLongValue));
            if (phrase != null) {
                ArrayList arrayList = this.f47948l;
                if (arrayList == null) {
                    kotlin.jvm.internal.m.n("options");
                    throw null;
                }
                arrayList.add(phrase);
                ArrayList arrayList2 = this.m;
                if (arrayList2 == null) {
                    kotlin.jvm.internal.m.n("allOptions");
                    throw null;
                }
                arrayList2.add(phrase);
                Phrase phrase2 = new Phrase();
                phrase2.setPhraseId(phrase.getPhraseId());
                phrase2.Phrase = phrase.Phrase;
                phrase2.Zhuyin = phrase.Zhuyin;
                phrase2.Luoma = phrase.Luoma;
                phrase2.Translations = phrase.Translations;
                phrase2.Lessons = phrase.Lessons;
                phrase2.Audios = phrase.Audios;
                phrase2.Option1 = phrase.Option1;
                phrase2.Option2 = phrase.Option2;
                phrase2.Status1 = phrase.Status1;
                phrase2.Status2 = phrase.Status2;
                phrase2.setTrans(true);
                ArrayList arrayList3 = this.m;
                if (arrayList3 == null) {
                    kotlin.jvm.internal.m.n("allOptions");
                    throw null;
                }
                arrayList3.add(phrase2);
            }
        }
    }

    @Override // hi.a
    public final void k() {
    }

    @Override // qp.d
    public final fz.f n() {
        return g1.f47939a;
    }

    @Override // qp.d
    public final void p() {
        ((jp.p0) this.f47881a).O(1);
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            kotlin.jvm.internal.m.n("allOptions");
            throw null;
        }
        Collections.shuffle(arrayList);
        ArrayList arrayList2 = this.m;
        if (arrayList2 == null) {
            kotlin.jvm.internal.m.n("allOptions");
            throw null;
        }
        Iterator it = arrayList2.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            Phrase phrase = (Phrase) next;
            Context context = this.f47883c;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_phrase_match, (ViewGroup) ((hj.d) aVar).f32474b, false);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
            MaterialCardView materialCardView = (MaterialCardView) viewInflate;
            TextView textView = (TextView) materialCardView.findViewById(R.id.tv_middle);
            if (phrase.isTrans()) {
                textView.setText(phrase.getTranslations());
            } else {
                textView.setText(phrase.getPhrase());
            }
            textView.setGravity(17);
            this.f47949n.add(materialCardView);
            kotlin.jvm.internal.m.f(context, "context");
            materialCardView.setCardBackgroundColor(context.getColor(R.color.white));
            materialCardView.setCardElevation(ff.h.l(2.0f));
            materialCardView.setOnClickListener(new h9.q(this, materialCardView, phrase, textView, 2));
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.d) aVar2).f32474b.addView(materialCardView);
        }
        ef.e.B(o());
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f47948l;
        if (arrayList2 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        Iterator it = arrayList2.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            Phrase phrase = (Phrase) next;
            qy.q qVar = fv.b.f28186a;
            arrayList.add(new fv.a(2L, fv.b.y(phrase.getPhraseId()), fv.g.m(phrase.getPhraseId(), fv.b.w().d(null, null) ? ealNNtLp.txHzpceFCvcoFiG : "f")));
        }
        return arrayList;
    }
}
