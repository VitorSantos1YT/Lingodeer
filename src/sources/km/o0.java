package km;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f38254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FlexboxLayout f38255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i11, j1 j1Var, FlexboxLayout flexboxLayout, vy.d dVar, int i12) {
        super(2, dVar);
        this.f38251a = i12;
        this.f38253c = i11;
        this.f38254d = j1Var;
        this.f38255e = flexboxLayout;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38251a) {
            case 0:
                return new o0(this.f38253c, this.f38254d, this.f38255e, dVar, 0);
            default:
                return new o0(this.f38253c, this.f38254d, this.f38255e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38251a) {
            case 0:
                break;
        }
        return ((o0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objM;
        Object objM2;
        int i11 = this.f38251a;
        qy.b0 b0Var = qy.b0.f48488a;
        FlexboxLayout flexboxLayout = this.f38255e;
        j1 j1Var = this.f38254d;
        vy.d dVar = null;
        int i12 = this.f38253c;
        int i13 = 2;
        int i14 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f38252b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    n0 n0Var = new n0(i12, i14, dVar);
                    this.f38252b = 1;
                    objM = rz.e0.M(eVar, n0Var, this);
                    if (objM == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objM = obj;
                }
                Word word = (Word) objM;
                if (word == null) {
                    return b0Var;
                }
                View viewInflate = LayoutInflater.from(j1Var.getContext()).inflate(R.layout.item_syllable_jp_word_info, (ViewGroup) flexboxLayout, false);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_word);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_luoma);
                ((TextView) viewInflate.findViewById(R.id.tv_trans)).setText(word.getTranslations());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) (word.getWord() + "( " + word.getZhuyin() + " )"));
                if (i12 == 30) {
                    Context contextRequireContext = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext.getColor(R.color.colorAccent)), 7, 8, 33);
                } else if (i12 == 718) {
                    Context contextRequireContext2 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext2.getColor(R.color.colorAccent)), 5, 6, 33);
                    Context contextRequireContext3 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext3.getColor(R.color.colorAccent)), 7, 8, 33);
                } else if (i12 == 2662) {
                    Context contextRequireContext4 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext4.getColor(R.color.colorAccent)), 8, 9, 33);
                } else if (i12 == 158) {
                    Context contextRequireContext5 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext5.getColor(R.color.colorAccent)), 6, 7, 33);
                } else if (i12 == 159) {
                    Context contextRequireContext6 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext6, "requireContext(...)");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext6.getColor(R.color.colorAccent)), 6, 7, 33);
                }
                textView.setText(spannableStringBuilder);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) word.getLuoma());
                if (i12 == 30) {
                    Context contextRequireContext7 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext7, "requireContext(...)");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext7.getColor(R.color.colorAccent)), 9, 10, 33);
                } else if (i12 == 718) {
                    Context contextRequireContext8 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext8, "requireContext(...)");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext8.getColor(R.color.colorAccent)), 3, 4, 33);
                    Context contextRequireContext9 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext9, "requireContext(...)");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext9.getColor(R.color.colorAccent)), 8, 9, 33);
                } else if (i12 == 2662) {
                    Context contextRequireContext10 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext10, "requireContext(...)");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext10.getColor(R.color.colorAccent)), 5, 6, 33);
                } else if (i12 == 158) {
                    Context contextRequireContext11 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext11, "requireContext(...)");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext11.getColor(R.color.colorAccent)), 4, 5, 33);
                } else if (i12 == 159) {
                    Context contextRequireContext12 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext12, "requireContext(...)");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext12.getColor(R.color.colorAccent)), 2, 3, 33);
                    Context contextRequireContext13 = j1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext13, "requireContext(...)");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext13.getColor(R.color.colorAccent)), 7, 8, 33);
                }
                textView2.setText(spannableStringBuilder2);
                bq.z.b(viewInflate, new m0(j1Var, i12, 1));
                flexboxLayout.addView(viewInflate);
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f38252b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar2 = rz.o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    n0 n0Var2 = new n0(i12, i13, dVar);
                    this.f38252b = 1;
                    objM2 = rz.e0.M(eVar2, n0Var2, this);
                    if (objM2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objM2 = obj;
                }
                Word word2 = (Word) objM2;
                if (word2 == null) {
                    return b0Var;
                }
                View viewInflate2 = LayoutInflater.from(j1Var.getContext()).inflate(R.layout.item_syllable_jp_word_info, (ViewGroup) flexboxLayout, false);
                TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tv_word);
                TextView textView4 = (TextView) viewInflate2.findViewById(R.id.tv_luoma);
                ((TextView) viewInflate2.findViewById(R.id.tv_trans)).setText(word2.getTranslations());
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                spannableStringBuilder3.append((CharSequence) (word2.getWord() + "( " + word2.getZhuyin() + " )"));
                int length = spannableStringBuilder3.length();
                for (int i17 = 0; i17 < length; i17++) {
                    if (kotlin.jvm.internal.m.a(String.valueOf(spannableStringBuilder3.charAt(i17)), "っ")) {
                        Context contextRequireContext14 = j1Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext14, "requireContext(...)");
                        spannableStringBuilder3.setSpan(new ForegroundColorSpan(contextRequireContext14.getColor(R.color.colorAccent)), i17, i17 + 1, 33);
                    }
                }
                textView3.setText(spannableStringBuilder3);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) word2.getLuoma());
                if (i12 == 231) {
                    int length2 = spannableStringBuilder4.length();
                    for (int i18 = 0; i18 < length2; i18++) {
                        if (kotlin.jvm.internal.m.a(String.valueOf(spannableStringBuilder4.charAt(i18)), "k")) {
                            Context contextRequireContext15 = j1Var.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext15, "requireContext(...)");
                            spannableStringBuilder4.setSpan(new ForegroundColorSpan(contextRequireContext15.getColor(R.color.colorAccent)), i18, i18 + 1, 33);
                        }
                    }
                } else {
                    int length3 = spannableStringBuilder4.length();
                    for (int i19 = 0; i19 < length3; i19++) {
                        if (kotlin.jvm.internal.m.a(String.valueOf(spannableStringBuilder4.charAt(i19)), "s")) {
                            Context contextRequireContext16 = j1Var.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext16, "requireContext(...)");
                            spannableStringBuilder4.setSpan(new ForegroundColorSpan(contextRequireContext16.getColor(R.color.colorAccent)), i19, i19 + 1, 33);
                        }
                    }
                }
                textView4.setText(spannableStringBuilder4);
                bq.z.b(viewInflate2, new m0(j1Var, i12, 2));
                flexboxLayout.addView(viewInflate2);
                return b0Var;
        }
    }
}
