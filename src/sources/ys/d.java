package ys;

import android.os.Bundle;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57957a;

    public /* synthetic */ d(int i11) {
        this.f57957a = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        WindowLayoutComponent windowLayoutComponentA;
        Object cVar;
        switch (this.f57957a) {
            case 0:
                return l1.t.B(Boolean.FALSE);
            case 1:
                return new xt.r(17);
            case 2:
                return new v(-1L, -1L);
            case 3:
                return 0;
            case 4:
                return l1.t.B(Boolean.TRUE);
            case 5:
                oz.o oVar = j3.f58088a;
                return qy.b0.f48488a;
            case 6:
                return new au.y();
            case 7:
                return new au.g1();
            case 8:
                return new au.h1();
            case 9:
                l1.d0 d0Var = z0.f.f58418a;
                return null;
            case 10:
                try {
                    ClassLoader classLoader = za.g.class.getClassLoader();
                    za.e eVar = classLoader != null ? new za.e(classLoader, new t7.d(classLoader)) : null;
                    if (eVar == null || (windowLayoutComponentA = eVar.a()) == null) {
                        return null;
                    }
                    t7.d dVar = new t7.d(classLoader);
                    int iA = ya.e.a();
                    if (iA >= 9) {
                        cVar = new bb.f(windowLayoutComponentA, dVar);
                    } else if (iA >= 6) {
                        cVar = new bb.e(windowLayoutComponentA, dVar);
                    } else if (iA >= 2) {
                        cVar = new bb.d(windowLayoutComponentA, dVar);
                    } else {
                        cVar = iA == 1 ? new bb.c(windowLayoutComponentA, dVar) : new bb.a();
                    }
                    return cVar;
                } catch (Throwable unused) {
                    return null;
                }
            default:
                Bundle bundle = new Bundle();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().frusMFSwitch == 0) {
                    bundle.putString("type", "male");
                } else {
                    bundle.putString("type", "female");
                }
                return bundle;
        }
    }
}
