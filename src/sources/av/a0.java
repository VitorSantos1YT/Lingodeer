package av;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f3107a;

    public a0(Float f5) {
        this.f3107a = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && kotlin.jvm.internal.m.a(this.f3107a, ((a0) obj).f3107a);
    }

    public final int hashCode() {
        Float f5 = this.f3107a;
        if (f5 == null) {
            return 0;
        }
        return f5.hashCode();
    }

    public final String toString() {
        return "Downloading(progress=" + this.f3107a + ")";
    }
}
