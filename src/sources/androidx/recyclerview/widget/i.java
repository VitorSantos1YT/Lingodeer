package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.widget.ResponsiveScrollView;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2470a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f2474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2476g;

    public i(LinearLayoutManager linearLayoutManager, int i11, int i12, ResponsiveScrollView responsiveScrollView, SpeakTryAdapter speakTryAdapter, o20.w wVar) {
        this.f2473d = linearLayoutManager;
        this.f2471b = i11;
        this.f2472c = i12;
        this.f2474e = responsiveScrollView;
        this.f2475f = speakTryAdapter;
        this.f2476g = wVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2470a) {
            case 0:
                int i11 = this.f2471b;
                View view = this.f2474e;
                if (i11 != 0) {
                    view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                }
                if (this.f2472c != 0) {
                    view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        b2.c cVar;
        switch (this.f2470a) {
            case 0:
                ((ViewPropertyAnimator) this.f2475f).setListener(null);
                m mVar = (m) this.f2476g;
                g2 g2Var = (g2) this.f2473d;
                mVar.c(g2Var);
                mVar.f2531p.remove(g2Var);
                mVar.i();
                return;
            default:
                int i11 = this.f2472c;
                SpeakTryAdapter speakTryAdapter = (SpeakTryAdapter) this.f2475f;
                int i12 = this.f2471b;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f2473d;
                vq.m mVar2 = (vq.m) this.f2476g;
                ResponsiveScrollView responsiveScrollView = (ResponsiveScrollView) this.f2474e;
                kotlin.jvm.internal.m.f(animation, "animation");
                try {
                    try {
                        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i12);
                        if (viewFindViewByPosition != null) {
                            Context context = ((BaseQuickAdapter) speakTryAdapter).mContext;
                            kotlin.jvm.internal.m.e(context, "access$getMContext$p$s-1721133466(...)");
                            viewFindViewByPosition.setBackgroundColor(context.getColor(R.color.color_F6F6F6));
                            viewFindViewByPosition.findViewById(R.id.rl_detail).setVisibility(8);
                        }
                        View viewFindViewByPosition2 = linearLayoutManager.findViewByPosition(i11);
                        if (viewFindViewByPosition2 != null) {
                            Context context2 = ((BaseQuickAdapter) speakTryAdapter).mContext;
                            kotlin.jvm.internal.m.e(context2, "access$getMContext$p$s-1721133466(...)");
                            viewFindViewByPosition2.setBackgroundColor(context2.getColor(R.color.white));
                            viewFindViewByPosition2.findViewById(R.id.rl_detail).setVisibility(0);
                            if (i12 < i11) {
                                responsiveScrollView.scrollBy(0, -ff.h.l(138.0f));
                            }
                            viewFindViewByPosition2.findViewById(R.id.fl_play_audio).performClick();
                        }
                        cVar = new b2.c(23, responsiveScrollView, mVar2);
                        break;
                    } catch (Exception e8) {
                        e8.getMessage();
                        cVar = new b2.c(23, responsiveScrollView, mVar2);
                    }
                    responsiveScrollView.post(cVar);
                    return;
                } catch (Throwable th2) {
                    responsiveScrollView.post(new b2.c(23, responsiveScrollView, mVar2));
                    throw th2;
                }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2470a) {
            case 0:
                ((m) this.f2476g).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i(m mVar, g2 g2Var, int i11, View view, int i12, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2476g = mVar;
        this.f2473d = g2Var;
        this.f2471b = i11;
        this.f2474e = view;
        this.f2472c = i12;
        this.f2475f = viewPropertyAnimator;
    }
}
