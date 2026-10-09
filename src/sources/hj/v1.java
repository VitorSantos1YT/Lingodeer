package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f33448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f33449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b6 f33450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f33451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WaveView f33452f;

    public v1(LinearLayout linearLayout, FlexboxLayout flexboxLayout, FrameLayout frameLayout, b6 b6Var, TextView textView, WaveView waveView) {
        this.f33447a = linearLayout;
        this.f33448b = flexboxLayout;
        this.f33449c = frameLayout;
        this.f33450d = b6Var;
        this.f33451e = textView;
        this.f33452f = waveView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33447a;
    }
}
