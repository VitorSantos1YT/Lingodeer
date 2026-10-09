package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50463b;

    public u(String id2, boolean z11) {
        kotlin.jvm.internal.m.f(id2, "id");
        this.f50462a = id2;
        this.f50463b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.f50462a, uVar.f50462a) && this.f50463b == uVar.f50463b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50463b) + (this.f50462a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateFavStatus(id=" + this.f50462a + ", isFav=" + this.f50463b + ")";
    }
}
