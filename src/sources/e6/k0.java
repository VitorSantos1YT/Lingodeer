package e6;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f24953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f24954b;

    public k0(Map map, Map map2) {
        this.f24953a = map;
        this.f24954b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.m.a(this.f24953a, k0Var.f24953a) && kotlin.jvm.internal.m.a(this.f24954b, k0Var.f24954b);
    }

    public final int hashCode() {
        return this.f24954b.hashCode() + (this.f24953a.hashCode() * 31);
    }

    public final String toString() {
        return "State(receiverToProviderName=" + this.f24953a + ", providerNameToReceivers=" + this.f24954b + ')';
    }
}
