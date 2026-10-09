package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingo.fluent.widget.GameWaveView;
import com.lingo.fluent.widget.WordGameLife;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WordGameLife f33591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f33592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f33593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f33594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f33595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f33596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f33597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ProgressBar f33598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FrameLayout f33599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f33600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f33601l;
    public final TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f33602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final GameWaveView f33603o;

    public x5(ConstraintLayout constraintLayout, WordGameLife wordGameLife, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout, ProgressBar progressBar, FrameLayout frameLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, GameWaveView gameWaveView) {
        this.f33590a = constraintLayout;
        this.f33591b = wordGameLife;
        this.f33592c = imageView;
        this.f33593d = imageView2;
        this.f33594e = imageView3;
        this.f33595f = imageView4;
        this.f33596g = imageView5;
        this.f33597h = linearLayout;
        this.f33598i = progressBar;
        this.f33599j = frameLayout;
        this.f33600k = constraintLayout2;
        this.f33601l = textView;
        this.m = textView2;
        this.f33602n = textView3;
        this.f33603o = gameWaveView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33590a;
    }
}
