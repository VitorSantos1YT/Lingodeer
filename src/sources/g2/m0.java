package g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f2.c f28585f;

    public m0(f2.c cVar) {
        this.f28585f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            return kotlin.jvm.internal.m.a(this.f28585f, ((m0) obj).f28585f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28585f.hashCode();
    }

    @Override // g2.f0
    public final f2.c p() {
        return this.f28585f;
    }
}
