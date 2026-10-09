package up;

import android.widget.CheckBox;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.ui.review.adapter.BaseReviewCateAdapter;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseReviewCateAdapter f53052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f53053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ReviewNew f53054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CheckBox f53055e;

    public /* synthetic */ c(BaseReviewCateAdapter baseReviewCateAdapter, BaseViewHolder baseViewHolder, ReviewNew reviewNew, CheckBox checkBox, int i11) {
        this.f53051a = i11;
        this.f53052b = baseReviewCateAdapter;
        this.f53053c = baseViewHolder;
        this.f53054d = reviewNew;
        this.f53055e = checkBox;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f53051a) {
            case 0:
                CheckBox checkBox = this.f53055e;
                m.c(checkBox);
                this.f53052b.a((HwCharacter) obj, this.f53053c, this.f53054d, checkBox);
                break;
            default:
                CheckBox checkBox2 = this.f53055e;
                m.c(checkBox2);
                this.f53052b.d((Sentence) obj, this.f53053c, this.f53054d, checkBox2);
                break;
        }
    }
}
