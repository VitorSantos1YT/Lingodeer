package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.d f30138b;

    public d4(u8 u8Var, t1.d dVar) {
        this.f30137a = u8Var;
        this.f30138b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return kotlin.jvm.internal.m.a(this.f30137a, d4Var.f30137a) && this.f30138b.equals(d4Var.f30138b);
    }

    public final int hashCode() {
        Object obj = this.f30137a;
        return this.f30138b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f30137a + ", transition=" + this.f30138b + ')';
    }
}
