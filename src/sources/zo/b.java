package zo;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingo.lingoskill.LingoSkillApplication;
import com.yalantis.ucrop.view.CropImageView;
import fv.c;
import java.io.File;
import kotlin.jvm.internal.m;
import rz.e0;
import th.e;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f59261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f59262b;

    public b() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication);
        this.f59261a = new e(lingoSkillApplication);
        c cVar = new c();
        i1 i1VarC = x0.c(Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
        this.f59262b = i1VarC;
        File file = new File(defpackage.e.m(xt.b.a().b(), fv.b.D(-1L)));
        fv.a aVar = new fv.a(0L, fv.b.E(-1L), fv.b.D(-1L));
        if (file.exists()) {
            i1VarC.l(null, Float.valueOf(1.0f));
        } else {
            cVar.d(aVar, new a(this, 0));
        }
    }

    public final void a(String audioName) {
        m.f(audioName, "audioName");
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new xg.b(12, this, audioName, null), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f59261a.b();
    }
}
