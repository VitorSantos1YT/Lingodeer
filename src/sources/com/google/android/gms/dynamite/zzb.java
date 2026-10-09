package com.google.android.gms.dynamite;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f9211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f9212b;

    /* JADX WARN: Code duplicated, block: B:53:0x00a4 A[Catch: all -> 0x00a0, PHI: r1
      0x00a4: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v18 java.lang.Thread) binds: [B:7:0x000a, B:47:0x009d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x009b, B:61:0x00c3, B:12:0x001f, B:52:0x00a3, B:53:0x00a4, B:64:0x00c7, B:65:0x00c8, B:54:0x00a5, B:60:0x00c2, B:59:0x00af, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x0099, B:18:0x003c), top: B:70:0x0003, inners: #3, #6 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader a() {
        SecurityException e8;
        Thread thread;
        ThreadGroup threadGroup;
        if (f9211a == null) {
            Thread thread2 = f9212b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f9212b.getContextClassLoader();
                    } catch (SecurityException e10) {
                        new StringBuilder(String.valueOf(e10.getMessage()).length() + 41);
                    }
                }
                f9211a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i11 = 0;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i12];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i12++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i11 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i11];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (thread == null) {
                                    try {
                                        zza zzaVar = new zza(threadGroup, "GmsDynamite");
                                        try {
                                            zzaVar.setContextClassLoader(null);
                                            zzaVar.start();
                                            thread = zzaVar;
                                        } catch (SecurityException e11) {
                                            e8 = e11;
                                            thread = zzaVar;
                                            new StringBuilder(String.valueOf(e8.getMessage()).length() + 39);
                                        }
                                    } catch (SecurityException e12) {
                                        e8 = e12;
                                    }
                                }
                            } catch (SecurityException e13) {
                                e8 = e13;
                                thread = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    thread2 = thread;
                }
                f9212b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f9212b.getContextClassLoader();
                    }
                }
                f9211a = contextClassLoader;
            }
        }
        return f9211a;
    }
}
