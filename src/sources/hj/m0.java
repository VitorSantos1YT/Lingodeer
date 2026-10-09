package hj;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3 f32903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f32905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProgressBar f32906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f32907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecyclerView f32908g;

    public m0(ConstraintLayout constraintLayout, d3 d3Var, TextView textView, TextView textView2, ProgressBar progressBar, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f32902a = constraintLayout;
        this.f32903b = d3Var;
        this.f32904c = textView;
        this.f32905d = textView2;
        this.f32906e = progressBar;
        this.f32907f = recyclerView;
        this.f32908g = recyclerView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32902a;
    }
}
