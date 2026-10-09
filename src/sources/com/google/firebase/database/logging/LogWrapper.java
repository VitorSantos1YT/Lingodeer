package com.google.firebase.database.logging;

import defpackage.e;
import ep.a;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LogWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f19506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19508c;

    public LogWrapper(Logger logger, String str, String str2) {
        this.f19506a = logger;
        this.f19507b = str;
        this.f19508c = str2;
    }

    public final void a(String str, Throwable th2, Object... objArr) {
        if (c()) {
            String strD = d(str, objArr);
            if (th2 != null) {
                StringBuilder sbR = e.r(strD, "\n");
                StringWriter stringWriter = new StringWriter();
                th2.printStackTrace(new PrintWriter(stringWriter));
                sbR.append(stringWriter.toString());
                strD = sbR.toString();
            }
            Logger.Level level = Logger.Level.DEBUG;
            String str2 = this.f19507b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f19506a.a(level, str2, strD, jCurrentTimeMillis);
        }
    }

    public final void b(String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(str, new Object[0]));
        sb2.append("\n");
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        sb2.append(stringWriter.toString());
        String string = sb2.toString();
        this.f19506a.a(Logger.Level.ERROR, this.f19507b, string, System.currentTimeMillis());
    }

    public final boolean c() {
        return this.f19506a.b().ordinal() <= Logger.Level.DEBUG.ordinal();
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        String str2 = this.f19508c;
        return str2 == null ? str : a.D(str2, " - ", str);
    }

    public final void e(String str) {
        String strD = d(str, new Object[0]);
        this.f19506a.a(Logger.Level.WARN, this.f19507b, strD, System.currentTimeMillis());
    }
}
