package com.google.firebase.database;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DatabaseError {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f18959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f18960d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18962b;

    static {
        HashMap map = new HashMap();
        f18959c = map;
        map.put(-1, "The transaction needs to be run again with current data");
        map.put(-2, "The server indicated that this operation failed");
        map.put(-3, "This client does not have permission to perform this operation");
        map.put(-4, "The operation had to be aborted due to a network disconnect");
        map.put(-6, "The supplied auth token has expired");
        map.put(-7, "The supplied auth token was invalid");
        map.put(-8, "The transaction had too many retries");
        map.put(-9, "The transaction was overridden by a subsequent set");
        map.put(-10, "The service is unavailable");
        map.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        map.put(-24, "The operation could not be performed due to a network error");
        map.put(-25, "The write was canceled by the user.");
        map.put(-999, "An unknown error occurred");
        HashMap map2 = new HashMap();
        f18960d = map2;
        map2.put("datastale", -1);
        map2.put("failure", -2);
        map2.put("permission_denied", -3);
        map2.put("disconnected", -4);
        map2.put("expired_token", -6);
        map2.put("invalid_token", -7);
        map2.put("maxretries", -8);
        map2.put("overriddenbyset", -9);
        map2.put("unavailable", -10);
        map2.put("network_error", -24);
        map2.put("write_canceled", -25);
    }

    public DatabaseError(int i11, String str) {
        this.f18961a = i11;
        this.f18962b = str;
    }

    public static DatabaseError a(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return new DatabaseError(-11, ((String) f18959c.get(-11)) + stringWriter.toString());
    }

    public static DatabaseError b(String str, String str2) {
        Integer num = (Integer) f18960d.get(str.toLowerCase(Locale.US));
        if (num == null) {
            num = -999;
        }
        if (str2 == null) {
            str2 = (String) f18959c.get(num);
        }
        return new DatabaseError(num.intValue(), str2);
    }

    public final DatabaseException c() {
        return new DatabaseException("Firebase Database error: " + this.f18962b);
    }

    public final String toString() {
        return "DatabaseError: " + this.f18962b;
    }
}
