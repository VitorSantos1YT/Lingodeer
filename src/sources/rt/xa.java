package rt;

import androidx.lifecycle.ViewModelKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class xa implements fv.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f50651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bb f50652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f50653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f50654d;

    public xa(List list, bb bbVar, int i11, List list2) {
        this.f50651a = list;
        this.f50652b = bbVar;
        this.f50653c = i11;
        this.f50654d = list2;
    }

    @Override // fv.d
    public final void c(uv.b task) {
        kotlin.jvm.internal.m.f(task, "task");
        List list = this.f50651a;
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (kotlin.jvm.internal.m.a(((fv.a) it.next()).f28182a, task.f53184e)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            list.remove(i11);
        }
        bb bbVar = this.f50652b;
        uz.i1 i1Var = bbVar.K;
        int size = list.size();
        int i12 = this.f50653c;
        db dbVar = new db((i12 - size) / i12);
        i1Var.getClass();
        vy.d dVar = null;
        i1Var.l(null, dbVar);
        if (list.isEmpty()) {
            rz.e0.B(ViewModelKt.getViewModelScope(bbVar), null, null, new wa(bbVar, this.f50654d, dVar, 0), 3);
        }
    }

    @Override // fv.d
    public final void f(uv.b task, Throwable th2) {
        kotlin.jvm.internal.m.f(task, "task");
        List list = this.f50651a;
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (kotlin.jvm.internal.m.a(((fv.a) it.next()).f28182a, task.f53184e)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            list.remove(i11);
        }
        bb bbVar = this.f50652b;
        uz.i1 i1Var = bbVar.K;
        int size = list.size();
        int i12 = this.f50653c;
        db dbVar = new db((i12 - size) / i12);
        i1Var.getClass();
        vy.d dVar = null;
        i1Var.l(null, dbVar);
        if (list.isEmpty()) {
            rz.e0.B(ViewModelKt.getViewModelScope(bbVar), null, null, new wa(bbVar, this.f50654d, dVar, 1), 3);
        }
    }

    @Override // fv.d
    public final void a(uv.b bVar) {
    }

    @Override // fv.d
    public final void b(uv.b bVar) {
    }

    @Override // fv.d
    public final void d(uv.b bVar) {
    }

    @Override // fv.d
    public final void e(uv.b bVar, int i11, int i12) {
    }
}
