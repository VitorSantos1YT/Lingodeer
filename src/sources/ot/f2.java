package ot;

import android.view.View;
import app.rive.runtime.kotlin.RiveAnimationView;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.api.Service;
import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.AchievementRecord;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45814a;

    public /* synthetic */ f2(int i11) {
        this.f45814a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f45814a;
        boolean z11 = true;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                i2 it = (i2) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return Boolean.valueOf(it.f45857d);
            case 1:
                x10.a module = (x10.a) obj;
                kotlin.jvm.internal.m.f(module, "$this$module");
                os.b bVar = new os.b(9);
                u10.b bVar2 = u10.b.Factory;
                kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(sv.j.class);
                b20.b bVar3 = c20.b.f6511e;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, eVarA, bVar, bVar2), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, kotlin.jvm.internal.z.a(sv.d.class), new os.b(10), bVar2), module)), null);
                module.a(new v10.a(new u10.a(bVar3, kotlin.jvm.internal.z.a(sv.o.class), new os.a(7), bVar2)));
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, kotlin.jvm.internal.z.a(qv.e.class), new os.b(11), bVar2), module)), null);
                module.a(new v10.a(new u10.a(bVar3, kotlin.jvm.internal.z.a(qv.j.class), new os.a(8), bVar2)));
                return b0Var;
            case 2:
                return b0Var;
            case 3:
                kotlin.jvm.internal.m.f((i2.d) obj, ypOOxsaJG.BuPSMHlI);
                return b0Var;
            case 4:
                kotlin.jvm.internal.m.f((RiveAnimationView) obj, "it");
                return b0Var;
            case 5:
                m0.t item = (m0.t) obj;
                kotlin.jvm.internal.m.f(item, "$this$item");
                return new m0.d(ob.f.a(3));
            case 6:
                m0.t item2 = (m0.t) obj;
                kotlin.jvm.internal.m.f(item2, "$this$item");
                return new m0.d(ob.f.a(3));
            case 7:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 8:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 9:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 10:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 11:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 12:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 13:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
            case 14:
                mz.j[] jVarArr = g3.z.f28737a;
                ((g3.b0) obj).b(g3.x.f28714e, b0Var);
                return b0Var;
            case 15:
                kotlin.jvm.internal.m.f((View) obj, "it");
                return b0Var;
            case 16:
                tu.k it2 = (tu.k) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return Integer.valueOf(it2.f52594a);
            case 17:
                kotlin.jvm.internal.m.f((AchievementLevel) obj, "it");
                return b0Var;
            case 18:
                kotlin.jvm.internal.m.f((AchievementRecord) obj, "it");
                return b0Var;
            case 19:
                kotlin.jvm.internal.m.f((AchievementLeaderBoard) obj, "it");
                return b0Var;
            case 20:
                kotlin.jvm.internal.m.f((AchievementLanguage) obj, "it");
                return b0Var;
            case 21:
                kotlin.jvm.internal.m.f((List) obj, "it");
                return b0Var;
            case 22:
                g3.b0 semantics = (g3.b0) obj;
                kotlin.jvm.internal.m.f(semantics, "$this$semantics");
                mz.j[] jVarArr2 = g3.z.f28737a;
                semantics.b(g3.x.f28717h, b0Var);
                return b0Var;
            case 23:
                v3.c InlineContent = (v3.c) obj;
                kotlin.jvm.internal.m.f(InlineContent, "$this$InlineContent");
                float f5 = 128;
                return new v3.l((((long) InlineContent.n0(f5)) << 32) | (((long) InlineContent.n0(f5)) & 4294967295L));
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                sg.q it3 = (sg.q) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return it3.f51657b.f51662e;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                sg.q it4 = (sg.q) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                return it4.f51657b.f51661d;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return b0Var;
            case 27:
                m0.t item3 = (m0.t) obj;
                int i12 = THAISyllableIntroductionActivity.M;
                kotlin.jvm.internal.m.f(item3, "$this$item");
                return new m0.d(ob.f.a(4));
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                m0.t item4 = (m0.t) obj;
                int i13 = THAISyllableIntroductionActivity.M;
                kotlin.jvm.internal.m.f(item4, "$this$item");
                return new m0.d(ob.f.a(4));
            default:
                m0.t item5 = (m0.t) obj;
                int i14 = THAISyllableIntroductionActivity.M;
                kotlin.jvm.internal.m.f(item5, "$this$item");
                return new m0.d(ob.f.a(4));
        }
    }
}
