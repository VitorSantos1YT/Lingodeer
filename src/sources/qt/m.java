package qt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends android.support.v4.media.session.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f48334a;

    public m(Object obj) {
        this.f48334a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && kotlin.jvm.internal.m.a(this.f48334a, ((m) obj).f48334a);
    }

    public final int hashCode() {
        Object obj = this.f48334a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.f48334a + ")";
    }
}
