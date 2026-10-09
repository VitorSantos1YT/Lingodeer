package n3;

import com.google.logging.type.LogSeverity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Comparable {
    public static final s H;
    public static final s K;
    public static final s L;
    public static final s M;
    public static final s N;
    public static final List O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f43173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f43174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f43175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f43176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f43177f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f43178t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43179a;

    static {
        s sVar = new s(100);
        s sVar2 = new s(200);
        s sVar3 = new s(LogSeverity.NOTICE_VALUE);
        s sVar4 = new s(400);
        f43173b = sVar4;
        s sVar5 = new s(500);
        f43174c = sVar5;
        s sVar6 = new s(600);
        f43175d = sVar6;
        s sVar7 = new s(LogSeverity.ALERT_VALUE);
        s sVar8 = new s(LogSeverity.EMERGENCY_VALUE);
        s sVar9 = new s(900);
        f43176e = sVar2;
        f43177f = sVar3;
        f43178t = sVar4;
        H = sVar5;
        K = sVar6;
        L = sVar7;
        M = sVar8;
        N = sVar9;
        O = ns.o.L(sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9);
    }

    public s(int i11) {
        this.f43179a = i11;
        boolean z11 = false;
        if (1 <= i11 && i11 < 1001) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        p3.a.a("Font weight can be in range [1, 1000]. Current value: " + i11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s sVar) {
        return kotlin.jvm.internal.m.h(this.f43179a, sVar.f43179a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f43179a == ((s) obj).f43179a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43179a;
    }

    public final String toString() {
        return ep.a.j(new StringBuilder("FontWeight(weight="), this.f43179a, ')');
    }
}
