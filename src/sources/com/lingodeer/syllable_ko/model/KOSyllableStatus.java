package com.lingodeer.syllable_ko.model;

import ep.a;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class KOSyllableStatus {
    public static final int $stable = 0;
    private final boolean isSelected;

    public KOSyllableStatus() {
        this(false, 1, null);
    }

    public static /* synthetic */ KOSyllableStatus copy$default(KOSyllableStatus kOSyllableStatus, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = kOSyllableStatus.isSelected;
        }
        return kOSyllableStatus.copy(z11);
    }

    public final boolean component1() {
        return this.isSelected;
    }

    public final KOSyllableStatus copy(boolean z11) {
        return new KOSyllableStatus(z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KOSyllableStatus) && this.isSelected == ((KOSyllableStatus) obj).isSelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        return a.i("KOSyllableStatus(isSelected=", ")", this.isSelected);
    }

    public KOSyllableStatus(boolean z11) {
        this.isSelected = z11;
    }

    public /* synthetic */ KOSyllableStatus(boolean z11, int i11, f fVar) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
