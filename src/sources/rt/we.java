package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class we implements ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50598b;

    public we(String str, int i11) {
        this.f50597a = str;
        this.f50598b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return kotlin.jvm.internal.m.a(this.f50597a, weVar.f50597a) && this.f50598b == weVar.f50598b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50598b) + (this.f50597a.hashCode() * 31);
    }

    public final String toString() {
        return "Ready(filePath=" + this.f50597a + ", unitSortIndex=" + this.f50598b + ")";
    }
}
