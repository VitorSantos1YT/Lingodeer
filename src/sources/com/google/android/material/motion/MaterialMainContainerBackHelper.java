package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialMainContainerBackHelper extends MaterialBackAnimationHelper<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f14805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f14806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f14808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f14809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f14810l;

    public MaterialMainContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f14805g = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.f14806h = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    public final AnimatorSet a(final View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        View view2 = this.f14791b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, CropImageView.DEFAULT_ASPECT_RATIO), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, CropImageView.DEFAULT_ASPECT_RATIO));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialMainContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                View view3 = view;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    public final float[] b() {
        float[] fArr;
        View view;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        if (this.f14810l == null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = (view = this.f14791b).getRootWindowInsets()) == null) {
                fArr = new float[]{CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO};
            } else {
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                int i11 = displayMetrics.widthPixels;
                int i12 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i13 = iArr[0];
                int i14 = iArr[1];
                int width = view.getWidth();
                int height = view.getHeight();
                int radius = (i13 == 0 && i14 == 0 && (roundedCorner4 = rootWindowInsets.getRoundedCorner(0)) != null) ? roundedCorner4.getRadius() : 0;
                int i15 = width + i13;
                int radius2 = (i15 < i11 || i14 != 0 || (roundedCorner3 = rootWindowInsets.getRoundedCorner(1)) == null) ? 0 : roundedCorner3.getRadius();
                int radius3 = (i15 < i11 || i14 + height < i12 || (roundedCorner2 = rootWindowInsets.getRoundedCorner(2)) == null) ? 0 : roundedCorner2.getRadius();
                int radius4 = (i13 != 0 || i14 + height < i12 || (roundedCorner = rootWindowInsets.getRoundedCorner(3)) == null) ? 0 : roundedCorner.getRadius();
                float f5 = radius;
                float f11 = radius2;
                float f12 = radius3;
                float f13 = radius4;
                fArr = new float[]{f5, f5, f11, f11, f12, f12, f13, f13};
            }
            this.f14810l = fArr;
        }
        return this.f14810l;
    }
}
