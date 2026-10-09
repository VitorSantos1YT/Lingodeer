package r4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import androidx.recyclerview.widget.p2;
import aw.t;
import com.android.billingclient.api.a0;
import com.android.billingclient.api.b0;
import gb.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o20.w;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f48800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p2 f48801b;

    static {
        Trace.beginSection(v10.c.L("TypefaceCompat static init"));
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            f48800a = new l();
        } else if (i11 >= 28) {
            f48800a = new k();
        } else if (i11 >= 26) {
            f48800a = new j();
        } else if (i.f48809c != null) {
            f48800a = new i();
        } else {
            f48800a = new h();
        }
        f48801b = new p2(16);
        Trace.endSection();
    }

    public static String b(Resources resources, int i11, String str, int i12, int i13) {
        return resources.getResourcePackageName(i11) + '-' + str + '-' + i12 + '-' + i11 + '-' + i13;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    public static Typeface a(Context context, q4.c cVar, Resources resources, int i11, String str, int i12, int i13, q4.a aVar, boolean z11) {
        Typeface typefaceH;
        Typeface typefaceCreate;
        List listUnmodifiableList;
        int i14 = 1;
        if (cVar instanceof q4.f) {
            q4.f fVar = (q4.f) cVar;
            String str2 = fVar.f47441e;
            Typeface typeface = null;
            boolean z12 = false;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new pb.b(i14, aVar, typefaceCreate));
                }
                return typefaceCreate;
            }
            boolean z13 = !z11 ? aVar != null : fVar.f47440d != 0;
            int i15 = z11 ? fVar.f47439c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            w wVar = new w(18);
            wVar.f44617b = aVar;
            w4.d dVar = fVar.f47438b;
            int i16 = 2;
            if (dVar != null) {
                Object[] objArr = {fVar.f47437a, dVar};
                ArrayList arrayList = new ArrayList(2);
                for (int i17 = 0; i17 < 2; i17++) {
                    Object obj = objArr[i17];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                Object[] objArr2 = {fVar.f47437a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            int i18 = 3;
            o20.a aVar2 = new o20.a(handler, 3);
            qp.b bVar = new qp.b(8, wVar, aVar2);
            int i19 = 22;
            if (!z13) {
                String strA = w4.g.a(i13, listUnmodifiableList);
                Typeface typeface2 = (Typeface) w4.g.f54641a.j(strA);
                if (typeface2 != null) {
                    aVar2.execute(new t(wVar, typeface2, z12, i19));
                    typeface = typeface2;
                } else {
                    a0 a0Var = new a0(bVar, i16);
                    synchronized (w4.g.f54643c) {
                        try {
                            t0 t0Var = w4.g.f54644d;
                            ArrayList arrayList3 = (ArrayList) t0Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(a0Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(a0Var);
                                t0Var.put(strA, arrayList4);
                                w4.e eVar = new w4.e(strA, context, listUnmodifiableList, i13, 1);
                                ThreadPoolExecutor threadPoolExecutor = w4.g.f54642b;
                                a0 a0Var2 = new a0(strA, i18);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                b0 b0Var = new b0();
                                b0Var.f7463b = eVar;
                                b0Var.f7464c = a0Var2;
                                b0Var.f7465d = handler2;
                                threadPoolExecutor.execute(b0Var);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } else {
                if (listUnmodifiableList.size() > 1) {
                    throw new IllegalArgumentException(IMCc.alXbfQwfpN);
                }
                w4.d dVar2 = (w4.d) listUnmodifiableList.get(0);
                p2 p2Var = w4.g.f54641a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{dVar2}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String strA2 = w4.g.a(i13, Collections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) w4.g.f54641a.j(strA2);
                if (typeface3 != null) {
                    aVar2.execute(new t(wVar, typeface3, z12, i19));
                    typeface = typeface3;
                } else if (i15 == -1) {
                    Object[] objArr3 = {dVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    w4.f fVarB = w4.g.b(strA2, context, Collections.unmodifiableList(arrayList6), i13);
                    bVar.b(fVarB);
                    typeface = fVarB.f54639a;
                } else {
                    try {
                        try {
                            w4.f fVar2 = (w4.f) w4.g.f54642b.submit(new w4.e(strA2, context, dVar2, i13, 0)).get(i15, TimeUnit.MILLISECONDS);
                            bVar.b(fVar2);
                            typeface = fVar2.f54639a;
                        } catch (InterruptedException e8) {
                            throw e8;
                        } catch (ExecutionException e10) {
                            throw new RuntimeException(e10);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((o20.a) bVar.f47833c).execute(new v5.h((w) bVar.f47832b, -3));
                    }
                }
            }
            typefaceH = typeface;
        } else {
            typefaceH = f48800a.h(context, (q4.d) cVar, resources, i13);
            if (aVar != null) {
                if (typefaceH != null) {
                    new Handler(Looper.getMainLooper()).post(new pb.b(i14, aVar, typefaceH));
                } else {
                    aVar.a(-3);
                }
            }
        }
        if (typefaceH != null) {
            f48801b.q(b(resources, i11, str, i12, i13), typefaceH);
        }
        return typefaceH;
    }
}
