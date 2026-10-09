package hj;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposeView f32369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager2 f32370c;

    public b0(ConstraintLayout constraintLayout, ComposeView composeView, j jVar, ViewPager2 viewPager2) {
        this.f32368a = constraintLayout;
        this.f32369b = composeView;
        this.f32370c = viewPager2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32368a;
    }
}
