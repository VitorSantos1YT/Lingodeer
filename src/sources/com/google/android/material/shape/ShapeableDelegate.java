package com.google.android.material.shape;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ShapeableDelegate {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ShapeAppearanceModel f15314c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15312a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15313b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f15315d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f15316e = new Path();

    public static ShapeableDelegate a(FrameLayout frameLayout) {
        return Build.VERSION.SDK_INT >= 33 ? new ShapeableDelegateV33(frameLayout) : new ShapeableDelegateV22(frameLayout);
    }

    public abstract void b(FrameLayout frameLayout);

    public abstract boolean c();

    public final void d() {
        ShapeAppearanceModel shapeAppearanceModel;
        RectF rectF = this.f15315d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (shapeAppearanceModel = this.f15314c) == null) {
            return;
        }
        ShapeAppearancePathProvider.Lazy.f15281a.a(shapeAppearanceModel, rectF, this.f15316e);
    }
}
