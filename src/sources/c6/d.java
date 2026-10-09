package c6;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f6614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f6615b;

    public d(l lVar, l lVar2) {
        this.f6614a = lVar;
        this.f6615b = lVar2;
    }

    @Override // c6.l
    public final Object a(Object obj, fz.e eVar) {
        return this.f6615b.a(this.f6614a.a(obj, eVar), eVar);
    }

    @Override // c6.l
    public final boolean b(fz.c cVar) {
        return this.f6614a.b(cVar) || this.f6615b.b(cVar);
    }

    @Override // c6.l
    public final boolean c() {
        return this.f6614a.c() && this.f6615b.c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f6614a, dVar.f6614a) && kotlin.jvm.internal.m.a(this.f6615b, dVar.f6615b);
    }

    public final int hashCode() {
        return (this.f6615b.hashCode() * 31) + this.f6614a.hashCode();
    }

    public final String toString() {
        return p0.o(new StringBuilder("["), (String) a(BuildConfig.VERSION_NAME, c.f6607b), ']');
    }
}
