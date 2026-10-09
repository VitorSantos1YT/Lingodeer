package sw;

import com.google.common.base.MoreObjects;
import lw.n0;
import lw.q0;
import lw.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends q0 {
    @Override // lw.q0
    public final boolean b() {
        return g().b();
    }

    @Override // lw.q0
    public final void c(q1 q1Var) {
        g().c(q1Var);
    }

    @Override // lw.q0
    public final void d(n0 n0Var) {
        g().d(n0Var);
    }

    @Override // lw.q0
    public final void e() {
        g().e();
    }

    public abstract q0 g();

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(g(), "delegate");
        return toStringHelperB.toString();
    }
}
