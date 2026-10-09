package gp;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.database.model.LanguageHistoryEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.q0 f29442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.n0 f29443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.k0 f29444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.i1 f29445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.r0 f29446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29447f;

    public m(vt.q0 q0Var, vt.n0 n0Var, vt.k0 k0Var) {
        this.f29442a = q0Var;
        this.f29443b = n0Var;
        this.f29444c = k0Var;
        uz.i1 i1VarC = uz.x0.c(h.f29384a);
        this.f29445d = i1VarC;
        this.f29446e = new uz.r0(i1VarC);
        b(e.f29364a);
    }

    public static final List a(m mVar, List list, boolean z11) {
        if (z11) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int keyLanguage = ((LanguageHistoryEntity) obj).getKeyLanguage();
            if (keyLanguage != 5 && keyLanguage != 15) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void b(g gVar) {
        vy.d dVar = null;
        if (gVar.equals(e.f29364a)) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new a(this, dVar, 1), 3);
            return;
        }
        if (gVar instanceof d) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new k(this, ((d) gVar).f29358a, dVar, 0), 3);
        } else {
            if (!(gVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new k(this, ((f) gVar).f29371a, dVar, 1), 3);
        }
    }
}
