package com.lingo.fluent.object;

import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.GameWordStatusDao;
import com.lingo.lingoskill.object.PdLessonDao;
import com.lingo.lingoskill.object.PdLessonDlVersionDao;
import com.lingo.lingoskill.object.PdLessonFavDao;
import com.lingo.lingoskill.object.PdLessonLearnIndexDao;
import com.lingo.lingoskill.object.PdSentenceDao;
import com.lingo.lingoskill.object.PdTipsDao;
import com.lingo.lingoskill.object.PdTipsFavDao;
import com.lingo.lingoskill.object.PdWordDao;
import com.lingo.lingoskill.object.PdWordFavDao;
import ij.n;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdLessonDbHelper {
    public static final int $stable = 0;
    public static final PdLessonDbHelper INSTANCE = new PdLessonDbHelper();

    private PdLessonDbHelper() {
    }

    public final GameWordStatusDao gameWordStatusDao() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        m.c(nVar);
        return nVar.f34454o;
    }

    public final PdLessonDao pdLessonDao() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        m.c(nVar);
        return nVar.f34451k;
    }

    public final PdLessonDlVersionDao pdLessonDlVersionDao() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        m.c(nVar);
        return nVar.f34458s;
    }

    public final PdLessonFavDao pdLessonFavDao() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        m.c(nVar);
        return nVar.f34455p;
    }

    public final PdLessonLearnIndexDao pdLessonLearnIndexDao() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        m.c(nVar);
        return nVar.f34459t;
    }

    public final PdSentenceDao pdSentenceDao() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        m.c(nVar);
        return nVar.m;
    }

    public final PdTipsDao pdTipsDao() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        m.c(nVar);
        return nVar.f34453n;
    }

    public final PdTipsFavDao pdTipsFavDao() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        m.c(nVar);
        return nVar.f34457r;
    }

    public final PdWordDao pdWordDao() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        m.c(nVar);
        return nVar.f34452l;
    }

    public final PdWordFavDao pdWordFavDao() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        m.c(nVar);
        return nVar.f34456q;
    }
}
