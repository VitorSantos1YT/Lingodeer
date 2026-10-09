package qt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48331e;

    public j(String str, int i11) {
        super("无效的格式，位置: " + i11 + ", 输入: " + str, 0);
        this.f48330d = str;
        this.f48331e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f48330d, jVar.f48330d) && this.f48331e == jVar.f48331e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48331e) + (this.f48330d.hashCode() * 31);
    }

    public final String toString() {
        return "InvalidFormat(input=" + this.f48330d + ", position=" + this.f48331e + ")";
    }
}
