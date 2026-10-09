package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatButton f32343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f32345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f32346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f32347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32348g;

    public a4(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2, TextView textView) {
        this.f32342a = constraintLayout;
        this.f32343b = appCompatButton;
        this.f32344c = imageView;
        this.f32345d = linearLayout;
        this.f32346e = recyclerView;
        this.f32347f = constraintLayout2;
        this.f32348g = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32342a;
    }
}
