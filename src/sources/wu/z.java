package wu;

import com.lingodeer.data.model.LawInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LawInfo f55478a;

    public z(LawInfo lawInfo) {
        this.f55478a = lawInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.m.a(this.f55478a, ((z) obj).f55478a);
    }

    public final int hashCode() {
        LawInfo lawInfo = this.f55478a;
        if (lawInfo == null) {
            return 0;
        }
        return lawInfo.hashCode();
    }

    public final String toString() {
        return "OpenIdSignup(lawInfo=" + this.f55478a + ")";
    }
}
