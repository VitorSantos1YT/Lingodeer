package yi;

import ay.x;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinLessonStudyActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import ky.e;
import n9.q;
import qx.o;
import rt.m5;
import th.j;
import yx.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PinyinLessonStudyActivity f57846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi.c f57847b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f57850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f57851f = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f57852t = new q(29, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fv.c f57848c = new fv.c();

    public b(PinyinLessonStudyActivity pinyinLessonStudyActivity, xi.c cVar) {
        this.f57846a = pinyinLessonStudyActivity;
        this.f57847b = cVar;
        pinyinLessonStudyActivity.P = this;
    }

    @Override // ii.a
    public final void A() {
        fv.c cVar = this.f57848c;
        if (cVar != null) {
            cVar.a(this.f57849d);
            Iterator it = this.f57851f.iterator();
            m.e(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                m.e(next, "next(...)");
                cVar.a(((Number) next).intValue());
            }
        }
        this.f57852t.f();
    }

    public final void a(HashMap map) {
        j.a(new x(new com.google.common.cache.a(13, map, this)).k(e.f38937b).g(px.b.a()).h(new m5(this, 10), vx.b.f54316e), this.f57852t);
    }

    public final void c(HashMap hashMap) {
        m.f(hashMap, "hashMap");
        String strB = xt.b.a().b();
        qy.q qVar = fv.b.f28186a;
        xi.c cVar = this.f57847b;
        File file = new File(defpackage.e.m(strB, fv.b.B(cVar.f56095a - 1)));
        qy.q qVar2 = fv.b.f28186a;
        fv.a aVar = new fv.a(0L, fv.b.C(cVar.f56095a - 1), fv.b.B(cVar.f56095a - 1));
        if (!file.exists()) {
            this.f57846a.v(true);
            fv.c cVar2 = this.f57848c;
            m.c(cVar2);
            cVar2.d(aVar, new fj.a(8, this, hashMap));
            return;
        }
        d dVarM = new yx.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(23, file, this), 0).M(e.f38937b);
        o oVarA = px.b.a();
        xx.d dVar = new xx.d(vx.b.f54316e, new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(24, this, hashMap));
        try {
            dVarM.K(new yx.b(dVar, oVarA));
            j.a(dVar, this.f57852t);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    @Override // ii.a
    public final void start() {
    }
}
