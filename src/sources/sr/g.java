package sr;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f51766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f51767b;

    public g(List achievementRecords, List achievements) {
        m.f(achievementRecords, "achievementRecords");
        m.f(achievements, "achievements");
        this.f51766a = achievementRecords;
        this.f51767b = achievements;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return m.a(this.f51766a, gVar.f51766a) && m.a(this.f51767b, gVar.f51767b);
    }

    public final int hashCode() {
        return this.f51767b.hashCode() + (this.f51766a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(achievementRecords=" + this.f51766a + ", achievements=" + this.f51767b + ")";
    }
}
