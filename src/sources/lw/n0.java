package lw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f40423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40424c;

    public n0(List list, b bVar, Object obj) {
        Preconditions.k(list, "addresses");
        this.f40422a = Collections.unmodifiableList(new ArrayList(list));
        Preconditions.k(bVar, "attributes");
        this.f40423b = bVar;
        this.f40424c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Objects.a(this.f40422a, n0Var.f40422a) && Objects.a(this.f40423b, n0Var.f40423b) && Objects.a(this.f40424c, n0Var.f40424c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40422a, this.f40423b, this.f40424c});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f40422a, "addresses");
        toStringHelperB.c(this.f40423b, "attributes");
        toStringHelperB.c(this.f40424c, "loadBalancingPolicyConfig");
        return toStringHelperB.toString();
    }
}
