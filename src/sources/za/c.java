package za;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya.b f59059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f59060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f59061c;

    public c(ya.b bVar, b bVar2, b bVar3) {
        this.f59059a = bVar;
        this.f59060b = bVar2;
        this.f59061c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f57542a != 0 && bVar.f57543b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean a() {
        b bVar = b.f59056i;
        b bVar2 = this.f59060b;
        if (kotlin.jvm.internal.m.a(bVar2, bVar)) {
            return true;
        }
        return kotlin.jvm.internal.m.a(bVar2, b.f59055h) && kotlin.jvm.internal.m.a(this.f59061c, b.f59054g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f59059a, cVar.f59059a) && kotlin.jvm.internal.m.a(this.f59060b, cVar.f59060b) && kotlin.jvm.internal.m.a(this.f59061c, cVar.f59061c);
    }

    public final int hashCode() {
        return this.f59061c.hashCode() + ((this.f59060b.hashCode() + (this.f59059a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f59059a + ", type=" + this.f59060b + ", state=" + this.f59061c + " }";
    }
}
