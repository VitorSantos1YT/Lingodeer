package b0;

import com.google.logging.type.LogSeverity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f3568c;

    public i2(int i11, z zVar, int i12) {
        this((i12 & 1) != 0 ? LogSeverity.NOTICE_VALUE : i11, 0, (i12 & 4) != 0 ? b0.f3438a : zVar);
    }

    @Override // b0.m
    public final l2 a(j2 j2Var) {
        return new b.a(this.f3566a, this.f3567b, this.f3568c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i2) {
            i2 i2Var = (i2) obj;
            if (i2Var.f3566a == this.f3566a && i2Var.f3567b == this.f3567b && kotlin.jvm.internal.m.a(i2Var.f3568c, this.f3568c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3568c.hashCode() + (this.f3566a * 31)) * 31) + this.f3567b;
    }

    @Override // b0.y, b0.m
    public final n2 a(j2 j2Var) {
        return new b.a(this.f3566a, this.f3567b, this.f3568c);
    }

    public i2(int i11, int i12, z zVar) {
        this.f3566a = i11;
        this.f3567b = i12;
        this.f3568c = zVar;
    }
}
