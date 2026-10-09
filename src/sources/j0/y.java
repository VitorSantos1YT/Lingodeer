package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z1.d f35436j;

    public y(z1.h hVar) {
        this.f35436j = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && kotlin.jvm.internal.m.a(this.f35436j, ((y) obj).f35436j);
    }

    public final int hashCode() {
        return this.f35436j.hashCode();
    }

    @Override // j0.c
    public final int i(int i11, v3.m mVar) {
        return this.f35436j.a(0, i11, mVar);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f35436j + ')';
    }
}
