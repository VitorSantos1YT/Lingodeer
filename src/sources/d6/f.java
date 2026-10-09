package d6;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f23204a;

    public f(LinkedHashMap linkedHashMap) {
        this.f23204a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f23204a.equals(((f) obj).f23204a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23204a.hashCode();
    }

    public final String toString() {
        return this.f23204a.toString();
    }
}
