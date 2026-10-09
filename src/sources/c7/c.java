package c7;

import y6.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6646a;

    public c(int i11) {
        this.f6646a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f6646a == ((c) obj).f6646a;
    }

    public final int hashCode() {
        return this.f6646a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f6646a;
    }
}
