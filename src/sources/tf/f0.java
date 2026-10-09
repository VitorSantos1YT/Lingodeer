package tf;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.b f52169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.h f52170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f52171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f52172d;

    public f0(re.b bVar, re.h hVar, Set set, Set set2) {
        this.f52169a = bVar;
        this.f52170b = hVar;
        this.f52171c = set;
        this.f52172d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.m.a(this.f52169a, f0Var.f52169a) && kotlin.jvm.internal.m.a(this.f52170b, f0Var.f52170b) && kotlin.jvm.internal.m.a(this.f52171c, f0Var.f52171c) && kotlin.jvm.internal.m.a(this.f52172d, f0Var.f52172d);
    }

    public final int hashCode() {
        int iHashCode = this.f52169a.hashCode() * 31;
        re.h hVar = this.f52170b;
        return this.f52172d.hashCode() + ((this.f52171c.hashCode() + ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.f52169a + ", authenticationToken=" + this.f52170b + ", recentlyGrantedPermissions=" + this.f52171c + ", recentlyDeniedPermissions=" + this.f52172d + ')';
    }
}
