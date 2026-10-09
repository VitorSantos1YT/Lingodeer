package ep;

import ay.x;
import bp.i4;
import bq.r;
import com.lingo.lingoskill.object.LanCustomInfo;
import com.lingo.lingoskill.object.Unit;
import com.lingodeer.R;
import ff.h;
import ij.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import n9.q;
import th.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements ii.a {
    public final ArrayList H;
    public final q K;
    public final aj.e L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp.a f25729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ji.b f25730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f25733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fv.c f25734f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f25735t;

    public f(dp.a mView, ji.b mActivity) {
        m.f(mView, "mView");
        m.f(mActivity, "mActivity");
        this.f25729a = mView;
        this.f25730b = mActivity;
        this.f25733e = new ArrayList();
        this.f25735t = new ArrayList();
        this.H = new ArrayList();
        this.K = new q(29, false);
        ArrayList arrayListB = ij.c.b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListB.get(i12);
            i12++;
            if (((Unit) obj).getSortIndex() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListC1 = ry.m.c1(arrayList);
        this.H = arrayListC1;
        int size2 = arrayListC1.size();
        while (i11 < size2) {
            Object obj2 = arrayListC1.get(i11);
            i11++;
            m.e(obj2, "next(...)");
            Unit unit = (Unit) obj2;
            if (unit.getSortIndex() > 0) {
                Long[] lArrV = ew.a.v(unit.getLessonList());
                ArrayList arrayList2 = this.f25735t;
                m.c(lArrV);
                ry.m.e0(arrayList2, lArrV);
            }
        }
        this.L = new aj.e(this, 3);
        ((i4) this.f25729a).N = this;
        this.f25734f = new fv.c();
    }

    @Override // ii.a
    public final void A() {
        this.K.f();
    }

    public final void a(boolean z11) {
        j.a(new x(new d(z11, this, 0)).k(ky.e.f38937b).g(px.b.a()).h(new dm.a(this, 8), vx.b.f54316e), this.K);
    }

    public abstract int c();

    public abstract List d(String str, boolean z11);

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public final void k() {
        if (l.f34436b == null) {
            synchronized (l.class) {
                if (l.f34436b == null) {
                    l.f34436b = new l();
                }
            }
        }
        l lVar = l.f34436b;
        m.c(lVar);
        if (!lVar.a().getIsStartDownload()) {
            LanCustomInfo lanCustomInfoA = ub.a.Z().a();
            lanCustomInfoA.setIsStartDownload(true);
            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoA);
        }
        int[] iArr = r.f4959a;
        if (!bq.m.G()) {
            h.C(h.y(this.f25730b, R.string.no_network_prompt));
        }
        fv.c cVar = this.f25734f;
        if (cVar == null) {
            m.n("dlService");
            throw null;
        }
        cVar.c(this.f25733e, this.L, false);
        uv.r.a(new e());
    }

    @Override // ii.a
    public final void start() {
    }
}
