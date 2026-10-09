package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f32657c;

    public h3(LinearLayout linearLayout, MaterialButton materialButton, RecyclerView recyclerView) {
        this.f32655a = linearLayout;
        this.f32656b = materialButton;
        this.f32657c = recyclerView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32655a;
    }
}
