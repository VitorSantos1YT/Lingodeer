package qt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends android.support.v4.media.session.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ve.i f48333a;

    public l(ve.i iVar) {
        this.f48333a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && kotlin.jvm.internal.m.a(this.f48333a, ((l) obj).f48333a);
    }

    public final int hashCode() {
        return this.f48333a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f48333a + ")";
    }
}
