package oo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bt.s5;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingo.lingoskill.speak.ui.SpeakLeadBoardActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import com.lingodeer.data.model.SerializableTimingResult;
import com.lingodeer.data.model.WordAccuracyScoreTimingResult;
import hj.d5;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import n0.w0;
import op.a;
import op.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k0<T extends op.b, F extends op.a, G extends PodSentence<T, F>> extends bp.m {
    public View O;
    public Button P;
    public List Q;
    public SpeakTryAdapter R;
    public th.e S;
    public av.j0 T;
    public int U;
    public long V;
    public String[] W;
    public View X;
    public lc.d Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public View f45691a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final o20.w f45692b0;

    public k0() {
        super(i0.f45684a, "StorySpeakingRecord");
        LearnType learnType = LearnType.LEARN;
        this.Z = com.bumptech.glide.d.u(qy.j.SYNCHRONIZED, new bj.a(this, 27));
        this.f45692b0 = new o20.w(this, 3);
    }

    public static final void x(k0 k0Var, List list) {
        int color;
        int color2;
        View view = k0Var.f45691a0;
        if (view != null) {
            Object tag = view.getTag();
            PodSentence podSentence = tag instanceof PodSentence ? (PodSentence) tag : null;
            if (podSentence != null) {
                podSentence.setWordScores(list);
                Iterator it = list.iterator();
                double accuracyScore = 0.0d;
                while (it.hasNext()) {
                    SerializableTimingResult timingResult = ((WordAccuracyScoreTimingResult) it.next()).getTimingResult();
                    accuracyScore += timingResult != null ? timingResult.getAccuracyScore() : 0.0d;
                }
                podSentence.setSpeechScore((int) ((accuracyScore / (((double) list.size()) * 100.0d)) * ((double) 100)));
                TextView textView = (TextView) view.findViewById(R.id.tv_speech_score);
                FlexboxLayout flexboxLayout = (FlexboxLayout) view.findViewById(R.id.fl_sentence);
                int i11 = 0;
                textView.setVisibility(0);
                textView.setTextColor(g2.f0.E(s5.i(podSentence.getSpeechScore())));
                textView.setText(String.valueOf(podSentence.getSpeechScore()));
                List<T> words = podSentence.getWords();
                kotlin.jvm.internal.m.e(words, "getWords(...)");
                int i12 = 0;
                for (Object obj : words) {
                    int i13 = i11 + 1;
                    if (i11 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    op.b bVar = (op.b) obj;
                    if (i11 < flexboxLayout.getChildCount()) {
                        try {
                            if (bVar.getWordType() != 1) {
                                int i14 = i11 - i12;
                                if (i14 < podSentence.getWordScores().size()) {
                                    SerializableTimingResult timingResult2 = podSentence.getWordScores().get(i14).getTimingResult();
                                    Double dValueOf = timingResult2 != null ? Double.valueOf(timingResult2.getAccuracyScore()) : null;
                                    if (dValueOf != null) {
                                        color2 = g2.f0.E(s5.i(dValueOf.doubleValue()));
                                    } else {
                                        Context context = view.getContext();
                                        kotlin.jvm.internal.m.e(context, "getContext(...)");
                                        color2 = context.getColor(R.color.primary_black);
                                    }
                                    View childAt = flexboxLayout.getChildAt(i11);
                                    ((TextView) childAt.findViewById(R.id.tv_top)).setTextColor(color2);
                                    ((TextView) childAt.findViewById(R.id.tv_middle)).setTextColor(color2);
                                    ((TextView) childAt.findViewById(R.id.tv_bottom)).setTextColor(color2);
                                }
                            } else {
                                int i15 = (i11 - i12) - 1;
                                if (i15 >= 0 && i15 < podSentence.getWordScores().size()) {
                                    SerializableTimingResult timingResult3 = podSentence.getWordScores().get(i15).getTimingResult();
                                    Double dValueOf2 = timingResult3 != null ? Double.valueOf(timingResult3.getAccuracyScore()) : null;
                                    if (dValueOf2 != null) {
                                        color = g2.f0.E(s5.i(dValueOf2.doubleValue()));
                                    } else {
                                        Context context2 = view.getContext();
                                        kotlin.jvm.internal.m.e(context2, "getContext(...)");
                                        color = context2.getColor(R.color.primary_black);
                                    }
                                    View childAt2 = flexboxLayout.getChildAt(i11);
                                    ((TextView) childAt2.findViewById(R.id.tv_top)).setTextColor(color);
                                    ((TextView) childAt2.findViewById(R.id.tv_middle)).setTextColor(color);
                                    ((TextView) childAt2.findViewById(R.id.tv_bottom)).setTextColor(color);
                                }
                                i12++;
                            }
                        } catch (Exception e8) {
                            e8.getMessage();
                        }
                    }
                    i11 = i13;
                }
            }
        }
    }

    public abstract String A(PodSentence podSentence, int i11);

    public abstract SpeakTryAdapter B(List list, th.e eVar, av.j0 j0Var, int i11);

    public final void C(PodSentence podSentence, View view) {
        View viewFindViewById = view.findViewById(R.id.view_top);
        View viewFindViewById2 = view.findViewById(R.id.view_btm);
        viewFindViewById.setVisibility(4);
        if (new File(A(podSentence, this.U)).exists()) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            viewFindViewById2.setBackgroundColor(contextRequireContext.getColor(R.color.colorAccent));
        } else {
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
            viewFindViewById2.setBackgroundColor(contextRequireContext2.getColor(R.color.color_E3E3E3));
        }
    }

    public final void D(int i11) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        if (((d5) aVar).f32496b == null) {
            return;
        }
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        FlexboxLayout flexboxLayout = ((d5) aVar2).f32496b;
        kotlin.jvm.internal.m.c(flexboxLayout);
        int childCount = flexboxLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            FlexboxLayout flexboxLayout2 = ((d5) aVar3).f32496b;
            kotlin.jvm.internal.m.c(flexboxLayout2);
            View childAt = flexboxLayout2.getChildAt(i12);
            List list = this.Q;
            kotlin.jvm.internal.m.c(list);
            PodSentence podSentence = (PodSentence) list.get(i12);
            kotlin.jvm.internal.m.c(childAt);
            C(podSentence, childAt);
        }
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        FlexboxLayout flexboxLayout3 = ((d5) aVar4).f32496b;
        kotlin.jvm.internal.m.c(flexboxLayout3);
        View childAt2 = flexboxLayout3.getChildAt(i11);
        if (childAt2 == null) {
            return;
        }
        View viewFindViewById = childAt2.findViewById(R.id.view_top);
        View viewFindViewById2 = childAt2.findViewById(R.id.view_btm);
        viewFindViewById.setVisibility(0);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        viewFindViewById2.setBackgroundColor(contextRequireContext.getColor(R.color.colorAccent));
    }

    public abstract void E();

    public final void F() {
        if (this.f36398d == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        lc.d dVar = new lc.d(contextRequireContext);
        lc.d.g(dVar, Integer.valueOf(R.string.are_you_sure_you_want_to_quit), null, 2);
        hz.b.t(dVar, Integer.valueOf(R.layout.dialog_lesson_quit), null, false, 62);
        lc.d.e(dVar, Integer.valueOf(R.string.f22251ok), null, new g0(this, 1), 2);
        lc.d.d(dVar, null, 6);
        dVar.show();
    }

    @Override // androidx.fragment.app.k0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.m.f(menu, "menu");
        kotlin.jvm.internal.m.f(inflater, "inflater");
        inflater.inflate(R.menu.menu_speak_speaking, menu);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    @Override // ji.e, androidx.fragment.app.k0
    public final void onDestroyView() {
        super.onDestroyView();
        ((av.i) this.Z.getValue()).c();
        this.f45691a0 = null;
        th.e eVar = this.S;
        if (eVar != null) {
            eVar.n();
        }
        av.j0 j0Var = this.T;
        if (j0Var != null) {
            j0Var.f();
        }
        SpeakTryAdapter speakTryAdapter = this.R;
        if (speakTryAdapter != null) {
            speakTryAdapter.d();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        th.e eVar = this.S;
        if (eVar != null) {
            kotlin.jvm.internal.m.c(eVar);
            eVar.n();
        }
        av.j0 j0Var = this.T;
        if (j0Var != null) {
            kotlin.jvm.internal.m.c(j0Var);
            j0Var.f();
        }
        SpeakTryAdapter speakTryAdapter = this.R;
        if (speakTryAdapter != null) {
            kotlin.jvm.internal.m.c(speakTryAdapter);
            speakTryAdapter.d();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        String string = getString(R.string.story_speaking);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View viewRequireView = requireView();
        kotlin.jvm.internal.m.e(viewRequireView, "requireView(...)");
        ve.i.H(string, (l.m) p0VarRequireActivity, viewRequireView);
        View viewFindViewById = requireView().findViewById(R.id.toolbar);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        ((Toolbar) viewFindViewById).setNavigationOnClickListener(new aj.b(this, 16));
        this.U = requireArguments().getInt(INTENTS.EXTRA_INT);
        this.V = requireArguments().getLong(INTENTS.EXTRA_LONG);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        this.S = new th.e(contextRequireContext);
        this.T = new av.j0(requireContext().getApplicationContext(), 2);
        List listZ = z(this.U);
        this.Q = listZ;
        int i11 = this.U;
        kotlin.jvm.internal.m.c(listZ);
        this.W = jh.h.l(i11, listZ.size());
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((d5) aVar).f32498d.setNestedScrollingEnabled(false);
        List list = this.Q;
        kotlin.jvm.internal.m.c(list);
        th.e eVar = this.S;
        kotlin.jvm.internal.m.c(eVar);
        av.j0 j0Var = this.T;
        kotlin.jvm.internal.m.c(j0Var);
        this.R = B(list, eVar, j0Var, this.U);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        RecyclerView recyclerView = ((d5) aVar2).f32498d;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        SpeakTryAdapter speakTryAdapter = this.R;
        kotlin.jvm.internal.m.c(speakTryAdapter);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        speakTryAdapter.bindToRecyclerView(((d5) aVar3).f32498d);
        SpeakTryAdapter speakTryAdapter2 = this.R;
        kotlin.jvm.internal.m.c(speakTryAdapter2);
        speakTryAdapter2.setOnItemClickListener(new hh.c(this, 15));
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((d5) aVar4).f32496b.removeAllViews();
        List<PodSentence> list2 = this.Q;
        kotlin.jvm.internal.m.c(list2);
        for (PodSentence podSentence : list2) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f36398d);
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_speak_try_progress, (ViewGroup) ((d5) aVar5).f32496b, false);
            kotlin.jvm.internal.m.c(viewInflate);
            C(podSentence, viewInflate);
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ((d5) aVar6).f32496b.addView(viewInflate);
        }
        D(0);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        RecyclerView recyclerView2 = ((d5) aVar7).f32498d;
        recyclerView2.postDelayed(new b2.c(4, recyclerView2, new f0(this, 2)), 0L);
        com.bumptech.glide.p pVarF = com.bumptech.glide.c.f(this);
        String[] strArr = this.W;
        kotlin.jvm.internal.m.c(strArr);
        com.bumptech.glide.n nVarK = pVarF.k(strArr[0]);
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        nVarK.x(((d5) aVar8).f32497c);
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        ImageView imageView = ((d5) aVar9).f32497c;
        imageView.postDelayed(new b2.c(4, imageView, new f0(this, 3)), 0L);
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        ((d5) aVar10).f32499e.setOnScrollChangedListener(this.f45692b0);
        setHasOptionsMenu(true);
        SpeakTryAdapter speakTryAdapter3 = this.R;
        if (speakTryAdapter3 != null) {
            speakTryAdapter3.f22025l = new n9.q(this, 5);
        }
    }

    public final void y() {
        int i11;
        List list = this.Q;
        kotlin.jvm.internal.m.c(list);
        Iterator it = list.iterator();
        boolean z11 = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!new File(A((PodSentence) it.next(), this.U)).exists()) {
                z11 = false;
            }
        }
        if (z11) {
            Button button = this.P;
            if (button != null) {
                Context contextRequireContext = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                button.setTextColor(contextRequireContext.getColor(R.color.white));
            }
            Button button2 = this.P;
            kotlin.jvm.internal.m.c(button2);
            button2.setEnabled(true);
        } else {
            Button button3 = this.P;
            if (button3 != null) {
                Context contextRequireContext2 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                button3.setTextColor(contextRequireContext2.getColor(R.color.color_AFAFAF));
            }
            Button button4 = this.P;
            kotlin.jvm.internal.m.c(button4);
            button4.setEnabled(false);
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((d5) aVar).f32496b;
        kotlin.jvm.internal.m.c(flexboxLayout);
        int childCount = flexboxLayout.getChildCount();
        for (i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            FlexboxLayout flexboxLayout2 = ((d5) aVar2).f32496b;
            kotlin.jvm.internal.m.c(flexboxLayout2);
            View childAt = flexboxLayout2.getChildAt(i11);
            View viewFindViewById = childAt.findViewById(R.id.view_top);
            View viewFindViewById2 = childAt.findViewById(R.id.view_btm);
            if (viewFindViewById.getVisibility() == 4) {
                int i12 = this.U;
                List list2 = this.Q;
                kotlin.jvm.internal.m.c(list2);
                if (new File(A((PodSentence) list2.get(i11), i12)).exists()) {
                    Context contextRequireContext3 = requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                    viewFindViewById2.setBackgroundColor(contextRequireContext3.getColor(R.color.colorAccent));
                } else {
                    Context contextRequireContext4 = requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                    viewFindViewById2.setBackgroundColor(contextRequireContext4.getColor(R.color.color_E3E3E3));
                }
            }
        }
    }

    public abstract List z(int i11);

    @Override // androidx.fragment.app.k0
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        kotlin.jvm.internal.m.f(menuItem, ypOOxsaJG.GBBuRkDqx);
        int itemId = menuItem.getItemId();
        final int i11 = 0;
        final int i12 = 1;
        if (itemId == R.id.item_setting) {
            t().c("jxz_main_story_speak_click_rank", new f0(this, i11));
            int i13 = SpeakLeadBoardActivity.H;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            startActivity(md.a.p(contextRequireContext, this.U));
        } else if (itemId == R.id.item_display) {
            E();
            View view = this.X;
            kotlin.jvm.internal.m.c(view);
            SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.switch_show_translation);
            kotlin.jvm.internal.m.c(switchCompat);
            bq.z.b(switchCompat, new w0(11, this, switchCompat));
            switchCompat.setChecked(r().showStoryTrans);
            View view2 = this.X;
            if (view2 != null) {
                final TextView textView = (TextView) view2.findViewById(R.id.tv_speed);
                ImageView imageView = (ImageView) view2.findViewById(R.id.iv_remove_speed);
                ImageView imageView2 = (ImageView) view2.findViewById(R.id.iv_plus_speed);
                textView.setText(r().audioSpeed + "%");
                kotlin.jvm.internal.m.c(imageView2);
                bq.z.b(imageView2, new fz.c(this) { // from class: oo.h0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k0 f45680b;

                    {
                        this.f45680b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                k0 k0Var = this.f45680b;
                                if (k0Var.r().audioSpeed < 150) {
                                    k0Var.r().audioSpeed += 10;
                                    k0Var.r().updateEntry("audioSpeed");
                                    textView.setText(k0Var.r().audioSpeed + "%");
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                k0 k0Var2 = this.f45680b;
                                if (k0Var2.r().audioSpeed > 50) {
                                    k0Var2.r().audioSpeed -= 10;
                                    k0Var2.r().updateEntry("audioSpeed");
                                    String.valueOf(k0Var2.r().audioSpeed);
                                    textView.setText(k0Var2.r().audioSpeed + "%");
                                }
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                kotlin.jvm.internal.m.c(imageView);
                bq.z.b(imageView, new fz.c(this) { // from class: oo.h0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k0 f45680b;

                    {
                        this.f45680b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i12) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                k0 k0Var = this.f45680b;
                                if (k0Var.r().audioSpeed < 150) {
                                    k0Var.r().audioSpeed += 10;
                                    k0Var.r().updateEntry("audioSpeed");
                                    textView.setText(k0Var.r().audioSpeed + "%");
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                k0 k0Var2 = this.f45680b;
                                if (k0Var2.r().audioSpeed > 50) {
                                    k0Var2.r().audioSpeed -= 10;
                                    k0Var2.r().updateEntry("audioSpeed");
                                    String.valueOf(k0Var2.r().audioSpeed);
                                    textView.setText(k0Var2.r().audioSpeed + "%");
                                }
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
            }
            lc.d dVar = this.Y;
            if (dVar == null) {
                l.m mVar = this.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                lc.d dVar2 = new lc.d(mVar);
                hz.b.t(dVar2, null, this.X, true, 41);
                lc.d.e(dVar2, Integer.valueOf(R.string.f22251ok), null, null, 6);
                md.a.r(dVar2, new g0(this, 2));
                dVar2.show();
                this.Y = dVar2;
            } else {
                dVar.show();
            }
        }
        return true;
    }
}
