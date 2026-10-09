package lw;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLong f40376d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40379c;

    public f0(String str, String str2, long j11) {
        Preconditions.k(str, "typeName");
        Preconditions.e("empty type", !str.isEmpty());
        this.f40377a = str;
        this.f40378b = str2;
        this.f40379c = j11;
    }

    public static f0 a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new f0(simpleName, str, f40376d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f40377a + "<" + this.f40379c + ">");
        String str = this.f40378b;
        if (str != null) {
            sb2.append(": (");
            sb2.append(str);
            sb2.append(')');
        }
        return sb2.toString();
    }
}
