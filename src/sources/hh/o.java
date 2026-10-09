package hh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.api.Service;
import com.lingo.fluent.ui.base.PdGrammarActivity;
import com.lingo.fluent.ui.base.PdVocabularyActivity;
import com.lingo.fluent.ui.compose.PdFeedStarredActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.billing.SubscriptionHelpActivity;
import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingo.lingoskill.japanskill.ui.syllable.JPSyllableIntroIndexActivity;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.lingoskill.ui.handwrite.HandWriteGroupActivity;
import com.lingo.lingoskill.ui.handwrite.HandWriteSearchActivity;
import com.lingo.lingoskill.ui.learn.BaseSmartTipsActivity;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hj.j4;
import hj.k4;
import hj.m6;
import hj.n4;
import java.io.File;
import java.util.List;
import km.f2;
import km.j2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32272b;

    public /* synthetic */ o(Object obj, int i11) {
        this.f32271a = i11;
        this.f32272b = obj;
    }

    @Override // fz.a
    public final Object invoke() {
        la.g gVar;
        int i11 = this.f32271a;
        int i12 = 0;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj = this.f32272b;
        switch (i11) {
            case 0:
                PdGrammarActivity pdGrammarActivity = (PdGrammarActivity) obj;
                ((hj.j0) pdGrammarActivity.j()).f32745i.setCurrentItem(pdGrammarActivity.U, true);
                return b0Var;
            case 1:
                j0 j0Var = (j0) obj;
                while (j0Var.P.isEmpty()) {
                    ta.a aVar = j0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    int childCount = ((j4) aVar).f32774k.getChildCount();
                    PdLesson pdLesson = j0Var.O;
                    if (pdLesson == null) {
                        kotlin.jvm.internal.m.n("pdLesson");
                        throw null;
                    }
                    if (childCount < pdLesson.getSentences().size()) {
                        PdLesson pdLesson2 = j0Var.O;
                        if (pdLesson2 == null) {
                            kotlin.jvm.internal.m.n("pdLesson");
                            throw null;
                        }
                        List<PdSentence> sentences = pdLesson2.getSentences();
                        ta.a aVar2 = j0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar2);
                        PdSentence pdSentence = sentences.get(((j4) aVar2).f32774k.getChildCount());
                        kotlin.jvm.internal.m.e(pdSentence, "get(...)");
                        j0Var.x(pdSentence);
                    }
                    j0Var.A();
                }
                ((View) j0Var.P.get(0)).requestFocus();
                return b0Var;
            case 2:
                ((View) obj).animate().translationX(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(300L).start();
                return b0Var;
            case 3:
                o0 o0Var = (o0) obj;
                ta.a aVar3 = o0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                NestedScrollView nestedScrollView = ((k4) aVar3).f32822d;
                if (nestedScrollView != null) {
                    ta.a aVar4 = o0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    nestedScrollView.setPadding(0, 0, 0, ((k4) aVar4).f32822d.getHeight() / 2);
                }
                return b0Var;
            case 4:
                Bundle bundle = new Bundle();
                if (((y0) obj).N == -1) {
                    bundle.putString("source", "review");
                } else {
                    bundle.putString("source", "lesson");
                }
                return bundle;
            case 5:
                f1 f1Var = (f1) obj;
                ta.a aVar5 = f1Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ((n4) aVar5).f32989d.removeAllViews();
                while (true) {
                    int i13 = 4;
                    if (i12 >= 18) {
                        int[] iArr = new int[2];
                        ta.a aVar6 = f1Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar6);
                        ((n4) aVar6).f32989d.getLocationOnScreen(iArr);
                        ta.a aVar7 = f1Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar7);
                        FrameLayout frameLayout = ((n4) aVar7).f32989d;
                        frameLayout.postDelayed(new b2.c(i13, frameLayout, new fp.f(8, f1Var, iArr)), 0L);
                        return b0Var;
                    }
                    ImageView imageView = new ImageView(f1Var.f36398d);
                    Integer[] numArr = {Integer.valueOf(R.drawable.pd_review_book), Integer.valueOf(R.drawable.pd_review_listen), Integer.valueOf(R.drawable.pd_review_write)};
                    jz.d dVar = jz.e.f37397a;
                    imageView.setImageResource(((Number) ry.l.d0(numArr)).intValue());
                    imageView.setVisibility(4);
                    ta.a aVar8 = f1Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar8);
                    ((n4) aVar8).f32989d.addView(imageView);
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    Context contextRequireContext = f1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    layoutParams.width = (int) j3.Z(20, contextRequireContext);
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    Context contextRequireContext2 = f1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                    layoutParams2.height = (int) j3.Z(20, contextRequireContext2);
                    imageView.setVisibility(4);
                    imageView.postDelayed(new b2.c(i13, imageView, new fp.f(10, imageView, f1Var)), 0L);
                    i12++;
                }
                break;
            case 6:
                PdVocabularyActivity pdVocabularyActivity = (PdVocabularyActivity) obj;
                androidx.recyclerview.widget.m1 layoutManager = ((hj.m0) pdVocabularyActivity.j()).f32907f.getLayoutManager();
                kotlin.jvm.internal.m.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(pdVocabularyActivity.W, pdVocabularyActivity.X);
                return b0Var;
            case 7:
                int i14 = HandWriteGroupActivity.f22048t;
                ((HandWriteGroupActivity) obj).finish();
                return b0Var;
            case 8:
                int i15 = HandWriteSearchActivity.f22049t;
                ((HandWriteSearchActivity) obj).finish();
                return b0Var;
            case 9:
                int i16 = MALSyllableIntroductionActivity.Q;
                ((MALSyllableIntroductionActivity) obj).finish();
                return b0Var;
            case 10:
                ((mv.n) obj).a(mv.b.f42191a);
                return b0Var;
            case 11:
                m9.c cVar = ((j9.e) obj).H;
                if (!cVar.f41059i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (cVar.f41060j.getCurrentState() != Lifecycle.State.DESTROYED) {
                    return ((m9.b) ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, cVar.f41051a, (ViewModelProvider.Factory) cVar.m.getValue(), (CreationExtras) null, 4, (Object) null).get(kotlin.jvm.internal.z.a(m9.b.class))).f41050a;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            case 12:
                int i17 = HINDISyllableIntroductionActivity.K;
                ((HINDISyllableIntroductionActivity) obj).finish();
                return b0Var;
            case 13:
                int i18 = HINDISyllableIntroductionActivity.K;
                ((ml.a) obj).a(oz.x.q0(oz.x.q0("[main-raam-hoon]", "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                return b0Var;
            case 14:
                int i19 = BaseSmartTipsActivity.H;
                ((BaseSmartTipsActivity) obj).finish();
                return b0Var;
            case 15:
                ((jp.q0) obj).v();
                return b0Var;
            case 16:
                ((kr.b0) obj).a(kr.e.f38453a);
                return b0Var;
            case 17:
                return Float.valueOf(((kr.l) obj).f38521g);
            case 18:
                return Float.valueOf(((kr.n) obj).f38543k);
            case 19:
                kr.d0 d0Var = (kr.d0) obj;
                float f5 = d0Var.f38442c;
                int size = d0Var.f38440a.size() - 1;
                return Float.valueOf(f5 / (size >= 1 ? size : 1));
            case 20:
                return Float.valueOf(((kr.r0) obj).f38567d);
            case 21:
                int i21 = PdFeedStarredActivity.f21657t;
                ((PdFeedStarredActivity) obj).finish();
                return b0Var;
            case 22:
                JPSyllableIntroIndexActivity jPSyllableIntroIndexActivity = (JPSyllableIntroIndexActivity) obj;
                int i22 = JPSyllableIntroIndexActivity.P;
                ((hj.y) jPSyllableIntroIndexActivity.j()).f33605b.setPadding((b7.e0.f(LingoSkillApplication.f21665b).widthPixels - ff.h.s(R.dimen.lesson_index_card_width)) / 2, 0, (b7.e0.f(LingoSkillApplication.f21665b).widthPixels - ff.h.s(R.dimen.lesson_index_card_width)) / 2, 0);
                return b0Var;
            case 23:
                Bundle bundle2 = new Bundle();
                b7.e0.v(((Lesson) obj).getSortIndex(), bundle2, "L", "lesson");
                return bundle2;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((km.t0) obj).requireActivity().finish();
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                f2 f2Var = (f2) obj;
                Context contextRequireContext3 = f2Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                String strY = ff.h.y(contextRequireContext3, R.string.wushiyin);
                Context contextRequireContext4 = f2Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                String strY2 = ff.h.y(contextRequireContext4, R.string.zhuoyin);
                Context contextRequireContext5 = f2Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                return new String[]{strY, strY2, ff.h.y(contextRequireContext5, R.string.aoyin)};
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                j2 j2Var = (j2) obj;
                if (j2Var.isAdded() && j2Var.getView() != null) {
                    ta.a aVar9 = j2Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar9);
                    androidx.recyclerview.widget.b1 adapter = ((m6) aVar9).f32941b.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
                return b0Var;
            case 27:
                oo.g gVar2 = (oo.g) obj;
                ImageView imageView2 = gVar2.f45663h.f32793b;
                kotlin.jvm.internal.m.c(imageView2);
                ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                FrameLayout frameLayout2 = gVar2.f45657b;
                layoutParams3.width = frameLayout2.getWidth();
                layoutParams3.height = (int) (frameLayout2.getWidth() * 0.5625f);
                ImageView imageView3 = gVar2.f45663h.f32793b;
                kotlin.jvm.internal.m.c(imageView3);
                imageView3.setLayoutParams(layoutParams3);
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                la.h hVar = (la.h) obj;
                String str = hVar.f39860b;
                if (str == null || !hVar.f39862d) {
                    gVar = new la.g(hVar.f39859a, hVar.f39860b, new dm.a(23), hVar.f39861c, hVar.f39863e);
                } else {
                    Context context = hVar.f39859a;
                    kotlin.jvm.internal.m.f(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    kotlin.jvm.internal.m.e(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    gVar = new la.g(hVar.f39859a, new File(noBackupFilesDir, str).getAbsolutePath(), new dm.a(23), hVar.f39861c, hVar.f39863e);
                }
                gVar.setWriteAheadLoggingEnabled(hVar.f39865t);
                return gVar;
            default:
                SubscriptionHelpActivity subscriptionHelpActivity = (SubscriptionHelpActivity) obj;
                int i23 = SubscriptionHelpActivity.Q;
                Bundle bundle3 = new Bundle();
                if (subscriptionHelpActivity.P.length() > 0) {
                    bundle3.putString("source", subscriptionHelpActivity.P);
                }
                return bundle3;
        }
    }
}
