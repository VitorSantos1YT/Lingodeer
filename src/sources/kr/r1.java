package kr;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yalantis.ucrop.view.CropImageView;
import rt.db;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fv.c f38571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz.i1 f38573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.r0 f38574d;

    public r1(fv.c cVar, vt.c cVar2, vt.n0 n0Var, int i11) {
        this.f38571a = cVar;
        this.f38572b = i11;
        uz.i1 i1VarC = uz.x0.c(new db(CropImageView.DEFAULT_ASPECT_RATIO));
        this.f38573c = i1VarC;
        this.f38574d = new uz.r0(i1VarC);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new gp.a(this, null, 25), 3);
    }
}
