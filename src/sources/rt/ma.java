package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ma extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ot.z f50068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50069b;

    public ma(ot.z zVar, long j11) {
        this.f50068a = zVar;
        this.f50069b = j11;
        bh.f0 f0Var = new bh.f0(new gp.r(new h(this, null, 8)), 7);
        yz.f fVar = rz.o0.f50940a;
        uz.x0.A(uz.x0.w(f0Var, yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new ra(CropImageView.DEFAULT_ASPECT_RATIO));
    }
}
