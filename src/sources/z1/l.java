package z1;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f58477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f58478b;

    public l(r rVar, r rVar2) {
        this.f58477a = rVar;
        this.f58478b = rVar2;
    }

    @Override // z1.r
    public final Object a(Object obj, fz.e eVar) {
        return this.f58478b.a(this.f58477a.a(obj, eVar), eVar);
    }

    @Override // z1.r
    public final boolean c(fz.c cVar) {
        return this.f58477a.c(cVar) && this.f58478b.c(cVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.f58477a, lVar.f58477a) && kotlin.jvm.internal.m.a(this.f58478b, lVar.f58478b);
    }

    public final int hashCode() {
        return (this.f58478b.hashCode() * 31) + this.f58477a.hashCode();
    }

    public final String toString() {
        return p0.o(new StringBuilder("["), (String) a(BuildConfig.VERSION_NAME, k.f58476a), ']');
    }
}
