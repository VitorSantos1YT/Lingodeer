package tg;

import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f52255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.c f52257d;

    public c() {
        long jA = j3.A(6);
        long jA2 = j3.A(3);
        long jA3 = j3.A(6);
        this.f52254a = jA;
        this.f52255b = jA2;
        this.f52256c = jA3;
        this.f52257d = b.f52253a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return v3.o.a(this.f52254a, cVar.f52254a) && v3.o.a(this.f52255b, cVar.f52255b) && v3.o.a(this.f52256c, cVar.f52256c) && kotlin.jvm.internal.m.a(this.f52257d, cVar.f52257d);
    }

    public final int hashCode() {
        v3.p[] pVarArr = v3.o.f53500b;
        return this.f52257d.hashCode() + defpackage.e.f(this.f52256c, defpackage.e.f(this.f52255b, Long.hashCode(this.f52254a) * 31, 31), 31);
    }

    public final String toString() {
        String strF = v3.o.f(this.f52254a);
        String strF2 = v3.o.f(this.f52255b);
        String strF3 = v3.o.f(this.f52256c);
        StringBuilder sbS = defpackage.e.s("BarGutter(startMargin=", strF, ", barWidth=", strF2, ", endMargin=");
        sbS.append(strF3);
        sbS.append(", color=");
        sbS.append(this.f52257d);
        sbS.append(")");
        return sbS.toString();
    }
}
