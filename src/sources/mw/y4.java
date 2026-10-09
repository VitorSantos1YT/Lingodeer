package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f42845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f42846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImmutableSet f42847f;

    public y4(int i11, long j11, long j12, double d5, Long l9, Set set) {
        this.f42842a = i11;
        this.f42843b = j11;
        this.f42844c = j12;
        this.f42845d = d5;
        this.f42846e = l9;
        this.f42847f = ImmutableSet.m(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return this.f42842a == y4Var.f42842a && this.f42843b == y4Var.f42843b && this.f42844c == y4Var.f42844c && Double.compare(this.f42845d, y4Var.f42845d) == 0 && Objects.a(this.f42846e, y4Var.f42846e) && Objects.a(this.f42847f, y4Var.f42847f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f42842a), Long.valueOf(this.f42843b), Long.valueOf(this.f42844c), Double.valueOf(this.f42845d), this.f42846e, this.f42847f});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.a(this.f42842a, "maxAttempts");
        toStringHelperB.b(this.f42843b, "initialBackoffNanos");
        toStringHelperB.b(this.f42844c, "maxBackoffNanos");
        toStringHelperB.e("backoffMultiplier", String.valueOf(this.f42845d));
        toStringHelperB.c(this.f42846e, "perAttemptRecvTimeoutNanos");
        toStringHelperB.c(this.f42847f, "retryableStatusCodes");
        return toStringHelperB.toString();
    }
}
