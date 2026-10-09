package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.R;
import fr.j3;
import hj.l6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b1 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f32210a = new b1(3, l6.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/ItemPdVocabularyDetailBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.item_pd_vocabulary_detail, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.card_arrow;
        MaterialCardView materialCardView = (MaterialCardView) j3.q(viewInflate, R.id.card_arrow);
        if (materialCardView != null) {
            i11 = R.id.card_top;
            MaterialCardView materialCardView2 = (MaterialCardView) j3.q(viewInflate, R.id.card_top);
            if (materialCardView2 != null) {
                i11 = R.id.card_trans;
                MaterialCardView materialCardView3 = (MaterialCardView) j3.q(viewInflate, R.id.card_trans);
                if (materialCardView3 != null) {
                    i11 = R.id.const_card;
                    if (((ConstraintLayout) j3.q(viewInflate, R.id.const_card)) != null) {
                        i11 = R.id.guid_line_top;
                        if (((Guideline) j3.q(viewInflate, R.id.guid_line_top)) != null) {
                            i11 = R.id.iv_arrow;
                            ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_arrow);
                            if (imageView != null) {
                                i11 = R.id.iv_audio;
                                ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_audio);
                                if (imageView2 != null) {
                                    i11 = R.id.iv_fav;
                                    ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.iv_fav);
                                    if (imageView3 != null) {
                                        i11 = R.id.tv_bottom;
                                        TextView textView = (TextView) j3.q(viewInflate, R.id.tv_bottom);
                                        if (textView != null) {
                                            i11 = R.id.tv_middle;
                                            TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_middle);
                                            if (textView2 != null) {
                                                i11 = R.id.tv_top;
                                                TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_top);
                                                if (textView3 != null) {
                                                    i11 = R.id.tv_trans;
                                                    TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_trans);
                                                    if (textView4 != null) {
                                                        return new l6((ConstraintLayout) viewInflate, materialCardView, materialCardView2, materialCardView3, imageView, imageView2, imageView3, textView, textView2, textView3, textView4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
