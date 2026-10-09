package qh;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.p0;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.lingo.fluent.object.WordSpellOption;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hj.e6;
import hj.x5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends ji.e {
    public th.e N;
    public xx.f O;
    public final ArrayList P;
    public final ArrayList Q;
    public ObjectAnimator R;
    public ObjectAnimator S;
    public sh.d T;
    public final qy.q U;

    public k0() {
        super(f0.f47757a, BuildConfig.VERSION_NAME);
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.U = com.bumptech.glide.d.v(new d0(this, 0));
    }

    public final void A() {
        sh.d dVar = this.T;
        if (dVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (dVar.N) {
            return;
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((x5) aVar).f33593d.setImageResource(R.drawable.ic_game_time);
        xx.f fVar = this.O;
        if (fVar != null) {
            ux.b.a(fVar);
        }
        ay.d0 d0VarD = qx.h.d(1L, 1L, TimeUnit.SECONDS, ky.e.f38936a);
        sh.d dVar2 = this.T;
        if (dVar2 != null) {
            this.O = d0VarD.l(dVar2.H).k(ky.e.f38937b).g(px.b.a()).h(new h0(this, 0), vx.b.f54316e);
        } else {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e9  */
    public final void B() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size;
        int i11;
        ArrayList arrayListC1;
        boolean z11;
        Object obj;
        int size2;
        int i12;
        PdWord pdWord;
        MutableLiveData mutableLiveDataA;
        PdWord pdWord2;
        sh.d dVar = this.T;
        if (dVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        ArrayList arrayList4 = dVar.f51698f;
        int i13 = 1;
        dVar.f51693a++;
        dVar.f51695c = new MutableLiveData();
        if (dVar.f51693a >= dVar.b().size()) {
            dVar.a().setValue(null);
            mutableLiveDataA = dVar.a();
        } else if (dVar.f51693a >= dVar.b().size()) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (!kotlin.jvm.internal.m.a(cf.x.n().accountType, "unlogin_user")) {
                FirebaseCrashlytics firebaseCrashlyticsA = FirebaseCrashlytics.a();
                String uid = cf.x.n().uid;
                kotlin.jvm.internal.m.e(uid, "uid");
                String strConcat = "Invalid state WordSpell ".concat(uid);
                CrashlyticsCore crashlyticsCore = firebaseCrashlyticsA.f18213a;
                crashlyticsCore.f18301o.f18376a.b(new com.google.firebase.crashlytics.internal.common.c(crashlyticsCore, System.currentTimeMillis() - crashlyticsCore.f18291d, strConcat));
            }
            dVar.a().setValue(null);
            mutableLiveDataA = dVar.a();
        } else {
            PdWord pdWord3 = (PdWord) dVar.b().get(dVar.f51693a);
            ArrayList arrayListH = th.j.h(pdWord3);
            if (arrayListH.size() > 4) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == 1 || cf.x.n().keyLanguage == 2) {
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    if (cf.x.n().keyLanguage == 2) {
                        arrayList = new ArrayList();
                        size2 = arrayListH.size();
                        i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayListH.get(i12);
                            i12++;
                            pdWord = (PdWord) obj2;
                            if (kotlin.jvm.internal.m.a(pdWord.getWord(), " ")) {
                                arrayList.add(pdWord);
                            } else {
                                arrayList.add(new PdWord());
                            }
                        }
                    } else {
                        arrayList = new ArrayList();
                    }
                    arrayList2 = arrayList;
                    arrayList3 = new ArrayList();
                    size = arrayListH.size();
                    i11 = 0;
                    while (i11 < size) {
                        obj = arrayListH.get(i11);
                        i11++;
                        if (!kotlin.jvm.internal.m.a(((PdWord) obj).getWord(), " ")) {
                            arrayList3.add(obj);
                        }
                    }
                    arrayListC1 = ry.m.c1(arrayList3);
                    z11 = true;
                } else {
                    int size3 = (int) (arrayListH.size() * 0.6f);
                    if (size3 > 10) {
                        size3 = 10;
                    }
                    arrayListC1 = new ArrayList();
                    arrayList2 = new ArrayList();
                    int iM = th.j.m(size3);
                    int size4 = arrayListH.size() - size3;
                    if (iM > 0) {
                        arrayListC1.addAll(arrayListH.subList(0, iM));
                        for (int i14 = 0; i14 < iM; i14++) {
                            arrayList2.add(new PdWord());
                        }
                        int size5 = arrayListC1.size();
                        for (int i15 = 0; i15 < size5; i15++) {
                            Object obj3 = arrayListC1.get(i15);
                            kotlin.jvm.internal.m.e(obj3, "get(...)");
                            if (kotlin.jvm.internal.m.a(((PdWord) obj3).getWord(), " ")) {
                                ((PdWord) arrayList2.get(i15)).setWord(" ");
                            }
                        }
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i16 = size4 + iM;
                    arrayList2.addAll(arrayListH.subList(iM, i16));
                    if (i16 < arrayListH.size()) {
                        arrayListC1.addAll(arrayListH.subList(i16, arrayListH.size()));
                        int size6 = arrayListH.size();
                        for (int i17 = i16; i17 < size6; i17++) {
                            arrayList2.add(new PdWord());
                        }
                        int size7 = arrayListH.subList(i16, arrayListH.size()).size();
                        for (int i18 = 0; i18 < size7; i18++) {
                            if (kotlin.jvm.internal.m.a(((PdWord) arrayListH.subList(i16, arrayListH.size()).get(i18)).getWord(), " ")) {
                                ((PdWord) arrayList2.get(i16 + i18)).setWord(" ");
                            }
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int size8 = arrayListC1.size();
                    int i19 = 0;
                    while (i19 < size8) {
                        Object obj4 = arrayListC1.get(i19);
                        i19++;
                        if (!kotlin.jvm.internal.m.a(((PdWord) obj4).getWord(), " ")) {
                            arrayList5.add(obj4);
                        }
                    }
                    arrayListC1.clear();
                    arrayListC1.addAll(arrayList5);
                }
            } else {
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == 2) {
                    arrayList = new ArrayList();
                    size2 = arrayListH.size();
                    i12 = 0;
                    while (i12 < size2) {
                        Object obj5 = arrayListH.get(i12);
                        i12++;
                        pdWord = (PdWord) obj5;
                        if (kotlin.jvm.internal.m.a(pdWord.getWord(), " ")) {
                            arrayList.add(new PdWord());
                        } else {
                            arrayList.add(pdWord);
                        }
                    }
                } else {
                    arrayList = new ArrayList();
                }
                arrayList2 = arrayList;
                arrayList3 = new ArrayList();
                size = arrayListH.size();
                i11 = 0;
                while (i11 < size) {
                    obj = arrayListH.get(i11);
                    i11++;
                    if (!kotlin.jvm.internal.m.a(((PdWord) obj).getWord(), " ")) {
                        arrayList3.add(obj);
                    }
                }
                arrayListC1 = ry.m.c1(arrayList3);
                z11 = true;
            }
            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
            int i21 = cf.x.n().keyLanguage == 0 ? 5 : 10;
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(dVar.b());
            while (arrayListC1.size() % i21 != 0 && !arrayList6.isEmpty()) {
                jz.d dVar2 = jz.e.f37397a;
                Object objI0 = ry.m.I0(arrayList6);
                while (true) {
                    pdWord2 = (PdWord) objI0;
                    if (!kotlin.jvm.internal.m.a(pdWord2.getFavId(), pdWord3.getFavId()) || arrayList6.size() <= i13) {
                        break;
                    }
                    jz.d dVar3 = jz.e.f37397a;
                    objI0 = ry.m.I0(arrayList6);
                }
                arrayList6.remove(pdWord2);
                ArrayList arrayListH2 = th.j.h(pdWord2);
                int size9 = arrayListH2.size();
                int i22 = 0;
                while (i22 < size9) {
                    Object obj6 = arrayListH2.get(i22);
                    i22++;
                    PdWord pdWord4 = (PdWord) obj6;
                    int size10 = arrayListC1.size();
                    sh.d dVar4 = dVar;
                    int i23 = 0;
                    boolean z12 = false;
                    while (i23 < size10) {
                        i23++;
                        size10 = size10;
                        if (kotlin.jvm.internal.m.a(((PdWord) arrayListC1.get(i23)).getWord(), pdWord4.getWord())) {
                            z12 = true;
                        }
                    }
                    if (!z12 && !kotlin.jvm.internal.m.a(pdWord4.getWord(), " ") && arrayListC1.size() % i21 != 0) {
                        if (!z11) {
                            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                            if (cf.x.n().keyLanguage == 6) {
                                String word = pdWord4.getWord();
                                kotlin.jvm.internal.m.e(word, "getWord(...)");
                                Locale locale = Locale.getDefault();
                                kotlin.jvm.internal.m.e(locale, "getDefault(...)");
                                String lowerCase = word.toLowerCase(locale);
                                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                pdWord4.setWord(lowerCase);
                            }
                        }
                        arrayListC1.add(pdWord4);
                        z11 = z11;
                    }
                    dVar = dVar4;
                    i13 = 1;
                }
            }
            sh.d dVar5 = dVar;
            pdWord3.getWord();
            arrayList2.size();
            dVar5.a().setValue(new WordSpellOption(pdWord3, arrayList2, arrayListC1, arrayListH));
            if (!arrayList4.contains(pdWord3)) {
                arrayList4.add(pdWord3);
            }
            mutableLiveDataA = dVar5.a();
        }
        mutableLiveDataA.observe(getViewLifecycleOwner(), new ci.c(this, 7));
    }

    public final void C() {
        E();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((x5) aVar).f33597h.setVisibility(8);
        th.e eVar = this.N;
        if (eVar == null) {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
        eVar.k(R.raw.message_b_accept);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((x5) aVar2).f33601l.setVisibility(8);
        x().f32541f.setBackgroundResource(0);
        x().f32538c.setEnabled(false);
        x().f32537b.setEnabled(false);
        x().f32538c.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        x().f32537b.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        x().f32543h.setText(BuildConfig.VERSION_NAME);
        x().f32539d.removeAllViews();
        x().f32540e.removeAllViews();
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((x5) aVar3).f33603o.beginTaller();
        Iterator it = this.P.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            ViewPropertyAnimator viewPropertyAnimatorAnimate = ((ImageView) next).animate();
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            float height = ((x5) aVar4).f33600k.getHeight();
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            float fZ = height - j3.Z(220, contextRequireContext);
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
            viewPropertyAnimatorAnimate.translationYBy(-(fZ - j3.Z(140, contextRequireContext2))).setDuration(2000L).setInterpolator(new LinearInterpolator()).start();
        }
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = ((x5) aVar5).f33594e.animate();
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        float height2 = ((x5) aVar6).f33600k.getHeight();
        Context contextRequireContext3 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
        float fZ2 = height2 - j3.Z(220, contextRequireContext3);
        Context contextRequireContext4 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
        viewPropertyAnimatorAnimate2.translationYBy(-(fZ2 - j3.Z(140, contextRequireContext4))).setDuration(2000L).setStartDelay(400L).setInterpolator(new LinearInterpolator()).start();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dy.j jVar = ky.e.f38937b;
        ay.p pVarG = qx.h.m(400L, timeUnit, jVar).g(px.b.a());
        i0 i0Var = new i0(this, 0);
        re.q qVar = vx.b.f54316e;
        xx.f fVarH = pVarG.h(i0Var, qVar);
        n9.q qVar2 = this.f36401t;
        th.j.a(fVarH, qVar2);
        th.j.a(qx.h.m(2000L, timeUnit, jVar).g(px.b.a()).h(new j0(this, 0), qVar), qVar2);
        th.j.a(qx.h.m(4400L, timeUnit, jVar).g(px.b.a()).h(new lp.j(this, 12), qVar), qVar2);
    }

    public final void D() {
        sh.d dVar = this.T;
        if (dVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        dVar.M = true;
        E();
        th.e eVar = this.N;
        if (eVar != null) {
            eVar.g();
        } else {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
    }

    public final void E() {
        sh.d dVar = this.T;
        if (dVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (dVar.N) {
            return;
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((x5) aVar).f33593d.setImageResource(R.drawable.ic_game_time_pause);
        xx.f fVar = this.O;
        if (fVar == null || fVar.b()) {
            return;
        }
        sh.d dVar2 = this.T;
        if (dVar2 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        dVar2.H = dVar2.f51699t;
        ux.b.a(fVar);
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        if (((x5) aVar).f33600k.findViewById(R.id.ll_resume) == null) {
            z();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        D();
    }

    @Override // ji.e
    public final void q() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((x5) aVar).f33603o.stop();
        E();
        th.e eVar = this.N;
        if (eVar != null) {
            eVar.b();
        } else {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) throws Exception {
        sh.d dVar;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        this.N = new th.e(contextRequireContext);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        bq.z.b(((x5) aVar).f33596g, new e0(this, 0));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((x5) aVar2).m.setText("1:30");
        p0 activity = getActivity();
        if (activity == null || (dVar = (sh.d) new ViewModelProvider(activity).get(sh.d.class)) == null) {
            throw new Exception("Invalid Activity!");
        }
        this.T = dVar;
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new mv.f0(this, null, 9), 3);
    }

    public final e6 x() {
        return (e6) this.U.getValue();
    }

    public final void y() {
        sh.d dVar = this.T;
        if (dVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (dVar.N) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((x5) aVar).f33591b.setVisibility(8);
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((x5) aVar2).f33593d.setVisibility(8);
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((x5) aVar3).m.setVisibility(8);
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((x5) aVar4).f33598i.setVisibility(0);
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ProgressBar progressBar = ((x5) aVar5).f33598i;
            sh.d dVar2 = this.T;
            if (dVar2 == null) {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
            progressBar.setMax(dVar2.b().size());
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ((x5) aVar6).f33598i.setProgress(0);
        } else {
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((x5) aVar7).f33591b.setVisibility(8);
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            ((x5) aVar8).f33598i.setVisibility(8);
        }
        sh.d dVar3 = this.T;
        if (dVar3 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        dVar3.c();
        ArrayList arrayList = this.Q;
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            ObjectAnimator objectAnimator = (ObjectAnimator) next;
            objectAnimator.removeAllUpdateListeners();
            objectAnimator.cancel();
        }
        ArrayList arrayList2 = this.P;
        Iterator it2 = arrayList2.iterator();
        kotlin.jvm.internal.m.e(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next2 = it2.next();
            kotlin.jvm.internal.m.e(next2, "next(...)");
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            ((x5) aVar9).f33600k.removeView((ImageView) next2);
        }
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        ((x5) aVar10).f33597h.setVisibility(0);
        ta.a aVar11 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar11);
        TextView textView = ((x5) aVar11).f33602n;
        sh.d dVar4 = this.T;
        if (dVar4 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        textView.setText("+" + getString(R.string._s_xp, String.valueOf(dVar4.K)));
        ta.a aVar12 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar12);
        ((x5) aVar12).m.setText("1:30");
        A();
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        ((x5) aVar13).f33603o.beginSmaller();
        arrayList.clear();
        ta.a aVar14 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar14);
        ImageView imageView = ((x5) aVar14).f33595f;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        imageView.setTranslationX(j3.Z(-291, contextRequireContext));
        ta.a aVar15 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar15);
        ImageView imageView2 = ((x5) aVar15).f33594e;
        imageView2.setImageResource(R.drawable.ic_game_word_spell_moution);
        imageView2.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
        ta.a aVar16 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar16);
        ImageView imageView3 = ((x5) aVar16).f33592c;
        imageView3.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
        imageView3.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
        arrayList2.clear();
        ObjectAnimator objectAnimator2 = this.R;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
        ObjectAnimator objectAnimator3 = this.S;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        ObjectAnimator objectAnimator4 = this.S;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
        B();
    }

    public final void z() {
        sh.d dVar = this.T;
        if (dVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (dVar.M && dVar.f51699t != 0 && !dVar.f51697e.get()) {
            A();
        }
        sh.d dVar2 = this.T;
        if (dVar2 != null) {
            dVar2.M = false;
        } else {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
    }
}
