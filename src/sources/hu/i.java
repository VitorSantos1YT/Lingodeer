package hu;

import com.lingodeer.data.model.DayStreakStatus;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DayStreakStatus f33787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f33789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33790d;

    public i(DayStreakStatus dayStreakStatus, String currentMonthYear, ArrayList arrayList, boolean z11) {
        kotlin.jvm.internal.m.f(dayStreakStatus, "dayStreakStatus");
        kotlin.jvm.internal.m.f(currentMonthYear, "currentMonthYear");
        this.f33787a = dayStreakStatus;
        this.f33788b = currentMonthYear;
        this.f33789c = arrayList;
        this.f33790d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f33787a, iVar.f33787a) && kotlin.jvm.internal.m.a(this.f33788b, iVar.f33788b) && this.f33789c.equals(iVar.f33789c) && this.f33790d == iVar.f33790d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33790d) + nv.p.b(this.f33789c, defpackage.e.d(this.f33787a.hashCode() * 31, 31, this.f33788b), 31);
    }

    public final String toString() {
        return "Success(dayStreakStatus=" + this.f33787a + ", currentMonthYear=" + this.f33788b + ", currentMonthDays=" + this.f33789c + ", canApplyStreakFreeze=" + this.f33790d + ")";
    }
}
