package cu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22522b;

    public i(String str, long j11) {
        this.f22521a = str;
        this.f22522b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f22521a, iVar.f22521a) && this.f22522b == iVar.f22522b;
    }

    public final int hashCode() {
        String str = this.f22521a;
        return Long.hashCode(this.f22522b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.google.android.material.datepicker.d.m(this.f22522b, "FailedUpdate(token=", this.f22521a, ", nextRetryAtMillis=");
        sbM.append(")");
        return sbM.toString();
    }
}
