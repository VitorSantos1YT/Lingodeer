package hh;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r1;
import com.lingo.fluent.ui.base.PdVocabularyActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f32254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdVocabularyActivity f32255b;

    public k1(LinearLayoutManager linearLayoutManager, PdVocabularyActivity pdVocabularyActivity) {
        this.f32254a = linearLayoutManager;
        this.f32255b = pdVocabularyActivity;
    }

    @Override // androidx.recyclerview.widget.r1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        LinearLayoutManager linearLayoutManager = this.f32254a;
        View childAt = linearLayoutManager.getChildAt(0);
        if (childAt != null) {
            int position = linearLayoutManager.getPosition(childAt);
            PdVocabularyActivity pdVocabularyActivity = this.f32255b;
            pdVocabularyActivity.W = position;
            pdVocabularyActivity.X = childAt.getTop();
        }
    }
}
