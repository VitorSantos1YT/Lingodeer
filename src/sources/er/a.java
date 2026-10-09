package er;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f25743d;

    public a(String str, String str2, String source, Map map) {
        kotlin.jvm.internal.m.f(source, "source");
        this.f25740a = str;
        this.f25741b = str2;
        this.f25742c = source;
        this.f25743d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f25740a, aVar.f25740a) && kotlin.jvm.internal.m.a(this.f25741b, aVar.f25741b) && kotlin.jvm.internal.m.a(this.f25742c, aVar.f25742c) && kotlin.jvm.internal.m.a(this.f25743d, aVar.f25743d);
    }

    public final int hashCode() {
        return this.f25743d.hashCode() + defpackage.e.d(defpackage.e.d(this.f25740a.hashCode() * 31, 31, this.f25741b), 31, this.f25742c);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("NotificationContent(title=", this.f25740a, ", body=", this.f25741b, ", source=");
        sbS.append(this.f25742c);
        sbS.append(", extras=");
        sbS.append(this.f25743d);
        sbS.append(")");
        return sbS.toString();
    }
}
