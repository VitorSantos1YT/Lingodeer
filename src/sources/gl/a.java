package gl;

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
import vy.d;
import xt.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f29278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f29279b;

    public a() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication);
        this.f29278a = new e(lingoSkillApplication);
        c cVar = new c();
        i1 i1VarC = x0.c(Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
        this.f29279b = i1VarC;
        File file = new File(defpackage.e.m(b.a().b(), fv.b.D(-1L)));
        fv.a aVar = new fv.a(0L, fv.b.E(-1L), fv.b.D(-1L));
        if (file.exists()) {
            i1VarC.l(null, Float.valueOf(1.0f));
        } else {
            cVar.d(aVar, new aj.e(this, 7));
        }
    }

    public final void a(String audioName) {
        m.f(audioName, "audioName");
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new fr.c((Object) audioName, (Object) this, false, (d) null, 9), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f29278a.b();
    }
}
