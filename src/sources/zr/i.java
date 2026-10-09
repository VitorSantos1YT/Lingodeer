package zr;

import a0.w1;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseCharacterGroup;
import kotlin.NoWhenBranchMatchedException;
import rz.e0;
import tp.f0;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseCharacterGroup f59302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yr.m f59303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final av.n f59304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f59305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f59306e;

    public i(CourseCharacterGroup courseCharacterGroup, yr.m mVar, av.n nVar, ur.a aVar) {
        this.f59302a = courseCharacterGroup;
        this.f59303b = mVar;
        this.f59304c = nVar;
        i1 i1VarC = x0.c(f.f59297a);
        this.f59305d = i1VarC;
        this.f59306e = new r0(i1VarC);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, (vy.d) null, 16), 3);
    }

    public final void a(e eVar) {
        boolean z11 = eVar instanceof d;
        i1 i1Var = this.f59305d;
        if (!z11) {
            if (!(eVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            h hVar = (h) i1Var.getValue();
            if (hVar instanceof g) {
                i1Var.l(null, g.a((g) hVar, null, false, 7));
                return;
            }
            return;
        }
        CourseCharacter courseCharacter = ((d) eVar).f59296a;
        qy.q qVar = fv.b.f28186a;
        Uri uri = Uri.parse(fv.b.k0(courseCharacter.getZhuYin()));
        kotlin.jvm.internal.m.e(uri, "parse(...)");
        this.f59304c.j(uri);
        long characterId = courseCharacter.getCharacterId();
        h hVar2 = (h) i1Var.getValue();
        if (hVar2 instanceof g) {
            g gVar = (g) hVar2;
            Long l9 = gVar.f59300c;
            if (l9 == null || l9.longValue() != characterId) {
                i1Var.l(null, g.a(gVar, Long.valueOf(characterId), true, 3));
            } else {
                i1Var.l(null, g.a(gVar, null, false, 3));
                e0.B(ViewModelKt.getViewModelScope(this), null, null, new w1(this, gVar, characterId, (vy.d) null), 3);
            }
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f59304c.b();
    }
}
