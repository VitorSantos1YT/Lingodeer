package com.adjust.sdk;

import b7.f0;
import f7.a0;
import f7.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7329c;

    public /* synthetic */ b(Object obj, boolean z11, int i11) {
        this.f7327a = i11;
        this.f7328b = obj;
        this.f7329c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f7327a;
        boolean z11 = this.f7329c;
        Object obj = this.f7328b;
        switch (i11) {
            case 0:
                ((ActivityHandler) obj).lambda$onActivityLifecycle$0(z11);
                break;
            case 1:
                ((ActivityHandler) obj).lambda$trackMeasurementConsent$39(z11);
                break;
            case 2:
                ((ActivityHandler) obj).lambda$setCoppaComplianceInDelay$49(z11);
                break;
            case 3:
                ((ActivityHandler) obj).lambda$setOfflineMode$7(z11);
                break;
            case 4:
                ((ActivityHandler) obj).lambda$setOfflineMode$8(z11);
                break;
            case 5:
                ((ActivityHandler) obj).lambda$setEnabled$6(z11);
                break;
            case 6:
                ((ActivityHandler) obj).lambda$setPlayStoreKidsComplianceInDelay$50(z11);
                break;
            case 7:
                ((ActivityHandler) obj).lambda$setEnabled$5(z11);
                break;
            case 8:
                ((ActivityHandler) obj).lambda$onActivityLifecycle$1(z11);
                break;
            default:
                x xVar = (x) ((ob.l) obj).f44823c;
                String str = f0.f3975a;
                a0 a0Var = xVar.f26935a;
                if (a0Var.G0 != z11) {
                    a0Var.G0 = z11;
                    a0Var.P.e(23, new f7.s(z11, 1));
                    break;
                }
                break;
        }
    }
}
