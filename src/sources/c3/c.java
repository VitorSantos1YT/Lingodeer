package c3;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.contentcapture.ContentCaptureSession;
import android.webkit.WebSettings;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.api.Service;
import com.google.common.collect.ImmutableList;
import fb.l;
import h7.g;
import h7.h;
import java.util.List;
import m7.i;
import m7.n;
import m7.s;
import y6.d0;
import y6.o;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d5) {
        boolean z11;
        int i13;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i11, i12, (int) d5);
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i14 >= supportedPerformancePoints.size()) {
                    i13 = 1;
                    break;
                }
                if (i.c(supportedPerformancePoints.get(i14)).covers(performancePoint)) {
                    i13 = 2;
                    break;
                }
                i14++;
            }
            if (i13 == 1 && ve.i.f54006b == null) {
                if (Build.VERSION.SDK_INT >= 35) {
                    z11 = false;
                } else {
                    int iC = c(false);
                    int iC2 = c(true);
                    if (iC != 0 && (iC2 != 0 ? !(iC != 2 || iC2 != 2) : iC == 2)) {
                        z11 = false;
                    }
                }
                ve.i.f54006b = Boolean.valueOf(z11);
                if (z11) {
                }
            }
            return i13;
        }
        return 0;
    }

    public static ColorFilter b(int i11, Object obj) {
        return new BlendModeColorFilter(i11, (BlendMode) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(boolean z11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            o oVar = new o();
            oVar.m = d0.o("video/avc");
            p pVar = new p(oVar);
            String str = pVar.f57291n;
            if (str != null) {
                List listD = s.d(str, z11, false);
                String strB = s.b(pVar);
                Iterable iterableS = strB == null ? ImmutableList.s() : s.d(strB, z11, false);
                ImmutableList.Builder builder = new ImmutableList.Builder();
                builder.f(listD);
                builder.f(iterableS);
                ImmutableList immutableListJ = builder.j();
                for (int i11 = 0; i11 < immutableListJ.size(); i11++) {
                    if (((n) immutableListJ.get(i11)).f40987d != null && (videoCapabilities = ((n) immutableListJ.get(i11)).f40987d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                            if (i.c(supportedPerformancePoints.get(i12)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
        }
        return 0;
    }

    public static ContentCaptureSession d(View view) {
        return view.getContentCaptureSession();
    }

    public static h e(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z11) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return h.f31871d;
        }
        g gVar = new g();
        gVar.f31868a = true;
        gVar.f31870c = z11;
        return gVar.a();
    }

    public static float f(View view) {
        return view.getTransitionAlpha();
    }

    public static Object g(r4.a aVar) {
        switch (r4.b.f48790a[aVar.ordinal()]) {
            case 1:
                return BlendMode.CLEAR;
            case 2:
                return BlendMode.SRC;
            case 3:
                return BlendMode.DST;
            case 4:
                return BlendMode.SRC_OVER;
            case 5:
                return BlendMode.DST_OVER;
            case 6:
                return BlendMode.SRC_IN;
            case 7:
                return BlendMode.DST_IN;
            case 8:
                return BlendMode.SRC_OUT;
            case 9:
                return BlendMode.DST_OUT;
            case 10:
                return BlendMode.SRC_ATOP;
            case 11:
                return BlendMode.DST_ATOP;
            case 12:
                return BlendMode.XOR;
            case 13:
                return BlendMode.PLUS;
            case 14:
                return BlendMode.MODULATE;
            case 15:
                return BlendMode.SCREEN;
            case 16:
                return BlendMode.OVERLAY;
            case 17:
                return BlendMode.DARKEN;
            case 18:
                return BlendMode.LIGHTEN;
            case 19:
                return BlendMode.COLOR_DODGE;
            case 20:
                return BlendMode.COLOR_BURN;
            case 21:
                return BlendMode.HARD_LIGHT;
            case 22:
                return BlendMode.SOFT_LIGHT;
            case 23:
                return BlendMode.DIFFERENCE;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return BlendMode.EXCLUSION;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return BlendMode.MULTIPLY;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return BlendMode.HUE;
            case 27:
                return BlendMode.SATURATION;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return BlendMode.COLOR;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets h(int i11, int i12, int i13, int i14) {
        return Insets.of(i11, i12, i13, i14);
    }

    public static void i(AudioAttributes.Builder builder) {
        builder.setAllowedCapturePolicy(1);
    }

    public static void j(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    public static void k(WebSettings webSettings) {
        webSettings.setForceDark(2);
    }

    public static void l(View view, int i11, int i12, int i13, int i14) {
        view.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    public static void m(View view, float f5) {
        view.setTransitionAlpha(f5);
    }

    public static void n(View view, int i11) {
        view.setTransitionVisibility(i11);
    }

    public static void o(SystemForegroundService systemForegroundService, int i11, Notification notification, int i12) {
        systemForegroundService.startForeground(i11, notification, i12);
    }

    public static void p(SystemForegroundService systemForegroundService, int i11, Notification notification, int i12) {
        try {
            systemForegroundService.startForeground(i11, notification, i12);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            l lVarB = l.b();
            int i13 = SystemForegroundService.f2809d;
            lVarB.getClass();
        } catch (SecurityException unused2) {
            l lVarB2 = l.b();
            int i14 = SystemForegroundService.f2809d;
            lVarB2.getClass();
        }
    }

    public static void q(ViewGroup viewGroup, boolean z11) {
        viewGroup.suppressLayout(z11);
    }

    public static final void r(long j11, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j11);
        }
    }

    public static void s(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void t(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
