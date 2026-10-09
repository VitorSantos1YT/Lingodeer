package kp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import bq.z;
import bt.g7;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Model_Sentence_030;
import com.lingo.lingoskill.object.Model_Sentence_100;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38376a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbsDialogModelAdapter f38377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlexboxLayout f38378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f38379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f38380e;

    public d(View view, ArrayList arrayList, AbsDialogModelAdapter absDialogModelAdapter, FlexboxLayout flexboxLayout) {
        this.f38379d = view;
        this.f38380e = arrayList;
        this.f38377b = absDialogModelAdapter;
        this.f38378c = flexboxLayout;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f38376a) {
            case 0:
                Model_Sentence_030 model_Sentence_030 = (Model_Sentence_030) obj;
                FlexboxLayout flexboxLayout = (FlexboxLayout) this.f38379d.findViewById(R.id.flex_sentence);
                int childCount = flexboxLayout.getChildCount();
                for (int i11 = 1; i11 < childCount; i11++) {
                    View childAt = flexboxLayout.getChildAt(i11);
                    TextView textView = (TextView) childAt.findViewById(R.id.tv_middle);
                    Object tag = childAt.getTag();
                    m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    Word word = (Word) tag;
                    if (model_Sentence_030.getStemList().contains(word) || word.getWordType() == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(4);
                        this.f38380e.add(childAt);
                        childAt.setTag(R.id.tag_is_invisiable, Boolean.TRUE);
                    }
                }
                AbsDialogModelAdapter absDialogModelAdapter = this.f38377b;
                AbsDialogModelAdapter.d(absDialogModelAdapter, flexboxLayout);
                Iterator<Word> it = model_Sentence_030.getOptionList().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    FlexboxLayout flexboxLayout2 = this.f38378c;
                    if (!zHasNext) {
                        ef.e.B(flexboxLayout2);
                    } else {
                        Word next = it.next();
                        View viewInflate = LayoutInflater.from(((BaseQuickAdapter) absDialogModelAdapter).mContext).inflate(R.layout.include_sentence_option_elem_dialog, (ViewGroup) flexboxLayout2, false);
                        m.d(viewInflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                        CardView cardView = (CardView) viewInflate;
                        View viewFindViewById = cardView.findViewById(R.id.flex_container);
                        m.e(viewFindViewById, "findViewById(...)");
                        AbsDialogModelAdapter.j(absDialogModelAdapter, cardView, o.K(next));
                        flexboxLayout2.addView(cardView);
                        FlexboxLayout flexboxLayout3 = flexboxLayout;
                        z.b(cardView, new g7(next, model_Sentence_030, absDialogModelAdapter, cardView, flexboxLayout2, flexboxLayout3, 10));
                        z.b((FlexboxLayout) viewFindViewById, new c(cardView, 1));
                        flexboxLayout = flexboxLayout3;
                    }
                    break;
                }
                break;
            default:
                Model_Sentence_100 model_Sentence_100 = (Model_Sentence_100) obj;
                List<Word> optionList = model_Sentence_100.getOptionList();
                m.e(optionList, "getOptionList(...)");
                Collections.shuffle(optionList);
                Iterator<Word> it2 = model_Sentence_100.getOptionList().iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    ArrayList arrayList = this.f38380e;
                    FlexboxLayout flexboxLayout4 = this.f38378c;
                    AbsDialogModelAdapter absDialogModelAdapter2 = this.f38377b;
                    if (!zHasNext2) {
                        FlexboxLayout flexboxLayout5 = (FlexboxLayout) this.f38379d.findViewById(R.id.flex_sentence);
                        model_Sentence_100.getSentenceStem();
                        int childCount2 = flexboxLayout5.getChildCount();
                        for (int i12 = 1; i12 < childCount2; i12++) {
                            View childAt2 = flexboxLayout5.getChildAt(i12);
                            TextView textView2 = (TextView) childAt2.findViewById(R.id.tv_middle);
                            Object tag2 = childAt2.getTag();
                            m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                            Word word2 = (Word) tag2;
                            if (model_Sentence_100.getStemList().contains(word2) || word2.getWordType() == 1) {
                                textView2.setVisibility(0);
                            } else {
                                textView2.setVisibility(4);
                                arrayList.add(childAt2);
                                childAt2.setTag(R.id.tag_is_invisiable, Boolean.TRUE);
                            }
                        }
                        AbsDialogModelAdapter.d(absDialogModelAdapter2, flexboxLayout5);
                        ef.e.B(flexboxLayout4);
                    } else {
                        Word next2 = it2.next();
                        View viewInflate2 = LayoutInflater.from(((BaseQuickAdapter) absDialogModelAdapter2).mContext).inflate(R.layout.item_dialog_word_card_framlayout, (ViewGroup) flexboxLayout4, false);
                        m.d(viewInflate2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                        CardView cardView2 = (CardView) viewInflate2;
                        TextView textView3 = (TextView) cardView2.findViewById(R.id.tv_top);
                        TextView textView4 = (TextView) cardView2.findViewById(R.id.tv_middle);
                        Context context = ((BaseQuickAdapter) absDialogModelAdapter2).mContext;
                        m.e(context, "access$getMContext$p$s-1838890688(...)");
                        cardView2.setCardBackgroundColor(context.getColor(R.color.white));
                        cardView2.setCardElevation(ff.h.l(2.0f));
                        cardView2.setTag(next2);
                        m.c(next2);
                        AbsDialogModelAdapter.g(absDialogModelAdapter2, cardView2, next2);
                        flexboxLayout4.addView(cardView2);
                        z.b(cardView2, new e(arrayList, next2, cardView2, absDialogModelAdapter2, textView4, textView3, flexboxLayout4, 1));
                    }
                    break;
                }
                break;
        }
    }

    public d(AbsDialogModelAdapter absDialogModelAdapter, FlexboxLayout flexboxLayout, View view, ArrayList arrayList) {
        this.f38377b = absDialogModelAdapter;
        this.f38378c = flexboxLayout;
        this.f38379d = view;
        this.f38380e = arrayList;
    }
}
