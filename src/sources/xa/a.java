package xa;

import android.view.View;
import android.view.ViewGroup;
import b7.e0;
import com.google.android.flexbox.FlexLine;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.chinesetone.ChineseToneIndexActivity;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ptskill.ui.syllable.PTNewSyllableIntroductionActivity;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.AchievementRecordType;
import com.lingodeer.data.model.CoursePracticeType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import nv.p;
import qy.b0;
import rt.fc;
import rt.gc;
import rt.r8;
import tp.g;
import v0.c;
import xb.d;
import y0.h;
import y0.k;
import ya.j;
import ys.q2;
import zq.b;
import zu.a1;
import zu.f;
import zu.i1;
import zu.i2;
import zu.n1;
import zu.q;
import zu.r0;
import zu.s0;
import zu.t0;
import zu.u0;
import zu.v0;
import zu.w0;
import zu.x0;
import zu.y0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55975b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f55974a = i11;
        this.f55975b = obj;
    }

    @Override // fz.a
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        String str;
        int i11 = this.f55974a;
        b0 b0Var = b0.f48488a;
        Object obj = this.f55975b;
        switch (i11) {
            case 0:
                g gVar = (g) obj;
                Class<?> clsLoadClass = ((ClassLoader) gVar.f52461b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                m.e(clsLoadClass, "loadClass(...)");
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = ((ClassLoader) gVar.f52461b).loadClass("androidx.window.extensions.WindowExtensions");
                m.e(clsLoadClass2, "loadClass(...)");
                m.c(declaredMethod);
                return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 1:
                return d.a((d) obj);
            case 2:
                int i12 = PTNewSyllableIntroductionActivity.f21986t;
                ((PTNewSyllableIntroductionActivity) obj).finish();
                return b0Var;
            case 3:
                int i13 = UKRSyllableIntroductionActivity.H;
                ((UKRSyllableIntroductionActivity) obj).finish();
                return b0Var;
            case 4:
                ((q) obj).a(f.f59410a, new ju.d(25), new ju.d(25));
                return b0Var;
            case 5:
                ((i1) obj).b(a1.f59379a);
                return b0Var;
            case 6:
                ((i2) obj).a(n1.f59500a);
                return b0Var;
            case 7:
                k kVar = (k) obj;
                return kVar.P ? h.b(kVar) : c.f53452b;
            case 8:
                return ((qh.d) obj).c(":memory:");
            case 9:
                j jVar = (j) obj;
                return BigInteger.valueOf(jVar.f57559a).shiftLeft(32).or(BigInteger.valueOf(jVar.f57560b)).shiftLeft(32).or(BigInteger.valueOf(jVar.f57561c));
            case 10:
                gc gcVar = (gc) obj;
                return Integer.valueOf(gcVar instanceof fc ? ((fc) gcVar).f49763b : 0);
            case 11:
                q2 q2Var = (q2) obj;
                Long lValueOf = Long.valueOf(q2Var.f58223a);
                Long lValueOf2 = Long.valueOf(q2Var.f58224b);
                CoursePracticeType coursePracticeType = q2Var.f58225c;
                String str2 = q2Var.f58226d;
                Integer numValueOf = Integer.valueOf(q2Var.f58227e);
                List list = q2Var.f58228f;
                List list2 = q2Var.f58229g;
                r8 r8Var = q2Var.f58230h;
                return com.bumptech.glide.d.G(lValueOf, lValueOf2, coursePracticeType, str2, numValueOf, list, list2, Integer.valueOf(r8Var != null ? r8Var.b() : -1));
            case 12:
                int i14 = ChineseToneIndexActivity.f21610t;
                ((ChineseToneIndexActivity) obj).finish();
                return b0Var;
            case 13:
                FlexboxLayout flexboxLayout = ((b) obj).f59267c;
                List<FlexLine> flexLines = flexboxLayout.getFlexLines();
                m.e(flexLines, "getFlexLines(...)");
                if (flexLines.size() <= 1 || ((FlexLine) p.g(1, flexLines)).f8245h != 1) {
                    int childCount = flexboxLayout.getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = flexboxLayout.getChildAt(i15);
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        m.d(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                        FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) layoutParams;
                        layoutParams2.L = false;
                        childAt.setLayoutParams(layoutParams2);
                        childAt.requestLayout();
                    }
                } else {
                    View childAt2 = flexboxLayout.getChildAt(flexboxLayout.getChildCount() - 1);
                    m.e(childAt2, "getChildAt(...)");
                    Object tag = childAt2.getTag();
                    m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    Word word = (Word) tag;
                    if (flexboxLayout.getChildCount() > 2 && word.getWordType() == 1 && !m.a(word.getWord(), "_____")) {
                        View childAt3 = flexboxLayout.getChildAt(flexboxLayout.getChildCount() - 2);
                        m.e(childAt3, "getChildAt(...)");
                        ViewGroup.LayoutParams layoutParams3 = childAt3.getLayoutParams();
                        m.d(layoutParams3, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                        FlexboxLayout.LayoutParams layoutParams4 = (FlexboxLayout.LayoutParams) layoutParams3;
                        layoutParams4.L = true;
                        childAt3.setLayoutParams(layoutParams4);
                        childAt3.requestLayout();
                    }
                }
                return b0Var;
            default:
                y0 y0Var = (y0) obj;
                if (m.a(y0Var, s0.f59553a)) {
                    str = "achievement";
                } else if (m.a(y0Var, t0.f59562a)) {
                    str = "challenge_star";
                } else if (m.a(y0Var, u0.f59565a)) {
                    str = AchievementLevelType.DAY_STREAK;
                } else if (m.a(y0Var, v0.f59568a)) {
                    str = AchievementRecordType.LEADERBOARD;
                } else if (m.a(y0Var, w0.f59570a)) {
                    str = "xp";
                } else if (m.a(y0Var, x0.f59575a)) {
                    str = "wordSentence";
                } else {
                    if (!m.a(y0Var, r0.f59544a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "gem";
                }
                return e0.e("type", str);
        }
    }
}
