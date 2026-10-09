package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f33617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f33618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressBar f33619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f33620e;

    public y3(LinearLayout linearLayout, MaterialButton materialButton, ImageView imageView, ProgressBar progressBar, TextView textView) {
        this.f33616a = linearLayout;
        this.f33617b = materialButton;
        this.f33618c = imageView;
        this.f33619d = progressBar;
        this.f33620e = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33616a;
    }
}
