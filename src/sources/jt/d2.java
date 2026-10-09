package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d2 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f36908a;

    public d2(Long l9) {
        this.f36908a = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2) && kotlin.jvm.internal.m.a(this.f36908a, ((d2) obj).f36908a);
    }

    public final int hashCode() {
        Long l9 = this.f36908a;
        if (l9 == null) {
            return 0;
        }
        return l9.hashCode();
    }

    public final String toString() {
        return "MatchSuccess(id=" + this.f36908a + ")";
    }
}
