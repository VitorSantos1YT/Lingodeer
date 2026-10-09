package bj;

import av.i;
import bp.v2;
import com.google.api.Service;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.fluent.ui.base.PdLearnActivity;
import com.lingo.fluent.ui.base.PdLearnIndexActivity;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableTableActivity;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.koreanskill.ui.syllable.ui.KOYinTuActivity;
import com.lingo.lingoskill.ui.base.FindPasswordActivity;
import com.lingo.lingoskill.ui.base.MoreLingodeerActivity;
import com.lingo.lingoskill.ui.base.SignUpActivity;
import com.lingo.lingoskill.vtskill.ui.syllable.ui.VTSyllableActivity;
import com.lingo.notification.UnifiedNotificationJobService;
import com.lingo.story.ui.StoryActivity;
import com.lingodeer.data.env.Env;
import dv.u0;
import ef.e;
import ej.l;
import gi.d;
import gp.l1;
import hh.c0;
import hh.f1;
import hh.o0;
import java.util.ArrayList;
import jh.o;
import jp.q0;
import jt.v;
import km.t0;
import km.x1;
import kotlin.jvm.internal.z;
import kr.p0;
import l1.p1;
import l1.s0;
import ph.s;
import qy.b0;
import vt.h1;
import wu.k0;
import y.e0;
import y.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4455b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f4454a = i11;
        this.f4455b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [y.e0] */
    /* JADX WARN: Type inference failed for: r11v9, types: [y.e0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, l1.t0] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f4454a;
        Object obj = this.f4455b;
        switch (i11) {
            case 0:
                return e.q((b) obj).a(null, null, z.a(ur.a.class));
            case 1:
                return e.q((FindPasswordActivity) obj).a(null, null, z.a(u0.class));
            case 2:
                return (v2) obj;
            case 3:
                MoreLingodeerActivity moreLingodeerActivity = (MoreLingodeerActivity) obj;
                return i20.b.a(z.a(l1.class), moreLingodeerActivity.getViewModelStore(), null, moreLingodeerActivity.getDefaultViewModelCreationExtras(), null, e.q(moreLingodeerActivity), null);
            case 4:
                SignUpActivity signUpActivity = (SignUpActivity) obj;
                return i20.b.a(z.a(k0.class), signUpActivity.getViewModelStore(), null, signUpActivity.getDefaultViewModelCreationExtras(), null, e.q(signUpActivity), null);
            case 5:
                return e.q((CourseTestIndexActivity) obj).a(null, null, z.a(vt.k0.class));
            case 6:
                ARSyllableTableActivity aRSyllableTableActivity = (ARSyllableTableActivity) obj;
                return i20.b.a(z.a(d.class), aRSyllableTableActivity.getViewModelStore(), null, aRSyllableTableActivity.getDefaultViewModelCreationExtras(), null, e.q(aRSyllableTableActivity), null);
            case 7:
                return ((l) obj).requireActivity();
            case 8:
                return e.q((UnifiedNotificationJobService) obj).a(null, null, z.a(h1.class));
            case 9:
                ((v) obj).f37224p.setValue(-1);
                return b0.f48488a;
            case 10:
                KOYinTuActivity kOYinTuActivity = (KOYinTuActivity) obj;
                return i20.b.a(z.a(gn.e.class), kOYinTuActivity.getViewModelStore(), null, kOYinTuActivity.getDefaultViewModelCreationExtras(), null, e.q(kOYinTuActivity), null);
            case 11:
                PdLearnActivity pdLearnActivity = (PdLearnActivity) obj;
                return i20.b.a(z.a(o.class), pdLearnActivity.getViewModelStore(), null, pdLearnActivity.getDefaultViewModelCreationExtras(), null, e.q(pdLearnActivity), null);
            case 12:
                return ((c0) obj).requireActivity();
            case 13:
                PdLearnIndexActivity pdLearnIndexActivity = (PdLearnIndexActivity) obj;
                return i20.b.a(z.a(s.class), pdLearnIndexActivity.getViewModelStore(), null, pdLearnIndexActivity.getDefaultViewModelCreationExtras(), null, e.q(pdLearnIndexActivity), null);
            case 14:
                return ((o0) obj).requireActivity();
            case 15:
                return ((hh.u0) obj).requireActivity();
            case 16:
                return ((f1) obj).requireActivity();
            case 17:
                return ((hp.d) obj).requireActivity();
            case 18:
                return e.q((q0) obj).a(null, null, z.a(ur.a.class));
            case 19:
                return e.q((jp.u0) obj).a(null, null, z.a(ur.a.class));
            case 20:
                return e.q((jp.h1) obj).a(null, null, z.a(ur.a.class));
            case 21:
                StoryActivity storyActivity = (StoryActivity) obj;
                return i20.b.a(z.a(p0.class), storyActivity.getViewModelStore(), null, storyActivity.getDefaultViewModelCreationExtras(), null, e.q(storyActivity), null);
            case 22:
                return ((km.c0) obj).requireActivity();
            case 23:
                return e.q((t0) obj).a(null, null, z.a(Env.class));
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return e.q((x1) obj).a(null, null, z.a(vt.k0.class));
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ArrayList arrayList = ((p1) obj).f39390a;
                i0 i0Var = new i0(arrayList.size());
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ?? r9 = (l1.t0) arrayList.get(i12);
                    Object obj2 = r9.f39466b;
                    int i13 = r9.f39465a;
                    Object s0Var = obj2 != null ? new s0(Integer.valueOf(i13), r9.f39466b) : Integer.valueOf(i13);
                    int iF = i0Var.f(s0Var);
                    boolean z11 = iF < 0;
                    Object obj3 = z11 ? null : i0Var.f56715c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof e0) {
                            ?? r11 = (e0) obj3;
                            r11.a(r9);
                            r9 = r11;
                        } else {
                            Object[] objArr = y.o0.f56745a;
                            ?? e0Var = new e0(2);
                            e0Var.a(obj3);
                            e0Var.a(r9);
                            r9 = e0Var;
                        }
                    }
                    if (z11) {
                        int i14 = ~iF;
                        i0Var.f56714b[i14] = s0Var;
                        i0Var.f56715c[i14] = r9;
                    } else {
                        i0Var.f56715c[iF] = r9;
                    }
                }
                return new n1.a(i0Var);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                Subscription2Activity subscription2Activity = (Subscription2Activity) obj;
                return i20.b.a(z.a(l1.class), subscription2Activity.getViewModelStore(), null, subscription2Activity.getDefaultViewModelCreationExtras(), null, e.q(subscription2Activity), null);
            case 27:
                return e.q((oo.k0) obj).a(null, null, z.a(i.class));
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                VTSyllableActivity vTSyllableActivity = (VTSyllableActivity) obj;
                return i20.b.a(z.a(tq.d.class), vTSyllableActivity.getViewModelStore(), null, vTSyllableActivity.getDefaultViewModelCreationExtras(), null, e.q(vTSyllableActivity), null);
            default:
                return (androidx.fragment.app.k0) obj;
        }
    }
}
