package vs;

import com.lingodeer.course.smarttips.data.model.TextType;
import hh.p0;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextType f54168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54170c;

    public k(TextType textType, boolean z11) {
        int iHashCode = UUID.randomUUID().hashCode();
        this.f54168a = textType;
        this.f54169b = z11;
        this.f54170c = iHashCode;
    }

    @Override // vs.m
    public final int a() {
        return this.f54170c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.f54168a, kVar.f54168a) && this.f54169b == kVar.f54169b && this.f54170c == kVar.f54170c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54170c) + defpackage.e.e(this.f54168a.hashCode() * 31, 31, this.f54169b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Text(textType=");
        sb2.append(this.f54168a);
        sb2.append(", isHeader=");
        sb2.append(this.f54169b);
        sb2.append(", id=");
        return p0.i(this.f54170c, ")", sb2);
    }
}
