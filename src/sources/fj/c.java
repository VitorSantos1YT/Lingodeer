package fj;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import n9.q;
import qx.o;
import th.j;
import vt.e;
import yx.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f27326a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27330e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fv.c f27327b = new fv.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f27331f = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f27332t = new q(29, false);
    public final MutableLiveData H = new MutableLiveData();
    public final MutableLiveData K = new MutableLiveData();

    public c(e eVar) {
        this.f27326a = eVar;
    }

    public static final void a(c cVar) {
        cVar.f27327b = new fv.c();
        qy.q qVar = fv.b.f28186a;
        String strS = fv.b.S(cVar.f27329d);
        fv.a aVar = new fv.a(7L, fv.b.T(cVar.f27329d), strS);
        File file = new File(defpackage.e.m(xt.b.a().n(), strS));
        if (!file.exists()) {
            cVar.f27327b.d(aVar, new aj.e(cVar, 4));
            return;
        }
        d dVarM = new yx.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(9, file, strS), 0).M(ky.e.f38937b);
        o oVarA = px.b.a();
        xx.d dVar = new xx.d(vx.b.f54316e, new com.google.firebase.database.android.d(cVar, 19));
        try {
            dVarM.K(new yx.b(dVar, oVarA));
            j.a(dVar, cVar.f27332t);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f27327b.a(this.f27328c);
        Iterator it = this.f27331f.iterator();
        m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            m.e(next, "next(...)");
            this.f27327b.a(((Number) next).intValue());
        }
        this.f27332t.f();
    }
}
