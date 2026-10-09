package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.math.MathUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface CircularRevealWidget extends CircularRevealHelper.Delegate {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CircularRevealEvaluator implements TypeEvaluator<RevealInfo> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CircularRevealEvaluator f14277b = new CircularRevealEvaluator();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevealInfo f14278a = new RevealInfo(0);

        @Override // android.animation.TypeEvaluator
        public final RevealInfo evaluate(float f5, RevealInfo revealInfo, RevealInfo revealInfo2) {
            RevealInfo revealInfo3 = revealInfo;
            RevealInfo revealInfo4 = revealInfo2;
            float fC = MathUtils.c(revealInfo3.f14281a, revealInfo4.f14281a, f5);
            float fC2 = MathUtils.c(revealInfo3.f14282b, revealInfo4.f14282b, f5);
            float fC3 = MathUtils.c(revealInfo3.f14283c, revealInfo4.f14283c, f5);
            RevealInfo revealInfo5 = this.f14278a;
            revealInfo5.f14281a = fC;
            revealInfo5.f14282b = fC2;
            revealInfo5.f14283c = fC3;
            return revealInfo5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CircularRevealProperty extends Property<CircularRevealWidget, RevealInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CircularRevealProperty f14279a = new CircularRevealProperty(RevealInfo.class, "circularReveal");

        @Override // android.util.Property
        public final RevealInfo get(CircularRevealWidget circularRevealWidget) {
            return circularRevealWidget.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(CircularRevealWidget circularRevealWidget, RevealInfo revealInfo) {
            circularRevealWidget.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CircularRevealScrimColorProperty extends Property<CircularRevealWidget, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CircularRevealScrimColorProperty f14280a = new CircularRevealScrimColorProperty(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        public final Integer get(CircularRevealWidget circularRevealWidget) {
            return Integer.valueOf(circularRevealWidget.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(CircularRevealWidget circularRevealWidget, Integer num) {
            circularRevealWidget.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RevealInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f14281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14283c;

        public /* synthetic */ RevealInfo(int i11) {
            this();
        }

        private RevealInfo() {
        }

        public RevealInfo(float f5, float f11, float f12) {
            this.f14281a = f5;
            this.f14282b = f11;
            this.f14283c = f12;
        }

        public RevealInfo(RevealInfo revealInfo) {
            this(revealInfo.f14281a, revealInfo.f14282b, revealInfo.f14283c);
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    RevealInfo getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i11);

    void setRevealInfo(RevealInfo revealInfo);
}
