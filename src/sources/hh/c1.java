package hh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.lingo.fluent.ui.base.PdVocabularyDetailActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import hj.l6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends ji.e {
    public c1() {
        super(b1.f32210a, BuildConfig.VERSION_NAME);
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        androidx.fragment.app.p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type com.lingo.fluent.ui.base.PdVocabularyDetailActivity");
        th.e eVar = ((PdVocabularyDetailActivity) p0VarRequireActivity).P;
        if (eVar == null) {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
        androidx.fragment.app.p0 p0VarRequireActivity2 = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity2, "null cannot be cast to non-null type com.lingo.fluent.ui.base.PdVocabularyDetailActivity");
        fv.c cVar = ((PdVocabularyDetailActivity) p0VarRequireActivity2).T;
        Bundle arguments = getArguments();
        PdWord pdWord = arguments != null ? (PdWord) arguments.getParcelable(INTENTS.EXTRA_OBJECT) : null;
        kotlin.jvm.internal.m.c(pdWord);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = ((l6) aVar).f32875j;
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        TextView textView2 = ((l6) aVar2).f32874i;
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        th.h.b(pdWord, textView, textView2, ((l6) aVar3).f32873h, 176);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((l6) aVar4).f32876k.setText(pdWord.getDetailTrans());
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((l6) aVar5).f32869d.setVisibility(4);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        MaterialCardView materialCardView = ((l6) aVar6).f32869d;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        materialCardView.setTranslationY(j3.Z(-140, contextRequireContext));
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ImageView imageView = ((l6) aVar7).f32871f;
        imageView.setOnClickListener(new h9.q(imageView, eVar, pdWord, cVar, 1));
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        ((l6) aVar8).f32867b.setOnClickListener(new aj.b(this, 9));
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        final ImageView imageView2 = ((l6) aVar9).f32872g;
        int[] iArr = bq.r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        final String strD = ep.a.D(bq.m.k(cf.x.n().keyLanguage), "_", pdWord.getFavId());
        if (gh.c.f29196a == null) {
            synchronized (gh.c.class) {
                if (gh.c.f29196a == null) {
                    gh.c.f29196a = new gh.c();
                }
            }
        }
        kotlin.jvm.internal.m.c(gh.c.f29196a);
        if (gh.c.d(strD)) {
            imageView2.setImageResource(R.drawable.ic_pd_word_tag_fav);
        } else {
            imageView2.setImageResource(R.drawable.ic_pd_word_tag_un_fav);
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: hh.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cf.x.z();
                String str = strD;
                boolean zD = gh.c.d(str);
                ImageView imageView3 = imageView2;
                if (zD) {
                    cf.x.z();
                    gh.c.f(str);
                    imageView3.setImageResource(R.drawable.ic_pd_word_tag_un_fav);
                } else {
                    cf.x.z();
                    gh.c.b(str);
                    imageView3.setImageResource(R.drawable.ic_pd_word_tag_fav);
                    this.t().c("jxz_fl_add_star_word", new y(5));
                }
            }
        });
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        bq.z.b(((l6) aVar10).f32868c, new gr.s(this, 5));
    }
}
