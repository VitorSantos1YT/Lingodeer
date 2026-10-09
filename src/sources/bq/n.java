package bq;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.lingo.lingoskill.LingoSkillApplication;
import java.util.UUID;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f4955b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, vy.d dVar) {
        super(2, dVar);
        this.f4955b = oVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        n nVar = new n(this.f4955b, dVar);
        nVar.f4954a = obj;
        return nVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) create((b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        nVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objL;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String globalUID = cf.x.n().globalUID;
        kotlin.jvm.internal.m.e(globalUID, "globalUID");
        if (globalUID.length() == 0) {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.m.e(string, "toString(...)");
            try {
                objL = AdvertisingIdClient.getAdvertisingIdInfo(this.f4955b.f4956a).getId();
                kotlin.jvm.internal.m.c(objL);
            } catch (Throwable th2) {
                objL = com.bumptech.glide.e.l(th2);
            }
            if (!(objL instanceof qy.n)) {
                String str = (String) objL;
                if (!str.equals("00000000-0000-0000-0000-000000000000")) {
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    cf.x.n().gpsAdID = str;
                    cf.x.n().updateEntry("gpsAdID");
                    string = str;
                }
            }
            Throwable thA = qy.o.a(objL);
            if (thA != null) {
                thA.printStackTrace();
            }
            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
            cf.x.n().globalUID = "GlobalUID_" + ((Object) string);
            cf.x.n().updateEntry("globalUID");
            com.bumptech.glide.f.F("activate_a_event");
        }
        cf.x.n();
        return qy.b0.f48488a;
    }
}
