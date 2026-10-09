package ht;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ry.r f33745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f33746f;

    /* JADX WARN: Illegal instructions before constructor call */
    public j() {
        ry.r rVar = ry.r.f50854a;
        super(ns.o.K(rVar), 0, 1.0f);
        this.f33745e = rVar;
        this.f33746f = 1.0f;
    }

    @Override // ht.l
    public final int a() {
        return 0;
    }

    @Override // ht.l
    public final float c() {
        return this.f33746f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f33745e, jVar.f33745e) && Float.compare(this.f33746f, jVar.f33746f) == 0;
    }

    public final int hashCode() {
        this.f33745e.getClass();
        return Float.hashCode(this.f33746f) + ((Integer.hashCode(0) + 31) * 31);
    }

    public final String toString() {
        return "PlayingVideo(visemedMap=" + this.f33745e + ", currentIndex=0, speed=" + this.f33746f + ")";
    }
}
