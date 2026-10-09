package hh;

import android.widget.TextView;
import com.lingo.fluent.ui.base.PdVocabularyDetailActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements ua.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PdVocabularyDetailActivity f32273a;

    public o1(PdVocabularyDetailActivity pdVocabularyDetailActivity) {
        this.f32273a = pdVocabularyDetailActivity;
    }

    @Override // ua.j
    public final void onPageSelected(int i11) {
        PdVocabularyDetailActivity pdVocabularyDetailActivity = this.f32273a;
        TextView textView = ((hj.n0) pdVocabularyDetailActivity.j()).f32950b;
        int i12 = i11 + 1;
        ua.a adapter = ((hj.n0) pdVocabularyDetailActivity.j()).f32951c.getAdapter();
        textView.setText(i12 + "/" + (adapter != null ? Integer.valueOf(adapter.c()) : null));
    }

    @Override // ua.j
    public final void onPageScrollStateChanged(int i11) {
    }

    @Override // ua.j
    public final void b(int i11, float f5) {
    }
}
