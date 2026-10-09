package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends vy.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f50864b = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50865a;

    public a0() {
        super(f50864b);
        this.f50865a = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && kotlin.jvm.internal.m.a(this.f50865a, ((a0) obj).f50865a);
    }

    public final int hashCode() {
        return this.f50865a.hashCode();
    }

    public final String toString() {
        return hh.p0.o(new StringBuilder("CoroutineName("), this.f50865a, ')');
    }
}
