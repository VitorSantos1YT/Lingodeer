package rp;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import mv.f0;
import rz.e0;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fv.c f49343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f49344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f49345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49346d;

    public e(fv.c cVar) {
        this.f49343a = cVar;
        i1 i1VarC = x0.c(f.f49347a);
        this.f49344b = i1VarC;
        this.f49345c = new r0(i1VarC);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, null, 17), 3);
    }
}
