package iw;

import kotlin.jvm.internal.m;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
final class c extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f34887a;

    public c(fz.c onStateChanged) {
        m.f(onStateChanged, "onStateChanged");
        this.f34887a = onStateChanged;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && m.a(this.f34887a, ((c) obj).f34887a);
    }

    @Override // y2.d1
    public final q f() {
        return new b(this.f34887a);
    }

    public final int hashCode() {
        return this.f34887a.hashCode() + (Integer.hashCode(25) * 31);
    }

    @Override // y2.d1
    public final void j(q qVar) {
        b node = (b) qVar;
        m.f(node, "node");
    }

    public final String toString() {
        return "CloudyModifierNodeElement(radius=25, onStateChanged=" + this.f34887a + ')';
    }
}
