package bt;

import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jt.g f5952b;

    public /* synthetic */ s(jt.g gVar, int i11) {
        this.f5951a = i11;
        this.f5952b = gVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f5951a) {
            case 0:
                ht.l it = (ht.l) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f5952b.f36939h.setValue(it);
                break;
            default:
                jt.g gVar = this.f5952b;
                gVar.f36941j.setValue(RecordingStatus.ReadyRecord.INSTANCE);
                gVar.f36938g.setValue(ht.q.SELECTED);
                break;
        }
        return qy.b0.f48488a;
    }
}
