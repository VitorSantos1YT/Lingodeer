package hc;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f32180c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh.h f32181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jh.h f32182b;

    static {
        b bVar = b.f32178a;
        f32180c = new g(bVar, bVar);
    }

    public g(jh.h hVar, jh.h hVar2) {
        this.f32181a = hVar;
        this.f32182b = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return m.a(this.f32181a, gVar.f32181a) && m.a(this.f32182b, gVar.f32182b);
    }

    public final int hashCode() {
        return this.f32182b.hashCode() + (this.f32181a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f32181a + ", height=" + this.f32182b + ')';
    }
}
