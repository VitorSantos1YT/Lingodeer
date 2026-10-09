package dj;

import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.TravelPhrase;
import com.lingo.lingoskill.object.TravelPhraseDao;
import ij.n;
import java.util.List;
import k10.g;
import k10.h;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f23436a;

    public c() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        m.c(n.f34440v);
    }

    public static TravelPhrase a(long j11) {
        if (b.f23431e == null) {
            synchronized (b.class) {
                if (b.f23431e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    b.f23431e = new b(lingoSkillApplication);
                }
            }
        }
        b bVar = b.f23431e;
        m.c(bVar);
        g gVarQueryBuilder = bVar.c().queryBuilder();
        gVarQueryBuilder.f(TravelPhraseDao.Properties.ID.b(Long.valueOf(j11)), new h[0]);
        List listD = gVarQueryBuilder.d();
        if (listD == null || listD.isEmpty()) {
            return null;
        }
        return (TravelPhrase) listD.get(0);
    }
}
