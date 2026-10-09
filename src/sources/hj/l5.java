package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardView f32863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6 f32864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f32865c;

    public l5(CardView cardView, a6 a6Var, LinearLayout linearLayout) {
        this.f32863a = cardView;
        this.f32864b = a6Var;
        this.f32865c = linearLayout;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32863a;
    }
}
