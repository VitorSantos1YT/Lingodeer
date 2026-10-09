package lw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f40396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40398c;

    public i(c cVar, int i11, boolean z11) {
        Preconditions.k(cVar, "callOptions");
        this.f40396a = cVar;
        this.f40397b = i11;
        this.f40398c = z11;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f40396a, "callOptions");
        toStringHelperB.a(this.f40397b, "previousAttempts");
        toStringHelperB.d("isTransparentRetry", this.f40398c);
        return toStringHelperB.toString();
    }
}
