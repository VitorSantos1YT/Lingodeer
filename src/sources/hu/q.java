package hu;

import com.lingodeer.data.model.DayStreakFinishedStatus;
import hh.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DayStreakFinishedStatus f33815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f33816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33817c;

    public q(DayStreakFinishedStatus dayStreakFinishedStatus, List dayStreakWeeklyItems, boolean z11) {
        kotlin.jvm.internal.m.f(dayStreakWeeklyItems, "dayStreakWeeklyItems");
        this.f33815a = dayStreakFinishedStatus;
        this.f33816b = dayStreakWeeklyItems;
        this.f33817c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.f33815a, qVar.f33815a) && kotlin.jvm.internal.m.a(this.f33816b, qVar.f33816b) && this.f33817c == qVar.f33817c;
    }

    public final int hashCode() {
        DayStreakFinishedStatus dayStreakFinishedStatus = this.f33815a;
        return Boolean.hashCode(this.f33817c) + p0.b((dayStreakFinishedStatus == null ? 0 : dayStreakFinishedStatus.hashCode()) * 31, 31, this.f33816b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(dayStreakFinishedStatus=");
        sb2.append(this.f33815a);
        sb2.append(", dayStreakWeeklyItems=");
        sb2.append(this.f33816b);
        sb2.append(", showDayStreakFinishScreen=");
        return p0.p(sb2, this.f33817c, ")");
    }
}
