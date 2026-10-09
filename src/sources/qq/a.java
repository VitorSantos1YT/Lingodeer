package qq;

import com.lingo.lingoskill.vtskill.ui.syllable.ui.VTSyllableStudyActivity;
import fv.c;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import n9.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VTSyllableStudyActivity f48297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pq.b f48298b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f48301e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f48302f = new q(29, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f48299c = new c();

    public a(VTSyllableStudyActivity vTSyllableStudyActivity, pq.b bVar) {
        this.f48297a = vTSyllableStudyActivity;
        this.f48298b = bVar;
        vTSyllableStudyActivity.P = this;
    }

    @Override // ii.a
    public final void A() {
        c cVar = this.f48299c;
        if (cVar != null) {
            cVar.a(this.f48300d);
            ArrayList arrayList = this.f48301e;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                m.e(obj, "next(...)");
                cVar.a(((Number) obj).intValue());
            }
        }
        this.f48302f.f();
    }

    @Override // ii.a
    public final void start() {
    }
}
