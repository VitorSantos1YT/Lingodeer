package qy;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f48495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48496b;

    public l(Object obj, Object obj2) {
        this.f48495a = obj;
        this.f48496b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.f48495a, lVar.f48495a) && kotlin.jvm.internal.m.a(this.f48496b, lVar.f48496b);
    }

    public final int hashCode() {
        Object obj = this.f48495a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f48496b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f48495a + ", " + this.f48496b + ')';
    }
}
