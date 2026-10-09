package com.google.android.material.animation;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import hh.p0;
import r6.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AnimationUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f13768a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f13769b = new a(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13770c = new a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f13771d = new a(a.f48827e);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f13772e = new DecelerateInterpolator();

    public static float a(float f5, float f11, float f12) {
        return p0.a(f11, f5, f12, f5);
    }

    public static float b(float f5, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f5;
        }
        return f14 >= f13 ? f11 : a(f5, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i11, float f5, int i12) {
        return Math.round(f5 * (i12 - i11)) + i11;
    }
}
