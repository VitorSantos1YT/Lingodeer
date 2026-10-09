package up;

import android.view.View;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.ui.review.adapter.BaseReviewCateAdapter;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseReviewCateAdapter f53045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f53046c;

    public /* synthetic */ a(BaseReviewCateAdapter baseReviewCateAdapter, BaseViewHolder baseViewHolder, int i11) {
        this.f53044a = i11;
        this.f53045b = baseReviewCateAdapter;
        this.f53046c = baseViewHolder;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View it = (View) obj;
        switch (this.f53044a) {
            case 0:
                m.f(it, "it");
                this.f53045b.getClass();
                BaseViewHolder baseViewHolder = this.f53046c;
                View itemView = baseViewHolder.itemView;
                m.e(itemView, "itemView");
                baseViewHolder.getAdapterPosition();
                throw null;
            case 1:
                m.f(it, "it");
                this.f53045b.getClass();
                BaseViewHolder baseViewHolder2 = this.f53046c;
                View itemView2 = baseViewHolder2.itemView;
                m.e(itemView2, "itemView");
                baseViewHolder2.getAdapterPosition();
                throw null;
            default:
                m.f(it, "it");
                this.f53045b.getClass();
                BaseViewHolder baseViewHolder3 = this.f53046c;
                View itemView3 = baseViewHolder3.itemView;
                m.e(itemView3, "itemView");
                baseViewHolder3.getAdapterPosition();
                throw null;
        }
    }
}
