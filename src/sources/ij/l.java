package ij;

import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.LanCustomInfo;
import com.lingo.lingoskill.object.LanCustomInfoDao;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l f34436b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f34437a;

    public l() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        kotlin.jvm.internal.m.c(nVar);
        this.f34437a = nVar;
    }

    public final LanCustomInfo a() {
        LanCustomInfoDao lanCustomInfoDao = this.f34437a.f34446f;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        LanCustomInfo lanCustomInfo = (LanCustomInfo) lanCustomInfoDao.load(Long.valueOf(x.n().keyLanguage));
        if (lanCustomInfo != null) {
            return lanCustomInfo;
        }
        LanCustomInfo lanCustomInfo2 = new LanCustomInfo();
        lanCustomInfo2.setLan(x.n().keyLanguage);
        if (x.n().keyLanguage == 12) {
            lanCustomInfo2.setCurrentEnteredUnitId(2L);
        }
        if (x.n().keyLanguage == 47) {
            lanCustomInfo2.setCurrentEnteredUnitId(145L);
        }
        if (ry.l.C(new int[]{14, 15, 16, 17, 22, 40, 48, 54, 55}, x.n().keyLanguage)) {
            lanCustomInfo2.setMain("2:1:1");
        }
        return lanCustomInfo2;
    }

    public final LanCustomInfo b(int i11) {
        long j11 = i11;
        LanCustomInfo lanCustomInfo = (LanCustomInfo) this.f34437a.f34446f.load(Long.valueOf(j11));
        if (lanCustomInfo != null) {
            return lanCustomInfo;
        }
        LanCustomInfo lanCustomInfo2 = new LanCustomInfo();
        lanCustomInfo2.setLan(j11);
        if (i11 == 12) {
            lanCustomInfo2.setCurrentEnteredUnitId(2L);
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().keyLanguage == 47) {
            lanCustomInfo2.setCurrentEnteredUnitId(145L);
        }
        if (ry.l.C(new int[]{14, 15, 16, 17, 22, 40, 48, 54, 55}, i11)) {
            lanCustomInfo2.setMain("2:1:1");
        }
        return lanCustomInfo2;
    }
}
