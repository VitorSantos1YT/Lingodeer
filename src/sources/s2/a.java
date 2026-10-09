package s2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51281b;

    public a(int i11) {
        this.f51281b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f51281b == ((a) obj).f51281b;
    }

    public final int hashCode() {
        return this.f51281b;
    }

    public final String toString() {
        return ep.a.j(new StringBuilder("AndroidPointerIcon(type="), this.f51281b, ')');
    }
}
