package zi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import au.c1;
import com.lingodeer.R;
import com.lingodeer.database.model.SRSStatusEntity;
import hj.y1;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f59251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59252c;

    public /* synthetic */ j(int i11, Object obj, Object obj2) {
        this.f59250a = i11;
        this.f59251b = obj;
        this.f59252c = obj2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f59250a;
        b0 b0Var = b0.f48488a;
        Object obj2 = this.f59252c;
        Object obj3 = this.f59251b;
        switch (i11) {
            case 0:
                l lVar = (l) obj3;
                View it = (View) obj;
                m.f(it, "it");
                lVar.f59256k = (CardView) obj2;
                if (lVar.a()) {
                    CardView cardView = lVar.f59256k;
                    m.c(cardView);
                    ArrayList arrayList = lVar.f59255j;
                    if (arrayList == null) {
                        m.n("options");
                        throw null;
                    }
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        int iA = w4.c.a(i12, "rl_answer_");
                        View view = lVar.f59226e;
                        if (view == null) {
                            m.n("view");
                            throw null;
                        }
                        View viewFindViewById = view.findViewById(iA);
                        m.e(viewFindViewById, "findViewById(...)");
                        CardView cardView2 = (CardView) viewFindViewById;
                        Object tag = cardView2.getTag();
                        m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.object.PinyinElem");
                        if (!((xi.b) tag).equals(lVar.f59223b)) {
                            cardView2.setVisibility(4);
                        }
                        cardView2.setClickable(false);
                    }
                    View viewFindViewById2 = cardView.findViewById(R.id.frame_layout);
                    m.e(viewFindViewById2, "findViewById(...)");
                    FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
                    View viewFindViewById3 = cardView.findViewById(R.id.img_tick);
                    m.e(viewFindViewById3, "findViewById(...)");
                    ImageView imageView = (ImageView) viewFindViewById3;
                    frameLayout.setBackgroundResource(R.drawable.bg_word_model_correct);
                    imageView.setImageResource(R.drawable.ic_word_select_correct);
                    frameLayout.setVisibility(0);
                    int[] iArr = new int[2];
                    cardView.getLocationOnScreen(iArr);
                    ta.a aVar = lVar.f59227f;
                    m.c(aVar);
                    int[] iArr2 = {((((y1) aVar).f33613c.getWidth() / 2) + i) - (cardView.getWidth() / 2), ((((y1) aVar).f33613c.getHeight() / 2) + i) - (cardView.getHeight() / 2)};
                    ((y1) aVar).f33613c.getLocationOnScreen(iArr2);
                    int i13 = iArr2[0];
                    ta.a aVar2 = lVar.f59227f;
                    m.c(aVar2);
                    int i14 = iArr2[1];
                    ta.a aVar3 = lVar.f59227f;
                    m.c(aVar3);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cardView, "translationX", iArr2[0] - iArr[0]);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cardView, "translationY", iArr2[1] - iArr[1]);
                    AnimatorSet animatorSet = new AnimatorSet();
                    lVar.m = animatorSet;
                    AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat);
                    if (builderPlay != null) {
                        builderPlay.with(objectAnimatorOfFloat2);
                    }
                    AnimatorSet animatorSet2 = lVar.m;
                    if (animatorSet2 != null) {
                        animatorSet2.setDuration(500L);
                    }
                    AnimatorSet animatorSet3 = lVar.m;
                    if (animatorSet3 != null) {
                        animatorSet3.addListener(new om.l(imageView, cardView, lVar, 6));
                    }
                    AnimatorSet animatorSet4 = lVar.m;
                    if (animatorSet4 != null) {
                        animatorSet4.start();
                    }
                } else {
                    CardView cardView3 = lVar.f59256k;
                    m.c(cardView3);
                    View viewFindViewById4 = cardView3.findViewById(R.id.frame_layout);
                    m.e(viewFindViewById4, "findViewById(...)");
                    FrameLayout frameLayout2 = (FrameLayout) viewFindViewById4;
                    View viewFindViewById5 = cardView3.findViewById(R.id.img_tick);
                    m.e(viewFindViewById5, "findViewById(...)");
                    frameLayout2.setBackgroundResource(R.drawable.bg_word_model_wrong);
                    ((ImageView) viewFindViewById5).setImageResource(R.drawable.ic_word_select_wrong);
                    frameLayout2.setVisibility(0);
                    cardView3.startAnimation(AnimationUtils.loadAnimation(lVar.f59224c, R.anim.anim_shake));
                    if (!lVar.f59257l) {
                        lVar.f59257l = true;
                    }
                }
                return b0Var;
            default:
                ja.a _connection = (ja.a) obj;
                m.f(_connection, "_connection");
                ((c1) obj3).f2965b.D(_connection, (SRSStatusEntity) obj2);
                return b0Var;
        }
    }
}
