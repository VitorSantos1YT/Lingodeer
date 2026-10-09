package w4;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f54626c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f54624a, aVar.f54624a) && Objects.equals(this.f54625b, aVar.f54625b) && Objects.equals(this.f54626c, aVar.f54626c);
    }

    public final int hashCode() {
        return Objects.hash(this.f54624a, this.f54625b, this.f54626c);
    }
}
