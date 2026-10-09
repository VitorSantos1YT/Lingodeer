package oo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.p0;
import com.google.android.material.card.MaterialCardView;
import com.lingo.lingoskill.speak.object.PodSelect;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingo.lingoskill.speak.ui.SpeakIndexActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hj.b5;
import hj.b6;
import hj.d3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jt.t0;
import op.a;
import op.b;
import r.x2;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d0<T extends op.b, F extends op.a, G extends PodSentence<T, F>> extends bp.m {
    public th.e O;
    public cj.c P;
    public final ArrayList Q;
    public int R;
    public xx.f S;
    public int T;
    public x2 U;
    public View V;
    public lc.d W;
    public List X;
    public int Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String[] f45643a0;

    public d0() {
        super(c0.f45641a, "StoryReadingPractice");
        this.Q = new ArrayList();
        LearnType learnType = LearnType.LEARN;
    }

    public abstract void A();

    public final void B() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        FrameLayout frameLayout = ((b5) aVar).f32399e;
        Context contextRequireContext = requireContext();
        PodSelect podSelect = (PodSelect) this.Q.get(this.R);
        kotlin.jvm.internal.m.c(contextRequireContext);
        kotlin.jvm.internal.m.c(podSelect);
        n9.q dispose = this.f36401t;
        kotlin.jvm.internal.m.f(dispose, "dispose");
        x2 x2Var = new x2();
        x2Var.f48710b = dispose;
        x2Var.f48709a = contextRequireContext;
        x2Var.f48712d = this;
        x2Var.f48713e = podSelect;
        ArrayList arrayList = new ArrayList();
        x2Var.f48714f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        x2Var.f48715t = arrayList2;
        frameLayout.removeAllViews();
        View viewInflate = LayoutInflater.from(contextRequireContext).inflate(R.layout.model_question_1, (ViewGroup) null, false);
        int i11 = R.id.fl_answer_1;
        View viewQ = j3.q(viewInflate, R.id.fl_answer_1);
        if (viewQ != null) {
            d3 d3VarC = d3.c(viewQ);
            i11 = R.id.fl_answer_2;
            View viewQ2 = j3.q(viewInflate, R.id.fl_answer_2);
            if (viewQ2 != null) {
                d3 d3VarC2 = d3.c(viewQ2);
                i11 = R.id.fl_answer_3;
                View viewQ3 = j3.q(viewInflate, R.id.fl_answer_3);
                if (viewQ3 != null) {
                    d3 d3VarC3 = d3.c(viewQ3);
                    i11 = R.id.fl_answer_4;
                    View viewQ4 = j3.q(viewInflate, R.id.fl_answer_4);
                    if (viewQ4 != null) {
                        d3 d3VarC4 = d3.c(viewQ4);
                        i11 = R.id.iv_clear;
                        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_clear);
                        if (imageView != null) {
                            i11 = R.id.tv_title_bottom;
                            TextView textView = (TextView) j3.q(viewInflate, R.id.tv_title_bottom);
                            if (textView != null) {
                                i11 = R.id.tv_title_middle;
                                TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_title_middle);
                                if (textView2 != null) {
                                    i11 = R.id.tv_title_top;
                                    TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_title_top);
                                    if (textView3 != null) {
                                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                        x2Var.f48711c = new b6(frameLayout2, d3VarC, d3VarC2, d3VarC3, d3VarC4, imageView, textView, textView2, textView3);
                                        kotlin.jvm.internal.m.e(frameLayout2, "getRoot(...)");
                                        frameLayout.addView(frameLayout2);
                                        bq.z.b(frameLayout, new t0(28));
                                        int[] iArr = bq.r.f4959a;
                                        bq.m.J(textView3);
                                        bq.m.J(textView2);
                                        bq.m.J(textView);
                                        if (Integer.valueOf(podSelect.getAnswer()).intValue() - 1 < podSelect.getOptions().size()) {
                                            podSelect.setAnswerWord((op.a) podSelect.getOptions().get(Integer.valueOf(podSelect.getAnswer()).intValue() - 1));
                                            arrayList.clear();
                                            List options = podSelect.getOptions();
                                            kotlin.jvm.internal.m.e(options, "getOptions(...)");
                                            arrayList.addAll(options);
                                            Collections.shuffle(arrayList);
                                            arrayList2.clear();
                                            arrayList2.add((MaterialCardView) d3VarC.f32490c);
                                            arrayList2.add((MaterialCardView) d3VarC2.f32490c);
                                            arrayList2.add((MaterialCardView) d3VarC3.f32490c);
                                            arrayList2.add((MaterialCardView) d3VarC4.f32490c);
                                            x2Var.k();
                                            bq.z.b(imageView, new kp.j(x2Var, 11));
                                        }
                                        this.U = x2Var;
                                        ta.a aVar2 = this.f36400f;
                                        kotlin.jvm.internal.m.c(aVar2);
                                        FrameLayout frameLayout3 = ((b5) aVar2).f32399e;
                                        ta.a aVar3 = this.f36400f;
                                        kotlin.jvm.internal.m.c(aVar3);
                                        frameLayout3.setTranslationY(ff.h.l(4.0f) + ((b5) aVar3).f32399e.getHeight());
                                        ta.a aVar4 = this.f36400f;
                                        kotlin.jvm.internal.m.c(aVar4);
                                        ((b5) aVar4).f32399e.setVisibility(0);
                                        ta.a aVar5 = this.f36400f;
                                        kotlin.jvm.internal.m.c(aVar5);
                                        w0 w0VarB = s0.b(((b5) aVar5).f32399e);
                                        w0VarB.l(CropImageView.DEFAULT_ASPECT_RATIO);
                                        w0VarB.e(300L);
                                        w0VarB.i();
                                        this.R++;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public final void C() {
        if (this.f36398d == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        lc.d dVar = new lc.d(contextRequireContext);
        lc.d.g(dVar, Integer.valueOf(R.string.are_you_sure_you_want_to_quit), null, 2);
        hz.b.t(dVar, Integer.valueOf(R.layout.dialog_lesson_quit), null, false, 62);
        lc.d.e(dVar, Integer.valueOf(R.string.f22251ok), null, new z(this, 0), 2);
        lc.d.d(dVar, null, 6);
        dVar.show();
    }

    @Override // androidx.fragment.app.k0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.m.f(menu, "menu");
        kotlin.jvm.internal.m.f(inflater, "inflater");
        inflater.inflate(R.menu.menu_speak_reading, menu);
    }

    @Override // androidx.fragment.app.k0
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.m.f(item, "item");
        int itemId = item.getItemId();
        final int i11 = 1;
        if (itemId == R.id.item_setting) {
            t().c("jxz_main_story_read_click_video", new a0(this, 1));
            int i12 = SpeakIndexActivity.R;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            int i13 = this.Y;
            long j11 = this.Z;
            Intent intent = new Intent(contextRequireContext, (Class<?>) SpeakIndexActivity.class);
            intent.putExtra(INTENTS.EXTRA_INT, i13);
            intent.putExtra(INTENTS.EXTRA_LONG, j11);
            startActivity(intent);
        } else if (itemId == R.id.item_display) {
            A();
            View view = this.V;
            kotlin.jvm.internal.m.c(view);
            SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.switch_show_translation);
            kotlin.jvm.internal.m.c(switchCompat);
            bq.z.b(switchCompat, new n0.w0(10, this, switchCompat));
            switchCompat.setChecked(r().showStoryTrans);
            View view2 = this.V;
            if (view2 != null) {
                final TextView textView = (TextView) view2.findViewById(R.id.tv_speed);
                ImageView imageView = (ImageView) view2.findViewById(R.id.iv_remove_speed);
                ImageView imageView2 = (ImageView) view2.findViewById(R.id.iv_plus_speed);
                textView.setText(r().audioSpeed + "%");
                kotlin.jvm.internal.m.c(imageView2);
                final int i14 = 0;
                bq.z.b(imageView2, new fz.c(this) { // from class: oo.b0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d0 f45637b;

                    {
                        this.f45637b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i14) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                d0 d0Var = this.f45637b;
                                if (d0Var.r().audioSpeed < 150) {
                                    d0Var.r().audioSpeed += 10;
                                    d0Var.r().updateEntry("audioSpeed");
                                    textView.setText(d0Var.r().audioSpeed + "%");
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                d0 d0Var2 = this.f45637b;
                                if (d0Var2.r().audioSpeed > 50) {
                                    d0Var2.r().audioSpeed -= 10;
                                    d0Var2.r().updateEntry("audioSpeed");
                                    String.valueOf(d0Var2.r().audioSpeed);
                                    textView.setText(d0Var2.r().audioSpeed + "%");
                                }
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                kotlin.jvm.internal.m.c(imageView);
                bq.z.b(imageView, new fz.c(this) { // from class: oo.b0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d0 f45637b;

                    {
                        this.f45637b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                d0 d0Var = this.f45637b;
                                if (d0Var.r().audioSpeed < 150) {
                                    d0Var.r().audioSpeed += 10;
                                    d0Var.r().updateEntry("audioSpeed");
                                    textView.setText(d0Var.r().audioSpeed + "%");
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                d0 d0Var2 = this.f45637b;
                                if (d0Var2.r().audioSpeed > 50) {
                                    d0Var2.r().audioSpeed -= 10;
                                    d0Var2.r().updateEntry("audioSpeed");
                                    String.valueOf(d0Var2.r().audioSpeed);
                                    textView.setText(d0Var2.r().audioSpeed + "%");
                                }
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
            }
            lc.d dVar = this.W;
            if (dVar == null) {
                l.m mVar = this.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                lc.d dVar2 = new lc.d(mVar);
                hz.b.t(dVar2, null, this.V, true, 41);
                lc.d.e(dVar2, Integer.valueOf(R.string.f22251ok), null, null, 6);
                md.a.r(dVar2, new z(this, 3));
                dVar2.show();
                this.W = dVar2;
            } else {
                dVar.show();
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        th.e eVar = this.O;
        if (eVar != null) {
            eVar.n();
        }
        xx.f fVar = this.S;
        if (fVar != null) {
            ux.b.a(fVar);
        }
    }

    @Override // ji.e
    public final void q() {
        th.e eVar = this.O;
        if (eVar != null) {
            kotlin.jvm.internal.m.c(eVar);
            eVar.n();
            th.e eVar2 = this.O;
            kotlin.jvm.internal.m.c(eVar2);
            eVar2.b();
        }
        y();
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        String string = getString(R.string.story_reading);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View viewRequireView = requireView();
        kotlin.jvm.internal.m.e(viewRequireView, "requireView(...)");
        ve.i.H(string, (l.m) p0VarRequireActivity, viewRequireView);
        View viewFindViewById = requireView().findViewById(R.id.toolbar);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        ((Toolbar) viewFindViewById).setNavigationOnClickListener(new aj.b(this, 15));
        this.Y = requireArguments().getInt(INTENTS.EXTRA_INT);
        this.Z = requireArguments().getLong(INTENTS.EXTRA_LONG);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        this.O = new th.e(contextRequireContext);
        List listX = x(this.Y);
        this.X = listX;
        kotlin.jvm.internal.m.c(listX);
        if (listX.isEmpty()) {
            l.m mVar = this.f36398d;
            kotlin.jvm.internal.m.c(mVar);
            mVar.finish();
            return;
        }
        int i11 = this.Y;
        List list = this.X;
        kotlin.jvm.internal.m.c(list);
        this.f45643a0 = jh.h.l(i11, list.size());
        z();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        bq.z.a(((b5) aVar).f32402h, 0L, new a0(this, 0));
        if (r().showStoryTrans) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((b5) aVar2).f32404j.setVisibility(0);
        } else {
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((b5) aVar3).f32404j.setVisibility(4);
        }
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        bq.z.b(((b5) aVar4).f32397c, new z(this, 4));
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        bq.z.b(((b5) aVar5).f32398d, new z(this, 1));
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        bq.z.b(((b5) aVar6).f32396b, new z(this, 2));
        setHasOptionsMenu(true);
    }

    public abstract List x(int i11);

    public final void y() {
        xx.f fVar = this.S;
        if (fVar != null) {
            ux.b.a(fVar);
        }
        cj.c cVar = this.P;
        if (cVar == null) {
            return;
        }
        cVar.f59271g = 0;
        cVar.f59272h = 0;
        cVar.f59273i = 0;
        kotlin.jvm.internal.m.c(cVar);
        cVar.d();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        android.support.v4.media.session.a.H(((b5) aVar).f32401g.getBackground());
    }

    public final void z() {
        int i11 = this.T;
        if (i11 == 0) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((b5) aVar).f32397c.setClickable(false);
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            AppCompatButton appCompatButton = ((b5) aVar2).f32397c;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            appCompatButton.setTextColor(contextRequireContext.getColor(R.color.color_D6D6D6));
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((b5) aVar3).f32396b.setClickable(true);
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            AppCompatButton appCompatButton2 = ((b5) aVar4).f32396b;
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
            appCompatButton2.setTextColor(contextRequireContext2.getColor(R.color.colorAccent));
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ((b5) aVar5).f32396b.setText(R.string.next);
        } else {
            List list = this.X;
            kotlin.jvm.internal.m.c(list);
            if (i11 >= list.size() - 1) {
                ta.a aVar6 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ((b5) aVar6).f32397c.setClickable(true);
                ta.a aVar7 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                AppCompatButton appCompatButton3 = ((b5) aVar7).f32397c;
                Context contextRequireContext3 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                appCompatButton3.setTextColor(contextRequireContext3.getColor(R.color.colorAccent));
                ta.a aVar8 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                ((b5) aVar8).f32396b.setClickable(true);
                ta.a aVar9 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                AppCompatButton appCompatButton4 = ((b5) aVar9).f32396b;
                Context contextRequireContext4 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                appCompatButton4.setTextColor(contextRequireContext4.getColor(R.color.colorAccent));
                ta.a aVar10 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                ((b5) aVar10).f32396b.setText(R.string._finish);
            } else {
                ta.a aVar11 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar11);
                ((b5) aVar11).f32397c.setClickable(true);
                ta.a aVar12 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar12);
                AppCompatButton appCompatButton5 = ((b5) aVar12).f32397c;
                Context contextRequireContext5 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                appCompatButton5.setTextColor(contextRequireContext5.getColor(R.color.colorAccent));
                ta.a aVar13 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar13);
                ((b5) aVar13).f32396b.setClickable(true);
                ta.a aVar14 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar14);
                AppCompatButton appCompatButton6 = ((b5) aVar14).f32396b;
                Context contextRequireContext6 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext6, "requireContext(...)");
                appCompatButton6.setTextColor(contextRequireContext6.getColor(R.color.colorAccent));
                ta.a aVar15 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar15);
                ((b5) aVar15).f32396b.setText(R.string.next);
            }
        }
        int i12 = this.T;
        List list2 = this.X;
        kotlin.jvm.internal.m.c(list2);
        if (i12 > list2.size() - 1) {
            return;
        }
        List list3 = this.X;
        kotlin.jvm.internal.m.c(list3);
        PodSentence podSentence = (PodSentence) list3.get(this.T);
        ta.a aVar16 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar16);
        ((b5) aVar16).f32399e.setVisibility(8);
        com.bumptech.glide.p pVarF = com.bumptech.glide.c.f(this);
        String[] strArr = this.f45643a0;
        kotlin.jvm.internal.m.c(strArr);
        com.bumptech.glide.n nVarK = pVarF.k(strArr[this.T]);
        ta.a aVar17 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar17);
        nVarK.x(((b5) aVar17).f32402h);
        Context contextRequireContext7 = requireContext();
        List<T> words = podSentence.getWords();
        ta.a aVar18 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar18);
        cj.c cVar = new cj.c(this, contextRequireContext7, words, ((b5) aVar18).f32400f);
        this.P = cVar;
        cVar.f59268d = 0;
        cVar.f59269e = 20;
        cVar.f59270f = 0;
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            cj.c cVar2 = this.P;
            kotlin.jvm.internal.m.c(cVar2);
            cVar2.f59274j = 2;
        } else {
            cj.c cVar3 = this.P;
            kotlin.jvm.internal.m.c(cVar3);
            cVar3.f59274j = ff.h.l(2.0f);
        }
        cj.c cVar4 = this.P;
        kotlin.jvm.internal.m.c(cVar4);
        cVar4.f59278o = true;
        cj.c cVar5 = this.P;
        kotlin.jvm.internal.m.c(cVar5);
        cVar5.f59277n = true;
        cj.c cVar6 = this.P;
        kotlin.jvm.internal.m.c(cVar6);
        cVar6.d();
        ta.a aVar19 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar19);
        ((b5) aVar19).f32404j.setText(podSentence.getTrans().getTrans());
        ta.a aVar20 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar20);
        ((b5) aVar20).f32403i.setProgress(this.T);
        ta.a aVar21 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar21);
        ProgressBar progressBar = ((b5) aVar21).f32403i;
        List list4 = this.X;
        kotlin.jvm.internal.m.c(list4);
        progressBar.setMax(list4.size() - 1);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        view.postDelayed(new b2.c(4, view, new a0(this, 2)), 0L);
    }
}
