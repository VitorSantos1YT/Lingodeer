package ot;

import com.lingodeer.data.model.SRSStatus;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0.m0 f45838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f45839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f45841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f45842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f45843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f45844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f45845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f45846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f45847j;

    public h2(List formalStatuses, d0.m0 m0Var, fz.a now, long j11) {
        kotlin.jvm.internal.m.f(formalStatuses, "formalStatuses");
        kotlin.jvm.internal.m.f(now, "now");
        this.f45838a = m0Var;
        this.f45839b = now;
        this.f45840c = j11;
        this.f45841d = new LinkedHashMap();
        this.f45842e = new LinkedHashMap();
        this.f45843f = new LinkedHashSet();
        this.f45844g = new LinkedHashSet();
        this.f45845h = new LinkedHashMap();
        this.f45846i = new LinkedHashMap();
        this.f45847j = new LinkedHashSet();
        Iterator it = formalStatuses.iterator();
        while (it.hasNext()) {
            SRSStatus sRSStatus = (SRSStatus) it.next();
            if (!this.f45841d.containsKey(sRSStatus.getId())) {
                SRSStatus sRSStatusCopy$default = SRSStatus.copy$default(sRSStatus, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, null, 2097151, null);
                this.f45841d.put(sRSStatusCopy$default.getId(), sRSStatusCopy$default);
                this.f45842e.put(sRSStatusCopy$default.getId(), SRSStatus.copy$default(sRSStatusCopy$default, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, null, 2097151, null));
            }
        }
    }

    public final void a(String id2, boolean z11) {
        kotlin.jvm.internal.m.f(id2, "id");
        List listB = b();
        if (listB.isEmpty()) {
            return;
        }
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(((i2) it.next()).f45854a, id2)) {
                LinkedHashSet linkedHashSet = this.f45847j;
                if (z11) {
                    linkedHashSet.add(id2);
                    return;
                } else {
                    linkedHashSet.remove(id2);
                    return;
                }
            }
        }
    }

    public final List b() {
        Collection collectionValues = this.f45841d.values();
        kotlin.jvm.internal.m.e(collectionValues, "<get-values>(...)");
        return nz.n.Z(new cz.i(2, nz.n.X(ry.m.g0(collectionValues), new e2(this, 0)), new fr.a2(new gu.g(13), 4)));
    }
}
