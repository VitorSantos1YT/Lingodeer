package com.lingodeer.network.model;

import com.lingodeer.data.model.BillingStatus;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class PremiumStatus {
    private BillingStatus premium;
    private BillingStatus premium_plus;

    public PremiumStatus(BillingStatus premium, BillingStatus premium_plus) {
        m.f(premium, "premium");
        m.f(premium_plus, "premium_plus");
        this.premium = premium;
        this.premium_plus = premium_plus;
    }

    public static /* synthetic */ PremiumStatus copy$default(PremiumStatus premiumStatus, BillingStatus billingStatus, BillingStatus billingStatus2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            billingStatus = premiumStatus.premium;
        }
        if ((i11 & 2) != 0) {
            billingStatus2 = premiumStatus.premium_plus;
        }
        return premiumStatus.copy(billingStatus, billingStatus2);
    }

    public final BillingStatus component1() {
        return this.premium;
    }

    public final BillingStatus component2() {
        return this.premium_plus;
    }

    public final PremiumStatus copy(BillingStatus premium, BillingStatus premium_plus) {
        m.f(premium, "premium");
        m.f(premium_plus, "premium_plus");
        return new PremiumStatus(premium, premium_plus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumStatus)) {
            return false;
        }
        PremiumStatus premiumStatus = (PremiumStatus) obj;
        return m.a(this.premium, premiumStatus.premium) && m.a(this.premium_plus, premiumStatus.premium_plus);
    }

    public final BillingStatus getPremium() {
        return this.premium;
    }

    public final BillingStatus getPremium_plus() {
        return this.premium_plus;
    }

    public int hashCode() {
        return this.premium_plus.hashCode() + (this.premium.hashCode() * 31);
    }

    public final void setPremium(BillingStatus billingStatus) {
        m.f(billingStatus, "<set-?>");
        this.premium = billingStatus;
    }

    public final void setPremium_plus(BillingStatus billingStatus) {
        m.f(billingStatus, "<set-?>");
        this.premium_plus = billingStatus;
    }

    public String toString() {
        return "PremiumStatus(premium=" + this.premium + ", premium_plus=" + this.premium_plus + ")";
    }
}
