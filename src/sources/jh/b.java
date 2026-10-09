package jh;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f36342c;

    public b(int i11, ArrayList selectedTags, boolean z11) {
        kotlin.jvm.internal.m.f(selectedTags, "selectedTags");
        this.f36340a = i11;
        this.f36341b = z11;
        this.f36342c = selectedTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f36340a == bVar.f36340a && this.f36341b == bVar.f36341b && kotlin.jvm.internal.m.a(this.f36342c, bVar.f36342c);
    }

    public final int hashCode() {
        return this.f36342c.hashCode() + defpackage.e.e(Integer.hashCode(this.f36340a) * 31, 31, this.f36341b);
    }

    public final String toString() {
        return "UiDataParams(refreshState=" + this.f36340a + ", hasPurchased=" + this.f36341b + ", selectedTags=" + this.f36342c + ")";
    }
}
