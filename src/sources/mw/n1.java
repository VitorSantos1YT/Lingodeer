package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableSet f42566c;

    public n1(int i11, long j11, Set set) {
        this.f42564a = i11;
        this.f42565b = j11;
        this.f42566c = ImmutableSet.m(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n1.class != obj.getClass()) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f42564a == n1Var.f42564a && this.f42565b == n1Var.f42565b && Objects.a(this.f42566c, n1Var.f42566c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f42564a), Long.valueOf(this.f42565b), this.f42566c});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.a(this.f42564a, "maxAttempts");
        toStringHelperB.b(this.f42565b, "hedgingDelayNanos");
        toStringHelperB.c(this.f42566c, "nonFatalStatusCodes");
        return toStringHelperB.toString();
    }
}
