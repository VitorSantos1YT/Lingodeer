package tu;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52538c;

    public a(int i11, int i12, int i13) {
        this.f52536a = i11;
        this.f52537b = i12;
        this.f52538c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f52536a == aVar.f52536a && this.f52537b == aVar.f52537b && this.f52538c == aVar.f52538c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52538c) + defpackage.e.b(this.f52537b, Integer.hashCode(this.f52536a) * 31, 31);
    }

    public final String toString() {
        return p0.i(this.f52538c, ")", w4.c.k("EmojiResource(id=", this.f52536a, ", drawableResId=", this.f52537b, ", riveResId="));
    }
}
