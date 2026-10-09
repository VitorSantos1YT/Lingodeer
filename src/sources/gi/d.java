package gi;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import av.f0;
import av.n;
import bp.t3;
import com.lingo.lingoskill.object.ARChar;
import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.m;
import qy.l;
import qy.q;
import rz.e0;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fv.c f29256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f29257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f29258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f29259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f29260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f29261f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f29262t;

    public d(n nVar, fv.c cVar) {
        this.f29256a = cVar;
        this.f29257b = nVar;
        i1 i1VarC = x0.c(new a(null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false));
        this.f29258c = i1VarC;
        this.f29259d = new r0(i1VarC);
        this.f29260e = x0.c(0);
        this.f29261f = new LinkedHashSet();
        this.f29262t = com.bumptech.glide.d.v(new fk.a(15));
    }

    public final void a() {
        i1 i1Var = this.f29258c;
        a aVarA = a.a((a) i1Var.getValue(), null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 121);
        i1Var.getClass();
        i1Var.l(null, aVarA);
    }

    public final void b(int i11, int i12, ARChar item) {
        m.f(item, "item");
        i1 i1Var = this.f29258c;
        a aVarA = a.a((a) i1Var.getValue(), item, new l(Integer.valueOf(i11), Integer.valueOf(i12)), null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 121);
        i1Var.getClass();
        i1Var.l(null, aVarA);
        item.toString();
        c(item);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new t3(this, item, i11, i12, null, 6), 3);
    }

    public final void c(ARChar item) {
        m.f(item, "item");
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(25, this, item, null), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        n nVar = this.f29257b;
        nVar.n();
        nVar.b();
    }
}
