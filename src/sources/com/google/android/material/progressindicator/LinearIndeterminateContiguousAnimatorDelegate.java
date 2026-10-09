package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.yalantis.ucrop.view.CropImageView;
import i0.pKy.shrCcjmOhAmRC;
import java.util.ArrayList;
import r6.a;
import ra.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class LinearIndeterminateContiguousAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Property f15049i = new AnonymousClass2(Float.class, shrCcjmOhAmRC.FKFbDU);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f15050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f15051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f15052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15055h;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass2 extends Property<LinearIndeterminateContiguousAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateContiguousAnimatorDelegate.f15055h);
        }

        @Override // android.util.Property
        public final void set(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, Float f5) {
            LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate2 = linearIndeterminateContiguousAnimatorDelegate;
            float fFloatValue = f5.floatValue();
            linearIndeterminateContiguousAnimatorDelegate2.f15055h = fFloatValue;
            ArrayList arrayList = linearIndeterminateContiguousAnimatorDelegate2.f15039b;
            ((DrawingDelegate.ActiveIndicator) arrayList.get(0)).f15027a = CropImageView.DEFAULT_ASPECT_RATIO;
            float fB = IndeterminateAnimatorDelegate.b((int) (fFloatValue * 333.0f), 0, 667);
            DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) arrayList.get(0);
            DrawingDelegate.ActiveIndicator activeIndicator2 = (DrawingDelegate.ActiveIndicator) arrayList.get(1);
            a aVar = linearIndeterminateContiguousAnimatorDelegate2.f15051d;
            float interpolation = aVar.getInterpolation(fB);
            activeIndicator2.f15027a = interpolation;
            activeIndicator.f15028b = interpolation;
            DrawingDelegate.ActiveIndicator activeIndicator3 = (DrawingDelegate.ActiveIndicator) arrayList.get(1);
            DrawingDelegate.ActiveIndicator activeIndicator4 = (DrawingDelegate.ActiveIndicator) arrayList.get(2);
            float interpolation2 = aVar.getInterpolation(fB + 0.49925038f);
            activeIndicator4.f15027a = interpolation2;
            activeIndicator3.f15028b = interpolation2;
            ((DrawingDelegate.ActiveIndicator) arrayList.get(2)).f15028b = 1.0f;
            if (linearIndeterminateContiguousAnimatorDelegate2.f15054g && ((DrawingDelegate.ActiveIndicator) arrayList.get(1)).f15028b < 1.0f) {
                ((DrawingDelegate.ActiveIndicator) arrayList.get(2)).f15029c = ((DrawingDelegate.ActiveIndicator) arrayList.get(1)).f15029c;
                ((DrawingDelegate.ActiveIndicator) arrayList.get(1)).f15029c = ((DrawingDelegate.ActiveIndicator) arrayList.get(0)).f15029c;
                ((DrawingDelegate.ActiveIndicator) arrayList.get(0)).f15029c = linearIndeterminateContiguousAnimatorDelegate2.f15052e.f14959e[linearIndeterminateContiguousAnimatorDelegate2.f15053f];
                linearIndeterminateContiguousAnimatorDelegate2.f15054g = false;
            }
            linearIndeterminateContiguousAnimatorDelegate2.f15038a.invalidateSelf();
        }
    }

    public LinearIndeterminateContiguousAnimatorDelegate(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f15053f = 1;
        this.f15052e = linearProgressIndicatorSpec;
        this.f15051d = new a(1);
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void a() {
        ObjectAnimator objectAnimator = this.f15050c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void c() {
        h();
        this.f15050c.setDuration((long) (this.f15052e.f14967n * 333.0f));
        i();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void d(c cVar) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void e() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void f() {
        h();
        i();
        this.f15050c.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void g() {
    }

    public final void h() {
        if (this.f15050c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LinearIndeterminateContiguousAnimatorDelegate, Float>) f15049i, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            this.f15050c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f15052e.f14967n * 333.0f));
            this.f15050c.setInterpolator(null);
            this.f15050c.setRepeatCount(-1);
            this.f15050c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = LinearIndeterminateContiguousAnimatorDelegate.this;
                    linearIndeterminateContiguousAnimatorDelegate.f15053f = (linearIndeterminateContiguousAnimatorDelegate.f15053f + 1) % linearIndeterminateContiguousAnimatorDelegate.f15052e.f14959e.length;
                    linearIndeterminateContiguousAnimatorDelegate.f15054g = true;
                }
            });
        }
    }

    public final void i() {
        this.f15054g = true;
        this.f15053f = 1;
        ArrayList arrayList = this.f15039b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) obj;
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.f15052e;
            activeIndicator.f15029c = linearProgressIndicatorSpec.f14959e[0];
            activeIndicator.f15030d = linearProgressIndicatorSpec.f14963i / 2;
        }
    }
}
