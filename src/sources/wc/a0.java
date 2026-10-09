package wc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f54933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f54934b;

    public a0(h hVar) {
        this.f54933a = hVar;
        this.f54934b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        h hVar = this.f54933a;
        if (hVar != null && hVar.equals(a0Var.f54933a)) {
            return true;
        }
        Throwable th2 = this.f54934b;
        if (th2 == null || a0Var.f54934b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54933a, this.f54934b});
    }

    public a0(Throwable th2) {
        this.f54934b = th2;
        this.f54933a = null;
    }
}
