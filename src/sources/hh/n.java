package hh;

import androidx.viewpager2.widget.ViewPager2;
import com.lingo.fluent.ui.base.PdGrammarActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PdGrammarActivity f32268a;

    public n(PdGrammarActivity pdGrammarActivity) {
        this.f32268a = pdGrammarActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i11) {
        PdGrammarActivity pdGrammarActivity = this.f32268a;
        ((hj.j0) pdGrammarActivity.j()).f32743g.setText((i11 + 1) + "/" + pdGrammarActivity.T.size());
    }
}
