package ij;

import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.object.WordDao;
import com.lingo.lingoskill.ui.review.adapter.BaseReviewCateAdapter;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReviewNew f34432b;

    public /* synthetic */ g(ReviewNew reviewNew, int i11) {
        this.f34431a = i11;
        this.f34432b = reviewNew;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f34431a) {
            case 0:
                ReviewNew reviewNew = this.f34432b;
                if (d.f34419e == null) {
                    synchronized (d.class) {
                        if (d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication);
                            d.f34419e = new d(lingoSkillApplication);
                        }
                        break;
                    }
                }
                d dVar = d.f34419e;
                kotlin.jvm.internal.m.c(dVar);
                WordDao wordDao = ((DaoSession) dVar.f34423d).getWordDao();
                kotlin.jvm.internal.m.e(wordDao, "getWordDao(...)");
                return (Word) wordDao.load(Long.valueOf(reviewNew.getId()));
            case 1:
                ReviewNew reviewNew2 = this.f34432b;
                reviewNew2.setWord(c.h(reviewNew2.getId()));
                return reviewNew2.getWord();
            case 2:
                ReviewNew reviewNew3 = this.f34432b;
                reviewNew3.setSentence(c.e(reviewNew3.getId()));
                return reviewNew3.getSentence();
            case 3:
                ReviewNew reviewNew4 = this.f34432b;
                if (oi.c.f44924t == null) {
                    synchronized (oi.c.class) {
                        if (oi.c.f44924t == null) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication2);
                            oi.c.f44924t = new oi.c(lingoSkillApplication2);
                        }
                        break;
                    }
                }
                oi.c cVar = oi.c.f44924t;
                kotlin.jvm.internal.m.c(cVar);
                reviewNew4.setCharacter((HwCharacter) cVar.g().load(Long.valueOf(reviewNew4.getId())));
                return reviewNew4.getCharacter();
            case 4:
                ReviewNew reviewNew5 = this.f34432b;
                reviewNew5.setWord(c.h(reviewNew5.getId()));
                return reviewNew5.getWord();
            case 5:
                ReviewNew reviewNew6 = this.f34432b;
                reviewNew6.setSentence(c.e(reviewNew6.getId()));
                return reviewNew6.getSentence();
            default:
                ReviewNew reviewNew7 = this.f34432b;
                if (oi.c.f44924t == null) {
                    synchronized (oi.c.class) {
                        if (oi.c.f44924t == null) {
                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication3);
                            oi.c.f44924t = new oi.c(lingoSkillApplication3);
                        }
                        break;
                    }
                }
                oi.c cVar2 = oi.c.f44924t;
                kotlin.jvm.internal.m.c(cVar2);
                reviewNew7.setCharacter((HwCharacter) cVar2.g().load(Long.valueOf(reviewNew7.getId())));
                return reviewNew7.getCharacter();
        }
    }

    public /* synthetic */ g(ReviewNew reviewNew, BaseReviewCateAdapter baseReviewCateAdapter, int i11) {
        this.f34431a = i11;
        this.f34432b = reviewNew;
    }
}
