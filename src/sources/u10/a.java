package u10;

import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b20.a f52726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f52727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.e f52728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f52729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f52730e;

    public a(b20.a scopeQualifier, e eVar, fz.e eVar2, b kind) {
        m.f(scopeQualifier, "scopeQualifier");
        m.f(kind, "kind");
        this.f52726a = scopeQualifier;
        this.f52727b = eVar;
        this.f52728c = eVar2;
        this.f52729d = kind;
        this.f52730e = r.f50854a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        m.d(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        a aVar = (a) obj;
        return this.f52727b.equals(aVar.f52727b) && m.a(this.f52726a, aVar.f52726a);
    }

    public final int hashCode() {
        return this.f52726a.hashCode() + (this.f52727b.hashCode() * 31);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Collection] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(this.f52729d);
        sb2.append(": '");
        sb2.append(f20.a.a(this.f52727b));
        sb2.append('\'');
        b20.b bVar = c20.b.f6511e;
        b20.a aVar = this.f52726a;
        if (!m.a(aVar, bVar)) {
            sb2.append(",scope:");
            sb2.append(aVar);
        }
        if (!this.f52730e.isEmpty()) {
            sb2.append(",binds:");
            ry.m.x0((List) this.f52730e, sb2, ",", new st.a(25), 60);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
