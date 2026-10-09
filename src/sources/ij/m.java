package ij;

import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static m f34438b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f34439a;

    public m() {
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
        this.f34439a = nVar;
    }

    public static m a() {
        if (f34438b == null) {
            synchronized (m.class) {
                try {
                    if (f34438b == null) {
                        kotlin.jvm.internal.m.c(LingoSkillApplication.f21665b);
                        f34438b = new m();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f34438b;
    }
}
