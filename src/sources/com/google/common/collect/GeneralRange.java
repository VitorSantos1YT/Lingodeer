package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class GeneralRange<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f16731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BoundType f16734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f16736f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BoundType f16737t;

    public GeneralRange(Comparator comparator, boolean z11, Object obj, BoundType boundType, boolean z12, Object obj2, BoundType boundType2) {
        comparator.getClass();
        this.f16731a = comparator;
        this.f16732b = z11;
        this.f16735e = z12;
        this.f16733c = obj;
        boundType.getClass();
        this.f16734d = boundType;
        this.f16736f = obj2;
        boundType2.getClass();
        this.f16737t = boundType2;
        if (z11) {
            comparator.compare(obj, obj);
        }
        if (z12) {
            comparator.compare(obj2, obj2);
        }
        if (z11 && z12) {
            int iCompare = comparator.compare(obj, obj2);
            Preconditions.h(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                Preconditions.g((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    public final boolean a(Object obj) {
        return (d(obj) || c(obj)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GeneralRange b(GeneralRange generalRange) {
        boolean z11;
        int iCompare;
        boolean z12;
        int iCompare2;
        Object obj;
        int iCompare3;
        BoundType boundType;
        boolean z13 = generalRange.f16735e;
        boolean z14 = generalRange.f16732b;
        BoundType boundType2 = generalRange.f16737t;
        Object obj2 = generalRange.f16736f;
        BoundType boundType3 = generalRange.f16734d;
        Object obj3 = generalRange.f16733c;
        Comparator comparator = generalRange.f16731a;
        Comparator comparator2 = this.f16731a;
        Preconditions.g(comparator2.equals(comparator));
        boolean z15 = this.f16732b;
        if (z15) {
            Object obj4 = this.f16733c;
            if (!z14 || ((iCompare = comparator2.compare(obj4, obj3)) >= 0 && !(iCompare == 0 && boundType3 == BoundType.OPEN))) {
                boundType3 = this.f16734d;
                z11 = z15;
                obj3 = obj4;
            } else {
                z11 = z15;
            }
        } else {
            z11 = z14;
        }
        boolean z16 = this.f16735e;
        if (z16) {
            Object obj5 = this.f16736f;
            if (!z13 || ((iCompare2 = comparator2.compare(obj5, obj2)) <= 0 && !(iCompare2 == 0 && boundType2 == BoundType.OPEN))) {
                boundType2 = this.f16737t;
                z12 = z16;
                obj2 = obj5;
            } else {
                z12 = z16;
            }
        } else {
            z12 = z13;
        }
        if (z11 && z12 && ((iCompare3 = comparator2.compare(obj3, obj2)) > 0 || (iCompare3 == 0 && boundType3 == (boundType = BoundType.OPEN) && boundType2 == boundType))) {
            boundType3 = BoundType.OPEN;
            boundType2 = BoundType.CLOSED;
            obj = obj2;
        } else {
            obj = obj3;
        }
        return new GeneralRange(this.f16731a, z11, obj, boundType3, z12, obj2, boundType2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(Object obj) {
        if (!this.f16735e) {
            return false;
        }
        int iCompare = this.f16731a.compare(obj, this.f16736f);
        return ((iCompare == 0) & (this.f16737t == BoundType.OPEN)) | (iCompare > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(Object obj) {
        if (!this.f16732b) {
            return false;
        }
        int iCompare = this.f16731a.compare(obj, this.f16733c);
        return ((iCompare == 0) & (this.f16734d == BoundType.OPEN)) | (iCompare < 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.f16731a.equals(generalRange.f16731a) && this.f16732b == generalRange.f16732b && this.f16735e == generalRange.f16735e && this.f16734d.equals(generalRange.f16734d) && this.f16737t.equals(generalRange.f16737t) && Objects.a(this.f16733c, generalRange.f16733c) && Objects.a(this.f16736f, generalRange.f16736f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16731a, this.f16733c, this.f16734d, this.f16736f, this.f16737t});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16731a);
        sb2.append(":");
        BoundType boundType = BoundType.CLOSED;
        sb2.append(this.f16734d == boundType ? '[' : '(');
        sb2.append(this.f16732b ? this.f16733c : "-∞");
        sb2.append(',');
        sb2.append(this.f16735e ? this.f16736f : "∞");
        sb2.append(this.f16737t == boundType ? ']' : ')');
        return sb2.toString();
    }
}
