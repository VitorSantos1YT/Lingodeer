package tg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f52394a;

    public x0(List list) {
        this.f52394a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && this.f52394a.equals(((x0) obj).f52394a);
    }

    public final int hashCode() {
        return this.f52394a.hashCode();
    }

    public final String toString() {
        return "TableRow(cells=" + this.f52394a + ")";
    }
}
