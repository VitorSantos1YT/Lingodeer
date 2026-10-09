package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0.e f31241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0.e f31242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0.e f31243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0.e f31244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0.e f31245e;

    public w7() {
        r0.e eVar = v7.f31196a;
        r0.e eVar2 = v7.f31197b;
        r0.e eVar3 = v7.f31198c;
        r0.e eVar4 = v7.f31199d;
        r0.e eVar5 = v7.f31200e;
        this.f31241a = eVar;
        this.f31242b = eVar2;
        this.f31243c = eVar3;
        this.f31244d = eVar4;
        this.f31245e = eVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        return kotlin.jvm.internal.m.a(this.f31241a, w7Var.f31241a) && kotlin.jvm.internal.m.a(this.f31242b, w7Var.f31242b) && kotlin.jvm.internal.m.a(this.f31243c, w7Var.f31243c) && kotlin.jvm.internal.m.a(this.f31244d, w7Var.f31244d) && kotlin.jvm.internal.m.a(this.f31245e, w7Var.f31245e);
    }

    public final int hashCode() {
        return this.f31245e.hashCode() + ((this.f31244d.hashCode() + ((this.f31243c.hashCode() + ((this.f31242b.hashCode() + (this.f31241a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f31241a + ", small=" + this.f31242b + ", medium=" + this.f31243c + ", large=" + this.f31244d + ", extraLarge=" + this.f31245e + ')';
    }
}
