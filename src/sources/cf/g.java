package cf;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.y;
import lf.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f6916a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f6917b = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:24:0x0036 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #5 {, blocks: (B:16:0x0024, B:24:0x0036, B:22:0x0031, B:19:0x002d), top: B:91:0x0024, outer: #2, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x005f A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #3 {, blocks: (B:39:0x004d, B:47:0x005f, B:45:0x005a, B:42:0x0056), top: B:87:0x004d, outer: #2, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0070 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #2 {all -> 0x0041, blocks: (B:8:0x000d, B:12:0x0017, B:14:0x0021, B:15:0x0023, B:28:0x003d, B:29:0x003e, B:56:0x006c, B:58:0x0070, B:61:0x0076, B:63:0x007f, B:71:0x0095, B:73:0x0099, B:69:0x008f, B:74:0x00a9, B:34:0x0045, B:35:0x0046, B:37:0x004a, B:38:0x004c, B:51:0x0066, B:52:0x0067, B:55:0x006b, B:39:0x004d, B:47:0x005f, B:45:0x005a, B:16:0x0024, B:24:0x0036, B:22:0x0031, B:66:0x008b), top: B:86:0x000d, outer: #1, inners: #3, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0076 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #2 {all -> 0x0041, blocks: (B:8:0x000d, B:12:0x0017, B:14:0x0021, B:15:0x0023, B:28:0x003d, B:29:0x003e, B:56:0x006c, B:58:0x0070, B:61:0x0076, B:63:0x007f, B:71:0x0095, B:73:0x0099, B:69:0x008f, B:74:0x00a9, B:34:0x0045, B:35:0x0046, B:37:0x004a, B:38:0x004c, B:51:0x0066, B:52:0x0067, B:55:0x006b, B:39:0x004d, B:47:0x005f, B:45:0x005a, B:16:0x0024, B:24:0x0036, B:22:0x0031, B:66:0x008b), top: B:86:0x000d, outer: #1, inners: #3, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x007f A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #2 {all -> 0x0041, blocks: (B:8:0x000d, B:12:0x0017, B:14:0x0021, B:15:0x0023, B:28:0x003d, B:29:0x003e, B:56:0x006c, B:58:0x0070, B:61:0x0076, B:63:0x007f, B:71:0x0095, B:73:0x0099, B:69:0x008f, B:74:0x00a9, B:34:0x0045, B:35:0x0046, B:37:0x004a, B:38:0x004c, B:51:0x0066, B:52:0x0067, B:55:0x006b, B:39:0x004d, B:47:0x005f, B:45:0x005a, B:16:0x0024, B:24:0x0036, B:22:0x0031, B:66:0x008b), top: B:86:0x000d, outer: #1, inners: #3, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0089  */
    /* JADX WARN: Code duplicated, block: B:71:0x0095 A[Catch: all -> 0x0041, TryCatch #2 {all -> 0x0041, blocks: (B:8:0x000d, B:12:0x0017, B:14:0x0021, B:15:0x0023, B:28:0x003d, B:29:0x003e, B:56:0x006c, B:58:0x0070, B:61:0x0076, B:63:0x007f, B:71:0x0095, B:73:0x0099, B:69:0x008f, B:74:0x00a9, B:34:0x0045, B:35:0x0046, B:37:0x004a, B:38:0x004c, B:51:0x0066, B:52:0x0067, B:55:0x006b, B:39:0x004d, B:47:0x005f, B:45:0x005a, B:16:0x0024, B:24:0x0036, B:22:0x0031, B:66:0x008b), top: B:86:0x000d, outer: #1, inners: #3, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00a9 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #2 {all -> 0x0041, blocks: (B:8:0x000d, B:12:0x0017, B:14:0x0021, B:15:0x0023, B:28:0x003d, B:29:0x003e, B:56:0x006c, B:58:0x0070, B:61:0x0076, B:63:0x007f, B:71:0x0095, B:73:0x0099, B:69:0x008f, B:74:0x00a9, B:34:0x0045, B:35:0x0046, B:37:0x004a, B:38:0x004c, B:51:0x0066, B:52:0x0067, B:55:0x006b, B:39:0x004d, B:47:0x005f, B:45:0x005a, B:16:0x0024, B:24:0x0036, B:22:0x0031, B:66:0x008b), top: B:86:0x000d, outer: #1, inners: #3, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final synchronized void b(Context context, v vVar) {
        boolean z11;
        if (qf.a.b(g.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f6917b;
            if (atomicBoolean.get()) {
                return;
            }
            y yVar = new y();
            Object objA = null;
            if (vVar == v.V2_V4) {
                synchronized (n.f6932l) {
                    if (!qf.a.b(n.class)) {
                        try {
                            objA = n.m;
                        } catch (Throwable th2) {
                            qf.a.a(n.class, th2);
                        }
                        if (objA == null) {
                            objA = r.c(context);
                        }
                    } else if (objA == null) {
                        objA = r.c(context);
                    }
                }
                yVar.f38361a = objA;
                if (yVar.f38361a == null) {
                    atomicBoolean.set(true);
                    return;
                }
                if (a0.b(lf.x.AndroidIAPSubscriptionAutoLogging)) {
                    df.f fVar = df.f.f23400a;
                    if (qf.a.b(df.f.class)) {
                        z11 = false;
                    } else {
                        try {
                            z11 = df.f.f23401b;
                        } catch (Throwable th3) {
                            qf.a.a(df.f.class, th3);
                            z11 = false;
                        }
                    }
                    if (z11 || vVar == v.V2_V4) {
                        ((h) yVar.f38361a).a(w.INAPP, new androidx.fragment.app.d(yVar, vVar, context, 2));
                    } else {
                        ((h) yVar.f38361a).a(w.INAPP, new f(vVar, context, 0));
                    }
                } else {
                    ((h) yVar.f38361a).a(w.INAPP, new f(vVar, context, 0));
                }
                return;
            }
            if (vVar != v.V5_V7) {
                if (yVar.f38361a == null) {
                    atomicBoolean.set(true);
                    return;
                }
                if (a0.b(lf.x.AndroidIAPSubscriptionAutoLogging)) {
                    df.f fVar2 = df.f.f23400a;
                    if (qf.a.b(df.f.class)) {
                        z11 = false;
                    } else {
                        z11 = df.f.f23401b;
                    }
                    if (z11) {
                    }
                    ((h) yVar.f38361a).a(w.INAPP, new androidx.fragment.app.d(yVar, vVar, context, 2));
                } else {
                    ((h) yVar.f38361a).a(w.INAPP, new f(vVar, context, 0));
                }
                return;
            }
            l lVar = o.G;
            synchronized (lVar) {
                if (!qf.a.b(o.class)) {
                    try {
                        objA = o.I;
                    } catch (Throwable th4) {
                        qf.a.a(o.class, th4);
                    }
                    if (objA == null) {
                        objA = lVar.a(context);
                    }
                } else if (objA == null) {
                    objA = lVar.a(context);
                }
            }
            yVar.f38361a = objA;
            if (yVar.f38361a == null) {
                atomicBoolean.set(true);
                return;
            }
            if (a0.b(lf.x.AndroidIAPSubscriptionAutoLogging)) {
                df.f fVar3 = df.f.f23400a;
                if (qf.a.b(df.f.class)) {
                    z11 = false;
                } else {
                    z11 = df.f.f23401b;
                }
                if (z11) {
                }
                ((h) yVar.f38361a).a(w.INAPP, new androidx.fragment.app.d(yVar, vVar, context, 2));
            } else {
                ((h) yVar.f38361a).a(w.INAPP, new f(vVar, context, 0));
            }
            return;
            throw th;
        } catch (Throwable th5) {
            qf.a.a(g.class, th5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a(v vVar, String str) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        ConcurrentHashMap concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5;
        if (qf.a.b(this)) {
            return;
        }
        try {
            boolean z11 = false;
            if (!qf.a.b(r.class)) {
                try {
                    z11 = !re.s.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
                } catch (Throwable th2) {
                    qf.a.a(r.class, th2);
                }
            }
            boolean z12 = z11;
            if (z12) {
                r.j();
            }
            if (vVar == v.V2_V4) {
                r rVar = n.f6932l;
                r.f(r.g(), r.h(), false, str, vVar, z12);
                r.f(r.i(), r.h(), true, str, vVar, z12);
                r.g().clear();
                r.i().clear();
            } else {
                l lVar = o.G;
                ConcurrentHashMap concurrentHashMap6 = null;
                if (qf.a.b(o.class)) {
                    concurrentHashMap = null;
                    if (qf.a.b(o.class)) {
                        concurrentHashMap2 = null;
                        r.f(concurrentHashMap, concurrentHashMap2, false, str, vVar, z12);
                        if (qf.a.b(o.class)) {
                            concurrentHashMap3 = null;
                            if (qf.a.b(o.class)) {
                                concurrentHashMap4 = null;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        try {
                                            concurrentHashMap6 = o.K;
                                        } catch (Throwable th3) {
                                            qf.a.a(o.class, th3);
                                        }
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    try {
                                        concurrentHashMap5 = o.J;
                                    } catch (Throwable th4) {
                                        qf.a.a(o.class, th4);
                                        concurrentHashMap5 = null;
                                    }
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                try {
                                    concurrentHashMap4 = o.L;
                                } catch (Throwable th5) {
                                    qf.a.a(o.class, th5);
                                    concurrentHashMap4 = null;
                                }
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            try {
                                concurrentHashMap3 = o.K;
                            } catch (Throwable th6) {
                                qf.a.a(o.class, th6);
                                concurrentHashMap3 = null;
                            }
                            if (qf.a.b(o.class)) {
                                concurrentHashMap4 = null;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = o.L;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    } else {
                        try {
                            concurrentHashMap2 = o.L;
                        } catch (Throwable th7) {
                            qf.a.a(o.class, th7);
                            concurrentHashMap2 = null;
                        }
                        r.f(concurrentHashMap, concurrentHashMap2, false, str, vVar, z12);
                        if (qf.a.b(o.class)) {
                            concurrentHashMap3 = null;
                            if (qf.a.b(o.class)) {
                                concurrentHashMap4 = null;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = o.L;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            concurrentHashMap3 = o.K;
                            if (qf.a.b(o.class)) {
                                concurrentHashMap4 = null;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = o.L;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    }
                } else {
                    try {
                        concurrentHashMap = o.J;
                    } catch (Throwable th8) {
                        qf.a.a(o.class, th8);
                        concurrentHashMap = null;
                    }
                    if (qf.a.b(o.class)) {
                        concurrentHashMap2 = null;
                        r.f(concurrentHashMap, concurrentHashMap2, false, str, vVar, z12);
                        if (qf.a.b(o.class)) {
                            concurrentHashMap3 = null;
                            if (qf.a.b(o.class)) {
                                concurrentHashMap4 = null;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = o.L;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            concurrentHashMap3 = o.K;
                            if (qf.a.b(o.class)) {
                                concurrentHashMap4 = null;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = o.L;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    } else {
                        concurrentHashMap2 = o.L;
                        r.f(concurrentHashMap, concurrentHashMap2, false, str, vVar, z12);
                        if (qf.a.b(o.class)) {
                            concurrentHashMap3 = null;
                            if (qf.a.b(o.class)) {
                                concurrentHashMap4 = null;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = o.L;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            concurrentHashMap3 = o.K;
                            if (qf.a.b(o.class)) {
                                concurrentHashMap4 = null;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = o.L;
                                r.f(concurrentHashMap3, concurrentHashMap4, true, str, vVar, z12);
                                if (qf.a.b(o.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = o.J;
                                    concurrentHashMap5.clear();
                                    if (!qf.a.b(o.class)) {
                                        concurrentHashMap6 = o.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    }
                }
            }
            if (z12) {
                r.k();
            }
        } catch (Throwable th9) {
            qf.a.a(this, th9);
        }
    }
}
