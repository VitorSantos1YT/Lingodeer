package ar;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.k1;
import b7.e0;
import bq.r;
import com.lingo.course.ui.CourseReviewListActivity;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.ui.review.BaseReviewEmptyActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import fr.o0;
import jp.y0;
import kotlin.jvm.internal.m;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import ry.l;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f2850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ur.a f2851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2852c;

    public g(n0 envRepository, ur.a eventTracker, Context context) {
        m.f(envRepository, "envRepository");
        m.f(eventTracker, "eventTracker");
        this.f2850a = envRepository;
        this.f2851b = eventTracker;
        this.f2852c = context;
    }

    public final void a(Integer[] numArr, int i11, k1 k1Var) {
        o0 o0Var = (o0) this.f2850a;
        int i12 = l.D(numArr, Integer.valueOf(o0Var.f27733a.locateLanguage)) ? o0Var.f27733a.locateLanguage : 3;
        int[] iArr = r.f4959a;
        String strX = bq.m.x(o0Var.f27733a.locateLanguage);
        if (l.D(numArr, Integer.valueOf(o0Var.f27733a.locateLanguage))) {
            int i13 = SwitchLanguageActivity.M;
            Context context = this.f2852c;
            context.startActivity(tw.c.p(context, new LanguageItem(i11, i12, bq.m.s(context, i11)), (8 & 4) != 0, OYAvlbfUyD.xZnwOYMncSkzgRT));
        } else {
            Bundle bundleE = e0.e(INTENTS.EXTRA_STRING, strX);
            y0 y0Var = new y0();
            y0Var.setArguments(bundleE);
            y0Var.u(k1Var, "ChooseEnglishLanBottomSheetDialogFragment");
            y0Var.U = new f(this, i11, i12, y0Var);
        }
    }

    public final void b(int i11, i.c reviewActivityResultLauncher, boolean z11) {
        m.f(reviewActivityResultLauncher, "reviewActivityResultLauncher");
        e0.A(this.f2851b, "jxz_review_click_character");
        Context context = this.f2852c;
        if (z11) {
            int i12 = CourseReviewListActivity.L;
            reviewActivityResultLauncher.a(p20.c.p(context, 2, true));
        } else if (i11 > 0) {
            int i13 = CourseReviewListActivity.L;
            reviewActivityResultLauncher.a(p20.c.p(context, 2, false));
        } else {
            int i14 = BaseReviewEmptyActivity.H;
            String string = context.getString(R.string.characters);
            m.e(string, "getString(...)");
            context.startActivity(o00.a.E(context, string));
        }
    }

    public final void c(int i11, i.c reviewActivityResultLauncher, boolean z11) {
        m.f(reviewActivityResultLauncher, "reviewActivityResultLauncher");
        Context context = this.f2852c;
        if (z11) {
            int i12 = CourseReviewListActivity.L;
            reviewActivityResultLauncher.a(p20.c.p(context, 1, true));
        } else if (i11 > 0) {
            int i13 = CourseReviewListActivity.L;
            reviewActivityResultLauncher.a(p20.c.p(context, 1, false));
        } else {
            int i14 = BaseReviewEmptyActivity.H;
            String string = context.getString(R.string.sentences);
            m.e(string, "getString(...)");
            context.startActivity(o00.a.E(context, string));
        }
    }

    public final void d(int i11, i.c reviewActivityResultLauncher, boolean z11) {
        m.f(reviewActivityResultLauncher, "reviewActivityResultLauncher");
        e0.A(this.f2851b, "jxz_review_click_vocab");
        Context context = this.f2852c;
        if (z11) {
            int i12 = CourseReviewListActivity.L;
            reviewActivityResultLauncher.a(p20.c.p(context, 0, true));
        } else if (i11 > 0) {
            int i13 = CourseReviewListActivity.L;
            reviewActivityResultLauncher.a(p20.c.p(context, 0, false));
        } else {
            int i14 = BaseReviewEmptyActivity.H;
            String string = context.getString(R.string.words);
            m.e(string, "getString(...)");
            context.startActivity(o00.a.E(context, string));
        }
    }
}
