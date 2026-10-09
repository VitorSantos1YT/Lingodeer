package z4;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class q1 extends p1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v1 f58882r = v1.h(null, WindowInsets.CONSUMED);

    public q1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var, windowInsets);
    }

    @Override // z4.m1, z4.s1
    public r4.d g(int i11) {
        return r4.d.d(this.f58867c.getInsets(t1.a(i11)));
    }

    @Override // z4.m1, z4.s1
    public r4.d h(int i11) {
        return r4.d.d(this.f58867c.getInsetsIgnoringVisibility(t1.a(i11)));
    }

    @Override // z4.m1, z4.s1
    public boolean q(int i11) {
        return this.f58867c.isVisible(t1.a(i11));
    }

    public q1(v1 v1Var, q1 q1Var) {
        super(v1Var, q1Var);
    }

    @Override // z4.m1, z4.s1
    public final void d(View view) {
    }
}
