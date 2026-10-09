package z4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends q1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v1 f58892s = v1.h(null, WindowInsets.CONSUMED);

    public r1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var, windowInsets);
    }

    @Override // z4.q1, z4.m1, z4.s1
    public r4.d g(int i11) {
        return r4.d.d(this.f58867c.getInsets(u1.a(i11)));
    }

    @Override // z4.q1, z4.m1, z4.s1
    public r4.d h(int i11) {
        return r4.d.d(this.f58867c.getInsetsIgnoringVisibility(u1.a(i11)));
    }

    @Override // z4.q1, z4.m1, z4.s1
    public boolean q(int i11) {
        return this.f58867c.isVisible(u1.a(i11));
    }

    public r1(v1 v1Var, r1 r1Var) {
        super(v1Var, r1Var);
    }
}
