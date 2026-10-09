package qy;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f48505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f48507c;

    public r(Object obj, Object obj2, Object obj3) {
        this.f48505a = obj;
        this.f48506b = obj2;
        this.f48507c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.m.a(this.f48505a, rVar.f48505a) && kotlin.jvm.internal.m.a(this.f48506b, rVar.f48506b) && kotlin.jvm.internal.m.a(this.f48507c, rVar.f48507c);
    }

    public final int hashCode() {
        Object obj = this.f48505a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f48506b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f48507c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f48505a + ", " + this.f48506b + ", " + this.f48507c + ')';
    }
}
