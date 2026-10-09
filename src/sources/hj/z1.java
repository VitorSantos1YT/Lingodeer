package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f33645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f33646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f33647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f33648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f33649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b6 f33650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f33651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f33652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f33653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SlowPlaySwitchBtn f33654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f33655l;
    public final TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WaveView f33656n;

    public z1(LinearLayout linearLayout, FrameLayout frameLayout, FrameLayout frameLayout2, FlexboxLayout flexboxLayout, FrameLayout frameLayout3, FrameLayout frameLayout4, b6 b6Var, ImageView imageView, View view, LinearLayout linearLayout2, SlowPlaySwitchBtn slowPlaySwitchBtn, TextView textView, TextView textView2, WaveView waveView) {
        this.f33644a = linearLayout;
        this.f33645b = frameLayout;
        this.f33646c = frameLayout2;
        this.f33647d = flexboxLayout;
        this.f33648e = frameLayout3;
        this.f33649f = frameLayout4;
        this.f33650g = b6Var;
        this.f33651h = imageView;
        this.f33652i = view;
        this.f33653j = linearLayout2;
        this.f33654k = slowPlaySwitchBtn;
        this.f33655l = textView;
        this.m = textView2;
        this.f33656n = waveView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33644a;
    }
}
