package qu;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48351c;

    public c(int i11, int i12, int i13) {
        this.f48349a = i11;
        this.f48350b = i12;
        this.f48351c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f48349a == cVar.f48349a && this.f48350b == cVar.f48350b && this.f48351c == cVar.f48351c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48351c) + defpackage.e.b(this.f48350b, Integer.hashCode(this.f48349a) * 31, 31);
    }

    public final String toString() {
        return p0.i(this.f48351c, ")", w4.c.k("EmojiDisplayResource(id=", this.f48349a, ", drawableRes=", this.f48350b, ", riveRes="));
    }
}
