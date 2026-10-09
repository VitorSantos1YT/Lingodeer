package qa;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends j0 {
    public h(int i11) {
        this.f47642i0 = i11;
    }

    public static float X(d0 d0Var, float f5) {
        Float f11;
        return (d0Var == null || (f11 = (Float) d0Var.f47604a.get("android:fade:transitionAlpha")) == null) ? f5 : f11.floatValue();
    }

    @Override // qa.j0
    public final Animator U(ViewGroup viewGroup, View view, d0 d0Var) {
        e0.f47614a.getClass();
        return W(view, X(d0Var, CropImageView.DEFAULT_ASPECT_RATIO), 1.0f);
    }

    @Override // qa.j0
    public final Animator V(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        f0 f0Var = e0.f47614a;
        f0Var.getClass();
        ObjectAnimator objectAnimatorW = W(view, X(d0Var, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO);
        if (objectAnimatorW == null) {
            f0Var.I(view, X(d0Var2, 1.0f));
        }
        return objectAnimatorW;
    }

    public final ObjectAnimator W(View view, float f5, float f11) {
        if (f5 == f11) {
            return null;
        }
        e0.f47614a.I(view, f5);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, e0.f47615b, f11);
        g gVar = new g(view);
        objectAnimatorOfFloat.addListener(gVar);
        s().a(gVar);
        return objectAnimatorOfFloat;
    }

    @Override // qa.j0, qa.v
    public final void i(d0 d0Var) {
        j0.S(d0Var);
        Float fValueOf = (Float) d0Var.f47605b.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            if (d0Var.f47605b.getVisibility() == 0) {
                fValueOf = Float.valueOf(e0.f47614a.u(d0Var.f47605b));
            } else {
                fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
            }
        }
        d0Var.f47604a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // qa.v
    public final boolean x() {
        return true;
    }
}
