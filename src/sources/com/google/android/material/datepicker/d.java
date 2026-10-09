package com.google.android.material.datepicker;

import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import com.google.android.recaptcha.internal.zzln;
import com.google.protobuf.CodedOutputStream;
import com.lingodeer.data.model.Main;
import e6.m1;
import e6.v;
import e6.w;
import e6.x0;
import g2.x;
import h0.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import l1.s;
import l1.t;
import o20.t0;
import qy.l;
import v3.f;
import y2.h;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static void A(kj.a aVar, String str, org.greenrobot.greendao.database.d dVar, int i11) {
        aVar.getClass();
        dVar.l(i11, kj.a.a(str));
    }

    public static void B(s sVar, boolean z11, boolean z12, boolean z13) {
        sVar.p(z11);
        sVar.p(z12);
        sVar.p(z13);
    }

    public static void C(xq.c cVar, long j11) {
        cVar.x().p();
        cVar.T(j11);
    }

    public static boolean D(String str) {
        return new File(str).exists();
    }

    public static int a(int i11, int i12, int i13) {
        return zzln.zzA(i11) + i12 + i13;
    }

    public static int b(int i11, int i12, int i13, int i14) {
        return CodedOutputStream.W(i11) + i12 + i13 + i14;
    }

    public static int c(View view, int i11, int i12) {
        return (view.getWidth() / i11) + i12;
    }

    public static int d(Main main, int i11, int i12) {
        return (main.hashCode() + i11) * i12;
    }

    public static f10.e e(int i11, f10.e eVar) {
        eVar.f(new np.b(i11));
        return f10.e.b();
    }

    public static i f(s sVar) {
        i iVar = new i();
        sVar.o0(iVar);
        return iVar;
    }

    public static j10.a g(j10.a aVar, j10.a aVar2) {
        aVar.getClass();
        return new j10.a(aVar2);
    }

    public static ClassCastException h(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object i(Class cls, String str, String str2) {
        Object objB = com.lingo.lingoskill.http.service.a.a(str).b(cls);
        m.e(objB, str2);
        return objB;
    }

    public static String j(Cursor cursor, int i11, kj.a aVar) {
        String string = cursor.getString(i11);
        aVar.getClass();
        try {
            return com.bumptech.glide.d.m(string);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static String k(StringBuilder sb2, String str) {
        return str + ((Object) sb2);
    }

    public static String l(List list, String str, String str2) {
        return str + list + str2;
    }

    public static StringBuilder m(long j11, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(j11);
        return sb2;
    }

    public static ArrayList n(t0 t0Var, String str) {
        m.f(t0Var, str);
        return new ArrayList();
    }

    public static Iterator o(s sVar, r rVar, h hVar, int i11, List list) {
        t.J(hVar, rVar, sVar);
        sVar.d0(i11);
        return list.iterator();
    }

    public static l p(int i11, e6.s sVar) {
        return new l(sVar, new x0(i11));
    }

    public static l q(int i11, w wVar) {
        return new l(wVar, new v(i11));
    }

    public static l r(int i11, m1 m1Var) {
        return new l(m1Var, new x0(i11));
    }

    public static void s(float f5, String str, StringBuilder sb2) {
        sb2.append((Object) f.c(f5));
        sb2.append(str);
    }

    public static void t(long j11, String str, StringBuilder sb2) {
        sb2.append((Object) x.j(j11));
        sb2.append(str);
    }

    public static /* synthetic */ void u(Object obj) throws Exception {
        boolean zIsTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            } else if (obj instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) obj).release();
                return;
            } else {
                if (!(obj instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) obj).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z11 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z11) {
                    executorService.shutdownNow();
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public static void v(String str, String str2, String str3, org.greenrobot.greendao.database.a aVar) {
        aVar.k(str + str2 + str3);
    }

    public static void w(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void x(StringBuilder sb2, String str, String str2, org.greenrobot.greendao.database.a aVar) {
        sb2.append(str);
        sb2.append(str2);
        aVar.k(sb2.toString());
    }

    public static void y(StringBuilder sb2, String str, zt.a aVar, String str2, zt.a aVar2) {
        sb2.append(str);
        sb2.append(aVar);
        sb2.append(str2);
        sb2.append(aVar2);
    }

    public static void z(kj.a aVar, String str, SQLiteStatement sQLiteStatement, int i11) {
        aVar.getClass();
        sQLiteStatement.bindString(i11, kj.a.a(str));
    }
}
