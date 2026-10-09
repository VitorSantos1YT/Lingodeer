package com.adjust.sdk;

import java.util.ArrayList;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class FirstSessionDelayManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityHandler f7277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7278b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7279c = 0;

    public FirstSessionDelayManager(ActivityHandler activityHandler) {
        this.f7277a = activityHandler;
    }

    public final void a(Runnable runnable, String str) {
        if (this.f7279c != 3) {
            runnable.run();
        } else {
            this.f7277a.getAdjustConfig().getLogger().debug(ep.a.g("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            this.f7278b.add(runnable);
        }
    }

    public final void a(String str, IRunActivityHandler iRunActivityHandler) {
        if (this.f7279c == 3) {
            this.f7277a.getAdjustConfig().getLogger().debug(ep.a.g("Enqueuing \"", str, HOBXIlHxIkMBEA.NysrWDDAZ), new Object[0]);
            this.f7277a.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
        } else {
            iRunActivityHandler.run(this.f7277a);
        }
    }
}
