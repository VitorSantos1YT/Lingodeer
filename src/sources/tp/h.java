package tp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import android.widget.TextView;
import bt.n1;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Ack;
import com.lingo.lingoskill.object.AckFav;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.widget.LollipopFixedWebView;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.g3;
import java.util.List;
import qp.n2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends ji.e {
    public Ack N;
    public lc.d O;

    public h() {
        super(f.f52456a, BuildConfig.VERSION_NAME);
    }

    @Override // ji.e
    public final void q() {
        lc.d dVar = this.O;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        Bundle arguments = getArguments();
        Ack ack = arguments != null ? (Ack) arguments.getParcelable(INTENTS.EXTRA_OBJECT) : null;
        kotlin.jvm.internal.m.d(ack, "null cannot be cast to non-null type com.lingo.lingoskill.object.Ack");
        this.N = ack;
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = ((g3) aVar).f32619h;
        Ack ack2 = this.N;
        if (ack2 == null) {
            kotlin.jvm.internal.m.n("ack");
            throw null;
        }
        textView.setText(ack2.getGrammarACK());
        Ack ack3 = this.N;
        if (ack3 == null) {
            kotlin.jvm.internal.m.n("ack");
            throw null;
        }
        String transaltion = ack3.getTransaltion();
        kotlin.jvm.internal.m.e(transaltion, "getTransaltion(...)");
        boolean z11 = false;
        if (transaltion.length() == 0) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((g3) aVar2).f32620i.setVisibility(8);
        } else {
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((g3) aVar3).f32620i.setVisibility(0);
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            TextView textView2 = ((g3) aVar4).f32620i;
            Ack ack4 = this.N;
            if (ack4 == null) {
                kotlin.jvm.internal.m.n("ack");
                throw null;
            }
            textView2.setText(ack4.getTransaltion());
        }
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        TextView textView3 = ((g3) aVar5).f32622k;
        Ack ack5 = this.N;
        if (ack5 == null) {
            kotlin.jvm.internal.m.n("ack");
            throw null;
        }
        Unit unitF = ij.c.f(ack5.getUnitId(), false);
        textView3.setText(unitF != null ? unitF.getUnitName() : null);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        LollipopFixedWebView lollipopFixedWebView = ((g3) aVar6).f32623l;
        Ack ack6 = this.N;
        if (ack6 == null) {
            kotlin.jvm.internal.m.n("ack");
            throw null;
        }
        String explanation = ack6.getExplanation();
        kotlin.jvm.internal.m.e(explanation, "getExplanation(...)");
        lollipopFixedWebView.loadDataWithBaseURL(null, "<html>\n<body>\n" + oz.x.q0(explanation, "background-color:#ffffff;", BuildConfig.VERSION_NAME) + "</body>\n</html>", "text/html", "utf-8", null);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        WebSettings settings = ((g3) aVar7).f32623l.getSettings();
        kotlin.jvm.internal.m.e(settings, "getSettings(...)");
        if ((getResources().getConfiguration().uiMode & 48) != 16) {
            if (se.k.s("ALGORITHMIC_DARKENING")) {
                va.a.b(settings);
            }
            if (se.k.s("FORCE_DARK")) {
                va.a.c(settings);
            }
        }
        Ack ack7 = this.N;
        if (ack7 == null) {
            kotlin.jvm.internal.m.n("ack");
            throw null;
        }
        String examples = ack7.getExamples();
        kotlin.jvm.internal.m.e(examples, "getExamples(...)");
        if (examples.length() == 0) {
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            ((g3) aVar8).f32616e.setVisibility(8);
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            ((g3) aVar9).f32621j.setVisibility(8);
        } else {
            ta.a aVar10 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar10);
            ((g3) aVar10).f32621j.setVisibility(0);
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            ((g3) aVar11).f32616e.setVisibility(0);
            Ack ack8 = this.N;
            if (ack8 == null) {
                kotlin.jvm.internal.m.n("ack");
                throw null;
            }
            Long[] lArrV = ew.a.v(ack8.getExamples());
            kotlin.jvm.internal.m.c(lArrV);
            for (Long l9 : lArrV) {
                kotlin.jvm.internal.m.c(l9);
                Sentence sentenceE = ij.c.e(l9.longValue());
                if (sentenceE != null) {
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f36398d);
                    ta.a aVar12 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar12);
                    View viewInflate = layoutInflaterFrom.inflate(R.layout.include_ack_example, (ViewGroup) ((g3) aVar12).f32616e, false);
                    FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate.findViewById(R.id.fl_sentence);
                    if (flexboxLayout != null) {
                        Context contextRequireContext = requireContext();
                        List<Word> sentWords = sentenceE.getSentWords();
                        kotlin.jvm.internal.m.c(contextRequireContext);
                        kotlin.jvm.internal.m.c(sentWords);
                        cj.c cVar = new cj.c(contextRequireContext, sentWords, flexboxLayout, 5);
                        Context contextRequireContext2 = requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        int color = contextRequireContext2.getColor(R.color.second_black);
                        Context contextRequireContext3 = requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        int color2 = contextRequireContext3.getColor(R.color.colorAccent);
                        Context contextRequireContext4 = requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        int color3 = contextRequireContext4.getColor(R.color.second_black);
                        cVar.f59271g = color;
                        cVar.f59272h = color2;
                        cVar.f59273i = color3;
                        cVar.f59277n = true;
                        cVar.d();
                    }
                    ((TextView) viewInflate.findViewById(R.id.tv_trans)).setText(sentenceE.getTranslations());
                    ta.a aVar13 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar13);
                    if (((g3) aVar13).f32616e.getChildCount() > 0) {
                        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                        kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.topMargin = ff.h.l(8.0f);
                        viewInflate.setLayoutParams(layoutParams2);
                    }
                    ta.a aVar14 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar14);
                    ((g3) aVar14).f32616e.addView(viewInflate);
                }
            }
        }
        int[] iArr = bq.r.f4959a;
        String strJ = bq.m.j(r().keyLanguage);
        Ack ack9 = this.N;
        if (ack9 == null) {
            kotlin.jvm.internal.m.n("ack");
            throw null;
        }
        String id2 = b7.e0.k(ack9.getId(), strJ, "_");
        if (ij.a.f34417b == null) {
            synchronized (ij.a.class) {
                if (ij.a.f34417b == null) {
                    ij.a.f34417b = new ij.a();
                }
            }
        }
        ij.a aVar15 = ij.a.f34417b;
        kotlin.jvm.internal.m.c(aVar15);
        kotlin.jvm.internal.m.f(id2, "id");
        AckFav ackFav = (AckFav) aVar15.f34418a.f34447g.load(id2);
        if (ackFav != null && ackFav.getIsFav() == 1) {
            z11 = true;
        }
        if (z11) {
            ta.a aVar16 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar16);
            ((g3) aVar16).f32613b.setImageResource(R.drawable.ic_ack_faved);
        } else {
            ta.a aVar17 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar17);
            ((g3) aVar17).f32613b.setImageResource(R.drawable.ic_ack_fav);
        }
        ta.a aVar18 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar18);
        bq.z.b(((g3) aVar18).f32613b, new n1(z11, id2, this, 12));
        ta.a aVar19 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar19);
        bq.z.b(((g3) aVar19).f32614c, new n2(21, this, id2));
        ta.a aVar20 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar20);
        ((g3) aVar20).f32614c.setVisibility(8);
    }
}
