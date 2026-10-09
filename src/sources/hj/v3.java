package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f33456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f33457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f33458d;

    public v3(ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.f33455a = constraintLayout;
        this.f33456b = linearLayout;
        this.f33457c = recyclerView;
        this.f33458d = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33455a;
    }
}
