package iw;

import a0.j;
import kotlin.jvm.internal.m;
import l1.k1;
import l1.t;
import rz.b0;
import rz.e0;
import rz.o0;
import y2.k0;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends q implements y2.q {
    public final fz.c Q;
    public final k1 R;

    public b(fz.c onStateChanged) {
        m.f(onStateChanged, "onStateChanged");
        this.Q = onStateChanged;
        this.R = t.B(null);
    }

    @Override // y2.q
    public final void i(k0 k0Var) {
        j2.c cVarB = y2.f.y(this).getGraphicsContext().b();
        a aVar = new a(k0Var, 0);
        long jD = k0Var.f56937a.d();
        cVarB.g(k0Var, k0Var.getLayoutDirection(), (((long) ((int) Float.intBitsToFloat((int) (jD >> 32)))) << 32) | (((long) ((int) Float.intBitsToFloat((int) (jD & 4294967295L)))) & 4294967295L), new j(k0Var, k0Var.f56938b, aVar, 14));
        vc.a.g(k0Var, cVarB);
        this.Q.invoke(f.f34889a);
        b0 b0VarH0 = H0();
        yz.f fVar = o0.f50940a;
        e0.B(b0VarH0, wz.m.f55536a.f51961d, null, new b0.f(cVarB, this, k0Var, (vy.d) null, 28), 2);
    }
}
