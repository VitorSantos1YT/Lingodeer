package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.r0 f42470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42471b;

    public i5(lw.r0 r0Var, Object obj) {
        this.f42470a = r0Var;
        this.f42471b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i5.class == obj.getClass()) {
            i5 i5Var = (i5) obj;
            if (Objects.a(this.f42470a, i5Var.f42470a) && Objects.a(this.f42471b, i5Var.f42471b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42470a, this.f42471b});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f42470a, "provider");
        toStringHelperB.c(this.f42471b, "config");
        return toStringHelperB.toString();
    }
}
