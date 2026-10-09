package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f32596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b6 f32598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f32599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CardView f32600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CardView f32601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f32602h;

    public g1(LinearLayout linearLayout, CardView cardView, TextView textView, b6 b6Var, ImageView imageView, CardView cardView2, CardView cardView3, TextView textView2) {
        this.f32595a = linearLayout;
        this.f32596b = cardView;
        this.f32597c = textView;
        this.f32598d = b6Var;
        this.f32599e = imageView;
        this.f32600f = cardView2;
        this.f32601g = cardView3;
        this.f32602h = textView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32595a;
    }
}
