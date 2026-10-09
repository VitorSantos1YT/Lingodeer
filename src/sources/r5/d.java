package r5;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48822a;

    public d(String name) {
        m.f(name, "name");
        this.f48822a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return m.a(this.f48822a, ((d) obj).f48822a);
    }

    public final int hashCode() {
        return this.f48822a.hashCode();
    }

    public final String toString() {
        return this.f48822a;
    }
}
