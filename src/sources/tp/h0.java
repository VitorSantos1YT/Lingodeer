package tp;

import com.lingodeer.data.model.LanStaticsInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52467b;

    public /* synthetic */ h0(Object obj, int i11) {
        this.f52466a = i11;
        this.f52467b = obj;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f52466a) {
            case 0:
                return ef.e.q((i0) this.f52467b).a(null, null, kotlin.jvm.internal.z.a(wt.q.class));
            case 1:
                return ((ui.m) this.f52467b).requireActivity();
            case 2:
                ((fz.a) this.f52467b).invoke();
                return qy.b0.f48488a;
            default:
                return Float.valueOf(((LanStaticsInfo) this.f52467b).getProgress());
        }
    }
}
