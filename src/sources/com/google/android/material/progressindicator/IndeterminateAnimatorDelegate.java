package com.google.android.material.progressindicator;

import android.animation.Animator;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import ra.c;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class IndeterminateAnimatorDelegate<T extends Animator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IndeterminateDrawable f15038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15039b = new ArrayList();

    public IndeterminateAnimatorDelegate(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.f15039b.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    public static float b(int i11, int i12, int i13) {
        return f.m((i11 - i12) / i13, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
    }

    public abstract void a();

    public abstract void c();

    public abstract void d(c cVar);

    public abstract void e();

    public abstract void f();

    public abstract void g();
}
