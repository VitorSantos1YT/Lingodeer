package vs;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f54148a;

    public b(Map smartTipsElements) {
        kotlin.jvm.internal.m.f(smartTipsElements, "smartTipsElements");
        this.f54148a = smartTipsElements;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && kotlin.jvm.internal.m.a(this.f54148a, ((b) obj).f54148a);
    }

    public final int hashCode() {
        return this.f54148a.hashCode();
    }

    public final String toString() {
        return "Success(smartTipsElements=" + this.f54148a + ")";
    }
}
