package lf;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f40118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f40119b;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof s0)) {
            s0 s0Var = (s0) obj;
            if (s0Var.f40118a == this.f40118a && s0Var.f40119b == this.f40119b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40119b.hashCode() + ((this.f40118a.hashCode() + 1073) * 37);
    }
}
