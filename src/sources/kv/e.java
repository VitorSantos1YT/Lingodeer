package kv;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38728b;

    public e(ArrayList arrayList, String str) {
        this.f38727a = str;
        this.f38728b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f38727a.equals(eVar.f38727a) && this.f38728b.equals(eVar.f38728b);
    }

    public final int hashCode() {
        return this.f38728b.hashCode() + (this.f38727a.hashCode() * 31);
    }

    public final String toString() {
        return "GojūonRowData(label=" + this.f38727a + ", cells=" + this.f38728b + ")";
    }
}
