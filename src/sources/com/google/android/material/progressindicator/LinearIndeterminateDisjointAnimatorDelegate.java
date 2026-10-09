package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import ra.a;
import ra.c;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class LinearIndeterminateDisjointAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f15057k = {533, 567, 850, AchievementLevelType.KNOWLEDGE_POINT_LV_7};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f15058l = {1267, 1000, 333, 0};
    public static final Property m = new AnonymousClass3(Float.class, "animationFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f15059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f15060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator[] f15061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f15062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f15066j;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass3 extends Property<LinearIndeterminateDisjointAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateDisjointAnimatorDelegate.f15065i);
        }

        @Override // android.util.Property
        public final void set(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, Float f5) {
            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate2 = linearIndeterminateDisjointAnimatorDelegate;
            float fFloatValue = f5.floatValue();
            linearIndeterminateDisjointAnimatorDelegate2.f15065i = fFloatValue;
            int i11 = (int) (fFloatValue * 1800.0f);
            Interpolator[] interpolatorArr = linearIndeterminateDisjointAnimatorDelegate2.f15061e;
            ArrayList arrayList = linearIndeterminateDisjointAnimatorDelegate2.f15039b;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) arrayList.get(i12);
                int[] iArr = LinearIndeterminateDisjointAnimatorDelegate.f15058l;
                int i13 = i12 * 2;
                int i14 = iArr[i13];
                int[] iArr2 = LinearIndeterminateDisjointAnimatorDelegate.f15057k;
                activeIndicator.f15027a = f.m(interpolatorArr[i13].getInterpolation(IndeterminateAnimatorDelegate.b(i11, i14, iArr2[i13])), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                int i15 = i13 + 1;
                activeIndicator.f15028b = f.m(interpolatorArr[i15].getInterpolation(IndeterminateAnimatorDelegate.b(i11, iArr[i15], iArr2[i15])), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            }
            if (linearIndeterminateDisjointAnimatorDelegate2.f15064h) {
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    ((DrawingDelegate.ActiveIndicator) obj).f15029c = linearIndeterminateDisjointAnimatorDelegate2.f15062f.f14959e[linearIndeterminateDisjointAnimatorDelegate2.f15063g];
                }
                linearIndeterminateDisjointAnimatorDelegate2.f15064h = false;
            }
            linearIndeterminateDisjointAnimatorDelegate2.f15038a.invalidateSelf();
        }
    }

    public LinearIndeterminateDisjointAnimatorDelegate(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f15063g = 0;
        this.f15066j = null;
        this.f15062f = linearProgressIndicatorSpec;
        this.f15061e = new Interpolator[]{a.a(context, R.anim.linear_indeterminate_line1_head_interpolator), a.a(context, R.anim.linear_indeterminate_line1_tail_interpolator), a.a(context, R.anim.linear_indeterminate_line2_head_interpolator), a.a(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void a() {
        ObjectAnimator objectAnimator = this.f15059c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void c() {
        h();
        ObjectAnimator objectAnimator = this.f15059c;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.f15062f;
        objectAnimator.setDuration((long) (linearProgressIndicatorSpec.f14967n * 1800.0f));
        this.f15060d.setDuration((long) (linearProgressIndicatorSpec.f14967n * 1800.0f));
        i();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void d(c cVar) {
        this.f15066j = cVar;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void e() {
        ObjectAnimator objectAnimator = this.f15060d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f15038a.isVisible()) {
            this.f15060d.setFloatValues(this.f15065i, 1.0f);
            this.f15060d.setDuration((long) ((1.0f - this.f15065i) * 1800.0f));
            this.f15060d.start();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void f() {
        h();
        i();
        this.f15059c.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void g() {
        this.f15066j = null;
    }

    public final void h() {
        ObjectAnimator objectAnimator = this.f15059c;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.f15062f;
        Property property = m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LinearIndeterminateDisjointAnimatorDelegate, Float>) property, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            this.f15059c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (linearProgressIndicatorSpec.f14967n * 1800.0f));
            this.f15059c.setInterpolator(null);
            this.f15059c.setRepeatCount(-1);
            this.f15059c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    linearIndeterminateDisjointAnimatorDelegate.f15063g = (linearIndeterminateDisjointAnimatorDelegate.f15063g + 1) % linearIndeterminateDisjointAnimatorDelegate.f15062f.f14959e.length;
                    linearIndeterminateDisjointAnimatorDelegate.f15064h = true;
                }
            });
        }
        if (this.f15060d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<LinearIndeterminateDisjointAnimatorDelegate, Float>) property, 1.0f);
            this.f15060d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (linearProgressIndicatorSpec.f14967n * 1800.0f));
            this.f15060d.setInterpolator(null);
            this.f15060d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    linearIndeterminateDisjointAnimatorDelegate.a();
                    c cVar = linearIndeterminateDisjointAnimatorDelegate.f15066j;
                    if (cVar != null) {
                        cVar.a(linearIndeterminateDisjointAnimatorDelegate.f15038a);
                    }
                }
            });
        }
    }

    public final void i() {
        this.f15063g = 0;
        ArrayList arrayList = this.f15039b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((DrawingDelegate.ActiveIndicator) obj).f15029c = this.f15062f.f14959e[0];
        }
    }
}
