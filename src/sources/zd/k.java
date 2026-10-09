package zd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59171a;

    public k(String str) {
        this.f59171a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f59171a.equals(((k) obj).f59171a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59171a.hashCode();
    }

    public final String toString() {
        return ep.a.k(new StringBuilder("StringHeaderFactory{value='"), this.f59171a, "'}");
    }
}
