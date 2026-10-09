package g3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qy.e f28635b;

    public a(String str, qy.e eVar) {
        this.f28634a = str;
        this.f28635b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f28634a, aVar.f28634a) && kotlin.jvm.internal.m.a(this.f28635b, aVar.f28635b);
    }

    public final int hashCode() {
        String str = this.f28634a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        qy.e eVar = this.f28635b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f28634a + ", action=" + this.f28635b + ')';
    }
}
