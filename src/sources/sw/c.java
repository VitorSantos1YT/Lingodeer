package sw;

import com.google.common.base.MoreObjects;
import java.util.concurrent.ScheduledExecutorService;
import lw.k0;
import lw.o0;
import lw.t1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends lw.f {
    @Override // lw.f
    public lw.y b(k0 k0Var) {
        return r().b(k0Var);
    }

    @Override // lw.f
    public final lw.f c() {
        return r().c();
    }

    @Override // lw.f
    public final ScheduledExecutorService d() {
        return r().d();
    }

    @Override // lw.f
    public final t1 f() {
        return r().f();
    }

    @Override // lw.f
    public final void k() {
        r().k();
    }

    @Override // lw.f
    public void q(lw.n nVar, o0 o0Var) {
        r().q(nVar, o0Var);
    }

    public abstract lw.f r();

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(r(), "delegate");
        return toStringHelperB.toString();
    }
}
