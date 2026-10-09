package uu;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import cf.x;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.widget.LessonIndexTopOverlay;
import com.lingodeer.data.env.Env;
import dv.u0;
import g00.t1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.c3;
import l1.h1;
import l1.t;
import ns.o;
import okhttp3.OkHttpClient;
import qy.b0;
import vt.n0;
import xt.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53145a;

    public /* synthetic */ f(int i11) {
        this.f53145a = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f53145a) {
            case 0:
                return t.B(Boolean.FALSE);
            case 1:
                return new OkHttpClient();
            case 2:
                return o.L(vg.d.f54024d, vg.f.f54028d, vg.k.f54038d, vg.h.f54032d, vg.i.f54034d, vg.j.f54036d, vg.e.f54026d);
            case 3:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                m.c(lingoSkillApplication);
                return Env.getEnv(lingoSkillApplication);
            case 4:
                int i11 = LessonIndexTopOverlay.f22107e;
                Paint paint = new Paint();
                paint.setColor(Color.parseColor("#FFDE2E"));
                return paint;
            case 5:
                return (u0) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(u0.class));
            case 6:
                return (ur.a) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(ur.a.class));
            case 7:
                return new w1.c(new LinkedHashMap());
            case 8:
                c3 c3Var = w1.g.f54465a;
                return null;
            case 9:
                return b0.f48488a;
            case 10:
                return Boolean.TRUE;
            case 11:
                return null;
            case 12:
                Bundle bundle = new Bundle();
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (x.n().turMFSwitch == 0) {
                    bundle.putString("type", "male");
                } else {
                    bundle.putString("type", "female");
                }
                return bundle;
            case 13:
                Bundle bundle2 = new Bundle();
                bundle2.putString("status", "success");
                bundle2.putString("type", "email");
                return bundle2;
            case 14:
                Bundle bundle3 = new Bundle();
                bundle3.putString("status", "fail");
                bundle3.putString("type", "email");
                return bundle3;
            case 15:
                Bundle bundle4 = new Bundle();
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                if (x.n().itMFSwitch == 0) {
                    bundle4.putString("type", "male");
                } else {
                    bundle4.putString("type", "female");
                }
                return bundle4;
            case 16:
                return (xt.a) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(xt.a.class));
            case 17:
                return (n0) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(n0.class));
            case 18:
                return (Env) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(Env.class));
            case 19:
                return (q) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(q.class));
            case 20:
                return 2;
            case 21:
                c3 c3Var2 = y1.e.f56816a;
                return null;
            case 22:
                c3 c3Var3 = y1.f.f56817a;
                return null;
            case 23:
                Bundle bundle5 = new Bundle();
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                if (x.n().enMFSwitch == 0) {
                    bundle5.putString("type", "male");
                } else {
                    bundle5.putString("type", "female");
                }
                return bundle5;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Bundle bundle6 = new Bundle();
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                if (x.n().itMFSwitch == 0) {
                    bundle6.putString("type", "male");
                } else {
                    bundle6.putString("type", "female");
                }
                return bundle6;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Bundle bundle7 = new Bundle();
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                if (x.n().krMFSwitch == 0) {
                    bundle7.putString("type", "male");
                } else {
                    bundle7.putString("type", "female");
                }
                return bundle7;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                Bundle bundle8 = new Bundle();
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                if (x.n().krupMFSwitch == 0) {
                    bundle8.putString("type", "male");
                } else {
                    bundle8.putString("type", "female");
                }
                return bundle8;
            case 27:
                return new g00.d(t1.f28468a, 0);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new g00.d(yr.c.f57867a, 0);
            default:
                return new h1(0);
        }
    }

    public /* synthetic */ f(w9.g gVar) {
        this.f53145a = 9;
    }
}
