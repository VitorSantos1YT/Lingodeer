package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCardView f32867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialCardView f32868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialCardView f32869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f32870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f32871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f32872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f32873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f32874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f32875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f32876k;

    public l6(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f32866a = constraintLayout;
        this.f32867b = materialCardView;
        this.f32868c = materialCardView2;
        this.f32869d = materialCardView3;
        this.f32870e = imageView;
        this.f32871f = imageView2;
        this.f32872g = imageView3;
        this.f32873h = textView;
        this.f32874i = textView2;
        this.f32875j = textView3;
        this.f32876k = textView4;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32866a;
    }
}
