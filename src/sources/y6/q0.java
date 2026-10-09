package y6;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f57311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList f57312b;

    static {
        b7.f0.G(0);
        b7.f0.G(1);
    }

    public q0(p0 p0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= p0Var.f57304a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f57311a = p0Var;
        this.f57312b = ImmutableList.n(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (this.f57311a.equals(q0Var.f57311a) && this.f57312b.equals(q0Var.f57312b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f57312b.hashCode() * 31) + this.f57311a.hashCode();
    }
}
