package qh;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.p0;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bt.e1;
import bt.n1;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.lingo.fluent.object.WordOptions;
import com.lingo.fluent.ui.game.adapter.WordListenGameFinishAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fr.o0;
import hj.w5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends ji.e {
    public th.e N;
    public final ArrayList O;
    public ObjectAnimator P;
    public long Q;
    public final int R;
    public sh.c S;
    public final ArrayList T;

    public c0() {
        super(y.f47794a, BuildConfig.VERSION_NAME);
        this.O = new ArrayList();
        this.R = 10;
        this.T = new ArrayList();
    }

    public static final void x(c0 c0Var, boolean z11) {
        th.j.a(qx.h.m(z11 ? 1000L : 0L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.j(c0Var, 11), vx.b.f54316e), c0Var.f36401t);
    }

    public final void A() {
        sh.c cVar = this.S;
        if (cVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        cVar.f51691f = true;
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
        th.e eVar = this.N;
        if (eVar == null) {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
        eVar.g();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((w5) aVar).f33525b.stop();
    }

    public final void B() {
        sh.c cVar = this.S;
        if (cVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        cVar.f51691f = false;
        ObjectAnimator objectAnimator = this.P;
        if (objectAnimator != null) {
            objectAnimator.setCurrentPlayTime(this.Q);
        }
        ObjectAnimator objectAnimator2 = this.P;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
        ObjectAnimator objectAnimator3 = this.P;
        if (objectAnimator3 != null) {
            objectAnimator3.addListener(new gi.g(this, 4));
        }
        th.e eVar = this.N;
        if (eVar == null) {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
        if (eVar.l()) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((w5) aVar).f33525b.start();
        }
        sh.c cVar2 = this.S;
        if (cVar2 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        boolean z11 = cVar2.f51692t;
        int i11 = this.R;
        if (z11) {
            cVar2.f51692t = false;
            if (cVar2.f51690e == i11) {
                C(true);
            } else {
                D();
            }
        }
        sh.c cVar3 = this.S;
        if (cVar3 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (cVar3.H) {
            cVar3.H = false;
            th.e eVar2 = this.N;
            if (eVar2 == null) {
                kotlin.jvm.internal.m.n("player");
                throw null;
            }
            eVar2.h(cVar3.a());
        }
        sh.c cVar4 = this.S;
        if (cVar4 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (cVar4.K) {
            cVar4.K = false;
            y(cVar4.f51690e == i11);
        }
        sh.c cVar5 = this.S;
        if (cVar5 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (cVar5.L) {
            cVar5.L = false;
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((w5) aVar2).f33525b.stop();
            sh.c cVar6 = this.S;
            if (cVar6 != null) {
                E(cVar6.b());
            } else {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
        }
    }

    public final void C(boolean z11) {
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((View) obj).setVisibility(4);
        }
        Iterator it = this.T.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            ((LinearLayout) next).setVisibility(8);
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((w5) aVar).f33543u.setScaleY(CropImageView.DEFAULT_ASPECT_RATIO);
        th.e eVar = this.N;
        if (eVar == null) {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
        eVar.a();
        n9.q qVar = this.f36401t;
        re.q qVar2 = vx.b.f54316e;
        long j11 = 300;
        if (z11) {
            th.e eVar2 = this.N;
            if (eVar2 == null) {
                kotlin.jvm.internal.m.n("player");
                throw null;
            }
            eVar2.k(R.raw.win_sound_3);
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            RelativeLayout relativeLayout = ((w5) aVar2).f33539q.f32472c;
            relativeLayout.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            relativeLayout.setVisibility(0);
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((w5) aVar3).f33528e.setImageResource(R.drawable.ic_game_word_listen_btm_light);
            ArrayList arrayList2 = new ArrayList();
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            int childCount = ((w5) aVar4).f33539q.f32472c.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                ta.a aVar5 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                View childAt = ((w5) aVar5).f33539q.f32472c.getChildAt(i12);
                childAt.setScaleX(CropImageView.DEFAULT_ASPECT_RATIO);
                childAt.setScaleY(CropImageView.DEFAULT_ASPECT_RATIO);
                childAt.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                arrayList2.add(childAt);
            }
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            w0 w0VarB = s0.b(((w5) aVar6).f33539q.f32472c);
            w0VarB.a(1.0f);
            w0VarB.e(300L);
            w0VarB.i();
            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ke.b(arrayList2), qVar2), qVar);
            j11 = 4000;
        } else {
            th.e eVar3 = this.N;
            if (eVar3 == null) {
                kotlin.jvm.internal.m.n("player");
                throw null;
            }
            eVar3.k(R.raw.start_sounds_008);
        }
        th.j.a(qx.h.m(j11, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new a0(this, z11, 0), qVar2), qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        PdWord pdWord;
        PdWord pdWord2;
        sh.c cVar = this.S;
        if (cVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        ArrayList arrayList = cVar.f51687b;
        cVar.f51686a++;
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (cVar.f51686a >= cVar.c().size()) {
            mutableLiveData.setValue(null);
        } else if (cVar.f51686a >= cVar.c().size()) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (!kotlin.jvm.internal.m.a(cf.x.n().accountType, "unlogin_user")) {
                FirebaseCrashlytics firebaseCrashlyticsA = FirebaseCrashlytics.a();
                String uid = cf.x.n().uid;
                kotlin.jvm.internal.m.e(uid, "uid");
                String strConcat = "Invalid state WordListen ".concat(uid);
                CrashlyticsCore crashlyticsCore = firebaseCrashlyticsA.f18213a;
                crashlyticsCore.f18301o.f18376a.b(new com.google.firebase.crashlytics.internal.common.c(crashlyticsCore, System.currentTimeMillis() - crashlyticsCore.f18291d, strConcat));
            }
            mutableLiveData.setValue(null);
        } else {
            PdWord pdWord3 = (PdWord) cVar.c().get(cVar.f51686a);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(pdWord3);
            List listC = cVar.c();
            jz.d dVar = jz.e.f37397a;
            Object objI0 = ry.m.I0(listC);
            while (true) {
                pdWord = (PdWord) objI0;
                if (!arrayList2.contains(pdWord) && !kotlin.jvm.internal.m.a(pdWord3.getShowTrans(), pdWord.getShowTrans()) && !kotlin.jvm.internal.m.a(pdWord3.getShowWord(), pdWord.getShowWord())) {
                    break;
                }
                List listC2 = cVar.c();
                jz.d dVar2 = jz.e.f37397a;
                objI0 = ry.m.I0(listC2);
            }
            arrayList2.add(pdWord);
            List listC3 = cVar.c();
            jz.d dVar3 = jz.e.f37397a;
            Object objI1 = ry.m.I0(listC3);
            while (true) {
                pdWord2 = (PdWord) objI1;
                if (!arrayList2.contains(pdWord2) && !kotlin.jvm.internal.m.a(pdWord3.getShowTrans(), pdWord2.getShowTrans()) && !kotlin.jvm.internal.m.a(pdWord3.getShowWord(), pdWord.getShowWord())) {
                    break;
                }
                List listC4 = cVar.c();
                jz.d dVar4 = jz.e.f37397a;
                objI1 = ry.m.I0(listC4);
            }
            arrayList2.add(pdWord2);
            Collections.shuffle(arrayList2);
            mutableLiveData.setValue(new WordOptions(pdWord3, arrayList2));
            WordOptions wordOptions = (WordOptions) mutableLiveData.getValue();
            if (wordOptions != null) {
                cVar.M = wordOptions;
            }
            if (!arrayList.contains(pdWord3)) {
                arrayList.add(pdWord3);
            }
        }
        mutableLiveData.observe(getViewLifecycleOwner(), new ci.c(this, 6));
    }

    public final void E(WordOptions wordOptions) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        int i11 = 8;
        ((w5) aVar).f33535l.setVisibility(8);
        int size = wordOptions.getOptions().size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = this.T.get(i12);
            kotlin.jvm.internal.m.e(obj, "get(...)");
            LinearLayout linearLayout = (LinearLayout) obj;
            PdWord pdWord = wordOptions.getOptions().get(i12);
            kotlin.jvm.internal.m.e(pdWord, "get(...)");
            PdWord pdWord2 = pdWord;
            linearLayout.setEnabled(true);
            linearLayout.setVisibility(0);
            linearLayout.setAlpha(1.0f);
            linearLayout.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
            linearLayout.setBackgroundResource(R.drawable.bg_game_word_listen_option_normal);
            int[] iArr = bq.r.f4959a;
            if (bq.m.F()) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == 0 && ((o0) s()).t() == 0) {
                    ((TextView) linearLayout.findViewById(R.id.tv_zhuyin)).setText(pdWord2.getShowLuoma());
                } else {
                    ((TextView) linearLayout.findViewById(R.id.tv_zhuyin)).setText(pdWord2.getShowZhuyin());
                }
                ((TextView) linearLayout.findViewById(R.id.tv_zhuyin)).setVisibility(8);
            }
            ((TextView) linearLayout.findViewById(R.id.tv_word)).setText(pdWord2.getDetailWord());
            ((TextView) linearLayout.findViewById(R.id.tv_word)).setVisibility(8);
            ((TextView) linearLayout.findViewById(R.id.tv_trans)).setText(pdWord2.getShowTrans());
            ((TextView) linearLayout.findViewById(R.id.tv_trans)).setVisibility(0);
            linearLayout.setTag(pdWord2);
            bq.z.b(linearLayout, new n1(this, linearLayout, kotlin.jvm.internal.m.a(pdWord2.getFavId(), wordOptions.getWord().getFavId()), i11));
        }
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(((w5) aVar2).f33543u, "scaleY", 1.0f, CropImageView.DEFAULT_ASPECT_RATIO).setDuration(3000L);
        duration.setInterpolator(new AccelerateInterpolator());
        duration.start();
        this.P = duration;
        duration.addListener(new gi.g(this, 4));
    }

    public final void F(LinearLayout linearLayout, boolean z11, boolean z12) {
        int i11;
        String str;
        re.q qVar;
        kotlin.jvm.internal.y yVar;
        String str2;
        float f5;
        String str3;
        LinearLayout linearLayout2 = linearLayout;
        Integer numValueOf = Integer.valueOf(AchievementLevelType.DAY_STREAK_LV_8);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        sh.c cVar = this.S;
        if (cVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        boolean z13 = true;
        if (cVar.O) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ProgressBar progressBar = ((w5) aVar2).f33538p;
            sh.c cVar2 = this.S;
            if (cVar2 == null) {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
            progressBar.setProgress(cVar2.f51686a + 1);
        }
        kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
        yVar2.f38361a = linearLayout2;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.T.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (true) {
            boolean z14 = false;
            if (!it.hasNext()) {
                String str4 = "requireContext(...)";
                re.q qVar2 = vx.b.f54316e;
                if (z11) {
                    numValueOf = numValueOf;
                    i11 = 2;
                    str = "requireContext(...)";
                    sh.c cVar3 = this.S;
                    if (cVar3 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    cVar3.f51688c++;
                    cVar3.f51690e++;
                    Long wordId = cVar3.b().getWord().getWordId();
                    kotlin.jvm.internal.m.e(wordId, "getWordId(...)");
                    qVar = qVar2;
                    th.j.a(new ay.x(new gh.a(wordId.longValue(), z13)).k(ky.e.f38937b).g(px.b.a()).h(sh.a.f51674d, qVar), cVar3.P);
                    Iterator it2 = cVar3.f51687b.iterator();
                    kotlin.jvm.internal.m.e(it2, "iterator(...)");
                    while (it2.hasNext()) {
                        PdWord pdWord = (PdWord) it2.next();
                        if (kotlin.jvm.internal.m.a(pdWord.getFavId(), cVar3.b().getWord().getFavId())) {
                            pdWord.setFinishSortIndex(1L);
                        }
                    }
                    yVar = yVar2;
                    ((LinearLayout) yVar.f38361a).setBackgroundResource(R.drawable.bg_game_word_listen_option_correct);
                    Iterator it3 = arrayList.iterator();
                    kotlin.jvm.internal.m.e(it3, "iterator(...)");
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        kotlin.jvm.internal.m.e(next, "next(...)");
                        ((LinearLayout) next).setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                } else {
                    i11 = 2;
                    sh.c cVar4 = this.S;
                    if (cVar4 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    cVar4.f51689d++;
                    Long wordId2 = cVar4.b().getWord().getWordId();
                    kotlin.jvm.internal.m.e(wordId2, "getWordId(...)");
                    th.j.a(new ay.x(new gh.a(wordId2.longValue(), z14)).k(ky.e.f38937b).g(px.b.a()).h(sh.a.f51675e, qVar2), cVar4.P);
                    Iterator it4 = cVar4.f51687b.iterator();
                    kotlin.jvm.internal.m.e(it4, "iterator(...)");
                    while (true) {
                        str2 = str4;
                        if (!it4.hasNext()) {
                            break;
                        }
                        PdWord pdWord2 = (PdWord) it4.next();
                        if (kotlin.jvm.internal.m.a(pdWord2.getFavId(), cVar4.b().getWord().getFavId())) {
                            pdWord2.setFinishSortIndex(0L);
                        }
                        str4 = str2;
                    }
                    ta.a aVar3 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((w5) aVar3).f33527d.removeOneLife();
                    if (z12) {
                        str = str2;
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        str3 = "next(...)";
                    } else {
                        if (!z11) {
                            linearLayout2.setBackgroundResource(R.drawable.bg_game_word_listen_option_wrong);
                        }
                        if (z12) {
                            w0 w0VarB = s0.b(linearLayout2);
                            Context contextRequireContext = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext, str2);
                            w0VarB.m(j3.Z(200, contextRequireContext));
                            w0VarB.a(CropImageView.DEFAULT_ASPECT_RATIO);
                            w0VarB.e(300L);
                            w0VarB.i();
                            str3 = "next(...)";
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                            str = str2;
                        } else {
                            Paint paint = new Paint();
                            Context contextRequireContext2 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext2, str2);
                            paint.setColor(contextRequireContext2.getColor(R.color.color_primary));
                            int width = linearLayout2.getWidth();
                            int height = linearLayout2.getHeight();
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
                            kotlin.jvm.internal.m.e(bitmapCreateBitmap, "createBitmap(...)");
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            RectF rectF = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                            Path path = new Path();
                            Context contextRequireContext3 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext3, str2);
                            float fZ = j3.Z(4, contextRequireContext3);
                            Context contextRequireContext4 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext4, str2);
                            path.addRoundRect(rectF, fZ, j3.Z(4, contextRequireContext4), Path.Direction.CW);
                            canvas.clipPath(path);
                            canvas.drawRect(rectF, paint);
                            linearLayout2.draw(canvas);
                            int width2 = bitmapCreateBitmap.getWidth() / 2;
                            Context contextRequireContext5 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext5, str2);
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width2 + ((int) j3.Z(16, contextRequireContext5)), bitmapCreateBitmap.getHeight(), config);
                            kotlin.jvm.internal.m.e(bitmapCreateBitmap2, "createBitmap(...)");
                            int width3 = bitmapCreateBitmap.getWidth() / 2;
                            Context contextRequireContext6 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext6, str2);
                            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(width3 + ((int) j3.Z(16, contextRequireContext6)), bitmapCreateBitmap.getHeight(), config);
                            kotlin.jvm.internal.m.e(bitmapCreateBitmap3, "createBitmap(...)");
                            int width4 = bitmapCreateBitmap.getWidth() / 2;
                            Context contextRequireContext7 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext7, str2);
                            Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, width4 + ((int) j3.Z(16, contextRequireContext7)), bitmapCreateBitmap.getHeight());
                            kotlin.jvm.internal.m.e(bitmapCreateBitmap4, "createBitmap(...)");
                            int width5 = bitmapCreateBitmap.getWidth() / 2;
                            Context contextRequireContext8 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext8, str2);
                            int iZ = width5 - ((int) j3.Z(16, contextRequireContext8));
                            int width6 = bitmapCreateBitmap.getWidth() / 2;
                            Context contextRequireContext9 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext9, str2);
                            Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(bitmapCreateBitmap, iZ, 0, width6 + ((int) j3.Z(16, contextRequireContext9)), bitmapCreateBitmap.getHeight());
                            kotlin.jvm.internal.m.e(bitmapCreateBitmap5, "createBitmap(...)");
                            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                            path.reset();
                            path.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                            float width7 = bitmapCreateBitmap.getWidth() / 2.0f;
                            Context contextRequireContext10 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext10, str2);
                            path.lineTo(width7 - j3.Z(16, contextRequireContext10), CropImageView.DEFAULT_ASPECT_RATIO);
                            float width8 = bitmapCreateBitmap.getWidth() / 2.0f;
                            float height2 = bitmapCreateBitmap.getHeight() / 8.0f;
                            float width9 = bitmapCreateBitmap.getWidth() / 2.0f;
                            Context contextRequireContext11 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext11, str2);
                            path.quadTo(width8, height2, width9 - j3.Z(16, contextRequireContext11), (bitmapCreateBitmap.getHeight() * 2) / 8.0f);
                            float width10 = bitmapCreateBitmap.getWidth() / 2.0f;
                            float height3 = (bitmapCreateBitmap.getHeight() * 3) / 8.0f;
                            float width11 = bitmapCreateBitmap.getWidth() / 2.0f;
                            Context contextRequireContext12 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext12, str2);
                            path.quadTo(width10, height3, width11 - j3.Z(16, contextRequireContext12), (bitmapCreateBitmap.getHeight() * 4) / 8.0f);
                            float width12 = bitmapCreateBitmap.getWidth() / 2.0f;
                            float height4 = (bitmapCreateBitmap.getHeight() * 5) / 8.0f;
                            float width13 = bitmapCreateBitmap.getWidth() / 2.0f;
                            Context contextRequireContext13 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext13, str2);
                            path.quadTo(width12, height4, width13 - j3.Z(16, contextRequireContext13), (bitmapCreateBitmap.getHeight() * 6) / 8.0f);
                            float width14 = bitmapCreateBitmap.getWidth() / 2.0f;
                            float height5 = (bitmapCreateBitmap.getHeight() * 7) / 8.0f;
                            float width15 = bitmapCreateBitmap.getWidth() / 2.0f;
                            Context contextRequireContext14 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext14, str2);
                            path.quadTo(width14, height5, width15 - j3.Z(16, contextRequireContext14), (bitmapCreateBitmap.getHeight() * 8) / 8.0f);
                            path.lineTo(CropImageView.DEFAULT_ASPECT_RATIO, bitmapCreateBitmap.getHeight());
                            path.lineTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                            path.close();
                            canvas2.clipPath(path);
                            canvas2.drawBitmap(bitmapCreateBitmap4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, paint);
                            Canvas canvas3 = new Canvas(bitmapCreateBitmap3);
                            path.reset();
                            path.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                            Context contextRequireContext15 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext15, str2);
                            path.quadTo(j3.Z(8, contextRequireContext15), bitmapCreateBitmap.getHeight() / 8.0f, CropImageView.DEFAULT_ASPECT_RATIO, (bitmapCreateBitmap.getHeight() * 2) / 8.0f);
                            Context contextRequireContext16 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext16, str2);
                            path.quadTo(j3.Z(8, contextRequireContext16), (bitmapCreateBitmap.getHeight() * 3) / 8.0f, CropImageView.DEFAULT_ASPECT_RATIO, (bitmapCreateBitmap.getHeight() * 4) / 8.0f);
                            Context contextRequireContext17 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext17, str2);
                            path.quadTo(j3.Z(8, contextRequireContext17), (bitmapCreateBitmap.getHeight() * 5) / 8.0f, CropImageView.DEFAULT_ASPECT_RATIO, (bitmapCreateBitmap.getHeight() * 6) / 8.0f);
                            Context contextRequireContext18 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext18, str2);
                            path.quadTo(j3.Z(8, contextRequireContext18), (bitmapCreateBitmap.getHeight() * 7) / 8.0f, CropImageView.DEFAULT_ASPECT_RATIO, (bitmapCreateBitmap.getHeight() * 8) / 8.0f);
                            float width16 = bitmapCreateBitmap.getWidth() / 2.0f;
                            Context contextRequireContext19 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext19, str2);
                            path.lineTo(j3.Z(16, contextRequireContext19) + width16, bitmapCreateBitmap.getHeight());
                            float width17 = bitmapCreateBitmap.getWidth() / 2.0f;
                            Context contextRequireContext20 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext20, str2);
                            float fZ2 = j3.Z(16, contextRequireContext20) + width17;
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                            path.lineTo(fZ2, CropImageView.DEFAULT_ASPECT_RATIO);
                            path.lineTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                            path.close();
                            canvas3.clipPath(path);
                            canvas3.drawBitmap(bitmapCreateBitmap5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, paint);
                            ImageView imageView = new ImageView(requireContext());
                            imageView.setImageBitmap(bitmapCreateBitmap2);
                            ImageView imageView2 = new ImageView(requireContext());
                            imageView2.setImageBitmap(bitmapCreateBitmap3);
                            ta.a aVar4 = this.f36400f;
                            kotlin.jvm.internal.m.c(aVar4);
                            ((w5) aVar4).f33540r.addView(imageView);
                            ta.a aVar5 = this.f36400f;
                            kotlin.jvm.internal.m.c(aVar5);
                            ((w5) aVar5).f33540r.addView(imageView2);
                            imageView.setX(linearLayout.getX());
                            imageView.setY(linearLayout.getY());
                            imageView2.setX(linearLayout.getX() + (linearLayout.getWidth() / 2));
                            imageView2.setY(linearLayout.getY());
                            str = str2;
                            str3 = "next(...)";
                            linearLayout2 = linearLayout;
                            imageView.postDelayed(new b2.c(4, imageView, new e1(imageView, this, imageView2, linearLayout2, bitmapCreateBitmap4, bitmapCreateBitmap5, bitmapCreateBitmap)), 0L);
                        }
                    }
                    Iterator it5 = arrayList.iterator();
                    kotlin.jvm.internal.m.e(it5, "iterator(...)");
                    while (it5.hasNext()) {
                        Object next2 = it5.next();
                        kotlin.jvm.internal.m.e(next2, str3);
                        LinearLayout linearLayout3 = (LinearLayout) next2;
                        if (!linearLayout3.equals(linearLayout2)) {
                            linearLayout3.setAlpha(f5);
                        }
                    }
                    qVar = qVar2;
                    yVar = yVar2;
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dy.j jVar = ky.e.f38937b;
                xx.f fVarH = qx.h.m(300L, timeUnit, jVar).g(px.b.a()).h(new ob.e(29, this, yVar), b0.f47744b);
                n9.q qVar3 = this.f36401t;
                th.j.a(fVarH, qVar3);
                Context contextRequireContext21 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext21, str);
                float f11 = contextRequireContext21.getResources().getDisplayMetrics().heightPixels;
                Context contextRequireContext22 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext22, str);
                Integer num = numValueOf;
                float fZ3 = (f11 - j3.Z(num, contextRequireContext22)) / i11;
                Context contextRequireContext23 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext23, str);
                float fZ4 = ((j3.Z(num, contextRequireContext23) + fZ3) - ((LinearLayout) yVar.f38361a).getY()) - (((LinearLayout) yVar.f38361a).getHeight() * 2.5f);
                w0 w0VarB2 = s0.b((View) yVar.f38361a);
                w0VarB2.m(fZ4);
                w0VarB2.h(300L);
                w0VarB2.e(300L);
                w0VarB2.i();
                th.e eVar = this.N;
                if (eVar == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                eVar.f52416c = new a0(this, z11, 1);
                sh.c cVar5 = this.S;
                if (cVar5 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (cVar5.f51691f) {
                    cVar5.H = true;
                } else if (z11) {
                    if (eVar == null) {
                        kotlin.jvm.internal.m.n("player");
                        throw null;
                    }
                    eVar.k(R.raw.sound_1);
                } else if (z12) {
                    th.j.a(qx.h.m(2000L, timeUnit, jVar).g(px.b.a()).h(new a0(this, z11, 2), qVar), qVar3);
                } else {
                    th.j.a(qx.h.m(2000L, timeUnit, jVar).g(px.b.a()).h(new a0(this, z11, 3), qVar), qVar3);
                }
                th.j.a(qx.h.m(700L, timeUnit, jVar).g(px.b.a()).h(new ie.o(z11, this, yVar, 8), b0.f47745c), qVar3);
                return;
            }
            Object next3 = it.next();
            kotlin.jvm.internal.m.e(next3, "next(...)");
            LinearLayout linearLayout4 = (LinearLayout) next3;
            Object tag = linearLayout4.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
            String favId = ((PdWord) tag).getFavId();
            sh.c cVar6 = this.S;
            if (cVar6 == null) {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
            if (kotlin.jvm.internal.m.a(favId, cVar6.b().getWord().getFavId())) {
                yVar2.f38361a = linearLayout4;
            } else {
                arrayList.add(linearLayout4);
            }
            linearLayout4.setEnabled(false);
        }
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        if (((w5) aVar).f33540r.findViewById(R.id.ll_resume) == null) {
            B();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        A();
    }

    @Override // ji.e
    public final void q() {
        th.e eVar = this.N;
        if (eVar == null) {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
        eVar.b();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((w5) aVar).f33525b.stop();
        z();
        th.e eVar2 = this.N;
        if (eVar2 != null) {
            eVar2.b();
        } else {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        sh.c cVar;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        this.N = new th.e(contextRequireContext);
        p0 activity = getActivity();
        if (activity == null || (cVar = (sh.c) new ViewModelProvider(activity).get(sh.c.class)) == null) {
            throw new IllegalArgumentException("Invalid Activity!");
        }
        this.S = cVar;
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new mv.f0(this, null, 8), 3);
    }

    public final void y(boolean z11) {
        String str;
        t().c("jxz_fl_review_game_finish", new ns.d(22));
        bq.f fVar = new bq.f(getContext());
        py.a aVar = (py.a) fVar.f4946d;
        aVar.f47209c = 15;
        aVar.f47210d = 2;
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        fVar.l(((w5) aVar2).f33540r);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        int i11 = 0;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.include_word_listen_game_finish_list, (ViewGroup) ((w5) aVar3).f33540r, false);
        ((TextView) viewInflate.findViewById(R.id.tv_finish_title)).setText(getString(R.string.retention));
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_xp);
        sh.c cVar = this.S;
        if (cVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        textView.setText("+" + getString(R.string._s_xp, String.valueOf(cVar.f51688c)));
        int i12 = 1;
        if (z11) {
            int iN = th.j.n(1, 5);
            sh.c cVar2 = this.S;
            if (cVar2 == null) {
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            }
            int i13 = cVar2.f51689d;
            if (i13 == 0 || i13 == 1) {
                str = "star_five_prompt_";
            } else {
                str = i13 != 2 ? "star_three_prompt_" : "star_four_prompt_";
            }
            ((TextView) viewInflate.findViewById(R.id.tv_title)).setText(getString(getResources().getIdentifier(str + iN, "string", requireActivity().getPackageName())));
        } else {
            ((TextView) viewInflate.findViewById(R.id.tv_title)).setText(getString(R.string.oops));
        }
        if (this.S == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        ((LinearLayout) viewInflate.findViewById(R.id.ll_xp_level)).setVisibility(0);
        ((TextView) viewInflate.findViewById(R.id.tv_level)).setVisibility(8);
        View viewFindViewById = viewInflate.findViewById(R.id.btn_keep_going);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        bq.z.b(viewFindViewById, new w(this, i11));
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler_view);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        sh.c cVar3 = this.S;
        if (cVar3 == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        ArrayList arrayList = cVar3.f51687b;
        th.e eVar = this.N;
        if (eVar == null) {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
        recyclerView.setAdapter(new WordListenGameFinishAdapter(arrayList, eVar));
        recyclerView.addItemDecoration(new c(this, i12));
        viewInflate.setVisibility(4);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        viewInflate.setTranslationY(contextRequireContext.getResources().getDisplayMetrics().heightPixels);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((w5) aVar4).f33540r.addView(viewInflate);
        viewInflate.setVisibility(0);
        w0 w0VarB = s0.b(viewInflate);
        w0VarB.l(CropImageView.DEFAULT_ASPECT_RATIO);
        w0VarB.e(300L);
        w0VarB.i();
    }

    public final void z() {
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
}
