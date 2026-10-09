package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardView f32825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f6 f32826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f32827c;

    public k5(CardView cardView, f6 f6Var, LinearLayout linearLayout) {
        this.f32825a = cardView;
        this.f32826b = f6Var;
        this.f32827c = linearLayout;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32825a;
    }
}
