package km;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38264b;

    public q(String str, String str2) {
        this.f38263a = str;
        this.f38264b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.f38263a, qVar.f38263a) && kotlin.jvm.internal.m.a(this.f38264b, qVar.f38264b);
    }

    public final int hashCode() {
        int iHashCode = this.f38263a.hashCode() * 31;
        String str = this.f38264b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ep.a.h("SingleTextCellData(text=", this.f38263a, ", audioKey=", this.f38264b, ")");
    }
}
