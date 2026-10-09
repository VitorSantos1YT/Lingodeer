package u3;

import g2.t;
import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52736a;

    public c(long j11) {
        this.f52736a = j11;
        if (j11 != 16) {
            return;
        }
        p3.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // u3.o
    public final float a() {
        return x.e(this.f52736a);
    }

    @Override // u3.o
    public final long b() {
        return this.f52736a;
    }

    @Override // u3.o
    public final t c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.d(this.f52736a, ((c) obj).f52736a);
    }

    public final int hashCode() {
        int i11 = x.f28623j;
        return Long.hashCode(this.f52736a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) x.j(this.f52736a)) + ')';
    }
}
