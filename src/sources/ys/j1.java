package ys;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.f f58082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f58083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f58084d;

    public /* synthetic */ j1(fz.f fVar, String str, long j11, int i11) {
        this.f58081a = i11;
        this.f58082b = fVar;
        this.f58083c = str;
        this.f58084d = j11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f58081a) {
            case 0:
                fz.f fVar = this.f58082b;
                if (fVar != null) {
                    fVar.invoke(this.f58083c, Long.valueOf(this.f58084d), BuildConfig.VERSION_NAME);
                }
                break;
            default:
                fz.f fVar2 = this.f58082b;
                if (fVar2 != null) {
                    fVar2.invoke(this.f58083c, Long.valueOf(this.f58084d), BuildConfig.VERSION_NAME);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
