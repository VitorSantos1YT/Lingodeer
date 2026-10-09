package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class wb implements cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50590c;

    public wb(long j11, boolean z11, boolean z12) {
        this.f50588a = z11;
        this.f50589b = j11;
        this.f50590c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb)) {
            return false;
        }
        wb wbVar = (wb) obj;
        return this.f50588a == wbVar.f50588a && this.f50589b == wbVar.f50589b && this.f50590c == wbVar.f50590c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50590c) + defpackage.e.f(this.f50589b, Boolean.hashCode(this.f50588a) * 31, 31);
    }

    public final String toString() {
        return "OnChecked(result=" + this.f50588a + ", unitId=" + this.f50589b + ", increaseCombo=" + this.f50590c + ")";
    }

    public /* synthetic */ wb(boolean z11) {
        this(-1L, z11, z11);
    }
}
