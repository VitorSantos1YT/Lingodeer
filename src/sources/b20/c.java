package b20;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3876a;

    public c(mz.c cVar) {
        this.f3876a = f20.a.a(cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && m.a(this.f3876a, ((c) obj).f3876a);
    }

    @Override // b20.a
    public final String getValue() {
        return this.f3876a;
    }

    public final int hashCode() {
        return this.f3876a.hashCode();
    }

    public final String toString() {
        return this.f3876a;
    }
}
