package nr;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43936a;

    public d(String source) {
        m.f(source, "source");
        this.f43936a = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && m.a(this.f43936a, ((d) obj).f43936a);
    }

    public final int hashCode() {
        return this.f43936a.hashCode();
    }

    public final String toString() {
        return ep.a.g("NavigateToMain(source=", this.f43936a, ")");
    }
}
