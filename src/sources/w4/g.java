package w4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.recyclerview.widget.p2;
import gb.r;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m0.u;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2 f54641a = new p2(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f54642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f54643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f54644d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new vd.a(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f54642b = threadPoolExecutor;
        f54643c = new Object();
        f54644d = new t0(0);
    }

    public static String a(int i11, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < list.size(); i12++) {
            sb2.append(((d) list.get(i12)).f54633e);
            sb2.append("-");
            sb2.append(i11);
            if (i12 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static f b(String str, Context context, List list, int i11) {
        int i12;
        Typeface typefaceI;
        p2 p2Var = f54641a;
        Trace.beginSection(v10.c.L("getFontSync"));
        try {
            Typeface typeface = (Typeface) p2Var.j(str);
            if (typeface != null) {
                f fVar = new f(typeface);
                Trace.endSection();
                return fVar;
            }
            try {
                u uVarA = b.a(context, list);
                List list2 = uVarA.f40634b;
                int i13 = uVarA.f40633a;
                if (i13 == 0) {
                    h[] hVarArr = (h[]) list2.get(0);
                    if (hVarArr == null || hVarArr.length == 0) {
                        i12 = 1;
                    } else {
                        int length = hVarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                i12 = 0;
                                break;
                            }
                            int i15 = hVarArr[i14].f54649e;
                            if (i15 != 0) {
                                if (i15 >= 0) {
                                    i12 = i15;
                                    break;
                                }
                                i12 = -3;
                                break;
                            }
                            i14++;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        i12 = -3;
                        break;
                    }
                    i12 = -2;
                }
                if (i12 != 0) {
                    f fVar2 = new f(i12);
                    Trace.endSection();
                    return fVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    h[] hVarArr2 = (h[]) list2.get(0);
                    r rVar = r4.g.f48800a;
                    Trace.beginSection(v10.c.L("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceI = r4.g.f48800a.i(context, hVarArr2, i11);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } else {
                    r rVar2 = r4.g.f48800a;
                    Trace.beginSection(v10.c.L("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceI = r4.g.f48800a.j(context, list2, i11);
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                if (typefaceI == null) {
                    f fVar3 = new f(-3);
                    Trace.endSection();
                    return fVar3;
                }
                p2Var.q(str, typefaceI);
                f fVar4 = new f(typefaceI);
                Trace.endSection();
                return fVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                f fVar5 = new f(-1);
                Trace.endSection();
                return fVar5;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }
}
