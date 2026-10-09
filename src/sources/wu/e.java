package wu;

import com.lingodeer.data.model.LoginHistory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginHistory f55385a;

    public e(LoginHistory loginHistory) {
        kotlin.jvm.internal.m.f(loginHistory, "loginHistory");
        this.f55385a = loginHistory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.m.a(this.f55385a, ((e) obj).f55385a);
    }

    public final int hashCode() {
        return this.f55385a.hashCode();
    }

    public final String toString() {
        return "DeleteHistory(loginHistory=" + this.f55385a + ")";
    }
}
