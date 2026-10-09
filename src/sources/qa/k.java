package qa;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f47643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f47644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f47646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f47647e;

    public k(m mVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f47647e = mVar;
        this.f47643a = obj;
        this.f47644b = arrayList;
        this.f47645c = obj2;
        this.f47646d = arrayList2;
    }

    @Override // qa.w, qa.t
    public final void a(v vVar) {
        m mVar = this.f47647e;
        Object obj = this.f47643a;
        if (obj != null) {
            mVar.z(obj, this.f47644b, null);
        }
        Object obj2 = this.f47645c;
        if (obj2 != null) {
            mVar.z(obj2, this.f47646d, null);
        }
    }

    @Override // qa.w, qa.t
    public final void c(v vVar) {
        vVar.E(this);
    }
}
