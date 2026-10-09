package sw;

import com.google.common.base.MoreObjects;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends lw.y {
    @Override // lw.y
    public final List b() {
        return r().b();
    }

    @Override // lw.y
    public final lw.f d() {
        return r().d();
    }

    @Override // lw.y
    public final Object e() {
        return r().e();
    }

    @Override // lw.y
    public final void n() {
        r().n();
    }

    @Override // lw.y
    public void o() {
        r().o();
    }

    @Override // lw.y
    public void q(List list) {
        r().q(list);
    }

    public abstract lw.y r();

    public String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(r(), "delegate");
        return toStringHelperB.toString();
    }
}
