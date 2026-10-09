package nr;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43935a;

    public c(String source) {
        m.f(source, "source");
        this.f43935a = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && m.a(this.f43935a, ((c) obj).f43935a);
    }

    public final int hashCode() {
        return this.f43935a.hashCode();
    }

    public final String toString() {
        return ep.a.g("NavigateToConfirmLevel(source=", this.f43935a, ")");
    }
}
