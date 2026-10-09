package mv;

import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.CourseCharacter;
import com.tbruyelle.rxpermissions3.BuildConfig;
import rt.eb;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.m f42290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av.n f42291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fv.c f42292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kv.i0 f42293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f42294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1 f42295f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r0 f42296t;

    public y(wt.m mVar, av.n nVar, fv.c cVar, kv.i0 i0Var) {
        this.f42290a = mVar;
        this.f42291b = nVar;
        this.f42292c = cVar;
        this.f42293d = i0Var;
        i1 i1VarC = x0.c(ry.r.f50854a);
        this.f42294e = i1VarC;
        i1 i1VarC2 = x0.c(eb.f49693a);
        this.f42295f = i1VarC2;
        vy.d dVar = null;
        this.f42296t = x0.A(new no.g(i1VarC, i1VarC2, new x(this, dVar, 0)), ViewModelKt.getViewModelScope(this), a1.a(2), s.f42273a);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new v(this, dVar, 1), 3);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new v(this, dVar, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object a(y yVar, kv.l0 l0Var, xy.c cVar) {
        w wVar;
        Uri uri;
        long j11;
        kv.l0 l0Var2 = l0Var;
        yVar.getClass();
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i11 = wVar.f42285f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                wVar.f42285f = i11 - Integer.MIN_VALUE;
            } else {
                wVar = new w(yVar, cVar);
            }
        } else {
            wVar = new w(yVar, cVar);
        }
        Object obj = wVar.f42283d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = wVar.f42285f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            long jD = se.k.D(l0Var2.f38778b);
            qy.q qVar = fv.b.f28186a;
            Uri uri2 = Uri.parse(fv.b.c(se.k.x(l0Var2.f38779c), null, null));
            uz.i iVarA = yVar.f42290a.a(l0Var2.f38778b);
            wVar.f42280a = l0Var2;
            wVar.f42281b = uri2;
            wVar.f42282c = jD;
            wVar.f42285f = 1;
            Object objV = x0.v(iVarA, wVar);
            if (objV == aVar) {
                return aVar;
            }
            uri = uri2;
            j11 = jD;
            obj = objV;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j12 = wVar.f42282c;
            Uri uri3 = wVar.f42281b;
            kv.l0 l0Var3 = wVar.f42280a;
            com.bumptech.glide.e.F(obj);
            uri = uri3;
            l0Var2 = l0Var3;
            j11 = j12;
        }
        CourseCharacter courseCharacter = (CourseCharacter) obj;
        if (courseCharacter != null) {
            String str = l0Var2.f38778b;
            String str2 = l0Var2.f38779c;
            kotlin.jvm.internal.m.c(uri);
            CourseCharacter courseCharacterCopy = courseCharacter.copy((7124 & 1) != 0 ? courseCharacter.characterId : j11, (7124 & 2) != 0 ? courseCharacter.character : str, (7124 & 4) != 0 ? courseCharacter.charPath : null, (7124 & 8) != 0 ? courseCharacter.zhuYin : str2, (7124 & 16) != 0 ? courseCharacter.animation : 0, (7124 & 32) != 0 ? courseCharacter.translation : BuildConfig.VERSION_NAME, (7124 & 64) != 0 ? courseCharacter.tipsAnimation : null, (7124 & 128) != 0 ? courseCharacter.partStrings : null, (7124 & 256) != 0 ? courseCharacter.polygonStrings : null, (7124 & 512) != 0 ? courseCharacter.drillJson : null, (7124 & 1024) != 0 ? courseCharacter.audioUri : uri, (7124 & 2048) != 0 ? courseCharacter.animationUri : null, (7124 & 4096) != 0 ? courseCharacter.options : null);
            if (courseCharacterCopy != null) {
                return courseCharacterCopy;
            }
        }
        String str3 = l0Var2.f38778b;
        String str4 = l0Var2.f38779c;
        kotlin.jvm.internal.m.c(uri);
        ry.r rVar = ry.r.f50854a;
        return new CourseCharacter(j11, str3, BuildConfig.VERSION_NAME, str4, 0, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, rVar, rVar, null, uri, null, null, 6656, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f42291b.b();
    }
}
