package lv;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f40333b;

    public a(int i11, ArrayList arrayList) {
        this.f40332a = i11;
        this.f40333b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f40332a == aVar.f40332a && this.f40333b.equals(aVar.f40333b);
    }

    public final int hashCode() {
        return this.f40333b.hashCode() + (Integer.hashCode(this.f40332a) * 31);
    }

    public final String toString() {
        return "JPSyllableData(progress=" + this.f40332a + ", lessons=" + this.f40333b + ")";
    }
}
