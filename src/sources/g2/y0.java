package g2;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28628a;

    public y0(long j11) {
        this.f28628a = j11;
    }

    @Override // g2.t
    public final void a(float f5, long j11, a.a aVar) {
        aVar.L(1.0f);
        long jC = this.f28628a;
        if (f5 != 1.0f) {
            jC = x.c(jC, x.e(jC) * f5);
        }
        aVar.N(jC);
        if (((Shader) aVar.f7d) != null) {
            aVar.R(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            return x.d(this.f28628a, ((y0) obj).f28628a);
        }
        return false;
    }

    public final int hashCode() {
        int i11 = x.f28623j;
        return Long.hashCode(this.f28628a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) x.j(this.f28628a)) + ')';
    }
}
