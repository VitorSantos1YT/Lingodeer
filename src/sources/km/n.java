package km;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38243b;

    public n(List list, List list2) {
        this.f38242a = list;
        this.f38243b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f38242a, nVar.f38242a) && kotlin.jvm.internal.m.a(this.f38243b, nVar.f38243b);
    }

    public final int hashCode() {
        return this.f38243b.hashCode() + (this.f38242a.hashCode() * 31);
    }

    public final String toString() {
        return "LongVowelsTableData(patterns=" + this.f38242a + ", kanaColumns=" + this.f38243b + ")";
    }
}
