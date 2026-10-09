package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f28001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28002d;

    public z1(String str, String str2, Integer num, String str3) {
        this.f27999a = str;
        this.f28000b = str2;
        this.f28001c = num;
        this.f28002d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return kotlin.jvm.internal.m.a(this.f27999a, z1Var.f27999a) && kotlin.jvm.internal.m.a(this.f28000b, z1Var.f28000b) && kotlin.jvm.internal.m.a(this.f28001c, z1Var.f28001c) && kotlin.jvm.internal.m.a(this.f28002d, z1Var.f28002d);
    }

    public final int hashCode() {
        int iD = defpackage.e.d(this.f27999a.hashCode() * 31, 31, this.f28000b);
        Integer num = this.f28001c;
        return this.f28002d.hashCode() + ((iD + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("LeaderBoardSnapshot(weekName=", this.f27999a, ", className=", this.f28000b, ", rank=");
        sbS.append(this.f28001c);
        sbS.append(", region=");
        sbS.append(this.f28002d);
        sbS.append(")");
        return sbS.toString();
    }
}
