package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.widget.DeleteWordView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f32651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DeleteWordView f32654d;

    public h2(FrameLayout frameLayout, FlexboxLayout flexboxLayout, TextView textView, DeleteWordView deleteWordView) {
        this.f32651a = frameLayout;
        this.f32652b = flexboxLayout;
        this.f32653c = textView;
        this.f32654d = deleteWordView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32651a;
    }
}
