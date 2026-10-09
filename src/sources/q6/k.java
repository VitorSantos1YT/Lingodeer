package q6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f47494b;

    public k(float f5, g feature) {
        kotlin.jvm.internal.m.f(feature, "feature");
        this.f47493a = f5;
        this.f47494b = feature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f47493a, kVar.f47493a) == 0 && kotlin.jvm.internal.m.a(this.f47494b, kVar.f47494b);
    }

    public final int hashCode() {
        return this.f47494b.hashCode() + (Float.hashCode(this.f47493a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.f47493a + ", feature=" + this.f47494b + ')';
    }
}
