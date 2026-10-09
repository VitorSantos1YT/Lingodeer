package com.lingodeer.network.model;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class AICreditCurCircleDetailResponse {
    private AICredit aicredit_curcircle_detail;

    /* JADX WARN: Multi-variable type inference failed */
    public AICreditCurCircleDetailResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AICreditCurCircleDetailResponse copy$default(AICreditCurCircleDetailResponse aICreditCurCircleDetailResponse, AICredit aICredit, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aICredit = aICreditCurCircleDetailResponse.aicredit_curcircle_detail;
        }
        return aICreditCurCircleDetailResponse.copy(aICredit);
    }

    public final AICredit component1() {
        return this.aicredit_curcircle_detail;
    }

    public final AICreditCurCircleDetailResponse copy(AICredit aicredit_curcircle_detail) {
        m.f(aicredit_curcircle_detail, "aicredit_curcircle_detail");
        return new AICreditCurCircleDetailResponse(aicredit_curcircle_detail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AICreditCurCircleDetailResponse) && m.a(this.aicredit_curcircle_detail, ((AICreditCurCircleDetailResponse) obj).aicredit_curcircle_detail);
    }

    public final AICredit getAicredit_curcircle_detail() {
        return this.aicredit_curcircle_detail;
    }

    public int hashCode() {
        return this.aicredit_curcircle_detail.hashCode();
    }

    public final void setAicredit_curcircle_detail(AICredit aICredit) {
        m.f(aICredit, "<set-?>");
        this.aicredit_curcircle_detail = aICredit;
    }

    public String toString() {
        return "AICreditCurCircleDetailResponse(aicredit_curcircle_detail=" + this.aicredit_curcircle_detail + ")";
    }

    public AICreditCurCircleDetailResponse(AICredit aicredit_curcircle_detail) {
        m.f(aicredit_curcircle_detail, "aicredit_curcircle_detail");
        this.aicredit_curcircle_detail = aicredit_curcircle_detail;
    }

    public /* synthetic */ AICreditCurCircleDetailResponse(AICredit aICredit, int i11, f fVar) {
        this((i11 & 1) != 0 ? new AICredit(0, 0, 0, 0, 0, 0L, 0L, false, false, 511, null) : aICredit);
    }
}
