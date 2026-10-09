package zr;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import rz.e0;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr.k f59313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yr.l f59314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yr.a f59315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f59316d = x0.c(o.f59317a);

    public n(yr.k kVar, yr.l lVar, yr.a aVar) {
        this.f59313a = kVar;
        this.f59314b = lVar;
        this.f59315c = aVar;
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new cj.b(this, null), 3);
    }
}
