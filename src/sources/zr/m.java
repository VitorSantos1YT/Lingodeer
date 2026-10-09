package zr;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import rz.e0;
import tp.f0;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr.l f59309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f59310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f59311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f59312d;

    public m(yr.l lVar, d0 d0Var) {
        this.f59309a = lVar;
        i1 i1VarC = x0.c(j.f59307a);
        this.f59311c = i1VarC;
        this.f59312d = new r0(i1VarC);
        if (this.f59310b) {
            return;
        }
        this.f59310b = true;
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, (vy.d) null, 17), 3);
    }
}
