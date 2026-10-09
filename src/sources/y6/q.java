package y6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57310b;

    static {
        b7.f0.G(0);
        b7.f0.G(1);
    }

    public q(String str, String str2) {
        this.f57309a = b7.f0.L(str);
        this.f57310b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (Objects.equals(this.f57309a, qVar.f57309a) && Objects.equals(this.f57310b, qVar.f57310b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f57310b.hashCode() * 31;
        String str = this.f57309a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
