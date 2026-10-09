package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f39331a;

    public final boolean equals(Object obj) {
        if (obj instanceof k2) {
            return kotlin.jvm.internal.m.a(this.f39331a, ((k2) obj).f39331a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39331a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f39331a + ')';
    }
}
