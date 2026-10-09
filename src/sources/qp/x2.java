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
public final /* synthetic */ class x2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f48257b;

    public /* synthetic */ x2(z2 z2Var, int i11) {
        this.f48256a = i11;
        this.f48257b = z2Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f8 A[LOOP:4: B:41:0x01f6->B:42:0x01f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x023e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // fz.a
    public final Object invoke() {
        int size;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        int i12 = this.f48256a;
        qy.b0 b0Var = qy.b0.f48488a;
        z2 z2Var = this.f48257b;
        switch (i12) {
            case 0:
                Context context = z2Var.f47883c;
                ta.a aVar = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ff.h.L(context, ((hj.c2) aVar).f32446d, 24);
                break;
            default:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ArrayList());
                ArrayList arrayList2 = z2Var.f48290n;
                ArrayList arrayList3 = z2Var.m;
                Context context2 = z2Var.f47883c;
                int size2 = arrayList2.size();
                ?? r9 = 0;
                int iL = 0;
                int i13 = 0;
                int i14 = 0;
                while (i14 < size2) {
                    Object obj = arrayList2.get(i14);
                    i14++;
                    Word word = (Word) obj;
                    View viewInflate = LayoutInflater.from(context2).inflate(R.layout.item_sentence_char, (ViewGroup) null, (boolean) r9);
                    kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                    TextView textView = (TextView) frameLayout.findViewById(R.id.tv_char);
                    textView.setTextSize(r9, z2Var.v());
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    if (ry.l.D(new Integer[]{20, 40}, Integer.valueOf(cf.x.n().keyLanguage)) && kotlin.jvm.internal.m.a(word.getWord(), "َ") && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                        layoutParams.width = (int) fr.j3.Z(40, context2);
                        textView.setLayoutParams(layoutParams);
                    }
                    int[] iArr = bq.r.f4959a;
                    bq.m.J(textView);
                    textView.setText(fr.j3.B(word));
                    frameLayout.setTag(word);
                    bq.z.b(frameLayout, new pr.a0(frameLayout, z2Var, word, 7));
                    frameLayout.setLayoutParams(new FlexboxLayout.LayoutParams(-2, ff.h.s(R.dimen.sent_model_13_char_height)));
                    frameLayout.measure(0, 0);
                    int iL2 = ff.h.l(8.0f) + frameLayout.getMeasuredWidth() + iL;
                    int iL3 = iL2 - ff.h.l(8.0f);
                    ta.a aVar2 = z2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    if (iL3 <= ((hj.c2) aVar2).f32447e.getWidth()) {
                        ((List) arrayList.get(i13)).add(frameLayout);
                        iL = iL2;
                    } else {
                        iL = ff.h.l(8.0f) + frameLayout.getMeasuredWidth();
                        i13++;
                        arrayList.add(new ArrayList());
                        ((List) arrayList.get(i13)).add(frameLayout);
                    }
                    arrayList3.add(frameLayout);
                    r9 = 0;
                }
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    View viewInflate2 = LayoutInflater.from(context2).inflate(R.layout.include_flexbox_layout, (ViewGroup) null, false);
                    kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
                    FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate2;
                    Iterator it = ((List) obj2).iterator();
                    while (it.hasNext()) {
                        flexboxLayout.addView((FrameLayout) it.next());
                    }
                    ta.a aVar3 = z2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((hj.c2) aVar3).f32447e.addView(flexboxLayout);
                    LayoutTransition layoutTransition = new LayoutTransition();
                    layoutTransition.setAnimator(2, null);
                    layoutTransition.setAnimator(3, null);
                    flexboxLayout.setLayoutTransition(layoutTransition);
                }
                z2Var.f48288k = new hh.s(z2Var, 4);
                ta.a aVar4 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.c2) aVar4).f32446d.addTextChangedListener(z2Var.f48288k);
                z2Var.B();
                mp.b bVar = z2Var.f47881a;
                Env env = z2Var.f47884d;
                if (env.examCharAudioSwitch && env.isAudioModel && !((jp.p0) bVar).Q) {
                    int[] iArr2 = bq.r.f4959a;
                    if (bq.m.F()) {
                        ta.a aVar5 = z2Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar5);
                        ((hj.c2) aVar5).f32450h.setImageResource(R.drawable.ic_hint_audio);
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
                        ta.a aVar6 = z2Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar6);
                        ((hj.c2) aVar6).f32450h.setImageResource(R.drawable.ic_hint_audio_close);
                        size = arrayList3.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj4 = arrayList3.get(i11);
                            i11++;
                            ((ImageView) ((FrameLayout) obj4).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                        }
                    }
                } else {
                    ta.a aVar7 = z2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar7);
                    ((hj.c2) aVar7).f32450h.setImageResource(R.drawable.ic_hint_audio_close);
                    size = arrayList3.size();
                    i11 = 0;
                    while (i11 < size) {
                        Object obj5 = arrayList3.get(i11);
                        i11++;
                        ((ImageView) ((FrameLayout) obj5).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                    }
                }
                if (!env.isAudioModel || ((jp.p0) bVar).Q) {
                    ta.a aVar8 = z2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar8);
                    ((hj.c2) aVar8).f32450h.setVisibility(8);
                } else {
                    int[] iArr3 = bq.r.f4959a;
                    if (bq.m.F()) {
                        ta.a aVar9 = z2Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar9);
                        ConstraintLayout rootParent = ((hj.c2) aVar9).f32453k;
                        kotlin.jvm.internal.m.e(rootParent, "rootParent");
                        bq.z.b(rootParent, new w2(z2Var, 1));
                    } else {
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (ry.l.D(new Integer[]{53, 54}, Integer.valueOf(cf.x.n().keyLanguage))) {
                            ta.a aVar10 = z2Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar10);
                            ConstraintLayout rootParent2 = ((hj.c2) aVar10).f32453k;
                            kotlin.jvm.internal.m.e(rootParent2, "rootParent");
                            bq.z.b(rootParent2, new w2(z2Var, 1));
                        }
                    }
                }
                int[] iArr4 = bq.r.f4959a;
                if (!bq.m.F()) {
                    ta.a aVar11 = z2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar11);
                    ((hj.c2) aVar11).f32450h.setVisibility(8);
                }
                break;
        }
        return b0Var;
    }
}
