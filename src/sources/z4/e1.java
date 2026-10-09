package z4;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends f1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f58826e;

    public e1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f58826e = windowInsetsAnimation;
    }

    public static r4.d f(WindowInsetsAnimation.Bounds bounds) {
        return r4.d.d(bounds.getUpperBound());
    }

    public static r4.d g(WindowInsetsAnimation.Bounds bounds) {
        return r4.d.d(bounds.getLowerBound());
    }

    public static void h(View view, androidx.datastore.preferences.protobuf.l lVar) {
        view.setWindowInsetsAnimationCallback(lVar != null ? new d1(lVar) : null);
    }

    @Override // z4.f1
    public final float a() {
        return this.f58826e.getAlpha();
    }

    @Override // z4.f1
    public final long b() {
        return this.f58826e.getDurationMillis();
    }

    @Override // z4.f1
    public final float c() {
        return this.f58826e.getInterpolatedFraction();
    }

    @Override // z4.f1
    public final int d() {
        return this.f58826e.getTypeMask();
    }

    @Override // z4.f1
    public final void e(float f5) {
        this.f58826e.setFraction(f5);
    }
}
