package nr;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43932a;

    public a(String str) {
        this.f43932a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && m.a(this.f43932a, ((a) obj).f43932a);
    }

    public final int hashCode() {
        return this.f43932a.hashCode();
    }

    public final String toString() {
        return ep.a.g("Error(message=", this.f43932a, ")");
    }
}
