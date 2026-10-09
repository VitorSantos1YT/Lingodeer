package hh;

import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f32297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f32298b;

    public t0(u0 u0Var, List list) {
        this.f32297a = u0Var;
        this.f32298b = list;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i11) {
        super.onPageSelected(i11);
        this.f32297a.x(this.f32298b);
    }
}
