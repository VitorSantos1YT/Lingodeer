package i2;

import g2.v;
import v3.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v3.c f34116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f34117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f34118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f34119d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f34116a, aVar.f34116a) && this.f34117b == aVar.f34117b && kotlin.jvm.internal.m.a(this.f34118c, aVar.f34118c) && f2.e.a(this.f34119d, aVar.f34119d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f34119d) + ((this.f34118c.hashCode() + ((this.f34117b.hashCode() + (this.f34116a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f34116a + ", layoutDirection=" + this.f34117b + ", canvas=" + this.f34118c + ", size=" + ((Object) f2.e.f(this.f34119d)) + ')';
    }
}
