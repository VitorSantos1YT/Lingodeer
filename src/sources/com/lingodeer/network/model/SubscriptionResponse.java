package com.lingodeer.network.model;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SubscriptionResponse {
    private final SubscriptionResponseDetail m_membership;

    public SubscriptionResponse(SubscriptionResponseDetail m_membership) {
        m.f(m_membership, "m_membership");
        this.m_membership = m_membership;
    }

    public static /* synthetic */ SubscriptionResponse copy$default(SubscriptionResponse subscriptionResponse, SubscriptionResponseDetail subscriptionResponseDetail, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            subscriptionResponseDetail = subscriptionResponse.m_membership;
        }
        return subscriptionResponse.copy(subscriptionResponseDetail);
    }

    public final SubscriptionResponseDetail component1() {
        return this.m_membership;
    }

    public final SubscriptionResponse copy(SubscriptionResponseDetail m_membership) {
        m.f(m_membership, "m_membership");
        return new SubscriptionResponse(m_membership);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubscriptionResponse) && m.a(this.m_membership, ((SubscriptionResponse) obj).m_membership);
    }

    public final SubscriptionResponseDetail getM_membership() {
        return this.m_membership;
    }

    public int hashCode() {
        return this.m_membership.hashCode();
    }

    public String toString() {
        return "SubscriptionResponse(m_membership=" + this.m_membership + ")";
    }
}
