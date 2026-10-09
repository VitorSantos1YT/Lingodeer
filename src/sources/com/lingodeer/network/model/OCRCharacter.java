package com.lingodeer.network.model;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.google.gson.annotations.SerializedName;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class OCRCharacter {

    @SerializedName("AvgConfidence")
    private float avgConfidence;

    /* JADX INFO: renamed from: char, reason: not valid java name */
    @SerializedName("Char")
    private String f0char;

    @SerializedName("Count")
    private int count;

    public OCRCharacter() {
        this(null, 0, CropImageView.DEFAULT_ASPECT_RATIO, 7, null);
    }

    public static /* synthetic */ OCRCharacter copy$default(OCRCharacter oCRCharacter, String str, int i11, float f5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = oCRCharacter.f0char;
        }
        if ((i12 & 2) != 0) {
            i11 = oCRCharacter.count;
        }
        if ((i12 & 4) != 0) {
            f5 = oCRCharacter.avgConfidence;
        }
        return oCRCharacter.copy(str, i11, f5);
    }

    public final String component1() {
        return this.f0char;
    }

    public final int component2() {
        return this.count;
    }

    public final float component3() {
        return this.avgConfidence;
    }

    public final OCRCharacter copy(String str, int i11, float f5) {
        m.f(str, "char");
        return new OCRCharacter(str, i11, f5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OCRCharacter)) {
            return false;
        }
        OCRCharacter oCRCharacter = (OCRCharacter) obj;
        return m.a(this.f0char, oCRCharacter.f0char) && this.count == oCRCharacter.count && Float.compare(this.avgConfidence, oCRCharacter.avgConfidence) == 0;
    }

    public final float getAvgConfidence() {
        return this.avgConfidence;
    }

    public final String getChar() {
        return this.f0char;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Float.hashCode(this.avgConfidence) + e.b(this.count, this.f0char.hashCode() * 31, 31);
    }

    public final void setAvgConfidence(float f5) {
        this.avgConfidence = f5;
    }

    public final void setCount(int i11) {
        this.count = i11;
    }

    public String toString() {
        String str = this.f0char;
        return p.h(this.avgConfidence, ")", e.q(this.count, "OCRCharacter(char=", str, ", count=", ", avgConfidence="));
    }

    public OCRCharacter(String str, int i11, float f5) {
        m.f(str, "char");
        this.f0char = str;
        this.count = i11;
        this.avgConfidence = f5;
    }

    public final void setChar(String str) {
        m.f(str, SemtNwfPgIhi.nGLZ);
        this.f0char = str;
    }

    public /* synthetic */ OCRCharacter(String str, int i11, float f5, int i12, f fVar) {
        this((i12 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? CropImageView.DEFAULT_ASPECT_RATIO : f5);
    }
}
