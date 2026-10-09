package km;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.object.YinTu;
import com.lingodeer.R;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends bp.m {
    public a9.i O;

    public i1() {
        super(h1.f38208a, BuildConfig.VERSION_NAME);
        LearnType learnType = LearnType.LEARN;
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onDestroy() {
        super.onDestroy();
        a9.i iVar = this.O;
        if (iVar != null) {
            iVar.y();
            a9.i iVar2 = this.O;
            kotlin.jvm.internal.m.c(iVar2);
            iVar2.l();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        a9.i iVar = this.O;
        if (iVar != null) {
            iVar.y();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final i1 i1Var;
        int i16;
        char c11;
        char c12;
        char c13;
        List listK;
        Collection collectionT;
        i1 i1Var2 = this;
        Context contextRequireContext = i1Var2.requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        String strY = ff.h.y(contextRequireContext, R.string.introduction);
        l.m mVar = i1Var2.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = i1Var2.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(strY, mVar, view);
        i1Var2.getContext();
        i1Var2.O = new a9.i(1);
        View view2 = i1Var2.f36399e;
        kotlin.jvm.internal.m.c(view2);
        FlexboxLayout flexboxLayout = (FlexboxLayout) view2.findViewById(R.id.flex_long_vowels_1);
        View view3 = i1Var2.f36399e;
        kotlin.jvm.internal.m.c(view3);
        FlexboxLayout flexboxLayout2 = (FlexboxLayout) view3.findViewById(R.id.flex_long_vowels_2);
        View view4 = i1Var2.f36399e;
        kotlin.jvm.internal.m.c(view4);
        FlexboxLayout flexboxLayout3 = (FlexboxLayout) view4.findViewById(R.id.flex_long_vowels_3);
        String[] strArr = {ep.a.g("あ/a-", i1Var2.getString(R.string.column), "\nあ・か・さ・た…"), ep.a.g("い/i-", i1Var2.getString(R.string.column), "\nい・き・し・ち…"), ep.a.g("う/u-", i1Var2.getString(R.string.column), "\nう・く・す・つ…"), ep.a.g("え/e-", i1Var2.getString(R.string.column), "\nえ・け・せ・て…"), ep.a.g("お/o-", i1Var2.getString(R.string.column), "\nお・こ・そ・と…")};
        boolean z11 = false;
        int i17 = 0;
        while (true) {
            i11 = 5;
            if (i17 >= 5) {
                break;
            }
            String str = strArr[i17];
            Matcher matcher = b7.e0.u(0, "\n", "compile(...)", str, "input").matcher(str);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iC = 0;
                do {
                    iC = nv.p.c(matcher, str, iC, arrayList);
                } while (matcher.find());
                nv.p.B(iC, str, arrayList);
                listK = arrayList;
            } else {
                listK = ns.o.K(str.toString());
            }
            if (listK.isEmpty()) {
                collectionT = ry.r.f50854a;
                break;
                break;
            }
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionT = b7.e0.t(listIterator, 1, listK);
                        break;
                    }
                } else {
                    collectionT = ry.r.f50854a;
                    break;
                }
            }
            String[] strArr2 = (String[]) collectionT.toArray(new String[0]);
            View viewInflate = LayoutInflater.from(i1Var2.getContext()).inflate(R.layout.item_long_vowels_table_1, (ViewGroup) flexboxLayout, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_top);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_btm);
            textView.setText(strArr2[0]);
            textView2.setText(strArr2[1]);
            flexboxLayout.addView(viewInflate);
            i17++;
        }
        int[] iArr = {1, 2, 3, 4, 5, 2, 3};
        for (int i18 = 0; i18 < 7; i18++) {
            if (dm.a.f23483c == null) {
                synchronized (dm.a.class) {
                    if (dm.a.f23483c == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication);
                        dm.a.f23483c = new dm.a(lingoSkillApplication);
                    }
                }
            }
            dm.a aVar = dm.a.f23483c;
            kotlin.jvm.internal.m.c(aVar);
            YinTu yinTu = (YinTu) aVar.o().load(Long.valueOf(iArr[i18]));
            View viewInflate2 = LayoutInflater.from(i1Var2.getContext()).inflate(R.layout.item_long_vowels_table_2, (ViewGroup) flexboxLayout2, false);
            ((TextView) viewInflate2.findViewById(R.id.tv_top)).setText(yinTu.getPing());
            if (i18 == 5) {
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(ff.h.l(60.0f), ff.h.l(60.0f));
                layoutParams.L = true;
                viewInflate2.setLayoutParams(layoutParams);
            }
            bq.z.b(viewInflate2, new j9.h(11, i1Var2, yinTu));
            flexboxLayout2.addView(viewInflate2);
        }
        int i19 = 2662;
        int i21 = 158;
        int i22 = 30;
        int i23 = 718;
        int[] iArr2 = {2662, 158, 30, 718, 159};
        int i24 = 0;
        while (true) {
            i12 = R.id.tv_trans;
            i13 = R.id.tv_luoma;
            i14 = R.id.tv_word;
            i15 = R.layout.item_syllable_jp_word_info;
            if (i24 >= i11) {
                i1Var = i1Var2;
                break;
            }
            final int i25 = iArr2[i24];
            Word wordH = ij.c.h(i25);
            if (wordH == null) {
                i1Var = this;
                break;
            }
            View viewInflate3 = LayoutInflater.from(getContext()).inflate(R.layout.item_syllable_jp_word_info, flexboxLayout3, z11);
            TextView textView3 = (TextView) viewInflate3.findViewById(R.id.tv_word);
            TextView textView4 = (TextView) viewInflate3.findViewById(R.id.tv_luoma);
            ((TextView) viewInflate3.findViewById(R.id.tv_trans)).setText(wordH.getTranslations());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) (wordH.getWord() + "( " + wordH.getZhuyin() + " )"));
            if (i25 == i22) {
                Context contextRequireContext2 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext2.getColor(R.color.colorAccent)), 7, 8, 33);
            } else if (i25 == i23) {
                Context contextRequireContext3 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext3.getColor(R.color.colorAccent)), 5, 6, 33);
                Context contextRequireContext4 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext4.getColor(R.color.colorAccent)), 7, 8, 33);
            } else if (i25 == i19) {
                Context contextRequireContext5 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext5.getColor(R.color.colorAccent)), 8, 9, 33);
            } else if (i25 == i21) {
                Context contextRequireContext6 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext6, "requireContext(...)");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext6.getColor(R.color.colorAccent)), 6, 7, 33);
            } else if (i25 == 159) {
                Context contextRequireContext7 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext7, "requireContext(...)");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext7.getColor(R.color.colorAccent)), 6, 7, 33);
            }
            textView3.setText(spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) wordH.getLuoma());
            if (i25 != 30) {
                if (i25 == 718) {
                    i16 = 158;
                    c11 = 159;
                    c12 = 7;
                    Context contextRequireContext8 = requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext8, "requireContext(...)");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext8.getColor(R.color.colorAccent)), 3, 4, 33);
                    Context contextRequireContext9 = requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext9, "requireContext(...)");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext9.getColor(R.color.colorAccent)), 8, 9, 33);
                } else if (i25 != 2662) {
                    i16 = 158;
                    if (i25 != 158) {
                        c11 = 159;
                        if (i25 != 159) {
                            c13 = '\n';
                            c12 = 7;
                        } else {
                            Context contextRequireContext10 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext10, "requireContext(...)");
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext10.getColor(R.color.colorAccent)), 2, 3, 33);
                            Context contextRequireContext11 = requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext11, "requireContext(...)");
                            c12 = 7;
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext11.getColor(R.color.colorAccent)), 7, 8, 33);
                        }
                    } else {
                        c11 = 159;
                        c12 = 7;
                        Context contextRequireContext12 = requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext12, "requireContext(...)");
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext12.getColor(R.color.colorAccent)), 4, 5, 33);
                    }
                } else {
                    i16 = 158;
                    c11 = 159;
                    c12 = 7;
                    Context contextRequireContext13 = requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext13, "requireContext(...)");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext13.getColor(R.color.colorAccent)), 5, 6, 33);
                }
                c13 = '\n';
            } else {
                i16 = 158;
                c11 = 159;
                c12 = 7;
                Context contextRequireContext14 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext14, "requireContext(...)");
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(contextRequireContext14.getColor(R.color.colorAccent));
                c13 = '\n';
                spannableStringBuilder2.setSpan(foregroundColorSpan, 9, 10, 33);
            }
            textView4.setText(spannableStringBuilder2);
            final int i26 = 0;
            bq.z.b(viewInflate3, new fz.c(this) { // from class: km.g1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i1 f38196b;

                {
                    this.f38196b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i26) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar = this.f38196b.O;
                            kotlin.jvm.internal.m.c(iVar);
                            iVar.v(fv.b.Y(i25, null, null));
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar2 = this.f38196b.O;
                            kotlin.jvm.internal.m.c(iVar2);
                            iVar2.v(fv.b.Y(i25, null, null));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            flexboxLayout3.addView(viewInflate3);
            i24++;
            i1Var2 = this;
            i21 = i16;
            i19 = 2662;
            z11 = false;
            i22 = 30;
            i23 = 718;
            i11 = 5;
        }
        View view5 = i1Var.f36399e;
        kotlin.jvm.internal.m.c(view5);
        FlexboxLayout flexboxLayout4 = (FlexboxLayout) view5.findViewById(R.id.flex_sokuon_3);
        int[] iArr3 = {231, 431, 1443};
        int i27 = 0;
        while (i27 < 3) {
            final int i28 = iArr3[i27];
            Word wordH2 = ij.c.h(i28);
            if (wordH2 == null) {
                return;
            }
            View viewInflate4 = LayoutInflater.from(i1Var.getContext()).inflate(i15, (ViewGroup) flexboxLayout4, false);
            TextView textView5 = (TextView) viewInflate4.findViewById(i14);
            TextView textView6 = (TextView) viewInflate4.findViewById(i13);
            ((TextView) viewInflate4.findViewById(i12)).setText(wordH2.getTranslations());
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) (wordH2.getWord() + "( " + wordH2.getZhuyin() + " )"));
            int length = spannableStringBuilder3.length();
            for (int i29 = 0; i29 < length; i29++) {
                if (kotlin.jvm.internal.m.a(String.valueOf(spannableStringBuilder3.charAt(i29)), "っ")) {
                    Context contextRequireContext15 = i1Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext15, "requireContext(...)");
                    spannableStringBuilder3.setSpan(new ForegroundColorSpan(contextRequireContext15.getColor(R.color.colorAccent)), i29, i29 + 1, 33);
                }
            }
            textView5.setText(spannableStringBuilder3);
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            spannableStringBuilder4.append((CharSequence) wordH2.getLuoma());
            if (i28 == 231) {
                int length2 = spannableStringBuilder4.length();
                for (int i30 = 0; i30 < length2; i30++) {
                    if (kotlin.jvm.internal.m.a(String.valueOf(spannableStringBuilder4.charAt(i30)), "k")) {
                        Context contextRequireContext16 = i1Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext16, "requireContext(...)");
                        spannableStringBuilder4.setSpan(new ForegroundColorSpan(contextRequireContext16.getColor(R.color.colorAccent)), i30, i30 + 1, 33);
                    }
                }
            } else {
                int length3 = spannableStringBuilder4.length();
                for (int i31 = 0; i31 < length3; i31++) {
                    if (kotlin.jvm.internal.m.a(String.valueOf(spannableStringBuilder4.charAt(i31)), "s")) {
                        Context contextRequireContext17 = i1Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext17, "requireContext(...)");
                        spannableStringBuilder4.setSpan(new ForegroundColorSpan(contextRequireContext17.getColor(R.color.colorAccent)), i31, i31 + 1, 33);
                    }
                }
            }
            textView6.setText(spannableStringBuilder4);
            final int i32 = 1;
            bq.z.b(viewInflate4, new fz.c(i1Var) { // from class: km.g1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i1 f38196b;

                {
                    this.f38196b = i1Var;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i32) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar = this.f38196b.O;
                            kotlin.jvm.internal.m.c(iVar);
                            iVar.v(fv.b.Y(i28, null, null));
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar2 = this.f38196b.O;
                            kotlin.jvm.internal.m.c(iVar2);
                            iVar2.v(fv.b.Y(i28, null, null));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            flexboxLayout4.addView(viewInflate4);
            i27++;
            i14 = R.id.tv_word;
            i15 = R.layout.item_syllable_jp_word_info;
            i12 = R.id.tv_trans;
            i13 = R.id.tv_luoma;
        }
    }
}
