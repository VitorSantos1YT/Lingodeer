package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c2 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f36902a;

    public c2(Long l9) {
        this.f36902a = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2) && kotlin.jvm.internal.m.a(this.f36902a, ((c2) obj).f36902a);
    }

    public final int hashCode() {
        Long l9 = this.f36902a;
        if (l9 == null) {
            return 0;
        }
        return l9.hashCode();
    }

    public final String toString() {
        return "MatchFiled(id=" + this.f36902a + ")";
    }
}
