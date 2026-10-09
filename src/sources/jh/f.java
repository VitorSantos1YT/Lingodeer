package jh;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import dt.x;
import fr.x4;
import java.util.ArrayList;
import rz.e0;
import uz.i1;
import uz.m0;
import uz.w0;
import uz.x0;
import vt.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh.e f36350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f36351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f36352c;

    public f(fh.e eVar, h1 h1Var) {
        this.f36350a = eVar;
        new ArrayList();
        new ArrayList();
        int[] iArr = bq.r.f4959a;
        i1 i1VarC = x0.c(Integer.valueOf(bq.m.G() ? 1 : 0));
        vy.d dVar = null;
        x0.c(null);
        Boolean bool = Boolean.FALSE;
        x0.c(bool);
        x0.c(bool);
        x0.c(bool);
        i1 i1VarC2 = x0.c(new ArrayList());
        w0 w0VarB = x0.b(0, 6, null);
        this.f36351b = w0VarB;
        this.f36352c = x0.c(c.f36343a);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new gp.a(this, dVar, 12), 3);
        n9.m.a(x0.B(x0.o(new m0(new uz.i[]{i1VarC, ((x4) h1Var).f27974g, x0.o(x0.n(i1VarC2, 100L)), new gp.r(w0VarB, 1)}, new d(5, null))), new x(dVar, this, 7)), ViewModelKt.getViewModelScope(this));
    }
}
