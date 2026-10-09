package z2;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f58664a;

    public s0(ViewConfiguration viewConfiguration) {
        this.f58664a = viewConfiguration;
    }

    @Override // z2.p2
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // z2.p2
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // z2.p2
    public final float c() {
        return this.f58664a.getScaledMinimumFlingVelocity();
    }

    @Override // z2.p2
    public final float d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return t0.b(this.f58664a);
        }
        return 2.0f;
    }

    @Override // z2.p2
    public final float f() {
        return this.f58664a.getScaledMaximumFlingVelocity();
    }

    @Override // z2.p2
    public final float g() {
        return this.f58664a.getScaledTouchSlop();
    }

    @Override // z2.p2
    public final float h() {
        if (Build.VERSION.SDK_INT >= 34) {
            return t0.a(this.f58664a);
        }
        return 16.0f;
    }
}
