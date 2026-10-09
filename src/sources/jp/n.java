package jp;

import android.view.ViewTreeObserver;
import com.lingo.lingoskill.ui.learn.AdVideoPromptActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdVideoPromptActivity f36509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f36510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f36511c;

    public n(AdVideoPromptActivity adVideoPromptActivity, float f5, float f11) {
        this.f36509a = adVideoPromptActivity;
        this.f36510b = f5;
        this.f36511c = f11;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AdVideoPromptActivity adVideoPromptActivity = this.f36509a;
        ((hj.g) adVideoPromptActivity.j()).f32588e.getLayoutParams().height = (int) ((this.f36510b / this.f36511c) * ((hj.g) adVideoPromptActivity.j()).f32588e.getWidth());
        ((hj.g) adVideoPromptActivity.j()).f32587d.setVisibility(0);
        ((hj.g) adVideoPromptActivity.j()).f32586c.setVisibility(0);
        ((hj.g) adVideoPromptActivity.j()).f32588e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
