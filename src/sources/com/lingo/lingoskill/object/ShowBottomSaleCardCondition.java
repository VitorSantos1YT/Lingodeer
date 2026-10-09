package com.lingo.lingoskill.object;

import c00.e;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class ShowBottomSaleCardCondition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean isShow;
    private final int minEnterUnitCount;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return ShowBottomSaleCardCondition$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ ShowBottomSaleCardCondition(int i11, boolean z11, int i12, o1 o1Var) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, ShowBottomSaleCardCondition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.isShow = z11;
        this.minEnterUnitCount = i12;
    }

    public static /* synthetic */ ShowBottomSaleCardCondition copy$default(ShowBottomSaleCardCondition showBottomSaleCardCondition, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = showBottomSaleCardCondition.isShow;
        }
        if ((i12 & 2) != 0) {
            i11 = showBottomSaleCardCondition.minEnterUnitCount;
        }
        return showBottomSaleCardCondition.copy(z11, i11);
    }

    public static final /* synthetic */ void write$Self$app_release(ShowBottomSaleCardCondition showBottomSaleCardCondition, b bVar, g gVar) {
        bVar.B(gVar, 0, showBottomSaleCardCondition.isShow);
        bVar.g(1, showBottomSaleCardCondition.minEnterUnitCount, gVar);
    }

    public final boolean component1() {
        return this.isShow;
    }

    public final int component2() {
        return this.minEnterUnitCount;
    }

    public final ShowBottomSaleCardCondition copy(boolean z11, int i11) {
        return new ShowBottomSaleCardCondition(z11, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowBottomSaleCardCondition)) {
            return false;
        }
        ShowBottomSaleCardCondition showBottomSaleCardCondition = (ShowBottomSaleCardCondition) obj;
        return this.isShow == showBottomSaleCardCondition.isShow && this.minEnterUnitCount == showBottomSaleCardCondition.minEnterUnitCount;
    }

    public final int getMinEnterUnitCount() {
        return this.minEnterUnitCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.minEnterUnitCount) + (Boolean.hashCode(this.isShow) * 31);
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public String toString() {
        return "ShowBottomSaleCardCondition(isShow=" + this.isShow + ", minEnterUnitCount=" + this.minEnterUnitCount + ")";
    }

    public ShowBottomSaleCardCondition(boolean z11, int i11) {
        this.isShow = z11;
        this.minEnterUnitCount = i11;
    }
}
