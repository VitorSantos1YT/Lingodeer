package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f33501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f33502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3 f33503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f33504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f33505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f33506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f33507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f33508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f33509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f33510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f33511l;
    public final WaveView m;

    public w1(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, d3 d3Var, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, View view, TextView textView, TextView textView2, View view2, View view3, WaveView waveView) {
        this.f33500a = constraintLayout;
        this.f33501b = frameLayout;
        this.f33502c = frameLayout2;
        this.f33503d = d3Var;
        this.f33504e = constraintLayout2;
        this.f33505f = constraintLayout3;
        this.f33506g = imageView;
        this.f33507h = view;
        this.f33508i = textView;
        this.f33509j = textView2;
        this.f33510k = view2;
        this.f33511l = view3;
        this.m = waveView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33500a;
    }
}
