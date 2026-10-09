package kv;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f38712d;

    public b(String str, boolean z11, boolean z12, ArrayList arrayList) {
        this.f38709a = str;
        this.f38710b = z11;
        this.f38711c = z12;
        this.f38712d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f38709a.equals(bVar.f38709a) && this.f38710b == bVar.f38710b && this.f38711c == bVar.f38711c && this.f38712d.equals(bVar.f38712d);
    }

    public final int hashCode() {
        return this.f38712d.hashCode() + defpackage.e.e(defpackage.e.e(this.f38709a.hashCode() * 31, 31, this.f38710b), 31, this.f38711c);
    }

    public final String toString() {
        return "DakuonRowData(consonant=" + this.f38709a + ", highlight=" + this.f38710b + ", pointsToNext=" + this.f38711c + ", cells=" + this.f38712d + ")";
    }
}
