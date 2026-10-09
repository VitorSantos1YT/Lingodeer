package ob;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f44802b;

    public d(String str, Long l9) {
        this.f44801a = str;
        this.f44802b = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f44801a, dVar.f44801a) && kotlin.jvm.internal.m.a(this.f44802b, dVar.f44802b);
    }

    public final int hashCode() {
        int iHashCode = this.f44801a.hashCode() * 31;
        Long l9 = this.f44802b;
        return iHashCode + (l9 == null ? 0 : l9.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f44801a + ", value=" + this.f44802b + ')';
    }
}
