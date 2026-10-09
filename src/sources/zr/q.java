package zr;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import rz.e0;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr.l f59319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yr.b f59320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f59321c = x0.c(r.f59322a);

    public q(yr.l lVar, yr.b bVar) {
        this.f59319a = lVar;
        this.f59320b = bVar;
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new y0.j(this, (vy.d) null, 6), 3);
    }
}
