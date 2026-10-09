package bp;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.LoginHistory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v2 f4818b;

    public /* synthetic */ t2(v2 v2Var, int i11) {
        this.f4817a = i11;
        this.f4818b = v2Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, qy.h] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f4817a) {
            case 0:
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f4818b.requireActivity().finish();
                break;
            default:
                wu.j jVar = (wu.j) this.f4818b.N.getValue();
                wu.e eVar = new wu.e((LoginHistory) obj);
                jVar.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(jVar), null, null, new sr.d(27, jVar, eVar, null), 3);
                break;
        }
        return qy.b0.f48488a;
    }
}
