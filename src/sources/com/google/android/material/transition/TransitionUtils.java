package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.material.canvas.CanvasCompat;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class TransitionUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f15979a = new RectF();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface CornerSizeBinaryOperator {
    }

    private TransitionUtils() {
    }

    public static View a(View view, int i11) {
        String resourceName = view.getResources().getResourceName(i11);
        while (view != null) {
            if (view.getId() != i11) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(e.m(resourceName, " is not a valid ancestor"));
    }

    public static RectF b(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        return new RectF(i11, i12, view.getWidth() + i11, view.getHeight() + i12);
    }

    public static float c(float f5, float f11, float f12) {
        return p0.a(f11, f5, f12, f5);
    }

    public static float d(float f5, float f11, float f12, float f13, float f14, boolean z11) {
        if (z11 && (f14 < CropImageView.DEFAULT_ASPECT_RATIO || f14 > 1.0f)) {
            return c(f5, f11, f14);
        }
        if (f14 < f12) {
            return f5;
        }
        return f14 > f13 ? f11 : c(f5, f11, (f14 - f12) / (f13 - f12));
    }

    public static int e(float f5, float f11, float f12, int i11, int i12) {
        if (f12 < f5) {
            return i11;
        }
        return f12 > f11 ? i12 : (int) c(i11, i12, (f12 - f5) / (f11 - f5));
    }

    public static void f(Canvas canvas, Rect rect, float f5, float f11, float f12, int i11, CanvasCompat.CanvasOperation canvasOperation) {
        if (i11 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f5, f11);
        canvas.scale(f12, f12);
        if (i11 < 255) {
            RectF rectF = f15979a;
            rectF.set(rect);
            canvas.saveLayerAlpha(rectF, i11);
        }
        canvasOperation.a(canvas);
        canvas.restoreToCount(iSave);
    }
}
