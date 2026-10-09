package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z1.i f35444j;

    public z(z1.i iVar) {
        this.f35444j = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.m.a(this.f35444j, ((z) obj).f35444j);
    }

    public final int hashCode() {
        return Float.hashCode(this.f35444j.f58473a);
    }

    @Override // j0.c
    public final int i(int i11, v3.m mVar) {
        return this.f35444j.a(0, i11);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f35444j + ')';
    }
}
