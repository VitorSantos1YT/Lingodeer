package lw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0 f40417e = new m0(null, null, q1.f40434e, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f40418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f40419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f40420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f40421d;

    public m0(y yVar, h hVar, q1 q1Var, boolean z11) {
        this.f40418a = yVar;
        this.f40419b = hVar;
        Preconditions.k(q1Var, "status");
        this.f40420c = q1Var;
        this.f40421d = z11;
    }

    public static m0 a(q1 q1Var) {
        Preconditions.e("error status shouldn't be OK", !q1Var.f());
        return new m0(null, null, q1Var, false);
    }

    public static m0 b(y yVar, sw.s sVar) {
        Preconditions.k(yVar, "subchannel");
        return new m0(yVar, sVar, q1.f40434e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Objects.a(this.f40418a, m0Var.f40418a) && Objects.a(this.f40420c, m0Var.f40420c) && Objects.a(this.f40419b, m0Var.f40419b) && this.f40421d == m0Var.f40421d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40418a, this.f40420c, this.f40419b, Boolean.valueOf(this.f40421d)});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f40418a, "subchannel");
        toStringHelperB.c(this.f40419b, "streamTracerFactory");
        toStringHelperB.c(this.f40420c, "status");
        toStringHelperB.d("drop", this.f40421d);
        return toStringHelperB.toString();
    }
}
