package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsController;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18359c;

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f18357a = i11;
        this.f18358b = obj;
        this.f18359c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f18357a;
        Object obj = this.f18359c;
        Object obj2 = this.f18358b;
        switch (i11) {
            case 0:
                ((CrashlyticsCore) obj2).a((SettingsController) obj);
                break;
            case 1:
                ((CrashlyticsCore) obj2).a((SettingsController) obj);
                break;
            default:
                b bVar = CrashlyticsController.f18258r;
                ((CrashlyticsController) obj2).c((String) obj, Boolean.FALSE);
                break;
        }
    }
}
