package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f32638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager f32639c;

    public h(ConstraintLayout constraintLayout, e3 e3Var, ViewPager viewPager) {
        this.f32637a = constraintLayout;
        this.f32638b = e3Var;
        this.f32639c = viewPager;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32637a;
    }
}
