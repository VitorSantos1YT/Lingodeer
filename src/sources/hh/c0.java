package hh;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.fluent.ui.base.adapter.PdLearnDetailAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonLearnIndex;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import hj.i4;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends bp.m {
    public PdLesson O;
    public PdLearnDetailAdapter P;
    public final th.e Q;
    public boolean R;
    public final AtomicBoolean S;
    public final AtomicBoolean T;
    public AtomicBoolean U;
    public final AtomicBoolean V;
    public xx.f W;
    public PopupWindow X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public rx.b f32213a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f32214b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f32215c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f32216d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f32217e0;

    public c0() {
        super(x.f32307a, "FluentListenandMatch");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        this.Q = new th.e(lingoSkillApplication);
        this.R = true;
        this.S = new AtomicBoolean(false);
        this.T = new AtomicBoolean(false);
        this.U = new AtomicBoolean(true);
        this.V = new AtomicBoolean(true);
        this.f32214b0 = 1000L;
        this.f32217e0 = com.bumptech.glide.d.u(qy.j.NONE, new bp.b1(8, this, new bj.a(this, 12)));
    }

    public static void y(c0 c0Var) {
        ArrayList arrayList;
        PopupWindow popupWindow = c0Var.X;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        PdLearnDetailAdapter pdLearnDetailAdapter = c0Var.P;
        if (pdLearnDetailAdapter == null || (arrayList = pdLearnDetailAdapter.f21637l) == null) {
            return;
        }
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                PdLearnDetailAdapter pdLearnDetailAdapter2 = c0Var.P;
                if ((pdLearnDetailAdapter2 != null ? pdLearnDetailAdapter2.f21631f : null) == null) {
                    ImageView imageView = (ImageView) arrayList.get(0);
                    Object tag = imageView.getTag(R.id.tag_sentence);
                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdSentence");
                    PdSentence pdSentence = (PdSentence) tag;
                    Object tag2 = imageView.getTag(R.id.tag_item_view);
                    kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type android.view.View");
                    View view = (View) tag2;
                    PdLearnDetailAdapter pdLearnDetailAdapter3 = c0Var.P;
                    if (pdLearnDetailAdapter3 != null) {
                        pdLearnDetailAdapter3.d(view, imageView, pdSentence, false);
                        return;
                    }
                    return;
                }
                int i14 = i12 + 1;
                if (i14 >= arrayList.size()) {
                    c0Var.B(false);
                    return;
                }
                ImageView imageView2 = (ImageView) arrayList.get(i14);
                Object tag3 = imageView2.getTag(R.id.tag_sentence);
                kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdSentence");
                PdSentence pdSentence2 = (PdSentence) tag3;
                Object tag4 = imageView2.getTag(R.id.tag_item_view);
                kotlin.jvm.internal.m.d(tag4, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) tag4;
                PdLearnDetailAdapter pdLearnDetailAdapter4 = c0Var.P;
                if (pdLearnDetailAdapter4 != null) {
                    pdLearnDetailAdapter4.d(view2, imageView2, pdSentence2, false);
                    return;
                }
                return;
            }
            Object obj = arrayList.get(i13);
            i13++;
            int i15 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            ImageView imageView3 = (ImageView) obj;
            PdLearnDetailAdapter pdLearnDetailAdapter5 = c0Var.P;
            if (kotlin.jvm.internal.m.a(imageView3, pdLearnDetailAdapter5 != null ? pdLearnDetailAdapter5.f21631f : null)) {
                i12 = i11;
            }
            i11 = i15;
        }
    }

    public final void A(boolean z11) {
        ImageView imageView;
        Drawable background;
        ArrayList arrayList;
        View view;
        th.e eVar = this.Q;
        eVar.m(1.0f, true);
        AtomicBoolean atomicBoolean = this.S;
        if (!z11) {
            atomicBoolean.set(false);
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((i4) aVar).f32712j.setImageResource(R.drawable.pd_learn_detail_w_play);
            xx.f fVar = this.W;
            if (fVar != null) {
                ux.b.a(fVar);
            }
            eVar.g();
            rx.b bVar = this.f32213a0;
            if (bVar != null) {
                bVar.dispose();
            }
            PdLearnDetailAdapter pdLearnDetailAdapter = this.P;
            if (pdLearnDetailAdapter == null || (imageView = pdLearnDetailAdapter.f21631f) == null || (background = imageView.getBackground()) == null || !(background instanceof AnimationDrawable)) {
                return;
            }
            AnimationDrawable animationDrawable = (AnimationDrawable) background;
            animationDrawable.selectDrawable(0);
            animationDrawable.stop();
            return;
        }
        atomicBoolean.set(true);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((i4) aVar2).f32712j.setImageResource(R.drawable.pd_learn_detail_w_pause);
        this.T.set(false);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((i4) aVar3).f32710h.setImageResource(R.drawable.pd_learn_detail_n_play);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((i4) aVar4).f32710h.setTag(Integer.valueOf(R.drawable.pd_learn_detail_n_play));
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((i4) aVar5).f32711i.setImageResource(R.drawable.pd_learn_detail_s_play);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((i4) aVar6).f32711i.setTag(Integer.valueOf(R.drawable.pd_learn_detail_s_play));
        PdLearnDetailAdapter pdLearnDetailAdapter2 = this.P;
        if (pdLearnDetailAdapter2 == null || (arrayList = pdLearnDetailAdapter2.f21634i) == null || (view = (View) arrayList.get(this.Z)) == null) {
            return;
        }
        Object tag = view.getTag(R.id.tag_item_view);
        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) tag;
        Object tag2 = view.getTag(R.id.tag_word);
        kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
        PdWord pdWord = (PdWord) tag2;
        Object tag3 = view.getTag(R.id.tag_adapter_pos);
        kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) tag3).intValue();
        PdLearnDetailAdapter pdLearnDetailAdapter3 = this.P;
        if (pdLearnDetailAdapter3 != null) {
            pdLearnDetailAdapter3.c(view, view2, pdWord, iIntValue, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0052  */
    /* JADX WARN: Code duplicated, block: B:6:0x0039  */
    /* JADX WARN: Code duplicated, block: B:8:0x003f  */
    public final void B(boolean z11) {
        boolean z12;
        ta.a aVar;
        ArrayList arrayList;
        ImageView imageView;
        ImageView imageView2;
        Drawable background;
        Integer numValueOf = Integer.valueOf(R.drawable.pd_learn_detail_n_pause);
        Integer numValueOf2 = Integer.valueOf(R.drawable.pd_learn_detail_s_pause);
        Integer numValueOf3 = Integer.valueOf(R.drawable.pd_learn_detail_s_play);
        Integer numValueOf4 = Integer.valueOf(R.drawable.pd_learn_detail_n_play);
        AtomicBoolean atomicBoolean = this.V;
        if (atomicBoolean.get()) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            if (kotlin.jvm.internal.m.a(((i4) aVar2).f32711i.getTag(), numValueOf2)) {
                z12 = true;
            } else {
                if (!atomicBoolean.get()) {
                    aVar = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    if (kotlin.jvm.internal.m.a(((i4) aVar).f32710h.getTag(), numValueOf)) {
                        z12 = true;
                    }
                }
                z12 = false;
            }
        } else {
            if (!atomicBoolean.get()) {
                aVar = this.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                if (kotlin.jvm.internal.m.a(((i4) aVar).f32710h.getTag(), numValueOf)) {
                    z12 = true;
                }
            }
            z12 = false;
        }
        AtomicBoolean atomicBoolean2 = this.T;
        if (!z11 && !z12) {
            atomicBoolean2.set(false);
            if (atomicBoolean.get()) {
                ta.a aVar3 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((i4) aVar3).f32710h.setImageResource(R.drawable.pd_learn_detail_n_play);
                ta.a aVar4 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((i4) aVar4).f32710h.setTag(numValueOf4);
            } else {
                ta.a aVar5 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ((i4) aVar5).f32711i.setImageResource(R.drawable.pd_learn_detail_s_play);
                ta.a aVar6 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ((i4) aVar6).f32711i.setTag(numValueOf3);
            }
            xx.f fVar = this.W;
            if (fVar != null) {
                ux.b.a(fVar);
            }
            this.Q.g();
            rx.b bVar = this.f32213a0;
            if (bVar != null) {
                bVar.dispose();
            }
            PdLearnDetailAdapter pdLearnDetailAdapter = this.P;
            if (pdLearnDetailAdapter != null && (imageView2 = pdLearnDetailAdapter.f21631f) != null && (background = imageView2.getBackground()) != null && (background instanceof AnimationDrawable)) {
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.selectDrawable(0);
                animationDrawable.stop();
            }
            PdLearnDetailAdapter pdLearnDetailAdapter2 = this.P;
            if (pdLearnDetailAdapter2 != null) {
                pdLearnDetailAdapter2.b();
                return;
            }
            return;
        }
        this.S.set(false);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((i4) aVar7).f32712j.setImageResource(R.drawable.pd_learn_detail_w_play);
        atomicBoolean2.set(true);
        if (atomicBoolean.get()) {
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            ((i4) aVar8).f32710h.setImageResource(R.drawable.pd_learn_detail_n_pause);
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            ((i4) aVar9).f32710h.setTag(numValueOf);
            ta.a aVar10 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar10);
            ((i4) aVar10).f32711i.setImageResource(R.drawable.pd_learn_detail_s_play);
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            ((i4) aVar11).f32711i.setTag(numValueOf3);
        } else {
            ta.a aVar12 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar12);
            ((i4) aVar12).f32711i.setImageResource(R.drawable.pd_learn_detail_s_pause);
            ta.a aVar13 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar13);
            ((i4) aVar13).f32711i.setTag(numValueOf2);
            ta.a aVar14 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar14);
            ((i4) aVar14).f32710h.setImageResource(R.drawable.pd_learn_detail_n_play);
            ta.a aVar15 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar15);
            ((i4) aVar15).f32710h.setTag(numValueOf4);
        }
        PdLearnDetailAdapter pdLearnDetailAdapter3 = this.P;
        if (pdLearnDetailAdapter3 == null || (arrayList = pdLearnDetailAdapter3.f21637l) == null || (imageView = (ImageView) arrayList.get(this.Y)) == null) {
            return;
        }
        Object tag = imageView.getTag(R.id.tag_sentence);
        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdSentence");
        PdSentence pdSentence = (PdSentence) tag;
        Object tag2 = imageView.getTag(R.id.tag_item_view);
        kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type android.view.View");
        View view = (View) tag2;
        PdLearnDetailAdapter pdLearnDetailAdapter4 = this.P;
        if (pdLearnDetailAdapter4 != null) {
            pdLearnDetailAdapter4.d(view, imageView, pdSentence, false);
        }
    }

    public final void C() {
        this.f32214b0 = ((fr.o0) s()).n();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((i4) aVar).f32720s.setText((this.f32214b0 / 1000.0f) + " s");
        long j11 = this.f32214b0;
        if (j11 <= 500) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((i4) aVar2).f32713k.clearColorFilter();
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ImageView imageView = ((i4) aVar3).f32713k;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            imageView.setColorFilter(contextRequireContext.getColor(R.color.color_7D7D7D));
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((i4) aVar4).f32713k.setEnabled(false);
            return;
        }
        if (j11 >= 5000) {
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ((i4) aVar5).f32708f.clearColorFilter();
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ImageView imageView2 = ((i4) aVar6).f32708f;
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
            imageView2.setColorFilter(contextRequireContext2.getColor(R.color.color_7D7D7D));
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((i4) aVar7).f32708f.setEnabled(false);
            return;
        }
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        ImageView imageView3 = ((i4) aVar8).f32708f;
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        ImageView[] imageViewArr = {imageView3, ((i4) aVar9).f32713k};
        for (int i11 = 0; i11 < 2; i11++) {
            ImageView imageView4 = imageViewArr[i11];
            kotlin.jvm.internal.m.c(imageView4);
            imageView4.clearColorFilter();
            Context contextRequireContext3 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
            imageView4.setColorFilter(contextRequireContext3.getColor(R.color.colorAccent));
            imageView4.setEnabled(true);
        }
    }

    @Override // bp.m, androidx.fragment.app.k0
    public final void onPause() {
        super.onPause();
        x();
    }

    @Override // ji.e
    public final void q() {
        ArrayList arrayList;
        PdLearnDetailAdapter pdLearnDetailAdapter = this.P;
        if (pdLearnDetailAdapter != null) {
            pdLearnDetailAdapter.b();
        }
        th.e eVar = this.Q;
        eVar.a();
        eVar.b();
        PopupWindow popupWindow = this.X;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        rx.b bVar = this.f32213a0;
        if (bVar != null) {
            bVar.dispose();
        }
        try {
            int[] iArr = bq.r.f4959a;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            String strR = bq.m.r(cf.x.n().keyLanguage);
            PdLesson pdLesson = this.O;
            if (pdLesson == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            String str = strR + "_" + pdLesson.getLessonId();
            PdLearnDetailAdapter pdLearnDetailAdapter2 = this.P;
            int i11 = 0;
            if (pdLearnDetailAdapter2 != null && (arrayList = pdLearnDetailAdapter2.f21636k) != null) {
                int size = arrayList.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    int i14 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    if (((View) obj).getVisibility() == 0) {
                        i11 = i12;
                    }
                    i12 = i14;
                }
            }
            if (i11 > 0) {
                PdLessonDbHelper.INSTANCE.pdLessonLearnIndexDao().insertOrReplace(new PdLessonLearnIndex(str, i11));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, qy.h] */
    @Override // ji.e
    public final void v(Bundle bundle) {
        try {
            PdLesson pdLesson = ((jh.o) this.f32217e0.getValue()).f36374b;
            vy.d dVar = null;
            if (pdLesson == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            this.O = pdLesson;
            int[] iArr = bq.r.f4959a;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            String strR = bq.m.r(cf.x.n().keyLanguage);
            PdLesson pdLesson2 = this.O;
            if (pdLesson2 == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            PdLessonLearnIndex pdLessonLearnIndex = (PdLessonLearnIndex) PdLessonDbHelper.INSTANCE.pdLessonLearnIndexDao().load(strR + "_" + pdLesson2.getLessonId());
            if (pdLessonLearnIndex != null) {
                this.f32215c0 = pdLessonLearnIndex.getIndex();
                PdLesson pdLesson3 = this.O;
                if (pdLesson3 == null) {
                    kotlin.jvm.internal.m.n("pdLesson");
                    throw null;
                }
                pdLesson3.getSentences().size();
                int i11 = this.f32215c0;
                PdLesson pdLesson4 = this.O;
                if (pdLesson4 == null) {
                    kotlin.jvm.internal.m.n("pdLesson");
                    throw null;
                }
                if (i11 == pdLesson4.getSentences().size() - 1) {
                    this.f32216d0 = true;
                }
            }
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new gp.a(this, dVar, 8), 3);
        } catch (Exception e8) {
            e8.printStackTrace();
            requireActivity().finish();
        }
    }

    public final void x() {
        ImageView imageView;
        Drawable background;
        this.Q.n();
        PdLearnDetailAdapter pdLearnDetailAdapter = this.P;
        if (pdLearnDetailAdapter != null && (imageView = pdLearnDetailAdapter.f21631f) != null && (background = imageView.getBackground()) != null && (background instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) background;
            animationDrawable.selectDrawable(0);
            animationDrawable.stop();
        }
        z();
    }

    public final void z() {
        rx.b bVar = this.f32213a0;
        if (bVar != null) {
            bVar.dispose();
        }
        this.S.set(false);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((i4) aVar).f32712j.setImageResource(R.drawable.pd_learn_detail_w_play);
        this.T.set(false);
        if (this.V.get()) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((i4) aVar2).f32710h.setImageResource(R.drawable.pd_learn_detail_n_play);
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((i4) aVar3).f32710h.setTag(Integer.valueOf(R.drawable.pd_learn_detail_n_play));
            return;
        }
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((i4) aVar4).f32711i.setImageResource(R.drawable.pd_learn_detail_s_play);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((i4) aVar5).f32711i.setTag(Integer.valueOf(R.drawable.pd_learn_detail_s_play));
    }
}
