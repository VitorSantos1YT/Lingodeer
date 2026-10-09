package gn;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import av.f0;
import av.n;
import b0.f;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.m;
import qy.l;
import rz.e0;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ViewModel {
    public final LinkedHashSet H;
    public dn.c K;
    public dn.c L;
    public dn.c M;
    public dn.c N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm.b f29321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv.c f29322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f29323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f29324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f29325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1 f29326f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29327t;

    public e(xm.b bVar, fv.c cVar, n nVar) {
        this.f29321a = bVar;
        this.f29322b = cVar;
        this.f29323c = nVar;
        i1 i1VarC = x0.c(new a(false, null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false));
        this.f29324d = i1VarC;
        this.f29325e = new r0(i1VarC);
        this.f29326f = x0.c(0);
        this.H = new LinkedHashSet();
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new f(this, null, 25), 3);
    }

    public final void a() {
        i1 i1Var = this.f29324d;
        a aVarA = a.a((a) i1Var.getValue(), false, null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 121);
        i1Var.getClass();
        i1Var.l(null, aVarA);
    }

    public final void b(int i11, int i12, KOCharZhuyin item) {
        m.f(item, "item");
        i1 i1Var = this.f29324d;
        a aVarA = a.a((a) i1Var.getValue(), false, item, new l(Integer.valueOf(i11), Integer.valueOf(i12)), null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 121);
        i1Var.getClass();
        i1Var.l(null, aVarA);
        item.toString();
        c(item);
    }

    public final void c(KOCharZhuyin item) {
        m.f(item, "item");
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(26, this, item, null), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        n nVar = this.f29323c;
        nVar.n();
        nVar.b();
        this.f29322b.a(this.f29327t);
    }
}
