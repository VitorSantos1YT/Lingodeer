package im;

import androidx.lifecycle.ViewModel;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.YinTuDao;
import com.lingo.lingoskill.object.YouYinDao;
import com.lingo.lingoskill.object.ZhuoYinDao;
import java.util.List;
import kotlin.jvm.internal.m;
import n9.q;
import se.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YinTuDao f34462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZhuoYinDao f34463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final YouYinDao f34464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f34465d;

    public a() {
        i.x();
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    dm.a.f23483c = new dm.a(lingoSkillApplication);
                }
            }
        }
        dm.a aVar = dm.a.f23483c;
        m.c(aVar);
        this.f34462a = aVar.o();
        i.x();
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication2);
                    dm.a.f23483c = new dm.a(lingoSkillApplication2);
                }
            }
        }
        dm.a aVar2 = dm.a.f23483c;
        m.c(aVar2);
        this.f34463b = aVar2.t();
        i.x();
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication3);
                    dm.a.f23483c = new dm.a(lingoSkillApplication3);
                }
            }
        }
        dm.a aVar3 = dm.a.f23483c;
        m.c(aVar3);
        this.f34464c = aVar3.s();
        this.f34465d = new q(29, false);
    }

    public abstract List a();

    public abstract List b(List list);

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f34465d.f();
    }
}
