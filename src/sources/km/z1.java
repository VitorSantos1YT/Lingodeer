package km;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f38331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f38333d;

    public z1(String prefix, r prefixColorToken, boolean z11, ArrayList arrayList) {
        kotlin.jvm.internal.m.f(prefix, "prefix");
        kotlin.jvm.internal.m.f(prefixColorToken, "prefixColorToken");
        this.f38330a = prefix;
        this.f38331b = prefixColorToken;
        this.f38332c = z11;
        this.f38333d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return kotlin.jvm.internal.m.a(this.f38330a, z1Var.f38330a) && this.f38331b == z1Var.f38331b && this.f38332c == z1Var.f38332c && this.f38333d.equals(z1Var.f38333d);
    }

    public final int hashCode() {
        return this.f38333d.hashCode() + defpackage.e.e((this.f38331b.hashCode() + (this.f38330a.hashCode() * 31)) * 31, 31, this.f38332c);
    }

    public final String toString() {
        return "VoicedRowData(prefix=" + this.f38330a + ", prefixColorToken=" + this.f38331b + ", showArrow=" + this.f38332c + ", cells=" + this.f38333d + ")";
    }
}
