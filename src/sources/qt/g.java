package qt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String section) {
        super("空的配置段落: ".concat(section), 0);
        kotlin.jvm.internal.m.f(section, "section");
        this.f48326d = section;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.m.a(this.f48326d, ((g) obj).f48326d);
    }

    public final int hashCode() {
        return this.f48326d.hashCode();
    }

    public final String toString() {
        return ep.a.g("EmptyConfiguration(section=", this.f48326d, ")");
    }
}
