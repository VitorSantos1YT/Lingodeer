package hu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.DayStreakWeeklyItemStatus;
import java.util.List;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f33811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f33812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f33813c;

    public o() {
        i1 i1VarC = x0.c(new qy.l(0, DayStreakWeeklyItemStatus.NOT_STREAK));
        this.f33811a = i1VarC;
        this.f33813c = x0.A(new bh.r(i1VarC, this, 8), ViewModelKt.getViewModelScope(this), a1.a(2), ry.r.f50854a);
    }

    public final void a(int i11, DayStreakWeeklyItemStatus dayStreakWeeklyItemStatus) {
        kotlin.jvm.internal.m.f(dayStreakWeeklyItemStatus, "dayStreakWeeklyItemStatus");
        qy.l lVar = new qy.l(Integer.valueOf(i11), dayStreakWeeklyItemStatus);
        i1 i1Var = this.f33811a;
        i1Var.getClass();
        i1Var.l(null, lVar);
    }
}
