package js;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import rz.e0;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.g0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends ViewModel {
    public final r0 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f36770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f36771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f36772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f36773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f36774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f36775f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i1 f36776t;

    public i(g0 g0Var, vt.c cVar, n0 n0Var) {
        this.f36770a = g0Var;
        this.f36771b = cVar;
        i1 i1VarC = x0.c(null);
        this.f36772c = i1VarC;
        this.f36773d = new r0(i1VarC);
        i1 i1VarC2 = x0.c(null);
        this.f36774e = i1VarC2;
        this.f36775f = new r0(i1VarC2);
        i1 i1VarC3 = x0.c(Boolean.FALSE);
        this.f36776t = i1VarC3;
        this.H = new r0(i1VarC3);
    }

    public final void a(ChineseToneLesson lesson) {
        kotlin.jvm.internal.m.f(lesson, "lesson");
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new h(this, lesson, null), 3);
    }

    public final void b(ChineseToneLesson lesson) {
        kotlin.jvm.internal.m.f(lesson, "lesson");
        i1 i1Var = this.f36772c;
        i1Var.getClass();
        i1Var.l(null, lesson);
    }
}
