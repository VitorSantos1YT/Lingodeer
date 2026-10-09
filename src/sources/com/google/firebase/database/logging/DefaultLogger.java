package com.google.firebase.database.logging;

import java.util.Date;
import java.util.HashSet;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DefaultLogger implements Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f19503a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger.Level f19504b;

    /* JADX INFO: renamed from: com.google.firebase.database.logging.DefaultLogger$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19505a;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            f19505a = iArr;
            try {
                iArr[Logger.Level.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19505a[Logger.Level.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19505a[Logger.Level.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19505a[Logger.Level.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public DefaultLogger(Logger.Level level) {
        this.f19504b = level;
    }

    @Override // com.google.firebase.database.logging.Logger
    public final void a(Logger.Level level, String str, String str2, long j11) {
        HashSet hashSet;
        if (level.ordinal() < this.f19504b.ordinal() || !((hashSet = this.f19503a) == null || level.ordinal() > Logger.Level.DEBUG.ordinal() || hashSet.contains(str))) {
            return;
        }
        String strC = c(level, str, str2, j11);
        int i11 = AnonymousClass1.f19505a[level.ordinal()];
        if (i11 == 1) {
            e(strC);
            return;
        }
        if (i11 == 2) {
            g(strC);
        } else if (i11 == 3) {
            f(strC);
        } else {
            if (i11 != 4) {
                throw new RuntimeException("Should not reach here!");
            }
            d(strC);
        }
    }

    @Override // com.google.firebase.database.logging.Logger
    public final Logger.Level b() {
        return this.f19504b;
    }

    public String c(Logger.Level level, String str, String str2, long j11) {
        Date date = new Date(j11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(date.toString());
        sb2.append(" [");
        sb2.append(level);
        sb2.append("] ");
        return p.u(sb2, str, ": ", str2);
    }

    public void d(String str) {
        System.out.println(str);
    }

    public void e(String str) {
        System.err.println(str);
    }

    public void f(String str) {
        System.out.println(str);
    }

    public void g(String str) {
        System.out.println(str);
    }
}
