package hu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import b7.e0;
import dt.x;
import java.util.Calendar;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import rz.o0;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gu.a f33791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ur.a f33792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Calendar f33793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f33794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f33795e;

    public k(gu.a aVar, n0 n0Var, ur.a aVar2, vt.c cVar) {
        this.f33791a = aVar;
        this.f33792b = aVar2;
        Calendar calendar = Calendar.getInstance();
        this.f33793c = calendar;
        i1 i1VarC = x0.c(calendar.getTime());
        this.f33794d = i1VarC;
        vy.d dVar = null;
        no.g gVar = new no.g(x0.B(((vt.d) cVar).f54195e, new x(dVar, this, 6)), i1VarC, new x(this, dVar, 5));
        yz.f fVar = o0.f50940a;
        this.f33795e = x0.A(x0.w(gVar, yz.e.f58387a), ViewModelKt.getViewModelScope(this), a1.a(2), h.f33786a);
    }

    public final void a(g gVar) {
        boolean z11 = gVar instanceof f;
        i1 i1Var = this.f33794d;
        Calendar calendar = this.f33793c;
        if (z11) {
            calendar.add(2, -1);
            Date date = new Date(calendar.getTime().getTime());
            i1Var.getClass();
            i1Var.l(null, date);
            return;
        }
        if (!(gVar instanceof e)) {
            if (!gVar.equals(d.f33783a)) {
                throw new NoWhenBranchMatchedException();
            }
            e0.A(this.f33792b, "ep_streak_calendar_click_milestone");
        } else {
            calendar.add(2, 1);
            Date date2 = new Date(calendar.getTime().getTime());
            i1Var.getClass();
            i1Var.l(null, date2);
        }
    }
}
