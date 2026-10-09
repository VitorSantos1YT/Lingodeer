package rm;

import hh.p0;
import java.util.ArrayList;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f49287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f49288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49289c;

    public b(ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f49287a = arrayList;
        this.f49288b = arrayList2;
        this.f49289c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f49287a.equals(bVar.f49287a) && this.f49288b.equals(bVar.f49288b) && this.f49289c == bVar.f49289c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49289c) + p.b(this.f49288b, this.f49287a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(hiraganaLessons=");
        sb2.append(this.f49287a);
        sb2.append(", katakanaLessons=");
        sb2.append(this.f49288b);
        sb2.append(", showExam=");
        return p0.p(sb2, this.f49289c, ")");
    }
}
