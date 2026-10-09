package at;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import b0.a1;
import bp.a5;
import bp.b5;
import bp.g2;
import bq.u;
import br.h0;
import ch.x;
import com.google.api.Service;
import com.lingo.course.ui.CourseReviewListActivity;
import com.lingo.lingoskill.billing.SubscriptionSuccessActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.MainActivity;
import com.lingo.main.ui.MainComposeActivity;
import com.lingo.me.MeSettingsActivity;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.lingodeer.data.model.uistate.CompleteOneLessonUiState;
import com.yalantis.ucrop.view.CropImageView;
import d0.n0;
import d1.z0;
import dt.b2;
import hj.x4;
import j3.u0;
import j9.v;
import java.util.concurrent.TimeUnit;
import jt.a2;
import jt.j0;
import jt.x0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.y;
import l1.b1;
import l1.b3;
import qy.b0;
import rt.sf;
import rt.uf;
import rz.e0;
import s0.g0;
import s0.o1;
import s0.s0;
import w2.e1;
import y2.k0;
import ys.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2873c;

    public /* synthetic */ f(int i11, Object obj, Object obj2) {
        this.f2871a = i11;
        this.f2872b = obj;
        this.f2873c = obj2;
    }

    /* JADX WARN: Type inference failed for: r9v25, types: [fz.c, xy.i] */
    @Override // fz.a
    public final Object invoke() {
        AnimatorSet.Builder builderWith;
        AnimatorSet.Builder builderWith2;
        AnimatorSet.Builder builderWith3;
        long j11;
        o1 o1VarD;
        s0 s0Var;
        j3.h hVar;
        int i11 = this.f2871a;
        int i12 = 2;
        vy.d dVar = null;
        int i13 = 1;
        int i14 = 3;
        b0 b0Var = b0.f48488a;
        Object obj = this.f2873c;
        Object obj2 = this.f2872b;
        switch (i11) {
            case 0:
                ((fz.c) obj2).invoke((sf) obj);
                return b0Var;
            case 1:
                ((fz.c) obj2).invoke((uf) obj);
                return b0Var;
            case 2:
                ((tz.l) obj2).i(obj);
                return b0Var;
            case 3:
                LoginActivity loginActivity = (LoginActivity) obj;
                int i15 = LoginActivity.Q;
                if (!((v) obj2).c()) {
                    loginActivity.finish();
                }
                return b0Var;
            case 4:
                rz.b0 b0Var2 = (rz.b0) obj;
                int i16 = MainActivity.U;
                CompleteOneLessonUiState completeOneLessonUiState = (CompleteOneLessonUiState) ((b3) obj2).getValue();
                if (!kotlin.jvm.internal.m.a(completeOneLessonUiState, CompleteOneLessonUiState.Idle.INSTANCE)) {
                    if (!(completeOneLessonUiState instanceof CompleteOneLessonUiState.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e0.B(b0Var2, null, null, new g2(i12, i12, dVar), 3);
                }
                return b0Var;
            case 5:
                b5 b5Var = (b5) obj2;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dy.j jVar = ky.e.f38937b;
                b5Var.N = qx.h.d(800L, 800L, timeUnit, jVar).k(jVar).g(px.b.a()).h(new b1.p(i12, b5Var, (int[]) obj), bp.h.f4612t);
                return b0Var;
            case 6:
                b5 b5Var2 = (b5) obj2;
                ImageView imageView = (ImageView) obj;
                ta.a aVar = b5Var2.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                if (((x4) aVar).f33585d != null) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    ta.a aVar2 = b5Var2.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    int width = (((x4) aVar2).f33585d.getWidth() - imageView.getWidth()) / 2;
                    ta.a aVar3 = b5Var2.f36400f;
                    kotlin.jvm.internal.m.c(aVar3);
                    layoutParams2.setMargins(width, (((x4) aVar3).f33585d.getHeight() - imageView.getHeight()) / 2, 0, 0);
                    imageView.setLayoutParams(layoutParams2);
                }
                return b0Var;
            case 7:
                View view = (View) obj2;
                b5 b5Var3 = (b5) obj;
                view.setVisibility(0);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", CropImageView.DEFAULT_ASPECT_RATIO);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", CropImageView.DEFAULT_ASPECT_RATIO);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleX", CropImageView.DEFAULT_ASPECT_RATIO, 1.6f, 0.5f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "scaleY", CropImageView.DEFAULT_ASPECT_RATIO, 1.6f, 0.5f);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, "alpha", CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                AnimatorSet animatorSet = new AnimatorSet();
                AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat);
                if (builderPlay != null && (builderWith = builderPlay.with(objectAnimatorOfFloat2)) != null && (builderWith2 = builderWith.with(objectAnimatorOfFloat3)) != null && (builderWith3 = builderWith2.with(objectAnimatorOfFloat4)) != null) {
                    builderWith3.with(objectAnimatorOfFloat5);
                }
                animatorSet.setDuration(4600L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
                th.j.a(qx.h.m(4600L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new a5(view, 0), vx.b.f54316e), b5Var3.f36401t);
                animatorSet.start();
                b5Var3.R.add(animatorSet);
                return b0Var;
            case 8:
                ((MainComposeActivity) obj2).m().c("jxz_click_ad", new u(i13));
                int[] iArr = bq.r.f4959a;
                bq.m.D((Context) obj, "learn_ad_top");
                return b0Var;
            case 9:
                ((fz.c) obj2).invoke(((h0) obj).f5039a);
                return b0Var;
            case 10:
                MainComposeActivity mainComposeActivity = (MainComposeActivity) obj;
                ((fz.a) obj2).invoke();
                int i17 = SubscriptionSuccessActivity.P;
                mainComposeActivity.startActivity(new Intent(mainComposeActivity, (Class<?>) SubscriptionSuccessActivity.class));
                return b0Var;
            case 11:
                pu.b bVar = (pu.b) obj2;
                ou.f fVar = ou.f.Quiz;
                bVar.h(fVar);
                ((b1) obj).setValue(fVar);
                bVar.l(0);
                return b0Var;
            case 12:
                d0 d0Var = (d0) obj2;
                jt.g gVar = (jt.g) obj;
                if (d0Var != null) {
                    d0Var.h();
                }
                gVar.f36939h.setValue(ht.a.f33722e);
                return b0Var;
            case 13:
                ((fz.c) obj2).invoke(Boolean.TRUE);
                ((fz.a) obj).invoke();
                return b0Var;
            case 14:
                ((fz.c) obj2).invoke((CourseSentence) obj);
                return b0Var;
            case 15:
                d0 d0Var2 = (d0) obj2;
                x0 x0Var = (x0) obj;
                if (d0Var2 != null) {
                    d0Var2.h();
                }
                x0Var.f37262h.setValue(ht.a.f33722e);
                return b0Var;
            case 16:
                j0 j0Var = (j0) obj;
                String string = j0Var.f36989a.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                ((fz.e) obj2).invoke(string, new ht.f(j0Var.f36989a.getVisemedMap()));
                return b0Var;
            case 17:
                CourseWord courseWord = (CourseWord) obj;
                ((fz.e) obj2).invoke(b7.e0.l(courseWord, "toString(...)"), new ht.h(courseWord.getVisemedMap()));
                return b0Var;
            case 18:
                ((a2) obj2).a((CourseWord) obj, true);
                return b0Var;
            case 19:
                CourseReviewListActivity courseReviewListActivity = (CourseReviewListActivity) obj2;
                b1 b1Var = (b1) obj;
                int i18 = CourseReviewListActivity.L;
                if (!courseReviewListActivity.p() || courseReviewListActivity.q()) {
                    courseReviewListActivity.finish();
                } else {
                    b1Var.setValue(Boolean.TRUE);
                }
                return b0Var;
            case 20:
                x xVar = (x) obj2;
                xVar.requireActivity().finish();
                if (!((Boolean) ((b3) obj).getValue()).booleanValue()) {
                    int[] iArr2 = bq.r.f4959a;
                    Context contextRequireContext = xVar.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    bq.m.C(contextRequireContext, "course_lesson_finish");
                }
                return b0Var;
            case 21:
                MeSettingsActivity meSettingsActivity = (MeSettingsActivity) obj2;
                int i19 = MeSettingsActivity.f22221t;
                e0.B(LifecycleOwnerKt.getLifecycleScope(meSettingsActivity), null, null, new b1.c(25, meSettingsActivity, new com.google.accompanist.permissions.a(4, meSettingsActivity, (b1) obj), dVar), 3);
                return b0Var;
            case 22:
                ((v) obj2).c();
                ((js.i) obj).f36772c.k(null);
                return b0Var;
            case 23:
                d0.o oVar = (d0.o) obj2;
                k0 k0Var = (k0) obj;
                oVar.Y = oVar.T.a(k0Var.f56937a.d(), k0Var.getLayoutDirection(), k0Var);
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((y) obj2).f38361a = y2.f.i((n0) obj, e1.f54482a);
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                e0.B((rz.b0) obj2, null, rz.d0.UNDISPATCHED, new a1((xy.i) obj, null), 1);
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                z0 z0Var = (z0) obj2;
                long j12 = ((v3.l) ((b1) obj).getValue()).f53498a;
                f2.b bVarI = z0Var.i();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (bVarI != null) {
                    long j13 = bVarI.f26570a;
                    j3.h hVarL = z0Var.l();
                    if (hVarL != null && hVarL.f35700b.length() != 0) {
                        g0 g0Var = (g0) z0Var.f23053r.getValue();
                        int i21 = g0Var == null ? -1 : d1.b1.f22869a[g0Var.ordinal()];
                        if (i21 != -1) {
                            if (i21 == 1 || i21 == 2) {
                                long j14 = z0Var.m().f44705b;
                                int i22 = j3.x0.f35822c;
                                j11 = j14 >> 32;
                            } else {
                                if (i21 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                long j15 = z0Var.m().f44705b;
                                int i23 = j3.x0.f35822c;
                                j11 = j15 & 4294967295L;
                            }
                            int i24 = (int) j11;
                            s0 s0Var2 = z0Var.f23040d;
                            if (s0Var2 != null && (o1VarD = s0Var2.d()) != null && (s0Var = z0Var.f23040d) != null && (hVar = s0Var.f51166a.f51266a) != null) {
                                int iL = hz.b.l(z0Var.f23038b.s(i24), 0, hVar.f35700b.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (o1VarD.d(j13) >> 32));
                                u0 u0Var = o1VarD.f51124a;
                                j3.x xVar2 = u0Var.f35798b;
                                int iD = xVar2.d(iL);
                                float fE = u0Var.e(iD);
                                float f5 = u0Var.f(iD);
                                float fK = hz.b.k(fIntBitsToFloat, Math.min(fE, f5), Math.max(fE, f5));
                                if (v3.l.a(j12, 0L) || Math.abs(fIntBitsToFloat - fK) <= ((int) (j12 >> 32)) / 2) {
                                    float f11 = xVar2.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fK)) << 32) | (((long) Float.floatToRawIntBits(((xVar2.b(iD) - f11) / 2) + f11)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new f2.b(jFloatToRawIntBits);
            case 27:
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) obj2;
                fz.a aVar4 = (fz.a) obj;
                if (uVar.f38357a) {
                    uVar.f38357a = true;
                } else {
                    aVar4.invoke();
                }
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((fz.c) obj2).invoke((ChineseToneLesson) obj);
                return b0Var;
            default:
                b1 b1Var2 = (b1) obj;
                b1Var2.setValue(Boolean.TRUE);
                e0.B((rz.b0) obj2, null, null, new b2(b1Var2, dVar, i14), 3);
                return b0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(rz.b0 b0Var, fz.c cVar) {
        this.f2871a = 25;
        this.f2872b = b0Var;
        this.f2873c = (xy.i) cVar;
    }
}
