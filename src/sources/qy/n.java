package qy;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f48497a;

    public n(Throwable exception) {
        kotlin.jvm.internal.m.f(exception, "exception");
        this.f48497a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return kotlin.jvm.internal.m.a(this.f48497a, ((n) obj).f48497a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f48497a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f48497a + ')';
    }
}
