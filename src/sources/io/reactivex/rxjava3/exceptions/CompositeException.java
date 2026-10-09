package io.reactivex.rxjava3.exceptions;

import com.bumptech.glide.g;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import sx.a;
import sx.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f34546c;

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(g gVar, Throwable th2, String str) {
        gVar.e(str).e(th2).e('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            gVar.e("\t\tat ").e(stackTraceElement).e('\n');
        }
        if (th2.getCause() != null) {
            gVar.e("\tCaused by: ");
            a(gVar, th2.getCause(), BuildConfig.VERSION_NAME);
        }
    }

    public final void b(g gVar) {
        gVar.e(this).e("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            gVar.e("\tat ").e(stackTraceElement).e("\n");
        }
        int i11 = 1;
        for (Throwable th2 : this.f34544a) {
            gVar.e("  ComposedException ").e(Integer.valueOf(i11)).e(" :\n");
            a(gVar, th2, "\t");
            i11++;
        }
        gVar.e("\n");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        int i11;
        try {
            if (this.f34546c == null) {
                String property = System.getProperty("line.separator");
                if (this.f34544a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Multiple exceptions (");
                    sb2.append(this.f34544a.size());
                    sb2.append(")");
                    sb2.append(property);
                    for (Throwable cause : this.f34544a) {
                        int i12 = 0;
                        while (cause != null) {
                            for (int i13 = 0; i13 < i12; i13++) {
                                sb2.append("  ");
                            }
                            sb2.append("|-- ");
                            sb2.append(cause.getClass().getCanonicalName());
                            sb2.append(": ");
                            String message = cause.getMessage();
                            if (message == null || !message.contains(property)) {
                                sb2.append(message);
                                sb2.append(property);
                            } else {
                                sb2.append(property);
                                for (String str : message.split(property)) {
                                    for (int i14 = 0; i14 < i12 + 2; i14++) {
                                        sb2.append("  ");
                                    }
                                    sb2.append(str);
                                    sb2.append(property);
                                }
                            }
                            int i15 = 0;
                            while (true) {
                                i11 = i12 + 2;
                                if (i15 >= i11) {
                                    break;
                                }
                                sb2.append("  ");
                                i15++;
                            }
                            StackTraceElement[] stackTrace = cause.getStackTrace();
                            if (stackTrace.length > 0) {
                                sb2.append("at ");
                                sb2.append(stackTrace[0]);
                                sb2.append(property);
                            }
                            if (identityHashMap.containsKey(cause)) {
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null) {
                                    break;
                                }
                                for (int i16 = 0; i16 < i11; i16++) {
                                    sb2.append("  ");
                                }
                                sb2.append("|-- ");
                                sb2.append("(cause not expanded again) ");
                                sb2.append(cause2.getClass().getCanonicalName());
                                sb2.append(": ");
                                sb2.append(cause2.getMessage());
                                sb2.append(property);
                                break;
                            }
                            identityHashMap.put(cause, Boolean.TRUE);
                            cause = cause.getCause();
                            i12++;
                        }
                    }
                    this.f34546c = new a(sb2.toString().trim());
                } else {
                    this.f34546c = (Throwable) this.f34544a.get(0);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f34546c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f34545b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new b(printStream, 0));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).f34544a);
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f34544a = listUnmodifiableList;
            this.f34545b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new b(printWriter, 1));
    }
}
