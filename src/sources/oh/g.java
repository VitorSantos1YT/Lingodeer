package oh;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mh.b f44919a;

    public g(mh.b difficulty) {
        m.f(difficulty, "difficulty");
        this.f44919a = difficulty;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f44919a == ((g) obj).f44919a;
    }

    public final int hashCode() {
        return this.f44919a.hashCode();
    }

    public final String toString() {
        return "ViewAllClick(difficulty=" + this.f44919a + ")";
    }
}
