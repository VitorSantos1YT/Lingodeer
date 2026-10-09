package qt;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f48338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48339b;

    public o(int i11, ArrayList arrayList) {
        this.f48338a = arrayList;
        this.f48339b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f48338a.equals(oVar.f48338a) && this.f48339b == oVar.f48339b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48339b) + (this.f48338a.hashCode() * 31);
    }

    public final String toString() {
        return "TestConfigSection(configs=" + this.f48338a + ", repeatCount=" + this.f48339b + ")";
    }
}
