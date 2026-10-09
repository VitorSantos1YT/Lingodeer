package com.google.android.material.internal;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f14709a;

    public ReversableAnimatedValueInterpolator(TimeInterpolator timeInterpolator) {
        this.f14709a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z11, TimeInterpolator timeInterpolator) {
        return z11 ? timeInterpolator : new ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        return 1.0f - this.f14709a.getInterpolation(f5);
    }
}
