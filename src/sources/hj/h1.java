package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b6 f32645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f32647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f32648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f32649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WaveView f32650g;

    public h1(LinearLayout linearLayout, b6 b6Var, TextView textView, TextView textView2, TextView textView3, TextView textView4, WaveView waveView) {
        this.f32644a = linearLayout;
        this.f32645b = b6Var;
        this.f32646c = textView;
        this.f32647d = textView2;
        this.f32648e = textView3;
        this.f32649f = textView4;
        this.f32650g = waveView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32644a;
    }
}
