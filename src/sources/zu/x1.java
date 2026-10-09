package zu;

import androidx.lifecycle.viewmodel.compose.NP.IMCc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59576a;

    public x1(boolean z11) {
        this.f59576a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1) && this.f59576a == ((x1) obj).f59576a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59576a);
    }

    public final String toString() {
        return ep.a.i(IMCc.cdqk, ")", this.f59576a);
    }
}
