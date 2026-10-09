package rm;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import av.n;
import com.lingodeer.data.model.CourseCharacterGroup;
import mv.f0;
import rz.e0;
import uz.i1;
import uz.x0;
import wt.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseCharacterGroup f49302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f49303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f49304c = x0.c(zr.f.f59297a);

    public g(CourseCharacterGroup courseCharacterGroup, m mVar, n nVar, ur.a aVar) {
        this.f49302a = courseCharacterGroup;
        this.f49303b = mVar;
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, null, 16), 3);
        aVar.d("CharacterDrillWordList");
    }
}
