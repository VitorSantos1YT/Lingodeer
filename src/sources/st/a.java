package st;

import a0.f1;
import a0.l1;
import a0.m1;
import a0.o;
import a0.y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.View;
import app.rive.runtime.kotlin.RiveAnimationView;
import b0.e;
import bq.r;
import cf.x;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.idnskill.ui.learn.IDNSyllableIntroductionActivity;
import d0.b1;
import fz.c;
import j3.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import m0.t;
import ob.f;
import oz.q;
import qu.u;
import qy.b0;
import qy.l;
import t1.d;
import tg.e0;
import tg.i0;
import tg.z0;
import vt.r0;
import vt.w0;
import w2.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51779a;

    public /* synthetic */ a(int i11) {
        this.f51779a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x02cc  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Collection] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        String str;
        int i11 = this.f51779a;
        int i12 = 6;
        int i13 = 2;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                u10.a singleOf = (u10.a) obj;
                m.f(singleOf, "$this$singleOf");
                singleOf.f52730e = ry.m.G0(z.a(vt.c.class), singleOf.f52730e);
                return b0Var;
            case 1:
                u10.a singleOf2 = (u10.a) obj;
                m.f(singleOf2, "$this$singleOf");
                singleOf2.f52730e = ry.m.G0(z.a(w0.class), singleOf2.f52730e);
                return b0Var;
            case 2:
                u10.a singleOf3 = (u10.a) obj;
                m.f(singleOf3, "$this$singleOf");
                singleOf3.f52730e = ry.m.G0(z.a(r0.class), singleOf3.f52730e);
                return b0Var;
            case 3:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i14);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 4:
                i0 i0Var = (i0) obj;
                m.f(i0Var, "<this>");
                return new e0(new d(new u(i13, i0Var, new c[]{new a(i12), new a(7), new a(8), new a(9)}), true, -373393724));
            case 5:
                i0 i0Var2 = (i0) obj;
                m.f(i0Var2, "<this>");
                return new z0(new d(new b1(i12, i0Var2, new String[]{"•", "◦", "▸", "▹"}), true, 15273025));
            case 6:
                return w4.c.f(((Integer) obj).intValue() + 1, ".");
            case 7:
                return ((Character) ry.m.q0(ry.m.k0(new lz.c('a', 'z'), ((Integer) obj).intValue() % 26))).charValue() + ".";
            case 8:
                return w4.c.f(((Integer) obj).intValue() + 1, ")");
            case 9:
                return ((Character) ry.m.q0(ry.m.k0(new lz.c('a', 'z'), ((Integer) obj).intValue() % 26))).charValue() + ")";
            case 10:
                p0 marker = (p0) obj;
                m.f(marker, "marker");
                return marker.B(v3.b.b(0, 0, 15));
            case 11:
                u0 it = (u0) obj;
                m.f(it, "it");
                return b0Var;
            case 12:
                View it2 = (View) obj;
                m.f(it2, "it");
                return b0Var;
            case 13:
                String lessonItem = (String) obj;
                m.f(lessonItem, "lessonItem");
                int[] iArr = r.f4959a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                return Boolean.valueOf(q.v0(lessonItem, bq.m.r(x.n().keyLanguage), false));
            case 14:
                String itemStr = (String) obj;
                m.f(itemStr, "itemStr");
                return Long.valueOf(Long.parseLong((String) q.W0((CharSequence) q.W0(itemStr, new String[]{":"}, 0, 6).get(1), new String[]{"_"}, 0, 6).get(1)));
            case 15:
                Long l9 = (Long) obj;
                l9.longValue();
                return l9;
            case 16:
                t item = (t) obj;
                int i15 = IDNSyllableIntroductionActivity.P;
                m.f(item, "$this$item");
                return new m0.d(f.a(5));
            case 17:
                t item2 = (t) obj;
                int i16 = IDNSyllableIntroductionActivity.P;
                m.f(item2, "$this$item");
                return new m0.d(f.a(5));
            case 18:
                t item3 = (t) obj;
                int i17 = IDNSyllableIntroductionActivity.P;
                m.f(item3, "$this$item");
                return new m0.d(f.a(5));
            case 19:
                View it3 = (View) obj;
                m.f(it3, "it");
                return b0Var;
            case 20:
                y AnimatedContent = (y) obj;
                m.f(AnimatedContent, "$this$AnimatedContent");
                l1 l1VarE = f1.e(e.r(220, 90, null, 4), 2);
                m1 m1VarF = f1.f(e.r(90, 0, null, 6), 2);
                int i18 = o.f152b;
                return new a0.p0(l1VarE, m1VarF);
            case 21:
                y AnimatedContent2 = (y) obj;
                m.f(AnimatedContent2, "$this$AnimatedContent");
                l1 l1VarE2 = f1.e(e.r(220, 90, null, 4), 2);
                m1 m1VarF2 = f1.f(e.r(90, 0, null, 6), 2);
                int i19 = o.f152b;
                return new a0.p0(l1VarE2, m1VarF2);
            case 22:
                i2.d LinearProgressIndicator = (i2.d) obj;
                m.f(LinearProgressIndicator, "$this$LinearProgressIndicator");
                return b0Var;
            case 23:
                RiveAnimationView it4 = (RiveAnimationView) obj;
                m.f(it4, "it");
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                mz.c it5 = (mz.c) obj;
                m.f(it5, "it");
                return f20.a.a(it5);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                lc.d it6 = (lc.d) obj;
                m.f(it6, "it");
                return b0Var;
            case 27:
                w2.f1 layout = (w2.f1) obj;
                m.f(layout, "$this$layout");
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                Map.Entry entry = (Map.Entry) obj;
                m.f(entry, "<destruct>");
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                String strR0 = q.R0(str2, "inline:");
                if (strR0 == str2) {
                    strR0 = null;
                }
                if (strR0 == null) {
                    return null;
                }
                m.d(value, "null cannot be cast to non-null type com.halilibo.richtext.ui.string.InlineContent");
                return new l(strR0, (vg.a) value);
            default:
                u0 it7 = (u0) obj;
                m.f(it7, "it");
                return b0Var;
        }
    }
}
