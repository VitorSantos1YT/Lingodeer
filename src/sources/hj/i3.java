package hj;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardView f32696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f32697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f32699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f32700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f32701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32702g;

    public i3(CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f32696a = cardView;
        this.f32697b = textView;
        this.f32698c = textView2;
        this.f32699d = textView3;
        this.f32700e = textView4;
        this.f32701f = textView5;
        this.f32702g = textView6;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32696a;
    }
}
