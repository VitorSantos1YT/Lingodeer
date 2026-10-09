package xu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56492a;

    public o0(boolean z11) {
        this.f56492a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.f56492a == ((o0) obj).f56492a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56492a);
    }

    public final String toString() {
        return ep.a.i("OnClickEditUserInfo(isLoginUser=", ")", this.f56492a);
    }
}
