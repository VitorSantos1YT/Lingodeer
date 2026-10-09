package cj;

import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScDetailAdapter;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.ui.review.adapter.BaseLessonUnitReviewELemAdapter;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements th.c, tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f7173a;

    public d(BaseLessonUnitReviewELemAdapter baseLessonUnitReviewELemAdapter, BaseViewHolder baseViewHolder) {
        this.f7173a = baseViewHolder;
    }

    @Override // th.c, th.b
    public void a() {
        BaseViewHolder baseViewHolder = this.f7173a;
        android.support.v4.media.session.a.H(baseViewHolder.getView(R.id.iv_play_recorder).getBackground());
        if (baseViewHolder.getView(R.id.iv_recorder) != null) {
            baseViewHolder.getView(R.id.iv_recorder).setClickable(true);
            baseViewHolder.getView(R.id.iv_recorder).setBackgroundResource(R.drawable.bg_lesson_index_start_btn_enable);
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        BaseLessonUnitReviewELemAdapter.a((HwCharacter) obj, this.f7173a);
    }

    public d(BaseViewHolder baseViewHolder, ScDetailAdapter scDetailAdapter) {
        this.f7173a = baseViewHolder;
    }
}
