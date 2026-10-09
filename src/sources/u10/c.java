package u10;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x10.a f52731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v10.b f52732b;

    public c(x10.a module, v10.b bVar) {
        m.f(module, "module");
        this.f52731a = module;
        this.f52732b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.f52731a, cVar.f52731a) && m.a(this.f52732b, cVar.f52732b);
    }

    public final int hashCode() {
        return this.f52732b.hashCode() + (this.f52731a.f55747a.hashCode() * 31);
    }

    public final String toString() {
        return "KoinDefinition(module=" + this.f52731a + ", factory=" + this.f52732b + ')';
    }
}
