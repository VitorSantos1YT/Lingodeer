package tu;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52549a;

    public d(int i11) {
        this.f52549a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f52549a == ((d) obj).f52549a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52549a);
    }

    public final String toString() {
        return p0.h(this.f52549a, "SelectedEmojiStatus(id=", ")");
    }
}
