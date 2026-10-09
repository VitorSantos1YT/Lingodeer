package f7;

import com.google.common.collect.ImmutableSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f26774b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableSet f26775a;

    static {
        a5.f fVar = new a5.f(9, false);
        fVar.f378b = ImmutableSet.l(2, 1, 5);
        f26774b = new g1(fVar);
    }

    public g1(a5.f fVar) {
        this.f26775a = (ImmutableSet) fVar.f378b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g1) && this.f26775a.equals(((g1) obj).f26775a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f26775a, null, null, bool, bool, bool, bool);
    }
}
