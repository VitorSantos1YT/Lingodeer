package lw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import mw.a2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f40345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f40347d;

    public b0(String str, a0 a0Var, long j11, a2 a2Var) {
        this.f40344a = str;
        Preconditions.k(a0Var, "severity");
        this.f40345b = a0Var;
        this.f40346c = j11;
        this.f40347d = a2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Objects.a(this.f40344a, b0Var.f40344a) && Objects.a(this.f40345b, b0Var.f40345b) && this.f40346c == b0Var.f40346c && Objects.a(null, null) && Objects.a(this.f40347d, b0Var.f40347d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40344a, this.f40345b, Long.valueOf(this.f40346c), null, this.f40347d});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f40344a, "description");
        toStringHelperB.c(this.f40345b, "severity");
        toStringHelperB.b(this.f40346c, "timestampNanos");
        toStringHelperB.c(null, "channelRef");
        toStringHelperB.c(this.f40347d, "subchannelRef");
        return toStringHelperB.toString();
    }
}
