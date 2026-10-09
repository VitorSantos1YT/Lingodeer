package hj;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f32820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f32821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NestedScrollView f32822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f32823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b6 f32824f;

    public k4(ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView, NestedScrollView nestedScrollView, View view, b6 b6Var) {
        this.f32819a = constraintLayout;
        this.f32820b = imageView;
        this.f32821c = recyclerView;
        this.f32822d = nestedScrollView;
        this.f32823e = view;
        this.f32824f = b6Var;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32819a;
    }
}
