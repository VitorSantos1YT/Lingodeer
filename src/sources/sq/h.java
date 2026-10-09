package sq;

import com.tbruyelle.rxpermissions3.BuildConfig;
import oz.x;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f51743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f51744c;

    public /* synthetic */ h(String str, l lVar, int i11) {
        this.f51742a = i11;
        this.f51744c = str;
        this.f51743b = lVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f51742a) {
            case 0:
                this.f51743b.y(this.f51744c);
                break;
            case 1:
                this.f51743b.y(this.f51744c);
                break;
            case 2:
                this.f51743b.y(((String[]) oz.q.W0(this.f51744c, new String[]{" "}, 0, 6).toArray(new String[0]))[1]);
                break;
            default:
                this.f51743b.y(x.q0(x.q0(((String[]) oz.q.W0(this.f51744c, new String[]{" "}, 0, 6).toArray(new String[0]))[1], "(", BuildConfig.VERSION_NAME), ")", BuildConfig.VERSION_NAME));
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ h(l lVar, String str, int i11) {
        this.f51742a = i11;
        this.f51743b = lVar;
        this.f51744c = str;
    }
}
