package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f1813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1817e;

    public r0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1817e = true;
        this.f1813a = viewGroup;
        this.f1814b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j11, Transformation transformation) {
        this.f1817e = true;
        if (this.f1815c) {
            return !this.f1816d;
        }
        if (!super.getTransformation(j11, transformation)) {
            this.f1815c = true;
            z4.w.a(this.f1813a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11 = this.f1815c;
        ViewGroup viewGroup = this.f1813a;
        if (z11 || !this.f1817e) {
            viewGroup.endViewTransition(this.f1814b);
            this.f1816d = true;
        } else {
            this.f1817e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j11, Transformation transformation, float f5) {
        this.f1817e = true;
        if (this.f1815c) {
            return !this.f1816d;
        }
        if (!super.getTransformation(j11, transformation, f5)) {
            this.f1815c = true;
            z4.w.a(this.f1813a, this);
        }
        return true;
    }
}
