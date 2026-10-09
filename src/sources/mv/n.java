package mv;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import rt.eb;
import uz.a1;
import uz.i1;
import uz.q0;
import uz.r0;
import uz.w0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends ViewModel {
    public final r0 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av.n f42251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv.c f42252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.b f42253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f42254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f42255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w0 f42256f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q0 f42257t;

    public n(av.n nVar, fv.c cVar, vt.b bVar) {
        this.f42251a = nVar;
        this.f42252b = cVar;
        this.f42253c = bVar;
        i1 i1VarC = x0.c(BuildConfig.VERSION_NAME);
        this.f42254d = i1VarC;
        i1 i1VarC2 = x0.c(eb.f49693a);
        this.f42255e = i1VarC2;
        w0 w0VarB = x0.b(0, 7, null);
        this.f42256f = w0VarB;
        this.f42257t = new q0(w0VarB);
        this.H = x0.A(new no.g(i1VarC, i1VarC2, new m(3, 0, null)), ViewModelKt.getViewModelScope(this), a1.a(2), i.f42215a);
    }

    public final void a(h hVar) {
        Object next;
        if (hVar instanceof f) {
            b(((f) hVar).f42204a);
            return;
        }
        if (hVar instanceof d) {
            b(((d) hVar).f42194a);
            return;
        }
        boolean z11 = hVar instanceof e;
        i1 i1Var = this.f42254d;
        av.n nVar = this.f42251a;
        vy.d dVar = null;
        if (!z11) {
            if (hVar instanceof g) {
                rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new ar.b(this, ((g) hVar).f42208a, dVar, 3), 3);
                return;
            } else if (hVar.equals(b.f42191a)) {
                rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new l(this, dVar, 1), 3);
                return;
            } else {
                if (!hVar.equals(c.f42192a)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar.n();
                i1Var.getClass();
                i1Var.l(null, BuildConfig.VERSION_NAME);
                return;
            }
        }
        long j11 = ((e) hVar).f42203a;
        nVar.a();
        nVar.f3172c = new dm.a(this, 26);
        Iterator it = r.c(j11).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!com.google.android.material.datepicker.d.D((String) next));
        String strY = (String) next;
        if (strY == null) {
            strY = fv.b.Y(j11, null, null);
        }
        nVar.h(strY);
        i1Var.k("word:" + j11);
    }

    public final void b(String str) {
        String strX = se.k.x(str);
        if (oz.q.K0(strX)) {
            return;
        }
        av.n nVar = this.f42251a;
        nVar.a();
        nVar.f3172c = new dm.a(this, 26);
        qy.q qVar = fv.b.f28186a;
        nVar.h(fv.b.c(strX, null, null));
        i1 i1Var = this.f42254d;
        i1Var.getClass();
        i1Var.l(null, str);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f42251a.b();
    }
}
