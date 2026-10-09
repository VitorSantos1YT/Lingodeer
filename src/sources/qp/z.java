package qp;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f48277b;

    public /* synthetic */ z(b0 b0Var, int i11) {
        this.f48276a = i11;
        this.f48277b = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:42:0x01fa A[LOOP:4: B:41:0x01f8->B:42:0x01fa, LOOP_END] */
    @Override // fz.a
    public final Object invoke() {
        int size;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        int i12 = this.f48276a;
        qy.b0 b0Var = qy.b0.f48488a;
        b0 b0Var2 = this.f48277b;
        switch (i12) {
            case 0:
                ta.a aVar = b0Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ConstraintLayout constraintLayout = ((hj.i1) aVar).f32686i;
                if (constraintLayout != null) {
                    constraintLayout.performClick();
                }
                break;
            default:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ArrayList());
                ArrayList arrayList2 = b0Var2.f47838n;
                ArrayList arrayList3 = b0Var2.m;
                Context context = b0Var2.f47883c;
                int size2 = arrayList2.size();
                boolean z11 = false;
                int iL = 0;
                int i13 = 0;
                int i14 = 0;
                while (i14 < size2) {
                    Object obj = arrayList2.get(i14);
                    i14++;
                    Word word = (Word) obj;
                    View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_sentence_char, (ViewGroup) null, z11);
                    kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                    TextView textView = (TextView) frameLayout.findViewById(R.id.tv_char);
                    kotlin.jvm.internal.m.c(textView);
                    ff.h.L(context, textView, 18);
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    if (ry.l.D(new Integer[]{20, 40}, Integer.valueOf(cf.x.n().keyLanguage)) && kotlin.jvm.internal.m.a(word.getWord(), "َ") && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                        layoutParams.width = (int) fr.j3.Z(40, context);
                        textView.setLayoutParams(layoutParams);
                    }
                    int[] iArr = bq.r.f4959a;
                    bq.m.J(textView);
                    textView.setText(fr.j3.B(word));
                    frameLayout.setTag(word);
                    bq.z.b(frameLayout, new pr.a0(frameLayout, b0Var2, word, 2));
                    frameLayout.setLayoutParams(new FlexboxLayout.LayoutParams(-2, ff.h.s(R.dimen.sent_model_13_char_height)));
                    frameLayout.measure(0, 0);
                    int iL2 = ff.h.l(8.0f) + frameLayout.getMeasuredWidth() + iL;
                    int iL3 = iL2 - ff.h.l(8.0f);
                    ta.a aVar2 = b0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    if (iL3 <= ((hj.i1) aVar2).f32682e.getWidth()) {
                        ((List) arrayList.get(i13)).add(frameLayout);
                        iL = iL2;
                    } else {
                        iL = ff.h.l(8.0f) + frameLayout.getMeasuredWidth();
                        i13++;
                        arrayList.add(new ArrayList());
                        ((List) arrayList.get(i13)).add(frameLayout);
                    }
                    arrayList3.add(frameLayout);
                    z11 = false;
                }
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.include_flexbox_layout, (ViewGroup) null, false);
                    kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
                    FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate2;
                    Iterator it = ((List) obj2).iterator();
                    while (it.hasNext()) {
                        flexboxLayout.addView((FrameLayout) it.next());
                    }
                    ta.a aVar3 = b0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((hj.i1) aVar3).f32682e.addView(flexboxLayout);
                    LayoutTransition layoutTransition = new LayoutTransition();
                    layoutTransition.setAnimator(2, null);
                    layoutTransition.setAnimator(3, null);
                    flexboxLayout.setLayoutTransition(layoutTransition);
                }
                b0Var2.f47836k = new hh.s(b0Var2, 2);
                ta.a aVar4 = b0Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.i1) aVar4).f32681d.addTextChangedListener(b0Var2.f47836k);
                b0Var2.z();
                mp.b bVar = b0Var2.f47881a;
                Env env = b0Var2.f47884d;
                if (env.examCharAudioSwitch && env.isAudioModel && !((jp.p0) bVar).Q) {
                    int[] iArr2 = bq.r.f4959a;
                    if (bq.m.F()) {
                        ta.a aVar5 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar5);
                        ((hj.i1) aVar5).f32683f.setImageResource(R.drawable.ic_hint_audio);
                        int size4 = arrayList3.size();
                        int i16 = 0;
                        while (i16 < size4) {
                            Object obj3 = arrayList3.get(i16);
                            i16++;
                            FrameLayout frameLayout2 = (FrameLayout) obj3;
                            TextView textView2 = (TextView) frameLayout2.findViewById(R.id.tv_char);
                            ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.iv_hint_audio);
                            if (kotlin.jvm.internal.m.a(textView2.getText().toString(), " ")) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                            }
                        }
                    } else {
                        ta.a aVar6 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar6);
                        ((hj.i1) aVar6).f32683f.setImageResource(R.drawable.ic_hint_audio_close);
                        size = arrayList3.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj4 = arrayList3.get(i11);
                            i11++;
                            ((ImageView) ((FrameLayout) obj4).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                        }
                    }
                } else {
                    ta.a aVar7 = b0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar7);
                    ((hj.i1) aVar7).f32683f.setImageResource(R.drawable.ic_hint_audio_close);
                    size = arrayList3.size();
                    i11 = 0;
                    while (i11 < size) {
                        Object obj5 = arrayList3.get(i11);
                        i11++;
                        ((ImageView) ((FrameLayout) obj5).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                    }
                }
                if (!env.isAudioModel || ((jp.p0) bVar).Q) {
                    ta.a aVar8 = b0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar8);
                    ((hj.i1) aVar8).f32683f.setVisibility(8);
                } else {
                    ta.a aVar9 = b0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar9);
                    ((hj.i1) aVar9).f32683f.setVisibility(0);
                }
                int[] iArr3 = bq.r.f4959a;
                if (!bq.m.F()) {
                    ta.a aVar10 = b0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar10);
                    ((hj.i1) aVar10).f32683f.setVisibility(8);
                }
                break;
        }
        return b0Var;
    }
}
