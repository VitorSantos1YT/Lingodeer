package dh;

import a00.e;
import android.util.LruCache;
import bh.l;
import com.adjust.sdk.Constants;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fv.b;
import fv.c;
import h00.n;
import h00.z;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;
import oz.h;
import oz.x;
import qy.q;
import qy.r;
import rz.e0;
import rz.o0;
import vt.n0;
import vy.d;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f23424a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f23426c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f23425b = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LruCache f23427d = new LruCache(50);

    public a(n0 n0Var, c cVar) {
        this.f23424a = n0Var;
    }

    public static final void a(a aVar) {
        Object objL;
        Object objL2;
        q qVar = b.f28186a;
        File file = new File(defpackage.e.m(b.m(), b.v()));
        if (!file.exists()) {
            aVar.f23426c = null;
            return;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                int iAvailable = bufferedInputStream.available();
                byte[] bArr = new byte[iAvailable];
                bufferedInputStream.read(bArr);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iAvailable * 2);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    hz.b.u(byteArrayInputStream, byteArrayOutputStream);
                    byteArrayInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    m.e(byteArray, "toByteArray(...)");
                    Charset charsetForName = Charset.forName(Constants.ENCODING);
                    m.e(charsetForName, "forName(...)");
                    objL = new String(byteArray, charsetForName);
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        o.m(byteArrayInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                bufferedInputStream.close();
                throw th4;
            }
        } catch (Throwable th5) {
            objL = com.bumptech.glide.e.l(th5);
        }
        if (qy.o.a(objL) != null) {
            file.delete();
            objL = BuildConfig.VERSION_NAME;
        }
        String str = (String) objL;
        if (str.length() == 0) {
            aVar.f23426c = null;
            return;
        }
        try {
            objL2 = n.g(xt.c.f56291a.d(str));
        } catch (Throwable th6) {
            objL2 = com.bumptech.glide.e.l(th6);
        }
        aVar.f23426c = (z) (objL2 instanceof qy.n ? null : objL2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    public static final List b(a aVar, String str) {
        String strB;
        long jLongValue;
        z zVar = aVar.f23426c;
        if (zVar != null) {
            h00.m mVar = (h00.m) zVar.get(str);
            if (mVar == null || (strB = n.h(mVar).b()) == null) {
                strB = BuildConfig.VERSION_NAME;
            }
            if (strB.length() != 0) {
                int i11 = 0;
                for (int i12 = 0; i12 < strB.length(); i12++) {
                    if (strB.charAt(i12) == '\n') {
                        i11++;
                    }
                }
                ArrayList arrayList = new ArrayList(i11 + 1);
                h hVar = new h(strB);
                while (hVar.hasNext()) {
                    List listX0 = oz.q.X0((String) hVar.next(), new char[]{'\t'}, 2);
                    if (listX0.size() == 3) {
                        try {
                            Long lU0 = x.u0((String) listX0.get(0));
                            if (lU0 == null) {
                                jLongValue = 0;
                            } else {
                                if (lU0.longValue() == -1) {
                                    lU0 = null;
                                }
                                if (lU0 != null) {
                                    jLongValue = lU0.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                            }
                            Long lU1 = x.u0((String) listX0.get(1));
                            long jLongValue2 = lU1 != null ? lU1.longValue() : 0L;
                            Long lU2 = x.u0((String) listX0.get(2));
                            arrayList.add(new r(Long.valueOf(jLongValue), Long.valueOf(jLongValue2), Long.valueOf(lU2 != null ? lU2.longValue() : 0L)));
                        } catch (Exception unused) {
                        }
                    }
                }
                return arrayList;
            }
        }
        return ry.r.f50854a;
    }

    public final Object c(long j11, String str, d dVar) {
        f fVar = o0.f50940a;
        return e0.M(yz.e.f58387a, new l(this, str, j11, (d) null), dVar);
    }
}
