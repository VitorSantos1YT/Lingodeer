package hh;

import android.content.Context;
import android.media.AudioRecord;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lingo.fluent.ui.base.PdFinishActivity;
import com.lingo.fluent.ui.base.adapter.PdLearnSpeakAdapter;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdSentence;
import com.lingodeer.R;
import hj.k4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends bp.m {
    public PdLearnSpeakAdapter O;
    public PdLesson P;
    public boolean Q;
    public Button R;
    public boolean S;
    public final Object T;

    public o0() {
        super(n0.f32269a, "FluentSpeakingExercise");
        this.Q = true;
        this.T = com.bumptech.glide.d.u(qy.j.NONE, new bp.b1(11, this, new bj.a(this, 14)));
    }

    @Override // bp.m, androidx.fragment.app.k0
    public final void onPause() {
        super.onPause();
        PdLearnSpeakAdapter pdLearnSpeakAdapter = this.O;
        if (pdLearnSpeakAdapter != null) {
            pdLearnSpeakAdapter.h();
        }
    }

    @Override // bp.m, ji.e, androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        if (this.Q) {
            this.Q = false;
            PdLearnSpeakAdapter pdLearnSpeakAdapter = this.O;
            if (pdLearnSpeakAdapter != null) {
                ta.a aVar = this.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                RecyclerView recyclerView = ((k4) aVar).f32821c;
                recyclerView.postDelayed(new b2.c(4, recyclerView, new fp.f(6, this, pdLearnSpeakAdapter)), 0L);
            }
        }
    }

    @Override // ji.e
    public final void q() {
        PdLearnSpeakAdapter pdLearnSpeakAdapter = this.O;
        if (pdLearnSpeakAdapter != null) {
            pdLearnSpeakAdapter.f21644f.b();
            th.g gVar = pdLearnSpeakAdapter.f21645g;
            gVar.f52420a = false;
            AudioRecord audioRecord = gVar.f52423d;
            if (audioRecord != null) {
                audioRecord.stop();
                audioRecord.release();
            }
            gVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, qy.h] */
    @Override // ji.e
    public final void v(Bundle bundle) {
        try {
            PdLesson pdLesson = ((jh.o) this.T.getValue()).f36374b;
            if (pdLesson == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            this.P = pdLesson;
            System.currentTimeMillis();
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            RecyclerView recyclerView = ((k4) aVar).f32821c;
            requireContext();
            final int i11 = 1;
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            PdLesson pdLesson2 = this.P;
            if (pdLesson2 == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            List<PdSentence> sentences = pdLesson2.getSentences();
            kotlin.jvm.internal.m.e(sentences, "getSentences(...)");
            PdLesson pdLesson3 = this.P;
            if (pdLesson3 == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            kotlin.jvm.internal.m.e(pdLesson3.getLessonId(), "getLessonId(...)");
            l.m mVar = this.f36398d;
            kotlin.jvm.internal.m.c(mVar);
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            androidx.recyclerview.widget.m1 layoutManager = ((k4) aVar2).f32821c.getLayoutManager();
            kotlin.jvm.internal.m.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ImageView imageView = ((k4) aVar3).f32820b;
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            this.O = new PdLearnSpeakAdapter(sentences, this.f36401t, mVar, linearLayoutManager, imageView, ((k4) aVar4).f32822d);
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ((k4) aVar5).f32821c.setAdapter(this.O);
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            final int i12 = 0;
            ((k4) aVar6).f32821c.setNestedScrollingEnabled(false);
            System.currentTimeMillis();
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            bq.z.b((ImageView) ((k4) aVar7).f32824f.f32408d, new fz.c(this) { // from class: hh.m0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o0 f32266b;

                {
                    this.f32266b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    int i13 = i12;
                    qy.b0 b0Var = qy.b0.f48488a;
                    o0 o0Var = this.f32266b;
                    View it = (View) obj;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            o0Var.requireActivity().finish();
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            boolean z11 = o0Var.S;
                            o0Var.requireActivity().finish();
                            if (!z11) {
                                int i14 = PdFinishActivity.H;
                                Context contextRequireContext = o0Var.requireContext();
                                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                                o0Var.startActivity(md.a.q(contextRequireContext, "FLUENT_SPEAKING"));
                            }
                            break;
                    }
                    return b0Var;
                }
            });
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            TextView textView = (TextView) ((k4) aVar8).f32824f.f32407c;
            PdLesson pdLesson4 = this.P;
            if (pdLesson4 == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            textView.setText(pdLesson4.getTitle());
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            TextView textView2 = (TextView) ((k4) aVar9).f32824f.f32409e;
            PdLesson pdLesson5 = this.P;
            if (pdLesson5 == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            textView2.setText(pdLesson5.getTitleTranslation());
            int[] iArr = bq.r.f4959a;
            ta.a aVar10 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar10);
            bq.m.J((TextView) ((k4) aVar10).f32824f.f32407c);
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            bq.z.a(((k4) aVar11).f32822d, 0L, new o(this, 3));
            View viewInflate = LayoutInflater.from(this.f36398d).inflate(R.layout.foot_recycler_speak_try, (ViewGroup) null, false);
            this.R = (Button) viewInflate.findViewById(R.id.btn_preview);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_desc);
            Button button = this.R;
            if (button != null) {
                button.setText(R.string._finish);
            }
            Button button2 = this.R;
            if (button2 != null) {
                button2.setEnabled(false);
            }
            textView3.setVisibility(8);
            Button button3 = this.R;
            if (button3 != null) {
                bq.z.b(button3, new fz.c(this) { // from class: hh.m0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ o0 f32266b;

                    {
                        this.f32266b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i13 = i11;
                        qy.b0 b0Var = qy.b0.f48488a;
                        o0 o0Var = this.f32266b;
                        View it = (View) obj;
                        switch (i13) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                o0Var.requireActivity().finish();
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                boolean z11 = o0Var.S;
                                o0Var.requireActivity().finish();
                                if (!z11) {
                                    int i14 = PdFinishActivity.H;
                                    Context contextRequireContext = o0Var.requireContext();
                                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                                    o0Var.startActivity(md.a.q(contextRequireContext, "FLUENT_SPEAKING"));
                                }
                                break;
                        }
                        return b0Var;
                    }
                });
            }
            PdLearnSpeakAdapter pdLearnSpeakAdapter = this.O;
            if (pdLearnSpeakAdapter != null) {
                pdLearnSpeakAdapter.f21651n = new hd.d(this, 15);
            }
            if (pdLearnSpeakAdapter != null) {
                pdLearnSpeakAdapter.addFooterView(viewInflate);
            }
            ta.a aVar12 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar12);
            ((k4) aVar12).f32821c.post(new b2.a(this, 23));
        } catch (Exception e8) {
            e8.printStackTrace();
            requireActivity().finish();
        }
    }
}
