package com.bumptech.glide.load.engine;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import td.a;
import td.g;
import vd.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final StackTraceElement[] f7679f = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f7681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f7682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Class f7683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7684e;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th2, ArrayList arrayList) {
        if (th2 instanceof GlideException) {
            Iterator it = ((GlideException) th2).f7680a.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
        } else if (th2 != null) {
            arrayList.add(th2);
        }
    }

    public static void b(List list, x xVar) throws IOException {
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            xVar.append("Cause (");
            int i12 = i11 + 1;
            xVar.append(String.valueOf(i12));
            xVar.append(" of ");
            xVar.append(String.valueOf(size));
            xVar.append("): ");
            Throwable th2 = (Throwable) list.get(i11);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).d(xVar);
            } else {
                c(th2, xVar);
            }
            i11 = i12;
        }
    }

    public static void c(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void d(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f7680a, new x(appendable));
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f7684e);
        Class cls = this.f7683d;
        String str3 = BuildConfig.VERSION_NAME;
        if (cls != null) {
            str = ", " + this.f7683d;
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        sb2.append(str);
        if (this.f7682c != null) {
            str2 = ", " + this.f7682c;
        } else {
            str2 = BuildConfig.VERSION_NAME;
        }
        sb2.append(str2);
        if (this.f7681b != null) {
            str3 = ", " + this.f7681b;
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Throwable th2 = (Throwable) obj;
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        d(System.err);
    }

    public GlideException(String str, List list) {
        this.f7684e = str;
        setStackTrace(f7679f);
        this.f7680a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        d(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        d(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
