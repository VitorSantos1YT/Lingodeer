package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f49886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f49887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f49888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f49889d;

    public ic(fz.c cVar, fz.a onFinished, float f5, boolean z11) {
        kotlin.jvm.internal.m.f(onFinished, "onFinished");
        this.f49886a = cVar;
        this.f49887b = onFinished;
        this.f49888c = f5;
        this.f49889d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic)) {
            return false;
        }
        ic icVar = (ic) obj;
        return kotlin.jvm.internal.m.a(this.f49886a, icVar.f49886a) && kotlin.jvm.internal.m.a(this.f49887b, icVar.f49887b) && Float.compare(this.f49888c, icVar.f49888c) == 0 && this.f49889d == icVar.f49889d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49889d) + defpackage.e.a((this.f49887b.hashCode() + (this.f49886a.hashCode() * 31)) * 31, this.f49888c, 31);
    }

    public final String toString() {
        return "BatchUpdate(onProgress=" + this.f49886a + ", onFinished=" + this.f49887b + ", progress=" + this.f49888c + ", finished=" + this.f49889d + ")";
    }
}
