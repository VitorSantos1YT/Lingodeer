package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements y1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f39511a;

    public y(v vVar) {
        this.f39511a = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return kotlin.jvm.internal.m.a(this.f39511a, ((y) obj).f39511a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39511a.hashCode() * 31;
    }
}
