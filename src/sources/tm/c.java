package tm;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bh.w;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e6.g0;
import no.g;
import rz.e0;
import rz.o0;
import uz.a1;
import uz.i1;
import uz.x0;
import vy.d;
import yz.e;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f52435a;

    public c() {
        i1 i1VarC = x0.c(null);
        i1 i1VarC2 = x0.c(BuildConfig.VERSION_NAME);
        this.f52435a = i1VarC2;
        g gVar = new g(i1VarC, i1VarC2, new g0(3, 6, (d) null));
        f fVar = o0.f50940a;
        x0.A(x0.w(gVar, e.f58387a), ViewModelKt.getViewModelScope(this), a1.a(2), a.f52432a);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new w(this, null), 3);
    }
}
