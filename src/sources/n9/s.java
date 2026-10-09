package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f43689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Throwable error) {
        super(false);
        kotlin.jvm.internal.m.f(error, "error");
        this.f43689b = error;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f43710a == sVar.f43710a && kotlin.jvm.internal.m.a(this.f43689b, sVar.f43689b);
    }

    public final int hashCode() {
        return this.f43689b.hashCode() + Boolean.hashCode(this.f43710a);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.f43710a + ", error=" + this.f43689b + ')';
    }
}
