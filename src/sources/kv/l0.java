package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f38777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38780d;

    public l0(m0 type, String str, String str2, List list) {
        kotlin.jvm.internal.m.f(type, "type");
        this.f38777a = type;
        this.f38778b = str;
        this.f38779c = str2;
        this.f38780d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f38777a == l0Var.f38777a && kotlin.jvm.internal.m.a(this.f38778b, l0Var.f38778b) && kotlin.jvm.internal.m.a(this.f38779c, l0Var.f38779c) && kotlin.jvm.internal.m.a(this.f38780d, l0Var.f38780d);
    }

    public final int hashCode() {
        return this.f38780d.hashCode() + defpackage.e.d(defpackage.e.d(this.f38777a.hashCode() * 31, 31, this.f38778b), 31, this.f38779c);
    }

    public final String toString() {
        return "JPSyllableModel(type=" + this.f38777a + ", character=" + this.f38778b + ", romanization=" + this.f38779c + ", options=" + this.f38780d + ")";
    }
}
