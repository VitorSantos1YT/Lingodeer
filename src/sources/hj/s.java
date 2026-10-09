package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f33247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3 f33248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f33249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f33250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f33251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f33252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f33253h;

    public s(LinearLayout linearLayout, MaterialButton materialButton, u3 u3Var, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f33246a = linearLayout;
        this.f33247b = materialButton;
        this.f33248c = u3Var;
        this.f33249d = linearLayout2;
        this.f33250e = textView;
        this.f33251f = textView2;
        this.f33252g = textView3;
        this.f33253h = textView4;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33246a;
    }
}
