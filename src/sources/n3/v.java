package n3;

import lf.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0 f43183f;

    public v(x0 x0Var) {
        this.f43183f = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f43183f.equals(((v) obj).f43183f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43183f.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f43183f + ')';
    }
}
