package e00;

import java.util.List;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f24668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mz.c f24669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24670c;

    public b(h hVar, mz.c kClass) {
        kotlin.jvm.internal.m.f(kClass, "kClass");
        this.f24668a = hVar;
        this.f24669b = kClass;
        this.f24670c = hVar.f24682a + '<' + ((kotlin.jvm.internal.e) kClass).g() + '>';
    }

    @Override // e00.g
    public final String a() {
        return this.f24670c;
    }

    @Override // e00.g
    public final boolean c() {
        return false;
    }

    @Override // e00.g
    public final int d(String name) {
        kotlin.jvm.internal.m.f(name, "name");
        return this.f24668a.d(name);
    }

    @Override // e00.g
    public final o00.a e() {
        return this.f24668a.f24683b;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f24668a.equals(bVar.f24668a) && kotlin.jvm.internal.m.a(bVar.f24669b, this.f24669b);
    }

    @Override // e00.g
    public final int f() {
        return this.f24668a.f24684c;
    }

    @Override // e00.g
    public final String g(int i11) {
        return this.f24668a.f24686e[i11];
    }

    @Override // e00.g
    public final List getAnnotations() {
        return r.f50854a;
    }

    @Override // e00.g
    public final List h(int i11) {
        return this.f24668a.f24688g[i11];
    }

    public final int hashCode() {
        return this.f24670c.hashCode() + (((kotlin.jvm.internal.e) this.f24669b).hashCode() * 31);
    }

    @Override // e00.g
    public final g i(int i11) {
        return this.f24668a.f24687f[i11];
    }

    @Override // e00.g
    public final boolean isInline() {
        return false;
    }

    @Override // e00.g
    public final boolean j(int i11) {
        return this.f24668a.f24689h[i11];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f24669b + ", original: " + this.f24668a + ')';
    }
}
