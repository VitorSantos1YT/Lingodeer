package mr;

import java.util.ArrayList;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import rz.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements fv.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f41185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f41187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f41188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f41189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f41190f;

    public b(e eVar, Object obj, w wVar, ArrayList arrayList, u uVar, m mVar) {
        this.f41185a = eVar;
        this.f41186b = obj;
        this.f41187c = wVar;
        this.f41188d = arrayList;
        this.f41189e = uVar;
        this.f41190f = mVar;
    }

    @Override // fv.d
    public final void b(uv.b bVar) {
        int iA;
        if (bVar == null || (iA = bVar.a()) == -1) {
            return;
        }
        this.f41185a.f41206g.add(Integer.valueOf(iA));
    }

    @Override // fv.d
    public final void c(uv.b bVar) {
        Object obj = this.f41186b;
        w wVar = this.f41187c;
        ArrayList arrayList = this.f41188d;
        u uVar = this.f41189e;
        m mVar = this.f41190f;
        synchronized (obj) {
            int i11 = wVar.f38359a + 1;
            wVar.f38359a = i11;
            if (i11 == arrayList.size() && !uVar.f38357a && mVar.w()) {
                mVar.resumeWith(Boolean.TRUE);
            }
        }
    }

    @Override // fv.d
    public final void f(uv.b bVar, Throwable th2) {
        Object obj = this.f41186b;
        u uVar = this.f41189e;
        m mVar = this.f41190f;
        synchronized (obj) {
            uVar.f38357a = true;
            if (mVar.w()) {
                mVar.resumeWith(Boolean.FALSE);
            }
        }
    }

    @Override // fv.d
    public final void a(uv.b bVar) {
    }

    @Override // fv.d
    public final void d(uv.b bVar) {
    }

    @Override // fv.d
    public final void e(uv.b bVar, int i11, int i12) {
    }
}
