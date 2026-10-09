package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f43700a;

    public t1(Throwable throwable) {
        kotlin.jvm.internal.m.f(throwable, "throwable");
        this.f43700a = throwable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && kotlin.jvm.internal.m.a(this.f43700a, ((t1) obj).f43700a);
    }

    public final int hashCode() {
        return this.f43700a.hashCode();
    }

    public final String toString() {
        return oz.r.h0("LoadResult.Error(\n                    |   throwable: " + this.f43700a + "\n                    |) ");
    }
}
