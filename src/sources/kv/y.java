package kv;

import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f38834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f38835d;

    public y(String title, String body, ArrayList arrayList, ArrayList arrayList2) {
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(body, "body");
        this.f38832a = title;
        this.f38833b = body;
        this.f38834c = arrayList;
        this.f38835d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.m.a(this.f38832a, yVar.f38832a) && kotlin.jvm.internal.m.a(this.f38833b, yVar.f38833b) && this.f38834c.equals(yVar.f38834c) && this.f38835d.equals(yVar.f38835d);
    }

    public final int hashCode() {
        return this.f38835d.hashCode() + nv.p.b(this.f38834c, defpackage.e.d(this.f38832a.hashCode() * 31, 31, this.f38833b), 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("JPIntroSection(title=", this.f38832a, ", body=", this.f38833b, bjXGJ.IzzdFQE);
        sbS.append(this.f38834c);
        sbS.append(", blocks=");
        sbS.append(this.f38835d);
        sbS.append(")");
        return sbS.toString();
    }
}
