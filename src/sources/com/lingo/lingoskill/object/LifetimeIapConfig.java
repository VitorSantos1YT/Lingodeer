package com.lingo.lingoskill.object;

import c00.e;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class LifetimeIapConfig {
    private boolean isDiscounting;
    private boolean isVisible;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return LifetimeIapConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LifetimeIapConfig() {
        boolean z11 = false;
        this(z11, z11, 3, (f) null);
    }

    public static /* synthetic */ LifetimeIapConfig copy$default(LifetimeIapConfig lifetimeIapConfig, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = lifetimeIapConfig.isDiscounting;
        }
        if ((i11 & 2) != 0) {
            z12 = lifetimeIapConfig.isVisible;
        }
        return lifetimeIapConfig.copy(z11, z12);
    }

    public static final /* synthetic */ void write$Self$app_release(LifetimeIapConfig lifetimeIapConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || lifetimeIapConfig.isDiscounting) {
            bVar.B(gVar, 0, lifetimeIapConfig.isDiscounting);
        }
        if (bVar.G(gVar) || lifetimeIapConfig.isVisible) {
            bVar.B(gVar, 1, lifetimeIapConfig.isVisible);
        }
    }

    public final boolean component1() {
        return this.isDiscounting;
    }

    public final boolean component2() {
        return this.isVisible;
    }

    public final LifetimeIapConfig copy(boolean z11, boolean z12) {
        return new LifetimeIapConfig(z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifetimeIapConfig)) {
            return false;
        }
        LifetimeIapConfig lifetimeIapConfig = (LifetimeIapConfig) obj;
        return this.isDiscounting == lifetimeIapConfig.isDiscounting && this.isVisible == lifetimeIapConfig.isVisible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVisible) + (Boolean.hashCode(this.isDiscounting) * 31);
    }

    public final boolean isDiscounting() {
        return this.isDiscounting;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setDiscounting(boolean z11) {
        this.isDiscounting = z11;
    }

    public final void setVisible(boolean z11) {
        this.isVisible = z11;
    }

    public String toString() {
        return "LifetimeIapConfig(isDiscounting=" + this.isDiscounting + ", isVisible=" + this.isVisible + ")";
    }

    public /* synthetic */ LifetimeIapConfig(int i11, boolean z11, boolean z12, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.isDiscounting = false;
        } else {
            this.isDiscounting = z11;
        }
        if ((i11 & 2) == 0) {
            this.isVisible = false;
        } else {
            this.isVisible = z12;
        }
    }

    public LifetimeIapConfig(boolean z11, boolean z12) {
        this.isDiscounting = z11;
        this.isVisible = z12;
    }

    public /* synthetic */ LifetimeIapConfig(boolean z11, boolean z12, int i11, f fVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
    }
}
