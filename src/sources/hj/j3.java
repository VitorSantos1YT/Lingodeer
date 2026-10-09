package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardView f32758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f32759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f32760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f32761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f32762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaterialButton f32763f;

    public j3(CardView cardView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, MaterialButton materialButton) {
        this.f32758a = cardView;
        this.f32759b = linearLayout;
        this.f32760c = linearLayout2;
        this.f32761d = linearLayout3;
        this.f32762e = linearLayout4;
        this.f32763f = materialButton;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32758a;
    }
}
