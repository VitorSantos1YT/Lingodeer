package qt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String value) {
        super("无效的题型: ".concat(value), 0);
        kotlin.jvm.internal.m.f(value, "value");
        this.f48332d = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && kotlin.jvm.internal.m.a(this.f48332d, ((k) obj).f48332d);
    }

    public final int hashCode() {
        return this.f48332d.hashCode();
    }

    public final String toString() {
        return ep.a.g("InvalidModelType(value=", this.f48332d, ")");
    }
}
