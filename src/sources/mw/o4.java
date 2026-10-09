package mw;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o4 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FetchEligibleCampaignsRequest f42607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f42608b;

    public o4(n2 n2Var, FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        this.f42608b = n2Var;
        this.f42607a = fetchEligibleCampaignsRequest;
    }

    @Override // mw.q4
    public final void a(w4 w4Var) {
        w4Var.f42777a.j(this.f42608b.f42571a.c(this.f42607a));
        w4Var.f42777a.flush();
    }
}
