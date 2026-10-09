package com.google.android.material.loadingindicator;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.yalantis.ucrop.view.CropImageView;
import u5.f;
import v10.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class LoadingIndicatorAnimatorDelegate {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Property f14757i = new AnonymousClass2(Float.class, "animationFraction");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f14758j = new AnonymousClass3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f14762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f14763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LoadingIndicatorSpec f14764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LoadingIndicatorDrawable f14765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LoadingIndicatorDrawingDelegate.IndicatorState f14766h;

    /* JADX INFO: renamed from: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass2 extends Property<LoadingIndicatorAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
            return Float.valueOf(loadingIndicatorAnimatorDelegate.f14760b);
        }

        @Override // android.util.Property
        public final void set(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate, Float f5) {
            LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate2 = loadingIndicatorAnimatorDelegate;
            float fFloatValue = f5.floatValue();
            loadingIndicatorAnimatorDelegate2.f14760b = fFloatValue;
            float f11 = loadingIndicatorAnimatorDelegate2.f14759a - 1;
            float f12 = loadingIndicatorAnimatorDelegate2.f14761c - f11;
            float f13 = ((int) (fFloatValue * 650.0f)) / 650.0f;
            if (f13 == 1.0f) {
                f13 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            loadingIndicatorAnimatorDelegate2.f14766h.f14782c = ((f12 * 90.0f) + ((f13 * 50.0f) + (f11 * 140.0f))) % 360.0f;
            LoadingIndicatorDrawable loadingIndicatorDrawable = loadingIndicatorAnimatorDelegate2.f14765g;
            if (loadingIndicatorDrawable != null) {
                loadingIndicatorDrawable.invalidateSelf();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass3 extends c {
        @Override // v10.c
        public final void K(Object obj, float f5) {
            ((LoadingIndicatorAnimatorDelegate) obj).a(f5);
        }

        @Override // v10.c
        public final float x(Object obj) {
            return ((LoadingIndicatorAnimatorDelegate) obj).f14761c;
        }
    }

    public final void a(float f5) {
        this.f14761c = f5;
        LoadingIndicatorDrawingDelegate.IndicatorState indicatorState = this.f14766h;
        indicatorState.f14781b = f5;
        int i11 = this.f14759a - 1;
        int[] iArr = this.f14764f.f14786d;
        int length = i11 % iArr.length;
        int length2 = (length + 1) % iArr.length;
        int i12 = iArr[length];
        int i13 = iArr[length2];
        ArgbEvaluatorCompat argbEvaluatorCompat = ArgbEvaluatorCompat.f13773a;
        float fM = ue.f.m(f5 - i11, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        Integer numValueOf = Integer.valueOf(i12);
        Integer numValueOf2 = Integer.valueOf(i13);
        argbEvaluatorCompat.getClass();
        indicatorState.f14780a = ArgbEvaluatorCompat.a(fM, numValueOf, numValueOf2).intValue();
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.f14765g;
        if (loadingIndicatorDrawable != null) {
            loadingIndicatorDrawable.invalidateSelf();
        }
    }
}
