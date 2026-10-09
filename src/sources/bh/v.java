package bh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4400b;

    public v(long j11, String str) {
        this.f4399a = j11;
        this.f4400b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f4399a == vVar.f4399a && kotlin.jvm.internal.m.a(this.f4400b, vVar.f4400b);
    }

    public final int hashCode() {
        return this.f4400b.hashCode() + (Long.hashCode(this.f4399a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = b7.e0.p(this.f4399a, "CourseTraditionalCharacterRequest(charId=", ", character=", this.f4400b);
        sbP.append(")");
        return sbP.toString();
    }
}
