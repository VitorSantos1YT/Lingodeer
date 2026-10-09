package hh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.fluent.ui.base.PdLearnIndexActivity;
import com.lingo.fluent.ui.base.PdVocabularyDetailActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.japanskill.ui.syllable.JPHwCharListActivity;
import com.lingo.lingoskill.object.Ack;
import com.lingo.lingoskill.object.CharGroup;
import com.lingo.lingoskill.object.LanCustomInfo;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonDao;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingo.lingoskill.ui.learn.LessonTestActivity;
import com.lingo.lingoskill.ui.review.adapter.AckCardSearchAdapter;
import com.lingo.lingoskill.vtskill.ui.syllable.adapter.VTSyllableIndexRecyclerAdapter;
import com.lingo.lingoskill.vtskill.ui.syllable.ui.VTSyllableStudyActivity;
import com.lingo.lingoskill.widget.ResponsiveScrollView;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.WordAccuracyScoreTimingResult;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import hj.d5;
import hj.r5;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import okhttp3.EventListener;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements BaseQuickAdapter.OnItemClickListener, i.b, ua.k, tx.a, EventListener.Factory, TabLayoutMediator.TabConfigurationStrategy, com.android.billingclient.api.r, m7.r, uw.f, MetricsLoggerClient.EngagementMetricsLoggerInterface, c7.u, a4.j, s7.n, d7.e, b7.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32212b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f32211a = i11;
        this.f32212b = obj;
    }

    @Override // m7.r
    public int a(Object obj) {
        y6.p pVar = (y6.p) this.f32212b;
        m7.n nVar = (m7.n) obj;
        String str = nVar.f40985b;
        return ((str.equals(pVar.f57291n) || str.equals(m7.s.b(pVar))) && nVar.c(pVar, false) && nVar.d(pVar)) ? 1 : 0;
    }

    @Override // b7.g
    public void accept(Object obj) {
        switch (this.f32211a) {
            case 27:
                u8.g gVar = (u8.g) this.f32212b;
                u8.a aVar = (u8.a) obj;
                u8.f fVar = new u8.f(aVar.f52819b, re.e0.d(aVar.f52818a, aVar.f52820c));
                gVar.f52832c.add(fVar);
                long j11 = gVar.f52839j;
                if (j11 == -9223372036854775807L || aVar.f52821d >= j11) {
                    gVar.a(fVar);
                }
                break;
            default:
                ((ImmutableList.Builder) this.f32212b).h((u8.a) obj);
                break;
        }
    }

    @Override // c7.u
    public void b(long j11, b7.w wVar) {
        x7.a.d(j11, wVar, ((r8.g) this.f32212b).J);
    }

    @Override // a4.j
    public Object c(a4.i iVar) {
        rz.i0 i0Var = (rz.i0) this.f32212b;
        i0Var.invokeOnCompletion(new a0.e(22, iVar, i0Var));
        return "Deferred.asListenableFuture";
    }

    @Override // com.android.billingclient.api.r
    public void d(com.android.billingclient.api.j billingResult, List list) {
        switch (this.f32211a) {
            case 9:
                lu.b bVar = (lu.b) this.f32212b;
                kotlin.jvm.internal.m.f(billingResult, "billingResult");
                c cVar = bVar.f40330b;
                if (cVar != null) {
                    cVar.d(billingResult, list);
                }
                break;
            default:
                mu.x xVar = (mu.x) this.f32212b;
                kotlin.jvm.internal.m.f(billingResult, "billingResult");
                rz.e0.B(ViewModelKt.getViewModelScope(xVar), null, null, new mu.o(billingResult, xVar, list, null), 3);
                break;
        }
    }

    @Override // s7.n
    public List e(int i11, y6.p0 p0Var, int[] iArr) {
        s7.j jVar = (s7.j) this.f32212b;
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i12 = 0; i12 < p0Var.f57304a; i12++) {
            builder.h(new s7.g(i11, p0Var, i12, jVar, iArr[i12]));
        }
        return builder.j();
    }

    @Override // i.b
    public void f(Object obj) {
        switch (this.f32211a) {
            case 1:
                PdLearnIndexActivity pdLearnIndexActivity = (PdLearnIndexActivity) this.f32212b;
                i.a it = (i.a) obj;
                int i11 = PdLearnIndexActivity.L;
                kotlin.jvm.internal.m.f(it, "it");
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdLearnIndexActivity), null, null, new gp.a(pdLearnIndexActivity, null, 10), 3);
                return;
            case 5:
                jp.w0 w0Var = (jp.w0) this.f32212b;
                i.a it2 = (i.a) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                if (w0Var.r().isUnloginUser()) {
                    return;
                }
                try {
                    View view = w0Var.f36399e;
                    kotlin.jvm.internal.m.c(view);
                    if (view.findViewById(R.id.rl_bug_report).getVisibility() == 0) {
                        ta.a aVar = w0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar);
                        l.m mVar = w0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar);
                        ob.i iVar = new ob.i((r5) aVar, mVar, w0Var.r());
                        w0Var.R = iVar;
                        iVar.o();
                        return;
                    }
                    return;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
            case 6:
                LessonTestActivity lessonTestActivity = (LessonTestActivity) this.f32212b;
                i.a it3 = (i.a) obj;
                int i12 = LessonTestActivity.X;
                kotlin.jvm.internal.m.f(it3, "it");
                if (((fr.o0) lessonTestActivity.l()).f27733a.isUnloginUser()) {
                    lessonTestActivity.finish();
                    return;
                }
                try {
                    long j11 = lessonTestActivity.P;
                    long j12 = lessonTestActivity.Q;
                    int i13 = lessonTestActivity.R;
                    int i14 = lessonTestActivity.S;
                    boolean z11 = lessonTestActivity.T;
                    boolean z12 = lessonTestActivity.U;
                    String mode = lessonTestActivity.V;
                    kotlin.jvm.internal.m.f(mode, "mode");
                    Bundle bundle = new Bundle();
                    bundle.putLong(INTENTS.EXTRA_LONG, j11);
                    bundle.putLong(INTENTS.EXTRA_LONG_2, j12);
                    bundle.putInt(INTENTS.EXTRA_INT, i13);
                    bundle.putInt(INTENTS.EXTRA_INT_2, i14);
                    bundle.putBoolean(INTENTS.EXTRA_BOOLEAN, z11);
                    bundle.putBoolean(INTENTS.EXTRA_BOOLEAN_2, z12);
                    bundle.putString(INTENTS.EXTRA_STRING, mode);
                    jp.p0 p0Var = new jp.p0();
                    p0Var.setArguments(bundle);
                    ff.h.A(lessonTestActivity, p0Var);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 22:
                sq.g gVar = (sq.g) this.f32212b;
                i.a it4 = (i.a) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                VTSyllableIndexRecyclerAdapter vTSyllableIndexRecyclerAdapter = gVar.O;
                if (vTSyllableIndexRecyclerAdapter != null) {
                    if (ij.l.f34436b == null) {
                        synchronized (ij.l.class) {
                            if (ij.l.f34436b == null) {
                                ij.l.f34436b = new ij.l();
                            }
                        }
                    }
                    vTSyllableIndexRecyclerAdapter.f22072b = b7.e0.d(ij.l.f34436b, 7);
                    break;
                }
                VTSyllableIndexRecyclerAdapter vTSyllableIndexRecyclerAdapter2 = gVar.O;
                if (vTSyllableIndexRecyclerAdapter2 != null) {
                    vTSyllableIndexRecyclerAdapter2.notifyDataSetChanged();
                    return;
                }
                return;
            default:
                ((a0.e) this.f32212b).invoke((i.a) obj);
                return;
        }
    }

    @Override // uw.f
    public void g(ex.k kVar) {
        ((ProgrammaticContextualTriggerFlowableModule) this.f32212b).f20220a.getClass();
    }

    @Override // ua.k
    public void h(View view) {
        PdVocabularyDetailActivity pdVocabularyDetailActivity = (PdVocabularyDetailActivity) this.f32212b;
        int i11 = PdVocabularyDetailActivity.U;
        float left = (view.getLeft() - (((hj.n0) pdVocabularyDetailActivity.j()).f32951c.getScrollX() + ((hj.n0) pdVocabularyDetailActivity.j()).f32951c.getPaddingLeft())) / ((((hj.n0) pdVocabularyDetailActivity.j()).f32951c.getMeasuredWidth() - ((hj.n0) pdVocabularyDetailActivity.j()).f32951c.getPaddingLeft()) - ((hj.n0) pdVocabularyDetailActivity.j()).f32951c.getPaddingRight());
        float f5 = 1;
        view.setAlpha(Math.abs(Math.abs(left) - f5) + 0.5f);
        if (left < -1.0f) {
            view.setAlpha(0.5f);
        } else if (left <= 1.0f) {
            view.setAlpha(((f5 - Math.abs(left)) * 0.5f) + 0.5f);
        } else {
            view.setAlpha(0.5f);
        }
    }

    public void i(byte[] bArr) {
        ((Transport) this.f32212b).a(Event.g(bArr));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0135 A[PHI: r10
      0x0135: PHI (r10v2 long) = (r10v0 long), (r10v1 long) binds: [B:38:0x0133, B:41:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<WordAccuracyScoreTimingResult> wordScores;
        int i12 = this.f32211a;
        Object obj = this.f32212b;
        switch (i12) {
            case 0:
                f fVar = (f) obj;
                Object obj2 = fVar.N.get(i11);
                kotlin.jvm.internal.m.e(obj2, "get(...)");
                PdLessonDao pdLessonDao = PdLessonDbHelper.INSTANCE.pdLessonDao();
                int[] iArr = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                int i13 = cf.x.n().keyLanguage;
                Long lessonId = ((PdLessonFav) obj2).getLessonId();
                kotlin.jvm.internal.m.e(lessonId, "getLessonId(...)");
                PdLesson pdLesson = (PdLesson) pdLessonDao.load(bq.m.l(i13, lessonId.longValue()));
                if (pdLesson != null) {
                    pdLesson.setSentences(ry.r.f50854a);
                    int i14 = PdLearnIndexActivity.L;
                    Context contextRequireContext = fVar.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    Long lessonId2 = pdLesson.getLessonId();
                    kotlin.jvm.internal.m.e(lessonId2, "getLessonId(...)");
                    long jLongValue = lessonId2.longValue();
                    Intent intent = new Intent(contextRequireContext, (Class<?>) PdLearnIndexActivity.class);
                    intent.putExtra(INTENTS.EXTRA_LONG, jLongValue);
                    fVar.startActivity(intent);
                    th.j.a(qx.h.m(500L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ob.c(12, fVar, pdLesson), vx.b.f54316e), fVar.f36401t);
                    return;
                }
                return;
            case 3:
                hp.d dVar = (hp.d) obj;
                b7.e0.A(dVar.t(), "jxz_cr_learn_click_group");
                int i15 = JPHwCharListActivity.S;
                Context contextRequireContext2 = dVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                Object obj3 = dVar.P.get(i11);
                kotlin.jvm.internal.m.e(obj3, "get(...)");
                Intent intent2 = new Intent(contextRequireContext2, (Class<?>) JPHwCharListActivity.class);
                intent2.putExtra(INTENTS.EXTRA_OBJECT, (CharGroup) obj3);
                dVar.startActivity(intent2);
                return;
            case 15:
                oo.k0 k0Var = (oo.k0) obj;
                com.bumptech.glide.p pVarF = com.bumptech.glide.c.f(k0Var);
                String[] strArr = k0Var.W;
                kotlin.jvm.internal.m.c(strArr);
                com.bumptech.glide.n nVarK = pVarF.k(strArr[i11]);
                ta.a aVar = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                nVarK.x(((d5) aVar).f32497c);
                final SpeakTryAdapter speakTryAdapter = k0Var.R;
                kotlin.jvm.internal.m.c(speakTryAdapter);
                kotlin.jvm.internal.m.c(view);
                ta.a aVar2 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                final ResponsiveScrollView responsiveScrollView = ((d5) aVar2).f32499e;
                o20.w listener = k0Var.f45692b0;
                th.e eVar = speakTryAdapter.f22014a;
                kotlin.jvm.internal.m.f(listener, "listener");
                if (!speakTryAdapter.f22024k.get() && speakTryAdapter.f22018e != i11) {
                    responsiveScrollView.setOnScrollChangedListener(null);
                    View viewFindViewByPosition = null;
                    int i16 = speakTryAdapter.f22018e;
                    speakTryAdapter.f22018e = i11;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) speakTryAdapter.getRecyclerView().getLayoutManager();
                    if (linearLayoutManager != null) {
                        viewFindViewByPosition = linearLayoutManager.findViewByPosition(i16);
                    }
                    if (viewFindViewByPosition != null) {
                        if (eVar.f()) {
                            eVar.n();
                        }
                        PodSentence podSentence = (PodSentence) speakTryAdapter.getItem(i16);
                        FlexboxLayout flexboxLayout = (FlexboxLayout) viewFindViewByPosition.findViewById(R.id.fl_sentence);
                        if (podSentence == null || (wordScores = podSentence.getWordScores()) == null || !(!wordScores.isEmpty())) {
                            kotlin.jvm.internal.m.c(flexboxLayout);
                            speakTryAdapter.f(flexboxLayout);
                        } else {
                            kotlin.jvm.internal.m.c(flexboxLayout);
                            speakTryAdapter.b(flexboxLayout, podSentence);
                        }
                    }
                    speakTryAdapter.h();
                    speakTryAdapter.f22022i = CropImageView.DEFAULT_ASPECT_RATIO;
                    kotlin.jvm.internal.m.c(linearLayoutManager);
                    View viewFindViewByPosition2 = linearLayoutManager.findViewByPosition(i11);
                    if (viewFindViewByPosition2 == null) {
                        speakTryAdapter.notifyItemChanged(i16);
                        speakTryAdapter.notifyItemChanged(i11);
                        responsiveScrollView.setOnScrollChangedListener(listener);
                    } else {
                        int[] iArr2 = new int[2];
                        viewFindViewByPosition2.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        responsiveScrollView.getLocationOnScreen(iArr3);
                        final float f5 = iArr2[1] - iArr3[1];
                        ValueAnimator valueAnimator = speakTryAdapter.f22021h;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            ValueAnimator valueAnimator2 = speakTryAdapter.f22021h;
                            kotlin.jvm.internal.m.c(valueAnimator2);
                            valueAnimator2.removeAllListeners();
                            ValueAnimator valueAnimator3 = speakTryAdapter.f22021h;
                            kotlin.jvm.internal.m.c(valueAnimator3);
                            valueAnimator3.cancel();
                        }
                        long j11 = (long) (0.6f * f5);
                        long j12 = 300;
                        if (j11 > 300) {
                            j11 = j12;
                        } else {
                            j12 = 150;
                            if (j11 < 150) {
                                j11 = j12;
                            }
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                        speakTryAdapter.f22021h = valueAnimatorOfFloat;
                        kotlin.jvm.internal.m.c(valueAnimatorOfFloat);
                        valueAnimatorOfFloat.setDuration(Math.abs(j11));
                        ValueAnimator valueAnimator4 = speakTryAdapter.f22021h;
                        kotlin.jvm.internal.m.c(valueAnimator4);
                        valueAnimator4.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator valueAnimator5 = speakTryAdapter.f22021h;
                        kotlin.jvm.internal.m.c(valueAnimator5);
                        valueAnimator5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.a
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator animation) {
                                m.f(animation, "animation");
                                ResponsiveScrollView responsiveScrollView2 = responsiveScrollView;
                                if (!responsiveScrollView2.isAttachedToWindow()) {
                                    animation.cancel();
                                    return;
                                }
                                float animatedFraction = animation.getAnimatedFraction();
                                SpeakTryAdapter speakTryAdapter2 = speakTryAdapter;
                                float f11 = (animatedFraction - speakTryAdapter2.f22022i) * f5;
                                speakTryAdapter2.f22022i = animatedFraction;
                                responsiveScrollView2.scrollBy(0, (int) f11);
                            }
                        });
                        ValueAnimator valueAnimator6 = speakTryAdapter.f22021h;
                        kotlin.jvm.internal.m.c(valueAnimator6);
                        valueAnimator6.addListener(new androidx.recyclerview.widget.i(linearLayoutManager, i16, i11, responsiveScrollView, speakTryAdapter, listener));
                        ValueAnimator valueAnimator7 = speakTryAdapter.f22021h;
                        kotlin.jvm.internal.m.c(valueAnimator7);
                        valueAnimator7.start();
                    }
                }
                k0Var.D(i11);
                return;
            default:
                tp.i iVar = (tp.i) obj;
                iVar.T = ((Ack) iVar.S.get(i11)).getSortIndex();
                iVar.w();
                AckCardSearchAdapter ackCardSearchAdapter = iVar.U;
                if (ackCardSearchAdapter == null) {
                    kotlin.jvm.internal.m.n("ackCardAdapter");
                    throw null;
                }
                ackCardSearchAdapter.notifyDataSetChanged();
                th.j.a(qx.h.m(500L, TimeUnit.MILLISECONDS, ky.e.f38936a).g(px.b.a()).h(new o20.w(iVar, 26), tp.d.f52448c), iVar.V);
                return;
        }
    }

    @Override // tx.a
    public void run() {
        switch (this.f32211a) {
            case 4:
                jp.z zVar = (jp.z) this.f32212b;
                LanCustomInfo lanCustomInfoA = ub.a.Z().a();
                String audio_lesson = lanCustomInfoA.getAudio_lesson();
                SparseIntArray sparseIntArray = new SparseIntArray();
                if (audio_lesson == null || oz.q.K0(audio_lesson)) {
                    sparseIntArray.put((int) zVar.x().f49337b, zVar.Q + 1);
                } else {
                    sparseIntArray = (SparseIntArray) ff.h.G(audio_lesson).f40184b;
                    if (sparseIntArray.indexOfKey((int) zVar.x().f49337b) >= 0) {
                        if (zVar.Q + 1 > sparseIntArray.get((int) zVar.x().f49337b)) {
                            sparseIntArray.put((int) zVar.x().f49337b, zVar.Q + 1);
                        }
                    } else {
                        sparseIntArray.put((int) zVar.x().f49337b, zVar.Q + 1);
                    }
                }
                LanCustomInfo lanCustomInfoA2 = ub.a.Z().a();
                StringBuilder sb2 = new StringBuilder();
                int size = sparseIntArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    int iKeyAt = sparseIntArray.keyAt(i11);
                    sb2.append(iKeyAt + ":" + sparseIntArray.get(iKeyAt) + ";");
                }
                String string = sb2.toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                lanCustomInfoA2.setAudio_lesson(string);
                if (ij.l.f34436b == null) {
                    synchronized (ij.l.class) {
                        if (ij.l.f34436b == null) {
                            ij.l.f34436b = new ij.l();
                        }
                        break;
                    }
                }
                ij.l lVar = ij.l.f34436b;
                kotlin.jvm.internal.m.c(lVar);
                lVar.f34437a.f34446f.insertOrReplace(lanCustomInfoA);
                return;
            case 14:
                ((nm.b) this.f32212b).f43850a.h(BuildConfig.VERSION_NAME, true);
                return;
            case 17:
                pp.e eVar = (pp.e) this.f32212b;
                String str = eVar.f46978c;
                String str2 = eVar.f46980e.notificationWordSent;
                return;
            default:
                qq.a aVar = (qq.a) this.f32212b;
                int[] iArr = bq.r.f4959a;
                if (!bq.m.G()) {
                    aVar.f48297a.u(BuildConfig.VERSION_NAME, true);
                    return;
                }
                VTSyllableStudyActivity vTSyllableStudyActivity = aVar.f48297a;
                vTSyllableStudyActivity.v(false);
                vTSyllableStudyActivity.u(BuildConfig.VERSION_NAME, true);
                return;
        }
    }

    @Override // d7.e
    public d7.f s() {
        return (d7.o) this.f32212b;
    }

    public /* synthetic */ c(qq.a aVar, HashMap map) {
        this.f32211a = 18;
        this.f32212b = aVar;
    }
}
