package ps;

import b7.e0;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f47126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f47127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f47128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f47129h;

    public static b a(b bVar, h hVar, float f5, boolean z11, int i11) {
        long j11 = bVar.f47122a;
        String unitName = bVar.f47123b;
        String description = bVar.f47124c;
        int i12 = bVar.f47125d;
        List list = bVar.f47126e;
        if ((i11 & 32) != 0) {
            hVar = bVar.f47127f;
        }
        h offlineStatus = hVar;
        if ((i11 & 64) != 0) {
            f5 = bVar.f47128g;
        }
        float f11 = f5;
        bVar.getClass();
        if ((i11 & 256) != 0) {
            z11 = bVar.f47129h;
        }
        bVar.getClass();
        m.f(unitName, "unitName");
        m.f(description, "description");
        m.f(offlineStatus, "offlineStatus");
        return new b(j11, unitName, description, i12, list, offlineStatus, f11, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f47122a == bVar.f47122a && m.a(this.f47123b, bVar.f47123b) && m.a(this.f47124c, bVar.f47124c) && this.f47125d == bVar.f47125d && this.f47126e.equals(bVar.f47126e) && m.a(this.f47127f, bVar.f47127f) && Float.compare(this.f47128g, bVar.f47128g) == 0 && this.f47129h == bVar.f47129h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f47129h) + defpackage.e.f(0L, defpackage.e.a((this.f47127f.hashCode() + p0.b(defpackage.e.b(this.f47125d, defpackage.e.d(defpackage.e.d(Long.hashCode(this.f47122a) * 31, 31, this.f47123b), 31, this.f47124c), 31), 31, this.f47126e)) * 31, this.f47128g, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = e0.p(this.f47122a, "OfflineUnitUiModel(unitId=", ", unitName=", this.f47123b);
        sbP.append(", description=");
        sbP.append(this.f47124c);
        sbP.append(", lessonCount=");
        sbP.append(this.f47125d);
        sbP.append(", lessonIds=");
        sbP.append(this.f47126e);
        sbP.append(", offlineStatus=");
        sbP.append(this.f47127f);
        sbP.append(", downloadProgress=");
        sbP.append(this.f47128g);
        sbP.append(", sizeInBytes=0, isSelected=");
        sbP.append(this.f47129h);
        sbP.append(")");
        return sbP.toString();
    }

    public b(long j11, String unitName, String str, int i11, List list, h offlineStatus, float f5, boolean z11) {
        m.f(unitName, "unitName");
        m.f(str, gkbGsXmgaxRjJ.QpyvpKqQzN);
        m.f(offlineStatus, "offlineStatus");
        this.f47122a = j11;
        this.f47123b = unitName;
        this.f47124c = str;
        this.f47125d = i11;
        this.f47126e = list;
        this.f47127f = offlineStatus;
        this.f47128g = f5;
        this.f47129h = z11;
    }
}
