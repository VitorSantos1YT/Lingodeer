package tu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.adjust.sdk.Constants;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import java.util.Calendar;
import km.s0;
import n9.n1;
import rz.o0;
import uz.i1;
import uz.x0;
import vt.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends ViewModel {
    public final i1 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.c f52603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f52604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.n0 f52605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ru.a f52606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f52607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1 f52608f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i1 f52609t;

    public m0(vt.c cVar, h1 h1Var, vt.n0 n0Var, ru.a aVar) {
        this.f52603a = cVar;
        this.f52604b = h1Var;
        this.f52605c = n0Var;
        this.f52606d = aVar;
        i1 i1VarC = x0.c(LeaderBoardUiState.Loading.INSTANCE);
        this.f52608f = i1VarC;
        this.f52609t = i1VarC;
        i1 i1VarC2 = x0.c(new qy.l(0L, 0L));
        this.H = i1VarC2;
        int i11 = 1;
        int i12 = 0;
        uz.i[] iVarArr = {((vt.d) cVar).f54199i};
        int i13 = uz.a0.f53253a;
        vy.d dVar = null;
        x0.y(new n1(new uz.e(iVarArr.length == 0 ? ry.r.f50854a : new e00.j(iVarArr, 2), vy.j.f54321a, -2, tz.a.SUSPEND), new s0(this, dVar, 13), 5), ViewModelKt.getViewModelScope(this));
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, dVar, i12), 3);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, dVar, i11), 3);
        Calendar calendar = Calendar.getInstance();
        Object objClone = calendar.clone();
        kotlin.jvm.internal.m.d(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) objClone;
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        int i14 = (9 - calendar2.get(7)) % 7;
        calendar2.add(6, i14 != 0 ? i14 : 7);
        this.f52607e = new s(calendar2, calendar, this, calendar2.getTimeInMillis(), 1);
        long timeInMillis = calendar2.getTimeInMillis() - calendar.getTimeInMillis();
        long j11 = 86400000;
        i1VarC2.l(null, new qy.l(Long.valueOf(timeInMillis / j11), Long.valueOf((timeInMillis % j11) / ((long) Constants.ONE_HOUR))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(m0 m0Var, xy.c cVar) {
        j0 j0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i11 = j0Var.f52593c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j0Var.f52593c = i11 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(m0Var, cVar);
            }
        } else {
            j0Var = new j0(m0Var, cVar);
        }
        Object obj = j0Var.f52591a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = j0Var.f52593c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            yz.f fVar = o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            k0 k0Var = new k0(m0Var, null);
            j0Var.f52593c = 1;
            if (rz.e0.M(eVar, k0Var, j0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        m0Var.c();
        return qy.b0.f48488a;
    }

    public final void b(r rVar) {
        rVar.toString();
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new sr.d(5, rVar, this, null), 3);
    }

    public final void c() {
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, null, 2), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        s sVar = this.f52607e;
        if (sVar != null) {
            sVar.cancel();
        }
    }
}
