package com.lingodeer.network.model;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserPurchaseStatusResponse {
    private CurrentPurchaseStatus current_purchase_status;

    public UserPurchaseStatusResponse(CurrentPurchaseStatus current_purchase_status) {
        m.f(current_purchase_status, "current_purchase_status");
        this.current_purchase_status = current_purchase_status;
    }

    public static /* synthetic */ UserPurchaseStatusResponse copy$default(UserPurchaseStatusResponse userPurchaseStatusResponse, CurrentPurchaseStatus currentPurchaseStatus, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            currentPurchaseStatus = userPurchaseStatusResponse.current_purchase_status;
        }
        return userPurchaseStatusResponse.copy(currentPurchaseStatus);
    }

    public final CurrentPurchaseStatus component1() {
        return this.current_purchase_status;
    }

    public final UserPurchaseStatusResponse copy(CurrentPurchaseStatus current_purchase_status) {
        m.f(current_purchase_status, "current_purchase_status");
        return new UserPurchaseStatusResponse(current_purchase_status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserPurchaseStatusResponse) && m.a(this.current_purchase_status, ((UserPurchaseStatusResponse) obj).current_purchase_status);
    }

    public final CurrentPurchaseStatus getCurrent_purchase_status() {
        return this.current_purchase_status;
    }

    public int hashCode() {
        return this.current_purchase_status.hashCode();
    }

    public final void setCurrent_purchase_status(CurrentPurchaseStatus currentPurchaseStatus) {
        m.f(currentPurchaseStatus, "<set-?>");
        this.current_purchase_status = currentPurchaseStatus;
    }

    public String toString() {
        return "UserPurchaseStatusResponse(current_purchase_status=" + this.current_purchase_status + ")";
    }
}
