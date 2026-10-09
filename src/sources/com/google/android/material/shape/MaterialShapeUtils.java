package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialShapeUtils {
    private MaterialShapeUtils() {
    }

    public static CornerTreatment a(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? new RoundedCornerTreatment() : new CutCornerTreatment();
        }
        return new RoundedCornerTreatment();
    }

    public static void b(ViewGroup viewGroup, float f5) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).q(f5);
        }
    }

    public static void c(View view, MaterialShapeDrawable materialShapeDrawable) {
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawable.f15200b.f15216c;
        if (elevationOverlayProvider == null || !elevationOverlayProvider.f14456a) {
            return;
        }
        float elevation = CropImageView.DEFAULT_ASPECT_RATIO;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.f15200b;
        if (materialShapeDrawableState.m != elevation) {
            materialShapeDrawableState.m = elevation;
            materialShapeDrawable.D();
        }
    }

    public static void d(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            c(viewGroup, (MaterialShapeDrawable) background);
        }
    }
}
