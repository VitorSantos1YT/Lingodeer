package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f32319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f32320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f32321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialButton f32322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f32323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecyclerView f32324g;

    public a(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, MaterialButton materialButton, LinearLayout linearLayout4, RecyclerView recyclerView) {
        this.f32318a = constraintLayout;
        this.f32319b = linearLayout;
        this.f32320c = linearLayout2;
        this.f32321d = linearLayout3;
        this.f32322e = materialButton;
        this.f32323f = linearLayout4;
        this.f32324g = recyclerView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32318a;
    }
}
