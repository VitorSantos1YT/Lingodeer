package com.lingo.lingoskill.object;

import b7.e0;
import c00.e;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class BillingPageRecomConfig {
    private long countDownEndTimeIntervalSince1970;
    private boolean notRecomShowCountDown;
    private boolean recomShowCountDown;
    private int recomType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return BillingPageRecomConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public BillingPageRecomConfig() {
        this(0, 0L, false, false, 15, (f) null);
    }

    public static /* synthetic */ BillingPageRecomConfig copy$default(BillingPageRecomConfig billingPageRecomConfig, int i11, long j11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = billingPageRecomConfig.recomType;
        }
        if ((i12 & 2) != 0) {
            j11 = billingPageRecomConfig.countDownEndTimeIntervalSince1970;
        }
        if ((i12 & 4) != 0) {
            z11 = billingPageRecomConfig.recomShowCountDown;
        }
        if ((i12 & 8) != 0) {
            z12 = billingPageRecomConfig.notRecomShowCountDown;
        }
        return billingPageRecomConfig.copy(i11, j11, z11, z12);
    }

    public static final /* synthetic */ void write$Self$app_release(BillingPageRecomConfig billingPageRecomConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || billingPageRecomConfig.recomType != 0) {
            bVar.g(0, billingPageRecomConfig.recomType, gVar);
        }
        if (bVar.G(gVar) || billingPageRecomConfig.countDownEndTimeIntervalSince1970 != 0) {
            bVar.v(gVar, 1, billingPageRecomConfig.countDownEndTimeIntervalSince1970);
        }
        if (bVar.G(gVar) || !billingPageRecomConfig.recomShowCountDown) {
            bVar.B(gVar, 2, billingPageRecomConfig.recomShowCountDown);
        }
        if (bVar.G(gVar) || billingPageRecomConfig.notRecomShowCountDown) {
            bVar.B(gVar, 3, billingPageRecomConfig.notRecomShowCountDown);
        }
    }

    public final int component1() {
        return this.recomType;
    }

    public final long component2() {
        return this.countDownEndTimeIntervalSince1970;
    }

    public final boolean component3() {
        return this.recomShowCountDown;
    }

    public final boolean component4() {
        return this.notRecomShowCountDown;
    }

    public final BillingPageRecomConfig copy(int i11, long j11, boolean z11, boolean z12) {
        return new BillingPageRecomConfig(i11, j11, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingPageRecomConfig)) {
            return false;
        }
        BillingPageRecomConfig billingPageRecomConfig = (BillingPageRecomConfig) obj;
        return this.recomType == billingPageRecomConfig.recomType && this.countDownEndTimeIntervalSince1970 == billingPageRecomConfig.countDownEndTimeIntervalSince1970 && this.recomShowCountDown == billingPageRecomConfig.recomShowCountDown && this.notRecomShowCountDown == billingPageRecomConfig.notRecomShowCountDown;
    }

    public final long getCountDownEndTimeIntervalSince1970() {
        return this.countDownEndTimeIntervalSince1970;
    }

    public final boolean getNotRecomShowCountDown() {
        return this.notRecomShowCountDown;
    }

    public final boolean getRecomShowCountDown() {
        return this.recomShowCountDown;
    }

    public final int getRecomType() {
        return this.recomType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.notRecomShowCountDown) + defpackage.e.e(defpackage.e.f(this.countDownEndTimeIntervalSince1970, Integer.hashCode(this.recomType) * 31, 31), 31, this.recomShowCountDown);
    }

    public final void setCountDownEndTimeIntervalSince1970(long j11) {
        this.countDownEndTimeIntervalSince1970 = j11;
    }

    public final void setNotRecomShowCountDown(boolean z11) {
        this.notRecomShowCountDown = z11;
    }

    public final void setRecomShowCountDown(boolean z11) {
        this.recomShowCountDown = z11;
    }

    public final void setRecomType(int i11) {
        this.recomType = i11;
    }

    public String toString() {
        int i11 = this.recomType;
        long j11 = this.countDownEndTimeIntervalSince1970;
        boolean z11 = this.recomShowCountDown;
        boolean z12 = this.notRecomShowCountDown;
        StringBuilder sbO = e0.o(i11, "BillingPageRecomConfig(recomType=", ", countDownEndTimeIntervalSince1970=", j11);
        e0.z(", recomShowCountDown=", ", notRecomShowCountDown=", sbO, z11, z12);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ BillingPageRecomConfig(int i11, int i12, long j11, boolean z11, boolean z12, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.recomType = 0;
        } else {
            this.recomType = i12;
        }
        if ((i11 & 2) == 0) {
            this.countDownEndTimeIntervalSince1970 = 0L;
        } else {
            this.countDownEndTimeIntervalSince1970 = j11;
        }
        if ((i11 & 4) == 0) {
            this.recomShowCountDown = true;
        } else {
            this.recomShowCountDown = z11;
        }
        if ((i11 & 8) == 0) {
            this.notRecomShowCountDown = false;
        } else {
            this.notRecomShowCountDown = z12;
        }
    }

    public BillingPageRecomConfig(int i11, long j11, boolean z11, boolean z12) {
        this.recomType = i11;
        this.countDownEndTimeIntervalSince1970 = j11;
        this.recomShowCountDown = z11;
        this.notRecomShowCountDown = z12;
    }

    public /* synthetic */ BillingPageRecomConfig(int i11, long j11, boolean z11, boolean z12, int i12, f fVar) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? 0L : j11, (i12 & 4) != 0 ? true : z11, (i12 & 8) != 0 ? false : z12);
    }
}
