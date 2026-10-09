package g00;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n1 implements e00.g, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00.g f28441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f28443c;

    public n1(e00.g original) {
        kotlin.jvm.internal.m.f(original, "original");
        this.f28441a = original;
        this.f28442b = original.a() + '?';
        this.f28443c = d1.b(original);
    }

    @Override // e00.g
    public final String a() {
        return this.f28442b;
    }

    @Override // g00.l
    public final Set b() {
        return this.f28443c;
    }

    @Override // e00.g
    public final boolean c() {
        return true;
    }

    @Override // e00.g
    public final int d(String name) {
        kotlin.jvm.internal.m.f(name, "name");
        return this.f28441a.d(name);
    }

    @Override // e00.g
    public final o00.a e() {
        return this.f28441a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n1) {
            return kotlin.jvm.internal.m.a(this.f28441a, ((n1) obj).f28441a);
        }
        return false;
    }

    @Override // e00.g
    public final int f() {
        return this.f28441a.f();
    }

    @Override // e00.g
    public final String g(int i11) {
        return this.f28441a.g(i11);
    }

    @Override // e00.g
    public final List getAnnotations() {
        return this.f28441a.getAnnotations();
    }

    @Override // e00.g
    public final List h(int i11) {
        return this.f28441a.h(i11);
    }

    public final int hashCode() {
        return this.f28441a.hashCode() * 31;
    }

    @Override // e00.g
    public final e00.g i(int i11) {
        return this.f28441a.i(i11);
    }

    @Override // e00.g
    public final boolean isInline() {
        return this.f28441a.isInline();
    }

    @Override // e00.g
    public final boolean j(int i11) {
        return this.f28441a.j(i11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f28441a);
        sb2.append('?');
        return sb2.toString();
    }
}
