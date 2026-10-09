package ob;

import fb.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0 f44830b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f44829a, nVar.f44829a) && this.f44830b == nVar.f44830b;
    }

    public final int hashCode() {
        return this.f44830b.hashCode() + (this.f44829a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f44829a + ", state=" + this.f44830b + ')';
    }
}
