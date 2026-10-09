package zr;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import rz.e0;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr.j f59327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f59328b = x0.c(y.f59330a);

    public w(yr.j jVar) {
        this.f59327a = jVar;
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new xg.b(this, null, 15), 3);
    }
}
