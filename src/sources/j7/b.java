package j7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36097d;

    public b(String str, int i11, int i12, String str2) {
        this.f36094a = str;
        this.f36095b = str2;
        this.f36096c = i11;
        this.f36097d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f36096c == bVar.f36096c && this.f36097d == bVar.f36097d && Objects.equals(this.f36094a, bVar.f36094a) && Objects.equals(this.f36095b, bVar.f36095b);
    }

    public final int hashCode() {
        return Objects.hash(this.f36094a, this.f36095b, Integer.valueOf(this.f36096c), Integer.valueOf(this.f36097d));
    }
}
