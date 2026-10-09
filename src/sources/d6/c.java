package d6;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23203a;

    public c(String str) {
        this.f23203a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return m.a(this.f23203a, ((c) obj).f23203a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23203a.hashCode();
    }

    public final String toString() {
        return this.f23203a;
    }
}
