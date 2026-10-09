package kp;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.c {
    public final /* synthetic */ FlexboxLayout H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f38382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Word f38383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CardView f38384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbsDialogModelAdapter f38385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextView f38386f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TextView f38387t;

    public /* synthetic */ e(ArrayList arrayList, Word word, CardView cardView, AbsDialogModelAdapter absDialogModelAdapter, TextView textView, TextView textView2, FlexboxLayout flexboxLayout, int i11) {
        this.f38381a = i11;
        this.f38382b = arrayList;
        this.f38383c = word;
        this.f38384d = cardView;
        this.f38385e = absDialogModelAdapter;
        this.f38386f = textView;
        this.f38387t = textView2;
        this.H = flexboxLayout;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View it = (View) obj;
        switch (this.f38381a) {
            case 0:
                m.f(it, "it");
                ArrayList arrayList = this.f38382b;
                if (!arrayList.isEmpty()) {
                    Object obj2 = arrayList.get(0);
                    m.e(obj2, "get(...)");
                    View view = (View) obj2;
                    Object tag = view.getTag();
                    m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    Word word = (Word) tag;
                    Word word2 = this.f38383c;
                    word2.getWordId();
                    word.getWordId();
                    long wordId = word2.getWordId();
                    long wordId2 = word.getWordId();
                    CardView cardView = this.f38384d;
                    AbsDialogModelAdapter absDialogModelAdapter = this.f38385e;
                    if (wordId == wordId2 || m.a(word2.getWord(), word.getWord())) {
                        arrayList.remove(0);
                        cardView.setEnabled(false);
                        TextView textView = this.f38387t;
                        m.c(textView);
                        AbsDialogModelAdapter.e(absDialogModelAdapter, cardView, this.f38386f, textView);
                        ((TextView) view.findViewById(R.id.tv_middle)).setVisibility(0);
                        view.setTag(R.id.tag_is_invisiable, Boolean.FALSE);
                        if (arrayList.isEmpty()) {
                            AbsDialogModelAdapter.b(absDialogModelAdapter, this.H);
                        }
                    } else {
                        AbsDialogModelAdapter.f(absDialogModelAdapter, cardView);
                    }
                }
                break;
            default:
                m.f(it, "it");
                ArrayList arrayList2 = this.f38382b;
                if (!arrayList2.isEmpty()) {
                    Object obj3 = arrayList2.get(0);
                    m.e(obj3, "get(...)");
                    View view2 = (View) obj3;
                    Object tag2 = view2.getTag();
                    m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    Word word3 = (Word) tag2;
                    Word word4 = this.f38383c;
                    word4.getWordId();
                    word3.getWordId();
                    long wordId3 = word4.getWordId();
                    long wordId4 = word3.getWordId();
                    CardView cardView2 = this.f38384d;
                    AbsDialogModelAdapter absDialogModelAdapter2 = this.f38385e;
                    if (wordId3 == wordId4 || m.a(word4.getWord(), word3.getWord())) {
                        arrayList2.remove(0);
                        cardView2.setEnabled(false);
                        TextView textView2 = this.f38387t;
                        m.c(textView2);
                        AbsDialogModelAdapter.e(absDialogModelAdapter2, cardView2, this.f38386f, textView2);
                        ((TextView) view2.findViewById(R.id.tv_middle)).setVisibility(0);
                        view2.setTag(R.id.tag_is_invisiable, Boolean.FALSE);
                        if (arrayList2.isEmpty()) {
                            AbsDialogModelAdapter.b(absDialogModelAdapter2, this.H);
                        }
                    } else {
                        AbsDialogModelAdapter.f(absDialogModelAdapter2, cardView2);
                    }
                }
                break;
        }
        return b0.f48488a;
    }
}
