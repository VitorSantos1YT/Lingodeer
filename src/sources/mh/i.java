package mh;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;
import qy.j;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@c00.e
public final class i {
    public static final h Companion = new h();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qy.h[] f41134j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f41139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f41140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f41141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f41142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f41143i;

    static {
        j jVar = j.PUBLICATION;
        f41134j = new qy.h[]{null, null, null, null, com.bumptech.glide.d.u(jVar, new ju.d(15)), com.bumptech.glide.d.u(jVar, new ju.d(16)), com.bumptech.glide.d.u(jVar, new ju.d(17)), null, null};
    }

    public /* synthetic */ i(int i11, long j11, String str, String str2, String str3, b bVar, List list, f fVar, boolean z11, boolean z12) {
        this.f41135a = (i11 & 1) == 0 ? 0L : j11;
        if ((i11 & 2) == 0) {
            this.f41136b = BuildConfig.VERSION_NAME;
        } else {
            this.f41136b = str;
        }
        if ((i11 & 4) == 0) {
            this.f41137c = BuildConfig.VERSION_NAME;
        } else {
            this.f41137c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f41138d = BuildConfig.VERSION_NAME;
        } else {
            this.f41138d = str3;
        }
        if ((i11 & 16) == 0) {
            this.f41139e = b.BEGINNER_I;
        } else {
            this.f41139e = bVar;
        }
        if ((i11 & 32) == 0) {
            this.f41140f = r.f50854a;
        } else {
            this.f41140f = list;
        }
        if ((i11 & 64) == 0) {
            this.f41141g = f.NOT_STUDY;
        } else {
            this.f41141g = fVar;
        }
        if ((i11 & 128) == 0) {
            this.f41142h = false;
        } else {
            this.f41142h = z11;
        }
        if ((i11 & 256) == 0) {
            this.f41143i = false;
        } else {
            this.f41143i = z12;
        }
    }

    public static i a(i iVar, f fVar, boolean z11, boolean z12, int i11) {
        long j11 = iVar.f41135a;
        String title = iVar.f41136b;
        String translation = iVar.f41137c;
        String imageUrl = iVar.f41138d;
        b difficulty = iVar.f41139e;
        List category = iVar.f41140f;
        if ((i11 & 64) != 0) {
            fVar = iVar.f41141g;
        }
        f status = fVar;
        if ((i11 & 128) != 0) {
            z11 = iVar.f41142h;
        }
        boolean z13 = z11;
        if ((i11 & 256) != 0) {
            z12 = iVar.f41143i;
        }
        iVar.getClass();
        m.f(title, "title");
        m.f(translation, "translation");
        m.f(imageUrl, "imageUrl");
        m.f(difficulty, "difficulty");
        m.f(category, "category");
        m.f(status, "status");
        return new i(j11, title, translation, imageUrl, difficulty, category, status, z13, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f41135a == iVar.f41135a && m.a(this.f41136b, iVar.f41136b) && m.a(this.f41137c, iVar.f41137c) && m.a(this.f41138d, iVar.f41138d) && this.f41139e == iVar.f41139e && m.a(this.f41140f, iVar.f41140f) && this.f41141g == iVar.f41141g && this.f41142h == iVar.f41142h && this.f41143i == iVar.f41143i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41143i) + defpackage.e.e((this.f41141g.hashCode() + p0.b((this.f41139e.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(Long.hashCode(this.f41135a) * 31, 31, this.f41136b), 31, this.f41137c), 31, this.f41138d)) * 31, 31, this.f41140f)) * 31, 31, this.f41142h);
    }

    public final String toString() {
        StringBuilder sbP = e0.p(this.f41135a, "PdLessonModel(id=", ", title=", this.f41136b);
        com.google.android.material.datepicker.d.w(sbP, ", translation=", this.f41137c, ", imageUrl=", this.f41138d);
        sbP.append(", difficulty=");
        sbP.append(this.f41139e);
        sbP.append(", category=");
        sbP.append(this.f41140f);
        sbP.append(", status=");
        sbP.append(this.f41141g);
        sbP.append(", hasPurchased=");
        sbP.append(this.f41142h);
        sbP.append(", isBookmarked=");
        sbP.append(this.f41143i);
        sbP.append(")");
        return sbP.toString();
    }

    public i(long j11, String str, String str2, String imageUrl, b difficulty, List category, f status, boolean z11, boolean z12) {
        m.f(imageUrl, "imageUrl");
        m.f(difficulty, "difficulty");
        m.f(category, "category");
        m.f(status, "status");
        this.f41135a = j11;
        this.f41136b = str;
        this.f41137c = str2;
        this.f41138d = imageUrl;
        this.f41139e = difficulty;
        this.f41140f = category;
        this.f41141g = status;
        this.f41142h = z11;
        this.f41143i = z12;
    }
}
