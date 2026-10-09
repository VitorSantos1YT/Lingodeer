package mt;

import rt.je;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q6 implements r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je f41814a;

    public q6(je jeVar) {
        this.f41814a = jeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6) && this.f41814a == ((q6) obj).f41814a;
    }

    public final int hashCode() {
        return this.f41814a.hashCode();
    }

    public final String toString() {
        return "Preset(range=" + this.f41814a + ")";
    }
}
