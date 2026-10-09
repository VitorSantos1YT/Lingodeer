package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
import lf.i0;
import v7.t;
import w7.a;
import w7.d;
import w7.i;
import w7.j;
import w7.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    public static final /* synthetic */ int N = 0;
    public Surface H;
    public boolean K;
    public boolean L;
    public boolean M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f2147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SensorManager f2148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sensor f2149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f2150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f2151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f2152f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SurfaceTexture f2153t;

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public final void a() {
        boolean z11 = this.K && this.L;
        Sensor sensor = this.f2149c;
        if (sensor == null || z11 == this.M) {
            return;
        }
        d dVar = this.f2150d;
        SensorManager sensorManager = this.f2148b;
        if (z11) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.M = z11;
    }

    public a getCameraMotionListener() {
        return this.f2152f;
    }

    public t getVideoFrameMetadataListener() {
        return this.f2152f;
    }

    public Surface getVideoSurface() {
        return this.H;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2151e.post(new i0(this, 21));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.L = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.L = true;
        a();
    }

    public void setDefaultStereoMode(int i11) {
        this.f2152f.M = i11;
    }

    public void setUseSensorRotation(boolean z11) {
        this.K = z11;
        a();
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2147a = new CopyOnWriteArrayList();
        this.f2151e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f2148b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f2149c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f2152f = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener kVar = new k(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f2150d = new d(windowManager.getDefaultDisplay(), kVar, jVar);
        this.K = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(kVar);
    }
}
