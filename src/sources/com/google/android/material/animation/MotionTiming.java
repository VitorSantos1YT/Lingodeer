package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MotionTiming {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13782a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f13784c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13785d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13786e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13783b = 150;

    public MotionTiming(long j11) {
        this.f13782a = j11;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f13782a);
        animator.setDuration(this.f13783b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f13785d);
            valueAnimator.setRepeatMode(this.f13786e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f13784c;
        return timeInterpolator != null ? timeInterpolator : AnimationUtils.f13769b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (this.f13782a == motionTiming.f13782a && this.f13783b == motionTiming.f13783b && this.f13785d == motionTiming.f13785d && this.f13786e == motionTiming.f13786e) {
            return b().getClass().equals(motionTiming.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f13782a;
        long j12 = this.f13783b;
        return ((((b().getClass().hashCode() + (((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31)) * 31) + this.f13785d) * 31) + this.f13786e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(getClass().getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f13782a);
        sb2.append(" duration: ");
        sb2.append(this.f13783b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f13785d);
        sb2.append(" repeatMode: ");
        return p0.i(this.f13786e, "}\n", sb2);
    }
}
