package qv;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import av.n;
import bh.r;
import com.lingodeer.data.model.SyllableWriteLesson;
import fr.o0;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.n0;
import wt.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f48442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv.c f48443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f48444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f48445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f48446e;

    public j(n nVar, fv.c cVar, n0 n0Var, m mVar, SyllableWriteLesson syllableWriteLesson) {
        this.f48442a = nVar;
        this.f48443b = cVar;
        i1 i1VarC = x0.c(0);
        this.f48444c = i1VarC;
        this.f48445d = new r0(i1VarC);
        r rVar = new r(new gp.r(new k(syllableWriteLesson, mVar, ((o0) n0Var).f27733a.keyLanguage, null)), this, 20);
        yz.f fVar = rz.o0.f50940a;
        this.f48446e = x0.A(x0.w(rVar, yz.e.f58387a), ViewModelKt.getViewModelScope(this), a1.a(2), f.f48435a);
    }
}
