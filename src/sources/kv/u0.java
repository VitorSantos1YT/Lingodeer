package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f38820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38822c;

    public u0(y0 key, List args, boolean z11) {
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(args, "args");
        this.f38820a = key;
        this.f38821b = args;
        this.f38822c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f38820a == u0Var.f38820a && kotlin.jvm.internal.m.a(this.f38821b, u0Var.f38821b) && this.f38822c == u0Var.f38822c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38822c) + hh.p0.b(this.f38820a.hashCode() * 31, 31, this.f38821b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(key=");
        sb2.append(this.f38820a);
        sb2.append(", args=");
        sb2.append(this.f38821b);
        sb2.append(", convertKanaToKatakana=");
        return hh.p0.p(sb2, this.f38822c, ")");
    }
}
