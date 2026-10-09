package tq;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import av.n;
import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.m;
import qy.l;
import qy.q;
import rt.m9;
import rz.e0;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends ViewModel {
    public final cm.a H;
    public final q K;
    public final q L;
    public final q M;
    public final q N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fv.c f52523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f52524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f52525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f52526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f52527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52528f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f52529t;

    public d(n nVar, fv.c cVar) {
        this.f52523a = cVar;
        this.f52524b = nVar;
        i1 i1VarC = x0.c(new a(null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false));
        this.f52525c = i1VarC;
        this.f52526d = new r0(i1VarC);
        this.f52527e = x0.c(0);
        this.f52529t = new LinkedHashSet();
        this.H = new cm.a();
        this.K = com.bumptech.glide.d.v(new m9(14));
        this.L = com.bumptech.glide.d.v(new m9(15));
        this.M = com.bumptech.glide.d.v(new m9(16));
        this.N = com.bumptech.glide.d.v(new m9(17));
    }

    public final void a() {
        i1 i1Var = this.f52525c;
        a aVarA = a.a((a) i1Var.getValue(), null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 121);
        i1Var.getClass();
        i1Var.l(null, aVarA);
    }

    public final dn.d b(int i11) {
        if (i11 == 0) {
            return (dn.d) this.K.getValue();
        }
        if (i11 == 1) {
            return (dn.d) this.L.getValue();
        }
        if (i11 == 2) {
            return (dn.d) this.M.getValue();
        }
        if (i11 != 3) {
            return null;
        }
        return (dn.d) this.N.getValue();
    }

    public final void c(int i11, int i12, pq.a item) {
        m.f(item, "item");
        i1 i1Var = this.f52525c;
        a aVarA = a.a((a) i1Var.getValue(), item, new l(Integer.valueOf(i11), Integer.valueOf(i12)), null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 121);
        i1Var.getClass();
        i1Var.l(null, aVarA);
        d(item);
    }

    public final void d(pq.a item) {
        m.f(item, "item");
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new nu.b(16, this, item, null), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        n nVar = this.f52524b;
        nVar.n();
        nVar.b();
        this.f52523a.a(this.f52528f);
    }
}
