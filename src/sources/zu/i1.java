package zu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i1 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru.a f59441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f59442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz.i1 f59443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f59444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.r0 f59445e;

    public i1(ru.a aVar, vt.c cVar) {
        this.f59441a = aVar;
        this.f59442b = cVar;
        uz.i1 i1VarC = uz.x0.c(j1.f59457a);
        this.f59443c = i1VarC;
        this.f59444d = new ArrayList();
        vy.d dVar = null;
        int i11 = 1;
        uz.m0 m0VarJ = uz.x0.j(new n9.n1(new ds.e(2, 13, dVar), new bh.f0(new gp.r(new fr.c((fr.v1) aVar, dVar, i11)), 11)), i1VarC, ((vt.d) cVar).f54209t, new rt.y1(this, dVar, i11));
        yz.f fVar = rz.o0.f50940a;
        this.f59445e = uz.x0.A(uz.x0.w(m0VarJ, yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), e1.f59409a);
    }

    public static final ArrayList a(i1 i1Var, List list, ArrayList arrayList) {
        Object obj;
        LeaderBoardUser leaderBoardUserCopy$default;
        ArrayList arrayList2 = new ArrayList(ry.n.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeaderBoardUser leaderBoardUser = (LeaderBoardUser) it.next();
            int size = arrayList.size();
            int i11 = 0;
            do {
                if (i11 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i11);
                i11++;
            } while (!kotlin.jvm.internal.m.a(((LeaderBoardUser) obj).getUid(), leaderBoardUser.getUid()));
            LeaderBoardUser leaderBoardUser2 = (LeaderBoardUser) obj;
            if (leaderBoardUser2 != null && (leaderBoardUserCopy$default = LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, leaderBoardUser2.isFriend(), false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null)) != null) {
                leaderBoardUser = leaderBoardUserCopy$default;
            }
            arrayList2.add(leaderBoardUser);
        }
        return arrayList2;
    }

    public final void b(d1 d1Var) {
        uz.i1 i1Var;
        Object value;
        vy.d dVar = null;
        if (d1Var instanceof b1) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new g1(this, d1Var, dVar, 0), 3);
            return;
        }
        if (d1Var.equals(a1.f59379a)) {
            do {
                i1Var = this.f59443c;
                value = i1Var.getValue();
            } while (!i1Var.j(value, j1.f59457a));
            return;
        }
        if (d1Var instanceof z0) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new g1(this, d1Var, dVar, 1), 3);
        } else {
            if (!(d1Var instanceof c1)) {
                throw new NoWhenBranchMatchedException();
            }
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new nu.b(26, this, d1Var, dVar), 3);
        }
    }
}
