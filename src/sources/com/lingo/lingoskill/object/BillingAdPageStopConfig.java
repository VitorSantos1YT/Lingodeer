package com.lingo.lingoskill.object;

import c00.e;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class BillingAdPageStopConfig {
    private int minEnterBillingAdPageCount;
    private boolean stopShow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return BillingAdPageStopConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BillingAdPageStopConfig() {
        this(false, (int) (0 == true ? 1 : 0), 3, (f) null);
    }

    public static /* synthetic */ BillingAdPageStopConfig copy$default(BillingAdPageStopConfig billingAdPageStopConfig, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = billingAdPageStopConfig.stopShow;
        }
        if ((i12 & 2) != 0) {
            i11 = billingAdPageStopConfig.minEnterBillingAdPageCount;
        }
        return billingAdPageStopConfig.copy(z11, i11);
    }

    public static final /* synthetic */ void write$Self$app_release(BillingAdPageStopConfig billingAdPageStopConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || billingAdPageStopConfig.stopShow) {
            bVar.B(gVar, 0, billingAdPageStopConfig.stopShow);
        }
        if (!bVar.G(gVar) && billingAdPageStopConfig.minEnterBillingAdPageCount == 9999) {
            return;
        }
        bVar.g(1, billingAdPageStopConfig.minEnterBillingAdPageCount, gVar);
    }

    public final boolean component1() {
        return this.stopShow;
    }

    public final int component2() {
        return this.minEnterBillingAdPageCount;
    }

    public final BillingAdPageStopConfig copy(boolean z11, int i11) {
        return new BillingAdPageStopConfig(z11, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingAdPageStopConfig)) {
            return false;
        }
        BillingAdPageStopConfig billingAdPageStopConfig = (BillingAdPageStopConfig) obj;
        return this.stopShow == billingAdPageStopConfig.stopShow && this.minEnterBillingAdPageCount == billingAdPageStopConfig.minEnterBillingAdPageCount;
    }

    public final int getMinEnterBillingAdPageCount() {
        return this.minEnterBillingAdPageCount;
    }

    public final boolean getStopShow() {
        return this.stopShow;
    }

    public int hashCode() {
        return Integer.hashCode(this.minEnterBillingAdPageCount) + (Boolean.hashCode(this.stopShow) * 31);
    }

    public final void setMinEnterBillingAdPageCount(int i11) {
        this.minEnterBillingAdPageCount = i11;
    }

    public final void setStopShow(boolean z11) {
        this.stopShow = z11;
    }

    public String toString() {
        return "BillingAdPageStopConfig(stopShow=" + this.stopShow + ", minEnterBillingAdPageCount=" + this.minEnterBillingAdPageCount + ")";
    }

    public /* synthetic */ BillingAdPageStopConfig(int i11, boolean z11, int i12, o1 o1Var) {
        this.stopShow = (i11 & 1) == 0 ? false : z11;
        if ((i11 & 2) == 0) {
            this.minEnterBillingAdPageCount = 9999;
        } else {
            this.minEnterBillingAdPageCount = i12;
        }
    }

    public BillingAdPageStopConfig(boolean z11, int i11) {
        this.stopShow = z11;
        this.minEnterBillingAdPageCount = i11;
    }

    public /* synthetic */ BillingAdPageStopConfig(boolean z11, int i11, int i12, f fVar) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? 9999 : i11);
    }
}
