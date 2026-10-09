package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q0 f1658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m2 operation, boolean z11) {
        super(operation);
        kotlin.jvm.internal.m.f(operation, "operation");
        this.f1656b = z11;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00f5 A[Catch: RuntimeException -> 0x00fb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fb, blocks: (B:72:0x00ef, B:74:0x00f5), top: B:85:0x00ef }] */
    public final q0 b(Context context) {
        int enterAnim;
        q0 q0Var;
        Animator animatorLoadAnimator;
        int iM;
        if (this.f1657c) {
            return this.f1658d;
        }
        m2 m2Var = this.f1737a;
        k0 k0Var = m2Var.f1756c;
        boolean z11 = m2Var.f1754a == q2.VISIBLE;
        int nextTransition = k0Var.getNextTransition();
        if (this.f1656b) {
            enterAnim = z11 ? k0Var.getPopEnterAnim() : k0Var.getPopExitAnim();
        } else {
            enterAnim = z11 ? k0Var.getEnterAnim() : k0Var.getExitAnim();
        }
        k0Var.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = k0Var.mContainer;
        q0 q0Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            k0Var.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = k0Var.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = k0Var.onCreateAnimation(nextTransition, z11, enterAnim);
            if (animationOnCreateAnimation != null) {
                q0Var2 = new q0(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = k0Var.onCreateAnimator(nextTransition, z11, enterAnim);
                if (animatorOnCreateAnimator != null) {
                    q0Var2 = new q0(animatorOnCreateAnimator);
                } else {
                    if (enterAnim == 0 && nextTransition != 0) {
                        if (nextTransition == 4097) {
                            iM = z11 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        } else if (nextTransition == 8194) {
                            iM = z11 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                        } else if (nextTransition == 8197) {
                            iM = z11 ? o00.a.M(context, android.R.attr.activityCloseEnterAnimation) : o00.a.M(context, android.R.attr.activityCloseExitAnimation);
                        } else if (nextTransition == 4099) {
                            iM = z11 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                        } else if (nextTransition != 4100) {
                            iM = -1;
                        } else {
                            iM = z11 ? o00.a.M(context, android.R.attr.activityOpenEnterAnimation) : o00.a.M(context, android.R.attr.activityOpenExitAnimation);
                        }
                        enterAnim = iM;
                    }
                    if (enterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                        if (zEquals) {
                            try {
                                Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                if (animationLoadAnimation != null) {
                                    q0Var = new q0(animationLoadAnimation);
                                    q0Var2 = q0Var;
                                }
                            } catch (Resources.NotFoundException e8) {
                                throw e8;
                            } catch (RuntimeException unused) {
                                try {
                                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                    if (animatorLoadAnimator != null) {
                                        q0Var = new q0(animatorLoadAnimator);
                                        q0Var2 = q0Var;
                                    }
                                } catch (RuntimeException e10) {
                                    if (zEquals) {
                                        throw e10;
                                    }
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        q0Var2 = new q0(animationLoadAnimation2);
                                    }
                                }
                            }
                        } else {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                            if (animatorLoadAnimator != null) {
                                q0Var = new q0(animatorLoadAnimator);
                                q0Var2 = q0Var;
                            }
                        }
                    }
                }
            }
        }
        this.f1658d = q0Var2;
        this.f1657c = true;
        return q0Var2;
    }
}
