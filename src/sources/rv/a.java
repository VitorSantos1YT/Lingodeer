package rv;

import java.util.ArrayList;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f50807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f50808c;

    public a(int i11, ArrayList arrayList, ArrayList arrayList2) {
        this.f50806a = i11;
        this.f50807b = arrayList;
        this.f50808c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f50806a == aVar.f50806a && this.f50807b.equals(aVar.f50807b) && this.f50808c.equals(aVar.f50808c);
    }

    public final int hashCode() {
        return this.f50808c.hashCode() + p.b(this.f50807b, Integer.hashCode(this.f50806a) * 31, 31);
    }

    public final String toString() {
        return "KOSyllableData(progress=" + this.f50806a + ", lessons=" + this.f50807b + ", soundChangeLessons=" + this.f50808c + ")";
    }
}
