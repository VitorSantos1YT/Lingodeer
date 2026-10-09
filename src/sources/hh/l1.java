package hh;

import androidx.lifecycle.Observer;
import com.lingo.fluent.ui.base.PdVocabularyDetailActivity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdVocabularyDetailActivity f32263b;

    public /* synthetic */ l1(PdVocabularyDetailActivity pdVocabularyDetailActivity, int i11) {
        this.f32262a = i11;
        this.f32263b = pdVocabularyDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i11 = this.f32262a;
        PdVocabularyDetailActivity pdVocabularyDetailActivity = this.f32263b;
        List list = (List) obj;
        switch (i11) {
            case 0:
                int i12 = PdVocabularyDetailActivity.U;
                kotlin.jvm.internal.m.c(list);
                pdVocabularyDetailActivity.u(list);
                break;
            default:
                kotlin.jvm.internal.m.c(list);
                int i13 = PdVocabularyDetailActivity.U;
                pdVocabularyDetailActivity.u(list);
                break;
        }
    }
}
