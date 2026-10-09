package lw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f40389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40390b;

    public g1(Object obj) {
        this.f40390b = obj;
        this.f40389a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g1.class == obj.getClass()) {
            g1 g1Var = (g1) obj;
            if (Objects.a(this.f40389a, g1Var.f40389a) && Objects.a(this.f40390b, g1Var.f40390b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40389a, this.f40390b});
    }

    public final String toString() {
        Object obj = this.f40390b;
        if (obj != null) {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(obj, "config");
            return toStringHelperB.toString();
        }
        MoreObjects.ToStringHelper toStringHelperB2 = MoreObjects.b(this);
        toStringHelperB2.c(this.f40389a, "error");
        return toStringHelperB2.toString();
    }

    public g1(q1 q1Var) {
        this.f40390b = null;
        Preconditions.k(q1Var, "status");
        this.f40389a = q1Var;
        Preconditions.f("cannot use OK status: %s", !q1Var.f(), q1Var);
    }
}
