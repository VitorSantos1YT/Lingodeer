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
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f40394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f40395c;

    public h1(List list, b bVar, g1 g1Var) {
        this.f40393a = Collections.unmodifiableList(new ArrayList(list));
        Preconditions.k(bVar, "attributes");
        this.f40394b = bVar;
        this.f40395c = g1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Objects.a(this.f40393a, h1Var.f40393a) && Objects.a(this.f40394b, h1Var.f40394b) && Objects.a(this.f40395c, h1Var.f40395c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40393a, this.f40394b, this.f40395c});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f40393a, "addresses");
        toStringHelperB.c(this.f40394b, "attributes");
        toStringHelperB.c(this.f40395c, "serviceConfig");
        return toStringHelperB.toString();
    }
}
