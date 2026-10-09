package rw;

import com.google.common.base.MoreObjects;
import com.google.common.util.concurrent.AbstractFuture;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractFuture {
    public final lw.f H;

    public b(lw.f fVar) {
        this.H = fVar;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void i() {
        this.H.a("GrpcFuture was cancelled", null);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String k() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.H, "clientCall");
        return toStringHelperB.toString();
    }
}
