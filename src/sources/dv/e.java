package dv;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.api.Service;
import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.lingo.lingoskill.object.LanguageExpandableItem2;
import com.lingodeer.data.model.BookmarkFolder;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.DailyLearnHistory;
import com.lingodeer.data.model.DailyLearnTimeHistory;
import com.lingodeer.data.model.DailyStreakHistory;
import com.lingodeer.data.model.UnitState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Map;
import l1.c3;
import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24443a;

    public /* synthetic */ e(int i11) {
        this.f24443a = i11;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.Collection] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f24443a;
        boolean z11 = false;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                h00.h Json = (h00.h) obj;
                kotlin.jvm.internal.m.f(Json, "$this$Json");
                Json.f29927a = true;
                return b0Var;
            case 1:
                CourseUnit courseUnit = (CourseUnit) obj;
                if (!courseUnit.isTestOut() && courseUnit.getUnitState() != UnitState.StateLocked) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 2:
                return Long.valueOf(((CourseUnit) obj).getUnitId());
            case 3:
                CourseUnit courseUnit2 = (CourseUnit) obj;
                if (!courseUnit2.isTestOut() && courseUnit2.getUnitState() == UnitState.StateRedo) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 4:
                return Long.valueOf(((CourseUnit) obj).getUnitId());
            case 5:
                if (obj != null) {
                    throw new ClassCastException();
                }
                kotlin.jvm.internal.m.f(null, "it");
                return b0Var;
            case 6:
                ARChar it = (ARChar) obj;
                kotlin.jvm.internal.m.f(it, "it");
                String character = it.getCharacter();
                kotlin.jvm.internal.m.e(character, "getCharacter(...)");
                return character;
            case 7:
                ARChar it2 = (ARChar) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return it2.getZhuyin();
            case 8:
                ARChar it3 = (ARChar) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return it3.getAudioName();
            case 9:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return b0Var;
            case 10:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return b0Var;
            case 11:
                KOCharZhuyin it4 = (KOCharZhuyin) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                String character2 = it4.getCharacter();
                kotlin.jvm.internal.m.e(character2, "getCharacter(...)");
                return character2;
            case 12:
                KOCharZhuyin it5 = (KOCharZhuyin) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                return it5.getZhuyin();
            case 13:
                KOCharZhuyin it6 = (KOCharZhuyin) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                return it6.getZhuyin();
            case 14:
                LanguageExpandableItem2 it7 = (LanguageExpandableItem2) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                Iterable subItems = it7.getSubItems();
                if (subItems == null) {
                    subItems = ry.r.f50854a;
                }
                return ry.m.g0(subItems);
            case 15:
                x10.a module = (x10.a) obj;
                kotlin.jvm.internal.m.f(module, "$this$module");
                ah.h hVar = new ah.h(12);
                u10.b bVar = u10.b.Singleton;
                kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(d.class);
                b20.b bVar2 = c20.b.f6511e;
                md.a.s(new u10.c(module, defpackage.e.x(new u10.a(bVar2, eVarA, hVar, bVar), module)), null);
                v10.d dVarX = defpackage.e.x(new u10.a(bVar2, kotlin.jvm.internal.z.a(gv.h.class), new dt.g(7), bVar), module);
                kotlin.jvm.internal.e eVarA2 = kotlin.jvm.internal.z.a(gv.e.class);
                u10.a aVar = dVarX.f53471a;
                aVar.f52730e = ry.m.G0(eVarA2, aVar.f52730e);
                String mapping = f20.a.a(eVarA2) + ':' + BuildConfig.VERSION_NAME + ':' + aVar.f52726a;
                kotlin.jvm.internal.m.f(mapping, "mapping");
                module.f55749c.put(mapping, dVarX);
                return b0Var;
            case 16:
                q1 q1Var = (q1) obj;
                c3 c3Var = AndroidCompositionLocals_androidKt.f1200b;
                q1Var.getClass();
                if (((Context) l1.t.E(q1Var, c3Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return f0.f.f26257b;
                }
                f0.d.f26224a.getClass();
                return f0.c.f26210c;
            case 17:
                float f5 = f0.g0.f26277a;
                return b0Var;
            case 18:
                return Boolean.TRUE;
            case 19:
                return Boolean.valueOf(!(((s2.t) obj).f51351i == 2));
            case 20:
                ((Float) obj).getClass();
                return b0Var;
            case 21:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return b0Var;
            case 22:
                vt.t0 it8 = (vt.t0) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                return it8.f54287a + ":" + ry.m.y0(it8.f54288b, "_", null, null, null, 62) + ":" + it8.f54289c;
            case 23:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.m.f(entry, "<destruct>");
                return ((String) entry.getKey()) + ":" + hz.b.k(((Number) entry.getValue()).floatValue(), 0.1f, 1.0f);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Map.Entry entry2 = (Map.Entry) obj;
                kotlin.jvm.internal.m.f(entry2, "<destruct>");
                return ep.a.D((String) entry2.getKey(), "=", (String) entry2.getValue());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                DailyLearnHistory it9 = (DailyLearnHistory) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                return nv.p.k(it9.getPendingAmount(), it9.getId(), ":");
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                DailyStreakHistory it10 = (DailyStreakHistory) obj;
                kotlin.jvm.internal.m.f(it10, "it");
                return nv.p.k(!kotlin.jvm.internal.m.a(it10.getType(), "study") ? 1 : 0, it10.getId(), ":");
            case 27:
                Map.Entry entry3 = (Map.Entry) obj;
                kotlin.jvm.internal.m.f(entry3, "<destruct>");
                return ep.a.D((String) entry3.getKey(), ":", (String) entry3.getValue());
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                DailyLearnTimeHistory dailyLearnTimeHistory = (DailyLearnTimeHistory) obj;
                return nv.p.k(dailyLearnTimeHistory.getPendingSeconds(), dailyLearnTimeHistory.getId(), ":");
            default:
                return Boolean.valueOf(!((BookmarkFolder) obj).isDeleted());
        }
    }
}
