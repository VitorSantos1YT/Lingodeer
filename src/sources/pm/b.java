package pm;

import a9.i;
import androidx.lifecycle.ViewModel;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.env.Env;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.m;
import uz.x0;
import wt.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f46954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv.c f46955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f46956c;

    public b(Env env, o0 o0Var) {
        m.c(LingoSkillApplication.f21665b);
        this.f46954a = new i(1);
        this.f46955b = new fv.c();
        this.f46956c = new LinkedHashSet();
        x0.c(new a());
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        i iVar = this.f46954a;
        iVar.y();
        iVar.l();
        Iterator it = this.f46956c.iterator();
        while (it.hasNext()) {
            this.f46955b.a(((Number) it.next()).intValue());
        }
    }
}
