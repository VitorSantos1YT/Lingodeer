package b7;

import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import androidx.media3.common.util.GlUtil$GlException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import f7.l0;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ExecutorService f3947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f3948b = new Object();

    public static Uri A(String str, String str2) {
        return Uri.parse(z(str, str2));
    }

    public static void B(String str) {
        synchronized (f3948b) {
            a(str, null);
        }
    }

    public static void C(String str, Throwable th2) {
        synchronized (f3948b) {
            a(str, th2);
        }
    }

    public static void a(String str, Throwable th2) {
        String strReplace;
        String str2;
        if (th2 == null) {
            str2 = null;
        } else {
            synchronized (f3948b) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            str2 = strReplace;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        str2.replace("\n", "\n  ");
    }

    public static void b(int i11, int i12) throws GlUtil$GlException {
        GLES20.glBindTexture(i11, i12);
        e();
        GLES20.glTexParameteri(i11, 10240, 9729);
        e();
        GLES20.glTexParameteri(i11, 10241, 9729);
        e();
        GLES20.glTexParameteri(i11, 10242, 33071);
        e();
        GLES20.glTexParameteri(i11, 10243, 33071);
        e();
    }

    public static void c(String str, boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void d(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void e() throws GlUtil$GlException {
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z11) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            z11 = true;
        }
        if (z11) {
            throw new GlUtil$GlException(sb2.toString());
        }
    }

    public static void f(String str, boolean z11) throws GlUtil$GlException {
        if (!z11) {
            throw new GlUtil$GlException(str);
        }
    }

    public static void g(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void h(l0 l0Var) {
        l0Var.getClass();
    }

    public static void i(String str, boolean z11) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void j(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static FloatBuffer m(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void n(String str) {
        synchronized (f3948b) {
            a(str, null);
        }
    }

    public static void o(String str) {
        synchronized (f3948b) {
            a(str, null);
        }
    }

    public static void p(String str, Throwable th2) {
        synchronized (f3948b) {
            a(str, th2);
        }
    }

    public static synchronized Executor q() {
        try {
            if (f3947a == null) {
                String str = f0.f3975a;
                f3947a = Executors.newSingleThreadExecutor(new c0("ExoPlayer:BackgroundExecutor", 0));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f3947a;
    }

    public static String r(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            if (xmlPullParser.getAttributeName(i11).equals(str)) {
                return xmlPullParser.getAttributeValue(i11);
            }
        }
        return null;
    }

    public static int s(int i11, int i12) {
        for (int i13 = 1; i13 <= 2; i13++) {
            int i14 = (i11 + i13) % 3;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2 || (i12 & 2) == 0) {
                    }
                } else if ((i12 & 1) == 0) {
                }
            }
            return i14;
        }
        return i11;
    }

    public static int[] t(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i11 = iIndexOf5 + 2;
        if (i11 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i11) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void u(String str) {
        synchronized (f3948b) {
            a(str, null);
        }
    }

    public static boolean v(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean w(String str) throws GlUtil$GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        f("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        f("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        e();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean x(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static String z(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        if (str2 == null) {
            str2 = BuildConfig.VERSION_NAME;
        }
        int[] iArrT = t(str2);
        if (iArrT[0] != -1) {
            sb2.append(str2);
            y(sb2, iArrT[1], iArrT[2]);
            return sb2.toString();
        }
        int[] iArrT2 = t(str);
        if (iArrT[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrT2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrT[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrT2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i11 = iArrT[1];
        if (i11 != 0) {
            int i12 = iArrT2[0] + 1;
            sb2.append((CharSequence) str, 0, i12);
            sb2.append(str2);
            return y(sb2, iArrT[1] + i12, i12 + iArrT[2]);
        }
        if (str2.charAt(i11) == '/') {
            sb2.append((CharSequence) str, 0, iArrT2[1]);
            sb2.append(str2);
            int i13 = iArrT2[1];
            return y(sb2, i13, iArrT[2] + i13);
        }
        int i14 = iArrT2[0] + 2;
        int i15 = iArrT2[1];
        if (i14 >= i15 || i15 != iArrT2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrT2[2] - 1);
            int i16 = iLastIndexOf == -1 ? iArrT2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i16);
            sb2.append(str2);
            return y(sb2, iArrT2[1], i16 + iArrT[2]);
        }
        sb2.append((CharSequence) str, 0, i15);
        sb2.append('/');
        sb2.append(str2);
        int i17 = iArrT2[1];
        return y(sb2, i17, iArrT[2] + i17 + 1);
    }

    public static String y(StringBuilder sb2, int i11, int i12) {
        int i13;
        int iLastIndexOf;
        if (i11 >= i12) {
            return sb2.toString();
        }
        if (sb2.charAt(i11) == '/') {
            i11++;
        }
        int i14 = i11;
        int i15 = i14;
        while (i14 <= i12) {
            if (i14 == i12) {
                i13 = i14;
            } else if (sb2.charAt(i14) == '/') {
                i13 = i14 + 1;
            } else {
                i14++;
            }
            int i16 = i15 + 1;
            if (i14 == i16 && sb2.charAt(i15) == '.') {
                sb2.delete(i15, i13);
                i12 -= i13 - i15;
            } else {
                if (i14 == i15 + 2 && sb2.charAt(i15) == '.' && sb2.charAt(i16) == '.') {
                    iLastIndexOf = sb2.lastIndexOf(scqhIrGXy.QcTtCCTECyXY, i15 - 2) + 1;
                    int i17 = iLastIndexOf > i11 ? iLastIndexOf : i11;
                    sb2.delete(i17, i13);
                    i12 -= i13 - i17;
                } else {
                    iLastIndexOf = i14 + 1;
                }
                i15 = iLastIndexOf;
            }
            i14 = i15;
        }
        return sb2.toString();
    }
}
