package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8 f50291a;

    public q7(p8 filterMethod) {
        kotlin.jvm.internal.m.f(filterMethod, "filterMethod");
        this.f50291a = filterMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7) && this.f50291a == ((q7) obj).f50291a;
    }

    public final int hashCode() {
        return this.f50291a.hashCode();
    }

    public final String toString() {
        return "SelectPracticeModeChooserFilter(filterMethod=" + this.f50291a + ")";
    }
}
