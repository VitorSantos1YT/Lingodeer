package u3;

import g2.t;
import g2.u0;
import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f52734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f52735b;

    public b(u0 u0Var, float f5) {
        this.f52734a = u0Var;
        this.f52735b = f5;
    }

    @Override // u3.o
    public final float a() {
        return this.f52735b;
    }

    @Override // u3.o
    public final long b() {
        int i11 = x.f28623j;
        return x.f28622i;
    }

    @Override // u3.o
    public final t c() {
        return this.f52734a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.f52734a, bVar.f52734a) && Float.compare(this.f52735b, bVar.f52735b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f52735b) + (this.f52734a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f52734a);
        sb2.append(", alpha=");
        return defpackage.e.o(sb2, this.f52735b, ')');
    }
}
