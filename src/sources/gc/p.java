package gc;

import java.util.Map;
import ry.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f29068b = new p(s.f50855a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f29069a;

    public p(Map map) {
        this.f29069a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return kotlin.jvm.internal.m.a(this.f29069a, ((p) obj).f29069a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29069a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f29069a + ')';
    }
}
