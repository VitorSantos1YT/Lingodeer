package com.lingodeer.network.model;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CurrentPurchaseStatus {
    private PremiumStatus apple;
    private PremiumStatus google;
    private PremiumStatus paypal;
    private PremiumStatus stripe;
    private PremiumStatus team;

    public CurrentPurchaseStatus(PremiumStatus google, PremiumStatus apple, PremiumStatus paypal, PremiumStatus stripe, PremiumStatus team) {
        m.f(google, "google");
        m.f(apple, "apple");
        m.f(paypal, "paypal");
        m.f(stripe, "stripe");
        m.f(team, "team");
        this.google = google;
        this.apple = apple;
        this.paypal = paypal;
        this.stripe = stripe;
        this.team = team;
    }

    public static /* synthetic */ CurrentPurchaseStatus copy$default(CurrentPurchaseStatus currentPurchaseStatus, PremiumStatus premiumStatus, PremiumStatus premiumStatus2, PremiumStatus premiumStatus3, PremiumStatus premiumStatus4, PremiumStatus premiumStatus5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            premiumStatus = currentPurchaseStatus.google;
        }
        if ((i11 & 2) != 0) {
            premiumStatus2 = currentPurchaseStatus.apple;
        }
        if ((i11 & 4) != 0) {
            premiumStatus3 = currentPurchaseStatus.paypal;
        }
        if ((i11 & 8) != 0) {
            premiumStatus4 = currentPurchaseStatus.stripe;
        }
        if ((i11 & 16) != 0) {
            premiumStatus5 = currentPurchaseStatus.team;
        }
        PremiumStatus premiumStatus6 = premiumStatus5;
        PremiumStatus premiumStatus7 = premiumStatus3;
        return currentPurchaseStatus.copy(premiumStatus, premiumStatus2, premiumStatus7, premiumStatus4, premiumStatus6);
    }

    public final PremiumStatus component1() {
        return this.google;
    }

    public final PremiumStatus component2() {
        return this.apple;
    }

    public final PremiumStatus component3() {
        return this.paypal;
    }

    public final PremiumStatus component4() {
        return this.stripe;
    }

    public final PremiumStatus component5() {
        return this.team;
    }

    public final CurrentPurchaseStatus copy(PremiumStatus google, PremiumStatus apple, PremiumStatus paypal, PremiumStatus stripe, PremiumStatus team) {
        m.f(google, "google");
        m.f(apple, "apple");
        m.f(paypal, "paypal");
        m.f(stripe, "stripe");
        m.f(team, "team");
        return new CurrentPurchaseStatus(google, apple, paypal, stripe, team);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentPurchaseStatus)) {
            return false;
        }
        CurrentPurchaseStatus currentPurchaseStatus = (CurrentPurchaseStatus) obj;
        return m.a(this.google, currentPurchaseStatus.google) && m.a(this.apple, currentPurchaseStatus.apple) && m.a(this.paypal, currentPurchaseStatus.paypal) && m.a(this.stripe, currentPurchaseStatus.stripe) && m.a(this.team, currentPurchaseStatus.team);
    }

    public final PremiumStatus getApple() {
        return this.apple;
    }

    public final PremiumStatus getGoogle() {
        return this.google;
    }

    public final PremiumStatus getPaypal() {
        return this.paypal;
    }

    public final PremiumStatus getStripe() {
        return this.stripe;
    }

    public final PremiumStatus getTeam() {
        return this.team;
    }

    public int hashCode() {
        return this.team.hashCode() + ((this.stripe.hashCode() + ((this.paypal.hashCode() + ((this.apple.hashCode() + (this.google.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final void setApple(PremiumStatus premiumStatus) {
        m.f(premiumStatus, "<set-?>");
        this.apple = premiumStatus;
    }

    public final void setGoogle(PremiumStatus premiumStatus) {
        m.f(premiumStatus, "<set-?>");
        this.google = premiumStatus;
    }

    public final void setPaypal(PremiumStatus premiumStatus) {
        m.f(premiumStatus, "<set-?>");
        this.paypal = premiumStatus;
    }

    public final void setStripe(PremiumStatus premiumStatus) {
        m.f(premiumStatus, "<set-?>");
        this.stripe = premiumStatus;
    }

    public final void setTeam(PremiumStatus premiumStatus) {
        m.f(premiumStatus, "<set-?>");
        this.team = premiumStatus;
    }

    public String toString() {
        return "CurrentPurchaseStatus(google=" + this.google + ", apple=" + this.apple + ", paypal=" + this.paypal + ", stripe=" + this.stripe + ", team=" + this.team + ")";
    }
}
