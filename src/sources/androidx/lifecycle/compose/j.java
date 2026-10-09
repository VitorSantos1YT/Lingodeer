package androidx.lifecycle.compose;

import androidx.lifecycle.LifecycleOwner;
import l1.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements fz.e {
    public final /* synthetic */ int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f2080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f2081f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2082t;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, int i13) {
        this.f2076a = i13;
        this.f2077b = obj;
        this.f2078c = obj2;
        this.f2079d = obj3;
        this.f2080e = lifecycleOwner;
        this.f2081f = cVar;
        this.f2082t = i11;
        this.H = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2076a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$26(this.f2077b, this.f2078c, this.f2079d, this.f2080e, this.f2081f, this.f2082t, this.H, (n) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$11(this.f2077b, this.f2078c, this.f2079d, this.f2080e, this.f2081f, this.f2082t, this.H, (n) obj, iIntValue2);
        }
    }
}
