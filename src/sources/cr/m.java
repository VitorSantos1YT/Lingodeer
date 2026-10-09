package cr;

import android.os.Bundle;
import b7.e0;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.notification.UnifiedNotificationJobService;
import com.lingodeer.database.ChineseToneDatabase;
import com.yalantis.ucrop.view.CropImageView;
import d0.c1;
import d0.d2;
import d0.i0;
import d0.q1;
import d1.h1;
import d1.j0;
import dt.a0;
import dt.d4;
import dt.k3;
import dt.v2;
import f0.g0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.z;
import l1.c3;
import l1.d0;
import l1.t;
import ns.o;
import qy.b0;
import ry.x;
import rz.o0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22449a;

    public /* synthetic */ m(int i11) {
        this.f22449a = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f22449a;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                return e0.e("source", "me_contactus");
            case 1:
                return new ct.b(CropImageView.DEFAULT_ASPECT_RATIO, 0, 1023, 0L);
            case 2:
                c3 c3Var = ct.c.f22476a;
                return Boolean.FALSE;
            case 3:
                d0 d0Var = c1.f22650a;
                return i0.f22729a;
            case 4:
                return new q1();
            case 5:
                return new d2(0);
            case 6:
                yz.f fVar = o0.f50940a;
                return yz.e.f58387a;
            case 7:
                d0 d0Var2 = j0.f22926a;
                return null;
            case 8:
                return h1.f22921b;
            case 9:
                return x.Y(new qy.l("es", o.K(new qy.l(4, 14))), new qy.l("fr", o.K(new qy.l(5, 15))), new qy.l("pt", o.K(new qy.l(8, 17))), new qy.l("de", o.K(new qy.l(6, 16))), new qy.l("ru", o.K(new qy.l(10, 22))), new qy.l("it", o.K(new qy.l(20, 40))), new qy.l("esus", o.K(new qy.l(47, 48))), new qy.l("frus", o.K(new qy.l(53, 54))), new qy.l("ara", o.K(new qy.l(51, 55))));
            case 10:
                LinkedHashMap linkedHashMap = ChineseToneDatabase.m;
                ChineseToneDatabase chineseToneDatabase = (ChineseToneDatabase) linkedHashMap.get("cn_tone.db");
                if (chineseToneDatabase != null) {
                    if (chineseToneDatabase.u()) {
                        chineseToneDatabase.e();
                    }
                }
                return b0Var;
            case 11:
                oz.o oVar = a0.f23626a;
                return null;
            case 12:
                return ht.a.f33722e;
            case 13:
                c3 c3Var2 = v2.f24275a;
                return null;
            case 14:
                c3 c3Var3 = k3.f23943a;
                return null;
            case 15:
                c3 c3Var4 = k3.f23943a;
                return b0Var;
            case 16:
                float f5 = d4.f23745a;
                return b0Var;
            case 17:
                return new g00.d(dv.o.f24493a, 0);
            case 18:
                return new g00.d(dv.a0.f24427a, 0);
            case 19:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 20:
                Bundle bundle = new Bundle();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().jpMFSwitch == 0) {
                    bundle.putString("type", "male");
                } else {
                    bundle.putString("type", "female");
                }
                return bundle;
            case 21:
                Bundle bundle2 = new Bundle();
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (cf.x.n().jpupMFSwitch == 0) {
                    bundle2.putString("type", "male");
                } else {
                    bundle2.putString("type", "female");
                }
                return bundle2;
            case 22:
                int i12 = UnifiedNotificationJobService.f22226c;
                return (wt.b0) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(wt.b0.class));
            case 23:
                int i13 = UnifiedNotificationJobService.f22226c;
                return (n0) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(n0.class));
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                int i14 = UnifiedNotificationJobService.f22226c;
                return (wt.m) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(wt.m.class));
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i15 = UnifiedNotificationJobService.f22226c;
                return (gu.a) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(gu.a.class));
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                int i16 = UnifiedNotificationJobService.f22226c;
                return (n0) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(n0.class));
            case 27:
                return t.B(Boolean.FALSE);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                float f11 = g0.f26277a;
                return Boolean.TRUE;
            default:
                float f12 = g0.f26277a;
                return b0Var;
        }
    }
}
