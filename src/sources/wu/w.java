package wu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55471b;

    public w(String str, String str2) {
        this.f55470a = str;
        this.f55471b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.m.a(this.f55470a, wVar.f55470a) && kotlin.jvm.internal.m.a(this.f55471b, wVar.f55471b);
    }

    public final int hashCode() {
        return this.f55471b.hashCode() + (this.f55470a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h("EmailLogin(email=", this.f55470a, ", password=", this.f55471b, ")");
    }
}
