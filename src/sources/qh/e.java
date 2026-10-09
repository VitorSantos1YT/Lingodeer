package qh;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.p0;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.lingo.fluent.object.WordOptions;
import com.lingo.fluent.widget.WordChooseGameLine;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hj.u5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ot.f2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ji.e {
    public sh.b N;
    public th.e O;
    public ObjectAnimator P;
    public long Q;
    public xx.f R;
    public final AtomicBoolean S;
    public final AtomicBoolean T;
    public final ArrayList U;
    public final ArrayList V;

    public e() {
        super(b.f47743a, BuildConfig.VERSION_NAME);
        this.S = new AtomicBoolean(false);
        this.T = new AtomicBoolean(false);
        this.U = new ArrayList();
        this.V = new ArrayList();
    }

    public final void A() {
        sh.b bVar = this.N;
        if (bVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (bVar.H) {
            return;
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((u5) aVar).f33403c.setImageResource(R.drawable.ic_game_time);
        xx.f fVar = this.R;
        if (fVar != null) {
            ux.b.a(fVar);
        }
        ay.d0 d0VarD = qx.h.d(1L, 1L, TimeUnit.SECONDS, ky.e.f38936a);
        sh.b bVar2 = this.N;
        if (bVar2 != null) {
            this.R = d0VarD.l(bVar2.f51682d).k(ky.e.f38937b).g(px.b.a()).h(new o20.w(this, 6), vx.b.f54316e);
        } else {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
    }

    public final void B() {
        AtomicBoolean atomicBoolean = this.S;
        if (atomicBoolean.get()) {
            return;
        }
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((AppCompatTextView) obj).setEnabled(false);
        }
        F();
        atomicBoolean.set(true);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((u5) aVar).f33420u.setVisibility(8);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((u5) aVar2).G.setVisibility(8);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((u5) aVar3).f33422w.setVisibility(8);
        x();
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ImageView imageView = ((u5) aVar4).f33413n;
        imageView.setImageResource(R.drawable.ic_game_word_choose_right_deer_rotate);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = imageView.animate();
        Context context = imageView.getContext();
        kotlin.jvm.internal.m.e(context, "getContext(...)");
        viewPropertyAnimatorAnimate.translationXBy(j3.Z(36, context)).setDuration(400L).start();
        imageView.animate().alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(200L).setStartDelay(400L).start();
        ImageView imageView2 = new ImageView(requireContext());
        imageView2.setImageResource(R.drawable.ic_game_word_choose_cloud_1);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((u5) aVar5).f33419t.addView(imageView2);
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        Context context2 = imageView2.getContext();
        kotlin.jvm.internal.m.e(context2, "getContext(...)");
        layoutParams.width = (int) j3.Z(667, context2);
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        Context context3 = imageView2.getContext();
        kotlin.jvm.internal.m.e(context3, "getContext(...)");
        layoutParams2.height = (int) j3.Z(501, context3);
        Context context4 = imageView2.getContext();
        kotlin.jvm.internal.m.e(context4, "getContext(...)");
        imageView2.setX(j3.Z(-667, context4));
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        float height = ((u5) aVar6).f33419t.getHeight();
        Context context5 = imageView2.getContext();
        kotlin.jvm.internal.m.e(context5, "getContext(...)");
        imageView2.setY(height - j3.Z(501, context5));
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = imageView2.animate();
        Context context6 = imageView2.getContext();
        kotlin.jvm.internal.m.e(context6, "getContext(...)");
        viewPropertyAnimatorAnimate2.translationXBy(j3.Z(667, context6)).setStartDelay(800L).setDuration(400L).start();
        ImageView imageView3 = new ImageView(requireContext());
        imageView3.setImageResource(R.drawable.ic_game_word_choose_cloud_2);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((u5) aVar7).f33419t.addView(imageView3);
        ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
        Context context7 = imageView3.getContext();
        kotlin.jvm.internal.m.e(context7, "getContext(...)");
        layoutParams3.width = (int) j3.Z(641, context7);
        ViewGroup.LayoutParams layoutParams4 = imageView3.getLayoutParams();
        Context context8 = imageView3.getContext();
        kotlin.jvm.internal.m.e(context8, "getContext(...)");
        layoutParams4.height = (int) j3.Z(392, context8);
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        imageView3.setX(((u5) aVar8).f33419t.getWidth());
        imageView3.setY(CropImageView.DEFAULT_ASPECT_RATIO);
        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = imageView3.animate();
        Context context9 = imageView3.getContext();
        kotlin.jvm.internal.m.e(context9, "getContext(...)");
        viewPropertyAnimatorAnimate3.translationXBy(j3.Z(-641, context9)).setDuration(400L).setStartDelay(800L).start();
        ArrayList arrayList2 = this.U;
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            ((View) obj2).animate().setStartDelay(800L).setDuration(300L).alpha(CropImageView.DEFAULT_ASPECT_RATIO).start();
        }
        th.e eVar = this.O;
        if (eVar == null) {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
        eVar.k(R.raw.word_choose_game_finish);
        th.j.a(qx.h.m(1600L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new xq.c(this, imageView2, imageView3, 27), vx.b.f54316e), this.f36401t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        PdWord pdWord;
        PdWord pdWord2;
        sh.b bVar = this.N;
        if (bVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (bVar.K.get()) {
            A();
            sh.b bVar2 = this.N;
            if (bVar2 == null) {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
            bVar2.K.set(false);
        }
        sh.b bVar3 = this.N;
        if (bVar3 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (bVar3.f51681c == 0) {
            B();
            return;
        }
        ArrayList arrayList = bVar3.f51680b;
        bVar3.f51679a++;
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (bVar3.f51679a >= bVar3.b().size()) {
            mutableLiveData.setValue(null);
        } else if (bVar3.f51679a >= bVar3.b().size()) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (!kotlin.jvm.internal.m.a(cf.x.n().accountType, "unlogin_user")) {
                FirebaseCrashlytics firebaseCrashlyticsA = FirebaseCrashlytics.a();
                String uid = cf.x.n().uid;
                kotlin.jvm.internal.m.e(uid, "uid");
                String strConcat = "Invalid state WordChoose ".concat(uid);
                CrashlyticsCore crashlyticsCore = firebaseCrashlyticsA.f18213a;
                crashlyticsCore.f18301o.f18376a.b(new com.google.firebase.crashlytics.internal.common.c(crashlyticsCore, System.currentTimeMillis() - crashlyticsCore.f18291d, strConcat));
            }
            mutableLiveData.setValue(null);
        } else {
            PdWord pdWord3 = (PdWord) bVar3.b().get(bVar3.f51679a);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(pdWord3);
            List listB = bVar3.b();
            jz.d dVar = jz.e.f37397a;
            Object objI0 = ry.m.I0(listB);
            while (true) {
                pdWord = (PdWord) objI0;
                if (!arrayList2.contains(pdWord) && !kotlin.jvm.internal.m.a(pdWord3.getShowTrans(), pdWord.getShowTrans()) && !kotlin.jvm.internal.m.a(pdWord3.getShowWord(), pdWord.getShowWord())) {
                    break;
                }
                List listB2 = bVar3.b();
                jz.d dVar2 = jz.e.f37397a;
                objI0 = ry.m.I0(listB2);
            }
            arrayList2.add(pdWord);
            List listB3 = bVar3.b();
            jz.d dVar3 = jz.e.f37397a;
            Object objI1 = ry.m.I0(listB3);
            while (true) {
                pdWord2 = (PdWord) objI1;
                if (!arrayList2.contains(pdWord2) && !kotlin.jvm.internal.m.a(pdWord3.getShowTrans(), pdWord2.getShowTrans()) && !kotlin.jvm.internal.m.a(pdWord3.getShowWord(), pdWord.getShowWord())) {
                    break;
                }
                List listB4 = bVar3.b();
                jz.d dVar4 = jz.e.f37397a;
                objI1 = ry.m.I0(listB4);
            }
            arrayList2.add(pdWord2);
            Collections.shuffle(arrayList2);
            mutableLiveData.setValue(new WordOptions(pdWord3, arrayList2));
            Objects.toString(mutableLiveData.getValue());
            WordOptions wordOptions = (WordOptions) mutableLiveData.getValue();
            if (wordOptions != null) {
                bVar3.L = wordOptions;
            }
            if (!arrayList.contains(pdWord3)) {
                arrayList.add(pdWord3);
            }
        }
        mutableLiveData.observe(getViewLifecycleOwner(), new ci.c(this, 5));
    }

    public final void D(AppCompatTextView appCompatTextView, boolean z11, boolean z12) {
        ArrayList arrayList;
        char c11;
        ViewPropertyAnimator viewPropertyAnimatorTranslationYBy;
        ViewPropertyAnimator duration;
        sh.b bVar = this.N;
        if (bVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        boolean z13 = true;
        if (bVar.H) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ProgressBar progressBar = ((u5) aVar).f33418s;
            sh.b bVar2 = this.N;
            if (bVar2 == null) {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
            progressBar.setProgress(bVar2.f51679a + 1);
        }
        sh.b bVar3 = this.N;
        if (bVar3 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        bVar3.K.set(true);
        F();
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f38361a = appCompatTextView;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.V.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) next;
            Object tag = appCompatTextView2.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
            String favId = ((PdWord) tag).getFavId();
            sh.b bVar4 = this.N;
            if (bVar4 == null) {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
            if (kotlin.jvm.internal.m.a(favId, bVar4.a().getWord().getFavId())) {
                yVar.f38361a = appCompatTextView2;
            } else {
                arrayList2.add(appCompatTextView2);
            }
            appCompatTextView2.setEnabled(false);
        }
        x();
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f38360a = 2000L;
        if (z11) {
            int[] iArr = bq.r.f4959a;
            bq.m.A(R.raw.game_choose_click);
            th.e eVar = this.O;
            if (eVar == null) {
                kotlin.jvm.internal.m.n("player");
                throw null;
            }
            eVar.k(R.raw.game_choose_click);
        } else {
            int[] iArr2 = bq.r.f4959a;
            bq.m.A(R.raw.game_choose_wrong);
            th.e eVar2 = this.O;
            if (eVar2 == null) {
                kotlin.jvm.internal.m.n("player");
                throw null;
            }
            eVar2.k(R.raw.game_choose_wrong);
        }
        n9.q qVar = this.f36401t;
        re.q qVar2 = vx.b.f54316e;
        if (z11) {
            sh.b bVar5 = this.N;
            if (bVar5 == null) {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
            bVar5.f51683e++;
            bVar5.f51684f++;
            Long wordId = bVar5.a().getWord().getWordId();
            kotlin.jvm.internal.m.e(wordId, "getWordId(...)");
            th.j.a(new ay.x(new gh.a(wordId.longValue(), z13)).k(ky.e.f38937b).g(px.b.a()).h(sh.a.f51672b, qVar2), bVar5.N);
            Iterator it2 = bVar5.f51680b.iterator();
            kotlin.jvm.internal.m.e(it2, "iterator(...)");
            while (it2.hasNext()) {
                PdWord pdWord = (PdWord) it2.next();
                if (kotlin.jvm.internal.m.a(pdWord.getFavId(), bVar5.a().getWord().getFavId())) {
                    pdWord.setFinishSortIndex(1L);
                }
            }
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ObjectAnimator.ofPropertyValuesHolder(((u5) aVar2).E, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.4f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.4f, 1.0f)).setDuration(300L).start();
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            TextView textView = ((u5) aVar3).E;
            sh.b bVar6 = this.N;
            if (bVar6 == null) {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
            textView.setText("+" + getString(R.string._s_xp, String.valueOf(bVar6.f51683e)));
            ((AppCompatTextView) yVar.f38361a).setBackgroundResource(R.drawable.bg_game_word_choose_option_btn_correct);
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            View view = ((u5) aVar4).G;
            view.setVisibility(0);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            viewPropertyAnimatorAnimate.translationYBy(j3.Z(74, contextRequireContext)).setDuration(300L).start();
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            float x11 = ((u5) aVar5).f33414o.getX();
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            float translationX = x11 - ((u5) aVar6).f33411k.getTranslationX();
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((u5) aVar7).f33411k.clearAnimation();
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            ((u5) aVar8).f33411k.animate().translationXBy(translationX).setStartDelay(300L).setDuration(1000L).start();
            th.j.a(qx.h.m(1300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.j(this, 10), qVar2), qVar);
            xVar.f38360a = 2500L;
            c11 = 1;
            arrayList = arrayList2;
        } else {
            sh.b bVar7 = this.N;
            if (bVar7 == null) {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
            Long wordId2 = bVar7.a().getWord().getWordId();
            kotlin.jvm.internal.m.e(wordId2, "getWordId(...)");
            arrayList = arrayList2;
            c11 = 1;
            th.j.a(new ay.x(new gh.a(wordId2.longValue(), false)).k(ky.e.f38937b).g(px.b.a()).h(sh.a.f51673c, qVar2), bVar7.N);
            Iterator it3 = bVar7.f51680b.iterator();
            kotlin.jvm.internal.m.e(it3, "iterator(...)");
            while (it3.hasNext()) {
                PdWord pdWord2 = (PdWord) it3.next();
                if (kotlin.jvm.internal.m.a(pdWord2.getFavId(), bVar7.a().getWord().getFavId())) {
                    pdWord2.setFinishSortIndex(0L);
                    pdWord2.getFavId();
                }
            }
            appCompatTextView.setBackgroundResource(R.drawable.bg_game_word_choose_option_btn_wrong);
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            ((u5) aVar9).f33402b.removeOneLife();
            if (z12) {
                ta.a aVar10 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = ((u5) aVar10).f33411k.animate();
                Context contextRequireContext2 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                viewPropertyAnimatorAnimate2.translationYBy(j3.Z(100, contextRequireContext2)).alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(600L).start();
            } else {
                ta.a aVar11 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar11);
                float translationX2 = ((u5) aVar11).f33411k.getTranslationX();
                ta.a aVar12 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar12);
                float width = translationX2 - (((u5) aVar12).f33411k.getWidth() / 2.0f);
                ta.a aVar13 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar13);
                float x12 = ((u5) aVar13).f33406f.getX();
                ta.a aVar14 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar14);
                float width2 = width - ((((u5) aVar14).f33406f.getWidth() / 2.0f) + x12);
                ta.a aVar15 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar15);
                ((u5) aVar15).f33411k.setVisibility(4);
                ta.a aVar16 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar16);
                ImageView imageView = ((u5) aVar16).f33407g;
                imageView.setVisibility(0);
                imageView.setTranslationX(width2);
                imageView.animate().alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(300L).setStartDelay(600L).start();
                ta.a aVar17 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar17);
                ImageView imageView2 = ((u5) aVar17).f33406f;
                imageView2.setVisibility(0);
                imageView2.setTranslationX(width2);
                ViewPropertyAnimator viewPropertyAnimatorAnimate3 = imageView2.animate();
                Context context = imageView2.getContext();
                kotlin.jvm.internal.m.e(context, "getContext(...)");
                viewPropertyAnimatorAnimate3.translationYBy(j3.Z(100, context)).alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(600L).start();
            }
        }
        Iterator it4 = arrayList.iterator();
        kotlin.jvm.internal.m.e(it4, "iterator(...)");
        while (it4.hasNext()) {
            Object next2 = it4.next();
            kotlin.jvm.internal.m.e(next2, "next(...)");
            ViewPropertyAnimator viewPropertyAnimatorAnimate4 = ((AppCompatTextView) next2).animate();
            Context contextRequireContext3 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
            viewPropertyAnimatorAnimate4.translationYBy(j3.Z(250, contextRequireContext3)).alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(500L).start();
        }
        ta.a aVar18 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar18);
        float y10 = ((u5) aVar18).D.getY();
        ta.a aVar19 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar19);
        float height = y10 + ((u5) aVar19).D.getHeight();
        Context contextRequireContext4 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
        float fZ = (j3.Z(56, contextRequireContext4) + height) - ((AppCompatTextView) yVar.f38361a).getY();
        ViewPropertyAnimator viewPropertyAnimatorAnimate5 = ((AppCompatTextView) yVar.f38361a).animate();
        if (viewPropertyAnimatorAnimate5 != null && (viewPropertyAnimatorTranslationYBy = viewPropertyAnimatorAnimate5.translationYBy(fZ)) != null && (duration = viewPropertyAnimatorTranslationYBy.setDuration(500L)) != null) {
            duration.start();
        }
        Context contextRequireContext5 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
        float fZ2 = j3.Z(62, contextRequireContext5);
        Context contextRequireContext6 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext6, "requireContext(...)");
        float fZ3 = j3.Z(84, contextRequireContext6);
        float[] fArr = new float[2];
        fArr[0] = fZ2;
        fArr[c11] = fZ3;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.motion.c(yVar, 5));
        valueAnimatorOfFloat.start();
        th.j.a(qx.h.m(xVar.f38360a, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new d(0, xVar, this), qVar2), qVar);
    }

    public final void E() {
        ObjectAnimator objectAnimator = this.P;
        this.Q = objectAnimator != null ? objectAnimator.getCurrentPlayTime() : 0L;
        ObjectAnimator objectAnimator2 = this.P;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
        }
        ObjectAnimator objectAnimator3 = this.P;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        sh.b bVar = this.N;
        if (bVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        bVar.f51685t = true;
        F();
        th.e eVar = this.O;
        if (eVar != null) {
            eVar.g();
        } else {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
    }

    public final void F() {
        xx.f fVar;
        sh.b bVar = this.N;
        if (bVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (bVar.H || (fVar = this.R) == null) {
            return;
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((u5) aVar).f33403c.setImageResource(R.drawable.ic_game_time_pause);
        if (fVar.b()) {
            return;
        }
        sh.b bVar2 = this.N;
        if (bVar2 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        bVar2.f51682d = bVar2.f51681c;
        ux.b.a(fVar);
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        if (((u5) aVar).f33419t.findViewById(R.id.ll_resume) == null) {
            z();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        E();
    }

    @Override // ji.e
    public final void q() {
        x();
        th.e eVar = this.O;
        if (eVar != null) {
            eVar.b();
        } else {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) throws Exception {
        sh.b bVar;
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        AppCompatTextView appCompatTextView = ((u5) aVar).f33424y;
        ArrayList arrayList = this.V;
        arrayList.add(appCompatTextView);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        arrayList.add(((u5) aVar2).f33425z);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        arrayList.add(((u5) aVar3).A);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        WordChooseGameLine wordChooseGameLine = ((u5) aVar4).f33412l;
        ArrayList arrayList2 = this.U;
        arrayList2.add(wordChooseGameLine);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        arrayList2.add(((u5) aVar5).D);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        arrayList2.add(((u5) aVar6).B);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        arrayList2.add(((u5) aVar7).F);
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        arrayList2.add(((u5) aVar8).f33423x);
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        arrayList2.add(((u5) aVar9).f33424y);
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        arrayList2.add(((u5) aVar10).f33425z);
        ta.a aVar11 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar11);
        arrayList2.add(((u5) aVar11).A);
        ta.a aVar12 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar12);
        arrayList2.add(((u5) aVar12).f33411k);
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        arrayList2.add(((u5) aVar13).f33414o);
        ta.a aVar14 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar14);
        arrayList2.add(((u5) aVar14).f33415p);
        ta.a aVar15 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar15);
        arrayList2.add(((u5) aVar15).G);
        ta.a aVar16 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar16);
        bq.z.b(((u5) aVar16).m, new a(this, 0));
        ta.a aVar17 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar17);
        bq.z.b(((u5) aVar17).f33416q, new f2(15));
        ta.a aVar18 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar18);
        ((u5) aVar18).f33416q.setVisibility(8);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        this.O = new th.e(contextRequireContext);
        p0 activity = getActivity();
        if (activity == null || (bVar = (sh.b) new ViewModelProvider(activity).get(sh.b.class)) == null) {
            throw new Exception("Invalid Activity!");
        }
        this.N = bVar;
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new mv.f0(this, null, 6), 3);
    }

    public final void x() {
        ObjectAnimator objectAnimator = this.P;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.P;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.P = null;
    }

    public final void y() {
        sh.b bVar = this.N;
        if (bVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (bVar.H) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((u5) aVar).f33402b.setVisibility(8);
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((u5) aVar2).f33403c.setVisibility(8);
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((u5) aVar3).C.setVisibility(8);
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((u5) aVar4).f33418s.setVisibility(0);
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ProgressBar progressBar = ((u5) aVar5).f33418s;
            sh.b bVar2 = this.N;
            if (bVar2 == null) {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
            progressBar.setMax(bVar2.b().size());
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ((u5) aVar6).f33418s.setProgress(0);
        } else {
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((u5) aVar7).f33402b.setVisibility(8);
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            ((u5) aVar8).f33418s.setVisibility(8);
        }
        this.S.set(false);
        sh.b bVar3 = this.N;
        if (bVar3 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        bVar3.f51685t = false;
        bVar3.c();
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((View) obj).setAlpha(1.0f);
        }
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        ImageView imageView = ((u5) aVar9).f33413n;
        imageView.setImageResource(R.drawable.ic_game_word_choose_right_deer);
        imageView.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
        imageView.setAlpha(1.0f);
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        ImageView imageView2 = ((u5) aVar10).f33410j;
        imageView2.setVisibility(0);
        imageView2.setAlpha(1.0f);
        ta.a aVar11 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar11);
        ((u5) aVar11).f33422w.setVisibility(8);
        ta.a aVar12 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar12);
        ((u5) aVar12).f33417r.setVisibility(8);
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        ((u5) aVar13).f33409i.setVisibility(8);
        ta.a aVar14 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar14);
        ((u5) aVar14).f33408h.setVisibility(8);
        ta.a aVar15 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar15);
        TextView textView = ((u5) aVar15).f33420u;
        textView.setVisibility(0);
        textView.setText(BuildConfig.VERSION_NAME);
        ta.a aVar16 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar16);
        TextView textView2 = ((u5) aVar16).E;
        sh.b bVar4 = this.N;
        if (bVar4 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        textView2.setText("+" + getString(R.string._s_xp, String.valueOf(bVar4.f51683e)));
        ta.a aVar17 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar17);
        ((u5) aVar17).C.setText("1:00");
        A();
        C();
    }

    public final void z() {
        ObjectAnimator objectAnimator = this.P;
        if (objectAnimator != null) {
            objectAnimator.setCurrentPlayTime(this.Q);
        }
        ObjectAnimator objectAnimator2 = this.P;
        if (objectAnimator2 != null) {
            objectAnimator2.addListener(new gi.g(this, 3));
        }
        ObjectAnimator objectAnimator3 = this.P;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
        sh.b bVar = this.N;
        if (bVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (bVar.f51685t && bVar.f51681c != 0 && !bVar.K.get()) {
            A();
        }
        sh.b bVar2 = this.N;
        if (bVar2 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        bVar2.f51685t = false;
        AtomicBoolean atomicBoolean = this.T;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            C();
        }
    }
}
