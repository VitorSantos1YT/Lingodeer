package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCardView f33095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialButton f33096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f33097d;

    public p4(LinearLayout linearLayout, MaterialCardView materialCardView, MaterialButton materialButton, RecyclerView recyclerView) {
        this.f33094a = linearLayout;
        this.f33095b = materialCardView;
        this.f33096c = materialButton;
        this.f33097d = recyclerView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33094a;
    }
}
