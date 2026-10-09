package nh;

import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43785a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f43786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f43789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f43790f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f43791t;

    public /* synthetic */ f(int i11, String str, boolean z11, boolean z12, fz.a aVar, int i12) {
        this.f43787c = i11;
        this.f43788d = str;
        this.f43786b = z11;
        this.f43789e = z12;
        this.f43790f = aVar;
        this.f43791t = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43785a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = t.M(this.f43791t | 1);
                i.a(this.f43787c, iM, this.f43790f, this.f43788d, (n) obj, this.f43786b, this.f43789e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = t.M(this.f43791t | 1);
                ys.a.h(this.f43787c, iM2, this.f43790f, this.f43788d, (n) obj, this.f43786b, this.f43789e);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ f(boolean z11, int i11, String str, boolean z12, fz.a aVar, int i12) {
        this.f43786b = z11;
        this.f43787c = i11;
        this.f43788d = str;
        this.f43789e = z12;
        this.f43790f = aVar;
        this.f43791t = i12;
    }
}
