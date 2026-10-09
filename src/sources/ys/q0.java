package ys;

import com.lingodeer.data.model.DayStreakFinishedStatus;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DayStreakFinishedStatus f58220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f58221b;

    public q0(DayStreakFinishedStatus dayStreakFinishStatus, List dayStreakWeeklyItems) {
        kotlin.jvm.internal.m.f(dayStreakFinishStatus, "dayStreakFinishStatus");
        kotlin.jvm.internal.m.f(dayStreakWeeklyItems, "dayStreakWeeklyItems");
        this.f58220a = dayStreakFinishStatus;
        this.f58221b = dayStreakWeeklyItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.m.a(this.f58220a, q0Var.f58220a) && kotlin.jvm.internal.m.a(this.f58221b, q0Var.f58221b);
    }

    public final int hashCode() {
        return this.f58221b.hashCode() + (this.f58220a.hashCode() * 31);
    }

    public final String toString() {
        return "Streak(dayStreakFinishStatus=" + this.f58220a + ", dayStreakWeeklyItems=" + this.f58221b + ")";
    }
}
