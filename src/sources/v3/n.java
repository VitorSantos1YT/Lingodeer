package v3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements w3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f53499a;

    public n(float f5) {
        this.f53499a = f5;
    }

    @Override // w3.a
    public final float a(float f5) {
        return f5 / this.f53499a;
    }

    @Override // w3.a
    public final float b(float f5) {
        return f5 * this.f53499a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Float.compare(this.f53499a, ((n) obj).f53499a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f53499a);
    }

    public final String toString() {
        return defpackage.e.o(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f53499a, ')');
    }
}
