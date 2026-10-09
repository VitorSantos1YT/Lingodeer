package bv;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import g00.d1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class z {
    public static final y Companion = new y();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qy.h[] f6379e = {null, null, null, com.bumptech.glide.d.u(qy.j.PUBLICATION, new bq.u(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6383d;

    public /* synthetic */ z(int i11, String str, int i12, int i13, List list) {
        if (15 != (i11 & 15)) {
            d1.k(i11, 15, x.f6375a.getDescriptor());
            throw null;
        }
        this.f6380a = str;
        this.f6381b = i12;
        this.f6382c = i13;
        this.f6383d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.m.a(this.f6380a, zVar.f6380a) && this.f6381b == zVar.f6381b && this.f6382c == zVar.f6382c && kotlin.jvm.internal.m.a(this.f6383d, zVar.f6383d);
    }

    public final int hashCode() {
        return this.f6383d.hashCode() + defpackage.e.b(this.f6382c, defpackage.e.b(this.f6381b, this.f6380a.hashCode() * 31, 31), 31);
    }

    public z(String str, int i11, int i12, List list) {
        this.f6380a = str;
        this.f6381b = i11;
        this.f6382c = i12;
        this.f6383d = list;
    }

    public final String toString() {
        StringBuilder sbQ = defpackage.e.q(this.f6381b, "SimpleToneResult(targetPinyin=", this.f6380a, ", targetTone=", ", overallScore=");
        sbQ.append(this.f6382c);
        sbQ.append(", subDetails=");
        sbQ.append(this.f6383d);
        sbQ.append(scqhIrGXy.PsXVBxiU);
        return sbQ.toString();
    }
}
