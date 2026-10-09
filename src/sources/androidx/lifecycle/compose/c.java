package androidx.lifecycle.compose;

import androidx.lifecycle.LifecycleOwner;
import l1.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f2041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f2042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2044e;

    public /* synthetic */ c(LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, int i13) {
        this.f2040a = i13;
        this.f2041b = lifecycleOwner;
        this.f2042c = cVar;
        this.f2043d = i11;
        this.f2044e = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2040a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$14(this.f2041b, this.f2042c, this.f2043d, this.f2044e, (n) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$29(this.f2041b, this.f2042c, this.f2043d, this.f2044e, (n) obj, iIntValue2);
        }
    }
}
