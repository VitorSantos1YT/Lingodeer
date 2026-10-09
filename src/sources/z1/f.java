package z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f58470a;

    public f(float f5) {
        this.f58470a = f5;
    }

    @Override // z1.d
    public final int a(int i11, int i12, v3.m mVar) {
        return Math.round((1 + this.f58470a) * ((i12 - i11) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f58470a, ((f) obj).f58470a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58470a);
    }

    public final String toString() {
        return defpackage.e.o(new StringBuilder("Horizontal(bias="), this.f58470a, ')');
    }
}
