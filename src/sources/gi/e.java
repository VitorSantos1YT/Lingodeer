package gi;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.io.File;
import n9.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ViewModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29265c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f29263a = new q(29, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv.c f29264b = new fv.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableLiveData f29266d = new MutableLiveData();

    public final void a() {
        qy.q qVar = fv.b.f28186a;
        String strB = fv.b.B(-1L);
        fv.a aVar = new fv.a(0L, fv.b.C(-1L), strB);
        if (new File(defpackage.e.m(xt.b.a().b(), strB)).exists()) {
            this.f29266d.setValue(100);
        } else {
            this.f29264b.d(aVar, new aj.e(this, 6));
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f29263a.f();
        this.f29264b.a(this.f29265c);
    }
}
