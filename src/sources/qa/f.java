package qa;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends v {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String[] f47616i0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final b f47617j0 = new b(0, PointF.class, "topLeft");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final b f47618k0 = new b(1, PointF.class, "bottomRight");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final b f47619l0 = new b(2, PointF.class, "bottomRight");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final b f47620m0 = new b(3, PointF.class, "topLeft");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final b f47621n0 = new b(4, PointF.class, RequestParameters.POSITION);

    public static void S(d0 d0Var) {
        View view = d0Var.f47605b;
        HashMap map = d0Var.f47604a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", d0Var.f47605b.getParent());
    }

    @Override // qa.v
    public final void f(d0 d0Var) {
        S(d0Var);
    }

    @Override // qa.v
    public final void i(d0 d0Var) {
        S(d0Var);
    }

    @Override // qa.v
    public final String[] u() {
        return f47616i0;
    }

    @Override // qa.v
    public final Animator m(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        int i11;
        f fVar;
        Animator animatorOfObject;
        if (d0Var != null) {
            HashMap map = d0Var.f47604a;
            if (d0Var2 != null) {
                HashMap map2 = d0Var2.f47604a;
                String str = MzwEyWCkjXL.ZeMZBIuzOz;
                ViewGroup viewGroup2 = (ViewGroup) map.get(str);
                ViewGroup viewGroup3 = (ViewGroup) map2.get(str);
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = d0Var2.f47605b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i12 = rect.left;
                    int i13 = rect2.left;
                    int i14 = rect.top;
                    int i15 = rect2.top;
                    int i16 = rect.right;
                    int i17 = rect2.right;
                    int i18 = rect.bottom;
                    int i19 = rect2.bottom;
                    int i21 = i16 - i12;
                    int i22 = i18 - i14;
                    int i23 = i17 - i13;
                    int i24 = i19 - i15;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i21 == 0 || i22 == 0) && (i23 == 0 || i24 == 0)) {
                        i11 = 0;
                    } else {
                        i11 = (i12 == i13 && i14 == i15) ? 0 : 1;
                        if (i16 != i17 || i18 != i19) {
                            i11++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i11++;
                    }
                    int i25 = i11;
                    if (i25 > 0) {
                        e0.a(view, i12, i14, i16, i18);
                        if (i25 != 2) {
                            fVar = this;
                            animatorOfObject = (i12 == i13 && i14 == i15) ? ObjectAnimator.ofObject(view, f47619l0, (TypeConverter) null, fVar.f47677a0.B(i16, i18, i17, i19)) : ObjectAnimator.ofObject(view, f47620m0, (TypeConverter) null, fVar.f47677a0.B(i12, i14, i13, i15));
                        } else if (i21 == i23 && i22 == i24) {
                            fVar = this;
                            animatorOfObject = ObjectAnimator.ofObject(view, f47621n0, (TypeConverter) null, fVar.f47677a0.B(i12, i14, i13, i15));
                        } else {
                            fVar = this;
                            e eVar = new e(view);
                            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(eVar, f47617j0, (TypeConverter) null, fVar.f47677a0.B(i12, i14, i13, i15));
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(eVar, f47618k0, (TypeConverter) null, fVar.f47677a0.B(i16, i18, i17, i19));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                            animatorSet.addListener(new c(eVar));
                            animatorOfObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            ob.f.N(viewGroup4, true);
                            fVar.s().a(new d(viewGroup4));
                        }
                        return animatorOfObject;
                    }
                }
            }
        }
        return null;
    }
}
